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
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class TaxAmountModel
@JsonCreator
private constructor(
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tax_rate_description")
    @ExcludeMissing
    private val taxRateDescription: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tax_rate_percentage")
    @ExcludeMissing
    private val taxRatePercentage: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The amount of additional tax incurred by this tax rate. */
    fun amount(): String = amount.getRequired("amount")

    /** The human-readable description of the applied tax rate. */
    fun taxRateDescription(): String = taxRateDescription.getRequired("tax_rate_description")

    /** The tax rate percentage, out of 100. */
    fun taxRatePercentage(): String? = taxRatePercentage.getNullable("tax_rate_percentage")

    /** The amount of additional tax incurred by this tax rate. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /** The human-readable description of the applied tax rate. */
    @JsonProperty("tax_rate_description")
    @ExcludeMissing
    fun _taxRateDescription(): JsonField<String> = taxRateDescription

    /** The tax rate percentage, out of 100. */
    @JsonProperty("tax_rate_percentage")
    @ExcludeMissing
    fun _taxRatePercentage(): JsonField<String> = taxRatePercentage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TaxAmountModel = apply {
        if (validated) {
            return@apply
        }

        amount()
        taxRateDescription()
        taxRatePercentage()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TaxAmountModel].
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

    /** A builder for [TaxAmountModel]. */
    class Builder internal constructor() {

        private var amount: JsonField<String>? = null
        private var taxRateDescription: JsonField<String>? = null
        private var taxRatePercentage: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(taxAmountModel: TaxAmountModel) = apply {
            amount = taxAmountModel.amount
            taxRateDescription = taxAmountModel.taxRateDescription
            taxRatePercentage = taxAmountModel.taxRatePercentage
            additionalProperties = taxAmountModel.additionalProperties.toMutableMap()
        }

        /** The amount of additional tax incurred by this tax rate. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /** The amount of additional tax incurred by this tax rate. */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /** The human-readable description of the applied tax rate. */
        fun taxRateDescription(taxRateDescription: String) =
            taxRateDescription(JsonField.of(taxRateDescription))

        /** The human-readable description of the applied tax rate. */
        fun taxRateDescription(taxRateDescription: JsonField<String>) = apply {
            this.taxRateDescription = taxRateDescription
        }

        /** The tax rate percentage, out of 100. */
        fun taxRatePercentage(taxRatePercentage: String?) =
            taxRatePercentage(JsonField.ofNullable(taxRatePercentage))

        /** The tax rate percentage, out of 100. */
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

        fun build(): TaxAmountModel =
            TaxAmountModel(
                checkRequired("amount", amount),
                checkRequired("taxRateDescription", taxRateDescription),
                checkRequired("taxRatePercentage", taxRatePercentage),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TaxAmountModel && amount == other.amount && taxRateDescription == other.taxRateDescription && taxRatePercentage == other.taxRatePercentage && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, taxRateDescription, taxRatePercentage, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TaxAmountModel{amount=$amount, taxRateDescription=$taxRateDescription, taxRatePercentage=$taxRatePercentage, additionalProperties=$additionalProperties}"
}
