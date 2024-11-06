// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
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

class SubscriptionFetchCostsParams
constructor(
    private val subscriptionId: String,
    private val currency: String?,
    private val timeframeEnd: OffsetDateTime?,
    private val timeframeStart: OffsetDateTime?,
    private val viewMode: ViewMode?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun subscriptionId(): String = subscriptionId

    fun currency(): String? = currency

    fun timeframeEnd(): OffsetDateTime? = timeframeEnd

    fun timeframeStart(): OffsetDateTime? = timeframeStart

    fun viewMode(): ViewMode? = viewMode

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.currency?.let { params.put("currency", listOf(it.toString())) }
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

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionFetchCostsParams && this.subscriptionId == other.subscriptionId && this.currency == other.currency && this.timeframeEnd == other.timeframeEnd && this.timeframeStart == other.timeframeStart && this.viewMode == other.viewMode && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(subscriptionId, currency, timeframeEnd, timeframeStart, viewMode, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "SubscriptionFetchCostsParams{subscriptionId=$subscriptionId, currency=$currency, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, viewMode=$viewMode, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var currency: String? = null
        private var timeframeEnd: OffsetDateTime? = null
        private var timeframeStart: OffsetDateTime? = null
        private var viewMode: ViewMode? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(subscriptionFetchCostsParams: SubscriptionFetchCostsParams) = apply {
            this.subscriptionId = subscriptionFetchCostsParams.subscriptionId
            this.currency = subscriptionFetchCostsParams.currency
            this.timeframeEnd = subscriptionFetchCostsParams.timeframeEnd
            this.timeframeStart = subscriptionFetchCostsParams.timeframeStart
            this.viewMode = subscriptionFetchCostsParams.viewMode
            additionalHeaders(subscriptionFetchCostsParams.additionalHeaders)
            additionalQueryParams(subscriptionFetchCostsParams.additionalQueryParams)
        }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /** The currency or custom pricing unit to use. */
        fun currency(currency: String) = apply { this.currency = currency }

        /** Costs returned are exclusive of `timeframe_end`. */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply { this.timeframeEnd = timeframeEnd }

        /** Costs returned are inclusive of `timeframe_start`. */
        fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
            this.timeframeStart = timeframeStart
        }

        /**
         * Controls whether Orb returns cumulative costs since the start of the billing period, or
         * incremental day-by-day costs. If your customer has minimums or discounts, it's strongly
         * recommended that you use the default cumulative behavior.
         */
        fun viewMode(viewMode: ViewMode) = apply { this.viewMode = viewMode }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun build(): SubscriptionFetchCostsParams =
            SubscriptionFetchCostsParams(
                checkNotNull(subscriptionId) { "`subscriptionId` is required but was not set" },
                currency,
                timeframeEnd,
                timeframeStart,
                viewMode,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
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
