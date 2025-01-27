// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/**
 * This endpoint is used to fetch a subscription's usage in Orb. Especially when combined with
 * optional query parameters, this endpoint is a powerful way to build visualizations on top of
 * Orb's event data and metrics.
 *
 * With no query parameters specified, this endpoint returns usage for the subscription's _current
 * billing period_ across each billable metric that participates in the subscription. Usage
 * quantities returned are the result of evaluating the metric definition for the entirety of the
 * customer's billing period.
 *
 * ### Default response shape
 *
 * Orb returns a `data` array with an object corresponding to each billable metric. Nested within
 * this object is a `usage` array which has a `quantity` value and a corresponding `timeframe_start`
 * and `timeframe_end`. The `quantity` value represents the calculated usage value for the billable
 * metric over the specified timeframe (inclusive of the `timeframe_start` timestamp and exclusive
 * of the `timeframe_end` timestamp).
 *
 * Orb will include _every_ window in the response starting from the beginning of the billing
 * period, even when there were no events (and therefore no usage) in the window. This increases the
 * size of the response but prevents the caller from filling in gaps and handling cumbersome
 * time-based logic.
 *
 * The query parameters in this endpoint serve to override this behavior and provide some key
 * functionality, as listed below. Note that this functionality can also be used _in conjunction_
 * with each other, e.g. to display grouped usage on a custom timeframe.
 *
 * ## Custom timeframe
 *
 * In order to view usage for a custom timeframe rather than the current billing period, specify a
 * `timeframe_start` and `timeframe_end`. This will calculate quantities for usage incurred between
 * timeframe_start (inclusive) and timeframe_end (exclusive), i.e. `[timeframe_start,
 * timeframe_end)`.
 *
 * Note:
 * - These timestamps must be specified in ISO 8601 format and UTC timezone, e.g.
 *   `2022-02-01T05:00:00Z`.
 * - Both parameters must be specified if either is specified.
 *
 * ## Grouping by custom attributes
 *
 * In order to view a single metric grouped by a specific _attribute_ that each event is tagged with
 * (e.g. `cluster`), you must additionally specify a `billable_metric_id` and a `group_by` key. The
 * `group_by` key denotes the event property on which to group.
 *
 * When returning grouped usage, only usage for `billable_metric_id` is returned, and a separate
 * object in the `data` array is returned for each value of the `group_by` key present in your
 * events. The `quantity` value is the result of evaluating the billable metric for events filtered
 * to a single value of the `group_by` key.
 *
 * Orb expects that events that match the billable metric will contain values in the `properties`
 * dictionary that correspond to the `group_by` key specified. By default, Orb will not return a
 * `null` group (i.e. events that match the metric but do not have the key set). Currently, it is
 * only possible to view usage grouped by a single attribute at a time.
 *
 * When viewing grouped usage, Orb uses pagination to limit the response size to 1000 groups by
 * default. If there are more groups for a given subscription, pagination metadata in the response
 * can be used to fetch all of the data.
 *
 * The following example shows usage for an "API Requests" billable metric grouped by `region`. Note
 * the extra `metric_group` dictionary in the response, which provides metadata about the group:
 * ```json
 * {
 *     "data": [
 *         {
 *             "usage": [
 *                 {
 *                     "quantity": 0.19291,
 *                     "timeframe_start": "2021-10-01T07:00:00Z",
 *                     "timeframe_end": "2021-10-02T07:00:00Z",
 *                 },
 *                 ...
 *             ],
 *             "metric_group": {
 *                 "property_key": "region",
 *                 "property_value": "asia/pacific"
 *             },
 *             "billable_metric": {
 *                 "id": "Fe9pbpMk86xpwdGB",
 *                 "name": "API Requests"
 *             },
 *             "view_mode": "periodic"
 *         },
 *         ...
 *     ]
 * }
 * ```
 *
 * ## Windowed usage
 *
 * The `granularity` parameter can be used to _window_ the usage `quantity` value into periods. When
 * not specified, usage is returned for the entirety of the time range.
 *
 * When `granularity = day` is specified with a timeframe longer than a day, Orb will return a
 * `quantity` value for each full day between `timeframe_start` and `timeframe_end`. Note that the
 * days are demarcated by the _customer's local midnight_.
 *
 * For example, with `timeframe_start = 2022-02-01T05:00:00Z`, `timeframe_end =
 * 2022-02-04T01:00:00Z` and `granularity=day`, the following windows will be returned for a
 * customer in the `America/Los_Angeles` timezone since local midnight is `08:00` UTC:
 * - `[2022-02-01T05:00:00Z, 2022-02-01T08:00:00Z)`
 * - `[2022-02-01T08:00:00, 2022-02-02T08:00:00Z)`
 * - `[2022-02-02T08:00:00, 2022-02-03T08:00:00Z)`
 * - `[2022-02-03T08:00:00, 2022-02-04T01:00:00Z)`
 *
 * ```json
 * {
 *     "data": [
 *         {
 *             "billable_metric": {
 *                 "id": "Q8w89wjTtBdejXKsm",
 *                 "name": "API Requests"
 *             },
 *             "usage": [
 *                 {
 *                     "quantity": 0,
 *                     "timeframe_end": "2022-02-01T08:00:00+00:00",
 *                     "timeframe_start": "2022-02-01T05:00:00+00:00"
 *                 },
 *                 {
 *
 *                     "quantity": 0,
 *                     "timeframe_end": "2022-02-02T08:00:00+00:00",
 *                     "timeframe_start": "2022-02-01T08:00:00+00:00"
 *                 },
 *                 {
 *                     "quantity": 0,
 *                     "timeframe_end": "2022-02-03T08:00:00+00:00",
 *                     "timeframe_start": "2022-02-02T08:00:00+00:00"
 *                 },
 *                 {
 *                     "quantity": 0,
 *                     "timeframe_end": "2022-02-04T01:00:00+00:00",
 *                     "timeframe_start": "2022-02-03T08:00:00+00:00"
 *                 }
 *             ],
 *             "view_mode": "periodic"
 *         },
 *         ...
 *     ]
 * }
 * ```
 *
 * ## Decomposable vs. non-decomposable metrics
 *
 * Billable metrics fall into one of two categories: decomposable and non-decomposable. A
 * decomposable billable metric, such as a sum or a count, can be displayed and aggregated across
 * arbitrary timescales. On the other hand, a non-decomposable metric is not meaningful when only a
 * slice of the billing window is considered.
 *
 * As an example, if we have a billable metric that's defined to count unique users, displaying a
 * graph of unique users for each day is not representative of the billable metric value over the
 * month (days could have an overlapping set of 'unique' users). Instead, what's useful for any
 * given day is the number of unique users in the billing period so far, which are the _cumulative_
 * unique users.
 *
 * Accordingly, this endpoint returns treats these two types of metrics differently when `group_by`
 * is specified:
 * - Decomposable metrics can be grouped by any event property.
 * - Non-decomposable metrics can only be grouped by the corresponding price's invoice grouping key.
 *   If no invoice grouping key is present, the metric does not support `group_by`.
 *
 * ## Matrix prices
 *
 * When a billable metric is attached to a price that uses matrix pricing, it's important to view
 * usage grouped by those matrix dimensions. In this case, use the query parameters
 * `first_dimension_key`, `first_dimension_value` and `second_dimension_key`,
 * `second_dimension_value` while filtering to a specific `billable_metric_id`.
 *
 * For example, if your compute metric has a separate unit price (i.e. a matrix pricing model) per
 * `region` and `provider`, your request might provide the following parameters:
 * - `first_dimension_key`: `region`
 * - `first_dimension_value`: `us-east-1`
 * - `second_dimension_key`: `provider`
 * - `second_dimension_value`: `aws`
 */
