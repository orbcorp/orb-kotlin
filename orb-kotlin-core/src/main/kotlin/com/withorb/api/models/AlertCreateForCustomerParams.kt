// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.util.Objects

class AlertCreateForCustomerParams
constructor(
    private val customerId: String,
    private val currency: String,
    private val type: Type,
    private val thresholds: List<Threshold>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun currency(): String = currency

    fun type(): Type = type

    fun thresholds(): List<Threshold>? = thresholds

    internal fun getBody(): AlertCreateForCustomerBody {
        return AlertCreateForCustomerBody(
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
            0 -> customerId
            else -> ""
        }
    }

    @JsonDeserialize(builder = AlertCreateForCustomerBody.Builder::class)
    @NoAutoDetect
    class AlertCreateForCustomerBody
    internal constructor(
        private val currency: String?,
        private val type: Type?,
        private val thresholds: List<Threshold>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The case sensitive currency or custom pricing unit to use for this alert. */
        @JsonProperty("currency") fun currency(): String? = currency

        /** The type of alert to create. This must be a valid alert type. */
        @JsonProperty("type") fun type(): Type? = type

        /** The thresholds that define the values at which the alert will be triggered. */
        @JsonProperty("thresholds") fun thresholds(): List<Threshold>? = thresholds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AlertCreateForCustomerBody &&
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
            "AlertCreateForCustomerBody{currency=$currency, type=$type, thresholds=$thresholds, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var currency: String? = null
            private var type: Type? = null
            private var thresholds: List<Threshold>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(alertCreateForCustomerBody: AlertCreateForCustomerBody) = apply {
                this.currency = alertCreateForCustomerBody.currency
                this.type = alertCreateForCustomerBody.type
                this.thresholds = alertCreateForCustomerBody.thresholds
                additionalProperties(alertCreateForCustomerBody.additionalProperties)
            }

            /** The case sensitive currency or custom pricing unit to use for this alert. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /** The type of alert to create. This must be a valid alert type. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /** The thresholds that define the values at which the alert will be triggered. */
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

            fun build(): AlertCreateForCustomerBody =
                AlertCreateForCustomerBody(
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

        return other is AlertCreateForCustomerParams &&
            this.customerId == other.customerId &&
            this.currency == other.currency &&
            this.type == other.type &&
            this.thresholds == other.thresholds &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            customerId,
            currency,
            type,
            thresholds,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AlertCreateForCustomerParams{customerId=$customerId, currency=$currency, type=$type, thresholds=$thresholds, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var currency: String? = null
        private var type: Type? = null
        private var thresholds: MutableList<Threshold> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(alertCreateForCustomerParams: AlertCreateForCustomerParams) = apply {
            this.customerId = alertCreateForCustomerParams.customerId
            this.currency = alertCreateForCustomerParams.currency
            this.type = alertCreateForCustomerParams.type
            this.thresholds(alertCreateForCustomerParams.thresholds ?: listOf())
            additionalQueryParams(alertCreateForCustomerParams.additionalQueryParams)
            additionalHeaders(alertCreateForCustomerParams.additionalHeaders)
            additionalBodyProperties(alertCreateForCustomerParams.additionalBodyProperties)
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** The case sensitive currency or custom pricing unit to use for this alert. */
        fun currency(currency: String) = apply { this.currency = currency }

        /** The type of alert to create. This must be a valid alert type. */
        fun type(type: Type) = apply { this.type = type }

        /** The thresholds that define the values at which the alert will be triggered. */
        fun thresholds(thresholds: List<Threshold>) = apply {
            this.thresholds.clear()
            this.thresholds.addAll(thresholds)
        }

        /** The thresholds that define the values at which the alert will be triggered. */
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

        fun build(): AlertCreateForCustomerParams =
            AlertCreateForCustomerParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                if (thresholds.size == 0) null else thresholds.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val USAGE_EXCEEDED = Type(JsonField.of("usage_exceeded"))

            val COST_EXCEEDED = Type(JsonField.of("cost_exceeded"))

            val CREDIT_BALANCE_DEPLETED = Type(JsonField.of("credit_balance_depleted"))

            val CREDIT_BALANCE_DROPPED = Type(JsonField.of("credit_balance_dropped"))

            val CREDIT_BALANCE_RECOVERED = Type(JsonField.of("credit_balance_recovered"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            USAGE_EXCEEDED,
            COST_EXCEEDED,
            CREDIT_BALANCE_DEPLETED,
            CREDIT_BALANCE_DROPPED,
            CREDIT_BALANCE_RECOVERED,
        }

        enum class Value {
            USAGE_EXCEEDED,
            COST_EXCEEDED,
            CREDIT_BALANCE_DEPLETED,
            CREDIT_BALANCE_DROPPED,
            CREDIT_BALANCE_RECOVERED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                USAGE_EXCEEDED -> Value.USAGE_EXCEEDED
                COST_EXCEEDED -> Value.COST_EXCEEDED
                CREDIT_BALANCE_DEPLETED -> Value.CREDIT_BALANCE_DEPLETED
                CREDIT_BALANCE_DROPPED -> Value.CREDIT_BALANCE_DROPPED
                CREDIT_BALANCE_RECOVERED -> Value.CREDIT_BALANCE_RECOVERED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                USAGE_EXCEEDED -> Known.USAGE_EXCEEDED
                COST_EXCEEDED -> Known.COST_EXCEEDED
                CREDIT_BALANCE_DEPLETED -> Known.CREDIT_BALANCE_DEPLETED
                CREDIT_BALANCE_DROPPED -> Known.CREDIT_BALANCE_DROPPED
                CREDIT_BALANCE_RECOVERED -> Known.CREDIT_BALANCE_RECOVERED
                else -> throw OrbInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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
