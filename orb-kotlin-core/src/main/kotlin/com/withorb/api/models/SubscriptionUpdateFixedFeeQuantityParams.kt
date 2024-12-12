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
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.util.Objects

class SubscriptionUpdateFixedFeeQuantityParams
constructor(
    private val subscriptionId: String,
    private val priceId: String,
    private val quantity: Double,
    private val changeOption: ChangeOption?,
    private val effectiveDate: LocalDate?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun subscriptionId(): String = subscriptionId

    fun priceId(): String = priceId

    fun quantity(): Double = quantity

    fun changeOption(): ChangeOption? = changeOption

    fun effectiveDate(): LocalDate? = effectiveDate

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): SubscriptionUpdateFixedFeeQuantityBody {
        return SubscriptionUpdateFixedFeeQuantityBody(
            priceId,
            quantity,
            changeOption,
            effectiveDate,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SubscriptionUpdateFixedFeeQuantityBody.Builder::class)
    @NoAutoDetect
    class SubscriptionUpdateFixedFeeQuantityBody
    internal constructor(
        private val priceId: String?,
        private val quantity: Double?,
        private val changeOption: ChangeOption?,
        private val effectiveDate: LocalDate?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Price for which the quantity should be updated. Must be a fixed fee. */
        @JsonProperty("price_id") fun priceId(): String? = priceId

        @JsonProperty("quantity") fun quantity(): Double? = quantity

        /**
         * Determines when the change takes effect. Note that if `effective_date` is specified, this
         * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's
         * explicitly set to `upcoming_invoice.
         */
        @JsonProperty("change_option") fun changeOption(): ChangeOption? = changeOption

        /**
         * The date that the quantity change should take effect, localized to the customer's
         * timezone. Ifthis parameter is not passed in, the quantity change is effective according
         * to `change_option`.
         */
        @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var priceId: String? = null
            private var quantity: Double? = null
            private var changeOption: ChangeOption? = null
            private var effectiveDate: LocalDate? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                subscriptionUpdateFixedFeeQuantityBody: SubscriptionUpdateFixedFeeQuantityBody
            ) = apply {
                this.priceId = subscriptionUpdateFixedFeeQuantityBody.priceId
                this.quantity = subscriptionUpdateFixedFeeQuantityBody.quantity
                this.changeOption = subscriptionUpdateFixedFeeQuantityBody.changeOption
                this.effectiveDate = subscriptionUpdateFixedFeeQuantityBody.effectiveDate
                additionalProperties(subscriptionUpdateFixedFeeQuantityBody.additionalProperties)
            }

            /** Price for which the quantity should be updated. Must be a fixed fee. */
            @JsonProperty("price_id")
            fun priceId(priceId: String) = apply { this.priceId = priceId }

            @JsonProperty("quantity")
            fun quantity(quantity: Double) = apply { this.quantity = quantity }

            /**
             * Determines when the change takes effect. Note that if `effective_date` is specified,
             * this defaults to `effective_date`. Otherwise, this defaults to `immediate` unless
             * it's explicitly set to `upcoming_invoice.
             */
            @JsonProperty("change_option")
            fun changeOption(changeOption: ChangeOption) = apply {
                this.changeOption = changeOption
            }

            /**
             * The date that the quantity change should take effect, localized to the customer's
             * timezone. Ifthis parameter is not passed in, the quantity change is effective
             * according to `change_option`.
             */
            @JsonProperty("effective_date")
            fun effectiveDate(effectiveDate: LocalDate) = apply {
                this.effectiveDate = effectiveDate
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

            fun build(): SubscriptionUpdateFixedFeeQuantityBody =
                SubscriptionUpdateFixedFeeQuantityBody(
                    checkNotNull(priceId) { "`priceId` is required but was not set" },
                    checkNotNull(quantity) { "`quantity` is required but was not set" },
                    changeOption,
                    effectiveDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SubscriptionUpdateFixedFeeQuantityBody && priceId == other.priceId && quantity == other.quantity && changeOption == other.changeOption && effectiveDate == other.effectiveDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(priceId, quantity, changeOption, effectiveDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubscriptionUpdateFixedFeeQuantityBody{priceId=$priceId, quantity=$quantity, changeOption=$changeOption, effectiveDate=$effectiveDate, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var priceId: String? = null
        private var quantity: Double? = null
        private var changeOption: ChangeOption? = null
        private var effectiveDate: LocalDate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            subscriptionUpdateFixedFeeQuantityParams: SubscriptionUpdateFixedFeeQuantityParams
        ) = apply {
            subscriptionId = subscriptionUpdateFixedFeeQuantityParams.subscriptionId
            priceId = subscriptionUpdateFixedFeeQuantityParams.priceId
            quantity = subscriptionUpdateFixedFeeQuantityParams.quantity
            changeOption = subscriptionUpdateFixedFeeQuantityParams.changeOption
            effectiveDate = subscriptionUpdateFixedFeeQuantityParams.effectiveDate
            additionalHeaders =
                subscriptionUpdateFixedFeeQuantityParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                subscriptionUpdateFixedFeeQuantityParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                subscriptionUpdateFixedFeeQuantityParams.additionalBodyProperties.toMutableMap()
        }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /** Price for which the quantity should be updated. Must be a fixed fee. */
        fun priceId(priceId: String) = apply { this.priceId = priceId }

        fun quantity(quantity: Double) = apply { this.quantity = quantity }

        /**
         * Determines when the change takes effect. Note that if `effective_date` is specified, this
         * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's
         * explicitly set to `upcoming_invoice.
         */
        fun changeOption(changeOption: ChangeOption) = apply { this.changeOption = changeOption }

        /**
         * The date that the quantity change should take effect, localized to the customer's
         * timezone. Ifthis parameter is not passed in, the quantity change is effective according
         * to `change_option`.
         */
        fun effectiveDate(effectiveDate: LocalDate) = apply { this.effectiveDate = effectiveDate }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): SubscriptionUpdateFixedFeeQuantityParams =
            SubscriptionUpdateFixedFeeQuantityParams(
                checkNotNull(subscriptionId) { "`subscriptionId` is required but was not set" },
                checkNotNull(priceId) { "`priceId` is required but was not set" },
                checkNotNull(quantity) { "`quantity` is required but was not set" },
                changeOption,
                effectiveDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class ChangeOption
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val IMMEDIATE = of("immediate")

            val UPCOMING_INVOICE = of("upcoming_invoice")

            val EFFECTIVE_DATE = of("effective_date")

            fun of(value: String) = ChangeOption(JsonField.of(value))
        }

        enum class Known {
            IMMEDIATE,
            UPCOMING_INVOICE,
            EFFECTIVE_DATE,
        }

        enum class Value {
            IMMEDIATE,
            UPCOMING_INVOICE,
            EFFECTIVE_DATE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                IMMEDIATE -> Value.IMMEDIATE
                UPCOMING_INVOICE -> Value.UPCOMING_INVOICE
                EFFECTIVE_DATE -> Value.EFFECTIVE_DATE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                IMMEDIATE -> Known.IMMEDIATE
                UPCOMING_INVOICE -> Known.UPCOMING_INVOICE
                EFFECTIVE_DATE -> Known.EFFECTIVE_DATE
                else -> throw OrbInvalidDataException("Unknown ChangeOption: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChangeOption && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionUpdateFixedFeeQuantityParams && subscriptionId == other.subscriptionId && priceId == other.priceId && quantity == other.quantity && changeOption == other.changeOption && effectiveDate == other.effectiveDate && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, priceId, quantity, changeOption, effectiveDate, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "SubscriptionUpdateFixedFeeQuantityParams{subscriptionId=$subscriptionId, priceId=$priceId, quantity=$quantity, changeOption=$changeOption, effectiveDate=$effectiveDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
