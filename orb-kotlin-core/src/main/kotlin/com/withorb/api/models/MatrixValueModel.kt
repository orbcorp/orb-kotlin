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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class MatrixValueModel
@JsonCreator
private constructor(
    @JsonProperty("dimension_values")
    @ExcludeMissing
    private val dimensionValues: JsonField<List<String?>> = JsonMissing.of(),
    @JsonProperty("unit_amount")
    @ExcludeMissing
    private val unitAmount: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * One or two matrix keys to filter usage to this Matrix value by. For example,
     * ["region", "tier"] could be used to filter cloud usage by a cloud region and an instance
     * tier.
     */
    fun dimensionValues(): List<String?> = dimensionValues.getRequired("dimension_values")

    /** Unit price for the specified dimension_values */
    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

    /**
     * One or two matrix keys to filter usage to this Matrix value by. For example,
     * ["region", "tier"] could be used to filter cloud usage by a cloud region and an instance
     * tier.
     */
    @JsonProperty("dimension_values")
    @ExcludeMissing
    fun _dimensionValues(): JsonField<List<String?>> = dimensionValues

    /** Unit price for the specified dimension_values */
    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount(): JsonField<String> = unitAmount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): MatrixValueModel = apply {
        if (validated) {
            return@apply
        }

        dimensionValues()
        unitAmount()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MatrixValueModel].
         *
         * The following fields are required:
         * ```kotlin
         * .dimensionValues()
         * .unitAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [MatrixValueModel]. */
    class Builder internal constructor() {

        private var dimensionValues: JsonField<MutableList<String?>>? = null
        private var unitAmount: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(matrixValueModel: MatrixValueModel) = apply {
            dimensionValues = matrixValueModel.dimensionValues.map { it.toMutableList() }
            unitAmount = matrixValueModel.unitAmount
            additionalProperties = matrixValueModel.additionalProperties.toMutableMap()
        }

        /**
         * One or two matrix keys to filter usage to this Matrix value by. For example,
         * ["region", "tier"] could be used to filter cloud usage by a cloud region and an instance
         * tier.
         */
        fun dimensionValues(dimensionValues: List<String?>) =
            dimensionValues(JsonField.of(dimensionValues))

        /**
         * One or two matrix keys to filter usage to this Matrix value by. For example,
         * ["region", "tier"] could be used to filter cloud usage by a cloud region and an instance
         * tier.
         */
        fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
            this.dimensionValues = dimensionValues.map { it.toMutableList() }
        }

        /**
         * One or two matrix keys to filter usage to this Matrix value by. For example,
         * ["region", "tier"] could be used to filter cloud usage by a cloud region and an instance
         * tier.
         */
        fun addDimensionValue(dimensionValue: String) = apply {
            dimensionValues =
                (dimensionValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dimensionValues", it).add(dimensionValue)
                }
        }

        /** Unit price for the specified dimension_values */
        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

        /** Unit price for the specified dimension_values */
        fun unitAmount(unitAmount: JsonField<String>) = apply { this.unitAmount = unitAmount }

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

        fun build(): MatrixValueModel =
            MatrixValueModel(
                checkRequired("dimensionValues", dimensionValues).map { it.toImmutable() },
                checkRequired("unitAmount", unitAmount),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MatrixValueModel && dimensionValues == other.dimensionValues && unitAmount == other.unitAmount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(dimensionValues, unitAmount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MatrixValueModel{dimensionValues=$dimensionValues, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
}
