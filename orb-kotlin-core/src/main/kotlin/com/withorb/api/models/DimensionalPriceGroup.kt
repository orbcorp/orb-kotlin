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
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects

/**
 * A dimensional price group is used to partition the result of a billable metric by a set of
 * dimensions. Prices in a price group must specify the parition used to derive their usage.
 */
@NoAutoDetect
class DimensionalPriceGroup
@JsonCreator
private constructor(
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("external_dimensional_price_group_id")
    @ExcludeMissing
    private val externalDimensionalPriceGroupId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dimensions")
    @ExcludeMissing
    private val dimensions: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("billable_metric_id")
    @ExcludeMissing
    private val billableMetricId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun id(): String = id.getRequired("id")

    /** The name of the dimensional price group */
    fun name(): String = name.getRequired("name")

    /** An alias for the dimensional price group */
    fun externalDimensionalPriceGroupId(): String? =
        externalDimensionalPriceGroupId.getNullable("external_dimensional_price_group_id")

    /** The dimensions that this dimensional price group is defined over */
    fun dimensions(): List<String> = dimensions.getRequired("dimensions")

    /**
     * The billable metric associated with this dimensional price group. All prices associated with
     * this dimensional price group will be computed using this billable metric.
     */
    fun billableMetricId(): String = billableMetricId.getRequired("billable_metric_id")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The name of the dimensional price group */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** An alias for the dimensional price group */
    @JsonProperty("external_dimensional_price_group_id")
    @ExcludeMissing
    fun _externalDimensionalPriceGroupId() = externalDimensionalPriceGroupId

    /** The dimensions that this dimensional price group is defined over */
    @JsonProperty("dimensions") @ExcludeMissing fun _dimensions() = dimensions

    /**
     * The billable metric associated with this dimensional price group. All prices associated with
     * this dimensional price group will be computed using this billable metric.
     */
    @JsonProperty("billable_metric_id") @ExcludeMissing fun _billableMetricId() = billableMetricId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DimensionalPriceGroup = apply {
        if (!validated) {
            metadata().validate()
            id()
            name()
            externalDimensionalPriceGroupId()
            dimensions()
            billableMetricId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var externalDimensionalPriceGroupId: JsonField<String> = JsonMissing.of()
        private var dimensions: JsonField<List<String>> = JsonMissing.of()
        private var billableMetricId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(dimensionalPriceGroup: DimensionalPriceGroup) = apply {
            metadata = dimensionalPriceGroup.metadata
            id = dimensionalPriceGroup.id
            name = dimensionalPriceGroup.name
            externalDimensionalPriceGroupId = dimensionalPriceGroup.externalDimensionalPriceGroupId
            dimensions = dimensionalPriceGroup.dimensions
            billableMetricId = dimensionalPriceGroup.billableMetricId
            additionalProperties = dimensionalPriceGroup.additionalProperties.toMutableMap()
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The name of the dimensional price group */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the dimensional price group */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** An alias for the dimensional price group */
        fun externalDimensionalPriceGroupId(externalDimensionalPriceGroupId: String) =
            externalDimensionalPriceGroupId(JsonField.of(externalDimensionalPriceGroupId))

        /** An alias for the dimensional price group */
        fun externalDimensionalPriceGroupId(externalDimensionalPriceGroupId: JsonField<String>) =
            apply {
                this.externalDimensionalPriceGroupId = externalDimensionalPriceGroupId
            }

        /** The dimensions that this dimensional price group is defined over */
        fun dimensions(dimensions: List<String>) = dimensions(JsonField.of(dimensions))

        /** The dimensions that this dimensional price group is defined over */
        fun dimensions(dimensions: JsonField<List<String>>) = apply { this.dimensions = dimensions }

        /**
         * The billable metric associated with this dimensional price group. All prices associated
         * with this dimensional price group will be computed using this billable metric.
         */
        fun billableMetricId(billableMetricId: String) =
            billableMetricId(JsonField.of(billableMetricId))

        /**
         * The billable metric associated with this dimensional price group. All prices associated
         * with this dimensional price group will be computed using this billable metric.
         */
        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            this.billableMetricId = billableMetricId
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

        fun build(): DimensionalPriceGroup =
            DimensionalPriceGroup(
                metadata,
                id,
                name,
                externalDimensionalPriceGroupId,
                dimensions.map { it.toImmutable() },
                billableMetricId,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DimensionalPriceGroup && metadata == other.metadata && id == other.id && name == other.name && externalDimensionalPriceGroupId == other.externalDimensionalPriceGroupId && dimensions == other.dimensions && billableMetricId == other.billableMetricId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(metadata, id, name, externalDimensionalPriceGroupId, dimensions, billableMetricId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DimensionalPriceGroup{metadata=$metadata, id=$id, name=$name, externalDimensionalPriceGroupId=$externalDimensionalPriceGroupId, dimensions=$dimensions, billableMetricId=$billableMetricId, additionalProperties=$additionalProperties}"
}
