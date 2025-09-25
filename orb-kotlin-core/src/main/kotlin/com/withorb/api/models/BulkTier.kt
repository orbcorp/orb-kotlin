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

/** Configuration for a single bulk pricing tier */
class BulkTier
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val unitAmount: JsonField<String>,
    private val maximumUnits: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("unit_amount")
        @ExcludeMissing
        unitAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maximum_units")
        @ExcludeMissing
        maximumUnits: JsonField<Double> = JsonMissing.of(),
    ) : this(unitAmount, maximumUnits, mutableMapOf())

    /**
     * Amount per unit
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

    /**
     * Upper bound for this tier
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun maximumUnits(): Double? = maximumUnits.getNullable("maximum_units")

    /**
     * Returns the raw JSON value of [unitAmount].
     *
     * Unlike [unitAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount(): JsonField<String> = unitAmount

    /**
     * Returns the raw JSON value of [maximumUnits].
     *
     * Unlike [maximumUnits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maximum_units")
    @ExcludeMissing
    fun _maximumUnits(): JsonField<Double> = maximumUnits

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
         * Returns a mutable builder for constructing an instance of [BulkTier].
         *
         * The following fields are required:
         * ```kotlin
         * .unitAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BulkTier]. */
    class Builder internal constructor() {

        private var unitAmount: JsonField<String>? = null
        private var maximumUnits: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(bulkTier: BulkTier) = apply {
            unitAmount = bulkTier.unitAmount
            maximumUnits = bulkTier.maximumUnits
            additionalProperties = bulkTier.additionalProperties.toMutableMap()
        }

        /** Amount per unit */
        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

        /**
         * Sets [Builder.unitAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unitAmount(unitAmount: JsonField<String>) = apply { this.unitAmount = unitAmount }

        /** Upper bound for this tier */
        fun maximumUnits(maximumUnits: Double?) = maximumUnits(JsonField.ofNullable(maximumUnits))

        /**
         * Alias for [Builder.maximumUnits].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maximumUnits(maximumUnits: Double) = maximumUnits(maximumUnits as Double?)

        /**
         * Sets [Builder.maximumUnits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumUnits] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maximumUnits(maximumUnits: JsonField<Double>) = apply {
            this.maximumUnits = maximumUnits
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
         * Returns an immutable instance of [BulkTier].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .unitAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BulkTier =
            BulkTier(
                checkRequired("unitAmount", unitAmount),
                maximumUnits,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BulkTier = apply {
        if (validated) {
            return@apply
        }

        unitAmount()
        maximumUnits()
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
        (if (unitAmount.asKnown() == null) 0 else 1) +
            (if (maximumUnits.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BulkTier &&
            unitAmount == other.unitAmount &&
            maximumUnits == other.maximumUnits &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(unitAmount, maximumUnits, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkTier{unitAmount=$unitAmount, maximumUnits=$maximumUnits, additionalProperties=$additionalProperties}"
}
