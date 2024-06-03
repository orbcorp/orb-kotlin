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

class AlertCreateForExternalCustomerParams
constructor(
    private val externalCustomerId: String,
    private val currency: String,
    private val type: String,
    private val thresholds: List<Threshold>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun externalCustomerId(): String = externalCustomerId

    fun currency(): String = currency

    fun type(): String = type

    fun thresholds(): List<Threshold>? = thresholds

    internal fun getBody(): AlertCreateForExternalCustomerBody {
        return AlertCreateForExternalCustomerBody(
            currency,
            type,
            thresholds,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalCustomerId
            else -> ""
        }
    }

    @JsonDeserialize(builder = AlertCreateForExternalCustomerBody.Builder::class)
    @NoAutoDetect
    class AlertCreateForExternalCustomerBody
    internal constructor(
        private val currency: String?,
        private val type: String?,
        private val thresholds: List<Threshold>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The case sensitive currency or custom pricing unit to use for this alert. */
        @JsonProperty("currency") fun currency(): String? = currency

        /** The thresholds that define the values at which the alert will be triggered. */
        @JsonProperty("type") fun type(): String? = type

        /** The thresholds for the alert. */
        @JsonProperty("thresholds") fun thresholds(): List<Threshold>? = thresholds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AlertCreateForExternalCustomerBody &&
                this.currency == other.currency &&
                this.type == other.type &&
                this.thresholds == other.thresholds &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        currency,
                        type,
                        thresholds,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AlertCreateForExternalCustomerBody{currency=$currency, type=$type, thresholds=$thresholds, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var currency: String? = null
            private var type: String? = null
            private var thresholds: List<Threshold>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                alertCreateForExternalCustomerBody: AlertCreateForExternalCustomerBody
            ) = apply {
                this.currency = alertCreateForExternalCustomerBody.currency
                this.type = alertCreateForExternalCustomerBody.type
                this.thresholds = alertCreateForExternalCustomerBody.thresholds
                additionalProperties(alertCreateForExternalCustomerBody.additionalProperties)
            }

            /** The case sensitive currency or custom pricing unit to use for this alert. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /** The thresholds that define the values at which the alert will be triggered. */
            @JsonProperty("type") fun type(type: String) = apply { this.type = type }

            /** The thresholds for the alert. */
            @JsonProperty("thresholds")
            fun thresholds(thresholds: List<Threshold>) = apply { this.thresholds = thresholds }

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

            fun build(): AlertCreateForExternalCustomerBody =
                AlertCreateForExternalCustomerBody(
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(type) { "`type` is required but was not set" },
                    thresholds?.toUnmodifiable(),
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

        return other is AlertCreateForExternalCustomerParams &&
            this.externalCustomerId == other.externalCustomerId &&
            this.currency == other.currency &&
            this.type == other.type &&
            this.thresholds == other.thresholds &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            externalCustomerId,
            currency,
            type,
            thresholds,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AlertCreateForExternalCustomerParams{externalCustomerId=$externalCustomerId, currency=$currency, type=$type, thresholds=$thresholds, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalCustomerId: String? = null
        private var currency: String? = null
        private var type: String? = null
        private var thresholds: MutableList<Threshold> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            alertCreateForExternalCustomerParams: AlertCreateForExternalCustomerParams
        ) = apply {
            this.externalCustomerId = alertCreateForExternalCustomerParams.externalCustomerId
            this.currency = alertCreateForExternalCustomerParams.currency
            this.type = alertCreateForExternalCustomerParams.type
            this.thresholds(alertCreateForExternalCustomerParams.thresholds ?: listOf())
            additionalQueryParams(alertCreateForExternalCustomerParams.additionalQueryParams)
            additionalHeaders(alertCreateForExternalCustomerParams.additionalHeaders)
            additionalBodyProperties(alertCreateForExternalCustomerParams.additionalBodyProperties)
        }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** The case sensitive currency or custom pricing unit to use for this alert. */
        fun currency(currency: String) = apply { this.currency = currency }

        /** The thresholds that define the values at which the alert will be triggered. */
        fun type(type: String) = apply { this.type = type }

        /** The thresholds for the alert. */
        fun thresholds(thresholds: List<Threshold>) = apply {
            this.thresholds.clear()
            this.thresholds.addAll(thresholds)
        }

        /** The thresholds for the alert. */
        fun addThreshold(threshold: Threshold) = apply { this.thresholds.add(threshold) }

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

        fun build(): AlertCreateForExternalCustomerParams =
            AlertCreateForExternalCustomerParams(
                checkNotNull(externalCustomerId) {
                    "`externalCustomerId` is required but was not set"
                },
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                if (thresholds.size == 0) null else thresholds.toUnmodifiable(),
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
