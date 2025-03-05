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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class DimensionalPriceConfigurationModel
@JsonCreator
private constructor(
    @JsonProperty("dimension_values")
    @ExcludeMissing
    private val dimensionValues: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("dimensional_price_group_id")
    @ExcludeMissing
    private val dimensionalPriceGroupId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun dimensionValues(): List<String> = dimensionValues.getRequired("dimension_values")

    fun dimensionalPriceGroupId(): String =
        dimensionalPriceGroupId.getRequired("dimensional_price_group_id")

    @JsonProperty("dimension_values")
    @ExcludeMissing
    fun _dimensionValues(): JsonField<List<String>> = dimensionValues

    @JsonProperty("dimensional_price_group_id")
    @ExcludeMissing
    fun _dimensionalPriceGroupId(): JsonField<String> = dimensionalPriceGroupId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DimensionalPriceConfigurationModel = apply {
        if (validated) {
            return@apply
        }

        dimensionValues()
        dimensionalPriceGroupId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DimensionalPriceConfigurationModel].
         *
         * The following fields are required:
         * ```kotlin
         * .dimensionValues()
         * .dimensionalPriceGroupId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DimensionalPriceConfigurationModel]. */
    class Builder internal constructor() {

        private var dimensionValues: JsonField<MutableList<String>>? = null
        private var dimensionalPriceGroupId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(dimensionalPriceConfigurationModel: DimensionalPriceConfigurationModel) =
            apply {
                dimensionValues =
                    dimensionalPriceConfigurationModel.dimensionValues.map { it.toMutableList() }
                dimensionalPriceGroupId = dimensionalPriceConfigurationModel.dimensionalPriceGroupId
                additionalProperties =
                    dimensionalPriceConfigurationModel.additionalProperties.toMutableMap()
            }

        fun dimensionValues(dimensionValues: List<String>) =
            dimensionValues(JsonField.of(dimensionValues))

        fun dimensionValues(dimensionValues: JsonField<List<String>>) = apply {
            this.dimensionValues = dimensionValues.map { it.toMutableList() }
        }

        fun addDimensionValue(dimensionValue: String) = apply {
            dimensionValues =
                (dimensionValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dimensionValues", it).add(dimensionValue)
                }
        }

        fun dimensionalPriceGroupId(dimensionalPriceGroupId: String) =
            dimensionalPriceGroupId(JsonField.of(dimensionalPriceGroupId))

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

        fun build(): DimensionalPriceConfigurationModel =
            DimensionalPriceConfigurationModel(
                checkRequired("dimensionValues", dimensionValues).map { it.toImmutable() },
                checkRequired("dimensionalPriceGroupId", dimensionalPriceGroupId),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DimensionalPriceConfigurationModel && dimensionValues == other.dimensionValues && dimensionalPriceGroupId == other.dimensionalPriceGroupId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(dimensionValues, dimensionalPriceGroupId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DimensionalPriceConfigurationModel{dimensionValues=$dimensionValues, dimensionalPriceGroupId=$dimensionalPriceGroupId, additionalProperties=$additionalProperties}"
}
