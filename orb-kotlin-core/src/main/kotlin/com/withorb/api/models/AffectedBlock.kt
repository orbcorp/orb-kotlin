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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class AffectedBlock
private constructor(
    private val id: JsonField<String>,
    private val expiryDate: JsonField<OffsetDateTime>,
    private val perUnitCostBasis: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiry_date")
        @ExcludeMissing
        expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("per_unit_cost_basis")
        @ExcludeMissing
        perUnitCostBasis: JsonField<String> = JsonMissing.of(),
    ) : this(id, expiryDate, perUnitCostBasis, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [expiryDate].
     *
     * Unlike [expiryDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiry_date")
    @ExcludeMissing
    fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

    /**
     * Returns the raw JSON value of [perUnitCostBasis].
     *
     * Unlike [perUnitCostBasis], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("per_unit_cost_basis")
    @ExcludeMissing
    fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

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
         * Returns a mutable builder for constructing an instance of [AffectedBlock].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .expiryDate()
         * .perUnitCostBasis()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AffectedBlock]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var expiryDate: JsonField<OffsetDateTime>? = null
        private var perUnitCostBasis: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(affectedBlock: AffectedBlock) = apply {
            id = affectedBlock.id
            expiryDate = affectedBlock.expiryDate
            perUnitCostBasis = affectedBlock.perUnitCostBasis
            additionalProperties = affectedBlock.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun expiryDate(expiryDate: OffsetDateTime?) = expiryDate(JsonField.ofNullable(expiryDate))

        /**
         * Sets [Builder.expiryDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiryDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
            this.expiryDate = expiryDate
        }

        fun perUnitCostBasis(perUnitCostBasis: String?) =
            perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

        /**
         * Sets [Builder.perUnitCostBasis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perUnitCostBasis] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
            this.perUnitCostBasis = perUnitCostBasis
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
         * Returns an immutable instance of [AffectedBlock].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .expiryDate()
         * .perUnitCostBasis()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AffectedBlock =
            AffectedBlock(
                checkRequired("id", id),
                checkRequired("expiryDate", expiryDate),
                checkRequired("perUnitCostBasis", perUnitCostBasis),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AffectedBlock = apply {
        if (validated) {
            return@apply
        }

        id()
        expiryDate()
        perUnitCostBasis()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (expiryDate.asKnown() == null) 0 else 1) +
            (if (perUnitCostBasis.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AffectedBlock &&
            id == other.id &&
            expiryDate == other.expiryDate &&
            perUnitCostBasis == other.perUnitCostBasis &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, expiryDate, perUnitCostBasis, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AffectedBlock{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"
}
