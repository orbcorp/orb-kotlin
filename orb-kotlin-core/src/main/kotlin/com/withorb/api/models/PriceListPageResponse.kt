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

class PriceListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Price>>,
    private val paginationMetadata: JsonField<PaginationMetadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Price>> = JsonMissing.of(),
        @JsonProperty("pagination_metadata")
        @ExcludeMissing
        paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of(),
    ) : this(data, paginationMetadata, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Price> = data.getRequired("data")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paginationMetadata(): PaginationMetadata =
        paginationMetadata.getRequired("pagination_metadata")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Price>> = data

    /**
     * Returns the raw JSON value of [paginationMetadata].
     *
     * Unlike [paginationMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pagination_metadata")
    @ExcludeMissing
    fun _paginationMetadata(): JsonField<PaginationMetadata> = paginationMetadata

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
         * Returns a mutable builder for constructing an instance of [PriceListPageResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * .paginationMetadata()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PriceListPageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Price>>? = null
        private var paginationMetadata: JsonField<PaginationMetadata>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(priceListPageResponse: PriceListPageResponse) = apply {
            data = priceListPageResponse.data.map { it.toMutableList() }
            paginationMetadata = priceListPageResponse.paginationMetadata
            additionalProperties = priceListPageResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Price>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Price>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun data(data: JsonField<List<Price>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Price] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Price) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /** Alias for calling [addData] with `Price.ofUnit(unit)`. */
        fun addData(unit: Price.Unit) = addData(Price.ofUnit(unit))

        /** Alias for calling [addData] with `Price.ofTiered(tiered)`. */
        fun addData(tiered: Price.Tiered) = addData(Price.ofTiered(tiered))

        /** Alias for calling [addData] with `Price.ofBulk(bulk)`. */
        fun addData(bulk: Price.Bulk) = addData(Price.ofBulk(bulk))

        /** Alias for calling [addData] with `Price.ofPackage(package_)`. */
        fun addData(package_: Price.Package) = addData(Price.ofPackage(package_))

        /** Alias for calling [addData] with `Price.ofMatrix(matrix)`. */
        fun addData(matrix: Price.Matrix) = addData(Price.ofMatrix(matrix))

        /**
         * Alias for calling [addData] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
         */
        fun addData(thresholdTotalAmount: Price.ThresholdTotalAmount) =
            addData(Price.ofThresholdTotalAmount(thresholdTotalAmount))

        /** Alias for calling [addData] with `Price.ofTieredPackage(tieredPackage)`. */
        fun addData(tieredPackage: Price.TieredPackage) =
            addData(Price.ofTieredPackage(tieredPackage))

        /** Alias for calling [addData] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
        fun addData(tieredWithMinimum: Price.TieredWithMinimum) =
            addData(Price.ofTieredWithMinimum(tieredWithMinimum))

        /** Alias for calling [addData] with `Price.ofGroupedTiered(groupedTiered)`. */
        fun addData(groupedTiered: Price.GroupedTiered) =
            addData(Price.ofGroupedTiered(groupedTiered))

        /**
         * Alias for calling [addData] with
         * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
         */
        fun addData(tieredPackageWithMinimum: Price.TieredPackageWithMinimum) =
            addData(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

        /**
         * Alias for calling [addData] with `Price.ofPackageWithAllocation(packageWithAllocation)`.
         */
        fun addData(packageWithAllocation: Price.PackageWithAllocation) =
            addData(Price.ofPackageWithAllocation(packageWithAllocation))

        /** Alias for calling [addData] with `Price.ofUnitWithPercent(unitWithPercent)`. */
        fun addData(unitWithPercent: Price.UnitWithPercent) =
            addData(Price.ofUnitWithPercent(unitWithPercent))

        /**
         * Alias for calling [addData] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
         */
        fun addData(matrixWithAllocation: Price.MatrixWithAllocation) =
            addData(Price.ofMatrixWithAllocation(matrixWithAllocation))

        /** Alias for calling [addData] with `Price.ofTieredWithProration(tieredWithProration)`. */
        fun addData(tieredWithProration: Price.TieredWithProration) =
            addData(Price.ofTieredWithProration(tieredWithProration))

        /** Alias for calling [addData] with `Price.ofUnitWithProration(unitWithProration)`. */
        fun addData(unitWithProration: Price.UnitWithProration) =
            addData(Price.ofUnitWithProration(unitWithProration))

        /** Alias for calling [addData] with `Price.ofGroupedAllocation(groupedAllocation)`. */
        fun addData(groupedAllocation: Price.GroupedAllocation) =
            addData(Price.ofGroupedAllocation(groupedAllocation))

        /** Alias for calling [addData] with `Price.ofBulkWithProration(bulkWithProration)`. */
        fun addData(bulkWithProration: Price.BulkWithProration) =
            addData(Price.ofBulkWithProration(bulkWithProration))

        /**
         * Alias for calling [addData] with
         * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
         */
        fun addData(groupedWithProratedMinimum: Price.GroupedWithProratedMinimum) =
            addData(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

        /**
         * Alias for calling [addData] with
         * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
         */
        fun addData(groupedWithMeteredMinimum: Price.GroupedWithMeteredMinimum) =
            addData(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

        /**
         * Alias for calling [addData] with
         * `Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)`.
         */
        fun addData(groupedWithMinMaxThresholds: Price.GroupedWithMinMaxThresholds) =
            addData(Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds))

        /**
         * Alias for calling [addData] with `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
         */
        fun addData(matrixWithDisplayName: Price.MatrixWithDisplayName) =
            addData(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

        /**
         * Alias for calling [addData] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
         */
        fun addData(groupedTieredPackage: Price.GroupedTieredPackage) =
            addData(Price.ofGroupedTieredPackage(groupedTieredPackage))

        /**
         * Alias for calling [addData] with `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
         */
        fun addData(maxGroupTieredPackage: Price.MaxGroupTieredPackage) =
            addData(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

        /**
         * Alias for calling [addData] with
         * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
         */
        fun addData(scalableMatrixWithUnitPricing: Price.ScalableMatrixWithUnitPricing) =
            addData(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

        /**
         * Alias for calling [addData] with
         * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
         */
        fun addData(scalableMatrixWithTieredPricing: Price.ScalableMatrixWithTieredPricing) =
            addData(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

        /**
         * Alias for calling [addData] with `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
         */
        fun addData(cumulativeGroupedBulk: Price.CumulativeGroupedBulk) =
            addData(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

        /** Alias for calling [addData] with `Price.ofMinimum(minimum)`. */
        fun addData(minimum: Price.Minimum) = addData(Price.ofMinimum(minimum))

        /** Alias for calling [addData] with `Price.ofEventOutput(eventOutput)`. */
        fun addData(eventOutput: Price.EventOutput) = addData(Price.ofEventOutput(eventOutput))

        fun paginationMetadata(paginationMetadata: PaginationMetadata) =
            paginationMetadata(JsonField.of(paginationMetadata))

        /**
         * Sets [Builder.paginationMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paginationMetadata] with a well-typed
         * [PaginationMetadata] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun paginationMetadata(paginationMetadata: JsonField<PaginationMetadata>) = apply {
            this.paginationMetadata = paginationMetadata
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
         * Returns an immutable instance of [PriceListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * .paginationMetadata()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PriceListPageResponse =
            PriceListPageResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("paginationMetadata", paginationMetadata),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PriceListPageResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        paginationMetadata().validate()
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
        (data.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (paginationMetadata.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PriceListPageResponse &&
            data == other.data &&
            paginationMetadata == other.paginationMetadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(data, paginationMetadata, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PriceListPageResponse{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"
}
