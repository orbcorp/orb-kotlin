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
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class AggregatedCostModel
@JsonCreator
private constructor(
    @JsonProperty("per_price_costs")
    @ExcludeMissing
    private val perPriceCosts: JsonField<List<PerPriceCost>> = JsonMissing.of(),
    @JsonProperty("subtotal")
    @ExcludeMissing
    private val subtotal: JsonField<String> = JsonMissing.of(),
    @JsonProperty("timeframe_end")
    @ExcludeMissing
    private val timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("timeframe_start")
    @ExcludeMissing
    private val timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("total") @ExcludeMissing private val total: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun perPriceCosts(): List<PerPriceCost> = perPriceCosts.getRequired("per_price_costs")

    /** Total costs for the timeframe, excluding any minimums and discounts. */
    fun subtotal(): String = subtotal.getRequired("subtotal")

    fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

    fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

    /** Total costs for the timeframe, including any minimums and discounts. */
    fun total(): String = total.getRequired("total")

    @JsonProperty("per_price_costs")
    @ExcludeMissing
    fun _perPriceCosts(): JsonField<List<PerPriceCost>> = perPriceCosts

    /** Total costs for the timeframe, excluding any minimums and discounts. */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

    @JsonProperty("timeframe_end")
    @ExcludeMissing
    fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

    @JsonProperty("timeframe_start")
    @ExcludeMissing
    fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

    /** Total costs for the timeframe, including any minimums and discounts. */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AggregatedCostModel = apply {
        if (validated) {
            return@apply
        }

        perPriceCosts().forEach { it.validate() }
        subtotal()
        timeframeEnd()
        timeframeStart()
        total()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AggregatedCostModel].
         *
         * The following fields are required:
         * ```kotlin
         * .perPriceCosts()
         * .subtotal()
         * .timeframeEnd()
         * .timeframeStart()
         * .total()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AggregatedCostModel]. */
    class Builder internal constructor() {

        private var perPriceCosts: JsonField<MutableList<PerPriceCost>>? = null
        private var subtotal: JsonField<String>? = null
        private var timeframeEnd: JsonField<OffsetDateTime>? = null
        private var timeframeStart: JsonField<OffsetDateTime>? = null
        private var total: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(aggregatedCostModel: AggregatedCostModel) = apply {
            perPriceCosts = aggregatedCostModel.perPriceCosts.map { it.toMutableList() }
            subtotal = aggregatedCostModel.subtotal
            timeframeEnd = aggregatedCostModel.timeframeEnd
            timeframeStart = aggregatedCostModel.timeframeStart
            total = aggregatedCostModel.total
            additionalProperties = aggregatedCostModel.additionalProperties.toMutableMap()
        }

        fun perPriceCosts(perPriceCosts: List<PerPriceCost>) =
            perPriceCosts(JsonField.of(perPriceCosts))

        fun perPriceCosts(perPriceCosts: JsonField<List<PerPriceCost>>) = apply {
            this.perPriceCosts = perPriceCosts.map { it.toMutableList() }
        }

        fun addPerPriceCost(perPriceCost: PerPriceCost) = apply {
            perPriceCosts =
                (perPriceCosts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("perPriceCosts", it).add(perPriceCost)
                }
        }

        /** Total costs for the timeframe, excluding any minimums and discounts. */
        fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

        /** Total costs for the timeframe, excluding any minimums and discounts. */
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

        fun timeframeEnd(timeframeEnd: OffsetDateTime) = timeframeEnd(JsonField.of(timeframeEnd))

        fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
            this.timeframeEnd = timeframeEnd
        }

        fun timeframeStart(timeframeStart: OffsetDateTime) =
            timeframeStart(JsonField.of(timeframeStart))

        fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
            this.timeframeStart = timeframeStart
        }

        /** Total costs for the timeframe, including any minimums and discounts. */
        fun total(total: String) = total(JsonField.of(total))

        /** Total costs for the timeframe, including any minimums and discounts. */
        fun total(total: JsonField<String>) = apply { this.total = total }

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

        fun build(): AggregatedCostModel =
            AggregatedCostModel(
                checkRequired("perPriceCosts", perPriceCosts).map { it.toImmutable() },
                checkRequired("subtotal", subtotal),
                checkRequired("timeframeEnd", timeframeEnd),
                checkRequired("timeframeStart", timeframeStart),
                checkRequired("total", total),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class PerPriceCost
    @JsonCreator
    private constructor(
        @JsonProperty("price")
        @ExcludeMissing
        private val price: JsonField<PriceModel> = JsonMissing.of(),
        @JsonProperty("price_id")
        @ExcludeMissing
        private val priceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subtotal")
        @ExcludeMissing
        private val subtotal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total")
        @ExcludeMissing
        private val total: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The price object */
        fun price(): PriceModel = price.getRequired("price")

        /** The price the cost is associated with */
        fun priceId(): String = priceId.getRequired("price_id")

        /** Price's contributions for the timeframe, excluding any minimums and discounts. */
        fun subtotal(): String = subtotal.getRequired("subtotal")

        /** Price's contributions for the timeframe, including minimums and discounts. */
        fun total(): String = total.getRequired("total")

        /** The price's quantity for the timeframe */
        fun quantity(): Double? = quantity.getNullable("quantity")

        /** The price object */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<PriceModel> = price

        /** The price the cost is associated with */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

        /** Price's contributions for the timeframe, excluding any minimums and discounts. */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

        /** Price's contributions for the timeframe, including minimums and discounts. */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

        /** The price's quantity for the timeframe */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PerPriceCost = apply {
            if (validated) {
                return@apply
            }

            price().validate()
            priceId()
            subtotal()
            total()
            quantity()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [PerPriceCost].
             *
             * The following fields are required:
             * ```kotlin
             * .price()
             * .priceId()
             * .subtotal()
             * .total()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PerPriceCost]. */
        class Builder internal constructor() {

            private var price: JsonField<PriceModel>? = null
            private var priceId: JsonField<String>? = null
            private var subtotal: JsonField<String>? = null
            private var total: JsonField<String>? = null
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(perPriceCost: PerPriceCost) = apply {
                price = perPriceCost.price
                priceId = perPriceCost.priceId
                subtotal = perPriceCost.subtotal
                total = perPriceCost.total
                quantity = perPriceCost.quantity
                additionalProperties = perPriceCost.additionalProperties.toMutableMap()
            }

            /** The price object */
            fun price(price: PriceModel) = price(JsonField.of(price))

            /** The price object */
            fun price(price: JsonField<PriceModel>) = apply { this.price = price }

            /** The price object */
            fun price(unitPrice: PriceModel.UnitPrice) = price(PriceModel.ofUnitPrice(unitPrice))

            /** The price object */
            fun price(packagePrice: PriceModel.PackagePrice) =
                price(PriceModel.ofPackagePrice(packagePrice))

            /** The price object */
            fun price(matrixPrice: PriceModel.MatrixPrice) =
                price(PriceModel.ofMatrixPrice(matrixPrice))

            /** The price object */
            fun price(tieredPrice: PriceModel.TieredPrice) =
                price(PriceModel.ofTieredPrice(tieredPrice))

            /** The price object */
            fun price(tieredBpsPrice: PriceModel.TieredBpsPrice) =
                price(PriceModel.ofTieredBpsPrice(tieredBpsPrice))

            /** The price object */
            fun price(bpsPrice: PriceModel.BpsPrice) = price(PriceModel.ofBpsPrice(bpsPrice))

            /** The price object */
            fun price(bulkBpsPrice: PriceModel.BulkBpsPrice) =
                price(PriceModel.ofBulkBpsPrice(bulkBpsPrice))

            /** The price object */
            fun price(bulkPrice: PriceModel.BulkPrice) = price(PriceModel.ofBulkPrice(bulkPrice))

            /** The price object */
            fun price(thresholdTotalAmountPrice: PriceModel.ThresholdTotalAmountPrice) =
                price(PriceModel.ofThresholdTotalAmountPrice(thresholdTotalAmountPrice))

            /** The price object */
            fun price(tieredPackagePrice: PriceModel.TieredPackagePrice) =
                price(PriceModel.ofTieredPackagePrice(tieredPackagePrice))

            /** The price object */
            fun price(groupedTieredPrice: PriceModel.GroupedTieredPrice) =
                price(PriceModel.ofGroupedTieredPrice(groupedTieredPrice))

            /** The price object */
            fun price(tieredWithMinimumPrice: PriceModel.TieredWithMinimumPrice) =
                price(PriceModel.ofTieredWithMinimumPrice(tieredWithMinimumPrice))

            /** The price object */
            fun price(tieredPackageWithMinimumPrice: PriceModel.TieredPackageWithMinimumPrice) =
                price(PriceModel.ofTieredPackageWithMinimumPrice(tieredPackageWithMinimumPrice))

            /** The price object */
            fun price(packageWithAllocationPrice: PriceModel.PackageWithAllocationPrice) =
                price(PriceModel.ofPackageWithAllocationPrice(packageWithAllocationPrice))

            /** The price object */
            fun price(unitWithPercentPrice: PriceModel.UnitWithPercentPrice) =
                price(PriceModel.ofUnitWithPercentPrice(unitWithPercentPrice))

            /** The price object */
            fun price(matrixWithAllocationPrice: PriceModel.MatrixWithAllocationPrice) =
                price(PriceModel.ofMatrixWithAllocationPrice(matrixWithAllocationPrice))

            /** The price object */
            fun price(tieredWithProrationPrice: PriceModel.TieredWithProrationPrice) =
                price(PriceModel.ofTieredWithProrationPrice(tieredWithProrationPrice))

            /** The price object */
            fun price(unitWithProrationPrice: PriceModel.UnitWithProrationPrice) =
                price(PriceModel.ofUnitWithProrationPrice(unitWithProrationPrice))

            /** The price object */
            fun price(groupedAllocationPrice: PriceModel.GroupedAllocationPrice) =
                price(PriceModel.ofGroupedAllocationPrice(groupedAllocationPrice))

            /** The price object */
            fun price(groupedWithProratedMinimumPrice: PriceModel.GroupedWithProratedMinimumPrice) =
                price(PriceModel.ofGroupedWithProratedMinimumPrice(groupedWithProratedMinimumPrice))

            /** The price object */
            fun price(groupedWithMeteredMinimumPrice: PriceModel.GroupedWithMeteredMinimumPrice) =
                price(PriceModel.ofGroupedWithMeteredMinimumPrice(groupedWithMeteredMinimumPrice))

            /** The price object */
            fun price(matrixWithDisplayNamePrice: PriceModel.MatrixWithDisplayNamePrice) =
                price(PriceModel.ofMatrixWithDisplayNamePrice(matrixWithDisplayNamePrice))

            /** The price object */
            fun price(bulkWithProrationPrice: PriceModel.BulkWithProrationPrice) =
                price(PriceModel.ofBulkWithProrationPrice(bulkWithProrationPrice))

            /** The price object */
            fun price(groupedTieredPackagePrice: PriceModel.GroupedTieredPackagePrice) =
                price(PriceModel.ofGroupedTieredPackagePrice(groupedTieredPackagePrice))

            /** The price object */
            fun price(maxGroupTieredPackagePrice: PriceModel.MaxGroupTieredPackagePrice) =
                price(PriceModel.ofMaxGroupTieredPackagePrice(maxGroupTieredPackagePrice))

            /** The price object */
            fun price(
                scalableMatrixWithUnitPricingPrice: PriceModel.ScalableMatrixWithUnitPricingPrice
            ) =
                price(
                    PriceModel.ofScalableMatrixWithUnitPricingPrice(
                        scalableMatrixWithUnitPricingPrice
                    )
                )

            /** The price object */
            fun price(
                scalableMatrixWithTieredPricingPrice:
                    PriceModel.ScalableMatrixWithTieredPricingPrice
            ) =
                price(
                    PriceModel.ofScalableMatrixWithTieredPricingPrice(
                        scalableMatrixWithTieredPricingPrice
                    )
                )

            /** The price object */
            fun price(cumulativeGroupedBulkPrice: PriceModel.CumulativeGroupedBulkPrice) =
                price(PriceModel.ofCumulativeGroupedBulkPrice(cumulativeGroupedBulkPrice))

            /** The price the cost is associated with */
            fun priceId(priceId: String) = priceId(JsonField.of(priceId))

            /** The price the cost is associated with */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            /** Price's contributions for the timeframe, excluding any minimums and discounts. */
            fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

            /** Price's contributions for the timeframe, excluding any minimums and discounts. */
            fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

            /** Price's contributions for the timeframe, including minimums and discounts. */
            fun total(total: String) = total(JsonField.of(total))

            /** Price's contributions for the timeframe, including minimums and discounts. */
            fun total(total: JsonField<String>) = apply { this.total = total }

            /** The price's quantity for the timeframe */
            fun quantity(quantity: Double?) = quantity(JsonField.ofNullable(quantity))

            /** The price's quantity for the timeframe */
            fun quantity(quantity: Double) = quantity(quantity as Double?)

            /** The price's quantity for the timeframe */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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

            fun build(): PerPriceCost =
                PerPriceCost(
                    checkRequired("price", price),
                    checkRequired("priceId", priceId),
                    checkRequired("subtotal", subtotal),
                    checkRequired("total", total),
                    quantity,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PerPriceCost && price == other.price && priceId == other.priceId && subtotal == other.subtotal && total == other.total && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(price, priceId, subtotal, total, quantity, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PerPriceCost{price=$price, priceId=$priceId, subtotal=$subtotal, total=$total, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AggregatedCostModel && perPriceCosts == other.perPriceCosts && subtotal == other.subtotal && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && total == other.total && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(perPriceCosts, subtotal, timeframeEnd, timeframeStart, total, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AggregatedCostModel{perPriceCosts=$perPriceCosts, subtotal=$subtotal, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, total=$total, additionalProperties=$additionalProperties}"
}
