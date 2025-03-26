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

/**
 * A dimensional price group is used to partition the result of a billable metric by a set of
 * dimensions. Prices in a price group must specify the parition used to derive their usage.
 */
class DimensionalPriceGroup
private constructor(
    private val id: JsonField<String>,
    private val billableMetricId: JsonField<String>,
    private val dimensions: JsonField<List<String>>,
    private val externalDimensionalPriceGroupId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        billableMetricId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dimensions")
        @ExcludeMissing
        dimensions: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("external_dimensional_price_group_id")
        @ExcludeMissing
        externalDimensionalPriceGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        billableMetricId,
        dimensions,
        externalDimensionalPriceGroupId,
        metadata,
        name,
        mutableMapOf(),
    )

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The billable metric associated with this dimensional price group. All prices associated with
     * this dimensional price group will be computed using this billable metric.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billableMetricId(): String = billableMetricId.getRequired("billable_metric_id")

    /**
     * The dimensions that this dimensional price group is defined over
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dimensions(): List<String> = dimensions.getRequired("dimensions")

    /**
     * An alias for the dimensional price group
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalDimensionalPriceGroupId(): String? =
        externalDimensionalPriceGroupId.getNullable("external_dimensional_price_group_id")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * The name of the dimensional price group
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [billableMetricId].
     *
     * Unlike [billableMetricId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("billable_metric_id")
    @ExcludeMissing
    fun _billableMetricId(): JsonField<String> = billableMetricId

    /**
     * Returns the raw JSON value of [dimensions].
     *
     * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dimensions")
    @ExcludeMissing
    fun _dimensions(): JsonField<List<String>> = dimensions

    /**
     * Returns the raw JSON value of [externalDimensionalPriceGroupId].
     *
     * Unlike [externalDimensionalPriceGroupId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("external_dimensional_price_group_id")
    @ExcludeMissing
    fun _externalDimensionalPriceGroupId(): JsonField<String> = externalDimensionalPriceGroupId

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [DimensionalPriceGroup].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .billableMetricId()
         * .dimensions()
         * .externalDimensionalPriceGroupId()
         * .metadata()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DimensionalPriceGroup]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var billableMetricId: JsonField<String>? = null
        private var dimensions: JsonField<MutableList<String>>? = null
        private var externalDimensionalPriceGroupId: JsonField<String>? = null
        private var metadata: JsonField<Metadata>? = null
        private var name: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(dimensionalPriceGroup: DimensionalPriceGroup) = apply {
            id = dimensionalPriceGroup.id
            billableMetricId = dimensionalPriceGroup.billableMetricId
            dimensions = dimensionalPriceGroup.dimensions.map { it.toMutableList() }
            externalDimensionalPriceGroupId = dimensionalPriceGroup.externalDimensionalPriceGroupId
            metadata = dimensionalPriceGroup.metadata
            name = dimensionalPriceGroup.name
            additionalProperties = dimensionalPriceGroup.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The billable metric associated with this dimensional price group. All prices associated
         * with this dimensional price group will be computed using this billable metric.
         */
        fun billableMetricId(billableMetricId: String) =
            billableMetricId(JsonField.of(billableMetricId))

        /**
         * Sets [Builder.billableMetricId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billableMetricId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            this.billableMetricId = billableMetricId
        }

        /** The dimensions that this dimensional price group is defined over */
        fun dimensions(dimensions: List<String>) = dimensions(JsonField.of(dimensions))

        /**
         * Sets [Builder.dimensions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dimensions] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dimensions(dimensions: JsonField<List<String>>) = apply {
            this.dimensions = dimensions.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [dimensions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDimension(dimension: String) = apply {
            dimensions =
                (dimensions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dimensions", it).add(dimension)
                }
        }

        /** An alias for the dimensional price group */
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

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The name of the dimensional price group */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [DimensionalPriceGroup].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .billableMetricId()
         * .dimensions()
         * .externalDimensionalPriceGroupId()
         * .metadata()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DimensionalPriceGroup =
            DimensionalPriceGroup(
                checkRequired("id", id),
                checkRequired("billableMetricId", billableMetricId),
                checkRequired("dimensions", dimensions).map { it.toImmutable() },
                checkRequired("externalDimensionalPriceGroupId", externalDimensionalPriceGroupId),
                checkRequired("metadata", metadata),
                checkRequired("name", name),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DimensionalPriceGroup = apply {
        if (validated) {
            return@apply
        }

        id()
        billableMetricId()
        dimensions()
        externalDimensionalPriceGroupId()
        metadata().validate()
        name()
        validated = true
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
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

        return /* spotless:off */ other is DimensionalPriceGroup && id == other.id && billableMetricId == other.billableMetricId && dimensions == other.dimensions && externalDimensionalPriceGroupId == other.externalDimensionalPriceGroupId && metadata == other.metadata && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, billableMetricId, dimensions, externalDimensionalPriceGroupId, metadata, name, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DimensionalPriceGroup{id=$id, billableMetricId=$billableMetricId, dimensions=$dimensions, externalDimensionalPriceGroupId=$externalDimensionalPriceGroupId, metadata=$metadata, name=$name, additionalProperties=$additionalProperties}"
}
