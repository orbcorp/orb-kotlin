// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.util.Objects

class AlertCreateForExternalCustomerParams
constructor(
    private val externalCustomerId: String,
    private val currency: String,
    private val type: Type,
    private val thresholds: List<Threshold>?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun externalCustomerId(): String = externalCustomerId

    fun currency(): String = currency

    fun type(): Type = type

    fun thresholds(): List<Threshold>? = thresholds

    internal fun getBody(): AlertCreateForExternalCustomerBody {
        return AlertCreateForExternalCustomerBody(
            currency,
            type,
            thresholds,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

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
        private val type: Type?,
        private val thresholds: List<Threshold>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

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

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var currency: String? = null
            private var type: Type? = null
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

            fun build(): AlertCreateForExternalCustomerBody =
                AlertCreateForExternalCustomerBody(
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(type) { "`type` is required but was not set" },
                    thresholds?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AlertCreateForExternalCustomerBody && this.currency == other.currency && this.type == other.type && this.thresholds == other.thresholds && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(currency, type, thresholds, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AlertCreateForExternalCustomerBody{currency=$currency, type=$type, thresholds=$thresholds, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AlertCreateForExternalCustomerParams && this.externalCustomerId == other.externalCustomerId && this.currency == other.currency && this.type == other.type && this.thresholds == other.thresholds && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(externalCustomerId, currency, type, thresholds, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AlertCreateForExternalCustomerParams{externalCustomerId=$externalCustomerId, currency=$currency, type=$type, thresholds=$thresholds, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalCustomerId: String? = null
        private var currency: String? = null
        private var type: Type? = null
        private var thresholds: MutableList<Threshold> = mutableListOf()
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            alertCreateForExternalCustomerParams: AlertCreateForExternalCustomerParams
        ) = apply {
            this.externalCustomerId = alertCreateForExternalCustomerParams.externalCustomerId
            this.currency = alertCreateForExternalCustomerParams.currency
            this.type = alertCreateForExternalCustomerParams.type
            this.thresholds(alertCreateForExternalCustomerParams.thresholds ?: listOf())
            additionalHeaders(alertCreateForExternalCustomerParams.additionalHeaders)
            additionalQueryParams(alertCreateForExternalCustomerParams.additionalQueryParams)
            additionalBodyProperties(alertCreateForExternalCustomerParams.additionalBodyProperties)
        }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

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
                if (thresholds.size == 0) null else thresholds.toImmutable(),
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
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
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Threshold && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(value, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Threshold{value=$value, additionalProperties=$additionalProperties}"
    }
}
