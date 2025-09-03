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
private constructor(
    private val defaultUnitAmount: JsonField<String>,
    private val dimensions: JsonField<List<String?>>,
    private val matrixValues: JsonField<List<MatrixValue>>,
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
    ) : this(defaultUnitAmount, dimensions, matrixValues, mutableMapOf())

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
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(matrixConfig: MatrixConfig) = apply {
            defaultUnitAmount = matrixConfig.defaultUnitAmount
            dimensions = matrixConfig.dimensions.map { it.toMutableList() }
            matrixValues = matrixConfig.matrixValues.map { it.toMutableList() }
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MatrixConfig = apply {
        if (validated) {
            return@apply
        }

        defaultUnitAmount()
        dimensions()
        matrixValues().forEach { it.validate() }
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
            (matrixValues.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MatrixConfig &&
            defaultUnitAmount == other.defaultUnitAmount &&
            dimensions == other.dimensions &&
            matrixValues == other.matrixValues &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(defaultUnitAmount, dimensions, matrixValues, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MatrixConfig{defaultUnitAmount=$defaultUnitAmount, dimensions=$dimensions, matrixValues=$matrixValues, additionalProperties=$additionalProperties}"
}
