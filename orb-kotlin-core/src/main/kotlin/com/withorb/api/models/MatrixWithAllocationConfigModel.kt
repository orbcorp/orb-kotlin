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
class MatrixWithAllocationConfigModel
@JsonCreator
private constructor(
    @JsonProperty("allocation")
    @ExcludeMissing
    private val allocation: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("default_unit_amount")
    @ExcludeMissing
    private val defaultUnitAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dimensions")
    @ExcludeMissing
    private val dimensions: JsonField<List<String?>> = JsonMissing.of(),
    @JsonProperty("matrix_values")
    @ExcludeMissing
    private val matrixValues: JsonField<List<MatrixValueModel>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Allocation to be used to calculate the price */
    fun allocation(): Double = allocation.getRequired("allocation")

    /** Default per unit rate for any usage not bucketed into a specified matrix_value */
    fun defaultUnitAmount(): String = defaultUnitAmount.getRequired("default_unit_amount")

    /** One or two event property values to evaluate matrix groups by */
    fun dimensions(): List<String?> = dimensions.getRequired("dimensions")

    /** Matrix values for specified matrix grouping keys */
    fun matrixValues(): List<MatrixValueModel> = matrixValues.getRequired("matrix_values")

    /** Allocation to be used to calculate the price */
    @JsonProperty("allocation") @ExcludeMissing fun _allocation(): JsonField<Double> = allocation

    /** Default per unit rate for any usage not bucketed into a specified matrix_value */
    @JsonProperty("default_unit_amount")
    @ExcludeMissing
    fun _defaultUnitAmount(): JsonField<String> = defaultUnitAmount

    /** One or two event property values to evaluate matrix groups by */
    @JsonProperty("dimensions")
    @ExcludeMissing
    fun _dimensions(): JsonField<List<String?>> = dimensions

    /** Matrix values for specified matrix grouping keys */
    @JsonProperty("matrix_values")
    @ExcludeMissing
    fun _matrixValues(): JsonField<List<MatrixValueModel>> = matrixValues

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): MatrixWithAllocationConfigModel = apply {
        if (validated) {
            return@apply
        }

        allocation()
        defaultUnitAmount()
        dimensions()
        matrixValues().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MatrixWithAllocationConfigModel].
         *
         * The following fields are required:
         * ```kotlin
         * .allocation()
         * .defaultUnitAmount()
         * .dimensions()
         * .matrixValues()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [MatrixWithAllocationConfigModel]. */
    class Builder internal constructor() {

        private var allocation: JsonField<Double>? = null
        private var defaultUnitAmount: JsonField<String>? = null
        private var dimensions: JsonField<MutableList<String?>>? = null
        private var matrixValues: JsonField<MutableList<MatrixValueModel>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(matrixWithAllocationConfigModel: MatrixWithAllocationConfigModel) =
            apply {
                allocation = matrixWithAllocationConfigModel.allocation
                defaultUnitAmount = matrixWithAllocationConfigModel.defaultUnitAmount
                dimensions = matrixWithAllocationConfigModel.dimensions.map { it.toMutableList() }
                matrixValues =
                    matrixWithAllocationConfigModel.matrixValues.map { it.toMutableList() }
                additionalProperties =
                    matrixWithAllocationConfigModel.additionalProperties.toMutableMap()
            }

        /** Allocation to be used to calculate the price */
        fun allocation(allocation: Double) = allocation(JsonField.of(allocation))

        /** Allocation to be used to calculate the price */
        fun allocation(allocation: JsonField<Double>) = apply { this.allocation = allocation }

        /** Default per unit rate for any usage not bucketed into a specified matrix_value */
        fun defaultUnitAmount(defaultUnitAmount: String) =
            defaultUnitAmount(JsonField.of(defaultUnitAmount))

        /** Default per unit rate for any usage not bucketed into a specified matrix_value */
        fun defaultUnitAmount(defaultUnitAmount: JsonField<String>) = apply {
            this.defaultUnitAmount = defaultUnitAmount
        }

        /** One or two event property values to evaluate matrix groups by */
        fun dimensions(dimensions: List<String?>) = dimensions(JsonField.of(dimensions))

        /** One or two event property values to evaluate matrix groups by */
        fun dimensions(dimensions: JsonField<List<String?>>) = apply {
            this.dimensions = dimensions.map { it.toMutableList() }
        }

        /** One or two event property values to evaluate matrix groups by */
        fun addDimension(dimension: String) = apply {
            dimensions =
                (dimensions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dimensions", it).add(dimension)
                }
        }

        /** Matrix values for specified matrix grouping keys */
        fun matrixValues(matrixValues: List<MatrixValueModel>) =
            matrixValues(JsonField.of(matrixValues))

        /** Matrix values for specified matrix grouping keys */
        fun matrixValues(matrixValues: JsonField<List<MatrixValueModel>>) = apply {
            this.matrixValues = matrixValues.map { it.toMutableList() }
        }

        /** Matrix values for specified matrix grouping keys */
        fun addMatrixValue(matrixValue: MatrixValueModel) = apply {
            matrixValues =
                (matrixValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("matrixValues", it).add(matrixValue)
                }
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

        fun build(): MatrixWithAllocationConfigModel =
            MatrixWithAllocationConfigModel(
                checkRequired("allocation", allocation),
                checkRequired("defaultUnitAmount", defaultUnitAmount),
                checkRequired("dimensions", dimensions).map { it.toImmutable() },
                checkRequired("matrixValues", matrixValues).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MatrixWithAllocationConfigModel && allocation == other.allocation && defaultUnitAmount == other.defaultUnitAmount && dimensions == other.dimensions && matrixValues == other.matrixValues && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(allocation, defaultUnitAmount, dimensions, matrixValues, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MatrixWithAllocationConfigModel{allocation=$allocation, defaultUnitAmount=$defaultUnitAmount, dimensions=$dimensions, matrixValues=$matrixValues, additionalProperties=$additionalProperties}"
}
