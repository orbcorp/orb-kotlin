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

/** Configuration for matrix pricing */
class MatrixConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val defaultUnitAmount: JsonField<String>,
    private val dimensions: JsonField<List<String?>>,
    private val matrixValues: JsonField<List<MatrixValue>>,
    private val scalingFactor: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("default_unit_amount")
        @ExcludeMissing
        defaultUnitAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dimensions")
        @ExcludeMissing
        dimensions: JsonField<List<String?>> = JsonMissing.of(),
        @JsonProperty("matrix_values")
        @ExcludeMissing
        matrixValues: JsonField<List<MatrixValue>> = JsonMissing.of(),
        @JsonProperty("scaling_factor")
        @ExcludeMissing
        scalingFactor: JsonField<Double> = JsonMissing.of(),
    ) : this(defaultUnitAmount, dimensions, matrixValues, scalingFactor, mutableMapOf())

    /**
     * Default per unit rate for any usage not bucketed into a specified matrix_value
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultUnitAmount(): String = defaultUnitAmount.getRequired("default_unit_amount")

    /**
     * One or two event property values to evaluate matrix groups by
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dimensions(): List<String?> = dimensions.getRequired("dimensions")

    /**
     * Matrix values configuration
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun matrixValues(): List<MatrixValue> = matrixValues.getRequired("matrix_values")

    /**
     * Optional multiplier applied to default-bucket quantity before default_unit_amount.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun scalingFactor(): Double? = scalingFactor.getNullable("scaling_factor")

    /**
     * Returns the raw JSON value of [defaultUnitAmount].
     *
     * Unlike [defaultUnitAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_unit_amount")
    @ExcludeMissing
    fun _defaultUnitAmount(): JsonField<String> = defaultUnitAmount

    /**
     * Returns the raw JSON value of [dimensions].
     *
     * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dimensions")
    @ExcludeMissing
    fun _dimensions(): JsonField<List<String?>> = dimensions

    /**
     * Returns the raw JSON value of [matrixValues].
     *
     * Unlike [matrixValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("matrix_values")
    @ExcludeMissing
    fun _matrixValues(): JsonField<List<MatrixValue>> = matrixValues

    /**
     * Returns the raw JSON value of [scalingFactor].
     *
     * Unlike [scalingFactor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("scaling_factor")
    @ExcludeMissing
    fun _scalingFactor(): JsonField<Double> = scalingFactor

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
         * Returns a mutable builder for constructing an instance of [MatrixConfig].
         *
         * The following fields are required:
         * ```kotlin
         * .defaultUnitAmount()
         * .dimensions()
         * .matrixValues()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [MatrixConfig]. */
    class Builder internal constructor() {

        private var defaultUnitAmount: JsonField<String>? = null
        private var dimensions: JsonField<MutableList<String?>>? = null
        private var matrixValues: JsonField<MutableList<MatrixValue>>? = null
        private var scalingFactor: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(matrixConfig: MatrixConfig) = apply {
            defaultUnitAmount = matrixConfig.defaultUnitAmount
            dimensions = matrixConfig.dimensions.map { it.toMutableList() }
            matrixValues = matrixConfig.matrixValues.map { it.toMutableList() }
            scalingFactor = matrixConfig.scalingFactor
            additionalProperties = matrixConfig.additionalProperties.toMutableMap()
        }

        /** Default per unit rate for any usage not bucketed into a specified matrix_value */
        fun defaultUnitAmount(defaultUnitAmount: String) =
            defaultUnitAmount(JsonField.of(defaultUnitAmount))

        /**
         * Sets [Builder.defaultUnitAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultUnitAmount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultUnitAmount(defaultUnitAmount: JsonField<String>) = apply {
            this.defaultUnitAmount = defaultUnitAmount
        }

        /** One or two event property values to evaluate matrix groups by */
        fun dimensions(dimensions: List<String?>) = dimensions(JsonField.of(dimensions))

        /**
         * Sets [Builder.dimensions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dimensions] with a well-typed `List<String?>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dimensions(dimensions: JsonField<List<String?>>) = apply {
            this.dimensions = dimensions.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [dimensions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDimension(dimension: String) = apply {
            dimensions =
                (dimensions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dimensions", it).add(dimension)
                }
        }

        /** Matrix values configuration */
        fun matrixValues(matrixValues: List<MatrixValue>) = matrixValues(JsonField.of(matrixValues))

        /**
         * Sets [Builder.matrixValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matrixValues] with a well-typed `List<MatrixValue>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun matrixValues(matrixValues: JsonField<List<MatrixValue>>) = apply {
            this.matrixValues = matrixValues.map { it.toMutableList() }
        }

        /**
         * Adds a single [MatrixValue] to [matrixValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMatrixValue(matrixValue: MatrixValue) = apply {
            matrixValues =
                (matrixValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("matrixValues", it).add(matrixValue)
                }
        }

        /** Optional multiplier applied to default-bucket quantity before default_unit_amount. */
        @Deprecated("deprecated")
        fun scalingFactor(scalingFactor: Double?) =
            scalingFactor(JsonField.ofNullable(scalingFactor))

        /**
         * Alias for [Builder.scalingFactor].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        @Deprecated("deprecated")
        fun scalingFactor(scalingFactor: Double) = scalingFactor(scalingFactor as Double?)

        /**
         * Sets [Builder.scalingFactor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scalingFactor] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun scalingFactor(scalingFactor: JsonField<Double>) = apply {
            this.scalingFactor = scalingFactor
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
         * Returns an immutable instance of [MatrixConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .defaultUnitAmount()
         * .dimensions()
         * .matrixValues()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MatrixConfig =
            MatrixConfig(
                checkRequired("defaultUnitAmount", defaultUnitAmount),
                checkRequired("dimensions", dimensions).map { it.toImmutable() },
                checkRequired("matrixValues", matrixValues).map { it.toImmutable() },
                scalingFactor,
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
    fun validate(): MatrixConfig = apply {
        if (validated) {
            return@apply
        }

        defaultUnitAmount()
        dimensions()
        matrixValues().forEach { it.validate() }
        scalingFactor()
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
        (if (defaultUnitAmount.asKnown() == null) 0 else 1) +
            (dimensions.asKnown()?.sumOf { (if (it == null) 0 else 1).toInt() } ?: 0) +
            (matrixValues.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (scalingFactor.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MatrixConfig &&
            defaultUnitAmount == other.defaultUnitAmount &&
            dimensions == other.dimensions &&
            matrixValues == other.matrixValues &&
            scalingFactor == other.scalingFactor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            defaultUnitAmount,
            dimensions,
            matrixValues,
            scalingFactor,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MatrixConfig{defaultUnitAmount=$defaultUnitAmount, dimensions=$dimensions, matrixValues=$matrixValues, scalingFactor=$scalingFactor, additionalProperties=$additionalProperties}"
}
