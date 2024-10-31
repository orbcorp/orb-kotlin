// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
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

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.billableMetricId?.let { params.put("billable_metric_id", listOf(it.toString())) }
        this.firstDimensionKey?.let { params.put("first_dimension_key", listOf(it.toString())) }
        this.firstDimensionValue?.let { params.put("first_dimension_value", listOf(it.toString())) }
        this.granularity?.let { params.put("granularity", listOf(it.toString())) }
        this.groupBy?.let { params.put("group_by", listOf(it.toString())) }
        this.secondDimensionKey?.let { params.put("second_dimension_key", listOf(it.toString())) }
        this.secondDimensionValue?.let {
            params.put("second_dimension_value", listOf(it.toString()))
        }
        this.timeframeEnd?.let {
            params.put("timeframe_end", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.timeframeStart?.let {
            params.put("timeframe_start", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.viewMode?.let { params.put("view_mode", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionFetchUsageParams && this.subscriptionId == other.subscriptionId && this.billableMetricId == other.billableMetricId && this.firstDimensionKey == other.firstDimensionKey && this.firstDimensionValue == other.firstDimensionValue && this.granularity == other.granularity && this.groupBy == other.groupBy && this.secondDimensionKey == other.secondDimensionKey && this.secondDimensionValue == other.secondDimensionValue && this.timeframeEnd == other.timeframeEnd && this.timeframeStart == other.timeframeStart && this.viewMode == other.viewMode && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(subscriptionId, billableMetricId, firstDimensionKey, firstDimensionValue, granularity, groupBy, secondDimensionKey, secondDimensionValue, timeframeEnd, timeframeStart, viewMode, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "SubscriptionFetchUsageParams{subscriptionId=$subscriptionId, billableMetricId=$billableMetricId, firstDimensionKey=$firstDimensionKey, firstDimensionValue=$firstDimensionValue, granularity=$granularity, groupBy=$groupBy, secondDimensionKey=$secondDimensionKey, secondDimensionValue=$secondDimensionValue, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, viewMode=$viewMode, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(subscriptionFetchUsageParams: SubscriptionFetchUsageParams) = apply {
            this.subscriptionId = subscriptionFetchUsageParams.subscriptionId
            this.billableMetricId = subscriptionFetchUsageParams.billableMetricId
            this.firstDimensionKey = subscriptionFetchUsageParams.firstDimensionKey
            this.firstDimensionValue = subscriptionFetchUsageParams.firstDimensionValue
            this.granularity = subscriptionFetchUsageParams.granularity
            this.groupBy = subscriptionFetchUsageParams.groupBy
            this.secondDimensionKey = subscriptionFetchUsageParams.secondDimensionKey
            this.secondDimensionValue = subscriptionFetchUsageParams.secondDimensionValue
            this.timeframeEnd = subscriptionFetchUsageParams.timeframeEnd
            this.timeframeStart = subscriptionFetchUsageParams.timeframeStart
            this.viewMode = subscriptionFetchUsageParams.viewMode
            additionalQueryParams(subscriptionFetchUsageParams.additionalQueryParams)
            additionalHeaders(subscriptionFetchUsageParams.additionalHeaders)
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

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

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
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
            )
    }

    class Granularity
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Granularity && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val DAY = Granularity(JsonField.of("day"))

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
    }

    class ViewMode
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ViewMode && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PERIODIC = ViewMode(JsonField.of("periodic"))

            val CUMULATIVE = ViewMode(JsonField.of("cumulative"))

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
    }
}
