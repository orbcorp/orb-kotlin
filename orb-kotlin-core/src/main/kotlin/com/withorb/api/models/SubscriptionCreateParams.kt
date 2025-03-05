// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.checkKnown
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * A subscription represents the purchase of a plan by a customer. The customer is identified by
 * either the `customer_id` or the `external_customer_id`, and exactly one of these fields must be
 * provided.
 *
 * By default, subscriptions begin on the day that they're created and renew automatically for each
 * billing cycle at the cadence that's configured in the plan definition.
 *
 * The default configuration for subscriptions in Orb is **In-advance billing** and **Beginning of
 * month alignment** (see [Subscription](/core-concepts##subscription) for more details).
 *
 * In order to change the alignment behavior, Orb also supports billing subscriptions on the day of
 * the month they are created. If `align_billing_with_subscription_start_date = true` is specified,
 * subscriptions have billing cycles that are aligned with their `start_date`. For example, a
 * subscription that begins on January 15th will have a billing cycle from January 15th to February
 * 15th. Every subsequent billing cycle will continue to start and invoice on the 15th.
 *
 * If the "day" value is greater than the number of days in the month, the next billing cycle will
 * start at the end of the month. For example, if the start_date is January 31st, the next billing
 * cycle will start on February 28th.
 *
 * If a customer was created with a currency, Orb only allows subscribing the customer to a plan
 * with a matching `invoicing_currency`. If the customer does not have a currency set, on
 * subscription creation, we set the customer's currency to be the `invoicing_currency` of the plan.
 *
 * ## Customize your customer's subscriptions
 *
 * Prices and adjustments in a plan can be added, removed, or replaced for the subscription being
 * created. This is useful when a customer has prices that differ from the default prices for a
 * specific plan.
 *
 * <Note> This feature is only available for accounts that have migrated to Subscription Overrides
 * Version 2. You can find your Subscription Overrides Version at the bottom of your
 * [Plans page](https://app.withorb.com/plans) </Note>
 *
 * ### Adding Prices
 *
 * To add prices, provide a list of objects with the key `add_prices`. An object in the list must
 * specify an existing add-on price with a `price_id` or `external_price_id` field, or create a new
 * add-on price by including an object with the key `price`, identical to what would be used in the
 * request body for the [create price endpoint](/api-reference/price/create-price). See the
 * [Price resource](/product-catalog/price-configuration) for the specification of different price
 * model configurations possible in this object.
 *
 * If the plan has phases, each object in the list must include a number with `plan_phase_order` key
 * to indicate which phase the price should be added to.
 *
 * An object in the list can specify an optional `start_date` and optional `end_date`. This is
 * equivalent to creating a price interval with the
 * [add/edit price intervals endpoint](/api-reference/price-interval/add-or-edit-price-intervals).
 * If unspecified, the start or end date of the phase or subscription will be used.
 *
 * An object in the list can specify an optional `minimum_amount`, `maximum_amount`, or `discounts`.
 * This will create adjustments which apply only to this price.
 *
 * Additionally, an object in the list can specify an optional `reference_id`. This ID can be used
 * to reference this price when [adding an adjustment](#adding-adjustments) in the same API call.
 * However the ID is _transient_ and cannot be used to refer to the price in future API calls.
 *
 * ### Removing Prices
 *
 * To remove prices, provide a list of objects with the key `remove_prices`. An object in the list
 * must specify a plan price with either a `price_id` or `external_price_id` field.
 *
 * ### Replacing Prices
 *
 * To replace prices, provide a list of objects with the key `replace_prices`. An object in the list
 * must specify a plan price to replace with the `replaces_price_id` key, and it must specify a
 * price to replace it with by either referencing an existing add-on price with a `price_id` or
 * `external_price_id` field, or by creating a new add-on price by including an object with the key
 * `price`, identical to what would be used in the request body for the
 * [create price endpoint](/api-reference/price/create-price). See the
 * [Price resource](/product-catalog/price-configuration) for the specification of different price
 * model configurations possible in this object.
 *
 * For fixed fees, an object in the list can supply a `fixed_price_quantity` instead of a `price`,
 * `price_id`, or `external_price_id` field. This will update only the quantity for the price,
 * similar to the [Update price quantity](/api-reference/subscription/update-price-quantity)
 * endpoint.
 *
 * The replacement price will have the same phase, if applicable, and the same start and end dates
 * as the price it replaces.
 *
 * An object in the list can specify an optional `minimum_amount`, `maximum_amount`, or `discounts`.
 * This will create adjustments which apply only to this price.
 *
 * Additionally, an object in the list can specify an optional `reference_id`. This ID can be used
 * to reference the replacement price when [adding an adjustment](#adding-adjustments) in the same
 * API call. However the ID is _transient_ and cannot be used to refer to the price in future API
 * calls.
 *
 * ### Adding adjustments
 *
 * To add adjustments, provide a list of objects with the key `add_adjustments`. An object in the
 * list must include an object with the key `adjustment`, identical to the adjustment object in the
 * [add/edit price intervals endpoint](/api-reference/price-interval/add-or-edit-price-intervals).
 *
 * If the plan has phases, each object in the list must include a number with `plan_phase_order` key
 * to indicate which phase the adjustment should be added to.
 *
 * An object in the list can specify an optional `start_date` and optional `end_date`. If
 * unspecified, the start or end date of the phase or subscription will be used.
 *
 * ### Removing adjustments
 *
 * To remove adjustments, provide a list of objects with the key `remove_adjustments`. An object in
 * the list must include a key, `adjustment_id`, with the ID of the adjustment to be removed.
 *
 * ### Replacing adjustments
 *
 * To replace adjustments, provide a list of objects with the key `replace_adjustments`. An object
 * in the list must specify a plan adjustment to replace with the `replaces_adjustment_id` key, and
 * it must specify an adjustment to replace it with by including an object with the key
 * `adjustment`, identical to the adjustment object in the
 * [add/edit price intervals endpoint](/api-reference/price-interval/add-or-edit-price-intervals).
 *
 * The replacement adjustment will have the same phase, if applicable, and the same start and end
 * dates as the adjustment it replaces.
 *
 * ## Price overrides (DEPRECATED)
 *
 * <Note> Price overrides are being phased out in favor adding/removing/replacing prices. (See
 * [Customize your customer's subscriptions](/api-reference/subscription/create-subscription))
 * </Note>
 *
 * Price overrides are used to update some or all prices in a plan for the specific subscription
 * being created. This is useful when a new customer has negotiated a rate that is unique to the
 * customer.
 *
 * To override prices, provide a list of objects with the key `price_overrides`. The price object in
 * the list of overrides is expected to contain the existing price id, the `model_type` and
 * configuration. (See the [Price resource](/product-catalog/price-configuration) for the
 * specification of different price model configurations.) The numerical values can be updated, but
 * the billable metric, cadence, type, and name of a price can not be overridden.
 *
 * ### Maximums and Minimums
 *
 * Minimums and maximums, much like price overrides, can be useful when a new customer has
 * negotiated a new or different minimum or maximum spend cap than the default for a given price. If
 * one exists for a price and null is provided for the minimum/maximum override on creation, then
 * there will be no minimum/maximum on the new subscription. If no value is provided, then the
 * default price maximum or minimum is used.
 *
 * To add a minimum for a specific price, add `minimum_amount` to the specific price in the
 * `price_overrides` object.
 *
 * To add a maximum for a specific price, add `maximum_amount` to the specific price in the
 * `price_overrides` object.
 *
 * ### Minimum override example
 *
 * Price minimum override example:
 * ```json
 * {
 *   ...
 *   "id": "price_id",
 *   "model_type": "unit",
 *   "unit_config": {
 *     "unit_amount": "0.50"
 *   },
 *   "minimum_amount": "100.00"
 *   ...
 * }
 * ```
 *
 * Removing an existing minimum example
 *
 * ```json
 * {
 *   ...
 *   "id": "price_id",
 *   "model_type": "unit",
 *   "unit_config": {
 *     "unit_amount": "0.50"
 *   },
 *   "minimum_amount": null
 *   ...
 * }
 * ```
 *
 * ### Discounts
 *
 * Discounts, like price overrides, can be useful when a new customer has negotiated a new or
 * different discount than the default for a price. If a discount exists for a price and a null
 * discount is provided on creation, then there will be no discount on the new subscription.
 *
 * To add a discount for a specific price, add `discount` to the price in the `price_overrides`
 * object. Discount should be a dictionary of the format:
 * ```ts
 * {
 *   "discount_type": "amount" | "percentage" | "usage",
 *   "amount_discount": string,
 *   "percentage_discount": string,
 *   "usage_discount": string
 * }
 * ```
 *
 * where either `amount_discount`, `percentage_discount`, or `usage_discount` is provided.
 *
 * Price discount example
 *
 * ```json
 * {
 *   ...
 *   "id": "price_id",
 *   "model_type": "unit",
 *   "unit_config": {
 *     "unit_amount": "0.50"
 *   },
 *   "discount": {"discount_type": "amount", "amount_discount": "175"},
 * }
 * ```
 *
 * Removing an existing discount example
 *
 * ```json
 * {
 *   "customer_id": "customer_id",
 *   "plan_id": "plan_id",
 *   "discount": null,
 *   "price_overrides": [ ... ]
 *   ...
 * }
 * ```
 *
 * ## Threshold Billing
 *
 * Orb supports invoicing for a subscription when a preconfigured usage threshold is hit. To enable
 * threshold billing, pass in an `invoicing_threshold`, which is specified in the subscription's
 * invoicing currency, when creating a subscription. E.g. pass in `10.00` to issue an invoice when
 * usage amounts hit $10.00 for a subscription that invoices in USD.
 */
class SubscriptionCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Additional adjustments to be added to the subscription. (Only available for accounts that
     * have migrated off of legacy subscription overrides)
     */
    fun addAdjustments(): List<AddSubscriptionAdjustmentParams>? = body.addAdjustments()

    /**
     * Additional prices to be added to the subscription. (Only available for accounts that have
     * migrated off of legacy subscription overrides)
     */
    fun addPrices(): List<AddSubscriptionPriceParams>? = body.addPrices()

    fun alignBillingWithSubscriptionStartDate(): Boolean? =
        body.alignBillingWithSubscriptionStartDate()

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. If not specified, this defaults to the behavior
     * configured for this customer.
     */
    fun autoCollection(): Boolean? = body.autoCollection()

    @Deprecated("deprecated") fun awsRegion(): String? = body.awsRegion()

    fun billingCycleAnchorConfiguration(): BillingCycleAnchorConfigurationModel? =
        body.billingCycleAnchorConfiguration()

    /**
     * Redemption code to be used for this subscription. If the coupon cannot be found by its
     * redemption code, or cannot be redeemed, an error response will be returned and the
     * subscription creation or plan change will not be scheduled.
     */
    fun couponRedemptionCode(): String? = body.couponRedemptionCode()

    @Deprecated("deprecated") fun creditsOverageRate(): Double? = body.creditsOverageRate()

    fun customerId(): String? = body.customerId()

    /**
     * Determines the default memo on this subscription's invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     */
    fun defaultInvoiceMemo(): String? = body.defaultInvoiceMemo()

    fun endDate(): OffsetDateTime? = body.endDate()

    fun externalCustomerId(): String? = body.externalCustomerId()

    @Deprecated("deprecated")
    fun externalMarketplace(): ExternalMarketplace? = body.externalMarketplace()

    @Deprecated("deprecated")
    fun externalMarketplaceReportingId(): String? = body.externalMarketplaceReportingId()

    /**
     * The external_plan_id of the plan that the given subscription should be switched to. Note that
     * either this property or `plan_id` must be specified.
     */
    fun externalPlanId(): String? = body.externalPlanId()

    /**
     * An additional filter to apply to usage queries. This filter must be expressed as a boolean
     * [computed property](/extensibility/advanced-metrics#computed-properties). If null, usage
     * queries will not include any additional filter.
     */
    fun filter(): String? = body.filter()

    /** The phase of the plan to start with */
    fun initialPhaseOrder(): Long? = body.initialPhaseOrder()

    /**
     * When this subscription's accrued usage reaches this threshold, an invoice will be issued for
     * the subscription. If not specified, invoices will only be issued at the end of the billing
     * period.
     */
    fun invoicingThreshold(): String? = body.invoicingThreshold()

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * The net terms determines the difference between the invoice date and the issue date for the
     * invoice. If you intend the invoice to be due on issue, set this to 0. If not provided, this
     * defaults to the value specified in the plan.
     */
    fun netTerms(): Long? = body.netTerms()

    @Deprecated("deprecated") fun perCreditOverageAmount(): Double? = body.perCreditOverageAmount()

    /**
     * The plan that the given subscription should be switched to. Note that either this property or
     * `external_plan_id` must be specified.
     */
    fun planId(): String? = body.planId()

    /**
     * Specifies which version of the plan to subscribe to. If null, the default version will be
     * used.
     */
    fun planVersionNumber(): Long? = body.planVersionNumber()

    /** Optionally provide a list of overrides for prices on the plan */
    @Deprecated("deprecated") fun priceOverrides(): List<JsonValue>? = body.priceOverrides()

    /**
     * Plan adjustments to be removed from the subscription. (Only available for accounts that have
     * migrated off of legacy subscription overrides)
     */
    fun removeAdjustments(): List<RemoveSubscriptionAdjustmentParams>? = body.removeAdjustments()

    /**
     * Plan prices to be removed from the subscription. (Only available for accounts that have
     * migrated off of legacy subscription overrides)
     */
    fun removePrices(): List<RemoveSubscriptionPriceParams>? = body.removePrices()

    /**
     * Plan adjustments to be replaced with additional adjustments on the subscription. (Only
     * available for accounts that have migrated off of legacy subscription overrides)
     */
    fun replaceAdjustments(): List<ReplaceSubscriptionAdjustmentParams>? = body.replaceAdjustments()

    /**
     * Plan prices to be replaced with additional prices on the subscription. (Only available for
     * accounts that have migrated off of legacy subscription overrides)
     */
    fun replacePrices(): List<ReplaceSubscriptionPriceParams>? = body.replacePrices()

    fun startDate(): OffsetDateTime? = body.startDate()

    /**
     * The duration of the trial period in days. If not provided, this defaults to the value
     * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
     */
    fun trialDurationDays(): Long? = body.trialDurationDays()

    /**
     * A list of customer IDs whose usage events will be aggregated and billed under this
     * subscription. By default, a subscription only considers usage events associated with its
     * attached customer's customer_id. When usage_customer_ids is provided, the subscription
     * includes usage events from the specified customers only. Provided usage_customer_ids must be
     * either the customer for this subscription itself, or any of that customer's children.
     */
    fun usageCustomerIds(): List<String>? = body.usageCustomerIds()

    /**
     * Additional adjustments to be added to the subscription. (Only available for accounts that
     * have migrated off of legacy subscription overrides)
     */
    fun _addAdjustments(): JsonField<List<AddSubscriptionAdjustmentParams>> = body._addAdjustments()

    /**
     * Additional prices to be added to the subscription. (Only available for accounts that have
     * migrated off of legacy subscription overrides)
     */
    fun _addPrices(): JsonField<List<AddSubscriptionPriceParams>> = body._addPrices()

    fun _alignBillingWithSubscriptionStartDate(): JsonField<Boolean> =
        body._alignBillingWithSubscriptionStartDate()

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. If not specified, this defaults to the behavior
     * configured for this customer.
     */
    fun _autoCollection(): JsonField<Boolean> = body._autoCollection()

    @Deprecated("deprecated") fun _awsRegion(): JsonField<String> = body._awsRegion()

    fun _billingCycleAnchorConfiguration(): JsonField<BillingCycleAnchorConfigurationModel> =
        body._billingCycleAnchorConfiguration()

    /**
     * Redemption code to be used for this subscription. If the coupon cannot be found by its
     * redemption code, or cannot be redeemed, an error response will be returned and the
     * subscription creation or plan change will not be scheduled.
     */
    fun _couponRedemptionCode(): JsonField<String> = body._couponRedemptionCode()

    @Deprecated("deprecated")
    fun _creditsOverageRate(): JsonField<Double> = body._creditsOverageRate()

    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Determines the default memo on this subscription's invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     */
    fun _defaultInvoiceMemo(): JsonField<String> = body._defaultInvoiceMemo()

    fun _endDate(): JsonField<OffsetDateTime> = body._endDate()

    fun _externalCustomerId(): JsonField<String> = body._externalCustomerId()

    @Deprecated("deprecated")
    fun _externalMarketplace(): JsonField<ExternalMarketplace> = body._externalMarketplace()

    @Deprecated("deprecated")
    fun _externalMarketplaceReportingId(): JsonField<String> =
        body._externalMarketplaceReportingId()

    /**
     * The external_plan_id of the plan that the given subscription should be switched to. Note that
     * either this property or `plan_id` must be specified.
     */
    fun _externalPlanId(): JsonField<String> = body._externalPlanId()

    /**
     * An additional filter to apply to usage queries. This filter must be expressed as a boolean
     * [computed property](/extensibility/advanced-metrics#computed-properties). If null, usage
     * queries will not include any additional filter.
     */
    fun _filter(): JsonField<String> = body._filter()

    /** The phase of the plan to start with */
    fun _initialPhaseOrder(): JsonField<Long> = body._initialPhaseOrder()

    /**
     * When this subscription's accrued usage reaches this threshold, an invoice will be issued for
     * the subscription. If not specified, invoices will only be issued at the end of the billing
     * period.
     */
    fun _invoicingThreshold(): JsonField<String> = body._invoicingThreshold()

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * The net terms determines the difference between the invoice date and the issue date for the
     * invoice. If you intend the invoice to be due on issue, set this to 0. If not provided, this
     * defaults to the value specified in the plan.
     */
    fun _netTerms(): JsonField<Long> = body._netTerms()

    @Deprecated("deprecated")
    fun _perCreditOverageAmount(): JsonField<Double> = body._perCreditOverageAmount()

    /**
     * The plan that the given subscription should be switched to. Note that either this property or
     * `external_plan_id` must be specified.
     */
    fun _planId(): JsonField<String> = body._planId()

    /**
     * Specifies which version of the plan to subscribe to. If null, the default version will be
     * used.
     */
    fun _planVersionNumber(): JsonField<Long> = body._planVersionNumber()

    /** Optionally provide a list of overrides for prices on the plan */
    @Deprecated("deprecated")
    fun _priceOverrides(): JsonField<List<JsonValue>> = body._priceOverrides()

    /**
     * Plan adjustments to be removed from the subscription. (Only available for accounts that have
     * migrated off of legacy subscription overrides)
     */
    fun _removeAdjustments(): JsonField<List<RemoveSubscriptionAdjustmentParams>> =
        body._removeAdjustments()

    /**
     * Plan prices to be removed from the subscription. (Only available for accounts that have
     * migrated off of legacy subscription overrides)
     */
    fun _removePrices(): JsonField<List<RemoveSubscriptionPriceParams>> = body._removePrices()

    /**
     * Plan adjustments to be replaced with additional adjustments on the subscription. (Only
     * available for accounts that have migrated off of legacy subscription overrides)
     */
    fun _replaceAdjustments(): JsonField<List<ReplaceSubscriptionAdjustmentParams>> =
        body._replaceAdjustments()

    /**
     * Plan prices to be replaced with additional prices on the subscription. (Only available for
     * accounts that have migrated off of legacy subscription overrides)
     */
    fun _replacePrices(): JsonField<List<ReplaceSubscriptionPriceParams>> = body._replacePrices()

    fun _startDate(): JsonField<OffsetDateTime> = body._startDate()

    /**
     * The duration of the trial period in days. If not provided, this defaults to the value
     * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
     */
    fun _trialDurationDays(): JsonField<Long> = body._trialDurationDays()

    /**
     * A list of customer IDs whose usage events will be aggregated and billed under this
     * subscription. By default, a subscription only considers usage events associated with its
     * attached customer's customer_id. When usage_customer_ids is provided, the subscription
     * includes usage events from the specified customers only. Provided usage_customer_ids must be
     * either the customer for this subscription itself, or any of that customer's children.
     */
    fun _usageCustomerIds(): JsonField<List<String>> = body._usageCustomerIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("add_adjustments")
        @ExcludeMissing
        private val addAdjustments: JsonField<List<AddSubscriptionAdjustmentParams>> =
            JsonMissing.of(),
        @JsonProperty("add_prices")
        @ExcludeMissing
        private val addPrices: JsonField<List<AddSubscriptionPriceParams>> = JsonMissing.of(),
        @JsonProperty("align_billing_with_subscription_start_date")
        @ExcludeMissing
        private val alignBillingWithSubscriptionStartDate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("auto_collection")
        @ExcludeMissing
        private val autoCollection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("aws_region")
        @ExcludeMissing
        private val awsRegion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_cycle_anchor_configuration")
        @ExcludeMissing
        private val billingCycleAnchorConfiguration:
            JsonField<BillingCycleAnchorConfigurationModel> =
            JsonMissing.of(),
        @JsonProperty("coupon_redemption_code")
        @ExcludeMissing
        private val couponRedemptionCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credits_overage_rate")
        @ExcludeMissing
        private val creditsOverageRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("default_invoice_memo")
        @ExcludeMissing
        private val defaultInvoiceMemo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        private val externalCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_marketplace")
        @ExcludeMissing
        private val externalMarketplace: JsonField<ExternalMarketplace> = JsonMissing.of(),
        @JsonProperty("external_marketplace_reporting_id")
        @ExcludeMissing
        private val externalMarketplaceReportingId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_plan_id")
        @ExcludeMissing
        private val externalPlanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filter")
        @ExcludeMissing
        private val filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("initial_phase_order")
        @ExcludeMissing
        private val initialPhaseOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("invoicing_threshold")
        @ExcludeMissing
        private val invoicingThreshold: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("net_terms")
        @ExcludeMissing
        private val netTerms: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("per_credit_overage_amount")
        @ExcludeMissing
        private val perCreditOverageAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("plan_id")
        @ExcludeMissing
        private val planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plan_version_number")
        @ExcludeMissing
        private val planVersionNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("price_overrides")
        @ExcludeMissing
        private val priceOverrides: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("remove_adjustments")
        @ExcludeMissing
        private val removeAdjustments: JsonField<List<RemoveSubscriptionAdjustmentParams>> =
            JsonMissing.of(),
        @JsonProperty("remove_prices")
        @ExcludeMissing
        private val removePrices: JsonField<List<RemoveSubscriptionPriceParams>> = JsonMissing.of(),
        @JsonProperty("replace_adjustments")
        @ExcludeMissing
        private val replaceAdjustments: JsonField<List<ReplaceSubscriptionAdjustmentParams>> =
            JsonMissing.of(),
        @JsonProperty("replace_prices")
        @ExcludeMissing
        private val replacePrices: JsonField<List<ReplaceSubscriptionPriceParams>> =
            JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("trial_duration_days")
        @ExcludeMissing
        private val trialDurationDays: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        private val usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Additional adjustments to be added to the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         */
        fun addAdjustments(): List<AddSubscriptionAdjustmentParams>? =
            addAdjustments.getNullable("add_adjustments")

        /**
         * Additional prices to be added to the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         */
        fun addPrices(): List<AddSubscriptionPriceParams>? = addPrices.getNullable("add_prices")

        fun alignBillingWithSubscriptionStartDate(): Boolean? =
            alignBillingWithSubscriptionStartDate.getNullable(
                "align_billing_with_subscription_start_date"
            )

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. If not specified, this defaults to the
         * behavior configured for this customer.
         */
        fun autoCollection(): Boolean? = autoCollection.getNullable("auto_collection")

        @Deprecated("deprecated") fun awsRegion(): String? = awsRegion.getNullable("aws_region")

        fun billingCycleAnchorConfiguration(): BillingCycleAnchorConfigurationModel? =
            billingCycleAnchorConfiguration.getNullable("billing_cycle_anchor_configuration")

        /**
         * Redemption code to be used for this subscription. If the coupon cannot be found by its
         * redemption code, or cannot be redeemed, an error response will be returned and the
         * subscription creation or plan change will not be scheduled.
         */
        fun couponRedemptionCode(): String? =
            couponRedemptionCode.getNullable("coupon_redemption_code")

        @Deprecated("deprecated")
        fun creditsOverageRate(): Double? = creditsOverageRate.getNullable("credits_overage_rate")

        fun customerId(): String? = customerId.getNullable("customer_id")

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(): String? = defaultInvoiceMemo.getNullable("default_invoice_memo")

        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        @Deprecated("deprecated")
        fun externalMarketplace(): ExternalMarketplace? =
            externalMarketplace.getNullable("external_marketplace")

        @Deprecated("deprecated")
        fun externalMarketplaceReportingId(): String? =
            externalMarketplaceReportingId.getNullable("external_marketplace_reporting_id")

        /**
         * The external_plan_id of the plan that the given subscription should be switched to. Note
         * that either this property or `plan_id` must be specified.
         */
        fun externalPlanId(): String? = externalPlanId.getNullable("external_plan_id")

        /**
         * An additional filter to apply to usage queries. This filter must be expressed as a
         * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
         * null, usage queries will not include any additional filter.
         */
        fun filter(): String? = filter.getNullable("filter")

        /** The phase of the plan to start with */
        fun initialPhaseOrder(): Long? = initialPhaseOrder.getNullable("initial_phase_order")

        /**
         * When this subscription's accrued usage reaches this threshold, an invoice will be issued
         * for the subscription. If not specified, invoices will only be issued at the end of the
         * billing period.
         */
        fun invoicingThreshold(): String? = invoicingThreshold.getNullable("invoicing_threshold")

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0. If not
         * provided, this defaults to the value specified in the plan.
         */
        fun netTerms(): Long? = netTerms.getNullable("net_terms")

        @Deprecated("deprecated")
        fun perCreditOverageAmount(): Double? =
            perCreditOverageAmount.getNullable("per_credit_overage_amount")

        /**
         * The plan that the given subscription should be switched to. Note that either this
         * property or `external_plan_id` must be specified.
         */
        fun planId(): String? = planId.getNullable("plan_id")

        /**
         * Specifies which version of the plan to subscribe to. If null, the default version will be
         * used.
         */
        fun planVersionNumber(): Long? = planVersionNumber.getNullable("plan_version_number")

        /** Optionally provide a list of overrides for prices on the plan */
        @Deprecated("deprecated")
        fun priceOverrides(): List<JsonValue>? = priceOverrides.getNullable("price_overrides")

        /**
         * Plan adjustments to be removed from the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         */
        fun removeAdjustments(): List<RemoveSubscriptionAdjustmentParams>? =
            removeAdjustments.getNullable("remove_adjustments")

        /**
         * Plan prices to be removed from the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         */
        fun removePrices(): List<RemoveSubscriptionPriceParams>? =
            removePrices.getNullable("remove_prices")

        /**
         * Plan adjustments to be replaced with additional adjustments on the subscription. (Only
         * available for accounts that have migrated off of legacy subscription overrides)
         */
        fun replaceAdjustments(): List<ReplaceSubscriptionAdjustmentParams>? =
            replaceAdjustments.getNullable("replace_adjustments")

        /**
         * Plan prices to be replaced with additional prices on the subscription. (Only available
         * for accounts that have migrated off of legacy subscription overrides)
         */
        fun replacePrices(): List<ReplaceSubscriptionPriceParams>? =
            replacePrices.getNullable("replace_prices")

        fun startDate(): OffsetDateTime? = startDate.getNullable("start_date")

        /**
         * The duration of the trial period in days. If not provided, this defaults to the value
         * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
         */
        fun trialDurationDays(): Long? = trialDurationDays.getNullable("trial_duration_days")

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this
         * subscription. By default, a subscription only considers usage events associated with its
         * attached customer's customer_id. When usage_customer_ids is provided, the subscription
         * includes usage events from the specified customers only. Provided usage_customer_ids must
         * be either the customer for this subscription itself, or any of that customer's children.
         */
        fun usageCustomerIds(): List<String>? = usageCustomerIds.getNullable("usage_customer_ids")

        /**
         * Additional adjustments to be added to the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         */
        @JsonProperty("add_adjustments")
        @ExcludeMissing
        fun _addAdjustments(): JsonField<List<AddSubscriptionAdjustmentParams>> = addAdjustments

        /**
         * Additional prices to be added to the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         */
        @JsonProperty("add_prices")
        @ExcludeMissing
        fun _addPrices(): JsonField<List<AddSubscriptionPriceParams>> = addPrices

        @JsonProperty("align_billing_with_subscription_start_date")
        @ExcludeMissing
        fun _alignBillingWithSubscriptionStartDate(): JsonField<Boolean> =
            alignBillingWithSubscriptionStartDate

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. If not specified, this defaults to the
         * behavior configured for this customer.
         */
        @JsonProperty("auto_collection")
        @ExcludeMissing
        fun _autoCollection(): JsonField<Boolean> = autoCollection

        @Deprecated("deprecated")
        @JsonProperty("aws_region")
        @ExcludeMissing
        fun _awsRegion(): JsonField<String> = awsRegion

        @JsonProperty("billing_cycle_anchor_configuration")
        @ExcludeMissing
        fun _billingCycleAnchorConfiguration(): JsonField<BillingCycleAnchorConfigurationModel> =
            billingCycleAnchorConfiguration

        /**
         * Redemption code to be used for this subscription. If the coupon cannot be found by its
         * redemption code, or cannot be redeemed, an error response will be returned and the
         * subscription creation or plan change will not be scheduled.
         */
        @JsonProperty("coupon_redemption_code")
        @ExcludeMissing
        fun _couponRedemptionCode(): JsonField<String> = couponRedemptionCode

        @Deprecated("deprecated")
        @JsonProperty("credits_overage_rate")
        @ExcludeMissing
        fun _creditsOverageRate(): JsonField<Double> = creditsOverageRate

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        @JsonProperty("default_invoice_memo")
        @ExcludeMissing
        fun _defaultInvoiceMemo(): JsonField<String> = defaultInvoiceMemo

        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        @Deprecated("deprecated")
        @JsonProperty("external_marketplace")
        @ExcludeMissing
        fun _externalMarketplace(): JsonField<ExternalMarketplace> = externalMarketplace

        @Deprecated("deprecated")
        @JsonProperty("external_marketplace_reporting_id")
        @ExcludeMissing
        fun _externalMarketplaceReportingId(): JsonField<String> = externalMarketplaceReportingId

        /**
         * The external_plan_id of the plan that the given subscription should be switched to. Note
         * that either this property or `plan_id` must be specified.
         */
        @JsonProperty("external_plan_id")
        @ExcludeMissing
        fun _externalPlanId(): JsonField<String> = externalPlanId

        /**
         * An additional filter to apply to usage queries. This filter must be expressed as a
         * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
         * null, usage queries will not include any additional filter.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /** The phase of the plan to start with */
        @JsonProperty("initial_phase_order")
        @ExcludeMissing
        fun _initialPhaseOrder(): JsonField<Long> = initialPhaseOrder

        /**
         * When this subscription's accrued usage reaches this threshold, an invoice will be issued
         * for the subscription. If not specified, invoices will only be issued at the end of the
         * billing period.
         */
        @JsonProperty("invoicing_threshold")
        @ExcludeMissing
        fun _invoicingThreshold(): JsonField<String> = invoicingThreshold

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0. If not
         * provided, this defaults to the value specified in the plan.
         */
        @JsonProperty("net_terms") @ExcludeMissing fun _netTerms(): JsonField<Long> = netTerms

        @Deprecated("deprecated")
        @JsonProperty("per_credit_overage_amount")
        @ExcludeMissing
        fun _perCreditOverageAmount(): JsonField<Double> = perCreditOverageAmount

        /**
         * The plan that the given subscription should be switched to. Note that either this
         * property or `external_plan_id` must be specified.
         */
        @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /**
         * Specifies which version of the plan to subscribe to. If null, the default version will be
         * used.
         */
        @JsonProperty("plan_version_number")
        @ExcludeMissing
        fun _planVersionNumber(): JsonField<Long> = planVersionNumber

        /** Optionally provide a list of overrides for prices on the plan */
        @Deprecated("deprecated")
        @JsonProperty("price_overrides")
        @ExcludeMissing
        fun _priceOverrides(): JsonField<List<JsonValue>> = priceOverrides

        /**
         * Plan adjustments to be removed from the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         */
        @JsonProperty("remove_adjustments")
        @ExcludeMissing
        fun _removeAdjustments(): JsonField<List<RemoveSubscriptionAdjustmentParams>> =
            removeAdjustments

        /**
         * Plan prices to be removed from the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         */
        @JsonProperty("remove_prices")
        @ExcludeMissing
        fun _removePrices(): JsonField<List<RemoveSubscriptionPriceParams>> = removePrices

        /**
         * Plan adjustments to be replaced with additional adjustments on the subscription. (Only
         * available for accounts that have migrated off of legacy subscription overrides)
         */
        @JsonProperty("replace_adjustments")
        @ExcludeMissing
        fun _replaceAdjustments(): JsonField<List<ReplaceSubscriptionAdjustmentParams>> =
            replaceAdjustments

        /**
         * Plan prices to be replaced with additional prices on the subscription. (Only available
         * for accounts that have migrated off of legacy subscription overrides)
         */
        @JsonProperty("replace_prices")
        @ExcludeMissing
        fun _replacePrices(): JsonField<List<ReplaceSubscriptionPriceParams>> = replacePrices

        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * The duration of the trial period in days. If not provided, this defaults to the value
         * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
         */
        @JsonProperty("trial_duration_days")
        @ExcludeMissing
        fun _trialDurationDays(): JsonField<Long> = trialDurationDays

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this
         * subscription. By default, a subscription only considers usage events associated with its
         * attached customer's customer_id. When usage_customer_ids is provided, the subscription
         * includes usage events from the specified customers only. Provided usage_customer_ids must
         * be either the customer for this subscription itself, or any of that customer's children.
         */
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        fun _usageCustomerIds(): JsonField<List<String>> = usageCustomerIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            addAdjustments()?.forEach { it.validate() }
            addPrices()?.forEach { it.validate() }
            alignBillingWithSubscriptionStartDate()
            autoCollection()
            awsRegion()
            billingCycleAnchorConfiguration()?.validate()
            couponRedemptionCode()
            creditsOverageRate()
            customerId()
            defaultInvoiceMemo()
            endDate()
            externalCustomerId()
            externalMarketplace()
            externalMarketplaceReportingId()
            externalPlanId()
            filter()
            initialPhaseOrder()
            invoicingThreshold()
            metadata()?.validate()
            netTerms()
            perCreditOverageAmount()
            planId()
            planVersionNumber()
            priceOverrides()
            removeAdjustments()?.forEach { it.validate() }
            removePrices()?.forEach { it.validate() }
            replaceAdjustments()?.forEach { it.validate() }
            replacePrices()?.forEach { it.validate() }
            startDate()
            trialDurationDays()
            usageCustomerIds()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var addAdjustments: JsonField<MutableList<AddSubscriptionAdjustmentParams>>? =
                null
            private var addPrices: JsonField<MutableList<AddSubscriptionPriceParams>>? = null
            private var alignBillingWithSubscriptionStartDate: JsonField<Boolean> = JsonMissing.of()
            private var autoCollection: JsonField<Boolean> = JsonMissing.of()
            private var awsRegion: JsonField<String> = JsonMissing.of()
            private var billingCycleAnchorConfiguration:
                JsonField<BillingCycleAnchorConfigurationModel> =
                JsonMissing.of()
            private var couponRedemptionCode: JsonField<String> = JsonMissing.of()
            private var creditsOverageRate: JsonField<Double> = JsonMissing.of()
            private var customerId: JsonField<String> = JsonMissing.of()
            private var defaultInvoiceMemo: JsonField<String> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var externalMarketplace: JsonField<ExternalMarketplace> = JsonMissing.of()
            private var externalMarketplaceReportingId: JsonField<String> = JsonMissing.of()
            private var externalPlanId: JsonField<String> = JsonMissing.of()
            private var filter: JsonField<String> = JsonMissing.of()
            private var initialPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var invoicingThreshold: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var netTerms: JsonField<Long> = JsonMissing.of()
            private var perCreditOverageAmount: JsonField<Double> = JsonMissing.of()
            private var planId: JsonField<String> = JsonMissing.of()
            private var planVersionNumber: JsonField<Long> = JsonMissing.of()
            private var priceOverrides: JsonField<MutableList<JsonValue>>? = null
            private var removeAdjustments:
                JsonField<MutableList<RemoveSubscriptionAdjustmentParams>>? =
                null
            private var removePrices: JsonField<MutableList<RemoveSubscriptionPriceParams>>? = null
            private var replaceAdjustments:
                JsonField<MutableList<ReplaceSubscriptionAdjustmentParams>>? =
                null
            private var replacePrices: JsonField<MutableList<ReplaceSubscriptionPriceParams>>? =
                null
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var trialDurationDays: JsonField<Long> = JsonMissing.of()
            private var usageCustomerIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                addAdjustments = body.addAdjustments.map { it.toMutableList() }
                addPrices = body.addPrices.map { it.toMutableList() }
                alignBillingWithSubscriptionStartDate = body.alignBillingWithSubscriptionStartDate
                autoCollection = body.autoCollection
                awsRegion = body.awsRegion
                billingCycleAnchorConfiguration = body.billingCycleAnchorConfiguration
                couponRedemptionCode = body.couponRedemptionCode
                creditsOverageRate = body.creditsOverageRate
                customerId = body.customerId
                defaultInvoiceMemo = body.defaultInvoiceMemo
                endDate = body.endDate
                externalCustomerId = body.externalCustomerId
                externalMarketplace = body.externalMarketplace
                externalMarketplaceReportingId = body.externalMarketplaceReportingId
                externalPlanId = body.externalPlanId
                filter = body.filter
                initialPhaseOrder = body.initialPhaseOrder
                invoicingThreshold = body.invoicingThreshold
                metadata = body.metadata
                netTerms = body.netTerms
                perCreditOverageAmount = body.perCreditOverageAmount
                planId = body.planId
                planVersionNumber = body.planVersionNumber
                priceOverrides = body.priceOverrides.map { it.toMutableList() }
                removeAdjustments = body.removeAdjustments.map { it.toMutableList() }
                removePrices = body.removePrices.map { it.toMutableList() }
                replaceAdjustments = body.replaceAdjustments.map { it.toMutableList() }
                replacePrices = body.replacePrices.map { it.toMutableList() }
                startDate = body.startDate
                trialDurationDays = body.trialDurationDays
                usageCustomerIds = body.usageCustomerIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Additional adjustments to be added to the subscription. (Only available for accounts
             * that have migrated off of legacy subscription overrides)
             */
            fun addAdjustments(addAdjustments: List<AddSubscriptionAdjustmentParams>?) =
                addAdjustments(JsonField.ofNullable(addAdjustments))

            /**
             * Additional adjustments to be added to the subscription. (Only available for accounts
             * that have migrated off of legacy subscription overrides)
             */
            fun addAdjustments(addAdjustments: JsonField<List<AddSubscriptionAdjustmentParams>>) =
                apply {
                    this.addAdjustments = addAdjustments.map { it.toMutableList() }
                }

            /**
             * Additional adjustments to be added to the subscription. (Only available for accounts
             * that have migrated off of legacy subscription overrides)
             */
            fun addAddAdjustment(addAdjustment: AddSubscriptionAdjustmentParams) = apply {
                addAdjustments =
                    (addAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addAdjustments", it).add(addAdjustment)
                    }
            }

            /**
             * Additional prices to be added to the subscription. (Only available for accounts that
             * have migrated off of legacy subscription overrides)
             */
            fun addPrices(addPrices: List<AddSubscriptionPriceParams>?) =
                addPrices(JsonField.ofNullable(addPrices))

            /**
             * Additional prices to be added to the subscription. (Only available for accounts that
             * have migrated off of legacy subscription overrides)
             */
            fun addPrices(addPrices: JsonField<List<AddSubscriptionPriceParams>>) = apply {
                this.addPrices = addPrices.map { it.toMutableList() }
            }

            /**
             * Additional prices to be added to the subscription. (Only available for accounts that
             * have migrated off of legacy subscription overrides)
             */
            fun addAddPrice(addPrice: AddSubscriptionPriceParams) = apply {
                addPrices =
                    (addPrices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addPrices", it).add(addPrice)
                    }
            }

            fun alignBillingWithSubscriptionStartDate(
                alignBillingWithSubscriptionStartDate: Boolean
            ) =
                alignBillingWithSubscriptionStartDate(
                    JsonField.of(alignBillingWithSubscriptionStartDate)
                )

            fun alignBillingWithSubscriptionStartDate(
                alignBillingWithSubscriptionStartDate: JsonField<Boolean>
            ) = apply {
                this.alignBillingWithSubscriptionStartDate = alignBillingWithSubscriptionStartDate
            }

            /**
             * Determines whether issued invoices for this subscription will automatically be
             * charged with the saved payment method on the due date. If not specified, this
             * defaults to the behavior configured for this customer.
             */
            fun autoCollection(autoCollection: Boolean?) =
                autoCollection(JsonField.ofNullable(autoCollection))

            /**
             * Determines whether issued invoices for this subscription will automatically be
             * charged with the saved payment method on the due date. If not specified, this
             * defaults to the behavior configured for this customer.
             */
            fun autoCollection(autoCollection: Boolean) = autoCollection(autoCollection as Boolean?)

            /**
             * Determines whether issued invoices for this subscription will automatically be
             * charged with the saved payment method on the due date. If not specified, this
             * defaults to the behavior configured for this customer.
             */
            fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
                this.autoCollection = autoCollection
            }

            @Deprecated("deprecated")
            fun awsRegion(awsRegion: String?) = awsRegion(JsonField.ofNullable(awsRegion))

            @Deprecated("deprecated")
            fun awsRegion(awsRegion: JsonField<String>) = apply { this.awsRegion = awsRegion }

            fun billingCycleAnchorConfiguration(
                billingCycleAnchorConfiguration: BillingCycleAnchorConfigurationModel?
            ) =
                billingCycleAnchorConfiguration(
                    JsonField.ofNullable(billingCycleAnchorConfiguration)
                )

            fun billingCycleAnchorConfiguration(
                billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfigurationModel>
            ) = apply { this.billingCycleAnchorConfiguration = billingCycleAnchorConfiguration }

            /**
             * Redemption code to be used for this subscription. If the coupon cannot be found by
             * its redemption code, or cannot be redeemed, an error response will be returned and
             * the subscription creation or plan change will not be scheduled.
             */
            fun couponRedemptionCode(couponRedemptionCode: String?) =
                couponRedemptionCode(JsonField.ofNullable(couponRedemptionCode))

            /**
             * Redemption code to be used for this subscription. If the coupon cannot be found by
             * its redemption code, or cannot be redeemed, an error response will be returned and
             * the subscription creation or plan change will not be scheduled.
             */
            fun couponRedemptionCode(couponRedemptionCode: JsonField<String>) = apply {
                this.couponRedemptionCode = couponRedemptionCode
            }

            @Deprecated("deprecated")
            fun creditsOverageRate(creditsOverageRate: Double?) =
                creditsOverageRate(JsonField.ofNullable(creditsOverageRate))

            @Deprecated("deprecated")
            fun creditsOverageRate(creditsOverageRate: Double) =
                creditsOverageRate(creditsOverageRate as Double?)

            @Deprecated("deprecated")
            fun creditsOverageRate(creditsOverageRate: JsonField<Double>) = apply {
                this.creditsOverageRate = creditsOverageRate
            }

            fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * Determines the default memo on this subscription's invoices. Note that if this is not
             * provided, it is determined by the plan configuration.
             */
            fun defaultInvoiceMemo(defaultInvoiceMemo: String?) =
                defaultInvoiceMemo(JsonField.ofNullable(defaultInvoiceMemo))

            /**
             * Determines the default memo on this subscription's invoices. Note that if this is not
             * provided, it is determined by the plan configuration.
             */
            fun defaultInvoiceMemo(defaultInvoiceMemo: JsonField<String>) = apply {
                this.defaultInvoiceMemo = defaultInvoiceMemo
            }

            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            fun externalCustomerId(externalCustomerId: String?) =
                externalCustomerId(JsonField.ofNullable(externalCustomerId))

            fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
                this.externalCustomerId = externalCustomerId
            }

            @Deprecated("deprecated")
            fun externalMarketplace(externalMarketplace: ExternalMarketplace?) =
                externalMarketplace(JsonField.ofNullable(externalMarketplace))

            @Deprecated("deprecated")
            fun externalMarketplace(externalMarketplace: JsonField<ExternalMarketplace>) = apply {
                this.externalMarketplace = externalMarketplace
            }

            @Deprecated("deprecated")
            fun externalMarketplaceReportingId(externalMarketplaceReportingId: String?) =
                externalMarketplaceReportingId(JsonField.ofNullable(externalMarketplaceReportingId))

            @Deprecated("deprecated")
            fun externalMarketplaceReportingId(externalMarketplaceReportingId: JsonField<String>) =
                apply {
                    this.externalMarketplaceReportingId = externalMarketplaceReportingId
                }

            /**
             * The external_plan_id of the plan that the given subscription should be switched to.
             * Note that either this property or `plan_id` must be specified.
             */
            fun externalPlanId(externalPlanId: String?) =
                externalPlanId(JsonField.ofNullable(externalPlanId))

            /**
             * The external_plan_id of the plan that the given subscription should be switched to.
             * Note that either this property or `plan_id` must be specified.
             */
            fun externalPlanId(externalPlanId: JsonField<String>) = apply {
                this.externalPlanId = externalPlanId
            }

            /**
             * An additional filter to apply to usage queries. This filter must be expressed as a
             * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
             * null, usage queries will not include any additional filter.
             */
            fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

            /**
             * An additional filter to apply to usage queries. This filter must be expressed as a
             * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
             * null, usage queries will not include any additional filter.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /** The phase of the plan to start with */
            fun initialPhaseOrder(initialPhaseOrder: Long?) =
                initialPhaseOrder(JsonField.ofNullable(initialPhaseOrder))

            /** The phase of the plan to start with */
            fun initialPhaseOrder(initialPhaseOrder: Long) =
                initialPhaseOrder(initialPhaseOrder as Long?)

            /** The phase of the plan to start with */
            fun initialPhaseOrder(initialPhaseOrder: JsonField<Long>) = apply {
                this.initialPhaseOrder = initialPhaseOrder
            }

            /**
             * When this subscription's accrued usage reaches this threshold, an invoice will be
             * issued for the subscription. If not specified, invoices will only be issued at the
             * end of the billing period.
             */
            fun invoicingThreshold(invoicingThreshold: String?) =
                invoicingThreshold(JsonField.ofNullable(invoicingThreshold))

            /**
             * When this subscription's accrued usage reaches this threshold, an invoice will be
             * issued for the subscription. If not specified, invoices will only be issued at the
             * end of the billing period.
             */
            fun invoicingThreshold(invoicingThreshold: JsonField<String>) = apply {
                this.invoicingThreshold = invoicingThreshold
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * The net terms determines the difference between the invoice date and the issue date
             * for the invoice. If you intend the invoice to be due on issue, set this to 0. If not
             * provided, this defaults to the value specified in the plan.
             */
            fun netTerms(netTerms: Long?) = netTerms(JsonField.ofNullable(netTerms))

            /**
             * The net terms determines the difference between the invoice date and the issue date
             * for the invoice. If you intend the invoice to be due on issue, set this to 0. If not
             * provided, this defaults to the value specified in the plan.
             */
            fun netTerms(netTerms: Long) = netTerms(netTerms as Long?)

            /**
             * The net terms determines the difference between the invoice date and the issue date
             * for the invoice. If you intend the invoice to be due on issue, set this to 0. If not
             * provided, this defaults to the value specified in the plan.
             */
            fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

            @Deprecated("deprecated")
            fun perCreditOverageAmount(perCreditOverageAmount: Double?) =
                perCreditOverageAmount(JsonField.ofNullable(perCreditOverageAmount))

            @Deprecated("deprecated")
            fun perCreditOverageAmount(perCreditOverageAmount: Double) =
                perCreditOverageAmount(perCreditOverageAmount as Double?)

            @Deprecated("deprecated")
            fun perCreditOverageAmount(perCreditOverageAmount: JsonField<Double>) = apply {
                this.perCreditOverageAmount = perCreditOverageAmount
            }

            /**
             * The plan that the given subscription should be switched to. Note that either this
             * property or `external_plan_id` must be specified.
             */
            fun planId(planId: String?) = planId(JsonField.ofNullable(planId))

            /**
             * The plan that the given subscription should be switched to. Note that either this
             * property or `external_plan_id` must be specified.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /**
             * Specifies which version of the plan to subscribe to. If null, the default version
             * will be used.
             */
            fun planVersionNumber(planVersionNumber: Long?) =
                planVersionNumber(JsonField.ofNullable(planVersionNumber))

            /**
             * Specifies which version of the plan to subscribe to. If null, the default version
             * will be used.
             */
            fun planVersionNumber(planVersionNumber: Long) =
                planVersionNumber(planVersionNumber as Long?)

            /**
             * Specifies which version of the plan to subscribe to. If null, the default version
             * will be used.
             */
            fun planVersionNumber(planVersionNumber: JsonField<Long>) = apply {
                this.planVersionNumber = planVersionNumber
            }

            /** Optionally provide a list of overrides for prices on the plan */
            @Deprecated("deprecated")
            fun priceOverrides(priceOverrides: List<JsonValue>?) =
                priceOverrides(JsonField.ofNullable(priceOverrides))

            /** Optionally provide a list of overrides for prices on the plan */
            @Deprecated("deprecated")
            fun priceOverrides(priceOverrides: JsonField<List<JsonValue>>) = apply {
                this.priceOverrides = priceOverrides.map { it.toMutableList() }
            }

            /** Optionally provide a list of overrides for prices on the plan */
            @Deprecated("deprecated")
            fun addPriceOverride(priceOverride: JsonValue) = apply {
                priceOverrides =
                    (priceOverrides ?: JsonField.of(mutableListOf())).also {
                        checkKnown("priceOverrides", it).add(priceOverride)
                    }
            }

            /**
             * Plan adjustments to be removed from the subscription. (Only available for accounts
             * that have migrated off of legacy subscription overrides)
             */
            fun removeAdjustments(removeAdjustments: List<RemoveSubscriptionAdjustmentParams>?) =
                removeAdjustments(JsonField.ofNullable(removeAdjustments))

            /**
             * Plan adjustments to be removed from the subscription. (Only available for accounts
             * that have migrated off of legacy subscription overrides)
             */
            fun removeAdjustments(
                removeAdjustments: JsonField<List<RemoveSubscriptionAdjustmentParams>>
            ) = apply { this.removeAdjustments = removeAdjustments.map { it.toMutableList() } }

            /**
             * Plan adjustments to be removed from the subscription. (Only available for accounts
             * that have migrated off of legacy subscription overrides)
             */
            fun addRemoveAdjustment(removeAdjustment: RemoveSubscriptionAdjustmentParams) = apply {
                removeAdjustments =
                    (removeAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removeAdjustments", it).add(removeAdjustment)
                    }
            }

            /**
             * Plan prices to be removed from the subscription. (Only available for accounts that
             * have migrated off of legacy subscription overrides)
             */
            fun removePrices(removePrices: List<RemoveSubscriptionPriceParams>?) =
                removePrices(JsonField.ofNullable(removePrices))

            /**
             * Plan prices to be removed from the subscription. (Only available for accounts that
             * have migrated off of legacy subscription overrides)
             */
            fun removePrices(removePrices: JsonField<List<RemoveSubscriptionPriceParams>>) = apply {
                this.removePrices = removePrices.map { it.toMutableList() }
            }

            /**
             * Plan prices to be removed from the subscription. (Only available for accounts that
             * have migrated off of legacy subscription overrides)
             */
            fun addRemovePrice(removePrice: RemoveSubscriptionPriceParams) = apply {
                removePrices =
                    (removePrices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removePrices", it).add(removePrice)
                    }
            }

            /**
             * Plan adjustments to be replaced with additional adjustments on the subscription.
             * (Only available for accounts that have migrated off of legacy subscription overrides)
             */
            fun replaceAdjustments(replaceAdjustments: List<ReplaceSubscriptionAdjustmentParams>?) =
                replaceAdjustments(JsonField.ofNullable(replaceAdjustments))

            /**
             * Plan adjustments to be replaced with additional adjustments on the subscription.
             * (Only available for accounts that have migrated off of legacy subscription overrides)
             */
            fun replaceAdjustments(
                replaceAdjustments: JsonField<List<ReplaceSubscriptionAdjustmentParams>>
            ) = apply { this.replaceAdjustments = replaceAdjustments.map { it.toMutableList() } }

            /**
             * Plan adjustments to be replaced with additional adjustments on the subscription.
             * (Only available for accounts that have migrated off of legacy subscription overrides)
             */
            fun addReplaceAdjustment(replaceAdjustment: ReplaceSubscriptionAdjustmentParams) =
                apply {
                    replaceAdjustments =
                        (replaceAdjustments ?: JsonField.of(mutableListOf())).also {
                            checkKnown("replaceAdjustments", it).add(replaceAdjustment)
                        }
                }

            /**
             * Plan prices to be replaced with additional prices on the subscription. (Only
             * available for accounts that have migrated off of legacy subscription overrides)
             */
            fun replacePrices(replacePrices: List<ReplaceSubscriptionPriceParams>?) =
                replacePrices(JsonField.ofNullable(replacePrices))

            /**
             * Plan prices to be replaced with additional prices on the subscription. (Only
             * available for accounts that have migrated off of legacy subscription overrides)
             */
            fun replacePrices(replacePrices: JsonField<List<ReplaceSubscriptionPriceParams>>) =
                apply {
                    this.replacePrices = replacePrices.map { it.toMutableList() }
                }

            /**
             * Plan prices to be replaced with additional prices on the subscription. (Only
             * available for accounts that have migrated off of legacy subscription overrides)
             */
            fun addReplacePrice(replacePrice: ReplaceSubscriptionPriceParams) = apply {
                replacePrices =
                    (replacePrices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("replacePrices", it).add(replacePrice)
                    }
            }

            fun startDate(startDate: OffsetDateTime?) = startDate(JsonField.ofNullable(startDate))

            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /**
             * The duration of the trial period in days. If not provided, this defaults to the value
             * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
             */
            fun trialDurationDays(trialDurationDays: Long?) =
                trialDurationDays(JsonField.ofNullable(trialDurationDays))

            /**
             * The duration of the trial period in days. If not provided, this defaults to the value
             * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
             */
            fun trialDurationDays(trialDurationDays: Long) =
                trialDurationDays(trialDurationDays as Long?)

            /**
             * The duration of the trial period in days. If not provided, this defaults to the value
             * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
             */
            fun trialDurationDays(trialDurationDays: JsonField<Long>) = apply {
                this.trialDurationDays = trialDurationDays
            }

            /**
             * A list of customer IDs whose usage events will be aggregated and billed under this
             * subscription. By default, a subscription only considers usage events associated with
             * its attached customer's customer_id. When usage_customer_ids is provided, the
             * subscription includes usage events from the specified customers only. Provided
             * usage_customer_ids must be either the customer for this subscription itself, or any
             * of that customer's children.
             */
            fun usageCustomerIds(usageCustomerIds: List<String>?) =
                usageCustomerIds(JsonField.ofNullable(usageCustomerIds))

            /**
             * A list of customer IDs whose usage events will be aggregated and billed under this
             * subscription. By default, a subscription only considers usage events associated with
             * its attached customer's customer_id. When usage_customer_ids is provided, the
             * subscription includes usage events from the specified customers only. Provided
             * usage_customer_ids must be either the customer for this subscription itself, or any
             * of that customer's children.
             */
            fun usageCustomerIds(usageCustomerIds: JsonField<List<String>>) = apply {
                this.usageCustomerIds = usageCustomerIds.map { it.toMutableList() }
            }

            /**
             * A list of customer IDs whose usage events will be aggregated and billed under this
             * subscription. By default, a subscription only considers usage events associated with
             * its attached customer's customer_id. When usage_customer_ids is provided, the
             * subscription includes usage events from the specified customers only. Provided
             * usage_customer_ids must be either the customer for this subscription itself, or any
             * of that customer's children.
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

            fun build(): Body =
                Body(
                    (addAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    (addPrices ?: JsonMissing.of()).map { it.toImmutable() },
                    alignBillingWithSubscriptionStartDate,
                    autoCollection,
                    awsRegion,
                    billingCycleAnchorConfiguration,
                    couponRedemptionCode,
                    creditsOverageRate,
                    customerId,
                    defaultInvoiceMemo,
                    endDate,
                    externalCustomerId,
                    externalMarketplace,
                    externalMarketplaceReportingId,
                    externalPlanId,
                    filter,
                    initialPhaseOrder,
                    invoicingThreshold,
                    metadata,
                    netTerms,
                    perCreditOverageAmount,
                    planId,
                    planVersionNumber,
                    (priceOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                    (removeAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    (removePrices ?: JsonMissing.of()).map { it.toImmutable() },
                    (replaceAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    (replacePrices ?: JsonMissing.of()).map { it.toImmutable() },
                    startDate,
                    trialDurationDays,
                    (usageCustomerIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && addAdjustments == other.addAdjustments && addPrices == other.addPrices && alignBillingWithSubscriptionStartDate == other.alignBillingWithSubscriptionStartDate && autoCollection == other.autoCollection && awsRegion == other.awsRegion && billingCycleAnchorConfiguration == other.billingCycleAnchorConfiguration && couponRedemptionCode == other.couponRedemptionCode && creditsOverageRate == other.creditsOverageRate && customerId == other.customerId && defaultInvoiceMemo == other.defaultInvoiceMemo && endDate == other.endDate && externalCustomerId == other.externalCustomerId && externalMarketplace == other.externalMarketplace && externalMarketplaceReportingId == other.externalMarketplaceReportingId && externalPlanId == other.externalPlanId && filter == other.filter && initialPhaseOrder == other.initialPhaseOrder && invoicingThreshold == other.invoicingThreshold && metadata == other.metadata && netTerms == other.netTerms && perCreditOverageAmount == other.perCreditOverageAmount && planId == other.planId && planVersionNumber == other.planVersionNumber && priceOverrides == other.priceOverrides && removeAdjustments == other.removeAdjustments && removePrices == other.removePrices && replaceAdjustments == other.replaceAdjustments && replacePrices == other.replacePrices && startDate == other.startDate && trialDurationDays == other.trialDurationDays && usageCustomerIds == other.usageCustomerIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addAdjustments, addPrices, alignBillingWithSubscriptionStartDate, autoCollection, awsRegion, billingCycleAnchorConfiguration, couponRedemptionCode, creditsOverageRate, customerId, defaultInvoiceMemo, endDate, externalCustomerId, externalMarketplace, externalMarketplaceReportingId, externalPlanId, filter, initialPhaseOrder, invoicingThreshold, metadata, netTerms, perCreditOverageAmount, planId, planVersionNumber, priceOverrides, removeAdjustments, removePrices, replaceAdjustments, replacePrices, startDate, trialDurationDays, usageCustomerIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{addAdjustments=$addAdjustments, addPrices=$addPrices, alignBillingWithSubscriptionStartDate=$alignBillingWithSubscriptionStartDate, autoCollection=$autoCollection, awsRegion=$awsRegion, billingCycleAnchorConfiguration=$billingCycleAnchorConfiguration, couponRedemptionCode=$couponRedemptionCode, creditsOverageRate=$creditsOverageRate, customerId=$customerId, defaultInvoiceMemo=$defaultInvoiceMemo, endDate=$endDate, externalCustomerId=$externalCustomerId, externalMarketplace=$externalMarketplace, externalMarketplaceReportingId=$externalMarketplaceReportingId, externalPlanId=$externalPlanId, filter=$filter, initialPhaseOrder=$initialPhaseOrder, invoicingThreshold=$invoicingThreshold, metadata=$metadata, netTerms=$netTerms, perCreditOverageAmount=$perCreditOverageAmount, planId=$planId, planVersionNumber=$planVersionNumber, priceOverrides=$priceOverrides, removeAdjustments=$removeAdjustments, removePrices=$removePrices, replaceAdjustments=$replaceAdjustments, replacePrices=$replacePrices, startDate=$startDate, trialDurationDays=$trialDurationDays, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [SubscriptionCreateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionCreateParams: SubscriptionCreateParams) = apply {
            body = subscriptionCreateParams.body.toBuilder()
            additionalHeaders = subscriptionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Additional adjustments to be added to the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         */
        fun addAdjustments(addAdjustments: List<AddSubscriptionAdjustmentParams>?) = apply {
            body.addAdjustments(addAdjustments)
        }

        /**
         * Additional adjustments to be added to the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         */
        fun addAdjustments(addAdjustments: JsonField<List<AddSubscriptionAdjustmentParams>>) =
            apply {
                body.addAdjustments(addAdjustments)
            }

        /**
         * Additional adjustments to be added to the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         */
        fun addAddAdjustment(addAdjustment: AddSubscriptionAdjustmentParams) = apply {
            body.addAddAdjustment(addAdjustment)
        }

        /**
         * Additional prices to be added to the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         */
        fun addPrices(addPrices: List<AddSubscriptionPriceParams>?) = apply {
            body.addPrices(addPrices)
        }

        /**
         * Additional prices to be added to the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         */
        fun addPrices(addPrices: JsonField<List<AddSubscriptionPriceParams>>) = apply {
            body.addPrices(addPrices)
        }

        /**
         * Additional prices to be added to the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         */
        fun addAddPrice(addPrice: AddSubscriptionPriceParams) = apply { body.addAddPrice(addPrice) }

        fun alignBillingWithSubscriptionStartDate(alignBillingWithSubscriptionStartDate: Boolean) =
            apply {
                body.alignBillingWithSubscriptionStartDate(alignBillingWithSubscriptionStartDate)
            }

        fun alignBillingWithSubscriptionStartDate(
            alignBillingWithSubscriptionStartDate: JsonField<Boolean>
        ) = apply {
            body.alignBillingWithSubscriptionStartDate(alignBillingWithSubscriptionStartDate)
        }

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. If not specified, this defaults to the
         * behavior configured for this customer.
         */
        fun autoCollection(autoCollection: Boolean?) = apply { body.autoCollection(autoCollection) }

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. If not specified, this defaults to the
         * behavior configured for this customer.
         */
        fun autoCollection(autoCollection: Boolean) = autoCollection(autoCollection as Boolean?)

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. If not specified, this defaults to the
         * behavior configured for this customer.
         */
        fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
            body.autoCollection(autoCollection)
        }

        @Deprecated("deprecated")
        fun awsRegion(awsRegion: String?) = apply { body.awsRegion(awsRegion) }

        @Deprecated("deprecated")
        fun awsRegion(awsRegion: JsonField<String>) = apply { body.awsRegion(awsRegion) }

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: BillingCycleAnchorConfigurationModel?
        ) = apply { body.billingCycleAnchorConfiguration(billingCycleAnchorConfiguration) }

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfigurationModel>
        ) = apply { body.billingCycleAnchorConfiguration(billingCycleAnchorConfiguration) }

        /**
         * Redemption code to be used for this subscription. If the coupon cannot be found by its
         * redemption code, or cannot be redeemed, an error response will be returned and the
         * subscription creation or plan change will not be scheduled.
         */
        fun couponRedemptionCode(couponRedemptionCode: String?) = apply {
            body.couponRedemptionCode(couponRedemptionCode)
        }

        /**
         * Redemption code to be used for this subscription. If the coupon cannot be found by its
         * redemption code, or cannot be redeemed, an error response will be returned and the
         * subscription creation or plan change will not be scheduled.
         */
        fun couponRedemptionCode(couponRedemptionCode: JsonField<String>) = apply {
            body.couponRedemptionCode(couponRedemptionCode)
        }

        @Deprecated("deprecated")
        fun creditsOverageRate(creditsOverageRate: Double?) = apply {
            body.creditsOverageRate(creditsOverageRate)
        }

        @Deprecated("deprecated")
        fun creditsOverageRate(creditsOverageRate: Double) =
            creditsOverageRate(creditsOverageRate as Double?)

        @Deprecated("deprecated")
        fun creditsOverageRate(creditsOverageRate: JsonField<Double>) = apply {
            body.creditsOverageRate(creditsOverageRate)
        }

        fun customerId(customerId: String?) = apply { body.customerId(customerId) }

        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: String?) = apply {
            body.defaultInvoiceMemo(defaultInvoiceMemo)
        }

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: JsonField<String>) = apply {
            body.defaultInvoiceMemo(defaultInvoiceMemo)
        }

        fun endDate(endDate: OffsetDateTime?) = apply { body.endDate(endDate) }

        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { body.endDate(endDate) }

        fun externalCustomerId(externalCustomerId: String?) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        @Deprecated("deprecated")
        fun externalMarketplace(externalMarketplace: ExternalMarketplace?) = apply {
            body.externalMarketplace(externalMarketplace)
        }

        @Deprecated("deprecated")
        fun externalMarketplace(externalMarketplace: JsonField<ExternalMarketplace>) = apply {
            body.externalMarketplace(externalMarketplace)
        }

        @Deprecated("deprecated")
        fun externalMarketplaceReportingId(externalMarketplaceReportingId: String?) = apply {
            body.externalMarketplaceReportingId(externalMarketplaceReportingId)
        }

        @Deprecated("deprecated")
        fun externalMarketplaceReportingId(externalMarketplaceReportingId: JsonField<String>) =
            apply {
                body.externalMarketplaceReportingId(externalMarketplaceReportingId)
            }

        /**
         * The external_plan_id of the plan that the given subscription should be switched to. Note
         * that either this property or `plan_id` must be specified.
         */
        fun externalPlanId(externalPlanId: String?) = apply { body.externalPlanId(externalPlanId) }

        /**
         * The external_plan_id of the plan that the given subscription should be switched to. Note
         * that either this property or `plan_id` must be specified.
         */
        fun externalPlanId(externalPlanId: JsonField<String>) = apply {
            body.externalPlanId(externalPlanId)
        }

        /**
         * An additional filter to apply to usage queries. This filter must be expressed as a
         * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
         * null, usage queries will not include any additional filter.
         */
        fun filter(filter: String?) = apply { body.filter(filter) }

        /**
         * An additional filter to apply to usage queries. This filter must be expressed as a
         * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
         * null, usage queries will not include any additional filter.
         */
        fun filter(filter: JsonField<String>) = apply { body.filter(filter) }

        /** The phase of the plan to start with */
        fun initialPhaseOrder(initialPhaseOrder: Long?) = apply {
            body.initialPhaseOrder(initialPhaseOrder)
        }

        /** The phase of the plan to start with */
        fun initialPhaseOrder(initialPhaseOrder: Long) =
            initialPhaseOrder(initialPhaseOrder as Long?)

        /** The phase of the plan to start with */
        fun initialPhaseOrder(initialPhaseOrder: JsonField<Long>) = apply {
            body.initialPhaseOrder(initialPhaseOrder)
        }

        /**
         * When this subscription's accrued usage reaches this threshold, an invoice will be issued
         * for the subscription. If not specified, invoices will only be issued at the end of the
         * billing period.
         */
        fun invoicingThreshold(invoicingThreshold: String?) = apply {
            body.invoicingThreshold(invoicingThreshold)
        }

        /**
         * When this subscription's accrued usage reaches this threshold, an invoice will be issued
         * for the subscription. If not specified, invoices will only be issued at the end of the
         * billing period.
         */
        fun invoicingThreshold(invoicingThreshold: JsonField<String>) = apply {
            body.invoicingThreshold(invoicingThreshold)
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0. If not
         * provided, this defaults to the value specified in the plan.
         */
        fun netTerms(netTerms: Long?) = apply { body.netTerms(netTerms) }

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0. If not
         * provided, this defaults to the value specified in the plan.
         */
        fun netTerms(netTerms: Long) = netTerms(netTerms as Long?)

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0. If not
         * provided, this defaults to the value specified in the plan.
         */
        fun netTerms(netTerms: JsonField<Long>) = apply { body.netTerms(netTerms) }

        @Deprecated("deprecated")
        fun perCreditOverageAmount(perCreditOverageAmount: Double?) = apply {
            body.perCreditOverageAmount(perCreditOverageAmount)
        }

        @Deprecated("deprecated")
        fun perCreditOverageAmount(perCreditOverageAmount: Double) =
            perCreditOverageAmount(perCreditOverageAmount as Double?)

        @Deprecated("deprecated")
        fun perCreditOverageAmount(perCreditOverageAmount: JsonField<Double>) = apply {
            body.perCreditOverageAmount(perCreditOverageAmount)
        }

        /**
         * The plan that the given subscription should be switched to. Note that either this
         * property or `external_plan_id` must be specified.
         */
        fun planId(planId: String?) = apply { body.planId(planId) }

        /**
         * The plan that the given subscription should be switched to. Note that either this
         * property or `external_plan_id` must be specified.
         */
        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

        /**
         * Specifies which version of the plan to subscribe to. If null, the default version will be
         * used.
         */
        fun planVersionNumber(planVersionNumber: Long?) = apply {
            body.planVersionNumber(planVersionNumber)
        }

        /**
         * Specifies which version of the plan to subscribe to. If null, the default version will be
         * used.
         */
        fun planVersionNumber(planVersionNumber: Long) =
            planVersionNumber(planVersionNumber as Long?)

        /**
         * Specifies which version of the plan to subscribe to. If null, the default version will be
         * used.
         */
        fun planVersionNumber(planVersionNumber: JsonField<Long>) = apply {
            body.planVersionNumber(planVersionNumber)
        }

        /** Optionally provide a list of overrides for prices on the plan */
        @Deprecated("deprecated")
        fun priceOverrides(priceOverrides: List<JsonValue>?) = apply {
            body.priceOverrides(priceOverrides)
        }

        /** Optionally provide a list of overrides for prices on the plan */
        @Deprecated("deprecated")
        fun priceOverrides(priceOverrides: JsonField<List<JsonValue>>) = apply {
            body.priceOverrides(priceOverrides)
        }

        /** Optionally provide a list of overrides for prices on the plan */
        @Deprecated("deprecated")
        fun addPriceOverride(priceOverride: JsonValue) = apply {
            body.addPriceOverride(priceOverride)
        }

        /**
         * Plan adjustments to be removed from the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         */
        fun removeAdjustments(removeAdjustments: List<RemoveSubscriptionAdjustmentParams>?) =
            apply {
                body.removeAdjustments(removeAdjustments)
            }

        /**
         * Plan adjustments to be removed from the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         */
        fun removeAdjustments(
            removeAdjustments: JsonField<List<RemoveSubscriptionAdjustmentParams>>
        ) = apply { body.removeAdjustments(removeAdjustments) }

        /**
         * Plan adjustments to be removed from the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         */
        fun addRemoveAdjustment(removeAdjustment: RemoveSubscriptionAdjustmentParams) = apply {
            body.addRemoveAdjustment(removeAdjustment)
        }

        /**
         * Plan prices to be removed from the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         */
        fun removePrices(removePrices: List<RemoveSubscriptionPriceParams>?) = apply {
            body.removePrices(removePrices)
        }

        /**
         * Plan prices to be removed from the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         */
        fun removePrices(removePrices: JsonField<List<RemoveSubscriptionPriceParams>>) = apply {
            body.removePrices(removePrices)
        }

        /**
         * Plan prices to be removed from the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         */
        fun addRemovePrice(removePrice: RemoveSubscriptionPriceParams) = apply {
            body.addRemovePrice(removePrice)
        }

        /**
         * Plan adjustments to be replaced with additional adjustments on the subscription. (Only
         * available for accounts that have migrated off of legacy subscription overrides)
         */
        fun replaceAdjustments(replaceAdjustments: List<ReplaceSubscriptionAdjustmentParams>?) =
            apply {
                body.replaceAdjustments(replaceAdjustments)
            }

        /**
         * Plan adjustments to be replaced with additional adjustments on the subscription. (Only
         * available for accounts that have migrated off of legacy subscription overrides)
         */
        fun replaceAdjustments(
            replaceAdjustments: JsonField<List<ReplaceSubscriptionAdjustmentParams>>
        ) = apply { body.replaceAdjustments(replaceAdjustments) }

        /**
         * Plan adjustments to be replaced with additional adjustments on the subscription. (Only
         * available for accounts that have migrated off of legacy subscription overrides)
         */
        fun addReplaceAdjustment(replaceAdjustment: ReplaceSubscriptionAdjustmentParams) = apply {
            body.addReplaceAdjustment(replaceAdjustment)
        }

        /**
         * Plan prices to be replaced with additional prices on the subscription. (Only available
         * for accounts that have migrated off of legacy subscription overrides)
         */
        fun replacePrices(replacePrices: List<ReplaceSubscriptionPriceParams>?) = apply {
            body.replacePrices(replacePrices)
        }

        /**
         * Plan prices to be replaced with additional prices on the subscription. (Only available
         * for accounts that have migrated off of legacy subscription overrides)
         */
        fun replacePrices(replacePrices: JsonField<List<ReplaceSubscriptionPriceParams>>) = apply {
            body.replacePrices(replacePrices)
        }

        /**
         * Plan prices to be replaced with additional prices on the subscription. (Only available
         * for accounts that have migrated off of legacy subscription overrides)
         */
        fun addReplacePrice(replacePrice: ReplaceSubscriptionPriceParams) = apply {
            body.addReplacePrice(replacePrice)
        }

        fun startDate(startDate: OffsetDateTime?) = apply { body.startDate(startDate) }

        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { body.startDate(startDate) }

        /**
         * The duration of the trial period in days. If not provided, this defaults to the value
         * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
         */
        fun trialDurationDays(trialDurationDays: Long?) = apply {
            body.trialDurationDays(trialDurationDays)
        }

        /**
         * The duration of the trial period in days. If not provided, this defaults to the value
         * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
         */
        fun trialDurationDays(trialDurationDays: Long) =
            trialDurationDays(trialDurationDays as Long?)

        /**
         * The duration of the trial period in days. If not provided, this defaults to the value
         * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
         */
        fun trialDurationDays(trialDurationDays: JsonField<Long>) = apply {
            body.trialDurationDays(trialDurationDays)
        }

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this
         * subscription. By default, a subscription only considers usage events associated with its
         * attached customer's customer_id. When usage_customer_ids is provided, the subscription
         * includes usage events from the specified customers only. Provided usage_customer_ids must
         * be either the customer for this subscription itself, or any of that customer's children.
         */
        fun usageCustomerIds(usageCustomerIds: List<String>?) = apply {
            body.usageCustomerIds(usageCustomerIds)
        }

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this
         * subscription. By default, a subscription only considers usage events associated with its
         * attached customer's customer_id. When usage_customer_ids is provided, the subscription
         * includes usage events from the specified customers only. Provided usage_customer_ids must
         * be either the customer for this subscription itself, or any of that customer's children.
         */
        fun usageCustomerIds(usageCustomerIds: JsonField<List<String>>) = apply {
            body.usageCustomerIds(usageCustomerIds)
        }

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this
         * subscription. By default, a subscription only considers usage events associated with its
         * attached customer's customer_id. When usage_customer_ids is provided, the subscription
         * includes usage events from the specified customers only. Provided usage_customer_ids must
         * be either the customer for this subscription itself, or any of that customer's children.
         */
        fun addUsageCustomerId(usageCustomerId: String) = apply {
            body.addUsageCustomerId(usageCustomerId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): SubscriptionCreateParams =
            SubscriptionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @Deprecated("deprecated")
    class ExternalMarketplace
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val GOOGLE = of("google")

            val AWS = of("aws")

            val AZURE = of("azure")

            fun of(value: String) = ExternalMarketplace(JsonField.of(value))
        }

        /** An enum containing [ExternalMarketplace]'s known values. */
        enum class Known {
            GOOGLE,
            AWS,
            AZURE,
        }

        /**
         * An enum containing [ExternalMarketplace]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ExternalMarketplace] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GOOGLE,
            AWS,
            AZURE,
            /**
             * An enum member indicating that [ExternalMarketplace] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                GOOGLE -> Value.GOOGLE
                AWS -> Value.AWS
                AZURE -> Value.AZURE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                GOOGLE -> Known.GOOGLE
                AWS -> Known.AWS
                AZURE -> Known.AZURE
                else -> throw OrbInvalidDataException("Unknown ExternalMarketplace: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalMarketplace && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
