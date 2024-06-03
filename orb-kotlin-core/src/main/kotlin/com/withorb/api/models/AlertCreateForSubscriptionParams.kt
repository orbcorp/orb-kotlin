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
import java.util.Objects

class AlertCreateForSubscriptionParams
constructor(
    private val subscriptionId: String,
    private val thresholds: List<Threshold>,
    private val type: String,
    private val metricId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun subscriptionId(): String = subscriptionId

    fun thresholds(): List<Threshold> = thresholds

    fun type(): String = type

    fun metricId(): String? = metricId

    internal fun getBody(): AlertCreateForSubscriptionBody {
        return AlertCreateForSubscriptionBody(
            thresholds,
            type,
            metricId,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    @JsonDeserialize(builder = AlertCreateForSubscriptionBody.Builder::class)
    @NoAutoDetect
    class AlertCreateForSubscriptionBody
    internal constructor(
        private val thresholds: List<Threshold>?,
        private val type: String?,
        private val metricId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The thresholds for the alert. */
        @JsonProperty("thresholds") fun thresholds(): List<Threshold>? = thresholds

        /** The thresholds that define the values at which the alert will be triggered. */
        @JsonProperty("type") fun type(): String? = type

        /** The metric to track usage for. */
        @JsonProperty("metric_id") fun metricId(): String? = metricId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AlertCreateForSubscriptionBody &&
                this.thresholds == other.thresholds &&
                this.type == other.type &&
                this.metricId == other.metricId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        thresholds,
                        type,
                        metricId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AlertCreateForSubscriptionBody{thresholds=$thresholds, type=$type, metricId=$metricId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var thresholds: List<Threshold>? = null
            private var type: String? = null
            private var metricId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(alertCreateForSubscriptionBody: AlertCreateForSubscriptionBody) =
                apply {
                    this.thresholds = alertCreateForSubscriptionBody.thresholds
                    this.type = alertCreateForSubscriptionBody.type
                    this.metricId = alertCreateForSubscriptionBody.metricId
                    additionalProperties(alertCreateForSubscriptionBody.additionalProperties)
                }

            /** The thresholds for the alert. */
            @JsonProperty("thresholds")
            fun thresholds(thresholds: List<Threshold>) = apply { this.thresholds = thresholds }

            /** The thresholds that define the values at which the alert will be triggered. */
            @JsonProperty("type") fun type(type: String) = apply { this.type = type }

            /** The metric to track usage for. */
            @JsonProperty("metric_id")
            fun metricId(metricId: String) = apply { this.metricId = metricId }

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

            fun build(): AlertCreateForSubscriptionBody =
                AlertCreateForSubscriptionBody(
                    checkNotNull(thresholds) { "`thresholds` is required but was not set" }
                        .toUnmodifiable(),
                    checkNotNull(type) { "`type` is required but was not set" },
                    metricId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlertCreateForSubscriptionParams &&
            this.subscriptionId == other.subscriptionId &&
            this.thresholds == other.thresholds &&
            this.type == other.type &&
            this.metricId == other.metricId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            subscriptionId,
            thresholds,
            type,
            metricId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AlertCreateForSubscriptionParams{subscriptionId=$subscriptionId, thresholds=$thresholds, type=$type, metricId=$metricId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var thresholds: MutableList<Threshold> = mutableListOf()
        private var type: String? = null
        private var metricId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(alertCreateForSubscriptionParams: AlertCreateForSubscriptionParams) =
            apply {
                this.subscriptionId = alertCreateForSubscriptionParams.subscriptionId
                this.thresholds(alertCreateForSubscriptionParams.thresholds)
                this.type = alertCreateForSubscriptionParams.type
                this.metricId = alertCreateForSubscriptionParams.metricId
                additionalQueryParams(alertCreateForSubscriptionParams.additionalQueryParams)
                additionalHeaders(alertCreateForSubscriptionParams.additionalHeaders)
                additionalBodyProperties(alertCreateForSubscriptionParams.additionalBodyProperties)
            }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /** The thresholds for the alert. */
        fun thresholds(thresholds: List<Threshold>) = apply {
            this.thresholds.clear()
            this.thresholds.addAll(thresholds)
        }

        /** The thresholds for the alert. */
        fun addThreshold(threshold: Threshold) = apply { this.thresholds.add(threshold) }

        /** The thresholds that define the values at which the alert will be triggered. */
        fun type(type: String) = apply { this.type = type }

        /** The metric to track usage for. */
        fun metricId(metricId: String) = apply { this.metricId = metricId }

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

        fun build(): AlertCreateForSubscriptionParams =
            AlertCreateForSubscriptionParams(
                checkNotNull(subscriptionId) { "`subscriptionId` is required but was not set" },
                checkNotNull(thresholds) { "`thresholds` is required but was not set" }
                    .toUnmodifiable(),
                checkNotNull(type) { "`type` is required but was not set" },
                metricId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /** Thresholds are used to define the conditions under which an alert will be triggered. */
    @JsonDeserialize(builder = Threshold.Builder::class)
    @NoAutoDetect
    class Threshold
    private constructor(
        private val value: Double?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * The value at which an alert will fire. For credit balance alerts, the alert will fire at
         * or below this value. For usage and cost alerts, the alert will fire at or above this
         * value.
         */
        @JsonProperty("value") fun value(): Double? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Threshold &&
                this.value == other.value &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(value, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "Threshold{value=$value, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var value: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(threshold: Threshold) = apply {
                this.value = threshold.value
                additionalProperties(threshold.additionalProperties)
            }

            /**
             * The value at which an alert will fire. For credit balance alerts, the alert will fire
             * at or below this value. For usage and cost alerts, the alert will fire at or above
             * this value.
             */
            @JsonProperty("value") fun value(value: Double) = apply { this.value = value }

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

            fun build(): Threshold =
                Threshold(
                    checkNotNull(value) { "`value` is required but was not set" },
                    additionalProperties.toUnmodifiable()
                )
        }
    }
}
