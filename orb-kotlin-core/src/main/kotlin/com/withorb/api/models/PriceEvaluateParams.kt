// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class PriceEvaluateParams
constructor(
    private val priceId: String,
    private val timeframeEnd: OffsetDateTime,
    private val timeframeStart: OffsetDateTime,
    private val customerId: String?,
    private val externalCustomerId: String?,
    private val filter: String?,
    private val groupingKeys: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun priceId(): String = priceId

    fun timeframeEnd(): OffsetDateTime = timeframeEnd

    fun timeframeStart(): OffsetDateTime = timeframeStart

    fun customerId(): String? = customerId

    fun externalCustomerId(): String? = externalCustomerId

    fun filter(): String? = filter

    fun groupingKeys(): List<String>? = groupingKeys

    internal fun getBody(): PriceEvaluateBody {
        return PriceEvaluateBody(
            timeframeEnd,
            timeframeStart,
            customerId,
            externalCustomerId,
            filter,
            groupingKeys,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> priceId
            else -> ""
        }
    }

    @JsonDeserialize(builder = PriceEvaluateBody.Builder::class)
    @NoAutoDetect
    class PriceEvaluateBody
    internal constructor(
        private val timeframeEnd: OffsetDateTime?,
        private val timeframeStart: OffsetDateTime?,
        private val customerId: String?,
        private val externalCustomerId: String?,
        private val filter: String?,
        private val groupingKeys: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The exclusive upper bound for event timestamps */
        @JsonProperty("timeframe_end") fun timeframeEnd(): OffsetDateTime? = timeframeEnd

        /** The inclusive lower bound for event timestamps */
        @JsonProperty("timeframe_start") fun timeframeStart(): OffsetDateTime? = timeframeStart

        /** The ID of the customer to which this evaluation is scoped. */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** The external customer ID of the customer to which this evaluation is scoped. */
        @JsonProperty("external_customer_id") fun externalCustomerId(): String? = externalCustomerId

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the underlying billable metric
         */
        @JsonProperty("filter") fun filter(): String? = filter

        /**
         * Properties (or
         * [computed properties](../guides/extensibility/advanced-metrics#computed-properties)) used
         * to group the underlying billable metric
         */
        @JsonProperty("grouping_keys") fun groupingKeys(): List<String>? = groupingKeys

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var timeframeEnd: OffsetDateTime? = null
            private var timeframeStart: OffsetDateTime? = null
            private var customerId: String? = null
            private var externalCustomerId: String? = null
            private var filter: String? = null
            private var groupingKeys: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(priceEvaluateBody: PriceEvaluateBody) = apply {
                this.timeframeEnd = priceEvaluateBody.timeframeEnd
                this.timeframeStart = priceEvaluateBody.timeframeStart
                this.customerId = priceEvaluateBody.customerId
                this.externalCustomerId = priceEvaluateBody.externalCustomerId
                this.filter = priceEvaluateBody.filter
                this.groupingKeys = priceEvaluateBody.groupingKeys
                additionalProperties(priceEvaluateBody.additionalProperties)
            }

            /** The exclusive upper bound for event timestamps */
            @JsonProperty("timeframe_end")
            fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply {
                this.timeframeEnd = timeframeEnd
            }

            /** The inclusive lower bound for event timestamps */
            @JsonProperty("timeframe_start")
            fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
                this.timeframeStart = timeframeStart
            }

            /** The ID of the customer to which this evaluation is scoped. */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** The external customer ID of the customer to which this evaluation is scoped. */
            @JsonProperty("external_customer_id")
            fun externalCustomerId(externalCustomerId: String) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /**
             * A boolean
             * [computed property](../guides/extensibility/advanced-metrics#computed-properties)
             * used to filter the underlying billable metric
             */
            @JsonProperty("filter") fun filter(filter: String) = apply { this.filter = filter }

            /**
             * Properties (or
             * [computed properties](../guides/extensibility/advanced-metrics#computed-properties))
             * used to group the underlying billable metric
             */
            @JsonProperty("grouping_keys")
            fun groupingKeys(groupingKeys: List<String>) = apply {
                this.groupingKeys = groupingKeys
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): PriceEvaluateBody =
                PriceEvaluateBody(
                    checkNotNull(timeframeEnd) { "`timeframeEnd` is required but was not set" },
                    checkNotNull(timeframeStart) { "`timeframeStart` is required but was not set" },
                    customerId,
                    externalCustomerId,
                    filter,
                    groupingKeys?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PriceEvaluateBody && this.timeframeEnd == other.timeframeEnd && this.timeframeStart == other.timeframeStart && this.customerId == other.customerId && this.externalCustomerId == other.externalCustomerId && this.filter == other.filter && this.groupingKeys == other.groupingKeys && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(timeframeEnd, timeframeStart, customerId, externalCustomerId, filter, groupingKeys, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PriceEvaluateBody{timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, customerId=$customerId, externalCustomerId=$externalCustomerId, filter=$filter, groupingKeys=$groupingKeys, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceEvaluateParams && this.priceId == other.priceId && this.timeframeEnd == other.timeframeEnd && this.timeframeStart == other.timeframeStart && this.customerId == other.customerId && this.externalCustomerId == other.externalCustomerId && this.filter == other.filter && this.groupingKeys == other.groupingKeys && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(priceId, timeframeEnd, timeframeStart, customerId, externalCustomerId, filter, groupingKeys, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "PriceEvaluateParams{priceId=$priceId, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, customerId=$customerId, externalCustomerId=$externalCustomerId, filter=$filter, groupingKeys=$groupingKeys, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var priceId: String? = null
        private var timeframeEnd: OffsetDateTime? = null
        private var timeframeStart: OffsetDateTime? = null
        private var customerId: String? = null
        private var externalCustomerId: String? = null
        private var filter: String? = null
        private var groupingKeys: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(priceEvaluateParams: PriceEvaluateParams) = apply {
            this.priceId = priceEvaluateParams.priceId
            this.timeframeEnd = priceEvaluateParams.timeframeEnd
            this.timeframeStart = priceEvaluateParams.timeframeStart
            this.customerId = priceEvaluateParams.customerId
            this.externalCustomerId = priceEvaluateParams.externalCustomerId
            this.filter = priceEvaluateParams.filter
            this.groupingKeys(priceEvaluateParams.groupingKeys ?: listOf())
            additionalQueryParams(priceEvaluateParams.additionalQueryParams)
            additionalHeaders(priceEvaluateParams.additionalHeaders)
            additionalBodyProperties(priceEvaluateParams.additionalBodyProperties)
        }

        fun priceId(priceId: String) = apply { this.priceId = priceId }

        /** The exclusive upper bound for event timestamps */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply { this.timeframeEnd = timeframeEnd }

        /** The inclusive lower bound for event timestamps */
        fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
            this.timeframeStart = timeframeStart
        }

        /** The ID of the customer to which this evaluation is scoped. */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** The external customer ID of the customer to which this evaluation is scoped. */
        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the underlying billable metric
         */
        fun filter(filter: String) = apply { this.filter = filter }

        /**
         * Properties (or
         * [computed properties](../guides/extensibility/advanced-metrics#computed-properties)) used
         * to group the underlying billable metric
         */
        fun groupingKeys(groupingKeys: List<String>) = apply {
            this.groupingKeys.clear()
            this.groupingKeys.addAll(groupingKeys)
        }

        /**
         * Properties (or
         * [computed properties](../guides/extensibility/advanced-metrics#computed-properties)) used
         * to group the underlying billable metric
         */
        fun addGroupingKey(groupingKey: String) = apply { this.groupingKeys.add(groupingKey) }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): PriceEvaluateParams =
            PriceEvaluateParams(
                checkNotNull(priceId) { "`priceId` is required but was not set" },
                checkNotNull(timeframeEnd) { "`timeframeEnd` is required but was not set" },
                checkNotNull(timeframeStart) { "`timeframeStart` is required but was not set" },
                customerId,
                externalCustomerId,
                filter,
                if (groupingKeys.size == 0) null else groupingKeys.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
