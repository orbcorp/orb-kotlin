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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class InvoiceLineItemCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val adjustedSubtotal: JsonField<String>,
    private val adjustments: JsonField<List<Adjustment>>,
    private val amount: JsonField<String>,
    private val creditsApplied: JsonField<String>,
    private val endDate: JsonField<OffsetDateTime>,
    private val filter: JsonField<String>,
    private val grouping: JsonField<String>,
    private val name: JsonField<String>,
    private val partiallyInvoicedAmount: JsonField<String>,
    private val price: JsonField<Price>,
    private val quantity: JsonField<Double>,
    private val startDate: JsonField<OffsetDateTime>,
    private val subLineItems: JsonField<List<SubLineItem>>,
    private val subtotal: JsonField<String>,
    private val taxAmounts: JsonField<List<TaxAmount>>,
    private val usageCustomerIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjusted_subtotal")
        @ExcludeMissing
        adjustedSubtotal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjustments")
        @ExcludeMissing
        adjustments: JsonField<List<Adjustment>> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credits_applied")
        @ExcludeMissing
        creditsApplied: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("grouping") @ExcludeMissing grouping: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("partially_invoiced_amount")
        @ExcludeMissing
        partiallyInvoicedAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sub_line_items")
        @ExcludeMissing
        subLineItems: JsonField<List<SubLineItem>> = JsonMissing.of(),
        @JsonProperty("subtotal") @ExcludeMissing subtotal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_amounts")
        @ExcludeMissing
        taxAmounts: JsonField<List<TaxAmount>> = JsonMissing.of(),
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        adjustedSubtotal,
        adjustments,
        amount,
        creditsApplied,
        endDate,
        filter,
        grouping,
        name,
        partiallyInvoicedAmount,
        price,
        quantity,
        startDate,
        subLineItems,
        subtotal,
        taxAmounts,
        usageCustomerIds,
        mutableMapOf(),
    )

    /**
     * A unique ID for this line item.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The line amount after any adjustments and before overage conversion, credits and partial
     * invoicing.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun adjustedSubtotal(): String = adjustedSubtotal.getRequired("adjusted_subtotal")

    /**
     * All adjustments applied to the line item in the order they were applied based on invoice
     * calculations (ie. usage discounts -> amount discounts -> percentage discounts -> minimums ->
     * maximums).
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun adjustments(): List<Adjustment> = adjustments.getRequired("adjustments")

    /**
     * The final amount for a line item after all adjustments and pre paid credits have been
     * applied.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): String = amount.getRequired("amount")

    /**
     * The number of prepaid credits applied.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditsApplied(): String = creditsApplied.getRequired("credits_applied")

    /**
     * The end date of the range of time applied for this line item's price.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime = endDate.getRequired("end_date")

    /**
     * An additional filter that was used to calculate the usage for this line item.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun filter(): String? = filter.getNullable("filter")

    /**
     * [DEPRECATED] For configured prices that are split by a grouping key, this will be populated
     * with the key and a value. The `amount` and `subtotal` will be the values for this particular
     * grouping.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun grouping(): String? = grouping.getNullable("grouping")

    /**
     * The name of the price associated with this line item.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Any amount applied from a partial invoice
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun partiallyInvoicedAmount(): String =
        partiallyInvoicedAmount.getRequired("partially_invoiced_amount")

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
     * Either the fixed fee quantity or the usage during the service period.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Double = quantity.getRequired("quantity")

    /**
     * The start date of the range of time applied for this line item's price.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /**
     * For complex pricing structures, the line item can be broken down further in `sub_line_items`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subLineItems(): List<SubLineItem> = subLineItems.getRequired("sub_line_items")

    /**
     * The line amount before any adjustments.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subtotal(): String = subtotal.getRequired("subtotal")

    /**
     * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
     * configured.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taxAmounts(): List<TaxAmount> = taxAmounts.getRequired("tax_amounts")

    /**
     * A list of customer ids that were used to calculate the usage for this line item.
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
     * Returns the raw JSON value of [adjustedSubtotal].
     *
     * Unlike [adjustedSubtotal], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("adjusted_subtotal")
    @ExcludeMissing
    fun _adjustedSubtotal(): JsonField<String> = adjustedSubtotal

    /**
     * Returns the raw JSON value of [adjustments].
     *
     * Unlike [adjustments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("adjustments")
    @ExcludeMissing
    fun _adjustments(): JsonField<List<Adjustment>> = adjustments

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /**
     * Returns the raw JSON value of [creditsApplied].
     *
     * Unlike [creditsApplied], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credits_applied")
    @ExcludeMissing
    fun _creditsApplied(): JsonField<String> = creditsApplied

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
     * Returns the raw JSON value of [grouping].
     *
     * Unlike [grouping], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("grouping") @ExcludeMissing fun _grouping(): JsonField<String> = grouping

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [partiallyInvoicedAmount].
     *
     * Unlike [partiallyInvoicedAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("partially_invoiced_amount")
    @ExcludeMissing
    fun _partiallyInvoicedAmount(): JsonField<String> = partiallyInvoicedAmount

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * Returns the raw JSON value of [subLineItems].
     *
     * Unlike [subLineItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sub_line_items")
    @ExcludeMissing
    fun _subLineItems(): JsonField<List<SubLineItem>> = subLineItems

    /**
     * Returns the raw JSON value of [subtotal].
     *
     * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

    /**
     * Returns the raw JSON value of [taxAmounts].
     *
     * Unlike [taxAmounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_amounts")
    @ExcludeMissing
    fun _taxAmounts(): JsonField<List<TaxAmount>> = taxAmounts

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
         * Returns a mutable builder for constructing an instance of
         * [InvoiceLineItemCreateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .adjustedSubtotal()
         * .adjustments()
         * .amount()
         * .creditsApplied()
         * .endDate()
         * .filter()
         * .grouping()
         * .name()
         * .partiallyInvoicedAmount()
         * .price()
         * .quantity()
         * .startDate()
         * .subLineItems()
         * .subtotal()
         * .taxAmounts()
         * .usageCustomerIds()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InvoiceLineItemCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var adjustedSubtotal: JsonField<String>? = null
        private var adjustments: JsonField<MutableList<Adjustment>>? = null
        private var amount: JsonField<String>? = null
        private var creditsApplied: JsonField<String>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var filter: JsonField<String>? = null
        private var grouping: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var partiallyInvoicedAmount: JsonField<String>? = null
        private var price: JsonField<Price>? = null
        private var quantity: JsonField<Double>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var subLineItems: JsonField<MutableList<SubLineItem>>? = null
        private var subtotal: JsonField<String>? = null
        private var taxAmounts: JsonField<MutableList<TaxAmount>>? = null
        private var usageCustomerIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceLineItemCreateResponse: InvoiceLineItemCreateResponse) = apply {
            id = invoiceLineItemCreateResponse.id
            adjustedSubtotal = invoiceLineItemCreateResponse.adjustedSubtotal
            adjustments = invoiceLineItemCreateResponse.adjustments.map { it.toMutableList() }
            amount = invoiceLineItemCreateResponse.amount
            creditsApplied = invoiceLineItemCreateResponse.creditsApplied
            endDate = invoiceLineItemCreateResponse.endDate
            filter = invoiceLineItemCreateResponse.filter
            grouping = invoiceLineItemCreateResponse.grouping
            name = invoiceLineItemCreateResponse.name
            partiallyInvoicedAmount = invoiceLineItemCreateResponse.partiallyInvoicedAmount
            price = invoiceLineItemCreateResponse.price
            quantity = invoiceLineItemCreateResponse.quantity
            startDate = invoiceLineItemCreateResponse.startDate
            subLineItems = invoiceLineItemCreateResponse.subLineItems.map { it.toMutableList() }
            subtotal = invoiceLineItemCreateResponse.subtotal
            taxAmounts = invoiceLineItemCreateResponse.taxAmounts.map { it.toMutableList() }
            usageCustomerIds =
                invoiceLineItemCreateResponse.usageCustomerIds.map { it.toMutableList() }
            additionalProperties = invoiceLineItemCreateResponse.additionalProperties.toMutableMap()
        }

        /** A unique ID for this line item. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The line amount after any adjustments and before overage conversion, credits and partial
         * invoicing.
         */
        fun adjustedSubtotal(adjustedSubtotal: String) =
            adjustedSubtotal(JsonField.of(adjustedSubtotal))

        /**
         * Sets [Builder.adjustedSubtotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adjustedSubtotal] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun adjustedSubtotal(adjustedSubtotal: JsonField<String>) = apply {
            this.adjustedSubtotal = adjustedSubtotal
        }

        /**
         * All adjustments applied to the line item in the order they were applied based on invoice
         * calculations (ie. usage discounts -> amount discounts -> percentage discounts -> minimums
         * -> maximums).
         */
        fun adjustments(adjustments: List<Adjustment>) = adjustments(JsonField.of(adjustments))

        /**
         * Sets [Builder.adjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adjustments] with a well-typed `List<Adjustment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun adjustments(adjustments: JsonField<List<Adjustment>>) = apply {
            this.adjustments = adjustments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Adjustment] to [adjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdjustment(adjustment: Adjustment) = apply {
            adjustments =
                (adjustments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("adjustments", it).add(adjustment)
                }
        }

        /** Alias for calling [addAdjustment] with `Adjustment.ofUsageDiscount(usageDiscount)`. */
        fun addAdjustment(usageDiscount: MonetaryUsageDiscountAdjustment) =
            addAdjustment(Adjustment.ofUsageDiscount(usageDiscount))

        /** Alias for calling [addAdjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`. */
        fun addAdjustment(amountDiscount: MonetaryAmountDiscountAdjustment) =
            addAdjustment(Adjustment.ofAmountDiscount(amountDiscount))

        /**
         * Alias for calling [addAdjustment] with
         * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
         */
        fun addAdjustment(percentageDiscount: MonetaryPercentageDiscountAdjustment) =
            addAdjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

        /**
         * Alias for calling [addAdjustment] with
         * `Adjustment.ofTieredPercentageDiscount(tieredPercentageDiscount)`.
         */
        fun addAdjustment(tieredPercentageDiscount: Adjustment.TieredPercentageDiscount) =
            addAdjustment(Adjustment.ofTieredPercentageDiscount(tieredPercentageDiscount))

        /** Alias for calling [addAdjustment] with `Adjustment.ofMinimum(minimum)`. */
        fun addAdjustment(minimum: MonetaryMinimumAdjustment) =
            addAdjustment(Adjustment.ofMinimum(minimum))

        /** Alias for calling [addAdjustment] with `Adjustment.ofMaximum(maximum)`. */
        fun addAdjustment(maximum: MonetaryMaximumAdjustment) =
            addAdjustment(Adjustment.ofMaximum(maximum))

        /**
         * The final amount for a line item after all adjustments and pre paid credits have been
         * applied.
         */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /** The number of prepaid credits applied. */
        fun creditsApplied(creditsApplied: String) = creditsApplied(JsonField.of(creditsApplied))

        /**
         * Sets [Builder.creditsApplied] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditsApplied] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditsApplied(creditsApplied: JsonField<String>) = apply {
            this.creditsApplied = creditsApplied
        }

        /** The end date of the range of time applied for this line item's price. */
        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** An additional filter that was used to calculate the usage for this line item. */
        fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

        /**
         * [DEPRECATED] For configured prices that are split by a grouping key, this will be
         * populated with the key and a value. The `amount` and `subtotal` will be the values for
         * this particular grouping.
         */
        fun grouping(grouping: String?) = grouping(JsonField.ofNullable(grouping))

        /**
         * Sets [Builder.grouping] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grouping] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun grouping(grouping: JsonField<String>) = apply { this.grouping = grouping }

        /** The name of the price associated with this line item. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Any amount applied from a partial invoice */
        fun partiallyInvoicedAmount(partiallyInvoicedAmount: String) =
            partiallyInvoicedAmount(JsonField.of(partiallyInvoicedAmount))

        /**
         * Sets [Builder.partiallyInvoicedAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partiallyInvoicedAmount] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun partiallyInvoicedAmount(partiallyInvoicedAmount: JsonField<String>) = apply {
            this.partiallyInvoicedAmount = partiallyInvoicedAmount
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
        fun price(unit: Price.UnitPrice) = price(Price.ofUnit(unit))

        /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
        fun price(tiered: Price.Tiered) = price(Price.ofTiered(tiered))

        /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
        fun price(bulk: Price.Bulk) = price(Price.ofBulk(bulk))

        /** Alias for calling [price] with `Price.ofBulkWithFilters(bulkWithFilters)`. */
        fun price(bulkWithFilters: Price.BulkWithFilters) =
            price(Price.ofBulkWithFilters(bulkWithFilters))

        /** Alias for calling [price] with `Price.ofPackage(package_)`. */
        fun price(package_: Price.Package) = price(Price.ofPackage(package_))

        /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
        fun price(matrix: Price.Matrix) = price(Price.ofMatrix(matrix))

        /** Alias for calling [price] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`. */
        fun price(thresholdTotalAmount: Price.ThresholdTotalAmount) =
            price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

        /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
        fun price(tieredPackage: Price.TieredPackage) = price(Price.ofTieredPackage(tieredPackage))

        /** Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
        fun price(tieredWithMinimum: Price.TieredWithMinimum) =
            price(Price.ofTieredWithMinimum(tieredWithMinimum))

        /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
        fun price(groupedTiered: Price.GroupedTiered) = price(Price.ofGroupedTiered(groupedTiered))

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

        /**
         * Alias for calling [price] with
         * `Price.ofMatrixWithThresholdDiscounts(matrixWithThresholdDiscounts)`.
         */
        fun price(matrixWithThresholdDiscounts: Price.MatrixWithThresholdDiscounts) =
            price(Price.ofMatrixWithThresholdDiscounts(matrixWithThresholdDiscounts))

        /** Alias for calling [price] with `Price.ofTieredWithProration(tieredWithProration)`. */
        fun price(tieredWithProration: Price.TieredWithProration) =
            price(Price.ofTieredWithProration(tieredWithProration))

        /** Alias for calling [price] with `Price.ofUnitWithProration(unitWithProration)`. */
        fun price(unitWithProration: Price.UnitWithProration) =
            price(Price.ofUnitWithProration(unitWithProration))

        /** Alias for calling [price] with `Price.ofGroupedAllocation(groupedAllocation)`. */
        fun price(groupedAllocation: Price.GroupedAllocation) =
            price(Price.ofGroupedAllocation(groupedAllocation))

        /** Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`. */
        fun price(bulkWithProration: Price.BulkWithProration) =
            price(Price.ofBulkWithProration(bulkWithProration))

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
         * Alias for calling [price] with
         * `Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)`.
         */
        fun price(groupedWithMinMaxThresholds: Price.GroupedWithMinMaxThresholds) =
            price(Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds))

        /**
         * Alias for calling [price] with `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
         */
        fun price(matrixWithDisplayName: Price.MatrixWithDisplayName) =
            price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

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
         * `Price.ofCumulativeGroupedAllocation(cumulativeGroupedAllocation)`.
         */
        fun price(cumulativeGroupedAllocation: Price.CumulativeGroupedAllocation) =
            price(Price.ofCumulativeGroupedAllocation(cumulativeGroupedAllocation))

        /** Alias for calling [price] with `Price.ofDailyCreditAllowance(dailyCreditAllowance)`. */
        fun price(dailyCreditAllowance: Price.DailyCreditAllowance) =
            price(Price.ofDailyCreditAllowance(dailyCreditAllowance))

        /** Alias for calling [price] with `Price.ofMeteredAllowance(meteredAllowance)`. */
        fun price(meteredAllowance: Price.MeteredAllowance) =
            price(Price.ofMeteredAllowance(meteredAllowance))

        /** Alias for calling [price] with `Price.ofMinimumComposite(minimumComposite)`. */
        fun price(minimumComposite: Price.MinimumComposite) =
            price(Price.ofMinimumComposite(minimumComposite))

        /** Alias for calling [price] with `Price.ofPercent(percent)`. */
        fun price(percent: Price.Percent) = price(Price.ofPercent(percent))

        /** Alias for calling [price] with `Price.ofEventOutput(eventOutput)`. */
        fun price(eventOutput: Price.EventOutput) = price(Price.ofEventOutput(eventOutput))

        /** Either the fixed fee quantity or the usage during the service period. */
        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /** The start date of the range of time applied for this line item's price. */
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
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun subLineItems(subLineItems: List<SubLineItem>) = subLineItems(JsonField.of(subLineItems))

        /**
         * Sets [Builder.subLineItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subLineItems] with a well-typed `List<SubLineItem>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun subLineItems(subLineItems: JsonField<List<SubLineItem>>) = apply {
            this.subLineItems = subLineItems.map { it.toMutableList() }
        }

        /**
         * Adds a single [SubLineItem] to [subLineItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubLineItem(subLineItem: SubLineItem) = apply {
            subLineItems =
                (subLineItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("subLineItems", it).add(subLineItem)
                }
        }

        /** Alias for calling [addSubLineItem] with `SubLineItem.ofMatrix(matrix)`. */
        fun addSubLineItem(matrix: MatrixSubLineItem) = addSubLineItem(SubLineItem.ofMatrix(matrix))

        /** Alias for calling [addSubLineItem] with `SubLineItem.ofTier(tier)`. */
        fun addSubLineItem(tier: TierSubLineItem) = addSubLineItem(SubLineItem.ofTier(tier))

        /** Alias for calling [addSubLineItem] with `SubLineItem.ofNull(null_)`. */
        fun addSubLineItem(null_: OtherSubLineItem) = addSubLineItem(SubLineItem.ofNull(null_))

        /** The line amount before any adjustments. */
        fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

        /**
         * Sets [Builder.subtotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtotal] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

        /**
         * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
         * configured.
         */
        fun taxAmounts(taxAmounts: List<TaxAmount>) = taxAmounts(JsonField.of(taxAmounts))

        /**
         * Sets [Builder.taxAmounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxAmounts] with a well-typed `List<TaxAmount>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxAmounts(taxAmounts: JsonField<List<TaxAmount>>) = apply {
            this.taxAmounts = taxAmounts.map { it.toMutableList() }
        }

        /**
         * Adds a single [TaxAmount] to [taxAmounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTaxAmount(taxAmount: TaxAmount) = apply {
            taxAmounts =
                (taxAmounts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("taxAmounts", it).add(taxAmount)
                }
        }

        /** A list of customer ids that were used to calculate the usage for this line item. */
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
         * Returns an immutable instance of [InvoiceLineItemCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .adjustedSubtotal()
         * .adjustments()
         * .amount()
         * .creditsApplied()
         * .endDate()
         * .filter()
         * .grouping()
         * .name()
         * .partiallyInvoicedAmount()
         * .price()
         * .quantity()
         * .startDate()
         * .subLineItems()
         * .subtotal()
         * .taxAmounts()
         * .usageCustomerIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceLineItemCreateResponse =
            InvoiceLineItemCreateResponse(
                checkRequired("id", id),
                checkRequired("adjustedSubtotal", adjustedSubtotal),
                checkRequired("adjustments", adjustments).map { it.toImmutable() },
                checkRequired("amount", amount),
                checkRequired("creditsApplied", creditsApplied),
                checkRequired("endDate", endDate),
                checkRequired("filter", filter),
                checkRequired("grouping", grouping),
                checkRequired("name", name),
                checkRequired("partiallyInvoicedAmount", partiallyInvoicedAmount),
                checkRequired("price", price),
                checkRequired("quantity", quantity),
                checkRequired("startDate", startDate),
                checkRequired("subLineItems", subLineItems).map { it.toImmutable() },
                checkRequired("subtotal", subtotal),
                checkRequired("taxAmounts", taxAmounts).map { it.toImmutable() },
                checkRequired("usageCustomerIds", usageCustomerIds).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws OrbInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): InvoiceLineItemCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        adjustedSubtotal()
        adjustments().forEach { it.validate() }
        amount()
        creditsApplied()
        endDate()
        filter()
        grouping()
        name()
        partiallyInvoicedAmount()
        price().validate()
        quantity()
        startDate()
        subLineItems().forEach { it.validate() }
        subtotal()
        taxAmounts().forEach { it.validate() }
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
            (if (adjustedSubtotal.asKnown() == null) 0 else 1) +
            (adjustments.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (amount.asKnown() == null) 0 else 1) +
            (if (creditsApplied.asKnown() == null) 0 else 1) +
            (if (endDate.asKnown() == null) 0 else 1) +
            (if (filter.asKnown() == null) 0 else 1) +
            (if (grouping.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (partiallyInvoicedAmount.asKnown() == null) 0 else 1) +
            (price.asKnown()?.validity() ?: 0) +
            (if (quantity.asKnown() == null) 0 else 1) +
            (if (startDate.asKnown() == null) 0 else 1) +
            (subLineItems.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (subtotal.asKnown() == null) 0 else 1) +
            (taxAmounts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (usageCustomerIds.asKnown()?.size ?: 0)

    @JsonDeserialize(using = Adjustment.Deserializer::class)
    @JsonSerialize(using = Adjustment.Serializer::class)
    class Adjustment
    private constructor(
        private val usageDiscount: MonetaryUsageDiscountAdjustment? = null,
        private val amountDiscount: MonetaryAmountDiscountAdjustment? = null,
        private val percentageDiscount: MonetaryPercentageDiscountAdjustment? = null,
        private val tieredPercentageDiscount: TieredPercentageDiscount? = null,
        private val minimum: MonetaryMinimumAdjustment? = null,
        private val maximum: MonetaryMaximumAdjustment? = null,
        private val _json: JsonValue? = null,
    ) {

        fun usageDiscount(): MonetaryUsageDiscountAdjustment? = usageDiscount

        fun amountDiscount(): MonetaryAmountDiscountAdjustment? = amountDiscount

        fun percentageDiscount(): MonetaryPercentageDiscountAdjustment? = percentageDiscount

        fun tieredPercentageDiscount(): TieredPercentageDiscount? = tieredPercentageDiscount

        fun minimum(): MonetaryMinimumAdjustment? = minimum

        fun maximum(): MonetaryMaximumAdjustment? = maximum

        fun isUsageDiscount(): Boolean = usageDiscount != null

        fun isAmountDiscount(): Boolean = amountDiscount != null

        fun isPercentageDiscount(): Boolean = percentageDiscount != null

        fun isTieredPercentageDiscount(): Boolean = tieredPercentageDiscount != null

        fun isMinimum(): Boolean = minimum != null

        fun isMaximum(): Boolean = maximum != null

        fun asUsageDiscount(): MonetaryUsageDiscountAdjustment =
            usageDiscount.getOrThrow("usageDiscount")

        fun asAmountDiscount(): MonetaryAmountDiscountAdjustment =
            amountDiscount.getOrThrow("amountDiscount")

        fun asPercentageDiscount(): MonetaryPercentageDiscountAdjustment =
            percentageDiscount.getOrThrow("percentageDiscount")

        fun asTieredPercentageDiscount(): TieredPercentageDiscount =
            tieredPercentageDiscount.getOrThrow("tieredPercentageDiscount")

        fun asMinimum(): MonetaryMinimumAdjustment = minimum.getOrThrow("minimum")

        fun asMaximum(): MonetaryMaximumAdjustment = maximum.getOrThrow("maximum")

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
         * val result: String? = adjustment.accept(object : Adjustment.Visitor<String?> {
         *     override fun visitUsageDiscount(usageDiscount: MonetaryUsageDiscountAdjustment): String? = usageDiscount.toString()
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
                usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
                percentageDiscount != null -> visitor.visitPercentageDiscount(percentageDiscount)
                tieredPercentageDiscount != null ->
                    visitor.visitTieredPercentageDiscount(tieredPercentageDiscount)
                minimum != null -> visitor.visitMinimum(minimum)
                maximum != null -> visitor.visitMaximum(maximum)
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
        fun validate(): Adjustment = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUsageDiscount(
                        usageDiscount: MonetaryUsageDiscountAdjustment
                    ) {
                        usageDiscount.validate()
                    }

                    override fun visitAmountDiscount(
                        amountDiscount: MonetaryAmountDiscountAdjustment
                    ) {
                        amountDiscount.validate()
                    }

                    override fun visitPercentageDiscount(
                        percentageDiscount: MonetaryPercentageDiscountAdjustment
                    ) {
                        percentageDiscount.validate()
                    }

                    override fun visitTieredPercentageDiscount(
                        tieredPercentageDiscount: TieredPercentageDiscount
                    ) {
                        tieredPercentageDiscount.validate()
                    }

                    override fun visitMinimum(minimum: MonetaryMinimumAdjustment) {
                        minimum.validate()
                    }

                    override fun visitMaximum(maximum: MonetaryMaximumAdjustment) {
                        maximum.validate()
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
                    override fun visitUsageDiscount(
                        usageDiscount: MonetaryUsageDiscountAdjustment
                    ) = usageDiscount.validity()

                    override fun visitAmountDiscount(
                        amountDiscount: MonetaryAmountDiscountAdjustment
                    ) = amountDiscount.validity()

                    override fun visitPercentageDiscount(
                        percentageDiscount: MonetaryPercentageDiscountAdjustment
                    ) = percentageDiscount.validity()

                    override fun visitTieredPercentageDiscount(
                        tieredPercentageDiscount: TieredPercentageDiscount
                    ) = tieredPercentageDiscount.validity()

                    override fun visitMinimum(minimum: MonetaryMinimumAdjustment) =
                        minimum.validity()

                    override fun visitMaximum(maximum: MonetaryMaximumAdjustment) =
                        maximum.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Adjustment &&
                usageDiscount == other.usageDiscount &&
                amountDiscount == other.amountDiscount &&
                percentageDiscount == other.percentageDiscount &&
                tieredPercentageDiscount == other.tieredPercentageDiscount &&
                minimum == other.minimum &&
                maximum == other.maximum
        }

        override fun hashCode(): Int =
            Objects.hash(
                usageDiscount,
                amountDiscount,
                percentageDiscount,
                tieredPercentageDiscount,
                minimum,
                maximum,
            )

        override fun toString(): String =
            when {
                usageDiscount != null -> "Adjustment{usageDiscount=$usageDiscount}"
                amountDiscount != null -> "Adjustment{amountDiscount=$amountDiscount}"
                percentageDiscount != null -> "Adjustment{percentageDiscount=$percentageDiscount}"
                tieredPercentageDiscount != null ->
                    "Adjustment{tieredPercentageDiscount=$tieredPercentageDiscount}"
                minimum != null -> "Adjustment{minimum=$minimum}"
                maximum != null -> "Adjustment{maximum=$maximum}"
                _json != null -> "Adjustment{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Adjustment")
            }

        companion object {

            fun ofUsageDiscount(usageDiscount: MonetaryUsageDiscountAdjustment) =
                Adjustment(usageDiscount = usageDiscount)

            fun ofAmountDiscount(amountDiscount: MonetaryAmountDiscountAdjustment) =
                Adjustment(amountDiscount = amountDiscount)

            fun ofPercentageDiscount(percentageDiscount: MonetaryPercentageDiscountAdjustment) =
                Adjustment(percentageDiscount = percentageDiscount)

            fun ofTieredPercentageDiscount(tieredPercentageDiscount: TieredPercentageDiscount) =
                Adjustment(tieredPercentageDiscount = tieredPercentageDiscount)

            fun ofMinimum(minimum: MonetaryMinimumAdjustment) = Adjustment(minimum = minimum)

            fun ofMaximum(maximum: MonetaryMaximumAdjustment) = Adjustment(maximum = maximum)
        }

        /**
         * An interface that defines how to map each variant of [Adjustment] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitUsageDiscount(usageDiscount: MonetaryUsageDiscountAdjustment): T

            fun visitAmountDiscount(amountDiscount: MonetaryAmountDiscountAdjustment): T

            fun visitPercentageDiscount(percentageDiscount: MonetaryPercentageDiscountAdjustment): T

            fun visitTieredPercentageDiscount(tieredPercentageDiscount: TieredPercentageDiscount): T

            fun visitMinimum(minimum: MonetaryMinimumAdjustment): T

            fun visitMaximum(maximum: MonetaryMaximumAdjustment): T

            /**
             * Maps an unknown variant of [Adjustment] to a value of type [T].
             *
             * An instance of [Adjustment] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown Adjustment: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Adjustment>(Adjustment::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Adjustment {
                val json = JsonValue.fromJsonNode(node)
                val adjustmentType = json.asObject()?.get("adjustment_type")?.asString()

                when (adjustmentType) {
                    "usage_discount" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<MonetaryUsageDiscountAdjustment>(),
                            )
                            ?.let { Adjustment(usageDiscount = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                    "amount_discount" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<MonetaryAmountDiscountAdjustment>(),
                            )
                            ?.let { Adjustment(amountDiscount = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                    "percentage_discount" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<MonetaryPercentageDiscountAdjustment>(),
                            )
                            ?.let { Adjustment(percentageDiscount = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                    "tiered_percentage_discount" -> {
                        return tryDeserialize(node, jacksonTypeRef<TieredPercentageDiscount>())
                            ?.let { Adjustment(tieredPercentageDiscount = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                    "minimum" -> {
                        return tryDeserialize(node, jacksonTypeRef<MonetaryMinimumAdjustment>())
                            ?.let { Adjustment(minimum = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                    "maximum" -> {
                        return tryDeserialize(node, jacksonTypeRef<MonetaryMaximumAdjustment>())
                            ?.let { Adjustment(maximum = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                }

                return Adjustment(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Adjustment>(Adjustment::class) {

            override fun serialize(
                value: Adjustment,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                    value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                    value.percentageDiscount != null ->
                        generator.writeObject(value.percentageDiscount)
                    value.tieredPercentageDiscount != null ->
                        generator.writeObject(value.tieredPercentageDiscount)
                    value.minimum != null -> generator.writeObject(value.minimum)
                    value.maximum != null -> generator.writeObject(value.maximum)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Adjustment")
                }
            }
        }

        class TieredPercentageDiscount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonValue,
            private val amount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val filters: JsonField<List<Filter>>,
            private val isInvoiceLevel: JsonField<Boolean>,
            private val reason: JsonField<String>,
            private val replacesAdjustmentId: JsonField<String>,
            private val tiers: JsonField<List<Tier>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                adjustmentType: JsonValue = JsonMissing.of(),
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("filters")
                @ExcludeMissing
                filters: JsonField<List<Filter>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("replaces_adjustment_id")
                @ExcludeMissing
                replacesAdjustmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tiers")
                @ExcludeMissing
                tiers: JsonField<List<Tier>> = JsonMissing.of(),
            ) : this(
                id,
                adjustmentType,
                amount,
                appliesToPriceIds,
                filters,
                isInvoiceLevel,
                reason,
                replacesAdjustmentId,
                tiers,
                mutableMapOf(),
            )

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("tiered_percentage_discount")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonValue = adjustmentType

            /**
             * The value applied by an adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): String = amount.getRequired("amount")

            /**
             * The price IDs that this adjustment applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            @Deprecated("deprecated")
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * The filters that determine which prices to apply this adjustment to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun filters(): List<Filter> = filters.getRequired("filters")

            /**
             * True for adjustments that apply to an entire invoice, false for adjustments that
             * apply to only one price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

            /**
             * The reason for the adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): String? = reason.getNullable("reason")

            /**
             * The adjustment id this adjustment replaces. This adjustment will take the place of
             * the replaced adjustment in plan version migrations.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun replacesAdjustmentId(): String? =
                replacesAdjustmentId.getNullable("replaces_adjustment_id")

            /**
             * The ordered, contiguous bands of cumulative eligible spend, each discounted at its
             * own percentage (progressive fill-a-tier), applied to the prices this adjustment
             * covers in a given billing period.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tiers(): List<Tier> = tiers.getRequired("tiers")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [appliesToPriceIds].
             *
             * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @Deprecated("deprecated")
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * Returns the raw JSON value of [filters].
             *
             * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filters")
            @ExcludeMissing
            fun _filters(): JsonField<List<Filter>> = filters

            /**
             * Returns the raw JSON value of [isInvoiceLevel].
             *
             * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            /**
             * Returns the raw JSON value of [replacesAdjustmentId].
             *
             * Unlike [replacesAdjustmentId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("replaces_adjustment_id")
            @ExcludeMissing
            fun _replacesAdjustmentId(): JsonField<String> = replacesAdjustmentId

            /**
             * Returns the raw JSON value of [tiers].
             *
             * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
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
                 * [TieredPercentageDiscount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amount()
                 * .appliesToPriceIds()
                 * .filters()
                 * .isInvoiceLevel()
                 * .reason()
                 * .replacesAdjustmentId()
                 * .tiers()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [TieredPercentageDiscount]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonValue = JsonValue.from("tiered_percentage_discount")
                private var amount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var filters: JsonField<MutableList<Filter>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var reason: JsonField<String>? = null
                private var replacesAdjustmentId: JsonField<String>? = null
                private var tiers: JsonField<MutableList<Tier>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredPercentageDiscount: TieredPercentageDiscount) = apply {
                    id = tieredPercentageDiscount.id
                    adjustmentType = tieredPercentageDiscount.adjustmentType
                    amount = tieredPercentageDiscount.amount
                    appliesToPriceIds =
                        tieredPercentageDiscount.appliesToPriceIds.map { it.toMutableList() }
                    filters = tieredPercentageDiscount.filters.map { it.toMutableList() }
                    isInvoiceLevel = tieredPercentageDiscount.isInvoiceLevel
                    reason = tieredPercentageDiscount.reason
                    replacesAdjustmentId = tieredPercentageDiscount.replacesAdjustmentId
                    tiers = tieredPercentageDiscount.tiers.map { it.toMutableList() }
                    additionalProperties =
                        tieredPercentageDiscount.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("tiered_percentage_discount")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun adjustmentType(adjustmentType: JsonValue) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The value applied by an adjustment. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** The price IDs that this adjustment applies to. */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                @Deprecated("deprecated")
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The filters that determine which prices to apply this adjustment to. */
                fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                /**
                 * Sets [Builder.filters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * True for adjustments that apply to an entire invoice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                    this.isInvoiceLevel = isInvoiceLevel
                }

                /** The reason for the adjustment. */
                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                /**
                 * The adjustment id this adjustment replaces. This adjustment will take the place
                 * of the replaced adjustment in plan version migrations.
                 */
                fun replacesAdjustmentId(replacesAdjustmentId: String?) =
                    replacesAdjustmentId(JsonField.ofNullable(replacesAdjustmentId))

                /**
                 * Sets [Builder.replacesAdjustmentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.replacesAdjustmentId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun replacesAdjustmentId(replacesAdjustmentId: JsonField<String>) = apply {
                    this.replacesAdjustmentId = replacesAdjustmentId
                }

                /**
                 * The ordered, contiguous bands of cumulative eligible spend, each discounted at
                 * its own percentage (progressive fill-a-tier), applied to the prices this
                 * adjustment covers in a given billing period.
                 */
                fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                /**
                 * Sets [Builder.tiers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [TieredPercentageDiscount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amount()
                 * .appliesToPriceIds()
                 * .filters()
                 * .isInvoiceLevel()
                 * .reason()
                 * .replacesAdjustmentId()
                 * .tiers()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TieredPercentageDiscount =
                    TieredPercentageDiscount(
                        checkRequired("id", id),
                        adjustmentType,
                        checkRequired("amount", amount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("filters", filters).map { it.toImmutable() },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("reason", reason),
                        checkRequired("replacesAdjustmentId", replacesAdjustmentId),
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
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): TieredPercentageDiscount = apply {
                if (validated) {
                    return@apply
                }

                id()
                _adjustmentType().let {
                    if (it != JsonValue.from("tiered_percentage_discount")) {
                        throw OrbInvalidDataException("'adjustmentType' is invalid, received $it")
                    }
                }
                amount()
                appliesToPriceIds()
                filters().forEach { it.validate() }
                isInvoiceLevel()
                reason()
                replacesAdjustmentId()
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
                (if (id.asKnown() == null) 0 else 1) +
                    adjustmentType.let {
                        if (it == JsonValue.from("tiered_percentage_discount")) 1 else 0
                    } +
                    (if (amount.asKnown() == null) 0 else 1) +
                    (appliesToPriceIds.asKnown()?.size ?: 0) +
                    (filters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (isInvoiceLevel.asKnown() == null) 0 else 1) +
                    (if (reason.asKnown() == null) 0 else 1) +
                    (if (replacesAdjustmentId.asKnown() == null) 0 else 1) +
                    (tiers.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

            class Filter
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val field: JsonField<Field>,
                private val operator: JsonField<Operator>,
                private val values: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("field")
                    @ExcludeMissing
                    field: JsonField<Field> = JsonMissing.of(),
                    @JsonProperty("operator")
                    @ExcludeMissing
                    operator: JsonField<Operator> = JsonMissing.of(),
                    @JsonProperty("values")
                    @ExcludeMissing
                    values: JsonField<List<String>> = JsonMissing.of(),
                ) : this(field, operator, values, mutableMapOf())

                /**
                 * The property of the price to filter on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun field(): Field = field.getRequired("field")

                /**
                 * Should prices that match the filter be included or excluded.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun operator(): Operator = operator.getRequired("operator")

                /**
                 * The IDs or values that match this filter.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun values(): List<String> = values.getRequired("values")

                /**
                 * Returns the raw JSON value of [field].
                 *
                 * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                /**
                 * Returns the raw JSON value of [operator].
                 *
                 * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operator")
                @ExcludeMissing
                fun _operator(): JsonField<Operator> = operator

                /**
                 * Returns the raw JSON value of [values].
                 *
                 * Unlike [values], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("values")
                @ExcludeMissing
                fun _values(): JsonField<List<String>> = values

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
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Filter]. */
                class Builder internal constructor() {

                    private var field: JsonField<Field>? = null
                    private var operator: JsonField<Operator>? = null
                    private var values: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(filter: Filter) = apply {
                        field = filter.field
                        operator = filter.operator
                        values = filter.values.map { it.toMutableList() }
                        additionalProperties = filter.additionalProperties.toMutableMap()
                    }

                    /** The property of the price to filter on. */
                    fun field(field: Field) = field(JsonField.of(field))

                    /**
                     * Sets [Builder.field] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.field] with a well-typed [Field] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun field(field: JsonField<Field>) = apply { this.field = field }

                    /** Should prices that match the filter be included or excluded. */
                    fun operator(operator: Operator) = operator(JsonField.of(operator))

                    /**
                     * Sets [Builder.operator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operator] with a well-typed [Operator] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                    /** The IDs or values that match this filter. */
                    fun values(values: List<String>) = values(JsonField.of(values))

                    /**
                     * Sets [Builder.values] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.values] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun values(values: JsonField<List<String>>) = apply {
                        this.values = values.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [values].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addValue(value: String) = apply {
                        values =
                            (values ?: JsonField.of(mutableListOf())).also {
                                checkKnown("values", it).add(value)
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
                     * Returns an immutable instance of [Filter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Filter =
                        Filter(
                            checkRequired("field", field),
                            checkRequired("operator", operator),
                            checkRequired("values", values).map { it.toImmutable() },
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
                fun validate(): Filter = apply {
                    if (validated) {
                        return@apply
                    }

                    field().validate()
                    operator().validate()
                    values()
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
                    (field.asKnown()?.validity() ?: 0) +
                        (operator.asKnown()?.validity() ?: 0) +
                        (values.asKnown()?.size ?: 0)

                /** The property of the price to filter on. */
                class Field @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val PRICE_ID = of("price_id")

                        val ITEM_ID = of("item_id")

                        val PRICE_TYPE = of("price_type")

                        val CURRENCY = of("currency")

                        val PRICING_UNIT_ID = of("pricing_unit_id")

                        fun of(value: String) = Field(JsonField.of(value))
                    }

                    /** An enum containing [Field]'s known values. */
                    enum class Known {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                    }

                    /**
                     * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Field] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                        /**
                         * An enum member indicating that [Field] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PRICE_ID -> Value.PRICE_ID
                            ITEM_ID -> Value.ITEM_ID
                            PRICE_TYPE -> Value.PRICE_TYPE
                            CURRENCY -> Value.CURRENCY
                            PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PRICE_ID -> Known.PRICE_ID
                            ITEM_ID -> Known.ITEM_ID
                            PRICE_TYPE -> Known.PRICE_TYPE
                            CURRENCY -> Known.CURRENCY
                            PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                            else -> throw OrbInvalidDataException("Unknown Field: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

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
                    fun validate(): Field = apply {
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

                        return other is Field && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Should prices that match the filter be included or excluded. */
                class Operator
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val INCLUDES = of("includes")

                        val EXCLUDES = of("excludes")

                        fun of(value: String) = Operator(JsonField.of(value))
                    }

                    /** An enum containing [Operator]'s known values. */
                    enum class Known {
                        INCLUDES,
                        EXCLUDES,
                    }

                    /**
                     * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Operator] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        INCLUDES,
                        EXCLUDES,
                        /**
                         * An enum member indicating that [Operator] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            INCLUDES -> Value.INCLUDES
                            EXCLUDES -> Value.EXCLUDES
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            INCLUDES -> Known.INCLUDES
                            EXCLUDES -> Known.EXCLUDES
                            else -> throw OrbInvalidDataException("Unknown Operator: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

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
                    fun validate(): Operator = apply {
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

                        return other is Operator && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Filter &&
                        field == other.field &&
                        operator == other.operator &&
                        values == other.values &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(field, operator, values, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
            }

            /**
             * One band of a tiered percentage discount. Bounds are denominated in the discount's
             * currency. `lower_bound` is the exclusive start of the band and `upper_bound` is the
             * inclusive end; `upper_bound` is null only for the open-ended final tier.
             */
            class Tier
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val lowerBound: JsonField<Double>,
                private val percentage: JsonField<Double>,
                private val upperBound: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("lower_bound")
                    @ExcludeMissing
                    lowerBound: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("percentage")
                    @ExcludeMissing
                    percentage: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("upper_bound")
                    @ExcludeMissing
                    upperBound: JsonField<Double> = JsonMissing.of(),
                ) : this(lowerBound, percentage, upperBound, mutableMapOf())

                /**
                 * Exclusive lower bound of cumulative spend for this tier.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun lowerBound(): Double = lowerBound.getRequired("lower_bound")

                /**
                 * The percentage (between 0 and 1) discounted from spend that falls within this
                 * tier.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun percentage(): Double = percentage.getRequired("percentage")

                /**
                 * Inclusive upper bound of cumulative spend for this tier; null for the final
                 * open-ended tier.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun upperBound(): Double? = upperBound.getNullable("upper_bound")

                /**
                 * Returns the raw JSON value of [lowerBound].
                 *
                 * Unlike [lowerBound], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("lower_bound")
                @ExcludeMissing
                fun _lowerBound(): JsonField<Double> = lowerBound

                /**
                 * Returns the raw JSON value of [percentage].
                 *
                 * Unlike [percentage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("percentage")
                @ExcludeMissing
                fun _percentage(): JsonField<Double> = percentage

                /**
                 * Returns the raw JSON value of [upperBound].
                 *
                 * Unlike [upperBound], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("upper_bound")
                @ExcludeMissing
                fun _upperBound(): JsonField<Double> = upperBound

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
                     * .lowerBound()
                     * .percentage()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Tier]. */
                class Builder internal constructor() {

                    private var lowerBound: JsonField<Double>? = null
                    private var percentage: JsonField<Double>? = null
                    private var upperBound: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tier: Tier) = apply {
                        lowerBound = tier.lowerBound
                        percentage = tier.percentage
                        upperBound = tier.upperBound
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    /** Exclusive lower bound of cumulative spend for this tier. */
                    fun lowerBound(lowerBound: Double) = lowerBound(JsonField.of(lowerBound))

                    /**
                     * Sets [Builder.lowerBound] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lowerBound] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lowerBound(lowerBound: JsonField<Double>) = apply {
                        this.lowerBound = lowerBound
                    }

                    /**
                     * The percentage (between 0 and 1) discounted from spend that falls within this
                     * tier.
                     */
                    fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

                    /**
                     * Sets [Builder.percentage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percentage] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun percentage(percentage: JsonField<Double>) = apply {
                        this.percentage = percentage
                    }

                    /**
                     * Inclusive upper bound of cumulative spend for this tier; null for the final
                     * open-ended tier.
                     */
                    fun upperBound(upperBound: Double?) =
                        upperBound(JsonField.ofNullable(upperBound))

                    /**
                     * Alias for [Builder.upperBound].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun upperBound(upperBound: Double) = upperBound(upperBound as Double?)

                    /**
                     * Sets [Builder.upperBound] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.upperBound] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun upperBound(upperBound: JsonField<Double>) = apply {
                        this.upperBound = upperBound
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
                     * Returns an immutable instance of [Tier].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .lowerBound()
                     * .percentage()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Tier =
                        Tier(
                            checkRequired("lowerBound", lowerBound),
                            checkRequired("percentage", percentage),
                            upperBound,
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
                fun validate(): Tier = apply {
                    if (validated) {
                        return@apply
                    }

                    lowerBound()
                    percentage()
                    upperBound()
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
                    (if (lowerBound.asKnown() == null) 0 else 1) +
                        (if (percentage.asKnown() == null) 0 else 1) +
                        (if (upperBound.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tier &&
                        lowerBound == other.lowerBound &&
                        percentage == other.percentage &&
                        upperBound == other.upperBound &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(lowerBound, percentage, upperBound, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{lowerBound=$lowerBound, percentage=$percentage, upperBound=$upperBound, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TieredPercentageDiscount &&
                    id == other.id &&
                    adjustmentType == other.adjustmentType &&
                    amount == other.amount &&
                    appliesToPriceIds == other.appliesToPriceIds &&
                    filters == other.filters &&
                    isInvoiceLevel == other.isInvoiceLevel &&
                    reason == other.reason &&
                    replacesAdjustmentId == other.replacesAdjustmentId &&
                    tiers == other.tiers &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    adjustmentType,
                    amount,
                    appliesToPriceIds,
                    filters,
                    isInvoiceLevel,
                    reason,
                    replacesAdjustmentId,
                    tiers,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TieredPercentageDiscount{id=$id, adjustmentType=$adjustmentType, amount=$amount, appliesToPriceIds=$appliesToPriceIds, filters=$filters, isInvoiceLevel=$isInvoiceLevel, reason=$reason, replacesAdjustmentId=$replacesAdjustmentId, tiers=$tiers, additionalProperties=$additionalProperties}"
        }
    }

    @JsonDeserialize(using = SubLineItem.Deserializer::class)
    @JsonSerialize(using = SubLineItem.Serializer::class)
    class SubLineItem
    private constructor(
        private val matrix: MatrixSubLineItem? = null,
        private val tier: TierSubLineItem? = null,
        private val null_: OtherSubLineItem? = null,
        private val _json: JsonValue? = null,
    ) {

        fun matrix(): MatrixSubLineItem? = matrix

        fun tier(): TierSubLineItem? = tier

        fun null_(): OtherSubLineItem? = null_

        fun isMatrix(): Boolean = matrix != null

        fun isTier(): Boolean = tier != null

        fun isNull(): Boolean = null_ != null

        fun asMatrix(): MatrixSubLineItem = matrix.getOrThrow("matrix")

        fun asTier(): TierSubLineItem = tier.getOrThrow("tier")

        fun asNull(): OtherSubLineItem = null_.getOrThrow("null_")

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
         * val result: String? = subLineItem.accept(object : SubLineItem.Visitor<String?> {
         *     override fun visitMatrix(matrix: MatrixSubLineItem): String? = matrix.toString()
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
                matrix != null -> visitor.visitMatrix(matrix)
                tier != null -> visitor.visitTier(tier)
                null_ != null -> visitor.visitNull(null_)
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
        fun validate(): SubLineItem = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitMatrix(matrix: MatrixSubLineItem) {
                        matrix.validate()
                    }

                    override fun visitTier(tier: TierSubLineItem) {
                        tier.validate()
                    }

                    override fun visitNull(null_: OtherSubLineItem) {
                        null_.validate()
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
                    override fun visitMatrix(matrix: MatrixSubLineItem) = matrix.validity()

                    override fun visitTier(tier: TierSubLineItem) = tier.validity()

                    override fun visitNull(null_: OtherSubLineItem) = null_.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SubLineItem &&
                matrix == other.matrix &&
                tier == other.tier &&
                null_ == other.null_
        }

        override fun hashCode(): Int = Objects.hash(matrix, tier, null_)

        override fun toString(): String =
            when {
                matrix != null -> "SubLineItem{matrix=$matrix}"
                tier != null -> "SubLineItem{tier=$tier}"
                null_ != null -> "SubLineItem{null_=$null_}"
                _json != null -> "SubLineItem{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid SubLineItem")
            }

        companion object {

            fun ofMatrix(matrix: MatrixSubLineItem) = SubLineItem(matrix = matrix)

            fun ofTier(tier: TierSubLineItem) = SubLineItem(tier = tier)

            fun ofNull(null_: OtherSubLineItem) = SubLineItem(null_ = null_)
        }

        /**
         * An interface that defines how to map each variant of [SubLineItem] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitMatrix(matrix: MatrixSubLineItem): T

            fun visitTier(tier: TierSubLineItem): T

            fun visitNull(null_: OtherSubLineItem): T

            /**
             * Maps an unknown variant of [SubLineItem] to a value of type [T].
             *
             * An instance of [SubLineItem] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown SubLineItem: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<SubLineItem>(SubLineItem::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): SubLineItem {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "matrix" -> {
                        return tryDeserialize(node, jacksonTypeRef<MatrixSubLineItem>())?.let {
                            SubLineItem(matrix = it, _json = json)
                        } ?: SubLineItem(_json = json)
                    }
                    "tier" -> {
                        return tryDeserialize(node, jacksonTypeRef<TierSubLineItem>())?.let {
                            SubLineItem(tier = it, _json = json)
                        } ?: SubLineItem(_json = json)
                    }
                    "'null'" -> {
                        return tryDeserialize(node, jacksonTypeRef<OtherSubLineItem>())?.let {
                            SubLineItem(null_ = it, _json = json)
                        } ?: SubLineItem(_json = json)
                    }
                }

                return SubLineItem(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<SubLineItem>(SubLineItem::class) {

            override fun serialize(
                value: SubLineItem,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.matrix != null -> generator.writeObject(value.matrix)
                    value.tier != null -> generator.writeObject(value.tier)
                    value.null_ != null -> generator.writeObject(value.null_)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid SubLineItem")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceLineItemCreateResponse &&
            id == other.id &&
            adjustedSubtotal == other.adjustedSubtotal &&
            adjustments == other.adjustments &&
            amount == other.amount &&
            creditsApplied == other.creditsApplied &&
            endDate == other.endDate &&
            filter == other.filter &&
            grouping == other.grouping &&
            name == other.name &&
            partiallyInvoicedAmount == other.partiallyInvoicedAmount &&
            price == other.price &&
            quantity == other.quantity &&
            startDate == other.startDate &&
            subLineItems == other.subLineItems &&
            subtotal == other.subtotal &&
            taxAmounts == other.taxAmounts &&
            usageCustomerIds == other.usageCustomerIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            adjustedSubtotal,
            adjustments,
            amount,
            creditsApplied,
            endDate,
            filter,
            grouping,
            name,
            partiallyInvoicedAmount,
            price,
            quantity,
            startDate,
            subLineItems,
            subtotal,
            taxAmounts,
            usageCustomerIds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceLineItemCreateResponse{id=$id, adjustedSubtotal=$adjustedSubtotal, adjustments=$adjustments, amount=$amount, creditsApplied=$creditsApplied, endDate=$endDate, filter=$filter, grouping=$grouping, name=$name, partiallyInvoicedAmount=$partiallyInvoicedAmount, price=$price, quantity=$quantity, startDate=$startDate, subLineItems=$subLineItems, subtotal=$subtotal, taxAmounts=$taxAmounts, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
}
