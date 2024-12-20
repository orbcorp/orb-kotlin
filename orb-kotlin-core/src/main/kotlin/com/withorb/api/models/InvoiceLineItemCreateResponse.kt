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
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discount")
    @ExcludeMissing
    private val discount: JsonField<Discount> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("grouping")
    @ExcludeMissing
    private val grouping: JsonField<String> = JsonMissing.of(),
    @JsonProperty("minimum")
    @ExcludeMissing
    private val minimum: JsonField<Minimum> = JsonMissing.of(),
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    private val minimumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("maximum")
    @ExcludeMissing
    private val maximum: JsonField<Maximum> = JsonMissing.of(),
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    private val maximumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("subtotal")
    @ExcludeMissing
    private val subtotal: JsonField<String> = JsonMissing.of(),
    @JsonProperty("sub_line_items")
    @ExcludeMissing
    private val subLineItems: JsonField<List<SubLineItem>> = JsonMissing.of(),
    @JsonProperty("tax_amounts")
    @ExcludeMissing
    private val taxAmounts: JsonField<List<TaxAmount>> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("price") @ExcludeMissing private val price: JsonField<Price> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The final amount after any discounts or minimums. */
    fun amount(): String = amount.getRequired("amount")

    fun discount(): Discount? = discount.getNullable("discount")

    /** The end date of the range of time applied for this line item's price. */
    fun endDate(): OffsetDateTime = endDate.getRequired("end_date")

    /**
     * [DEPRECATED] For configured prices that are split by a grouping key, this will be populated
     * with the key and a value. The `amount` and `subtotal` will be the values for this particular
     * grouping.
     */
    fun grouping(): String? = grouping.getNullable("grouping")

    fun minimum(): Minimum? = minimum.getNullable("minimum")

    fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

    fun maximum(): Maximum? = maximum.getNullable("maximum")

    fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

    /** The name of the price associated with this line item. */
    fun name(): String = name.getRequired("name")

    fun quantity(): Double = quantity.getRequired("quantity")

    /** The start date of the range of time applied for this line item's price. */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /** The line amount before any line item-specific discounts or minimums. */
    fun subtotal(): String = subtotal.getRequired("subtotal")

    /**
     * For complex pricing structures, the line item can be broken down further in `sub_line_items`.
     */
    fun subLineItems(): List<SubLineItem> = subLineItems.getRequired("sub_line_items")

    /**
     * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
     * configured.
     */
    fun taxAmounts(): List<TaxAmount> = taxAmounts.getRequired("tax_amounts")

    /** A unique ID for this line item. */
    fun id(): String = id.getRequired("id")

    /**
     * The Price resource represents a price that can be billed on a subscription, resulting in a
     * charge on an invoice in the form of an invoice line item. Prices take a quantity and
     * determine an amount to bill.
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given Price object. The model_type field determines the key for
     * the configuration object that is present.
     *
     * ## Unit pricing
     *
     * With unit pricing, each unit costs a fixed amount.
     *
     * ```json
     * {
     *     ...
     *     "model_type": "unit",
     *     "unit_config": {
     *         "unit_amount": "0.50"
     *     }
     *     ...
     * }
     * ```
     *
     * ## Tiered pricing
     *
     * In tiered pricing, the cost of a given unit depends on the tier range that it falls into,
     * where each tier range is defined by an upper and lower bound. For example, the first ten
     * units may cost $0.50 each and all units thereafter may cost $0.10 each.
     *
     * ```json
     * {
     *     ...
     *     "model_type": "tiered",
     *     "tiered_config": {
     *         "tiers": [
     *             {
     *                 "first_unit": 1,
     *                 "last_unit": 10,
     *                 "unit_amount": "0.50"
     *             },
     *             {
     *                 "first_unit": 11,
     *                 "last_unit": null,
     *                 "unit_amount": "0.10"
     *             }
     *         ]
     *     }
     *     ...
     * ```
     *
     * ## Bulk pricing
     *
     * Bulk pricing applies when the number of units determine the cost of all units. For example,
     * if you've bought less than 10 units, they may each be $0.50 for a total of $5.00. Once you've
     * bought more than 10 units, all units may now be priced at $0.40 (i.e. 101 units total would
     * be $40.40).
     *
     * ```json
     * {
     *     ...
     *     "model_type": "bulk",
     *     "bulk_config": {
     *         "tiers": [
     *             {
     *                 "maximum_units": 10,
     *                 "unit_amount": "0.50"
     *             },
     *             {
     *                 "maximum_units": 1000,
     *                 "unit_amount": "0.40"
     *             }
     *         ]
     *     }
     *     ...
     * }
     * ```
     *
     * ## Package pricing
     *
     * Package pricing defines the size or granularity of a unit for billing purposes. For example,
     * if the package size is set to 5, then 4 units will be billed as 5 and 6 units will be billed
     * at 10.
     *
     * ```json
     * {
     *     ...
     *     "model_type": "package",
     *     "package_config": {
     *         "package_amount": "0.80",
     *         "package_size": 10
     *     }
     *     ...
     * }
     * ```
     *
     * ## BPS pricing
     *
     * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a percent (the
     * number of basis points to charge), as well as a cap per event to assess. For example, this
     * would allow you to assess a fee of 0.25% on every payment you process, with a maximum charge
     * of $25 per payment.
     *
     * ```json
     * {
     *     ...
     *     "model_type": "bps",
     *     "bps_config": {
     *        "bps": 125,
     *        "per_unit_maximum": "11.00"
     *     }
     *     ...
     *  }
     * ```
     *
     * ## Bulk BPS pricing
     *
     * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total quantity
     * across all events. Similar to bulk pricing, the BPS parameters of a given event depends on
     * the tier range that the billing period falls into. Each tier range is defined by an upper
     * bound. For example, after $1.5M of payment volume is reached, each individual payment may
     * have a lower cap or a smaller take-rate.
     *
     * ```json
     *     ...
     *     "model_type": "bulk_bps",
     *     "bulk_bps_config": {
     *         "tiers": [
     *            {
     *                 "maximum_amount": "1000000.00",
     *                 "bps": 125,
     *                 "per_unit_maximum": "19.00"
     *            },
     *           {
     *                 "maximum_amount": null,
     *                 "bps": 115,
     *                 "per_unit_maximum": "4.00"
     *             }
     *         ]
     *     }
     *     ...
     * }
     * ```
     *
     * ## Tiered BPS pricing
     *
     * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
     * applicable parameter is a function of its marginal addition to the period total. Similar to
     * tiered pricing, the BPS parameters of a given event depends on the tier range that it falls
     * into, where each tier range is defined by an upper and lower bound. For example, the first
     * few payments may have a 0.8 BPS take-rate and all payments after a specific volume may incur
     * a take-rate of 0.5 BPS each.
     *
     * ```json
     *     ...
     *     "model_type": "tiered_bps",
     *     "tiered_bps_config": {
     *         "tiers": [
     *            {
     *                 "minimum_amount": "0",
     *                 "maximum_amount": "1000000.00",
     *                 "bps": 125,
     *                 "per_unit_maximum": "19.00"
     *            },
     *           {
     *                 "minimum_amount": "1000000.00",
     *                 "maximum_amount": null,
     *                 "bps": 115,
     *                 "per_unit_maximum": "4.00"
     *             }
     *         ]
     *     }
     *     ...
     * }
     * ```
     *
     * ## Matrix pricing
     *
     * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix. `dimensions`
     * defines the two event property values evaluated in this pricing model. In a one-dimensional
     * matrix, the second value is `null`. Every configuration has a list of `matrix_values` which
     * give the unit prices for specified property values. In a one-dimensional matrix, the matrix
     * values will have `dimension_values` where the second value of the pair is null. If an event
     * does not match any of the dimension values in the matrix, it will resort to the
     * `default_unit_amount`.
     *
     * ```json
     * {
     *     "model_type": "matrix"
     *     "matrix_config": {
     *         "default_unit_amount": "3.00",
     *         "dimensions": [
     *             "cluster_name",
     *             "region"
     *         ],
     *         "matrix_values": [
     *             {
     *                 "dimension_values": [
     *                     "alpha",
     *                     "west"
     *                 ],
     *                 "unit_amount": "2.00"
     *             },
     *             ...
     *         ]
     *     }
     * }
     * ```
     *
     * ## Fixed fees
     *
     * Fixed fees are prices that are applied independent of usage quantities, and follow unit
     * pricing. They also have an additional parameter `fixed_price_quantity`. If the Price
     * represents a fixed cost, this represents the quantity of units applied.
     *
     * ```json
     * {
     *     ...
     *     "id": "price_id",
     *     "model_type": "unit",
     *     "unit_config": {
     *        "unit_amount": "2.00"
     *     },
     *     "fixed_price_quantity": 3.0
     *     ...
     * }
     * ```
     */
    fun price(): Price? = price.getNullable("price")

    /** The final amount after any discounts or minimums. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

    /** The end date of the range of time applied for this line item's price. */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

    /**
     * [DEPRECATED] For configured prices that are split by a grouping key, this will be populated
     * with the key and a value. The `amount` and `subtotal` will be the values for this particular
     * grouping.
     */
    @JsonProperty("grouping") @ExcludeMissing fun _grouping() = grouping

    @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

    @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

    @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

    @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

    /** The name of the price associated with this line item. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

    /** The start date of the range of time applied for this line item's price. */
    @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

    /** The line amount before any line item-specific discounts or minimums. */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

    /**
     * For complex pricing structures, the line item can be broken down further in `sub_line_items`.
     */
    @JsonProperty("sub_line_items") @ExcludeMissing fun _subLineItems() = subLineItems

    /**
     * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
     * configured.
     */
    @JsonProperty("tax_amounts") @ExcludeMissing fun _taxAmounts() = taxAmounts

    /** A unique ID for this line item. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The Price resource represents a price that can be billed on a subscription, resulting in a
     * charge on an invoice in the form of an invoice line item. Prices take a quantity and
     * determine an amount to bill.
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given Price object. The model_type field determines the key for
     * the configuration object that is present.
     *
     * ## Unit pricing
     *
     * With unit pricing, each unit costs a fixed amount.
     *
     * ```json
     * {
     *     ...
     *     "model_type": "unit",
     *     "unit_config": {
     *         "unit_amount": "0.50"
     *     }
     *     ...
     * }
     * ```
     *
     * ## Tiered pricing
     *
     * In tiered pricing, the cost of a given unit depends on the tier range that it falls into,
     * where each tier range is defined by an upper and lower bound. For example, the first ten
     * units may cost $0.50 each and all units thereafter may cost $0.10 each.
     *
     * ```json
     * {
     *     ...
     *     "model_type": "tiered",
     *     "tiered_config": {
     *         "tiers": [
     *             {
     *                 "first_unit": 1,
     *                 "last_unit": 10,
     *                 "unit_amount": "0.50"
     *             },
     *             {
     *                 "first_unit": 11,
     *                 "last_unit": null,
     *                 "unit_amount": "0.10"
     *             }
     *         ]
     *     }
     *     ...
     * ```
     *
     * ## Bulk pricing
     *
     * Bulk pricing applies when the number of units determine the cost of all units. For example,
     * if you've bought less than 10 units, they may each be $0.50 for a total of $5.00. Once you've
     * bought more than 10 units, all units may now be priced at $0.40 (i.e. 101 units total would
     * be $40.40).
     *
     * ```json
     * {
     *     ...
     *     "model_type": "bulk",
     *     "bulk_config": {
     *         "tiers": [
     *             {
     *                 "maximum_units": 10,
     *                 "unit_amount": "0.50"
     *             },
     *             {
     *                 "maximum_units": 1000,
     *                 "unit_amount": "0.40"
     *             }
     *         ]
     *     }
     *     ...
     * }
     * ```
     *
     * ## Package pricing
     *
     * Package pricing defines the size or granularity of a unit for billing purposes. For example,
     * if the package size is set to 5, then 4 units will be billed as 5 and 6 units will be billed
     * at 10.
     *
     * ```json
     * {
     *     ...
     *     "model_type": "package",
     *     "package_config": {
     *         "package_amount": "0.80",
     *         "package_size": 10
     *     }
     *     ...
     * }
     * ```
     *
     * ## BPS pricing
     *
     * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a percent (the
     * number of basis points to charge), as well as a cap per event to assess. For example, this
     * would allow you to assess a fee of 0.25% on every payment you process, with a maximum charge
     * of $25 per payment.
     *
     * ```json
     * {
     *     ...
     *     "model_type": "bps",
     *     "bps_config": {
     *        "bps": 125,
     *        "per_unit_maximum": "11.00"
     *     }
     *     ...
     *  }
     * ```
     *
     * ## Bulk BPS pricing
     *
     * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total quantity
     * across all events. Similar to bulk pricing, the BPS parameters of a given event depends on
     * the tier range that the billing period falls into. Each tier range is defined by an upper
     * bound. For example, after $1.5M of payment volume is reached, each individual payment may
     * have a lower cap or a smaller take-rate.
     *
     * ```json
     *     ...
     *     "model_type": "bulk_bps",
     *     "bulk_bps_config": {
     *         "tiers": [
     *            {
     *                 "maximum_amount": "1000000.00",
     *                 "bps": 125,
     *                 "per_unit_maximum": "19.00"
     *            },
     *           {
     *                 "maximum_amount": null,
     *                 "bps": 115,
     *                 "per_unit_maximum": "4.00"
     *             }
     *         ]
     *     }
     *     ...
     * }
     * ```
     *
     * ## Tiered BPS pricing
     *
     * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
     * applicable parameter is a function of its marginal addition to the period total. Similar to
     * tiered pricing, the BPS parameters of a given event depends on the tier range that it falls
     * into, where each tier range is defined by an upper and lower bound. For example, the first
     * few payments may have a 0.8 BPS take-rate and all payments after a specific volume may incur
     * a take-rate of 0.5 BPS each.
     *
     * ```json
     *     ...
     *     "model_type": "tiered_bps",
     *     "tiered_bps_config": {
     *         "tiers": [
     *            {
     *                 "minimum_amount": "0",
     *                 "maximum_amount": "1000000.00",
     *                 "bps": 125,
     *                 "per_unit_maximum": "19.00"
     *            },
     *           {
     *                 "minimum_amount": "1000000.00",
     *                 "maximum_amount": null,
     *                 "bps": 115,
     *                 "per_unit_maximum": "4.00"
     *             }
     *         ]
     *     }
     *     ...
     * }
     * ```
     *
     * ## Matrix pricing
     *
     * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix. `dimensions`
     * defines the two event property values evaluated in this pricing model. In a one-dimensional
     * matrix, the second value is `null`. Every configuration has a list of `matrix_values` which
     * give the unit prices for specified property values. In a one-dimensional matrix, the matrix
     * values will have `dimension_values` where the second value of the pair is null. If an event
     * does not match any of the dimension values in the matrix, it will resort to the
     * `default_unit_amount`.
     *
     * ```json
     * {
     *     "model_type": "matrix"
     *     "matrix_config": {
     *         "default_unit_amount": "3.00",
     *         "dimensions": [
     *             "cluster_name",
     *             "region"
     *         ],
     *         "matrix_values": [
     *             {
     *                 "dimension_values": [
     *                     "alpha",
     *                     "west"
     *                 ],
     *                 "unit_amount": "2.00"
     *             },
     *             ...
     *         ]
     *     }
     * }
     * ```
     *
     * ## Fixed fees
     *
     * Fixed fees are prices that are applied independent of usage quantities, and follow unit
     * pricing. They also have an additional parameter `fixed_price_quantity`. If the Price
     * represents a fixed cost, this represents the quantity of units applied.
     *
     * ```json
     * {
     *     ...
     *     "id": "price_id",
     *     "model_type": "unit",
     *     "unit_config": {
     *        "unit_amount": "2.00"
     *     },
     *     "fixed_price_quantity": 3.0
     *     ...
     * }
     * ```
     */
    @JsonProperty("price") @ExcludeMissing fun _price() = price

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InvoiceLineItemCreateResponse = apply {
        if (!validated) {
            amount()
            discount()
            endDate()
            grouping()
            minimum()?.validate()
            minimumAmount()
            maximum()?.validate()
            maximumAmount()
            name()
            quantity()
            startDate()
            subtotal()
            subLineItems()
            taxAmounts().forEach { it.validate() }
            id()
            price()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var amount: JsonField<String> = JsonMissing.of()
        private var discount: JsonField<Discount> = JsonMissing.of()
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var grouping: JsonField<String> = JsonMissing.of()
        private var minimum: JsonField<Minimum> = JsonMissing.of()
        private var minimumAmount: JsonField<String> = JsonMissing.of()
        private var maximum: JsonField<Maximum> = JsonMissing.of()
        private var maximumAmount: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var quantity: JsonField<Double> = JsonMissing.of()
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var subtotal: JsonField<String> = JsonMissing.of()
        private var subLineItems: JsonField<List<SubLineItem>> = JsonMissing.of()
        private var taxAmounts: JsonField<List<TaxAmount>> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var price: JsonField<Price> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceLineItemCreateResponse: InvoiceLineItemCreateResponse) = apply {
            amount = invoiceLineItemCreateResponse.amount
            discount = invoiceLineItemCreateResponse.discount
            endDate = invoiceLineItemCreateResponse.endDate
            grouping = invoiceLineItemCreateResponse.grouping
            minimum = invoiceLineItemCreateResponse.minimum
            minimumAmount = invoiceLineItemCreateResponse.minimumAmount
            maximum = invoiceLineItemCreateResponse.maximum
            maximumAmount = invoiceLineItemCreateResponse.maximumAmount
            name = invoiceLineItemCreateResponse.name
            quantity = invoiceLineItemCreateResponse.quantity
            startDate = invoiceLineItemCreateResponse.startDate
            subtotal = invoiceLineItemCreateResponse.subtotal
            subLineItems = invoiceLineItemCreateResponse.subLineItems
            taxAmounts = invoiceLineItemCreateResponse.taxAmounts
            id = invoiceLineItemCreateResponse.id
            price = invoiceLineItemCreateResponse.price
            additionalProperties = invoiceLineItemCreateResponse.additionalProperties.toMutableMap()
        }

        /** The final amount after any discounts or minimums. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /** The final amount after any discounts or minimums. */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        fun discount(discount: Discount) = discount(JsonField.of(discount))

        fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

        /** The end date of the range of time applied for this line item's price. */
        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /** The end date of the range of time applied for this line item's price. */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /**
         * [DEPRECATED] For configured prices that are split by a grouping key, this will be
         * populated with the key and a value. The `amount` and `subtotal` will be the values for
         * this particular grouping.
         */
        fun grouping(grouping: String) = grouping(JsonField.of(grouping))

        /**
         * [DEPRECATED] For configured prices that are split by a grouping key, this will be
         * populated with the key and a value. The `amount` and `subtotal` will be the values for
         * this particular grouping.
         */
        fun grouping(grouping: JsonField<String>) = apply { this.grouping = grouping }

        fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

        fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

        fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

        fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

        fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

        fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
        }

        /** The name of the price associated with this line item. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the price associated with this line item. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /** The start date of the range of time applied for this line item's price. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /** The start date of the range of time applied for this line item's price. */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        /** The line amount before any line item-specific discounts or minimums. */
        fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

        /** The line amount before any line item-specific discounts or minimums. */
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

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
            this.subLineItems = subLineItems
        }

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
            this.taxAmounts = taxAmounts
        }

        /** A unique ID for this line item. */
        fun id(id: String) = id(JsonField.of(id))

        /** A unique ID for this line item. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * ## Unit pricing
         *
         * With unit pricing, each unit costs a fixed amount.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "unit",
         *     "unit_config": {
         *         "unit_amount": "0.50"
         *     }
         *     ...
         * }
         * ```
         *
         * ## Tiered pricing
         *
         * In tiered pricing, the cost of a given unit depends on the tier range that it falls into,
         * where each tier range is defined by an upper and lower bound. For example, the first ten
         * units may cost $0.50 each and all units thereafter may cost $0.10 each.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "tiered",
         *     "tiered_config": {
         *         "tiers": [
         *             {
         *                 "first_unit": 1,
         *                 "last_unit": 10,
         *                 "unit_amount": "0.50"
         *             },
         *             {
         *                 "first_unit": 11,
         *                 "last_unit": null,
         *                 "unit_amount": "0.10"
         *             }
         *         ]
         *     }
         *     ...
         * ```
         *
         * ## Bulk pricing
         *
         * Bulk pricing applies when the number of units determine the cost of all units. For
         * example, if you've bought less than 10 units, they may each be $0.50 for a total of
         * $5.00. Once you've bought more than 10 units, all units may now be priced at $0.40 (i.e.
         * 101 units total would be $40.40).
         *
         * ```json
         * {
         *     ...
         *     "model_type": "bulk",
         *     "bulk_config": {
         *         "tiers": [
         *             {
         *                 "maximum_units": 10,
         *                 "unit_amount": "0.50"
         *             },
         *             {
         *                 "maximum_units": 1000,
         *                 "unit_amount": "0.40"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Package pricing
         *
         * Package pricing defines the size or granularity of a unit for billing purposes. For
         * example, if the package size is set to 5, then 4 units will be billed as 5 and 6 units
         * will be billed at 10.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "package",
         *     "package_config": {
         *         "package_amount": "0.80",
         *         "package_size": 10
         *     }
         *     ...
         * }
         * ```
         *
         * ## BPS pricing
         *
         * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a percent
         * (the number of basis points to charge), as well as a cap per event to assess. For
         * example, this would allow you to assess a fee of 0.25% on every payment you process, with
         * a maximum charge of $25 per payment.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "bps",
         *     "bps_config": {
         *        "bps": 125,
         *        "per_unit_maximum": "11.00"
         *     }
         *     ...
         *  }
         * ```
         *
         * ## Bulk BPS pricing
         *
         * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total
         * quantity across all events. Similar to bulk pricing, the BPS parameters of a given event
         * depends on the tier range that the billing period falls into. Each tier range is defined
         * by an upper bound. For example, after $1.5M of payment volume is reached, each individual
         * payment may have a lower cap or a smaller take-rate.
         *
         * ```json
         *     ...
         *     "model_type": "bulk_bps",
         *     "bulk_bps_config": {
         *         "tiers": [
         *            {
         *                 "maximum_amount": "1000000.00",
         *                 "bps": 125,
         *                 "per_unit_maximum": "19.00"
         *            },
         *           {
         *                 "maximum_amount": null,
         *                 "bps": 115,
         *                 "per_unit_maximum": "4.00"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Tiered BPS pricing
         *
         * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
         * applicable parameter is a function of its marginal addition to the period total. Similar
         * to tiered pricing, the BPS parameters of a given event depends on the tier range that it
         * falls into, where each tier range is defined by an upper and lower bound. For example,
         * the first few payments may have a 0.8 BPS take-rate and all payments after a specific
         * volume may incur a take-rate of 0.5 BPS each.
         *
         * ```json
         *     ...
         *     "model_type": "tiered_bps",
         *     "tiered_bps_config": {
         *         "tiers": [
         *            {
         *                 "minimum_amount": "0",
         *                 "maximum_amount": "1000000.00",
         *                 "bps": 125,
         *                 "per_unit_maximum": "19.00"
         *            },
         *           {
         *                 "minimum_amount": "1000000.00",
         *                 "maximum_amount": null,
         *                 "bps": 115,
         *                 "per_unit_maximum": "4.00"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Matrix pricing
         *
         * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix.
         * `dimensions` defines the two event property values evaluated in this pricing model. In a
         * one-dimensional matrix, the second value is `null`. Every configuration has a list of
         * `matrix_values` which give the unit prices for specified property values. In a
         * one-dimensional matrix, the matrix values will have `dimension_values` where the second
         * value of the pair is null. If an event does not match any of the dimension values in the
         * matrix, it will resort to the `default_unit_amount`.
         *
         * ```json
         * {
         *     "model_type": "matrix"
         *     "matrix_config": {
         *         "default_unit_amount": "3.00",
         *         "dimensions": [
         *             "cluster_name",
         *             "region"
         *         ],
         *         "matrix_values": [
         *             {
         *                 "dimension_values": [
         *                     "alpha",
         *                     "west"
         *                 ],
         *                 "unit_amount": "2.00"
         *             },
         *             ...
         *         ]
         *     }
         * }
         * ```
         *
         * ## Fixed fees
         *
         * Fixed fees are prices that are applied independent of usage quantities, and follow unit
         * pricing. They also have an additional parameter `fixed_price_quantity`. If the Price
         * represents a fixed cost, this represents the quantity of units applied.
         *
         * ```json
         * {
         *     ...
         *     "id": "price_id",
         *     "model_type": "unit",
         *     "unit_config": {
         *        "unit_amount": "2.00"
         *     },
         *     "fixed_price_quantity": 3.0
         *     ...
         * }
         * ```
         */
        fun price(price: Price) = price(JsonField.of(price))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * ## Unit pricing
         *
         * With unit pricing, each unit costs a fixed amount.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "unit",
         *     "unit_config": {
         *         "unit_amount": "0.50"
         *     }
         *     ...
         * }
         * ```
         *
         * ## Tiered pricing
         *
         * In tiered pricing, the cost of a given unit depends on the tier range that it falls into,
         * where each tier range is defined by an upper and lower bound. For example, the first ten
         * units may cost $0.50 each and all units thereafter may cost $0.10 each.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "tiered",
         *     "tiered_config": {
         *         "tiers": [
         *             {
         *                 "first_unit": 1,
         *                 "last_unit": 10,
         *                 "unit_amount": "0.50"
         *             },
         *             {
         *                 "first_unit": 11,
         *                 "last_unit": null,
         *                 "unit_amount": "0.10"
         *             }
         *         ]
         *     }
         *     ...
         * ```
         *
         * ## Bulk pricing
         *
         * Bulk pricing applies when the number of units determine the cost of all units. For
         * example, if you've bought less than 10 units, they may each be $0.50 for a total of
         * $5.00. Once you've bought more than 10 units, all units may now be priced at $0.40 (i.e.
         * 101 units total would be $40.40).
         *
         * ```json
         * {
         *     ...
         *     "model_type": "bulk",
         *     "bulk_config": {
         *         "tiers": [
         *             {
         *                 "maximum_units": 10,
         *                 "unit_amount": "0.50"
         *             },
         *             {
         *                 "maximum_units": 1000,
         *                 "unit_amount": "0.40"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Package pricing
         *
         * Package pricing defines the size or granularity of a unit for billing purposes. For
         * example, if the package size is set to 5, then 4 units will be billed as 5 and 6 units
         * will be billed at 10.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "package",
         *     "package_config": {
         *         "package_amount": "0.80",
         *         "package_size": 10
         *     }
         *     ...
         * }
         * ```
         *
         * ## BPS pricing
         *
         * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a percent
         * (the number of basis points to charge), as well as a cap per event to assess. For
         * example, this would allow you to assess a fee of 0.25% on every payment you process, with
         * a maximum charge of $25 per payment.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "bps",
         *     "bps_config": {
         *        "bps": 125,
         *        "per_unit_maximum": "11.00"
         *     }
         *     ...
         *  }
         * ```
         *
         * ## Bulk BPS pricing
         *
         * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total
         * quantity across all events. Similar to bulk pricing, the BPS parameters of a given event
         * depends on the tier range that the billing period falls into. Each tier range is defined
         * by an upper bound. For example, after $1.5M of payment volume is reached, each individual
         * payment may have a lower cap or a smaller take-rate.
         *
         * ```json
         *     ...
         *     "model_type": "bulk_bps",
         *     "bulk_bps_config": {
         *         "tiers": [
         *            {
         *                 "maximum_amount": "1000000.00",
         *                 "bps": 125,
         *                 "per_unit_maximum": "19.00"
         *            },
         *           {
         *                 "maximum_amount": null,
         *                 "bps": 115,
         *                 "per_unit_maximum": "4.00"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Tiered BPS pricing
         *
         * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
         * applicable parameter is a function of its marginal addition to the period total. Similar
         * to tiered pricing, the BPS parameters of a given event depends on the tier range that it
         * falls into, where each tier range is defined by an upper and lower bound. For example,
         * the first few payments may have a 0.8 BPS take-rate and all payments after a specific
         * volume may incur a take-rate of 0.5 BPS each.
         *
         * ```json
         *     ...
         *     "model_type": "tiered_bps",
         *     "tiered_bps_config": {
         *         "tiers": [
         *            {
         *                 "minimum_amount": "0",
         *                 "maximum_amount": "1000000.00",
         *                 "bps": 125,
         *                 "per_unit_maximum": "19.00"
         *            },
         *           {
         *                 "minimum_amount": "1000000.00",
         *                 "maximum_amount": null,
         *                 "bps": 115,
         *                 "per_unit_maximum": "4.00"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Matrix pricing
         *
         * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix.
         * `dimensions` defines the two event property values evaluated in this pricing model. In a
         * one-dimensional matrix, the second value is `null`. Every configuration has a list of
         * `matrix_values` which give the unit prices for specified property values. In a
         * one-dimensional matrix, the matrix values will have `dimension_values` where the second
         * value of the pair is null. If an event does not match any of the dimension values in the
         * matrix, it will resort to the `default_unit_amount`.
         *
         * ```json
         * {
         *     "model_type": "matrix"
         *     "matrix_config": {
         *         "default_unit_amount": "3.00",
         *         "dimensions": [
         *             "cluster_name",
         *             "region"
         *         ],
         *         "matrix_values": [
         *             {
         *                 "dimension_values": [
         *                     "alpha",
         *                     "west"
         *                 ],
         *                 "unit_amount": "2.00"
         *             },
         *             ...
         *         ]
         *     }
         * }
         * ```
         *
         * ## Fixed fees
         *
         * Fixed fees are prices that are applied independent of usage quantities, and follow unit
         * pricing. They also have an additional parameter `fixed_price_quantity`. If the Price
         * represents a fixed cost, this represents the quantity of units applied.
         *
         * ```json
         * {
         *     ...
         *     "id": "price_id",
         *     "model_type": "unit",
         *     "unit_config": {
         *        "unit_amount": "2.00"
         *     },
         *     "fixed_price_quantity": 3.0
         *     ...
         * }
         * ```
         */
        fun price(price: JsonField<Price>) = apply { this.price = price }

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
                amount,
                discount,
                endDate,
                grouping,
                minimum,
                minimumAmount,
                maximum,
                maximumAmount,
                name,
                quantity,
                startDate,
                subtotal,
                subLineItems.map { it.toImmutable() },
                taxAmounts.map { it.toImmutable() },
                id,
                price,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Maximum
    @JsonCreator
    private constructor(
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Maximum amount applied */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** Maximum amount applied */
        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds() = appliesToPriceIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Maximum = apply {
            if (!validated) {
                maximumAmount()
                appliesToPriceIds()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(maximum: Maximum) = apply {
                maximumAmount = maximum.maximumAmount
                appliesToPriceIds = maximum.appliesToPriceIds
                additionalProperties = maximum.additionalProperties.toMutableMap()
            }

            /** Maximum amount applied */
            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            /** Maximum amount applied */
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
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
                this.appliesToPriceIds = appliesToPriceIds
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
                    maximumAmount,
                    appliesToPriceIds.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Maximum && maximumAmount == other.maximumAmount && appliesToPriceIds == other.appliesToPriceIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(maximumAmount, appliesToPriceIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Minimum
    @JsonCreator
    private constructor(
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        private val minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Minimum amount applied */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** Minimum amount applied */
        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds() = appliesToPriceIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Minimum = apply {
            if (!validated) {
                minimumAmount()
                appliesToPriceIds()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(minimum: Minimum) = apply {
                minimumAmount = minimum.minimumAmount
                appliesToPriceIds = minimum.appliesToPriceIds
                additionalProperties = minimum.additionalProperties.toMutableMap()
            }

            /** Minimum amount applied */
            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            /** Minimum amount applied */
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
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
                this.appliesToPriceIds = appliesToPriceIds
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
                    minimumAmount,
                    appliesToPriceIds.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Minimum && minimumAmount == other.minimumAmount && appliesToPriceIds == other.appliesToPriceIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(minimumAmount, appliesToPriceIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = SubLineItem.Deserializer::class)
    @JsonSerialize(using = SubLineItem.Serializer::class)
    class SubLineItem
    private constructor(
        private val matrixSubLineItem: MatrixSubLineItem? = null,
        private val tierSubLineItem: TierSubLineItem? = null,
        private val otherSubLineItem: OtherSubLineItem? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun matrixSubLineItem(): MatrixSubLineItem? = matrixSubLineItem

        fun tierSubLineItem(): TierSubLineItem? = tierSubLineItem

        fun otherSubLineItem(): OtherSubLineItem? = otherSubLineItem

        fun isMatrixSubLineItem(): Boolean = matrixSubLineItem != null

        fun isTierSubLineItem(): Boolean = tierSubLineItem != null

        fun isOtherSubLineItem(): Boolean = otherSubLineItem != null

        fun asMatrixSubLineItem(): MatrixSubLineItem =
            matrixSubLineItem.getOrThrow("matrixSubLineItem")

        fun asTierSubLineItem(): TierSubLineItem = tierSubLineItem.getOrThrow("tierSubLineItem")

        fun asOtherSubLineItem(): OtherSubLineItem = otherSubLineItem.getOrThrow("otherSubLineItem")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                matrixSubLineItem != null -> visitor.visitMatrixSubLineItem(matrixSubLineItem)
                tierSubLineItem != null -> visitor.visitTierSubLineItem(tierSubLineItem)
                otherSubLineItem != null -> visitor.visitOtherSubLineItem(otherSubLineItem)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): SubLineItem = apply {
            if (!validated) {
                if (
                    matrixSubLineItem == null && tierSubLineItem == null && otherSubLineItem == null
                ) {
                    throw OrbInvalidDataException("Unknown SubLineItem: $_json")
                }
                matrixSubLineItem?.validate()
                tierSubLineItem?.validate()
                otherSubLineItem?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SubLineItem && matrixSubLineItem == other.matrixSubLineItem && tierSubLineItem == other.tierSubLineItem && otherSubLineItem == other.otherSubLineItem /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(matrixSubLineItem, tierSubLineItem, otherSubLineItem) /* spotless:on */

        override fun toString(): String =
            when {
                matrixSubLineItem != null -> "SubLineItem{matrixSubLineItem=$matrixSubLineItem}"
                tierSubLineItem != null -> "SubLineItem{tierSubLineItem=$tierSubLineItem}"
                otherSubLineItem != null -> "SubLineItem{otherSubLineItem=$otherSubLineItem}"
                _json != null -> "SubLineItem{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid SubLineItem")
            }

        companion object {

            fun ofMatrixSubLineItem(matrixSubLineItem: MatrixSubLineItem) =
                SubLineItem(matrixSubLineItem = matrixSubLineItem)

            fun ofTierSubLineItem(tierSubLineItem: TierSubLineItem) =
                SubLineItem(tierSubLineItem = tierSubLineItem)

            fun ofOtherSubLineItem(otherSubLineItem: OtherSubLineItem) =
                SubLineItem(otherSubLineItem = otherSubLineItem)
        }

        interface Visitor<out T> {

            fun visitMatrixSubLineItem(matrixSubLineItem: MatrixSubLineItem): T

            fun visitTierSubLineItem(tierSubLineItem: TierSubLineItem): T

            fun visitOtherSubLineItem(otherSubLineItem: OtherSubLineItem): T

            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown SubLineItem: $json")
            }
        }

        class Deserializer : BaseDeserializer<SubLineItem>(SubLineItem::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): SubLineItem {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "matrix" -> {
                        tryDeserialize(node, jacksonTypeRef<MatrixSubLineItem>()) { it.validate() }
                            ?.let {
                                return SubLineItem(matrixSubLineItem = it, _json = json)
                            }
                    }
                    "tier" -> {
                        tryDeserialize(node, jacksonTypeRef<TierSubLineItem>()) { it.validate() }
                            ?.let {
                                return SubLineItem(tierSubLineItem = it, _json = json)
                            }
                    }
                    "'null'" -> {
                        tryDeserialize(node, jacksonTypeRef<OtherSubLineItem>()) { it.validate() }
                            ?.let {
                                return SubLineItem(otherSubLineItem = it, _json = json)
                            }
                    }
                }

                return SubLineItem(_json = json)
            }
        }

        class Serializer : BaseSerializer<SubLineItem>(SubLineItem::class) {

            override fun serialize(
                value: SubLineItem,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.matrixSubLineItem != null ->
                        generator.writeObject(value.matrixSubLineItem)
                    value.tierSubLineItem != null -> generator.writeObject(value.tierSubLineItem)
                    value.otherSubLineItem != null -> generator.writeObject(value.otherSubLineItem)
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
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("grouping")
            @ExcludeMissing
            private val grouping: JsonField<Grouping> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("matrix_config")
            @ExcludeMissing
            private val matrixConfig: JsonField<MatrixConfig> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The total amount for this sub line item. */
            fun amount(): String = amount.getRequired("amount")

            fun name(): String = name.getRequired("name")

            fun quantity(): Double = quantity.getRequired("quantity")

            fun grouping(): Grouping? = grouping.getNullable("grouping")

            fun type(): Type = type.getRequired("type")

            fun matrixConfig(): MatrixConfig = matrixConfig.getRequired("matrix_config")

            /** The total amount for this sub line item. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

            @JsonProperty("grouping") @ExcludeMissing fun _grouping() = grouping

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("matrix_config") @ExcludeMissing fun _matrixConfig() = matrixConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): MatrixSubLineItem = apply {
                if (!validated) {
                    amount()
                    name()
                    quantity()
                    grouping()?.validate()
                    type()
                    matrixConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var grouping: JsonField<Grouping> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var matrixConfig: JsonField<MatrixConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(matrixSubLineItem: MatrixSubLineItem) = apply {
                    amount = matrixSubLineItem.amount
                    name = matrixSubLineItem.name
                    quantity = matrixSubLineItem.quantity
                    grouping = matrixSubLineItem.grouping
                    type = matrixSubLineItem.type
                    matrixConfig = matrixSubLineItem.matrixConfig
                    additionalProperties = matrixSubLineItem.additionalProperties.toMutableMap()
                }

                /** The total amount for this sub line item. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The total amount for this sub line item. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun grouping(grouping: Grouping) = grouping(JsonField.of(grouping))

                fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun matrixConfig(matrixConfig: MatrixConfig) =
                    matrixConfig(JsonField.of(matrixConfig))

                fun matrixConfig(matrixConfig: JsonField<MatrixConfig>) = apply {
                    this.matrixConfig = matrixConfig
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

                fun build(): MatrixSubLineItem =
                    MatrixSubLineItem(
                        amount,
                        name,
                        quantity,
                        grouping,
                        type,
                        matrixConfig,
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

                @JsonProperty("key") @ExcludeMissing fun _key() = key

                /** No value indicates the default group */
                @JsonProperty("value") @ExcludeMissing fun _value() = value

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Grouping = apply {
                    if (!validated) {
                        key()
                        value()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var key: JsonField<String> = JsonMissing.of()
                    private var value: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(grouping: Grouping) = apply {
                        key = grouping.key
                        value = grouping.value
                        additionalProperties = grouping.additionalProperties.toMutableMap()
                    }

                    fun key(key: String) = key(JsonField.of(key))

                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** No value indicates the default group */
                    fun value(value: String) = value(JsonField.of(value))

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
                            key,
                            value,
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
                fun _dimensionValues() = dimensionValues

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): MatrixConfig = apply {
                    if (!validated) {
                        dimensionValues()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var dimensionValues: JsonField<List<String?>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(matrixConfig: MatrixConfig) = apply {
                        dimensionValues = matrixConfig.dimensionValues
                        additionalProperties = matrixConfig.additionalProperties.toMutableMap()
                    }

                    /** The ordered dimension values for this line item. */
                    fun dimensionValues(dimensionValues: List<String?>) =
                        dimensionValues(JsonField.of(dimensionValues))

                    /** The ordered dimension values for this line item. */
                    fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
                        this.dimensionValues = dimensionValues
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
                            dimensionValues.map { it.toImmutable() },
                            additionalProperties.toImmutable()
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

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val MATRIX = of("matrix")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    MATRIX,
                }

                enum class Value {
                    MATRIX,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        MATRIX -> Value.MATRIX
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        MATRIX -> Known.MATRIX
                        else -> throw OrbInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

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

                return /* spotless:off */ other is MatrixSubLineItem && amount == other.amount && name == other.name && quantity == other.quantity && grouping == other.grouping && type == other.type && matrixConfig == other.matrixConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, name, quantity, grouping, type, matrixConfig, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MatrixSubLineItem{amount=$amount, name=$name, quantity=$quantity, grouping=$grouping, type=$type, matrixConfig=$matrixConfig, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TierSubLineItem
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("grouping")
            @ExcludeMissing
            private val grouping: JsonField<Grouping> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("tier_config")
            @ExcludeMissing
            private val tierConfig: JsonField<TierConfig> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The total amount for this sub line item. */
            fun amount(): String = amount.getRequired("amount")

            fun name(): String = name.getRequired("name")

            fun quantity(): Double = quantity.getRequired("quantity")

            fun grouping(): Grouping? = grouping.getNullable("grouping")

            fun type(): Type = type.getRequired("type")

            fun tierConfig(): TierConfig = tierConfig.getRequired("tier_config")

            /** The total amount for this sub line item. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

            @JsonProperty("grouping") @ExcludeMissing fun _grouping() = grouping

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("tier_config") @ExcludeMissing fun _tierConfig() = tierConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TierSubLineItem = apply {
                if (!validated) {
                    amount()
                    name()
                    quantity()
                    grouping()?.validate()
                    type()
                    tierConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var grouping: JsonField<Grouping> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var tierConfig: JsonField<TierConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tierSubLineItem: TierSubLineItem) = apply {
                    amount = tierSubLineItem.amount
                    name = tierSubLineItem.name
                    quantity = tierSubLineItem.quantity
                    grouping = tierSubLineItem.grouping
                    type = tierSubLineItem.type
                    tierConfig = tierSubLineItem.tierConfig
                    additionalProperties = tierSubLineItem.additionalProperties.toMutableMap()
                }

                /** The total amount for this sub line item. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The total amount for this sub line item. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun grouping(grouping: Grouping) = grouping(JsonField.of(grouping))

                fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun tierConfig(tierConfig: TierConfig) = tierConfig(JsonField.of(tierConfig))

                fun tierConfig(tierConfig: JsonField<TierConfig>) = apply {
                    this.tierConfig = tierConfig
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

                fun build(): TierSubLineItem =
                    TierSubLineItem(
                        amount,
                        name,
                        quantity,
                        grouping,
                        type,
                        tierConfig,
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

                @JsonProperty("key") @ExcludeMissing fun _key() = key

                /** No value indicates the default group */
                @JsonProperty("value") @ExcludeMissing fun _value() = value

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Grouping = apply {
                    if (!validated) {
                        key()
                        value()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var key: JsonField<String> = JsonMissing.of()
                    private var value: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(grouping: Grouping) = apply {
                        key = grouping.key
                        value = grouping.value
                        additionalProperties = grouping.additionalProperties.toMutableMap()
                    }

                    fun key(key: String) = key(JsonField.of(key))

                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** No value indicates the default group */
                    fun value(value: String) = value(JsonField.of(value))

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
                            key,
                            value,
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

                @JsonProperty("first_unit") @ExcludeMissing fun _firstUnit() = firstUnit

                @JsonProperty("last_unit") @ExcludeMissing fun _lastUnit() = lastUnit

                @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): TierConfig = apply {
                    if (!validated) {
                        firstUnit()
                        lastUnit()
                        unitAmount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var firstUnit: JsonField<Double> = JsonMissing.of()
                    private var lastUnit: JsonField<Double> = JsonMissing.of()
                    private var unitAmount: JsonField<String> = JsonMissing.of()
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

                    fun lastUnit(lastUnit: Double) = lastUnit(JsonField.of(lastUnit))

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
                            firstUnit,
                            lastUnit,
                            unitAmount,
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

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val TIER = of("tier")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    TIER,
                }

                enum class Value {
                    TIER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TIER -> Value.TIER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TIER -> Known.TIER
                        else -> throw OrbInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

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

                return /* spotless:off */ other is TierSubLineItem && amount == other.amount && name == other.name && quantity == other.quantity && grouping == other.grouping && type == other.type && tierConfig == other.tierConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, name, quantity, grouping, type, tierConfig, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TierSubLineItem{amount=$amount, name=$name, quantity=$quantity, grouping=$grouping, type=$type, tierConfig=$tierConfig, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class OtherSubLineItem
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("grouping")
            @ExcludeMissing
            private val grouping: JsonField<Grouping> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The total amount for this sub line item. */
            fun amount(): String = amount.getRequired("amount")

            fun name(): String = name.getRequired("name")

            fun quantity(): Double = quantity.getRequired("quantity")

            fun grouping(): Grouping? = grouping.getNullable("grouping")

            fun type(): Type = type.getRequired("type")

            /** The total amount for this sub line item. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

            @JsonProperty("grouping") @ExcludeMissing fun _grouping() = grouping

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): OtherSubLineItem = apply {
                if (!validated) {
                    amount()
                    name()
                    quantity()
                    grouping()?.validate()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var grouping: JsonField<Grouping> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(otherSubLineItem: OtherSubLineItem) = apply {
                    amount = otherSubLineItem.amount
                    name = otherSubLineItem.name
                    quantity = otherSubLineItem.quantity
                    grouping = otherSubLineItem.grouping
                    type = otherSubLineItem.type
                    additionalProperties = otherSubLineItem.additionalProperties.toMutableMap()
                }

                /** The total amount for this sub line item. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The total amount for this sub line item. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun grouping(grouping: Grouping) = grouping(JsonField.of(grouping))

                fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

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
                        amount,
                        name,
                        quantity,
                        grouping,
                        type,
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

                @JsonProperty("key") @ExcludeMissing fun _key() = key

                /** No value indicates the default group */
                @JsonProperty("value") @ExcludeMissing fun _value() = value

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Grouping = apply {
                    if (!validated) {
                        key()
                        value()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var key: JsonField<String> = JsonMissing.of()
                    private var value: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(grouping: Grouping) = apply {
                        key = grouping.key
                        value = grouping.value
                        additionalProperties = grouping.additionalProperties.toMutableMap()
                    }

                    fun key(key: String) = key(JsonField.of(key))

                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** No value indicates the default group */
                    fun value(value: String) = value(JsonField.of(value))

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
                            key,
                            value,
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

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val NULL = of("'null'")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    NULL,
                }

                enum class Value {
                    NULL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        NULL -> Value.NULL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        NULL -> Known.NULL
                        else -> throw OrbInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

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

                return /* spotless:off */ other is OtherSubLineItem && amount == other.amount && name == other.name && quantity == other.quantity && grouping == other.grouping && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, name, quantity, grouping, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OtherSubLineItem{amount=$amount, name=$name, quantity=$quantity, grouping=$grouping, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    @NoAutoDetect
    class TaxAmount
    @JsonCreator
    private constructor(
        @JsonProperty("tax_rate_description")
        @ExcludeMissing
        private val taxRateDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_rate_percentage")
        @ExcludeMissing
        private val taxRatePercentage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The human-readable description of the applied tax rate. */
        fun taxRateDescription(): String = taxRateDescription.getRequired("tax_rate_description")

        /** The tax rate percentage, out of 100. */
        fun taxRatePercentage(): String? = taxRatePercentage.getNullable("tax_rate_percentage")

        /** The amount of additional tax incurred by this tax rate. */
        fun amount(): String = amount.getRequired("amount")

        /** The human-readable description of the applied tax rate. */
        @JsonProperty("tax_rate_description")
        @ExcludeMissing
        fun _taxRateDescription() = taxRateDescription

        /** The tax rate percentage, out of 100. */
        @JsonProperty("tax_rate_percentage")
        @ExcludeMissing
        fun _taxRatePercentage() = taxRatePercentage

        /** The amount of additional tax incurred by this tax rate. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TaxAmount = apply {
            if (!validated) {
                taxRateDescription()
                taxRatePercentage()
                amount()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var taxRateDescription: JsonField<String> = JsonMissing.of()
            private var taxRatePercentage: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(taxAmount: TaxAmount) = apply {
                taxRateDescription = taxAmount.taxRateDescription
                taxRatePercentage = taxAmount.taxRatePercentage
                amount = taxAmount.amount
                additionalProperties = taxAmount.additionalProperties.toMutableMap()
            }

            /** The human-readable description of the applied tax rate. */
            fun taxRateDescription(taxRateDescription: String) =
                taxRateDescription(JsonField.of(taxRateDescription))

            /** The human-readable description of the applied tax rate. */
            fun taxRateDescription(taxRateDescription: JsonField<String>) = apply {
                this.taxRateDescription = taxRateDescription
            }

            /** The tax rate percentage, out of 100. */
            fun taxRatePercentage(taxRatePercentage: String) =
                taxRatePercentage(JsonField.of(taxRatePercentage))

            /** The tax rate percentage, out of 100. */
            fun taxRatePercentage(taxRatePercentage: JsonField<String>) = apply {
                this.taxRatePercentage = taxRatePercentage
            }

            /** The amount of additional tax incurred by this tax rate. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /** The amount of additional tax incurred by this tax rate. */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

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
                    taxRateDescription,
                    taxRatePercentage,
                    amount,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaxAmount && taxRateDescription == other.taxRateDescription && taxRatePercentage == other.taxRatePercentage && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(taxRateDescription, taxRatePercentage, amount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TaxAmount{taxRateDescription=$taxRateDescription, taxRatePercentage=$taxRatePercentage, amount=$amount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceLineItemCreateResponse && amount == other.amount && discount == other.discount && endDate == other.endDate && grouping == other.grouping && minimum == other.minimum && minimumAmount == other.minimumAmount && maximum == other.maximum && maximumAmount == other.maximumAmount && name == other.name && quantity == other.quantity && startDate == other.startDate && subtotal == other.subtotal && subLineItems == other.subLineItems && taxAmounts == other.taxAmounts && id == other.id && price == other.price && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, discount, endDate, grouping, minimum, minimumAmount, maximum, maximumAmount, name, quantity, startDate, subtotal, subLineItems, taxAmounts, id, price, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceLineItemCreateResponse{amount=$amount, discount=$discount, endDate=$endDate, grouping=$grouping, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, name=$name, quantity=$quantity, startDate=$startDate, subtotal=$subtotal, subLineItems=$subLineItems, taxAmounts=$taxAmounts, id=$id, price=$price, additionalProperties=$additionalProperties}"
}
