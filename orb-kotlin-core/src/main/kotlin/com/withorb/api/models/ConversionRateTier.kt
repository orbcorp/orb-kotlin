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

class ConversionRateTier
private constructor(
    private val firstUnit: JsonField<Double>,
    private val unitAmount: JsonField<String>,
    private val lastUnit: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("first_unit") @ExcludeMissing firstUnit: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("unit_amount")
        @ExcludeMissing
        unitAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_unit") @ExcludeMissing lastUnit: JsonField<Double> = JsonMissing.of(),
    ) : this(firstUnit, unitAmount, lastUnit, mutableMapOf())

    /**
     * Exclusive tier starting value
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstUnit(): Double = firstUnit.getRequired("first_unit")

    /**
     * Amount per unit of overage
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

    /**
     * Inclusive tier ending value. If null, this is treated as the last tier
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun lastUnit(): Double? = lastUnit.getNullable("last_unit")

    /**
     * Returns the raw JSON value of [firstUnit].
     *
     * Unlike [firstUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_unit") @ExcludeMissing fun _firstUnit(): JsonField<Double> = firstUnit

    /**
     * Returns the raw JSON value of [unitAmount].
     *
     * Unlike [unitAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount(): JsonField<String> = unitAmount

    /**
     * Returns the raw JSON value of [lastUnit].
     *
     * Unlike [lastUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_unit") @ExcludeMissing fun _lastUnit(): JsonField<Double> = lastUnit

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
         * Returns a mutable builder for constructing an instance of [ConversionRateTier].
         *
         * The following fields are required:
         * ```kotlin
         * .firstUnit()
         * .unitAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ConversionRateTier]. */
    class Builder internal constructor() {

        private var firstUnit: JsonField<Double>? = null
        private var unitAmount: JsonField<String>? = null
        private var lastUnit: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(conversionRateTier: ConversionRateTier) = apply {
            firstUnit = conversionRateTier.firstUnit
            unitAmount = conversionRateTier.unitAmount
            lastUnit = conversionRateTier.lastUnit
            additionalProperties = conversionRateTier.additionalProperties.toMutableMap()
        }

        /** Exclusive tier starting value */
        fun firstUnit(firstUnit: Double) = firstUnit(JsonField.of(firstUnit))

        /**
         * Sets [Builder.firstUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstUnit] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstUnit(firstUnit: JsonField<Double>) = apply { this.firstUnit = firstUnit }

        /** Amount per unit of overage */
        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

        /**
         * Sets [Builder.unitAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unitAmount(unitAmount: JsonField<String>) = apply { this.unitAmount = unitAmount }

        /** Inclusive tier ending value. If null, this is treated as the last tier */
        fun lastUnit(lastUnit: Double?) = lastUnit(JsonField.ofNullable(lastUnit))

        /**
         * Alias for [Builder.lastUnit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun lastUnit(lastUnit: Double) = lastUnit(lastUnit as Double?)

        /**
         * Sets [Builder.lastUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastUnit] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastUnit(lastUnit: JsonField<Double>) = apply { this.lastUnit = lastUnit }

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
         * Returns an immutable instance of [ConversionRateTier].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .firstUnit()
         * .unitAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConversionRateTier =
            ConversionRateTier(
                checkRequired("firstUnit", firstUnit),
                checkRequired("unitAmount", unitAmount),
                lastUnit,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConversionRateTier = apply {
        if (validated) {
            return@apply
        }

        firstUnit()
        unitAmount()
        lastUnit()
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
        (if (firstUnit.asKnown() == null) 0 else 1) +
            (if (unitAmount.asKnown() == null) 0 else 1) +
            (if (lastUnit.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConversionRateTier && firstUnit == other.firstUnit && unitAmount == other.unitAmount && lastUnit == other.lastUnit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(firstUnit, unitAmount, lastUnit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConversionRateTier{firstUnit=$firstUnit, unitAmount=$unitAmount, lastUnit=$lastUnit, additionalProperties=$additionalProperties}"
}
