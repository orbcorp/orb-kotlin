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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * The Price Interval resource represents a period of time for which a price will bill on a
 * subscription. A subscription’s price intervals define its billing behavior.
 */
class PriceInterval
private constructor(
    private val id: JsonField<String>,
    private val billingCycleDay: JsonField<Long>,
    private val currentBillingPeriodEndDate: JsonField<OffsetDateTime>,
    private val currentBillingPeriodStartDate: JsonField<OffsetDateTime>,
    private val endDate: JsonField<OffsetDateTime>,
    private val filter: JsonField<String>,
    private val fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>>,
    private val price: JsonField<Price>,
    private val startDate: JsonField<OffsetDateTime>,
    private val usageCustomerIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_cycle_day")
        @ExcludeMissing
        billingCycleDay: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("current_billing_period_end_date")
        @ExcludeMissing
        currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("current_billing_period_start_date")
        @ExcludeMissing
        currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        billingCycleDay,
        currentBillingPeriodEndDate,
        currentBillingPeriodStartDate,
        endDate,
        filter,
        fixedFeeQuantityTransitions,
        price,
        startDate,
        usageCustomerIds,
        mutableMapOf(),
    )

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The day of the month that Orb bills for this price
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingCycleDay(): Long = billingCycleDay.getRequired("billing_cycle_day")

    /**
     * The end of the current billing period. This is an exclusive timestamp, such that the instant
     * returned is exactly the end of the billing period. Set to null if this price interval is not
     * currently active.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currentBillingPeriodEndDate(): OffsetDateTime? =
        currentBillingPeriodEndDate.getNullable("current_billing_period_end_date")

    /**
     * The start date of the current billing period. This is an inclusive timestamp; the instant
     * returned is exactly the beginning of the billing period. Set to null if this price interval
     * is not currently active.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currentBillingPeriodStartDate(): OffsetDateTime? =
        currentBillingPeriodStartDate.getNullable("current_billing_period_start_date")

    /**
     * The end date of the price interval. This is the date that Orb stops billing for this price.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    /**
     * An additional filter to apply to usage queries.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun filter(): String? = filter.getNullable("filter")

    /**
     * The fixed fee quantity transitions for this price interval. This is only relevant for fixed
     * fees.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
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
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun price(): Price = price.getRequired("price")

    /**
     * The start date of the price interval. This is the date that Orb starts billing for this
     * price.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /**
     * A list of customer IDs whose usage events will be aggregated and billed under this price
     * interval.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun usageCustomerIds(): List<String>? = usageCustomerIds.getNullable("usage_customer_ids")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [billingCycleDay].
     *
     * Unlike [billingCycleDay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_cycle_day")
    @ExcludeMissing
    fun _billingCycleDay(): JsonField<Long> = billingCycleDay

    /**
     * Returns the raw JSON value of [currentBillingPeriodEndDate].
     *
     * Unlike [currentBillingPeriodEndDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("current_billing_period_end_date")
    @ExcludeMissing
    fun _currentBillingPeriodEndDate(): JsonField<OffsetDateTime> = currentBillingPeriodEndDate

    /**
     * Returns the raw JSON value of [currentBillingPeriodStartDate].
     *
     * Unlike [currentBillingPeriodStartDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("current_billing_period_start_date")
    @ExcludeMissing
    fun _currentBillingPeriodStartDate(): JsonField<OffsetDateTime> = currentBillingPeriodStartDate

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

    /**
     * Returns the raw JSON value of [fixedFeeQuantityTransitions].
     *
     * Unlike [fixedFeeQuantityTransitions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("fixed_fee_quantity_transitions")
    @ExcludeMissing
    fun _fixedFeeQuantityTransitions(): JsonField<List<FixedFeeQuantityTransition>> =
        fixedFeeQuantityTransitions

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * Returns the raw JSON value of [usageCustomerIds].
     *
     * Unlike [usageCustomerIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("usage_customer_ids")
    @ExcludeMissing
    fun _usageCustomerIds(): JsonField<List<String>> = usageCustomerIds

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
         * Returns a mutable builder for constructing an instance of [PriceInterval].
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

    /** A builder for [PriceInterval]. */
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
        private var price: JsonField<Price>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var usageCustomerIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(priceInterval: PriceInterval) = apply {
            id = priceInterval.id
            billingCycleDay = priceInterval.billingCycleDay
            currentBillingPeriodEndDate = priceInterval.currentBillingPeriodEndDate
            currentBillingPeriodStartDate = priceInterval.currentBillingPeriodStartDate
            endDate = priceInterval.endDate
            filter = priceInterval.filter
            fixedFeeQuantityTransitions =
                priceInterval.fixedFeeQuantityTransitions.map { it.toMutableList() }
            price = priceInterval.price
            startDate = priceInterval.startDate
            usageCustomerIds = priceInterval.usageCustomerIds.map { it.toMutableList() }
            additionalProperties = priceInterval.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The day of the month that Orb bills for this price */
        fun billingCycleDay(billingCycleDay: Long) = billingCycleDay(JsonField.of(billingCycleDay))

        /**
         * Sets [Builder.billingCycleDay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCycleDay] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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
         * Sets [Builder.currentBillingPeriodEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentBillingPeriodEndDate] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
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
         * Sets [Builder.currentBillingPeriodStartDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentBillingPeriodStartDate] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
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
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** An additional filter to apply to usage queries. */
        fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

        /**
         * The fixed fee quantity transitions for this price interval. This is only relevant for
         * fixed fees.
         */
        fun fixedFeeQuantityTransitions(
            fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>?
        ) = fixedFeeQuantityTransitions(JsonField.ofNullable(fixedFeeQuantityTransitions))

        /**
         * Sets [Builder.fixedFeeQuantityTransitions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fixedFeeQuantityTransitions] with a well-typed
         * `List<FixedFeeQuantityTransition>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun fixedFeeQuantityTransitions(
            fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>>
        ) = apply {
            this.fixedFeeQuantityTransitions =
                fixedFeeQuantityTransitions.map { it.toMutableList() }
        }

        /**
         * Adds a single [FixedFeeQuantityTransition] to [fixedFeeQuantityTransitions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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
        fun price(price: Price) = price(JsonField.of(price))

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [Price] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<Price>) = apply { this.price = price }

        /** Alias for calling [price] with `Price.ofUnit(unit)`. */
        fun price(unit: Price.Unit) = price(Price.ofUnit(unit))

        /** Alias for calling [price] with `Price.ofPackage(package_)`. */
        fun price(package_: Price.Package) = price(Price.ofPackage(package_))

        /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
        fun price(matrix: Price.Matrix) = price(Price.ofMatrix(matrix))

        /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
        fun price(tiered: Price.Tiered) = price(Price.ofTiered(tiered))

        /** Alias for calling [price] with `Price.ofTieredBps(tieredBps)`. */
        fun price(tieredBps: Price.TieredBps) = price(Price.ofTieredBps(tieredBps))

        /** Alias for calling [price] with `Price.ofBps(bps)`. */
        fun price(bps: Price.Bps) = price(Price.ofBps(bps))

        /** Alias for calling [price] with `Price.ofBulkBps(bulkBps)`. */
        fun price(bulkBps: Price.BulkBps) = price(Price.ofBulkBps(bulkBps))

        /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
        fun price(bulk: Price.Bulk) = price(Price.ofBulk(bulk))

        /** Alias for calling [price] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`. */
        fun price(thresholdTotalAmount: Price.ThresholdTotalAmount) =
            price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

        /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
        fun price(tieredPackage: Price.TieredPackage) = price(Price.ofTieredPackage(tieredPackage))

        /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
        fun price(groupedTiered: Price.GroupedTiered) = price(Price.ofGroupedTiered(groupedTiered))

        /** Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
        fun price(tieredWithMinimum: Price.TieredWithMinimum) =
            price(Price.ofTieredWithMinimum(tieredWithMinimum))

        /**
         * Alias for calling [price] with
         * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
         */
        fun price(tieredPackageWithMinimum: Price.TieredPackageWithMinimum) =
            price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

        /**
         * Alias for calling [price] with `Price.ofPackageWithAllocation(packageWithAllocation)`.
         */
        fun price(packageWithAllocation: Price.PackageWithAllocation) =
            price(Price.ofPackageWithAllocation(packageWithAllocation))

        /** Alias for calling [price] with `Price.ofUnitWithPercent(unitWithPercent)`. */
        fun price(unitWithPercent: Price.UnitWithPercent) =
            price(Price.ofUnitWithPercent(unitWithPercent))

        /** Alias for calling [price] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`. */
        fun price(matrixWithAllocation: Price.MatrixWithAllocation) =
            price(Price.ofMatrixWithAllocation(matrixWithAllocation))

        /** Alias for calling [price] with `Price.ofTieredWithProration(tieredWithProration)`. */
        fun price(tieredWithProration: Price.TieredWithProration) =
            price(Price.ofTieredWithProration(tieredWithProration))

        /** Alias for calling [price] with `Price.ofUnitWithProration(unitWithProration)`. */
        fun price(unitWithProration: Price.UnitWithProration) =
            price(Price.ofUnitWithProration(unitWithProration))

        /** Alias for calling [price] with `Price.ofGroupedAllocation(groupedAllocation)`. */
        fun price(groupedAllocation: Price.GroupedAllocation) =
            price(Price.ofGroupedAllocation(groupedAllocation))

        /**
         * Alias for calling [price] with
         * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
         */
        fun price(groupedWithProratedMinimum: Price.GroupedWithProratedMinimum) =
            price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

        /**
         * Alias for calling [price] with
         * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
         */
        fun price(groupedWithMeteredMinimum: Price.GroupedWithMeteredMinimum) =
            price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

        /**
         * Alias for calling [price] with `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
         */
        fun price(matrixWithDisplayName: Price.MatrixWithDisplayName) =
            price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

        /** Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`. */
        fun price(bulkWithProration: Price.BulkWithProration) =
            price(Price.ofBulkWithProration(bulkWithProration))

        /** Alias for calling [price] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`. */
        fun price(groupedTieredPackage: Price.GroupedTieredPackage) =
            price(Price.ofGroupedTieredPackage(groupedTieredPackage))

        /**
         * Alias for calling [price] with `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
         */
        fun price(maxGroupTieredPackage: Price.MaxGroupTieredPackage) =
            price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

        /**
         * Alias for calling [price] with
         * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
         */
        fun price(scalableMatrixWithUnitPricing: Price.ScalableMatrixWithUnitPricing) =
            price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

        /**
         * Alias for calling [price] with
         * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
         */
        fun price(scalableMatrixWithTieredPricing: Price.ScalableMatrixWithTieredPricing) =
            price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

        /**
         * Alias for calling [price] with `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
         */
        fun price(cumulativeGroupedBulk: Price.CumulativeGroupedBulk) =
            price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

        /**
         * Alias for calling [price] with
         * `Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)`.
         */
        fun price(groupedWithMinMaxThresholds: Price.GroupedWithMinMaxThresholds) =
            price(Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds))

        /**
         * The start date of the price interval. This is the date that Orb starts billing for this
         * price.
         */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this price
         * interval.
         */
        fun usageCustomerIds(usageCustomerIds: List<String>?) =
            usageCustomerIds(JsonField.ofNullable(usageCustomerIds))

        /**
         * Sets [Builder.usageCustomerIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageCustomerIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usageCustomerIds(usageCustomerIds: JsonField<List<String>>) = apply {
            this.usageCustomerIds = usageCustomerIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [usageCustomerIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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

        /**
         * Returns an immutable instance of [PriceInterval].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
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
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PriceInterval =
            PriceInterval(
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PriceInterval = apply {
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
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (billingCycleDay.asKnown() == null) 0 else 1) +
            (if (currentBillingPeriodEndDate.asKnown() == null) 0 else 1) +
            (if (currentBillingPeriodStartDate.asKnown() == null) 0 else 1) +
            (if (endDate.asKnown() == null) 0 else 1) +
            (if (filter.asKnown() == null) 0 else 1) +
            (fixedFeeQuantityTransitions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (price.asKnown()?.validity() ?: 0) +
            (if (startDate.asKnown() == null) 0 else 1) +
            (usageCustomerIds.asKnown()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceInterval && id == other.id && billingCycleDay == other.billingCycleDay && currentBillingPeriodEndDate == other.currentBillingPeriodEndDate && currentBillingPeriodStartDate == other.currentBillingPeriodStartDate && endDate == other.endDate && filter == other.filter && fixedFeeQuantityTransitions == other.fixedFeeQuantityTransitions && price == other.price && startDate == other.startDate && usageCustomerIds == other.usageCustomerIds && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, billingCycleDay, currentBillingPeriodEndDate, currentBillingPeriodStartDate, endDate, filter, fixedFeeQuantityTransitions, price, startDate, usageCustomerIds, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PriceInterval{id=$id, billingCycleDay=$billingCycleDay, currentBillingPeriodEndDate=$currentBillingPeriodEndDate, currentBillingPeriodStartDate=$currentBillingPeriodStartDate, endDate=$endDate, filter=$filter, fixedFeeQuantityTransitions=$fixedFeeQuantityTransitions, price=$price, startDate=$startDate, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
}
