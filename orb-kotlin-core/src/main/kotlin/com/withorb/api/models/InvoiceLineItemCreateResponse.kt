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
    private val discount: JsonField<Discount>,
    private val endDate: JsonField<OffsetDateTime>,
    private val filter: JsonField<String>,
    private val grouping: JsonField<String>,
    private val maximum: JsonField<Maximum>,
    private val maximumAmount: JsonField<String>,
    private val minimum: JsonField<Minimum>,
    private val minimumAmount: JsonField<String>,
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
        @JsonProperty("discount") @ExcludeMissing discount: JsonField<Discount> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("grouping") @ExcludeMissing grouping: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maximum") @ExcludeMissing maximum: JsonField<Maximum> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minimum") @ExcludeMissing minimum: JsonField<Minimum> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        minimumAmount: JsonField<String> = JsonMissing.of(),
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
        discount,
        endDate,
        filter,
        grouping,
        maximum,
        maximumAmount,
        minimum,
        minimumAmount,
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
     * This field is deprecated in favor of `adjustments`
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated") fun discount(): Discount? = discount.getNullable("discount")

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
     * This field is deprecated in favor of `adjustments`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated") fun maximum(): Maximum? = maximum.getNullable("maximum")

    /**
     * This field is deprecated in favor of `adjustments`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

    /**
     * This field is deprecated in favor of `adjustments`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated") fun minimum(): Minimum? = minimum.getNullable("minimum")

    /**
     * This field is deprecated in favor of `adjustments`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

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
     * Returns the raw JSON value of [discount].
     *
     * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("discount")
    @ExcludeMissing
    fun _discount(): JsonField<Discount> = discount

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
     * Returns the raw JSON value of [maximum].
     *
     * Unlike [maximum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("maximum")
    @ExcludeMissing
    fun _maximum(): JsonField<Maximum> = maximum

    /**
     * Returns the raw JSON value of [maximumAmount].
     *
     * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    fun _maximumAmount(): JsonField<String> = maximumAmount

    /**
     * Returns the raw JSON value of [minimum].
     *
     * Unlike [minimum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("minimum")
    @ExcludeMissing
    fun _minimum(): JsonField<Minimum> = minimum

    /**
     * Returns the raw JSON value of [minimumAmount].
     *
     * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    fun _minimumAmount(): JsonField<String> = minimumAmount

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
         * .discount()
         * .endDate()
         * .filter()
         * .grouping()
         * .maximum()
         * .maximumAmount()
         * .minimum()
         * .minimumAmount()
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
        private var discount: JsonField<Discount>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var filter: JsonField<String>? = null
        private var grouping: JsonField<String>? = null
        private var maximum: JsonField<Maximum>? = null
        private var maximumAmount: JsonField<String>? = null
        private var minimum: JsonField<Minimum>? = null
        private var minimumAmount: JsonField<String>? = null
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
            discount = invoiceLineItemCreateResponse.discount
            endDate = invoiceLineItemCreateResponse.endDate
            filter = invoiceLineItemCreateResponse.filter
            grouping = invoiceLineItemCreateResponse.grouping
            maximum = invoiceLineItemCreateResponse.maximum
            maximumAmount = invoiceLineItemCreateResponse.maximumAmount
            minimum = invoiceLineItemCreateResponse.minimum
            minimumAmount = invoiceLineItemCreateResponse.minimumAmount
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

        /** This field is deprecated in favor of `adjustments` */
        @Deprecated("deprecated")
        fun discount(discount: Discount?) = discount(JsonField.ofNullable(discount))

        /**
         * Sets [Builder.discount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discount] with a well-typed [Discount] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

        /** Alias for calling [discount] with `Discount.ofPercentage(percentage)`. */
        @Deprecated("deprecated")
        fun discount(percentage: PercentageDiscount) = discount(Discount.ofPercentage(percentage))

        /**
         * Alias for calling [discount] with the following:
         * ```kotlin
         * PercentageDiscount.builder()
         *     .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
         *     .percentageDiscount(percentageDiscount)
         *     .build()
         * ```
         */
        @Deprecated("deprecated")
        fun percentageDiscount(percentageDiscount: Double) =
            discount(
                PercentageDiscount.builder()
                    .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                    .percentageDiscount(percentageDiscount)
                    .build()
            )

        /** Alias for calling [discount] with `Discount.ofTrial(trial)`. */
        @Deprecated("deprecated")
        fun discount(trial: TrialDiscount) = discount(Discount.ofTrial(trial))

        /** Alias for calling [discount] with `Discount.ofUsage(usage)`. */
        @Deprecated("deprecated")
        fun discount(usage: UsageDiscount) = discount(Discount.ofUsage(usage))

        /**
         * Alias for calling [discount] with the following:
         * ```kotlin
         * UsageDiscount.builder()
         *     .discountType(UsageDiscount.DiscountType.USAGE)
         *     .usageDiscount(usageDiscount)
         *     .build()
         * ```
         */
        @Deprecated("deprecated")
        fun usageDiscount(usageDiscount: Double) =
            discount(
                UsageDiscount.builder()
                    .discountType(UsageDiscount.DiscountType.USAGE)
                    .usageDiscount(usageDiscount)
                    .build()
            )

        /** Alias for calling [discount] with `Discount.ofAmount(amount)`. */
        @Deprecated("deprecated")
        fun discount(amount: AmountDiscount) = discount(Discount.ofAmount(amount))

        /**
         * Alias for calling [discount] with the following:
         * ```kotlin
         * AmountDiscount.builder()
         *     .discountType(AmountDiscount.DiscountType.AMOUNT)
         *     .amountDiscount(amountDiscount)
         *     .build()
         * ```
         */
        @Deprecated("deprecated")
        fun amountDiscount(amountDiscount: String) =
            discount(
                AmountDiscount.builder()
                    .discountType(AmountDiscount.DiscountType.AMOUNT)
                    .amountDiscount(amountDiscount)
                    .build()
            )

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

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun maximum(maximum: Maximum?) = maximum(JsonField.ofNullable(maximum))

        /**
         * Sets [Builder.maximum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximum] with a well-typed [Maximum] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun maximumAmount(maximumAmount: String?) =
            maximumAmount(JsonField.ofNullable(maximumAmount))

        /**
         * Sets [Builder.maximumAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
        }

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun minimum(minimum: Minimum?) = minimum(JsonField.ofNullable(minimum))

        /**
         * Sets [Builder.minimum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimum] with a well-typed [Minimum] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun minimumAmount(minimumAmount: String?) =
            minimumAmount(JsonField.ofNullable(minimumAmount))

        /**
         * Sets [Builder.minimumAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

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
        fun price(unit: Price.Unit) = price(Price.ofUnit(unit))

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

        /** Alias for calling [price] with `Price.ofMinimum(minimum)`. */
        fun price(minimum: Price.Minimum) = price(Price.ofMinimum(minimum))

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
         * .discount()
         * .endDate()
         * .filter()
         * .grouping()
         * .maximum()
         * .maximumAmount()
         * .minimum()
         * .minimumAmount()
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
                checkRequired("discount", discount),
                checkRequired("endDate", endDate),
                checkRequired("filter", filter),
                checkRequired("grouping", grouping),
                checkRequired("maximum", maximum),
                checkRequired("maximumAmount", maximumAmount),
                checkRequired("minimum", minimum),
                checkRequired("minimumAmount", minimumAmount),
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

    fun validate(): InvoiceLineItemCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        adjustedSubtotal()
        adjustments().forEach { it.validate() }
        amount()
        creditsApplied()
        discount()?.validate()
        endDate()
        filter()
        grouping()
        maximum()?.validate()
        maximumAmount()
        minimum()?.validate()
        minimumAmount()
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
            (discount.asKnown()?.validity() ?: 0) +
            (if (endDate.asKnown() == null) 0 else 1) +
            (if (filter.asKnown() == null) 0 else 1) +
            (if (grouping.asKnown() == null) 0 else 1) +
            (maximum.asKnown()?.validity() ?: 0) +
            (if (maximumAmount.asKnown() == null) 0 else 1) +
            (minimum.asKnown()?.validity() ?: 0) +
            (if (minimumAmount.asKnown() == null) 0 else 1) +
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
        private val minimum: MonetaryMinimumAdjustment? = null,
        private val maximum: MonetaryMaximumAdjustment? = null,
        private val _json: JsonValue? = null,
    ) {

        fun usageDiscount(): MonetaryUsageDiscountAdjustment? = usageDiscount

        fun amountDiscount(): MonetaryAmountDiscountAdjustment? = amountDiscount

        fun percentageDiscount(): MonetaryPercentageDiscountAdjustment? = percentageDiscount

        fun minimum(): MonetaryMinimumAdjustment? = minimum

        fun maximum(): MonetaryMaximumAdjustment? = maximum

        fun isUsageDiscount(): Boolean = usageDiscount != null

        fun isAmountDiscount(): Boolean = amountDiscount != null

        fun isPercentageDiscount(): Boolean = percentageDiscount != null

        fun isMinimum(): Boolean = minimum != null

        fun isMaximum(): Boolean = maximum != null

        fun asUsageDiscount(): MonetaryUsageDiscountAdjustment =
            usageDiscount.getOrThrow("usageDiscount")

        fun asAmountDiscount(): MonetaryAmountDiscountAdjustment =
            amountDiscount.getOrThrow("amountDiscount")

        fun asPercentageDiscount(): MonetaryPercentageDiscountAdjustment =
            percentageDiscount.getOrThrow("percentageDiscount")

        fun asMinimum(): MonetaryMinimumAdjustment = minimum.getOrThrow("minimum")

        fun asMaximum(): MonetaryMaximumAdjustment = maximum.getOrThrow("maximum")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
                percentageDiscount != null -> visitor.visitPercentageDiscount(percentageDiscount)
                minimum != null -> visitor.visitMinimum(minimum)
                maximum != null -> visitor.visitMaximum(maximum)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

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
                minimum == other.minimum &&
                maximum == other.maximum
        }

        override fun hashCode(): Int =
            Objects.hash(usageDiscount, amountDiscount, percentageDiscount, minimum, maximum)

        override fun toString(): String =
            when {
                usageDiscount != null -> "Adjustment{usageDiscount=$usageDiscount}"
                amountDiscount != null -> "Adjustment{amountDiscount=$amountDiscount}"
                percentageDiscount != null -> "Adjustment{percentageDiscount=$percentageDiscount}"
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
                    value.minimum != null -> generator.writeObject(value.minimum)
                    value.maximum != null -> generator.writeObject(value.maximum)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Adjustment")
                }
            }
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

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                matrix != null -> visitor.visitMatrix(matrix)
                tier != null -> visitor.visitTier(tier)
                null_ != null -> visitor.visitNull(null_)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

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
            discount == other.discount &&
            endDate == other.endDate &&
            filter == other.filter &&
            grouping == other.grouping &&
            maximum == other.maximum &&
            maximumAmount == other.maximumAmount &&
            minimum == other.minimum &&
            minimumAmount == other.minimumAmount &&
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
            discount,
            endDate,
            filter,
            grouping,
            maximum,
            maximumAmount,
            minimum,
            minimumAmount,
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
        "InvoiceLineItemCreateResponse{id=$id, adjustedSubtotal=$adjustedSubtotal, adjustments=$adjustments, amount=$amount, creditsApplied=$creditsApplied, discount=$discount, endDate=$endDate, filter=$filter, grouping=$grouping, maximum=$maximum, maximumAmount=$maximumAmount, minimum=$minimum, minimumAmount=$minimumAmount, name=$name, partiallyInvoicedAmount=$partiallyInvoicedAmount, price=$price, quantity=$quantity, startDate=$startDate, subLineItems=$subLineItems, subtotal=$subtotal, taxAmounts=$taxAmounts, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
}
