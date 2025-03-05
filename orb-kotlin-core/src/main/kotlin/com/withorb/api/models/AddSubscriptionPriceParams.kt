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
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class AddSubscriptionPriceParams
@JsonCreator
private constructor(
    @JsonProperty("allocation_price")
    @ExcludeMissing
    private val allocationPrice: JsonField<NewAllocationPriceModel> = JsonMissing.of(),
    @JsonProperty("discounts")
    @ExcludeMissing
    private val discounts: JsonField<List<DiscountOverrideModel>> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("external_price_id")
    @ExcludeMissing
    private val externalPriceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    private val maximumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    private val minimumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("plan_phase_order")
    @ExcludeMissing
    private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("price")
    @ExcludeMissing
    private val price: JsonField<NewSubscriptionPriceModel> = JsonMissing.of(),
    @JsonProperty("price_id")
    @ExcludeMissing
    private val priceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The definition of a new allocation price to create and add to the subscription. */
    fun allocationPrice(): NewAllocationPriceModel? =
        allocationPrice.getNullable("allocation_price")

    /** [DEPRECATED] Use add_adjustments instead. The subscription's discounts for this price. */
    @Deprecated("deprecated")
    fun discounts(): List<DiscountOverrideModel>? = discounts.getNullable("discounts")

    /**
     * The end date of the price interval. This is the date that the price will stop billing on the
     * subscription. If null, billing will end when the phase or subscription ends.
     */
    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    /** The external price id of the price to add to the subscription. */
    fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

    /**
     * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for this price.
     */
    @Deprecated("deprecated")
    fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

    /**
     * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for this price.
     */
    @Deprecated("deprecated")
    fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

    /** The phase to add this price to. */
    fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

    /** The definition of a new price to create and add to the subscription. */
    fun price(): NewSubscriptionPriceModel? = price.getNullable("price")

    /** The id of the price to add to the subscription. */
    fun priceId(): String? = priceId.getNullable("price_id")

    /**
     * The start date of the price interval. This is the date that the price will start billing on
     * the subscription. If null, billing will start when the phase or subscription starts.
     */
    fun startDate(): OffsetDateTime? = startDate.getNullable("start_date")

    /** The definition of a new allocation price to create and add to the subscription. */
    @JsonProperty("allocation_price")
    @ExcludeMissing
    fun _allocationPrice(): JsonField<NewAllocationPriceModel> = allocationPrice

    /** [DEPRECATED] Use add_adjustments instead. The subscription's discounts for this price. */
    @Deprecated("deprecated")
    @JsonProperty("discounts")
    @ExcludeMissing
    fun _discounts(): JsonField<List<DiscountOverrideModel>> = discounts

    /**
     * The end date of the price interval. This is the date that the price will stop billing on the
     * subscription. If null, billing will end when the phase or subscription ends.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /** The external price id of the price to add to the subscription. */
    @JsonProperty("external_price_id")
    @ExcludeMissing
    fun _externalPriceId(): JsonField<String> = externalPriceId

    /**
     * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for this price.
     */
    @Deprecated("deprecated")
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    fun _maximumAmount(): JsonField<String> = maximumAmount

    /**
     * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for this price.
     */
    @Deprecated("deprecated")
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    fun _minimumAmount(): JsonField<String> = minimumAmount

    /** The phase to add this price to. */
    @JsonProperty("plan_phase_order")
    @ExcludeMissing
    fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

    /** The definition of a new price to create and add to the subscription. */
    @JsonProperty("price")
    @ExcludeMissing
    fun _price(): JsonField<NewSubscriptionPriceModel> = price

    /** The id of the price to add to the subscription. */
    @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

    /**
     * The start date of the price interval. This is the date that the price will start billing on
     * the subscription. If null, billing will start when the phase or subscription starts.
     */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AddSubscriptionPriceParams = apply {
        if (validated) {
            return@apply
        }

        allocationPrice()?.validate()
        discounts()?.forEach { it.validate() }
        endDate()
        externalPriceId()
        maximumAmount()
        minimumAmount()
        planPhaseOrder()
        price()?.validate()
        priceId()
        startDate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AddSubscriptionPriceParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [AddSubscriptionPriceParams]. */
    class Builder internal constructor() {

        private var allocationPrice: JsonField<NewAllocationPriceModel> = JsonMissing.of()
        private var discounts: JsonField<MutableList<DiscountOverrideModel>>? = null
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalPriceId: JsonField<String> = JsonMissing.of()
        private var maximumAmount: JsonField<String> = JsonMissing.of()
        private var minimumAmount: JsonField<String> = JsonMissing.of()
        private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
        private var price: JsonField<NewSubscriptionPriceModel> = JsonMissing.of()
        private var priceId: JsonField<String> = JsonMissing.of()
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(addSubscriptionPriceParams: AddSubscriptionPriceParams) = apply {
            allocationPrice = addSubscriptionPriceParams.allocationPrice
            discounts = addSubscriptionPriceParams.discounts.map { it.toMutableList() }
            endDate = addSubscriptionPriceParams.endDate
            externalPriceId = addSubscriptionPriceParams.externalPriceId
            maximumAmount = addSubscriptionPriceParams.maximumAmount
            minimumAmount = addSubscriptionPriceParams.minimumAmount
            planPhaseOrder = addSubscriptionPriceParams.planPhaseOrder
            price = addSubscriptionPriceParams.price
            priceId = addSubscriptionPriceParams.priceId
            startDate = addSubscriptionPriceParams.startDate
            additionalProperties = addSubscriptionPriceParams.additionalProperties.toMutableMap()
        }

        /** The definition of a new allocation price to create and add to the subscription. */
        fun allocationPrice(allocationPrice: NewAllocationPriceModel?) =
            allocationPrice(JsonField.ofNullable(allocationPrice))

        /** The definition of a new allocation price to create and add to the subscription. */
        fun allocationPrice(allocationPrice: JsonField<NewAllocationPriceModel>) = apply {
            this.allocationPrice = allocationPrice
        }

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for this price.
         */
        @Deprecated("deprecated")
        fun discounts(discounts: List<DiscountOverrideModel>?) =
            discounts(JsonField.ofNullable(discounts))

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for this price.
         */
        @Deprecated("deprecated")
        fun discounts(discounts: JsonField<List<DiscountOverrideModel>>) = apply {
            this.discounts = discounts.map { it.toMutableList() }
        }

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for this price.
         */
        @Deprecated("deprecated")
        fun addDiscount(discount: DiscountOverrideModel) = apply {
            discounts =
                (discounts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("discounts", it).add(discount)
                }
        }

        /**
         * The end date of the price interval. This is the date that the price will stop billing on
         * the subscription. If null, billing will end when the phase or subscription ends.
         */
        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /**
         * The end date of the price interval. This is the date that the price will stop billing on
         * the subscription. If null, billing will end when the phase or subscription ends.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** The external price id of the price to add to the subscription. */
        fun externalPriceId(externalPriceId: String?) =
            externalPriceId(JsonField.ofNullable(externalPriceId))

        /** The external price id of the price to add to the subscription. */
        fun externalPriceId(externalPriceId: JsonField<String>) = apply {
            this.externalPriceId = externalPriceId
        }

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for this
         * price.
         */
        @Deprecated("deprecated")
        fun maximumAmount(maximumAmount: String?) =
            maximumAmount(JsonField.ofNullable(maximumAmount))

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for this
         * price.
         */
        @Deprecated("deprecated")
        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
        }

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for this
         * price.
         */
        @Deprecated("deprecated")
        fun minimumAmount(minimumAmount: String?) =
            minimumAmount(JsonField.ofNullable(minimumAmount))

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for this
         * price.
         */
        @Deprecated("deprecated")
        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

        /** The phase to add this price to. */
        fun planPhaseOrder(planPhaseOrder: Long?) =
            planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

        /** The phase to add this price to. */
        fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

        /** The phase to add this price to. */
        fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
            this.planPhaseOrder = planPhaseOrder
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

        /**
         * The start date of the price interval. This is the date that the price will start billing
         * on the subscription. If null, billing will start when the phase or subscription starts.
         */
        fun startDate(startDate: OffsetDateTime?) = startDate(JsonField.ofNullable(startDate))

        /**
         * The start date of the price interval. This is the date that the price will start billing
         * on the subscription. If null, billing will start when the phase or subscription starts.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

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

        fun build(): AddSubscriptionPriceParams =
            AddSubscriptionPriceParams(
                allocationPrice,
                (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                endDate,
                externalPriceId,
                maximumAmount,
                minimumAmount,
                planPhaseOrder,
                price,
                priceId,
                startDate,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AddSubscriptionPriceParams && allocationPrice == other.allocationPrice && discounts == other.discounts && endDate == other.endDate && externalPriceId == other.externalPriceId && maximumAmount == other.maximumAmount && minimumAmount == other.minimumAmount && planPhaseOrder == other.planPhaseOrder && price == other.price && priceId == other.priceId && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(allocationPrice, discounts, endDate, externalPriceId, maximumAmount, minimumAmount, planPhaseOrder, price, priceId, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AddSubscriptionPriceParams{allocationPrice=$allocationPrice, discounts=$discounts, endDate=$endDate, externalPriceId=$externalPriceId, maximumAmount=$maximumAmount, minimumAmount=$minimumAmount, planPhaseOrder=$planPhaseOrder, price=$price, priceId=$priceId, startDate=$startDate, additionalProperties=$additionalProperties}"
}
