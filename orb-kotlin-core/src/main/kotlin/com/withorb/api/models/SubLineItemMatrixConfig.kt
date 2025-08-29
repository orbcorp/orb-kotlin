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

class SubLineItemMatrixConfig
private constructor(
    private val dimensionValues: JsonField<List<String?>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dimension_values")
        @ExcludeMissing
        dimensionValues: JsonField<List<String?>> = JsonMissing.of()
    ) : this(dimensionValues, mutableMapOf())

    /**
     * The ordered dimension values for this line item.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dimensionValues(): List<String?> = dimensionValues.getRequired("dimension_values")

    /**
     * Returns the raw JSON value of [dimensionValues].
     *
     * Unlike [dimensionValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dimension_values")
    @ExcludeMissing
    fun _dimensionValues(): JsonField<List<String?>> = dimensionValues

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
         * Returns a mutable builder for constructing an instance of [SubLineItemMatrixConfig].
         *
         * The following fields are required:
         * ```kotlin
         * .dimensionValues()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubLineItemMatrixConfig]. */
    class Builder internal constructor() {

        private var dimensionValues: JsonField<MutableList<String?>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subLineItemMatrixConfig: SubLineItemMatrixConfig) = apply {
            dimensionValues = subLineItemMatrixConfig.dimensionValues.map { it.toMutableList() }
            additionalProperties = subLineItemMatrixConfig.additionalProperties.toMutableMap()
        }

        /** The ordered dimension values for this line item. */
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
         * Returns an immutable instance of [SubLineItemMatrixConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .dimensionValues()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubLineItemMatrixConfig =
            SubLineItemMatrixConfig(
                checkRequired("dimensionValues", dimensionValues).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubLineItemMatrixConfig = apply {
        if (validated) {
            return@apply
        }

        dimensionValues()
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
        (dimensionValues.asKnown()?.sumOf { (if (it == null) 0 else 1).toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubLineItemMatrixConfig &&
            dimensionValues == other.dimensionValues &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(dimensionValues, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubLineItemMatrixConfig{dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"
}
