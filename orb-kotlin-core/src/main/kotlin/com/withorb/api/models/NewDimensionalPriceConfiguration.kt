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

class NewDimensionalPriceConfiguration
private constructor(
    private val dimensionValues: JsonField<List<String>>,
    private val dimensionalPriceGroupId: JsonField<String>,
    private val externalDimensionalPriceGroupId: JsonField<String>,
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
        @JsonProperty("external_dimensional_price_group_id")
        @ExcludeMissing
        externalDimensionalPriceGroupId: JsonField<String> = JsonMissing.of(),
    ) : this(
        dimensionValues,
        dimensionalPriceGroupId,
        externalDimensionalPriceGroupId,
        mutableMapOf(),
    )

    /**
     * The list of dimension values matching (in order) the dimensions of the price group
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dimensionValues(): List<String> = dimensionValues.getRequired("dimension_values")

    /**
     * The id of the dimensional price group to include this price in
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun dimensionalPriceGroupId(): String? =
        dimensionalPriceGroupId.getNullable("dimensional_price_group_id")

    /**
     * The external id of the dimensional price group to include this price in
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalDimensionalPriceGroupId(): String? =
        externalDimensionalPriceGroupId.getNullable("external_dimensional_price_group_id")

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

    /**
     * Returns the raw JSON value of [externalDimensionalPriceGroupId].
     *
     * Unlike [externalDimensionalPriceGroupId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("external_dimensional_price_group_id")
    @ExcludeMissing
    fun _externalDimensionalPriceGroupId(): JsonField<String> = externalDimensionalPriceGroupId

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
         * [NewDimensionalPriceConfiguration].
         *
         * The following fields are required:
         * ```kotlin
         * .dimensionValues()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [NewDimensionalPriceConfiguration]. */
    class Builder internal constructor() {

        private var dimensionValues: JsonField<MutableList<String>>? = null
        private var dimensionalPriceGroupId: JsonField<String> = JsonMissing.of()
        private var externalDimensionalPriceGroupId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(newDimensionalPriceConfiguration: NewDimensionalPriceConfiguration) =
            apply {
                dimensionValues =
                    newDimensionalPriceConfiguration.dimensionValues.map { it.toMutableList() }
                dimensionalPriceGroupId = newDimensionalPriceConfiguration.dimensionalPriceGroupId
                externalDimensionalPriceGroupId =
                    newDimensionalPriceConfiguration.externalDimensionalPriceGroupId
                additionalProperties =
                    newDimensionalPriceConfiguration.additionalProperties.toMutableMap()
            }

        /** The list of dimension values matching (in order) the dimensions of the price group */
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

        /** The id of the dimensional price group to include this price in */
        fun dimensionalPriceGroupId(dimensionalPriceGroupId: String?) =
            dimensionalPriceGroupId(JsonField.ofNullable(dimensionalPriceGroupId))

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

        /** The external id of the dimensional price group to include this price in */
        fun externalDimensionalPriceGroupId(externalDimensionalPriceGroupId: String?) =
            externalDimensionalPriceGroupId(JsonField.ofNullable(externalDimensionalPriceGroupId))

        /**
         * Sets [Builder.externalDimensionalPriceGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalDimensionalPriceGroupId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun externalDimensionalPriceGroupId(externalDimensionalPriceGroupId: JsonField<String>) =
            apply {
                this.externalDimensionalPriceGroupId = externalDimensionalPriceGroupId
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
         * Returns an immutable instance of [NewDimensionalPriceConfiguration].
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
        fun build(): NewDimensionalPriceConfiguration =
            NewDimensionalPriceConfiguration(
                checkRequired("dimensionValues", dimensionValues).map { it.toImmutable() },
                dimensionalPriceGroupId,
                externalDimensionalPriceGroupId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NewDimensionalPriceConfiguration = apply {
        if (validated) {
            return@apply
        }

        dimensionValues()
        dimensionalPriceGroupId()
        externalDimensionalPriceGroupId()
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
            (if (dimensionalPriceGroupId.asKnown() == null) 0 else 1) +
            (if (externalDimensionalPriceGroupId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NewDimensionalPriceConfiguration && dimensionValues == other.dimensionValues && dimensionalPriceGroupId == other.dimensionalPriceGroupId && externalDimensionalPriceGroupId == other.externalDimensionalPriceGroupId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(dimensionValues, dimensionalPriceGroupId, externalDimensionalPriceGroupId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NewDimensionalPriceConfiguration{dimensionValues=$dimensionValues, dimensionalPriceGroupId=$dimensionalPriceGroupId, externalDimensionalPriceGroupId=$externalDimensionalPriceGroupId, additionalProperties=$additionalProperties}"
}
