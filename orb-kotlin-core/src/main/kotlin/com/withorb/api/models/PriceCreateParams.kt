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

        /** Alias for calling [body] with `Body.ofMinimum(minimum)`. */
        fun body(minimum: Body.Minimum) = body(Body.ofMinimum(minimum))

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
        private val minimum: Minimum? = null,
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

        fun minimum(): Minimum? = minimum

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

        fun isMinimum(): Boolean = minimum != null

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

        fun asMinimum(): Minimum = minimum.getOrThrow("minimum")

        fun asMinimumComposite(): NewFloatingMinimumCompositePrice =
            minimumComposite.getOrThrow("minimumComposite")

        fun asPercent(): Percent = percent.getOrThrow("percent")

        fun asEventOutput(): EventOutput = eventOutput.getOrThrow("eventOutput")

        fun _json(): JsonValue? = _json

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
                minimum != null -> visitor.visitMinimum(minimum)
                minimumComposite != null -> visitor.visitMinimumComposite(minimumComposite)
                percent != null -> visitor.visitPercent(percent)
                eventOutput != null -> visitor.visitEventOutput(eventOutput)
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

                    override fun visitMinimum(minimum: Minimum) {
                        minimum.validate()
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

                    override fun visitMinimum(minimum: Minimum) = minimum.validity()

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
                minimum == other.minimum &&
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
                minimum,
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
                minimum != null -> "Body{minimum=$minimum}"
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

            fun ofMinimum(minimum: Minimum) = Body(minimum = minimum)

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

            fun visitMinimum(minimum: Minimum): T

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
                    "minimum" -> {
                        return tryDeserialize(node, jacksonTypeRef<Minimum>())?.let {
                            Body(minimum = it, _json = json)
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
                    value.minimum != null -> generator.writeObject(value.minimum)
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
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

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
                    metadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BulkWithFilters{bulkWithFiltersConfig=$bulkWithFiltersConfig, cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
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
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

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
                    metadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CumulativeGroupedAllocation{cadence=$cadence, cumulativeGroupedAllocationConfig=$cumulativeGroupedAllocationConfig, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        class Minimum
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cadence: JsonField<Cadence>,
            private val currency: JsonField<String>,
            private val itemId: JsonField<String>,
            private val minimumConfig: JsonField<MinimumConfig>,
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
                @JsonProperty("item_id")
                @ExcludeMissing
                itemId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("minimum_config")
                @ExcludeMissing
                minimumConfig: JsonField<MinimumConfig> = JsonMissing.of(),
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
                itemId,
                minimumConfig,
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
             * The id of the item the price will be associated with.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun itemId(): String = itemId.getRequired("item_id")

            /**
             * Configuration for minimum pricing
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun minimumConfig(): MinimumConfig = minimumConfig.getRequired("minimum_config")

            /**
             * The pricing model type
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("minimum")
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
             * Returns the raw JSON value of [itemId].
             *
             * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

            /**
             * Returns the raw JSON value of [minimumConfig].
             *
             * Unlike [minimumConfig], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("minimum_config")
            @ExcludeMissing
            fun _minimumConfig(): JsonField<MinimumConfig> = minimumConfig

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
                 * Returns a mutable builder for constructing an instance of [Minimum].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .currency()
                 * .itemId()
                 * .minimumConfig()
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Minimum]. */
            class Builder internal constructor() {

                private var cadence: JsonField<Cadence>? = null
                private var currency: JsonField<String>? = null
                private var itemId: JsonField<String>? = null
                private var minimumConfig: JsonField<MinimumConfig>? = null
                private var modelType: JsonValue = JsonValue.from("minimum")
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

                internal fun from(minimum: Minimum) = apply {
                    cadence = minimum.cadence
                    currency = minimum.currency
                    itemId = minimum.itemId
                    minimumConfig = minimum.minimumConfig
                    modelType = minimum.modelType
                    name = minimum.name
                    billableMetricId = minimum.billableMetricId
                    billedInAdvance = minimum.billedInAdvance
                    billingCycleConfiguration = minimum.billingCycleConfiguration
                    conversionRate = minimum.conversionRate
                    conversionRateConfig = minimum.conversionRateConfig
                    dimensionalPriceConfiguration = minimum.dimensionalPriceConfiguration
                    externalPriceId = minimum.externalPriceId
                    fixedPriceQuantity = minimum.fixedPriceQuantity
                    invoiceGroupingKey = minimum.invoiceGroupingKey
                    invoicingCycleConfiguration = minimum.invoicingCycleConfiguration
                    metadata = minimum.metadata
                    additionalProperties = minimum.additionalProperties.toMutableMap()
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

                /** Configuration for minimum pricing */
                fun minimumConfig(minimumConfig: MinimumConfig) =
                    minimumConfig(JsonField.of(minimumConfig))

                /**
                 * Sets [Builder.minimumConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.minimumConfig] with a well-typed [MinimumConfig]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun minimumConfig(minimumConfig: JsonField<MinimumConfig>) = apply {
                    this.minimumConfig = minimumConfig
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("minimum")
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
                 * Returns an immutable instance of [Minimum].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .cadence()
                 * .currency()
                 * .itemId()
                 * .minimumConfig()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Minimum =
                    Minimum(
                        checkRequired("cadence", cadence),
                        checkRequired("currency", currency),
                        checkRequired("itemId", itemId),
                        checkRequired("minimumConfig", minimumConfig),
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

            fun validate(): Minimum = apply {
                if (validated) {
                    return@apply
                }

                cadence().validate()
                currency()
                itemId()
                minimumConfig().validate()
                _modelType().let {
                    if (it != JsonValue.from("minimum")) {
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
                    (if (itemId.asKnown() == null) 0 else 1) +
                    (minimumConfig.asKnown()?.validity() ?: 0) +
                    modelType.let { if (it == JsonValue.from("minimum")) 1 else 0 } +
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

            /** Configuration for minimum pricing */
            class MinimumConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val minimumAmount: JsonField<String>,
                private val prorated: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("minimum_amount")
                    @ExcludeMissing
                    minimumAmount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("prorated")
                    @ExcludeMissing
                    prorated: JsonField<Boolean> = JsonMissing.of(),
                ) : this(minimumAmount, prorated, mutableMapOf())

                /**
                 * The minimum amount to apply
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

                /**
                 * If true, subtotals from this price are prorated based on the service period
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun prorated(): Boolean? = prorated.getNullable("prorated")

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
                     * Returns a mutable builder for constructing an instance of [MinimumConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .minimumAmount()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [MinimumConfig]. */
                class Builder internal constructor() {

                    private var minimumAmount: JsonField<String>? = null
                    private var prorated: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(minimumConfig: MinimumConfig) = apply {
                        minimumAmount = minimumConfig.minimumAmount
                        prorated = minimumConfig.prorated
                        additionalProperties = minimumConfig.additionalProperties.toMutableMap()
                    }

                    /** The minimum amount to apply */
                    fun minimumAmount(minimumAmount: String) =
                        minimumAmount(JsonField.of(minimumAmount))

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
                     * If true, subtotals from this price are prorated based on the service period
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
                     * Returns an immutable instance of [MinimumConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .minimumAmount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): MinimumConfig =
                        MinimumConfig(
                            checkRequired("minimumAmount", minimumAmount),
                            prorated,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): MinimumConfig = apply {
                    if (validated) {
                        return@apply
                    }

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
                    (if (minimumAmount.asKnown() == null) 0 else 1) +
                        (if (prorated.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MinimumConfig &&
                        minimumAmount == other.minimumAmount &&
                        prorated == other.prorated &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(minimumAmount, prorated, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MinimumConfig{minimumAmount=$minimumAmount, prorated=$prorated, additionalProperties=$additionalProperties}"
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

                return other is Minimum &&
                    cadence == other.cadence &&
                    currency == other.currency &&
                    itemId == other.itemId &&
                    minimumConfig == other.minimumConfig &&
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
                    itemId,
                    minimumConfig,
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
                "Minimum{cadence=$cadence, currency=$currency, itemId=$itemId, minimumConfig=$minimumConfig, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
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
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

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

            /** Configuration for percent pricing */
            class PercentConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val percent: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("percent")
                    @ExcludeMissing
                    percent: JsonField<Double> = JsonMissing.of()
                ) : this(percent, mutableMapOf())

                /**
                 * What percent of the component subtotals to charge
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun percent(): Double = percent.getRequired("percent")

                /**
                 * Returns the raw JSON value of [percent].
                 *
                 * Unlike [percent], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("percent") @ExcludeMissing fun _percent(): JsonField<Double> = percent

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
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(percentConfig: PercentConfig) = apply {
                        percent = percentConfig.percent
                        additionalProperties = percentConfig.additionalProperties.toMutableMap()
                    }

                    /** What percent of the component subtotals to charge */
                    fun percent(percent: Double) = percent(JsonField.of(percent))

                    /**
                     * Sets [Builder.percent] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percent] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun percent(percent: JsonField<Double>) = apply { this.percent = percent }

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
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): PercentConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    percent()
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
                internal fun validity(): Int = (if (percent.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PercentConfig &&
                        percent == other.percent &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(percent, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PercentConfig{percent=$percent, additionalProperties=$additionalProperties}"
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
                    metadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Percent{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, percentConfig=$percentConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
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
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

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
                    metadata,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EventOutput{cadence=$cadence, currency=$currency, eventOutputConfig=$eventOutputConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
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
