// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.Params
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * This endpoint is used to create a [price](/product-catalog/price-configuration). A price created
 * using this endpoint is always an add-on, meaning that it's not associated with a specific plan
 * and can instead be individually added to subscriptions, including subscriptions on different
 * plans.
 *
 * An `external_price_id` can be optionally specified as an alias to allow ergonomic interaction
 * with prices in the Orb API.
 *
 * See the [Price resource](/product-catalog/price-configuration) for the specification of different
 * price model configurations possible in this endpoint.
 */
class PriceCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** New floating price request body params. */
    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PriceCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .body()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PriceCreateParams]. */
    class Builder internal constructor() {

        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(priceCreateParams: PriceCreateParams) = apply {
            body = priceCreateParams.body
            additionalHeaders = priceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = priceCreateParams.additionalQueryParams.toBuilder()
        }

        /** New floating price request body params. */
        fun body(body: Body) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofUnit(unit)`. */
        fun body(unit: NewFloatingUnitPrice) = body(Body.ofUnit(unit))

        /** Alias for calling [body] with `Body.ofTiered(tiered)`. */
        fun body(tiered: NewFloatingTieredPrice) = body(Body.ofTiered(tiered))

        /** Alias for calling [body] with `Body.ofBulk(bulk)`. */
        fun body(bulk: NewFloatingBulkPrice) = body(Body.ofBulk(bulk))

        /** Alias for calling [body] with `Body.ofBulkWithFilters(bulkWithFilters)`. */
        fun body(bulkWithFilters: Body.BulkWithFilters) =
            body(Body.ofBulkWithFilters(bulkWithFilters))

        /** Alias for calling [body] with `Body.ofPackage(package_)`. */
        fun body(package_: NewFloatingPackagePrice) = body(Body.ofPackage(package_))

        /** Alias for calling [body] with `Body.ofMatrix(matrix)`. */
        fun body(matrix: NewFloatingMatrixPrice) = body(Body.ofMatrix(matrix))

        /** Alias for calling [body] with `Body.ofThresholdTotalAmount(thresholdTotalAmount)`. */
        fun body(thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice) =
            body(Body.ofThresholdTotalAmount(thresholdTotalAmount))

        /** Alias for calling [body] with `Body.ofTieredPackage(tieredPackage)`. */
        fun body(tieredPackage: NewFloatingTieredPackagePrice) =
            body(Body.ofTieredPackage(tieredPackage))

        /** Alias for calling [body] with `Body.ofTieredWithMinimum(tieredWithMinimum)`. */
        fun body(tieredWithMinimum: NewFloatingTieredWithMinimumPrice) =
            body(Body.ofTieredWithMinimum(tieredWithMinimum))

        /** Alias for calling [body] with `Body.ofGroupedTiered(groupedTiered)`. */
        fun body(groupedTiered: NewFloatingGroupedTieredPrice) =
            body(Body.ofGroupedTiered(groupedTiered))

        /**
         * Alias for calling [body] with
         * `Body.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
         */
        fun body(tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice) =
            body(Body.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

        /** Alias for calling [body] with `Body.ofPackageWithAllocation(packageWithAllocation)`. */
        fun body(packageWithAllocation: NewFloatingPackageWithAllocationPrice) =
            body(Body.ofPackageWithAllocation(packageWithAllocation))

        /** Alias for calling [body] with `Body.ofUnitWithPercent(unitWithPercent)`. */
        fun body(unitWithPercent: NewFloatingUnitWithPercentPrice) =
            body(Body.ofUnitWithPercent(unitWithPercent))

        /** Alias for calling [body] with `Body.ofMatrixWithAllocation(matrixWithAllocation)`. */
        fun body(matrixWithAllocation: NewFloatingMatrixWithAllocationPrice) =
            body(Body.ofMatrixWithAllocation(matrixWithAllocation))

        /**
         * Alias for calling [body] with
         * `Body.ofMatrixWithThresholdDiscounts(matrixWithThresholdDiscounts)`.
         */
        fun body(matrixWithThresholdDiscounts: Body.MatrixWithThresholdDiscounts) =
            body(Body.ofMatrixWithThresholdDiscounts(matrixWithThresholdDiscounts))

        /** Alias for calling [body] with `Body.ofTieredWithProration(tieredWithProration)`. */
        fun body(tieredWithProration: NewFloatingTieredWithProrationPrice) =
            body(Body.ofTieredWithProration(tieredWithProration))

        /** Alias for calling [body] with `Body.ofUnitWithProration(unitWithProration)`. */
        fun body(unitWithProration: NewFloatingUnitWithProrationPrice) =
            body(Body.ofUnitWithProration(unitWithProration))

        /** Alias for calling [body] with `Body.ofGroupedAllocation(groupedAllocation)`. */
        fun body(groupedAllocation: NewFloatingGroupedAllocationPrice) =
            body(Body.ofGroupedAllocation(groupedAllocation))

        /** Alias for calling [body] with `Body.ofBulkWithProration(bulkWithProration)`. */
        fun body(bulkWithProration: NewFloatingBulkWithProrationPrice) =
            body(Body.ofBulkWithProration(bulkWithProration))

        /**
         * Alias for calling [body] with
         * `Body.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
         */
        fun body(groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice) =
            body(Body.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

        /**
         * Alias for calling [body] with
         * `Body.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
         */
        fun body(groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice) =
            body(Body.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

        /**
         * Alias for calling [body] with
         * `Body.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)`.
         */
        fun body(groupedWithMinMaxThresholds: Body.GroupedWithMinMaxThresholds) =
            body(Body.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds))

        /** Alias for calling [body] with `Body.ofMatrixWithDisplayName(matrixWithDisplayName)`. */
        fun body(matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice) =
            body(Body.ofMatrixWithDisplayName(matrixWithDisplayName))

        /** Alias for calling [body] with `Body.ofGroupedTieredPackage(groupedTieredPackage)`. */
        fun body(groupedTieredPackage: NewFloatingGroupedTieredPackagePrice) =
            body(Body.ofGroupedTieredPackage(groupedTieredPackage))

        /** Alias for calling [body] with `Body.ofMaxGroupTieredPackage(maxGroupTieredPackage)`. */
        fun body(maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice) =
            body(Body.ofMaxGroupTieredPackage(maxGroupTieredPackage))

        /**
         * Alias for calling [body] with
         * `Body.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
         */
        fun body(scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice) =
            body(Body.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

        /**
         * Alias for calling [body] with
         * `Body.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
         */
        fun body(scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice) =
            body(Body.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

        /** Alias for calling [body] with `Body.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`. */
        fun body(cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice) =
            body(Body.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

        /**
         * Alias for calling [body] with
         * `Body.ofCumulativeGroupedAllocation(cumulativeGroupedAllocation)`.
         */
        fun body(cumulativeGroupedAllocation: Body.CumulativeGroupedAllocation) =
            body(Body.ofCumulativeGroupedAllocation(cumulativeGroupedAllocation))

        /** Alias for calling [body] with `Body.ofDailyCreditAllowance(dailyCreditAllowance)`. */
        fun body(dailyCreditAllowance: Body.DailyCreditAllowance) =
            body(Body.ofDailyCreditAllowance(dailyCreditAllowance))

        /** Alias for calling [body] with `Body.ofMeteredAllowance(meteredAllowance)`. */
        fun body(meteredAllowance: Body.MeteredAllowance) =
            body(Body.ofMeteredAllowance(meteredAllowance))

        /** Alias for calling [body] with `Body.ofMinimumComposite(minimumComposite)`. */
        fun body(minimumComposite: NewFloatingMinimumCompositePrice) =
            body(Body.ofMinimumComposite(minimumComposite))

        /** Alias for calling [body] with `Body.ofPercent(percent)`. */
        fun body(percent: Body.Percent) = body(Body.ofPercent(percent))

        /** Alias for calling [body] with `Body.ofEventOutput(eventOutput)`. */
        fun body(eventOutput: Body.EventOutput) = body(Body.ofEventOutput(eventOutput))

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PriceCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PriceCreateParams =
            PriceCreateParams(
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** New floating price request body params. */
    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val unit: NewFloatingUnitPrice? = null,
        private val tiered: NewFloatingTieredPrice? = null,
        private val bulk: NewFloatingBulkPrice? = null,
        private val bulkWithFilters: BulkWithFilters? = null,
        private val package_: NewFloatingPackagePrice? = null,
        private val matrix: NewFloatingMatrixPrice? = null,
        private val thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice? = null,
        private val tieredPackage: NewFloatingTieredPackagePrice? = null,
        private val tieredWithMinimum: NewFloatingTieredWithMinimumPrice? = null,
        private val groupedTiered: NewFloatingGroupedTieredPrice? = null,
        private val tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice? = null,
        private val packageWithAllocation: NewFloatingPackageWithAllocationPrice? = null,
        private val unitWithPercent: NewFloatingUnitWithPercentPrice? = null,
        private val matrixWithAllocation: NewFloatingMatrixWithAllocationPrice? = null,
        private val matrixWithThresholdDiscounts: MatrixWithThresholdDiscounts? = null,
        private val tieredWithProration: NewFloatingTieredWithProrationPrice? = null,
        private val unitWithProration: NewFloatingUnitWithProrationPrice? = null,
        private val groupedAllocation: NewFloatingGroupedAllocationPrice? = null,
        private val bulkWithProration: NewFloatingBulkWithProrationPrice? = null,
        private val groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice? = null,
        private val groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice? = null,
        private val groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds? = null,
        private val matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice? = null,
        private val groupedTieredPackage: NewFloatingGroupedTieredPackagePrice? = null,
        private val maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice? = null,
        private val scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice? =
            null,
        private val scalableMatrixWithTieredPricing:
            NewFloatingScalableMatrixWithTieredPricingPrice? =
            null,
        private val cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice? = null,
        private val cumulativeGroupedAllocation: CumulativeGroupedAllocation? = null,
        private val dailyCreditAllowance: DailyCreditAllowance? = null,
        private val meteredAllowance: MeteredAllowance? = null,
        private val minimumComposite: NewFloatingMinimumCompositePrice? = null,
        private val percent: Percent? = null,
        private val eventOutput: EventOutput? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unit(): NewFloatingUnitPrice? = unit

        fun tiered(): NewFloatingTieredPrice? = tiered

        fun bulk(): NewFloatingBulkPrice? = bulk

        fun bulkWithFilters(): BulkWithFilters? = bulkWithFilters

        fun package_(): NewFloatingPackagePrice? = package_

        fun matrix(): NewFloatingMatrixPrice? = matrix

        fun thresholdTotalAmount(): NewFloatingThresholdTotalAmountPrice? = thresholdTotalAmount

        fun tieredPackage(): NewFloatingTieredPackagePrice? = tieredPackage

        fun tieredWithMinimum(): NewFloatingTieredWithMinimumPrice? = tieredWithMinimum

        fun groupedTiered(): NewFloatingGroupedTieredPrice? = groupedTiered

        fun tieredPackageWithMinimum(): NewFloatingTieredPackageWithMinimumPrice? =
            tieredPackageWithMinimum

        fun packageWithAllocation(): NewFloatingPackageWithAllocationPrice? = packageWithAllocation

        fun unitWithPercent(): NewFloatingUnitWithPercentPrice? = unitWithPercent

        fun matrixWithAllocation(): NewFloatingMatrixWithAllocationPrice? = matrixWithAllocation

        fun matrixWithThresholdDiscounts(): MatrixWithThresholdDiscounts? =
            matrixWithThresholdDiscounts

        fun tieredWithProration(): NewFloatingTieredWithProrationPrice? = tieredWithProration

        fun unitWithProration(): NewFloatingUnitWithProrationPrice? = unitWithProration

        fun groupedAllocation(): NewFloatingGroupedAllocationPrice? = groupedAllocation

        fun bulkWithProration(): NewFloatingBulkWithProrationPrice? = bulkWithProration

        fun groupedWithProratedMinimum(): NewFloatingGroupedWithProratedMinimumPrice? =
            groupedWithProratedMinimum

        fun groupedWithMeteredMinimum(): NewFloatingGroupedWithMeteredMinimumPrice? =
            groupedWithMeteredMinimum

        fun groupedWithMinMaxThresholds(): GroupedWithMinMaxThresholds? =
            groupedWithMinMaxThresholds

        fun matrixWithDisplayName(): NewFloatingMatrixWithDisplayNamePrice? = matrixWithDisplayName

        fun groupedTieredPackage(): NewFloatingGroupedTieredPackagePrice? = groupedTieredPackage

        fun maxGroupTieredPackage(): NewFloatingMaxGroupTieredPackagePrice? = maxGroupTieredPackage

        fun scalableMatrixWithUnitPricing(): NewFloatingScalableMatrixWithUnitPricingPrice? =
            scalableMatrixWithUnitPricing

        fun scalableMatrixWithTieredPricing(): NewFloatingScalableMatrixWithTieredPricingPrice? =
            scalableMatrixWithTieredPricing

        fun cumulativeGroupedBulk(): NewFloatingCumulativeGroupedBulkPrice? = cumulativeGroupedBulk

        fun cumulativeGroupedAllocation(): CumulativeGroupedAllocation? =
            cumulativeGroupedAllocation

        fun dailyCreditAllowance(): DailyCreditAllowance? = dailyCreditAllowance

        fun meteredAllowance(): MeteredAllowance? = meteredAllowance

        fun minimumComposite(): NewFloatingMinimumCompositePrice? = minimumComposite

        fun percent(): Percent? = percent

        fun eventOutput(): EventOutput? = eventOutput

        fun isUnit(): Boolean = unit != null

        fun isTiered(): Boolean = tiered != null

        fun isBulk(): Boolean = bulk != null

        fun isBulkWithFilters(): Boolean = bulkWithFilters != null

        fun isPackage(): Boolean = package_ != null

        fun isMatrix(): Boolean = matrix != null

        fun isThresholdTotalAmount(): Boolean = thresholdTotalAmount != null

        fun isTieredPackage(): Boolean = tieredPackage != null

        fun isTieredWithMinimum(): Boolean = tieredWithMinimum != null

        fun isGroupedTiered(): Boolean = groupedTiered != null

        fun isTieredPackageWithMinimum(): Boolean = tieredPackageWithMinimum != null

        fun isPackageWithAllocation(): Boolean = packageWithAllocation != null

        fun isUnitWithPercent(): Boolean = unitWithPercent != null

        fun isMatrixWithAllocation(): Boolean = matrixWithAllocation != null

        fun isMatrixWithThresholdDiscounts(): Boolean = matrixWithThresholdDiscounts != null

        fun isTieredWithProration(): Boolean = tieredWithProration != null

        fun isUnitWithProration(): Boolean = unitWithProration != null

        fun isGroupedAllocation(): Boolean = groupedAllocation != null

        fun isBulkWithProration(): Boolean = bulkWithProration != null

        fun isGroupedWithProratedMinimum(): Boolean = groupedWithProratedMinimum != null

        fun isGroupedWithMeteredMinimum(): Boolean = groupedWithMeteredMinimum != null

        fun isGroupedWithMinMaxThresholds(): Boolean = groupedWithMinMaxThresholds != null

        fun isMatrixWithDisplayName(): Boolean = matrixWithDisplayName != null

        fun isGroupedTieredPackage(): Boolean = groupedTieredPackage != null

        fun isMaxGroupTieredPackage(): Boolean = maxGroupTieredPackage != null

        fun isScalableMatrixWithUnitPricing(): Boolean = scalableMatrixWithUnitPricing != null

        fun isScalableMatrixWithTieredPricing(): Boolean = scalableMatrixWithTieredPricing != null

        fun isCumulativeGroupedBulk(): Boolean = cumulativeGroupedBulk != null

        fun isCumulativeGroupedAllocation(): Boolean = cumulativeGroupedAllocation != null

        fun isDailyCreditAllowance(): Boolean = dailyCreditAllowance != null

        fun isMeteredAllowance(): Boolean = meteredAllowance != null

        fun isMinimumComposite(): Boolean = minimumComposite != null

        fun isPercent(): Boolean = percent != null

        fun isEventOutput(): Boolean = eventOutput != null

        fun asUnit(): NewFloatingUnitPrice = unit.getOrThrow("unit")

        fun asTiered(): NewFloatingTieredPrice = tiered.getOrThrow("tiered")

        fun asBulk(): NewFloatingBulkPrice = bulk.getOrThrow("bulk")

        fun asBulkWithFilters(): BulkWithFilters = bulkWithFilters.getOrThrow("bulkWithFilters")

        fun asPackage(): NewFloatingPackagePrice = package_.getOrThrow("package_")

        fun asMatrix(): NewFloatingMatrixPrice = matrix.getOrThrow("matrix")

        fun asThresholdTotalAmount(): NewFloatingThresholdTotalAmountPrice =
            thresholdTotalAmount.getOrThrow("thresholdTotalAmount")

        fun asTieredPackage(): NewFloatingTieredPackagePrice =
            tieredPackage.getOrThrow("tieredPackage")

        fun asTieredWithMinimum(): NewFloatingTieredWithMinimumPrice =
            tieredWithMinimum.getOrThrow("tieredWithMinimum")

        fun asGroupedTiered(): NewFloatingGroupedTieredPrice =
            groupedTiered.getOrThrow("groupedTiered")

        fun asTieredPackageWithMinimum(): NewFloatingTieredPackageWithMinimumPrice =
            tieredPackageWithMinimum.getOrThrow("tieredPackageWithMinimum")

        fun asPackageWithAllocation(): NewFloatingPackageWithAllocationPrice =
            packageWithAllocation.getOrThrow("packageWithAllocation")

        fun asUnitWithPercent(): NewFloatingUnitWithPercentPrice =
            unitWithPercent.getOrThrow("unitWithPercent")

        fun asMatrixWithAllocation(): NewFloatingMatrixWithAllocationPrice =
            matrixWithAllocation.getOrThrow("matrixWithAllocation")

        fun asMatrixWithThresholdDiscounts(): MatrixWithThresholdDiscounts =
            matrixWithThresholdDiscounts.getOrThrow("matrixWithThresholdDiscounts")

        fun asTieredWithProration(): NewFloatingTieredWithProrationPrice =
            tieredWithProration.getOrThrow("tieredWithProration")

        fun asUnitWithProration(): NewFloatingUnitWithProrationPrice =
            unitWithProration.getOrThrow("unitWithProration")

        fun asGroupedAllocation(): NewFloatingGroupedAllocationPrice =
            groupedAllocation.getOrThrow("groupedAllocation")

        fun asBulkWithProration(): NewFloatingBulkWithProrationPrice =
            bulkWithProration.getOrThrow("bulkWithProration")

        fun asGroupedWithProratedMinimum(): NewFloatingGroupedWithProratedMinimumPrice =
            groupedWithProratedMinimum.getOrThrow("groupedWithProratedMinimum")

        fun asGroupedWithMeteredMinimum(): NewFloatingGroupedWithMeteredMinimumPrice =
            groupedWithMeteredMinimum.getOrThrow("groupedWithMeteredMinimum")

        fun asGroupedWithMinMaxThresholds(): GroupedWithMinMaxThresholds =
            groupedWithMinMaxThresholds.getOrThrow("groupedWithMinMaxThresholds")

        fun asMatrixWithDisplayName(): NewFloatingMatrixWithDisplayNamePrice =
            matrixWithDisplayName.getOrThrow("matrixWithDisplayName")

        fun asGroupedTieredPackage(): NewFloatingGroupedTieredPackagePrice =
            groupedTieredPackage.getOrThrow("groupedTieredPackage")

        fun asMaxGroupTieredPackage(): NewFloatingMaxGroupTieredPackagePrice =
            maxGroupTieredPackage.getOrThrow("maxGroupTieredPackage")

        fun asScalableMatrixWithUnitPricing(): NewFloatingScalableMatrixWithUnitPricingPrice =
            scalableMatrixWithUnitPricing.getOrThrow("scalableMatrixWithUnitPricing")

        fun asScalableMatrixWithTieredPricing(): NewFloatingScalableMatrixWithTieredPricingPrice =
            scalableMatrixWithTieredPricing.getOrThrow("scalableMatrixWithTieredPricing")

        fun asCumulativeGroupedBulk(): NewFloatingCumulativeGroupedBulkPrice =
            cumulativeGroupedBulk.getOrThrow("cumulativeGroupedBulk")

        fun asCumulativeGroupedAllocation(): CumulativeGroupedAllocation =
            cumulativeGroupedAllocation.getOrThrow("cumulativeGroupedAllocation")

        fun asDailyCreditAllowance(): DailyCreditAllowance =
            dailyCreditAllowance.getOrThrow("dailyCreditAllowance")

        fun asMeteredAllowance(): MeteredAllowance = meteredAllowance.getOrThrow("meteredAllowance")

        fun asMinimumComposite(): NewFloatingMinimumCompositePrice =
            minimumComposite.getOrThrow("minimumComposite")

        fun asPercent(): Percent = percent.getOrThrow("percent")

        fun asEventOutput(): EventOutput = eventOutput.getOrThrow("eventOutput")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.withorb.api.core.JsonValue
         *
         * val result: String? = body.accept(object : Body.Visitor<String?> {
         *     override fun visitUnit(unit: NewFloatingUnitPrice): String? = unit.toString()
         *
         *     // ...
         *
         *     override fun unknown(json: JsonValue?): String? {
         *         // Or inspect the `json`.
         *         return null
         *     }
         * })
         * ```
         *
         * @throws OrbInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
         *   the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unit != null -> visitor.visitUnit(unit)
                tiered != null -> visitor.visitTiered(tiered)
                bulk != null -> visitor.visitBulk(bulk)
                bulkWithFilters != null -> visitor.visitBulkWithFilters(bulkWithFilters)
                package_ != null -> visitor.visitPackage(package_)
                matrix != null -> visitor.visitMatrix(matrix)
                thresholdTotalAmount != null ->
                    visitor.visitThresholdTotalAmount(thresholdTotalAmount)
                tieredPackage != null -> visitor.visitTieredPackage(tieredPackage)
                tieredWithMinimum != null -> visitor.visitTieredWithMinimum(tieredWithMinimum)
                groupedTiered != null -> visitor.visitGroupedTiered(groupedTiered)
                tieredPackageWithMinimum != null ->
                    visitor.visitTieredPackageWithMinimum(tieredPackageWithMinimum)
                packageWithAllocation != null ->
                    visitor.visitPackageWithAllocation(packageWithAllocation)
                unitWithPercent != null -> visitor.visitUnitWithPercent(unitWithPercent)
                matrixWithAllocation != null ->
                    visitor.visitMatrixWithAllocation(matrixWithAllocation)
                matrixWithThresholdDiscounts != null ->
                    visitor.visitMatrixWithThresholdDiscounts(matrixWithThresholdDiscounts)
                tieredWithProration != null -> visitor.visitTieredWithProration(tieredWithProration)
                unitWithProration != null -> visitor.visitUnitWithProration(unitWithProration)
                groupedAllocation != null -> visitor.visitGroupedAllocation(groupedAllocation)
                bulkWithProration != null -> visitor.visitBulkWithProration(bulkWithProration)
                groupedWithProratedMinimum != null ->
                    visitor.visitGroupedWithProratedMinimum(groupedWithProratedMinimum)
                groupedWithMeteredMinimum != null ->
                    visitor.visitGroupedWithMeteredMinimum(groupedWithMeteredMinimum)
                groupedWithMinMaxThresholds != null ->
                    visitor.visitGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)
                matrixWithDisplayName != null ->
                    visitor.visitMatrixWithDisplayName(matrixWithDisplayName)
                groupedTieredPackage != null ->
                    visitor.visitGroupedTieredPackage(groupedTieredPackage)
                maxGroupTieredPackage != null ->
                    visitor.visitMaxGroupTieredPackage(maxGroupTieredPackage)
                scalableMatrixWithUnitPricing != null ->
                    visitor.visitScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)
                scalableMatrixWithTieredPricing != null ->
                    visitor.visitScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)
                cumulativeGroupedBulk != null ->
                    visitor.visitCumulativeGroupedBulk(cumulativeGroupedBulk)
                cumulativeGroupedAllocation != null ->
                    visitor.visitCumulativeGroupedAllocation(cumulativeGroupedAllocation)
                dailyCreditAllowance != null ->
                    visitor.visitDailyCreditAllowance(dailyCreditAllowance)
                meteredAllowance != null -> visitor.visitMeteredAllowance(meteredAllowance)
                minimumComposite != null -> visitor.visitMinimumComposite(minimumComposite)
                percent != null -> visitor.visitPercent(percent)
                eventOutput != null -> visitor.visitEventOutput(eventOutput)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OrbInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnit(unit: NewFloatingUnitPrice) {
                        unit.validate()
                    }

                    override fun visitTiered(tiered: NewFloatingTieredPrice) {
                        tiered.validate()
                    }

                    override fun visitBulk(bulk: NewFloatingBulkPrice) {
                        bulk.validate()
                    }

                    override fun visitBulkWithFilters(bulkWithFilters: BulkWithFilters) {
                        bulkWithFilters.validate()
                    }

                    override fun visitPackage(package_: NewFloatingPackagePrice) {
                        package_.validate()
                    }

                    override fun visitMatrix(matrix: NewFloatingMatrixPrice) {
                        matrix.validate()
                    }

                    override fun visitThresholdTotalAmount(
                        thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                    ) {
                        thresholdTotalAmount.validate()
                    }

                    override fun visitTieredPackage(tieredPackage: NewFloatingTieredPackagePrice) {
                        tieredPackage.validate()
                    }

                    override fun visitTieredWithMinimum(
                        tieredWithMinimum: NewFloatingTieredWithMinimumPrice
                    ) {
                        tieredWithMinimum.validate()
                    }

                    override fun visitGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice) {
                        groupedTiered.validate()
                    }

                    override fun visitTieredPackageWithMinimum(
                        tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                    ) {
                        tieredPackageWithMinimum.validate()
                    }

                    override fun visitPackageWithAllocation(
                        packageWithAllocation: NewFloatingPackageWithAllocationPrice
                    ) {
                        packageWithAllocation.validate()
                    }

                    override fun visitUnitWithPercent(
                        unitWithPercent: NewFloatingUnitWithPercentPrice
                    ) {
                        unitWithPercent.validate()
                    }

                    override fun visitMatrixWithAllocation(
                        matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                    ) {
                        matrixWithAllocation.validate()
                    }

                    override fun visitMatrixWithThresholdDiscounts(
                        matrixWithThresholdDiscounts: MatrixWithThresholdDiscounts
                    ) {
                        matrixWithThresholdDiscounts.validate()
                    }

                    override fun visitTieredWithProration(
                        tieredWithProration: NewFloatingTieredWithProrationPrice
                    ) {
                        tieredWithProration.validate()
                    }

                    override fun visitUnitWithProration(
                        unitWithProration: NewFloatingUnitWithProrationPrice
                    ) {
                        unitWithProration.validate()
                    }

                    override fun visitGroupedAllocation(
                        groupedAllocation: NewFloatingGroupedAllocationPrice
                    ) {
                        groupedAllocation.validate()
                    }

                    override fun visitBulkWithProration(
                        bulkWithProration: NewFloatingBulkWithProrationPrice
                    ) {
                        bulkWithProration.validate()
                    }

                    override fun visitGroupedWithProratedMinimum(
                        groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                    ) {
                        groupedWithProratedMinimum.validate()
                    }

                    override fun visitGroupedWithMeteredMinimum(
                        groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                    ) {
                        groupedWithMeteredMinimum.validate()
                    }

                    override fun visitGroupedWithMinMaxThresholds(
                        groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                    ) {
                        groupedWithMinMaxThresholds.validate()
                    }

                    override fun visitMatrixWithDisplayName(
                        matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                    ) {
                        matrixWithDisplayName.validate()
                    }

                    override fun visitGroupedTieredPackage(
                        groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                    ) {
                        groupedTieredPackage.validate()
                    }

                    override fun visitMaxGroupTieredPackage(
                        maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                    ) {
                        maxGroupTieredPackage.validate()
                    }

                    override fun visitScalableMatrixWithUnitPricing(
                        scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
                    ) {
                        scalableMatrixWithUnitPricing.validate()
                    }

                    override fun visitScalableMatrixWithTieredPricing(
                        scalableMatrixWithTieredPricing:
                            NewFloatingScalableMatrixWithTieredPricingPrice
                    ) {
                        scalableMatrixWithTieredPricing.validate()
                    }

                    override fun visitCumulativeGroupedBulk(
                        cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                    ) {
                        cumulativeGroupedBulk.validate()
                    }

                    override fun visitCumulativeGroupedAllocation(
                        cumulativeGroupedAllocation: CumulativeGroupedAllocation
                    ) {
                        cumulativeGroupedAllocation.validate()
                    }

                    override fun visitDailyCreditAllowance(
                        dailyCreditAllowance: DailyCreditAllowance
                    ) {
                        dailyCreditAllowance.validate()
                    }

                    override fun visitMeteredAllowance(meteredAllowance: MeteredAllowance) {
                        meteredAllowance.validate()
                    }

                    override fun visitMinimumComposite(
                        minimumComposite: NewFloatingMinimumCompositePrice
                    ) {
                        minimumComposite.validate()
                    }

                    override fun visitPercent(percent: Percent) {
                        percent.validate()
                    }

                    override fun visitEventOutput(eventOutput: EventOutput) {
                        eventOutput.validate()
                    }
                }
            )
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitUnit(unit: NewFloatingUnitPrice) = unit.validity()

                    override fun visitTiered(tiered: NewFloatingTieredPrice) = tiered.validity()

                    override fun visitBulk(bulk: NewFloatingBulkPrice) = bulk.validity()

                    override fun visitBulkWithFilters(bulkWithFilters: BulkWithFilters) =
                        bulkWithFilters.validity()

                    override fun visitPackage(package_: NewFloatingPackagePrice) =
                        package_.validity()

                    override fun visitMatrix(matrix: NewFloatingMatrixPrice) = matrix.validity()

                    override fun visitThresholdTotalAmount(
                        thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                    ) = thresholdTotalAmount.validity()

                    override fun visitTieredPackage(tieredPackage: NewFloatingTieredPackagePrice) =
                        tieredPackage.validity()

                    override fun visitTieredWithMinimum(
                        tieredWithMinimum: NewFloatingTieredWithMinimumPrice
                    ) = tieredWithMinimum.validity()

                    override fun visitGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice) =
                        groupedTiered.validity()

                    override fun visitTieredPackageWithMinimum(
                        tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                    ) = tieredPackageWithMinimum.validity()

                    override fun visitPackageWithAllocation(
                        packageWithAllocation: NewFloatingPackageWithAllocationPrice
                    ) = packageWithAllocation.validity()

                    override fun visitUnitWithPercent(
                        unitWithPercent: NewFloatingUnitWithPercentPrice
                    ) = unitWithPercent.validity()

                    override fun visitMatrixWithAllocation(
                        matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                    ) = matrixWithAllocation.validity()

                    override fun visitMatrixWithThresholdDiscounts(
                        matrixWithThresholdDiscounts: MatrixWithThresholdDiscounts
                    ) = matrixWithThresholdDiscounts.validity()

                    override fun visitTieredWithProration(
                        tieredWithProration: NewFloatingTieredWithProrationPrice
                    ) = tieredWithProration.validity()

                    override fun visitUnitWithProration(
                        unitWithProration: NewFloatingUnitWithProrationPrice
                    ) = unitWithProration.validity()

                    override fun visitGroupedAllocation(
                        groupedAllocation: NewFloatingGroupedAllocationPrice
                    ) = groupedAllocation.validity()

                    override fun visitBulkWithProration(
                        bulkWithProration: NewFloatingBulkWithProrationPrice
                    ) = bulkWithProration.validity()

                    override fun visitGroupedWithProratedMinimum(
                        groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                    ) = groupedWithProratedMinimum.validity()

                    override fun visitGroupedWithMeteredMinimum(
                        groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                    ) = groupedWithMeteredMinimum.validity()

                    override fun visitGroupedWithMinMaxThresholds(
                        groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                    ) = groupedWithMinMaxThresholds.validity()

                    override fun visitMatrixWithDisplayName(
                        matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                    ) = matrixWithDisplayName.validity()

                    override fun visitGroupedTieredPackage(
                        groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                    ) = groupedTieredPackage.validity()

                    override fun visitMaxGroupTieredPackage(
                        maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                    ) = maxGroupTieredPackage.validity()

                    override fun visitScalableMatrixWithUnitPricing(
                        scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
                    ) = scalableMatrixWithUnitPricing.validity()

                    override fun visitScalableMatrixWithTieredPricing(
                        scalableMatrixWithTieredPricing:
                            NewFloatingScalableMatrixWithTieredPricingPrice
                    ) = scalableMatrixWithTieredPricing.validity()

                    override fun visitCumulativeGroupedBulk(
                        cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                    ) = cumulativeGroupedBulk.validity()

                    override fun visitCumulativeGroupedAllocation(
                        cumulativeGroupedAllocation: CumulativeGroupedAllocation
                    ) = cumulativeGroupedAllocation.validity()

                    override fun visitDailyCreditAllowance(
                        dailyCreditAllowance: DailyCreditAllowance
                    ) = dailyCreditAllowance.validity()

                    override fun visitMeteredAllowance(meteredAllowance: MeteredAllowance) =
                        meteredAllowance.validity()

                    override fun visitMinimumComposite(
                        minimumComposite: NewFloatingMinimumCompositePrice
                    ) = minimumComposite.validity()

                    override fun visitPercent(percent: Percent) = percent.validity()

                    override fun visitEventOutput(eventOutput: EventOutput) = eventOutput.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                unit == other.unit &&
                tiered == other.tiered &&
                bulk == other.bulk &&
                bulkWithFilters == other.bulkWithFilters &&
                package_ == other.package_ &&
                matrix == other.matrix &&
                thresholdTotalAmount == other.thresholdTotalAmount &&
                tieredPackage == other.tieredPackage &&
                tieredWithMinimum == other.tieredWithMinimum &&
                groupedTiered == other.groupedTiered &&
                tieredPackageWithMinimum == other.tieredPackageWithMinimum &&
                packageWithAllocation == other.packageWithAllocation &&
                unitWithPercent == other.unitWithPercent &&
                matrixWithAllocation == other.matrixWithAllocation &&
                matrixWithThresholdDiscounts == other.matrixWithThresholdDiscounts &&
                tieredWithProration == other.tieredWithProration &&
                unitWithProration == other.unitWithProration &&
                groupedAllocation == other.groupedAllocation &&
                bulkWithProration == other.bulkWithProration &&
                groupedWithProratedMinimum == other.groupedWithProratedMinimum &&
                groupedWithMeteredMinimum == other.groupedWithMeteredMinimum &&
                groupedWithMinMaxThresholds == other.groupedWithMinMaxThresholds &&
                matrixWithDisplayName == other.matrixWithDisplayName &&
                groupedTieredPackage == other.groupedTieredPackage &&
                maxGroupTieredPackage == other.maxGroupTieredPackage &&
                scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing &&
                scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing &&
                cumulativeGroupedBulk == other.cumulativeGroupedBulk &&
                cumulativeGroupedAllocation == other.cumulativeGroupedAllocation &&
                dailyCreditAllowance == other.dailyCreditAllowance &&
                meteredAllowance == other.meteredAllowance &&
                minimumComposite == other.minimumComposite &&
                percent == other.percent &&
                eventOutput == other.eventOutput
        }

        override fun hashCode(): Int =
            Objects.hash(
                unit,
                tiered,
                bulk,
                bulkWithFilters,
                package_,
                matrix,
                thresholdTotalAmount,
                tieredPackage,
                tieredWithMinimum,
                groupedTiered,
                tieredPackageWithMinimum,
                packageWithAllocation,
                unitWithPercent,
                matrixWithAllocation,
                matrixWithThresholdDiscounts,
                tieredWithProration,
                unitWithProration,
                groupedAllocation,
                bulkWithProration,
                groupedWithProratedMinimum,
                groupedWithMeteredMinimum,
                groupedWithMinMaxThresholds,
                matrixWithDisplayName,
                groupedTieredPackage,
                maxGroupTieredPackage,
                scalableMatrixWithUnitPricing,
                scalableMatrixWithTieredPricing,
                cumulativeGroupedBulk,
                cumulativeGroupedAllocation,
                dailyCreditAllowance,
                meteredAllowance,
                minimumComposite,
                percent,
                eventOutput,
            )

        override fun toString(): String =
            when {
                unit != null -> "Body{unit=$unit}"
                tiered != null -> "Body{tiered=$tiered}"
                bulk != null -> "Body{bulk=$bulk}"
                bulkWithFilters != null -> "Body{bulkWithFilters=$bulkWithFilters}"
                package_ != null -> "Body{package_=$package_}"
                matrix != null -> "Body{matrix=$matrix}"
                thresholdTotalAmount != null -> "Body{thresholdTotalAmount=$thresholdTotalAmount}"
                tieredPackage != null -> "Body{tieredPackage=$tieredPackage}"
                tieredWithMinimum != null -> "Body{tieredWithMinimum=$tieredWithMinimum}"
                groupedTiered != null -> "Body{groupedTiered=$groupedTiered}"
                tieredPackageWithMinimum != null ->
                    "Body{tieredPackageWithMinimum=$tieredPackageWithMinimum}"
                packageWithAllocation != null ->
                    "Body{packageWithAllocation=$packageWithAllocation}"
                unitWithPercent != null -> "Body{unitWithPercent=$unitWithPercent}"
                matrixWithAllocation != null -> "Body{matrixWithAllocation=$matrixWithAllocation}"
                matrixWithThresholdDiscounts != null ->
                    "Body{matrixWithThresholdDiscounts=$matrixWithThresholdDiscounts}"
                tieredWithProration != null -> "Body{tieredWithProration=$tieredWithProration}"
                unitWithProration != null -> "Body{unitWithProration=$unitWithProration}"
                groupedAllocation != null -> "Body{groupedAllocation=$groupedAllocation}"
                bulkWithProration != null -> "Body{bulkWithProration=$bulkWithProration}"
                groupedWithProratedMinimum != null ->
                    "Body{groupedWithProratedMinimum=$groupedWithProratedMinimum}"
                groupedWithMeteredMinimum != null ->
                    "Body{groupedWithMeteredMinimum=$groupedWithMeteredMinimum}"
                groupedWithMinMaxThresholds != null ->
                    "Body{groupedWithMinMaxThresholds=$groupedWithMinMaxThresholds}"
                matrixWithDisplayName != null ->
                    "Body{matrixWithDisplayName=$matrixWithDisplayName}"
                groupedTieredPackage != null -> "Body{groupedTieredPackage=$groupedTieredPackage}"
                maxGroupTieredPackage != null ->
                    "Body{maxGroupTieredPackage=$maxGroupTieredPackage}"
                scalableMatrixWithUnitPricing != null ->
                    "Body{scalableMatrixWithUnitPricing=$scalableMatrixWithUnitPricing}"
                scalableMatrixWithTieredPricing != null ->
                    "Body{scalableMatrixWithTieredPricing=$scalableMatrixWithTieredPricing}"
                cumulativeGroupedBulk != null ->
                    "Body{cumulativeGroupedBulk=$cumulativeGroupedBulk}"
                cumulativeGroupedAllocation != null ->
                    "Body{cumulativeGroupedAllocation=$cumulativeGroupedAllocation}"
                dailyCreditAllowance != null -> "Body{dailyCreditAllowance=$dailyCreditAllowance}"
                meteredAllowance != null -> "Body{meteredAllowance=$meteredAllowance}"
                minimumComposite != null -> "Body{minimumComposite=$minimumComposite}"
                percent != null -> "Body{percent=$percent}"
                eventOutput != null -> "Body{eventOutput=$eventOutput}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            fun ofUnit(unit: NewFloatingUnitPrice) = Body(unit = unit)

            fun ofTiered(tiered: NewFloatingTieredPrice) = Body(tiered = tiered)

            fun ofBulk(bulk: NewFloatingBulkPrice) = Body(bulk = bulk)

            fun ofBulkWithFilters(bulkWithFilters: BulkWithFilters) =
                Body(bulkWithFilters = bulkWithFilters)

            fun ofPackage(package_: NewFloatingPackagePrice) = Body(package_ = package_)

            fun ofMatrix(matrix: NewFloatingMatrixPrice) = Body(matrix = matrix)

            fun ofThresholdTotalAmount(thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice) =
                Body(thresholdTotalAmount = thresholdTotalAmount)

            fun ofTieredPackage(tieredPackage: NewFloatingTieredPackagePrice) =
                Body(tieredPackage = tieredPackage)

            fun ofTieredWithMinimum(tieredWithMinimum: NewFloatingTieredWithMinimumPrice) =
                Body(tieredWithMinimum = tieredWithMinimum)

            fun ofGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice) =
                Body(groupedTiered = groupedTiered)

            fun ofTieredPackageWithMinimum(
                tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
            ) = Body(tieredPackageWithMinimum = tieredPackageWithMinimum)

            fun ofPackageWithAllocation(
                packageWithAllocation: NewFloatingPackageWithAllocationPrice
            ) = Body(packageWithAllocation = packageWithAllocation)

            fun ofUnitWithPercent(unitWithPercent: NewFloatingUnitWithPercentPrice) =
                Body(unitWithPercent = unitWithPercent)

            fun ofMatrixWithAllocation(matrixWithAllocation: NewFloatingMatrixWithAllocationPrice) =
                Body(matrixWithAllocation = matrixWithAllocation)

            fun ofMatrixWithThresholdDiscounts(
                matrixWithThresholdDiscounts: MatrixWithThresholdDiscounts
            ) = Body(matrixWithThresholdDiscounts = matrixWithThresholdDiscounts)

            fun ofTieredWithProration(tieredWithProration: NewFloatingTieredWithProrationPrice) =
                Body(tieredWithProration = tieredWithProration)

            fun ofUnitWithProration(unitWithProration: NewFloatingUnitWithProrationPrice) =
                Body(unitWithProration = unitWithProration)

            fun ofGroupedAllocation(groupedAllocation: NewFloatingGroupedAllocationPrice) =
                Body(groupedAllocation = groupedAllocation)

            fun ofBulkWithProration(bulkWithProration: NewFloatingBulkWithProrationPrice) =
                Body(bulkWithProration = bulkWithProration)

            fun ofGroupedWithProratedMinimum(
                groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
            ) = Body(groupedWithProratedMinimum = groupedWithProratedMinimum)

            fun ofGroupedWithMeteredMinimum(
                groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
            ) = Body(groupedWithMeteredMinimum = groupedWithMeteredMinimum)

            fun ofGroupedWithMinMaxThresholds(
                groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
            ) = Body(groupedWithMinMaxThresholds = groupedWithMinMaxThresholds)

            fun ofMatrixWithDisplayName(
                matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
            ) = Body(matrixWithDisplayName = matrixWithDisplayName)

            fun ofGroupedTieredPackage(groupedTieredPackage: NewFloatingGroupedTieredPackagePrice) =
                Body(groupedTieredPackage = groupedTieredPackage)

            fun ofMaxGroupTieredPackage(
                maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
            ) = Body(maxGroupTieredPackage = maxGroupTieredPackage)

            fun ofScalableMatrixWithUnitPricing(
                scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
            ) = Body(scalableMatrixWithUnitPricing = scalableMatrixWithUnitPricing)

            fun ofScalableMatrixWithTieredPricing(
                scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice
            ) = Body(scalableMatrixWithTieredPricing = scalableMatrixWithTieredPricing)

            fun ofCumulativeGroupedBulk(
                cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
            ) = Body(cumulativeGroupedBulk = cumulativeGroupedBulk)

            fun ofCumulativeGroupedAllocation(
                cumulativeGroupedAllocation: CumulativeGroupedAllocation
            ) = Body(cumulativeGroupedAllocation = cumulativeGroupedAllocation)

            fun ofDailyCreditAllowance(dailyCreditAllowance: DailyCreditAllowance) =
                Body(dailyCreditAllowance = dailyCreditAllowance)

            fun ofMeteredAllowance(meteredAllowance: MeteredAllowance) =
                Body(meteredAllowance = meteredAllowance)

            fun ofMinimumComposite(minimumComposite: NewFloatingMinimumCompositePrice) =
                Body(minimumComposite = minimumComposite)

            fun ofPercent(percent: Percent) = Body(percent = percent)

            fun ofEventOutput(eventOutput: EventOutput) = Body(eventOutput = eventOutput)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitUnit(unit: NewFloatingUnitPrice): T

            fun visitTiered(tiered: NewFloatingTieredPrice): T

            fun visitBulk(bulk: NewFloatingBulkPrice): T

            fun visitBulkWithFilters(bulkWithFilters: BulkWithFilters): T

            fun visitPackage(package_: NewFloatingPackagePrice): T

            fun visitMatrix(matrix: NewFloatingMatrixPrice): T

            fun visitThresholdTotalAmount(
                thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
            ): T

            fun visitTieredPackage(tieredPackage: NewFloatingTieredPackagePrice): T

            fun visitTieredWithMinimum(tieredWithMinimum: NewFloatingTieredWithMinimumPrice): T

            fun visitGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice): T

            fun visitTieredPackageWithMinimum(
                tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
            ): T

            fun visitPackageWithAllocation(
                packageWithAllocation: NewFloatingPackageWithAllocationPrice
            ): T

            fun visitUnitWithPercent(unitWithPercent: NewFloatingUnitWithPercentPrice): T

            fun visitMatrixWithAllocation(
                matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
            ): T

            fun visitMatrixWithThresholdDiscounts(
                matrixWithThresholdDiscounts: MatrixWithThresholdDiscounts
            ): T

            fun visitTieredWithProration(
                tieredWithProration: NewFloatingTieredWithProrationPrice
            ): T

            fun visitUnitWithProration(unitWithProration: NewFloatingUnitWithProrationPrice): T

            fun visitGroupedAllocation(groupedAllocation: NewFloatingGroupedAllocationPrice): T

            fun visitBulkWithProration(bulkWithProration: NewFloatingBulkWithProrationPrice): T

            fun visitGroupedWithProratedMinimum(
                groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
            ): T

            fun visitGroupedWithMeteredMinimum(
                groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
            ): T

            fun visitGroupedWithMinMaxThresholds(
                groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
            ): T

            fun visitMatrixWithDisplayName(
                matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
            ): T

            fun visitGroupedTieredPackage(
                groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
            ): T

            fun visitMaxGroupTieredPackage(
                maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
            ): T

            fun visitScalableMatrixWithUnitPricing(
                scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
            ): T

            fun visitScalableMatrixWithTieredPricing(
                scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice
            ): T

            fun visitCumulativeGroupedBulk(
                cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
            ): T

            fun visitCumulativeGroupedAllocation(
                cumulativeGroupedAllocation: CumulativeGroupedAllocation
            ): T

            fun visitDailyCreditAllowance(dailyCreditAllowance: DailyCreditAllowance): T

            fun visitMeteredAllowance(meteredAllowance: MeteredAllowance): T

            fun visitMinimumComposite(minimumComposite: NewFloatingMinimumCompositePrice): T

            fun visitPercent(percent: Percent): T

            fun visitEventOutput(eventOutput: EventOutput): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)
                val modelType = json.asObject()?.get("model_type")?.asString()

                when (modelType) {
                    "unit" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingUnitPrice>())?.let {
                            Body(unit = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "tiered" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingTieredPrice>())?.let {
                            Body(tiered = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "bulk" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingBulkPrice>())?.let {
                            Body(bulk = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "bulk_with_filters" -> {
                        return tryDeserialize(node, jacksonTypeRef<BulkWithFilters>())?.let {
                            Body(bulkWithFilters = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "package" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingPackagePrice>())
                            ?.let { Body(package_ = it, _json = json) } ?: Body(_json = json)
                    }
                    "matrix" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingMatrixPrice>())?.let {
                            Body(matrix = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "threshold_total_amount" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingThresholdTotalAmountPrice>(),
                            )
                            ?.let { Body(thresholdTotalAmount = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "tiered_package" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingTieredPackagePrice>())
                            ?.let { Body(tieredPackage = it, _json = json) } ?: Body(_json = json)
                    }
                    "tiered_with_minimum" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingTieredWithMinimumPrice>(),
                            )
                            ?.let { Body(tieredWithMinimum = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "grouped_tiered" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingGroupedTieredPrice>())
                            ?.let { Body(groupedTiered = it, _json = json) } ?: Body(_json = json)
                    }
                    "tiered_package_with_minimum" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingTieredPackageWithMinimumPrice>(),
                            )
                            ?.let { Body(tieredPackageWithMinimum = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "package_with_allocation" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingPackageWithAllocationPrice>(),
                            )
                            ?.let { Body(packageWithAllocation = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "unit_with_percent" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingUnitWithPercentPrice>(),
                            )
                            ?.let { Body(unitWithPercent = it, _json = json) } ?: Body(_json = json)
                    }
                    "matrix_with_allocation" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingMatrixWithAllocationPrice>(),
                            )
                            ?.let { Body(matrixWithAllocation = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "matrix_with_threshold_discounts" -> {
                        return tryDeserialize(node, jacksonTypeRef<MatrixWithThresholdDiscounts>())
                            ?.let { Body(matrixWithThresholdDiscounts = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "tiered_with_proration" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingTieredWithProrationPrice>(),
                            )
                            ?.let { Body(tieredWithProration = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "unit_with_proration" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingUnitWithProrationPrice>(),
                            )
                            ?.let { Body(unitWithProration = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "grouped_allocation" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingGroupedAllocationPrice>(),
                            )
                            ?.let { Body(groupedAllocation = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "bulk_with_proration" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingBulkWithProrationPrice>(),
                            )
                            ?.let { Body(bulkWithProration = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "grouped_with_prorated_minimum" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingGroupedWithProratedMinimumPrice>(),
                            )
                            ?.let { Body(groupedWithProratedMinimum = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "grouped_with_metered_minimum" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingGroupedWithMeteredMinimumPrice>(),
                            )
                            ?.let { Body(groupedWithMeteredMinimum = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "grouped_with_min_max_thresholds" -> {
                        return tryDeserialize(node, jacksonTypeRef<GroupedWithMinMaxThresholds>())
                            ?.let { Body(groupedWithMinMaxThresholds = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "matrix_with_display_name" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingMatrixWithDisplayNamePrice>(),
                            )
                            ?.let { Body(matrixWithDisplayName = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "grouped_tiered_package" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingGroupedTieredPackagePrice>(),
                            )
                            ?.let { Body(groupedTieredPackage = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "max_group_tiered_package" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingMaxGroupTieredPackagePrice>(),
                            )
                            ?.let { Body(maxGroupTieredPackage = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "scalable_matrix_with_unit_pricing" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingScalableMatrixWithUnitPricingPrice>(),
                            )
                            ?.let { Body(scalableMatrixWithUnitPricing = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "scalable_matrix_with_tiered_pricing" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingScalableMatrixWithTieredPricingPrice>(),
                            )
                            ?.let { Body(scalableMatrixWithTieredPricing = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "cumulative_grouped_bulk" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingCumulativeGroupedBulkPrice>(),
                            )
                            ?.let { Body(cumulativeGroupedBulk = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "cumulative_grouped_allocation" -> {
                        return tryDeserialize(node, jacksonTypeRef<CumulativeGroupedAllocation>())
                            ?.let { Body(cumulativeGroupedAllocation = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "daily_credit_allowance" -> {
                        return tryDeserialize(node, jacksonTypeRef<DailyCreditAllowance>())?.let {
                            Body(dailyCreditAllowance = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "metered_allowance" -> {
                        return tryDeserialize(node, jacksonTypeRef<MeteredAllowance>())?.let {
                            Body(meteredAllowance = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "minimum_composite" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingMinimumCompositePrice>(),
                            )
                            ?.let { Body(minimumComposite = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "percent" -> {
                        return tryDeserialize(node, jacksonTypeRef<Percent>())?.let {
                            Body(percent = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "event_output" -> {
                        return tryDeserialize(node, jacksonTypeRef<EventOutput>())?.let {
                            Body(eventOutput = it, _json = json)
                        } ?: Body(_json = json)
                    }
                }

                return Body(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unit != null -> generator.writeObject(value.unit)
                    value.tiered != null -> generator.writeObject(value.tiered)
                    value.bulk != null -> generator.writeObject(value.bulk)
                    value.bulkWithFilters != null -> generator.writeObject(value.bulkWithFilters)
                    value.package_ != null -> generator.writeObject(value.package_)
                    value.matrix != null -> generator.writeObject(value.matrix)
                    value.thresholdTotalAmount != null ->
                        generator.writeObject(value.thresholdTotalAmount)
                    value.tieredPackage != null -> generator.writeObject(value.tieredPackage)
                    value.tieredWithMinimum != null ->
                        generator.writeObject(value.tieredWithMinimum)
                    value.groupedTiered != null -> generator.writeObject(value.groupedTiered)
                    value.tieredPackageWithMinimum != null ->
                        generator.writeObject(value.tieredPackageWithMinimum)
                    value.packageWithAllocation != null ->
                        generator.writeObject(value.packageWithAllocation)
                    value.unitWithPercent != null -> generator.writeObject(value.unitWithPercent)
                    value.matrixWithAllocation != null ->
                        generator.writeObject(value.matrixWithAllocation)
                    value.matrixWithThresholdDiscounts != null ->
                        generator.writeObject(value.matrixWithThresholdDiscounts)
                    value.tieredWithProration != null ->
                        generator.writeObject(value.tieredWithProration)
                    value.unitWithProration != null ->
                        generator.writeObject(value.unitWithProration)
                    value.groupedAllocation != null ->
                        generator.writeObject(value.groupedAllocation)
                    value.bulkWithProration != null ->
                        generator.writeObject(value.bulkWithProration)
                    value.groupedWithProratedMinimum != null ->
                        generator.writeObject(value.groupedWithProratedMinimum)
                    value.groupedWithMeteredMinimum != null ->
                        generator.writeObject(value.groupedWithMeteredMinimum)
                    value.groupedWithMinMaxThresholds != null ->
                        generator.writeObject(value.groupedWithMinMaxThresholds)
                    value.matrixWithDisplayName != null ->
                        generator.writeObject(value.matrixWithDisplayName)
                    value.groupedTieredPackage != null ->
                        generator.writeObject(value.groupedTieredPackage)
                    value.maxGroupTieredPackage != null ->
                        generator.writeObject(value.maxGroupTieredPackage)
                    value.scalableMatrixWithUnitPricing != null ->
                        generator.writeObject(value.scalableMatrixWithUnitPricing)
                    value.scalableMatrixWithTieredPricing != null ->
                        generator.writeObject(value.scalableMatrixWithTieredPricing)
                    value.cumulativeGroupedBulk != null ->
                        generator.writeObject(value.cumulativeGroupedBulk)
                    value.cumulativeGroupedAllocation != null ->
                        generator.writeObject(value.cumulativeGroupedAllocation)
                    value.dailyCreditAllowance != null ->
                        generator.writeObject(value.dailyCreditAllowance)
                    value.meteredAllowance != null -> generator.writeObject(value.meteredAllowance)
                    value.minimumComposite != null -> generator.writeObject(value.minimumComposite)
                    value.percent != null -> generator.writeObject(value.percent)
                    value.eventOutput != null -> generator.writeObject(value.eventOutput)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class BulkWithFilters
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val bulkWithFiltersConfig: JsonField<BulkWithFiltersConfig>,
            private val cadence: JsonField<Cadence>,
            private val currency: JsonField<String>,
            private val itemId: JsonField<String>,
            private val modelType: JsonValue,
            private val name: JsonField<String>,
            private val billableMetricId: JsonField<String>,
            private val billedInAdvance: JsonField<Boolean>,
            private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val conversionRate: JsonField<Double>,
            private val conversionRateConfig: JsonField<ConversionRateConfig>,
            private val dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>,
            private val externalPriceId: JsonField<String>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val invoiceGroupingKey: JsonField<String>,
            private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val licenseTypeId: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bulk_with_filters_config")
                @ExcludeMissing
                bulkWithFiltersConfig: JsonField<BulkWithFiltersConfig> = JsonMissing.of(),
                @JsonProperty("cadence")
                @ExcludeMissing
                cadence: JsonField<Cadence> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("item_id")
                @ExcludeMissing
                itemId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model_type") @ExcludeMissing modelType: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                billableMetricId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                conversionRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("external_price_id")
                @ExcludeMissing
                externalPriceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("license_type_id")
                @ExcludeMissing
                licenseTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(
                bulkWithFiltersConfig,
                cadence,
                currency,
                itemId,
                modelType,
                name,
                billableMetricId,
                billedInAdvance,
                billingCycleConfiguration,
                conversionRate,
                conversionRateConfig,
                dimensionalPriceConfiguration,
                externalPriceId,
                fixedPriceQuantity,
                invoiceGroupingKey,
                invoicingCycleConfiguration,
                licenseTypeId,
                metadata,
                mutableMapOf(),
            )

            /**
             * Configuration for bulk_with_filters pricing
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bulkWithFiltersConfig(): BulkWithFiltersConfig =
                bulkWithFiltersConfig.getRequired("bulk_with_filters_config")

            /**
             * The cadence to bill for this price on.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cadence(): Cadence = cadence.getRequired("cadence")

            /**
             * An ISO 4217 currency string for which this price is billed in.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * The id of the item the price will be associated with.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun itemId(): String = itemId.getRequired("item_id")

            /**
             * The pricing model type
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("bulk_with_filters")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

            /**
             * The name of the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                billingCycleConfiguration.getNullable("billing_cycle_configuration")

            /**
             * The per unit conversion rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /**
             * The configuration for the rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRateConfig(): ConversionRateConfig? =
                conversionRateConfig.getNullable("conversion_rate_config")

            /**
             * For dimensional price: specifies a price group and dimension values
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

            /**
             * An alias for the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            /**
             * The property used to group this price on an invoice
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoiceGroupingKey(): String? =
                invoiceGroupingKey.getNullable("invoice_grouping_key")

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

            /**
             * The ID of the license type to associate with this price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun licenseTypeId(): String? = licenseTypeId.getNullable("license_type_id")

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Returns the raw JSON value of [bulkWithFiltersConfig].
             *
             * Unlike [bulkWithFiltersConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("bulk_with_filters_config")
            @ExcludeMissing
            fun _bulkWithFiltersConfig(): JsonField<BulkWithFiltersConfig> = bulkWithFiltersConfig

            /**
             * Returns the raw JSON value of [cadence].
             *
             * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [itemId].
             *
             * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [billableMetricId].
             *
             * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billable_metric_id")
            @ExcludeMissing
            fun _billableMetricId(): JsonField<String> = billableMetricId

            /**
             * Returns the raw JSON value of [billedInAdvance].
             *
             * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billed_in_advance")
            @ExcludeMissing
            fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

            /**
             * Returns the raw JSON value of [billingCycleConfiguration].
             *
             * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("billing_cycle_configuration")
            @ExcludeMissing
            fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                billingCycleConfiguration

            /**
             * Returns the raw JSON value of [conversionRate].
             *
             * Unlike [conversionRate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun _conversionRate(): JsonField<Double> = conversionRate

            /**
             * Returns the raw JSON value of [conversionRateConfig].
             *
             * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate_config")
            @ExcludeMissing
            fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

            /**
             * Returns the raw JSON value of [dimensionalPriceConfiguration].
             *
             * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("dimensional_price_configuration")
            @ExcludeMissing
            fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                dimensionalPriceConfiguration

            /**
             * Returns the raw JSON value of [externalPriceId].
             *
             * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun _externalPriceId(): JsonField<String> = externalPriceId

            /**
             * Returns the raw JSON value of [fixedPriceQuantity].
             *
             * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

            /**
             * Returns the raw JSON value of [invoiceGroupingKey].
             *
             * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invoice_grouping_key")
            @ExcludeMissing
            fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

            /**
             * Returns the raw JSON value of [invoicingCycleConfiguration].
             *
             * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("invoicing_cycle_configuration")
            @ExcludeMissing
            fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                invoicingCycleConfiguration

            /**
             * Returns the raw JSON value of [licenseTypeId].
             *
             * Unlike [licenseTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("license_type_id")
            @ExcludeMissing
            fun _licenseTypeId(): JsonField<String> = licenseTypeId

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * Returns a mutable builder for constructing an instance of [BulkWithFilters].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .bulkWithFiltersConfig()
                 * .cadence()
                 * .currency()
                 * .itemId()
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [BulkWithFilters]. */
            class Builder internal constructor() {

                private var bulkWithFiltersConfig: JsonField<BulkWithFiltersConfig>? = null
                private var cadence: JsonField<Cadence>? = null
                private var currency: JsonField<String>? = null
                private var itemId: JsonField<String>? = null
                private var modelType: JsonValue = JsonValue.from("bulk_with_filters")
                private var name: JsonField<String>? = null
                private var billableMetricId: JsonField<String> = JsonMissing.of()
                private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of()
                private var dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of()
                private var externalPriceId: JsonField<String> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                private var invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var licenseTypeId: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bulkWithFilters: BulkWithFilters) = apply {
                    bulkWithFiltersConfig = bulkWithFilters.bulkWithFiltersConfig
                    cadence = bulkWithFilters.cadence
                    currency = bulkWithFilters.currency
                    itemId = bulkWithFilters.itemId
                    modelType = bulkWithFilters.modelType
                    name = bulkWithFilters.name
                    billableMetricId = bulkWithFilters.billableMetricId
                    billedInAdvance = bulkWithFilters.billedInAdvance
                    billingCycleConfiguration = bulkWithFilters.billingCycleConfiguration
                    conversionRate = bulkWithFilters.conversionRate
                    conversionRateConfig = bulkWithFilters.conversionRateConfig
                    dimensionalPriceConfiguration = bulkWithFilters.dimensionalPriceConfiguration
                    externalPriceId = bulkWithFilters.externalPriceId
                    fixedPriceQuantity = bulkWithFilters.fixedPriceQuantity
                    invoiceGroupingKey = bulkWithFilters.invoiceGroupingKey
                    invoicingCycleConfiguration = bulkWithFilters.invoicingCycleConfiguration
                    licenseTypeId = bulkWithFilters.licenseTypeId
                    metadata = bulkWithFilters.metadata
                    additionalProperties = bulkWithFilters.additionalProperties.toMutableMap()
                }

                /** Configuration for bulk_with_filters pricing */
                fun bulkWithFiltersConfig(bulkWithFiltersConfig: BulkWithFiltersConfig) =
                    bulkWithFiltersConfig(JsonField.of(bulkWithFiltersConfig))

                /**
                 * Sets [Builder.bulkWithFiltersConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bulkWithFiltersConfig] with a well-typed
                 * [BulkWithFiltersConfig] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun bulkWithFiltersConfig(bulkWithFiltersConfig: JsonField<BulkWithFiltersConfig>) =
                    apply {
                        this.bulkWithFiltersConfig = bulkWithFiltersConfig
                    }

                /** The cadence to bill for this price on. */
                fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                /**
                 * Sets [Builder.cadence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The id of the item the price will be associated with. */
                fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                /**
                 * Sets [Builder.itemId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.itemId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("bulk_with_filters")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                /** The name of the price. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(billableMetricId: String?) =
                    billableMetricId(JsonField.ofNullable(billableMetricId))

                /**
                 * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billableMetricId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                    this.billableMetricId = billableMetricId
                }

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(billedInAdvance: Boolean?) =
                    billedInAdvance(JsonField.ofNullable(billedInAdvance))

                /**
                 * Alias for [Builder.billedInAdvance].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun billedInAdvance(billedInAdvance: Boolean) =
                    billedInAdvance(billedInAdvance as Boolean?)

                /**
                 * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                    this.billedInAdvance = billedInAdvance
                }

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: NewBillingCycleConfiguration?
                ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                /**
                 * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double?) =
                    conversionRate(JsonField.ofNullable(conversionRate))

                /**
                 * Alias for [Builder.conversionRate].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(conversionRate as Double?)

                /**
                 * Sets [Builder.conversionRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRate] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 */
                fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                    conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                /**
                 * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRateConfig] with a well-typed
                 * [ConversionRateConfig] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun conversionRateConfig(conversionRateConfig: JsonField<ConversionRateConfig>) =
                    apply {
                        this.conversionRateConfig = conversionRateConfig
                    }

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofUnit(unit)`.
                 */
                fun conversionRateConfig(unit: UnitConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * UnitConversionRateConfig.builder()
                 *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                 *     .unitConfig(unitConfig)
                 *     .build()
                 * ```
                 */
                fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                    conversionRateConfig(
                        UnitConversionRateConfig.builder()
                            .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                            .unitConfig(unitConfig)
                            .build()
                    )

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofTiered(tiered)`.
                 */
                fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * TieredConversionRateConfig.builder()
                 *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                 *     .tieredConfig(tieredConfig)
                 *     .build()
                 * ```
                 */
                fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                    conversionRateConfig(
                        TieredConversionRateConfig.builder()
                            .conversionRateType(
                                TieredConversionRateConfig.ConversionRateType.TIERED
                            )
                            .tieredConfig(tieredConfig)
                            .build()
                    )

                /** For dimensional price: specifies a price group and dimension values */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                ) =
                    dimensionalPriceConfiguration(
                        JsonField.ofNullable(dimensionalPriceConfiguration)
                    )

                /**
                 * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dimensionalPriceConfiguration] with a well-typed
                 * [NewDimensionalPriceConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                /** An alias for the price. */
                fun externalPriceId(externalPriceId: String?) =
                    externalPriceId(JsonField.ofNullable(externalPriceId))

                /**
                 * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalPriceId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                    this.externalPriceId = externalPriceId
                }

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                    fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                /**
                 * Alias for [Builder.fixedPriceQuantity].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(fixedPriceQuantity as Double?)

                /**
                 * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fixedPriceQuantity] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                    invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                /**
                 * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceGroupingKey] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                    this.invoiceGroupingKey = invoiceGroupingKey
                }

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: NewBillingCycleConfiguration?
                ) = invoicingCycleConfiguration(JsonField.ofNullable(invoicingCycleConfiguration))

                /**
                 * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoicingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                /** The ID of the license type to associate with this price. */
                fun licenseTypeId(licenseTypeId: String?) =
                    licenseTypeId(JsonField.ofNullable(licenseTypeId))

                /**
                 * Sets [Builder.licenseTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.licenseTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun licenseTypeId(licenseTypeId: JsonField<String>) = apply {
                    this.licenseTypeId = licenseTypeId
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [BulkWithFilters].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .bulkWithFiltersConfig()
                 * .cadence()
                 * .currency()
                 * .itemId()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BulkWithFilters =
                    BulkWithFilters(
                        checkRequired("bulkWithFiltersConfig", bulkWithFiltersConfig),
                        checkRequired("cadence", cadence),
                        checkRequired("currency", currency),
                        checkRequired("itemId", itemId),
                        modelType,
                        checkRequired("name", name),
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        licenseTypeId,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): BulkWithFilters = apply {
                if (validated) {
                    return@apply
                }

                bulkWithFiltersConfig().validate()
                cadence().validate()
                currency()
                itemId()
                _modelType().let {
                    if (it != JsonValue.from("bulk_with_filters")) {
                        throw OrbInvalidDataException("'modelType' is invalid, received $it")
                    }
                }
                name()
                billableMetricId()
                billedInAdvance()
                billingCycleConfiguration()?.validate()
                conversionRate()
                conversionRateConfig()?.validate()
                dimensionalPriceConfiguration()?.validate()
                externalPriceId()
                fixedPriceQuantity()
                invoiceGroupingKey()
                invoicingCycleConfiguration()?.validate()
                licenseTypeId()
                metadata()?.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (bulkWithFiltersConfig.asKnown()?.validity() ?: 0) +
                    (cadence.asKnown()?.validity() ?: 0) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (if (itemId.asKnown() == null) 0 else 1) +
                    modelType.let { if (it == JsonValue.from("bulk_with_filters")) 1 else 0 } +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (billableMetricId.asKnown() == null) 0 else 1) +
                    (if (billedInAdvance.asKnown() == null) 0 else 1) +
                    (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (conversionRate.asKnown() == null) 0 else 1) +
                    (conversionRateConfig.asKnown()?.validity() ?: 0) +
                    (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                    (if (externalPriceId.asKnown() == null) 0 else 1) +
                    (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                    (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                    (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (licenseTypeId.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0)

            /** Configuration for bulk_with_filters pricing */
            class BulkWithFiltersConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val filters: JsonField<List<Filter>>,
                private val tiers: JsonField<List<Tier>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("filters")
                    @ExcludeMissing
                    filters: JsonField<List<Filter>> = JsonMissing.of(),
                    @JsonProperty("tiers")
                    @ExcludeMissing
                    tiers: JsonField<List<Tier>> = JsonMissing.of(),
                ) : this(filters, tiers, mutableMapOf())

                /**
                 * Property filters to apply (all must match)
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun filters(): List<Filter> = filters.getRequired("filters")

                /**
                 * Bulk tiers for rating based on total usage volume
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun tiers(): List<Tier> = tiers.getRequired("tiers")

                /**
                 * Returns the raw JSON value of [filters].
                 *
                 * Unlike [filters], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("filters")
                @ExcludeMissing
                fun _filters(): JsonField<List<Filter>> = filters

                /**
                 * Returns the raw JSON value of [tiers].
                 *
                 * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

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
                     * [BulkWithFiltersConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .filters()
                     * .tiers()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [BulkWithFiltersConfig]. */
                class Builder internal constructor() {

                    private var filters: JsonField<MutableList<Filter>>? = null
                    private var tiers: JsonField<MutableList<Tier>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(bulkWithFiltersConfig: BulkWithFiltersConfig) = apply {
                        filters = bulkWithFiltersConfig.filters.map { it.toMutableList() }
                        tiers = bulkWithFiltersConfig.tiers.map { it.toMutableList() }
                        additionalProperties =
                            bulkWithFiltersConfig.additionalProperties.toMutableMap()
                    }

                    /** Property filters to apply (all must match) */
                    fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                    /**
                     * Sets [Builder.filters] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.filters] with a well-typed `List<Filter>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun filters(filters: JsonField<List<Filter>>) = apply {
                        this.filters = filters.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Filter] to [filters].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addFilter(filter: Filter) = apply {
                        filters =
                            (filters ?: JsonField.of(mutableListOf())).also {
                                checkKnown("filters", it).add(filter)
                            }
                    }

                    /** Bulk tiers for rating based on total usage volume */
                    fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                    /**
                     * Sets [Builder.tiers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tiers(tiers: JsonField<List<Tier>>) = apply {
                        this.tiers = tiers.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Tier] to [tiers].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTier(tier: Tier) = apply {
                        tiers =
                            (tiers ?: JsonField.of(mutableListOf())).also {
                                checkKnown("tiers", it).add(tier)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [BulkWithFiltersConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .filters()
                     * .tiers()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): BulkWithFiltersConfig =
                        BulkWithFiltersConfig(
                            checkRequired("filters", filters).map { it.toImmutable() },
                            checkRequired("tiers", tiers).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): BulkWithFiltersConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    filters().forEach { it.validate() }
                    tiers().forEach { it.validate() }
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (filters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                        (tiers.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

                /** Configuration for a single property filter */
                class Filter
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val propertyKey: JsonField<String>,
                    private val propertyValue: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("property_key")
                        @ExcludeMissing
                        propertyKey: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("property_value")
                        @ExcludeMissing
                        propertyValue: JsonField<String> = JsonMissing.of(),
                    ) : this(propertyKey, propertyValue, mutableMapOf())

                    /**
                     * Event property key to filter on
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun propertyKey(): String = propertyKey.getRequired("property_key")

                    /**
                     * Event property value to match
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun propertyValue(): String = propertyValue.getRequired("property_value")

                    /**
                     * Returns the raw JSON value of [propertyKey].
                     *
                     * Unlike [propertyKey], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("property_key")
                    @ExcludeMissing
                    fun _propertyKey(): JsonField<String> = propertyKey

                    /**
                     * Returns the raw JSON value of [propertyValue].
                     *
                     * Unlike [propertyValue], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("property_value")
                    @ExcludeMissing
                    fun _propertyValue(): JsonField<String> = propertyValue

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
                         * Returns a mutable builder for constructing an instance of [Filter].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .propertyKey()
                         * .propertyValue()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [Filter]. */
                    class Builder internal constructor() {

                        private var propertyKey: JsonField<String>? = null
                        private var propertyValue: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(filter: Filter) = apply {
                            propertyKey = filter.propertyKey
                            propertyValue = filter.propertyValue
                            additionalProperties = filter.additionalProperties.toMutableMap()
                        }

                        /** Event property key to filter on */
                        fun propertyKey(propertyKey: String) =
                            propertyKey(JsonField.of(propertyKey))

                        /**
                         * Sets [Builder.propertyKey] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.propertyKey] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun propertyKey(propertyKey: JsonField<String>) = apply {
                            this.propertyKey = propertyKey
                        }

                        /** Event property value to match */
                        fun propertyValue(propertyValue: String) =
                            propertyValue(JsonField.of(propertyValue))

                        /**
                         * Sets [Builder.propertyValue] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.propertyValue] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun propertyValue(propertyValue: JsonField<String>) = apply {
                            this.propertyValue = propertyValue
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Filter].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .propertyKey()
                         * .propertyValue()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Filter =
                            Filter(
                                checkRequired("propertyKey", propertyKey),
                                checkRequired("propertyValue", propertyValue),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OrbInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Filter = apply {
                        if (validated) {
                            return@apply
                        }

                        propertyKey()
                        propertyValue()
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        (if (propertyKey.asKnown() == null) 0 else 1) +
                            (if (propertyValue.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Filter &&
                            propertyKey == other.propertyKey &&
                            propertyValue == other.propertyValue &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(propertyKey, propertyValue, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Filter{propertyKey=$propertyKey, propertyValue=$propertyValue, additionalProperties=$additionalProperties}"
                }

                /** Configuration for a single bulk pricing tier */
                class Tier
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val unitAmount: JsonField<String>,
                    private val tierLowerBound: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("unit_amount")
                        @ExcludeMissing
                        unitAmount: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("tier_lower_bound")
                        @ExcludeMissing
                        tierLowerBound: JsonField<String> = JsonMissing.of(),
                    ) : this(unitAmount, tierLowerBound, mutableMapOf())

                    /**
                     * Amount per unit
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                    /**
                     * The lower bound for this tier
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun tierLowerBound(): String? = tierLowerBound.getNullable("tier_lower_bound")

                    /**
                     * Returns the raw JSON value of [unitAmount].
                     *
                     * Unlike [unitAmount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    fun _unitAmount(): JsonField<String> = unitAmount

                    /**
                     * Returns the raw JSON value of [tierLowerBound].
                     *
                     * Unlike [tierLowerBound], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("tier_lower_bound")
                    @ExcludeMissing
                    fun _tierLowerBound(): JsonField<String> = tierLowerBound

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
                         * Returns a mutable builder for constructing an instance of [Tier].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .unitAmount()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [Tier]. */
                    class Builder internal constructor() {

                        private var unitAmount: JsonField<String>? = null
                        private var tierLowerBound: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(tier: Tier) = apply {
                            unitAmount = tier.unitAmount
                            tierLowerBound = tier.tierLowerBound
                            additionalProperties = tier.additionalProperties.toMutableMap()
                        }

                        /** Amount per unit */
                        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                        /**
                         * Sets [Builder.unitAmount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unitAmount] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unitAmount(unitAmount: JsonField<String>) = apply {
                            this.unitAmount = unitAmount
                        }

                        /** The lower bound for this tier */
                        fun tierLowerBound(tierLowerBound: String?) =
                            tierLowerBound(JsonField.ofNullable(tierLowerBound))

                        /**
                         * Sets [Builder.tierLowerBound] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.tierLowerBound] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun tierLowerBound(tierLowerBound: JsonField<String>) = apply {
                            this.tierLowerBound = tierLowerBound
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Tier].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .unitAmount()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Tier =
                            Tier(
                                checkRequired("unitAmount", unitAmount),
                                tierLowerBound,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OrbInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Tier = apply {
                        if (validated) {
                            return@apply
                        }

                        unitAmount()
                        tierLowerBound()
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        (if (unitAmount.asKnown() == null) 0 else 1) +
                            (if (tierLowerBound.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Tier &&
                            unitAmount == other.unitAmount &&
                            tierLowerBound == other.tierLowerBound &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(unitAmount, tierLowerBound, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Tier{unitAmount=$unitAmount, tierLowerBound=$tierLowerBound, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BulkWithFiltersConfig &&
                        filters == other.filters &&
                        tiers == other.tiers &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(filters, tiers, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "BulkWithFiltersConfig{filters=$filters, tiers=$tiers, additionalProperties=$additionalProperties}"
            }

            /** The cadence to bill for this price on. */
            class Cadence @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ANNUAL = of("annual")

                    val SEMI_ANNUAL = of("semi_annual")

                    val MONTHLY = of("monthly")

                    val QUARTERLY = of("quarterly")

                    val ONE_TIME = of("one_time")

                    val CUSTOM = of("custom")

                    fun of(value: String) = Cadence(JsonField.of(value))
                }

                /** An enum containing [Cadence]'s known values. */
                enum class Known {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                }

                /**
                 * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Cadence] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                    /**
                     * An enum member indicating that [Cadence] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ANNUAL -> Value.ANNUAL
                        SEMI_ANNUAL -> Value.SEMI_ANNUAL
                        MONTHLY -> Value.MONTHLY
                        QUARTERLY -> Value.QUARTERLY
                        ONE_TIME -> Value.ONE_TIME
                        CUSTOM -> Value.CUSTOM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        ANNUAL -> Known.ANNUAL
                        SEMI_ANNUAL -> Known.SEMI_ANNUAL
                        MONTHLY -> Known.MONTHLY
                        QUARTERLY -> Known.QUARTERLY
                        ONE_TIME -> Known.ONE_TIME
                        CUSTOM -> Known.CUSTOM
                        else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Cadence = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cadence && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BulkWithFilters &&
                    bulkWithFiltersConfig == other.bulkWithFiltersConfig &&
                    cadence == other.cadence &&
                    currency == other.currency &&
                    itemId == other.itemId &&
                    modelType == other.modelType &&
                    name == other.name &&
                    billableMetricId == other.billableMetricId &&
                    billedInAdvance == other.billedInAdvance &&
                    billingCycleConfiguration == other.billingCycleConfiguration &&
                    conversionRate == other.conversionRate &&
                    conversionRateConfig == other.conversionRateConfig &&
                    dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                    externalPriceId == other.externalPriceId &&
                    fixedPriceQuantity == other.fixedPriceQuantity &&
                    invoiceGroupingKey == other.invoiceGroupingKey &&
                    invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                    licenseTypeId == other.licenseTypeId &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    bulkWithFiltersConfig,
                    cadence,
                    currency,
                    itemId,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    licenseTypeId,
                    metadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BulkWithFilters{bulkWithFiltersConfig=$bulkWithFiltersConfig, cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, licenseTypeId=$licenseTypeId, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        class MatrixWithThresholdDiscounts
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cadence: JsonField<Cadence>,
            private val currency: JsonField<String>,
            private val itemId: JsonField<String>,
            private val matrixWithThresholdDiscountsConfig:
                JsonField<MatrixWithThresholdDiscountsConfig>,
            private val modelType: JsonValue,
            private val name: JsonField<String>,
            private val billableMetricId: JsonField<String>,
            private val billedInAdvance: JsonField<Boolean>,
            private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val conversionRate: JsonField<Double>,
            private val conversionRateConfig: JsonField<ConversionRateConfig>,
            private val dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>,
            private val externalPriceId: JsonField<String>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val invoiceGroupingKey: JsonField<String>,
            private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val licenseTypeId: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cadence")
                @ExcludeMissing
                cadence: JsonField<Cadence> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("item_id")
                @ExcludeMissing
                itemId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("matrix_with_threshold_discounts_config")
                @ExcludeMissing
                matrixWithThresholdDiscountsConfig: JsonField<MatrixWithThresholdDiscountsConfig> =
                    JsonMissing.of(),
                @JsonProperty("model_type") @ExcludeMissing modelType: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                billableMetricId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                conversionRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("external_price_id")
                @ExcludeMissing
                externalPriceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("license_type_id")
                @ExcludeMissing
                licenseTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(
                cadence,
                currency,
                itemId,
                matrixWithThresholdDiscountsConfig,
                modelType,
                name,
                billableMetricId,
                billedInAdvance,
                billingCycleConfiguration,
                conversionRate,
                conversionRateConfig,
                dimensionalPriceConfiguration,
                externalPriceId,
                fixedPriceQuantity,
                invoiceGroupingKey,
                invoicingCycleConfiguration,
                licenseTypeId,
                metadata,
                mutableMapOf(),
            )

            /**
             * The cadence to bill for this price on.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cadence(): Cadence = cadence.getRequired("cadence")

            /**
             * An ISO 4217 currency string for which this price is billed in.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * The id of the item the price will be associated with.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun itemId(): String = itemId.getRequired("item_id")

            /**
             * Configuration for matrix_with_threshold_discounts pricing
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun matrixWithThresholdDiscountsConfig(): MatrixWithThresholdDiscountsConfig =
                matrixWithThresholdDiscountsConfig.getRequired(
                    "matrix_with_threshold_discounts_config"
                )

            /**
             * The pricing model type
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("matrix_with_threshold_discounts")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

            /**
             * The name of the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                billingCycleConfiguration.getNullable("billing_cycle_configuration")

            /**
             * The per unit conversion rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /**
             * The configuration for the rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRateConfig(): ConversionRateConfig? =
                conversionRateConfig.getNullable("conversion_rate_config")

            /**
             * For dimensional price: specifies a price group and dimension values
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

            /**
             * An alias for the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            /**
             * The property used to group this price on an invoice
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoiceGroupingKey(): String? =
                invoiceGroupingKey.getNullable("invoice_grouping_key")

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

            /**
             * The ID of the license type to associate with this price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun licenseTypeId(): String? = licenseTypeId.getNullable("license_type_id")

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Returns the raw JSON value of [cadence].
             *
             * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [itemId].
             *
             * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

            /**
             * Returns the raw JSON value of [matrixWithThresholdDiscountsConfig].
             *
             * Unlike [matrixWithThresholdDiscountsConfig], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("matrix_with_threshold_discounts_config")
            @ExcludeMissing
            fun _matrixWithThresholdDiscountsConfig():
                JsonField<MatrixWithThresholdDiscountsConfig> = matrixWithThresholdDiscountsConfig

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [billableMetricId].
             *
             * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billable_metric_id")
            @ExcludeMissing
            fun _billableMetricId(): JsonField<String> = billableMetricId

            /**
             * Returns the raw JSON value of [billedInAdvance].
             *
             * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billed_in_advance")
            @ExcludeMissing
            fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

            /**
             * Returns the raw JSON value of [billingCycleConfiguration].
             *
             * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("billing_cycle_configuration")
            @ExcludeMissing
            fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                billingCycleConfiguration

            /**
             * Returns the raw JSON value of [conversionRate].
             *
             * Unlike [conversionRate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun _conversionRate(): JsonField<Double> = conversionRate

            /**
             * Returns the raw JSON value of [conversionRateConfig].
             *
             * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate_config")
            @ExcludeMissing
            fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

            /**
             * Returns the raw JSON value of [dimensionalPriceConfiguration].
             *
             * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("dimensional_price_configuration")
            @ExcludeMissing
            fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                dimensionalPriceConfiguration

            /**
             * Returns the raw JSON value of [externalPriceId].
             *
             * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun _externalPriceId(): JsonField<String> = externalPriceId

            /**
             * Returns the raw JSON value of [fixedPriceQuantity].
             *
             * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

            /**
             * Returns the raw JSON value of [invoiceGroupingKey].
             *
             * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invoice_grouping_key")
            @ExcludeMissing
            fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

            /**
             * Returns the raw JSON value of [invoicingCycleConfiguration].
             *
             * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("invoicing_cycle_configuration")
            @ExcludeMissing
            fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                invoicingCycleConfiguration

            /**
             * Returns the raw JSON value of [licenseTypeId].
             *
             * Unlike [licenseTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("license_type_id")
            @ExcludeMissing
            fun _licenseTypeId(): JsonField<String> = licenseTypeId

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * [MatrixWithThresholdDiscounts].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .currency()
                 * .itemId()
                 * .matrixWithThresholdDiscountsConfig()
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MatrixWithThresholdDiscounts]. */
            class Builder internal constructor() {

                private var cadence: JsonField<Cadence>? = null
                private var currency: JsonField<String>? = null
                private var itemId: JsonField<String>? = null
                private var matrixWithThresholdDiscountsConfig:
                    JsonField<MatrixWithThresholdDiscountsConfig>? =
                    null
                private var modelType: JsonValue = JsonValue.from("matrix_with_threshold_discounts")
                private var name: JsonField<String>? = null
                private var billableMetricId: JsonField<String> = JsonMissing.of()
                private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of()
                private var dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of()
                private var externalPriceId: JsonField<String> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                private var invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var licenseTypeId: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(matrixWithThresholdDiscounts: MatrixWithThresholdDiscounts) =
                    apply {
                        cadence = matrixWithThresholdDiscounts.cadence
                        currency = matrixWithThresholdDiscounts.currency
                        itemId = matrixWithThresholdDiscounts.itemId
                        matrixWithThresholdDiscountsConfig =
                            matrixWithThresholdDiscounts.matrixWithThresholdDiscountsConfig
                        modelType = matrixWithThresholdDiscounts.modelType
                        name = matrixWithThresholdDiscounts.name
                        billableMetricId = matrixWithThresholdDiscounts.billableMetricId
                        billedInAdvance = matrixWithThresholdDiscounts.billedInAdvance
                        billingCycleConfiguration =
                            matrixWithThresholdDiscounts.billingCycleConfiguration
                        conversionRate = matrixWithThresholdDiscounts.conversionRate
                        conversionRateConfig = matrixWithThresholdDiscounts.conversionRateConfig
                        dimensionalPriceConfiguration =
                            matrixWithThresholdDiscounts.dimensionalPriceConfiguration
                        externalPriceId = matrixWithThresholdDiscounts.externalPriceId
                        fixedPriceQuantity = matrixWithThresholdDiscounts.fixedPriceQuantity
                        invoiceGroupingKey = matrixWithThresholdDiscounts.invoiceGroupingKey
                        invoicingCycleConfiguration =
                            matrixWithThresholdDiscounts.invoicingCycleConfiguration
                        licenseTypeId = matrixWithThresholdDiscounts.licenseTypeId
                        metadata = matrixWithThresholdDiscounts.metadata
                        additionalProperties =
                            matrixWithThresholdDiscounts.additionalProperties.toMutableMap()
                    }

                /** The cadence to bill for this price on. */
                fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                /**
                 * Sets [Builder.cadence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The id of the item the price will be associated with. */
                fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                /**
                 * Sets [Builder.itemId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.itemId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                /** Configuration for matrix_with_threshold_discounts pricing */
                fun matrixWithThresholdDiscountsConfig(
                    matrixWithThresholdDiscountsConfig: MatrixWithThresholdDiscountsConfig
                ) =
                    matrixWithThresholdDiscountsConfig(
                        JsonField.of(matrixWithThresholdDiscountsConfig)
                    )

                /**
                 * Sets [Builder.matrixWithThresholdDiscountsConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.matrixWithThresholdDiscountsConfig] with a
                 * well-typed [MatrixWithThresholdDiscountsConfig] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun matrixWithThresholdDiscountsConfig(
                    matrixWithThresholdDiscountsConfig:
                        JsonField<MatrixWithThresholdDiscountsConfig>
                ) = apply {
                    this.matrixWithThresholdDiscountsConfig = matrixWithThresholdDiscountsConfig
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("matrix_with_threshold_discounts")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                /** The name of the price. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(billableMetricId: String?) =
                    billableMetricId(JsonField.ofNullable(billableMetricId))

                /**
                 * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billableMetricId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                    this.billableMetricId = billableMetricId
                }

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(billedInAdvance: Boolean?) =
                    billedInAdvance(JsonField.ofNullable(billedInAdvance))

                /**
                 * Alias for [Builder.billedInAdvance].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun billedInAdvance(billedInAdvance: Boolean) =
                    billedInAdvance(billedInAdvance as Boolean?)

                /**
                 * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                    this.billedInAdvance = billedInAdvance
                }

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: NewBillingCycleConfiguration?
                ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                /**
                 * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double?) =
                    conversionRate(JsonField.ofNullable(conversionRate))

                /**
                 * Alias for [Builder.conversionRate].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(conversionRate as Double?)

                /**
                 * Sets [Builder.conversionRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRate] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 */
                fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                    conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                /**
                 * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRateConfig] with a well-typed
                 * [ConversionRateConfig] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun conversionRateConfig(conversionRateConfig: JsonField<ConversionRateConfig>) =
                    apply {
                        this.conversionRateConfig = conversionRateConfig
                    }

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofUnit(unit)`.
                 */
                fun conversionRateConfig(unit: UnitConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * UnitConversionRateConfig.builder()
                 *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                 *     .unitConfig(unitConfig)
                 *     .build()
                 * ```
                 */
                fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                    conversionRateConfig(
                        UnitConversionRateConfig.builder()
                            .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                            .unitConfig(unitConfig)
                            .build()
                    )

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofTiered(tiered)`.
                 */
                fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * TieredConversionRateConfig.builder()
                 *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                 *     .tieredConfig(tieredConfig)
                 *     .build()
                 * ```
                 */
                fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                    conversionRateConfig(
                        TieredConversionRateConfig.builder()
                            .conversionRateType(
                                TieredConversionRateConfig.ConversionRateType.TIERED
                            )
                            .tieredConfig(tieredConfig)
                            .build()
                    )

                /** For dimensional price: specifies a price group and dimension values */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                ) =
                    dimensionalPriceConfiguration(
                        JsonField.ofNullable(dimensionalPriceConfiguration)
                    )

                /**
                 * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dimensionalPriceConfiguration] with a well-typed
                 * [NewDimensionalPriceConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                /** An alias for the price. */
                fun externalPriceId(externalPriceId: String?) =
                    externalPriceId(JsonField.ofNullable(externalPriceId))

                /**
                 * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalPriceId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                    this.externalPriceId = externalPriceId
                }

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                    fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                /**
                 * Alias for [Builder.fixedPriceQuantity].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(fixedPriceQuantity as Double?)

                /**
                 * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fixedPriceQuantity] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                    invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                /**
                 * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceGroupingKey] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                    this.invoiceGroupingKey = invoiceGroupingKey
                }

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: NewBillingCycleConfiguration?
                ) = invoicingCycleConfiguration(JsonField.ofNullable(invoicingCycleConfiguration))

                /**
                 * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoicingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                /** The ID of the license type to associate with this price. */
                fun licenseTypeId(licenseTypeId: String?) =
                    licenseTypeId(JsonField.ofNullable(licenseTypeId))

                /**
                 * Sets [Builder.licenseTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.licenseTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun licenseTypeId(licenseTypeId: JsonField<String>) = apply {
                    this.licenseTypeId = licenseTypeId
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [MatrixWithThresholdDiscounts].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .currency()
                 * .itemId()
                 * .matrixWithThresholdDiscountsConfig()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MatrixWithThresholdDiscounts =
                    MatrixWithThresholdDiscounts(
                        checkRequired("cadence", cadence),
                        checkRequired("currency", currency),
                        checkRequired("itemId", itemId),
                        checkRequired(
                            "matrixWithThresholdDiscountsConfig",
                            matrixWithThresholdDiscountsConfig,
                        ),
                        modelType,
                        checkRequired("name", name),
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        licenseTypeId,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): MatrixWithThresholdDiscounts = apply {
                if (validated) {
                    return@apply
                }

                cadence().validate()
                currency()
                itemId()
                matrixWithThresholdDiscountsConfig().validate()
                _modelType().let {
                    if (it != JsonValue.from("matrix_with_threshold_discounts")) {
                        throw OrbInvalidDataException("'modelType' is invalid, received $it")
                    }
                }
                name()
                billableMetricId()
                billedInAdvance()
                billingCycleConfiguration()?.validate()
                conversionRate()
                conversionRateConfig()?.validate()
                dimensionalPriceConfiguration()?.validate()
                externalPriceId()
                fixedPriceQuantity()
                invoiceGroupingKey()
                invoicingCycleConfiguration()?.validate()
                licenseTypeId()
                metadata()?.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (cadence.asKnown()?.validity() ?: 0) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (if (itemId.asKnown() == null) 0 else 1) +
                    (matrixWithThresholdDiscountsConfig.asKnown()?.validity() ?: 0) +
                    modelType.let {
                        if (it == JsonValue.from("matrix_with_threshold_discounts")) 1 else 0
                    } +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (billableMetricId.asKnown() == null) 0 else 1) +
                    (if (billedInAdvance.asKnown() == null) 0 else 1) +
                    (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (conversionRate.asKnown() == null) 0 else 1) +
                    (conversionRateConfig.asKnown()?.validity() ?: 0) +
                    (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                    (if (externalPriceId.asKnown() == null) 0 else 1) +
                    (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                    (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                    (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (licenseTypeId.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0)

            /** The cadence to bill for this price on. */
            class Cadence @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ANNUAL = of("annual")

                    val SEMI_ANNUAL = of("semi_annual")

                    val MONTHLY = of("monthly")

                    val QUARTERLY = of("quarterly")

                    val ONE_TIME = of("one_time")

                    val CUSTOM = of("custom")

                    fun of(value: String) = Cadence(JsonField.of(value))
                }

                /** An enum containing [Cadence]'s known values. */
                enum class Known {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                }

                /**
                 * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Cadence] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                    /**
                     * An enum member indicating that [Cadence] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ANNUAL -> Value.ANNUAL
                        SEMI_ANNUAL -> Value.SEMI_ANNUAL
                        MONTHLY -> Value.MONTHLY
                        QUARTERLY -> Value.QUARTERLY
                        ONE_TIME -> Value.ONE_TIME
                        CUSTOM -> Value.CUSTOM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        ANNUAL -> Known.ANNUAL
                        SEMI_ANNUAL -> Known.SEMI_ANNUAL
                        MONTHLY -> Known.MONTHLY
                        QUARTERLY -> Known.QUARTERLY
                        ONE_TIME -> Known.ONE_TIME
                        CUSTOM -> Known.CUSTOM
                        else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Cadence = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cadence && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Configuration for matrix_with_threshold_discounts pricing */
            class MatrixWithThresholdDiscountsConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val defaultUnitAmount: JsonField<String>,
                private val firstDimension: JsonField<String>,
                private val matrixValues: JsonField<List<MatrixValue>>,
                private val secondDimension: JsonField<String>,
                private val thresholdDiscountGroups: JsonField<List<ThresholdDiscountGroup>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("default_unit_amount")
                    @ExcludeMissing
                    defaultUnitAmount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("first_dimension")
                    @ExcludeMissing
                    firstDimension: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("matrix_values")
                    @ExcludeMissing
                    matrixValues: JsonField<List<MatrixValue>> = JsonMissing.of(),
                    @JsonProperty("second_dimension")
                    @ExcludeMissing
                    secondDimension: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("threshold_discount_groups")
                    @ExcludeMissing
                    thresholdDiscountGroups: JsonField<List<ThresholdDiscountGroup>> =
                        JsonMissing.of(),
                ) : this(
                    defaultUnitAmount,
                    firstDimension,
                    matrixValues,
                    secondDimension,
                    thresholdDiscountGroups,
                    mutableMapOf(),
                )

                /**
                 * Unit price used for usage that does not match any defined matrix cell.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun defaultUnitAmount(): String =
                    defaultUnitAmount.getRequired("default_unit_amount")

                /**
                 * First matrix dimension key.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun firstDimension(): String = firstDimension.getRequired("first_dimension")

                /**
                 * Per-cell unit prices.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun matrixValues(): List<MatrixValue> = matrixValues.getRequired("matrix_values")

                /**
                 * Optional second matrix dimension key.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun secondDimension(): String? = secondDimension.getNullable("second_dimension")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun thresholdDiscountGroups(): List<ThresholdDiscountGroup>? =
                    thresholdDiscountGroups.getNullable("threshold_discount_groups")

                /**
                 * Returns the raw JSON value of [defaultUnitAmount].
                 *
                 * Unlike [defaultUnitAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("default_unit_amount")
                @ExcludeMissing
                fun _defaultUnitAmount(): JsonField<String> = defaultUnitAmount

                /**
                 * Returns the raw JSON value of [firstDimension].
                 *
                 * Unlike [firstDimension], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("first_dimension")
                @ExcludeMissing
                fun _firstDimension(): JsonField<String> = firstDimension

                /**
                 * Returns the raw JSON value of [matrixValues].
                 *
                 * Unlike [matrixValues], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("matrix_values")
                @ExcludeMissing
                fun _matrixValues(): JsonField<List<MatrixValue>> = matrixValues

                /**
                 * Returns the raw JSON value of [secondDimension].
                 *
                 * Unlike [secondDimension], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("second_dimension")
                @ExcludeMissing
                fun _secondDimension(): JsonField<String> = secondDimension

                /**
                 * Returns the raw JSON value of [thresholdDiscountGroups].
                 *
                 * Unlike [thresholdDiscountGroups], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("threshold_discount_groups")
                @ExcludeMissing
                fun _thresholdDiscountGroups(): JsonField<List<ThresholdDiscountGroup>> =
                    thresholdDiscountGroups

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
                     * [MatrixWithThresholdDiscountsConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .defaultUnitAmount()
                     * .firstDimension()
                     * .matrixValues()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [MatrixWithThresholdDiscountsConfig]. */
                class Builder internal constructor() {

                    private var defaultUnitAmount: JsonField<String>? = null
                    private var firstDimension: JsonField<String>? = null
                    private var matrixValues: JsonField<MutableList<MatrixValue>>? = null
                    private var secondDimension: JsonField<String> = JsonMissing.of()
                    private var thresholdDiscountGroups:
                        JsonField<MutableList<ThresholdDiscountGroup>>? =
                        null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        matrixWithThresholdDiscountsConfig: MatrixWithThresholdDiscountsConfig
                    ) = apply {
                        defaultUnitAmount = matrixWithThresholdDiscountsConfig.defaultUnitAmount
                        firstDimension = matrixWithThresholdDiscountsConfig.firstDimension
                        matrixValues =
                            matrixWithThresholdDiscountsConfig.matrixValues.map {
                                it.toMutableList()
                            }
                        secondDimension = matrixWithThresholdDiscountsConfig.secondDimension
                        thresholdDiscountGroups =
                            matrixWithThresholdDiscountsConfig.thresholdDiscountGroups.map {
                                it.toMutableList()
                            }
                        additionalProperties =
                            matrixWithThresholdDiscountsConfig.additionalProperties.toMutableMap()
                    }

                    /** Unit price used for usage that does not match any defined matrix cell. */
                    fun defaultUnitAmount(defaultUnitAmount: String) =
                        defaultUnitAmount(JsonField.of(defaultUnitAmount))

                    /**
                     * Sets [Builder.defaultUnitAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.defaultUnitAmount] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun defaultUnitAmount(defaultUnitAmount: JsonField<String>) = apply {
                        this.defaultUnitAmount = defaultUnitAmount
                    }

                    /** First matrix dimension key. */
                    fun firstDimension(firstDimension: String) =
                        firstDimension(JsonField.of(firstDimension))

                    /**
                     * Sets [Builder.firstDimension] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.firstDimension] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun firstDimension(firstDimension: JsonField<String>) = apply {
                        this.firstDimension = firstDimension
                    }

                    /** Per-cell unit prices. */
                    fun matrixValues(matrixValues: List<MatrixValue>) =
                        matrixValues(JsonField.of(matrixValues))

                    /**
                     * Sets [Builder.matrixValues] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.matrixValues] with a well-typed
                     * `List<MatrixValue>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun matrixValues(matrixValues: JsonField<List<MatrixValue>>) = apply {
                        this.matrixValues = matrixValues.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [MatrixValue] to [matrixValues].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addMatrixValue(matrixValue: MatrixValue) = apply {
                        matrixValues =
                            (matrixValues ?: JsonField.of(mutableListOf())).also {
                                checkKnown("matrixValues", it).add(matrixValue)
                            }
                    }

                    /** Optional second matrix dimension key. */
                    fun secondDimension(secondDimension: String?) =
                        secondDimension(JsonField.ofNullable(secondDimension))

                    /**
                     * Sets [Builder.secondDimension] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.secondDimension] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun secondDimension(secondDimension: JsonField<String>) = apply {
                        this.secondDimension = secondDimension
                    }

                    fun thresholdDiscountGroups(
                        thresholdDiscountGroups: List<ThresholdDiscountGroup>
                    ) = thresholdDiscountGroups(JsonField.of(thresholdDiscountGroups))

                    /**
                     * Sets [Builder.thresholdDiscountGroups] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.thresholdDiscountGroups] with a well-typed
                     * `List<ThresholdDiscountGroup>` value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun thresholdDiscountGroups(
                        thresholdDiscountGroups: JsonField<List<ThresholdDiscountGroup>>
                    ) = apply {
                        this.thresholdDiscountGroups =
                            thresholdDiscountGroups.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [ThresholdDiscountGroup] to [thresholdDiscountGroups].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addThresholdDiscountGroup(thresholdDiscountGroup: ThresholdDiscountGroup) =
                        apply {
                            thresholdDiscountGroups =
                                (thresholdDiscountGroups ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("thresholdDiscountGroups", it)
                                        .add(thresholdDiscountGroup)
                                }
                        }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [MatrixWithThresholdDiscountsConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .defaultUnitAmount()
                     * .firstDimension()
                     * .matrixValues()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): MatrixWithThresholdDiscountsConfig =
                        MatrixWithThresholdDiscountsConfig(
                            checkRequired("defaultUnitAmount", defaultUnitAmount),
                            checkRequired("firstDimension", firstDimension),
                            checkRequired("matrixValues", matrixValues).map { it.toImmutable() },
                            secondDimension,
                            (thresholdDiscountGroups ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): MatrixWithThresholdDiscountsConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    defaultUnitAmount()
                    firstDimension()
                    matrixValues().forEach { it.validate() }
                    secondDimension()
                    thresholdDiscountGroups()?.forEach { it.validate() }
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (defaultUnitAmount.asKnown() == null) 0 else 1) +
                        (if (firstDimension.asKnown() == null) 0 else 1) +
                        (matrixValues.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (secondDimension.asKnown() == null) 0 else 1) +
                        (thresholdDiscountGroups.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

                class MatrixValue
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val firstDimensionValue: JsonField<String>,
                    private val unitAmount: JsonField<String>,
                    private val secondDimensionValue: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("first_dimension_value")
                        @ExcludeMissing
                        firstDimensionValue: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("unit_amount")
                        @ExcludeMissing
                        unitAmount: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("second_dimension_value")
                        @ExcludeMissing
                        secondDimensionValue: JsonField<String> = JsonMissing.of(),
                    ) : this(firstDimensionValue, unitAmount, secondDimensionValue, mutableMapOf())

                    /**
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun firstDimensionValue(): String =
                        firstDimensionValue.getRequired("first_dimension_value")

                    /**
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                    /**
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun secondDimensionValue(): String? =
                        secondDimensionValue.getNullable("second_dimension_value")

                    /**
                     * Returns the raw JSON value of [firstDimensionValue].
                     *
                     * Unlike [firstDimensionValue], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("first_dimension_value")
                    @ExcludeMissing
                    fun _firstDimensionValue(): JsonField<String> = firstDimensionValue

                    /**
                     * Returns the raw JSON value of [unitAmount].
                     *
                     * Unlike [unitAmount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    fun _unitAmount(): JsonField<String> = unitAmount

                    /**
                     * Returns the raw JSON value of [secondDimensionValue].
                     *
                     * Unlike [secondDimensionValue], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("second_dimension_value")
                    @ExcludeMissing
                    fun _secondDimensionValue(): JsonField<String> = secondDimensionValue

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
                         * Returns a mutable builder for constructing an instance of [MatrixValue].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .firstDimensionValue()
                         * .unitAmount()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [MatrixValue]. */
                    class Builder internal constructor() {

                        private var firstDimensionValue: JsonField<String>? = null
                        private var unitAmount: JsonField<String>? = null
                        private var secondDimensionValue: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(matrixValue: MatrixValue) = apply {
                            firstDimensionValue = matrixValue.firstDimensionValue
                            unitAmount = matrixValue.unitAmount
                            secondDimensionValue = matrixValue.secondDimensionValue
                            additionalProperties = matrixValue.additionalProperties.toMutableMap()
                        }

                        fun firstDimensionValue(firstDimensionValue: String) =
                            firstDimensionValue(JsonField.of(firstDimensionValue))

                        /**
                         * Sets [Builder.firstDimensionValue] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.firstDimensionValue] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun firstDimensionValue(firstDimensionValue: JsonField<String>) = apply {
                            this.firstDimensionValue = firstDimensionValue
                        }

                        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                        /**
                         * Sets [Builder.unitAmount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unitAmount] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unitAmount(unitAmount: JsonField<String>) = apply {
                            this.unitAmount = unitAmount
                        }

                        fun secondDimensionValue(secondDimensionValue: String?) =
                            secondDimensionValue(JsonField.ofNullable(secondDimensionValue))

                        /**
                         * Sets [Builder.secondDimensionValue] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.secondDimensionValue] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun secondDimensionValue(secondDimensionValue: JsonField<String>) = apply {
                            this.secondDimensionValue = secondDimensionValue
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [MatrixValue].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .firstDimensionValue()
                         * .unitAmount()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): MatrixValue =
                            MatrixValue(
                                checkRequired("firstDimensionValue", firstDimensionValue),
                                checkRequired("unitAmount", unitAmount),
                                secondDimensionValue,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OrbInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): MatrixValue = apply {
                        if (validated) {
                            return@apply
                        }

                        firstDimensionValue()
                        unitAmount()
                        secondDimensionValue()
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        (if (firstDimensionValue.asKnown() == null) 0 else 1) +
                            (if (unitAmount.asKnown() == null) 0 else 1) +
                            (if (secondDimensionValue.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is MatrixValue &&
                            firstDimensionValue == other.firstDimensionValue &&
                            unitAmount == other.unitAmount &&
                            secondDimensionValue == other.secondDimensionValue &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            firstDimensionValue,
                            unitAmount,
                            secondDimensionValue,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "MatrixValue{firstDimensionValue=$firstDimensionValue, unitAmount=$unitAmount, secondDimensionValue=$secondDimensionValue, additionalProperties=$additionalProperties}"
                }

                class ThresholdDiscountGroup
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val aboveThresholdDiscountPercentage: JsonField<String>,
                    private val belowThresholdDiscountPercentage: JsonField<String>,
                    private val cellCoordinates: JsonField<String>,
                    private val thresholdAmount: JsonField<String>,
                    private val description: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("above_threshold_discount_percentage")
                        @ExcludeMissing
                        aboveThresholdDiscountPercentage: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("below_threshold_discount_percentage")
                        @ExcludeMissing
                        belowThresholdDiscountPercentage: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("cell_coordinates")
                        @ExcludeMissing
                        cellCoordinates: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("threshold_amount")
                        @ExcludeMissing
                        thresholdAmount: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("description")
                        @ExcludeMissing
                        description: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        aboveThresholdDiscountPercentage,
                        belowThresholdDiscountPercentage,
                        cellCoordinates,
                        thresholdAmount,
                        description,
                        mutableMapOf(),
                    )

                    /**
                     * Discount rate applied to spend above the threshold.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun aboveThresholdDiscountPercentage(): String =
                        aboveThresholdDiscountPercentage.getRequired(
                            "above_threshold_discount_percentage"
                        )

                    /**
                     * Discount rate applied to spend at or below the threshold. Set to 0 for no
                     * baseline discount.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun belowThresholdDiscountPercentage(): String =
                        belowThresholdDiscountPercentage.getRequired(
                            "below_threshold_discount_percentage"
                        )

                    /**
                     * Semicolon-separated list of matrix cell coordinates targeted by this group.
                     * Each coordinate is `first,second` when the matrix has two dimensions, or just
                     * `first` for a single-dimension matrix. Example: `blue,circle;green,triangle`.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun cellCoordinates(): String = cellCoordinates.getRequired("cell_coordinates")

                    /**
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun thresholdAmount(): String = thresholdAmount.getRequired("threshold_amount")

                    /**
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun description(): String? = description.getNullable("description")

                    /**
                     * Returns the raw JSON value of [aboveThresholdDiscountPercentage].
                     *
                     * Unlike [aboveThresholdDiscountPercentage], this method doesn't throw if the
                     * JSON field has an unexpected type.
                     */
                    @JsonProperty("above_threshold_discount_percentage")
                    @ExcludeMissing
                    fun _aboveThresholdDiscountPercentage(): JsonField<String> =
                        aboveThresholdDiscountPercentage

                    /**
                     * Returns the raw JSON value of [belowThresholdDiscountPercentage].
                     *
                     * Unlike [belowThresholdDiscountPercentage], this method doesn't throw if the
                     * JSON field has an unexpected type.
                     */
                    @JsonProperty("below_threshold_discount_percentage")
                    @ExcludeMissing
                    fun _belowThresholdDiscountPercentage(): JsonField<String> =
                        belowThresholdDiscountPercentage

                    /**
                     * Returns the raw JSON value of [cellCoordinates].
                     *
                     * Unlike [cellCoordinates], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("cell_coordinates")
                    @ExcludeMissing
                    fun _cellCoordinates(): JsonField<String> = cellCoordinates

                    /**
                     * Returns the raw JSON value of [thresholdAmount].
                     *
                     * Unlike [thresholdAmount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("threshold_amount")
                    @ExcludeMissing
                    fun _thresholdAmount(): JsonField<String> = thresholdAmount

                    /**
                     * Returns the raw JSON value of [description].
                     *
                     * Unlike [description], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun _description(): JsonField<String> = description

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
                         * [ThresholdDiscountGroup].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .aboveThresholdDiscountPercentage()
                         * .belowThresholdDiscountPercentage()
                         * .cellCoordinates()
                         * .thresholdAmount()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [ThresholdDiscountGroup]. */
                    class Builder internal constructor() {

                        private var aboveThresholdDiscountPercentage: JsonField<String>? = null
                        private var belowThresholdDiscountPercentage: JsonField<String>? = null
                        private var cellCoordinates: JsonField<String>? = null
                        private var thresholdAmount: JsonField<String>? = null
                        private var description: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(thresholdDiscountGroup: ThresholdDiscountGroup) = apply {
                            aboveThresholdDiscountPercentage =
                                thresholdDiscountGroup.aboveThresholdDiscountPercentage
                            belowThresholdDiscountPercentage =
                                thresholdDiscountGroup.belowThresholdDiscountPercentage
                            cellCoordinates = thresholdDiscountGroup.cellCoordinates
                            thresholdAmount = thresholdDiscountGroup.thresholdAmount
                            description = thresholdDiscountGroup.description
                            additionalProperties =
                                thresholdDiscountGroup.additionalProperties.toMutableMap()
                        }

                        /** Discount rate applied to spend above the threshold. */
                        fun aboveThresholdDiscountPercentage(
                            aboveThresholdDiscountPercentage: String
                        ) =
                            aboveThresholdDiscountPercentage(
                                JsonField.of(aboveThresholdDiscountPercentage)
                            )

                        /**
                         * Sets [Builder.aboveThresholdDiscountPercentage] to an arbitrary JSON
                         * value.
                         *
                         * You should usually call [Builder.aboveThresholdDiscountPercentage] with a
                         * well-typed [String] value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun aboveThresholdDiscountPercentage(
                            aboveThresholdDiscountPercentage: JsonField<String>
                        ) = apply {
                            this.aboveThresholdDiscountPercentage = aboveThresholdDiscountPercentage
                        }

                        /**
                         * Discount rate applied to spend at or below the threshold. Set to 0 for no
                         * baseline discount.
                         */
                        fun belowThresholdDiscountPercentage(
                            belowThresholdDiscountPercentage: String
                        ) =
                            belowThresholdDiscountPercentage(
                                JsonField.of(belowThresholdDiscountPercentage)
                            )

                        /**
                         * Sets [Builder.belowThresholdDiscountPercentage] to an arbitrary JSON
                         * value.
                         *
                         * You should usually call [Builder.belowThresholdDiscountPercentage] with a
                         * well-typed [String] value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun belowThresholdDiscountPercentage(
                            belowThresholdDiscountPercentage: JsonField<String>
                        ) = apply {
                            this.belowThresholdDiscountPercentage = belowThresholdDiscountPercentage
                        }

                        /**
                         * Semicolon-separated list of matrix cell coordinates targeted by this
                         * group. Each coordinate is `first,second` when the matrix has two
                         * dimensions, or just `first` for a single-dimension matrix. Example:
                         * `blue,circle;green,triangle`.
                         */
                        fun cellCoordinates(cellCoordinates: String) =
                            cellCoordinates(JsonField.of(cellCoordinates))

                        /**
                         * Sets [Builder.cellCoordinates] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.cellCoordinates] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun cellCoordinates(cellCoordinates: JsonField<String>) = apply {
                            this.cellCoordinates = cellCoordinates
                        }

                        fun thresholdAmount(thresholdAmount: String) =
                            thresholdAmount(JsonField.of(thresholdAmount))

                        /**
                         * Sets [Builder.thresholdAmount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.thresholdAmount] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun thresholdAmount(thresholdAmount: JsonField<String>) = apply {
                            this.thresholdAmount = thresholdAmount
                        }

                        fun description(description: String?) =
                            description(JsonField.ofNullable(description))

                        /**
                         * Sets [Builder.description] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.description] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun description(description: JsonField<String>) = apply {
                            this.description = description
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ThresholdDiscountGroup].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .aboveThresholdDiscountPercentage()
                         * .belowThresholdDiscountPercentage()
                         * .cellCoordinates()
                         * .thresholdAmount()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): ThresholdDiscountGroup =
                            ThresholdDiscountGroup(
                                checkRequired(
                                    "aboveThresholdDiscountPercentage",
                                    aboveThresholdDiscountPercentage,
                                ),
                                checkRequired(
                                    "belowThresholdDiscountPercentage",
                                    belowThresholdDiscountPercentage,
                                ),
                                checkRequired("cellCoordinates", cellCoordinates),
                                checkRequired("thresholdAmount", thresholdAmount),
                                description,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OrbInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): ThresholdDiscountGroup = apply {
                        if (validated) {
                            return@apply
                        }

                        aboveThresholdDiscountPercentage()
                        belowThresholdDiscountPercentage()
                        cellCoordinates()
                        thresholdAmount()
                        description()
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        (if (aboveThresholdDiscountPercentage.asKnown() == null) 0 else 1) +
                            (if (belowThresholdDiscountPercentage.asKnown() == null) 0 else 1) +
                            (if (cellCoordinates.asKnown() == null) 0 else 1) +
                            (if (thresholdAmount.asKnown() == null) 0 else 1) +
                            (if (description.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ThresholdDiscountGroup &&
                            aboveThresholdDiscountPercentage ==
                                other.aboveThresholdDiscountPercentage &&
                            belowThresholdDiscountPercentage ==
                                other.belowThresholdDiscountPercentage &&
                            cellCoordinates == other.cellCoordinates &&
                            thresholdAmount == other.thresholdAmount &&
                            description == other.description &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            aboveThresholdDiscountPercentage,
                            belowThresholdDiscountPercentage,
                            cellCoordinates,
                            thresholdAmount,
                            description,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ThresholdDiscountGroup{aboveThresholdDiscountPercentage=$aboveThresholdDiscountPercentage, belowThresholdDiscountPercentage=$belowThresholdDiscountPercentage, cellCoordinates=$cellCoordinates, thresholdAmount=$thresholdAmount, description=$description, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MatrixWithThresholdDiscountsConfig &&
                        defaultUnitAmount == other.defaultUnitAmount &&
                        firstDimension == other.firstDimension &&
                        matrixValues == other.matrixValues &&
                        secondDimension == other.secondDimension &&
                        thresholdDiscountGroups == other.thresholdDiscountGroups &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        defaultUnitAmount,
                        firstDimension,
                        matrixValues,
                        secondDimension,
                        thresholdDiscountGroups,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MatrixWithThresholdDiscountsConfig{defaultUnitAmount=$defaultUnitAmount, firstDimension=$firstDimension, matrixValues=$matrixValues, secondDimension=$secondDimension, thresholdDiscountGroups=$thresholdDiscountGroups, additionalProperties=$additionalProperties}"
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MatrixWithThresholdDiscounts &&
                    cadence == other.cadence &&
                    currency == other.currency &&
                    itemId == other.itemId &&
                    matrixWithThresholdDiscountsConfig ==
                        other.matrixWithThresholdDiscountsConfig &&
                    modelType == other.modelType &&
                    name == other.name &&
                    billableMetricId == other.billableMetricId &&
                    billedInAdvance == other.billedInAdvance &&
                    billingCycleConfiguration == other.billingCycleConfiguration &&
                    conversionRate == other.conversionRate &&
                    conversionRateConfig == other.conversionRateConfig &&
                    dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                    externalPriceId == other.externalPriceId &&
                    fixedPriceQuantity == other.fixedPriceQuantity &&
                    invoiceGroupingKey == other.invoiceGroupingKey &&
                    invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                    licenseTypeId == other.licenseTypeId &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cadence,
                    currency,
                    itemId,
                    matrixWithThresholdDiscountsConfig,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    licenseTypeId,
                    metadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MatrixWithThresholdDiscounts{cadence=$cadence, currency=$currency, itemId=$itemId, matrixWithThresholdDiscountsConfig=$matrixWithThresholdDiscountsConfig, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, licenseTypeId=$licenseTypeId, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        class GroupedWithMinMaxThresholds
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cadence: JsonField<Cadence>,
            private val currency: JsonField<String>,
            private val groupedWithMinMaxThresholdsConfig:
                JsonField<GroupedWithMinMaxThresholdsConfig>,
            private val itemId: JsonField<String>,
            private val modelType: JsonValue,
            private val name: JsonField<String>,
            private val billableMetricId: JsonField<String>,
            private val billedInAdvance: JsonField<Boolean>,
            private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val conversionRate: JsonField<Double>,
            private val conversionRateConfig: JsonField<ConversionRateConfig>,
            private val dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>,
            private val externalPriceId: JsonField<String>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val invoiceGroupingKey: JsonField<String>,
            private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val licenseTypeId: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cadence")
                @ExcludeMissing
                cadence: JsonField<Cadence> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("grouped_with_min_max_thresholds_config")
                @ExcludeMissing
                groupedWithMinMaxThresholdsConfig: JsonField<GroupedWithMinMaxThresholdsConfig> =
                    JsonMissing.of(),
                @JsonProperty("item_id")
                @ExcludeMissing
                itemId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model_type") @ExcludeMissing modelType: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                billableMetricId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                conversionRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("external_price_id")
                @ExcludeMissing
                externalPriceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("license_type_id")
                @ExcludeMissing
                licenseTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(
                cadence,
                currency,
                groupedWithMinMaxThresholdsConfig,
                itemId,
                modelType,
                name,
                billableMetricId,
                billedInAdvance,
                billingCycleConfiguration,
                conversionRate,
                conversionRateConfig,
                dimensionalPriceConfiguration,
                externalPriceId,
                fixedPriceQuantity,
                invoiceGroupingKey,
                invoicingCycleConfiguration,
                licenseTypeId,
                metadata,
                mutableMapOf(),
            )

            /**
             * The cadence to bill for this price on.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cadence(): Cadence = cadence.getRequired("cadence")

            /**
             * An ISO 4217 currency string for which this price is billed in.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Configuration for grouped_with_min_max_thresholds pricing
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun groupedWithMinMaxThresholdsConfig(): GroupedWithMinMaxThresholdsConfig =
                groupedWithMinMaxThresholdsConfig.getRequired(
                    "grouped_with_min_max_thresholds_config"
                )

            /**
             * The id of the item the price will be associated with.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun itemId(): String = itemId.getRequired("item_id")

            /**
             * The pricing model type
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("grouped_with_min_max_thresholds")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

            /**
             * The name of the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                billingCycleConfiguration.getNullable("billing_cycle_configuration")

            /**
             * The per unit conversion rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /**
             * The configuration for the rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRateConfig(): ConversionRateConfig? =
                conversionRateConfig.getNullable("conversion_rate_config")

            /**
             * For dimensional price: specifies a price group and dimension values
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

            /**
             * An alias for the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            /**
             * The property used to group this price on an invoice
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoiceGroupingKey(): String? =
                invoiceGroupingKey.getNullable("invoice_grouping_key")

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

            /**
             * The ID of the license type to associate with this price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun licenseTypeId(): String? = licenseTypeId.getNullable("license_type_id")

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Returns the raw JSON value of [cadence].
             *
             * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [groupedWithMinMaxThresholdsConfig].
             *
             * Unlike [groupedWithMinMaxThresholdsConfig], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("grouped_with_min_max_thresholds_config")
            @ExcludeMissing
            fun _groupedWithMinMaxThresholdsConfig(): JsonField<GroupedWithMinMaxThresholdsConfig> =
                groupedWithMinMaxThresholdsConfig

            /**
             * Returns the raw JSON value of [itemId].
             *
             * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [billableMetricId].
             *
             * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billable_metric_id")
            @ExcludeMissing
            fun _billableMetricId(): JsonField<String> = billableMetricId

            /**
             * Returns the raw JSON value of [billedInAdvance].
             *
             * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billed_in_advance")
            @ExcludeMissing
            fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

            /**
             * Returns the raw JSON value of [billingCycleConfiguration].
             *
             * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("billing_cycle_configuration")
            @ExcludeMissing
            fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                billingCycleConfiguration

            /**
             * Returns the raw JSON value of [conversionRate].
             *
             * Unlike [conversionRate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun _conversionRate(): JsonField<Double> = conversionRate

            /**
             * Returns the raw JSON value of [conversionRateConfig].
             *
             * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate_config")
            @ExcludeMissing
            fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

            /**
             * Returns the raw JSON value of [dimensionalPriceConfiguration].
             *
             * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("dimensional_price_configuration")
            @ExcludeMissing
            fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                dimensionalPriceConfiguration

            /**
             * Returns the raw JSON value of [externalPriceId].
             *
             * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun _externalPriceId(): JsonField<String> = externalPriceId

            /**
             * Returns the raw JSON value of [fixedPriceQuantity].
             *
             * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

            /**
             * Returns the raw JSON value of [invoiceGroupingKey].
             *
             * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invoice_grouping_key")
            @ExcludeMissing
            fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

            /**
             * Returns the raw JSON value of [invoicingCycleConfiguration].
             *
             * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("invoicing_cycle_configuration")
            @ExcludeMissing
            fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                invoicingCycleConfiguration

            /**
             * Returns the raw JSON value of [licenseTypeId].
             *
             * Unlike [licenseTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("license_type_id")
            @ExcludeMissing
            fun _licenseTypeId(): JsonField<String> = licenseTypeId

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * [GroupedWithMinMaxThresholds].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .currency()
                 * .groupedWithMinMaxThresholdsConfig()
                 * .itemId()
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [GroupedWithMinMaxThresholds]. */
            class Builder internal constructor() {

                private var cadence: JsonField<Cadence>? = null
                private var currency: JsonField<String>? = null
                private var groupedWithMinMaxThresholdsConfig:
                    JsonField<GroupedWithMinMaxThresholdsConfig>? =
                    null
                private var itemId: JsonField<String>? = null
                private var modelType: JsonValue = JsonValue.from("grouped_with_min_max_thresholds")
                private var name: JsonField<String>? = null
                private var billableMetricId: JsonField<String> = JsonMissing.of()
                private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of()
                private var dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of()
                private var externalPriceId: JsonField<String> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                private var invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var licenseTypeId: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds) =
                    apply {
                        cadence = groupedWithMinMaxThresholds.cadence
                        currency = groupedWithMinMaxThresholds.currency
                        groupedWithMinMaxThresholdsConfig =
                            groupedWithMinMaxThresholds.groupedWithMinMaxThresholdsConfig
                        itemId = groupedWithMinMaxThresholds.itemId
                        modelType = groupedWithMinMaxThresholds.modelType
                        name = groupedWithMinMaxThresholds.name
                        billableMetricId = groupedWithMinMaxThresholds.billableMetricId
                        billedInAdvance = groupedWithMinMaxThresholds.billedInAdvance
                        billingCycleConfiguration =
                            groupedWithMinMaxThresholds.billingCycleConfiguration
                        conversionRate = groupedWithMinMaxThresholds.conversionRate
                        conversionRateConfig = groupedWithMinMaxThresholds.conversionRateConfig
                        dimensionalPriceConfiguration =
                            groupedWithMinMaxThresholds.dimensionalPriceConfiguration
                        externalPriceId = groupedWithMinMaxThresholds.externalPriceId
                        fixedPriceQuantity = groupedWithMinMaxThresholds.fixedPriceQuantity
                        invoiceGroupingKey = groupedWithMinMaxThresholds.invoiceGroupingKey
                        invoicingCycleConfiguration =
                            groupedWithMinMaxThresholds.invoicingCycleConfiguration
                        licenseTypeId = groupedWithMinMaxThresholds.licenseTypeId
                        metadata = groupedWithMinMaxThresholds.metadata
                        additionalProperties =
                            groupedWithMinMaxThresholds.additionalProperties.toMutableMap()
                    }

                /** The cadence to bill for this price on. */
                fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                /**
                 * Sets [Builder.cadence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** Configuration for grouped_with_min_max_thresholds pricing */
                fun groupedWithMinMaxThresholdsConfig(
                    groupedWithMinMaxThresholdsConfig: GroupedWithMinMaxThresholdsConfig
                ) =
                    groupedWithMinMaxThresholdsConfig(
                        JsonField.of(groupedWithMinMaxThresholdsConfig)
                    )

                /**
                 * Sets [Builder.groupedWithMinMaxThresholdsConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupedWithMinMaxThresholdsConfig] with a
                 * well-typed [GroupedWithMinMaxThresholdsConfig] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun groupedWithMinMaxThresholdsConfig(
                    groupedWithMinMaxThresholdsConfig: JsonField<GroupedWithMinMaxThresholdsConfig>
                ) = apply {
                    this.groupedWithMinMaxThresholdsConfig = groupedWithMinMaxThresholdsConfig
                }

                /** The id of the item the price will be associated with. */
                fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                /**
                 * Sets [Builder.itemId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.itemId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("grouped_with_min_max_thresholds")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                /** The name of the price. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(billableMetricId: String?) =
                    billableMetricId(JsonField.ofNullable(billableMetricId))

                /**
                 * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billableMetricId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                    this.billableMetricId = billableMetricId
                }

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(billedInAdvance: Boolean?) =
                    billedInAdvance(JsonField.ofNullable(billedInAdvance))

                /**
                 * Alias for [Builder.billedInAdvance].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun billedInAdvance(billedInAdvance: Boolean) =
                    billedInAdvance(billedInAdvance as Boolean?)

                /**
                 * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                    this.billedInAdvance = billedInAdvance
                }

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: NewBillingCycleConfiguration?
                ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                /**
                 * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double?) =
                    conversionRate(JsonField.ofNullable(conversionRate))

                /**
                 * Alias for [Builder.conversionRate].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(conversionRate as Double?)

                /**
                 * Sets [Builder.conversionRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRate] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 */
                fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                    conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                /**
                 * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRateConfig] with a well-typed
                 * [ConversionRateConfig] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun conversionRateConfig(conversionRateConfig: JsonField<ConversionRateConfig>) =
                    apply {
                        this.conversionRateConfig = conversionRateConfig
                    }

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofUnit(unit)`.
                 */
                fun conversionRateConfig(unit: UnitConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * UnitConversionRateConfig.builder()
                 *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                 *     .unitConfig(unitConfig)
                 *     .build()
                 * ```
                 */
                fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                    conversionRateConfig(
                        UnitConversionRateConfig.builder()
                            .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                            .unitConfig(unitConfig)
                            .build()
                    )

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofTiered(tiered)`.
                 */
                fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * TieredConversionRateConfig.builder()
                 *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                 *     .tieredConfig(tieredConfig)
                 *     .build()
                 * ```
                 */
                fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                    conversionRateConfig(
                        TieredConversionRateConfig.builder()
                            .conversionRateType(
                                TieredConversionRateConfig.ConversionRateType.TIERED
                            )
                            .tieredConfig(tieredConfig)
                            .build()
                    )

                /** For dimensional price: specifies a price group and dimension values */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                ) =
                    dimensionalPriceConfiguration(
                        JsonField.ofNullable(dimensionalPriceConfiguration)
                    )

                /**
                 * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dimensionalPriceConfiguration] with a well-typed
                 * [NewDimensionalPriceConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                /** An alias for the price. */
                fun externalPriceId(externalPriceId: String?) =
                    externalPriceId(JsonField.ofNullable(externalPriceId))

                /**
                 * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalPriceId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                    this.externalPriceId = externalPriceId
                }

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                    fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                /**
                 * Alias for [Builder.fixedPriceQuantity].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(fixedPriceQuantity as Double?)

                /**
                 * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fixedPriceQuantity] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                    invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                /**
                 * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceGroupingKey] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                    this.invoiceGroupingKey = invoiceGroupingKey
                }

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: NewBillingCycleConfiguration?
                ) = invoicingCycleConfiguration(JsonField.ofNullable(invoicingCycleConfiguration))

                /**
                 * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoicingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                /** The ID of the license type to associate with this price. */
                fun licenseTypeId(licenseTypeId: String?) =
                    licenseTypeId(JsonField.ofNullable(licenseTypeId))

                /**
                 * Sets [Builder.licenseTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.licenseTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun licenseTypeId(licenseTypeId: JsonField<String>) = apply {
                    this.licenseTypeId = licenseTypeId
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [GroupedWithMinMaxThresholds].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .currency()
                 * .groupedWithMinMaxThresholdsConfig()
                 * .itemId()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): GroupedWithMinMaxThresholds =
                    GroupedWithMinMaxThresholds(
                        checkRequired("cadence", cadence),
                        checkRequired("currency", currency),
                        checkRequired(
                            "groupedWithMinMaxThresholdsConfig",
                            groupedWithMinMaxThresholdsConfig,
                        ),
                        checkRequired("itemId", itemId),
                        modelType,
                        checkRequired("name", name),
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        licenseTypeId,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): GroupedWithMinMaxThresholds = apply {
                if (validated) {
                    return@apply
                }

                cadence().validate()
                currency()
                groupedWithMinMaxThresholdsConfig().validate()
                itemId()
                _modelType().let {
                    if (it != JsonValue.from("grouped_with_min_max_thresholds")) {
                        throw OrbInvalidDataException("'modelType' is invalid, received $it")
                    }
                }
                name()
                billableMetricId()
                billedInAdvance()
                billingCycleConfiguration()?.validate()
                conversionRate()
                conversionRateConfig()?.validate()
                dimensionalPriceConfiguration()?.validate()
                externalPriceId()
                fixedPriceQuantity()
                invoiceGroupingKey()
                invoicingCycleConfiguration()?.validate()
                licenseTypeId()
                metadata()?.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (cadence.asKnown()?.validity() ?: 0) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (groupedWithMinMaxThresholdsConfig.asKnown()?.validity() ?: 0) +
                    (if (itemId.asKnown() == null) 0 else 1) +
                    modelType.let {
                        if (it == JsonValue.from("grouped_with_min_max_thresholds")) 1 else 0
                    } +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (billableMetricId.asKnown() == null) 0 else 1) +
                    (if (billedInAdvance.asKnown() == null) 0 else 1) +
                    (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (conversionRate.asKnown() == null) 0 else 1) +
                    (conversionRateConfig.asKnown()?.validity() ?: 0) +
                    (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                    (if (externalPriceId.asKnown() == null) 0 else 1) +
                    (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                    (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                    (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (licenseTypeId.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0)

            /** The cadence to bill for this price on. */
            class Cadence @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ANNUAL = of("annual")

                    val SEMI_ANNUAL = of("semi_annual")

                    val MONTHLY = of("monthly")

                    val QUARTERLY = of("quarterly")

                    val ONE_TIME = of("one_time")

                    val CUSTOM = of("custom")

                    fun of(value: String) = Cadence(JsonField.of(value))
                }

                /** An enum containing [Cadence]'s known values. */
                enum class Known {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                }

                /**
                 * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Cadence] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                    /**
                     * An enum member indicating that [Cadence] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ANNUAL -> Value.ANNUAL
                        SEMI_ANNUAL -> Value.SEMI_ANNUAL
                        MONTHLY -> Value.MONTHLY
                        QUARTERLY -> Value.QUARTERLY
                        ONE_TIME -> Value.ONE_TIME
                        CUSTOM -> Value.CUSTOM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        ANNUAL -> Known.ANNUAL
                        SEMI_ANNUAL -> Known.SEMI_ANNUAL
                        MONTHLY -> Known.MONTHLY
                        QUARTERLY -> Known.QUARTERLY
                        ONE_TIME -> Known.ONE_TIME
                        CUSTOM -> Known.CUSTOM
                        else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Cadence = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cadence && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Configuration for grouped_with_min_max_thresholds pricing */
            class GroupedWithMinMaxThresholdsConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val groupingKey: JsonField<String>,
                private val maximumCharge: JsonField<String>,
                private val minimumCharge: JsonField<String>,
                private val perUnitRate: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("grouping_key")
                    @ExcludeMissing
                    groupingKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("maximum_charge")
                    @ExcludeMissing
                    maximumCharge: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("minimum_charge")
                    @ExcludeMissing
                    minimumCharge: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("per_unit_rate")
                    @ExcludeMissing
                    perUnitRate: JsonField<String> = JsonMissing.of(),
                ) : this(groupingKey, maximumCharge, minimumCharge, perUnitRate, mutableMapOf())

                /**
                 * The event property used to group before applying thresholds
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun groupingKey(): String = groupingKey.getRequired("grouping_key")

                /**
                 * The maximum amount to charge each group
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun maximumCharge(): String = maximumCharge.getRequired("maximum_charge")

                /**
                 * The minimum amount to charge each group, regardless of usage
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun minimumCharge(): String = minimumCharge.getRequired("minimum_charge")

                /**
                 * The base price charged per group
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun perUnitRate(): String = perUnitRate.getRequired("per_unit_rate")

                /**
                 * Returns the raw JSON value of [groupingKey].
                 *
                 * Unlike [groupingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("grouping_key")
                @ExcludeMissing
                fun _groupingKey(): JsonField<String> = groupingKey

                /**
                 * Returns the raw JSON value of [maximumCharge].
                 *
                 * Unlike [maximumCharge], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("maximum_charge")
                @ExcludeMissing
                fun _maximumCharge(): JsonField<String> = maximumCharge

                /**
                 * Returns the raw JSON value of [minimumCharge].
                 *
                 * Unlike [minimumCharge], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("minimum_charge")
                @ExcludeMissing
                fun _minimumCharge(): JsonField<String> = minimumCharge

                /**
                 * Returns the raw JSON value of [perUnitRate].
                 *
                 * Unlike [perUnitRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("per_unit_rate")
                @ExcludeMissing
                fun _perUnitRate(): JsonField<String> = perUnitRate

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
                     * [GroupedWithMinMaxThresholdsConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .groupingKey()
                     * .maximumCharge()
                     * .minimumCharge()
                     * .perUnitRate()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [GroupedWithMinMaxThresholdsConfig]. */
                class Builder internal constructor() {

                    private var groupingKey: JsonField<String>? = null
                    private var maximumCharge: JsonField<String>? = null
                    private var minimumCharge: JsonField<String>? = null
                    private var perUnitRate: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        groupedWithMinMaxThresholdsConfig: GroupedWithMinMaxThresholdsConfig
                    ) = apply {
                        groupingKey = groupedWithMinMaxThresholdsConfig.groupingKey
                        maximumCharge = groupedWithMinMaxThresholdsConfig.maximumCharge
                        minimumCharge = groupedWithMinMaxThresholdsConfig.minimumCharge
                        perUnitRate = groupedWithMinMaxThresholdsConfig.perUnitRate
                        additionalProperties =
                            groupedWithMinMaxThresholdsConfig.additionalProperties.toMutableMap()
                    }

                    /** The event property used to group before applying thresholds */
                    fun groupingKey(groupingKey: String) = groupingKey(JsonField.of(groupingKey))

                    /**
                     * Sets [Builder.groupingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupingKey] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun groupingKey(groupingKey: JsonField<String>) = apply {
                        this.groupingKey = groupingKey
                    }

                    /** The maximum amount to charge each group */
                    fun maximumCharge(maximumCharge: String) =
                        maximumCharge(JsonField.of(maximumCharge))

                    /**
                     * Sets [Builder.maximumCharge] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maximumCharge] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun maximumCharge(maximumCharge: JsonField<String>) = apply {
                        this.maximumCharge = maximumCharge
                    }

                    /** The minimum amount to charge each group, regardless of usage */
                    fun minimumCharge(minimumCharge: String) =
                        minimumCharge(JsonField.of(minimumCharge))

                    /**
                     * Sets [Builder.minimumCharge] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.minimumCharge] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun minimumCharge(minimumCharge: JsonField<String>) = apply {
                        this.minimumCharge = minimumCharge
                    }

                    /** The base price charged per group */
                    fun perUnitRate(perUnitRate: String) = perUnitRate(JsonField.of(perUnitRate))

                    /**
                     * Sets [Builder.perUnitRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.perUnitRate] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun perUnitRate(perUnitRate: JsonField<String>) = apply {
                        this.perUnitRate = perUnitRate
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [GroupedWithMinMaxThresholdsConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .groupingKey()
                     * .maximumCharge()
                     * .minimumCharge()
                     * .perUnitRate()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): GroupedWithMinMaxThresholdsConfig =
                        GroupedWithMinMaxThresholdsConfig(
                            checkRequired("groupingKey", groupingKey),
                            checkRequired("maximumCharge", maximumCharge),
                            checkRequired("minimumCharge", minimumCharge),
                            checkRequired("perUnitRate", perUnitRate),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): GroupedWithMinMaxThresholdsConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    groupingKey()
                    maximumCharge()
                    minimumCharge()
                    perUnitRate()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (groupingKey.asKnown() == null) 0 else 1) +
                        (if (maximumCharge.asKnown() == null) 0 else 1) +
                        (if (minimumCharge.asKnown() == null) 0 else 1) +
                        (if (perUnitRate.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is GroupedWithMinMaxThresholdsConfig &&
                        groupingKey == other.groupingKey &&
                        maximumCharge == other.maximumCharge &&
                        minimumCharge == other.minimumCharge &&
                        perUnitRate == other.perUnitRate &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        groupingKey,
                        maximumCharge,
                        minimumCharge,
                        perUnitRate,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GroupedWithMinMaxThresholdsConfig{groupingKey=$groupingKey, maximumCharge=$maximumCharge, minimumCharge=$minimumCharge, perUnitRate=$perUnitRate, additionalProperties=$additionalProperties}"
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GroupedWithMinMaxThresholds &&
                    cadence == other.cadence &&
                    currency == other.currency &&
                    groupedWithMinMaxThresholdsConfig == other.groupedWithMinMaxThresholdsConfig &&
                    itemId == other.itemId &&
                    modelType == other.modelType &&
                    name == other.name &&
                    billableMetricId == other.billableMetricId &&
                    billedInAdvance == other.billedInAdvance &&
                    billingCycleConfiguration == other.billingCycleConfiguration &&
                    conversionRate == other.conversionRate &&
                    conversionRateConfig == other.conversionRateConfig &&
                    dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                    externalPriceId == other.externalPriceId &&
                    fixedPriceQuantity == other.fixedPriceQuantity &&
                    invoiceGroupingKey == other.invoiceGroupingKey &&
                    invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                    licenseTypeId == other.licenseTypeId &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cadence,
                    currency,
                    groupedWithMinMaxThresholdsConfig,
                    itemId,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    licenseTypeId,
                    metadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GroupedWithMinMaxThresholds{cadence=$cadence, currency=$currency, groupedWithMinMaxThresholdsConfig=$groupedWithMinMaxThresholdsConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, licenseTypeId=$licenseTypeId, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        class CumulativeGroupedAllocation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cadence: JsonField<Cadence>,
            private val cumulativeGroupedAllocationConfig:
                JsonField<CumulativeGroupedAllocationConfig>,
            private val currency: JsonField<String>,
            private val itemId: JsonField<String>,
            private val modelType: JsonValue,
            private val name: JsonField<String>,
            private val billableMetricId: JsonField<String>,
            private val billedInAdvance: JsonField<Boolean>,
            private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val conversionRate: JsonField<Double>,
            private val conversionRateConfig: JsonField<ConversionRateConfig>,
            private val dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>,
            private val externalPriceId: JsonField<String>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val invoiceGroupingKey: JsonField<String>,
            private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val licenseTypeId: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cadence")
                @ExcludeMissing
                cadence: JsonField<Cadence> = JsonMissing.of(),
                @JsonProperty("cumulative_grouped_allocation_config")
                @ExcludeMissing
                cumulativeGroupedAllocationConfig: JsonField<CumulativeGroupedAllocationConfig> =
                    JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("item_id")
                @ExcludeMissing
                itemId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model_type") @ExcludeMissing modelType: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                billableMetricId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                conversionRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("external_price_id")
                @ExcludeMissing
                externalPriceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("license_type_id")
                @ExcludeMissing
                licenseTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(
                cadence,
                cumulativeGroupedAllocationConfig,
                currency,
                itemId,
                modelType,
                name,
                billableMetricId,
                billedInAdvance,
                billingCycleConfiguration,
                conversionRate,
                conversionRateConfig,
                dimensionalPriceConfiguration,
                externalPriceId,
                fixedPriceQuantity,
                invoiceGroupingKey,
                invoicingCycleConfiguration,
                licenseTypeId,
                metadata,
                mutableMapOf(),
            )

            /**
             * The cadence to bill for this price on.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cadence(): Cadence = cadence.getRequired("cadence")

            /**
             * Configuration for cumulative_grouped_allocation pricing
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cumulativeGroupedAllocationConfig(): CumulativeGroupedAllocationConfig =
                cumulativeGroupedAllocationConfig.getRequired(
                    "cumulative_grouped_allocation_config"
                )

            /**
             * An ISO 4217 currency string for which this price is billed in.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * The id of the item the price will be associated with.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun itemId(): String = itemId.getRequired("item_id")

            /**
             * The pricing model type
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("cumulative_grouped_allocation")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

            /**
             * The name of the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                billingCycleConfiguration.getNullable("billing_cycle_configuration")

            /**
             * The per unit conversion rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /**
             * The configuration for the rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRateConfig(): ConversionRateConfig? =
                conversionRateConfig.getNullable("conversion_rate_config")

            /**
             * For dimensional price: specifies a price group and dimension values
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

            /**
             * An alias for the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            /**
             * The property used to group this price on an invoice
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoiceGroupingKey(): String? =
                invoiceGroupingKey.getNullable("invoice_grouping_key")

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

            /**
             * The ID of the license type to associate with this price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun licenseTypeId(): String? = licenseTypeId.getNullable("license_type_id")

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Returns the raw JSON value of [cadence].
             *
             * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

            /**
             * Returns the raw JSON value of [cumulativeGroupedAllocationConfig].
             *
             * Unlike [cumulativeGroupedAllocationConfig], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("cumulative_grouped_allocation_config")
            @ExcludeMissing
            fun _cumulativeGroupedAllocationConfig(): JsonField<CumulativeGroupedAllocationConfig> =
                cumulativeGroupedAllocationConfig

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [itemId].
             *
             * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [billableMetricId].
             *
             * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billable_metric_id")
            @ExcludeMissing
            fun _billableMetricId(): JsonField<String> = billableMetricId

            /**
             * Returns the raw JSON value of [billedInAdvance].
             *
             * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billed_in_advance")
            @ExcludeMissing
            fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

            /**
             * Returns the raw JSON value of [billingCycleConfiguration].
             *
             * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("billing_cycle_configuration")
            @ExcludeMissing
            fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                billingCycleConfiguration

            /**
             * Returns the raw JSON value of [conversionRate].
             *
             * Unlike [conversionRate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun _conversionRate(): JsonField<Double> = conversionRate

            /**
             * Returns the raw JSON value of [conversionRateConfig].
             *
             * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate_config")
            @ExcludeMissing
            fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

            /**
             * Returns the raw JSON value of [dimensionalPriceConfiguration].
             *
             * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("dimensional_price_configuration")
            @ExcludeMissing
            fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                dimensionalPriceConfiguration

            /**
             * Returns the raw JSON value of [externalPriceId].
             *
             * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun _externalPriceId(): JsonField<String> = externalPriceId

            /**
             * Returns the raw JSON value of [fixedPriceQuantity].
             *
             * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

            /**
             * Returns the raw JSON value of [invoiceGroupingKey].
             *
             * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invoice_grouping_key")
            @ExcludeMissing
            fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

            /**
             * Returns the raw JSON value of [invoicingCycleConfiguration].
             *
             * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("invoicing_cycle_configuration")
            @ExcludeMissing
            fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                invoicingCycleConfiguration

            /**
             * Returns the raw JSON value of [licenseTypeId].
             *
             * Unlike [licenseTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("license_type_id")
            @ExcludeMissing
            fun _licenseTypeId(): JsonField<String> = licenseTypeId

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * [CumulativeGroupedAllocation].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .cumulativeGroupedAllocationConfig()
                 * .currency()
                 * .itemId()
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CumulativeGroupedAllocation]. */
            class Builder internal constructor() {

                private var cadence: JsonField<Cadence>? = null
                private var cumulativeGroupedAllocationConfig:
                    JsonField<CumulativeGroupedAllocationConfig>? =
                    null
                private var currency: JsonField<String>? = null
                private var itemId: JsonField<String>? = null
                private var modelType: JsonValue = JsonValue.from("cumulative_grouped_allocation")
                private var name: JsonField<String>? = null
                private var billableMetricId: JsonField<String> = JsonMissing.of()
                private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of()
                private var dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of()
                private var externalPriceId: JsonField<String> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                private var invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var licenseTypeId: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cumulativeGroupedAllocation: CumulativeGroupedAllocation) =
                    apply {
                        cadence = cumulativeGroupedAllocation.cadence
                        cumulativeGroupedAllocationConfig =
                            cumulativeGroupedAllocation.cumulativeGroupedAllocationConfig
                        currency = cumulativeGroupedAllocation.currency
                        itemId = cumulativeGroupedAllocation.itemId
                        modelType = cumulativeGroupedAllocation.modelType
                        name = cumulativeGroupedAllocation.name
                        billableMetricId = cumulativeGroupedAllocation.billableMetricId
                        billedInAdvance = cumulativeGroupedAllocation.billedInAdvance
                        billingCycleConfiguration =
                            cumulativeGroupedAllocation.billingCycleConfiguration
                        conversionRate = cumulativeGroupedAllocation.conversionRate
                        conversionRateConfig = cumulativeGroupedAllocation.conversionRateConfig
                        dimensionalPriceConfiguration =
                            cumulativeGroupedAllocation.dimensionalPriceConfiguration
                        externalPriceId = cumulativeGroupedAllocation.externalPriceId
                        fixedPriceQuantity = cumulativeGroupedAllocation.fixedPriceQuantity
                        invoiceGroupingKey = cumulativeGroupedAllocation.invoiceGroupingKey
                        invoicingCycleConfiguration =
                            cumulativeGroupedAllocation.invoicingCycleConfiguration
                        licenseTypeId = cumulativeGroupedAllocation.licenseTypeId
                        metadata = cumulativeGroupedAllocation.metadata
                        additionalProperties =
                            cumulativeGroupedAllocation.additionalProperties.toMutableMap()
                    }

                /** The cadence to bill for this price on. */
                fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                /**
                 * Sets [Builder.cadence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                /** Configuration for cumulative_grouped_allocation pricing */
                fun cumulativeGroupedAllocationConfig(
                    cumulativeGroupedAllocationConfig: CumulativeGroupedAllocationConfig
                ) =
                    cumulativeGroupedAllocationConfig(
                        JsonField.of(cumulativeGroupedAllocationConfig)
                    )

                /**
                 * Sets [Builder.cumulativeGroupedAllocationConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cumulativeGroupedAllocationConfig] with a
                 * well-typed [CumulativeGroupedAllocationConfig] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun cumulativeGroupedAllocationConfig(
                    cumulativeGroupedAllocationConfig: JsonField<CumulativeGroupedAllocationConfig>
                ) = apply {
                    this.cumulativeGroupedAllocationConfig = cumulativeGroupedAllocationConfig
                }

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The id of the item the price will be associated with. */
                fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                /**
                 * Sets [Builder.itemId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.itemId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("cumulative_grouped_allocation")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                /** The name of the price. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(billableMetricId: String?) =
                    billableMetricId(JsonField.ofNullable(billableMetricId))

                /**
                 * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billableMetricId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                    this.billableMetricId = billableMetricId
                }

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(billedInAdvance: Boolean?) =
                    billedInAdvance(JsonField.ofNullable(billedInAdvance))

                /**
                 * Alias for [Builder.billedInAdvance].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun billedInAdvance(billedInAdvance: Boolean) =
                    billedInAdvance(billedInAdvance as Boolean?)

                /**
                 * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                    this.billedInAdvance = billedInAdvance
                }

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: NewBillingCycleConfiguration?
                ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                /**
                 * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double?) =
                    conversionRate(JsonField.ofNullable(conversionRate))

                /**
                 * Alias for [Builder.conversionRate].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(conversionRate as Double?)

                /**
                 * Sets [Builder.conversionRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRate] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 */
                fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                    conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                /**
                 * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRateConfig] with a well-typed
                 * [ConversionRateConfig] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun conversionRateConfig(conversionRateConfig: JsonField<ConversionRateConfig>) =
                    apply {
                        this.conversionRateConfig = conversionRateConfig
                    }

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofUnit(unit)`.
                 */
                fun conversionRateConfig(unit: UnitConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * UnitConversionRateConfig.builder()
                 *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                 *     .unitConfig(unitConfig)
                 *     .build()
                 * ```
                 */
                fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                    conversionRateConfig(
                        UnitConversionRateConfig.builder()
                            .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                            .unitConfig(unitConfig)
                            .build()
                    )

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofTiered(tiered)`.
                 */
                fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * TieredConversionRateConfig.builder()
                 *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                 *     .tieredConfig(tieredConfig)
                 *     .build()
                 * ```
                 */
                fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                    conversionRateConfig(
                        TieredConversionRateConfig.builder()
                            .conversionRateType(
                                TieredConversionRateConfig.ConversionRateType.TIERED
                            )
                            .tieredConfig(tieredConfig)
                            .build()
                    )

                /** For dimensional price: specifies a price group and dimension values */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                ) =
                    dimensionalPriceConfiguration(
                        JsonField.ofNullable(dimensionalPriceConfiguration)
                    )

                /**
                 * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dimensionalPriceConfiguration] with a well-typed
                 * [NewDimensionalPriceConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                /** An alias for the price. */
                fun externalPriceId(externalPriceId: String?) =
                    externalPriceId(JsonField.ofNullable(externalPriceId))

                /**
                 * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalPriceId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                    this.externalPriceId = externalPriceId
                }

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                    fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                /**
                 * Alias for [Builder.fixedPriceQuantity].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(fixedPriceQuantity as Double?)

                /**
                 * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fixedPriceQuantity] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                    invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                /**
                 * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceGroupingKey] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                    this.invoiceGroupingKey = invoiceGroupingKey
                }

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: NewBillingCycleConfiguration?
                ) = invoicingCycleConfiguration(JsonField.ofNullable(invoicingCycleConfiguration))

                /**
                 * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoicingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                /** The ID of the license type to associate with this price. */
                fun licenseTypeId(licenseTypeId: String?) =
                    licenseTypeId(JsonField.ofNullable(licenseTypeId))

                /**
                 * Sets [Builder.licenseTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.licenseTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun licenseTypeId(licenseTypeId: JsonField<String>) = apply {
                    this.licenseTypeId = licenseTypeId
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CumulativeGroupedAllocation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .cumulativeGroupedAllocationConfig()
                 * .currency()
                 * .itemId()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CumulativeGroupedAllocation =
                    CumulativeGroupedAllocation(
                        checkRequired("cadence", cadence),
                        checkRequired(
                            "cumulativeGroupedAllocationConfig",
                            cumulativeGroupedAllocationConfig,
                        ),
                        checkRequired("currency", currency),
                        checkRequired("itemId", itemId),
                        modelType,
                        checkRequired("name", name),
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        licenseTypeId,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): CumulativeGroupedAllocation = apply {
                if (validated) {
                    return@apply
                }

                cadence().validate()
                cumulativeGroupedAllocationConfig().validate()
                currency()
                itemId()
                _modelType().let {
                    if (it != JsonValue.from("cumulative_grouped_allocation")) {
                        throw OrbInvalidDataException("'modelType' is invalid, received $it")
                    }
                }
                name()
                billableMetricId()
                billedInAdvance()
                billingCycleConfiguration()?.validate()
                conversionRate()
                conversionRateConfig()?.validate()
                dimensionalPriceConfiguration()?.validate()
                externalPriceId()
                fixedPriceQuantity()
                invoiceGroupingKey()
                invoicingCycleConfiguration()?.validate()
                licenseTypeId()
                metadata()?.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (cadence.asKnown()?.validity() ?: 0) +
                    (cumulativeGroupedAllocationConfig.asKnown()?.validity() ?: 0) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (if (itemId.asKnown() == null) 0 else 1) +
                    modelType.let {
                        if (it == JsonValue.from("cumulative_grouped_allocation")) 1 else 0
                    } +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (billableMetricId.asKnown() == null) 0 else 1) +
                    (if (billedInAdvance.asKnown() == null) 0 else 1) +
                    (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (conversionRate.asKnown() == null) 0 else 1) +
                    (conversionRateConfig.asKnown()?.validity() ?: 0) +
                    (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                    (if (externalPriceId.asKnown() == null) 0 else 1) +
                    (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                    (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                    (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (licenseTypeId.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0)

            /** The cadence to bill for this price on. */
            class Cadence @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ANNUAL = of("annual")

                    val SEMI_ANNUAL = of("semi_annual")

                    val MONTHLY = of("monthly")

                    val QUARTERLY = of("quarterly")

                    val ONE_TIME = of("one_time")

                    val CUSTOM = of("custom")

                    fun of(value: String) = Cadence(JsonField.of(value))
                }

                /** An enum containing [Cadence]'s known values. */
                enum class Known {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                }

                /**
                 * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Cadence] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                    /**
                     * An enum member indicating that [Cadence] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ANNUAL -> Value.ANNUAL
                        SEMI_ANNUAL -> Value.SEMI_ANNUAL
                        MONTHLY -> Value.MONTHLY
                        QUARTERLY -> Value.QUARTERLY
                        ONE_TIME -> Value.ONE_TIME
                        CUSTOM -> Value.CUSTOM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        ANNUAL -> Known.ANNUAL
                        SEMI_ANNUAL -> Known.SEMI_ANNUAL
                        MONTHLY -> Known.MONTHLY
                        QUARTERLY -> Known.QUARTERLY
                        ONE_TIME -> Known.ONE_TIME
                        CUSTOM -> Known.CUSTOM
                        else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Cadence = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cadence && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Configuration for cumulative_grouped_allocation pricing */
            class CumulativeGroupedAllocationConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val cumulativeAllocation: JsonField<String>,
                private val groupAllocation: JsonField<String>,
                private val groupingKey: JsonField<String>,
                private val unitAmount: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("cumulative_allocation")
                    @ExcludeMissing
                    cumulativeAllocation: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("group_allocation")
                    @ExcludeMissing
                    groupAllocation: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("grouping_key")
                    @ExcludeMissing
                    groupingKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    unitAmount: JsonField<String> = JsonMissing.of(),
                ) : this(
                    cumulativeAllocation,
                    groupAllocation,
                    groupingKey,
                    unitAmount,
                    mutableMapOf(),
                )

                /**
                 * The overall allocation across all groups
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cumulativeAllocation(): String =
                    cumulativeAllocation.getRequired("cumulative_allocation")

                /**
                 * The allocation per individual group
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun groupAllocation(): String = groupAllocation.getRequired("group_allocation")

                /**
                 * The event property used to group usage before applying allocations
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun groupingKey(): String = groupingKey.getRequired("grouping_key")

                /**
                 * The amount to charge for each unit outside of the allocation
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                /**
                 * Returns the raw JSON value of [cumulativeAllocation].
                 *
                 * Unlike [cumulativeAllocation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("cumulative_allocation")
                @ExcludeMissing
                fun _cumulativeAllocation(): JsonField<String> = cumulativeAllocation

                /**
                 * Returns the raw JSON value of [groupAllocation].
                 *
                 * Unlike [groupAllocation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("group_allocation")
                @ExcludeMissing
                fun _groupAllocation(): JsonField<String> = groupAllocation

                /**
                 * Returns the raw JSON value of [groupingKey].
                 *
                 * Unlike [groupingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("grouping_key")
                @ExcludeMissing
                fun _groupingKey(): JsonField<String> = groupingKey

                /**
                 * Returns the raw JSON value of [unitAmount].
                 *
                 * Unlike [unitAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("unit_amount")
                @ExcludeMissing
                fun _unitAmount(): JsonField<String> = unitAmount

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
                     * [CumulativeGroupedAllocationConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cumulativeAllocation()
                     * .groupAllocation()
                     * .groupingKey()
                     * .unitAmount()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [CumulativeGroupedAllocationConfig]. */
                class Builder internal constructor() {

                    private var cumulativeAllocation: JsonField<String>? = null
                    private var groupAllocation: JsonField<String>? = null
                    private var groupingKey: JsonField<String>? = null
                    private var unitAmount: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        cumulativeGroupedAllocationConfig: CumulativeGroupedAllocationConfig
                    ) = apply {
                        cumulativeAllocation =
                            cumulativeGroupedAllocationConfig.cumulativeAllocation
                        groupAllocation = cumulativeGroupedAllocationConfig.groupAllocation
                        groupingKey = cumulativeGroupedAllocationConfig.groupingKey
                        unitAmount = cumulativeGroupedAllocationConfig.unitAmount
                        additionalProperties =
                            cumulativeGroupedAllocationConfig.additionalProperties.toMutableMap()
                    }

                    /** The overall allocation across all groups */
                    fun cumulativeAllocation(cumulativeAllocation: String) =
                        cumulativeAllocation(JsonField.of(cumulativeAllocation))

                    /**
                     * Sets [Builder.cumulativeAllocation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cumulativeAllocation] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun cumulativeAllocation(cumulativeAllocation: JsonField<String>) = apply {
                        this.cumulativeAllocation = cumulativeAllocation
                    }

                    /** The allocation per individual group */
                    fun groupAllocation(groupAllocation: String) =
                        groupAllocation(JsonField.of(groupAllocation))

                    /**
                     * Sets [Builder.groupAllocation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupAllocation] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun groupAllocation(groupAllocation: JsonField<String>) = apply {
                        this.groupAllocation = groupAllocation
                    }

                    /** The event property used to group usage before applying allocations */
                    fun groupingKey(groupingKey: String) = groupingKey(JsonField.of(groupingKey))

                    /**
                     * Sets [Builder.groupingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupingKey] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun groupingKey(groupingKey: JsonField<String>) = apply {
                        this.groupingKey = groupingKey
                    }

                    /** The amount to charge for each unit outside of the allocation */
                    fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                    /**
                     * Sets [Builder.unitAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitAmount] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unitAmount(unitAmount: JsonField<String>) = apply {
                        this.unitAmount = unitAmount
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [CumulativeGroupedAllocationConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cumulativeAllocation()
                     * .groupAllocation()
                     * .groupingKey()
                     * .unitAmount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CumulativeGroupedAllocationConfig =
                        CumulativeGroupedAllocationConfig(
                            checkRequired("cumulativeAllocation", cumulativeAllocation),
                            checkRequired("groupAllocation", groupAllocation),
                            checkRequired("groupingKey", groupingKey),
                            checkRequired("unitAmount", unitAmount),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): CumulativeGroupedAllocationConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    cumulativeAllocation()
                    groupAllocation()
                    groupingKey()
                    unitAmount()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (cumulativeAllocation.asKnown() == null) 0 else 1) +
                        (if (groupAllocation.asKnown() == null) 0 else 1) +
                        (if (groupingKey.asKnown() == null) 0 else 1) +
                        (if (unitAmount.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CumulativeGroupedAllocationConfig &&
                        cumulativeAllocation == other.cumulativeAllocation &&
                        groupAllocation == other.groupAllocation &&
                        groupingKey == other.groupingKey &&
                        unitAmount == other.unitAmount &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        cumulativeAllocation,
                        groupAllocation,
                        groupingKey,
                        unitAmount,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CumulativeGroupedAllocationConfig{cumulativeAllocation=$cumulativeAllocation, groupAllocation=$groupAllocation, groupingKey=$groupingKey, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CumulativeGroupedAllocation &&
                    cadence == other.cadence &&
                    cumulativeGroupedAllocationConfig == other.cumulativeGroupedAllocationConfig &&
                    currency == other.currency &&
                    itemId == other.itemId &&
                    modelType == other.modelType &&
                    name == other.name &&
                    billableMetricId == other.billableMetricId &&
                    billedInAdvance == other.billedInAdvance &&
                    billingCycleConfiguration == other.billingCycleConfiguration &&
                    conversionRate == other.conversionRate &&
                    conversionRateConfig == other.conversionRateConfig &&
                    dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                    externalPriceId == other.externalPriceId &&
                    fixedPriceQuantity == other.fixedPriceQuantity &&
                    invoiceGroupingKey == other.invoiceGroupingKey &&
                    invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                    licenseTypeId == other.licenseTypeId &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cadence,
                    cumulativeGroupedAllocationConfig,
                    currency,
                    itemId,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    licenseTypeId,
                    metadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CumulativeGroupedAllocation{cadence=$cadence, cumulativeGroupedAllocationConfig=$cumulativeGroupedAllocationConfig, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, licenseTypeId=$licenseTypeId, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        class DailyCreditAllowance
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cadence: JsonField<Cadence>,
            private val currency: JsonField<String>,
            private val dailyCreditAllowanceConfig: JsonField<DailyCreditAllowanceConfig>,
            private val itemId: JsonField<String>,
            private val modelType: JsonValue,
            private val name: JsonField<String>,
            private val billableMetricId: JsonField<String>,
            private val billedInAdvance: JsonField<Boolean>,
            private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val conversionRate: JsonField<Double>,
            private val conversionRateConfig: JsonField<ConversionRateConfig>,
            private val dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>,
            private val externalPriceId: JsonField<String>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val invoiceGroupingKey: JsonField<String>,
            private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val licenseTypeId: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cadence")
                @ExcludeMissing
                cadence: JsonField<Cadence> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("daily_credit_allowance_config")
                @ExcludeMissing
                dailyCreditAllowanceConfig: JsonField<DailyCreditAllowanceConfig> =
                    JsonMissing.of(),
                @JsonProperty("item_id")
                @ExcludeMissing
                itemId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model_type") @ExcludeMissing modelType: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                billableMetricId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                conversionRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("external_price_id")
                @ExcludeMissing
                externalPriceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("license_type_id")
                @ExcludeMissing
                licenseTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(
                cadence,
                currency,
                dailyCreditAllowanceConfig,
                itemId,
                modelType,
                name,
                billableMetricId,
                billedInAdvance,
                billingCycleConfiguration,
                conversionRate,
                conversionRateConfig,
                dimensionalPriceConfiguration,
                externalPriceId,
                fixedPriceQuantity,
                invoiceGroupingKey,
                invoicingCycleConfiguration,
                licenseTypeId,
                metadata,
                mutableMapOf(),
            )

            /**
             * The cadence to bill for this price on.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cadence(): Cadence = cadence.getRequired("cadence")

            /**
             * An ISO 4217 currency string for which this price is billed in.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Configuration for daily_credit_allowance pricing
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun dailyCreditAllowanceConfig(): DailyCreditAllowanceConfig =
                dailyCreditAllowanceConfig.getRequired("daily_credit_allowance_config")

            /**
             * The id of the item the price will be associated with.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun itemId(): String = itemId.getRequired("item_id")

            /**
             * The pricing model type
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("daily_credit_allowance")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

            /**
             * The name of the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                billingCycleConfiguration.getNullable("billing_cycle_configuration")

            /**
             * The per unit conversion rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /**
             * The configuration for the rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRateConfig(): ConversionRateConfig? =
                conversionRateConfig.getNullable("conversion_rate_config")

            /**
             * For dimensional price: specifies a price group and dimension values
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

            /**
             * An alias for the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            /**
             * The property used to group this price on an invoice
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoiceGroupingKey(): String? =
                invoiceGroupingKey.getNullable("invoice_grouping_key")

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

            /**
             * The ID of the license type to associate with this price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun licenseTypeId(): String? = licenseTypeId.getNullable("license_type_id")

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Returns the raw JSON value of [cadence].
             *
             * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [dailyCreditAllowanceConfig].
             *
             * Unlike [dailyCreditAllowanceConfig], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("daily_credit_allowance_config")
            @ExcludeMissing
            fun _dailyCreditAllowanceConfig(): JsonField<DailyCreditAllowanceConfig> =
                dailyCreditAllowanceConfig

            /**
             * Returns the raw JSON value of [itemId].
             *
             * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [billableMetricId].
             *
             * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billable_metric_id")
            @ExcludeMissing
            fun _billableMetricId(): JsonField<String> = billableMetricId

            /**
             * Returns the raw JSON value of [billedInAdvance].
             *
             * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billed_in_advance")
            @ExcludeMissing
            fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

            /**
             * Returns the raw JSON value of [billingCycleConfiguration].
             *
             * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("billing_cycle_configuration")
            @ExcludeMissing
            fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                billingCycleConfiguration

            /**
             * Returns the raw JSON value of [conversionRate].
             *
             * Unlike [conversionRate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun _conversionRate(): JsonField<Double> = conversionRate

            /**
             * Returns the raw JSON value of [conversionRateConfig].
             *
             * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate_config")
            @ExcludeMissing
            fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

            /**
             * Returns the raw JSON value of [dimensionalPriceConfiguration].
             *
             * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("dimensional_price_configuration")
            @ExcludeMissing
            fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                dimensionalPriceConfiguration

            /**
             * Returns the raw JSON value of [externalPriceId].
             *
             * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun _externalPriceId(): JsonField<String> = externalPriceId

            /**
             * Returns the raw JSON value of [fixedPriceQuantity].
             *
             * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

            /**
             * Returns the raw JSON value of [invoiceGroupingKey].
             *
             * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invoice_grouping_key")
            @ExcludeMissing
            fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

            /**
             * Returns the raw JSON value of [invoicingCycleConfiguration].
             *
             * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("invoicing_cycle_configuration")
            @ExcludeMissing
            fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                invoicingCycleConfiguration

            /**
             * Returns the raw JSON value of [licenseTypeId].
             *
             * Unlike [licenseTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("license_type_id")
            @ExcludeMissing
            fun _licenseTypeId(): JsonField<String> = licenseTypeId

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * Returns a mutable builder for constructing an instance of [DailyCreditAllowance].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .currency()
                 * .dailyCreditAllowanceConfig()
                 * .itemId()
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [DailyCreditAllowance]. */
            class Builder internal constructor() {

                private var cadence: JsonField<Cadence>? = null
                private var currency: JsonField<String>? = null
                private var dailyCreditAllowanceConfig: JsonField<DailyCreditAllowanceConfig>? =
                    null
                private var itemId: JsonField<String>? = null
                private var modelType: JsonValue = JsonValue.from("daily_credit_allowance")
                private var name: JsonField<String>? = null
                private var billableMetricId: JsonField<String> = JsonMissing.of()
                private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of()
                private var dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of()
                private var externalPriceId: JsonField<String> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                private var invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var licenseTypeId: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(dailyCreditAllowance: DailyCreditAllowance) = apply {
                    cadence = dailyCreditAllowance.cadence
                    currency = dailyCreditAllowance.currency
                    dailyCreditAllowanceConfig = dailyCreditAllowance.dailyCreditAllowanceConfig
                    itemId = dailyCreditAllowance.itemId
                    modelType = dailyCreditAllowance.modelType
                    name = dailyCreditAllowance.name
                    billableMetricId = dailyCreditAllowance.billableMetricId
                    billedInAdvance = dailyCreditAllowance.billedInAdvance
                    billingCycleConfiguration = dailyCreditAllowance.billingCycleConfiguration
                    conversionRate = dailyCreditAllowance.conversionRate
                    conversionRateConfig = dailyCreditAllowance.conversionRateConfig
                    dimensionalPriceConfiguration =
                        dailyCreditAllowance.dimensionalPriceConfiguration
                    externalPriceId = dailyCreditAllowance.externalPriceId
                    fixedPriceQuantity = dailyCreditAllowance.fixedPriceQuantity
                    invoiceGroupingKey = dailyCreditAllowance.invoiceGroupingKey
                    invoicingCycleConfiguration = dailyCreditAllowance.invoicingCycleConfiguration
                    licenseTypeId = dailyCreditAllowance.licenseTypeId
                    metadata = dailyCreditAllowance.metadata
                    additionalProperties = dailyCreditAllowance.additionalProperties.toMutableMap()
                }

                /** The cadence to bill for this price on. */
                fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                /**
                 * Sets [Builder.cadence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** Configuration for daily_credit_allowance pricing */
                fun dailyCreditAllowanceConfig(
                    dailyCreditAllowanceConfig: DailyCreditAllowanceConfig
                ) = dailyCreditAllowanceConfig(JsonField.of(dailyCreditAllowanceConfig))

                /**
                 * Sets [Builder.dailyCreditAllowanceConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dailyCreditAllowanceConfig] with a well-typed
                 * [DailyCreditAllowanceConfig] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun dailyCreditAllowanceConfig(
                    dailyCreditAllowanceConfig: JsonField<DailyCreditAllowanceConfig>
                ) = apply { this.dailyCreditAllowanceConfig = dailyCreditAllowanceConfig }

                /** The id of the item the price will be associated with. */
                fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                /**
                 * Sets [Builder.itemId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.itemId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("daily_credit_allowance")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                /** The name of the price. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(billableMetricId: String?) =
                    billableMetricId(JsonField.ofNullable(billableMetricId))

                /**
                 * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billableMetricId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                    this.billableMetricId = billableMetricId
                }

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(billedInAdvance: Boolean?) =
                    billedInAdvance(JsonField.ofNullable(billedInAdvance))

                /**
                 * Alias for [Builder.billedInAdvance].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun billedInAdvance(billedInAdvance: Boolean) =
                    billedInAdvance(billedInAdvance as Boolean?)

                /**
                 * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                    this.billedInAdvance = billedInAdvance
                }

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: NewBillingCycleConfiguration?
                ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                /**
                 * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double?) =
                    conversionRate(JsonField.ofNullable(conversionRate))

                /**
                 * Alias for [Builder.conversionRate].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(conversionRate as Double?)

                /**
                 * Sets [Builder.conversionRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRate] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 */
                fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                    conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                /**
                 * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRateConfig] with a well-typed
                 * [ConversionRateConfig] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun conversionRateConfig(conversionRateConfig: JsonField<ConversionRateConfig>) =
                    apply {
                        this.conversionRateConfig = conversionRateConfig
                    }

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofUnit(unit)`.
                 */
                fun conversionRateConfig(unit: UnitConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * UnitConversionRateConfig.builder()
                 *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                 *     .unitConfig(unitConfig)
                 *     .build()
                 * ```
                 */
                fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                    conversionRateConfig(
                        UnitConversionRateConfig.builder()
                            .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                            .unitConfig(unitConfig)
                            .build()
                    )

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofTiered(tiered)`.
                 */
                fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * TieredConversionRateConfig.builder()
                 *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                 *     .tieredConfig(tieredConfig)
                 *     .build()
                 * ```
                 */
                fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                    conversionRateConfig(
                        TieredConversionRateConfig.builder()
                            .conversionRateType(
                                TieredConversionRateConfig.ConversionRateType.TIERED
                            )
                            .tieredConfig(tieredConfig)
                            .build()
                    )

                /** For dimensional price: specifies a price group and dimension values */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                ) =
                    dimensionalPriceConfiguration(
                        JsonField.ofNullable(dimensionalPriceConfiguration)
                    )

                /**
                 * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dimensionalPriceConfiguration] with a well-typed
                 * [NewDimensionalPriceConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                /** An alias for the price. */
                fun externalPriceId(externalPriceId: String?) =
                    externalPriceId(JsonField.ofNullable(externalPriceId))

                /**
                 * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalPriceId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                    this.externalPriceId = externalPriceId
                }

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                    fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                /**
                 * Alias for [Builder.fixedPriceQuantity].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(fixedPriceQuantity as Double?)

                /**
                 * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fixedPriceQuantity] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                    invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                /**
                 * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceGroupingKey] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                    this.invoiceGroupingKey = invoiceGroupingKey
                }

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: NewBillingCycleConfiguration?
                ) = invoicingCycleConfiguration(JsonField.ofNullable(invoicingCycleConfiguration))

                /**
                 * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoicingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                /** The ID of the license type to associate with this price. */
                fun licenseTypeId(licenseTypeId: String?) =
                    licenseTypeId(JsonField.ofNullable(licenseTypeId))

                /**
                 * Sets [Builder.licenseTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.licenseTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun licenseTypeId(licenseTypeId: JsonField<String>) = apply {
                    this.licenseTypeId = licenseTypeId
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DailyCreditAllowance].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .currency()
                 * .dailyCreditAllowanceConfig()
                 * .itemId()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DailyCreditAllowance =
                    DailyCreditAllowance(
                        checkRequired("cadence", cadence),
                        checkRequired("currency", currency),
                        checkRequired("dailyCreditAllowanceConfig", dailyCreditAllowanceConfig),
                        checkRequired("itemId", itemId),
                        modelType,
                        checkRequired("name", name),
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        licenseTypeId,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): DailyCreditAllowance = apply {
                if (validated) {
                    return@apply
                }

                cadence().validate()
                currency()
                dailyCreditAllowanceConfig().validate()
                itemId()
                _modelType().let {
                    if (it != JsonValue.from("daily_credit_allowance")) {
                        throw OrbInvalidDataException("'modelType' is invalid, received $it")
                    }
                }
                name()
                billableMetricId()
                billedInAdvance()
                billingCycleConfiguration()?.validate()
                conversionRate()
                conversionRateConfig()?.validate()
                dimensionalPriceConfiguration()?.validate()
                externalPriceId()
                fixedPriceQuantity()
                invoiceGroupingKey()
                invoicingCycleConfiguration()?.validate()
                licenseTypeId()
                metadata()?.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (cadence.asKnown()?.validity() ?: 0) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (dailyCreditAllowanceConfig.asKnown()?.validity() ?: 0) +
                    (if (itemId.asKnown() == null) 0 else 1) +
                    modelType.let { if (it == JsonValue.from("daily_credit_allowance")) 1 else 0 } +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (billableMetricId.asKnown() == null) 0 else 1) +
                    (if (billedInAdvance.asKnown() == null) 0 else 1) +
                    (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (conversionRate.asKnown() == null) 0 else 1) +
                    (conversionRateConfig.asKnown()?.validity() ?: 0) +
                    (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                    (if (externalPriceId.asKnown() == null) 0 else 1) +
                    (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                    (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                    (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (licenseTypeId.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0)

            /** The cadence to bill for this price on. */
            class Cadence @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ANNUAL = of("annual")

                    val SEMI_ANNUAL = of("semi_annual")

                    val MONTHLY = of("monthly")

                    val QUARTERLY = of("quarterly")

                    val ONE_TIME = of("one_time")

                    val CUSTOM = of("custom")

                    fun of(value: String) = Cadence(JsonField.of(value))
                }

                /** An enum containing [Cadence]'s known values. */
                enum class Known {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                }

                /**
                 * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Cadence] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                    /**
                     * An enum member indicating that [Cadence] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ANNUAL -> Value.ANNUAL
                        SEMI_ANNUAL -> Value.SEMI_ANNUAL
                        MONTHLY -> Value.MONTHLY
                        QUARTERLY -> Value.QUARTERLY
                        ONE_TIME -> Value.ONE_TIME
                        CUSTOM -> Value.CUSTOM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        ANNUAL -> Known.ANNUAL
                        SEMI_ANNUAL -> Known.SEMI_ANNUAL
                        MONTHLY -> Known.MONTHLY
                        QUARTERLY -> Known.QUARTERLY
                        ONE_TIME -> Known.ONE_TIME
                        CUSTOM -> Known.CUSTOM
                        else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Cadence = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cadence && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Configuration for daily_credit_allowance pricing */
            class DailyCreditAllowanceConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val dailyAllowance: JsonField<String>,
                private val defaultUnitAmount: JsonField<String>,
                private val dimensions: JsonField<List<String?>>,
                private val eventDayProperty: JsonField<String>,
                private val matrixValues: JsonField<List<MatrixValue>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("daily_allowance")
                    @ExcludeMissing
                    dailyAllowance: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("default_unit_amount")
                    @ExcludeMissing
                    defaultUnitAmount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("dimensions")
                    @ExcludeMissing
                    dimensions: JsonField<List<String?>> = JsonMissing.of(),
                    @JsonProperty("event_day_property")
                    @ExcludeMissing
                    eventDayProperty: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("matrix_values")
                    @ExcludeMissing
                    matrixValues: JsonField<List<MatrixValue>> = JsonMissing.of(),
                ) : this(
                    dailyAllowance,
                    defaultUnitAmount,
                    dimensions,
                    eventDayProperty,
                    matrixValues,
                    mutableMapOf(),
                )

                /**
                 * Credits granted per day. Lose-it-or-use-it; does not roll over.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun dailyAllowance(): String = dailyAllowance.getRequired("daily_allowance")

                /**
                 * Default per-unit credit rate for any usage not bucketed into a specified
                 * matrix_value
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun defaultUnitAmount(): String =
                    defaultUnitAmount.getRequired("default_unit_amount")

                /**
                 * One or two event property values to evaluate matrix groups by
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun dimensions(): List<String?> = dimensions.getRequired("dimensions")

                /**
                 * Event property whose value identifies the day bucket the event belongs to (e.g.
                 * 'event_day' set to an ISO date string in the customer's timezone). The allowance
                 * resets per distinct value of this property.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun eventDayProperty(): String = eventDayProperty.getRequired("event_day_property")

                /**
                 * Per-dimension credit rates
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun matrixValues(): List<MatrixValue> = matrixValues.getRequired("matrix_values")

                /**
                 * Returns the raw JSON value of [dailyAllowance].
                 *
                 * Unlike [dailyAllowance], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("daily_allowance")
                @ExcludeMissing
                fun _dailyAllowance(): JsonField<String> = dailyAllowance

                /**
                 * Returns the raw JSON value of [defaultUnitAmount].
                 *
                 * Unlike [defaultUnitAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("default_unit_amount")
                @ExcludeMissing
                fun _defaultUnitAmount(): JsonField<String> = defaultUnitAmount

                /**
                 * Returns the raw JSON value of [dimensions].
                 *
                 * Unlike [dimensions], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("dimensions")
                @ExcludeMissing
                fun _dimensions(): JsonField<List<String?>> = dimensions

                /**
                 * Returns the raw JSON value of [eventDayProperty].
                 *
                 * Unlike [eventDayProperty], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("event_day_property")
                @ExcludeMissing
                fun _eventDayProperty(): JsonField<String> = eventDayProperty

                /**
                 * Returns the raw JSON value of [matrixValues].
                 *
                 * Unlike [matrixValues], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("matrix_values")
                @ExcludeMissing
                fun _matrixValues(): JsonField<List<MatrixValue>> = matrixValues

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
                     * [DailyCreditAllowanceConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .dailyAllowance()
                     * .defaultUnitAmount()
                     * .dimensions()
                     * .eventDayProperty()
                     * .matrixValues()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [DailyCreditAllowanceConfig]. */
                class Builder internal constructor() {

                    private var dailyAllowance: JsonField<String>? = null
                    private var defaultUnitAmount: JsonField<String>? = null
                    private var dimensions: JsonField<MutableList<String?>>? = null
                    private var eventDayProperty: JsonField<String>? = null
                    private var matrixValues: JsonField<MutableList<MatrixValue>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(dailyCreditAllowanceConfig: DailyCreditAllowanceConfig) =
                        apply {
                            dailyAllowance = dailyCreditAllowanceConfig.dailyAllowance
                            defaultUnitAmount = dailyCreditAllowanceConfig.defaultUnitAmount
                            dimensions =
                                dailyCreditAllowanceConfig.dimensions.map { it.toMutableList() }
                            eventDayProperty = dailyCreditAllowanceConfig.eventDayProperty
                            matrixValues =
                                dailyCreditAllowanceConfig.matrixValues.map { it.toMutableList() }
                            additionalProperties =
                                dailyCreditAllowanceConfig.additionalProperties.toMutableMap()
                        }

                    /** Credits granted per day. Lose-it-or-use-it; does not roll over. */
                    fun dailyAllowance(dailyAllowance: String) =
                        dailyAllowance(JsonField.of(dailyAllowance))

                    /**
                     * Sets [Builder.dailyAllowance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dailyAllowance] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun dailyAllowance(dailyAllowance: JsonField<String>) = apply {
                        this.dailyAllowance = dailyAllowance
                    }

                    /**
                     * Default per-unit credit rate for any usage not bucketed into a specified
                     * matrix_value
                     */
                    fun defaultUnitAmount(defaultUnitAmount: String) =
                        defaultUnitAmount(JsonField.of(defaultUnitAmount))

                    /**
                     * Sets [Builder.defaultUnitAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.defaultUnitAmount] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun defaultUnitAmount(defaultUnitAmount: JsonField<String>) = apply {
                        this.defaultUnitAmount = defaultUnitAmount
                    }

                    /** One or two event property values to evaluate matrix groups by */
                    fun dimensions(dimensions: List<String?>) = dimensions(JsonField.of(dimensions))

                    /**
                     * Sets [Builder.dimensions] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dimensions] with a well-typed
                     * `List<String?>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun dimensions(dimensions: JsonField<List<String?>>) = apply {
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

                    /**
                     * Event property whose value identifies the day bucket the event belongs to
                     * (e.g. 'event_day' set to an ISO date string in the customer's timezone). The
                     * allowance resets per distinct value of this property.
                     */
                    fun eventDayProperty(eventDayProperty: String) =
                        eventDayProperty(JsonField.of(eventDayProperty))

                    /**
                     * Sets [Builder.eventDayProperty] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.eventDayProperty] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun eventDayProperty(eventDayProperty: JsonField<String>) = apply {
                        this.eventDayProperty = eventDayProperty
                    }

                    /** Per-dimension credit rates */
                    fun matrixValues(matrixValues: List<MatrixValue>) =
                        matrixValues(JsonField.of(matrixValues))

                    /**
                     * Sets [Builder.matrixValues] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.matrixValues] with a well-typed
                     * `List<MatrixValue>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun matrixValues(matrixValues: JsonField<List<MatrixValue>>) = apply {
                        this.matrixValues = matrixValues.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [MatrixValue] to [matrixValues].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addMatrixValue(matrixValue: MatrixValue) = apply {
                        matrixValues =
                            (matrixValues ?: JsonField.of(mutableListOf())).also {
                                checkKnown("matrixValues", it).add(matrixValue)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [DailyCreditAllowanceConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .dailyAllowance()
                     * .defaultUnitAmount()
                     * .dimensions()
                     * .eventDayProperty()
                     * .matrixValues()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): DailyCreditAllowanceConfig =
                        DailyCreditAllowanceConfig(
                            checkRequired("dailyAllowance", dailyAllowance),
                            checkRequired("defaultUnitAmount", defaultUnitAmount),
                            checkRequired("dimensions", dimensions).map { it.toImmutable() },
                            checkRequired("eventDayProperty", eventDayProperty),
                            checkRequired("matrixValues", matrixValues).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): DailyCreditAllowanceConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    dailyAllowance()
                    defaultUnitAmount()
                    dimensions()
                    eventDayProperty()
                    matrixValues().forEach { it.validate() }
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (dailyAllowance.asKnown() == null) 0 else 1) +
                        (if (defaultUnitAmount.asKnown() == null) 0 else 1) +
                        (dimensions.asKnown()?.sumOf { (if (it == null) 0 else 1).toInt() } ?: 0) +
                        (if (eventDayProperty.asKnown() == null) 0 else 1) +
                        (matrixValues.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

                /** Per-dimension credit price for the daily credit allowance model. */
                class MatrixValue
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val dimensionValues: JsonField<List<String?>>,
                    private val unitAmount: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("dimension_values")
                        @ExcludeMissing
                        dimensionValues: JsonField<List<String?>> = JsonMissing.of(),
                        @JsonProperty("unit_amount")
                        @ExcludeMissing
                        unitAmount: JsonField<String> = JsonMissing.of(),
                    ) : this(dimensionValues, unitAmount, mutableMapOf())

                    /**
                     * One or two matrix keys to filter usage to this value by. For example,
                     * ["model"] could be used to apply a different credit rate to each AI model.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun dimensionValues(): List<String?> =
                        dimensionValues.getRequired("dimension_values")

                    /**
                     * Credits charged per unit of usage matching the specified dimension_values
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                    /**
                     * Returns the raw JSON value of [dimensionValues].
                     *
                     * Unlike [dimensionValues], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("dimension_values")
                    @ExcludeMissing
                    fun _dimensionValues(): JsonField<List<String?>> = dimensionValues

                    /**
                     * Returns the raw JSON value of [unitAmount].
                     *
                     * Unlike [unitAmount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    fun _unitAmount(): JsonField<String> = unitAmount

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
                         * Returns a mutable builder for constructing an instance of [MatrixValue].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .dimensionValues()
                         * .unitAmount()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [MatrixValue]. */
                    class Builder internal constructor() {

                        private var dimensionValues: JsonField<MutableList<String?>>? = null
                        private var unitAmount: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(matrixValue: MatrixValue) = apply {
                            dimensionValues = matrixValue.dimensionValues.map { it.toMutableList() }
                            unitAmount = matrixValue.unitAmount
                            additionalProperties = matrixValue.additionalProperties.toMutableMap()
                        }

                        /**
                         * One or two matrix keys to filter usage to this value by. For example,
                         * ["model"] could be used to apply a different credit rate to each AI
                         * model.
                         */
                        fun dimensionValues(dimensionValues: List<String?>) =
                            dimensionValues(JsonField.of(dimensionValues))

                        /**
                         * Sets [Builder.dimensionValues] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.dimensionValues] with a well-typed
                         * `List<String?>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
                            this.dimensionValues = dimensionValues.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [dimensionValues].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addDimensionValue(dimensionValue: String) = apply {
                            dimensionValues =
                                (dimensionValues ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("dimensionValues", it).add(dimensionValue)
                                }
                        }

                        /**
                         * Credits charged per unit of usage matching the specified dimension_values
                         */
                        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                        /**
                         * Sets [Builder.unitAmount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unitAmount] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unitAmount(unitAmount: JsonField<String>) = apply {
                            this.unitAmount = unitAmount
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [MatrixValue].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .dimensionValues()
                         * .unitAmount()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): MatrixValue =
                            MatrixValue(
                                checkRequired("dimensionValues", dimensionValues).map {
                                    it.toImmutable()
                                },
                                checkRequired("unitAmount", unitAmount),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OrbInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): MatrixValue = apply {
                        if (validated) {
                            return@apply
                        }

                        dimensionValues()
                        unitAmount()
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int =
                        (dimensionValues.asKnown()?.sumOf { (if (it == null) 0 else 1).toInt() }
                            ?: 0) + (if (unitAmount.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is MatrixValue &&
                            dimensionValues == other.dimensionValues &&
                            unitAmount == other.unitAmount &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(dimensionValues, unitAmount, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "MatrixValue{dimensionValues=$dimensionValues, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DailyCreditAllowanceConfig &&
                        dailyAllowance == other.dailyAllowance &&
                        defaultUnitAmount == other.defaultUnitAmount &&
                        dimensions == other.dimensions &&
                        eventDayProperty == other.eventDayProperty &&
                        matrixValues == other.matrixValues &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        dailyAllowance,
                        defaultUnitAmount,
                        dimensions,
                        eventDayProperty,
                        matrixValues,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DailyCreditAllowanceConfig{dailyAllowance=$dailyAllowance, defaultUnitAmount=$defaultUnitAmount, dimensions=$dimensions, eventDayProperty=$eventDayProperty, matrixValues=$matrixValues, additionalProperties=$additionalProperties}"
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DailyCreditAllowance &&
                    cadence == other.cadence &&
                    currency == other.currency &&
                    dailyCreditAllowanceConfig == other.dailyCreditAllowanceConfig &&
                    itemId == other.itemId &&
                    modelType == other.modelType &&
                    name == other.name &&
                    billableMetricId == other.billableMetricId &&
                    billedInAdvance == other.billedInAdvance &&
                    billingCycleConfiguration == other.billingCycleConfiguration &&
                    conversionRate == other.conversionRate &&
                    conversionRateConfig == other.conversionRateConfig &&
                    dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                    externalPriceId == other.externalPriceId &&
                    fixedPriceQuantity == other.fixedPriceQuantity &&
                    invoiceGroupingKey == other.invoiceGroupingKey &&
                    invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                    licenseTypeId == other.licenseTypeId &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cadence,
                    currency,
                    dailyCreditAllowanceConfig,
                    itemId,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    licenseTypeId,
                    metadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DailyCreditAllowance{cadence=$cadence, currency=$currency, dailyCreditAllowanceConfig=$dailyCreditAllowanceConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, licenseTypeId=$licenseTypeId, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        class MeteredAllowance
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cadence: JsonField<Cadence>,
            private val currency: JsonField<String>,
            private val itemId: JsonField<String>,
            private val meteredAllowanceConfig: JsonField<MeteredAllowanceConfig>,
            private val modelType: JsonValue,
            private val name: JsonField<String>,
            private val billableMetricId: JsonField<String>,
            private val billedInAdvance: JsonField<Boolean>,
            private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val conversionRate: JsonField<Double>,
            private val conversionRateConfig: JsonField<ConversionRateConfig>,
            private val dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>,
            private val externalPriceId: JsonField<String>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val invoiceGroupingKey: JsonField<String>,
            private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val licenseTypeId: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cadence")
                @ExcludeMissing
                cadence: JsonField<Cadence> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("item_id")
                @ExcludeMissing
                itemId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metered_allowance_config")
                @ExcludeMissing
                meteredAllowanceConfig: JsonField<MeteredAllowanceConfig> = JsonMissing.of(),
                @JsonProperty("model_type") @ExcludeMissing modelType: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                billableMetricId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                conversionRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("external_price_id")
                @ExcludeMissing
                externalPriceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("license_type_id")
                @ExcludeMissing
                licenseTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(
                cadence,
                currency,
                itemId,
                meteredAllowanceConfig,
                modelType,
                name,
                billableMetricId,
                billedInAdvance,
                billingCycleConfiguration,
                conversionRate,
                conversionRateConfig,
                dimensionalPriceConfiguration,
                externalPriceId,
                fixedPriceQuantity,
                invoiceGroupingKey,
                invoicingCycleConfiguration,
                licenseTypeId,
                metadata,
                mutableMapOf(),
            )

            /**
             * The cadence to bill for this price on.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cadence(): Cadence = cadence.getRequired("cadence")

            /**
             * An ISO 4217 currency string for which this price is billed in.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * The id of the item the price will be associated with.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun itemId(): String = itemId.getRequired("item_id")

            /**
             * Configuration for metered_allowance pricing
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun meteredAllowanceConfig(): MeteredAllowanceConfig =
                meteredAllowanceConfig.getRequired("metered_allowance_config")

            /**
             * The pricing model type
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("metered_allowance")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

            /**
             * The name of the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                billingCycleConfiguration.getNullable("billing_cycle_configuration")

            /**
             * The per unit conversion rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /**
             * The configuration for the rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRateConfig(): ConversionRateConfig? =
                conversionRateConfig.getNullable("conversion_rate_config")

            /**
             * For dimensional price: specifies a price group and dimension values
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

            /**
             * An alias for the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            /**
             * The property used to group this price on an invoice
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoiceGroupingKey(): String? =
                invoiceGroupingKey.getNullable("invoice_grouping_key")

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

            /**
             * The ID of the license type to associate with this price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun licenseTypeId(): String? = licenseTypeId.getNullable("license_type_id")

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Returns the raw JSON value of [cadence].
             *
             * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [itemId].
             *
             * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

            /**
             * Returns the raw JSON value of [meteredAllowanceConfig].
             *
             * Unlike [meteredAllowanceConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("metered_allowance_config")
            @ExcludeMissing
            fun _meteredAllowanceConfig(): JsonField<MeteredAllowanceConfig> =
                meteredAllowanceConfig

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [billableMetricId].
             *
             * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billable_metric_id")
            @ExcludeMissing
            fun _billableMetricId(): JsonField<String> = billableMetricId

            /**
             * Returns the raw JSON value of [billedInAdvance].
             *
             * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billed_in_advance")
            @ExcludeMissing
            fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

            /**
             * Returns the raw JSON value of [billingCycleConfiguration].
             *
             * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("billing_cycle_configuration")
            @ExcludeMissing
            fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                billingCycleConfiguration

            /**
             * Returns the raw JSON value of [conversionRate].
             *
             * Unlike [conversionRate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun _conversionRate(): JsonField<Double> = conversionRate

            /**
             * Returns the raw JSON value of [conversionRateConfig].
             *
             * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate_config")
            @ExcludeMissing
            fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

            /**
             * Returns the raw JSON value of [dimensionalPriceConfiguration].
             *
             * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("dimensional_price_configuration")
            @ExcludeMissing
            fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                dimensionalPriceConfiguration

            /**
             * Returns the raw JSON value of [externalPriceId].
             *
             * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun _externalPriceId(): JsonField<String> = externalPriceId

            /**
             * Returns the raw JSON value of [fixedPriceQuantity].
             *
             * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

            /**
             * Returns the raw JSON value of [invoiceGroupingKey].
             *
             * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invoice_grouping_key")
            @ExcludeMissing
            fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

            /**
             * Returns the raw JSON value of [invoicingCycleConfiguration].
             *
             * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("invoicing_cycle_configuration")
            @ExcludeMissing
            fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                invoicingCycleConfiguration

            /**
             * Returns the raw JSON value of [licenseTypeId].
             *
             * Unlike [licenseTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("license_type_id")
            @ExcludeMissing
            fun _licenseTypeId(): JsonField<String> = licenseTypeId

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * Returns a mutable builder for constructing an instance of [MeteredAllowance].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .currency()
                 * .itemId()
                 * .meteredAllowanceConfig()
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MeteredAllowance]. */
            class Builder internal constructor() {

                private var cadence: JsonField<Cadence>? = null
                private var currency: JsonField<String>? = null
                private var itemId: JsonField<String>? = null
                private var meteredAllowanceConfig: JsonField<MeteredAllowanceConfig>? = null
                private var modelType: JsonValue = JsonValue.from("metered_allowance")
                private var name: JsonField<String>? = null
                private var billableMetricId: JsonField<String> = JsonMissing.of()
                private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of()
                private var dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of()
                private var externalPriceId: JsonField<String> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                private var invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var licenseTypeId: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(meteredAllowance: MeteredAllowance) = apply {
                    cadence = meteredAllowance.cadence
                    currency = meteredAllowance.currency
                    itemId = meteredAllowance.itemId
                    meteredAllowanceConfig = meteredAllowance.meteredAllowanceConfig
                    modelType = meteredAllowance.modelType
                    name = meteredAllowance.name
                    billableMetricId = meteredAllowance.billableMetricId
                    billedInAdvance = meteredAllowance.billedInAdvance
                    billingCycleConfiguration = meteredAllowance.billingCycleConfiguration
                    conversionRate = meteredAllowance.conversionRate
                    conversionRateConfig = meteredAllowance.conversionRateConfig
                    dimensionalPriceConfiguration = meteredAllowance.dimensionalPriceConfiguration
                    externalPriceId = meteredAllowance.externalPriceId
                    fixedPriceQuantity = meteredAllowance.fixedPriceQuantity
                    invoiceGroupingKey = meteredAllowance.invoiceGroupingKey
                    invoicingCycleConfiguration = meteredAllowance.invoicingCycleConfiguration
                    licenseTypeId = meteredAllowance.licenseTypeId
                    metadata = meteredAllowance.metadata
                    additionalProperties = meteredAllowance.additionalProperties.toMutableMap()
                }

                /** The cadence to bill for this price on. */
                fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                /**
                 * Sets [Builder.cadence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The id of the item the price will be associated with. */
                fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                /**
                 * Sets [Builder.itemId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.itemId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                /** Configuration for metered_allowance pricing */
                fun meteredAllowanceConfig(meteredAllowanceConfig: MeteredAllowanceConfig) =
                    meteredAllowanceConfig(JsonField.of(meteredAllowanceConfig))

                /**
                 * Sets [Builder.meteredAllowanceConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.meteredAllowanceConfig] with a well-typed
                 * [MeteredAllowanceConfig] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun meteredAllowanceConfig(
                    meteredAllowanceConfig: JsonField<MeteredAllowanceConfig>
                ) = apply { this.meteredAllowanceConfig = meteredAllowanceConfig }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("metered_allowance")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                /** The name of the price. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(billableMetricId: String?) =
                    billableMetricId(JsonField.ofNullable(billableMetricId))

                /**
                 * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billableMetricId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                    this.billableMetricId = billableMetricId
                }

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(billedInAdvance: Boolean?) =
                    billedInAdvance(JsonField.ofNullable(billedInAdvance))

                /**
                 * Alias for [Builder.billedInAdvance].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun billedInAdvance(billedInAdvance: Boolean) =
                    billedInAdvance(billedInAdvance as Boolean?)

                /**
                 * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                    this.billedInAdvance = billedInAdvance
                }

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: NewBillingCycleConfiguration?
                ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                /**
                 * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double?) =
                    conversionRate(JsonField.ofNullable(conversionRate))

                /**
                 * Alias for [Builder.conversionRate].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(conversionRate as Double?)

                /**
                 * Sets [Builder.conversionRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRate] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 */
                fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                    conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                /**
                 * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRateConfig] with a well-typed
                 * [ConversionRateConfig] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun conversionRateConfig(conversionRateConfig: JsonField<ConversionRateConfig>) =
                    apply {
                        this.conversionRateConfig = conversionRateConfig
                    }

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofUnit(unit)`.
                 */
                fun conversionRateConfig(unit: UnitConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * UnitConversionRateConfig.builder()
                 *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                 *     .unitConfig(unitConfig)
                 *     .build()
                 * ```
                 */
                fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                    conversionRateConfig(
                        UnitConversionRateConfig.builder()
                            .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                            .unitConfig(unitConfig)
                            .build()
                    )

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofTiered(tiered)`.
                 */
                fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * TieredConversionRateConfig.builder()
                 *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                 *     .tieredConfig(tieredConfig)
                 *     .build()
                 * ```
                 */
                fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                    conversionRateConfig(
                        TieredConversionRateConfig.builder()
                            .conversionRateType(
                                TieredConversionRateConfig.ConversionRateType.TIERED
                            )
                            .tieredConfig(tieredConfig)
                            .build()
                    )

                /** For dimensional price: specifies a price group and dimension values */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                ) =
                    dimensionalPriceConfiguration(
                        JsonField.ofNullable(dimensionalPriceConfiguration)
                    )

                /**
                 * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dimensionalPriceConfiguration] with a well-typed
                 * [NewDimensionalPriceConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                /** An alias for the price. */
                fun externalPriceId(externalPriceId: String?) =
                    externalPriceId(JsonField.ofNullable(externalPriceId))

                /**
                 * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalPriceId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                    this.externalPriceId = externalPriceId
                }

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                    fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                /**
                 * Alias for [Builder.fixedPriceQuantity].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(fixedPriceQuantity as Double?)

                /**
                 * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fixedPriceQuantity] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                    invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                /**
                 * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceGroupingKey] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                    this.invoiceGroupingKey = invoiceGroupingKey
                }

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: NewBillingCycleConfiguration?
                ) = invoicingCycleConfiguration(JsonField.ofNullable(invoicingCycleConfiguration))

                /**
                 * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoicingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                /** The ID of the license type to associate with this price. */
                fun licenseTypeId(licenseTypeId: String?) =
                    licenseTypeId(JsonField.ofNullable(licenseTypeId))

                /**
                 * Sets [Builder.licenseTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.licenseTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun licenseTypeId(licenseTypeId: JsonField<String>) = apply {
                    this.licenseTypeId = licenseTypeId
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [MeteredAllowance].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .currency()
                 * .itemId()
                 * .meteredAllowanceConfig()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MeteredAllowance =
                    MeteredAllowance(
                        checkRequired("cadence", cadence),
                        checkRequired("currency", currency),
                        checkRequired("itemId", itemId),
                        checkRequired("meteredAllowanceConfig", meteredAllowanceConfig),
                        modelType,
                        checkRequired("name", name),
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        licenseTypeId,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): MeteredAllowance = apply {
                if (validated) {
                    return@apply
                }

                cadence().validate()
                currency()
                itemId()
                meteredAllowanceConfig().validate()
                _modelType().let {
                    if (it != JsonValue.from("metered_allowance")) {
                        throw OrbInvalidDataException("'modelType' is invalid, received $it")
                    }
                }
                name()
                billableMetricId()
                billedInAdvance()
                billingCycleConfiguration()?.validate()
                conversionRate()
                conversionRateConfig()?.validate()
                dimensionalPriceConfiguration()?.validate()
                externalPriceId()
                fixedPriceQuantity()
                invoiceGroupingKey()
                invoicingCycleConfiguration()?.validate()
                licenseTypeId()
                metadata()?.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (cadence.asKnown()?.validity() ?: 0) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (if (itemId.asKnown() == null) 0 else 1) +
                    (meteredAllowanceConfig.asKnown()?.validity() ?: 0) +
                    modelType.let { if (it == JsonValue.from("metered_allowance")) 1 else 0 } +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (billableMetricId.asKnown() == null) 0 else 1) +
                    (if (billedInAdvance.asKnown() == null) 0 else 1) +
                    (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (conversionRate.asKnown() == null) 0 else 1) +
                    (conversionRateConfig.asKnown()?.validity() ?: 0) +
                    (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                    (if (externalPriceId.asKnown() == null) 0 else 1) +
                    (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                    (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                    (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (licenseTypeId.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0)

            /** The cadence to bill for this price on. */
            class Cadence @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ANNUAL = of("annual")

                    val SEMI_ANNUAL = of("semi_annual")

                    val MONTHLY = of("monthly")

                    val QUARTERLY = of("quarterly")

                    val ONE_TIME = of("one_time")

                    val CUSTOM = of("custom")

                    fun of(value: String) = Cadence(JsonField.of(value))
                }

                /** An enum containing [Cadence]'s known values. */
                enum class Known {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                }

                /**
                 * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Cadence] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                    /**
                     * An enum member indicating that [Cadence] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ANNUAL -> Value.ANNUAL
                        SEMI_ANNUAL -> Value.SEMI_ANNUAL
                        MONTHLY -> Value.MONTHLY
                        QUARTERLY -> Value.QUARTERLY
                        ONE_TIME -> Value.ONE_TIME
                        CUSTOM -> Value.CUSTOM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        ANNUAL -> Known.ANNUAL
                        SEMI_ANNUAL -> Known.SEMI_ANNUAL
                        MONTHLY -> Known.MONTHLY
                        QUARTERLY -> Known.QUARTERLY
                        ONE_TIME -> Known.ONE_TIME
                        CUSTOM -> Known.CUSTOM
                        else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Cadence = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cadence && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Configuration for metered_allowance pricing */
            class MeteredAllowanceConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val allowanceGroupingValue: JsonField<String>,
                private val consumptionGroupingValue: JsonField<String>,
                private val groupingKey: JsonField<String>,
                private val unitAmount: JsonField<String>,
                private val allowanceDisplayName: JsonField<String>,
                private val consumptionDisplayName: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("allowance_grouping_value")
                    @ExcludeMissing
                    allowanceGroupingValue: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("consumption_grouping_value")
                    @ExcludeMissing
                    consumptionGroupingValue: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("grouping_key")
                    @ExcludeMissing
                    groupingKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    unitAmount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("allowance_display_name")
                    @ExcludeMissing
                    allowanceDisplayName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("consumption_display_name")
                    @ExcludeMissing
                    consumptionDisplayName: JsonField<String> = JsonMissing.of(),
                ) : this(
                    allowanceGroupingValue,
                    consumptionGroupingValue,
                    groupingKey,
                    unitAmount,
                    allowanceDisplayName,
                    consumptionDisplayName,
                    mutableMapOf(),
                )

                /**
                 * The grouping_key value whose summed quantity represents the allowance for this
                 * period (e.g. 'storage_snapshot' emitting 3 × avg storage). Capped at consumption
                 * — credit can never exceed actual usage.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun allowanceGroupingValue(): String =
                    allowanceGroupingValue.getRequired("allowance_grouping_value")

                /**
                 * The grouping_key value whose summed quantity represents consumption (e.g.
                 * 'download'). Charged at unit_amount.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun consumptionGroupingValue(): String =
                    consumptionGroupingValue.getRequired("consumption_grouping_value")

                /**
                 * Event property used to partition the metric into consumption and allowance
                 * quantities (e.g. 'event_name'). The metric is queried with this key and the two
                 * values below select which partition is which.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun groupingKey(): String = groupingKey.getRequired("grouping_key")

                /**
                 * Per-unit price applied to gross consumption and to the allowance credit.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                /**
                 * Sub-line label for the credit row (e.g. 'Up to 3x free egress').
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun allowanceDisplayName(): String? =
                    allowanceDisplayName.getNullable("allowance_display_name")

                /**
                 * Sub-line label for the gross consumption row (e.g. 'bytes gotten').
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun consumptionDisplayName(): String? =
                    consumptionDisplayName.getNullable("consumption_display_name")

                /**
                 * Returns the raw JSON value of [allowanceGroupingValue].
                 *
                 * Unlike [allowanceGroupingValue], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("allowance_grouping_value")
                @ExcludeMissing
                fun _allowanceGroupingValue(): JsonField<String> = allowanceGroupingValue

                /**
                 * Returns the raw JSON value of [consumptionGroupingValue].
                 *
                 * Unlike [consumptionGroupingValue], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("consumption_grouping_value")
                @ExcludeMissing
                fun _consumptionGroupingValue(): JsonField<String> = consumptionGroupingValue

                /**
                 * Returns the raw JSON value of [groupingKey].
                 *
                 * Unlike [groupingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("grouping_key")
                @ExcludeMissing
                fun _groupingKey(): JsonField<String> = groupingKey

                /**
                 * Returns the raw JSON value of [unitAmount].
                 *
                 * Unlike [unitAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("unit_amount")
                @ExcludeMissing
                fun _unitAmount(): JsonField<String> = unitAmount

                /**
                 * Returns the raw JSON value of [allowanceDisplayName].
                 *
                 * Unlike [allowanceDisplayName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("allowance_display_name")
                @ExcludeMissing
                fun _allowanceDisplayName(): JsonField<String> = allowanceDisplayName

                /**
                 * Returns the raw JSON value of [consumptionDisplayName].
                 *
                 * Unlike [consumptionDisplayName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("consumption_display_name")
                @ExcludeMissing
                fun _consumptionDisplayName(): JsonField<String> = consumptionDisplayName

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
                     * [MeteredAllowanceConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .allowanceGroupingValue()
                     * .consumptionGroupingValue()
                     * .groupingKey()
                     * .unitAmount()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [MeteredAllowanceConfig]. */
                class Builder internal constructor() {

                    private var allowanceGroupingValue: JsonField<String>? = null
                    private var consumptionGroupingValue: JsonField<String>? = null
                    private var groupingKey: JsonField<String>? = null
                    private var unitAmount: JsonField<String>? = null
                    private var allowanceDisplayName: JsonField<String> = JsonMissing.of()
                    private var consumptionDisplayName: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(meteredAllowanceConfig: MeteredAllowanceConfig) = apply {
                        allowanceGroupingValue = meteredAllowanceConfig.allowanceGroupingValue
                        consumptionGroupingValue = meteredAllowanceConfig.consumptionGroupingValue
                        groupingKey = meteredAllowanceConfig.groupingKey
                        unitAmount = meteredAllowanceConfig.unitAmount
                        allowanceDisplayName = meteredAllowanceConfig.allowanceDisplayName
                        consumptionDisplayName = meteredAllowanceConfig.consumptionDisplayName
                        additionalProperties =
                            meteredAllowanceConfig.additionalProperties.toMutableMap()
                    }

                    /**
                     * The grouping_key value whose summed quantity represents the allowance for
                     * this period (e.g. 'storage_snapshot' emitting 3 × avg storage). Capped at
                     * consumption — credit can never exceed actual usage.
                     */
                    fun allowanceGroupingValue(allowanceGroupingValue: String) =
                        allowanceGroupingValue(JsonField.of(allowanceGroupingValue))

                    /**
                     * Sets [Builder.allowanceGroupingValue] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.allowanceGroupingValue] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun allowanceGroupingValue(allowanceGroupingValue: JsonField<String>) = apply {
                        this.allowanceGroupingValue = allowanceGroupingValue
                    }

                    /**
                     * The grouping_key value whose summed quantity represents consumption (e.g.
                     * 'download'). Charged at unit_amount.
                     */
                    fun consumptionGroupingValue(consumptionGroupingValue: String) =
                        consumptionGroupingValue(JsonField.of(consumptionGroupingValue))

                    /**
                     * Sets [Builder.consumptionGroupingValue] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.consumptionGroupingValue] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun consumptionGroupingValue(consumptionGroupingValue: JsonField<String>) =
                        apply {
                            this.consumptionGroupingValue = consumptionGroupingValue
                        }

                    /**
                     * Event property used to partition the metric into consumption and allowance
                     * quantities (e.g. 'event_name'). The metric is queried with this key and the
                     * two values below select which partition is which.
                     */
                    fun groupingKey(groupingKey: String) = groupingKey(JsonField.of(groupingKey))

                    /**
                     * Sets [Builder.groupingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupingKey] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun groupingKey(groupingKey: JsonField<String>) = apply {
                        this.groupingKey = groupingKey
                    }

                    /** Per-unit price applied to gross consumption and to the allowance credit. */
                    fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                    /**
                     * Sets [Builder.unitAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitAmount] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unitAmount(unitAmount: JsonField<String>) = apply {
                        this.unitAmount = unitAmount
                    }

                    /** Sub-line label for the credit row (e.g. 'Up to 3x free egress'). */
                    fun allowanceDisplayName(allowanceDisplayName: String) =
                        allowanceDisplayName(JsonField.of(allowanceDisplayName))

                    /**
                     * Sets [Builder.allowanceDisplayName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.allowanceDisplayName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun allowanceDisplayName(allowanceDisplayName: JsonField<String>) = apply {
                        this.allowanceDisplayName = allowanceDisplayName
                    }

                    /** Sub-line label for the gross consumption row (e.g. 'bytes gotten'). */
                    fun consumptionDisplayName(consumptionDisplayName: String) =
                        consumptionDisplayName(JsonField.of(consumptionDisplayName))

                    /**
                     * Sets [Builder.consumptionDisplayName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.consumptionDisplayName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun consumptionDisplayName(consumptionDisplayName: JsonField<String>) = apply {
                        this.consumptionDisplayName = consumptionDisplayName
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [MeteredAllowanceConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .allowanceGroupingValue()
                     * .consumptionGroupingValue()
                     * .groupingKey()
                     * .unitAmount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): MeteredAllowanceConfig =
                        MeteredAllowanceConfig(
                            checkRequired("allowanceGroupingValue", allowanceGroupingValue),
                            checkRequired("consumptionGroupingValue", consumptionGroupingValue),
                            checkRequired("groupingKey", groupingKey),
                            checkRequired("unitAmount", unitAmount),
                            allowanceDisplayName,
                            consumptionDisplayName,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): MeteredAllowanceConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    allowanceGroupingValue()
                    consumptionGroupingValue()
                    groupingKey()
                    unitAmount()
                    allowanceDisplayName()
                    consumptionDisplayName()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (allowanceGroupingValue.asKnown() == null) 0 else 1) +
                        (if (consumptionGroupingValue.asKnown() == null) 0 else 1) +
                        (if (groupingKey.asKnown() == null) 0 else 1) +
                        (if (unitAmount.asKnown() == null) 0 else 1) +
                        (if (allowanceDisplayName.asKnown() == null) 0 else 1) +
                        (if (consumptionDisplayName.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MeteredAllowanceConfig &&
                        allowanceGroupingValue == other.allowanceGroupingValue &&
                        consumptionGroupingValue == other.consumptionGroupingValue &&
                        groupingKey == other.groupingKey &&
                        unitAmount == other.unitAmount &&
                        allowanceDisplayName == other.allowanceDisplayName &&
                        consumptionDisplayName == other.consumptionDisplayName &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        allowanceGroupingValue,
                        consumptionGroupingValue,
                        groupingKey,
                        unitAmount,
                        allowanceDisplayName,
                        consumptionDisplayName,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MeteredAllowanceConfig{allowanceGroupingValue=$allowanceGroupingValue, consumptionGroupingValue=$consumptionGroupingValue, groupingKey=$groupingKey, unitAmount=$unitAmount, allowanceDisplayName=$allowanceDisplayName, consumptionDisplayName=$consumptionDisplayName, additionalProperties=$additionalProperties}"
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MeteredAllowance &&
                    cadence == other.cadence &&
                    currency == other.currency &&
                    itemId == other.itemId &&
                    meteredAllowanceConfig == other.meteredAllowanceConfig &&
                    modelType == other.modelType &&
                    name == other.name &&
                    billableMetricId == other.billableMetricId &&
                    billedInAdvance == other.billedInAdvance &&
                    billingCycleConfiguration == other.billingCycleConfiguration &&
                    conversionRate == other.conversionRate &&
                    conversionRateConfig == other.conversionRateConfig &&
                    dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                    externalPriceId == other.externalPriceId &&
                    fixedPriceQuantity == other.fixedPriceQuantity &&
                    invoiceGroupingKey == other.invoiceGroupingKey &&
                    invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                    licenseTypeId == other.licenseTypeId &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cadence,
                    currency,
                    itemId,
                    meteredAllowanceConfig,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    licenseTypeId,
                    metadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MeteredAllowance{cadence=$cadence, currency=$currency, itemId=$itemId, meteredAllowanceConfig=$meteredAllowanceConfig, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, licenseTypeId=$licenseTypeId, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        class Percent
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cadence: JsonField<Cadence>,
            private val currency: JsonField<String>,
            private val itemId: JsonField<String>,
            private val modelType: JsonValue,
            private val name: JsonField<String>,
            private val percentConfig: JsonField<PercentConfig>,
            private val billableMetricId: JsonField<String>,
            private val billedInAdvance: JsonField<Boolean>,
            private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val conversionRate: JsonField<Double>,
            private val conversionRateConfig: JsonField<ConversionRateConfig>,
            private val dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>,
            private val externalPriceId: JsonField<String>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val invoiceGroupingKey: JsonField<String>,
            private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val licenseTypeId: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cadence")
                @ExcludeMissing
                cadence: JsonField<Cadence> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("item_id")
                @ExcludeMissing
                itemId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model_type") @ExcludeMissing modelType: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("percent_config")
                @ExcludeMissing
                percentConfig: JsonField<PercentConfig> = JsonMissing.of(),
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                billableMetricId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                conversionRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("external_price_id")
                @ExcludeMissing
                externalPriceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("license_type_id")
                @ExcludeMissing
                licenseTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(
                cadence,
                currency,
                itemId,
                modelType,
                name,
                percentConfig,
                billableMetricId,
                billedInAdvance,
                billingCycleConfiguration,
                conversionRate,
                conversionRateConfig,
                dimensionalPriceConfiguration,
                externalPriceId,
                fixedPriceQuantity,
                invoiceGroupingKey,
                invoicingCycleConfiguration,
                licenseTypeId,
                metadata,
                mutableMapOf(),
            )

            /**
             * The cadence to bill for this price on.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cadence(): Cadence = cadence.getRequired("cadence")

            /**
             * An ISO 4217 currency string for which this price is billed in.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * The id of the item the price will be associated with.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun itemId(): String = itemId.getRequired("item_id")

            /**
             * The pricing model type
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("percent")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

            /**
             * The name of the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Configuration for percent pricing
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun percentConfig(): PercentConfig = percentConfig.getRequired("percent_config")

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                billingCycleConfiguration.getNullable("billing_cycle_configuration")

            /**
             * The per unit conversion rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /**
             * The configuration for the rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRateConfig(): ConversionRateConfig? =
                conversionRateConfig.getNullable("conversion_rate_config")

            /**
             * For dimensional price: specifies a price group and dimension values
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

            /**
             * An alias for the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            /**
             * The property used to group this price on an invoice
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoiceGroupingKey(): String? =
                invoiceGroupingKey.getNullable("invoice_grouping_key")

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

            /**
             * The ID of the license type to associate with this price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun licenseTypeId(): String? = licenseTypeId.getNullable("license_type_id")

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Returns the raw JSON value of [cadence].
             *
             * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [itemId].
             *
             * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [percentConfig].
             *
             * Unlike [percentConfig], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("percent_config")
            @ExcludeMissing
            fun _percentConfig(): JsonField<PercentConfig> = percentConfig

            /**
             * Returns the raw JSON value of [billableMetricId].
             *
             * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billable_metric_id")
            @ExcludeMissing
            fun _billableMetricId(): JsonField<String> = billableMetricId

            /**
             * Returns the raw JSON value of [billedInAdvance].
             *
             * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billed_in_advance")
            @ExcludeMissing
            fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

            /**
             * Returns the raw JSON value of [billingCycleConfiguration].
             *
             * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("billing_cycle_configuration")
            @ExcludeMissing
            fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                billingCycleConfiguration

            /**
             * Returns the raw JSON value of [conversionRate].
             *
             * Unlike [conversionRate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun _conversionRate(): JsonField<Double> = conversionRate

            /**
             * Returns the raw JSON value of [conversionRateConfig].
             *
             * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate_config")
            @ExcludeMissing
            fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

            /**
             * Returns the raw JSON value of [dimensionalPriceConfiguration].
             *
             * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("dimensional_price_configuration")
            @ExcludeMissing
            fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                dimensionalPriceConfiguration

            /**
             * Returns the raw JSON value of [externalPriceId].
             *
             * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun _externalPriceId(): JsonField<String> = externalPriceId

            /**
             * Returns the raw JSON value of [fixedPriceQuantity].
             *
             * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

            /**
             * Returns the raw JSON value of [invoiceGroupingKey].
             *
             * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invoice_grouping_key")
            @ExcludeMissing
            fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

            /**
             * Returns the raw JSON value of [invoicingCycleConfiguration].
             *
             * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("invoicing_cycle_configuration")
            @ExcludeMissing
            fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                invoicingCycleConfiguration

            /**
             * Returns the raw JSON value of [licenseTypeId].
             *
             * Unlike [licenseTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("license_type_id")
            @ExcludeMissing
            fun _licenseTypeId(): JsonField<String> = licenseTypeId

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * Returns a mutable builder for constructing an instance of [Percent].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .currency()
                 * .itemId()
                 * .name()
                 * .percentConfig()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Percent]. */
            class Builder internal constructor() {

                private var cadence: JsonField<Cadence>? = null
                private var currency: JsonField<String>? = null
                private var itemId: JsonField<String>? = null
                private var modelType: JsonValue = JsonValue.from("percent")
                private var name: JsonField<String>? = null
                private var percentConfig: JsonField<PercentConfig>? = null
                private var billableMetricId: JsonField<String> = JsonMissing.of()
                private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of()
                private var dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of()
                private var externalPriceId: JsonField<String> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                private var invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var licenseTypeId: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(percent: Percent) = apply {
                    cadence = percent.cadence
                    currency = percent.currency
                    itemId = percent.itemId
                    modelType = percent.modelType
                    name = percent.name
                    percentConfig = percent.percentConfig
                    billableMetricId = percent.billableMetricId
                    billedInAdvance = percent.billedInAdvance
                    billingCycleConfiguration = percent.billingCycleConfiguration
                    conversionRate = percent.conversionRate
                    conversionRateConfig = percent.conversionRateConfig
                    dimensionalPriceConfiguration = percent.dimensionalPriceConfiguration
                    externalPriceId = percent.externalPriceId
                    fixedPriceQuantity = percent.fixedPriceQuantity
                    invoiceGroupingKey = percent.invoiceGroupingKey
                    invoicingCycleConfiguration = percent.invoicingCycleConfiguration
                    licenseTypeId = percent.licenseTypeId
                    metadata = percent.metadata
                    additionalProperties = percent.additionalProperties.toMutableMap()
                }

                /** The cadence to bill for this price on. */
                fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                /**
                 * Sets [Builder.cadence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The id of the item the price will be associated with. */
                fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                /**
                 * Sets [Builder.itemId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.itemId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("percent")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                /** The name of the price. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Configuration for percent pricing */
                fun percentConfig(percentConfig: PercentConfig) =
                    percentConfig(JsonField.of(percentConfig))

                /**
                 * Sets [Builder.percentConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.percentConfig] with a well-typed [PercentConfig]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun percentConfig(percentConfig: JsonField<PercentConfig>) = apply {
                    this.percentConfig = percentConfig
                }

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(billableMetricId: String?) =
                    billableMetricId(JsonField.ofNullable(billableMetricId))

                /**
                 * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billableMetricId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                    this.billableMetricId = billableMetricId
                }

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(billedInAdvance: Boolean?) =
                    billedInAdvance(JsonField.ofNullable(billedInAdvance))

                /**
                 * Alias for [Builder.billedInAdvance].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun billedInAdvance(billedInAdvance: Boolean) =
                    billedInAdvance(billedInAdvance as Boolean?)

                /**
                 * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                    this.billedInAdvance = billedInAdvance
                }

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: NewBillingCycleConfiguration?
                ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                /**
                 * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double?) =
                    conversionRate(JsonField.ofNullable(conversionRate))

                /**
                 * Alias for [Builder.conversionRate].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(conversionRate as Double?)

                /**
                 * Sets [Builder.conversionRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRate] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 */
                fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                    conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                /**
                 * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRateConfig] with a well-typed
                 * [ConversionRateConfig] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun conversionRateConfig(conversionRateConfig: JsonField<ConversionRateConfig>) =
                    apply {
                        this.conversionRateConfig = conversionRateConfig
                    }

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofUnit(unit)`.
                 */
                fun conversionRateConfig(unit: UnitConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * UnitConversionRateConfig.builder()
                 *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                 *     .unitConfig(unitConfig)
                 *     .build()
                 * ```
                 */
                fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                    conversionRateConfig(
                        UnitConversionRateConfig.builder()
                            .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                            .unitConfig(unitConfig)
                            .build()
                    )

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofTiered(tiered)`.
                 */
                fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * TieredConversionRateConfig.builder()
                 *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                 *     .tieredConfig(tieredConfig)
                 *     .build()
                 * ```
                 */
                fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                    conversionRateConfig(
                        TieredConversionRateConfig.builder()
                            .conversionRateType(
                                TieredConversionRateConfig.ConversionRateType.TIERED
                            )
                            .tieredConfig(tieredConfig)
                            .build()
                    )

                /** For dimensional price: specifies a price group and dimension values */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                ) =
                    dimensionalPriceConfiguration(
                        JsonField.ofNullable(dimensionalPriceConfiguration)
                    )

                /**
                 * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dimensionalPriceConfiguration] with a well-typed
                 * [NewDimensionalPriceConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                /** An alias for the price. */
                fun externalPriceId(externalPriceId: String?) =
                    externalPriceId(JsonField.ofNullable(externalPriceId))

                /**
                 * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalPriceId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                    this.externalPriceId = externalPriceId
                }

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                    fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                /**
                 * Alias for [Builder.fixedPriceQuantity].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(fixedPriceQuantity as Double?)

                /**
                 * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fixedPriceQuantity] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                    invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                /**
                 * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceGroupingKey] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                    this.invoiceGroupingKey = invoiceGroupingKey
                }

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: NewBillingCycleConfiguration?
                ) = invoicingCycleConfiguration(JsonField.ofNullable(invoicingCycleConfiguration))

                /**
                 * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoicingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                /** The ID of the license type to associate with this price. */
                fun licenseTypeId(licenseTypeId: String?) =
                    licenseTypeId(JsonField.ofNullable(licenseTypeId))

                /**
                 * Sets [Builder.licenseTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.licenseTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun licenseTypeId(licenseTypeId: JsonField<String>) = apply {
                    this.licenseTypeId = licenseTypeId
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Percent].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .currency()
                 * .itemId()
                 * .name()
                 * .percentConfig()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Percent =
                    Percent(
                        checkRequired("cadence", cadence),
                        checkRequired("currency", currency),
                        checkRequired("itemId", itemId),
                        modelType,
                        checkRequired("name", name),
                        checkRequired("percentConfig", percentConfig),
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        licenseTypeId,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Percent = apply {
                if (validated) {
                    return@apply
                }

                cadence().validate()
                currency()
                itemId()
                _modelType().let {
                    if (it != JsonValue.from("percent")) {
                        throw OrbInvalidDataException("'modelType' is invalid, received $it")
                    }
                }
                name()
                percentConfig().validate()
                billableMetricId()
                billedInAdvance()
                billingCycleConfiguration()?.validate()
                conversionRate()
                conversionRateConfig()?.validate()
                dimensionalPriceConfiguration()?.validate()
                externalPriceId()
                fixedPriceQuantity()
                invoiceGroupingKey()
                invoicingCycleConfiguration()?.validate()
                licenseTypeId()
                metadata()?.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (cadence.asKnown()?.validity() ?: 0) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (if (itemId.asKnown() == null) 0 else 1) +
                    modelType.let { if (it == JsonValue.from("percent")) 1 else 0 } +
                    (if (name.asKnown() == null) 0 else 1) +
                    (percentConfig.asKnown()?.validity() ?: 0) +
                    (if (billableMetricId.asKnown() == null) 0 else 1) +
                    (if (billedInAdvance.asKnown() == null) 0 else 1) +
                    (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (conversionRate.asKnown() == null) 0 else 1) +
                    (conversionRateConfig.asKnown()?.validity() ?: 0) +
                    (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                    (if (externalPriceId.asKnown() == null) 0 else 1) +
                    (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                    (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                    (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (licenseTypeId.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0)

            /** The cadence to bill for this price on. */
            class Cadence @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ANNUAL = of("annual")

                    val SEMI_ANNUAL = of("semi_annual")

                    val MONTHLY = of("monthly")

                    val QUARTERLY = of("quarterly")

                    val ONE_TIME = of("one_time")

                    val CUSTOM = of("custom")

                    fun of(value: String) = Cadence(JsonField.of(value))
                }

                /** An enum containing [Cadence]'s known values. */
                enum class Known {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                }

                /**
                 * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Cadence] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                    /**
                     * An enum member indicating that [Cadence] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ANNUAL -> Value.ANNUAL
                        SEMI_ANNUAL -> Value.SEMI_ANNUAL
                        MONTHLY -> Value.MONTHLY
                        QUARTERLY -> Value.QUARTERLY
                        ONE_TIME -> Value.ONE_TIME
                        CUSTOM -> Value.CUSTOM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        ANNUAL -> Known.ANNUAL
                        SEMI_ANNUAL -> Known.SEMI_ANNUAL
                        MONTHLY -> Known.MONTHLY
                        QUARTERLY -> Known.QUARTERLY
                        ONE_TIME -> Known.ONE_TIME
                        CUSTOM -> Known.CUSTOM
                        else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Cadence = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cadence && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Configuration for percent pricing */
            class PercentConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val percent: JsonField<Double>,
                private val maximumAmount: JsonField<String>,
                private val minimumAmount: JsonField<String>,
                private val prorated: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("percent")
                    @ExcludeMissing
                    percent: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("maximum_amount")
                    @ExcludeMissing
                    maximumAmount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("minimum_amount")
                    @ExcludeMissing
                    minimumAmount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("prorated")
                    @ExcludeMissing
                    prorated: JsonField<Boolean> = JsonMissing.of(),
                ) : this(percent, maximumAmount, minimumAmount, prorated, mutableMapOf())

                /**
                 * Fraction of the component subtotals to charge (0 < percent <= 1).
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun percent(): Double = percent.getRequired("percent")

                /**
                 * Maximum amount to charge. If unset, the fee has no upper bound.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

                /**
                 * Minimum amount to charge. If unset, the fee is bounded below by 0.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

                /**
                 * If true, the minimum_amount is prorated based on the service period. The
                 * maximum_amount is an absolute cap (never prorated), and the percent applied to
                 * upstream subtotals is never prorated either.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun prorated(): Boolean? = prorated.getNullable("prorated")

                /**
                 * Returns the raw JSON value of [percent].
                 *
                 * Unlike [percent], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("percent") @ExcludeMissing fun _percent(): JsonField<Double> = percent

                /**
                 * Returns the raw JSON value of [maximumAmount].
                 *
                 * Unlike [maximumAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun _maximumAmount(): JsonField<String> = maximumAmount

                /**
                 * Returns the raw JSON value of [minimumAmount].
                 *
                 * Unlike [minimumAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun _minimumAmount(): JsonField<String> = minimumAmount

                /**
                 * Returns the raw JSON value of [prorated].
                 *
                 * Unlike [prorated], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prorated")
                @ExcludeMissing
                fun _prorated(): JsonField<Boolean> = prorated

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
                     * Returns a mutable builder for constructing an instance of [PercentConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .percent()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [PercentConfig]. */
                class Builder internal constructor() {

                    private var percent: JsonField<Double>? = null
                    private var maximumAmount: JsonField<String> = JsonMissing.of()
                    private var minimumAmount: JsonField<String> = JsonMissing.of()
                    private var prorated: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(percentConfig: PercentConfig) = apply {
                        percent = percentConfig.percent
                        maximumAmount = percentConfig.maximumAmount
                        minimumAmount = percentConfig.minimumAmount
                        prorated = percentConfig.prorated
                        additionalProperties = percentConfig.additionalProperties.toMutableMap()
                    }

                    /** Fraction of the component subtotals to charge (0 < percent <= 1). */
                    fun percent(percent: Double) = percent(JsonField.of(percent))

                    /**
                     * Sets [Builder.percent] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percent] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun percent(percent: JsonField<Double>) = apply { this.percent = percent }

                    /** Maximum amount to charge. If unset, the fee has no upper bound. */
                    fun maximumAmount(maximumAmount: String?) =
                        maximumAmount(JsonField.ofNullable(maximumAmount))

                    /**
                     * Sets [Builder.maximumAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maximumAmount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                        this.maximumAmount = maximumAmount
                    }

                    /** Minimum amount to charge. If unset, the fee is bounded below by 0. */
                    fun minimumAmount(minimumAmount: String?) =
                        minimumAmount(JsonField.ofNullable(minimumAmount))

                    /**
                     * Sets [Builder.minimumAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.minimumAmount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                        this.minimumAmount = minimumAmount
                    }

                    /**
                     * If true, the minimum_amount is prorated based on the service period. The
                     * maximum_amount is an absolute cap (never prorated), and the percent applied
                     * to upstream subtotals is never prorated either.
                     */
                    fun prorated(prorated: Boolean) = prorated(JsonField.of(prorated))

                    /**
                     * Sets [Builder.prorated] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prorated] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prorated(prorated: JsonField<Boolean>) = apply { this.prorated = prorated }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [PercentConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .percent()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PercentConfig =
                        PercentConfig(
                            checkRequired("percent", percent),
                            maximumAmount,
                            minimumAmount,
                            prorated,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): PercentConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    percent()
                    maximumAmount()
                    minimumAmount()
                    prorated()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (percent.asKnown() == null) 0 else 1) +
                        (if (maximumAmount.asKnown() == null) 0 else 1) +
                        (if (minimumAmount.asKnown() == null) 0 else 1) +
                        (if (prorated.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PercentConfig &&
                        percent == other.percent &&
                        maximumAmount == other.maximumAmount &&
                        minimumAmount == other.minimumAmount &&
                        prorated == other.prorated &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        percent,
                        maximumAmount,
                        minimumAmount,
                        prorated,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PercentConfig{percent=$percent, maximumAmount=$maximumAmount, minimumAmount=$minimumAmount, prorated=$prorated, additionalProperties=$additionalProperties}"
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Percent &&
                    cadence == other.cadence &&
                    currency == other.currency &&
                    itemId == other.itemId &&
                    modelType == other.modelType &&
                    name == other.name &&
                    percentConfig == other.percentConfig &&
                    billableMetricId == other.billableMetricId &&
                    billedInAdvance == other.billedInAdvance &&
                    billingCycleConfiguration == other.billingCycleConfiguration &&
                    conversionRate == other.conversionRate &&
                    conversionRateConfig == other.conversionRateConfig &&
                    dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                    externalPriceId == other.externalPriceId &&
                    fixedPriceQuantity == other.fixedPriceQuantity &&
                    invoiceGroupingKey == other.invoiceGroupingKey &&
                    invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                    licenseTypeId == other.licenseTypeId &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cadence,
                    currency,
                    itemId,
                    modelType,
                    name,
                    percentConfig,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    licenseTypeId,
                    metadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Percent{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, percentConfig=$percentConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, licenseTypeId=$licenseTypeId, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        class EventOutput
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cadence: JsonField<Cadence>,
            private val currency: JsonField<String>,
            private val eventOutputConfig: JsonField<EventOutputConfig>,
            private val itemId: JsonField<String>,
            private val modelType: JsonValue,
            private val name: JsonField<String>,
            private val billableMetricId: JsonField<String>,
            private val billedInAdvance: JsonField<Boolean>,
            private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val conversionRate: JsonField<Double>,
            private val conversionRateConfig: JsonField<ConversionRateConfig>,
            private val dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>,
            private val externalPriceId: JsonField<String>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val invoiceGroupingKey: JsonField<String>,
            private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
            private val licenseTypeId: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cadence")
                @ExcludeMissing
                cadence: JsonField<Cadence> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("event_output_config")
                @ExcludeMissing
                eventOutputConfig: JsonField<EventOutputConfig> = JsonMissing.of(),
                @JsonProperty("item_id")
                @ExcludeMissing
                itemId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model_type") @ExcludeMissing modelType: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                billableMetricId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                conversionRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("external_price_id")
                @ExcludeMissing
                externalPriceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of(),
                @JsonProperty("license_type_id")
                @ExcludeMissing
                licenseTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
            ) : this(
                cadence,
                currency,
                eventOutputConfig,
                itemId,
                modelType,
                name,
                billableMetricId,
                billedInAdvance,
                billingCycleConfiguration,
                conversionRate,
                conversionRateConfig,
                dimensionalPriceConfiguration,
                externalPriceId,
                fixedPriceQuantity,
                invoiceGroupingKey,
                invoicingCycleConfiguration,
                licenseTypeId,
                metadata,
                mutableMapOf(),
            )

            /**
             * The cadence to bill for this price on.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cadence(): Cadence = cadence.getRequired("cadence")

            /**
             * An ISO 4217 currency string for which this price is billed in.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Configuration for event_output pricing
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun eventOutputConfig(): EventOutputConfig =
                eventOutputConfig.getRequired("event_output_config")

            /**
             * The id of the item the price will be associated with.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun itemId(): String = itemId.getRequired("item_id")

            /**
             * The pricing model type
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("event_output")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

            /**
             * The name of the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                billingCycleConfiguration.getNullable("billing_cycle_configuration")

            /**
             * The per unit conversion rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /**
             * The configuration for the rate of the price currency to the invoicing currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun conversionRateConfig(): ConversionRateConfig? =
                conversionRateConfig.getNullable("conversion_rate_config")

            /**
             * For dimensional price: specifies a price group and dimension values
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

            /**
             * An alias for the price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            /**
             * The property used to group this price on an invoice
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoiceGroupingKey(): String? =
                invoiceGroupingKey.getNullable("invoice_grouping_key")

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

            /**
             * The ID of the license type to associate with this price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun licenseTypeId(): String? = licenseTypeId.getNullable("license_type_id")

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Returns the raw JSON value of [cadence].
             *
             * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [eventOutputConfig].
             *
             * Unlike [eventOutputConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("event_output_config")
            @ExcludeMissing
            fun _eventOutputConfig(): JsonField<EventOutputConfig> = eventOutputConfig

            /**
             * Returns the raw JSON value of [itemId].
             *
             * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [billableMetricId].
             *
             * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billable_metric_id")
            @ExcludeMissing
            fun _billableMetricId(): JsonField<String> = billableMetricId

            /**
             * Returns the raw JSON value of [billedInAdvance].
             *
             * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billed_in_advance")
            @ExcludeMissing
            fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

            /**
             * Returns the raw JSON value of [billingCycleConfiguration].
             *
             * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("billing_cycle_configuration")
            @ExcludeMissing
            fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                billingCycleConfiguration

            /**
             * Returns the raw JSON value of [conversionRate].
             *
             * Unlike [conversionRate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun _conversionRate(): JsonField<Double> = conversionRate

            /**
             * Returns the raw JSON value of [conversionRateConfig].
             *
             * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate_config")
            @ExcludeMissing
            fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

            /**
             * Returns the raw JSON value of [dimensionalPriceConfiguration].
             *
             * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("dimensional_price_configuration")
            @ExcludeMissing
            fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                dimensionalPriceConfiguration

            /**
             * Returns the raw JSON value of [externalPriceId].
             *
             * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("external_price_id")
            @ExcludeMissing
            fun _externalPriceId(): JsonField<String> = externalPriceId

            /**
             * Returns the raw JSON value of [fixedPriceQuantity].
             *
             * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

            /**
             * Returns the raw JSON value of [invoiceGroupingKey].
             *
             * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invoice_grouping_key")
            @ExcludeMissing
            fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

            /**
             * Returns the raw JSON value of [invoicingCycleConfiguration].
             *
             * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("invoicing_cycle_configuration")
            @ExcludeMissing
            fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                invoicingCycleConfiguration

            /**
             * Returns the raw JSON value of [licenseTypeId].
             *
             * Unlike [licenseTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("license_type_id")
            @ExcludeMissing
            fun _licenseTypeId(): JsonField<String> = licenseTypeId

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

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
                 * Returns a mutable builder for constructing an instance of [EventOutput].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .currency()
                 * .eventOutputConfig()
                 * .itemId()
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [EventOutput]. */
            class Builder internal constructor() {

                private var cadence: JsonField<Cadence>? = null
                private var currency: JsonField<String>? = null
                private var eventOutputConfig: JsonField<EventOutputConfig>? = null
                private var itemId: JsonField<String>? = null
                private var modelType: JsonValue = JsonValue.from("event_output")
                private var name: JsonField<String>? = null
                private var billableMetricId: JsonField<String> = JsonMissing.of()
                private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of()
                private var dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration> =
                    JsonMissing.of()
                private var externalPriceId: JsonField<String> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                private var invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                    JsonMissing.of()
                private var licenseTypeId: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(eventOutput: EventOutput) = apply {
                    cadence = eventOutput.cadence
                    currency = eventOutput.currency
                    eventOutputConfig = eventOutput.eventOutputConfig
                    itemId = eventOutput.itemId
                    modelType = eventOutput.modelType
                    name = eventOutput.name
                    billableMetricId = eventOutput.billableMetricId
                    billedInAdvance = eventOutput.billedInAdvance
                    billingCycleConfiguration = eventOutput.billingCycleConfiguration
                    conversionRate = eventOutput.conversionRate
                    conversionRateConfig = eventOutput.conversionRateConfig
                    dimensionalPriceConfiguration = eventOutput.dimensionalPriceConfiguration
                    externalPriceId = eventOutput.externalPriceId
                    fixedPriceQuantity = eventOutput.fixedPriceQuantity
                    invoiceGroupingKey = eventOutput.invoiceGroupingKey
                    invoicingCycleConfiguration = eventOutput.invoicingCycleConfiguration
                    licenseTypeId = eventOutput.licenseTypeId
                    metadata = eventOutput.metadata
                    additionalProperties = eventOutput.additionalProperties.toMutableMap()
                }

                /** The cadence to bill for this price on. */
                fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                /**
                 * Sets [Builder.cadence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                /** An ISO 4217 currency string for which this price is billed in. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** Configuration for event_output pricing */
                fun eventOutputConfig(eventOutputConfig: EventOutputConfig) =
                    eventOutputConfig(JsonField.of(eventOutputConfig))

                /**
                 * Sets [Builder.eventOutputConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventOutputConfig] with a well-typed
                 * [EventOutputConfig] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun eventOutputConfig(eventOutputConfig: JsonField<EventOutputConfig>) = apply {
                    this.eventOutputConfig = eventOutputConfig
                }

                /** The id of the item the price will be associated with. */
                fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                /**
                 * Sets [Builder.itemId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.itemId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("event_output")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                /** The name of the price. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 */
                fun billableMetricId(billableMetricId: String?) =
                    billableMetricId(JsonField.ofNullable(billableMetricId))

                /**
                 * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billableMetricId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                    this.billableMetricId = billableMetricId
                }

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 */
                fun billedInAdvance(billedInAdvance: Boolean?) =
                    billedInAdvance(JsonField.ofNullable(billedInAdvance))

                /**
                 * Alias for [Builder.billedInAdvance].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun billedInAdvance(billedInAdvance: Boolean) =
                    billedInAdvance(billedInAdvance as Boolean?)

                /**
                 * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                    this.billedInAdvance = billedInAdvance
                }

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: NewBillingCycleConfiguration?
                ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                /**
                 * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun billingCycleConfiguration(
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double?) =
                    conversionRate(JsonField.ofNullable(conversionRate))

                /**
                 * Alias for [Builder.conversionRate].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(conversionRate as Double?)

                /**
                 * Sets [Builder.conversionRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRate] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 */
                fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                    conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                /**
                 * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRateConfig] with a well-typed
                 * [ConversionRateConfig] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun conversionRateConfig(conversionRateConfig: JsonField<ConversionRateConfig>) =
                    apply {
                        this.conversionRateConfig = conversionRateConfig
                    }

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofUnit(unit)`.
                 */
                fun conversionRateConfig(unit: UnitConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * UnitConversionRateConfig.builder()
                 *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                 *     .unitConfig(unitConfig)
                 *     .build()
                 * ```
                 */
                fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                    conversionRateConfig(
                        UnitConversionRateConfig.builder()
                            .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                            .unitConfig(unitConfig)
                            .build()
                    )

                /**
                 * Alias for calling [conversionRateConfig] with
                 * `ConversionRateConfig.ofTiered(tiered)`.
                 */
                fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                    conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                /**
                 * Alias for calling [conversionRateConfig] with the following:
                 * ```kotlin
                 * TieredConversionRateConfig.builder()
                 *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                 *     .tieredConfig(tieredConfig)
                 *     .build()
                 * ```
                 */
                fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                    conversionRateConfig(
                        TieredConversionRateConfig.builder()
                            .conversionRateType(
                                TieredConversionRateConfig.ConversionRateType.TIERED
                            )
                            .tieredConfig(tieredConfig)
                            .build()
                    )

                /** For dimensional price: specifies a price group and dimension values */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                ) =
                    dimensionalPriceConfiguration(
                        JsonField.ofNullable(dimensionalPriceConfiguration)
                    )

                /**
                 * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dimensionalPriceConfiguration] with a well-typed
                 * [NewDimensionalPriceConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun dimensionalPriceConfiguration(
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                /** An alias for the price. */
                fun externalPriceId(externalPriceId: String?) =
                    externalPriceId(JsonField.ofNullable(externalPriceId))

                /**
                 * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalPriceId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                    this.externalPriceId = externalPriceId
                }

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                    fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                /**
                 * Alias for [Builder.fixedPriceQuantity].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(fixedPriceQuantity as Double?)

                /**
                 * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fixedPriceQuantity] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                /** The property used to group this price on an invoice */
                fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                    invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                /**
                 * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceGroupingKey] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                    this.invoiceGroupingKey = invoiceGroupingKey
                }

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: NewBillingCycleConfiguration?
                ) = invoicingCycleConfiguration(JsonField.ofNullable(invoicingCycleConfiguration))

                /**
                 * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoicingCycleConfiguration] with a well-typed
                 * [NewBillingCycleConfiguration] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun invoicingCycleConfiguration(
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                /** The ID of the license type to associate with this price. */
                fun licenseTypeId(licenseTypeId: String?) =
                    licenseTypeId(JsonField.ofNullable(licenseTypeId))

                /**
                 * Sets [Builder.licenseTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.licenseTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun licenseTypeId(licenseTypeId: JsonField<String>) = apply {
                    this.licenseTypeId = licenseTypeId
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 */
                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [EventOutput].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .currency()
                 * .eventOutputConfig()
                 * .itemId()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): EventOutput =
                    EventOutput(
                        checkRequired("cadence", cadence),
                        checkRequired("currency", currency),
                        checkRequired("eventOutputConfig", eventOutputConfig),
                        checkRequired("itemId", itemId),
                        modelType,
                        checkRequired("name", name),
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        licenseTypeId,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): EventOutput = apply {
                if (validated) {
                    return@apply
                }

                cadence().validate()
                currency()
                eventOutputConfig().validate()
                itemId()
                _modelType().let {
                    if (it != JsonValue.from("event_output")) {
                        throw OrbInvalidDataException("'modelType' is invalid, received $it")
                    }
                }
                name()
                billableMetricId()
                billedInAdvance()
                billingCycleConfiguration()?.validate()
                conversionRate()
                conversionRateConfig()?.validate()
                dimensionalPriceConfiguration()?.validate()
                externalPriceId()
                fixedPriceQuantity()
                invoiceGroupingKey()
                invoicingCycleConfiguration()?.validate()
                licenseTypeId()
                metadata()?.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (cadence.asKnown()?.validity() ?: 0) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (eventOutputConfig.asKnown()?.validity() ?: 0) +
                    (if (itemId.asKnown() == null) 0 else 1) +
                    modelType.let { if (it == JsonValue.from("event_output")) 1 else 0 } +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (billableMetricId.asKnown() == null) 0 else 1) +
                    (if (billedInAdvance.asKnown() == null) 0 else 1) +
                    (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (conversionRate.asKnown() == null) 0 else 1) +
                    (conversionRateConfig.asKnown()?.validity() ?: 0) +
                    (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                    (if (externalPriceId.asKnown() == null) 0 else 1) +
                    (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                    (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                    (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                    (if (licenseTypeId.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0)

            /** The cadence to bill for this price on. */
            class Cadence @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ANNUAL = of("annual")

                    val SEMI_ANNUAL = of("semi_annual")

                    val MONTHLY = of("monthly")

                    val QUARTERLY = of("quarterly")

                    val ONE_TIME = of("one_time")

                    val CUSTOM = of("custom")

                    fun of(value: String) = Cadence(JsonField.of(value))
                }

                /** An enum containing [Cadence]'s known values. */
                enum class Known {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                }

                /**
                 * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Cadence] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ANNUAL,
                    SEMI_ANNUAL,
                    MONTHLY,
                    QUARTERLY,
                    ONE_TIME,
                    CUSTOM,
                    /**
                     * An enum member indicating that [Cadence] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ANNUAL -> Value.ANNUAL
                        SEMI_ANNUAL -> Value.SEMI_ANNUAL
                        MONTHLY -> Value.MONTHLY
                        QUARTERLY -> Value.QUARTERLY
                        ONE_TIME -> Value.ONE_TIME
                        CUSTOM -> Value.CUSTOM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        ANNUAL -> Known.ANNUAL
                        SEMI_ANNUAL -> Known.SEMI_ANNUAL
                        MONTHLY -> Known.MONTHLY
                        QUARTERLY -> Known.QUARTERLY
                        ONE_TIME -> Known.ONE_TIME
                        CUSTOM -> Known.CUSTOM
                        else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Cadence = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cadence && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Configuration for event_output pricing */
            class EventOutputConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val unitRatingKey: JsonField<String>,
                private val defaultUnitRate: JsonField<String>,
                private val groupingKey: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("unit_rating_key")
                    @ExcludeMissing
                    unitRatingKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("default_unit_rate")
                    @ExcludeMissing
                    defaultUnitRate: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("grouping_key")
                    @ExcludeMissing
                    groupingKey: JsonField<String> = JsonMissing.of(),
                ) : this(unitRatingKey, defaultUnitRate, groupingKey, mutableMapOf())

                /**
                 * The key in the event data to extract the unit rate from.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun unitRatingKey(): String = unitRatingKey.getRequired("unit_rating_key")

                /**
                 * If provided, this amount will be used as the unit rate when an event does not
                 * have a value for the `unit_rating_key`. If not provided, events missing a unit
                 * rate will be ignored.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun defaultUnitRate(): String? = defaultUnitRate.getNullable("default_unit_rate")

                /**
                 * An optional key in the event data to group by (e.g., event ID). All events will
                 * also be grouped by their unit rate.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun groupingKey(): String? = groupingKey.getNullable("grouping_key")

                /**
                 * Returns the raw JSON value of [unitRatingKey].
                 *
                 * Unlike [unitRatingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("unit_rating_key")
                @ExcludeMissing
                fun _unitRatingKey(): JsonField<String> = unitRatingKey

                /**
                 * Returns the raw JSON value of [defaultUnitRate].
                 *
                 * Unlike [defaultUnitRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("default_unit_rate")
                @ExcludeMissing
                fun _defaultUnitRate(): JsonField<String> = defaultUnitRate

                /**
                 * Returns the raw JSON value of [groupingKey].
                 *
                 * Unlike [groupingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("grouping_key")
                @ExcludeMissing
                fun _groupingKey(): JsonField<String> = groupingKey

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
                     * [EventOutputConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .unitRatingKey()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [EventOutputConfig]. */
                class Builder internal constructor() {

                    private var unitRatingKey: JsonField<String>? = null
                    private var defaultUnitRate: JsonField<String> = JsonMissing.of()
                    private var groupingKey: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(eventOutputConfig: EventOutputConfig) = apply {
                        unitRatingKey = eventOutputConfig.unitRatingKey
                        defaultUnitRate = eventOutputConfig.defaultUnitRate
                        groupingKey = eventOutputConfig.groupingKey
                        additionalProperties = eventOutputConfig.additionalProperties.toMutableMap()
                    }

                    /** The key in the event data to extract the unit rate from. */
                    fun unitRatingKey(unitRatingKey: String) =
                        unitRatingKey(JsonField.of(unitRatingKey))

                    /**
                     * Sets [Builder.unitRatingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitRatingKey] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun unitRatingKey(unitRatingKey: JsonField<String>) = apply {
                        this.unitRatingKey = unitRatingKey
                    }

                    /**
                     * If provided, this amount will be used as the unit rate when an event does not
                     * have a value for the `unit_rating_key`. If not provided, events missing a
                     * unit rate will be ignored.
                     */
                    fun defaultUnitRate(defaultUnitRate: String?) =
                        defaultUnitRate(JsonField.ofNullable(defaultUnitRate))

                    /**
                     * Sets [Builder.defaultUnitRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.defaultUnitRate] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun defaultUnitRate(defaultUnitRate: JsonField<String>) = apply {
                        this.defaultUnitRate = defaultUnitRate
                    }

                    /**
                     * An optional key in the event data to group by (e.g., event ID). All events
                     * will also be grouped by their unit rate.
                     */
                    fun groupingKey(groupingKey: String?) =
                        groupingKey(JsonField.ofNullable(groupingKey))

                    /**
                     * Sets [Builder.groupingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupingKey] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun groupingKey(groupingKey: JsonField<String>) = apply {
                        this.groupingKey = groupingKey
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [EventOutputConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .unitRatingKey()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): EventOutputConfig =
                        EventOutputConfig(
                            checkRequired("unitRatingKey", unitRatingKey),
                            defaultUnitRate,
                            groupingKey,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): EventOutputConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    unitRatingKey()
                    defaultUnitRate()
                    groupingKey()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (unitRatingKey.asKnown() == null) 0 else 1) +
                        (if (defaultUnitRate.asKnown() == null) 0 else 1) +
                        (if (groupingKey.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is EventOutputConfig &&
                        unitRatingKey == other.unitRatingKey &&
                        defaultUnitRate == other.defaultUnitRate &&
                        groupingKey == other.groupingKey &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(unitRatingKey, defaultUnitRate, groupingKey, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "EventOutputConfig{unitRatingKey=$unitRatingKey, defaultUnitRate=$defaultUnitRate, groupingKey=$groupingKey, additionalProperties=$additionalProperties}"
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EventOutput &&
                    cadence == other.cadence &&
                    currency == other.currency &&
                    eventOutputConfig == other.eventOutputConfig &&
                    itemId == other.itemId &&
                    modelType == other.modelType &&
                    name == other.name &&
                    billableMetricId == other.billableMetricId &&
                    billedInAdvance == other.billedInAdvance &&
                    billingCycleConfiguration == other.billingCycleConfiguration &&
                    conversionRate == other.conversionRate &&
                    conversionRateConfig == other.conversionRateConfig &&
                    dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                    externalPriceId == other.externalPriceId &&
                    fixedPriceQuantity == other.fixedPriceQuantity &&
                    invoiceGroupingKey == other.invoiceGroupingKey &&
                    invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                    licenseTypeId == other.licenseTypeId &&
                    metadata == other.metadata &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cadence,
                    currency,
                    eventOutputConfig,
                    itemId,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    licenseTypeId,
                    metadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EventOutput{cadence=$cadence, currency=$currency, eventOutputConfig=$eventOutputConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, licenseTypeId=$licenseTypeId, metadata=$metadata, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PriceCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PriceCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
