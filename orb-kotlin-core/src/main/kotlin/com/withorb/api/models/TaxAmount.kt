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
import com.withorb.api.core.checkRequired
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class TaxAmount
private constructor(
    private val amount: JsonField<String>,
    private val taxRateDescription: JsonField<String>,
    private val taxRatePercentage: JsonField<String>,
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
    ) : this(amount, taxRateDescription, taxRatePercentage, mutableMapOf())

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
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(taxAmount: TaxAmount) = apply {
            amount = taxAmount.amount
            taxRateDescription = taxAmount.taxRateDescription
            taxRatePercentage = taxAmount.taxRatePercentage
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TaxAmount = apply {
        if (validated) {
            return@apply
        }

        amount()
        taxRateDescription()
        taxRatePercentage()
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
            (if (taxRatePercentage.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TaxAmount &&
            amount == other.amount &&
            taxRateDescription == other.taxRateDescription &&
            taxRatePercentage == other.taxRatePercentage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(amount, taxRateDescription, taxRatePercentage, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TaxAmount{amount=$amount, taxRateDescription=$taxRateDescription, taxRatePercentage=$taxRatePercentage, additionalProperties=$additionalProperties}"
}
