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

class UnitConfig
private constructor(
    private val unitAmount: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("unit_amount")
        @ExcludeMissing
        unitAmount: JsonField<String> = JsonMissing.of()
    ) : this(unitAmount, mutableMapOf())

    /**
     * Rate per unit of usage
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

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
         * Returns a mutable builder for constructing an instance of [UnitConfig].
         *
         * The following fields are required:
         * ```kotlin
         * .unitAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UnitConfig]. */
    class Builder internal constructor() {

        private var unitAmount: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(unitConfig: UnitConfig) = apply {
            unitAmount = unitConfig.unitAmount
            additionalProperties = unitConfig.additionalProperties.toMutableMap()
        }

        /** Rate per unit of usage */
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
         * Returns an immutable instance of [UnitConfig].
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
        fun build(): UnitConfig =
            UnitConfig(checkRequired("unitAmount", unitAmount), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): UnitConfig = apply {
        if (validated) {
            return@apply
        }

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
    internal fun validity(): Int = (if (unitAmount.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnitConfig &&
            unitAmount == other.unitAmount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(unitAmount, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UnitConfig{unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
}
