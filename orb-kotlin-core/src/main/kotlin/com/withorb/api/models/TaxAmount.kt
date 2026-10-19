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
import com.withorb.api.core.checkRequired
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class TaxAmount
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<String>,
    private val taxRateDescription: JsonField<String>,
    private val taxRatePercentage: JsonField<String>,
    private val taxReason: JsonField<TaxReason>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_rate_description")
        @ExcludeMissing
        taxRateDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_rate_percentage")
        @ExcludeMissing
        taxRatePercentage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_reason")
        @ExcludeMissing
        taxReason: JsonField<TaxReason> = JsonMissing.of(),
    ) : this(amount, taxRateDescription, taxRatePercentage, taxReason, mutableMapOf())

    /**
     * The amount of additional tax incurred by this tax rate.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): String = amount.getRequired("amount")

    /**
     * The human-readable description of the applied tax rate.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taxRateDescription(): String = taxRateDescription.getRequired("tax_rate_description")

    /**
     * The tax rate percentage, out of 100.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun taxRatePercentage(): String? = taxRatePercentage.getNullable("tax_rate_percentage")

    /**
     * Why this tax was or was not charged, such as reverse_charge or customer_exempt. Null on tax
     * calculated before reasons were recorded.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun taxReason(): TaxReason? = taxReason.getNullable("tax_reason")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /**
     * Returns the raw JSON value of [taxRateDescription].
     *
     * Unlike [taxRateDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tax_rate_description")
    @ExcludeMissing
    fun _taxRateDescription(): JsonField<String> = taxRateDescription

    /**
     * Returns the raw JSON value of [taxRatePercentage].
     *
     * Unlike [taxRatePercentage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tax_rate_percentage")
    @ExcludeMissing
    fun _taxRatePercentage(): JsonField<String> = taxRatePercentage

    /**
     * Returns the raw JSON value of [taxReason].
     *
     * Unlike [taxReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_reason") @ExcludeMissing fun _taxReason(): JsonField<TaxReason> = taxReason

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TaxAmount].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .taxRateDescription()
         * .taxRatePercentage()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TaxAmount]. */
    class Builder internal constructor() {

        private var amount: JsonField<String>? = null
        private var taxRateDescription: JsonField<String>? = null
        private var taxRatePercentage: JsonField<String>? = null
        private var taxReason: JsonField<TaxReason> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(taxAmount: TaxAmount) = apply {
            amount = taxAmount.amount
            taxRateDescription = taxAmount.taxRateDescription
            taxRatePercentage = taxAmount.taxRatePercentage
            taxReason = taxAmount.taxReason
            additionalProperties = taxAmount.additionalProperties.toMutableMap()
        }

        /** The amount of additional tax incurred by this tax rate. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /** The human-readable description of the applied tax rate. */
        fun taxRateDescription(taxRateDescription: String) =
            taxRateDescription(JsonField.of(taxRateDescription))

        /**
         * Sets [Builder.taxRateDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxRateDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxRateDescription(taxRateDescription: JsonField<String>) = apply {
            this.taxRateDescription = taxRateDescription
        }

        /** The tax rate percentage, out of 100. */
        fun taxRatePercentage(taxRatePercentage: String?) =
            taxRatePercentage(JsonField.ofNullable(taxRatePercentage))

        /**
         * Sets [Builder.taxRatePercentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxRatePercentage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxRatePercentage(taxRatePercentage: JsonField<String>) = apply {
            this.taxRatePercentage = taxRatePercentage
        }

        /**
         * Why this tax was or was not charged, such as reverse_charge or customer_exempt. Null on
         * tax calculated before reasons were recorded.
         */
        fun taxReason(taxReason: TaxReason?) = taxReason(JsonField.ofNullable(taxReason))

        /**
         * Sets [Builder.taxReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxReason] with a well-typed [TaxReason] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxReason(taxReason: JsonField<TaxReason>) = apply { this.taxReason = taxReason }

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

        /**
         * Returns an immutable instance of [TaxAmount].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .taxRateDescription()
         * .taxRatePercentage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TaxAmount =
            TaxAmount(
                checkRequired("amount", amount),
                checkRequired("taxRateDescription", taxRateDescription),
                checkRequired("taxRatePercentage", taxRatePercentage),
                taxReason,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws OrbInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): TaxAmount = apply {
        if (validated) {
            return@apply
        }

        amount()
        taxRateDescription()
        taxRatePercentage()
        taxReason()?.validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OrbInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (amount.asKnown() == null) 0 else 1) +
            (if (taxRateDescription.asKnown() == null) 0 else 1) +
            (if (taxRatePercentage.asKnown() == null) 0 else 1) +
            (taxReason.asKnown()?.validity() ?: 0)

    /**
     * Why this tax was or was not charged, such as reverse_charge or customer_exempt. Null on tax
     * calculated before reasons were recorded.
     */
    class TaxReason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val TAXED = of("taxed")

            val REVERSE_CHARGE = of("reverse_charge")

            val CUSTOMER_EXEMPT = of("customer_exempt")

            val PRODUCT_EXEMPT = of("product_exempt")

            val NOT_REGISTERED = of("not_registered")

            val ZERO_RATED = of("zero_rated")

            val NOT_TAXED_OTHER = of("not_taxed_other")

            fun of(value: String) = TaxReason(JsonField.of(value))
        }

        /** An enum containing [TaxReason]'s known values. */
        enum class Known {
            TAXED,
            REVERSE_CHARGE,
            CUSTOMER_EXEMPT,
            PRODUCT_EXEMPT,
            NOT_REGISTERED,
            ZERO_RATED,
            NOT_TAXED_OTHER,
        }

        /**
         * An enum containing [TaxReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TaxReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TAXED,
            REVERSE_CHARGE,
            CUSTOMER_EXEMPT,
            PRODUCT_EXEMPT,
            NOT_REGISTERED,
            ZERO_RATED,
            NOT_TAXED_OTHER,
            /**
             * An enum member indicating that [TaxReason] was instantiated with an unknown value.
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
                TAXED -> Value.TAXED
                REVERSE_CHARGE -> Value.REVERSE_CHARGE
                CUSTOMER_EXEMPT -> Value.CUSTOMER_EXEMPT
                PRODUCT_EXEMPT -> Value.PRODUCT_EXEMPT
                NOT_REGISTERED -> Value.NOT_REGISTERED
                ZERO_RATED -> Value.ZERO_RATED
                NOT_TAXED_OTHER -> Value.NOT_TAXED_OTHER
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
                TAXED -> Known.TAXED
                REVERSE_CHARGE -> Known.REVERSE_CHARGE
                CUSTOMER_EXEMPT -> Known.CUSTOMER_EXEMPT
                PRODUCT_EXEMPT -> Known.PRODUCT_EXEMPT
                NOT_REGISTERED -> Known.NOT_REGISTERED
                ZERO_RATED -> Known.ZERO_RATED
                NOT_TAXED_OTHER -> Known.NOT_TAXED_OTHER
                else -> throw OrbInvalidDataException("Unknown TaxReason: $value")
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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OrbInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TaxReason = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TaxReason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TaxAmount &&
            amount == other.amount &&
            taxRateDescription == other.taxRateDescription &&
            taxRatePercentage == other.taxRatePercentage &&
            taxReason == other.taxReason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(amount, taxRateDescription, taxRatePercentage, taxReason, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TaxAmount{amount=$amount, taxRateDescription=$taxRateDescription, taxRatePercentage=$taxRatePercentage, taxReason=$taxReason, additionalProperties=$additionalProperties}"
}
