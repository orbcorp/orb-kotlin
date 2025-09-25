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

class DimensionalPriceConfiguration
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dimensionValues: JsonField<List<String>>,
    private val dimensionalPriceGroupId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dimension_values")
        @ExcludeMissing
        dimensionValues: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("dimensional_price_group_id")
        @ExcludeMissing
        dimensionalPriceGroupId: JsonField<String> = JsonMissing.of(),
    ) : this(dimensionValues, dimensionalPriceGroupId, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dimensionValues(): List<String> = dimensionValues.getRequired("dimension_values")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dimensionalPriceGroupId(): String =
        dimensionalPriceGroupId.getRequired("dimensional_price_group_id")

    /**
     * Returns the raw JSON value of [dimensionValues].
     *
     * Unlike [dimensionValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dimension_values")
    @ExcludeMissing
    fun _dimensionValues(): JsonField<List<String>> = dimensionValues

    /**
     * Returns the raw JSON value of [dimensionalPriceGroupId].
     *
     * Unlike [dimensionalPriceGroupId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("dimensional_price_group_id")
    @ExcludeMissing
    fun _dimensionalPriceGroupId(): JsonField<String> = dimensionalPriceGroupId

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
         * Returns a mutable builder for constructing an instance of
         * [DimensionalPriceConfiguration].
         *
         * The following fields are required:
         * ```kotlin
         * .dimensionValues()
         * .dimensionalPriceGroupId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DimensionalPriceConfiguration]. */
    class Builder internal constructor() {

        private var dimensionValues: JsonField<MutableList<String>>? = null
        private var dimensionalPriceGroupId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(dimensionalPriceConfiguration: DimensionalPriceConfiguration) = apply {
            dimensionValues =
                dimensionalPriceConfiguration.dimensionValues.map { it.toMutableList() }
            dimensionalPriceGroupId = dimensionalPriceConfiguration.dimensionalPriceGroupId
            additionalProperties = dimensionalPriceConfiguration.additionalProperties.toMutableMap()
        }

        fun dimensionValues(dimensionValues: List<String>) =
            dimensionValues(JsonField.of(dimensionValues))

        /**
         * Sets [Builder.dimensionValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dimensionValues] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dimensionValues(dimensionValues: JsonField<List<String>>) = apply {
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

        fun dimensionalPriceGroupId(dimensionalPriceGroupId: String) =
            dimensionalPriceGroupId(JsonField.of(dimensionalPriceGroupId))

        /**
         * Sets [Builder.dimensionalPriceGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dimensionalPriceGroupId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dimensionalPriceGroupId(dimensionalPriceGroupId: JsonField<String>) = apply {
            this.dimensionalPriceGroupId = dimensionalPriceGroupId
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
         * Returns an immutable instance of [DimensionalPriceConfiguration].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .dimensionValues()
         * .dimensionalPriceGroupId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DimensionalPriceConfiguration =
            DimensionalPriceConfiguration(
                checkRequired("dimensionValues", dimensionValues).map { it.toImmutable() },
                checkRequired("dimensionalPriceGroupId", dimensionalPriceGroupId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DimensionalPriceConfiguration = apply {
        if (validated) {
            return@apply
        }

        dimensionValues()
        dimensionalPriceGroupId()
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
        (dimensionValues.asKnown()?.size ?: 0) +
            (if (dimensionalPriceGroupId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DimensionalPriceConfiguration &&
            dimensionValues == other.dimensionValues &&
            dimensionalPriceGroupId == other.dimensionalPriceGroupId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(dimensionValues, dimensionalPriceGroupId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DimensionalPriceConfiguration{dimensionValues=$dimensionValues, dimensionalPriceGroupId=$dimensionalPriceGroupId, additionalProperties=$additionalProperties}"
}
