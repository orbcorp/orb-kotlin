// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.util.Objects

/**
 * This endpoint is used to create a [price](/product-catalog/price-configuration). A price created
 * using this endpoint is always an add-on, meaning that it’s not associated with a specific plan
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
    private val newFloatingPriceModel: NewFloatingPriceModel,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun newFloatingPriceModel(): NewFloatingPriceModel = newFloatingPriceModel

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): NewFloatingPriceModel = newFloatingPriceModel

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PriceCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .newFloatingPriceModel()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PriceCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var newFloatingPriceModel: NewFloatingPriceModel? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(priceCreateParams: PriceCreateParams) = apply {
            newFloatingPriceModel = priceCreateParams.newFloatingPriceModel
            additionalHeaders = priceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = priceCreateParams.additionalQueryParams.toBuilder()
        }

        fun newFloatingPriceModel(newFloatingPriceModel: NewFloatingPriceModel) = apply {
            this.newFloatingPriceModel = newFloatingPriceModel
        }

        fun newFloatingPriceModel(unitPrice: NewFloatingPriceModel.NewFloatingUnitPrice) =
            newFloatingPriceModel(NewFloatingPriceModel.ofUnitPrice(unitPrice))

        fun newFloatingPriceModel(packagePrice: NewFloatingPriceModel.NewFloatingPackagePrice) =
            newFloatingPriceModel(NewFloatingPriceModel.ofPackagePrice(packagePrice))

        fun newFloatingPriceModel(matrixPrice: NewFloatingPriceModel.NewFloatingMatrixPrice) =
            newFloatingPriceModel(NewFloatingPriceModel.ofMatrixPrice(matrixPrice))

        fun newFloatingPriceModel(
            matrixWithAllocationPrice: NewFloatingPriceModel.NewFloatingMatrixWithAllocationPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofMatrixWithAllocationPrice(matrixWithAllocationPrice)
            )

        fun newFloatingPriceModel(tieredPrice: NewFloatingPriceModel.NewFloatingTieredPrice) =
            newFloatingPriceModel(NewFloatingPriceModel.ofTieredPrice(tieredPrice))

        fun newFloatingPriceModel(tieredBpsPrice: NewFloatingPriceModel.NewFloatingTieredBpsPrice) =
            newFloatingPriceModel(NewFloatingPriceModel.ofTieredBpsPrice(tieredBpsPrice))

        fun newFloatingPriceModel(bpsPrice: NewFloatingPriceModel.NewFloatingBpsPrice) =
            newFloatingPriceModel(NewFloatingPriceModel.ofBpsPrice(bpsPrice))

        fun newFloatingPriceModel(bulkBpsPrice: NewFloatingPriceModel.NewFloatingBulkBpsPrice) =
            newFloatingPriceModel(NewFloatingPriceModel.ofBulkBpsPrice(bulkBpsPrice))

        fun newFloatingPriceModel(bulkPrice: NewFloatingPriceModel.NewFloatingBulkPrice) =
            newFloatingPriceModel(NewFloatingPriceModel.ofBulkPrice(bulkPrice))

        fun newFloatingPriceModel(
            thresholdTotalAmountPrice: NewFloatingPriceModel.NewFloatingThresholdTotalAmountPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofThresholdTotalAmountPrice(thresholdTotalAmountPrice)
            )

        fun newFloatingPriceModel(
            tieredPackagePrice: NewFloatingPriceModel.NewFloatingTieredPackagePrice
        ) = newFloatingPriceModel(NewFloatingPriceModel.ofTieredPackagePrice(tieredPackagePrice))

        fun newFloatingPriceModel(
            groupedTieredPrice: NewFloatingPriceModel.NewFloatingGroupedTieredPrice
        ) = newFloatingPriceModel(NewFloatingPriceModel.ofGroupedTieredPrice(groupedTieredPrice))

        fun newFloatingPriceModel(
            maxGroupTieredPackagePrice: NewFloatingPriceModel.NewFloatingMaxGroupTieredPackagePrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofMaxGroupTieredPackagePrice(maxGroupTieredPackagePrice)
            )

        fun newFloatingPriceModel(
            tieredWithMinimumPrice: NewFloatingPriceModel.NewFloatingTieredWithMinimumPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofTieredWithMinimumPrice(tieredWithMinimumPrice)
            )

        fun newFloatingPriceModel(
            packageWithAllocationPrice: NewFloatingPriceModel.NewFloatingPackageWithAllocationPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofPackageWithAllocationPrice(packageWithAllocationPrice)
            )

        fun newFloatingPriceModel(
            tieredPackageWithMinimumPrice:
                NewFloatingPriceModel.NewFloatingTieredPackageWithMinimumPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofTieredPackageWithMinimumPrice(tieredPackageWithMinimumPrice)
            )

        fun newFloatingPriceModel(
            unitWithPercentPrice: NewFloatingPriceModel.NewFloatingUnitWithPercentPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofUnitWithPercentPrice(unitWithPercentPrice)
            )

        fun newFloatingPriceModel(
            tieredWithProrationPrice: NewFloatingPriceModel.NewFloatingTieredWithProrationPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofTieredWithProrationPrice(tieredWithProrationPrice)
            )

        fun newFloatingPriceModel(
            unitWithProrationPrice: NewFloatingPriceModel.NewFloatingUnitWithProrationPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofUnitWithProrationPrice(unitWithProrationPrice)
            )

        fun newFloatingPriceModel(
            groupedAllocationPrice: NewFloatingPriceModel.NewFloatingGroupedAllocationPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofGroupedAllocationPrice(groupedAllocationPrice)
            )

        fun newFloatingPriceModel(
            groupedWithProratedMinimumPrice:
                NewFloatingPriceModel.NewFloatingGroupedWithProratedMinimumPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofGroupedWithProratedMinimumPrice(
                    groupedWithProratedMinimumPrice
                )
            )

        fun newFloatingPriceModel(
            groupedWithMeteredMinimumPrice:
                NewFloatingPriceModel.NewFloatingGroupedWithMeteredMinimumPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofGroupedWithMeteredMinimumPrice(
                    groupedWithMeteredMinimumPrice
                )
            )

        fun newFloatingPriceModel(
            matrixWithDisplayNamePrice: NewFloatingPriceModel.NewFloatingMatrixWithDisplayNamePrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofMatrixWithDisplayNamePrice(matrixWithDisplayNamePrice)
            )

        fun newFloatingPriceModel(
            bulkWithProrationPrice: NewFloatingPriceModel.NewFloatingBulkWithProrationPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofBulkWithProrationPrice(bulkWithProrationPrice)
            )

        fun newFloatingPriceModel(
            groupedTieredPackagePrice: NewFloatingPriceModel.NewFloatingGroupedTieredPackagePrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofGroupedTieredPackagePrice(groupedTieredPackagePrice)
            )

        fun newFloatingPriceModel(
            scalableMatrixWithUnitPricingPrice:
                NewFloatingPriceModel.NewFloatingScalableMatrixWithUnitPricingPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofScalableMatrixWithUnitPricingPrice(
                    scalableMatrixWithUnitPricingPrice
                )
            )

        fun newFloatingPriceModel(
            scalableMatrixWithTieredPricingPrice:
                NewFloatingPriceModel.NewFloatingScalableMatrixWithTieredPricingPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofScalableMatrixWithTieredPricingPrice(
                    scalableMatrixWithTieredPricingPrice
                )
            )

        fun newFloatingPriceModel(
            cumulativeGroupedBulkPrice: NewFloatingPriceModel.NewFloatingCumulativeGroupedBulkPrice
        ) =
            newFloatingPriceModel(
                NewFloatingPriceModel.ofCumulativeGroupedBulkPrice(cumulativeGroupedBulkPrice)
            )

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

        fun build(): PriceCreateParams =
            PriceCreateParams(
                checkRequired("newFloatingPriceModel", newFloatingPriceModel),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceCreateParams && newFloatingPriceModel == other.newFloatingPriceModel && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(newFloatingPriceModel, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PriceCreateParams{newFloatingPriceModel=$newFloatingPriceModel, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
