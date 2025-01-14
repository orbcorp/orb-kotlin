// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

/**
 * This endpoint is used to evaluate the output of a price for a given customer and time range. It
 * enables filtering and grouping the output using
 * [computed properties](../guides/extensibility/advanced-metrics#computed-properties), supporting
 * the following workflows:
 * 1. Showing detailed usage and costs to the end customer.
 * 2. Auditing subtotals on invoice line items.
 *
 * For these workflows, the expressiveness of computed properties in both the filters and grouping
 * is critical. For example, if you'd like to show your customer their usage grouped by hour and
 * another property, you can do so with the following `grouping_keys`:
 * `["hour_floor_timestamp_millis(timestamp_millis)", "my_property"]`. If you'd like to examine a
 * customer's usage for a specific property value, you can do so with the following `filter`:
 * `my_property = 'foo' AND my_other_property = 'bar'`.
 *
 * By default, the start of the time range must be no more than 100 days ago and the length of the
 * results must be no greater than 1000. Note that this is a POST endpoint rather than a GET
 * endpoint because it employs a JSON body rather than query parameters.
 */
class PriceEvaluateParams
constructor(
    private val priceId: String,
    private val body: PriceEvaluateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun priceId(): String = priceId

    /** The exclusive upper bound for event timestamps */
    fun timeframeEnd(): OffsetDateTime = body.timeframeEnd()

    /** The inclusive lower bound for event timestamps */
    fun timeframeStart(): OffsetDateTime = body.timeframeStart()

    /** The ID of the customer to which this evaluation is scoped. */
    fun customerId(): String? = body.customerId()

    /** The external customer ID of the customer to which this evaluation is scoped. */
    fun externalCustomerId(): String? = body.externalCustomerId()

    /**
     * A boolean [computed property](../guides/extensibility/advanced-metrics#computed-properties)
     * used to filter the underlying billable metric
     */
    fun filter(): String? = body.filter()

    /**
     * Properties (or
     * [computed properties](../guides/extensibility/advanced-metrics#computed-properties)) used to
     * group the underlying billable metric
     */
    fun groupingKeys(): List<String>? = body.groupingKeys()

    /** The exclusive upper bound for event timestamps */
    fun _timeframeEnd(): JsonField<OffsetDateTime> = body._timeframeEnd()

    /** The inclusive lower bound for event timestamps */
    fun _timeframeStart(): JsonField<OffsetDateTime> = body._timeframeStart()

    /** The ID of the customer to which this evaluation is scoped. */
    fun _customerId(): JsonField<String> = body._customerId()

    /** The external customer ID of the customer to which this evaluation is scoped. */
    fun _externalCustomerId(): JsonField<String> = body._externalCustomerId()

    /**
     * A boolean [computed property](../guides/extensibility/advanced-metrics#computed-properties)
     * used to filter the underlying billable metric
     */
    fun _filter(): JsonField<String> = body._filter()

    /**
     * Properties (or
     * [computed properties](../guides/extensibility/advanced-metrics#computed-properties)) used to
     * group the underlying billable metric
     */
    fun _groupingKeys(): JsonField<List<String>> = body._groupingKeys()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): PriceEvaluateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> priceId
            else -> ""
        }
    }

    @NoAutoDetect
    class PriceEvaluateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("timeframe_end")
        @ExcludeMissing
        private val timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("timeframe_start")
        @ExcludeMissing
        private val timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        private val externalCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filter")
        @ExcludeMissing
        private val filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("grouping_keys")
        @ExcludeMissing
        private val groupingKeys: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The exclusive upper bound for event timestamps */
        fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

        /** The inclusive lower bound for event timestamps */
        fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

        /** The ID of the customer to which this evaluation is scoped. */
        fun customerId(): String? = customerId.getNullable("customer_id")

        /** The external customer ID of the customer to which this evaluation is scoped. */
        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the underlying billable metric
         */
        fun filter(): String? = filter.getNullable("filter")

        /**
         * Properties (or
         * [computed properties](../guides/extensibility/advanced-metrics#computed-properties)) used
         * to group the underlying billable metric
         */
        fun groupingKeys(): List<String>? = groupingKeys.getNullable("grouping_keys")

        /** The exclusive upper bound for event timestamps */
        @JsonProperty("timeframe_end")
        @ExcludeMissing
        fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

        /** The inclusive lower bound for event timestamps */
        @JsonProperty("timeframe_start")
        @ExcludeMissing
        fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

        /** The ID of the customer to which this evaluation is scoped. */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** The external customer ID of the customer to which this evaluation is scoped. */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the underlying billable metric
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Properties (or
         * [computed properties](../guides/extensibility/advanced-metrics#computed-properties)) used
         * to group the underlying billable metric
         */
        @JsonProperty("grouping_keys")
        @ExcludeMissing
        fun _groupingKeys(): JsonField<List<String>> = groupingKeys

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PriceEvaluateBody = apply {
            if (validated) {
                return@apply
            }

            timeframeEnd()
            timeframeStart()
            customerId()
            externalCustomerId()
            filter()
            groupingKeys()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var timeframeEnd: JsonField<OffsetDateTime>? = null
            private var timeframeStart: JsonField<OffsetDateTime>? = null
            private var customerId: JsonField<String> = JsonMissing.of()
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var filter: JsonField<String> = JsonMissing.of()
            private var groupingKeys: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(priceEvaluateBody: PriceEvaluateBody) = apply {
                timeframeEnd = priceEvaluateBody.timeframeEnd
                timeframeStart = priceEvaluateBody.timeframeStart
                customerId = priceEvaluateBody.customerId
                externalCustomerId = priceEvaluateBody.externalCustomerId
                filter = priceEvaluateBody.filter
                groupingKeys = priceEvaluateBody.groupingKeys.map { it.toMutableList() }
                additionalProperties = priceEvaluateBody.additionalProperties.toMutableMap()
            }

            /** The exclusive upper bound for event timestamps */
            fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                timeframeEnd(JsonField.of(timeframeEnd))

            /** The exclusive upper bound for event timestamps */
            fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                this.timeframeEnd = timeframeEnd
            }

            /** The inclusive lower bound for event timestamps */
            fun timeframeStart(timeframeStart: OffsetDateTime) =
                timeframeStart(JsonField.of(timeframeStart))

            /** The inclusive lower bound for event timestamps */
            fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                this.timeframeStart = timeframeStart
            }

            /** The ID of the customer to which this evaluation is scoped. */
            fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

            /** The ID of the customer to which this evaluation is scoped. */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** The external customer ID of the customer to which this evaluation is scoped. */
            fun externalCustomerId(externalCustomerId: String?) =
                externalCustomerId(JsonField.ofNullable(externalCustomerId))

            /** The external customer ID of the customer to which this evaluation is scoped. */
            fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /**
             * A boolean
             * [computed property](../guides/extensibility/advanced-metrics#computed-properties)
             * used to filter the underlying billable metric
             */
            fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

            /**
             * A boolean
             * [computed property](../guides/extensibility/advanced-metrics#computed-properties)
             * used to filter the underlying billable metric
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /**
             * Properties (or
             * [computed properties](../guides/extensibility/advanced-metrics#computed-properties))
             * used to group the underlying billable metric
             */
            fun groupingKeys(groupingKeys: List<String>) = groupingKeys(JsonField.of(groupingKeys))

            /**
             * Properties (or
             * [computed properties](../guides/extensibility/advanced-metrics#computed-properties))
             * used to group the underlying billable metric
             */
            fun groupingKeys(groupingKeys: JsonField<List<String>>) = apply {
                this.groupingKeys = groupingKeys.map { it.toMutableList() }
            }

            /**
             * Properties (or
             * [computed properties](../guides/extensibility/advanced-metrics#computed-properties))
             * used to group the underlying billable metric
             */
            fun addGroupingKey(groupingKey: String) = apply {
                groupingKeys =
                    (groupingKeys ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(groupingKey)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): PriceEvaluateBody =
                PriceEvaluateBody(
                    checkRequired("timeframeEnd", timeframeEnd),
                    checkRequired("timeframeStart", timeframeStart),
                    customerId,
                    externalCustomerId,
                    filter,
                    (groupingKeys ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PriceEvaluateBody && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && customerId == other.customerId && externalCustomerId == other.externalCustomerId && filter == other.filter && groupingKeys == other.groupingKeys && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(timeframeEnd, timeframeStart, customerId, externalCustomerId, filter, groupingKeys, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PriceEvaluateBody{timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, customerId=$customerId, externalCustomerId=$externalCustomerId, filter=$filter, groupingKeys=$groupingKeys, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var priceId: String? = null
        private var body: PriceEvaluateBody.Builder = PriceEvaluateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(priceEvaluateParams: PriceEvaluateParams) = apply {
            priceId = priceEvaluateParams.priceId
            body = priceEvaluateParams.body.toBuilder()
            additionalHeaders = priceEvaluateParams.additionalHeaders.toBuilder()
            additionalQueryParams = priceEvaluateParams.additionalQueryParams.toBuilder()
        }

        fun priceId(priceId: String) = apply { this.priceId = priceId }

        /** The exclusive upper bound for event timestamps */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply { body.timeframeEnd(timeframeEnd) }

        /** The exclusive upper bound for event timestamps */
        fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
            body.timeframeEnd(timeframeEnd)
        }

        /** The inclusive lower bound for event timestamps */
        fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
            body.timeframeStart(timeframeStart)
        }

        /** The inclusive lower bound for event timestamps */
        fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
            body.timeframeStart(timeframeStart)
        }

        /** The ID of the customer to which this evaluation is scoped. */
        fun customerId(customerId: String?) = apply { body.customerId(customerId) }

        /** The ID of the customer to which this evaluation is scoped. */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** The external customer ID of the customer to which this evaluation is scoped. */
        fun externalCustomerId(externalCustomerId: String?) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /** The external customer ID of the customer to which this evaluation is scoped. */
        fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the underlying billable metric
         */
        fun filter(filter: String?) = apply { body.filter(filter) }

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the underlying billable metric
         */
        fun filter(filter: JsonField<String>) = apply { body.filter(filter) }

        /**
         * Properties (or
         * [computed properties](../guides/extensibility/advanced-metrics#computed-properties)) used
         * to group the underlying billable metric
         */
        fun groupingKeys(groupingKeys: List<String>) = apply { body.groupingKeys(groupingKeys) }

        /**
         * Properties (or
         * [computed properties](../guides/extensibility/advanced-metrics#computed-properties)) used
         * to group the underlying billable metric
         */
        fun groupingKeys(groupingKeys: JsonField<List<String>>) = apply {
            body.groupingKeys(groupingKeys)
        }

        /**
         * Properties (or
         * [computed properties](../guides/extensibility/advanced-metrics#computed-properties)) used
         * to group the underlying billable metric
         */
        fun addGroupingKey(groupingKey: String) = apply { body.addGroupingKey(groupingKey) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        fun build(): PriceEvaluateParams =
            PriceEvaluateParams(
                checkRequired("priceId", priceId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceEvaluateParams && priceId == other.priceId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(priceId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PriceEvaluateParams{priceId=$priceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
