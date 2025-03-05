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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class InvoiceLineItemCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("adjusted_subtotal")
    @ExcludeMissing
    private val adjustedSubtotal: JsonField<String> = JsonMissing.of(),
    @JsonProperty("adjustments")
    @ExcludeMissing
    private val adjustments: JsonField<List<Adjustment>> = JsonMissing.of(),
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("credits_applied")
    @ExcludeMissing
    private val creditsApplied: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discount")
    @ExcludeMissing
    private val discount: JsonField<Discount> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("filter")
    @ExcludeMissing
    private val filter: JsonField<String> = JsonMissing.of(),
    @JsonProperty("grouping")
    @ExcludeMissing
    private val grouping: JsonField<String> = JsonMissing.of(),
    @JsonProperty("maximum")
    @ExcludeMissing
    private val maximum: JsonField<Maximum> = JsonMissing.of(),
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    private val maximumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("minimum")
    @ExcludeMissing
    private val minimum: JsonField<Minimum> = JsonMissing.of(),
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    private val minimumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("partially_invoiced_amount")
    @ExcludeMissing
    private val partiallyInvoicedAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("price") @ExcludeMissing private val price: JsonField<Price> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("sub_line_items")
    @ExcludeMissing
    private val subLineItems: JsonField<List<SubLineItem>> = JsonMissing.of(),
    @JsonProperty("subtotal")
    @ExcludeMissing
    private val subtotal: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tax_amounts")
    @ExcludeMissing
    private val taxAmounts: JsonField<List<TaxAmount>> = JsonMissing.of(),
    @JsonProperty("usage_customer_ids")
    @ExcludeMissing
    private val usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A unique ID for this line item. */
    fun id(): String = id.getRequired("id")

    /**
     * The line amount after any adjustments and before overage conversion, credits and partial
     * invoicing.
     */
    fun adjustedSubtotal(): String = adjustedSubtotal.getRequired("adjusted_subtotal")

    /** All adjustments (ie. maximums, minimums, discounts) applied to the line item. */
    fun adjustments(): List<Adjustment> = adjustments.getRequired("adjustments")

    /**
     * The final amount for a line item after all adjustments and pre paid credits have been
     * applied.
     */
    fun amount(): String = amount.getRequired("amount")

    /** The number of prepaid credits applied. */
    fun creditsApplied(): String = creditsApplied.getRequired("credits_applied")

    fun discount(): Discount? = discount.getNullable("discount")

    /** The end date of the range of time applied for this line item's price. */
    fun endDate(): OffsetDateTime = endDate.getRequired("end_date")

    /** An additional filter that was used to calculate the usage for this line item. */
    fun filter(): String? = filter.getNullable("filter")

    /**
     * [DEPRECATED] For configured prices that are split by a grouping key, this will be populated
     * with the key and a value. The `amount` and `subtotal` will be the values for this particular
     * grouping.
     */
    fun grouping(): String? = grouping.getNullable("grouping")

    /** This field is deprecated in favor of `adjustments`. */
    @Deprecated("deprecated") fun maximum(): Maximum? = maximum.getNullable("maximum")

    /** This field is deprecated in favor of `adjustments`. */
    @Deprecated("deprecated")
    fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

    /** This field is deprecated in favor of `adjustments`. */
    @Deprecated("deprecated") fun minimum(): Minimum? = minimum.getNullable("minimum")

    /** This field is deprecated in favor of `adjustments`. */
    @Deprecated("deprecated")
    fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

    /** The name of the price associated with this line item. */
    fun name(): String = name.getRequired("name")

    /** Any amount applied from a partial invoice */
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
     */
    fun price(): Price? = price.getNullable("price")

    /** Either the fixed fee quantity or the usage during the service period. */
    fun quantity(): Double = quantity.getRequired("quantity")

    /** The start date of the range of time applied for this line item's price. */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /**
     * For complex pricing structures, the line item can be broken down further in `sub_line_items`.
     */
    fun subLineItems(): List<SubLineItem> = subLineItems.getRequired("sub_line_items")

    /** The line amount before before any adjustments. */
    fun subtotal(): String = subtotal.getRequired("subtotal")

    /**
     * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
     * configured.
     */
    fun taxAmounts(): List<TaxAmount> = taxAmounts.getRequired("tax_amounts")

    /** A list of customer ids that were used to calculate the usage for this line item. */
    fun usageCustomerIds(): List<String>? = usageCustomerIds.getNullable("usage_customer_ids")

    /** A unique ID for this line item. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The line amount after any adjustments and before overage conversion, credits and partial
     * invoicing.
     */
    @JsonProperty("adjusted_subtotal")
    @ExcludeMissing
    fun _adjustedSubtotal(): JsonField<String> = adjustedSubtotal

    /** All adjustments (ie. maximums, minimums, discounts) applied to the line item. */
    @JsonProperty("adjustments")
    @ExcludeMissing
    fun _adjustments(): JsonField<List<Adjustment>> = adjustments

    /**
     * The final amount for a line item after all adjustments and pre paid credits have been
     * applied.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /** The number of prepaid credits applied. */
    @JsonProperty("credits_applied")
    @ExcludeMissing
    fun _creditsApplied(): JsonField<String> = creditsApplied

    @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Discount> = discount

    /** The end date of the range of time applied for this line item's price. */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /** An additional filter that was used to calculate the usage for this line item. */
    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

    /**
     * [DEPRECATED] For configured prices that are split by a grouping key, this will be populated
     * with the key and a value. The `amount` and `subtotal` will be the values for this particular
     * grouping.
     */
    @JsonProperty("grouping") @ExcludeMissing fun _grouping(): JsonField<String> = grouping

    /** This field is deprecated in favor of `adjustments`. */
    @Deprecated("deprecated")
    @JsonProperty("maximum")
    @ExcludeMissing
    fun _maximum(): JsonField<Maximum> = maximum

    /** This field is deprecated in favor of `adjustments`. */
    @Deprecated("deprecated")
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    fun _maximumAmount(): JsonField<String> = maximumAmount

    /** This field is deprecated in favor of `adjustments`. */
    @Deprecated("deprecated")
    @JsonProperty("minimum")
    @ExcludeMissing
    fun _minimum(): JsonField<Minimum> = minimum

    /** This field is deprecated in favor of `adjustments`. */
    @Deprecated("deprecated")
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    fun _minimumAmount(): JsonField<String> = minimumAmount

    /** The name of the price associated with this line item. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Any amount applied from a partial invoice */
    @JsonProperty("partially_invoiced_amount")
    @ExcludeMissing
    fun _partiallyInvoicedAmount(): JsonField<String> = partiallyInvoicedAmount

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
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

    /** Either the fixed fee quantity or the usage during the service period. */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

    /** The start date of the range of time applied for this line item's price. */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * For complex pricing structures, the line item can be broken down further in `sub_line_items`.
     */
    @JsonProperty("sub_line_items")
    @ExcludeMissing
    fun _subLineItems(): JsonField<List<SubLineItem>> = subLineItems

    /** The line amount before before any adjustments. */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

    /**
     * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
     * configured.
     */
    @JsonProperty("tax_amounts")
    @ExcludeMissing
    fun _taxAmounts(): JsonField<List<TaxAmount>> = taxAmounts

    /** A list of customer ids that were used to calculate the usage for this line item. */
    @JsonProperty("usage_customer_ids")
    @ExcludeMissing
    fun _usageCustomerIds(): JsonField<List<String>> = usageCustomerIds

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        /** A unique ID for this line item. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The line amount after any adjustments and before overage conversion, credits and partial
         * invoicing.
         */
        fun adjustedSubtotal(adjustedSubtotal: String) =
            adjustedSubtotal(JsonField.of(adjustedSubtotal))

        /**
         * The line amount after any adjustments and before overage conversion, credits and partial
         * invoicing.
         */
        fun adjustedSubtotal(adjustedSubtotal: JsonField<String>) = apply {
            this.adjustedSubtotal = adjustedSubtotal
        }

        /** All adjustments (ie. maximums, minimums, discounts) applied to the line item. */
        fun adjustments(adjustments: List<Adjustment>) = adjustments(JsonField.of(adjustments))

        /** All adjustments (ie. maximums, minimums, discounts) applied to the line item. */
        fun adjustments(adjustments: JsonField<List<Adjustment>>) = apply {
            this.adjustments = adjustments.map { it.toMutableList() }
        }

        /** All adjustments (ie. maximums, minimums, discounts) applied to the line item. */
        fun addAdjustment(adjustment: Adjustment) = apply {
            adjustments =
                (adjustments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("adjustments", it).add(adjustment)
                }
        }

        /** All adjustments (ie. maximums, minimums, discounts) applied to the line item. */
        fun addAdjustment(monetaryUsageDiscount: Adjustment.MonetaryUsageDiscountAdjustment) =
            addAdjustment(Adjustment.ofMonetaryUsageDiscount(monetaryUsageDiscount))

        /** All adjustments (ie. maximums, minimums, discounts) applied to the line item. */
        fun addAdjustment(monetaryAmountDiscount: Adjustment.MonetaryAmountDiscountAdjustment) =
            addAdjustment(Adjustment.ofMonetaryAmountDiscount(monetaryAmountDiscount))

        /** All adjustments (ie. maximums, minimums, discounts) applied to the line item. */
        fun addAdjustment(
            monetaryPercentageDiscount: Adjustment.MonetaryPercentageDiscountAdjustment
        ) = addAdjustment(Adjustment.ofMonetaryPercentageDiscount(monetaryPercentageDiscount))

        /** All adjustments (ie. maximums, minimums, discounts) applied to the line item. */
        fun addAdjustment(monetaryMinimum: Adjustment.MonetaryMinimumAdjustment) =
            addAdjustment(Adjustment.ofMonetaryMinimum(monetaryMinimum))

        /** All adjustments (ie. maximums, minimums, discounts) applied to the line item. */
        fun addAdjustment(monetaryMaximum: Adjustment.MonetaryMaximumAdjustment) =
            addAdjustment(Adjustment.ofMonetaryMaximum(monetaryMaximum))

        /**
         * The final amount for a line item after all adjustments and pre paid credits have been
         * applied.
         */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /**
         * The final amount for a line item after all adjustments and pre paid credits have been
         * applied.
         */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /** The number of prepaid credits applied. */
        fun creditsApplied(creditsApplied: String) = creditsApplied(JsonField.of(creditsApplied))

        /** The number of prepaid credits applied. */
        fun creditsApplied(creditsApplied: JsonField<String>) = apply {
            this.creditsApplied = creditsApplied
        }

        fun discount(discount: Discount?) = discount(JsonField.ofNullable(discount))

        fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

        fun discount(percentage: PercentageDiscount) = discount(Discount.ofPercentage(percentage))

        fun discount(trial: TrialDiscount) = discount(Discount.ofTrial(trial))

        fun trialDiscount(appliesToPriceIds: List<String>) =
            discount(
                TrialDiscount.builder()
                    .discountType(TrialDiscount.DiscountType.TRIAL)
                    .appliesToPriceIds(appliesToPriceIds)
                    .build()
            )

        fun discount(usage: Discount.UsageDiscount) = discount(Discount.ofUsage(usage))

        fun discount(amount: AmountDiscount) = discount(Discount.ofAmount(amount))

        /** The end date of the range of time applied for this line item's price. */
        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /** The end date of the range of time applied for this line item's price. */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** An additional filter that was used to calculate the usage for this line item. */
        fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

        /** An additional filter that was used to calculate the usage for this line item. */
        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

        /**
         * [DEPRECATED] For configured prices that are split by a grouping key, this will be
         * populated with the key and a value. The `amount` and `subtotal` will be the values for
         * this particular grouping.
         */
        fun grouping(grouping: String?) = grouping(JsonField.ofNullable(grouping))

        /**
         * [DEPRECATED] For configured prices that are split by a grouping key, this will be
         * populated with the key and a value. The `amount` and `subtotal` will be the values for
         * this particular grouping.
         */
        fun grouping(grouping: JsonField<String>) = apply { this.grouping = grouping }

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun maximum(maximum: Maximum?) = maximum(JsonField.ofNullable(maximum))

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun maximumAmount(maximumAmount: String?) =
            maximumAmount(JsonField.ofNullable(maximumAmount))

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
        }

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun minimum(minimum: Minimum?) = minimum(JsonField.ofNullable(minimum))

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun minimumAmount(minimumAmount: String?) =
            minimumAmount(JsonField.ofNullable(minimumAmount))

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

        /** The name of the price associated with this line item. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the price associated with this line item. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Any amount applied from a partial invoice */
        fun partiallyInvoicedAmount(partiallyInvoicedAmount: String) =
            partiallyInvoicedAmount(JsonField.of(partiallyInvoicedAmount))

        /** Any amount applied from a partial invoice */
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
        fun price(price: JsonField<Price>) = apply { this.price = price }

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
        fun price(unit: Price.UnitPrice) = price(Price.ofUnit(unit))

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
        fun price(packagePrice: Price.PackagePrice) = price(Price.ofPackagePrice(packagePrice))

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
        fun price(matrix: Price.MatrixPrice) = price(Price.ofMatrix(matrix))

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
        fun price(tiered: Price.TieredPrice) = price(Price.ofTiered(tiered))

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
        fun price(tieredBps: Price.TieredBpsPrice) = price(Price.ofTieredBps(tieredBps))

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
        fun price(bps: Price.BpsPrice) = price(Price.ofBps(bps))

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
        fun price(bulkBps: Price.BulkBpsPrice) = price(Price.ofBulkBps(bulkBps))

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
        fun price(bulk: Price.BulkPrice) = price(Price.ofBulk(bulk))

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
        fun price(thresholdTotalAmount: Price.ThresholdTotalAmountPrice) =
            price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

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
        fun price(tieredPackage: Price.TieredPackagePrice) =
            price(Price.ofTieredPackage(tieredPackage))

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
        fun price(groupedTiered: Price.GroupedTieredPrice) =
            price(Price.ofGroupedTiered(groupedTiered))

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
        fun price(tieredWithMinimum: Price.TieredWithMinimumPrice) =
            price(Price.ofTieredWithMinimum(tieredWithMinimum))

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
        fun price(tieredPackageWithMinimum: Price.TieredPackageWithMinimumPrice) =
            price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

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
        fun price(packageWithAllocation: Price.PackageWithAllocationPrice) =
            price(Price.ofPackageWithAllocation(packageWithAllocation))

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
        fun price(unitWithPercent: Price.UnitWithPercentPrice) =
            price(Price.ofUnitWithPercent(unitWithPercent))

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
        fun price(matrixWithAllocation: Price.MatrixWithAllocationPrice) =
            price(Price.ofMatrixWithAllocation(matrixWithAllocation))

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
        fun price(tieredWithProration: Price.TieredWithProrationPrice) =
            price(Price.ofTieredWithProration(tieredWithProration))

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
        fun price(unitWithProration: Price.UnitWithProrationPrice) =
            price(Price.ofUnitWithProration(unitWithProration))

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
        fun price(groupedAllocation: Price.GroupedAllocationPrice) =
            price(Price.ofGroupedAllocation(groupedAllocation))

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
        fun price(groupedWithProratedMinimum: Price.GroupedWithProratedMinimumPrice) =
            price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

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
        fun price(groupedWithMeteredMinimum: Price.GroupedWithMeteredMinimumPrice) =
            price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

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
        fun price(matrixWithDisplayName: Price.MatrixWithDisplayNamePrice) =
            price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

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
        fun price(bulkWithProration: Price.BulkWithProrationPrice) =
            price(Price.ofBulkWithProration(bulkWithProration))

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
        fun price(groupedTieredPackage: Price.GroupedTieredPackagePrice) =
            price(Price.ofGroupedTieredPackage(groupedTieredPackage))

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
        fun price(maxGroupTieredPackage: Price.MaxGroupTieredPackagePrice) =
            price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

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
        fun price(scalableMatrixWithUnitPricing: Price.ScalableMatrixWithUnitPricingPrice) =
            price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

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
        fun price(scalableMatrixWithTieredPricing: Price.ScalableMatrixWithTieredPricingPrice) =
            price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

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
        fun price(cumulativeGroupedBulk: Price.CumulativeGroupedBulkPrice) =
            price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

        /** Either the fixed fee quantity or the usage during the service period. */
        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /** Either the fixed fee quantity or the usage during the service period. */
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /** The start date of the range of time applied for this line item's price. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /** The start date of the range of time applied for this line item's price. */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun subLineItems(subLineItems: List<SubLineItem>) = subLineItems(JsonField.of(subLineItems))

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun subLineItems(subLineItems: JsonField<List<SubLineItem>>) = apply {
            this.subLineItems = subLineItems.map { it.toMutableList() }
        }

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun addSubLineItem(subLineItem: SubLineItem) = apply {
            subLineItems =
                (subLineItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("subLineItems", it).add(subLineItem)
                }
        }

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun addSubLineItem(matrix: SubLineItem.MatrixSubLineItem) =
            addSubLineItem(SubLineItem.ofMatrix(matrix))

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun addSubLineItem(tier: SubLineItem.TierSubLineItem) =
            addSubLineItem(SubLineItem.ofTier(tier))

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun addSubLineItem(other: SubLineItem.OtherSubLineItem) =
            addSubLineItem(SubLineItem.ofOther(other))

        /** The line amount before before any adjustments. */
        fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

        /** The line amount before before any adjustments. */
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

        /**
         * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
         * configured.
         */
        fun taxAmounts(taxAmounts: List<TaxAmount>) = taxAmounts(JsonField.of(taxAmounts))

        /**
         * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
         * configured.
         */
        fun taxAmounts(taxAmounts: JsonField<List<TaxAmount>>) = apply {
            this.taxAmounts = taxAmounts.map { it.toMutableList() }
        }

        /**
         * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
         * configured.
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

        /** A list of customer ids that were used to calculate the usage for this line item. */
        fun usageCustomerIds(usageCustomerIds: JsonField<List<String>>) = apply {
            this.usageCustomerIds = usageCustomerIds.map { it.toMutableList() }
        }

        /** A list of customer ids that were used to calculate the usage for this line item. */
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
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = Adjustment.Deserializer::class)
    @JsonSerialize(using = Adjustment.Serializer::class)
    class Adjustment
    private constructor(
        private val monetaryUsageDiscount: MonetaryUsageDiscountAdjustment? = null,
        private val monetaryAmountDiscount: MonetaryAmountDiscountAdjustment? = null,
        private val monetaryPercentageDiscount: MonetaryPercentageDiscountAdjustment? = null,
        private val monetaryMinimum: MonetaryMinimumAdjustment? = null,
        private val monetaryMaximum: MonetaryMaximumAdjustment? = null,
        private val _json: JsonValue? = null,
    ) {

        fun monetaryUsageDiscount(): MonetaryUsageDiscountAdjustment? = monetaryUsageDiscount

        fun monetaryAmountDiscount(): MonetaryAmountDiscountAdjustment? = monetaryAmountDiscount

        fun monetaryPercentageDiscount(): MonetaryPercentageDiscountAdjustment? =
            monetaryPercentageDiscount

        fun monetaryMinimum(): MonetaryMinimumAdjustment? = monetaryMinimum

        fun monetaryMaximum(): MonetaryMaximumAdjustment? = monetaryMaximum

        fun isMonetaryUsageDiscount(): Boolean = monetaryUsageDiscount != null

        fun isMonetaryAmountDiscount(): Boolean = monetaryAmountDiscount != null

        fun isMonetaryPercentageDiscount(): Boolean = monetaryPercentageDiscount != null

        fun isMonetaryMinimum(): Boolean = monetaryMinimum != null

        fun isMonetaryMaximum(): Boolean = monetaryMaximum != null

        fun asMonetaryUsageDiscount(): MonetaryUsageDiscountAdjustment =
            monetaryUsageDiscount.getOrThrow("monetaryUsageDiscount")

        fun asMonetaryAmountDiscount(): MonetaryAmountDiscountAdjustment =
            monetaryAmountDiscount.getOrThrow("monetaryAmountDiscount")

        fun asMonetaryPercentageDiscount(): MonetaryPercentageDiscountAdjustment =
            monetaryPercentageDiscount.getOrThrow("monetaryPercentageDiscount")

        fun asMonetaryMinimum(): MonetaryMinimumAdjustment =
            monetaryMinimum.getOrThrow("monetaryMinimum")

        fun asMonetaryMaximum(): MonetaryMaximumAdjustment =
            monetaryMaximum.getOrThrow("monetaryMaximum")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                monetaryUsageDiscount != null ->
                    visitor.visitMonetaryUsageDiscount(monetaryUsageDiscount)
                monetaryAmountDiscount != null ->
                    visitor.visitMonetaryAmountDiscount(monetaryAmountDiscount)
                monetaryPercentageDiscount != null ->
                    visitor.visitMonetaryPercentageDiscount(monetaryPercentageDiscount)
                monetaryMinimum != null -> visitor.visitMonetaryMinimum(monetaryMinimum)
                monetaryMaximum != null -> visitor.visitMonetaryMaximum(monetaryMaximum)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Adjustment = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitMonetaryUsageDiscount(
                        monetaryUsageDiscount: MonetaryUsageDiscountAdjustment
                    ) {
                        monetaryUsageDiscount.validate()
                    }

                    override fun visitMonetaryAmountDiscount(
                        monetaryAmountDiscount: MonetaryAmountDiscountAdjustment
                    ) {
                        monetaryAmountDiscount.validate()
                    }

                    override fun visitMonetaryPercentageDiscount(
                        monetaryPercentageDiscount: MonetaryPercentageDiscountAdjustment
                    ) {
                        monetaryPercentageDiscount.validate()
                    }

                    override fun visitMonetaryMinimum(monetaryMinimum: MonetaryMinimumAdjustment) {
                        monetaryMinimum.validate()
                    }

                    override fun visitMonetaryMaximum(monetaryMaximum: MonetaryMaximumAdjustment) {
                        monetaryMaximum.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Adjustment && monetaryUsageDiscount == other.monetaryUsageDiscount && monetaryAmountDiscount == other.monetaryAmountDiscount && monetaryPercentageDiscount == other.monetaryPercentageDiscount && monetaryMinimum == other.monetaryMinimum && monetaryMaximum == other.monetaryMaximum /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(monetaryUsageDiscount, monetaryAmountDiscount, monetaryPercentageDiscount, monetaryMinimum, monetaryMaximum) /* spotless:on */

        override fun toString(): String =
            when {
                monetaryUsageDiscount != null ->
                    "Adjustment{monetaryUsageDiscount=$monetaryUsageDiscount}"
                monetaryAmountDiscount != null ->
                    "Adjustment{monetaryAmountDiscount=$monetaryAmountDiscount}"
                monetaryPercentageDiscount != null ->
                    "Adjustment{monetaryPercentageDiscount=$monetaryPercentageDiscount}"
                monetaryMinimum != null -> "Adjustment{monetaryMinimum=$monetaryMinimum}"
                monetaryMaximum != null -> "Adjustment{monetaryMaximum=$monetaryMaximum}"
                _json != null -> "Adjustment{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Adjustment")
            }

        companion object {

            fun ofMonetaryUsageDiscount(monetaryUsageDiscount: MonetaryUsageDiscountAdjustment) =
                Adjustment(monetaryUsageDiscount = monetaryUsageDiscount)

            fun ofMonetaryAmountDiscount(monetaryAmountDiscount: MonetaryAmountDiscountAdjustment) =
                Adjustment(monetaryAmountDiscount = monetaryAmountDiscount)

            fun ofMonetaryPercentageDiscount(
                monetaryPercentageDiscount: MonetaryPercentageDiscountAdjustment
            ) = Adjustment(monetaryPercentageDiscount = monetaryPercentageDiscount)

            fun ofMonetaryMinimum(monetaryMinimum: MonetaryMinimumAdjustment) =
                Adjustment(monetaryMinimum = monetaryMinimum)

            fun ofMonetaryMaximum(monetaryMaximum: MonetaryMaximumAdjustment) =
                Adjustment(monetaryMaximum = monetaryMaximum)
        }

        /**
         * An interface that defines how to map each variant of [Adjustment] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitMonetaryUsageDiscount(
                monetaryUsageDiscount: MonetaryUsageDiscountAdjustment
            ): T

            fun visitMonetaryAmountDiscount(
                monetaryAmountDiscount: MonetaryAmountDiscountAdjustment
            ): T

            fun visitMonetaryPercentageDiscount(
                monetaryPercentageDiscount: MonetaryPercentageDiscountAdjustment
            ): T

            fun visitMonetaryMinimum(monetaryMinimum: MonetaryMinimumAdjustment): T

            fun visitMonetaryMaximum(monetaryMaximum: MonetaryMaximumAdjustment): T

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
                        tryDeserialize(node, jacksonTypeRef<MonetaryUsageDiscountAdjustment>()) {
                                it.validate()
                            }
                            ?.let {
                                return Adjustment(monetaryUsageDiscount = it, _json = json)
                            }
                    }
                    "amount_discount" -> {
                        tryDeserialize(node, jacksonTypeRef<MonetaryAmountDiscountAdjustment>()) {
                                it.validate()
                            }
                            ?.let {
                                return Adjustment(monetaryAmountDiscount = it, _json = json)
                            }
                    }
                    "percentage_discount" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<MonetaryPercentageDiscountAdjustment>(),
                            ) {
                                it.validate()
                            }
                            ?.let {
                                return Adjustment(monetaryPercentageDiscount = it, _json = json)
                            }
                    }
                    "minimum" -> {
                        tryDeserialize(node, jacksonTypeRef<MonetaryMinimumAdjustment>()) {
                                it.validate()
                            }
                            ?.let {
                                return Adjustment(monetaryMinimum = it, _json = json)
                            }
                    }
                    "maximum" -> {
                        tryDeserialize(node, jacksonTypeRef<MonetaryMaximumAdjustment>()) {
                                it.validate()
                            }
                            ?.let {
                                return Adjustment(monetaryMaximum = it, _json = json)
                            }
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
                    value.monetaryUsageDiscount != null ->
                        generator.writeObject(value.monetaryUsageDiscount)
                    value.monetaryAmountDiscount != null ->
                        generator.writeObject(value.monetaryAmountDiscount)
                    value.monetaryPercentageDiscount != null ->
                        generator.writeObject(value.monetaryPercentageDiscount)
                    value.monetaryMinimum != null -> generator.writeObject(value.monetaryMinimum)
                    value.monetaryMaximum != null -> generator.writeObject(value.monetaryMaximum)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Adjustment")
                }
            }
        }

        @NoAutoDetect
        class MonetaryUsageDiscountAdjustment
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("usage_discount")
            @ExcludeMissing
            private val usageDiscount: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

            /** The value applied by an adjustment. */
            fun amount(): String = amount.getRequired("amount")

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

            /** The reason for the adjustment. */
            fun reason(): String? = reason.getNullable("reason")

            /**
             * The number of usage units by which to discount the price this adjustment applies to
             * in a given billing period.
             */
            fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

            /** The value applied by an adjustment. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /** The price IDs that this adjustment applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            /** The reason for the adjustment. */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            /**
             * The number of usage units by which to discount the price this adjustment applies to
             * in a given billing period.
             */
            @JsonProperty("usage_discount")
            @ExcludeMissing
            fun _usageDiscount(): JsonField<Double> = usageDiscount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): MonetaryUsageDiscountAdjustment = apply {
                if (validated) {
                    return@apply
                }

                id()
                adjustmentType()
                amount()
                appliesToPriceIds()
                isInvoiceLevel()
                reason()
                usageDiscount()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [MonetaryUsageDiscountAdjustment].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .adjustmentType()
                 * .amount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .reason()
                 * .usageDiscount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MonetaryUsageDiscountAdjustment]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonField<AdjustmentType>? = null
                private var amount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var reason: JsonField<String>? = null
                private var usageDiscount: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    monetaryUsageDiscountAdjustment: MonetaryUsageDiscountAdjustment
                ) = apply {
                    id = monetaryUsageDiscountAdjustment.id
                    adjustmentType = monetaryUsageDiscountAdjustment.adjustmentType
                    amount = monetaryUsageDiscountAdjustment.amount
                    appliesToPriceIds =
                        monetaryUsageDiscountAdjustment.appliesToPriceIds.map { it.toMutableList() }
                    isInvoiceLevel = monetaryUsageDiscountAdjustment.isInvoiceLevel
                    reason = monetaryUsageDiscountAdjustment.reason
                    usageDiscount = monetaryUsageDiscountAdjustment.usageDiscount
                    additionalProperties =
                        monetaryUsageDiscountAdjustment.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The value applied by an adjustment. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The value applied by an adjustment. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The price IDs that this adjustment applies to. */
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
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                    this.isInvoiceLevel = isInvoiceLevel
                }

                /** The reason for the adjustment. */
                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /** The reason for the adjustment. */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 */
                fun usageDiscount(usageDiscount: Double) =
                    usageDiscount(JsonField.of(usageDiscount))

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
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

                fun build(): MonetaryUsageDiscountAdjustment =
                    MonetaryUsageDiscountAdjustment(
                        checkRequired("id", id),
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("amount", amount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("reason", reason),
                        checkRequired("usageDiscount", usageDiscount),
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    val USAGE_DISCOUNT = of("usage_discount")

                    fun of(value: String) = AdjustmentType(JsonField.of(value))
                }

                /** An enum containing [AdjustmentType]'s known values. */
                enum class Known {
                    USAGE_DISCOUNT
                }

                /**
                 * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AdjustmentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USAGE_DISCOUNT,
                    /**
                     * An enum member indicating that [AdjustmentType] was instantiated with an
                     * unknown value.
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
                        USAGE_DISCOUNT -> Value.USAGE_DISCOUNT
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
                        USAGE_DISCOUNT -> Known.USAGE_DISCOUNT
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MonetaryUsageDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && reason == other.reason && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, appliesToPriceIds, isInvoiceLevel, reason, usageDiscount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MonetaryUsageDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, amount=$amount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, reason=$reason, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class MonetaryAmountDiscountAdjustment
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount_discount")
            @ExcludeMissing
            private val amountDiscount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

            /** The value applied by an adjustment. */
            fun amount(): String = amount.getRequired("amount")

            /**
             * The amount by which to discount the prices this adjustment applies to in a given
             * billing period.
             */
            fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

            /** The reason for the adjustment. */
            fun reason(): String? = reason.getNullable("reason")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

            /** The value applied by an adjustment. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * The amount by which to discount the prices this adjustment applies to in a given
             * billing period.
             */
            @JsonProperty("amount_discount")
            @ExcludeMissing
            fun _amountDiscount(): JsonField<String> = amountDiscount

            /** The price IDs that this adjustment applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            /** The reason for the adjustment. */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): MonetaryAmountDiscountAdjustment = apply {
                if (validated) {
                    return@apply
                }

                id()
                adjustmentType()
                amount()
                amountDiscount()
                appliesToPriceIds()
                isInvoiceLevel()
                reason()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [MonetaryAmountDiscountAdjustment].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .adjustmentType()
                 * .amount()
                 * .amountDiscount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .reason()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MonetaryAmountDiscountAdjustment]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonField<AdjustmentType>? = null
                private var amount: JsonField<String>? = null
                private var amountDiscount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    monetaryAmountDiscountAdjustment: MonetaryAmountDiscountAdjustment
                ) = apply {
                    id = monetaryAmountDiscountAdjustment.id
                    adjustmentType = monetaryAmountDiscountAdjustment.adjustmentType
                    amount = monetaryAmountDiscountAdjustment.amount
                    amountDiscount = monetaryAmountDiscountAdjustment.amountDiscount
                    appliesToPriceIds =
                        monetaryAmountDiscountAdjustment.appliesToPriceIds.map {
                            it.toMutableList()
                        }
                    isInvoiceLevel = monetaryAmountDiscountAdjustment.isInvoiceLevel
                    reason = monetaryAmountDiscountAdjustment.reason
                    additionalProperties =
                        monetaryAmountDiscountAdjustment.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The value applied by an adjustment. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The value applied by an adjustment. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 */
                fun amountDiscount(amountDiscount: String) =
                    amountDiscount(JsonField.of(amountDiscount))

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 */
                fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                    this.amountDiscount = amountDiscount
                }

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The price IDs that this adjustment applies to. */
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
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                    this.isInvoiceLevel = isInvoiceLevel
                }

                /** The reason for the adjustment. */
                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /** The reason for the adjustment. */
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

                fun build(): MonetaryAmountDiscountAdjustment =
                    MonetaryAmountDiscountAdjustment(
                        checkRequired("id", id),
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("amount", amount),
                        checkRequired("amountDiscount", amountDiscount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("reason", reason),
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    val AMOUNT_DISCOUNT = of("amount_discount")

                    fun of(value: String) = AdjustmentType(JsonField.of(value))
                }

                /** An enum containing [AdjustmentType]'s known values. */
                enum class Known {
                    AMOUNT_DISCOUNT
                }

                /**
                 * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AdjustmentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AMOUNT_DISCOUNT,
                    /**
                     * An enum member indicating that [AdjustmentType] was instantiated with an
                     * unknown value.
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
                        AMOUNT_DISCOUNT -> Value.AMOUNT_DISCOUNT
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
                        AMOUNT_DISCOUNT -> Known.AMOUNT_DISCOUNT
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MonetaryAmountDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, amountDiscount, appliesToPriceIds, isInvoiceLevel, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MonetaryAmountDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, amount=$amount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, reason=$reason, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class MonetaryPercentageDiscountAdjustment
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

            /** The value applied by an adjustment. */
            fun amount(): String = amount.getRequired("amount")

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

            /**
             * The percentage (as a value between 0 and 1) by which to discount the price intervals
             * this adjustment applies to in a given billing period.
             */
            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            /** The reason for the adjustment. */
            fun reason(): String? = reason.getNullable("reason")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

            /** The value applied by an adjustment. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /** The price IDs that this adjustment applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            /**
             * The percentage (as a value between 0 and 1) by which to discount the price intervals
             * this adjustment applies to in a given billing period.
             */
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount(): JsonField<Double> = percentageDiscount

            /** The reason for the adjustment. */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): MonetaryPercentageDiscountAdjustment = apply {
                if (validated) {
                    return@apply
                }

                id()
                adjustmentType()
                amount()
                appliesToPriceIds()
                isInvoiceLevel()
                percentageDiscount()
                reason()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [MonetaryPercentageDiscountAdjustment].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .adjustmentType()
                 * .amount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .percentageDiscount()
                 * .reason()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MonetaryPercentageDiscountAdjustment]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonField<AdjustmentType>? = null
                private var amount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var percentageDiscount: JsonField<Double>? = null
                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    monetaryPercentageDiscountAdjustment: MonetaryPercentageDiscountAdjustment
                ) = apply {
                    id = monetaryPercentageDiscountAdjustment.id
                    adjustmentType = monetaryPercentageDiscountAdjustment.adjustmentType
                    amount = monetaryPercentageDiscountAdjustment.amount
                    appliesToPriceIds =
                        monetaryPercentageDiscountAdjustment.appliesToPriceIds.map {
                            it.toMutableList()
                        }
                    isInvoiceLevel = monetaryPercentageDiscountAdjustment.isInvoiceLevel
                    percentageDiscount = monetaryPercentageDiscountAdjustment.percentageDiscount
                    reason = monetaryPercentageDiscountAdjustment.reason
                    additionalProperties =
                        monetaryPercentageDiscountAdjustment.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The value applied by an adjustment. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The value applied by an adjustment. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The price IDs that this adjustment applies to. */
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
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
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
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 */
                fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                    this.percentageDiscount = percentageDiscount
                }

                /** The reason for the adjustment. */
                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /** The reason for the adjustment. */
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

                fun build(): MonetaryPercentageDiscountAdjustment =
                    MonetaryPercentageDiscountAdjustment(
                        checkRequired("id", id),
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("amount", amount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("percentageDiscount", percentageDiscount),
                        checkRequired("reason", reason),
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    val PERCENTAGE_DISCOUNT = of("percentage_discount")

                    fun of(value: String) = AdjustmentType(JsonField.of(value))
                }

                /** An enum containing [AdjustmentType]'s known values. */
                enum class Known {
                    PERCENTAGE_DISCOUNT
                }

                /**
                 * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AdjustmentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PERCENTAGE_DISCOUNT,
                    /**
                     * An enum member indicating that [AdjustmentType] was instantiated with an
                     * unknown value.
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
                        PERCENTAGE_DISCOUNT -> Value.PERCENTAGE_DISCOUNT
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
                        PERCENTAGE_DISCOUNT -> Known.PERCENTAGE_DISCOUNT
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MonetaryPercentageDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && percentageDiscount == other.percentageDiscount && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, appliesToPriceIds, isInvoiceLevel, percentageDiscount, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MonetaryPercentageDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, amount=$amount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, percentageDiscount=$percentageDiscount, reason=$reason, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class MonetaryMinimumAdjustment
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("item_id")
            @ExcludeMissing
            private val itemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            private val minimumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

            /** The value applied by an adjustment. */
            fun amount(): String = amount.getRequired("amount")

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

            /** The item ID that revenue from this minimum will be attributed to. */
            fun itemId(): String = itemId.getRequired("item_id")

            /**
             * The minimum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /** The reason for the adjustment. */
            fun reason(): String? = reason.getNullable("reason")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

            /** The value applied by an adjustment. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /** The price IDs that this adjustment applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            /** The item ID that revenue from this minimum will be attributed to. */
            @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

            /**
             * The minimum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             */
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun _minimumAmount(): JsonField<String> = minimumAmount

            /** The reason for the adjustment. */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): MonetaryMinimumAdjustment = apply {
                if (validated) {
                    return@apply
                }

                id()
                adjustmentType()
                amount()
                appliesToPriceIds()
                isInvoiceLevel()
                itemId()
                minimumAmount()
                reason()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [MonetaryMinimumAdjustment].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .adjustmentType()
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

            /** A builder for [MonetaryMinimumAdjustment]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonField<AdjustmentType>? = null
                private var amount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var itemId: JsonField<String>? = null
                private var minimumAmount: JsonField<String>? = null
                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(monetaryMinimumAdjustment: MonetaryMinimumAdjustment) = apply {
                    id = monetaryMinimumAdjustment.id
                    adjustmentType = monetaryMinimumAdjustment.adjustmentType
                    amount = monetaryMinimumAdjustment.amount
                    appliesToPriceIds =
                        monetaryMinimumAdjustment.appliesToPriceIds.map { it.toMutableList() }
                    isInvoiceLevel = monetaryMinimumAdjustment.isInvoiceLevel
                    itemId = monetaryMinimumAdjustment.itemId
                    minimumAmount = monetaryMinimumAdjustment.minimumAmount
                    reason = monetaryMinimumAdjustment.reason
                    additionalProperties =
                        monetaryMinimumAdjustment.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The value applied by an adjustment. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The value applied by an adjustment. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The price IDs that this adjustment applies to. */
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
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                    this.isInvoiceLevel = isInvoiceLevel
                }

                /** The item ID that revenue from this minimum will be attributed to. */
                fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                /** The item ID that revenue from this minimum will be attributed to. */
                fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                /**
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /**
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The reason for the adjustment. */
                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /** The reason for the adjustment. */
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

                fun build(): MonetaryMinimumAdjustment =
                    MonetaryMinimumAdjustment(
                        checkRequired("id", id),
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("amount", amount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("itemId", itemId),
                        checkRequired("minimumAmount", minimumAmount),
                        checkRequired("reason", reason),
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    val MINIMUM = of("minimum")

                    fun of(value: String) = AdjustmentType(JsonField.of(value))
                }

                /** An enum containing [AdjustmentType]'s known values. */
                enum class Known {
                    MINIMUM
                }

                /**
                 * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AdjustmentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MINIMUM,
                    /**
                     * An enum member indicating that [AdjustmentType] was instantiated with an
                     * unknown value.
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
                        MINIMUM -> Value.MINIMUM
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
                        MINIMUM -> Known.MINIMUM
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MonetaryMinimumAdjustment && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && itemId == other.itemId && minimumAmount == other.minimumAmount && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, appliesToPriceIds, isInvoiceLevel, itemId, minimumAmount, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MonetaryMinimumAdjustment{id=$id, adjustmentType=$adjustmentType, amount=$amount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, itemId=$itemId, minimumAmount=$minimumAmount, reason=$reason, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class MonetaryMaximumAdjustment
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            private val maximumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

            /** The value applied by an adjustment. */
            fun amount(): String = amount.getRequired("amount")

            /** The price IDs that this adjustment applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

            /**
             * The maximum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /** The reason for the adjustment. */
            fun reason(): String? = reason.getNullable("reason")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

            /** The value applied by an adjustment. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /** The price IDs that this adjustment applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            @JsonProperty("is_invoice_level")
            @ExcludeMissing
            fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

            /**
             * The maximum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             */
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun _maximumAmount(): JsonField<String> = maximumAmount

            /** The reason for the adjustment. */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): MonetaryMaximumAdjustment = apply {
                if (validated) {
                    return@apply
                }

                id()
                adjustmentType()
                amount()
                appliesToPriceIds()
                isInvoiceLevel()
                maximumAmount()
                reason()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [MonetaryMaximumAdjustment].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .adjustmentType()
                 * .amount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .maximumAmount()
                 * .reason()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MonetaryMaximumAdjustment]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var adjustmentType: JsonField<AdjustmentType>? = null
                private var amount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var isInvoiceLevel: JsonField<Boolean>? = null
                private var maximumAmount: JsonField<String>? = null
                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(monetaryMaximumAdjustment: MonetaryMaximumAdjustment) = apply {
                    id = monetaryMaximumAdjustment.id
                    adjustmentType = monetaryMaximumAdjustment.adjustmentType
                    amount = monetaryMaximumAdjustment.amount
                    appliesToPriceIds =
                        monetaryMaximumAdjustment.appliesToPriceIds.map { it.toMutableList() }
                    isInvoiceLevel = monetaryMaximumAdjustment.isInvoiceLevel
                    maximumAmount = monetaryMaximumAdjustment.maximumAmount
                    reason = monetaryMaximumAdjustment.reason
                    additionalProperties =
                        monetaryMaximumAdjustment.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The value applied by an adjustment. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The value applied by an adjustment. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The price IDs that this adjustment applies to. */
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
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
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
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /** The reason for the adjustment. */
                fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                /** The reason for the adjustment. */
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

                fun build(): MonetaryMaximumAdjustment =
                    MonetaryMaximumAdjustment(
                        checkRequired("id", id),
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("amount", amount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("maximumAmount", maximumAmount),
                        checkRequired("reason", reason),
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    val MAXIMUM = of("maximum")

                    fun of(value: String) = AdjustmentType(JsonField.of(value))
                }

                /** An enum containing [AdjustmentType]'s known values. */
                enum class Known {
                    MAXIMUM
                }

                /**
                 * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AdjustmentType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MAXIMUM,
                    /**
                     * An enum member indicating that [AdjustmentType] was instantiated with an
                     * unknown value.
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
                        MAXIMUM -> Value.MAXIMUM
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
                        MAXIMUM -> Known.MAXIMUM
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MonetaryMaximumAdjustment && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && maximumAmount == other.maximumAmount && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, appliesToPriceIds, isInvoiceLevel, maximumAmount, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MonetaryMaximumAdjustment{id=$id, adjustmentType=$adjustmentType, amount=$amount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, maximumAmount=$maximumAmount, reason=$reason, additionalProperties=$additionalProperties}"
        }
    }

    /** This field is deprecated in favor of `adjustments`. */
    @Deprecated("deprecated")
    @NoAutoDetect
    class Maximum
    @JsonCreator
    private constructor(
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** Maximum amount applied */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /** Maximum amount applied */
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Maximum = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            maximumAmount()
            validated = true
        }

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
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /** Maximum amount applied */
            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            /** Maximum amount applied */
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

            fun build(): Maximum =
                Maximum(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("maximumAmount", maximumAmount),
                    additionalProperties.toImmutable(),
                )
        }

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
    @NoAutoDetect
    class Minimum
    @JsonCreator
    private constructor(
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        private val minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** Minimum amount applied */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /** Minimum amount applied */
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Minimum = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            minimumAmount()
            validated = true
        }

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
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /** Minimum amount applied */
            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            /** Minimum amount applied */
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

            fun build(): Minimum =
                Minimum(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("minimumAmount", minimumAmount),
                    additionalProperties.toImmutable(),
                )
        }

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
        private val matrix: MatrixSubLineItem? = null,
        private val tier: TierSubLineItem? = null,
        private val other: OtherSubLineItem? = null,
        private val _json: JsonValue? = null,
    ) {

        fun matrix(): MatrixSubLineItem? = matrix

        fun tier(): TierSubLineItem? = tier

        fun other(): OtherSubLineItem? = other

        fun isMatrix(): Boolean = matrix != null

        fun isTier(): Boolean = tier != null

        fun isOther(): Boolean = other != null

        fun asMatrix(): MatrixSubLineItem = matrix.getOrThrow("matrix")

        fun asTier(): TierSubLineItem = tier.getOrThrow("tier")

        fun asOther(): OtherSubLineItem = other.getOrThrow("other")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                matrix != null -> visitor.visitMatrix(matrix)
                tier != null -> visitor.visitTier(tier)
                other != null -> visitor.visitOther(other)
                else -> visitor.unknown(_json)
            }
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

                    override fun visitOther(other: OtherSubLineItem) {
                        other.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SubLineItem && matrix == other.matrix && tier == other.tier && this.other == other.other /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(matrix, tier, other) /* spotless:on */

        override fun toString(): String =
            when {
                matrix != null -> "SubLineItem{matrix=$matrix}"
                tier != null -> "SubLineItem{tier=$tier}"
                other != null -> "SubLineItem{other=$other}"
                _json != null -> "SubLineItem{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid SubLineItem")
            }

        companion object {

            fun ofMatrix(matrix: MatrixSubLineItem) = SubLineItem(matrix = matrix)

            fun ofTier(tier: TierSubLineItem) = SubLineItem(tier = tier)

            fun ofOther(other: OtherSubLineItem) = SubLineItem(other = other)
        }

        /**
         * An interface that defines how to map each variant of [SubLineItem] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitMatrix(matrix: MatrixSubLineItem): T

            fun visitTier(tier: TierSubLineItem): T

            fun visitOther(other: OtherSubLineItem): T

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
                        tryDeserialize(node, jacksonTypeRef<MatrixSubLineItem>()) { it.validate() }
                            ?.let {
                                return SubLineItem(matrix = it, _json = json)
                            }
                    }
                    "tier" -> {
                        tryDeserialize(node, jacksonTypeRef<TierSubLineItem>()) { it.validate() }
                            ?.let {
                                return SubLineItem(tier = it, _json = json)
                            }
                    }
                    "'null'" -> {
                        tryDeserialize(node, jacksonTypeRef<OtherSubLineItem>()) { it.validate() }
                            ?.let {
                                return SubLineItem(other = it, _json = json)
                            }
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
                    value.other != null -> generator.writeObject(value.other)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid SubLineItem")
                }
            }
        }

        @NoAutoDetect
        class MatrixSubLineItem
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grouping")
            @ExcludeMissing
            private val grouping: JsonField<Grouping> = JsonMissing.of(),
            @JsonProperty("matrix_config")
            @ExcludeMissing
            private val matrixConfig: JsonField<MatrixConfig> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The total amount for this sub line item. */
            fun amount(): String = amount.getRequired("amount")

            fun grouping(): Grouping? = grouping.getNullable("grouping")

            fun matrixConfig(): MatrixConfig = matrixConfig.getRequired("matrix_config")

            fun name(): String = name.getRequired("name")

            fun quantity(): Double = quantity.getRequired("quantity")

            fun type(): Type = type.getRequired("type")

            /** The total amount for this sub line item. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            @JsonProperty("grouping")
            @ExcludeMissing
            fun _grouping(): JsonField<Grouping> = grouping

            @JsonProperty("matrix_config")
            @ExcludeMissing
            fun _matrixConfig(): JsonField<MatrixConfig> = matrixConfig

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): MatrixSubLineItem = apply {
                if (validated) {
                    return@apply
                }

                amount()
                grouping()?.validate()
                matrixConfig().validate()
                name()
                quantity()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [MatrixSubLineItem].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .grouping()
                 * .matrixConfig()
                 * .name()
                 * .quantity()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MatrixSubLineItem]. */
            class Builder internal constructor() {

                private var amount: JsonField<String>? = null
                private var grouping: JsonField<Grouping>? = null
                private var matrixConfig: JsonField<MatrixConfig>? = null
                private var name: JsonField<String>? = null
                private var quantity: JsonField<Double>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(matrixSubLineItem: MatrixSubLineItem) = apply {
                    amount = matrixSubLineItem.amount
                    grouping = matrixSubLineItem.grouping
                    matrixConfig = matrixSubLineItem.matrixConfig
                    name = matrixSubLineItem.name
                    quantity = matrixSubLineItem.quantity
                    type = matrixSubLineItem.type
                    additionalProperties = matrixSubLineItem.additionalProperties.toMutableMap()
                }

                /** The total amount for this sub line item. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The total amount for this sub line item. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                fun matrixConfig(matrixConfig: MatrixConfig) =
                    matrixConfig(JsonField.of(matrixConfig))

                fun matrixConfig(matrixConfig: JsonField<MatrixConfig>) = apply {
                    this.matrixConfig = matrixConfig
                }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): MatrixSubLineItem =
                    MatrixSubLineItem(
                        checkRequired("amount", amount),
                        checkRequired("grouping", grouping),
                        checkRequired("matrixConfig", matrixConfig),
                        checkRequired("name", name),
                        checkRequired("quantity", quantity),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Grouping
            @JsonCreator
            private constructor(
                @JsonProperty("key")
                @ExcludeMissing
                private val key: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value")
                @ExcludeMissing
                private val value: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun key(): String = key.getRequired("key")

                /** No value indicates the default group */
                fun value(): String? = value.getNullable("value")

                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /** No value indicates the default group */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Grouping = apply {
                    if (validated) {
                        return@apply
                    }

                    key()
                    value()
                    validated = true
                }

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

                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** No value indicates the default group */
                    fun value(value: String?) = value(JsonField.ofNullable(value))

                    /** No value indicates the default group */
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

                    fun build(): Grouping =
                        Grouping(
                            checkRequired("key", key),
                            checkRequired("value", value),
                            additionalProperties.toImmutable(),
                        )
                }

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

            @NoAutoDetect
            class MatrixConfig
            @JsonCreator
            private constructor(
                @JsonProperty("dimension_values")
                @ExcludeMissing
                private val dimensionValues: JsonField<List<String?>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The ordered dimension values for this line item. */
                fun dimensionValues(): List<String?> =
                    dimensionValues.getRequired("dimension_values")

                /** The ordered dimension values for this line item. */
                @JsonProperty("dimension_values")
                @ExcludeMissing
                fun _dimensionValues(): JsonField<List<String?>> = dimensionValues

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): MatrixConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    dimensionValues()
                    validated = true
                }

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

                    /** The ordered dimension values for this line item. */
                    fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
                        this.dimensionValues = dimensionValues.map { it.toMutableList() }
                    }

                    /** The ordered dimension values for this line item. */
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

                    fun build(): MatrixConfig =
                        MatrixConfig(
                            checkRequired("dimensionValues", dimensionValues).map {
                                it.toImmutable()
                            },
                            additionalProperties.toImmutable(),
                        )
                }

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

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    val MATRIX = of("matrix")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    MATRIX
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MATRIX,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        MATRIX -> Value.MATRIX
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
                        MATRIX -> Known.MATRIX
                        else -> throw OrbInvalidDataException("Unknown Type: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MatrixSubLineItem && amount == other.amount && grouping == other.grouping && matrixConfig == other.matrixConfig && name == other.name && quantity == other.quantity && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, grouping, matrixConfig, name, quantity, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MatrixSubLineItem{amount=$amount, grouping=$grouping, matrixConfig=$matrixConfig, name=$name, quantity=$quantity, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TierSubLineItem
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grouping")
            @ExcludeMissing
            private val grouping: JsonField<Grouping> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tier_config")
            @ExcludeMissing
            private val tierConfig: JsonField<TierConfig> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The total amount for this sub line item. */
            fun amount(): String = amount.getRequired("amount")

            fun grouping(): Grouping? = grouping.getNullable("grouping")

            fun name(): String = name.getRequired("name")

            fun quantity(): Double = quantity.getRequired("quantity")

            fun tierConfig(): TierConfig = tierConfig.getRequired("tier_config")

            fun type(): Type = type.getRequired("type")

            /** The total amount for this sub line item. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            @JsonProperty("grouping")
            @ExcludeMissing
            fun _grouping(): JsonField<Grouping> = grouping

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonProperty("tier_config")
            @ExcludeMissing
            fun _tierConfig(): JsonField<TierConfig> = tierConfig

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TierSubLineItem = apply {
                if (validated) {
                    return@apply
                }

                amount()
                grouping()?.validate()
                name()
                quantity()
                tierConfig().validate()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [TierSubLineItem].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .grouping()
                 * .name()
                 * .quantity()
                 * .tierConfig()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [TierSubLineItem]. */
            class Builder internal constructor() {

                private var amount: JsonField<String>? = null
                private var grouping: JsonField<Grouping>? = null
                private var name: JsonField<String>? = null
                private var quantity: JsonField<Double>? = null
                private var tierConfig: JsonField<TierConfig>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tierSubLineItem: TierSubLineItem) = apply {
                    amount = tierSubLineItem.amount
                    grouping = tierSubLineItem.grouping
                    name = tierSubLineItem.name
                    quantity = tierSubLineItem.quantity
                    tierConfig = tierSubLineItem.tierConfig
                    type = tierSubLineItem.type
                    additionalProperties = tierSubLineItem.additionalProperties.toMutableMap()
                }

                /** The total amount for this sub line item. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The total amount for this sub line item. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun tierConfig(tierConfig: TierConfig) = tierConfig(JsonField.of(tierConfig))

                fun tierConfig(tierConfig: JsonField<TierConfig>) = apply {
                    this.tierConfig = tierConfig
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): TierSubLineItem =
                    TierSubLineItem(
                        checkRequired("amount", amount),
                        checkRequired("grouping", grouping),
                        checkRequired("name", name),
                        checkRequired("quantity", quantity),
                        checkRequired("tierConfig", tierConfig),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Grouping
            @JsonCreator
            private constructor(
                @JsonProperty("key")
                @ExcludeMissing
                private val key: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value")
                @ExcludeMissing
                private val value: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun key(): String = key.getRequired("key")

                /** No value indicates the default group */
                fun value(): String? = value.getNullable("value")

                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /** No value indicates the default group */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Grouping = apply {
                    if (validated) {
                        return@apply
                    }

                    key()
                    value()
                    validated = true
                }

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

                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** No value indicates the default group */
                    fun value(value: String?) = value(JsonField.ofNullable(value))

                    /** No value indicates the default group */
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

                    fun build(): Grouping =
                        Grouping(
                            checkRequired("key", key),
                            checkRequired("value", value),
                            additionalProperties.toImmutable(),
                        )
                }

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

            @NoAutoDetect
            class TierConfig
            @JsonCreator
            private constructor(
                @JsonProperty("first_unit")
                @ExcludeMissing
                private val firstUnit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("last_unit")
                @ExcludeMissing
                private val lastUnit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_amount")
                @ExcludeMissing
                private val unitAmount: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun firstUnit(): Double = firstUnit.getRequired("first_unit")

                fun lastUnit(): Double? = lastUnit.getNullable("last_unit")

                fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                @JsonProperty("first_unit")
                @ExcludeMissing
                fun _firstUnit(): JsonField<Double> = firstUnit

                @JsonProperty("last_unit")
                @ExcludeMissing
                fun _lastUnit(): JsonField<Double> = lastUnit

                @JsonProperty("unit_amount")
                @ExcludeMissing
                fun _unitAmount(): JsonField<String> = unitAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                    fun firstUnit(firstUnit: JsonField<Double>) = apply {
                        this.firstUnit = firstUnit
                    }

                    fun lastUnit(lastUnit: Double?) = lastUnit(JsonField.ofNullable(lastUnit))

                    fun lastUnit(lastUnit: Double) = lastUnit(lastUnit as Double?)

                    fun lastUnit(lastUnit: JsonField<Double>) = apply { this.lastUnit = lastUnit }

                    fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

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

                    fun build(): TierConfig =
                        TierConfig(
                            checkRequired("firstUnit", firstUnit),
                            checkRequired("lastUnit", lastUnit),
                            checkRequired("unitAmount", unitAmount),
                            additionalProperties.toImmutable(),
                        )
                }

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

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    val TIER = of("tier")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    TIER
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TIER,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        TIER -> Value.TIER
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
                        TIER -> Known.TIER
                        else -> throw OrbInvalidDataException("Unknown Type: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TierSubLineItem && amount == other.amount && grouping == other.grouping && name == other.name && quantity == other.quantity && tierConfig == other.tierConfig && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, grouping, name, quantity, tierConfig, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TierSubLineItem{amount=$amount, grouping=$grouping, name=$name, quantity=$quantity, tierConfig=$tierConfig, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class OtherSubLineItem
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grouping")
            @ExcludeMissing
            private val grouping: JsonField<Grouping> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The total amount for this sub line item. */
            fun amount(): String = amount.getRequired("amount")

            fun grouping(): Grouping? = grouping.getNullable("grouping")

            fun name(): String = name.getRequired("name")

            fun quantity(): Double = quantity.getRequired("quantity")

            fun type(): Type = type.getRequired("type")

            /** The total amount for this sub line item. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            @JsonProperty("grouping")
            @ExcludeMissing
            fun _grouping(): JsonField<Grouping> = grouping

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): OtherSubLineItem = apply {
                if (validated) {
                    return@apply
                }

                amount()
                grouping()?.validate()
                name()
                quantity()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [OtherSubLineItem].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .grouping()
                 * .name()
                 * .quantity()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [OtherSubLineItem]. */
            class Builder internal constructor() {

                private var amount: JsonField<String>? = null
                private var grouping: JsonField<Grouping>? = null
                private var name: JsonField<String>? = null
                private var quantity: JsonField<Double>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(otherSubLineItem: OtherSubLineItem) = apply {
                    amount = otherSubLineItem.amount
                    grouping = otherSubLineItem.grouping
                    name = otherSubLineItem.name
                    quantity = otherSubLineItem.quantity
                    type = otherSubLineItem.type
                    additionalProperties = otherSubLineItem.additionalProperties.toMutableMap()
                }

                /** The total amount for this sub line item. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The total amount for this sub line item. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): OtherSubLineItem =
                    OtherSubLineItem(
                        checkRequired("amount", amount),
                        checkRequired("grouping", grouping),
                        checkRequired("name", name),
                        checkRequired("quantity", quantity),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Grouping
            @JsonCreator
            private constructor(
                @JsonProperty("key")
                @ExcludeMissing
                private val key: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value")
                @ExcludeMissing
                private val value: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun key(): String = key.getRequired("key")

                /** No value indicates the default group */
                fun value(): String? = value.getNullable("value")

                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /** No value indicates the default group */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Grouping = apply {
                    if (validated) {
                        return@apply
                    }

                    key()
                    value()
                    validated = true
                }

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

                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** No value indicates the default group */
                    fun value(value: String?) = value(JsonField.ofNullable(value))

                    /** No value indicates the default group */
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

                    fun build(): Grouping =
                        Grouping(
                            checkRequired("key", key),
                            checkRequired("value", value),
                            additionalProperties.toImmutable(),
                        )
                }

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

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    val NULL = of("'null'")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    NULL
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NULL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        NULL -> Value.NULL
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
                        NULL -> Known.NULL
                        else -> throw OrbInvalidDataException("Unknown Type: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OtherSubLineItem && amount == other.amount && grouping == other.grouping && name == other.name && quantity == other.quantity && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, grouping, name, quantity, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OtherSubLineItem{amount=$amount, grouping=$grouping, name=$name, quantity=$quantity, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    @NoAutoDetect
    class TaxAmount
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_rate_description")
        @ExcludeMissing
        private val taxRateDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_rate_percentage")
        @ExcludeMissing
        private val taxRatePercentage: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The amount of additional tax incurred by this tax rate. */
        fun amount(): String = amount.getRequired("amount")

        /** The human-readable description of the applied tax rate. */
        fun taxRateDescription(): String = taxRateDescription.getRequired("tax_rate_description")

        /** The tax rate percentage, out of 100. */
        fun taxRatePercentage(): String? = taxRatePercentage.getNullable("tax_rate_percentage")

        /** The amount of additional tax incurred by this tax rate. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /** The human-readable description of the applied tax rate. */
        @JsonProperty("tax_rate_description")
        @ExcludeMissing
        fun _taxRateDescription(): JsonField<String> = taxRateDescription

        /** The tax rate percentage, out of 100. */
        @JsonProperty("tax_rate_percentage")
        @ExcludeMissing
        fun _taxRatePercentage(): JsonField<String> = taxRatePercentage

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            /** The amount of additional tax incurred by this tax rate. */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The human-readable description of the applied tax rate. */
            fun taxRateDescription(taxRateDescription: String) =
                taxRateDescription(JsonField.of(taxRateDescription))

            /** The human-readable description of the applied tax rate. */
            fun taxRateDescription(taxRateDescription: JsonField<String>) = apply {
                this.taxRateDescription = taxRateDescription
            }

            /** The tax rate percentage, out of 100. */
            fun taxRatePercentage(taxRatePercentage: String?) =
                taxRatePercentage(JsonField.ofNullable(taxRatePercentage))

            /** The tax rate percentage, out of 100. */
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

            fun build(): TaxAmount =
                TaxAmount(
                    checkRequired("amount", amount),
                    checkRequired("taxRateDescription", taxRateDescription),
                    checkRequired("taxRatePercentage", taxRatePercentage),
                    additionalProperties.toImmutable(),
                )
        }

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
