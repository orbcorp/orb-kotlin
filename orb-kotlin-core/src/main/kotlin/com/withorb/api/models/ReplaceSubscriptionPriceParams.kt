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
class ReplaceSubscriptionPriceParams
@JsonCreator
private constructor(
    @JsonProperty("replaces_price_id")
    @ExcludeMissing
    private val replacesPriceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("allocation_price")
    @ExcludeMissing
    private val allocationPrice: JsonField<NewAllocationPriceModel> = JsonMissing.of(),
    @JsonProperty("discounts")
    @ExcludeMissing
    private val discounts: JsonField<List<DiscountOverrideModel>> = JsonMissing.of(),
    @JsonProperty("external_price_id")
    @ExcludeMissing
    private val externalPriceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("fixed_price_quantity")
    @ExcludeMissing
    private val fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    private val maximumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    private val minimumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("price")
    @ExcludeMissing
    private val price: JsonField<NewSubscriptionPriceModel> = JsonMissing.of(),
    @JsonProperty("price_id")
    @ExcludeMissing
    private val priceId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The id of the price on the plan to replace in the subscription. */
    fun replacesPriceId(): String = replacesPriceId.getRequired("replaces_price_id")

    /** The definition of a new allocation price to create and add to the subscription. */
    fun allocationPrice(): NewAllocationPriceModel? =
        allocationPrice.getNullable("allocation_price")

    /**
     * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for the replacement
     * price.
     */
    @Deprecated("deprecated")
    fun discounts(): List<DiscountOverrideModel>? = discounts.getNullable("discounts")

    /** The external price id of the price to add to the subscription. */
    fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

    /** The new quantity of the price, if the price is a fixed price. */
    fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

    /**
     * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for the
     * replacement price.
     */
    @Deprecated("deprecated")
    fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

    /**
     * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for the
     * replacement price.
     */
    @Deprecated("deprecated")
    fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

    /** The definition of a new price to create and add to the subscription. */
    fun price(): NewSubscriptionPriceModel? = price.getNullable("price")

    /** The id of the price to add to the subscription. */
    fun priceId(): String? = priceId.getNullable("price_id")

    /** The id of the price on the plan to replace in the subscription. */
    @JsonProperty("replaces_price_id")
    @ExcludeMissing
    fun _replacesPriceId(): JsonField<String> = replacesPriceId

    /** The definition of a new allocation price to create and add to the subscription. */
    @JsonProperty("allocation_price")
    @ExcludeMissing
    fun _allocationPrice(): JsonField<NewAllocationPriceModel> = allocationPrice

    /**
     * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for the replacement
     * price.
     */
    @Deprecated("deprecated")
    @JsonProperty("discounts")
    @ExcludeMissing
    fun _discounts(): JsonField<List<DiscountOverrideModel>> = discounts

    /** The external price id of the price to add to the subscription. */
    @JsonProperty("external_price_id")
    @ExcludeMissing
    fun _externalPriceId(): JsonField<String> = externalPriceId

    /** The new quantity of the price, if the price is a fixed price. */
    @JsonProperty("fixed_price_quantity")
    @ExcludeMissing
    fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

    /**
     * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for the
     * replacement price.
     */
    @Deprecated("deprecated")
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    fun _maximumAmount(): JsonField<String> = maximumAmount

    /**
     * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for the
     * replacement price.
     */
    @Deprecated("deprecated")
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    fun _minimumAmount(): JsonField<String> = minimumAmount

    /** The definition of a new price to create and add to the subscription. */
    @JsonProperty("price")
    @ExcludeMissing
    fun _price(): JsonField<NewSubscriptionPriceModel> = price

    /** The id of the price to add to the subscription. */
    @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ReplaceSubscriptionPriceParams = apply {
        if (validated) {
            return@apply
        }

        replacesPriceId()
        allocationPrice()?.validate()
        discounts()?.forEach { it.validate() }
        externalPriceId()
        fixedPriceQuantity()
        maximumAmount()
        minimumAmount()
        price()?.validate()
        priceId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReplaceSubscriptionPriceParams].
         *
         * The following fields are required:
         * ```kotlin
         * .replacesPriceId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ReplaceSubscriptionPriceParams]. */
    class Builder internal constructor() {

        private var replacesPriceId: JsonField<String>? = null
        private var allocationPrice: JsonField<NewAllocationPriceModel> = JsonMissing.of()
        private var discounts: JsonField<MutableList<DiscountOverrideModel>>? = null
        private var externalPriceId: JsonField<String> = JsonMissing.of()
        private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
        private var maximumAmount: JsonField<String> = JsonMissing.of()
        private var minimumAmount: JsonField<String> = JsonMissing.of()
        private var price: JsonField<NewSubscriptionPriceModel> = JsonMissing.of()
        private var priceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(replaceSubscriptionPriceParams: ReplaceSubscriptionPriceParams) = apply {
            replacesPriceId = replaceSubscriptionPriceParams.replacesPriceId
            allocationPrice = replaceSubscriptionPriceParams.allocationPrice
            discounts = replaceSubscriptionPriceParams.discounts.map { it.toMutableList() }
            externalPriceId = replaceSubscriptionPriceParams.externalPriceId
            fixedPriceQuantity = replaceSubscriptionPriceParams.fixedPriceQuantity
            maximumAmount = replaceSubscriptionPriceParams.maximumAmount
            minimumAmount = replaceSubscriptionPriceParams.minimumAmount
            price = replaceSubscriptionPriceParams.price
            priceId = replaceSubscriptionPriceParams.priceId
            additionalProperties =
                replaceSubscriptionPriceParams.additionalProperties.toMutableMap()
        }

        /** The id of the price on the plan to replace in the subscription. */
        fun replacesPriceId(replacesPriceId: String) =
            replacesPriceId(JsonField.of(replacesPriceId))

        /** The id of the price on the plan to replace in the subscription. */
        fun replacesPriceId(replacesPriceId: JsonField<String>) = apply {
            this.replacesPriceId = replacesPriceId
        }

        /** The definition of a new allocation price to create and add to the subscription. */
        fun allocationPrice(allocationPrice: NewAllocationPriceModel?) =
            allocationPrice(JsonField.ofNullable(allocationPrice))

        /** The definition of a new allocation price to create and add to the subscription. */
        fun allocationPrice(allocationPrice: JsonField<NewAllocationPriceModel>) = apply {
            this.allocationPrice = allocationPrice
        }

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for the
         * replacement price.
         */
        @Deprecated("deprecated")
        fun discounts(discounts: List<DiscountOverrideModel>?) =
            discounts(JsonField.ofNullable(discounts))

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for the
         * replacement price.
         */
        @Deprecated("deprecated")
        fun discounts(discounts: JsonField<List<DiscountOverrideModel>>) = apply {
            this.discounts = discounts.map { it.toMutableList() }
        }

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for the
         * replacement price.
         */
        @Deprecated("deprecated")
        fun addDiscount(discount: DiscountOverrideModel) = apply {
            discounts =
                (discounts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("discounts", it).add(discount)
                }
        }

        /** The external price id of the price to add to the subscription. */
        fun externalPriceId(externalPriceId: String?) =
            externalPriceId(JsonField.ofNullable(externalPriceId))

        /** The external price id of the price to add to the subscription. */
        fun externalPriceId(externalPriceId: JsonField<String>) = apply {
            this.externalPriceId = externalPriceId
        }

        /** The new quantity of the price, if the price is a fixed price. */
        fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
            fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

        /** The new quantity of the price, if the price is a fixed price. */
        fun fixedPriceQuantity(fixedPriceQuantity: Double) =
            fixedPriceQuantity(fixedPriceQuantity as Double?)

        /** The new quantity of the price, if the price is a fixed price. */
        fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
            this.fixedPriceQuantity = fixedPriceQuantity
        }

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for the
         * replacement price.
         */
        @Deprecated("deprecated")
        fun maximumAmount(maximumAmount: String?) =
            maximumAmount(JsonField.ofNullable(maximumAmount))

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for the
         * replacement price.
         */
        @Deprecated("deprecated")
        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
        }

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for the
         * replacement price.
         */
        @Deprecated("deprecated")
        fun minimumAmount(minimumAmount: String?) =
            minimumAmount(JsonField.ofNullable(minimumAmount))

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for the
         * replacement price.
         */
        @Deprecated("deprecated")
        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

        /** The definition of a new price to create and add to the subscription. */
        fun price(price: NewSubscriptionPriceModel?) = price(JsonField.ofNullable(price))

        /** The definition of a new price to create and add to the subscription. */
        fun price(price: JsonField<NewSubscriptionPriceModel>) = apply { this.price = price }

        /** The definition of a new price to create and add to the subscription. */
        fun price(unitPrice: NewSubscriptionPriceModel.NewSubscriptionUnitPrice) =
            price(NewSubscriptionPriceModel.ofUnitPrice(unitPrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(packagePrice: NewSubscriptionPriceModel.NewSubscriptionPackagePrice) =
            price(NewSubscriptionPriceModel.ofPackagePrice(packagePrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(matrixPrice: NewSubscriptionPriceModel.NewSubscriptionMatrixPrice) =
            price(NewSubscriptionPriceModel.ofMatrixPrice(matrixPrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(tieredPrice: NewSubscriptionPriceModel.NewSubscriptionTieredPrice) =
            price(NewSubscriptionPriceModel.ofTieredPrice(tieredPrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(tieredBpsPrice: NewSubscriptionPriceModel.NewSubscriptionTieredBpsPrice) =
            price(NewSubscriptionPriceModel.ofTieredBpsPrice(tieredBpsPrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(bpsPrice: NewSubscriptionPriceModel.NewSubscriptionBpsPrice) =
            price(NewSubscriptionPriceModel.ofBpsPrice(bpsPrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(bulkBpsPrice: NewSubscriptionPriceModel.NewSubscriptionBulkBpsPrice) =
            price(NewSubscriptionPriceModel.ofBulkBpsPrice(bulkBpsPrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(bulkPrice: NewSubscriptionPriceModel.NewSubscriptionBulkPrice) =
            price(NewSubscriptionPriceModel.ofBulkPrice(bulkPrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            thresholdTotalAmountPrice:
                NewSubscriptionPriceModel.NewSubscriptionThresholdTotalAmountPrice
        ) = price(NewSubscriptionPriceModel.ofThresholdTotalAmountPrice(thresholdTotalAmountPrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(tieredPackagePrice: NewSubscriptionPriceModel.NewSubscriptionTieredPackagePrice) =
            price(NewSubscriptionPriceModel.ofTieredPackagePrice(tieredPackagePrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            tieredWithMinimumPrice: NewSubscriptionPriceModel.NewSubscriptionTieredWithMinimumPrice
        ) = price(NewSubscriptionPriceModel.ofTieredWithMinimumPrice(tieredWithMinimumPrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            unitWithPercentPrice: NewSubscriptionPriceModel.NewSubscriptionUnitWithPercentPrice
        ) = price(NewSubscriptionPriceModel.ofUnitWithPercentPrice(unitWithPercentPrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            packageWithAllocationPrice:
                NewSubscriptionPriceModel.NewSubscriptionPackageWithAllocationPrice
        ) =
            price(
                NewSubscriptionPriceModel.ofPackageWithAllocationPrice(packageWithAllocationPrice)
            )

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            tierWithProrationPrice: NewSubscriptionPriceModel.NewSubscriptionTierWithProrationPrice
        ) = price(NewSubscriptionPriceModel.ofTierWithProrationPrice(tierWithProrationPrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            unitWithProrationPrice: NewSubscriptionPriceModel.NewSubscriptionUnitWithProrationPrice
        ) = price(NewSubscriptionPriceModel.ofUnitWithProrationPrice(unitWithProrationPrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            groupedAllocationPrice: NewSubscriptionPriceModel.NewSubscriptionGroupedAllocationPrice
        ) = price(NewSubscriptionPriceModel.ofGroupedAllocationPrice(groupedAllocationPrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            groupedWithProratedMinimumPrice:
                NewSubscriptionPriceModel.NewSubscriptionGroupedWithProratedMinimumPrice
        ) =
            price(
                NewSubscriptionPriceModel.ofGroupedWithProratedMinimumPrice(
                    groupedWithProratedMinimumPrice
                )
            )

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            bulkWithProrationPrice: NewSubscriptionPriceModel.NewSubscriptionBulkWithProrationPrice
        ) = price(NewSubscriptionPriceModel.ofBulkWithProrationPrice(bulkWithProrationPrice))

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            scalableMatrixWithUnitPricingPrice:
                NewSubscriptionPriceModel.NewSubscriptionScalableMatrixWithUnitPricingPrice
        ) =
            price(
                NewSubscriptionPriceModel.ofScalableMatrixWithUnitPricingPrice(
                    scalableMatrixWithUnitPricingPrice
                )
            )

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            scalableMatrixWithTieredPricingPrice:
                NewSubscriptionPriceModel.NewSubscriptionScalableMatrixWithTieredPricingPrice
        ) =
            price(
                NewSubscriptionPriceModel.ofScalableMatrixWithTieredPricingPrice(
                    scalableMatrixWithTieredPricingPrice
                )
            )

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            cumulativeGroupedBulkPrice:
                NewSubscriptionPriceModel.NewSubscriptionCumulativeGroupedBulkPrice
        ) =
            price(
                NewSubscriptionPriceModel.ofCumulativeGroupedBulkPrice(cumulativeGroupedBulkPrice)
            )

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            maxGroupTieredPackagePrice:
                NewSubscriptionPriceModel.NewSubscriptionMaxGroupTieredPackagePrice
        ) =
            price(
                NewSubscriptionPriceModel.ofMaxGroupTieredPackagePrice(maxGroupTieredPackagePrice)
            )

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            groupedWithMeteredMinimumPrice:
                NewSubscriptionPriceModel.NewSubscriptionGroupedWithMeteredMinimumPrice
        ) =
            price(
                NewSubscriptionPriceModel.ofGroupedWithMeteredMinimumPrice(
                    groupedWithMeteredMinimumPrice
                )
            )

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            matrixWithDisplayNamePrice:
                NewSubscriptionPriceModel.NewSubscriptionMatrixWithDisplayNamePrice
        ) =
            price(
                NewSubscriptionPriceModel.ofMatrixWithDisplayNamePrice(matrixWithDisplayNamePrice)
            )

        /** The definition of a new price to create and add to the subscription. */
        fun price(
            groupedTieredPackagePrice:
                NewSubscriptionPriceModel.NewSubscriptionGroupedTieredPackagePrice
        ) = price(NewSubscriptionPriceModel.ofGroupedTieredPackagePrice(groupedTieredPackagePrice))

        /** The id of the price to add to the subscription. */
        fun priceId(priceId: String?) = priceId(JsonField.ofNullable(priceId))

        /** The id of the price to add to the subscription. */
        fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

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

        fun build(): ReplaceSubscriptionPriceParams =
            ReplaceSubscriptionPriceParams(
                checkRequired("replacesPriceId", replacesPriceId),
                allocationPrice,
                (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                externalPriceId,
                fixedPriceQuantity,
                maximumAmount,
                minimumAmount,
                price,
                priceId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReplaceSubscriptionPriceParams && replacesPriceId == other.replacesPriceId && allocationPrice == other.allocationPrice && discounts == other.discounts && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && maximumAmount == other.maximumAmount && minimumAmount == other.minimumAmount && price == other.price && priceId == other.priceId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(replacesPriceId, allocationPrice, discounts, externalPriceId, fixedPriceQuantity, maximumAmount, minimumAmount, price, priceId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReplaceSubscriptionPriceParams{replacesPriceId=$replacesPriceId, allocationPrice=$allocationPrice, discounts=$discounts, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, maximumAmount=$maximumAmount, minimumAmount=$minimumAmount, price=$price, priceId=$priceId, additionalProperties=$additionalProperties}"
}
