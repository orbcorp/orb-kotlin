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

class DimensionalPriceGroupPriceCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Price>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Price>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * The prices created by this request, in request order.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Price> = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Price>> = data

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
         * [DimensionalPriceGroupPriceCreateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DimensionalPriceGroupPriceCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Price>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            dimensionalPriceGroupPriceCreateResponse: DimensionalPriceGroupPriceCreateResponse
        ) = apply {
            data = dimensionalPriceGroupPriceCreateResponse.data.map { it.toMutableList() }
            additionalProperties =
                dimensionalPriceGroupPriceCreateResponse.additionalProperties.toMutableMap()
        }

        /** The prices created by this request, in request order. */
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
        fun addData(unit: Price.UnitPrice) = addData(Price.ofUnit(unit))

        /** Alias for calling [addData] with `Price.ofTiered(tiered)`. */
        fun addData(tiered: Price.Tiered) = addData(Price.ofTiered(tiered))

        /** Alias for calling [addData] with `Price.ofBulk(bulk)`. */
        fun addData(bulk: Price.Bulk) = addData(Price.ofBulk(bulk))

        /** Alias for calling [addData] with `Price.ofBulkWithFilters(bulkWithFilters)`. */
        fun addData(bulkWithFilters: Price.BulkWithFilters) =
            addData(Price.ofBulkWithFilters(bulkWithFilters))

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

        /** Alias for calling [addData] with `Price.ofGroupedTieredMatrix(groupedTieredMatrix)`. */
        fun addData(groupedTieredMatrix: Price.GroupedTieredMatrix) =
            addData(Price.ofGroupedTieredMatrix(groupedTieredMatrix))

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

        /**
         * Alias for calling [addData] with
         * `Price.ofTieredMatrixWithAllocation(tieredMatrixWithAllocation)`.
         */
        fun addData(tieredMatrixWithAllocation: Price.TieredMatrixWithAllocation) =
            addData(Price.ofTieredMatrixWithAllocation(tieredMatrixWithAllocation))

        /**
         * Alias for calling [addData] with
         * `Price.ofMatrixWithThresholdDiscounts(matrixWithThresholdDiscounts)`.
         */
        fun addData(matrixWithThresholdDiscounts: Price.MatrixWithThresholdDiscounts) =
            addData(Price.ofMatrixWithThresholdDiscounts(matrixWithThresholdDiscounts))

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

        /**
         * Alias for calling [addData] with
         * `Price.ofCumulativeGroupedAllocation(cumulativeGroupedAllocation)`.
         */
        fun addData(cumulativeGroupedAllocation: Price.CumulativeGroupedAllocation) =
            addData(Price.ofCumulativeGroupedAllocation(cumulativeGroupedAllocation))

        /**
         * Alias for calling [addData] with `Price.ofDailyCreditAllowance(dailyCreditAllowance)`.
         */
        fun addData(dailyCreditAllowance: Price.DailyCreditAllowance) =
            addData(Price.ofDailyCreditAllowance(dailyCreditAllowance))

        /** Alias for calling [addData] with `Price.ofMeteredAllowance(meteredAllowance)`. */
        fun addData(meteredAllowance: Price.MeteredAllowance) =
            addData(Price.ofMeteredAllowance(meteredAllowance))

        /** Alias for calling [addData] with `Price.ofMinimumComposite(minimumComposite)`. */
        fun addData(minimumComposite: Price.MinimumComposite) =
            addData(Price.ofMinimumComposite(minimumComposite))

        /** Alias for calling [addData] with `Price.ofPercent(percent)`. */
        fun addData(percent: Price.Percent) = addData(Price.ofPercent(percent))

        /** Alias for calling [addData] with `Price.ofEventOutput(eventOutput)`. */
        fun addData(eventOutput: Price.EventOutput) = addData(Price.ofEventOutput(eventOutput))

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
         * Returns an immutable instance of [DimensionalPriceGroupPriceCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DimensionalPriceGroupPriceCreateResponse =
            DimensionalPriceGroupPriceCreateResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws OrbInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): DimensionalPriceGroupPriceCreateResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
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
    internal fun validity(): Int = (data.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DimensionalPriceGroupPriceCreateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DimensionalPriceGroupPriceCreateResponse{data=$data, additionalProperties=$additionalProperties}"
}
