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

class BulkBpsTier
private constructor(
    private val bps: JsonField<Double>,
    private val maximumAmount: JsonField<String>,
    private val perUnitMaximum: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bps") @ExcludeMissing bps: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("per_unit_maximum")
        @ExcludeMissing
        perUnitMaximum: JsonField<String> = JsonMissing.of(),
    ) : this(bps, maximumAmount, perUnitMaximum, mutableMapOf())

    /**
     * Basis points to rate on
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bps(): Double = bps.getRequired("bps")

    /**
     * Upper bound for tier
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

    /**
     * The maximum amount to charge for any one event
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun perUnitMaximum(): String? = perUnitMaximum.getNullable("per_unit_maximum")

    /**
     * Returns the raw JSON value of [bps].
     *
     * Unlike [bps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bps") @ExcludeMissing fun _bps(): JsonField<Double> = bps

    /**
     * Returns the raw JSON value of [maximumAmount].
     *
     * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    fun _maximumAmount(): JsonField<String> = maximumAmount

    /**
     * Returns the raw JSON value of [perUnitMaximum].
     *
     * Unlike [perUnitMaximum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("per_unit_maximum")
    @ExcludeMissing
    fun _perUnitMaximum(): JsonField<String> = perUnitMaximum

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
         * Returns a mutable builder for constructing an instance of [BulkBpsTier].
         *
         * The following fields are required:
         * ```kotlin
         * .bps()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BulkBpsTier]. */
    class Builder internal constructor() {

        private var bps: JsonField<Double>? = null
        private var maximumAmount: JsonField<String> = JsonMissing.of()
        private var perUnitMaximum: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(bulkBpsTier: BulkBpsTier) = apply {
            bps = bulkBpsTier.bps
            maximumAmount = bulkBpsTier.maximumAmount
            perUnitMaximum = bulkBpsTier.perUnitMaximum
            additionalProperties = bulkBpsTier.additionalProperties.toMutableMap()
        }

        /** Basis points to rate on */
        fun bps(bps: Double) = bps(JsonField.of(bps))

        /**
         * Sets [Builder.bps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bps] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

        /** Upper bound for tier */
        fun maximumAmount(maximumAmount: String?) =
            maximumAmount(JsonField.ofNullable(maximumAmount))

        /**
         * Sets [Builder.maximumAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
        }

        /** The maximum amount to charge for any one event */
        fun perUnitMaximum(perUnitMaximum: String?) =
            perUnitMaximum(JsonField.ofNullable(perUnitMaximum))

        /**
         * Sets [Builder.perUnitMaximum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perUnitMaximum] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
            this.perUnitMaximum = perUnitMaximum
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
         * Returns an immutable instance of [BulkBpsTier].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .bps()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BulkBpsTier =
            BulkBpsTier(
                checkRequired("bps", bps),
                maximumAmount,
                perUnitMaximum,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BulkBpsTier = apply {
        if (validated) {
            return@apply
        }

        bps()
        maximumAmount()
        perUnitMaximum()
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
        (if (bps.asKnown() == null) 0 else 1) +
            (if (maximumAmount.asKnown() == null) 0 else 1) +
            (if (perUnitMaximum.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkBpsTier && bps == other.bps && maximumAmount == other.maximumAmount && perUnitMaximum == other.perUnitMaximum && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(bps, maximumAmount, perUnitMaximum, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkBpsTier{bps=$bps, maximumAmount=$maximumAmount, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
}
