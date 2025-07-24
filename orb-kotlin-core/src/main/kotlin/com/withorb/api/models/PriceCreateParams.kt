// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.JsonValue
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
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

        fun body(body: Body) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofUnit(unit)`. */
        fun body(unit: NewFloatingUnitPrice) = body(Body.ofUnit(unit))

        /** Alias for calling [body] with `Body.ofPackage(package_)`. */
        fun body(package_: NewFloatingPackagePrice) = body(Body.ofPackage(package_))

        /** Alias for calling [body] with `Body.ofMatrix(matrix)`. */
        fun body(matrix: NewFloatingMatrixPrice) = body(Body.ofMatrix(matrix))

        /** Alias for calling [body] with `Body.ofMatrixWithAllocation(matrixWithAllocation)`. */
        fun body(matrixWithAllocation: NewFloatingMatrixWithAllocationPrice) =
            body(Body.ofMatrixWithAllocation(matrixWithAllocation))

        /** Alias for calling [body] with `Body.ofTiered(tiered)`. */
        fun body(tiered: NewFloatingTieredPrice) = body(Body.ofTiered(tiered))

        /** Alias for calling [body] with `Body.ofTieredBps(tieredBps)`. */
        fun body(tieredBps: NewFloatingTieredBpsPrice) = body(Body.ofTieredBps(tieredBps))

        /** Alias for calling [body] with `Body.ofBps(bps)`. */
        fun body(bps: NewFloatingBpsPrice) = body(Body.ofBps(bps))

        /** Alias for calling [body] with `Body.ofBulkBps(bulkBps)`. */
        fun body(bulkBps: NewFloatingBulkBpsPrice) = body(Body.ofBulkBps(bulkBps))

        /** Alias for calling [body] with `Body.ofBulk(bulk)`. */
        fun body(bulk: NewFloatingBulkPrice) = body(Body.ofBulk(bulk))

        /** Alias for calling [body] with `Body.ofThresholdTotalAmount(thresholdTotalAmount)`. */
        fun body(thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice) =
            body(Body.ofThresholdTotalAmount(thresholdTotalAmount))

        /** Alias for calling [body] with `Body.ofTieredPackage(tieredPackage)`. */
        fun body(tieredPackage: NewFloatingTieredPackagePrice) =
            body(Body.ofTieredPackage(tieredPackage))

        /** Alias for calling [body] with `Body.ofGroupedTiered(groupedTiered)`. */
        fun body(groupedTiered: NewFloatingGroupedTieredPrice) =
            body(Body.ofGroupedTiered(groupedTiered))

        /** Alias for calling [body] with `Body.ofMaxGroupTieredPackage(maxGroupTieredPackage)`. */
        fun body(maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice) =
            body(Body.ofMaxGroupTieredPackage(maxGroupTieredPackage))

        /** Alias for calling [body] with `Body.ofTieredWithMinimum(tieredWithMinimum)`. */
        fun body(tieredWithMinimum: NewFloatingTieredWithMinimumPrice) =
            body(Body.ofTieredWithMinimum(tieredWithMinimum))

        /** Alias for calling [body] with `Body.ofPackageWithAllocation(packageWithAllocation)`. */
        fun body(packageWithAllocation: NewFloatingPackageWithAllocationPrice) =
            body(Body.ofPackageWithAllocation(packageWithAllocation))

        /**
         * Alias for calling [body] with
         * `Body.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
         */
        fun body(tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice) =
            body(Body.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

        /** Alias for calling [body] with `Body.ofUnitWithPercent(unitWithPercent)`. */
        fun body(unitWithPercent: NewFloatingUnitWithPercentPrice) =
            body(Body.ofUnitWithPercent(unitWithPercent))

        /** Alias for calling [body] with `Body.ofTieredWithProration(tieredWithProration)`. */
        fun body(tieredWithProration: NewFloatingTieredWithProrationPrice) =
            body(Body.ofTieredWithProration(tieredWithProration))

        /** Alias for calling [body] with `Body.ofUnitWithProration(unitWithProration)`. */
        fun body(unitWithProration: NewFloatingUnitWithProrationPrice) =
            body(Body.ofUnitWithProration(unitWithProration))

        /** Alias for calling [body] with `Body.ofGroupedAllocation(groupedAllocation)`. */
        fun body(groupedAllocation: NewFloatingGroupedAllocationPrice) =
            body(Body.ofGroupedAllocation(groupedAllocation))

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

        /** Alias for calling [body] with `Body.ofMatrixWithDisplayName(matrixWithDisplayName)`. */
        fun body(matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice) =
            body(Body.ofMatrixWithDisplayName(matrixWithDisplayName))

        /** Alias for calling [body] with `Body.ofBulkWithProration(bulkWithProration)`. */
        fun body(bulkWithProration: NewFloatingBulkWithProrationPrice) =
            body(Body.ofBulkWithProration(bulkWithProration))

        /** Alias for calling [body] with `Body.ofGroupedTieredPackage(groupedTieredPackage)`. */
        fun body(groupedTieredPackage: NewFloatingGroupedTieredPackagePrice) =
            body(Body.ofGroupedTieredPackage(groupedTieredPackage))

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

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val unit: NewFloatingUnitPrice? = null,
        private val package_: NewFloatingPackagePrice? = null,
        private val matrix: NewFloatingMatrixPrice? = null,
        private val matrixWithAllocation: NewFloatingMatrixWithAllocationPrice? = null,
        private val tiered: NewFloatingTieredPrice? = null,
        private val tieredBps: NewFloatingTieredBpsPrice? = null,
        private val bps: NewFloatingBpsPrice? = null,
        private val bulkBps: NewFloatingBulkBpsPrice? = null,
        private val bulk: NewFloatingBulkPrice? = null,
        private val thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice? = null,
        private val tieredPackage: NewFloatingTieredPackagePrice? = null,
        private val groupedTiered: NewFloatingGroupedTieredPrice? = null,
        private val maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice? = null,
        private val tieredWithMinimum: NewFloatingTieredWithMinimumPrice? = null,
        private val packageWithAllocation: NewFloatingPackageWithAllocationPrice? = null,
        private val tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice? = null,
        private val unitWithPercent: NewFloatingUnitWithPercentPrice? = null,
        private val tieredWithProration: NewFloatingTieredWithProrationPrice? = null,
        private val unitWithProration: NewFloatingUnitWithProrationPrice? = null,
        private val groupedAllocation: NewFloatingGroupedAllocationPrice? = null,
        private val groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice? = null,
        private val groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice? = null,
        private val matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice? = null,
        private val bulkWithProration: NewFloatingBulkWithProrationPrice? = null,
        private val groupedTieredPackage: NewFloatingGroupedTieredPackagePrice? = null,
        private val scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice? =
            null,
        private val scalableMatrixWithTieredPricing:
            NewFloatingScalableMatrixWithTieredPricingPrice? =
            null,
        private val cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unit(): NewFloatingUnitPrice? = unit

        fun package_(): NewFloatingPackagePrice? = package_

        fun matrix(): NewFloatingMatrixPrice? = matrix

        fun matrixWithAllocation(): NewFloatingMatrixWithAllocationPrice? = matrixWithAllocation

        fun tiered(): NewFloatingTieredPrice? = tiered

        fun tieredBps(): NewFloatingTieredBpsPrice? = tieredBps

        fun bps(): NewFloatingBpsPrice? = bps

        fun bulkBps(): NewFloatingBulkBpsPrice? = bulkBps

        fun bulk(): NewFloatingBulkPrice? = bulk

        fun thresholdTotalAmount(): NewFloatingThresholdTotalAmountPrice? = thresholdTotalAmount

        fun tieredPackage(): NewFloatingTieredPackagePrice? = tieredPackage

        fun groupedTiered(): NewFloatingGroupedTieredPrice? = groupedTiered

        fun maxGroupTieredPackage(): NewFloatingMaxGroupTieredPackagePrice? = maxGroupTieredPackage

        fun tieredWithMinimum(): NewFloatingTieredWithMinimumPrice? = tieredWithMinimum

        fun packageWithAllocation(): NewFloatingPackageWithAllocationPrice? = packageWithAllocation

        fun tieredPackageWithMinimum(): NewFloatingTieredPackageWithMinimumPrice? =
            tieredPackageWithMinimum

        fun unitWithPercent(): NewFloatingUnitWithPercentPrice? = unitWithPercent

        fun tieredWithProration(): NewFloatingTieredWithProrationPrice? = tieredWithProration

        fun unitWithProration(): NewFloatingUnitWithProrationPrice? = unitWithProration

        fun groupedAllocation(): NewFloatingGroupedAllocationPrice? = groupedAllocation

        fun groupedWithProratedMinimum(): NewFloatingGroupedWithProratedMinimumPrice? =
            groupedWithProratedMinimum

        fun groupedWithMeteredMinimum(): NewFloatingGroupedWithMeteredMinimumPrice? =
            groupedWithMeteredMinimum

        fun matrixWithDisplayName(): NewFloatingMatrixWithDisplayNamePrice? = matrixWithDisplayName

        fun bulkWithProration(): NewFloatingBulkWithProrationPrice? = bulkWithProration

        fun groupedTieredPackage(): NewFloatingGroupedTieredPackagePrice? = groupedTieredPackage

        fun scalableMatrixWithUnitPricing(): NewFloatingScalableMatrixWithUnitPricingPrice? =
            scalableMatrixWithUnitPricing

        fun scalableMatrixWithTieredPricing(): NewFloatingScalableMatrixWithTieredPricingPrice? =
            scalableMatrixWithTieredPricing

        fun cumulativeGroupedBulk(): NewFloatingCumulativeGroupedBulkPrice? = cumulativeGroupedBulk

        fun isUnit(): Boolean = unit != null

        fun isPackage(): Boolean = package_ != null

        fun isMatrix(): Boolean = matrix != null

        fun isMatrixWithAllocation(): Boolean = matrixWithAllocation != null

        fun isTiered(): Boolean = tiered != null

        fun isTieredBps(): Boolean = tieredBps != null

        fun isBps(): Boolean = bps != null

        fun isBulkBps(): Boolean = bulkBps != null

        fun isBulk(): Boolean = bulk != null

        fun isThresholdTotalAmount(): Boolean = thresholdTotalAmount != null

        fun isTieredPackage(): Boolean = tieredPackage != null

        fun isGroupedTiered(): Boolean = groupedTiered != null

        fun isMaxGroupTieredPackage(): Boolean = maxGroupTieredPackage != null

        fun isTieredWithMinimum(): Boolean = tieredWithMinimum != null

        fun isPackageWithAllocation(): Boolean = packageWithAllocation != null

        fun isTieredPackageWithMinimum(): Boolean = tieredPackageWithMinimum != null

        fun isUnitWithPercent(): Boolean = unitWithPercent != null

        fun isTieredWithProration(): Boolean = tieredWithProration != null

        fun isUnitWithProration(): Boolean = unitWithProration != null

        fun isGroupedAllocation(): Boolean = groupedAllocation != null

        fun isGroupedWithProratedMinimum(): Boolean = groupedWithProratedMinimum != null

        fun isGroupedWithMeteredMinimum(): Boolean = groupedWithMeteredMinimum != null

        fun isMatrixWithDisplayName(): Boolean = matrixWithDisplayName != null

        fun isBulkWithProration(): Boolean = bulkWithProration != null

        fun isGroupedTieredPackage(): Boolean = groupedTieredPackage != null

        fun isScalableMatrixWithUnitPricing(): Boolean = scalableMatrixWithUnitPricing != null

        fun isScalableMatrixWithTieredPricing(): Boolean = scalableMatrixWithTieredPricing != null

        fun isCumulativeGroupedBulk(): Boolean = cumulativeGroupedBulk != null

        fun asUnit(): NewFloatingUnitPrice = unit.getOrThrow("unit")

        fun asPackage(): NewFloatingPackagePrice = package_.getOrThrow("package_")

        fun asMatrix(): NewFloatingMatrixPrice = matrix.getOrThrow("matrix")

        fun asMatrixWithAllocation(): NewFloatingMatrixWithAllocationPrice =
            matrixWithAllocation.getOrThrow("matrixWithAllocation")

        fun asTiered(): NewFloatingTieredPrice = tiered.getOrThrow("tiered")

        fun asTieredBps(): NewFloatingTieredBpsPrice = tieredBps.getOrThrow("tieredBps")

        fun asBps(): NewFloatingBpsPrice = bps.getOrThrow("bps")

        fun asBulkBps(): NewFloatingBulkBpsPrice = bulkBps.getOrThrow("bulkBps")

        fun asBulk(): NewFloatingBulkPrice = bulk.getOrThrow("bulk")

        fun asThresholdTotalAmount(): NewFloatingThresholdTotalAmountPrice =
            thresholdTotalAmount.getOrThrow("thresholdTotalAmount")

        fun asTieredPackage(): NewFloatingTieredPackagePrice =
            tieredPackage.getOrThrow("tieredPackage")

        fun asGroupedTiered(): NewFloatingGroupedTieredPrice =
            groupedTiered.getOrThrow("groupedTiered")

        fun asMaxGroupTieredPackage(): NewFloatingMaxGroupTieredPackagePrice =
            maxGroupTieredPackage.getOrThrow("maxGroupTieredPackage")

        fun asTieredWithMinimum(): NewFloatingTieredWithMinimumPrice =
            tieredWithMinimum.getOrThrow("tieredWithMinimum")

        fun asPackageWithAllocation(): NewFloatingPackageWithAllocationPrice =
            packageWithAllocation.getOrThrow("packageWithAllocation")

        fun asTieredPackageWithMinimum(): NewFloatingTieredPackageWithMinimumPrice =
            tieredPackageWithMinimum.getOrThrow("tieredPackageWithMinimum")

        fun asUnitWithPercent(): NewFloatingUnitWithPercentPrice =
            unitWithPercent.getOrThrow("unitWithPercent")

        fun asTieredWithProration(): NewFloatingTieredWithProrationPrice =
            tieredWithProration.getOrThrow("tieredWithProration")

        fun asUnitWithProration(): NewFloatingUnitWithProrationPrice =
            unitWithProration.getOrThrow("unitWithProration")

        fun asGroupedAllocation(): NewFloatingGroupedAllocationPrice =
            groupedAllocation.getOrThrow("groupedAllocation")

        fun asGroupedWithProratedMinimum(): NewFloatingGroupedWithProratedMinimumPrice =
            groupedWithProratedMinimum.getOrThrow("groupedWithProratedMinimum")

        fun asGroupedWithMeteredMinimum(): NewFloatingGroupedWithMeteredMinimumPrice =
            groupedWithMeteredMinimum.getOrThrow("groupedWithMeteredMinimum")

        fun asMatrixWithDisplayName(): NewFloatingMatrixWithDisplayNamePrice =
            matrixWithDisplayName.getOrThrow("matrixWithDisplayName")

        fun asBulkWithProration(): NewFloatingBulkWithProrationPrice =
            bulkWithProration.getOrThrow("bulkWithProration")

        fun asGroupedTieredPackage(): NewFloatingGroupedTieredPackagePrice =
            groupedTieredPackage.getOrThrow("groupedTieredPackage")

        fun asScalableMatrixWithUnitPricing(): NewFloatingScalableMatrixWithUnitPricingPrice =
            scalableMatrixWithUnitPricing.getOrThrow("scalableMatrixWithUnitPricing")

        fun asScalableMatrixWithTieredPricing(): NewFloatingScalableMatrixWithTieredPricingPrice =
            scalableMatrixWithTieredPricing.getOrThrow("scalableMatrixWithTieredPricing")

        fun asCumulativeGroupedBulk(): NewFloatingCumulativeGroupedBulkPrice =
            cumulativeGroupedBulk.getOrThrow("cumulativeGroupedBulk")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unit != null -> visitor.visitUnit(unit)
                package_ != null -> visitor.visitPackage(package_)
                matrix != null -> visitor.visitMatrix(matrix)
                matrixWithAllocation != null ->
                    visitor.visitMatrixWithAllocation(matrixWithAllocation)
                tiered != null -> visitor.visitTiered(tiered)
                tieredBps != null -> visitor.visitTieredBps(tieredBps)
                bps != null -> visitor.visitBps(bps)
                bulkBps != null -> visitor.visitBulkBps(bulkBps)
                bulk != null -> visitor.visitBulk(bulk)
                thresholdTotalAmount != null ->
                    visitor.visitThresholdTotalAmount(thresholdTotalAmount)
                tieredPackage != null -> visitor.visitTieredPackage(tieredPackage)
                groupedTiered != null -> visitor.visitGroupedTiered(groupedTiered)
                maxGroupTieredPackage != null ->
                    visitor.visitMaxGroupTieredPackage(maxGroupTieredPackage)
                tieredWithMinimum != null -> visitor.visitTieredWithMinimum(tieredWithMinimum)
                packageWithAllocation != null ->
                    visitor.visitPackageWithAllocation(packageWithAllocation)
                tieredPackageWithMinimum != null ->
                    visitor.visitTieredPackageWithMinimum(tieredPackageWithMinimum)
                unitWithPercent != null -> visitor.visitUnitWithPercent(unitWithPercent)
                tieredWithProration != null -> visitor.visitTieredWithProration(tieredWithProration)
                unitWithProration != null -> visitor.visitUnitWithProration(unitWithProration)
                groupedAllocation != null -> visitor.visitGroupedAllocation(groupedAllocation)
                groupedWithProratedMinimum != null ->
                    visitor.visitGroupedWithProratedMinimum(groupedWithProratedMinimum)
                groupedWithMeteredMinimum != null ->
                    visitor.visitGroupedWithMeteredMinimum(groupedWithMeteredMinimum)
                matrixWithDisplayName != null ->
                    visitor.visitMatrixWithDisplayName(matrixWithDisplayName)
                bulkWithProration != null -> visitor.visitBulkWithProration(bulkWithProration)
                groupedTieredPackage != null ->
                    visitor.visitGroupedTieredPackage(groupedTieredPackage)
                scalableMatrixWithUnitPricing != null ->
                    visitor.visitScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)
                scalableMatrixWithTieredPricing != null ->
                    visitor.visitScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)
                cumulativeGroupedBulk != null ->
                    visitor.visitCumulativeGroupedBulk(cumulativeGroupedBulk)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnit(unit: NewFloatingUnitPrice) {
                        unit.validate()
                    }

                    override fun visitPackage(package_: NewFloatingPackagePrice) {
                        package_.validate()
                    }

                    override fun visitMatrix(matrix: NewFloatingMatrixPrice) {
                        matrix.validate()
                    }

                    override fun visitMatrixWithAllocation(
                        matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                    ) {
                        matrixWithAllocation.validate()
                    }

                    override fun visitTiered(tiered: NewFloatingTieredPrice) {
                        tiered.validate()
                    }

                    override fun visitTieredBps(tieredBps: NewFloatingTieredBpsPrice) {
                        tieredBps.validate()
                    }

                    override fun visitBps(bps: NewFloatingBpsPrice) {
                        bps.validate()
                    }

                    override fun visitBulkBps(bulkBps: NewFloatingBulkBpsPrice) {
                        bulkBps.validate()
                    }

                    override fun visitBulk(bulk: NewFloatingBulkPrice) {
                        bulk.validate()
                    }

                    override fun visitThresholdTotalAmount(
                        thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                    ) {
                        thresholdTotalAmount.validate()
                    }

                    override fun visitTieredPackage(tieredPackage: NewFloatingTieredPackagePrice) {
                        tieredPackage.validate()
                    }

                    override fun visitGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice) {
                        groupedTiered.validate()
                    }

                    override fun visitMaxGroupTieredPackage(
                        maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                    ) {
                        maxGroupTieredPackage.validate()
                    }

                    override fun visitTieredWithMinimum(
                        tieredWithMinimum: NewFloatingTieredWithMinimumPrice
                    ) {
                        tieredWithMinimum.validate()
                    }

                    override fun visitPackageWithAllocation(
                        packageWithAllocation: NewFloatingPackageWithAllocationPrice
                    ) {
                        packageWithAllocation.validate()
                    }

                    override fun visitTieredPackageWithMinimum(
                        tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                    ) {
                        tieredPackageWithMinimum.validate()
                    }

                    override fun visitUnitWithPercent(
                        unitWithPercent: NewFloatingUnitWithPercentPrice
                    ) {
                        unitWithPercent.validate()
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

                    override fun visitMatrixWithDisplayName(
                        matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                    ) {
                        matrixWithDisplayName.validate()
                    }

                    override fun visitBulkWithProration(
                        bulkWithProration: NewFloatingBulkWithProrationPrice
                    ) {
                        bulkWithProration.validate()
                    }

                    override fun visitGroupedTieredPackage(
                        groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                    ) {
                        groupedTieredPackage.validate()
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

                    override fun visitPackage(package_: NewFloatingPackagePrice) =
                        package_.validity()

                    override fun visitMatrix(matrix: NewFloatingMatrixPrice) = matrix.validity()

                    override fun visitMatrixWithAllocation(
                        matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                    ) = matrixWithAllocation.validity()

                    override fun visitTiered(tiered: NewFloatingTieredPrice) = tiered.validity()

                    override fun visitTieredBps(tieredBps: NewFloatingTieredBpsPrice) =
                        tieredBps.validity()

                    override fun visitBps(bps: NewFloatingBpsPrice) = bps.validity()

                    override fun visitBulkBps(bulkBps: NewFloatingBulkBpsPrice) = bulkBps.validity()

                    override fun visitBulk(bulk: NewFloatingBulkPrice) = bulk.validity()

                    override fun visitThresholdTotalAmount(
                        thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                    ) = thresholdTotalAmount.validity()

                    override fun visitTieredPackage(tieredPackage: NewFloatingTieredPackagePrice) =
                        tieredPackage.validity()

                    override fun visitGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice) =
                        groupedTiered.validity()

                    override fun visitMaxGroupTieredPackage(
                        maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                    ) = maxGroupTieredPackage.validity()

                    override fun visitTieredWithMinimum(
                        tieredWithMinimum: NewFloatingTieredWithMinimumPrice
                    ) = tieredWithMinimum.validity()

                    override fun visitPackageWithAllocation(
                        packageWithAllocation: NewFloatingPackageWithAllocationPrice
                    ) = packageWithAllocation.validity()

                    override fun visitTieredPackageWithMinimum(
                        tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                    ) = tieredPackageWithMinimum.validity()

                    override fun visitUnitWithPercent(
                        unitWithPercent: NewFloatingUnitWithPercentPrice
                    ) = unitWithPercent.validity()

                    override fun visitTieredWithProration(
                        tieredWithProration: NewFloatingTieredWithProrationPrice
                    ) = tieredWithProration.validity()

                    override fun visitUnitWithProration(
                        unitWithProration: NewFloatingUnitWithProrationPrice
                    ) = unitWithProration.validity()

                    override fun visitGroupedAllocation(
                        groupedAllocation: NewFloatingGroupedAllocationPrice
                    ) = groupedAllocation.validity()

                    override fun visitGroupedWithProratedMinimum(
                        groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                    ) = groupedWithProratedMinimum.validity()

                    override fun visitGroupedWithMeteredMinimum(
                        groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                    ) = groupedWithMeteredMinimum.validity()

                    override fun visitMatrixWithDisplayName(
                        matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                    ) = matrixWithDisplayName.validity()

                    override fun visitBulkWithProration(
                        bulkWithProration: NewFloatingBulkWithProrationPrice
                    ) = bulkWithProration.validity()

                    override fun visitGroupedTieredPackage(
                        groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                    ) = groupedTieredPackage.validity()

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

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && unit == other.unit && package_ == other.package_ && matrix == other.matrix && matrixWithAllocation == other.matrixWithAllocation && tiered == other.tiered && tieredBps == other.tieredBps && bps == other.bps && bulkBps == other.bulkBps && bulk == other.bulk && thresholdTotalAmount == other.thresholdTotalAmount && tieredPackage == other.tieredPackage && groupedTiered == other.groupedTiered && maxGroupTieredPackage == other.maxGroupTieredPackage && tieredWithMinimum == other.tieredWithMinimum && packageWithAllocation == other.packageWithAllocation && tieredPackageWithMinimum == other.tieredPackageWithMinimum && unitWithPercent == other.unitWithPercent && tieredWithProration == other.tieredWithProration && unitWithProration == other.unitWithProration && groupedAllocation == other.groupedAllocation && groupedWithProratedMinimum == other.groupedWithProratedMinimum && groupedWithMeteredMinimum == other.groupedWithMeteredMinimum && matrixWithDisplayName == other.matrixWithDisplayName && bulkWithProration == other.bulkWithProration && groupedTieredPackage == other.groupedTieredPackage && scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing && scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing && cumulativeGroupedBulk == other.cumulativeGroupedBulk /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(unit, package_, matrix, matrixWithAllocation, tiered, tieredBps, bps, bulkBps, bulk, thresholdTotalAmount, tieredPackage, groupedTiered, maxGroupTieredPackage, tieredWithMinimum, packageWithAllocation, tieredPackageWithMinimum, unitWithPercent, tieredWithProration, unitWithProration, groupedAllocation, groupedWithProratedMinimum, groupedWithMeteredMinimum, matrixWithDisplayName, bulkWithProration, groupedTieredPackage, scalableMatrixWithUnitPricing, scalableMatrixWithTieredPricing, cumulativeGroupedBulk) /* spotless:on */

        override fun toString(): String =
            when {
                unit != null -> "Body{unit=$unit}"
                package_ != null -> "Body{package_=$package_}"
                matrix != null -> "Body{matrix=$matrix}"
                matrixWithAllocation != null -> "Body{matrixWithAllocation=$matrixWithAllocation}"
                tiered != null -> "Body{tiered=$tiered}"
                tieredBps != null -> "Body{tieredBps=$tieredBps}"
                bps != null -> "Body{bps=$bps}"
                bulkBps != null -> "Body{bulkBps=$bulkBps}"
                bulk != null -> "Body{bulk=$bulk}"
                thresholdTotalAmount != null -> "Body{thresholdTotalAmount=$thresholdTotalAmount}"
                tieredPackage != null -> "Body{tieredPackage=$tieredPackage}"
                groupedTiered != null -> "Body{groupedTiered=$groupedTiered}"
                maxGroupTieredPackage != null ->
                    "Body{maxGroupTieredPackage=$maxGroupTieredPackage}"
                tieredWithMinimum != null -> "Body{tieredWithMinimum=$tieredWithMinimum}"
                packageWithAllocation != null ->
                    "Body{packageWithAllocation=$packageWithAllocation}"
                tieredPackageWithMinimum != null ->
                    "Body{tieredPackageWithMinimum=$tieredPackageWithMinimum}"
                unitWithPercent != null -> "Body{unitWithPercent=$unitWithPercent}"
                tieredWithProration != null -> "Body{tieredWithProration=$tieredWithProration}"
                unitWithProration != null -> "Body{unitWithProration=$unitWithProration}"
                groupedAllocation != null -> "Body{groupedAllocation=$groupedAllocation}"
                groupedWithProratedMinimum != null ->
                    "Body{groupedWithProratedMinimum=$groupedWithProratedMinimum}"
                groupedWithMeteredMinimum != null ->
                    "Body{groupedWithMeteredMinimum=$groupedWithMeteredMinimum}"
                matrixWithDisplayName != null ->
                    "Body{matrixWithDisplayName=$matrixWithDisplayName}"
                bulkWithProration != null -> "Body{bulkWithProration=$bulkWithProration}"
                groupedTieredPackage != null -> "Body{groupedTieredPackage=$groupedTieredPackage}"
                scalableMatrixWithUnitPricing != null ->
                    "Body{scalableMatrixWithUnitPricing=$scalableMatrixWithUnitPricing}"
                scalableMatrixWithTieredPricing != null ->
                    "Body{scalableMatrixWithTieredPricing=$scalableMatrixWithTieredPricing}"
                cumulativeGroupedBulk != null ->
                    "Body{cumulativeGroupedBulk=$cumulativeGroupedBulk}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            fun ofUnit(unit: NewFloatingUnitPrice) = Body(unit = unit)

            fun ofPackage(package_: NewFloatingPackagePrice) = Body(package_ = package_)

            fun ofMatrix(matrix: NewFloatingMatrixPrice) = Body(matrix = matrix)

            fun ofMatrixWithAllocation(matrixWithAllocation: NewFloatingMatrixWithAllocationPrice) =
                Body(matrixWithAllocation = matrixWithAllocation)

            fun ofTiered(tiered: NewFloatingTieredPrice) = Body(tiered = tiered)

            fun ofTieredBps(tieredBps: NewFloatingTieredBpsPrice) = Body(tieredBps = tieredBps)

            fun ofBps(bps: NewFloatingBpsPrice) = Body(bps = bps)

            fun ofBulkBps(bulkBps: NewFloatingBulkBpsPrice) = Body(bulkBps = bulkBps)

            fun ofBulk(bulk: NewFloatingBulkPrice) = Body(bulk = bulk)

            fun ofThresholdTotalAmount(thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice) =
                Body(thresholdTotalAmount = thresholdTotalAmount)

            fun ofTieredPackage(tieredPackage: NewFloatingTieredPackagePrice) =
                Body(tieredPackage = tieredPackage)

            fun ofGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice) =
                Body(groupedTiered = groupedTiered)

            fun ofMaxGroupTieredPackage(
                maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
            ) = Body(maxGroupTieredPackage = maxGroupTieredPackage)

            fun ofTieredWithMinimum(tieredWithMinimum: NewFloatingTieredWithMinimumPrice) =
                Body(tieredWithMinimum = tieredWithMinimum)

            fun ofPackageWithAllocation(
                packageWithAllocation: NewFloatingPackageWithAllocationPrice
            ) = Body(packageWithAllocation = packageWithAllocation)

            fun ofTieredPackageWithMinimum(
                tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
            ) = Body(tieredPackageWithMinimum = tieredPackageWithMinimum)

            fun ofUnitWithPercent(unitWithPercent: NewFloatingUnitWithPercentPrice) =
                Body(unitWithPercent = unitWithPercent)

            fun ofTieredWithProration(tieredWithProration: NewFloatingTieredWithProrationPrice) =
                Body(tieredWithProration = tieredWithProration)

            fun ofUnitWithProration(unitWithProration: NewFloatingUnitWithProrationPrice) =
                Body(unitWithProration = unitWithProration)

            fun ofGroupedAllocation(groupedAllocation: NewFloatingGroupedAllocationPrice) =
                Body(groupedAllocation = groupedAllocation)

            fun ofGroupedWithProratedMinimum(
                groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
            ) = Body(groupedWithProratedMinimum = groupedWithProratedMinimum)

            fun ofGroupedWithMeteredMinimum(
                groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
            ) = Body(groupedWithMeteredMinimum = groupedWithMeteredMinimum)

            fun ofMatrixWithDisplayName(
                matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
            ) = Body(matrixWithDisplayName = matrixWithDisplayName)

            fun ofBulkWithProration(bulkWithProration: NewFloatingBulkWithProrationPrice) =
                Body(bulkWithProration = bulkWithProration)

            fun ofGroupedTieredPackage(groupedTieredPackage: NewFloatingGroupedTieredPackagePrice) =
                Body(groupedTieredPackage = groupedTieredPackage)

            fun ofScalableMatrixWithUnitPricing(
                scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
            ) = Body(scalableMatrixWithUnitPricing = scalableMatrixWithUnitPricing)

            fun ofScalableMatrixWithTieredPricing(
                scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice
            ) = Body(scalableMatrixWithTieredPricing = scalableMatrixWithTieredPricing)

            fun ofCumulativeGroupedBulk(
                cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
            ) = Body(cumulativeGroupedBulk = cumulativeGroupedBulk)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitUnit(unit: NewFloatingUnitPrice): T

            fun visitPackage(package_: NewFloatingPackagePrice): T

            fun visitMatrix(matrix: NewFloatingMatrixPrice): T

            fun visitMatrixWithAllocation(
                matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
            ): T

            fun visitTiered(tiered: NewFloatingTieredPrice): T

            fun visitTieredBps(tieredBps: NewFloatingTieredBpsPrice): T

            fun visitBps(bps: NewFloatingBpsPrice): T

            fun visitBulkBps(bulkBps: NewFloatingBulkBpsPrice): T

            fun visitBulk(bulk: NewFloatingBulkPrice): T

            fun visitThresholdTotalAmount(
                thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
            ): T

            fun visitTieredPackage(tieredPackage: NewFloatingTieredPackagePrice): T

            fun visitGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice): T

            fun visitMaxGroupTieredPackage(
                maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
            ): T

            fun visitTieredWithMinimum(tieredWithMinimum: NewFloatingTieredWithMinimumPrice): T

            fun visitPackageWithAllocation(
                packageWithAllocation: NewFloatingPackageWithAllocationPrice
            ): T

            fun visitTieredPackageWithMinimum(
                tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
            ): T

            fun visitUnitWithPercent(unitWithPercent: NewFloatingUnitWithPercentPrice): T

            fun visitTieredWithProration(
                tieredWithProration: NewFloatingTieredWithProrationPrice
            ): T

            fun visitUnitWithProration(unitWithProration: NewFloatingUnitWithProrationPrice): T

            fun visitGroupedAllocation(groupedAllocation: NewFloatingGroupedAllocationPrice): T

            fun visitGroupedWithProratedMinimum(
                groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
            ): T

            fun visitGroupedWithMeteredMinimum(
                groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
            ): T

            fun visitMatrixWithDisplayName(
                matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
            ): T

            fun visitBulkWithProration(bulkWithProration: NewFloatingBulkWithProrationPrice): T

            fun visitGroupedTieredPackage(
                groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
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
                    "package" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingPackagePrice>())
                            ?.let { Body(package_ = it, _json = json) } ?: Body(_json = json)
                    }
                    "matrix" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingMatrixPrice>())?.let {
                            Body(matrix = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "matrix_with_allocation" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingMatrixWithAllocationPrice>(),
                            )
                            ?.let { Body(matrixWithAllocation = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "tiered" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingTieredPrice>())?.let {
                            Body(tiered = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "tiered_bps" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingTieredBpsPrice>())
                            ?.let { Body(tieredBps = it, _json = json) } ?: Body(_json = json)
                    }
                    "bps" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingBpsPrice>())?.let {
                            Body(bps = it, _json = json)
                        } ?: Body(_json = json)
                    }
                    "bulk_bps" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingBulkBpsPrice>())
                            ?.let { Body(bulkBps = it, _json = json) } ?: Body(_json = json)
                    }
                    "bulk" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingBulkPrice>())?.let {
                            Body(bulk = it, _json = json)
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
                    "grouped_tiered" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewFloatingGroupedTieredPrice>())
                            ?.let { Body(groupedTiered = it, _json = json) } ?: Body(_json = json)
                    }
                    "max_group_tiered_package" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingMaxGroupTieredPackagePrice>(),
                            )
                            ?.let { Body(maxGroupTieredPackage = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "tiered_with_minimum" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingTieredWithMinimumPrice>(),
                            )
                            ?.let { Body(tieredWithMinimum = it, _json = json) }
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
                    "tiered_package_with_minimum" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingTieredPackageWithMinimumPrice>(),
                            )
                            ?.let { Body(tieredPackageWithMinimum = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "unit_with_percent" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingUnitWithPercentPrice>(),
                            )
                            ?.let { Body(unitWithPercent = it, _json = json) } ?: Body(_json = json)
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
                    "matrix_with_display_name" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingMatrixWithDisplayNamePrice>(),
                            )
                            ?.let { Body(matrixWithDisplayName = it, _json = json) }
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
                    "grouped_tiered_package" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingGroupedTieredPackagePrice>(),
                            )
                            ?.let { Body(groupedTieredPackage = it, _json = json) }
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
                    value.package_ != null -> generator.writeObject(value.package_)
                    value.matrix != null -> generator.writeObject(value.matrix)
                    value.matrixWithAllocation != null ->
                        generator.writeObject(value.matrixWithAllocation)
                    value.tiered != null -> generator.writeObject(value.tiered)
                    value.tieredBps != null -> generator.writeObject(value.tieredBps)
                    value.bps != null -> generator.writeObject(value.bps)
                    value.bulkBps != null -> generator.writeObject(value.bulkBps)
                    value.bulk != null -> generator.writeObject(value.bulk)
                    value.thresholdTotalAmount != null ->
                        generator.writeObject(value.thresholdTotalAmount)
                    value.tieredPackage != null -> generator.writeObject(value.tieredPackage)
                    value.groupedTiered != null -> generator.writeObject(value.groupedTiered)
                    value.maxGroupTieredPackage != null ->
                        generator.writeObject(value.maxGroupTieredPackage)
                    value.tieredWithMinimum != null ->
                        generator.writeObject(value.tieredWithMinimum)
                    value.packageWithAllocation != null ->
                        generator.writeObject(value.packageWithAllocation)
                    value.tieredPackageWithMinimum != null ->
                        generator.writeObject(value.tieredPackageWithMinimum)
                    value.unitWithPercent != null -> generator.writeObject(value.unitWithPercent)
                    value.tieredWithProration != null ->
                        generator.writeObject(value.tieredWithProration)
                    value.unitWithProration != null ->
                        generator.writeObject(value.unitWithProration)
                    value.groupedAllocation != null ->
                        generator.writeObject(value.groupedAllocation)
                    value.groupedWithProratedMinimum != null ->
                        generator.writeObject(value.groupedWithProratedMinimum)
                    value.groupedWithMeteredMinimum != null ->
                        generator.writeObject(value.groupedWithMeteredMinimum)
                    value.matrixWithDisplayName != null ->
                        generator.writeObject(value.matrixWithDisplayName)
                    value.bulkWithProration != null ->
                        generator.writeObject(value.bulkWithProration)
                    value.groupedTieredPackage != null ->
                        generator.writeObject(value.groupedTieredPackage)
                    value.scalableMatrixWithUnitPricing != null ->
                        generator.writeObject(value.scalableMatrixWithUnitPricing)
                    value.scalableMatrixWithTieredPricing != null ->
                        generator.writeObject(value.scalableMatrixWithTieredPricing)
                    value.cumulativeGroupedBulk != null ->
                        generator.writeObject(value.cumulativeGroupedBulk)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PriceCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