class SubscriptionFetchUsageParams
private constructor(
    private val subscriptionId: String,
    private val billableMetricId: String?,
    private val firstDimensionKey: String?,
    private val firstDimensionValue: String?,
    private val granularity: Granularity?,
    private val groupBy: String?,
    private val secondDimensionKey: String?,
    private val secondDimensionValue: String?,
    private val timeframeEnd: OffsetDateTime?,
    private val timeframeStart: OffsetDateTime?,
    private val viewMode: ViewMode?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun subscriptionId(): String = subscriptionId

    /**
     * When specified in conjunction with `group_by`, this parameter filters usage to a single
     * billable metric. Note that both `group_by` and `billable_metric_id` must be specified
     * together.
     */
    fun billableMetricId(): String? = billableMetricId

    fun firstDimensionKey(): String? = firstDimensionKey

    fun firstDimensionValue(): String? = firstDimensionValue

    /** This determines the windowing of usage reporting. */
    fun granularity(): Granularity? = granularity

    /** Groups per-price usage by the key provided. */
    fun groupBy(): String? = groupBy

    fun secondDimensionKey(): String? = secondDimensionKey

    fun secondDimensionValue(): String? = secondDimensionValue

    /** Usage returned is exclusive of `timeframe_end`. */
    fun timeframeEnd(): OffsetDateTime? = timeframeEnd

    /** Usage returned is inclusive of `timeframe_start`. */
    fun timeframeStart(): OffsetDateTime? = timeframeStart

    /**
     * Controls whether Orb returns cumulative usage since the start of the billing period, or
     * incremental day-by-day usage. If your customer has minimums or discounts, it's strongly
     * recommended that you use the default cumulative behavior.
     */
    fun viewMode(): ViewMode? = viewMode

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.billableMetricId?.let { queryParams.put("billable_metric_id", listOf(it.toString())) }
        this.firstDimensionKey?.let {
            queryParams.put("first_dimension_key", listOf(it.toString()))
        }
        this.firstDimensionValue?.let {
            queryParams.put("first_dimension_value", listOf(it.toString()))
        }
        this.granularity?.let { queryParams.put("granularity", listOf(it.toString())) }
        this.groupBy?.let { queryParams.put("group_by", listOf(it.toString())) }
        this.secondDimensionKey?.let {
            queryParams.put("second_dimension_key", listOf(it.toString()))
        }
        this.secondDimensionValue?.let {
            queryParams.put("second_dimension_value", listOf(it.toString()))
        }
        this.timeframeEnd?.let {
            queryParams.put(
                "timeframe_end",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.timeframeStart?.let {
            queryParams.put(
                "timeframe_start",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.viewMode?.let { queryParams.put("view_mode", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [SubscriptionFetchUsageParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var billableMetricId: String? = null
        private var firstDimensionKey: String? = null
        private var firstDimensionValue: String? = null
        private var granularity: Granularity? = null
        private var groupBy: String? = null
        private var secondDimensionKey: String? = null
        private var secondDimensionValue: String? = null
        private var timeframeEnd: OffsetDateTime? = null
        private var timeframeStart: OffsetDateTime? = null
        private var viewMode: ViewMode? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionFetchUsageParams: SubscriptionFetchUsageParams) = apply {
            subscriptionId = subscriptionFetchUsageParams.subscriptionId
            billableMetricId = subscriptionFetchUsageParams.billableMetricId
            firstDimensionKey = subscriptionFetchUsageParams.firstDimensionKey
            firstDimensionValue = subscriptionFetchUsageParams.firstDimensionValue
            granularity = subscriptionFetchUsageParams.granularity
            groupBy = subscriptionFetchUsageParams.groupBy
            secondDimensionKey = subscriptionFetchUsageParams.secondDimensionKey
            secondDimensionValue = subscriptionFetchUsageParams.secondDimensionValue
            timeframeEnd = subscriptionFetchUsageParams.timeframeEnd
            timeframeStart = subscriptionFetchUsageParams.timeframeStart
            viewMode = subscriptionFetchUsageParams.viewMode
            additionalHeaders = subscriptionFetchUsageParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionFetchUsageParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /**
         * When specified in conjunction with `group_by`, this parameter filters usage to a single
         * billable metric. Note that both `group_by` and `billable_metric_id` must be specified
         * together.
         */
        fun billableMetricId(billableMetricId: String?) = apply {
            this.billableMetricId = billableMetricId
        }

        fun firstDimensionKey(firstDimensionKey: String?) = apply {
            this.firstDimensionKey = firstDimensionKey
        }

        fun firstDimensionValue(firstDimensionValue: String?) = apply {
            this.firstDimensionValue = firstDimensionValue
        }

        /** This determines the windowing of usage reporting. */
        fun granularity(granularity: Granularity?) = apply { this.granularity = granularity }

        /** Groups per-price usage by the key provided. */
        fun groupBy(groupBy: String?) = apply { this.groupBy = groupBy }

        fun secondDimensionKey(secondDimensionKey: String?) = apply {
            this.secondDimensionKey = secondDimensionKey
        }

        fun secondDimensionValue(secondDimensionValue: String?) = apply {
            this.secondDimensionValue = secondDimensionValue
        }

        /** Usage returned is exclusive of `timeframe_end`. */
        fun timeframeEnd(timeframeEnd: OffsetDateTime?) = apply { this.timeframeEnd = timeframeEnd }

        /** Usage returned is inclusive of `timeframe_start`. */
        fun timeframeStart(timeframeStart: OffsetDateTime?) = apply {
            this.timeframeStart = timeframeStart
        }

        /**
         * Controls whether Orb returns cumulative usage since the start of the billing period, or
         * incremental day-by-day usage. If your customer has minimums or discounts, it's strongly
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

        fun build(): SubscriptionFetchUsageParams =
            SubscriptionFetchUsageParams(
                checkRequired("subscriptionId", subscriptionId),
                billableMetricId,
                firstDimensionKey,
                firstDimensionValue,
                granularity,
                groupBy,
                secondDimensionKey,
                secondDimensionValue,
                timeframeEnd,
                timeframeStart,
                viewMode,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** This determines the windowing of usage reporting. */
    class Granularity
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            val DAY = of("day")

            fun of(value: String) = Granularity(JsonField.of(value))
        }

        /** An enum containing [Granularity]'s known values. */
        enum class Known {
            DAY,
        }

        /**
         * An enum containing [Granularity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Granularity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DAY,
            /**
             * An enum member indicating that [Granularity] was instantiated with an unknown value.
             */
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
                DAY -> Value.DAY
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
                DAY -> Known.DAY
                else -> throw OrbInvalidDataException("Unknown Granularity: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Granularity && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Controls whether Orb returns cumulative usage since the start of the billing period, or
     * incremental day-by-day usage. If your customer has minimums or discounts, it's strongly
     * recommended that you use the default cumulative behavior.
     */
    class ViewMode
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is SubscriptionFetchUsageParams && subscriptionId == other.subscriptionId && billableMetricId == other.billableMetricId && firstDimensionKey == other.firstDimensionKey && firstDimensionValue == other.firstDimensionValue && granularity == other.granularity && groupBy == other.groupBy && secondDimensionKey == other.secondDimensionKey && secondDimensionValue == other.secondDimensionValue && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && viewMode == other.viewMode && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, billableMetricId, firstDimensionKey, firstDimensionValue, granularity, groupBy, secondDimensionKey, secondDimensionValue, timeframeEnd, timeframeStart, viewMode, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionFetchUsageParams{subscriptionId=$subscriptionId, billableMetricId=$billableMetricId, firstDimensionKey=$firstDimensionKey, firstDimensionValue=$firstDimensionValue, granularity=$granularity, groupBy=$groupBy, secondDimensionKey=$secondDimensionKey, secondDimensionValue=$secondDimensionValue, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, viewMode=$viewMode, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
