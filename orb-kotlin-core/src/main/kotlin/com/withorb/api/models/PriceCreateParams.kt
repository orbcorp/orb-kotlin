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

        /**
         * Alias for calling [body] with
         * `Body.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)`.
         */
        fun body(groupedWithMinMaxThresholds: Body.GroupedWithMinMaxThresholds) =
            body(Body.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds))

        /** Alias for calling [body] with `Body.ofMinimum(minimum)`. */
        fun body(minimum: NewFloatingMinimumCompositePrice) = body(Body.ofMinimum(minimum))

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
        private val groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds? = null,
        private val minimum: NewFloatingMinimumCompositePrice? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unit(): NewFloatingUnitPrice? = unit

        fun package_(): NewFloatingPackagePrice? = package_

        fun matrix(): NewFloatingMatrixPrice? = matrix

        fun matrixWithAllocation(): NewFloatingMatrixWithAllocationPrice? = matrixWithAllocation

        fun tiered(): NewFloatingTieredPrice? = tiered

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

        fun groupedWithMinMaxThresholds(): GroupedWithMinMaxThresholds? =
            groupedWithMinMaxThresholds

        fun minimum(): NewFloatingMinimumCompositePrice? = minimum

        fun isUnit(): Boolean = unit != null

        fun isPackage(): Boolean = package_ != null

        fun isMatrix(): Boolean = matrix != null

        fun isMatrixWithAllocation(): Boolean = matrixWithAllocation != null

        fun isTiered(): Boolean = tiered != null

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

        fun isGroupedWithMinMaxThresholds(): Boolean = groupedWithMinMaxThresholds != null

        fun isMinimum(): Boolean = minimum != null

        fun asUnit(): NewFloatingUnitPrice = unit.getOrThrow("unit")

        fun asPackage(): NewFloatingPackagePrice = package_.getOrThrow("package_")

        fun asMatrix(): NewFloatingMatrixPrice = matrix.getOrThrow("matrix")

        fun asMatrixWithAllocation(): NewFloatingMatrixWithAllocationPrice =
            matrixWithAllocation.getOrThrow("matrixWithAllocation")

        fun asTiered(): NewFloatingTieredPrice = tiered.getOrThrow("tiered")

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

        fun asGroupedWithMinMaxThresholds(): GroupedWithMinMaxThresholds =
            groupedWithMinMaxThresholds.getOrThrow("groupedWithMinMaxThresholds")

        fun asMinimum(): NewFloatingMinimumCompositePrice = minimum.getOrThrow("minimum")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unit != null -> visitor.visitUnit(unit)
                package_ != null -> visitor.visitPackage(package_)
                matrix != null -> visitor.visitMatrix(matrix)
                matrixWithAllocation != null ->
                    visitor.visitMatrixWithAllocation(matrixWithAllocation)
                tiered != null -> visitor.visitTiered(tiered)
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
                groupedWithMinMaxThresholds != null ->
                    visitor.visitGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)
                minimum != null -> visitor.visitMinimum(minimum)
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

                    override fun visitGroupedWithMinMaxThresholds(
                        groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                    ) {
                        groupedWithMinMaxThresholds.validate()
                    }

                    override fun visitMinimum(minimum: NewFloatingMinimumCompositePrice) {
                        minimum.validate()
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

                    override fun visitGroupedWithMinMaxThresholds(
                        groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                    ) = groupedWithMinMaxThresholds.validity()

                    override fun visitMinimum(minimum: NewFloatingMinimumCompositePrice) =
                        minimum.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                unit == other.unit &&
                package_ == other.package_ &&
                matrix == other.matrix &&
                matrixWithAllocation == other.matrixWithAllocation &&
                tiered == other.tiered &&
                bulk == other.bulk &&
                thresholdTotalAmount == other.thresholdTotalAmount &&
                tieredPackage == other.tieredPackage &&
                groupedTiered == other.groupedTiered &&
                maxGroupTieredPackage == other.maxGroupTieredPackage &&
                tieredWithMinimum == other.tieredWithMinimum &&
                packageWithAllocation == other.packageWithAllocation &&
                tieredPackageWithMinimum == other.tieredPackageWithMinimum &&
                unitWithPercent == other.unitWithPercent &&
                tieredWithProration == other.tieredWithProration &&
                unitWithProration == other.unitWithProration &&
                groupedAllocation == other.groupedAllocation &&
                groupedWithProratedMinimum == other.groupedWithProratedMinimum &&
                groupedWithMeteredMinimum == other.groupedWithMeteredMinimum &&
                matrixWithDisplayName == other.matrixWithDisplayName &&
                bulkWithProration == other.bulkWithProration &&
                groupedTieredPackage == other.groupedTieredPackage &&
                scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing &&
                scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing &&
                cumulativeGroupedBulk == other.cumulativeGroupedBulk &&
                groupedWithMinMaxThresholds == other.groupedWithMinMaxThresholds &&
                minimum == other.minimum
        }

        override fun hashCode(): Int =
            Objects.hash(
                unit,
                package_,
                matrix,
                matrixWithAllocation,
                tiered,
                bulk,
                thresholdTotalAmount,
                tieredPackage,
                groupedTiered,
                maxGroupTieredPackage,
                tieredWithMinimum,
                packageWithAllocation,
                tieredPackageWithMinimum,
                unitWithPercent,
                tieredWithProration,
                unitWithProration,
                groupedAllocation,
                groupedWithProratedMinimum,
                groupedWithMeteredMinimum,
                matrixWithDisplayName,
                bulkWithProration,
                groupedTieredPackage,
                scalableMatrixWithUnitPricing,
                scalableMatrixWithTieredPricing,
                cumulativeGroupedBulk,
                groupedWithMinMaxThresholds,
                minimum,
            )

        override fun toString(): String =
            when {
                unit != null -> "Body{unit=$unit}"
                package_ != null -> "Body{package_=$package_}"
                matrix != null -> "Body{matrix=$matrix}"
                matrixWithAllocation != null -> "Body{matrixWithAllocation=$matrixWithAllocation}"
                tiered != null -> "Body{tiered=$tiered}"
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
                groupedWithMinMaxThresholds != null ->
                    "Body{groupedWithMinMaxThresholds=$groupedWithMinMaxThresholds}"
                minimum != null -> "Body{minimum=$minimum}"
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

            fun ofGroupedWithMinMaxThresholds(
                groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
            ) = Body(groupedWithMinMaxThresholds = groupedWithMinMaxThresholds)

            fun ofMinimum(minimum: NewFloatingMinimumCompositePrice) = Body(minimum = minimum)
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

            fun visitGroupedWithMinMaxThresholds(
                groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
            ): T

            fun visitMinimum(minimum: NewFloatingMinimumCompositePrice): T

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
                    "grouped_with_min_max_thresholds" -> {
                        return tryDeserialize(node, jacksonTypeRef<GroupedWithMinMaxThresholds>())
                            ?.let { Body(groupedWithMinMaxThresholds = it, _json = json) }
                            ?: Body(_json = json)
                    }
                    "minimum" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingMinimumCompositePrice>(),
                            )
                            ?.let { Body(minimum = it, _json = json) } ?: Body(_json = json)
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
                    value.groupedWithMinMaxThresholds != null ->
                        generator.writeObject(value.groupedWithMinMaxThresholds)
                    value.minimum != null -> generator.writeObject(value.minimum)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class GroupedWithMinMaxThresholds
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
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

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

            class GroupedWithMinMaxThresholdsConfig
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

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [GroupedWithMinMaxThresholdsConfig].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [GroupedWithMinMaxThresholdsConfig]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        groupedWithMinMaxThresholdsConfig: GroupedWithMinMaxThresholdsConfig
                    ) = apply {
                        additionalProperties =
                            groupedWithMinMaxThresholdsConfig.additionalProperties.toMutableMap()
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
                     */
                    fun build(): GroupedWithMinMaxThresholdsConfig =
                        GroupedWithMinMaxThresholdsConfig(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): GroupedWithMinMaxThresholdsConfig = apply {
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

                    return other is GroupedWithMinMaxThresholdsConfig &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GroupedWithMinMaxThresholdsConfig{additionalProperties=$additionalProperties}"
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
                    metadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GroupedWithMinMaxThresholds{cadence=$cadence, currency=$currency, groupedWithMinMaxThresholdsConfig=$groupedWithMinMaxThresholdsConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
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
