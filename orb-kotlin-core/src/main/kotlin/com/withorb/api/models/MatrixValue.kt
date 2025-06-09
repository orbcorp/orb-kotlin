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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class MatrixValue
private constructor(
    private val dimensionValues: JsonField<List<String?>>,
    private val unitAmount: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dimension_values")
        @ExcludeMissing
        dimensionValues: JsonField<List<String?>> = JsonMissing.of(),
        @JsonProperty("unit_amount")
        @ExcludeMissing
        unitAmount: JsonField<String> = JsonMissing.of(),
    ) : this(dimensionValues, unitAmount, mutableMapOf())

    /**
     * One or two matrix keys to filter usage to this Matrix value by. For example,
     * ["region", "tier"] could be used to filter cloud usage by a cloud region and an instance
     * tier.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dimensionValues(): List<String?> = dimensionValues.getRequired("dimension_values")

    /**
     * Unit price for the specified dimension_values
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

    /**
     * Returns the raw JSON value of [dimensionValues].
     *
     * Unlike [dimensionValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dimension_values")
    @ExcludeMissing
    fun _dimensionValues(): JsonField<List<String?>> = dimensionValues

    /**
     * Returns the raw JSON value of [unitAmount].
     *
     * Unlike [unitAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount(): JsonField<String> = unitAmount

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
         * Returns a mutable builder for constructing an instance of [MatrixValue].
         *
         * The following fields are required:
         * ```kotlin
         * .dimensionValues()
         * .unitAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [MatrixValue]. */
    class Builder internal constructor() {

        private var dimensionValues: JsonField<MutableList<String?>>? = null
        private var unitAmount: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(matrixValue: MatrixValue) = apply {
            dimensionValues = matrixValue.dimensionValues.map { it.toMutableList() }
            unitAmount = matrixValue.unitAmount
            additionalProperties = matrixValue.additionalProperties.toMutableMap()
        }

        /**
         * One or two matrix keys to filter usage to this Matrix value by. For example,
         * ["region", "tier"] could be used to filter cloud usage by a cloud region and an instance
         * tier.
         */
        fun dimensionValues(dimensionValues: List<String?>) =
            dimensionValues(JsonField.of(dimensionValues))

        /**
         * Sets [Builder.dimensionValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dimensionValues] with a well-typed `List<String?>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
            this.dimensionValues = dimensionValues.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [dimensionValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDimensionValue(dimensionValue: String) = apply {
            dimensionValues =
                (dimensionValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dimensionValues", it).add(dimensionValue)
                }
        }

        /** Unit price for the specified dimension_values */
        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

        /**
         * Sets [Builder.unitAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [MatrixValue].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .dimensionValues()
         * .unitAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MatrixValue =
            MatrixValue(
                checkRequired("dimensionValues", dimensionValues).map { it.toImmutable() },
                checkRequired("unitAmount", unitAmount),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MatrixValue = apply {
        if (validated) {
            return@apply
        }

        dimensionValues()
        unitAmount()
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
        (dimensionValues.asKnown()?.sumOf { (if (it == null) 0 else 1).toInt() } ?: 0) +
            (if (unitAmount.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MatrixValue && dimensionValues == other.dimensionValues && unitAmount == other.unitAmount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(dimensionValues, unitAmount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MatrixValue{dimensionValues=$dimensionValues, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
}
