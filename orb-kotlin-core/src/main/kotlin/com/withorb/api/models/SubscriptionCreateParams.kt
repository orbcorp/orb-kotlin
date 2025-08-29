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
import com.withorb.api.core.Params
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
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
 * usage amounts hit \$10.00 for a subscription that invoices in USD.
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
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun addAdjustments(): List<AddAdjustment>? = body.addAdjustments()

    /**
     * Additional prices to be added to the subscription. (Only available for accounts that have
     * migrated off of legacy subscription overrides)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun addPrices(): List<AddPrice>? = body.addPrices()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun alignBillingWithSubscriptionStartDate(): Boolean? =
        body.alignBillingWithSubscriptionStartDate()

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. If not specified, this defaults to the behavior
     * configured for this customer.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun autoCollection(): Boolean? = body.autoCollection()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated") fun awsRegion(): String? = body.awsRegion()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun billingCycleAnchorConfiguration(): BillingCycleAnchorConfiguration? =
        body.billingCycleAnchorConfiguration()

    /**
     * Redemption code to be used for this subscription. If the coupon cannot be found by its
     * redemption code, or cannot be redeemed, an error response will be returned and the
     * subscription creation or plan change will not be scheduled.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun couponRedemptionCode(): String? = body.couponRedemptionCode()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated") fun creditsOverageRate(): Double? = body.creditsOverageRate()

    /**
     * The currency to use for the subscription. If not specified, the invoicing currency for the
     * plan will be used.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currency(): String? = body.currency()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun customerId(): String? = body.customerId()

    /**
     * Determines the default memo on this subscription's invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun defaultInvoiceMemo(): String? = body.defaultInvoiceMemo()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime? = body.endDate()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalCustomerId(): String? = body.externalCustomerId()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun externalMarketplace(): ExternalMarketplace? = body.externalMarketplace()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun externalMarketplaceReportingId(): String? = body.externalMarketplaceReportingId()

    /**
     * The external_plan_id of the plan that the given subscription should be switched to. Note that
     * either this property or `plan_id` must be specified.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalPlanId(): String? = body.externalPlanId()

    /**
     * An additional filter to apply to usage queries. This filter must be expressed as a boolean
     * [computed property](/extensibility/advanced-metrics#computed-properties). If null, usage
     * queries will not include any additional filter.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun filter(): String? = body.filter()

    /**
     * The phase of the plan to start with
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun initialPhaseOrder(): Long? = body.initialPhaseOrder()

    /**
     * When this subscription's accrued usage reaches this threshold, an invoice will be issued for
     * the subscription. If not specified, invoices will only be issued at the end of the billing
     * period.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun invoicingThreshold(): String? = body.invoicingThreshold()

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * The name to use for the subscription. If not specified, the plan name will be used.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun name(): String? = body.name()

    /**
     * The net terms determines the difference between the invoice date and the issue date for the
     * invoice. If you intend the invoice to be due on issue, set this to 0. If not provided, this
     * defaults to the value specified in the plan.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun netTerms(): Long? = body.netTerms()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated") fun perCreditOverageAmount(): Double? = body.perCreditOverageAmount()

    /**
     * The plan that the given subscription should be switched to. Note that either this property or
     * `external_plan_id` must be specified.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun planId(): String? = body.planId()

    /**
     * Specifies which version of the plan to subscribe to. If null, the default version will be
     * used.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun planVersionNumber(): Long? = body.planVersionNumber()

    /**
     * Optionally provide a list of overrides for prices on the plan
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated") fun priceOverrides(): List<JsonValue>? = body.priceOverrides()

    /**
     * Plan adjustments to be removed from the subscription. (Only available for accounts that have
     * migrated off of legacy subscription overrides)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun removeAdjustments(): List<RemoveAdjustment>? = body.removeAdjustments()

    /**
     * Plan prices to be removed from the subscription. (Only available for accounts that have
     * migrated off of legacy subscription overrides)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun removePrices(): List<RemovePrice>? = body.removePrices()

    /**
     * Plan adjustments to be replaced with additional adjustments on the subscription. (Only
     * available for accounts that have migrated off of legacy subscription overrides)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun replaceAdjustments(): List<ReplaceAdjustment>? = body.replaceAdjustments()

    /**
     * Plan prices to be replaced with additional prices on the subscription. (Only available for
     * accounts that have migrated off of legacy subscription overrides)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun replacePrices(): List<ReplacePrice>? = body.replacePrices()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime? = body.startDate()

    /**
     * The duration of the trial period in days. If not provided, this defaults to the value
     * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun trialDurationDays(): Long? = body.trialDurationDays()

    /**
     * A list of customer IDs whose usage events will be aggregated and billed under this
     * subscription. By default, a subscription only considers usage events associated with its
     * attached customer's customer_id. When usage_customer_ids is provided, the subscription
     * includes usage events from the specified customers only. Provided usage_customer_ids must be
     * either the customer for this subscription itself, or any of that customer's children.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun usageCustomerIds(): List<String>? = body.usageCustomerIds()

    /**
     * Returns the raw JSON value of [addAdjustments].
     *
     * Unlike [addAdjustments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addAdjustments(): JsonField<List<AddAdjustment>> = body._addAdjustments()

    /**
     * Returns the raw JSON value of [addPrices].
     *
     * Unlike [addPrices], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addPrices(): JsonField<List<AddPrice>> = body._addPrices()

    /**
     * Returns the raw JSON value of [alignBillingWithSubscriptionStartDate].
     *
     * Unlike [alignBillingWithSubscriptionStartDate], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    fun _alignBillingWithSubscriptionStartDate(): JsonField<Boolean> =
        body._alignBillingWithSubscriptionStartDate()

    /**
     * Returns the raw JSON value of [autoCollection].
     *
     * Unlike [autoCollection], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoCollection(): JsonField<Boolean> = body._autoCollection()

    /**
     * Returns the raw JSON value of [awsRegion].
     *
     * Unlike [awsRegion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated") fun _awsRegion(): JsonField<String> = body._awsRegion()

    /**
     * Returns the raw JSON value of [billingCycleAnchorConfiguration].
     *
     * Unlike [billingCycleAnchorConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _billingCycleAnchorConfiguration(): JsonField<BillingCycleAnchorConfiguration> =
        body._billingCycleAnchorConfiguration()

    /**
     * Returns the raw JSON value of [couponRedemptionCode].
     *
     * Unlike [couponRedemptionCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _couponRedemptionCode(): JsonField<String> = body._couponRedemptionCode()

    /**
     * Returns the raw JSON value of [creditsOverageRate].
     *
     * Unlike [creditsOverageRate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    fun _creditsOverageRate(): JsonField<Double> = body._creditsOverageRate()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [defaultInvoiceMemo].
     *
     * Unlike [defaultInvoiceMemo], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _defaultInvoiceMemo(): JsonField<String> = body._defaultInvoiceMemo()

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endDate(): JsonField<OffsetDateTime> = body._endDate()

    /**
     * Returns the raw JSON value of [externalCustomerId].
     *
     * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externalCustomerId(): JsonField<String> = body._externalCustomerId()

    /**
     * Returns the raw JSON value of [externalMarketplace].
     *
     * Unlike [externalMarketplace], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    fun _externalMarketplace(): JsonField<ExternalMarketplace> = body._externalMarketplace()

    /**
     * Returns the raw JSON value of [externalMarketplaceReportingId].
     *
     * Unlike [externalMarketplaceReportingId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @Deprecated("deprecated")
    fun _externalMarketplaceReportingId(): JsonField<String> =
        body._externalMarketplaceReportingId()

    /**
     * Returns the raw JSON value of [externalPlanId].
     *
     * Unlike [externalPlanId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _externalPlanId(): JsonField<String> = body._externalPlanId()

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<String> = body._filter()

    /**
     * Returns the raw JSON value of [initialPhaseOrder].
     *
     * Unlike [initialPhaseOrder], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _initialPhaseOrder(): JsonField<Long> = body._initialPhaseOrder()

    /**
     * Returns the raw JSON value of [invoicingThreshold].
     *
     * Unlike [invoicingThreshold], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _invoicingThreshold(): JsonField<String> = body._invoicingThreshold()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [netTerms].
     *
     * Unlike [netTerms], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _netTerms(): JsonField<Long> = body._netTerms()

    /**
     * Returns the raw JSON value of [perCreditOverageAmount].
     *
     * Unlike [perCreditOverageAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @Deprecated("deprecated")
    fun _perCreditOverageAmount(): JsonField<Double> = body._perCreditOverageAmount()

    /**
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _planId(): JsonField<String> = body._planId()

    /**
     * Returns the raw JSON value of [planVersionNumber].
     *
     * Unlike [planVersionNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _planVersionNumber(): JsonField<Long> = body._planVersionNumber()

    /**
     * Returns the raw JSON value of [priceOverrides].
     *
     * Unlike [priceOverrides], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    fun _priceOverrides(): JsonField<List<JsonValue>> = body._priceOverrides()

    /**
     * Returns the raw JSON value of [removeAdjustments].
     *
     * Unlike [removeAdjustments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _removeAdjustments(): JsonField<List<RemoveAdjustment>> = body._removeAdjustments()

    /**
     * Returns the raw JSON value of [removePrices].
     *
     * Unlike [removePrices], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _removePrices(): JsonField<List<RemovePrice>> = body._removePrices()

    /**
     * Returns the raw JSON value of [replaceAdjustments].
     *
     * Unlike [replaceAdjustments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _replaceAdjustments(): JsonField<List<ReplaceAdjustment>> = body._replaceAdjustments()

    /**
     * Returns the raw JSON value of [replacePrices].
     *
     * Unlike [replacePrices], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _replacePrices(): JsonField<List<ReplacePrice>> = body._replacePrices()

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startDate(): JsonField<OffsetDateTime> = body._startDate()

    /**
     * Returns the raw JSON value of [trialDurationDays].
     *
     * Unlike [trialDurationDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _trialDurationDays(): JsonField<Long> = body._trialDurationDays()

    /**
     * Returns the raw JSON value of [usageCustomerIds].
     *
     * Unlike [usageCustomerIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _usageCustomerIds(): JsonField<List<String>> = body._usageCustomerIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SubscriptionCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SubscriptionCreateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionCreateParams]. */
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
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [addAdjustments]
         * - [addPrices]
         * - [alignBillingWithSubscriptionStartDate]
         * - [autoCollection]
         * - [awsRegion]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Additional adjustments to be added to the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         */
        fun addAdjustments(addAdjustments: List<AddAdjustment>?) = apply {
            body.addAdjustments(addAdjustments)
        }

        /**
         * Sets [Builder.addAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addAdjustments] with a well-typed `List<AddAdjustment>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun addAdjustments(addAdjustments: JsonField<List<AddAdjustment>>) = apply {
            body.addAdjustments(addAdjustments)
        }

        /**
         * Adds a single [AddAdjustment] to [addAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddAdjustment(addAdjustment: AddAdjustment) = apply {
            body.addAddAdjustment(addAdjustment)
        }

        /**
         * Additional prices to be added to the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         */
        fun addPrices(addPrices: List<AddPrice>?) = apply { body.addPrices(addPrices) }

        /**
         * Sets [Builder.addPrices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addPrices] with a well-typed `List<AddPrice>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addPrices(addPrices: JsonField<List<AddPrice>>) = apply { body.addPrices(addPrices) }

        /**
         * Adds a single [AddPrice] to [addPrices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddPrice(addPrice: AddPrice) = apply { body.addAddPrice(addPrice) }

        fun alignBillingWithSubscriptionStartDate(alignBillingWithSubscriptionStartDate: Boolean) =
            apply {
                body.alignBillingWithSubscriptionStartDate(alignBillingWithSubscriptionStartDate)
            }

        /**
         * Sets [Builder.alignBillingWithSubscriptionStartDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alignBillingWithSubscriptionStartDate] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
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
         * Alias for [Builder.autoCollection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun autoCollection(autoCollection: Boolean) = autoCollection(autoCollection as Boolean?)

        /**
         * Sets [Builder.autoCollection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoCollection] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
            body.autoCollection(autoCollection)
        }

        @Deprecated("deprecated")
        fun awsRegion(awsRegion: String?) = apply { body.awsRegion(awsRegion) }

        /**
         * Sets [Builder.awsRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awsRegion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun awsRegion(awsRegion: JsonField<String>) = apply { body.awsRegion(awsRegion) }

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration?
        ) = apply { body.billingCycleAnchorConfiguration(billingCycleAnchorConfiguration) }

        /**
         * Sets [Builder.billingCycleAnchorConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCycleAnchorConfiguration] with a well-typed
         * [BillingCycleAnchorConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>
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
         * Sets [Builder.couponRedemptionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.couponRedemptionCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun couponRedemptionCode(couponRedemptionCode: JsonField<String>) = apply {
            body.couponRedemptionCode(couponRedemptionCode)
        }

        @Deprecated("deprecated")
        fun creditsOverageRate(creditsOverageRate: Double?) = apply {
            body.creditsOverageRate(creditsOverageRate)
        }

        /**
         * Alias for [Builder.creditsOverageRate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        @Deprecated("deprecated")
        fun creditsOverageRate(creditsOverageRate: Double) =
            creditsOverageRate(creditsOverageRate as Double?)

        /**
         * Sets [Builder.creditsOverageRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditsOverageRate] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun creditsOverageRate(creditsOverageRate: JsonField<Double>) = apply {
            body.creditsOverageRate(creditsOverageRate)
        }

        /**
         * The currency to use for the subscription. If not specified, the invoicing currency for
         * the plan will be used.
         */
        fun currency(currency: String?) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        fun customerId(customerId: String?) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: String?) = apply {
            body.defaultInvoiceMemo(defaultInvoiceMemo)
        }

        /**
         * Sets [Builder.defaultInvoiceMemo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultInvoiceMemo] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: JsonField<String>) = apply {
            body.defaultInvoiceMemo(defaultInvoiceMemo)
        }

        fun endDate(endDate: OffsetDateTime?) = apply { body.endDate(endDate) }

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { body.endDate(endDate) }

        fun externalCustomerId(externalCustomerId: String?) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /**
         * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        @Deprecated("deprecated")
        fun externalMarketplace(externalMarketplace: ExternalMarketplace?) = apply {
            body.externalMarketplace(externalMarketplace)
        }

        /**
         * Sets [Builder.externalMarketplace] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalMarketplace] with a well-typed
         * [ExternalMarketplace] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun externalMarketplace(externalMarketplace: JsonField<ExternalMarketplace>) = apply {
            body.externalMarketplace(externalMarketplace)
        }

        @Deprecated("deprecated")
        fun externalMarketplaceReportingId(externalMarketplaceReportingId: String?) = apply {
            body.externalMarketplaceReportingId(externalMarketplaceReportingId)
        }

        /**
         * Sets [Builder.externalMarketplaceReportingId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalMarketplaceReportingId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
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
         * Sets [Builder.externalPlanId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalPlanId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { body.filter(filter) }

        /** The phase of the plan to start with */
        fun initialPhaseOrder(initialPhaseOrder: Long?) = apply {
            body.initialPhaseOrder(initialPhaseOrder)
        }

        /**
         * Alias for [Builder.initialPhaseOrder].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun initialPhaseOrder(initialPhaseOrder: Long) =
            initialPhaseOrder(initialPhaseOrder as Long?)

        /**
         * Sets [Builder.initialPhaseOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialPhaseOrder] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.invoicingThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoicingThreshold] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** The name to use for the subscription. If not specified, the plan name will be used. */
        fun name(name: String?) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0. If not
         * provided, this defaults to the value specified in the plan.
         */
        fun netTerms(netTerms: Long?) = apply { body.netTerms(netTerms) }

        /**
         * Alias for [Builder.netTerms].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun netTerms(netTerms: Long) = netTerms(netTerms as Long?)

        /**
         * Sets [Builder.netTerms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netTerms] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun netTerms(netTerms: JsonField<Long>) = apply { body.netTerms(netTerms) }

        @Deprecated("deprecated")
        fun perCreditOverageAmount(perCreditOverageAmount: Double?) = apply {
            body.perCreditOverageAmount(perCreditOverageAmount)
        }

        /**
         * Alias for [Builder.perCreditOverageAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        @Deprecated("deprecated")
        fun perCreditOverageAmount(perCreditOverageAmount: Double) =
            perCreditOverageAmount(perCreditOverageAmount as Double?)

        /**
         * Sets [Builder.perCreditOverageAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perCreditOverageAmount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Alias for [Builder.planVersionNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun planVersionNumber(planVersionNumber: Long) =
            planVersionNumber(planVersionNumber as Long?)

        /**
         * Sets [Builder.planVersionNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planVersionNumber] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun planVersionNumber(planVersionNumber: JsonField<Long>) = apply {
            body.planVersionNumber(planVersionNumber)
        }

        /** Optionally provide a list of overrides for prices on the plan */
        @Deprecated("deprecated")
        fun priceOverrides(priceOverrides: List<JsonValue>?) = apply {
            body.priceOverrides(priceOverrides)
        }

        /**
         * Sets [Builder.priceOverrides] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceOverrides] with a well-typed `List<JsonValue>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        @Deprecated("deprecated")
        fun priceOverrides(priceOverrides: JsonField<List<JsonValue>>) = apply {
            body.priceOverrides(priceOverrides)
        }

        /**
         * Adds a single [JsonValue] to [priceOverrides].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        @Deprecated("deprecated")
        fun addPriceOverride(priceOverride: JsonValue) = apply {
            body.addPriceOverride(priceOverride)
        }

        /**
         * Plan adjustments to be removed from the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         */
        fun removeAdjustments(removeAdjustments: List<RemoveAdjustment>?) = apply {
            body.removeAdjustments(removeAdjustments)
        }

        /**
         * Sets [Builder.removeAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.removeAdjustments] with a well-typed
         * `List<RemoveAdjustment>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun removeAdjustments(removeAdjustments: JsonField<List<RemoveAdjustment>>) = apply {
            body.removeAdjustments(removeAdjustments)
        }

        /**
         * Adds a single [RemoveAdjustment] to [removeAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemoveAdjustment(removeAdjustment: RemoveAdjustment) = apply {
            body.addRemoveAdjustment(removeAdjustment)
        }

        /**
         * Plan prices to be removed from the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         */
        fun removePrices(removePrices: List<RemovePrice>?) = apply {
            body.removePrices(removePrices)
        }

        /**
         * Sets [Builder.removePrices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.removePrices] with a well-typed `List<RemovePrice>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun removePrices(removePrices: JsonField<List<RemovePrice>>) = apply {
            body.removePrices(removePrices)
        }

        /**
         * Adds a single [RemovePrice] to [removePrices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemovePrice(removePrice: RemovePrice) = apply { body.addRemovePrice(removePrice) }

        /**
         * Plan adjustments to be replaced with additional adjustments on the subscription. (Only
         * available for accounts that have migrated off of legacy subscription overrides)
         */
        fun replaceAdjustments(replaceAdjustments: List<ReplaceAdjustment>?) = apply {
            body.replaceAdjustments(replaceAdjustments)
        }

        /**
         * Sets [Builder.replaceAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replaceAdjustments] with a well-typed
         * `List<ReplaceAdjustment>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun replaceAdjustments(replaceAdjustments: JsonField<List<ReplaceAdjustment>>) = apply {
            body.replaceAdjustments(replaceAdjustments)
        }

        /**
         * Adds a single [ReplaceAdjustment] to [replaceAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReplaceAdjustment(replaceAdjustment: ReplaceAdjustment) = apply {
            body.addReplaceAdjustment(replaceAdjustment)
        }

        /**
         * Plan prices to be replaced with additional prices on the subscription. (Only available
         * for accounts that have migrated off of legacy subscription overrides)
         */
        fun replacePrices(replacePrices: List<ReplacePrice>?) = apply {
            body.replacePrices(replacePrices)
        }

        /**
         * Sets [Builder.replacePrices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replacePrices] with a well-typed `List<ReplacePrice>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun replacePrices(replacePrices: JsonField<List<ReplacePrice>>) = apply {
            body.replacePrices(replacePrices)
        }

        /**
         * Adds a single [ReplacePrice] to [replacePrices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReplacePrice(replacePrice: ReplacePrice) = apply {
            body.addReplacePrice(replacePrice)
        }

        fun startDate(startDate: OffsetDateTime?) = apply { body.startDate(startDate) }

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { body.startDate(startDate) }

        /**
         * The duration of the trial period in days. If not provided, this defaults to the value
         * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
         */
        fun trialDurationDays(trialDurationDays: Long?) = apply {
            body.trialDurationDays(trialDurationDays)
        }

        /**
         * Alias for [Builder.trialDurationDays].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun trialDurationDays(trialDurationDays: Long) =
            trialDurationDays(trialDurationDays as Long?)

        /**
         * Sets [Builder.trialDurationDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialDurationDays] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.usageCustomerIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageCustomerIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usageCustomerIds(usageCustomerIds: JsonField<List<String>>) = apply {
            body.usageCustomerIds(usageCustomerIds)
        }

        /**
         * Adds a single [String] to [usageCustomerIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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

        /**
         * Returns an immutable instance of [SubscriptionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionCreateParams =
            SubscriptionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val addAdjustments: JsonField<List<AddAdjustment>>,
        private val addPrices: JsonField<List<AddPrice>>,
        private val alignBillingWithSubscriptionStartDate: JsonField<Boolean>,
        private val autoCollection: JsonField<Boolean>,
        private val awsRegion: JsonField<String>,
        private val billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>,
        private val couponRedemptionCode: JsonField<String>,
        private val creditsOverageRate: JsonField<Double>,
        private val currency: JsonField<String>,
        private val customerId: JsonField<String>,
        private val defaultInvoiceMemo: JsonField<String>,
        private val endDate: JsonField<OffsetDateTime>,
        private val externalCustomerId: JsonField<String>,
        private val externalMarketplace: JsonField<ExternalMarketplace>,
        private val externalMarketplaceReportingId: JsonField<String>,
        private val externalPlanId: JsonField<String>,
        private val filter: JsonField<String>,
        private val initialPhaseOrder: JsonField<Long>,
        private val invoicingThreshold: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val name: JsonField<String>,
        private val netTerms: JsonField<Long>,
        private val perCreditOverageAmount: JsonField<Double>,
        private val planId: JsonField<String>,
        private val planVersionNumber: JsonField<Long>,
        private val priceOverrides: JsonField<List<JsonValue>>,
        private val removeAdjustments: JsonField<List<RemoveAdjustment>>,
        private val removePrices: JsonField<List<RemovePrice>>,
        private val replaceAdjustments: JsonField<List<ReplaceAdjustment>>,
        private val replacePrices: JsonField<List<ReplacePrice>>,
        private val startDate: JsonField<OffsetDateTime>,
        private val trialDurationDays: JsonField<Long>,
        private val usageCustomerIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("add_adjustments")
            @ExcludeMissing
            addAdjustments: JsonField<List<AddAdjustment>> = JsonMissing.of(),
            @JsonProperty("add_prices")
            @ExcludeMissing
            addPrices: JsonField<List<AddPrice>> = JsonMissing.of(),
            @JsonProperty("align_billing_with_subscription_start_date")
            @ExcludeMissing
            alignBillingWithSubscriptionStartDate: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("auto_collection")
            @ExcludeMissing
            autoCollection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("aws_region")
            @ExcludeMissing
            awsRegion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billing_cycle_anchor_configuration")
            @ExcludeMissing
            billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration> =
                JsonMissing.of(),
            @JsonProperty("coupon_redemption_code")
            @ExcludeMissing
            couponRedemptionCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credits_overage_rate")
            @ExcludeMissing
            creditsOverageRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("default_invoice_memo")
            @ExcludeMissing
            defaultInvoiceMemo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            externalCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_marketplace")
            @ExcludeMissing
            externalMarketplace: JsonField<ExternalMarketplace> = JsonMissing.of(),
            @JsonProperty("external_marketplace_reporting_id")
            @ExcludeMissing
            externalMarketplaceReportingId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_plan_id")
            @ExcludeMissing
            externalPlanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("initial_phase_order")
            @ExcludeMissing
            initialPhaseOrder: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("invoicing_threshold")
            @ExcludeMissing
            invoicingThreshold: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("net_terms") @ExcludeMissing netTerms: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("per_credit_overage_amount")
            @ExcludeMissing
            perCreditOverageAmount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("plan_id") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plan_version_number")
            @ExcludeMissing
            planVersionNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("price_overrides")
            @ExcludeMissing
            priceOverrides: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("remove_adjustments")
            @ExcludeMissing
            removeAdjustments: JsonField<List<RemoveAdjustment>> = JsonMissing.of(),
            @JsonProperty("remove_prices")
            @ExcludeMissing
            removePrices: JsonField<List<RemovePrice>> = JsonMissing.of(),
            @JsonProperty("replace_adjustments")
            @ExcludeMissing
            replaceAdjustments: JsonField<List<ReplaceAdjustment>> = JsonMissing.of(),
            @JsonProperty("replace_prices")
            @ExcludeMissing
            replacePrices: JsonField<List<ReplacePrice>> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("trial_duration_days")
            @ExcludeMissing
            trialDurationDays: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("usage_customer_ids")
            @ExcludeMissing
            usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            addAdjustments,
            addPrices,
            alignBillingWithSubscriptionStartDate,
            autoCollection,
            awsRegion,
            billingCycleAnchorConfiguration,
            couponRedemptionCode,
            creditsOverageRate,
            currency,
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
            name,
            netTerms,
            perCreditOverageAmount,
            planId,
            planVersionNumber,
            priceOverrides,
            removeAdjustments,
            removePrices,
            replaceAdjustments,
            replacePrices,
            startDate,
            trialDurationDays,
            usageCustomerIds,
            mutableMapOf(),
        )

        /**
         * Additional adjustments to be added to the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addAdjustments(): List<AddAdjustment>? = addAdjustments.getNullable("add_adjustments")

        /**
         * Additional prices to be added to the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addPrices(): List<AddPrice>? = addPrices.getNullable("add_prices")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun alignBillingWithSubscriptionStartDate(): Boolean? =
            alignBillingWithSubscriptionStartDate.getNullable(
                "align_billing_with_subscription_start_date"
            )

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. If not specified, this defaults to the
         * behavior configured for this customer.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoCollection(): Boolean? = autoCollection.getNullable("auto_collection")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun awsRegion(): String? = awsRegion.getNullable("aws_region")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingCycleAnchorConfiguration(): BillingCycleAnchorConfiguration? =
            billingCycleAnchorConfiguration.getNullable("billing_cycle_anchor_configuration")

        /**
         * Redemption code to be used for this subscription. If the coupon cannot be found by its
         * redemption code, or cannot be redeemed, an error response will be returned and the
         * subscription creation or plan change will not be scheduled.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun couponRedemptionCode(): String? =
            couponRedemptionCode.getNullable("coupon_redemption_code")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun creditsOverageRate(): Double? = creditsOverageRate.getNullable("credits_overage_rate")

        /**
         * The currency to use for the subscription. If not specified, the invoicing currency for
         * the plan will be used.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): String? = currency.getNullable("currency")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerId(): String? = customerId.getNullable("customer_id")

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultInvoiceMemo(): String? = defaultInvoiceMemo.getNullable("default_invoice_memo")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun externalMarketplace(): ExternalMarketplace? =
            externalMarketplace.getNullable("external_marketplace")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun externalMarketplaceReportingId(): String? =
            externalMarketplaceReportingId.getNullable("external_marketplace_reporting_id")

        /**
         * The external_plan_id of the plan that the given subscription should be switched to. Note
         * that either this property or `plan_id` must be specified.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPlanId(): String? = externalPlanId.getNullable("external_plan_id")

        /**
         * An additional filter to apply to usage queries. This filter must be expressed as a
         * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
         * null, usage queries will not include any additional filter.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filter(): String? = filter.getNullable("filter")

        /**
         * The phase of the plan to start with
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun initialPhaseOrder(): Long? = initialPhaseOrder.getNullable("initial_phase_order")

        /**
         * When this subscription's accrued usage reaches this threshold, an invoice will be issued
         * for the subscription. If not specified, invoices will only be issued at the end of the
         * billing period.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invoicingThreshold(): String? = invoicingThreshold.getNullable("invoicing_threshold")

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * The name to use for the subscription. If not specified, the plan name will be used.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0. If not
         * provided, this defaults to the value specified in the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun netTerms(): Long? = netTerms.getNullable("net_terms")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun perCreditOverageAmount(): Double? =
            perCreditOverageAmount.getNullable("per_credit_overage_amount")

        /**
         * The plan that the given subscription should be switched to. Note that either this
         * property or `external_plan_id` must be specified.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planId(): String? = planId.getNullable("plan_id")

        /**
         * Specifies which version of the plan to subscribe to. If null, the default version will be
         * used.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planVersionNumber(): Long? = planVersionNumber.getNullable("plan_version_number")

        /**
         * Optionally provide a list of overrides for prices on the plan
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun priceOverrides(): List<JsonValue>? = priceOverrides.getNullable("price_overrides")

        /**
         * Plan adjustments to be removed from the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun removeAdjustments(): List<RemoveAdjustment>? =
            removeAdjustments.getNullable("remove_adjustments")

        /**
         * Plan prices to be removed from the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun removePrices(): List<RemovePrice>? = removePrices.getNullable("remove_prices")

        /**
         * Plan adjustments to be replaced with additional adjustments on the subscription. (Only
         * available for accounts that have migrated off of legacy subscription overrides)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replaceAdjustments(): List<ReplaceAdjustment>? =
            replaceAdjustments.getNullable("replace_adjustments")

        /**
         * Plan prices to be replaced with additional prices on the subscription. (Only available
         * for accounts that have migrated off of legacy subscription overrides)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replacePrices(): List<ReplacePrice>? = replacePrices.getNullable("replace_prices")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime? = startDate.getNullable("start_date")

        /**
         * The duration of the trial period in days. If not provided, this defaults to the value
         * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trialDurationDays(): Long? = trialDurationDays.getNullable("trial_duration_days")

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this
         * subscription. By default, a subscription only considers usage events associated with its
         * attached customer's customer_id. When usage_customer_ids is provided, the subscription
         * includes usage events from the specified customers only. Provided usage_customer_ids must
         * be either the customer for this subscription itself, or any of that customer's children.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usageCustomerIds(): List<String>? = usageCustomerIds.getNullable("usage_customer_ids")

        /**
         * Returns the raw JSON value of [addAdjustments].
         *
         * Unlike [addAdjustments], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("add_adjustments")
        @ExcludeMissing
        fun _addAdjustments(): JsonField<List<AddAdjustment>> = addAdjustments

        /**
         * Returns the raw JSON value of [addPrices].
         *
         * Unlike [addPrices], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("add_prices")
        @ExcludeMissing
        fun _addPrices(): JsonField<List<AddPrice>> = addPrices

        /**
         * Returns the raw JSON value of [alignBillingWithSubscriptionStartDate].
         *
         * Unlike [alignBillingWithSubscriptionStartDate], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("align_billing_with_subscription_start_date")
        @ExcludeMissing
        fun _alignBillingWithSubscriptionStartDate(): JsonField<Boolean> =
            alignBillingWithSubscriptionStartDate

        /**
         * Returns the raw JSON value of [autoCollection].
         *
         * Unlike [autoCollection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_collection")
        @ExcludeMissing
        fun _autoCollection(): JsonField<Boolean> = autoCollection

        /**
         * Returns the raw JSON value of [awsRegion].
         *
         * Unlike [awsRegion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("aws_region")
        @ExcludeMissing
        fun _awsRegion(): JsonField<String> = awsRegion

        /**
         * Returns the raw JSON value of [billingCycleAnchorConfiguration].
         *
         * Unlike [billingCycleAnchorConfiguration], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("billing_cycle_anchor_configuration")
        @ExcludeMissing
        fun _billingCycleAnchorConfiguration(): JsonField<BillingCycleAnchorConfiguration> =
            billingCycleAnchorConfiguration

        /**
         * Returns the raw JSON value of [couponRedemptionCode].
         *
         * Unlike [couponRedemptionCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("coupon_redemption_code")
        @ExcludeMissing
        fun _couponRedemptionCode(): JsonField<String> = couponRedemptionCode

        /**
         * Returns the raw JSON value of [creditsOverageRate].
         *
         * Unlike [creditsOverageRate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("credits_overage_rate")
        @ExcludeMissing
        fun _creditsOverageRate(): JsonField<Double> = creditsOverageRate

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [defaultInvoiceMemo].
         *
         * Unlike [defaultInvoiceMemo], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("default_invoice_memo")
        @ExcludeMissing
        fun _defaultInvoiceMemo(): JsonField<String> = defaultInvoiceMemo

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [externalCustomerId].
         *
         * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        /**
         * Returns the raw JSON value of [externalMarketplace].
         *
         * Unlike [externalMarketplace], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("external_marketplace")
        @ExcludeMissing
        fun _externalMarketplace(): JsonField<ExternalMarketplace> = externalMarketplace

        /**
         * Returns the raw JSON value of [externalMarketplaceReportingId].
         *
         * Unlike [externalMarketplaceReportingId], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("external_marketplace_reporting_id")
        @ExcludeMissing
        fun _externalMarketplaceReportingId(): JsonField<String> = externalMarketplaceReportingId

        /**
         * Returns the raw JSON value of [externalPlanId].
         *
         * Unlike [externalPlanId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_plan_id")
        @ExcludeMissing
        fun _externalPlanId(): JsonField<String> = externalPlanId

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [initialPhaseOrder].
         *
         * Unlike [initialPhaseOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("initial_phase_order")
        @ExcludeMissing
        fun _initialPhaseOrder(): JsonField<Long> = initialPhaseOrder

        /**
         * Returns the raw JSON value of [invoicingThreshold].
         *
         * Unlike [invoicingThreshold], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("invoicing_threshold")
        @ExcludeMissing
        fun _invoicingThreshold(): JsonField<String> = invoicingThreshold

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [netTerms].
         *
         * Unlike [netTerms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("net_terms") @ExcludeMissing fun _netTerms(): JsonField<Long> = netTerms

        /**
         * Returns the raw JSON value of [perCreditOverageAmount].
         *
         * Unlike [perCreditOverageAmount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("per_credit_overage_amount")
        @ExcludeMissing
        fun _perCreditOverageAmount(): JsonField<Double> = perCreditOverageAmount

        /**
         * Returns the raw JSON value of [planId].
         *
         * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /**
         * Returns the raw JSON value of [planVersionNumber].
         *
         * Unlike [planVersionNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plan_version_number")
        @ExcludeMissing
        fun _planVersionNumber(): JsonField<Long> = planVersionNumber

        /**
         * Returns the raw JSON value of [priceOverrides].
         *
         * Unlike [priceOverrides], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("price_overrides")
        @ExcludeMissing
        fun _priceOverrides(): JsonField<List<JsonValue>> = priceOverrides

        /**
         * Returns the raw JSON value of [removeAdjustments].
         *
         * Unlike [removeAdjustments], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("remove_adjustments")
        @ExcludeMissing
        fun _removeAdjustments(): JsonField<List<RemoveAdjustment>> = removeAdjustments

        /**
         * Returns the raw JSON value of [removePrices].
         *
         * Unlike [removePrices], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("remove_prices")
        @ExcludeMissing
        fun _removePrices(): JsonField<List<RemovePrice>> = removePrices

        /**
         * Returns the raw JSON value of [replaceAdjustments].
         *
         * Unlike [replaceAdjustments], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("replace_adjustments")
        @ExcludeMissing
        fun _replaceAdjustments(): JsonField<List<ReplaceAdjustment>> = replaceAdjustments

        /**
         * Returns the raw JSON value of [replacePrices].
         *
         * Unlike [replacePrices], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("replace_prices")
        @ExcludeMissing
        fun _replacePrices(): JsonField<List<ReplacePrice>> = replacePrices

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * Returns the raw JSON value of [trialDurationDays].
         *
         * Unlike [trialDurationDays], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trial_duration_days")
        @ExcludeMissing
        fun _trialDurationDays(): JsonField<Long> = trialDurationDays

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var addAdjustments: JsonField<MutableList<AddAdjustment>>? = null
            private var addPrices: JsonField<MutableList<AddPrice>>? = null
            private var alignBillingWithSubscriptionStartDate: JsonField<Boolean> = JsonMissing.of()
            private var autoCollection: JsonField<Boolean> = JsonMissing.of()
            private var awsRegion: JsonField<String> = JsonMissing.of()
            private var billingCycleAnchorConfiguration:
                JsonField<BillingCycleAnchorConfiguration> =
                JsonMissing.of()
            private var couponRedemptionCode: JsonField<String> = JsonMissing.of()
            private var creditsOverageRate: JsonField<Double> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
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
            private var name: JsonField<String> = JsonMissing.of()
            private var netTerms: JsonField<Long> = JsonMissing.of()
            private var perCreditOverageAmount: JsonField<Double> = JsonMissing.of()
            private var planId: JsonField<String> = JsonMissing.of()
            private var planVersionNumber: JsonField<Long> = JsonMissing.of()
            private var priceOverrides: JsonField<MutableList<JsonValue>>? = null
            private var removeAdjustments: JsonField<MutableList<RemoveAdjustment>>? = null
            private var removePrices: JsonField<MutableList<RemovePrice>>? = null
            private var replaceAdjustments: JsonField<MutableList<ReplaceAdjustment>>? = null
            private var replacePrices: JsonField<MutableList<ReplacePrice>>? = null
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
                currency = body.currency
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
                name = body.name
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
            fun addAdjustments(addAdjustments: List<AddAdjustment>?) =
                addAdjustments(JsonField.ofNullable(addAdjustments))

            /**
             * Sets [Builder.addAdjustments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addAdjustments] with a well-typed
             * `List<AddAdjustment>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun addAdjustments(addAdjustments: JsonField<List<AddAdjustment>>) = apply {
                this.addAdjustments = addAdjustments.map { it.toMutableList() }
            }

            /**
             * Adds a single [AddAdjustment] to [addAdjustments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddAdjustment(addAdjustment: AddAdjustment) = apply {
                addAdjustments =
                    (addAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addAdjustments", it).add(addAdjustment)
                    }
            }

            /**
             * Additional prices to be added to the subscription. (Only available for accounts that
             * have migrated off of legacy subscription overrides)
             */
            fun addPrices(addPrices: List<AddPrice>?) = addPrices(JsonField.ofNullable(addPrices))

            /**
             * Sets [Builder.addPrices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addPrices] with a well-typed `List<AddPrice>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addPrices(addPrices: JsonField<List<AddPrice>>) = apply {
                this.addPrices = addPrices.map { it.toMutableList() }
            }

            /**
             * Adds a single [AddPrice] to [addPrices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddPrice(addPrice: AddPrice) = apply {
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

            /**
             * Sets [Builder.alignBillingWithSubscriptionStartDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alignBillingWithSubscriptionStartDate] with a
             * well-typed [Boolean] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
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
             * Alias for [Builder.autoCollection].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun autoCollection(autoCollection: Boolean) = autoCollection(autoCollection as Boolean?)

            /**
             * Sets [Builder.autoCollection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoCollection] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
                this.autoCollection = autoCollection
            }

            @Deprecated("deprecated")
            fun awsRegion(awsRegion: String?) = awsRegion(JsonField.ofNullable(awsRegion))

            /**
             * Sets [Builder.awsRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsRegion] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun awsRegion(awsRegion: JsonField<String>) = apply { this.awsRegion = awsRegion }

            fun billingCycleAnchorConfiguration(
                billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration?
            ) =
                billingCycleAnchorConfiguration(
                    JsonField.ofNullable(billingCycleAnchorConfiguration)
                )

            /**
             * Sets [Builder.billingCycleAnchorConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingCycleAnchorConfiguration] with a well-typed
             * [BillingCycleAnchorConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun billingCycleAnchorConfiguration(
                billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>
            ) = apply { this.billingCycleAnchorConfiguration = billingCycleAnchorConfiguration }

            /**
             * Redemption code to be used for this subscription. If the coupon cannot be found by
             * its redemption code, or cannot be redeemed, an error response will be returned and
             * the subscription creation or plan change will not be scheduled.
             */
            fun couponRedemptionCode(couponRedemptionCode: String?) =
                couponRedemptionCode(JsonField.ofNullable(couponRedemptionCode))

            /**
             * Sets [Builder.couponRedemptionCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.couponRedemptionCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun couponRedemptionCode(couponRedemptionCode: JsonField<String>) = apply {
                this.couponRedemptionCode = couponRedemptionCode
            }

            @Deprecated("deprecated")
            fun creditsOverageRate(creditsOverageRate: Double?) =
                creditsOverageRate(JsonField.ofNullable(creditsOverageRate))

            /**
             * Alias for [Builder.creditsOverageRate].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            @Deprecated("deprecated")
            fun creditsOverageRate(creditsOverageRate: Double) =
                creditsOverageRate(creditsOverageRate as Double?)

            /**
             * Sets [Builder.creditsOverageRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditsOverageRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun creditsOverageRate(creditsOverageRate: JsonField<Double>) = apply {
                this.creditsOverageRate = creditsOverageRate
            }

            /**
             * The currency to use for the subscription. If not specified, the invoicing currency
             * for the plan will be used.
             */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * Determines the default memo on this subscription's invoices. Note that if this is not
             * provided, it is determined by the plan configuration.
             */
            fun defaultInvoiceMemo(defaultInvoiceMemo: String?) =
                defaultInvoiceMemo(JsonField.ofNullable(defaultInvoiceMemo))

            /**
             * Sets [Builder.defaultInvoiceMemo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultInvoiceMemo] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultInvoiceMemo(defaultInvoiceMemo: JsonField<String>) = apply {
                this.defaultInvoiceMemo = defaultInvoiceMemo
            }

            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            fun externalCustomerId(externalCustomerId: String?) =
                externalCustomerId(JsonField.ofNullable(externalCustomerId))

            /**
             * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
                this.externalCustomerId = externalCustomerId
            }

            @Deprecated("deprecated")
            fun externalMarketplace(externalMarketplace: ExternalMarketplace?) =
                externalMarketplace(JsonField.ofNullable(externalMarketplace))

            /**
             * Sets [Builder.externalMarketplace] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalMarketplace] with a well-typed
             * [ExternalMarketplace] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            @Deprecated("deprecated")
            fun externalMarketplace(externalMarketplace: JsonField<ExternalMarketplace>) = apply {
                this.externalMarketplace = externalMarketplace
            }

            @Deprecated("deprecated")
            fun externalMarketplaceReportingId(externalMarketplaceReportingId: String?) =
                externalMarketplaceReportingId(JsonField.ofNullable(externalMarketplaceReportingId))

            /**
             * Sets [Builder.externalMarketplaceReportingId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalMarketplaceReportingId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
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
             * Sets [Builder.externalPlanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPlanId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /** The phase of the plan to start with */
            fun initialPhaseOrder(initialPhaseOrder: Long?) =
                initialPhaseOrder(JsonField.ofNullable(initialPhaseOrder))

            /**
             * Alias for [Builder.initialPhaseOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun initialPhaseOrder(initialPhaseOrder: Long) =
                initialPhaseOrder(initialPhaseOrder as Long?)

            /**
             * Sets [Builder.initialPhaseOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initialPhaseOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.invoicingThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoicingThreshold] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * The name to use for the subscription. If not specified, the plan name will be used.
             */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The net terms determines the difference between the invoice date and the issue date
             * for the invoice. If you intend the invoice to be due on issue, set this to 0. If not
             * provided, this defaults to the value specified in the plan.
             */
            fun netTerms(netTerms: Long?) = netTerms(JsonField.ofNullable(netTerms))

            /**
             * Alias for [Builder.netTerms].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun netTerms(netTerms: Long) = netTerms(netTerms as Long?)

            /**
             * Sets [Builder.netTerms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netTerms] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

            @Deprecated("deprecated")
            fun perCreditOverageAmount(perCreditOverageAmount: Double?) =
                perCreditOverageAmount(JsonField.ofNullable(perCreditOverageAmount))

            /**
             * Alias for [Builder.perCreditOverageAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            @Deprecated("deprecated")
            fun perCreditOverageAmount(perCreditOverageAmount: Double) =
                perCreditOverageAmount(perCreditOverageAmount as Double?)

            /**
             * Sets [Builder.perCreditOverageAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perCreditOverageAmount] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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
             * Sets [Builder.planId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /**
             * Specifies which version of the plan to subscribe to. If null, the default version
             * will be used.
             */
            fun planVersionNumber(planVersionNumber: Long?) =
                planVersionNumber(JsonField.ofNullable(planVersionNumber))

            /**
             * Alias for [Builder.planVersionNumber].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun planVersionNumber(planVersionNumber: Long) =
                planVersionNumber(planVersionNumber as Long?)

            /**
             * Sets [Builder.planVersionNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planVersionNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planVersionNumber(planVersionNumber: JsonField<Long>) = apply {
                this.planVersionNumber = planVersionNumber
            }

            /** Optionally provide a list of overrides for prices on the plan */
            @Deprecated("deprecated")
            fun priceOverrides(priceOverrides: List<JsonValue>?) =
                priceOverrides(JsonField.ofNullable(priceOverrides))

            /**
             * Sets [Builder.priceOverrides] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceOverrides] with a well-typed `List<JsonValue>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            @Deprecated("deprecated")
            fun priceOverrides(priceOverrides: JsonField<List<JsonValue>>) = apply {
                this.priceOverrides = priceOverrides.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [priceOverrides].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
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
            fun removeAdjustments(removeAdjustments: List<RemoveAdjustment>?) =
                removeAdjustments(JsonField.ofNullable(removeAdjustments))

            /**
             * Sets [Builder.removeAdjustments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.removeAdjustments] with a well-typed
             * `List<RemoveAdjustment>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun removeAdjustments(removeAdjustments: JsonField<List<RemoveAdjustment>>) = apply {
                this.removeAdjustments = removeAdjustments.map { it.toMutableList() }
            }

            /**
             * Adds a single [RemoveAdjustment] to [removeAdjustments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemoveAdjustment(removeAdjustment: RemoveAdjustment) = apply {
                removeAdjustments =
                    (removeAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removeAdjustments", it).add(removeAdjustment)
                    }
            }

            /**
             * Plan prices to be removed from the subscription. (Only available for accounts that
             * have migrated off of legacy subscription overrides)
             */
            fun removePrices(removePrices: List<RemovePrice>?) =
                removePrices(JsonField.ofNullable(removePrices))

            /**
             * Sets [Builder.removePrices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.removePrices] with a well-typed `List<RemovePrice>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun removePrices(removePrices: JsonField<List<RemovePrice>>) = apply {
                this.removePrices = removePrices.map { it.toMutableList() }
            }

            /**
             * Adds a single [RemovePrice] to [removePrices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemovePrice(removePrice: RemovePrice) = apply {
                removePrices =
                    (removePrices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removePrices", it).add(removePrice)
                    }
            }

            /**
             * Plan adjustments to be replaced with additional adjustments on the subscription.
             * (Only available for accounts that have migrated off of legacy subscription overrides)
             */
            fun replaceAdjustments(replaceAdjustments: List<ReplaceAdjustment>?) =
                replaceAdjustments(JsonField.ofNullable(replaceAdjustments))

            /**
             * Sets [Builder.replaceAdjustments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replaceAdjustments] with a well-typed
             * `List<ReplaceAdjustment>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun replaceAdjustments(replaceAdjustments: JsonField<List<ReplaceAdjustment>>) = apply {
                this.replaceAdjustments = replaceAdjustments.map { it.toMutableList() }
            }

            /**
             * Adds a single [ReplaceAdjustment] to [replaceAdjustments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReplaceAdjustment(replaceAdjustment: ReplaceAdjustment) = apply {
                replaceAdjustments =
                    (replaceAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("replaceAdjustments", it).add(replaceAdjustment)
                    }
            }

            /**
             * Plan prices to be replaced with additional prices on the subscription. (Only
             * available for accounts that have migrated off of legacy subscription overrides)
             */
            fun replacePrices(replacePrices: List<ReplacePrice>?) =
                replacePrices(JsonField.ofNullable(replacePrices))

            /**
             * Sets [Builder.replacePrices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replacePrices] with a well-typed
             * `List<ReplacePrice>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun replacePrices(replacePrices: JsonField<List<ReplacePrice>>) = apply {
                this.replacePrices = replacePrices.map { it.toMutableList() }
            }

            /**
             * Adds a single [ReplacePrice] to [replacePrices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReplacePrice(replacePrice: ReplacePrice) = apply {
                replacePrices =
                    (replacePrices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("replacePrices", it).add(replacePrice)
                    }
            }

            fun startDate(startDate: OffsetDateTime?) = startDate(JsonField.ofNullable(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Alias for [Builder.trialDurationDays].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun trialDurationDays(trialDurationDays: Long) =
                trialDurationDays(trialDurationDays as Long?)

            /**
             * Sets [Builder.trialDurationDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialDurationDays] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.usageCustomerIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageCustomerIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
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
                    currency,
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
                    name,
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
                    additionalProperties.toMutableMap(),
                )
        }

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
            currency()
            customerId()
            defaultInvoiceMemo()
            endDate()
            externalCustomerId()
            externalMarketplace()?.validate()
            externalMarketplaceReportingId()
            externalPlanId()
            filter()
            initialPhaseOrder()
            invoicingThreshold()
            metadata()?.validate()
            name()
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
            (addAdjustments.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (addPrices.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (alignBillingWithSubscriptionStartDate.asKnown() == null) 0 else 1) +
                (if (autoCollection.asKnown() == null) 0 else 1) +
                (if (awsRegion.asKnown() == null) 0 else 1) +
                (billingCycleAnchorConfiguration.asKnown()?.validity() ?: 0) +
                (if (couponRedemptionCode.asKnown() == null) 0 else 1) +
                (if (creditsOverageRate.asKnown() == null) 0 else 1) +
                (if (currency.asKnown() == null) 0 else 1) +
                (if (customerId.asKnown() == null) 0 else 1) +
                (if (defaultInvoiceMemo.asKnown() == null) 0 else 1) +
                (if (endDate.asKnown() == null) 0 else 1) +
                (if (externalCustomerId.asKnown() == null) 0 else 1) +
                (externalMarketplace.asKnown()?.validity() ?: 0) +
                (if (externalMarketplaceReportingId.asKnown() == null) 0 else 1) +
                (if (externalPlanId.asKnown() == null) 0 else 1) +
                (if (filter.asKnown() == null) 0 else 1) +
                (if (initialPhaseOrder.asKnown() == null) 0 else 1) +
                (if (invoicingThreshold.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (netTerms.asKnown() == null) 0 else 1) +
                (if (perCreditOverageAmount.asKnown() == null) 0 else 1) +
                (if (planId.asKnown() == null) 0 else 1) +
                (if (planVersionNumber.asKnown() == null) 0 else 1) +
                (priceOverrides.asKnown()?.size ?: 0) +
                (removeAdjustments.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (removePrices.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (replaceAdjustments.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (replacePrices.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (startDate.asKnown() == null) 0 else 1) +
                (if (trialDurationDays.asKnown() == null) 0 else 1) +
                (usageCustomerIds.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                addAdjustments == other.addAdjustments &&
                addPrices == other.addPrices &&
                alignBillingWithSubscriptionStartDate ==
                    other.alignBillingWithSubscriptionStartDate &&
                autoCollection == other.autoCollection &&
                awsRegion == other.awsRegion &&
                billingCycleAnchorConfiguration == other.billingCycleAnchorConfiguration &&
                couponRedemptionCode == other.couponRedemptionCode &&
                creditsOverageRate == other.creditsOverageRate &&
                currency == other.currency &&
                customerId == other.customerId &&
                defaultInvoiceMemo == other.defaultInvoiceMemo &&
                endDate == other.endDate &&
                externalCustomerId == other.externalCustomerId &&
                externalMarketplace == other.externalMarketplace &&
                externalMarketplaceReportingId == other.externalMarketplaceReportingId &&
                externalPlanId == other.externalPlanId &&
                filter == other.filter &&
                initialPhaseOrder == other.initialPhaseOrder &&
                invoicingThreshold == other.invoicingThreshold &&
                metadata == other.metadata &&
                name == other.name &&
                netTerms == other.netTerms &&
                perCreditOverageAmount == other.perCreditOverageAmount &&
                planId == other.planId &&
                planVersionNumber == other.planVersionNumber &&
                priceOverrides == other.priceOverrides &&
                removeAdjustments == other.removeAdjustments &&
                removePrices == other.removePrices &&
                replaceAdjustments == other.replaceAdjustments &&
                replacePrices == other.replacePrices &&
                startDate == other.startDate &&
                trialDurationDays == other.trialDurationDays &&
                usageCustomerIds == other.usageCustomerIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addAdjustments,
                addPrices,
                alignBillingWithSubscriptionStartDate,
                autoCollection,
                awsRegion,
                billingCycleAnchorConfiguration,
                couponRedemptionCode,
                creditsOverageRate,
                currency,
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
                name,
                netTerms,
                perCreditOverageAmount,
                planId,
                planVersionNumber,
                priceOverrides,
                removeAdjustments,
                removePrices,
                replaceAdjustments,
                replacePrices,
                startDate,
                trialDurationDays,
                usageCustomerIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{addAdjustments=$addAdjustments, addPrices=$addPrices, alignBillingWithSubscriptionStartDate=$alignBillingWithSubscriptionStartDate, autoCollection=$autoCollection, awsRegion=$awsRegion, billingCycleAnchorConfiguration=$billingCycleAnchorConfiguration, couponRedemptionCode=$couponRedemptionCode, creditsOverageRate=$creditsOverageRate, currency=$currency, customerId=$customerId, defaultInvoiceMemo=$defaultInvoiceMemo, endDate=$endDate, externalCustomerId=$externalCustomerId, externalMarketplace=$externalMarketplace, externalMarketplaceReportingId=$externalMarketplaceReportingId, externalPlanId=$externalPlanId, filter=$filter, initialPhaseOrder=$initialPhaseOrder, invoicingThreshold=$invoicingThreshold, metadata=$metadata, name=$name, netTerms=$netTerms, perCreditOverageAmount=$perCreditOverageAmount, planId=$planId, planVersionNumber=$planVersionNumber, priceOverrides=$priceOverrides, removeAdjustments=$removeAdjustments, removePrices=$removePrices, replaceAdjustments=$replaceAdjustments, replacePrices=$replacePrices, startDate=$startDate, trialDurationDays=$trialDurationDays, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
    }

    class AddAdjustment
    private constructor(
        private val adjustment: JsonField<Adjustment>,
        private val endDate: JsonField<OffsetDateTime>,
        private val planPhaseOrder: JsonField<Long>,
        private val startDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("adjustment")
            @ExcludeMissing
            adjustment: JsonField<Adjustment> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            planPhaseOrder: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(adjustment, endDate, planPhaseOrder, startDate, mutableMapOf())

        /**
         * The definition of a new adjustment to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustment(): Adjustment = adjustment.getRequired("adjustment")

        /**
         * The end date of the adjustment interval. This is the date that the adjustment will stop
         * affecting prices on the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        /**
         * The phase to add this adjustment to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        /**
         * The start date of the adjustment interval. This is the date that the adjustment will
         * start affecting prices on the subscription. If null, the adjustment will start when the
         * phase or subscription starts.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime? = startDate.getNullable("start_date")

        /**
         * Returns the raw JSON value of [adjustment].
         *
         * Unlike [adjustment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("adjustment")
        @ExcludeMissing
        fun _adjustment(): JsonField<Adjustment> = adjustment

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [planPhaseOrder].
         *
         * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

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
             * Returns a mutable builder for constructing an instance of [AddAdjustment].
             *
             * The following fields are required:
             * ```kotlin
             * .adjustment()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AddAdjustment]. */
        class Builder internal constructor() {

            private var adjustment: JsonField<Adjustment>? = null
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addAdjustment: AddAdjustment) = apply {
                adjustment = addAdjustment.adjustment
                endDate = addAdjustment.endDate
                planPhaseOrder = addAdjustment.planPhaseOrder
                startDate = addAdjustment.startDate
                additionalProperties = addAdjustment.additionalProperties.toMutableMap()
            }

            /** The definition of a new adjustment to create and add to the subscription. */
            fun adjustment(adjustment: Adjustment) = adjustment(JsonField.of(adjustment))

            /**
             * Sets [Builder.adjustment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustment] with a well-typed [Adjustment] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adjustment(adjustment: JsonField<Adjustment>) = apply {
                this.adjustment = adjustment
            }

            /**
             * Alias for calling [adjustment] with
             * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
             */
            fun adjustment(percentageDiscount: NewPercentageDiscount) =
                adjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewPercentageDiscount.builder()
             *     .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
             *     .percentageDiscount(percentageDiscount)
             *     .build()
             * ```
             */
            fun percentageDiscountAdjustment(percentageDiscount: Double) =
                adjustment(
                    NewPercentageDiscount.builder()
                        .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
                        .percentageDiscount(percentageDiscount)
                        .build()
                )

            /** Alias for calling [adjustment] with `Adjustment.ofUsageDiscount(usageDiscount)`. */
            fun adjustment(usageDiscount: NewUsageDiscount) =
                adjustment(Adjustment.ofUsageDiscount(usageDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewUsageDiscount.builder()
             *     .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
             *     .usageDiscount(usageDiscount)
             *     .build()
             * ```
             */
            fun usageDiscountAdjustment(usageDiscount: Double) =
                adjustment(
                    NewUsageDiscount.builder()
                        .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
                        .usageDiscount(usageDiscount)
                        .build()
                )

            /**
             * Alias for calling [adjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`.
             */
            fun adjustment(amountDiscount: NewAmountDiscount) =
                adjustment(Adjustment.ofAmountDiscount(amountDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewAmountDiscount.builder()
             *     .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
             *     .amountDiscount(amountDiscount)
             *     .build()
             * ```
             */
            fun amountDiscountAdjustment(amountDiscount: String) =
                adjustment(
                    NewAmountDiscount.builder()
                        .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
                        .amountDiscount(amountDiscount)
                        .build()
                )

            /** Alias for calling [adjustment] with `Adjustment.ofMinimum(minimum)`. */
            fun adjustment(minimum: NewMinimum) = adjustment(Adjustment.ofMinimum(minimum))

            /** Alias for calling [adjustment] with `Adjustment.ofMaximum(maximum)`. */
            fun adjustment(maximum: NewMaximum) = adjustment(Adjustment.ofMaximum(maximum))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewMaximum.builder()
             *     .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
             *     .maximumAmount(maximumAmount)
             *     .build()
             * ```
             */
            fun maximumAdjustment(maximumAmount: String) =
                adjustment(
                    NewMaximum.builder()
                        .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
                        .maximumAmount(maximumAmount)
                        .build()
                )

            /**
             * The end date of the adjustment interval. This is the date that the adjustment will
             * stop affecting prices on the subscription.
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

            /** The phase to add this adjustment to. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /**
             * Alias for [Builder.planPhaseOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /**
             * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            /**
             * The start date of the adjustment interval. This is the date that the adjustment will
             * start affecting prices on the subscription. If null, the adjustment will start when
             * the phase or subscription starts.
             */
            fun startDate(startDate: OffsetDateTime?) = startDate(JsonField.ofNullable(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
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
             * Returns an immutable instance of [AddAdjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .adjustment()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AddAdjustment =
                AddAdjustment(
                    checkRequired("adjustment", adjustment),
                    endDate,
                    planPhaseOrder,
                    startDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AddAdjustment = apply {
            if (validated) {
                return@apply
            }

            adjustment().validate()
            endDate()
            planPhaseOrder()
            startDate()
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
            (adjustment.asKnown()?.validity() ?: 0) +
                (if (endDate.asKnown() == null) 0 else 1) +
                (if (planPhaseOrder.asKnown() == null) 0 else 1) +
                (if (startDate.asKnown() == null) 0 else 1)

        /** The definition of a new adjustment to create and add to the subscription. */
        @JsonDeserialize(using = Adjustment.Deserializer::class)
        @JsonSerialize(using = Adjustment.Serializer::class)
        class Adjustment
        private constructor(
            private val percentageDiscount: NewPercentageDiscount? = null,
            private val usageDiscount: NewUsageDiscount? = null,
            private val amountDiscount: NewAmountDiscount? = null,
            private val minimum: NewMinimum? = null,
            private val maximum: NewMaximum? = null,
            private val _json: JsonValue? = null,
        ) {

            fun percentageDiscount(): NewPercentageDiscount? = percentageDiscount

            fun usageDiscount(): NewUsageDiscount? = usageDiscount

            fun amountDiscount(): NewAmountDiscount? = amountDiscount

            fun minimum(): NewMinimum? = minimum

            fun maximum(): NewMaximum? = maximum

            fun isPercentageDiscount(): Boolean = percentageDiscount != null

            fun isUsageDiscount(): Boolean = usageDiscount != null

            fun isAmountDiscount(): Boolean = amountDiscount != null

            fun isMinimum(): Boolean = minimum != null

            fun isMaximum(): Boolean = maximum != null

            fun asPercentageDiscount(): NewPercentageDiscount =
                percentageDiscount.getOrThrow("percentageDiscount")

            fun asUsageDiscount(): NewUsageDiscount = usageDiscount.getOrThrow("usageDiscount")

            fun asAmountDiscount(): NewAmountDiscount = amountDiscount.getOrThrow("amountDiscount")

            fun asMinimum(): NewMinimum = minimum.getOrThrow("minimum")

            fun asMaximum(): NewMaximum = maximum.getOrThrow("maximum")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    percentageDiscount != null ->
                        visitor.visitPercentageDiscount(percentageDiscount)
                    usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                    amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
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
                        override fun visitPercentageDiscount(
                            percentageDiscount: NewPercentageDiscount
                        ) {
                            percentageDiscount.validate()
                        }

                        override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) {
                            usageDiscount.validate()
                        }

                        override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) {
                            amountDiscount.validate()
                        }

                        override fun visitMinimum(minimum: NewMinimum) {
                            minimum.validate()
                        }

                        override fun visitMaximum(maximum: NewMaximum) {
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
                        override fun visitPercentageDiscount(
                            percentageDiscount: NewPercentageDiscount
                        ) = percentageDiscount.validity()

                        override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) =
                            usageDiscount.validity()

                        override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) =
                            amountDiscount.validity()

                        override fun visitMinimum(minimum: NewMinimum) = minimum.validity()

                        override fun visitMaximum(maximum: NewMaximum) = maximum.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Adjustment &&
                    percentageDiscount == other.percentageDiscount &&
                    usageDiscount == other.usageDiscount &&
                    amountDiscount == other.amountDiscount &&
                    minimum == other.minimum &&
                    maximum == other.maximum
            }

            override fun hashCode(): Int =
                Objects.hash(percentageDiscount, usageDiscount, amountDiscount, minimum, maximum)

            override fun toString(): String =
                when {
                    percentageDiscount != null ->
                        "Adjustment{percentageDiscount=$percentageDiscount}"
                    usageDiscount != null -> "Adjustment{usageDiscount=$usageDiscount}"
                    amountDiscount != null -> "Adjustment{amountDiscount=$amountDiscount}"
                    minimum != null -> "Adjustment{minimum=$minimum}"
                    maximum != null -> "Adjustment{maximum=$maximum}"
                    _json != null -> "Adjustment{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Adjustment")
                }

            companion object {

                fun ofPercentageDiscount(percentageDiscount: NewPercentageDiscount) =
                    Adjustment(percentageDiscount = percentageDiscount)

                fun ofUsageDiscount(usageDiscount: NewUsageDiscount) =
                    Adjustment(usageDiscount = usageDiscount)

                fun ofAmountDiscount(amountDiscount: NewAmountDiscount) =
                    Adjustment(amountDiscount = amountDiscount)

                fun ofMinimum(minimum: NewMinimum) = Adjustment(minimum = minimum)

                fun ofMaximum(maximum: NewMaximum) = Adjustment(maximum = maximum)
            }

            /**
             * An interface that defines how to map each variant of [Adjustment] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitPercentageDiscount(percentageDiscount: NewPercentageDiscount): T

                fun visitUsageDiscount(usageDiscount: NewUsageDiscount): T

                fun visitAmountDiscount(amountDiscount: NewAmountDiscount): T

                fun visitMinimum(minimum: NewMinimum): T

                fun visitMaximum(maximum: NewMaximum): T

                /**
                 * Maps an unknown variant of [Adjustment] to a value of type [T].
                 *
                 * An instance of [Adjustment] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
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
                        "percentage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPercentageDiscount>())
                                ?.let { Adjustment(percentageDiscount = it, _json = json) }
                                ?: Adjustment(_json = json)
                        }
                        "usage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewUsageDiscount>())?.let {
                                Adjustment(usageDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "amount_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewAmountDiscount>())?.let {
                                Adjustment(amountDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "minimum" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewMinimum>())?.let {
                                Adjustment(minimum = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "maximum" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewMaximum>())?.let {
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
                        value.percentageDiscount != null ->
                            generator.writeObject(value.percentageDiscount)
                        value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                        value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                        value.minimum != null -> generator.writeObject(value.minimum)
                        value.maximum != null -> generator.writeObject(value.maximum)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Adjustment")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AddAdjustment &&
                adjustment == other.adjustment &&
                endDate == other.endDate &&
                planPhaseOrder == other.planPhaseOrder &&
                startDate == other.startDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(adjustment, endDate, planPhaseOrder, startDate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddAdjustment{adjustment=$adjustment, endDate=$endDate, planPhaseOrder=$planPhaseOrder, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    class AddPrice
    private constructor(
        private val allocationPrice: JsonField<NewAllocationPrice>,
        private val discounts: JsonField<List<DiscountOverride>>,
        private val endDate: JsonField<OffsetDateTime>,
        private val externalPriceId: JsonField<String>,
        private val maximumAmount: JsonField<String>,
        private val minimumAmount: JsonField<String>,
        private val planPhaseOrder: JsonField<Long>,
        private val price: JsonField<Price>,
        private val priceId: JsonField<String>,
        private val startDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allocation_price")
            @ExcludeMissing
            allocationPrice: JsonField<NewAllocationPrice> = JsonMissing.of(),
            @JsonProperty("discounts")
            @ExcludeMissing
            discounts: JsonField<List<DiscountOverride>> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("external_price_id")
            @ExcludeMissing
            externalPriceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            maximumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            minimumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            planPhaseOrder: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
            @JsonProperty("price_id") @ExcludeMissing priceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            allocationPrice,
            discounts,
            endDate,
            externalPriceId,
            maximumAmount,
            minimumAmount,
            planPhaseOrder,
            price,
            priceId,
            startDate,
            mutableMapOf(),
        )

        /**
         * The definition of a new allocation price to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allocationPrice(): NewAllocationPrice? = allocationPrice.getNullable("allocation_price")

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for this price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun discounts(): List<DiscountOverride>? = discounts.getNullable("discounts")

        /**
         * The end date of the price interval. This is the date that the price will stop billing on
         * the subscription. If null, billing will end when the phase or subscription ends.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        /**
         * The external price id of the price to add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for this
         * price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for this
         * price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        /**
         * The phase to add this price to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

        /**
         * The definition of a new price to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun price(): Price? = price.getNullable("price")

        /**
         * The id of the price to add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceId(): String? = priceId.getNullable("price_id")

        /**
         * The start date of the price interval. This is the date that the price will start billing
         * on the subscription. If null, billing will start when the phase or subscription starts.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime? = startDate.getNullable("start_date")

        /**
         * Returns the raw JSON value of [allocationPrice].
         *
         * Unlike [allocationPrice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allocation_price")
        @ExcludeMissing
        fun _allocationPrice(): JsonField<NewAllocationPrice> = allocationPrice

        /**
         * Returns the raw JSON value of [discounts].
         *
         * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("discounts")
        @ExcludeMissing
        fun _discounts(): JsonField<List<DiscountOverride>> = discounts

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [externalPriceId].
         *
         * Unlike [externalPriceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_price_id")
        @ExcludeMissing
        fun _externalPriceId(): JsonField<String> = externalPriceId

        /**
         * Returns the raw JSON value of [maximumAmount].
         *
         * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        /**
         * Returns the raw JSON value of [minimumAmount].
         *
         * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        /**
         * Returns the raw JSON value of [planPhaseOrder].
         *
         * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

        /**
         * Returns the raw JSON value of [priceId].
         *
         * Unlike [priceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

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

            /** Returns a mutable builder for constructing an instance of [AddPrice]. */
            fun builder() = Builder()
        }

        /** A builder for [AddPrice]. */
        class Builder internal constructor() {

            private var allocationPrice: JsonField<NewAllocationPrice> = JsonMissing.of()
            private var discounts: JsonField<MutableList<DiscountOverride>>? = null
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var price: JsonField<Price> = JsonMissing.of()
            private var priceId: JsonField<String> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addPrice: AddPrice) = apply {
                allocationPrice = addPrice.allocationPrice
                discounts = addPrice.discounts.map { it.toMutableList() }
                endDate = addPrice.endDate
                externalPriceId = addPrice.externalPriceId
                maximumAmount = addPrice.maximumAmount
                minimumAmount = addPrice.minimumAmount
                planPhaseOrder = addPrice.planPhaseOrder
                price = addPrice.price
                priceId = addPrice.priceId
                startDate = addPrice.startDate
                additionalProperties = addPrice.additionalProperties.toMutableMap()
            }

            /** The definition of a new allocation price to create and add to the subscription. */
            fun allocationPrice(allocationPrice: NewAllocationPrice?) =
                allocationPrice(JsonField.ofNullable(allocationPrice))

            /**
             * Sets [Builder.allocationPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocationPrice] with a well-typed
             * [NewAllocationPrice] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun allocationPrice(allocationPrice: JsonField<NewAllocationPrice>) = apply {
                this.allocationPrice = allocationPrice
            }

            /**
             * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for this
             * price.
             */
            @Deprecated("deprecated")
            fun discounts(discounts: List<DiscountOverride>?) =
                discounts(JsonField.ofNullable(discounts))

            /**
             * Sets [Builder.discounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discounts] with a well-typed
             * `List<DiscountOverride>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            @Deprecated("deprecated")
            fun discounts(discounts: JsonField<List<DiscountOverride>>) = apply {
                this.discounts = discounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [DiscountOverride] to [discounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            @Deprecated("deprecated")
            fun addDiscount(discount: DiscountOverride) = apply {
                discounts =
                    (discounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("discounts", it).add(discount)
                    }
            }

            /**
             * The end date of the price interval. This is the date that the price will stop billing
             * on the subscription. If null, billing will end when the phase or subscription ends.
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

            /** The external price id of the price to add to the subscription. */
            fun externalPriceId(externalPriceId: String?) =
                externalPriceId(JsonField.ofNullable(externalPriceId))

            /**
             * Sets [Builder.externalPriceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPriceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.maximumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.minimumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            /** The phase to add this price to. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /**
             * Alias for [Builder.planPhaseOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /**
             * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            /** The definition of a new price to create and add to the subscription. */
            fun price(price: Price?) = price(JsonField.ofNullable(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Price] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /** Alias for calling [price] with `Price.ofUnit(unit)`. */
            fun price(unit: NewSubscriptionUnitPrice) = price(Price.ofUnit(unit))

            /** Alias for calling [price] with `Price.ofPackage(package_)`. */
            fun price(package_: NewSubscriptionPackagePrice) = price(Price.ofPackage(package_))

            /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
            fun price(matrix: NewSubscriptionMatrixPrice) = price(Price.ofMatrix(matrix))

            /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
            fun price(tiered: NewSubscriptionTieredPrice) = price(Price.ofTiered(tiered))

            /** Alias for calling [price] with `Price.ofTieredBps(tieredBps)`. */
            fun price(tieredBps: NewSubscriptionTieredBpsPrice) =
                price(Price.ofTieredBps(tieredBps))

            /** Alias for calling [price] with `Price.ofBps(bps)`. */
            fun price(bps: NewSubscriptionBpsPrice) = price(Price.ofBps(bps))

            /** Alias for calling [price] with `Price.ofBulkBps(bulkBps)`. */
            fun price(bulkBps: NewSubscriptionBulkBpsPrice) = price(Price.ofBulkBps(bulkBps))

            /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
            fun price(bulk: NewSubscriptionBulkPrice) = price(Price.ofBulk(bulk))

            /**
             * Alias for calling [price] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
             */
            fun price(thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice) =
                price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

            /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
            fun price(tieredPackage: NewSubscriptionTieredPackagePrice) =
                price(Price.ofTieredPackage(tieredPackage))

            /** Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
            fun price(tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice) =
                price(Price.ofTieredWithMinimum(tieredWithMinimum))

            /** Alias for calling [price] with `Price.ofUnitWithPercent(unitWithPercent)`. */
            fun price(unitWithPercent: NewSubscriptionUnitWithPercentPrice) =
                price(Price.ofUnitWithPercent(unitWithPercent))

            /**
             * Alias for calling [price] with
             * `Price.ofPackageWithAllocation(packageWithAllocation)`.
             */
            fun price(packageWithAllocation: NewSubscriptionPackageWithAllocationPrice) =
                price(Price.ofPackageWithAllocation(packageWithAllocation))

            /**
             * Alias for calling [price] with `Price.ofTieredWithProration(tieredWithProration)`.
             */
            fun price(tieredWithProration: NewSubscriptionTierWithProrationPrice) =
                price(Price.ofTieredWithProration(tieredWithProration))

            /** Alias for calling [price] with `Price.ofUnitWithProration(unitWithProration)`. */
            fun price(unitWithProration: NewSubscriptionUnitWithProrationPrice) =
                price(Price.ofUnitWithProration(unitWithProration))

            /** Alias for calling [price] with `Price.ofGroupedAllocation(groupedAllocation)`. */
            fun price(groupedAllocation: NewSubscriptionGroupedAllocationPrice) =
                price(Price.ofGroupedAllocation(groupedAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
             */
            fun price(groupedWithProratedMinimum: NewSubscriptionGroupedWithProratedMinimumPrice) =
                price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

            /** Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`. */
            fun price(bulkWithProration: NewSubscriptionBulkWithProrationPrice) =
                price(Price.ofBulkWithProration(bulkWithProration))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
             */
            fun price(
                scalableMatrixWithUnitPricing: NewSubscriptionScalableMatrixWithUnitPricingPrice
            ) = price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
             */
            fun price(
                scalableMatrixWithTieredPricing: NewSubscriptionScalableMatrixWithTieredPricingPrice
            ) = price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
             */
            fun price(cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice) =
                price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

            /**
             * Alias for calling [price] with
             * `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
             */
            fun price(maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice) =
                price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
             */
            fun price(groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice) =
                price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
             */
            fun price(matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice) =
                price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

            /**
             * Alias for calling [price] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
             */
            fun price(groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice) =
                price(Price.ofGroupedTieredPackage(groupedTieredPackage))

            /**
             * Alias for calling [price] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
             */
            fun price(matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice) =
                price(Price.ofMatrixWithAllocation(matrixWithAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
             */
            fun price(tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice) =
                price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

            /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
            fun price(groupedTiered: NewSubscriptionGroupedTieredPrice) =
                price(Price.ofGroupedTiered(groupedTiered))

            /** The id of the price to add to the subscription. */
            fun priceId(priceId: String?) = priceId(JsonField.ofNullable(priceId))

            /**
             * Sets [Builder.priceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            /**
             * The start date of the price interval. This is the date that the price will start
             * billing on the subscription. If null, billing will start when the phase or
             * subscription starts.
             */
            fun startDate(startDate: OffsetDateTime?) = startDate(JsonField.ofNullable(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
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
             * Returns an immutable instance of [AddPrice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AddPrice =
                AddPrice(
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
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AddPrice = apply {
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
            (allocationPrice.asKnown()?.validity() ?: 0) +
                (discounts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (endDate.asKnown() == null) 0 else 1) +
                (if (externalPriceId.asKnown() == null) 0 else 1) +
                (if (maximumAmount.asKnown() == null) 0 else 1) +
                (if (minimumAmount.asKnown() == null) 0 else 1) +
                (if (planPhaseOrder.asKnown() == null) 0 else 1) +
                (price.asKnown()?.validity() ?: 0) +
                (if (priceId.asKnown() == null) 0 else 1) +
                (if (startDate.asKnown() == null) 0 else 1)

        /** The definition of a new price to create and add to the subscription. */
        @JsonDeserialize(using = Price.Deserializer::class)
        @JsonSerialize(using = Price.Serializer::class)
        class Price
        private constructor(
            private val unit: NewSubscriptionUnitPrice? = null,
            private val package_: NewSubscriptionPackagePrice? = null,
            private val matrix: NewSubscriptionMatrixPrice? = null,
            private val tiered: NewSubscriptionTieredPrice? = null,
            private val tieredBps: NewSubscriptionTieredBpsPrice? = null,
            private val bps: NewSubscriptionBpsPrice? = null,
            private val bulkBps: NewSubscriptionBulkBpsPrice? = null,
            private val bulk: NewSubscriptionBulkPrice? = null,
            private val thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice? = null,
            private val tieredPackage: NewSubscriptionTieredPackagePrice? = null,
            private val tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice? = null,
            private val unitWithPercent: NewSubscriptionUnitWithPercentPrice? = null,
            private val packageWithAllocation: NewSubscriptionPackageWithAllocationPrice? = null,
            private val tieredWithProration: NewSubscriptionTierWithProrationPrice? = null,
            private val unitWithProration: NewSubscriptionUnitWithProrationPrice? = null,
            private val groupedAllocation: NewSubscriptionGroupedAllocationPrice? = null,
            private val groupedWithProratedMinimum:
                NewSubscriptionGroupedWithProratedMinimumPrice? =
                null,
            private val bulkWithProration: NewSubscriptionBulkWithProrationPrice? = null,
            private val scalableMatrixWithUnitPricing:
                NewSubscriptionScalableMatrixWithUnitPricingPrice? =
                null,
            private val scalableMatrixWithTieredPricing:
                NewSubscriptionScalableMatrixWithTieredPricingPrice? =
                null,
            private val cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice? = null,
            private val maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice? = null,
            private val groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice? =
                null,
            private val matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice? = null,
            private val groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice? = null,
            private val matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice? = null,
            private val tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice? =
                null,
            private val groupedTiered: NewSubscriptionGroupedTieredPrice? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unit(): NewSubscriptionUnitPrice? = unit

            fun package_(): NewSubscriptionPackagePrice? = package_

            fun matrix(): NewSubscriptionMatrixPrice? = matrix

            fun tiered(): NewSubscriptionTieredPrice? = tiered

            fun tieredBps(): NewSubscriptionTieredBpsPrice? = tieredBps

            fun bps(): NewSubscriptionBpsPrice? = bps

            fun bulkBps(): NewSubscriptionBulkBpsPrice? = bulkBps

            fun bulk(): NewSubscriptionBulkPrice? = bulk

            fun thresholdTotalAmount(): NewSubscriptionThresholdTotalAmountPrice? =
                thresholdTotalAmount

            fun tieredPackage(): NewSubscriptionTieredPackagePrice? = tieredPackage

            fun tieredWithMinimum(): NewSubscriptionTieredWithMinimumPrice? = tieredWithMinimum

            fun unitWithPercent(): NewSubscriptionUnitWithPercentPrice? = unitWithPercent

            fun packageWithAllocation(): NewSubscriptionPackageWithAllocationPrice? =
                packageWithAllocation

            fun tieredWithProration(): NewSubscriptionTierWithProrationPrice? = tieredWithProration

            fun unitWithProration(): NewSubscriptionUnitWithProrationPrice? = unitWithProration

            fun groupedAllocation(): NewSubscriptionGroupedAllocationPrice? = groupedAllocation

            fun groupedWithProratedMinimum(): NewSubscriptionGroupedWithProratedMinimumPrice? =
                groupedWithProratedMinimum

            fun bulkWithProration(): NewSubscriptionBulkWithProrationPrice? = bulkWithProration

            fun scalableMatrixWithUnitPricing():
                NewSubscriptionScalableMatrixWithUnitPricingPrice? = scalableMatrixWithUnitPricing

            fun scalableMatrixWithTieredPricing():
                NewSubscriptionScalableMatrixWithTieredPricingPrice? =
                scalableMatrixWithTieredPricing

            fun cumulativeGroupedBulk(): NewSubscriptionCumulativeGroupedBulkPrice? =
                cumulativeGroupedBulk

            fun maxGroupTieredPackage(): NewSubscriptionMaxGroupTieredPackagePrice? =
                maxGroupTieredPackage

            fun groupedWithMeteredMinimum(): NewSubscriptionGroupedWithMeteredMinimumPrice? =
                groupedWithMeteredMinimum

            fun matrixWithDisplayName(): NewSubscriptionMatrixWithDisplayNamePrice? =
                matrixWithDisplayName

            fun groupedTieredPackage(): NewSubscriptionGroupedTieredPackagePrice? =
                groupedTieredPackage

            fun matrixWithAllocation(): NewSubscriptionMatrixWithAllocationPrice? =
                matrixWithAllocation

            fun tieredPackageWithMinimum(): NewSubscriptionTieredPackageWithMinimumPrice? =
                tieredPackageWithMinimum

            fun groupedTiered(): NewSubscriptionGroupedTieredPrice? = groupedTiered

            fun isUnit(): Boolean = unit != null

            fun isPackage(): Boolean = package_ != null

            fun isMatrix(): Boolean = matrix != null

            fun isTiered(): Boolean = tiered != null

            fun isTieredBps(): Boolean = tieredBps != null

            fun isBps(): Boolean = bps != null

            fun isBulkBps(): Boolean = bulkBps != null

            fun isBulk(): Boolean = bulk != null

            fun isThresholdTotalAmount(): Boolean = thresholdTotalAmount != null

            fun isTieredPackage(): Boolean = tieredPackage != null

            fun isTieredWithMinimum(): Boolean = tieredWithMinimum != null

            fun isUnitWithPercent(): Boolean = unitWithPercent != null

            fun isPackageWithAllocation(): Boolean = packageWithAllocation != null

            fun isTieredWithProration(): Boolean = tieredWithProration != null

            fun isUnitWithProration(): Boolean = unitWithProration != null

            fun isGroupedAllocation(): Boolean = groupedAllocation != null

            fun isGroupedWithProratedMinimum(): Boolean = groupedWithProratedMinimum != null

            fun isBulkWithProration(): Boolean = bulkWithProration != null

            fun isScalableMatrixWithUnitPricing(): Boolean = scalableMatrixWithUnitPricing != null

            fun isScalableMatrixWithTieredPricing(): Boolean =
                scalableMatrixWithTieredPricing != null

            fun isCumulativeGroupedBulk(): Boolean = cumulativeGroupedBulk != null

            fun isMaxGroupTieredPackage(): Boolean = maxGroupTieredPackage != null

            fun isGroupedWithMeteredMinimum(): Boolean = groupedWithMeteredMinimum != null

            fun isMatrixWithDisplayName(): Boolean = matrixWithDisplayName != null

            fun isGroupedTieredPackage(): Boolean = groupedTieredPackage != null

            fun isMatrixWithAllocation(): Boolean = matrixWithAllocation != null

            fun isTieredPackageWithMinimum(): Boolean = tieredPackageWithMinimum != null

            fun isGroupedTiered(): Boolean = groupedTiered != null

            fun asUnit(): NewSubscriptionUnitPrice = unit.getOrThrow("unit")

            fun asPackage(): NewSubscriptionPackagePrice = package_.getOrThrow("package_")

            fun asMatrix(): NewSubscriptionMatrixPrice = matrix.getOrThrow("matrix")

            fun asTiered(): NewSubscriptionTieredPrice = tiered.getOrThrow("tiered")

            fun asTieredBps(): NewSubscriptionTieredBpsPrice = tieredBps.getOrThrow("tieredBps")

            fun asBps(): NewSubscriptionBpsPrice = bps.getOrThrow("bps")

            fun asBulkBps(): NewSubscriptionBulkBpsPrice = bulkBps.getOrThrow("bulkBps")

            fun asBulk(): NewSubscriptionBulkPrice = bulk.getOrThrow("bulk")

            fun asThresholdTotalAmount(): NewSubscriptionThresholdTotalAmountPrice =
                thresholdTotalAmount.getOrThrow("thresholdTotalAmount")

            fun asTieredPackage(): NewSubscriptionTieredPackagePrice =
                tieredPackage.getOrThrow("tieredPackage")

            fun asTieredWithMinimum(): NewSubscriptionTieredWithMinimumPrice =
                tieredWithMinimum.getOrThrow("tieredWithMinimum")

            fun asUnitWithPercent(): NewSubscriptionUnitWithPercentPrice =
                unitWithPercent.getOrThrow("unitWithPercent")

            fun asPackageWithAllocation(): NewSubscriptionPackageWithAllocationPrice =
                packageWithAllocation.getOrThrow("packageWithAllocation")

            fun asTieredWithProration(): NewSubscriptionTierWithProrationPrice =
                tieredWithProration.getOrThrow("tieredWithProration")

            fun asUnitWithProration(): NewSubscriptionUnitWithProrationPrice =
                unitWithProration.getOrThrow("unitWithProration")

            fun asGroupedAllocation(): NewSubscriptionGroupedAllocationPrice =
                groupedAllocation.getOrThrow("groupedAllocation")

            fun asGroupedWithProratedMinimum(): NewSubscriptionGroupedWithProratedMinimumPrice =
                groupedWithProratedMinimum.getOrThrow("groupedWithProratedMinimum")

            fun asBulkWithProration(): NewSubscriptionBulkWithProrationPrice =
                bulkWithProration.getOrThrow("bulkWithProration")

            fun asScalableMatrixWithUnitPricing():
                NewSubscriptionScalableMatrixWithUnitPricingPrice =
                scalableMatrixWithUnitPricing.getOrThrow("scalableMatrixWithUnitPricing")

            fun asScalableMatrixWithTieredPricing():
                NewSubscriptionScalableMatrixWithTieredPricingPrice =
                scalableMatrixWithTieredPricing.getOrThrow("scalableMatrixWithTieredPricing")

            fun asCumulativeGroupedBulk(): NewSubscriptionCumulativeGroupedBulkPrice =
                cumulativeGroupedBulk.getOrThrow("cumulativeGroupedBulk")

            fun asMaxGroupTieredPackage(): NewSubscriptionMaxGroupTieredPackagePrice =
                maxGroupTieredPackage.getOrThrow("maxGroupTieredPackage")

            fun asGroupedWithMeteredMinimum(): NewSubscriptionGroupedWithMeteredMinimumPrice =
                groupedWithMeteredMinimum.getOrThrow("groupedWithMeteredMinimum")

            fun asMatrixWithDisplayName(): NewSubscriptionMatrixWithDisplayNamePrice =
                matrixWithDisplayName.getOrThrow("matrixWithDisplayName")

            fun asGroupedTieredPackage(): NewSubscriptionGroupedTieredPackagePrice =
                groupedTieredPackage.getOrThrow("groupedTieredPackage")

            fun asMatrixWithAllocation(): NewSubscriptionMatrixWithAllocationPrice =
                matrixWithAllocation.getOrThrow("matrixWithAllocation")

            fun asTieredPackageWithMinimum(): NewSubscriptionTieredPackageWithMinimumPrice =
                tieredPackageWithMinimum.getOrThrow("tieredPackageWithMinimum")

            fun asGroupedTiered(): NewSubscriptionGroupedTieredPrice =
                groupedTiered.getOrThrow("groupedTiered")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unit != null -> visitor.visitUnit(unit)
                    package_ != null -> visitor.visitPackage(package_)
                    matrix != null -> visitor.visitMatrix(matrix)
                    tiered != null -> visitor.visitTiered(tiered)
                    tieredBps != null -> visitor.visitTieredBps(tieredBps)
                    bps != null -> visitor.visitBps(bps)
                    bulkBps != null -> visitor.visitBulkBps(bulkBps)
                    bulk != null -> visitor.visitBulk(bulk)
                    thresholdTotalAmount != null ->
                        visitor.visitThresholdTotalAmount(thresholdTotalAmount)
                    tieredPackage != null -> visitor.visitTieredPackage(tieredPackage)
                    tieredWithMinimum != null -> visitor.visitTieredWithMinimum(tieredWithMinimum)
                    unitWithPercent != null -> visitor.visitUnitWithPercent(unitWithPercent)
                    packageWithAllocation != null ->
                        visitor.visitPackageWithAllocation(packageWithAllocation)
                    tieredWithProration != null ->
                        visitor.visitTieredWithProration(tieredWithProration)
                    unitWithProration != null -> visitor.visitUnitWithProration(unitWithProration)
                    groupedAllocation != null -> visitor.visitGroupedAllocation(groupedAllocation)
                    groupedWithProratedMinimum != null ->
                        visitor.visitGroupedWithProratedMinimum(groupedWithProratedMinimum)
                    bulkWithProration != null -> visitor.visitBulkWithProration(bulkWithProration)
                    scalableMatrixWithUnitPricing != null ->
                        visitor.visitScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)
                    scalableMatrixWithTieredPricing != null ->
                        visitor.visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing
                        )
                    cumulativeGroupedBulk != null ->
                        visitor.visitCumulativeGroupedBulk(cumulativeGroupedBulk)
                    maxGroupTieredPackage != null ->
                        visitor.visitMaxGroupTieredPackage(maxGroupTieredPackage)
                    groupedWithMeteredMinimum != null ->
                        visitor.visitGroupedWithMeteredMinimum(groupedWithMeteredMinimum)
                    matrixWithDisplayName != null ->
                        visitor.visitMatrixWithDisplayName(matrixWithDisplayName)
                    groupedTieredPackage != null ->
                        visitor.visitGroupedTieredPackage(groupedTieredPackage)
                    matrixWithAllocation != null ->
                        visitor.visitMatrixWithAllocation(matrixWithAllocation)
                    tieredPackageWithMinimum != null ->
                        visitor.visitTieredPackageWithMinimum(tieredPackageWithMinimum)
                    groupedTiered != null -> visitor.visitGroupedTiered(groupedTiered)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Price = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUnit(unit: NewSubscriptionUnitPrice) {
                            unit.validate()
                        }

                        override fun visitPackage(package_: NewSubscriptionPackagePrice) {
                            package_.validate()
                        }

                        override fun visitMatrix(matrix: NewSubscriptionMatrixPrice) {
                            matrix.validate()
                        }

                        override fun visitTiered(tiered: NewSubscriptionTieredPrice) {
                            tiered.validate()
                        }

                        override fun visitTieredBps(tieredBps: NewSubscriptionTieredBpsPrice) {
                            tieredBps.validate()
                        }

                        override fun visitBps(bps: NewSubscriptionBpsPrice) {
                            bps.validate()
                        }

                        override fun visitBulkBps(bulkBps: NewSubscriptionBulkBpsPrice) {
                            bulkBps.validate()
                        }

                        override fun visitBulk(bulk: NewSubscriptionBulkPrice) {
                            bulk.validate()
                        }

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                        ) {
                            thresholdTotalAmount.validate()
                        }

                        override fun visitTieredPackage(
                            tieredPackage: NewSubscriptionTieredPackagePrice
                        ) {
                            tieredPackage.validate()
                        }

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice
                        ) {
                            tieredWithMinimum.validate()
                        }

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewSubscriptionUnitWithPercentPrice
                        ) {
                            unitWithPercent.validate()
                        }

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                        ) {
                            packageWithAllocation.validate()
                        }

                        override fun visitTieredWithProration(
                            tieredWithProration: NewSubscriptionTierWithProrationPrice
                        ) {
                            tieredWithProration.validate()
                        }

                        override fun visitUnitWithProration(
                            unitWithProration: NewSubscriptionUnitWithProrationPrice
                        ) {
                            unitWithProration.validate()
                        }

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewSubscriptionGroupedAllocationPrice
                        ) {
                            groupedAllocation.validate()
                        }

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum:
                                NewSubscriptionGroupedWithProratedMinimumPrice
                        ) {
                            groupedWithProratedMinimum.validate()
                        }

                        override fun visitBulkWithProration(
                            bulkWithProration: NewSubscriptionBulkWithProrationPrice
                        ) {
                            bulkWithProration.validate()
                        }

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing:
                                NewSubscriptionScalableMatrixWithUnitPricingPrice
                        ) {
                            scalableMatrixWithUnitPricing.validate()
                        }

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewSubscriptionScalableMatrixWithTieredPricingPrice
                        ) {
                            scalableMatrixWithTieredPricing.validate()
                        }

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                        ) {
                            cumulativeGroupedBulk.validate()
                        }

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                        ) {
                            maxGroupTieredPackage.validate()
                        }

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                        ) {
                            groupedWithMeteredMinimum.validate()
                        }

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                        ) {
                            matrixWithDisplayName.validate()
                        }

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                        ) {
                            groupedTieredPackage.validate()
                        }

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                        ) {
                            matrixWithAllocation.validate()
                        }

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                        ) {
                            tieredPackageWithMinimum.validate()
                        }

                        override fun visitGroupedTiered(
                            groupedTiered: NewSubscriptionGroupedTieredPrice
                        ) {
                            groupedTiered.validate()
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
                        override fun visitUnit(unit: NewSubscriptionUnitPrice) = unit.validity()

                        override fun visitPackage(package_: NewSubscriptionPackagePrice) =
                            package_.validity()

                        override fun visitMatrix(matrix: NewSubscriptionMatrixPrice) =
                            matrix.validity()

                        override fun visitTiered(tiered: NewSubscriptionTieredPrice) =
                            tiered.validity()

                        override fun visitTieredBps(tieredBps: NewSubscriptionTieredBpsPrice) =
                            tieredBps.validity()

                        override fun visitBps(bps: NewSubscriptionBpsPrice) = bps.validity()

                        override fun visitBulkBps(bulkBps: NewSubscriptionBulkBpsPrice) =
                            bulkBps.validity()

                        override fun visitBulk(bulk: NewSubscriptionBulkPrice) = bulk.validity()

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                        ) = thresholdTotalAmount.validity()

                        override fun visitTieredPackage(
                            tieredPackage: NewSubscriptionTieredPackagePrice
                        ) = tieredPackage.validity()

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice
                        ) = tieredWithMinimum.validity()

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewSubscriptionUnitWithPercentPrice
                        ) = unitWithPercent.validity()

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                        ) = packageWithAllocation.validity()

                        override fun visitTieredWithProration(
                            tieredWithProration: NewSubscriptionTierWithProrationPrice
                        ) = tieredWithProration.validity()

                        override fun visitUnitWithProration(
                            unitWithProration: NewSubscriptionUnitWithProrationPrice
                        ) = unitWithProration.validity()

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewSubscriptionGroupedAllocationPrice
                        ) = groupedAllocation.validity()

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum:
                                NewSubscriptionGroupedWithProratedMinimumPrice
                        ) = groupedWithProratedMinimum.validity()

                        override fun visitBulkWithProration(
                            bulkWithProration: NewSubscriptionBulkWithProrationPrice
                        ) = bulkWithProration.validity()

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing:
                                NewSubscriptionScalableMatrixWithUnitPricingPrice
                        ) = scalableMatrixWithUnitPricing.validity()

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewSubscriptionScalableMatrixWithTieredPricingPrice
                        ) = scalableMatrixWithTieredPricing.validity()

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                        ) = cumulativeGroupedBulk.validity()

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                        ) = maxGroupTieredPackage.validity()

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                        ) = groupedWithMeteredMinimum.validity()

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                        ) = matrixWithDisplayName.validity()

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                        ) = groupedTieredPackage.validity()

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                        ) = matrixWithAllocation.validity()

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                        ) = tieredPackageWithMinimum.validity()

                        override fun visitGroupedTiered(
                            groupedTiered: NewSubscriptionGroupedTieredPrice
                        ) = groupedTiered.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Price &&
                    unit == other.unit &&
                    package_ == other.package_ &&
                    matrix == other.matrix &&
                    tiered == other.tiered &&
                    tieredBps == other.tieredBps &&
                    bps == other.bps &&
                    bulkBps == other.bulkBps &&
                    bulk == other.bulk &&
                    thresholdTotalAmount == other.thresholdTotalAmount &&
                    tieredPackage == other.tieredPackage &&
                    tieredWithMinimum == other.tieredWithMinimum &&
                    unitWithPercent == other.unitWithPercent &&
                    packageWithAllocation == other.packageWithAllocation &&
                    tieredWithProration == other.tieredWithProration &&
                    unitWithProration == other.unitWithProration &&
                    groupedAllocation == other.groupedAllocation &&
                    groupedWithProratedMinimum == other.groupedWithProratedMinimum &&
                    bulkWithProration == other.bulkWithProration &&
                    scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing &&
                    scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing &&
                    cumulativeGroupedBulk == other.cumulativeGroupedBulk &&
                    maxGroupTieredPackage == other.maxGroupTieredPackage &&
                    groupedWithMeteredMinimum == other.groupedWithMeteredMinimum &&
                    matrixWithDisplayName == other.matrixWithDisplayName &&
                    groupedTieredPackage == other.groupedTieredPackage &&
                    matrixWithAllocation == other.matrixWithAllocation &&
                    tieredPackageWithMinimum == other.tieredPackageWithMinimum &&
                    groupedTiered == other.groupedTiered
            }

            override fun hashCode(): Int =
                Objects.hash(
                    unit,
                    package_,
                    matrix,
                    tiered,
                    tieredBps,
                    bps,
                    bulkBps,
                    bulk,
                    thresholdTotalAmount,
                    tieredPackage,
                    tieredWithMinimum,
                    unitWithPercent,
                    packageWithAllocation,
                    tieredWithProration,
                    unitWithProration,
                    groupedAllocation,
                    groupedWithProratedMinimum,
                    bulkWithProration,
                    scalableMatrixWithUnitPricing,
                    scalableMatrixWithTieredPricing,
                    cumulativeGroupedBulk,
                    maxGroupTieredPackage,
                    groupedWithMeteredMinimum,
                    matrixWithDisplayName,
                    groupedTieredPackage,
                    matrixWithAllocation,
                    tieredPackageWithMinimum,
                    groupedTiered,
                )

            override fun toString(): String =
                when {
                    unit != null -> "Price{unit=$unit}"
                    package_ != null -> "Price{package_=$package_}"
                    matrix != null -> "Price{matrix=$matrix}"
                    tiered != null -> "Price{tiered=$tiered}"
                    tieredBps != null -> "Price{tieredBps=$tieredBps}"
                    bps != null -> "Price{bps=$bps}"
                    bulkBps != null -> "Price{bulkBps=$bulkBps}"
                    bulk != null -> "Price{bulk=$bulk}"
                    thresholdTotalAmount != null ->
                        "Price{thresholdTotalAmount=$thresholdTotalAmount}"
                    tieredPackage != null -> "Price{tieredPackage=$tieredPackage}"
                    tieredWithMinimum != null -> "Price{tieredWithMinimum=$tieredWithMinimum}"
                    unitWithPercent != null -> "Price{unitWithPercent=$unitWithPercent}"
                    packageWithAllocation != null ->
                        "Price{packageWithAllocation=$packageWithAllocation}"
                    tieredWithProration != null -> "Price{tieredWithProration=$tieredWithProration}"
                    unitWithProration != null -> "Price{unitWithProration=$unitWithProration}"
                    groupedAllocation != null -> "Price{groupedAllocation=$groupedAllocation}"
                    groupedWithProratedMinimum != null ->
                        "Price{groupedWithProratedMinimum=$groupedWithProratedMinimum}"
                    bulkWithProration != null -> "Price{bulkWithProration=$bulkWithProration}"
                    scalableMatrixWithUnitPricing != null ->
                        "Price{scalableMatrixWithUnitPricing=$scalableMatrixWithUnitPricing}"
                    scalableMatrixWithTieredPricing != null ->
                        "Price{scalableMatrixWithTieredPricing=$scalableMatrixWithTieredPricing}"
                    cumulativeGroupedBulk != null ->
                        "Price{cumulativeGroupedBulk=$cumulativeGroupedBulk}"
                    maxGroupTieredPackage != null ->
                        "Price{maxGroupTieredPackage=$maxGroupTieredPackage}"
                    groupedWithMeteredMinimum != null ->
                        "Price{groupedWithMeteredMinimum=$groupedWithMeteredMinimum}"
                    matrixWithDisplayName != null ->
                        "Price{matrixWithDisplayName=$matrixWithDisplayName}"
                    groupedTieredPackage != null ->
                        "Price{groupedTieredPackage=$groupedTieredPackage}"
                    matrixWithAllocation != null ->
                        "Price{matrixWithAllocation=$matrixWithAllocation}"
                    tieredPackageWithMinimum != null ->
                        "Price{tieredPackageWithMinimum=$tieredPackageWithMinimum}"
                    groupedTiered != null -> "Price{groupedTiered=$groupedTiered}"
                    _json != null -> "Price{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Price")
                }

            companion object {

                fun ofUnit(unit: NewSubscriptionUnitPrice) = Price(unit = unit)

                fun ofPackage(package_: NewSubscriptionPackagePrice) = Price(package_ = package_)

                fun ofMatrix(matrix: NewSubscriptionMatrixPrice) = Price(matrix = matrix)

                fun ofTiered(tiered: NewSubscriptionTieredPrice) = Price(tiered = tiered)

                fun ofTieredBps(tieredBps: NewSubscriptionTieredBpsPrice) =
                    Price(tieredBps = tieredBps)

                fun ofBps(bps: NewSubscriptionBpsPrice) = Price(bps = bps)

                fun ofBulkBps(bulkBps: NewSubscriptionBulkBpsPrice) = Price(bulkBps = bulkBps)

                fun ofBulk(bulk: NewSubscriptionBulkPrice) = Price(bulk = bulk)

                fun ofThresholdTotalAmount(
                    thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                ) = Price(thresholdTotalAmount = thresholdTotalAmount)

                fun ofTieredPackage(tieredPackage: NewSubscriptionTieredPackagePrice) =
                    Price(tieredPackage = tieredPackage)

                fun ofTieredWithMinimum(tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice) =
                    Price(tieredWithMinimum = tieredWithMinimum)

                fun ofUnitWithPercent(unitWithPercent: NewSubscriptionUnitWithPercentPrice) =
                    Price(unitWithPercent = unitWithPercent)

                fun ofPackageWithAllocation(
                    packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                ) = Price(packageWithAllocation = packageWithAllocation)

                fun ofTieredWithProration(
                    tieredWithProration: NewSubscriptionTierWithProrationPrice
                ) = Price(tieredWithProration = tieredWithProration)

                fun ofUnitWithProration(unitWithProration: NewSubscriptionUnitWithProrationPrice) =
                    Price(unitWithProration = unitWithProration)

                fun ofGroupedAllocation(groupedAllocation: NewSubscriptionGroupedAllocationPrice) =
                    Price(groupedAllocation = groupedAllocation)

                fun ofGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewSubscriptionGroupedWithProratedMinimumPrice
                ) = Price(groupedWithProratedMinimum = groupedWithProratedMinimum)

                fun ofBulkWithProration(bulkWithProration: NewSubscriptionBulkWithProrationPrice) =
                    Price(bulkWithProration = bulkWithProration)

                fun ofScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewSubscriptionScalableMatrixWithUnitPricingPrice
                ) = Price(scalableMatrixWithUnitPricing = scalableMatrixWithUnitPricing)

                fun ofScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing:
                        NewSubscriptionScalableMatrixWithTieredPricingPrice
                ) = Price(scalableMatrixWithTieredPricing = scalableMatrixWithTieredPricing)

                fun ofCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                ) = Price(cumulativeGroupedBulk = cumulativeGroupedBulk)

                fun ofMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                ) = Price(maxGroupTieredPackage = maxGroupTieredPackage)

                fun ofGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                ) = Price(groupedWithMeteredMinimum = groupedWithMeteredMinimum)

                fun ofMatrixWithDisplayName(
                    matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                ) = Price(matrixWithDisplayName = matrixWithDisplayName)

                fun ofGroupedTieredPackage(
                    groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                ) = Price(groupedTieredPackage = groupedTieredPackage)

                fun ofMatrixWithAllocation(
                    matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                ) = Price(matrixWithAllocation = matrixWithAllocation)

                fun ofTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                ) = Price(tieredPackageWithMinimum = tieredPackageWithMinimum)

                fun ofGroupedTiered(groupedTiered: NewSubscriptionGroupedTieredPrice) =
                    Price(groupedTiered = groupedTiered)
            }

            /**
             * An interface that defines how to map each variant of [Price] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitUnit(unit: NewSubscriptionUnitPrice): T

                fun visitPackage(package_: NewSubscriptionPackagePrice): T

                fun visitMatrix(matrix: NewSubscriptionMatrixPrice): T

                fun visitTiered(tiered: NewSubscriptionTieredPrice): T

                fun visitTieredBps(tieredBps: NewSubscriptionTieredBpsPrice): T

                fun visitBps(bps: NewSubscriptionBpsPrice): T

                fun visitBulkBps(bulkBps: NewSubscriptionBulkBpsPrice): T

                fun visitBulk(bulk: NewSubscriptionBulkPrice): T

                fun visitThresholdTotalAmount(
                    thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                ): T

                fun visitTieredPackage(tieredPackage: NewSubscriptionTieredPackagePrice): T

                fun visitTieredWithMinimum(
                    tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice
                ): T

                fun visitUnitWithPercent(unitWithPercent: NewSubscriptionUnitWithPercentPrice): T

                fun visitPackageWithAllocation(
                    packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                ): T

                fun visitTieredWithProration(
                    tieredWithProration: NewSubscriptionTierWithProrationPrice
                ): T

                fun visitUnitWithProration(
                    unitWithProration: NewSubscriptionUnitWithProrationPrice
                ): T

                fun visitGroupedAllocation(
                    groupedAllocation: NewSubscriptionGroupedAllocationPrice
                ): T

                fun visitGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewSubscriptionGroupedWithProratedMinimumPrice
                ): T

                fun visitBulkWithProration(
                    bulkWithProration: NewSubscriptionBulkWithProrationPrice
                ): T

                fun visitScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewSubscriptionScalableMatrixWithUnitPricingPrice
                ): T

                fun visitScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing:
                        NewSubscriptionScalableMatrixWithTieredPricingPrice
                ): T

                fun visitCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                ): T

                fun visitMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                ): T

                fun visitGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                ): T

                fun visitMatrixWithDisplayName(
                    matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                ): T

                fun visitGroupedTieredPackage(
                    groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                ): T

                fun visitMatrixWithAllocation(
                    matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                ): T

                fun visitTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                ): T

                fun visitGroupedTiered(groupedTiered: NewSubscriptionGroupedTieredPrice): T

                /**
                 * Maps an unknown variant of [Price] to a value of type [T].
                 *
                 * An instance of [Price] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Price: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Price>(Price::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Price {
                    val json = JsonValue.fromJsonNode(node)
                    val modelType = json.asObject()?.get("model_type")?.asString()

                    when (modelType) {
                        "unit" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewSubscriptionUnitPrice>())
                                ?.let { Price(unit = it, _json = json) } ?: Price(_json = json)
                        }
                        "package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionPackagePrice>(),
                                )
                                ?.let { Price(package_ = it, _json = json) } ?: Price(_json = json)
                        }
                        "matrix" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMatrixPrice>(),
                                )
                                ?.let { Price(matrix = it, _json = json) } ?: Price(_json = json)
                        }
                        "tiered" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredPrice>(),
                                )
                                ?.let { Price(tiered = it, _json = json) } ?: Price(_json = json)
                        }
                        "tiered_bps" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredBpsPrice>(),
                                )
                                ?.let { Price(tieredBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewSubscriptionBpsPrice>())
                                ?.let { Price(bps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk_bps" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionBulkBpsPrice>(),
                                )
                                ?.let { Price(bulkBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewSubscriptionBulkPrice>())
                                ?.let { Price(bulk = it, _json = json) } ?: Price(_json = json)
                        }
                        "threshold_total_amount" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionThresholdTotalAmountPrice>(),
                                )
                                ?.let { Price(thresholdTotalAmount = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredPackagePrice>(),
                                )
                                ?.let { Price(tieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_percent" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionUnitWithPercentPrice>(),
                                )
                                ?.let { Price(unitWithPercent = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "package_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionPackageWithAllocationPrice>(),
                                )
                                ?.let { Price(packageWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTierWithProrationPrice>(),
                                )
                                ?.let { Price(tieredWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionUnitWithProrationPrice>(),
                                )
                                ?.let { Price(unitWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedAllocationPrice>(),
                                )
                                ?.let { Price(groupedAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_prorated_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedWithProratedMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithProratedMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "bulk_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionBulkWithProrationPrice>(),
                                )
                                ?.let { Price(bulkWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_unit_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        NewSubscriptionScalableMatrixWithUnitPricingPrice
                                    >(),
                                )
                                ?.let { Price(scalableMatrixWithUnitPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_tiered_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        NewSubscriptionScalableMatrixWithTieredPricingPrice
                                    >(),
                                )
                                ?.let { Price(scalableMatrixWithTieredPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "cumulative_grouped_bulk" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionCumulativeGroupedBulkPrice>(),
                                )
                                ?.let { Price(cumulativeGroupedBulk = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "max_group_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMaxGroupTieredPackagePrice>(),
                                )
                                ?.let { Price(maxGroupTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_metered_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedWithMeteredMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithMeteredMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_display_name" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMatrixWithDisplayNamePrice>(),
                                )
                                ?.let { Price(matrixWithDisplayName = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedTieredPackagePrice>(),
                                )
                                ?.let { Price(groupedTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMatrixWithAllocationPrice>(),
                                )
                                ?.let { Price(matrixWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredPackageWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredPackageWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedTieredPrice>(),
                                )
                                ?.let { Price(groupedTiered = it, _json = json) }
                                ?: Price(_json = json)
                        }
                    }

                    return Price(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Price>(Price::class) {

                override fun serialize(
                    value: Price,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.unit != null -> generator.writeObject(value.unit)
                        value.package_ != null -> generator.writeObject(value.package_)
                        value.matrix != null -> generator.writeObject(value.matrix)
                        value.tiered != null -> generator.writeObject(value.tiered)
                        value.tieredBps != null -> generator.writeObject(value.tieredBps)
                        value.bps != null -> generator.writeObject(value.bps)
                        value.bulkBps != null -> generator.writeObject(value.bulkBps)
                        value.bulk != null -> generator.writeObject(value.bulk)
                        value.thresholdTotalAmount != null ->
                            generator.writeObject(value.thresholdTotalAmount)
                        value.tieredPackage != null -> generator.writeObject(value.tieredPackage)
                        value.tieredWithMinimum != null ->
                            generator.writeObject(value.tieredWithMinimum)
                        value.unitWithPercent != null ->
                            generator.writeObject(value.unitWithPercent)
                        value.packageWithAllocation != null ->
                            generator.writeObject(value.packageWithAllocation)
                        value.tieredWithProration != null ->
                            generator.writeObject(value.tieredWithProration)
                        value.unitWithProration != null ->
                            generator.writeObject(value.unitWithProration)
                        value.groupedAllocation != null ->
                            generator.writeObject(value.groupedAllocation)
                        value.groupedWithProratedMinimum != null ->
                            generator.writeObject(value.groupedWithProratedMinimum)
                        value.bulkWithProration != null ->
                            generator.writeObject(value.bulkWithProration)
                        value.scalableMatrixWithUnitPricing != null ->
                            generator.writeObject(value.scalableMatrixWithUnitPricing)
                        value.scalableMatrixWithTieredPricing != null ->
                            generator.writeObject(value.scalableMatrixWithTieredPricing)
                        value.cumulativeGroupedBulk != null ->
                            generator.writeObject(value.cumulativeGroupedBulk)
                        value.maxGroupTieredPackage != null ->
                            generator.writeObject(value.maxGroupTieredPackage)
                        value.groupedWithMeteredMinimum != null ->
                            generator.writeObject(value.groupedWithMeteredMinimum)
                        value.matrixWithDisplayName != null ->
                            generator.writeObject(value.matrixWithDisplayName)
                        value.groupedTieredPackage != null ->
                            generator.writeObject(value.groupedTieredPackage)
                        value.matrixWithAllocation != null ->
                            generator.writeObject(value.matrixWithAllocation)
                        value.tieredPackageWithMinimum != null ->
                            generator.writeObject(value.tieredPackageWithMinimum)
                        value.groupedTiered != null -> generator.writeObject(value.groupedTiered)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Price")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AddPrice &&
                allocationPrice == other.allocationPrice &&
                discounts == other.discounts &&
                endDate == other.endDate &&
                externalPriceId == other.externalPriceId &&
                maximumAmount == other.maximumAmount &&
                minimumAmount == other.minimumAmount &&
                planPhaseOrder == other.planPhaseOrder &&
                price == other.price &&
                priceId == other.priceId &&
                startDate == other.startDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allocationPrice,
                discounts,
                endDate,
                externalPriceId,
                maximumAmount,
                minimumAmount,
                planPhaseOrder,
                price,
                priceId,
                startDate,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddPrice{allocationPrice=$allocationPrice, discounts=$discounts, endDate=$endDate, externalPriceId=$externalPriceId, maximumAmount=$maximumAmount, minimumAmount=$minimumAmount, planPhaseOrder=$planPhaseOrder, price=$price, priceId=$priceId, startDate=$startDate, additionalProperties=$additionalProperties}"
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

        private var validated: Boolean = false

        fun validate(): ExternalMarketplace = apply {
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

            return other is ExternalMarketplace && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class RemoveAdjustment
    private constructor(
        private val adjustmentId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("adjustment_id")
            @ExcludeMissing
            adjustmentId: JsonField<String> = JsonMissing.of()
        ) : this(adjustmentId, mutableMapOf())

        /**
         * The id of the adjustment to remove on the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustmentId(): String = adjustmentId.getRequired("adjustment_id")

        /**
         * Returns the raw JSON value of [adjustmentId].
         *
         * Unlike [adjustmentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("adjustment_id")
        @ExcludeMissing
        fun _adjustmentId(): JsonField<String> = adjustmentId

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
             * Returns a mutable builder for constructing an instance of [RemoveAdjustment].
             *
             * The following fields are required:
             * ```kotlin
             * .adjustmentId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RemoveAdjustment]. */
        class Builder internal constructor() {

            private var adjustmentId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(removeAdjustment: RemoveAdjustment) = apply {
                adjustmentId = removeAdjustment.adjustmentId
                additionalProperties = removeAdjustment.additionalProperties.toMutableMap()
            }

            /** The id of the adjustment to remove on the subscription. */
            fun adjustmentId(adjustmentId: String) = adjustmentId(JsonField.of(adjustmentId))

            /**
             * Sets [Builder.adjustmentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustmentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adjustmentId(adjustmentId: JsonField<String>) = apply {
                this.adjustmentId = adjustmentId
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
             * Returns an immutable instance of [RemoveAdjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .adjustmentId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RemoveAdjustment =
                RemoveAdjustment(
                    checkRequired("adjustmentId", adjustmentId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RemoveAdjustment = apply {
            if (validated) {
                return@apply
            }

            adjustmentId()
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
        internal fun validity(): Int = (if (adjustmentId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RemoveAdjustment &&
                adjustmentId == other.adjustmentId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(adjustmentId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RemoveAdjustment{adjustmentId=$adjustmentId, additionalProperties=$additionalProperties}"
    }

    class RemovePrice
    private constructor(
        private val externalPriceId: JsonField<String>,
        private val priceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("external_price_id")
            @ExcludeMissing
            externalPriceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price_id") @ExcludeMissing priceId: JsonField<String> = JsonMissing.of(),
        ) : this(externalPriceId, priceId, mutableMapOf())

        /**
         * The external price id of the price to remove on the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        /**
         * The id of the price to remove on the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceId(): String? = priceId.getNullable("price_id")

        /**
         * Returns the raw JSON value of [externalPriceId].
         *
         * Unlike [externalPriceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_price_id")
        @ExcludeMissing
        fun _externalPriceId(): JsonField<String> = externalPriceId

        /**
         * Returns the raw JSON value of [priceId].
         *
         * Unlike [priceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

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

            /** Returns a mutable builder for constructing an instance of [RemovePrice]. */
            fun builder() = Builder()
        }

        /** A builder for [RemovePrice]. */
        class Builder internal constructor() {

            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(removePrice: RemovePrice) = apply {
                externalPriceId = removePrice.externalPriceId
                priceId = removePrice.priceId
                additionalProperties = removePrice.additionalProperties.toMutableMap()
            }

            /** The external price id of the price to remove on the subscription. */
            fun externalPriceId(externalPriceId: String?) =
                externalPriceId(JsonField.ofNullable(externalPriceId))

            /**
             * Sets [Builder.externalPriceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPriceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The id of the price to remove on the subscription. */
            fun priceId(priceId: String?) = priceId(JsonField.ofNullable(priceId))

            /**
             * Sets [Builder.priceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

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
             * Returns an immutable instance of [RemovePrice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RemovePrice =
                RemovePrice(externalPriceId, priceId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): RemovePrice = apply {
            if (validated) {
                return@apply
            }

            externalPriceId()
            priceId()
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
            (if (externalPriceId.asKnown() == null) 0 else 1) +
                (if (priceId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RemovePrice &&
                externalPriceId == other.externalPriceId &&
                priceId == other.priceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(externalPriceId, priceId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RemovePrice{externalPriceId=$externalPriceId, priceId=$priceId, additionalProperties=$additionalProperties}"
    }

    class ReplaceAdjustment
    private constructor(
        private val adjustment: JsonField<Adjustment>,
        private val replacesAdjustmentId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("adjustment")
            @ExcludeMissing
            adjustment: JsonField<Adjustment> = JsonMissing.of(),
            @JsonProperty("replaces_adjustment_id")
            @ExcludeMissing
            replacesAdjustmentId: JsonField<String> = JsonMissing.of(),
        ) : this(adjustment, replacesAdjustmentId, mutableMapOf())

        /**
         * The definition of a new adjustment to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustment(): Adjustment = adjustment.getRequired("adjustment")

        /**
         * The id of the adjustment on the plan to replace in the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun replacesAdjustmentId(): String =
            replacesAdjustmentId.getRequired("replaces_adjustment_id")

        /**
         * Returns the raw JSON value of [adjustment].
         *
         * Unlike [adjustment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("adjustment")
        @ExcludeMissing
        fun _adjustment(): JsonField<Adjustment> = adjustment

        /**
         * Returns the raw JSON value of [replacesAdjustmentId].
         *
         * Unlike [replacesAdjustmentId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("replaces_adjustment_id")
        @ExcludeMissing
        fun _replacesAdjustmentId(): JsonField<String> = replacesAdjustmentId

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
             * Returns a mutable builder for constructing an instance of [ReplaceAdjustment].
             *
             * The following fields are required:
             * ```kotlin
             * .adjustment()
             * .replacesAdjustmentId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ReplaceAdjustment]. */
        class Builder internal constructor() {

            private var adjustment: JsonField<Adjustment>? = null
            private var replacesAdjustmentId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(replaceAdjustment: ReplaceAdjustment) = apply {
                adjustment = replaceAdjustment.adjustment
                replacesAdjustmentId = replaceAdjustment.replacesAdjustmentId
                additionalProperties = replaceAdjustment.additionalProperties.toMutableMap()
            }

            /** The definition of a new adjustment to create and add to the subscription. */
            fun adjustment(adjustment: Adjustment) = adjustment(JsonField.of(adjustment))

            /**
             * Sets [Builder.adjustment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustment] with a well-typed [Adjustment] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adjustment(adjustment: JsonField<Adjustment>) = apply {
                this.adjustment = adjustment
            }

            /**
             * Alias for calling [adjustment] with
             * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
             */
            fun adjustment(percentageDiscount: NewPercentageDiscount) =
                adjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewPercentageDiscount.builder()
             *     .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
             *     .percentageDiscount(percentageDiscount)
             *     .build()
             * ```
             */
            fun percentageDiscountAdjustment(percentageDiscount: Double) =
                adjustment(
                    NewPercentageDiscount.builder()
                        .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
                        .percentageDiscount(percentageDiscount)
                        .build()
                )

            /** Alias for calling [adjustment] with `Adjustment.ofUsageDiscount(usageDiscount)`. */
            fun adjustment(usageDiscount: NewUsageDiscount) =
                adjustment(Adjustment.ofUsageDiscount(usageDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewUsageDiscount.builder()
             *     .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
             *     .usageDiscount(usageDiscount)
             *     .build()
             * ```
             */
            fun usageDiscountAdjustment(usageDiscount: Double) =
                adjustment(
                    NewUsageDiscount.builder()
                        .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
                        .usageDiscount(usageDiscount)
                        .build()
                )

            /**
             * Alias for calling [adjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`.
             */
            fun adjustment(amountDiscount: NewAmountDiscount) =
                adjustment(Adjustment.ofAmountDiscount(amountDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewAmountDiscount.builder()
             *     .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
             *     .amountDiscount(amountDiscount)
             *     .build()
             * ```
             */
            fun amountDiscountAdjustment(amountDiscount: String) =
                adjustment(
                    NewAmountDiscount.builder()
                        .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
                        .amountDiscount(amountDiscount)
                        .build()
                )

            /** Alias for calling [adjustment] with `Adjustment.ofMinimum(minimum)`. */
            fun adjustment(minimum: NewMinimum) = adjustment(Adjustment.ofMinimum(minimum))

            /** Alias for calling [adjustment] with `Adjustment.ofMaximum(maximum)`. */
            fun adjustment(maximum: NewMaximum) = adjustment(Adjustment.ofMaximum(maximum))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewMaximum.builder()
             *     .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
             *     .maximumAmount(maximumAmount)
             *     .build()
             * ```
             */
            fun maximumAdjustment(maximumAmount: String) =
                adjustment(
                    NewMaximum.builder()
                        .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
                        .maximumAmount(maximumAmount)
                        .build()
                )

            /** The id of the adjustment on the plan to replace in the subscription. */
            fun replacesAdjustmentId(replacesAdjustmentId: String) =
                replacesAdjustmentId(JsonField.of(replacesAdjustmentId))

            /**
             * Sets [Builder.replacesAdjustmentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replacesAdjustmentId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun replacesAdjustmentId(replacesAdjustmentId: JsonField<String>) = apply {
                this.replacesAdjustmentId = replacesAdjustmentId
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
             * Returns an immutable instance of [ReplaceAdjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .adjustment()
             * .replacesAdjustmentId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ReplaceAdjustment =
                ReplaceAdjustment(
                    checkRequired("adjustment", adjustment),
                    checkRequired("replacesAdjustmentId", replacesAdjustmentId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ReplaceAdjustment = apply {
            if (validated) {
                return@apply
            }

            adjustment().validate()
            replacesAdjustmentId()
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
            (adjustment.asKnown()?.validity() ?: 0) +
                (if (replacesAdjustmentId.asKnown() == null) 0 else 1)

        /** The definition of a new adjustment to create and add to the subscription. */
        @JsonDeserialize(using = Adjustment.Deserializer::class)
        @JsonSerialize(using = Adjustment.Serializer::class)
        class Adjustment
        private constructor(
            private val percentageDiscount: NewPercentageDiscount? = null,
            private val usageDiscount: NewUsageDiscount? = null,
            private val amountDiscount: NewAmountDiscount? = null,
            private val minimum: NewMinimum? = null,
            private val maximum: NewMaximum? = null,
            private val _json: JsonValue? = null,
        ) {

            fun percentageDiscount(): NewPercentageDiscount? = percentageDiscount

            fun usageDiscount(): NewUsageDiscount? = usageDiscount

            fun amountDiscount(): NewAmountDiscount? = amountDiscount

            fun minimum(): NewMinimum? = minimum

            fun maximum(): NewMaximum? = maximum

            fun isPercentageDiscount(): Boolean = percentageDiscount != null

            fun isUsageDiscount(): Boolean = usageDiscount != null

            fun isAmountDiscount(): Boolean = amountDiscount != null

            fun isMinimum(): Boolean = minimum != null

            fun isMaximum(): Boolean = maximum != null

            fun asPercentageDiscount(): NewPercentageDiscount =
                percentageDiscount.getOrThrow("percentageDiscount")

            fun asUsageDiscount(): NewUsageDiscount = usageDiscount.getOrThrow("usageDiscount")

            fun asAmountDiscount(): NewAmountDiscount = amountDiscount.getOrThrow("amountDiscount")

            fun asMinimum(): NewMinimum = minimum.getOrThrow("minimum")

            fun asMaximum(): NewMaximum = maximum.getOrThrow("maximum")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    percentageDiscount != null ->
                        visitor.visitPercentageDiscount(percentageDiscount)
                    usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                    amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
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
                        override fun visitPercentageDiscount(
                            percentageDiscount: NewPercentageDiscount
                        ) {
                            percentageDiscount.validate()
                        }

                        override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) {
                            usageDiscount.validate()
                        }

                        override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) {
                            amountDiscount.validate()
                        }

                        override fun visitMinimum(minimum: NewMinimum) {
                            minimum.validate()
                        }

                        override fun visitMaximum(maximum: NewMaximum) {
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
                        override fun visitPercentageDiscount(
                            percentageDiscount: NewPercentageDiscount
                        ) = percentageDiscount.validity()

                        override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) =
                            usageDiscount.validity()

                        override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) =
                            amountDiscount.validity()

                        override fun visitMinimum(minimum: NewMinimum) = minimum.validity()

                        override fun visitMaximum(maximum: NewMaximum) = maximum.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Adjustment &&
                    percentageDiscount == other.percentageDiscount &&
                    usageDiscount == other.usageDiscount &&
                    amountDiscount == other.amountDiscount &&
                    minimum == other.minimum &&
                    maximum == other.maximum
            }

            override fun hashCode(): Int =
                Objects.hash(percentageDiscount, usageDiscount, amountDiscount, minimum, maximum)

            override fun toString(): String =
                when {
                    percentageDiscount != null ->
                        "Adjustment{percentageDiscount=$percentageDiscount}"
                    usageDiscount != null -> "Adjustment{usageDiscount=$usageDiscount}"
                    amountDiscount != null -> "Adjustment{amountDiscount=$amountDiscount}"
                    minimum != null -> "Adjustment{minimum=$minimum}"
                    maximum != null -> "Adjustment{maximum=$maximum}"
                    _json != null -> "Adjustment{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Adjustment")
                }

            companion object {

                fun ofPercentageDiscount(percentageDiscount: NewPercentageDiscount) =
                    Adjustment(percentageDiscount = percentageDiscount)

                fun ofUsageDiscount(usageDiscount: NewUsageDiscount) =
                    Adjustment(usageDiscount = usageDiscount)

                fun ofAmountDiscount(amountDiscount: NewAmountDiscount) =
                    Adjustment(amountDiscount = amountDiscount)

                fun ofMinimum(minimum: NewMinimum) = Adjustment(minimum = minimum)

                fun ofMaximum(maximum: NewMaximum) = Adjustment(maximum = maximum)
            }

            /**
             * An interface that defines how to map each variant of [Adjustment] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitPercentageDiscount(percentageDiscount: NewPercentageDiscount): T

                fun visitUsageDiscount(usageDiscount: NewUsageDiscount): T

                fun visitAmountDiscount(amountDiscount: NewAmountDiscount): T

                fun visitMinimum(minimum: NewMinimum): T

                fun visitMaximum(maximum: NewMaximum): T

                /**
                 * Maps an unknown variant of [Adjustment] to a value of type [T].
                 *
                 * An instance of [Adjustment] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
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
                        "percentage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPercentageDiscount>())
                                ?.let { Adjustment(percentageDiscount = it, _json = json) }
                                ?: Adjustment(_json = json)
                        }
                        "usage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewUsageDiscount>())?.let {
                                Adjustment(usageDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "amount_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewAmountDiscount>())?.let {
                                Adjustment(amountDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "minimum" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewMinimum>())?.let {
                                Adjustment(minimum = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "maximum" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewMaximum>())?.let {
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
                        value.percentageDiscount != null ->
                            generator.writeObject(value.percentageDiscount)
                        value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                        value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                        value.minimum != null -> generator.writeObject(value.minimum)
                        value.maximum != null -> generator.writeObject(value.maximum)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Adjustment")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReplaceAdjustment &&
                adjustment == other.adjustment &&
                replacesAdjustmentId == other.replacesAdjustmentId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(adjustment, replacesAdjustmentId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReplaceAdjustment{adjustment=$adjustment, replacesAdjustmentId=$replacesAdjustmentId, additionalProperties=$additionalProperties}"
    }

    class ReplacePrice
    private constructor(
        private val replacesPriceId: JsonField<String>,
        private val allocationPrice: JsonField<NewAllocationPrice>,
        private val discounts: JsonField<List<DiscountOverride>>,
        private val externalPriceId: JsonField<String>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val maximumAmount: JsonField<String>,
        private val minimumAmount: JsonField<String>,
        private val price: JsonField<Price>,
        private val priceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("replaces_price_id")
            @ExcludeMissing
            replacesPriceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allocation_price")
            @ExcludeMissing
            allocationPrice: JsonField<NewAllocationPrice> = JsonMissing.of(),
            @JsonProperty("discounts")
            @ExcludeMissing
            discounts: JsonField<List<DiscountOverride>> = JsonMissing.of(),
            @JsonProperty("external_price_id")
            @ExcludeMissing
            externalPriceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            maximumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            minimumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
            @JsonProperty("price_id") @ExcludeMissing priceId: JsonField<String> = JsonMissing.of(),
        ) : this(
            replacesPriceId,
            allocationPrice,
            discounts,
            externalPriceId,
            fixedPriceQuantity,
            maximumAmount,
            minimumAmount,
            price,
            priceId,
            mutableMapOf(),
        )

        /**
         * The id of the price on the plan to replace in the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun replacesPriceId(): String = replacesPriceId.getRequired("replaces_price_id")

        /**
         * The definition of a new allocation price to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allocationPrice(): NewAllocationPrice? = allocationPrice.getNullable("allocation_price")

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for the
         * replacement price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun discounts(): List<DiscountOverride>? = discounts.getNullable("discounts")

        /**
         * The external price id of the price to add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        /**
         * The new quantity of the price, if the price is a fixed price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for the
         * replacement price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for the
         * replacement price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        /**
         * The definition of a new price to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun price(): Price? = price.getNullable("price")

        /**
         * The id of the price to add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceId(): String? = priceId.getNullable("price_id")

        /**
         * Returns the raw JSON value of [replacesPriceId].
         *
         * Unlike [replacesPriceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("replaces_price_id")
        @ExcludeMissing
        fun _replacesPriceId(): JsonField<String> = replacesPriceId

        /**
         * Returns the raw JSON value of [allocationPrice].
         *
         * Unlike [allocationPrice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allocation_price")
        @ExcludeMissing
        fun _allocationPrice(): JsonField<NewAllocationPrice> = allocationPrice

        /**
         * Returns the raw JSON value of [discounts].
         *
         * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("discounts")
        @ExcludeMissing
        fun _discounts(): JsonField<List<DiscountOverride>> = discounts

        /**
         * Returns the raw JSON value of [externalPriceId].
         *
         * Unlike [externalPriceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_price_id")
        @ExcludeMissing
        fun _externalPriceId(): JsonField<String> = externalPriceId

        /**
         * Returns the raw JSON value of [fixedPriceQuantity].
         *
         * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

        /**
         * Returns the raw JSON value of [maximumAmount].
         *
         * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        /**
         * Returns the raw JSON value of [minimumAmount].
         *
         * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

        /**
         * Returns the raw JSON value of [priceId].
         *
         * Unlike [priceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

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
             * Returns a mutable builder for constructing an instance of [ReplacePrice].
             *
             * The following fields are required:
             * ```kotlin
             * .replacesPriceId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ReplacePrice]. */
        class Builder internal constructor() {

            private var replacesPriceId: JsonField<String>? = null
            private var allocationPrice: JsonField<NewAllocationPrice> = JsonMissing.of()
            private var discounts: JsonField<MutableList<DiscountOverride>>? = null
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var price: JsonField<Price> = JsonMissing.of()
            private var priceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(replacePrice: ReplacePrice) = apply {
                replacesPriceId = replacePrice.replacesPriceId
                allocationPrice = replacePrice.allocationPrice
                discounts = replacePrice.discounts.map { it.toMutableList() }
                externalPriceId = replacePrice.externalPriceId
                fixedPriceQuantity = replacePrice.fixedPriceQuantity
                maximumAmount = replacePrice.maximumAmount
                minimumAmount = replacePrice.minimumAmount
                price = replacePrice.price
                priceId = replacePrice.priceId
                additionalProperties = replacePrice.additionalProperties.toMutableMap()
            }

            /** The id of the price on the plan to replace in the subscription. */
            fun replacesPriceId(replacesPriceId: String) =
                replacesPriceId(JsonField.of(replacesPriceId))

            /**
             * Sets [Builder.replacesPriceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replacesPriceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun replacesPriceId(replacesPriceId: JsonField<String>) = apply {
                this.replacesPriceId = replacesPriceId
            }

            /** The definition of a new allocation price to create and add to the subscription. */
            fun allocationPrice(allocationPrice: NewAllocationPrice?) =
                allocationPrice(JsonField.ofNullable(allocationPrice))

            /**
             * Sets [Builder.allocationPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocationPrice] with a well-typed
             * [NewAllocationPrice] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun allocationPrice(allocationPrice: JsonField<NewAllocationPrice>) = apply {
                this.allocationPrice = allocationPrice
            }

            /**
             * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for the
             * replacement price.
             */
            @Deprecated("deprecated")
            fun discounts(discounts: List<DiscountOverride>?) =
                discounts(JsonField.ofNullable(discounts))

            /**
             * Sets [Builder.discounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discounts] with a well-typed
             * `List<DiscountOverride>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            @Deprecated("deprecated")
            fun discounts(discounts: JsonField<List<DiscountOverride>>) = apply {
                this.discounts = discounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [DiscountOverride] to [discounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            @Deprecated("deprecated")
            fun addDiscount(discount: DiscountOverride) = apply {
                discounts =
                    (discounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("discounts", it).add(discount)
                    }
            }

            /** The external price id of the price to add to the subscription. */
            fun externalPriceId(externalPriceId: String?) =
                externalPriceId(JsonField.ofNullable(externalPriceId))

            /**
             * Sets [Builder.externalPriceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPriceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The new quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

            /**
             * Alias for [Builder.fixedPriceQuantity].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /**
             * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fixedPriceQuantity] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for the
             * replacement price.
             */
            @Deprecated("deprecated")
            fun maximumAmount(maximumAmount: String?) =
                maximumAmount(JsonField.ofNullable(maximumAmount))

            /**
             * Sets [Builder.maximumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /**
             * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for the
             * replacement price.
             */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: String?) =
                minimumAmount(JsonField.ofNullable(minimumAmount))

            /**
             * Sets [Builder.minimumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            /** The definition of a new price to create and add to the subscription. */
            fun price(price: Price?) = price(JsonField.ofNullable(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Price] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /** Alias for calling [price] with `Price.ofUnit(unit)`. */
            fun price(unit: NewSubscriptionUnitPrice) = price(Price.ofUnit(unit))

            /** Alias for calling [price] with `Price.ofPackage(package_)`. */
            fun price(package_: NewSubscriptionPackagePrice) = price(Price.ofPackage(package_))

            /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
            fun price(matrix: NewSubscriptionMatrixPrice) = price(Price.ofMatrix(matrix))

            /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
            fun price(tiered: NewSubscriptionTieredPrice) = price(Price.ofTiered(tiered))

            /** Alias for calling [price] with `Price.ofTieredBps(tieredBps)`. */
            fun price(tieredBps: NewSubscriptionTieredBpsPrice) =
                price(Price.ofTieredBps(tieredBps))

            /** Alias for calling [price] with `Price.ofBps(bps)`. */
            fun price(bps: NewSubscriptionBpsPrice) = price(Price.ofBps(bps))

            /** Alias for calling [price] with `Price.ofBulkBps(bulkBps)`. */
            fun price(bulkBps: NewSubscriptionBulkBpsPrice) = price(Price.ofBulkBps(bulkBps))

            /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
            fun price(bulk: NewSubscriptionBulkPrice) = price(Price.ofBulk(bulk))

            /**
             * Alias for calling [price] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
             */
            fun price(thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice) =
                price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

            /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
            fun price(tieredPackage: NewSubscriptionTieredPackagePrice) =
                price(Price.ofTieredPackage(tieredPackage))

            /** Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
            fun price(tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice) =
                price(Price.ofTieredWithMinimum(tieredWithMinimum))

            /** Alias for calling [price] with `Price.ofUnitWithPercent(unitWithPercent)`. */
            fun price(unitWithPercent: NewSubscriptionUnitWithPercentPrice) =
                price(Price.ofUnitWithPercent(unitWithPercent))

            /**
             * Alias for calling [price] with
             * `Price.ofPackageWithAllocation(packageWithAllocation)`.
             */
            fun price(packageWithAllocation: NewSubscriptionPackageWithAllocationPrice) =
                price(Price.ofPackageWithAllocation(packageWithAllocation))

            /**
             * Alias for calling [price] with `Price.ofTieredWithProration(tieredWithProration)`.
             */
            fun price(tieredWithProration: NewSubscriptionTierWithProrationPrice) =
                price(Price.ofTieredWithProration(tieredWithProration))

            /** Alias for calling [price] with `Price.ofUnitWithProration(unitWithProration)`. */
            fun price(unitWithProration: NewSubscriptionUnitWithProrationPrice) =
                price(Price.ofUnitWithProration(unitWithProration))

            /** Alias for calling [price] with `Price.ofGroupedAllocation(groupedAllocation)`. */
            fun price(groupedAllocation: NewSubscriptionGroupedAllocationPrice) =
                price(Price.ofGroupedAllocation(groupedAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
             */
            fun price(groupedWithProratedMinimum: NewSubscriptionGroupedWithProratedMinimumPrice) =
                price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

            /** Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`. */
            fun price(bulkWithProration: NewSubscriptionBulkWithProrationPrice) =
                price(Price.ofBulkWithProration(bulkWithProration))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
             */
            fun price(
                scalableMatrixWithUnitPricing: NewSubscriptionScalableMatrixWithUnitPricingPrice
            ) = price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
             */
            fun price(
                scalableMatrixWithTieredPricing: NewSubscriptionScalableMatrixWithTieredPricingPrice
            ) = price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
             */
            fun price(cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice) =
                price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

            /**
             * Alias for calling [price] with
             * `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
             */
            fun price(maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice) =
                price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
             */
            fun price(groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice) =
                price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
             */
            fun price(matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice) =
                price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

            /**
             * Alias for calling [price] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
             */
            fun price(groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice) =
                price(Price.ofGroupedTieredPackage(groupedTieredPackage))

            /**
             * Alias for calling [price] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
             */
            fun price(matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice) =
                price(Price.ofMatrixWithAllocation(matrixWithAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
             */
            fun price(tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice) =
                price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

            /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
            fun price(groupedTiered: NewSubscriptionGroupedTieredPrice) =
                price(Price.ofGroupedTiered(groupedTiered))

            /** The id of the price to add to the subscription. */
            fun priceId(priceId: String?) = priceId(JsonField.ofNullable(priceId))

            /**
             * Sets [Builder.priceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

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
             * Returns an immutable instance of [ReplacePrice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .replacesPriceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ReplacePrice =
                ReplacePrice(
                    checkRequired("replacesPriceId", replacesPriceId),
                    allocationPrice,
                    (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                    externalPriceId,
                    fixedPriceQuantity,
                    maximumAmount,
                    minimumAmount,
                    price,
                    priceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ReplacePrice = apply {
            if (validated) {
                return@apply
            }

            replacesPriceId()
            allocationPrice()?.validate()
            discounts()?.forEach { it.validate() }
            externalPriceId()
            fixedPriceQuantity()
            maximumAmount()
            minimumAmount()
            price()?.validate()
            priceId()
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
            (if (replacesPriceId.asKnown() == null) 0 else 1) +
                (allocationPrice.asKnown()?.validity() ?: 0) +
                (discounts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (externalPriceId.asKnown() == null) 0 else 1) +
                (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                (if (maximumAmount.asKnown() == null) 0 else 1) +
                (if (minimumAmount.asKnown() == null) 0 else 1) +
                (price.asKnown()?.validity() ?: 0) +
                (if (priceId.asKnown() == null) 0 else 1)

        /** The definition of a new price to create and add to the subscription. */
        @JsonDeserialize(using = Price.Deserializer::class)
        @JsonSerialize(using = Price.Serializer::class)
        class Price
        private constructor(
            private val unit: NewSubscriptionUnitPrice? = null,
            private val package_: NewSubscriptionPackagePrice? = null,
            private val matrix: NewSubscriptionMatrixPrice? = null,
            private val tiered: NewSubscriptionTieredPrice? = null,
            private val tieredBps: NewSubscriptionTieredBpsPrice? = null,
            private val bps: NewSubscriptionBpsPrice? = null,
            private val bulkBps: NewSubscriptionBulkBpsPrice? = null,
            private val bulk: NewSubscriptionBulkPrice? = null,
            private val thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice? = null,
            private val tieredPackage: NewSubscriptionTieredPackagePrice? = null,
            private val tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice? = null,
            private val unitWithPercent: NewSubscriptionUnitWithPercentPrice? = null,
            private val packageWithAllocation: NewSubscriptionPackageWithAllocationPrice? = null,
            private val tieredWithProration: NewSubscriptionTierWithProrationPrice? = null,
            private val unitWithProration: NewSubscriptionUnitWithProrationPrice? = null,
            private val groupedAllocation: NewSubscriptionGroupedAllocationPrice? = null,
            private val groupedWithProratedMinimum:
                NewSubscriptionGroupedWithProratedMinimumPrice? =
                null,
            private val bulkWithProration: NewSubscriptionBulkWithProrationPrice? = null,
            private val scalableMatrixWithUnitPricing:
                NewSubscriptionScalableMatrixWithUnitPricingPrice? =
                null,
            private val scalableMatrixWithTieredPricing:
                NewSubscriptionScalableMatrixWithTieredPricingPrice? =
                null,
            private val cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice? = null,
            private val maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice? = null,
            private val groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice? =
                null,
            private val matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice? = null,
            private val groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice? = null,
            private val matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice? = null,
            private val tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice? =
                null,
            private val groupedTiered: NewSubscriptionGroupedTieredPrice? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unit(): NewSubscriptionUnitPrice? = unit

            fun package_(): NewSubscriptionPackagePrice? = package_

            fun matrix(): NewSubscriptionMatrixPrice? = matrix

            fun tiered(): NewSubscriptionTieredPrice? = tiered

            fun tieredBps(): NewSubscriptionTieredBpsPrice? = tieredBps

            fun bps(): NewSubscriptionBpsPrice? = bps

            fun bulkBps(): NewSubscriptionBulkBpsPrice? = bulkBps

            fun bulk(): NewSubscriptionBulkPrice? = bulk

            fun thresholdTotalAmount(): NewSubscriptionThresholdTotalAmountPrice? =
                thresholdTotalAmount

            fun tieredPackage(): NewSubscriptionTieredPackagePrice? = tieredPackage

            fun tieredWithMinimum(): NewSubscriptionTieredWithMinimumPrice? = tieredWithMinimum

            fun unitWithPercent(): NewSubscriptionUnitWithPercentPrice? = unitWithPercent

            fun packageWithAllocation(): NewSubscriptionPackageWithAllocationPrice? =
                packageWithAllocation

            fun tieredWithProration(): NewSubscriptionTierWithProrationPrice? = tieredWithProration

            fun unitWithProration(): NewSubscriptionUnitWithProrationPrice? = unitWithProration

            fun groupedAllocation(): NewSubscriptionGroupedAllocationPrice? = groupedAllocation

            fun groupedWithProratedMinimum(): NewSubscriptionGroupedWithProratedMinimumPrice? =
                groupedWithProratedMinimum

            fun bulkWithProration(): NewSubscriptionBulkWithProrationPrice? = bulkWithProration

            fun scalableMatrixWithUnitPricing():
                NewSubscriptionScalableMatrixWithUnitPricingPrice? = scalableMatrixWithUnitPricing

            fun scalableMatrixWithTieredPricing():
                NewSubscriptionScalableMatrixWithTieredPricingPrice? =
                scalableMatrixWithTieredPricing

            fun cumulativeGroupedBulk(): NewSubscriptionCumulativeGroupedBulkPrice? =
                cumulativeGroupedBulk

            fun maxGroupTieredPackage(): NewSubscriptionMaxGroupTieredPackagePrice? =
                maxGroupTieredPackage

            fun groupedWithMeteredMinimum(): NewSubscriptionGroupedWithMeteredMinimumPrice? =
                groupedWithMeteredMinimum

            fun matrixWithDisplayName(): NewSubscriptionMatrixWithDisplayNamePrice? =
                matrixWithDisplayName

            fun groupedTieredPackage(): NewSubscriptionGroupedTieredPackagePrice? =
                groupedTieredPackage

            fun matrixWithAllocation(): NewSubscriptionMatrixWithAllocationPrice? =
                matrixWithAllocation

            fun tieredPackageWithMinimum(): NewSubscriptionTieredPackageWithMinimumPrice? =
                tieredPackageWithMinimum

            fun groupedTiered(): NewSubscriptionGroupedTieredPrice? = groupedTiered

            fun isUnit(): Boolean = unit != null

            fun isPackage(): Boolean = package_ != null

            fun isMatrix(): Boolean = matrix != null

            fun isTiered(): Boolean = tiered != null

            fun isTieredBps(): Boolean = tieredBps != null

            fun isBps(): Boolean = bps != null

            fun isBulkBps(): Boolean = bulkBps != null

            fun isBulk(): Boolean = bulk != null

            fun isThresholdTotalAmount(): Boolean = thresholdTotalAmount != null

            fun isTieredPackage(): Boolean = tieredPackage != null

            fun isTieredWithMinimum(): Boolean = tieredWithMinimum != null

            fun isUnitWithPercent(): Boolean = unitWithPercent != null

            fun isPackageWithAllocation(): Boolean = packageWithAllocation != null

            fun isTieredWithProration(): Boolean = tieredWithProration != null

            fun isUnitWithProration(): Boolean = unitWithProration != null

            fun isGroupedAllocation(): Boolean = groupedAllocation != null

            fun isGroupedWithProratedMinimum(): Boolean = groupedWithProratedMinimum != null

            fun isBulkWithProration(): Boolean = bulkWithProration != null

            fun isScalableMatrixWithUnitPricing(): Boolean = scalableMatrixWithUnitPricing != null

            fun isScalableMatrixWithTieredPricing(): Boolean =
                scalableMatrixWithTieredPricing != null

            fun isCumulativeGroupedBulk(): Boolean = cumulativeGroupedBulk != null

            fun isMaxGroupTieredPackage(): Boolean = maxGroupTieredPackage != null

            fun isGroupedWithMeteredMinimum(): Boolean = groupedWithMeteredMinimum != null

            fun isMatrixWithDisplayName(): Boolean = matrixWithDisplayName != null

            fun isGroupedTieredPackage(): Boolean = groupedTieredPackage != null

            fun isMatrixWithAllocation(): Boolean = matrixWithAllocation != null

            fun isTieredPackageWithMinimum(): Boolean = tieredPackageWithMinimum != null

            fun isGroupedTiered(): Boolean = groupedTiered != null

            fun asUnit(): NewSubscriptionUnitPrice = unit.getOrThrow("unit")

            fun asPackage(): NewSubscriptionPackagePrice = package_.getOrThrow("package_")

            fun asMatrix(): NewSubscriptionMatrixPrice = matrix.getOrThrow("matrix")

            fun asTiered(): NewSubscriptionTieredPrice = tiered.getOrThrow("tiered")

            fun asTieredBps(): NewSubscriptionTieredBpsPrice = tieredBps.getOrThrow("tieredBps")

            fun asBps(): NewSubscriptionBpsPrice = bps.getOrThrow("bps")

            fun asBulkBps(): NewSubscriptionBulkBpsPrice = bulkBps.getOrThrow("bulkBps")

            fun asBulk(): NewSubscriptionBulkPrice = bulk.getOrThrow("bulk")

            fun asThresholdTotalAmount(): NewSubscriptionThresholdTotalAmountPrice =
                thresholdTotalAmount.getOrThrow("thresholdTotalAmount")

            fun asTieredPackage(): NewSubscriptionTieredPackagePrice =
                tieredPackage.getOrThrow("tieredPackage")

            fun asTieredWithMinimum(): NewSubscriptionTieredWithMinimumPrice =
                tieredWithMinimum.getOrThrow("tieredWithMinimum")

            fun asUnitWithPercent(): NewSubscriptionUnitWithPercentPrice =
                unitWithPercent.getOrThrow("unitWithPercent")

            fun asPackageWithAllocation(): NewSubscriptionPackageWithAllocationPrice =
                packageWithAllocation.getOrThrow("packageWithAllocation")

            fun asTieredWithProration(): NewSubscriptionTierWithProrationPrice =
                tieredWithProration.getOrThrow("tieredWithProration")

            fun asUnitWithProration(): NewSubscriptionUnitWithProrationPrice =
                unitWithProration.getOrThrow("unitWithProration")

            fun asGroupedAllocation(): NewSubscriptionGroupedAllocationPrice =
                groupedAllocation.getOrThrow("groupedAllocation")

            fun asGroupedWithProratedMinimum(): NewSubscriptionGroupedWithProratedMinimumPrice =
                groupedWithProratedMinimum.getOrThrow("groupedWithProratedMinimum")

            fun asBulkWithProration(): NewSubscriptionBulkWithProrationPrice =
                bulkWithProration.getOrThrow("bulkWithProration")

            fun asScalableMatrixWithUnitPricing():
                NewSubscriptionScalableMatrixWithUnitPricingPrice =
                scalableMatrixWithUnitPricing.getOrThrow("scalableMatrixWithUnitPricing")

            fun asScalableMatrixWithTieredPricing():
                NewSubscriptionScalableMatrixWithTieredPricingPrice =
                scalableMatrixWithTieredPricing.getOrThrow("scalableMatrixWithTieredPricing")

            fun asCumulativeGroupedBulk(): NewSubscriptionCumulativeGroupedBulkPrice =
                cumulativeGroupedBulk.getOrThrow("cumulativeGroupedBulk")

            fun asMaxGroupTieredPackage(): NewSubscriptionMaxGroupTieredPackagePrice =
                maxGroupTieredPackage.getOrThrow("maxGroupTieredPackage")

            fun asGroupedWithMeteredMinimum(): NewSubscriptionGroupedWithMeteredMinimumPrice =
                groupedWithMeteredMinimum.getOrThrow("groupedWithMeteredMinimum")

            fun asMatrixWithDisplayName(): NewSubscriptionMatrixWithDisplayNamePrice =
                matrixWithDisplayName.getOrThrow("matrixWithDisplayName")

            fun asGroupedTieredPackage(): NewSubscriptionGroupedTieredPackagePrice =
                groupedTieredPackage.getOrThrow("groupedTieredPackage")

            fun asMatrixWithAllocation(): NewSubscriptionMatrixWithAllocationPrice =
                matrixWithAllocation.getOrThrow("matrixWithAllocation")

            fun asTieredPackageWithMinimum(): NewSubscriptionTieredPackageWithMinimumPrice =
                tieredPackageWithMinimum.getOrThrow("tieredPackageWithMinimum")

            fun asGroupedTiered(): NewSubscriptionGroupedTieredPrice =
                groupedTiered.getOrThrow("groupedTiered")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unit != null -> visitor.visitUnit(unit)
                    package_ != null -> visitor.visitPackage(package_)
                    matrix != null -> visitor.visitMatrix(matrix)
                    tiered != null -> visitor.visitTiered(tiered)
                    tieredBps != null -> visitor.visitTieredBps(tieredBps)
                    bps != null -> visitor.visitBps(bps)
                    bulkBps != null -> visitor.visitBulkBps(bulkBps)
                    bulk != null -> visitor.visitBulk(bulk)
                    thresholdTotalAmount != null ->
                        visitor.visitThresholdTotalAmount(thresholdTotalAmount)
                    tieredPackage != null -> visitor.visitTieredPackage(tieredPackage)
                    tieredWithMinimum != null -> visitor.visitTieredWithMinimum(tieredWithMinimum)
                    unitWithPercent != null -> visitor.visitUnitWithPercent(unitWithPercent)
                    packageWithAllocation != null ->
                        visitor.visitPackageWithAllocation(packageWithAllocation)
                    tieredWithProration != null ->
                        visitor.visitTieredWithProration(tieredWithProration)
                    unitWithProration != null -> visitor.visitUnitWithProration(unitWithProration)
                    groupedAllocation != null -> visitor.visitGroupedAllocation(groupedAllocation)
                    groupedWithProratedMinimum != null ->
                        visitor.visitGroupedWithProratedMinimum(groupedWithProratedMinimum)
                    bulkWithProration != null -> visitor.visitBulkWithProration(bulkWithProration)
                    scalableMatrixWithUnitPricing != null ->
                        visitor.visitScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)
                    scalableMatrixWithTieredPricing != null ->
                        visitor.visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing
                        )
                    cumulativeGroupedBulk != null ->
                        visitor.visitCumulativeGroupedBulk(cumulativeGroupedBulk)
                    maxGroupTieredPackage != null ->
                        visitor.visitMaxGroupTieredPackage(maxGroupTieredPackage)
                    groupedWithMeteredMinimum != null ->
                        visitor.visitGroupedWithMeteredMinimum(groupedWithMeteredMinimum)
                    matrixWithDisplayName != null ->
                        visitor.visitMatrixWithDisplayName(matrixWithDisplayName)
                    groupedTieredPackage != null ->
                        visitor.visitGroupedTieredPackage(groupedTieredPackage)
                    matrixWithAllocation != null ->
                        visitor.visitMatrixWithAllocation(matrixWithAllocation)
                    tieredPackageWithMinimum != null ->
                        visitor.visitTieredPackageWithMinimum(tieredPackageWithMinimum)
                    groupedTiered != null -> visitor.visitGroupedTiered(groupedTiered)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Price = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUnit(unit: NewSubscriptionUnitPrice) {
                            unit.validate()
                        }

                        override fun visitPackage(package_: NewSubscriptionPackagePrice) {
                            package_.validate()
                        }

                        override fun visitMatrix(matrix: NewSubscriptionMatrixPrice) {
                            matrix.validate()
                        }

                        override fun visitTiered(tiered: NewSubscriptionTieredPrice) {
                            tiered.validate()
                        }

                        override fun visitTieredBps(tieredBps: NewSubscriptionTieredBpsPrice) {
                            tieredBps.validate()
                        }

                        override fun visitBps(bps: NewSubscriptionBpsPrice) {
                            bps.validate()
                        }

                        override fun visitBulkBps(bulkBps: NewSubscriptionBulkBpsPrice) {
                            bulkBps.validate()
                        }

                        override fun visitBulk(bulk: NewSubscriptionBulkPrice) {
                            bulk.validate()
                        }

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                        ) {
                            thresholdTotalAmount.validate()
                        }

                        override fun visitTieredPackage(
                            tieredPackage: NewSubscriptionTieredPackagePrice
                        ) {
                            tieredPackage.validate()
                        }

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice
                        ) {
                            tieredWithMinimum.validate()
                        }

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewSubscriptionUnitWithPercentPrice
                        ) {
                            unitWithPercent.validate()
                        }

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                        ) {
                            packageWithAllocation.validate()
                        }

                        override fun visitTieredWithProration(
                            tieredWithProration: NewSubscriptionTierWithProrationPrice
                        ) {
                            tieredWithProration.validate()
                        }

                        override fun visitUnitWithProration(
                            unitWithProration: NewSubscriptionUnitWithProrationPrice
                        ) {
                            unitWithProration.validate()
                        }

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewSubscriptionGroupedAllocationPrice
                        ) {
                            groupedAllocation.validate()
                        }

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum:
                                NewSubscriptionGroupedWithProratedMinimumPrice
                        ) {
                            groupedWithProratedMinimum.validate()
                        }

                        override fun visitBulkWithProration(
                            bulkWithProration: NewSubscriptionBulkWithProrationPrice
                        ) {
                            bulkWithProration.validate()
                        }

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing:
                                NewSubscriptionScalableMatrixWithUnitPricingPrice
                        ) {
                            scalableMatrixWithUnitPricing.validate()
                        }

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewSubscriptionScalableMatrixWithTieredPricingPrice
                        ) {
                            scalableMatrixWithTieredPricing.validate()
                        }

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                        ) {
                            cumulativeGroupedBulk.validate()
                        }

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                        ) {
                            maxGroupTieredPackage.validate()
                        }

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                        ) {
                            groupedWithMeteredMinimum.validate()
                        }

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                        ) {
                            matrixWithDisplayName.validate()
                        }

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                        ) {
                            groupedTieredPackage.validate()
                        }

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                        ) {
                            matrixWithAllocation.validate()
                        }

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                        ) {
                            tieredPackageWithMinimum.validate()
                        }

                        override fun visitGroupedTiered(
                            groupedTiered: NewSubscriptionGroupedTieredPrice
                        ) {
                            groupedTiered.validate()
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
                        override fun visitUnit(unit: NewSubscriptionUnitPrice) = unit.validity()

                        override fun visitPackage(package_: NewSubscriptionPackagePrice) =
                            package_.validity()

                        override fun visitMatrix(matrix: NewSubscriptionMatrixPrice) =
                            matrix.validity()

                        override fun visitTiered(tiered: NewSubscriptionTieredPrice) =
                            tiered.validity()

                        override fun visitTieredBps(tieredBps: NewSubscriptionTieredBpsPrice) =
                            tieredBps.validity()

                        override fun visitBps(bps: NewSubscriptionBpsPrice) = bps.validity()

                        override fun visitBulkBps(bulkBps: NewSubscriptionBulkBpsPrice) =
                            bulkBps.validity()

                        override fun visitBulk(bulk: NewSubscriptionBulkPrice) = bulk.validity()

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                        ) = thresholdTotalAmount.validity()

                        override fun visitTieredPackage(
                            tieredPackage: NewSubscriptionTieredPackagePrice
                        ) = tieredPackage.validity()

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice
                        ) = tieredWithMinimum.validity()

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewSubscriptionUnitWithPercentPrice
                        ) = unitWithPercent.validity()

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                        ) = packageWithAllocation.validity()

                        override fun visitTieredWithProration(
                            tieredWithProration: NewSubscriptionTierWithProrationPrice
                        ) = tieredWithProration.validity()

                        override fun visitUnitWithProration(
                            unitWithProration: NewSubscriptionUnitWithProrationPrice
                        ) = unitWithProration.validity()

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewSubscriptionGroupedAllocationPrice
                        ) = groupedAllocation.validity()

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum:
                                NewSubscriptionGroupedWithProratedMinimumPrice
                        ) = groupedWithProratedMinimum.validity()

                        override fun visitBulkWithProration(
                            bulkWithProration: NewSubscriptionBulkWithProrationPrice
                        ) = bulkWithProration.validity()

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing:
                                NewSubscriptionScalableMatrixWithUnitPricingPrice
                        ) = scalableMatrixWithUnitPricing.validity()

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewSubscriptionScalableMatrixWithTieredPricingPrice
                        ) = scalableMatrixWithTieredPricing.validity()

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                        ) = cumulativeGroupedBulk.validity()

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                        ) = maxGroupTieredPackage.validity()

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                        ) = groupedWithMeteredMinimum.validity()

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                        ) = matrixWithDisplayName.validity()

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                        ) = groupedTieredPackage.validity()

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                        ) = matrixWithAllocation.validity()

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                        ) = tieredPackageWithMinimum.validity()

                        override fun visitGroupedTiered(
                            groupedTiered: NewSubscriptionGroupedTieredPrice
                        ) = groupedTiered.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Price &&
                    unit == other.unit &&
                    package_ == other.package_ &&
                    matrix == other.matrix &&
                    tiered == other.tiered &&
                    tieredBps == other.tieredBps &&
                    bps == other.bps &&
                    bulkBps == other.bulkBps &&
                    bulk == other.bulk &&
                    thresholdTotalAmount == other.thresholdTotalAmount &&
                    tieredPackage == other.tieredPackage &&
                    tieredWithMinimum == other.tieredWithMinimum &&
                    unitWithPercent == other.unitWithPercent &&
                    packageWithAllocation == other.packageWithAllocation &&
                    tieredWithProration == other.tieredWithProration &&
                    unitWithProration == other.unitWithProration &&
                    groupedAllocation == other.groupedAllocation &&
                    groupedWithProratedMinimum == other.groupedWithProratedMinimum &&
                    bulkWithProration == other.bulkWithProration &&
                    scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing &&
                    scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing &&
                    cumulativeGroupedBulk == other.cumulativeGroupedBulk &&
                    maxGroupTieredPackage == other.maxGroupTieredPackage &&
                    groupedWithMeteredMinimum == other.groupedWithMeteredMinimum &&
                    matrixWithDisplayName == other.matrixWithDisplayName &&
                    groupedTieredPackage == other.groupedTieredPackage &&
                    matrixWithAllocation == other.matrixWithAllocation &&
                    tieredPackageWithMinimum == other.tieredPackageWithMinimum &&
                    groupedTiered == other.groupedTiered
            }

            override fun hashCode(): Int =
                Objects.hash(
                    unit,
                    package_,
                    matrix,
                    tiered,
                    tieredBps,
                    bps,
                    bulkBps,
                    bulk,
                    thresholdTotalAmount,
                    tieredPackage,
                    tieredWithMinimum,
                    unitWithPercent,
                    packageWithAllocation,
                    tieredWithProration,
                    unitWithProration,
                    groupedAllocation,
                    groupedWithProratedMinimum,
                    bulkWithProration,
                    scalableMatrixWithUnitPricing,
                    scalableMatrixWithTieredPricing,
                    cumulativeGroupedBulk,
                    maxGroupTieredPackage,
                    groupedWithMeteredMinimum,
                    matrixWithDisplayName,
                    groupedTieredPackage,
                    matrixWithAllocation,
                    tieredPackageWithMinimum,
                    groupedTiered,
                )

            override fun toString(): String =
                when {
                    unit != null -> "Price{unit=$unit}"
                    package_ != null -> "Price{package_=$package_}"
                    matrix != null -> "Price{matrix=$matrix}"
                    tiered != null -> "Price{tiered=$tiered}"
                    tieredBps != null -> "Price{tieredBps=$tieredBps}"
                    bps != null -> "Price{bps=$bps}"
                    bulkBps != null -> "Price{bulkBps=$bulkBps}"
                    bulk != null -> "Price{bulk=$bulk}"
                    thresholdTotalAmount != null ->
                        "Price{thresholdTotalAmount=$thresholdTotalAmount}"
                    tieredPackage != null -> "Price{tieredPackage=$tieredPackage}"
                    tieredWithMinimum != null -> "Price{tieredWithMinimum=$tieredWithMinimum}"
                    unitWithPercent != null -> "Price{unitWithPercent=$unitWithPercent}"
                    packageWithAllocation != null ->
                        "Price{packageWithAllocation=$packageWithAllocation}"
                    tieredWithProration != null -> "Price{tieredWithProration=$tieredWithProration}"
                    unitWithProration != null -> "Price{unitWithProration=$unitWithProration}"
                    groupedAllocation != null -> "Price{groupedAllocation=$groupedAllocation}"
                    groupedWithProratedMinimum != null ->
                        "Price{groupedWithProratedMinimum=$groupedWithProratedMinimum}"
                    bulkWithProration != null -> "Price{bulkWithProration=$bulkWithProration}"
                    scalableMatrixWithUnitPricing != null ->
                        "Price{scalableMatrixWithUnitPricing=$scalableMatrixWithUnitPricing}"
                    scalableMatrixWithTieredPricing != null ->
                        "Price{scalableMatrixWithTieredPricing=$scalableMatrixWithTieredPricing}"
                    cumulativeGroupedBulk != null ->
                        "Price{cumulativeGroupedBulk=$cumulativeGroupedBulk}"
                    maxGroupTieredPackage != null ->
                        "Price{maxGroupTieredPackage=$maxGroupTieredPackage}"
                    groupedWithMeteredMinimum != null ->
                        "Price{groupedWithMeteredMinimum=$groupedWithMeteredMinimum}"
                    matrixWithDisplayName != null ->
                        "Price{matrixWithDisplayName=$matrixWithDisplayName}"
                    groupedTieredPackage != null ->
                        "Price{groupedTieredPackage=$groupedTieredPackage}"
                    matrixWithAllocation != null ->
                        "Price{matrixWithAllocation=$matrixWithAllocation}"
                    tieredPackageWithMinimum != null ->
                        "Price{tieredPackageWithMinimum=$tieredPackageWithMinimum}"
                    groupedTiered != null -> "Price{groupedTiered=$groupedTiered}"
                    _json != null -> "Price{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Price")
                }

            companion object {

                fun ofUnit(unit: NewSubscriptionUnitPrice) = Price(unit = unit)

                fun ofPackage(package_: NewSubscriptionPackagePrice) = Price(package_ = package_)

                fun ofMatrix(matrix: NewSubscriptionMatrixPrice) = Price(matrix = matrix)

                fun ofTiered(tiered: NewSubscriptionTieredPrice) = Price(tiered = tiered)

                fun ofTieredBps(tieredBps: NewSubscriptionTieredBpsPrice) =
                    Price(tieredBps = tieredBps)

                fun ofBps(bps: NewSubscriptionBpsPrice) = Price(bps = bps)

                fun ofBulkBps(bulkBps: NewSubscriptionBulkBpsPrice) = Price(bulkBps = bulkBps)

                fun ofBulk(bulk: NewSubscriptionBulkPrice) = Price(bulk = bulk)

                fun ofThresholdTotalAmount(
                    thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                ) = Price(thresholdTotalAmount = thresholdTotalAmount)

                fun ofTieredPackage(tieredPackage: NewSubscriptionTieredPackagePrice) =
                    Price(tieredPackage = tieredPackage)

                fun ofTieredWithMinimum(tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice) =
                    Price(tieredWithMinimum = tieredWithMinimum)

                fun ofUnitWithPercent(unitWithPercent: NewSubscriptionUnitWithPercentPrice) =
                    Price(unitWithPercent = unitWithPercent)

                fun ofPackageWithAllocation(
                    packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                ) = Price(packageWithAllocation = packageWithAllocation)

                fun ofTieredWithProration(
                    tieredWithProration: NewSubscriptionTierWithProrationPrice
                ) = Price(tieredWithProration = tieredWithProration)

                fun ofUnitWithProration(unitWithProration: NewSubscriptionUnitWithProrationPrice) =
                    Price(unitWithProration = unitWithProration)

                fun ofGroupedAllocation(groupedAllocation: NewSubscriptionGroupedAllocationPrice) =
                    Price(groupedAllocation = groupedAllocation)

                fun ofGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewSubscriptionGroupedWithProratedMinimumPrice
                ) = Price(groupedWithProratedMinimum = groupedWithProratedMinimum)

                fun ofBulkWithProration(bulkWithProration: NewSubscriptionBulkWithProrationPrice) =
                    Price(bulkWithProration = bulkWithProration)

                fun ofScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewSubscriptionScalableMatrixWithUnitPricingPrice
                ) = Price(scalableMatrixWithUnitPricing = scalableMatrixWithUnitPricing)

                fun ofScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing:
                        NewSubscriptionScalableMatrixWithTieredPricingPrice
                ) = Price(scalableMatrixWithTieredPricing = scalableMatrixWithTieredPricing)

                fun ofCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                ) = Price(cumulativeGroupedBulk = cumulativeGroupedBulk)

                fun ofMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                ) = Price(maxGroupTieredPackage = maxGroupTieredPackage)

                fun ofGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                ) = Price(groupedWithMeteredMinimum = groupedWithMeteredMinimum)

                fun ofMatrixWithDisplayName(
                    matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                ) = Price(matrixWithDisplayName = matrixWithDisplayName)

                fun ofGroupedTieredPackage(
                    groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                ) = Price(groupedTieredPackage = groupedTieredPackage)

                fun ofMatrixWithAllocation(
                    matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                ) = Price(matrixWithAllocation = matrixWithAllocation)

                fun ofTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                ) = Price(tieredPackageWithMinimum = tieredPackageWithMinimum)

                fun ofGroupedTiered(groupedTiered: NewSubscriptionGroupedTieredPrice) =
                    Price(groupedTiered = groupedTiered)
            }

            /**
             * An interface that defines how to map each variant of [Price] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitUnit(unit: NewSubscriptionUnitPrice): T

                fun visitPackage(package_: NewSubscriptionPackagePrice): T

                fun visitMatrix(matrix: NewSubscriptionMatrixPrice): T

                fun visitTiered(tiered: NewSubscriptionTieredPrice): T

                fun visitTieredBps(tieredBps: NewSubscriptionTieredBpsPrice): T

                fun visitBps(bps: NewSubscriptionBpsPrice): T

                fun visitBulkBps(bulkBps: NewSubscriptionBulkBpsPrice): T

                fun visitBulk(bulk: NewSubscriptionBulkPrice): T

                fun visitThresholdTotalAmount(
                    thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                ): T

                fun visitTieredPackage(tieredPackage: NewSubscriptionTieredPackagePrice): T

                fun visitTieredWithMinimum(
                    tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice
                ): T

                fun visitUnitWithPercent(unitWithPercent: NewSubscriptionUnitWithPercentPrice): T

                fun visitPackageWithAllocation(
                    packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                ): T

                fun visitTieredWithProration(
                    tieredWithProration: NewSubscriptionTierWithProrationPrice
                ): T

                fun visitUnitWithProration(
                    unitWithProration: NewSubscriptionUnitWithProrationPrice
                ): T

                fun visitGroupedAllocation(
                    groupedAllocation: NewSubscriptionGroupedAllocationPrice
                ): T

                fun visitGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewSubscriptionGroupedWithProratedMinimumPrice
                ): T

                fun visitBulkWithProration(
                    bulkWithProration: NewSubscriptionBulkWithProrationPrice
                ): T

                fun visitScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewSubscriptionScalableMatrixWithUnitPricingPrice
                ): T

                fun visitScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing:
                        NewSubscriptionScalableMatrixWithTieredPricingPrice
                ): T

                fun visitCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                ): T

                fun visitMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                ): T

                fun visitGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                ): T

                fun visitMatrixWithDisplayName(
                    matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                ): T

                fun visitGroupedTieredPackage(
                    groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                ): T

                fun visitMatrixWithAllocation(
                    matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                ): T

                fun visitTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                ): T

                fun visitGroupedTiered(groupedTiered: NewSubscriptionGroupedTieredPrice): T

                /**
                 * Maps an unknown variant of [Price] to a value of type [T].
                 *
                 * An instance of [Price] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Price: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Price>(Price::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Price {
                    val json = JsonValue.fromJsonNode(node)
                    val modelType = json.asObject()?.get("model_type")?.asString()

                    when (modelType) {
                        "unit" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewSubscriptionUnitPrice>())
                                ?.let { Price(unit = it, _json = json) } ?: Price(_json = json)
                        }
                        "package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionPackagePrice>(),
                                )
                                ?.let { Price(package_ = it, _json = json) } ?: Price(_json = json)
                        }
                        "matrix" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMatrixPrice>(),
                                )
                                ?.let { Price(matrix = it, _json = json) } ?: Price(_json = json)
                        }
                        "tiered" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredPrice>(),
                                )
                                ?.let { Price(tiered = it, _json = json) } ?: Price(_json = json)
                        }
                        "tiered_bps" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredBpsPrice>(),
                                )
                                ?.let { Price(tieredBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewSubscriptionBpsPrice>())
                                ?.let { Price(bps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk_bps" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionBulkBpsPrice>(),
                                )
                                ?.let { Price(bulkBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewSubscriptionBulkPrice>())
                                ?.let { Price(bulk = it, _json = json) } ?: Price(_json = json)
                        }
                        "threshold_total_amount" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionThresholdTotalAmountPrice>(),
                                )
                                ?.let { Price(thresholdTotalAmount = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredPackagePrice>(),
                                )
                                ?.let { Price(tieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_percent" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionUnitWithPercentPrice>(),
                                )
                                ?.let { Price(unitWithPercent = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "package_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionPackageWithAllocationPrice>(),
                                )
                                ?.let { Price(packageWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTierWithProrationPrice>(),
                                )
                                ?.let { Price(tieredWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionUnitWithProrationPrice>(),
                                )
                                ?.let { Price(unitWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedAllocationPrice>(),
                                )
                                ?.let { Price(groupedAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_prorated_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedWithProratedMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithProratedMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "bulk_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionBulkWithProrationPrice>(),
                                )
                                ?.let { Price(bulkWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_unit_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        NewSubscriptionScalableMatrixWithUnitPricingPrice
                                    >(),
                                )
                                ?.let { Price(scalableMatrixWithUnitPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_tiered_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        NewSubscriptionScalableMatrixWithTieredPricingPrice
                                    >(),
                                )
                                ?.let { Price(scalableMatrixWithTieredPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "cumulative_grouped_bulk" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionCumulativeGroupedBulkPrice>(),
                                )
                                ?.let { Price(cumulativeGroupedBulk = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "max_group_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMaxGroupTieredPackagePrice>(),
                                )
                                ?.let { Price(maxGroupTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_metered_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedWithMeteredMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithMeteredMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_display_name" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMatrixWithDisplayNamePrice>(),
                                )
                                ?.let { Price(matrixWithDisplayName = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedTieredPackagePrice>(),
                                )
                                ?.let { Price(groupedTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMatrixWithAllocationPrice>(),
                                )
                                ?.let { Price(matrixWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredPackageWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredPackageWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedTieredPrice>(),
                                )
                                ?.let { Price(groupedTiered = it, _json = json) }
                                ?: Price(_json = json)
                        }
                    }

                    return Price(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Price>(Price::class) {

                override fun serialize(
                    value: Price,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.unit != null -> generator.writeObject(value.unit)
                        value.package_ != null -> generator.writeObject(value.package_)
                        value.matrix != null -> generator.writeObject(value.matrix)
                        value.tiered != null -> generator.writeObject(value.tiered)
                        value.tieredBps != null -> generator.writeObject(value.tieredBps)
                        value.bps != null -> generator.writeObject(value.bps)
                        value.bulkBps != null -> generator.writeObject(value.bulkBps)
                        value.bulk != null -> generator.writeObject(value.bulk)
                        value.thresholdTotalAmount != null ->
                            generator.writeObject(value.thresholdTotalAmount)
                        value.tieredPackage != null -> generator.writeObject(value.tieredPackage)
                        value.tieredWithMinimum != null ->
                            generator.writeObject(value.tieredWithMinimum)
                        value.unitWithPercent != null ->
                            generator.writeObject(value.unitWithPercent)
                        value.packageWithAllocation != null ->
                            generator.writeObject(value.packageWithAllocation)
                        value.tieredWithProration != null ->
                            generator.writeObject(value.tieredWithProration)
                        value.unitWithProration != null ->
                            generator.writeObject(value.unitWithProration)
                        value.groupedAllocation != null ->
                            generator.writeObject(value.groupedAllocation)
                        value.groupedWithProratedMinimum != null ->
                            generator.writeObject(value.groupedWithProratedMinimum)
                        value.bulkWithProration != null ->
                            generator.writeObject(value.bulkWithProration)
                        value.scalableMatrixWithUnitPricing != null ->
                            generator.writeObject(value.scalableMatrixWithUnitPricing)
                        value.scalableMatrixWithTieredPricing != null ->
                            generator.writeObject(value.scalableMatrixWithTieredPricing)
                        value.cumulativeGroupedBulk != null ->
                            generator.writeObject(value.cumulativeGroupedBulk)
                        value.maxGroupTieredPackage != null ->
                            generator.writeObject(value.maxGroupTieredPackage)
                        value.groupedWithMeteredMinimum != null ->
                            generator.writeObject(value.groupedWithMeteredMinimum)
                        value.matrixWithDisplayName != null ->
                            generator.writeObject(value.matrixWithDisplayName)
                        value.groupedTieredPackage != null ->
                            generator.writeObject(value.groupedTieredPackage)
                        value.matrixWithAllocation != null ->
                            generator.writeObject(value.matrixWithAllocation)
                        value.tieredPackageWithMinimum != null ->
                            generator.writeObject(value.tieredPackageWithMinimum)
                        value.groupedTiered != null -> generator.writeObject(value.groupedTiered)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Price")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReplacePrice &&
                replacesPriceId == other.replacesPriceId &&
                allocationPrice == other.allocationPrice &&
                discounts == other.discounts &&
                externalPriceId == other.externalPriceId &&
                fixedPriceQuantity == other.fixedPriceQuantity &&
                maximumAmount == other.maximumAmount &&
                minimumAmount == other.minimumAmount &&
                price == other.price &&
                priceId == other.priceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                replacesPriceId,
                allocationPrice,
                discounts,
                externalPriceId,
                fixedPriceQuantity,
                maximumAmount,
                minimumAmount,
                price,
                priceId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReplacePrice{replacesPriceId=$replacesPriceId, allocationPrice=$allocationPrice, discounts=$discounts, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, maximumAmount=$maximumAmount, minimumAmount=$minimumAmount, price=$price, priceId=$priceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
