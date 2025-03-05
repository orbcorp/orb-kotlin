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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * This endpoint can be used to change an existing subscription's plan. It returns the serialized
 * updated subscription object.
 *
 * The body parameter `change_option` determines when the plan change occurrs. Orb supports three
 * options:
 * - `end_of_subscription_term`: changes the plan at the end of the existing plan's term.
 *     - Issuing this plan change request for a monthly subscription will keep the existing plan
 *       active until the start of the subsequent month. Issuing this plan change request for a
 *       yearly subscription will keep the existing plan active for the full year. Charges incurred
 *       in the remaining period will be invoiced as normal.
 *     - Example: The plan is billed monthly on the 1st of the month, the request is made on January
 *       15th, so the plan will be changed on February 1st, and invoice will be issued on February
 *       1st for the last month of the original plan.
 * - `immediate`: changes the plan immediately.
 *     - Subscriptions that have their plan changed with this option will move to the new plan
 *       immediately, and be invoiced immediately.
 *     - This invoice will include any usage fees incurred in the billing period up to the change,
 *       along with any prorated recurring fees for the billing period, if applicable.
 *     - Example: The plan is billed monthly on the 1st of the month, the request is made on January
 *       15th, so the plan will be changed on January 15th, and an invoice will be issued for the
 *       partial month, from January 1 to January 15, on the original plan.
 * - `requested_date`: changes the plan on the requested date (`change_date`).
 *     - If no timezone is provided, the customer's timezone is used. The `change_date` body
 *       parameter is required if this option is chosen.
 *     - Example: The plan is billed monthly on the 1st of the month, the request is made on January
 *       15th, with a requested `change_date` of February 15th, so the plan will be changed on
 *       February 15th, and invoices will be issued on February 1st and February 15th.
 *
 * Note that one of `plan_id` or `external_plan_id` is required in the request body for this
 * operation.
 *
 * ## Customize your customer's subscriptions
 *
 * Prices and adjustments in a plan can be added, removed, or replaced on the subscription when you
 * schedule the plan change. This is useful when a customer has prices that differ from the default
 * prices for a specific plan.
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
 * An object in the list can specify an optional `start_date` and optional `end_date`. If
 * `start_date` is unspecified, the start of the phase / plan change time will be used. If
 * `end_date` is unspecified, it will finish at the end of the phase / have no end time.
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
 * `start_date` is unspecified, the start of the phase / plan change time will be used. If
 * `end_date` is unspecified, it will finish at the end of the phase / have no end time.
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
 * [Customize your customer's subscriptions](/api-reference/subscription/schedule-plan-change))
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
 * ### Maximums, and minimums
 *
 * Price overrides are used to update some or all prices in the target plan. Minimums and maximums,
 * much like price overrides, can be useful when a new customer has negotiated a new or different
 * minimum or maximum spend cap than the default for the plan. The request format for maximums and
 * minimums is the same as those in [subscription creation](create-subscription).
 *
 * ## Scheduling multiple plan changes
 *
 * When scheduling multiple plan changes with the same date, the latest plan change on that day
 * takes effect.
 *
 * ## Prorations for in-advance fees
 *
 * By default, Orb calculates the prorated difference in any fixed fees when making a plan change,
 * adjusting the customer balance as needed. For details on this behavior, see
 * [Modifying subscriptions](/product-catalog/modifying-subscriptions#prorations-for-in-advance-fees).
 */
class SubscriptionSchedulePlanChangeParams
private constructor(
    private val subscriptionId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): String = subscriptionId

    fun changeOption(): ChangeOption = body.changeOption()

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

    /**
     * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned with
     * the plan change's effective date.
     */
    fun alignBillingWithPlanChangeDate(): Boolean? = body.alignBillingWithPlanChangeDate()

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. If not specified, this defaults to the behavior
     * configured for this customer.
     */
    fun autoCollection(): Boolean? = body.autoCollection()

    /**
     * Reset billing periods to be aligned with the plan change's effective date or start of the
     * month. Defaults to `unchanged` which keeps subscription's existing billing cycle alignment.
     */
    fun billingCycleAlignment(): BillingCycleAlignment? = body.billingCycleAlignment()

    fun billingCycleAnchorConfiguration(): BillingCycleAnchorConfigurationModel? =
        body.billingCycleAnchorConfiguration()

    /**
     * The date that the plan change should take effect. This parameter can only be passed if the
     * `change_option` is `requested_date`. If a date with no time is passed, the plan change will
     * happen at midnight in the customer's timezone.
     */
    fun changeDate(): OffsetDateTime? = body.changeDate()

    /**
     * Redemption code to be used for this subscription. If the coupon cannot be found by its
     * redemption code, or cannot be redeemed, an error response will be returned and the
     * subscription creation or plan change will not be scheduled.
     */
    fun couponRedemptionCode(): String? = body.couponRedemptionCode()

    @Deprecated("deprecated") fun creditsOverageRate(): Double? = body.creditsOverageRate()

    /**
     * Determines the default memo on this subscription's invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     */
    fun defaultInvoiceMemo(): String? = body.defaultInvoiceMemo()

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
     * Specifies which version of the plan to change to. If null, the default version will be used.
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

    fun _changeOption(): JsonField<ChangeOption> = body._changeOption()

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

    /**
     * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned with
     * the plan change's effective date.
     */
    fun _alignBillingWithPlanChangeDate(): JsonField<Boolean> =
        body._alignBillingWithPlanChangeDate()

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. If not specified, this defaults to the behavior
     * configured for this customer.
     */
    fun _autoCollection(): JsonField<Boolean> = body._autoCollection()

    /**
     * Reset billing periods to be aligned with the plan change's effective date or start of the
     * month. Defaults to `unchanged` which keeps subscription's existing billing cycle alignment.
     */
    fun _billingCycleAlignment(): JsonField<BillingCycleAlignment> = body._billingCycleAlignment()

    fun _billingCycleAnchorConfiguration(): JsonField<BillingCycleAnchorConfigurationModel> =
        body._billingCycleAnchorConfiguration()

    /**
     * The date that the plan change should take effect. This parameter can only be passed if the
     * `change_option` is `requested_date`. If a date with no time is passed, the plan change will
     * happen at midnight in the customer's timezone.
     */
    fun _changeDate(): JsonField<OffsetDateTime> = body._changeDate()

    /**
     * Redemption code to be used for this subscription. If the coupon cannot be found by its
     * redemption code, or cannot be redeemed, an error response will be returned and the
     * subscription creation or plan change will not be scheduled.
     */
    fun _couponRedemptionCode(): JsonField<String> = body._couponRedemptionCode()

    @Deprecated("deprecated")
    fun _creditsOverageRate(): JsonField<Double> = body._creditsOverageRate()

    /**
     * Determines the default memo on this subscription's invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     */
    fun _defaultInvoiceMemo(): JsonField<String> = body._defaultInvoiceMemo()

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
     * Specifies which version of the plan to change to. If null, the default version will be used.
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

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("change_option")
        @ExcludeMissing
        private val changeOption: JsonField<ChangeOption> = JsonMissing.of(),
        @JsonProperty("add_adjustments")
        @ExcludeMissing
        private val addAdjustments: JsonField<List<AddSubscriptionAdjustmentParams>> =
            JsonMissing.of(),
        @JsonProperty("add_prices")
        @ExcludeMissing
        private val addPrices: JsonField<List<AddSubscriptionPriceParams>> = JsonMissing.of(),
        @JsonProperty("align_billing_with_plan_change_date")
        @ExcludeMissing
        private val alignBillingWithPlanChangeDate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("auto_collection")
        @ExcludeMissing
        private val autoCollection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("billing_cycle_alignment")
        @ExcludeMissing
        private val billingCycleAlignment: JsonField<BillingCycleAlignment> = JsonMissing.of(),
        @JsonProperty("billing_cycle_anchor_configuration")
        @ExcludeMissing
        private val billingCycleAnchorConfiguration:
            JsonField<BillingCycleAnchorConfigurationModel> =
            JsonMissing.of(),
        @JsonProperty("change_date")
        @ExcludeMissing
        private val changeDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("coupon_redemption_code")
        @ExcludeMissing
        private val couponRedemptionCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credits_overage_rate")
        @ExcludeMissing
        private val creditsOverageRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("default_invoice_memo")
        @ExcludeMissing
        private val defaultInvoiceMemo: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("trial_duration_days")
        @ExcludeMissing
        private val trialDurationDays: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        private val usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun changeOption(): ChangeOption = changeOption.getRequired("change_option")

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

        /**
         * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned
         * with the plan change's effective date.
         */
        fun alignBillingWithPlanChangeDate(): Boolean? =
            alignBillingWithPlanChangeDate.getNullable("align_billing_with_plan_change_date")

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. If not specified, this defaults to the
         * behavior configured for this customer.
         */
        fun autoCollection(): Boolean? = autoCollection.getNullable("auto_collection")

        /**
         * Reset billing periods to be aligned with the plan change's effective date or start of the
         * month. Defaults to `unchanged` which keeps subscription's existing billing cycle
         * alignment.
         */
        fun billingCycleAlignment(): BillingCycleAlignment? =
            billingCycleAlignment.getNullable("billing_cycle_alignment")

        fun billingCycleAnchorConfiguration(): BillingCycleAnchorConfigurationModel? =
            billingCycleAnchorConfiguration.getNullable("billing_cycle_anchor_configuration")

        /**
         * The date that the plan change should take effect. This parameter can only be passed if
         * the `change_option` is `requested_date`. If a date with no time is passed, the plan
         * change will happen at midnight in the customer's timezone.
         */
        fun changeDate(): OffsetDateTime? = changeDate.getNullable("change_date")

        /**
         * Redemption code to be used for this subscription. If the coupon cannot be found by its
         * redemption code, or cannot be redeemed, an error response will be returned and the
         * subscription creation or plan change will not be scheduled.
         */
        fun couponRedemptionCode(): String? =
            couponRedemptionCode.getNullable("coupon_redemption_code")

        @Deprecated("deprecated")
        fun creditsOverageRate(): Double? = creditsOverageRate.getNullable("credits_overage_rate")

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(): String? = defaultInvoiceMemo.getNullable("default_invoice_memo")

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
         * Specifies which version of the plan to change to. If null, the default version will be
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

        @JsonProperty("change_option")
        @ExcludeMissing
        fun _changeOption(): JsonField<ChangeOption> = changeOption

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

        /**
         * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned
         * with the plan change's effective date.
         */
        @JsonProperty("align_billing_with_plan_change_date")
        @ExcludeMissing
        fun _alignBillingWithPlanChangeDate(): JsonField<Boolean> = alignBillingWithPlanChangeDate

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. If not specified, this defaults to the
         * behavior configured for this customer.
         */
        @JsonProperty("auto_collection")
        @ExcludeMissing
        fun _autoCollection(): JsonField<Boolean> = autoCollection

        /**
         * Reset billing periods to be aligned with the plan change's effective date or start of the
         * month. Defaults to `unchanged` which keeps subscription's existing billing cycle
         * alignment.
         */
        @JsonProperty("billing_cycle_alignment")
        @ExcludeMissing
        fun _billingCycleAlignment(): JsonField<BillingCycleAlignment> = billingCycleAlignment

        @JsonProperty("billing_cycle_anchor_configuration")
        @ExcludeMissing
        fun _billingCycleAnchorConfiguration(): JsonField<BillingCycleAnchorConfigurationModel> =
            billingCycleAnchorConfiguration

        /**
         * The date that the plan change should take effect. This parameter can only be passed if
         * the `change_option` is `requested_date`. If a date with no time is passed, the plan
         * change will happen at midnight in the customer's timezone.
         */
        @JsonProperty("change_date")
        @ExcludeMissing
        fun _changeDate(): JsonField<OffsetDateTime> = changeDate

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

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        @JsonProperty("default_invoice_memo")
        @ExcludeMissing
        fun _defaultInvoiceMemo(): JsonField<String> = defaultInvoiceMemo

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
         * Specifies which version of the plan to change to. If null, the default version will be
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

            changeOption()
            addAdjustments()?.forEach { it.validate() }
            addPrices()?.forEach { it.validate() }
            alignBillingWithPlanChangeDate()
            autoCollection()
            billingCycleAlignment()
            billingCycleAnchorConfiguration()?.validate()
            changeDate()
            couponRedemptionCode()
            creditsOverageRate()
            defaultInvoiceMemo()
            externalPlanId()
            filter()
            initialPhaseOrder()
            invoicingThreshold()
            netTerms()
            perCreditOverageAmount()
            planId()
            planVersionNumber()
            priceOverrides()
            removeAdjustments()?.forEach { it.validate() }
            removePrices()?.forEach { it.validate() }
            replaceAdjustments()?.forEach { it.validate() }
            replacePrices()?.forEach { it.validate() }
            trialDurationDays()
            usageCustomerIds()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .changeOption()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var changeOption: JsonField<ChangeOption>? = null
            private var addAdjustments: JsonField<MutableList<AddSubscriptionAdjustmentParams>>? =
                null
            private var addPrices: JsonField<MutableList<AddSubscriptionPriceParams>>? = null
            private var alignBillingWithPlanChangeDate: JsonField<Boolean> = JsonMissing.of()
            private var autoCollection: JsonField<Boolean> = JsonMissing.of()
            private var billingCycleAlignment: JsonField<BillingCycleAlignment> = JsonMissing.of()
            private var billingCycleAnchorConfiguration:
                JsonField<BillingCycleAnchorConfigurationModel> =
                JsonMissing.of()
            private var changeDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var couponRedemptionCode: JsonField<String> = JsonMissing.of()
            private var creditsOverageRate: JsonField<Double> = JsonMissing.of()
            private var defaultInvoiceMemo: JsonField<String> = JsonMissing.of()
            private var externalPlanId: JsonField<String> = JsonMissing.of()
            private var filter: JsonField<String> = JsonMissing.of()
            private var initialPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var invoicingThreshold: JsonField<String> = JsonMissing.of()
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
            private var trialDurationDays: JsonField<Long> = JsonMissing.of()
            private var usageCustomerIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                changeOption = body.changeOption
                addAdjustments = body.addAdjustments.map { it.toMutableList() }
                addPrices = body.addPrices.map { it.toMutableList() }
                alignBillingWithPlanChangeDate = body.alignBillingWithPlanChangeDate
                autoCollection = body.autoCollection
                billingCycleAlignment = body.billingCycleAlignment
                billingCycleAnchorConfiguration = body.billingCycleAnchorConfiguration
                changeDate = body.changeDate
                couponRedemptionCode = body.couponRedemptionCode
                creditsOverageRate = body.creditsOverageRate
                defaultInvoiceMemo = body.defaultInvoiceMemo
                externalPlanId = body.externalPlanId
                filter = body.filter
                initialPhaseOrder = body.initialPhaseOrder
                invoicingThreshold = body.invoicingThreshold
                netTerms = body.netTerms
                perCreditOverageAmount = body.perCreditOverageAmount
                planId = body.planId
                planVersionNumber = body.planVersionNumber
                priceOverrides = body.priceOverrides.map { it.toMutableList() }
                removeAdjustments = body.removeAdjustments.map { it.toMutableList() }
                removePrices = body.removePrices.map { it.toMutableList() }
                replaceAdjustments = body.replaceAdjustments.map { it.toMutableList() }
                replacePrices = body.replacePrices.map { it.toMutableList() }
                trialDurationDays = body.trialDurationDays
                usageCustomerIds = body.usageCustomerIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun changeOption(changeOption: ChangeOption) = changeOption(JsonField.of(changeOption))

            fun changeOption(changeOption: JsonField<ChangeOption>) = apply {
                this.changeOption = changeOption
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

            /**
             * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned
             * with the plan change's effective date.
             */
            fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: Boolean?) =
                alignBillingWithPlanChangeDate(JsonField.ofNullable(alignBillingWithPlanChangeDate))

            /**
             * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned
             * with the plan change's effective date.
             */
            fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: Boolean) =
                alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate as Boolean?)

            /**
             * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned
             * with the plan change's effective date.
             */
            fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: JsonField<Boolean>) =
                apply {
                    this.alignBillingWithPlanChangeDate = alignBillingWithPlanChangeDate
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

            /**
             * Reset billing periods to be aligned with the plan change's effective date or start of
             * the month. Defaults to `unchanged` which keeps subscription's existing billing cycle
             * alignment.
             */
            fun billingCycleAlignment(billingCycleAlignment: BillingCycleAlignment?) =
                billingCycleAlignment(JsonField.ofNullable(billingCycleAlignment))

            /**
             * Reset billing periods to be aligned with the plan change's effective date or start of
             * the month. Defaults to `unchanged` which keeps subscription's existing billing cycle
             * alignment.
             */
            fun billingCycleAlignment(billingCycleAlignment: JsonField<BillingCycleAlignment>) =
                apply {
                    this.billingCycleAlignment = billingCycleAlignment
                }

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
             * The date that the plan change should take effect. This parameter can only be passed
             * if the `change_option` is `requested_date`. If a date with no time is passed, the
             * plan change will happen at midnight in the customer's timezone.
             */
            fun changeDate(changeDate: OffsetDateTime?) =
                changeDate(JsonField.ofNullable(changeDate))

            /**
             * The date that the plan change should take effect. This parameter can only be passed
             * if the `change_option` is `requested_date`. If a date with no time is passed, the
             * plan change will happen at midnight in the customer's timezone.
             */
            fun changeDate(changeDate: JsonField<OffsetDateTime>) = apply {
                this.changeDate = changeDate
            }

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
             * Specifies which version of the plan to change to. If null, the default version will
             * be used.
             */
            fun planVersionNumber(planVersionNumber: Long?) =
                planVersionNumber(JsonField.ofNullable(planVersionNumber))

            /**
             * Specifies which version of the plan to change to. If null, the default version will
             * be used.
             */
            fun planVersionNumber(planVersionNumber: Long) =
                planVersionNumber(planVersionNumber as Long?)

            /**
             * Specifies which version of the plan to change to. If null, the default version will
             * be used.
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
                    checkRequired("changeOption", changeOption),
                    (addAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    (addPrices ?: JsonMissing.of()).map { it.toImmutable() },
                    alignBillingWithPlanChangeDate,
                    autoCollection,
                    billingCycleAlignment,
                    billingCycleAnchorConfiguration,
                    changeDate,
                    couponRedemptionCode,
                    creditsOverageRate,
                    defaultInvoiceMemo,
                    externalPlanId,
                    filter,
                    initialPhaseOrder,
                    invoicingThreshold,
                    netTerms,
                    perCreditOverageAmount,
                    planId,
                    planVersionNumber,
                    (priceOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                    (removeAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    (removePrices ?: JsonMissing.of()).map { it.toImmutable() },
                    (replaceAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    (replacePrices ?: JsonMissing.of()).map { it.toImmutable() },
                    trialDurationDays,
                    (usageCustomerIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && changeOption == other.changeOption && addAdjustments == other.addAdjustments && addPrices == other.addPrices && alignBillingWithPlanChangeDate == other.alignBillingWithPlanChangeDate && autoCollection == other.autoCollection && billingCycleAlignment == other.billingCycleAlignment && billingCycleAnchorConfiguration == other.billingCycleAnchorConfiguration && changeDate == other.changeDate && couponRedemptionCode == other.couponRedemptionCode && creditsOverageRate == other.creditsOverageRate && defaultInvoiceMemo == other.defaultInvoiceMemo && externalPlanId == other.externalPlanId && filter == other.filter && initialPhaseOrder == other.initialPhaseOrder && invoicingThreshold == other.invoicingThreshold && netTerms == other.netTerms && perCreditOverageAmount == other.perCreditOverageAmount && planId == other.planId && planVersionNumber == other.planVersionNumber && priceOverrides == other.priceOverrides && removeAdjustments == other.removeAdjustments && removePrices == other.removePrices && replaceAdjustments == other.replaceAdjustments && replacePrices == other.replacePrices && trialDurationDays == other.trialDurationDays && usageCustomerIds == other.usageCustomerIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(changeOption, addAdjustments, addPrices, alignBillingWithPlanChangeDate, autoCollection, billingCycleAlignment, billingCycleAnchorConfiguration, changeDate, couponRedemptionCode, creditsOverageRate, defaultInvoiceMemo, externalPlanId, filter, initialPhaseOrder, invoicingThreshold, netTerms, perCreditOverageAmount, planId, planVersionNumber, priceOverrides, removeAdjustments, removePrices, replaceAdjustments, replacePrices, trialDurationDays, usageCustomerIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{changeOption=$changeOption, addAdjustments=$addAdjustments, addPrices=$addPrices, alignBillingWithPlanChangeDate=$alignBillingWithPlanChangeDate, autoCollection=$autoCollection, billingCycleAlignment=$billingCycleAlignment, billingCycleAnchorConfiguration=$billingCycleAnchorConfiguration, changeDate=$changeDate, couponRedemptionCode=$couponRedemptionCode, creditsOverageRate=$creditsOverageRate, defaultInvoiceMemo=$defaultInvoiceMemo, externalPlanId=$externalPlanId, filter=$filter, initialPhaseOrder=$initialPhaseOrder, invoicingThreshold=$invoicingThreshold, netTerms=$netTerms, perCreditOverageAmount=$perCreditOverageAmount, planId=$planId, planVersionNumber=$planVersionNumber, priceOverrides=$priceOverrides, removeAdjustments=$removeAdjustments, removePrices=$removePrices, replaceAdjustments=$replaceAdjustments, replacePrices=$replacePrices, trialDurationDays=$trialDurationDays, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionSchedulePlanChangeParams].
         *
         * The following fields are required:
         * ```kotlin
         * .subscriptionId()
         * .changeOption()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionSchedulePlanChangeParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            subscriptionSchedulePlanChangeParams: SubscriptionSchedulePlanChangeParams
        ) = apply {
            subscriptionId = subscriptionSchedulePlanChangeParams.subscriptionId
            body = subscriptionSchedulePlanChangeParams.body.toBuilder()
            additionalHeaders = subscriptionSchedulePlanChangeParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                subscriptionSchedulePlanChangeParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        fun changeOption(changeOption: ChangeOption) = apply { body.changeOption(changeOption) }

        fun changeOption(changeOption: JsonField<ChangeOption>) = apply {
            body.changeOption(changeOption)
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

        /**
         * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned
         * with the plan change's effective date.
         */
        fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: Boolean?) = apply {
            body.alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate)
        }

        /**
         * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned
         * with the plan change's effective date.
         */
        fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: Boolean) =
            alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate as Boolean?)

        /**
         * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned
         * with the plan change's effective date.
         */
        fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: JsonField<Boolean>) =
            apply {
                body.alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate)
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

        /**
         * Reset billing periods to be aligned with the plan change's effective date or start of the
         * month. Defaults to `unchanged` which keeps subscription's existing billing cycle
         * alignment.
         */
        fun billingCycleAlignment(billingCycleAlignment: BillingCycleAlignment?) = apply {
            body.billingCycleAlignment(billingCycleAlignment)
        }

        /**
         * Reset billing periods to be aligned with the plan change's effective date or start of the
         * month. Defaults to `unchanged` which keeps subscription's existing billing cycle
         * alignment.
         */
        fun billingCycleAlignment(billingCycleAlignment: JsonField<BillingCycleAlignment>) = apply {
            body.billingCycleAlignment(billingCycleAlignment)
        }

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: BillingCycleAnchorConfigurationModel?
        ) = apply { body.billingCycleAnchorConfiguration(billingCycleAnchorConfiguration) }

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfigurationModel>
        ) = apply { body.billingCycleAnchorConfiguration(billingCycleAnchorConfiguration) }

        /**
         * The date that the plan change should take effect. This parameter can only be passed if
         * the `change_option` is `requested_date`. If a date with no time is passed, the plan
         * change will happen at midnight in the customer's timezone.
         */
        fun changeDate(changeDate: OffsetDateTime?) = apply { body.changeDate(changeDate) }

        /**
         * The date that the plan change should take effect. This parameter can only be passed if
         * the `change_option` is `requested_date`. If a date with no time is passed, the plan
         * change will happen at midnight in the customer's timezone.
         */
        fun changeDate(changeDate: JsonField<OffsetDateTime>) = apply {
            body.changeDate(changeDate)
        }

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
         * Specifies which version of the plan to change to. If null, the default version will be
         * used.
         */
        fun planVersionNumber(planVersionNumber: Long?) = apply {
            body.planVersionNumber(planVersionNumber)
        }

        /**
         * Specifies which version of the plan to change to. If null, the default version will be
         * used.
         */
        fun planVersionNumber(planVersionNumber: Long) =
            planVersionNumber(planVersionNumber as Long?)

        /**
         * Specifies which version of the plan to change to. If null, the default version will be
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

        fun build(): SubscriptionSchedulePlanChangeParams =
            SubscriptionSchedulePlanChangeParams(
                checkRequired("subscriptionId", subscriptionId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class ChangeOption @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val REQUESTED_DATE = of("requested_date")

            val END_OF_SUBSCRIPTION_TERM = of("end_of_subscription_term")

            val IMMEDIATE = of("immediate")

            fun of(value: String) = ChangeOption(JsonField.of(value))
        }

        /** An enum containing [ChangeOption]'s known values. */
        enum class Known {
            REQUESTED_DATE,
            END_OF_SUBSCRIPTION_TERM,
            IMMEDIATE,
        }

        /**
         * An enum containing [ChangeOption]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ChangeOption] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REQUESTED_DATE,
            END_OF_SUBSCRIPTION_TERM,
            IMMEDIATE,
            /**
             * An enum member indicating that [ChangeOption] was instantiated with an unknown value.
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
                REQUESTED_DATE -> Value.REQUESTED_DATE
                END_OF_SUBSCRIPTION_TERM -> Value.END_OF_SUBSCRIPTION_TERM
                IMMEDIATE -> Value.IMMEDIATE
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
                REQUESTED_DATE -> Known.REQUESTED_DATE
                END_OF_SUBSCRIPTION_TERM -> Known.END_OF_SUBSCRIPTION_TERM
                IMMEDIATE -> Known.IMMEDIATE
                else -> throw OrbInvalidDataException("Unknown ChangeOption: $value")
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

            return /* spotless:off */ other is ChangeOption && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Reset billing periods to be aligned with the plan change's effective date or start of the
     * month. Defaults to `unchanged` which keeps subscription's existing billing cycle alignment.
     */
    class BillingCycleAlignment
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

            val UNCHANGED = of("unchanged")

            val PLAN_CHANGE_DATE = of("plan_change_date")

            val START_OF_MONTH = of("start_of_month")

            fun of(value: String) = BillingCycleAlignment(JsonField.of(value))
        }

        /** An enum containing [BillingCycleAlignment]'s known values. */
        enum class Known {
            UNCHANGED,
            PLAN_CHANGE_DATE,
            START_OF_MONTH,
        }

        /**
         * An enum containing [BillingCycleAlignment]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [BillingCycleAlignment] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNCHANGED,
            PLAN_CHANGE_DATE,
            START_OF_MONTH,
            /**
             * An enum member indicating that [BillingCycleAlignment] was instantiated with an
             * unknown value.
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
                UNCHANGED -> Value.UNCHANGED
                PLAN_CHANGE_DATE -> Value.PLAN_CHANGE_DATE
                START_OF_MONTH -> Value.START_OF_MONTH
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
                UNCHANGED -> Known.UNCHANGED
                PLAN_CHANGE_DATE -> Known.PLAN_CHANGE_DATE
                START_OF_MONTH -> Known.START_OF_MONTH
                else -> throw OrbInvalidDataException("Unknown BillingCycleAlignment: $value")
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

            return /* spotless:off */ other is BillingCycleAlignment && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionSchedulePlanChangeParams && subscriptionId == other.subscriptionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionSchedulePlanChangeParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
