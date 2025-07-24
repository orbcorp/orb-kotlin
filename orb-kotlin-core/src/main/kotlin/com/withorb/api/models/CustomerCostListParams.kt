// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.Params
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/**
 * This endpoint is used to fetch a day-by-day snapshot of a customer's costs in Orb, calculated by
 * applying pricing information to the underlying usage (see the
 * [subscription usage endpoint](/api-reference/subscription/fetch-subscription-usage) to fetch
 * usage per metric, in usage units rather than a currency).
 *
 * This endpoint can be leveraged for internal tooling and to provide a more transparent billing
 * experience for your end users:
 * 1. Understand the cost breakdown per line item historically and in real-time for the current
 *    billing period.
 * 2. Provide customer visibility into how different services are contributing to the overall
 *    invoice with a per-day timeseries (as compared to the
 *    [upcoming invoice](/api-reference/invoice/fetch-upcoming-invoice) resource, which represents a
 *    snapshot for the current period).
 * 3. Assess how minimums and discounts affect your customers by teasing apart costs directly as a
 *    result of usage, as opposed to minimums and discounts at the plan and price level.
 * 4. Gain insight into key customer health metrics, such as the percent utilization of the minimum
 *    committed spend.
 *
 * ## Fetching subscriptions
 *
 * By default, this endpoint fetches the currently active subscription for the customer, and returns
 * cost information for the subscription's current billing period, broken down by each participating
 * price. If there are no currently active subscriptions, this will instead default to the most
 * recently active subscription or return an empty series if none are found. For example, if your
 * plan charges for compute hours, job runs, and data syncs, then this endpoint would provide a
 * daily breakdown of your customer's cost for each of those axes.
 *
 * If timeframe bounds are specified, Orb fetches all subscriptions that were active in that
 * timeframe. If two subscriptions overlap on a single day, costs from each price will be summed,
 * and prices for both subscriptions will be included in the breakdown.
 *
 * ## Prepaid plans
 *
 * For plans that include prices which deduct credits rather than accrue in-arrears charges in a
 * billable currency, this endpoint will return the total deduction amount, in credits, for the
 * specified timeframe.
 *
 * ## Cumulative subtotals and totals
 *
 * Since the subtotal and total must factor in any billing-period level discounts and minimums, it's
 * most meaningful to consider costs relative to the start of the subscription's billing period. As
 * a result, by default this endpoint returns cumulative totals since the beginning of the billing
 * period. In particular, the `timeframe_start` of a returned timeframe window is _always_ the
 * beginning of the billing period and `timeframe_end` is incremented one day at a time to build the
 * result.
 *
 * A customer that uses a few API calls a day but has a minimum commitment might exhibit the
 * following pattern for their subtotal and total in the first few days of the month. Here, we
 * assume that each API call is \$2.50, the customer's plan has a monthly minimum of \$50 for this
 * price, and that the subscription's billing period bounds are aligned to the first of the month:
 *
 * | timeframe_start | timeframe_end | Cumulative usage | Subtotal | Total (incl. commitment) |
 * |-----------------|---------------|------------------|----------|--------------------------|
 * | 2023-02-01      | 2023-02-02    | 9                | \$22.50  | \$50.00                  |
 * | 2023-02-01      | 2023-02-03    | 19               | \$47.50  | \$50.00                  |
 * | 2023-02-01      | 2023-02-04    | 20               | \$50.00  | \$50.00                  |
 * | 2023-02-01      | 2023-02-05    | 28               | \$70.00  | \$70.00                  |
 * | 2023-02-01      | 2023-02-06    | 36               | \$90.00  | \$90.00                  |
 *
 * ### Periodic values
 *
 * When the query parameter `view_mode=periodic` is specified, Orb will return an incremental
 * day-by-day view of costs. In this case, there will always be a one-day difference between
 * `timeframe_start` and `timeframe_end` for the timeframes returned. This is a transform on top of
 * the cumulative costs, calculated by taking the difference of each timeframe with the last. Note
 * that in the above example, the `Total` value would be 0 for the second two data points, since the
 * minimum commitment has not yet been hit and each day is not contributing anything to the total
 * cost.
 *
 * ## Timeframe bounds
 *
 * For an active subscription, both timeframes should be specified in the request. If a subscription
 * starts or ends within the timeframe, the response will only include windows where the
 * subscription is active. If a subscription has ended, no timeframe bounds need to be specified and
 * the response will default to the billing period when the subscription was last active.
 *
 * As noted above, `timeframe_start` for a given cumulative datapoint is always the beginning of the
 * billing period, and `timeframe_end` is incremented one day at a time to construct the response.
 * When a timeframe is passed in that is not aligned to the current subscription's billing period,
 * the response will contain cumulative totals from multiple billing periods.
 *
 * Suppose the queried customer has a subscription aligned to the 15th of every month. If this
 * endpoint is queried with the date range `2023-06-01` - `2023-07-01`, the first data point will
 * represent about half a billing period's worth of costs, accounting for accruals from the start of
 * the billing period and inclusive of the first day of the timeframe (`timeframe_start = 2023-05-15
 * 00:00:00`, `timeframe_end = 2023-06-02 00:00:00`)
 *
 * | datapoint index | timeframe_start | timeframe_end |
 * |-----------------|-----------------|---------------|
 * | 0               | 2023-05-15      | 2023-06-02    |
 * | 1               | 2023-05-15      | 2023-06-03    |
 * | 2               | ...             | ...           |
 * | 3               | 2023-05-15      | 2023-06-14    |
 * | 4               | 2023-06-15      | 2023-06-16    |
 * | 5               | 2023-06-15      | 2023-06-17    |
 * | 6               | ...             | ...           |
 * | 7               | 2023-06-15      | 2023-07-01    |
 *
 * You can see this sliced timeframe visualized [here](https://i.imgur.com/TXhYgme.png).
 *
 * ### Matrix prices
 *
 * When a price uses matrix pricing, it's important to view costs grouped by those matrix
 * dimensions. Orb will return `price_groups` with the `grouping_key` and `secondary_grouping_key`
 * based on the matrix price definition, for each `grouping_value` and `secondary_grouping_value`
 * available.
 */
