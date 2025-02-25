// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.util.Objects

/**
 * This endpoint can be used to update the quantity for a fixed fee.
 *
 * To be eligible, the subscription must currently be active and the price specified must be a fixed
 * fee (not usage-based). This operation will immediately update the quantity for the fee, or if a
 * `effective_date` is passed in, will update the quantity on the requested date at midnight in the
 * customer's timezone.
 *
 * In order to change the fixed fee quantity as of the next draft invoice for this subscription,
 * pass `change_option=upcoming_invoice` without an `effective_date` specified.
 *
 * If the fee is an in-advance fixed fee, it will also issue an immediate invoice for the difference
 * for the remainder of the billing period.
 */
class SubscriptionUpdateFixedFeeQuantityParams
private constructor(
    private val subscriptionId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): String = subscriptionId

    /** Price for which the quantity should be updated. Must be a fixed fee. */
    fun priceId(): String = body.priceId()

    fun quantity(): Double = body.quantity()

    /**
     * If false, this request will fail if it would void an issued invoice or create a credit note.
     * Consider using this as a safety mechanism if you do not expect existing invoices to be
     * changed.
     */
    fun allowInvoiceCreditOrVoid(): Boolean? = body.allowInvoiceCreditOrVoid()

    /**
     * Determines when the change takes effect. Note that if `effective_date` is specified, this
     * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's explicitly
     * set to `upcoming_invoice`.
     */
    fun changeOption(): ChangeOption? = body.changeOption()

    /**
     * The date that the quantity change should take effect, localized to the customer's timezone.
     * Ifthis parameter is not passed in, the quantity change is effective according to
     * `change_option`.
     */
    fun effectiveDate(): LocalDate? = body.effectiveDate()

    /** Price for which the quantity should be updated. Must be a fixed fee. */
    fun _priceId(): JsonField<String> = body._priceId()

    fun _quantity(): JsonField<Double> = body._quantity()

    /**
     * If false, this request will fail if it would void an issued invoice or create a credit note.
     * Consider using this as a safety mechanism if you do not expect existing invoices to be
     * changed.
     */
    fun _allowInvoiceCreditOrVoid(): JsonField<Boolean> = body._allowInvoiceCreditOrVoid()

    /**
     * Determines when the change takes effect. Note that if `effective_date` is specified, this
     * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's explicitly
     * set to `upcoming_invoice`.
     */
    fun _changeOption(): JsonField<ChangeOption> = body._changeOption()

    /**
     * The date that the quantity change should take effect, localized to the customer's timezone.
     * Ifthis parameter is not passed in, the quantity change is effective according to
     * `change_option`.
     */
    fun _effectiveDate(): JsonField<LocalDate> = body._effectiveDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("price_id")
        @ExcludeMissing
        private val priceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("allow_invoice_credit_or_void")
        @ExcludeMissing
        private val allowInvoiceCreditOrVoid: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("change_option")
        @ExcludeMissing
        private val changeOption: JsonField<ChangeOption> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Price for which the quantity should be updated. Must be a fixed fee. */
        fun priceId(): String = priceId.getRequired("price_id")

        fun quantity(): Double = quantity.getRequired("quantity")

        /**
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         */
        fun allowInvoiceCreditOrVoid(): Boolean? =
            allowInvoiceCreditOrVoid.getNullable("allow_invoice_credit_or_void")

        /**
         * Determines when the change takes effect. Note that if `effective_date` is specified, this
         * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's
         * explicitly set to `upcoming_invoice`.
         */
        fun changeOption(): ChangeOption? = changeOption.getNullable("change_option")

        /**
         * The date that the quantity change should take effect, localized to the customer's
         * timezone. Ifthis parameter is not passed in, the quantity change is effective according
         * to `change_option`.
         */
        fun effectiveDate(): LocalDate? = effectiveDate.getNullable("effective_date")

        /** Price for which the quantity should be updated. Must be a fixed fee. */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         */
        @JsonProperty("allow_invoice_credit_or_void")
        @ExcludeMissing
        fun _allowInvoiceCreditOrVoid(): JsonField<Boolean> = allowInvoiceCreditOrVoid

        /**
         * Determines when the change takes effect. Note that if `effective_date` is specified, this
         * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's
         * explicitly set to `upcoming_invoice`.
         */
        @JsonProperty("change_option")
        @ExcludeMissing
        fun _changeOption(): JsonField<ChangeOption> = changeOption

        /**
         * The date that the quantity change should take effect, localized to the customer's
         * timezone. Ifthis parameter is not passed in, the quantity change is effective according
         * to `change_option`.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            priceId()
            quantity()
            allowInvoiceCreditOrVoid()
            changeOption()
            effectiveDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var priceId: JsonField<String>? = null
            private var quantity: JsonField<Double>? = null
            private var allowInvoiceCreditOrVoid: JsonField<Boolean> = JsonMissing.of()
            private var changeOption: JsonField<ChangeOption> = JsonMissing.of()
            private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                priceId = body.priceId
                quantity = body.quantity
                allowInvoiceCreditOrVoid = body.allowInvoiceCreditOrVoid
                changeOption = body.changeOption
                effectiveDate = body.effectiveDate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Price for which the quantity should be updated. Must be a fixed fee. */
            fun priceId(priceId: String) = priceId(JsonField.of(priceId))

            /** Price for which the quantity should be updated. Must be a fixed fee. */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /**
             * If false, this request will fail if it would void an issued invoice or create a
             * credit note. Consider using this as a safety mechanism if you do not expect existing
             * invoices to be changed.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean?) =
                allowInvoiceCreditOrVoid(JsonField.ofNullable(allowInvoiceCreditOrVoid))

            /**
             * If false, this request will fail if it would void an issued invoice or create a
             * credit note. Consider using this as a safety mechanism if you do not expect existing
             * invoices to be changed.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean) =
                allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid as Boolean?)

            /**
             * If false, this request will fail if it would void an issued invoice or create a
             * credit note. Consider using this as a safety mechanism if you do not expect existing
             * invoices to be changed.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: JsonField<Boolean>) = apply {
                this.allowInvoiceCreditOrVoid = allowInvoiceCreditOrVoid
            }

            /**
             * Determines when the change takes effect. Note that if `effective_date` is specified,
             * this defaults to `effective_date`. Otherwise, this defaults to `immediate` unless
             * it's explicitly set to `upcoming_invoice`.
             */
            fun changeOption(changeOption: ChangeOption) = changeOption(JsonField.of(changeOption))

            /**
             * Determines when the change takes effect. Note that if `effective_date` is specified,
             * this defaults to `effective_date`. Otherwise, this defaults to `immediate` unless
             * it's explicitly set to `upcoming_invoice`.
             */
            fun changeOption(changeOption: JsonField<ChangeOption>) = apply {
                this.changeOption = changeOption
            }

            /**
             * The date that the quantity change should take effect, localized to the customer's
             * timezone. Ifthis parameter is not passed in, the quantity change is effective
             * according to `change_option`.
             */
            fun effectiveDate(effectiveDate: LocalDate?) =
                effectiveDate(JsonField.ofNullable(effectiveDate))

            /**
             * The date that the quantity change should take effect, localized to the customer's
             * timezone. Ifthis parameter is not passed in, the quantity change is effective
             * according to `change_option`.
             */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
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

            fun build(): Body =
                Body(
                    checkRequired("priceId", priceId),
                    checkRequired("quantity", quantity),
                    allowInvoiceCreditOrVoid,
                    changeOption,
                    effectiveDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && priceId == other.priceId && quantity == other.quantity && allowInvoiceCreditOrVoid == other.allowInvoiceCreditOrVoid && changeOption == other.changeOption && effectiveDate == other.effectiveDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(priceId, quantity, allowInvoiceCreditOrVoid, changeOption, effectiveDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{priceId=$priceId, quantity=$quantity, allowInvoiceCreditOrVoid=$allowInvoiceCreditOrVoid, changeOption=$changeOption, effectiveDate=$effectiveDate, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [SubscriptionUpdateFixedFeeQuantityParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            subscriptionUpdateFixedFeeQuantityParams: SubscriptionUpdateFixedFeeQuantityParams
        ) = apply {
            subscriptionId = subscriptionUpdateFixedFeeQuantityParams.subscriptionId
            body = subscriptionUpdateFixedFeeQuantityParams.body.toBuilder()
            additionalHeaders =
                subscriptionUpdateFixedFeeQuantityParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                subscriptionUpdateFixedFeeQuantityParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /** Price for which the quantity should be updated. Must be a fixed fee. */
        fun priceId(priceId: String) = apply { body.priceId(priceId) }

        /** Price for which the quantity should be updated. Must be a fixed fee. */
        fun priceId(priceId: JsonField<String>) = apply { body.priceId(priceId) }

        fun quantity(quantity: Double) = apply { body.quantity(quantity) }

        fun quantity(quantity: JsonField<Double>) = apply { body.quantity(quantity) }

        /**
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean?) = apply {
            body.allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid)
        }

        /**
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean) =
            allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid as Boolean?)

        /**
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: JsonField<Boolean>) = apply {
            body.allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid)
        }

        /**
         * Determines when the change takes effect. Note that if `effective_date` is specified, this
         * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's
         * explicitly set to `upcoming_invoice`.
         */
        fun changeOption(changeOption: ChangeOption) = apply { body.changeOption(changeOption) }

        /**
         * Determines when the change takes effect. Note that if `effective_date` is specified, this
         * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's
         * explicitly set to `upcoming_invoice`.
         */
        fun changeOption(changeOption: JsonField<ChangeOption>) = apply {
            body.changeOption(changeOption)
        }

        /**
         * The date that the quantity change should take effect, localized to the customer's
         * timezone. Ifthis parameter is not passed in, the quantity change is effective according
         * to `change_option`.
         */
        fun effectiveDate(effectiveDate: LocalDate?) = apply { body.effectiveDate(effectiveDate) }

        /**
         * The date that the quantity change should take effect, localized to the customer's
         * timezone. Ifthis parameter is not passed in, the quantity change is effective according
         * to `change_option`.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            body.effectiveDate(effectiveDate)
        }

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

        fun build(): SubscriptionUpdateFixedFeeQuantityParams =
            SubscriptionUpdateFixedFeeQuantityParams(
                checkRequired("subscriptionId", subscriptionId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Determines when the change takes effect. Note that if `effective_date` is specified, this
     * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's explicitly
     * set to `upcoming_invoice`.
     */
    class ChangeOption @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val IMMEDIATE = of("immediate")

            val UPCOMING_INVOICE = of("upcoming_invoice")

            val EFFECTIVE_DATE = of("effective_date")

            fun of(value: String) = ChangeOption(JsonField.of(value))
        }

        /** An enum containing [ChangeOption]'s known values. */
        enum class Known {
            IMMEDIATE,
            UPCOMING_INVOICE,
            EFFECTIVE_DATE,
        }

        /**
         * An enum containing [ChangeOption]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ChangeOption] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IMMEDIATE,
            UPCOMING_INVOICE,
            EFFECTIVE_DATE,
            /**
             * An enum member indicating that [ChangeOption] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                IMMEDIATE -> Value.IMMEDIATE
                UPCOMING_INVOICE -> Value.UPCOMING_INVOICE
                EFFECTIVE_DATE -> Value.EFFECTIVE_DATE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                IMMEDIATE -> Known.IMMEDIATE
                UPCOMING_INVOICE -> Known.UPCOMING_INVOICE
                EFFECTIVE_DATE -> Known.EFFECTIVE_DATE
                else -> throw OrbInvalidDataException("Unknown ChangeOption: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

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

        return /* spotless:off */ other is SubscriptionUpdateFixedFeeQuantityParams && subscriptionId == other.subscriptionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionUpdateFixedFeeQuantityParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
