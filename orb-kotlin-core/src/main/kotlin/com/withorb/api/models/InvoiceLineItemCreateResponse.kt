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
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun discount(): Discount? = discount.getNullable("discount")

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
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun price(): Price? = price.getNullable("price")

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
     * The line amount before before any adjustments.
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
    @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Discount> = discount

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
        fun addAdjustment(usageDiscount: Adjustment.UsageDiscount) =
            addAdjustment(Adjustment.ofUsageDiscount(usageDiscount))

        /** Alias for calling [addAdjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`. */
        fun addAdjustment(amountDiscount: Adjustment.AmountDiscount) =
            addAdjustment(Adjustment.ofAmountDiscount(amountDiscount))

        /**
         * Alias for calling [addAdjustment] with
         * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
         */
        fun addAdjustment(percentageDiscount: Adjustment.PercentageDiscount) =
            addAdjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

        /** Alias for calling [addAdjustment] with `Adjustment.ofMinimum(minimum)`. */
        fun addAdjustment(minimum: Adjustment.Minimum) =
            addAdjustment(Adjustment.ofMinimum(minimum))

        /** Alias for calling [addAdjustment] with `Adjustment.ofMaximum(maximum)`. */
        fun addAdjustment(maximum: Adjustment.Maximum) =
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

        fun discount(discount: Discount?) = discount(JsonField.ofNullable(discount))

        /**
         * Sets [Builder.discount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discount] with a well-typed [Discount] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

        /** Alias for calling [discount] with `Discount.ofPercentage(percentage)`. */
        fun discount(percentage: PercentageDiscount) = discount(Discount.ofPercentage(percentage))

        /** Alias for calling [discount] with `Discount.ofTrial(trial)`. */
        fun discount(trial: TrialDiscount) = discount(Discount.ofTrial(trial))

        /**
         * Alias for calling [discount] with the following:
         * ```kotlin
         * TrialDiscount.builder()
         *     .discountType(TrialDiscount.DiscountType.TRIAL)
         *     .appliesToPriceIds(appliesToPriceIds)
         *     .build()
         * ```
         */
        fun trialDiscount(appliesToPriceIds: List<String>) =
            discount(
                TrialDiscount.builder()
                    .discountType(TrialDiscount.DiscountType.TRIAL)
                    .appliesToPriceIds(appliesToPriceIds)
                    .build()
            )

        /** Alias for calling [discount] with `Discount.ofUsage(usage)`. */
        fun discount(usage: UsageDiscount) = discount(Discount.ofUsage(usage))

        /** Alias for calling [discount] with `Discount.ofAmount(amount)`. */
        fun discount(amount: AmountDiscount) = discount(Discount.ofAmount(amount))

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
        fun price(price: Price?) = price(JsonField.ofNullable(price))

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
        fun addSubLineItem(matrix: SubLineItem.Matrix) =
            addSubLineItem(SubLineItem.ofMatrix(matrix))

        /** Alias for calling [addSubLineItem] with `SubLineItem.ofTier(tier)`. */
        fun addSubLineItem(tier: SubLineItem.Tier) = addSubLineItem(SubLineItem.ofTier(tier))

        /** Alias for calling [addSubLineItem] with `SubLineItem.ofNull(null_)`. */
        fun addSubLineItem(null_: SubLineItem.Null) = addSubLineItem(SubLineItem.ofNull(null_))

        /** The line amount before before any adjustments. */
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
        price()?.validate()
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
        private val usageDiscount: UsageDiscount? = null,
        private val amountDiscount: AmountDiscount? = null,
        private val percentageDiscount: PercentageDiscount? = null,
        private val minimum: Minimum? = null,
        private val maximum: Maximum? = null,
        private val _json: JsonValue? = null,
    ) {

        fun usageDiscount(): UsageDiscount? = usageDiscount

        fun amountDiscount(): AmountDiscount? = amountDiscount

        fun percentageDiscount(): PercentageDiscount? = percentageDiscount

        fun minimum(): Minimum? = minimum

        fun maximum(): Maximum? = maximum

        fun isUsageDiscount(): Boolean = usageDiscount != null

        fun isAmountDiscount(): Boolean = amountDiscount != null

        fun isPercentageDiscount(): Boolean = percentageDiscount != null

        fun isMinimum(): Boolean = minimum != null

        fun isMaximum(): Boolean = maximum != null

        fun asUsageDiscount(): UsageDiscount = usageDiscount.getOrThrow("usageDiscount")

        fun asAmountDiscount(): AmountDiscount = amountDiscount.getOrThrow("amountDiscount")

        fun asPercentageDiscount(): PercentageDiscount =
            percentageDiscount.getOrThrow("percentageDiscount")

        fun asMinimum(): Minimum = minimum.getOrThrow("minimum")

        fun asMaximum(): Maximum = maximum.getOrThrow("maximum")

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
                    override fun visitUsageDiscount(usageDiscount: UsageDiscount) {
                        usageDiscount.validate()
                    }

                    override fun visitAmountDiscount(amountDiscount: AmountDiscount) {
                        amountDiscount.validate()
                    }

                    override fun visitPercentageDiscount(percentageDiscount: PercentageDiscount) {
                        percentageDiscount.validate()
                    }

                    override fun visitMinimum(minimum: Minimum) {
                        minimum.validate()
                    }

                    override fun visitMaximum(maximum: Maximum) {
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
                    override fun visitUsageDiscount(usageDiscount: UsageDiscount) =
                        usageDiscount.validity()

                    override fun visitAmountDiscount(amountDiscount: AmountDiscount) =
                        amountDiscount.validity()

                    override fun visitPercentageDiscount(percentageDiscount: PercentageDiscount) =
                        percentageDiscount.validity()

                    override fun visitMinimum(minimum: Minimum) = minimum.validity()

                    override fun visitMaximum(maximum: Maximum) = maximum.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Adjustment && usageDiscount == other.usageDiscount && amountDiscount == other.amountDiscount && percentageDiscount == other.percentageDiscount && minimum == other.minimum && maximum == other.maximum /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(usageDiscount, amountDiscount, percentageDiscount, minimum, maximum) /* spotless:on */

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

            fun ofUsageDiscount(usageDiscount: UsageDiscount) =
                Adjustment(usageDiscount = usageDiscount)

            fun ofAmountDiscount(amountDiscount: AmountDiscount) =
                Adjustment(amountDiscount = amountDiscount)

            fun ofPercentageDiscount(percentageDiscount: PercentageDiscount) =
                Adjustment(percentageDiscount = percentageDiscount)

            fun ofMinimum(minimum: Minimum) = Adjustment(minimum = minimum)

            fun ofMaximum(maximum: Maximum) = Adjustment(maximum = maximum)
        }

        /**
         * An interface that defines how to map each variant of [Adjustment] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitUsageDiscount(usageDiscount: UsageDiscount): T

            fun visitAmountDiscount(amountDiscount: AmountDiscount): T

            fun visitPercentageDiscount(percentageDiscount: PercentageDiscount): T

            fun visitMinimum(minimum: Minimum): T

            fun visitMaximum(maximum: Maximum): T

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
                        return tryDeserialize(node, jacksonTypeRef<UsageDiscount>())?.let {
                            Adjustment(usageDiscount = it, _json = json)
                        } ?: Adjustment(_json = json)
                    }
                    "amount_discount" -> {
                        return tryDeserialize(node, jacksonTypeRef<AmountDiscount>())?.let {
                            Adjustment(amountDiscount = it, _json = json)
                        } ?: Adjustment(_json = json)
                    }
                    "percentage_discount" -> {
                        return tryDeserialize(node, jacksonTypeRef<PercentageDiscount>())?.let {
                            Adjustment(percentageDiscount = it, _json = json)
                        } ?: Adjustment(_json = json)
                    }
                    "minimum" -> {
                        return tryDeserialize(node, jacksonTypeRef<Minimum>())?.let {
                            Adjustment(minimum = it, _json = json)
                        } ?: Adjustment(_json = json)
                    }
                    "maximum" -> {
                        return tryDeserialize(node, jacksonTypeRef<Maximum>())?.let {
                            Adjustment(maximum = it, _json = json)
                        } ?: Adjustment(_json = json)
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

        class UsageDiscount
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonValue,
            private val amount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val isInvoiceLevel: JsonField<Boolean>,
            private val reason: JsonField<String>,
            private val usageDiscount: JsonField<Double>,
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
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("usage_discount")
                @ExcludeMissing
                usageDiscount: JsonField<Double> = JsonMissing.of(),
            ) : this(
                id,
                adjustmentType,
                amount,
                appliesToPriceIds,
                isInvoiceLevel,
                reason,
                usageDiscount,
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
             * JsonValue.from("usage_discount")
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
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
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
             * The number of usage units by which to discount the price this adjustment applies to
             * in a given billing period.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

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
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

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
             * Returns the raw JSON value of [usageDiscount].
             *
             * Unlike [usageDiscount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usage_discount")
            @ExcludeMissing
            fun _usageDiscount(): JsonField<Double> = usageDiscount

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
                 * Returns a mutable builder for constructing an instance of [UsageDiscount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .reason()
                 * .usageDiscount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UsageDiscount]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonValue = JsonValue.from("usage_discount")
                private var amount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var reason: JsonField<String>? = null
                private var usageDiscount: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(usageDiscount: UsageDiscount) = apply {
                    id = usageDiscount.id
                    adjustmentType = usageDiscount.adjustmentType
                    amount = usageDiscount.amount
                    appliesToPriceIds = usageDiscount.appliesToPriceIds.map { it.toMutableList() }
                    isInvoiceLevel = usageDiscount.isInvoiceLevel
                    reason = usageDiscount.reason
                    this.usageDiscount = usageDiscount.usageDiscount
                    additionalProperties = usageDiscount.additionalProperties.toMutableMap()
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
                 * JsonValue.from("usage_discount")
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
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
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
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 */
                fun usageDiscount(usageDiscount: Double) =
                    usageDiscount(JsonField.of(usageDiscount))

                /**
                 * Sets [Builder.usageDiscount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageDiscount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                    this.usageDiscount = usageDiscount
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
                 * Returns an immutable instance of [UsageDiscount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .reason()
                 * .usageDiscount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UsageDiscount =
                    UsageDiscount(
                        checkRequired("id", id),
                        adjustmentType,
                        checkRequired("amount", amount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("reason", reason),
                        checkRequired("usageDiscount", usageDiscount),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UsageDiscount = apply {
                if (validated) {
                    return@apply
                }

                id()
                _adjustmentType().let {
                    if (it != JsonValue.from("usage_discount")) {
                        throw OrbInvalidDataException("'adjustmentType' is invalid, received $it")
                    }
                }
                amount()
                appliesToPriceIds()
                isInvoiceLevel()
                reason()
                usageDiscount()
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
                    adjustmentType.let { if (it == JsonValue.from("usage_discount")) 1 else 0 } +
                    (if (amount.asKnown() == null) 0 else 1) +
                    (appliesToPriceIds.asKnown()?.size ?: 0) +
                    (if (isInvoiceLevel.asKnown() == null) 0 else 1) +
                    (if (reason.asKnown() == null) 0 else 1) +
                    (if (usageDiscount.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UsageDiscount && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && reason == other.reason && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, appliesToPriceIds, isInvoiceLevel, reason, usageDiscount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsageDiscount{id=$id, adjustmentType=$adjustmentType, amount=$amount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, reason=$reason, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
        }

        class AmountDiscount
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonValue,
            private val amount: JsonField<String>,
            private val amountDiscount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val isInvoiceLevel: JsonField<Boolean>,
            private val reason: JsonField<String>,
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
                @JsonProperty("amount_discount")
                @ExcludeMissing
                amountDiscount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                adjustmentType,
                amount,
                amountDiscount,
                appliesToPriceIds,
                isInvoiceLevel,
                reason,
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
             * JsonValue.from("amount_discount")
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
             * The amount by which to discount the prices this adjustment applies to in a given
             * billing period.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

            /**
             * The price IDs that this adjustment applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
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
             * Returns the raw JSON value of [amountDiscount].
             *
             * Unlike [amountDiscount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("amount_discount")
            @ExcludeMissing
            fun _amountDiscount(): JsonField<String> = amountDiscount

            /**
             * Returns the raw JSON value of [appliesToPriceIds].
             *
             * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

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
                 * Returns a mutable builder for constructing an instance of [AmountDiscount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amount()
                 * .amountDiscount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .reason()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [AmountDiscount]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonValue = JsonValue.from("amount_discount")
                private var amount: JsonField<String>? = null
                private var amountDiscount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(amountDiscount: AmountDiscount) = apply {
                    id = amountDiscount.id
                    adjustmentType = amountDiscount.adjustmentType
                    amount = amountDiscount.amount
                    this.amountDiscount = amountDiscount.amountDiscount
                    appliesToPriceIds = amountDiscount.appliesToPriceIds.map { it.toMutableList() }
                    isInvoiceLevel = amountDiscount.isInvoiceLevel
                    reason = amountDiscount.reason
                    additionalProperties = amountDiscount.additionalProperties.toMutableMap()
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
                 * JsonValue.from("amount_discount")
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

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 */
                fun amountDiscount(amountDiscount: String) =
                    amountDiscount(JsonField.of(amountDiscount))

                /**
                 * Sets [Builder.amountDiscount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountDiscount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                    this.amountDiscount = amountDiscount
                }

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
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
                 * Returns an immutable instance of [AmountDiscount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amount()
                 * .amountDiscount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AmountDiscount =
                    AmountDiscount(
                        checkRequired("id", id),
                        adjustmentType,
                        checkRequired("amount", amount),
                        checkRequired("amountDiscount", amountDiscount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("reason", reason),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AmountDiscount = apply {
                if (validated) {
                    return@apply
                }

                id()
                _adjustmentType().let {
                    if (it != JsonValue.from("amount_discount")) {
                        throw OrbInvalidDataException("'adjustmentType' is invalid, received $it")
                    }
                }
                amount()
                amountDiscount()
                appliesToPriceIds()
                isInvoiceLevel()
                reason()
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
                    adjustmentType.let { if (it == JsonValue.from("amount_discount")) 1 else 0 } +
                    (if (amount.asKnown() == null) 0 else 1) +
                    (if (amountDiscount.asKnown() == null) 0 else 1) +
                    (appliesToPriceIds.asKnown()?.size ?: 0) +
                    (if (isInvoiceLevel.asKnown() == null) 0 else 1) +
                    (if (reason.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AmountDiscount && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, amountDiscount, appliesToPriceIds, isInvoiceLevel, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AmountDiscount{id=$id, adjustmentType=$adjustmentType, amount=$amount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, reason=$reason, additionalProperties=$additionalProperties}"
        }

        class PercentageDiscount
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonValue,
            private val amount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val isInvoiceLevel: JsonField<Boolean>,
            private val percentageDiscount: JsonField<Double>,
            private val reason: JsonField<String>,
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
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                percentageDiscount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                adjustmentType,
                amount,
                appliesToPriceIds,
                isInvoiceLevel,
                percentageDiscount,
                reason,
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
             * JsonValue.from("percentage_discount")
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
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

            /**
             * The percentage (as a value between 0 and 1) by which to discount the price intervals
             * this adjustment applies to in a given billing period.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            /**
             * The reason for the adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): String? = reason.getNullable("reason")

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
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

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
             * Returns the raw JSON value of [percentageDiscount].
             *
             * Unlike [percentageDiscount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount(): JsonField<Double> = percentageDiscount

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                 * Returns a mutable builder for constructing an instance of [PercentageDiscount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .percentageDiscount()
                 * .reason()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PercentageDiscount]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonValue = JsonValue.from("percentage_discount")
                private var amount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var percentageDiscount: JsonField<Double>? = null
                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(percentageDiscount: PercentageDiscount) = apply {
                    id = percentageDiscount.id
                    adjustmentType = percentageDiscount.adjustmentType
                    amount = percentageDiscount.amount
                    appliesToPriceIds =
                        percentageDiscount.appliesToPriceIds.map { it.toMutableList() }
                    isInvoiceLevel = percentageDiscount.isInvoiceLevel
                    this.percentageDiscount = percentageDiscount.percentageDiscount
                    reason = percentageDiscount.reason
                    additionalProperties = percentageDiscount.additionalProperties.toMutableMap()
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
                 * JsonValue.from("percentage_discount")
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
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
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

                /**
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 */
                fun percentageDiscount(percentageDiscount: Double) =
                    percentageDiscount(JsonField.of(percentageDiscount))

                /**
                 * Sets [Builder.percentageDiscount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.percentageDiscount] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                    this.percentageDiscount = percentageDiscount
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
                 * Returns an immutable instance of [PercentageDiscount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .percentageDiscount()
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PercentageDiscount =
                    PercentageDiscount(
                        checkRequired("id", id),
                        adjustmentType,
                        checkRequired("amount", amount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("percentageDiscount", percentageDiscount),
                        checkRequired("reason", reason),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PercentageDiscount = apply {
                if (validated) {
                    return@apply
                }

                id()
                _adjustmentType().let {
                    if (it != JsonValue.from("percentage_discount")) {
                        throw OrbInvalidDataException("'adjustmentType' is invalid, received $it")
                    }
                }
                amount()
                appliesToPriceIds()
                isInvoiceLevel()
                percentageDiscount()
                reason()
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
                        if (it == JsonValue.from("percentage_discount")) 1 else 0
                    } +
                    (if (amount.asKnown() == null) 0 else 1) +
                    (appliesToPriceIds.asKnown()?.size ?: 0) +
                    (if (isInvoiceLevel.asKnown() == null) 0 else 1) +
                    (if (percentageDiscount.asKnown() == null) 0 else 1) +
                    (if (reason.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PercentageDiscount && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && percentageDiscount == other.percentageDiscount && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, appliesToPriceIds, isInvoiceLevel, percentageDiscount, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PercentageDiscount{id=$id, adjustmentType=$adjustmentType, amount=$amount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, percentageDiscount=$percentageDiscount, reason=$reason, additionalProperties=$additionalProperties}"
        }

        class Minimum
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonValue,
            private val amount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val isInvoiceLevel: JsonField<Boolean>,
            private val itemId: JsonField<String>,
            private val minimumAmount: JsonField<String>,
            private val reason: JsonField<String>,
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
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("item_id")
                @ExcludeMissing
                itemId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                minimumAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                adjustmentType,
                amount,
                appliesToPriceIds,
                isInvoiceLevel,
                itemId,
                minimumAmount,
                reason,
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
             * JsonValue.from("minimum")
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
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

            /**
             * The item ID that revenue from this minimum will be attributed to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun itemId(): String = itemId.getRequired("item_id")

            /**
             * The minimum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * The reason for the adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): String? = reason.getNullable("reason")

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
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

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
             * Returns the raw JSON value of [itemId].
             *
             * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

            /**
             * Returns the raw JSON value of [minimumAmount].
             *
             * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun _minimumAmount(): JsonField<String> = minimumAmount

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                 * .id()
                 * .amount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .itemId()
                 * .minimumAmount()
                 * .reason()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Minimum]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonValue = JsonValue.from("minimum")
                private var amount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var itemId: JsonField<String>? = null
                private var minimumAmount: JsonField<String>? = null
                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    id = minimum.id
                    adjustmentType = minimum.adjustmentType
                    amount = minimum.amount
                    appliesToPriceIds = minimum.appliesToPriceIds.map { it.toMutableList() }
                    isInvoiceLevel = minimum.isInvoiceLevel
                    itemId = minimum.itemId
                    minimumAmount = minimum.minimumAmount
                    reason = minimum.reason
                    additionalProperties = minimum.additionalProperties.toMutableMap()
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
                 * JsonValue.from("minimum")
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
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
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

                /** The item ID that revenue from this minimum will be attributed to. */
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
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /**
                 * Sets [Builder.minimumAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.minimumAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
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
                 * .id()
                 * .amount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .itemId()
                 * .minimumAmount()
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Minimum =
                    Minimum(
                        checkRequired("id", id),
                        adjustmentType,
                        checkRequired("amount", amount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("itemId", itemId),
                        checkRequired("minimumAmount", minimumAmount),
                        checkRequired("reason", reason),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Minimum = apply {
                if (validated) {
                    return@apply
                }

                id()
                _adjustmentType().let {
                    if (it != JsonValue.from("minimum")) {
                        throw OrbInvalidDataException("'adjustmentType' is invalid, received $it")
                    }
                }
                amount()
                appliesToPriceIds()
                isInvoiceLevel()
                itemId()
                minimumAmount()
                reason()
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
                    adjustmentType.let { if (it == JsonValue.from("minimum")) 1 else 0 } +
                    (if (amount.asKnown() == null) 0 else 1) +
                    (appliesToPriceIds.asKnown()?.size ?: 0) +
                    (if (isInvoiceLevel.asKnown() == null) 0 else 1) +
                    (if (itemId.asKnown() == null) 0 else 1) +
                    (if (minimumAmount.asKnown() == null) 0 else 1) +
                    (if (reason.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Minimum && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && itemId == other.itemId && minimumAmount == other.minimumAmount && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, appliesToPriceIds, isInvoiceLevel, itemId, minimumAmount, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Minimum{id=$id, adjustmentType=$adjustmentType, amount=$amount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, itemId=$itemId, minimumAmount=$minimumAmount, reason=$reason, additionalProperties=$additionalProperties}"
        }

        class Maximum
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonValue,
            private val amount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val isInvoiceLevel: JsonField<Boolean>,
            private val maximumAmount: JsonField<String>,
            private val reason: JsonField<String>,
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
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                maximumAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                adjustmentType,
                amount,
                appliesToPriceIds,
                isInvoiceLevel,
                maximumAmount,
                reason,
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
             * JsonValue.from("maximum")
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
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

            /**
             * The maximum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * The reason for the adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): String? = reason.getNullable("reason")

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
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

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
             * Returns the raw JSON value of [maximumAmount].
             *
             * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun _maximumAmount(): JsonField<String> = maximumAmount

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                 * Returns a mutable builder for constructing an instance of [Maximum].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .maximumAmount()
                 * .reason()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Maximum]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonValue = JsonValue.from("maximum")
                private var amount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var maximumAmount: JsonField<String>? = null
                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    id = maximum.id
                    adjustmentType = maximum.adjustmentType
                    amount = maximum.amount
                    appliesToPriceIds = maximum.appliesToPriceIds.map { it.toMutableList() }
                    isInvoiceLevel = maximum.isInvoiceLevel
                    maximumAmount = maximum.maximumAmount
                    reason = maximum.reason
                    additionalProperties = maximum.additionalProperties.toMutableMap()
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
                 * JsonValue.from("maximum")
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
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
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

                /**
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /**
                 * Sets [Builder.maximumAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maximumAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
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
                 * Returns an immutable instance of [Maximum].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .amount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .maximumAmount()
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Maximum =
                    Maximum(
                        checkRequired("id", id),
                        adjustmentType,
                        checkRequired("amount", amount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("maximumAmount", maximumAmount),
                        checkRequired("reason", reason),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Maximum = apply {
                if (validated) {
                    return@apply
                }

                id()
                _adjustmentType().let {
                    if (it != JsonValue.from("maximum")) {
                        throw OrbInvalidDataException("'adjustmentType' is invalid, received $it")
                    }
                }
                amount()
                appliesToPriceIds()
                isInvoiceLevel()
                maximumAmount()
                reason()
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
                    adjustmentType.let { if (it == JsonValue.from("maximum")) 1 else 0 } +
                    (if (amount.asKnown() == null) 0 else 1) +
                    (appliesToPriceIds.asKnown()?.size ?: 0) +
                    (if (isInvoiceLevel.asKnown() == null) 0 else 1) +
                    (if (maximumAmount.asKnown() == null) 0 else 1) +
                    (if (reason.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Maximum && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && maximumAmount == other.maximumAmount && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, appliesToPriceIds, isInvoiceLevel, maximumAmount, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Maximum{id=$id, adjustmentType=$adjustmentType, amount=$amount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, maximumAmount=$maximumAmount, reason=$reason, additionalProperties=$additionalProperties}"
        }
    }

    /** This field is deprecated in favor of `adjustments`. */
    @Deprecated("deprecated")
    class Maximum
    private constructor(
        private val appliesToPriceIds: JsonField<List<String>>,
        private val maximumAmount: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            maximumAmount: JsonField<String> = JsonMissing.of(),
        ) : this(appliesToPriceIds, maximumAmount, mutableMapOf())

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /**
         * Maximum amount applied
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /**
         * Returns the raw JSON value of [appliesToPriceIds].
         *
         * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /**
         * Returns the raw JSON value of [maximumAmount].
         *
         * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

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
             * Returns a mutable builder for constructing an instance of [Maximum].
             *
             * The following fields are required:
             * ```kotlin
             * .appliesToPriceIds()
             * .maximumAmount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Maximum]. */
        class Builder internal constructor() {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var maximumAmount: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(maximum: Maximum) = apply {
                appliesToPriceIds = maximum.appliesToPriceIds.map { it.toMutableList() }
                maximumAmount = maximum.maximumAmount
                additionalProperties = maximum.additionalProperties.toMutableMap()
            }

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /**
             * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliesToPriceIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [appliesToPriceIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /** Maximum amount applied */
            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            /**
             * Sets [Builder.maximumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
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
             * Returns an immutable instance of [Maximum].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .appliesToPriceIds()
             * .maximumAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Maximum =
                Maximum(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("maximumAmount", maximumAmount),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Maximum = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            maximumAmount()
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
            (appliesToPriceIds.asKnown()?.size ?: 0) +
                (if (maximumAmount.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Maximum && appliesToPriceIds == other.appliesToPriceIds && maximumAmount == other.maximumAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, maximumAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Maximum{appliesToPriceIds=$appliesToPriceIds, maximumAmount=$maximumAmount, additionalProperties=$additionalProperties}"
    }

    /** This field is deprecated in favor of `adjustments`. */
    @Deprecated("deprecated")
    class Minimum
    private constructor(
        private val appliesToPriceIds: JsonField<List<String>>,
        private val minimumAmount: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            minimumAmount: JsonField<String> = JsonMissing.of(),
        ) : this(appliesToPriceIds, minimumAmount, mutableMapOf())

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /**
         * Minimum amount applied
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /**
         * Returns the raw JSON value of [appliesToPriceIds].
         *
         * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /**
         * Returns the raw JSON value of [minimumAmount].
         *
         * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

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
             * .appliesToPriceIds()
             * .minimumAmount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Minimum]. */
        class Builder internal constructor() {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var minimumAmount: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(minimum: Minimum) = apply {
                appliesToPriceIds = minimum.appliesToPriceIds.map { it.toMutableList() }
                minimumAmount = minimum.minimumAmount
                additionalProperties = minimum.additionalProperties.toMutableMap()
            }

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /**
             * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliesToPriceIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [appliesToPriceIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /** Minimum amount applied */
            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            /**
             * Sets [Builder.minimumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
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
             * Returns an immutable instance of [Minimum].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .appliesToPriceIds()
             * .minimumAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Minimum =
                Minimum(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("minimumAmount", minimumAmount),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Minimum = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            minimumAmount()
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
            (appliesToPriceIds.asKnown()?.size ?: 0) +
                (if (minimumAmount.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Minimum && appliesToPriceIds == other.appliesToPriceIds && minimumAmount == other.minimumAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, minimumAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Minimum{appliesToPriceIds=$appliesToPriceIds, minimumAmount=$minimumAmount, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = SubLineItem.Deserializer::class)
    @JsonSerialize(using = SubLineItem.Serializer::class)
    class SubLineItem
    private constructor(
        private val matrix: Matrix? = null,
        private val tier: Tier? = null,
        private val null_: Null? = null,
        private val _json: JsonValue? = null,
    ) {

        fun matrix(): Matrix? = matrix

        fun tier(): Tier? = tier

        fun null_(): Null? = null_

        fun isMatrix(): Boolean = matrix != null

        fun isTier(): Boolean = tier != null

        fun isNull(): Boolean = null_ != null

        fun asMatrix(): Matrix = matrix.getOrThrow("matrix")

        fun asTier(): Tier = tier.getOrThrow("tier")

        fun asNull(): Null = null_.getOrThrow("null_")

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
                    override fun visitMatrix(matrix: Matrix) {
                        matrix.validate()
                    }

                    override fun visitTier(tier: Tier) {
                        tier.validate()
                    }

                    override fun visitNull(null_: Null) {
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
                    override fun visitMatrix(matrix: Matrix) = matrix.validity()

                    override fun visitTier(tier: Tier) = tier.validity()

                    override fun visitNull(null_: Null) = null_.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SubLineItem && matrix == other.matrix && tier == other.tier && null_ == other.null_ /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(matrix, tier, null_) /* spotless:on */

        override fun toString(): String =
            when {
                matrix != null -> "SubLineItem{matrix=$matrix}"
                tier != null -> "SubLineItem{tier=$tier}"
                null_ != null -> "SubLineItem{null_=$null_}"
                _json != null -> "SubLineItem{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid SubLineItem")
            }

        companion object {

            fun ofMatrix(matrix: Matrix) = SubLineItem(matrix = matrix)

            fun ofTier(tier: Tier) = SubLineItem(tier = tier)

            fun ofNull(null_: Null) = SubLineItem(null_ = null_)
        }

        /**
         * An interface that defines how to map each variant of [SubLineItem] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitMatrix(matrix: Matrix): T

            fun visitTier(tier: Tier): T

            fun visitNull(null_: Null): T

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
                        return tryDeserialize(node, jacksonTypeRef<Matrix>())?.let {
                            SubLineItem(matrix = it, _json = json)
                        } ?: SubLineItem(_json = json)
                    }
                    "tier" -> {
                        return tryDeserialize(node, jacksonTypeRef<Tier>())?.let {
                            SubLineItem(tier = it, _json = json)
                        } ?: SubLineItem(_json = json)
                    }
                    "'null'" -> {
                        return tryDeserialize(node, jacksonTypeRef<Null>())?.let {
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

        class Matrix
        private constructor(
            private val amount: JsonField<String>,
            private val grouping: JsonField<Grouping>,
            private val matrixConfig: JsonField<MatrixConfig>,
            private val name: JsonField<String>,
            private val quantity: JsonField<Double>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("grouping")
                @ExcludeMissing
                grouping: JsonField<Grouping> = JsonMissing.of(),
                @JsonProperty("matrix_config")
                @ExcludeMissing
                matrixConfig: JsonField<MatrixConfig> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(amount, grouping, matrixConfig, name, quantity, type, mutableMapOf())

            /**
             * The total amount for this sub line item.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): String = amount.getRequired("amount")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun grouping(): Grouping? = grouping.getNullable("grouping")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun matrixConfig(): MatrixConfig = matrixConfig.getRequired("matrix_config")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quantity(): Double = quantity.getRequired("quantity")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("matrix")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [grouping].
             *
             * Unlike [grouping], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("grouping")
            @ExcludeMissing
            fun _grouping(): JsonField<Grouping> = grouping

            /**
             * Returns the raw JSON value of [matrixConfig].
             *
             * Unlike [matrixConfig], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("matrix_config")
            @ExcludeMissing
            fun _matrixConfig(): JsonField<MatrixConfig> = matrixConfig

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

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
                 * Returns a mutable builder for constructing an instance of [Matrix].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .grouping()
                 * .matrixConfig()
                 * .name()
                 * .quantity()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Matrix]. */
            class Builder internal constructor() {

                private var amount: JsonField<String>? = null
                private var grouping: JsonField<Grouping>? = null
                private var matrixConfig: JsonField<MatrixConfig>? = null
                private var name: JsonField<String>? = null
                private var quantity: JsonField<Double>? = null
                private var type: JsonValue = JsonValue.from("matrix")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(matrix: Matrix) = apply {
                    amount = matrix.amount
                    grouping = matrix.grouping
                    matrixConfig = matrix.matrixConfig
                    name = matrix.name
                    quantity = matrix.quantity
                    type = matrix.type
                    additionalProperties = matrix.additionalProperties.toMutableMap()
                }

                /** The total amount for this sub line item. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                /**
                 * Sets [Builder.grouping] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.grouping] with a well-typed [Grouping] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                fun matrixConfig(matrixConfig: MatrixConfig) =
                    matrixConfig(JsonField.of(matrixConfig))

                /**
                 * Sets [Builder.matrixConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.matrixConfig] with a well-typed [MatrixConfig]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun matrixConfig(matrixConfig: JsonField<MatrixConfig>) = apply {
                    this.matrixConfig = matrixConfig
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("matrix")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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
                 * Returns an immutable instance of [Matrix].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .grouping()
                 * .matrixConfig()
                 * .name()
                 * .quantity()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Matrix =
                    Matrix(
                        checkRequired("amount", amount),
                        checkRequired("grouping", grouping),
                        checkRequired("matrixConfig", matrixConfig),
                        checkRequired("name", name),
                        checkRequired("quantity", quantity),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Matrix = apply {
                if (validated) {
                    return@apply
                }

                amount()
                grouping()?.validate()
                matrixConfig().validate()
                name()
                quantity()
                _type().let {
                    if (it != JsonValue.from("matrix")) {
                        throw OrbInvalidDataException("'type' is invalid, received $it")
                    }
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (grouping.asKnown()?.validity() ?: 0) +
                    (matrixConfig.asKnown()?.validity() ?: 0) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (quantity.asKnown() == null) 0 else 1) +
                    type.let { if (it == JsonValue.from("matrix")) 1 else 0 }

            class Grouping
            private constructor(
                private val key: JsonField<String>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(key, value, mutableMapOf())

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun key(): String = key.getRequired("key")

                /**
                 * No value indicates the default group
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun value(): String? = value.getNullable("value")

                /**
                 * Returns the raw JSON value of [key].
                 *
                 * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                     * Returns a mutable builder for constructing an instance of [Grouping].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .key()
                     * .value()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Grouping]. */
                class Builder internal constructor() {

                    private var key: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(grouping: Grouping) = apply {
                        key = grouping.key
                        value = grouping.value
                        additionalProperties = grouping.additionalProperties.toMutableMap()
                    }

                    fun key(key: String) = key(JsonField.of(key))

                    /**
                     * Sets [Builder.key] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.key] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** No value indicates the default group */
                    fun value(value: String?) = value(JsonField.ofNullable(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [Grouping].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .key()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Grouping =
                        Grouping(
                            checkRequired("key", key),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Grouping = apply {
                    if (validated) {
                        return@apply
                    }

                    key()
                    value()
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
                    (if (key.asKnown() == null) 0 else 1) + (if (value.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Grouping && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Grouping{key=$key, value=$value, additionalProperties=$additionalProperties}"
            }

            class MatrixConfig
            private constructor(
                private val dimensionValues: JsonField<List<String?>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("dimension_values")
                    @ExcludeMissing
                    dimensionValues: JsonField<List<String?>> = JsonMissing.of()
                ) : this(dimensionValues, mutableMapOf())

                /**
                 * The ordered dimension values for this line item.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun dimensionValues(): List<String?> =
                    dimensionValues.getRequired("dimension_values")

                /**
                 * Returns the raw JSON value of [dimensionValues].
                 *
                 * Unlike [dimensionValues], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("dimension_values")
                @ExcludeMissing
                fun _dimensionValues(): JsonField<List<String?>> = dimensionValues

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
                     * Returns a mutable builder for constructing an instance of [MatrixConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .dimensionValues()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [MatrixConfig]. */
                class Builder internal constructor() {

                    private var dimensionValues: JsonField<MutableList<String?>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(matrixConfig: MatrixConfig) = apply {
                        dimensionValues = matrixConfig.dimensionValues.map { it.toMutableList() }
                        additionalProperties = matrixConfig.additionalProperties.toMutableMap()
                    }

                    /** The ordered dimension values for this line item. */
                    fun dimensionValues(dimensionValues: List<String?>) =
                        dimensionValues(JsonField.of(dimensionValues))

                    /**
                     * Sets [Builder.dimensionValues] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dimensionValues] with a well-typed
                     * `List<String?>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
                        this.dimensionValues = dimensionValues.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [dimensionValues].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addDimensionValue(dimensionValue: String) = apply {
                        dimensionValues =
                            (dimensionValues ?: JsonField.of(mutableListOf())).also {
                                checkKnown("dimensionValues", it).add(dimensionValue)
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
                     * Returns an immutable instance of [MatrixConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .dimensionValues()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): MatrixConfig =
                        MatrixConfig(
                            checkRequired("dimensionValues", dimensionValues).map {
                                it.toImmutable()
                            },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): MatrixConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    dimensionValues()
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
                    (dimensionValues.asKnown()?.sumOf { (if (it == null) 0 else 1).toInt() } ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MatrixConfig && dimensionValues == other.dimensionValues && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(dimensionValues, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MatrixConfig{dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Matrix && amount == other.amount && grouping == other.grouping && matrixConfig == other.matrixConfig && name == other.name && quantity == other.quantity && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, grouping, matrixConfig, name, quantity, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Matrix{amount=$amount, grouping=$grouping, matrixConfig=$matrixConfig, name=$name, quantity=$quantity, type=$type, additionalProperties=$additionalProperties}"
        }

        class Tier
        private constructor(
            private val amount: JsonField<String>,
            private val grouping: JsonField<Grouping>,
            private val name: JsonField<String>,
            private val quantity: JsonField<Double>,
            private val tierConfig: JsonField<TierConfig>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("grouping")
                @ExcludeMissing
                grouping: JsonField<Grouping> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("tier_config")
                @ExcludeMissing
                tierConfig: JsonField<TierConfig> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(amount, grouping, name, quantity, tierConfig, type, mutableMapOf())

            /**
             * The total amount for this sub line item.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): String = amount.getRequired("amount")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun grouping(): Grouping? = grouping.getNullable("grouping")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quantity(): Double = quantity.getRequired("quantity")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tierConfig(): TierConfig = tierConfig.getRequired("tier_config")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("tier")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [grouping].
             *
             * Unlike [grouping], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("grouping")
            @ExcludeMissing
            fun _grouping(): JsonField<Grouping> = grouping

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            /**
             * Returns the raw JSON value of [tierConfig].
             *
             * Unlike [tierConfig], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tier_config")
            @ExcludeMissing
            fun _tierConfig(): JsonField<TierConfig> = tierConfig

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
                 * .amount()
                 * .grouping()
                 * .name()
                 * .quantity()
                 * .tierConfig()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Tier]. */
            class Builder internal constructor() {

                private var amount: JsonField<String>? = null
                private var grouping: JsonField<Grouping>? = null
                private var name: JsonField<String>? = null
                private var quantity: JsonField<Double>? = null
                private var tierConfig: JsonField<TierConfig>? = null
                private var type: JsonValue = JsonValue.from("tier")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tier: Tier) = apply {
                    amount = tier.amount
                    grouping = tier.grouping
                    name = tier.name
                    quantity = tier.quantity
                    tierConfig = tier.tierConfig
                    type = tier.type
                    additionalProperties = tier.additionalProperties.toMutableMap()
                }

                /** The total amount for this sub line item. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                /**
                 * Sets [Builder.grouping] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.grouping] with a well-typed [Grouping] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun tierConfig(tierConfig: TierConfig) = tierConfig(JsonField.of(tierConfig))

                /**
                 * Sets [Builder.tierConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tierConfig] with a well-typed [TierConfig] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tierConfig(tierConfig: JsonField<TierConfig>) = apply {
                    this.tierConfig = tierConfig
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("tier")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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
                 * .amount()
                 * .grouping()
                 * .name()
                 * .quantity()
                 * .tierConfig()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tier =
                    Tier(
                        checkRequired("amount", amount),
                        checkRequired("grouping", grouping),
                        checkRequired("name", name),
                        checkRequired("quantity", quantity),
                        checkRequired("tierConfig", tierConfig),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tier = apply {
                if (validated) {
                    return@apply
                }

                amount()
                grouping()?.validate()
                name()
                quantity()
                tierConfig().validate()
                _type().let {
                    if (it != JsonValue.from("tier")) {
                        throw OrbInvalidDataException("'type' is invalid, received $it")
                    }
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (grouping.asKnown()?.validity() ?: 0) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (quantity.asKnown() == null) 0 else 1) +
                    (tierConfig.asKnown()?.validity() ?: 0) +
                    type.let { if (it == JsonValue.from("tier")) 1 else 0 }

            class Grouping
            private constructor(
                private val key: JsonField<String>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(key, value, mutableMapOf())

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun key(): String = key.getRequired("key")

                /**
                 * No value indicates the default group
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun value(): String? = value.getNullable("value")

                /**
                 * Returns the raw JSON value of [key].
                 *
                 * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                     * Returns a mutable builder for constructing an instance of [Grouping].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .key()
                     * .value()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Grouping]. */
                class Builder internal constructor() {

                    private var key: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(grouping: Grouping) = apply {
                        key = grouping.key
                        value = grouping.value
                        additionalProperties = grouping.additionalProperties.toMutableMap()
                    }

                    fun key(key: String) = key(JsonField.of(key))

                    /**
                     * Sets [Builder.key] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.key] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** No value indicates the default group */
                    fun value(value: String?) = value(JsonField.ofNullable(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [Grouping].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .key()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Grouping =
                        Grouping(
                            checkRequired("key", key),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Grouping = apply {
                    if (validated) {
                        return@apply
                    }

                    key()
                    value()
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
                    (if (key.asKnown() == null) 0 else 1) + (if (value.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Grouping && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Grouping{key=$key, value=$value, additionalProperties=$additionalProperties}"
            }

            class TierConfig
            private constructor(
                private val firstUnit: JsonField<Double>,
                private val lastUnit: JsonField<Double>,
                private val unitAmount: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("first_unit")
                    @ExcludeMissing
                    firstUnit: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("last_unit")
                    @ExcludeMissing
                    lastUnit: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    unitAmount: JsonField<String> = JsonMissing.of(),
                ) : this(firstUnit, lastUnit, unitAmount, mutableMapOf())

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun firstUnit(): Double = firstUnit.getRequired("first_unit")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun lastUnit(): Double? = lastUnit.getNullable("last_unit")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                /**
                 * Returns the raw JSON value of [firstUnit].
                 *
                 * Unlike [firstUnit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("first_unit")
                @ExcludeMissing
                fun _firstUnit(): JsonField<Double> = firstUnit

                /**
                 * Returns the raw JSON value of [lastUnit].
                 *
                 * Unlike [lastUnit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("last_unit")
                @ExcludeMissing
                fun _lastUnit(): JsonField<Double> = lastUnit

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
                     * Returns a mutable builder for constructing an instance of [TierConfig].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .firstUnit()
                     * .lastUnit()
                     * .unitAmount()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [TierConfig]. */
                class Builder internal constructor() {

                    private var firstUnit: JsonField<Double>? = null
                    private var lastUnit: JsonField<Double>? = null
                    private var unitAmount: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tierConfig: TierConfig) = apply {
                        firstUnit = tierConfig.firstUnit
                        lastUnit = tierConfig.lastUnit
                        unitAmount = tierConfig.unitAmount
                        additionalProperties = tierConfig.additionalProperties.toMutableMap()
                    }

                    fun firstUnit(firstUnit: Double) = firstUnit(JsonField.of(firstUnit))

                    /**
                     * Sets [Builder.firstUnit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.firstUnit] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun firstUnit(firstUnit: JsonField<Double>) = apply {
                        this.firstUnit = firstUnit
                    }

                    fun lastUnit(lastUnit: Double?) = lastUnit(JsonField.ofNullable(lastUnit))

                    /**
                     * Alias for [Builder.lastUnit].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun lastUnit(lastUnit: Double) = lastUnit(lastUnit as Double?)

                    /**
                     * Sets [Builder.lastUnit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastUnit] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lastUnit(lastUnit: JsonField<Double>) = apply { this.lastUnit = lastUnit }

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
                     * Returns an immutable instance of [TierConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .firstUnit()
                     * .lastUnit()
                     * .unitAmount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): TierConfig =
                        TierConfig(
                            checkRequired("firstUnit", firstUnit),
                            checkRequired("lastUnit", lastUnit),
                            checkRequired("unitAmount", unitAmount),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): TierConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    firstUnit()
                    lastUnit()
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
                    (if (firstUnit.asKnown() == null) 0 else 1) +
                        (if (lastUnit.asKnown() == null) 0 else 1) +
                        (if (unitAmount.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TierConfig && firstUnit == other.firstUnit && lastUnit == other.lastUnit && unitAmount == other.unitAmount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(firstUnit, lastUnit, unitAmount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TierConfig{firstUnit=$firstUnit, lastUnit=$lastUnit, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Tier && amount == other.amount && grouping == other.grouping && name == other.name && quantity == other.quantity && tierConfig == other.tierConfig && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, grouping, name, quantity, tierConfig, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tier{amount=$amount, grouping=$grouping, name=$name, quantity=$quantity, tierConfig=$tierConfig, type=$type, additionalProperties=$additionalProperties}"
        }

        class Null
        private constructor(
            private val amount: JsonField<String>,
            private val grouping: JsonField<Grouping>,
            private val name: JsonField<String>,
            private val quantity: JsonField<Double>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("grouping")
                @ExcludeMissing
                grouping: JsonField<Grouping> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(amount, grouping, name, quantity, type, mutableMapOf())

            /**
             * The total amount for this sub line item.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): String = amount.getRequired("amount")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun grouping(): Grouping? = grouping.getNullable("grouping")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quantity(): Double = quantity.getRequired("quantity")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("'null'")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [grouping].
             *
             * Unlike [grouping], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("grouping")
            @ExcludeMissing
            fun _grouping(): JsonField<Grouping> = grouping

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

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
                 * Returns a mutable builder for constructing an instance of [Null].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .grouping()
                 * .name()
                 * .quantity()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Null]. */
            class Builder internal constructor() {

                private var amount: JsonField<String>? = null
                private var grouping: JsonField<Grouping>? = null
                private var name: JsonField<String>? = null
                private var quantity: JsonField<Double>? = null
                private var type: JsonValue = JsonValue.from("'null'")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(null_: Null) = apply {
                    amount = null_.amount
                    grouping = null_.grouping
                    name = null_.name
                    quantity = null_.quantity
                    type = null_.type
                    additionalProperties = null_.additionalProperties.toMutableMap()
                }

                /** The total amount for this sub line item. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                /**
                 * Sets [Builder.grouping] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.grouping] with a well-typed [Grouping] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("'null'")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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
                 * Returns an immutable instance of [Null].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .grouping()
                 * .name()
                 * .quantity()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Null =
                    Null(
                        checkRequired("amount", amount),
                        checkRequired("grouping", grouping),
                        checkRequired("name", name),
                        checkRequired("quantity", quantity),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Null = apply {
                if (validated) {
                    return@apply
                }

                amount()
                grouping()?.validate()
                name()
                quantity()
                _type().let {
                    if (it != JsonValue.from("'null'")) {
                        throw OrbInvalidDataException("'type' is invalid, received $it")
                    }
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (grouping.asKnown()?.validity() ?: 0) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (quantity.asKnown() == null) 0 else 1) +
                    type.let { if (it == JsonValue.from("'null'")) 1 else 0 }

            class Grouping
            private constructor(
                private val key: JsonField<String>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(key, value, mutableMapOf())

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun key(): String = key.getRequired("key")

                /**
                 * No value indicates the default group
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun value(): String? = value.getNullable("value")

                /**
                 * Returns the raw JSON value of [key].
                 *
                 * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                     * Returns a mutable builder for constructing an instance of [Grouping].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .key()
                     * .value()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Grouping]. */
                class Builder internal constructor() {

                    private var key: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(grouping: Grouping) = apply {
                        key = grouping.key
                        value = grouping.value
                        additionalProperties = grouping.additionalProperties.toMutableMap()
                    }

                    fun key(key: String) = key(JsonField.of(key))

                    /**
                     * Sets [Builder.key] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.key] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** No value indicates the default group */
                    fun value(value: String?) = value(JsonField.ofNullable(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [Grouping].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .key()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Grouping =
                        Grouping(
                            checkRequired("key", key),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Grouping = apply {
                    if (validated) {
                        return@apply
                    }

                    key()
                    value()
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
                    (if (key.asKnown() == null) 0 else 1) + (if (value.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Grouping && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Grouping{key=$key, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Null && amount == other.amount && grouping == other.grouping && name == other.name && quantity == other.quantity && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, grouping, name, quantity, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Null{amount=$amount, grouping=$grouping, name=$name, quantity=$quantity, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    class TaxAmount
    private constructor(
        private val amount: JsonField<String>,
        private val taxRateDescription: JsonField<String>,
        private val taxRatePercentage: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_rate_description")
            @ExcludeMissing
            taxRateDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_rate_percentage")
            @ExcludeMissing
            taxRatePercentage: JsonField<String> = JsonMissing.of(),
        ) : this(amount, taxRateDescription, taxRatePercentage, mutableMapOf())

        /**
         * The amount of additional tax incurred by this tax rate.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): String = amount.getRequired("amount")

        /**
         * The human-readable description of the applied tax rate.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taxRateDescription(): String = taxRateDescription.getRequired("tax_rate_description")

        /**
         * The tax rate percentage, out of 100.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun taxRatePercentage(): String? = taxRatePercentage.getNullable("tax_rate_percentage")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [taxRateDescription].
         *
         * Unlike [taxRateDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("tax_rate_description")
        @ExcludeMissing
        fun _taxRateDescription(): JsonField<String> = taxRateDescription

        /**
         * Returns the raw JSON value of [taxRatePercentage].
         *
         * Unlike [taxRatePercentage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tax_rate_percentage")
        @ExcludeMissing
        fun _taxRatePercentage(): JsonField<String> = taxRatePercentage

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
             * Returns a mutable builder for constructing an instance of [TaxAmount].
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .taxRateDescription()
             * .taxRatePercentage()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TaxAmount]. */
        class Builder internal constructor() {

            private var amount: JsonField<String>? = null
            private var taxRateDescription: JsonField<String>? = null
            private var taxRatePercentage: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(taxAmount: TaxAmount) = apply {
                amount = taxAmount.amount
                taxRateDescription = taxAmount.taxRateDescription
                taxRatePercentage = taxAmount.taxRatePercentage
                additionalProperties = taxAmount.additionalProperties.toMutableMap()
            }

            /** The amount of additional tax incurred by this tax rate. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The human-readable description of the applied tax rate. */
            fun taxRateDescription(taxRateDescription: String) =
                taxRateDescription(JsonField.of(taxRateDescription))

            /**
             * Sets [Builder.taxRateDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxRateDescription] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxRateDescription(taxRateDescription: JsonField<String>) = apply {
                this.taxRateDescription = taxRateDescription
            }

            /** The tax rate percentage, out of 100. */
            fun taxRatePercentage(taxRatePercentage: String?) =
                taxRatePercentage(JsonField.ofNullable(taxRatePercentage))

            /**
             * Sets [Builder.taxRatePercentage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxRatePercentage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxRatePercentage(taxRatePercentage: JsonField<String>) = apply {
                this.taxRatePercentage = taxRatePercentage
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
             * Returns an immutable instance of [TaxAmount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .taxRateDescription()
             * .taxRatePercentage()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TaxAmount =
                TaxAmount(
                    checkRequired("amount", amount),
                    checkRequired("taxRateDescription", taxRateDescription),
                    checkRequired("taxRatePercentage", taxRatePercentage),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TaxAmount = apply {
            if (validated) {
                return@apply
            }

            amount()
            taxRateDescription()
            taxRatePercentage()
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
            (if (amount.asKnown() == null) 0 else 1) +
                (if (taxRateDescription.asKnown() == null) 0 else 1) +
                (if (taxRatePercentage.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaxAmount && amount == other.amount && taxRateDescription == other.taxRateDescription && taxRatePercentage == other.taxRatePercentage && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, taxRateDescription, taxRatePercentage, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TaxAmount{amount=$amount, taxRateDescription=$taxRateDescription, taxRatePercentage=$taxRatePercentage, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceLineItemCreateResponse && id == other.id && adjustedSubtotal == other.adjustedSubtotal && adjustments == other.adjustments && amount == other.amount && creditsApplied == other.creditsApplied && discount == other.discount && endDate == other.endDate && filter == other.filter && grouping == other.grouping && maximum == other.maximum && maximumAmount == other.maximumAmount && minimum == other.minimum && minimumAmount == other.minimumAmount && name == other.name && partiallyInvoicedAmount == other.partiallyInvoicedAmount && price == other.price && quantity == other.quantity && startDate == other.startDate && subLineItems == other.subLineItems && subtotal == other.subtotal && taxAmounts == other.taxAmounts && usageCustomerIds == other.usageCustomerIds && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, adjustedSubtotal, adjustments, amount, creditsApplied, discount, endDate, filter, grouping, maximum, maximumAmount, minimum, minimumAmount, name, partiallyInvoicedAmount, price, quantity, startDate, subLineItems, subtotal, taxAmounts, usageCustomerIds, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceLineItemCreateResponse{id=$id, adjustedSubtotal=$adjustedSubtotal, adjustments=$adjustments, amount=$amount, creditsApplied=$creditsApplied, discount=$discount, endDate=$endDate, filter=$filter, grouping=$grouping, maximum=$maximum, maximumAmount=$maximumAmount, minimum=$minimum, minimumAmount=$minimumAmount, name=$name, partiallyInvoicedAmount=$partiallyInvoicedAmount, price=$price, quantity=$quantity, startDate=$startDate, subLineItems=$subLineItems, subtotal=$subtotal, taxAmounts=$taxAmounts, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
}