class CustomerCostListParams
private constructor(
    private val customerId: String?,
    private val currency: String?,
    private val timeframeEnd: OffsetDateTime?,
    private val timeframeStart: OffsetDateTime?,
    private val viewMode: ViewMode?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String? = customerId

    /** The currency to use. */
    fun currency(): String? = currency

    /** Costs returned are exclusive of `timeframe_end`. */
    fun timeframeEnd(): OffsetDateTime? = timeframeEnd

    /** Costs returned are inclusive of `timeframe_start`. */
    fun timeframeStart(): OffsetDateTime? = timeframeStart

    /**
     * Controls whether Orb returns cumulative costs since the start of the billing period, or
     * incremental day-by-day costs. If your customer has minimums or discounts, it's strongly
     * recommended that you use the default cumulative behavior.
     */
    fun viewMode(): ViewMode? = viewMode

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CustomerCostListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CustomerCostListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [CustomerCostListParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var currency: String? = null
        private var timeframeEnd: OffsetDateTime? = null
        private var timeframeStart: OffsetDateTime? = null
        private var viewMode: ViewMode? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(customerCostListParams: CustomerCostListParams) = apply {
            customerId = customerCostListParams.customerId
            currency = customerCostListParams.currency
            timeframeEnd = customerCostListParams.timeframeEnd
            timeframeStart = customerCostListParams.timeframeStart
            viewMode = customerCostListParams.viewMode
            additionalHeaders = customerCostListParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCostListParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /** The currency to use. */
        fun currency(currency: String?) = apply { this.currency = currency }

        /** Costs returned are exclusive of `timeframe_end`. */
        fun timeframeEnd(timeframeEnd: OffsetDateTime?) = apply { this.timeframeEnd = timeframeEnd }

        /** Costs returned are inclusive of `timeframe_start`. */
        fun timeframeStart(timeframeStart: OffsetDateTime?) = apply {
            this.timeframeStart = timeframeStart
        }

        /**
         * Controls whether Orb returns cumulative costs since the start of the billing period, or
         * incremental day-by-day costs. If your customer has minimums or discounts, it's strongly
         * recommended that you use the default cumulative behavior.
         */
        fun viewMode(viewMode: ViewMode?) = apply { this.viewMode = viewMode }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CustomerCostListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerCostListParams =
            CustomerCostListParams(
                customerId,
                currency,
                timeframeEnd,
                timeframeStart,
                viewMode,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                currency?.let { put("currency", it) }
                timeframeEnd?.let {
                    put("timeframe_end", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                timeframeStart?.let {
                    put("timeframe_start", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                viewMode?.let { put("view_mode", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Controls whether Orb returns cumulative costs since the start of the billing period, or
     * incremental day-by-day costs. If your customer has minimums or discounts, it's strongly
     * recommended that you use the default cumulative behavior.
     */
    class ViewMode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PERIODIC = of("periodic")

            val CUMULATIVE = of("cumulative")

            fun of(value: String) = ViewMode(JsonField.of(value))
        }

        /** An enum containing [ViewMode]'s known values. */
        enum class Known {
            PERIODIC,
            CUMULATIVE,
        }

        /**
         * An enum containing [ViewMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ViewMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PERIODIC,
            CUMULATIVE,
            /** An enum member indicating that [ViewMode] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PERIODIC -> Value.PERIODIC
                CUMULATIVE -> Value.CUMULATIVE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                PERIODIC -> Known.PERIODIC
                CUMULATIVE -> Known.CUMULATIVE
                else -> throw OrbInvalidDataException("Unknown ViewMode: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): ViewMode = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ViewMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCostListParams && customerId == other.customerId && currency == other.currency && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && viewMode == other.viewMode && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, currency, timeframeEnd, timeframeStart, viewMode, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCostListParams{customerId=$customerId, currency=$currency, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, viewMode=$viewMode, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
