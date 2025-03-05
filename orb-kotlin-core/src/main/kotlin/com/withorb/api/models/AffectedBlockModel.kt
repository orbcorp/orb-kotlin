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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class AffectedBlockModel
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("expiry_date")
    @ExcludeMissing
    private val expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("per_unit_cost_basis")
    @ExcludeMissing
    private val perUnitCostBasis: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

    fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("expiry_date")
    @ExcludeMissing
    fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

    @JsonProperty("per_unit_cost_basis")
    @ExcludeMissing
    fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AffectedBlockModel = apply {
        if (validated) {
            return@apply
        }

        id()
        expiryDate()
        perUnitCostBasis()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AffectedBlockModel].
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

    /** A builder for [AffectedBlockModel]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var expiryDate: JsonField<OffsetDateTime>? = null
        private var perUnitCostBasis: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(affectedBlockModel: AffectedBlockModel) = apply {
            id = affectedBlockModel.id
            expiryDate = affectedBlockModel.expiryDate
            perUnitCostBasis = affectedBlockModel.perUnitCostBasis
            additionalProperties = affectedBlockModel.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun expiryDate(expiryDate: OffsetDateTime?) = expiryDate(JsonField.ofNullable(expiryDate))

        fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
            this.expiryDate = expiryDate
        }

        fun perUnitCostBasis(perUnitCostBasis: String?) =
            perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

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

        fun build(): AffectedBlockModel =
            AffectedBlockModel(
                checkRequired("id", id),
                checkRequired("expiryDate", expiryDate),
                checkRequired("perUnitCostBasis", perUnitCostBasis),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AffectedBlockModel && id == other.id && expiryDate == other.expiryDate && perUnitCostBasis == other.perUnitCostBasis && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, expiryDate, perUnitCostBasis, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AffectedBlockModel{id=$id, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"
}
