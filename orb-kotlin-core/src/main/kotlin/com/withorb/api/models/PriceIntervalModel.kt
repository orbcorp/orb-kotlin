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

/**
 * The Price Interval resource represents a period of time for which a price will bill on a
 * subscription. A subscription’s price intervals define its billing behavior.
 */
@NoAutoDetect
class PriceIntervalModel
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("billing_cycle_day")
    @ExcludeMissing
    private val billingCycleDay: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("current_billing_period_end_date")
    @ExcludeMissing
    private val currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("current_billing_period_start_date")
    @ExcludeMissing
    private val currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("filter")
    @ExcludeMissing
    private val filter: JsonField<String> = JsonMissing.of(),
    @JsonProperty("fixed_fee_quantity_transitions")
    @ExcludeMissing
    private val fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>> =
        JsonMissing.of(),
    @JsonProperty("price")
    @ExcludeMissing
    private val price: JsonField<PriceModel> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("usage_customer_ids")
    @ExcludeMissing
    private val usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** The day of the month that Orb bills for this price */
    fun billingCycleDay(): Long = billingCycleDay.getRequired("billing_cycle_day")

    /**
     * The end of the current billing period. This is an exclusive timestamp, such that the instant
     * returned is exactly the end of the billing period. Set to null if this price interval is not
     * currently active.
     */
    fun currentBillingPeriodEndDate(): OffsetDateTime? =
        currentBillingPeriodEndDate.getNullable("current_billing_period_end_date")

    /**
     * The start date of the current billing period. This is an inclusive timestamp; the instant
     * returned is exactly the beginning of the billing period. Set to null if this price interval
     * is not currently active.
     */
    fun currentBillingPeriodStartDate(): OffsetDateTime? =
        currentBillingPeriodStartDate.getNullable("current_billing_period_start_date")

    /**
     * The end date of the price interval. This is the date that Orb stops billing for this price.
     */
    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    /** An additional filter to apply to usage queries. */
    fun filter(): String? = filter.getNullable("filter")

    /**
     * The fixed fee quantity transitions for this price interval. This is only relevant for fixed
     * fees.
     */
    fun fixedFeeQuantityTransitions(): List<FixedFeeQuantityTransition>? =
        fixedFeeQuantityTransitions.getNullable("fixed_fee_quantity_transitions")

    /**
     * The Price resource represents a price that can be billed on a subscription, resulting in a
     * charge on an invoice in the form of an invoice line item. Prices take a quantity and
     * determine an amount to bill.
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given Price object. The model_type field determines the key for
     * the configuration object that is present.
     *
     * For more on the types of prices, see
     * [the core concepts documentation](/core-concepts#plan-and-price)
     */
    fun price(): PriceModel = price.getRequired("price")

    /**
     * The start date of the price interval. This is the date that Orb starts billing for this
     * price.
     */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /**
     * A list of customer IDs whose usage events will be aggregated and billed under this price
     * interval.
     */
    fun usageCustomerIds(): List<String>? = usageCustomerIds.getNullable("usage_customer_ids")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The day of the month that Orb bills for this price */
    @JsonProperty("billing_cycle_day")
    @ExcludeMissing
    fun _billingCycleDay(): JsonField<Long> = billingCycleDay

    /**
     * The end of the current billing period. This is an exclusive timestamp, such that the instant
     * returned is exactly the end of the billing period. Set to null if this price interval is not
     * currently active.
     */
    @JsonProperty("current_billing_period_end_date")
    @ExcludeMissing
    fun _currentBillingPeriodEndDate(): JsonField<OffsetDateTime> = currentBillingPeriodEndDate

    /**
     * The start date of the current billing period. This is an inclusive timestamp; the instant
     * returned is exactly the beginning of the billing period. Set to null if this price interval
     * is not currently active.
     */
    @JsonProperty("current_billing_period_start_date")
    @ExcludeMissing
    fun _currentBillingPeriodStartDate(): JsonField<OffsetDateTime> = currentBillingPeriodStartDate

    /**
     * The end date of the price interval. This is the date that Orb stops billing for this price.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /** An additional filter to apply to usage queries. */
    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

    /**
     * The fixed fee quantity transitions for this price interval. This is only relevant for fixed
     * fees.
     */
    @JsonProperty("fixed_fee_quantity_transitions")
    @ExcludeMissing
    fun _fixedFeeQuantityTransitions(): JsonField<List<FixedFeeQuantityTransition>> =
        fixedFeeQuantityTransitions

    /**
     * The Price resource represents a price that can be billed on a subscription, resulting in a
     * charge on an invoice in the form of an invoice line item. Prices take a quantity and
     * determine an amount to bill.
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given Price object. The model_type field determines the key for
     * the configuration object that is present.
     *
     * For more on the types of prices, see
     * [the core concepts documentation](/core-concepts#plan-and-price)
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<PriceModel> = price

    /**
     * The start date of the price interval. This is the date that Orb starts billing for this
     * price.
     */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * A list of customer IDs whose usage events will be aggregated and billed under this price
     * interval.
     */
    @JsonProperty("usage_customer_ids")
    @ExcludeMissing
    fun _usageCustomerIds(): JsonField<List<String>> = usageCustomerIds

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PriceIntervalModel = apply {
        if (validated) {
            return@apply
        }

        id()
        billingCycleDay()
        currentBillingPeriodEndDate()
        currentBillingPeriodStartDate()
        endDate()
        filter()
        fixedFeeQuantityTransitions()?.forEach { it.validate() }
        price().validate()
        startDate()
        usageCustomerIds()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PriceIntervalModel].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .billingCycleDay()
         * .currentBillingPeriodEndDate()
         * .currentBillingPeriodStartDate()
         * .endDate()
         * .filter()
         * .fixedFeeQuantityTransitions()
         * .price()
         * .startDate()
         * .usageCustomerIds()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PriceIntervalModel]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var billingCycleDay: JsonField<Long>? = null
        private var currentBillingPeriodEndDate: JsonField<OffsetDateTime>? = null
        private var currentBillingPeriodStartDate: JsonField<OffsetDateTime>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var filter: JsonField<String>? = null
        private var fixedFeeQuantityTransitions:
            JsonField<MutableList<FixedFeeQuantityTransition>>? =
            null
        private var price: JsonField<PriceModel>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var usageCustomerIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(priceIntervalModel: PriceIntervalModel) = apply {
            id = priceIntervalModel.id
            billingCycleDay = priceIntervalModel.billingCycleDay
            currentBillingPeriodEndDate = priceIntervalModel.currentBillingPeriodEndDate
            currentBillingPeriodStartDate = priceIntervalModel.currentBillingPeriodStartDate
            endDate = priceIntervalModel.endDate
            filter = priceIntervalModel.filter
            fixedFeeQuantityTransitions =
                priceIntervalModel.fixedFeeQuantityTransitions.map { it.toMutableList() }
            price = priceIntervalModel.price
            startDate = priceIntervalModel.startDate
            usageCustomerIds = priceIntervalModel.usageCustomerIds.map { it.toMutableList() }
            additionalProperties = priceIntervalModel.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The day of the month that Orb bills for this price */
        fun billingCycleDay(billingCycleDay: Long) = billingCycleDay(JsonField.of(billingCycleDay))

        /** The day of the month that Orb bills for this price */
        fun billingCycleDay(billingCycleDay: JsonField<Long>) = apply {
            this.billingCycleDay = billingCycleDay
        }

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is exactly the end of the billing period. Set to null if this price
         * interval is not currently active.
         */
        fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: OffsetDateTime?) =
            currentBillingPeriodEndDate(JsonField.ofNullable(currentBillingPeriodEndDate))

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is exactly the end of the billing period. Set to null if this price
         * interval is not currently active.
         */
        fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: JsonField<OffsetDateTime>) =
            apply {
                this.currentBillingPeriodEndDate = currentBillingPeriodEndDate
            }

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if this price
         * interval is not currently active.
         */
        fun currentBillingPeriodStartDate(currentBillingPeriodStartDate: OffsetDateTime?) =
            currentBillingPeriodStartDate(JsonField.ofNullable(currentBillingPeriodStartDate))

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if this price
         * interval is not currently active.
         */
        fun currentBillingPeriodStartDate(
            currentBillingPeriodStartDate: JsonField<OffsetDateTime>
        ) = apply { this.currentBillingPeriodStartDate = currentBillingPeriodStartDate }

        /**
         * The end date of the price interval. This is the date that Orb stops billing for this
         * price.
         */
        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /**
         * The end date of the price interval. This is the date that Orb stops billing for this
         * price.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** An additional filter to apply to usage queries. */
        fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

        /** An additional filter to apply to usage queries. */
        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

        /**
         * The fixed fee quantity transitions for this price interval. This is only relevant for
         * fixed fees.
         */
        fun fixedFeeQuantityTransitions(
            fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>?
        ) = fixedFeeQuantityTransitions(JsonField.ofNullable(fixedFeeQuantityTransitions))

        /**
         * The fixed fee quantity transitions for this price interval. This is only relevant for
         * fixed fees.
         */
        fun fixedFeeQuantityTransitions(
            fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>>
        ) = apply {
            this.fixedFeeQuantityTransitions =
                fixedFeeQuantityTransitions.map { it.toMutableList() }
        }

        /**
         * The fixed fee quantity transitions for this price interval. This is only relevant for
         * fixed fees.
         */
        fun addFixedFeeQuantityTransition(fixedFeeQuantityTransition: FixedFeeQuantityTransition) =
            apply {
                fixedFeeQuantityTransitions =
                    (fixedFeeQuantityTransitions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fixedFeeQuantityTransitions", it)
                            .add(fixedFeeQuantityTransition)
                    }
            }

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(price: PriceModel) = price(JsonField.of(price))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(price: JsonField<PriceModel>) = apply { this.price = price }

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(unitPrice: PriceModel.UnitPrice) = price(PriceModel.ofUnitPrice(unitPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(packagePrice: PriceModel.PackagePrice) =
            price(PriceModel.ofPackagePrice(packagePrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(matrixPrice: PriceModel.MatrixPrice) =
            price(PriceModel.ofMatrixPrice(matrixPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(tieredPrice: PriceModel.TieredPrice) =
            price(PriceModel.ofTieredPrice(tieredPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(tieredBpsPrice: PriceModel.TieredBpsPrice) =
            price(PriceModel.ofTieredBpsPrice(tieredBpsPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(bpsPrice: PriceModel.BpsPrice) = price(PriceModel.ofBpsPrice(bpsPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(bulkBpsPrice: PriceModel.BulkBpsPrice) =
            price(PriceModel.ofBulkBpsPrice(bulkBpsPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(bulkPrice: PriceModel.BulkPrice) = price(PriceModel.ofBulkPrice(bulkPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(thresholdTotalAmountPrice: PriceModel.ThresholdTotalAmountPrice) =
            price(PriceModel.ofThresholdTotalAmountPrice(thresholdTotalAmountPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(tieredPackagePrice: PriceModel.TieredPackagePrice) =
            price(PriceModel.ofTieredPackagePrice(tieredPackagePrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(groupedTieredPrice: PriceModel.GroupedTieredPrice) =
            price(PriceModel.ofGroupedTieredPrice(groupedTieredPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(tieredWithMinimumPrice: PriceModel.TieredWithMinimumPrice) =
            price(PriceModel.ofTieredWithMinimumPrice(tieredWithMinimumPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(tieredPackageWithMinimumPrice: PriceModel.TieredPackageWithMinimumPrice) =
            price(PriceModel.ofTieredPackageWithMinimumPrice(tieredPackageWithMinimumPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(packageWithAllocationPrice: PriceModel.PackageWithAllocationPrice) =
            price(PriceModel.ofPackageWithAllocationPrice(packageWithAllocationPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(unitWithPercentPrice: PriceModel.UnitWithPercentPrice) =
            price(PriceModel.ofUnitWithPercentPrice(unitWithPercentPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(matrixWithAllocationPrice: PriceModel.MatrixWithAllocationPrice) =
            price(PriceModel.ofMatrixWithAllocationPrice(matrixWithAllocationPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(tieredWithProrationPrice: PriceModel.TieredWithProrationPrice) =
            price(PriceModel.ofTieredWithProrationPrice(tieredWithProrationPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(unitWithProrationPrice: PriceModel.UnitWithProrationPrice) =
            price(PriceModel.ofUnitWithProrationPrice(unitWithProrationPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(groupedAllocationPrice: PriceModel.GroupedAllocationPrice) =
            price(PriceModel.ofGroupedAllocationPrice(groupedAllocationPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(groupedWithProratedMinimumPrice: PriceModel.GroupedWithProratedMinimumPrice) =
            price(PriceModel.ofGroupedWithProratedMinimumPrice(groupedWithProratedMinimumPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(groupedWithMeteredMinimumPrice: PriceModel.GroupedWithMeteredMinimumPrice) =
            price(PriceModel.ofGroupedWithMeteredMinimumPrice(groupedWithMeteredMinimumPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(matrixWithDisplayNamePrice: PriceModel.MatrixWithDisplayNamePrice) =
            price(PriceModel.ofMatrixWithDisplayNamePrice(matrixWithDisplayNamePrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(bulkWithProrationPrice: PriceModel.BulkWithProrationPrice) =
            price(PriceModel.ofBulkWithProrationPrice(bulkWithProrationPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(groupedTieredPackagePrice: PriceModel.GroupedTieredPackagePrice) =
            price(PriceModel.ofGroupedTieredPackagePrice(groupedTieredPackagePrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(maxGroupTieredPackagePrice: PriceModel.MaxGroupTieredPackagePrice) =
            price(PriceModel.ofMaxGroupTieredPackagePrice(maxGroupTieredPackagePrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(
            scalableMatrixWithUnitPricingPrice: PriceModel.ScalableMatrixWithUnitPricingPrice
        ) =
            price(
                PriceModel.ofScalableMatrixWithUnitPricingPrice(scalableMatrixWithUnitPricingPrice)
            )

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(
            scalableMatrixWithTieredPricingPrice: PriceModel.ScalableMatrixWithTieredPricingPrice
        ) =
            price(
                PriceModel.ofScalableMatrixWithTieredPricingPrice(
                    scalableMatrixWithTieredPricingPrice
                )
            )

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(cumulativeGroupedBulkPrice: PriceModel.CumulativeGroupedBulkPrice) =
            price(PriceModel.ofCumulativeGroupedBulkPrice(cumulativeGroupedBulkPrice))

        /**
         * The start date of the price interval. This is the date that Orb starts billing for this
         * price.
         */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * The start date of the price interval. This is the date that Orb starts billing for this
         * price.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this price
         * interval.
         */
        fun usageCustomerIds(usageCustomerIds: List<String>?) =
            usageCustomerIds(JsonField.ofNullable(usageCustomerIds))

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this price
         * interval.
         */
        fun usageCustomerIds(usageCustomerIds: JsonField<List<String>>) = apply {
            this.usageCustomerIds = usageCustomerIds.map { it.toMutableList() }
        }

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this price
         * interval.
         */
        fun addUsageCustomerId(usageCustomerId: String) = apply {
            usageCustomerIds =
                (usageCustomerIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("usageCustomerIds", it).add(usageCustomerId)
                }
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

        fun build(): PriceIntervalModel =
            PriceIntervalModel(
                checkRequired("id", id),
                checkRequired("billingCycleDay", billingCycleDay),
                checkRequired("currentBillingPeriodEndDate", currentBillingPeriodEndDate),
                checkRequired("currentBillingPeriodStartDate", currentBillingPeriodStartDate),
                checkRequired("endDate", endDate),
                checkRequired("filter", filter),
                checkRequired("fixedFeeQuantityTransitions", fixedFeeQuantityTransitions).map {
                    it.toImmutable()
                },
                checkRequired("price", price),
                checkRequired("startDate", startDate),
                checkRequired("usageCustomerIds", usageCustomerIds).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class FixedFeeQuantityTransition
    @JsonCreator
    private constructor(
        @JsonProperty("effective_date")
        @ExcludeMissing
        private val effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("price_id")
        @ExcludeMissing
        private val priceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun effectiveDate(): OffsetDateTime = effectiveDate.getRequired("effective_date")

        fun priceId(): String = priceId.getRequired("price_id")

        fun quantity(): Long = quantity.getRequired("quantity")

        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): FixedFeeQuantityTransition = apply {
            if (validated) {
                return@apply
            }

            effectiveDate()
            priceId()
            quantity()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [FixedFeeQuantityTransition].
             *
             * The following fields are required:
             * ```kotlin
             * .effectiveDate()
             * .priceId()
             * .quantity()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [FixedFeeQuantityTransition]. */
        class Builder internal constructor() {

            private var effectiveDate: JsonField<OffsetDateTime>? = null
            private var priceId: JsonField<String>? = null
            private var quantity: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(fixedFeeQuantityTransition: FixedFeeQuantityTransition) = apply {
                effectiveDate = fixedFeeQuantityTransition.effectiveDate
                priceId = fixedFeeQuantityTransition.priceId
                quantity = fixedFeeQuantityTransition.quantity
                additionalProperties =
                    fixedFeeQuantityTransition.additionalProperties.toMutableMap()
            }

            fun effectiveDate(effectiveDate: OffsetDateTime) =
                effectiveDate(JsonField.of(effectiveDate))

            fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
                this.effectiveDate = effectiveDate
            }

            fun priceId(priceId: String) = priceId(JsonField.of(priceId))

            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

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

            fun build(): FixedFeeQuantityTransition =
                FixedFeeQuantityTransition(
                    checkRequired("effectiveDate", effectiveDate),
                    checkRequired("priceId", priceId),
                    checkRequired("quantity", quantity),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FixedFeeQuantityTransition && effectiveDate == other.effectiveDate && priceId == other.priceId && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(effectiveDate, priceId, quantity, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FixedFeeQuantityTransition{effectiveDate=$effectiveDate, priceId=$priceId, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceIntervalModel && id == other.id && billingCycleDay == other.billingCycleDay && currentBillingPeriodEndDate == other.currentBillingPeriodEndDate && currentBillingPeriodStartDate == other.currentBillingPeriodStartDate && endDate == other.endDate && filter == other.filter && fixedFeeQuantityTransitions == other.fixedFeeQuantityTransitions && price == other.price && startDate == other.startDate && usageCustomerIds == other.usageCustomerIds && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, billingCycleDay, currentBillingPeriodEndDate, currentBillingPeriodStartDate, endDate, filter, fixedFeeQuantityTransitions, price, startDate, usageCustomerIds, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PriceIntervalModel{id=$id, billingCycleDay=$billingCycleDay, currentBillingPeriodEndDate=$currentBillingPeriodEndDate, currentBillingPeriodStartDate=$currentBillingPeriodStartDate, endDate=$endDate, filter=$filter, fixedFeeQuantityTransitions=$fixedFeeQuantityTransitions, price=$price, startDate=$startDate, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
}
