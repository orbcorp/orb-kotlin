// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class SubscriptionFetchUsageParams
constructor(
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

    fun billableMetricId(): String? = billableMetricId

    fun firstDimensionKey(): String? = firstDimensionKey

    fun firstDimensionValue(): String? = firstDimensionValue

    fun granularity(): Granularity? = granularity

    fun groupBy(): String? = groupBy

    fun secondDimensionKey(): String? = secondDimensionKey

    fun secondDimensionValue(): String? = secondDimensionValue

    fun timeframeEnd(): OffsetDateTime? = timeframeEnd

    fun timeframeStart(): OffsetDateTime? = timeframeStart

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

    @NoAutoDetect
    class Builder {

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
        fun billableMetricId(billableMetricId: String) = apply {
            this.billableMetricId = billableMetricId
        }

        fun firstDimensionKey(firstDimensionKey: String) = apply {
            this.firstDimensionKey = firstDimensionKey
        }

        fun firstDimensionValue(firstDimensionValue: String) = apply {
            this.firstDimensionValue = firstDimensionValue
        }

        /** This determines the windowing of usage reporting. */
        fun granularity(granularity: Granularity) = apply { this.granularity = granularity }

        /** Groups per-price usage by the key provided. */
        fun groupBy(groupBy: String) = apply { this.groupBy = groupBy }

        fun secondDimensionKey(secondDimensionKey: String) = apply {
            this.secondDimensionKey = secondDimensionKey
        }

        fun secondDimensionValue(secondDimensionValue: String) = apply {
            this.secondDimensionValue = secondDimensionValue
        }

        /** Usage returned is exclusive of `timeframe_end`. */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply { this.timeframeEnd = timeframeEnd }

        /** Usage returned is inclusive of `timeframe_start`. */
        fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
            this.timeframeStart = timeframeStart
        }

        /**
         * Controls whether Orb returns cumulative usage since the start of the billing period, or
         * incremental day-by-day usage. If your customer has minimums or discounts, it's strongly
         * recommended that you use the default cumulative behavior.
         */
        fun viewMode(viewMode: ViewMode) = apply { this.viewMode = viewMode }

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
                checkNotNull(subscriptionId) { "`subscriptionId` is required but was not set" },
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

    class Granularity
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DAY = of("day")

            fun of(value: String) = Granularity(JsonField.of(value))
        }

        enum class Known {
            DAY,
        }

        enum class Value {
            DAY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DAY -> Value.DAY
                else -> Value._UNKNOWN
            }

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

    class ViewMode
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PERIODIC = of("periodic")

            val CUMULATIVE = of("cumulative")

            fun of(value: String) = ViewMode(JsonField.of(value))
        }

        enum class Known {
            PERIODIC,
            CUMULATIVE,
        }

        enum class Value {
            PERIODIC,
            CUMULATIVE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PERIODIC -> Value.PERIODIC
                CUMULATIVE -> Value.CUMULATIVE
                else -> Value._UNKNOWN
            }

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
