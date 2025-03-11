// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/**
 * This endpoint is used to fetch a day-by-day snapshot of a subscription's costs
 * in Orb, calculated by applying pricing information to the underlying usage (see
 * the [subscription usage endpoint](fetch-subscription-usage) to fetch usage per
 * metric, in usage units rather than a currency).
 *
 * The semantics of this endpoint exactly mirror those of
 * [fetching a customer's costs](fetch-customer-costs). Use this endpoint to limit
 * your analysis of costs to a specific subscription for the customer (e.g. to
 * de-aggregate costs when a customer's subscription has started and stopped on the
 * same day).
 */
class SubscriptionFetchCostsParams private constructor(
    private val subscriptionId: String,
    private val currency: String?,
    private val timeframeEnd: OffsetDateTime?,
    private val timeframeStart: OffsetDateTime?,
    private val viewMode: ViewMode?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    fun subscriptionId(): String = subscriptionId

    /** The currency or custom pricing unit to use. */
    fun currency(): String? = currency

    /** Costs returned are exclusive of `timeframe_end`. */
    fun timeframeEnd(): OffsetDateTime? = timeframeEnd

    /** Costs returned are inclusive of `timeframe_start`. */
    fun timeframeStart(): OffsetDateTime? = timeframeStart

    /**
     * Controls whether Orb returns cumulative costs since the start of the billing
     * period, or incremental day-by-day costs. If your customer has minimums or
     * discounts, it's strongly recommended that you use the default cumulative
     * behavior.
     */
    fun viewMode(): ViewMode? = viewMode

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
      val queryParams = QueryParams.builder()
      this.currency?.let {
          queryParams.put(
            "currency", listOf(it.toString())
          )
      }
      this.timeframeEnd?.let {
          queryParams.put(
            "timeframe_end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
          )
      }
      this.timeframeStart?.let {
          queryParams.put(
            "timeframe_start", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
          )
      }
      this.viewMode?.let {
          queryParams.put(
            "view_mode", listOf(it.toString())
          )
      }
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

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionFetchCostsParams].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .subscriptionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionFetchCostsParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var currency: String? = null
        private var timeframeEnd: OffsetDateTime? = null
        private var timeframeStart: OffsetDateTime? = null
        private var viewMode: ViewMode? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionFetchCostsParams: SubscriptionFetchCostsParams) =
            apply {
                subscriptionId = subscriptionFetchCostsParams.subscriptionId
                currency = subscriptionFetchCostsParams.currency
                timeframeEnd = subscriptionFetchCostsParams.timeframeEnd
                timeframeStart = subscriptionFetchCostsParams.timeframeStart
                viewMode = subscriptionFetchCostsParams.viewMode
                additionalHeaders = subscriptionFetchCostsParams.additionalHeaders.toBuilder()
                additionalQueryParams = subscriptionFetchCostsParams.additionalQueryParams.toBuilder()
            }

        fun subscriptionId(subscriptionId: String) =
            apply {
                this.subscriptionId = subscriptionId
            }

        /** The currency or custom pricing unit to use. */
        fun currency(currency: String?) =
            apply {
                this.currency = currency
            }

        /** Costs returned are exclusive of `timeframe_end`. */
        fun timeframeEnd(timeframeEnd: OffsetDateTime?) =
            apply {
                this.timeframeEnd = timeframeEnd
            }

        /** Costs returned are inclusive of `timeframe_start`. */
        fun timeframeStart(timeframeStart: OffsetDateTime?) =
            apply {
                this.timeframeStart = timeframeStart
            }

        /**
         * Controls whether Orb returns cumulative costs since the start of the billing
         * period, or incremental day-by-day costs. If your customer has minimums or
         * discounts, it's strongly recommended that you use the default cumulative
         * behavior.
         */
        fun viewMode(viewMode: ViewMode?) =
            apply {
                this.viewMode = viewMode
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        fun build(): SubscriptionFetchCostsParams =
            SubscriptionFetchCostsParams(
              checkRequired(
                "subscriptionId", subscriptionId
              ),
              currency,
              timeframeEnd,
              timeframeStart,
              viewMode,
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    /**
     * Controls whether Orb returns cumulative costs since the start of the billing
     * period, or incremental day-by-day costs. If your customer has minimums or
     * discounts, it's strongly recommended that you use the default cumulative
     * behavior.
     */
    class ViewMode @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

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
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PERIODIC,
            CUMULATIVE,
            /**
             * An enum member indicating that [ViewMode] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or
         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if
         * you want to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known
         * member.
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
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the
         * expected primitive type.
         */
        fun asString(): String = _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

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

      return /* spotless:off */ other is SubscriptionFetchCostsParams && subscriptionId == other.subscriptionId && currency == other.currency && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && viewMode == other.viewMode && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, currency, timeframeEnd, timeframeStart, viewMode, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "SubscriptionFetchCostsParams{subscriptionId=$subscriptionId, currency=$currency, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, viewMode=$viewMode, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
