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

/**
 * A [subscription](/core-concepts#subscription) represents the purchase of a plan by a customer.
 *
 * By default, subscriptions begin on the day that they're created and renew automatically for each
 * billing cycle at the cadence that's configured in the plan definition.
 *
 * Subscriptions also default to **beginning of month alignment**, which means the first invoice
 * issued for the subscription will have pro-rated charges between the `start_date` and the first of
 * the following month. Subsequent billing periods will always start and end on a month boundary
 * (e.g. subsequent month starts for monthly billing).
 *
 * Depending on the plan configuration, any _flat_ recurring fees will be billed either at the
 * beginning (in-advance) or end (in-arrears) of each billing cycle. Plans default to **in-advance
 * billing**. Usage-based fees are billed in arrears as usage is accumulated. In the normal course
 * of events, you can expect an invoice to contain usage-based charges for the previous period, and
 * a recurring fee for the following period.
 */
class Subscription
private constructor(
    private val id: JsonField<String>,
    private val activePlanPhaseOrder: JsonField<Long>,
    private val adjustmentIntervals: JsonField<List<AdjustmentInterval>>,
    private val autoCollection: JsonField<Boolean>,
    private val billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>,
    private val billingCycleDay: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currentBillingPeriodEndDate: JsonField<OffsetDateTime>,
    private val currentBillingPeriodStartDate: JsonField<OffsetDateTime>,
    private val customer: JsonField<Customer>,
    private val defaultInvoiceMemo: JsonField<String>,
    private val discountIntervals: JsonField<List<DiscountInterval>>,
    private val endDate: JsonField<OffsetDateTime>,
    private val fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantityScheduleEntry>>,
    private val invoicingThreshold: JsonField<String>,
    private val maximumIntervals: JsonField<List<MaximumInterval>>,
    private val metadata: JsonField<Metadata>,
    private val minimumIntervals: JsonField<List<MinimumInterval>>,
    private val name: JsonField<String>,
    private val netTerms: JsonField<Long>,
    private val pendingSubscriptionChange: JsonField<SubscriptionChangeMinified>,
    private val plan: JsonField<Plan>,
    private val priceIntervals: JsonField<List<PriceInterval>>,
    private val redeemedCoupon: JsonField<CouponRedemption>,
    private val startDate: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val trialInfo: JsonField<SubscriptionTrialInfo>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active_plan_phase_order")
        @ExcludeMissing
        activePlanPhaseOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("adjustment_intervals")
        @ExcludeMissing
        adjustmentIntervals: JsonField<List<AdjustmentInterval>> = JsonMissing.of(),
        @JsonProperty("auto_collection")
        @ExcludeMissing
        autoCollection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("billing_cycle_anchor_configuration")
        @ExcludeMissing
        billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration> =
            JsonMissing.of(),
        @JsonProperty("billing_cycle_day")
        @ExcludeMissing
        billingCycleDay: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("current_billing_period_end_date")
        @ExcludeMissing
        currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("current_billing_period_start_date")
        @ExcludeMissing
        currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer") @ExcludeMissing customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("default_invoice_memo")
        @ExcludeMissing
        defaultInvoiceMemo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_intervals")
        @ExcludeMissing
        discountIntervals: JsonField<List<DiscountInterval>> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fixed_fee_quantity_schedule")
        @ExcludeMissing
        fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantityScheduleEntry>> = JsonMissing.of(),
        @JsonProperty("invoicing_threshold")
        @ExcludeMissing
        invoicingThreshold: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maximum_intervals")
        @ExcludeMissing
        maximumIntervals: JsonField<List<MaximumInterval>> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("minimum_intervals")
        @ExcludeMissing
        minimumIntervals: JsonField<List<MinimumInterval>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_terms") @ExcludeMissing netTerms: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pending_subscription_change")
        @ExcludeMissing
        pendingSubscriptionChange: JsonField<SubscriptionChangeMinified> = JsonMissing.of(),
        @JsonProperty("plan") @ExcludeMissing plan: JsonField<Plan> = JsonMissing.of(),
        @JsonProperty("price_intervals")
        @ExcludeMissing
        priceIntervals: JsonField<List<PriceInterval>> = JsonMissing.of(),
        @JsonProperty("redeemed_coupon")
        @ExcludeMissing
        redeemedCoupon: JsonField<CouponRedemption> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("trial_info")
        @ExcludeMissing
        trialInfo: JsonField<SubscriptionTrialInfo> = JsonMissing.of(),
    ) : this(
        id,
        activePlanPhaseOrder,
        adjustmentIntervals,
        autoCollection,
        billingCycleAnchorConfiguration,
        billingCycleDay,
        createdAt,
        currentBillingPeriodEndDate,
        currentBillingPeriodStartDate,
        customer,
        defaultInvoiceMemo,
        discountIntervals,
        endDate,
        fixedFeeQuantitySchedule,
        invoicingThreshold,
        maximumIntervals,
        metadata,
        minimumIntervals,
        name,
        netTerms,
        pendingSubscriptionChange,
        plan,
        priceIntervals,
        redeemedCoupon,
        startDate,
        status,
        trialInfo,
        mutableMapOf(),
    )

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The current plan phase that is active, only if the subscription's plan has phases.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun activePlanPhaseOrder(): Long? = activePlanPhaseOrder.getNullable("active_plan_phase_order")

    /**
     * The adjustment intervals for this subscription sorted by the start_date of the adjustment
     * interval.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun adjustmentIntervals(): List<AdjustmentInterval> =
        adjustmentIntervals.getRequired("adjustment_intervals")

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. This property defaults to the plan's behavior. If
     * null, defaults to the customer's setting.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun autoCollection(): Boolean? = autoCollection.getNullable("auto_collection")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingCycleAnchorConfiguration(): BillingCycleAnchorConfiguration =
        billingCycleAnchorConfiguration.getRequired("billing_cycle_anchor_configuration")

    /**
     * The day of the month on which the billing cycle is anchored. If the maximum number of days in
     * a month is greater than this value, the last day of the month is the billing cycle day (e.g.
     * billing_cycle_day=31 for April means the billing period begins on the 30th.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingCycleDay(): Long = billingCycleDay.getRequired("billing_cycle_day")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The end of the current billing period. This is an exclusive timestamp, such that the instant
     * returned is not part of the billing period. Set to null for subscriptions that are not
     * currently active.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currentBillingPeriodEndDate(): OffsetDateTime? =
        currentBillingPeriodEndDate.getNullable("current_billing_period_end_date")

    /**
     * The start date of the current billing period. This is an inclusive timestamp; the instant
     * returned is exactly the beginning of the billing period. Set to null if the subscription is
     * not currently active.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currentBillingPeriodStartDate(): OffsetDateTime? =
        currentBillingPeriodStartDate.getNullable("current_billing_period_start_date")

    /**
     * A customer is a buyer of your products, and the other party to the billing relationship.
     *
     * In Orb, customers are assigned system generated identifiers automatically, but it's often
     * desirable to have these match existing identifiers in your system. To avoid having to
     * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
     * identifier. See [Customer ID Aliases](/events-and-metrics/customer-aliases) for further
     * information about how these aliases work in Orb.
     *
     * In addition to having an identifier in your system, a customer may exist in a payment
     * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider` enum
     * field to express this mapping.
     *
     * A customer also has a timezone (from the standard
     * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your account's
     * timezone. See [Timezone localization](/essentials/timezones) for information on what this
     * timezone parameter influences within Orb.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): Customer = customer.getRequired("customer")

    /**
     * Determines the default memo on this subscriptions' invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun defaultInvoiceMemo(): String? = defaultInvoiceMemo.getNullable("default_invoice_memo")

    /**
     * The discount intervals for this subscription sorted by the start_date.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun discountIntervals(): List<DiscountInterval> =
        discountIntervals.getRequired("discount_intervals")

    /**
     * The date Orb stops billing for this subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fixedFeeQuantitySchedule(): List<FixedFeeQuantityScheduleEntry> =
        fixedFeeQuantitySchedule.getRequired("fixed_fee_quantity_schedule")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun invoicingThreshold(): String? = invoicingThreshold.getNullable("invoicing_threshold")

    /**
     * The maximum intervals for this subscription sorted by the start_date.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun maximumIntervals(): List<MaximumInterval> =
        maximumIntervals.getRequired("maximum_intervals")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * The minimum intervals for this subscription sorted by the start_date.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun minimumIntervals(): List<MinimumInterval> =
        minimumIntervals.getRequired("minimum_intervals")

    /**
     * The name of the subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Determines the difference between the invoice issue date for subscription invoices as the
     * date that they are due. A value of `0` here represents that the invoice is due on issue,
     * whereas a value of `30` represents that the customer has a month to pay the invoice.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun netTerms(): Long = netTerms.getRequired("net_terms")

    /**
     * A pending subscription change if one exists on this subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun pendingSubscriptionChange(): SubscriptionChangeMinified? =
        pendingSubscriptionChange.getNullable("pending_subscription_change")

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun plan(): Plan? = plan.getNullable("plan")

    /**
     * The price intervals for this subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun priceIntervals(): List<PriceInterval> = priceIntervals.getRequired("price_intervals")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun redeemedCoupon(): CouponRedemption? = redeemedCoupon.getNullable("redeemed_coupon")

    /**
     * The date Orb starts billing for this subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trialInfo(): SubscriptionTrialInfo = trialInfo.getRequired("trial_info")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [activePlanPhaseOrder].
     *
     * Unlike [activePlanPhaseOrder], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("active_plan_phase_order")
    @ExcludeMissing
    fun _activePlanPhaseOrder(): JsonField<Long> = activePlanPhaseOrder

    /**
     * Returns the raw JSON value of [adjustmentIntervals].
     *
     * Unlike [adjustmentIntervals], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("adjustment_intervals")
    @ExcludeMissing
    fun _adjustmentIntervals(): JsonField<List<AdjustmentInterval>> = adjustmentIntervals

    /**
     * Returns the raw JSON value of [autoCollection].
     *
     * Unlike [autoCollection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auto_collection")
    @ExcludeMissing
    fun _autoCollection(): JsonField<Boolean> = autoCollection

    /**
     * Returns the raw JSON value of [billingCycleAnchorConfiguration].
     *
     * Unlike [billingCycleAnchorConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("billing_cycle_anchor_configuration")
    @ExcludeMissing
    fun _billingCycleAnchorConfiguration(): JsonField<BillingCycleAnchorConfiguration> =
        billingCycleAnchorConfiguration

    /**
     * Returns the raw JSON value of [billingCycleDay].
     *
     * Unlike [billingCycleDay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_cycle_day")
    @ExcludeMissing
    fun _billingCycleDay(): JsonField<Long> = billingCycleDay

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

    /**
     * Returns the raw JSON value of [defaultInvoiceMemo].
     *
     * Unlike [defaultInvoiceMemo], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_invoice_memo")
    @ExcludeMissing
    fun _defaultInvoiceMemo(): JsonField<String> = defaultInvoiceMemo

    /**
     * Returns the raw JSON value of [discountIntervals].
     *
     * Unlike [discountIntervals], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("discount_intervals")
    @ExcludeMissing
    fun _discountIntervals(): JsonField<List<DiscountInterval>> = discountIntervals

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [fixedFeeQuantitySchedule].
     *
     * Unlike [fixedFeeQuantitySchedule], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("fixed_fee_quantity_schedule")
    @ExcludeMissing
    fun _fixedFeeQuantitySchedule(): JsonField<List<FixedFeeQuantityScheduleEntry>> =
        fixedFeeQuantitySchedule

    /**
     * Returns the raw JSON value of [invoicingThreshold].
     *
     * Unlike [invoicingThreshold], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("invoicing_threshold")
    @ExcludeMissing
    fun _invoicingThreshold(): JsonField<String> = invoicingThreshold

    /**
     * Returns the raw JSON value of [maximumIntervals].
     *
     * Unlike [maximumIntervals], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("maximum_intervals")
    @ExcludeMissing
    fun _maximumIntervals(): JsonField<List<MaximumInterval>> = maximumIntervals

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [minimumIntervals].
     *
     * Unlike [minimumIntervals], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("minimum_intervals")
    @ExcludeMissing
    fun _minimumIntervals(): JsonField<List<MinimumInterval>> = minimumIntervals

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
     * Returns the raw JSON value of [pendingSubscriptionChange].
     *
     * Unlike [pendingSubscriptionChange], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("pending_subscription_change")
    @ExcludeMissing
    fun _pendingSubscriptionChange(): JsonField<SubscriptionChangeMinified> =
        pendingSubscriptionChange

    /**
     * Returns the raw JSON value of [plan].
     *
     * Unlike [plan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

    /**
     * Returns the raw JSON value of [priceIntervals].
     *
     * Unlike [priceIntervals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_intervals")
    @ExcludeMissing
    fun _priceIntervals(): JsonField<List<PriceInterval>> = priceIntervals

    /**
     * Returns the raw JSON value of [redeemedCoupon].
     *
     * Unlike [redeemedCoupon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("redeemed_coupon")
    @ExcludeMissing
    fun _redeemedCoupon(): JsonField<CouponRedemption> = redeemedCoupon

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [trialInfo].
     *
     * Unlike [trialInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial_info")
    @ExcludeMissing
    fun _trialInfo(): JsonField<SubscriptionTrialInfo> = trialInfo

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
         * Returns a mutable builder for constructing an instance of [Subscription].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .activePlanPhaseOrder()
         * .adjustmentIntervals()
         * .autoCollection()
         * .billingCycleAnchorConfiguration()
         * .billingCycleDay()
         * .createdAt()
         * .currentBillingPeriodEndDate()
         * .currentBillingPeriodStartDate()
         * .customer()
         * .defaultInvoiceMemo()
         * .discountIntervals()
         * .endDate()
         * .fixedFeeQuantitySchedule()
         * .invoicingThreshold()
         * .maximumIntervals()
         * .metadata()
         * .minimumIntervals()
         * .name()
         * .netTerms()
         * .pendingSubscriptionChange()
         * .plan()
         * .priceIntervals()
         * .redeemedCoupon()
         * .startDate()
         * .status()
         * .trialInfo()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Subscription]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var activePlanPhaseOrder: JsonField<Long>? = null
        private var adjustmentIntervals: JsonField<MutableList<AdjustmentInterval>>? = null
        private var autoCollection: JsonField<Boolean>? = null
        private var billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>? =
            null
        private var billingCycleDay: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currentBillingPeriodEndDate: JsonField<OffsetDateTime>? = null
        private var currentBillingPeriodStartDate: JsonField<OffsetDateTime>? = null
        private var customer: JsonField<Customer>? = null
        private var defaultInvoiceMemo: JsonField<String>? = null
        private var discountIntervals: JsonField<MutableList<DiscountInterval>>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var fixedFeeQuantitySchedule:
            JsonField<MutableList<FixedFeeQuantityScheduleEntry>>? =
            null
        private var invoicingThreshold: JsonField<String>? = null
        private var maximumIntervals: JsonField<MutableList<MaximumInterval>>? = null
        private var metadata: JsonField<Metadata>? = null
        private var minimumIntervals: JsonField<MutableList<MinimumInterval>>? = null
        private var name: JsonField<String>? = null
        private var netTerms: JsonField<Long>? = null
        private var pendingSubscriptionChange: JsonField<SubscriptionChangeMinified>? = null
        private var plan: JsonField<Plan>? = null
        private var priceIntervals: JsonField<MutableList<PriceInterval>>? = null
        private var redeemedCoupon: JsonField<CouponRedemption>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var trialInfo: JsonField<SubscriptionTrialInfo>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscription: Subscription) = apply {
            id = subscription.id
            activePlanPhaseOrder = subscription.activePlanPhaseOrder
            adjustmentIntervals = subscription.adjustmentIntervals.map { it.toMutableList() }
            autoCollection = subscription.autoCollection
            billingCycleAnchorConfiguration = subscription.billingCycleAnchorConfiguration
            billingCycleDay = subscription.billingCycleDay
            createdAt = subscription.createdAt
            currentBillingPeriodEndDate = subscription.currentBillingPeriodEndDate
            currentBillingPeriodStartDate = subscription.currentBillingPeriodStartDate
            customer = subscription.customer
            defaultInvoiceMemo = subscription.defaultInvoiceMemo
            discountIntervals = subscription.discountIntervals.map { it.toMutableList() }
            endDate = subscription.endDate
            fixedFeeQuantitySchedule =
                subscription.fixedFeeQuantitySchedule.map { it.toMutableList() }
            invoicingThreshold = subscription.invoicingThreshold
            maximumIntervals = subscription.maximumIntervals.map { it.toMutableList() }
            metadata = subscription.metadata
            minimumIntervals = subscription.minimumIntervals.map { it.toMutableList() }
            name = subscription.name
            netTerms = subscription.netTerms
            pendingSubscriptionChange = subscription.pendingSubscriptionChange
            plan = subscription.plan
            priceIntervals = subscription.priceIntervals.map { it.toMutableList() }
            redeemedCoupon = subscription.redeemedCoupon
            startDate = subscription.startDate
            status = subscription.status
            trialInfo = subscription.trialInfo
            additionalProperties = subscription.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The current plan phase that is active, only if the subscription's plan has phases. */
        fun activePlanPhaseOrder(activePlanPhaseOrder: Long?) =
            activePlanPhaseOrder(JsonField.ofNullable(activePlanPhaseOrder))

        /**
         * Alias for [Builder.activePlanPhaseOrder].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun activePlanPhaseOrder(activePlanPhaseOrder: Long) =
            activePlanPhaseOrder(activePlanPhaseOrder as Long?)

        /**
         * Sets [Builder.activePlanPhaseOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activePlanPhaseOrder] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activePlanPhaseOrder(activePlanPhaseOrder: JsonField<Long>) = apply {
            this.activePlanPhaseOrder = activePlanPhaseOrder
        }

        /**
         * The adjustment intervals for this subscription sorted by the start_date of the adjustment
         * interval.
         */
        fun adjustmentIntervals(adjustmentIntervals: List<AdjustmentInterval>) =
            adjustmentIntervals(JsonField.of(adjustmentIntervals))

        /**
         * Sets [Builder.adjustmentIntervals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adjustmentIntervals] with a well-typed
         * `List<AdjustmentInterval>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun adjustmentIntervals(adjustmentIntervals: JsonField<List<AdjustmentInterval>>) = apply {
            this.adjustmentIntervals = adjustmentIntervals.map { it.toMutableList() }
        }

        /**
         * Adds a single [AdjustmentInterval] to [adjustmentIntervals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdjustmentInterval(adjustmentInterval: AdjustmentInterval) = apply {
            adjustmentIntervals =
                (adjustmentIntervals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("adjustmentIntervals", it).add(adjustmentInterval)
                }
        }

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior. If null, defaults to the customer's setting.
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

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration
        ) = billingCycleAnchorConfiguration(JsonField.of(billingCycleAnchorConfiguration))

        /**
         * Sets [Builder.billingCycleAnchorConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCycleAnchorConfiguration] with a well-typed
         * [BillingCycleAnchorConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>
        ) = apply { this.billingCycleAnchorConfiguration = billingCycleAnchorConfiguration }

        /**
         * The day of the month on which the billing cycle is anchored. If the maximum number of
         * days in a month is greater than this value, the last day of the month is the billing
         * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
         * 30th.
         */
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

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is not part of the billing period. Set to null for subscriptions that
         * are not currently active.
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
         * returned is exactly the beginning of the billing period. Set to null if the subscription
         * is not currently active.
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
         * A customer is a buyer of your products, and the other party to the billing relationship.
         *
         * In Orb, customers are assigned system generated identifiers automatically, but it's often
         * desirable to have these match existing identifiers in your system. To avoid having to
         * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
         * identifier. See [Customer ID Aliases](/events-and-metrics/customer-aliases) for further
         * information about how these aliases work in Orb.
         *
         * In addition to having an identifier in your system, a customer may exist in a payment
         * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider`
         * enum field to express this mapping.
         *
         * A customer also has a timezone (from the standard
         * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your
         * account's timezone. See [Timezone localization](/essentials/timezones) for information on
         * what this timezone parameter influences within Orb.
         */
        fun customer(customer: Customer) = customer(JsonField.of(customer))

        /**
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [Customer] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        /**
         * Determines the default memo on this subscriptions' invoices. Note that if this is not
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

        /** The discount intervals for this subscription sorted by the start_date. */
        @Deprecated("deprecated")
        fun discountIntervals(discountIntervals: List<DiscountInterval>) =
            discountIntervals(JsonField.of(discountIntervals))

        /**
         * Sets [Builder.discountIntervals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountIntervals] with a well-typed
         * `List<DiscountInterval>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun discountIntervals(discountIntervals: JsonField<List<DiscountInterval>>) = apply {
            this.discountIntervals = discountIntervals.map { it.toMutableList() }
        }

        /**
         * Adds a single [DiscountInterval] to [discountIntervals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        @Deprecated("deprecated")
        fun addDiscountInterval(discountInterval: DiscountInterval) = apply {
            discountIntervals =
                (discountIntervals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("discountIntervals", it).add(discountInterval)
                }
        }

        /** Alias for calling [addDiscountInterval] with `DiscountInterval.ofAmount(amount)`. */
        @Deprecated("deprecated")
        fun addDiscountInterval(amount: AmountDiscountInterval) =
            addDiscountInterval(DiscountInterval.ofAmount(amount))

        /**
         * Alias for calling [addDiscountInterval] with `DiscountInterval.ofPercentage(percentage)`.
         */
        @Deprecated("deprecated")
        fun addDiscountInterval(percentage: PercentageDiscountInterval) =
            addDiscountInterval(DiscountInterval.ofPercentage(percentage))

        /** Alias for calling [addDiscountInterval] with `DiscountInterval.ofUsage(usage)`. */
        @Deprecated("deprecated")
        fun addDiscountInterval(usage: UsageDiscountInterval) =
            addDiscountInterval(DiscountInterval.ofUsage(usage))

        /** The date Orb stops billing for this subscription. */
        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        fun fixedFeeQuantitySchedule(
            fixedFeeQuantitySchedule: List<FixedFeeQuantityScheduleEntry>
        ) = fixedFeeQuantitySchedule(JsonField.of(fixedFeeQuantitySchedule))

        /**
         * Sets [Builder.fixedFeeQuantitySchedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fixedFeeQuantitySchedule] with a well-typed
         * `List<FixedFeeQuantityScheduleEntry>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun fixedFeeQuantitySchedule(
            fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantityScheduleEntry>>
        ) = apply {
            this.fixedFeeQuantitySchedule = fixedFeeQuantitySchedule.map { it.toMutableList() }
        }

        /**
         * Adds a single [FixedFeeQuantityScheduleEntry] to [Builder.fixedFeeQuantitySchedule].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFixedFeeQuantitySchedule(fixedFeeQuantitySchedule: FixedFeeQuantityScheduleEntry) =
            apply {
                this.fixedFeeQuantitySchedule =
                    (this.fixedFeeQuantitySchedule ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fixedFeeQuantitySchedule", it).add(fixedFeeQuantitySchedule)
                    }
            }

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

        /** The maximum intervals for this subscription sorted by the start_date. */
        @Deprecated("deprecated")
        fun maximumIntervals(maximumIntervals: List<MaximumInterval>) =
            maximumIntervals(JsonField.of(maximumIntervals))

        /**
         * Sets [Builder.maximumIntervals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumIntervals] with a well-typed
         * `List<MaximumInterval>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun maximumIntervals(maximumIntervals: JsonField<List<MaximumInterval>>) = apply {
            this.maximumIntervals = maximumIntervals.map { it.toMutableList() }
        }

        /**
         * Adds a single [MaximumInterval] to [maximumIntervals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        @Deprecated("deprecated")
        fun addMaximumInterval(maximumInterval: MaximumInterval) = apply {
            maximumIntervals =
                (maximumIntervals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("maximumIntervals", it).add(maximumInterval)
                }
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The minimum intervals for this subscription sorted by the start_date. */
        @Deprecated("deprecated")
        fun minimumIntervals(minimumIntervals: List<MinimumInterval>) =
            minimumIntervals(JsonField.of(minimumIntervals))

        /**
         * Sets [Builder.minimumIntervals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumIntervals] with a well-typed
         * `List<MinimumInterval>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun minimumIntervals(minimumIntervals: JsonField<List<MinimumInterval>>) = apply {
            this.minimumIntervals = minimumIntervals.map { it.toMutableList() }
        }

        /**
         * Adds a single [MinimumInterval] to [minimumIntervals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        @Deprecated("deprecated")
        fun addMinimumInterval(minimumInterval: MinimumInterval) = apply {
            minimumIntervals =
                (minimumIntervals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("minimumIntervals", it).add(minimumInterval)
                }
        }

        /** The name of the subscription. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of `0` here represents that the invoice is due on issue,
         * whereas a value of `30` represents that the customer has a month to pay the invoice.
         */
        fun netTerms(netTerms: Long) = netTerms(JsonField.of(netTerms))

        /**
         * Sets [Builder.netTerms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netTerms] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

        /** A pending subscription change if one exists on this subscription. */
        fun pendingSubscriptionChange(pendingSubscriptionChange: SubscriptionChangeMinified?) =
            pendingSubscriptionChange(JsonField.ofNullable(pendingSubscriptionChange))

        /**
         * Sets [Builder.pendingSubscriptionChange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingSubscriptionChange] with a well-typed
         * [SubscriptionChangeMinified] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun pendingSubscriptionChange(
            pendingSubscriptionChange: JsonField<SubscriptionChangeMinified>
        ) = apply { this.pendingSubscriptionChange = pendingSubscriptionChange }

        /**
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        fun plan(plan: Plan?) = plan(JsonField.ofNullable(plan))

        /**
         * Sets [Builder.plan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plan] with a well-typed [Plan] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** The price intervals for this subscription. */
        fun priceIntervals(priceIntervals: List<PriceInterval>) =
            priceIntervals(JsonField.of(priceIntervals))

        /**
         * Sets [Builder.priceIntervals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceIntervals] with a well-typed `List<PriceInterval>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun priceIntervals(priceIntervals: JsonField<List<PriceInterval>>) = apply {
            this.priceIntervals = priceIntervals.map { it.toMutableList() }
        }

        /**
         * Adds a single [PriceInterval] to [priceIntervals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPriceInterval(priceInterval: PriceInterval) = apply {
            priceIntervals =
                (priceIntervals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("priceIntervals", it).add(priceInterval)
                }
        }

        fun redeemedCoupon(redeemedCoupon: CouponRedemption?) =
            redeemedCoupon(JsonField.ofNullable(redeemedCoupon))

        /**
         * Sets [Builder.redeemedCoupon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redeemedCoupon] with a well-typed [CouponRedemption]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun redeemedCoupon(redeemedCoupon: JsonField<CouponRedemption>) = apply {
            this.redeemedCoupon = redeemedCoupon
        }

        /** The date Orb starts billing for this subscription. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun trialInfo(trialInfo: SubscriptionTrialInfo) = trialInfo(JsonField.of(trialInfo))

        /**
         * Sets [Builder.trialInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialInfo] with a well-typed [SubscriptionTrialInfo]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun trialInfo(trialInfo: JsonField<SubscriptionTrialInfo>) = apply {
            this.trialInfo = trialInfo
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
         * Returns an immutable instance of [Subscription].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .activePlanPhaseOrder()
         * .adjustmentIntervals()
         * .autoCollection()
         * .billingCycleAnchorConfiguration()
         * .billingCycleDay()
         * .createdAt()
         * .currentBillingPeriodEndDate()
         * .currentBillingPeriodStartDate()
         * .customer()
         * .defaultInvoiceMemo()
         * .discountIntervals()
         * .endDate()
         * .fixedFeeQuantitySchedule()
         * .invoicingThreshold()
         * .maximumIntervals()
         * .metadata()
         * .minimumIntervals()
         * .name()
         * .netTerms()
         * .pendingSubscriptionChange()
         * .plan()
         * .priceIntervals()
         * .redeemedCoupon()
         * .startDate()
         * .status()
         * .trialInfo()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Subscription =
            Subscription(
                checkRequired("id", id),
                checkRequired("activePlanPhaseOrder", activePlanPhaseOrder),
                checkRequired("adjustmentIntervals", adjustmentIntervals).map { it.toImmutable() },
                checkRequired("autoCollection", autoCollection),
                checkRequired("billingCycleAnchorConfiguration", billingCycleAnchorConfiguration),
                checkRequired("billingCycleDay", billingCycleDay),
                checkRequired("createdAt", createdAt),
                checkRequired("currentBillingPeriodEndDate", currentBillingPeriodEndDate),
                checkRequired("currentBillingPeriodStartDate", currentBillingPeriodStartDate),
                checkRequired("customer", customer),
                checkRequired("defaultInvoiceMemo", defaultInvoiceMemo),
                checkRequired("discountIntervals", discountIntervals).map { it.toImmutable() },
                checkRequired("endDate", endDate),
                checkRequired("fixedFeeQuantitySchedule", fixedFeeQuantitySchedule).map {
                    it.toImmutable()
                },
                checkRequired("invoicingThreshold", invoicingThreshold),
                checkRequired("maximumIntervals", maximumIntervals).map { it.toImmutable() },
                checkRequired("metadata", metadata),
                checkRequired("minimumIntervals", minimumIntervals).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("netTerms", netTerms),
                checkRequired("pendingSubscriptionChange", pendingSubscriptionChange),
                checkRequired("plan", plan),
                checkRequired("priceIntervals", priceIntervals).map { it.toImmutable() },
                checkRequired("redeemedCoupon", redeemedCoupon),
                checkRequired("startDate", startDate),
                checkRequired("status", status),
                checkRequired("trialInfo", trialInfo),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Subscription = apply {
        if (validated) {
            return@apply
        }

        id()
        activePlanPhaseOrder()
        adjustmentIntervals().forEach { it.validate() }
        autoCollection()
        billingCycleAnchorConfiguration().validate()
        billingCycleDay()
        createdAt()
        currentBillingPeriodEndDate()
        currentBillingPeriodStartDate()
        customer().validate()
        defaultInvoiceMemo()
        discountIntervals().forEach { it.validate() }
        endDate()
        fixedFeeQuantitySchedule().forEach { it.validate() }
        invoicingThreshold()
        maximumIntervals().forEach { it.validate() }
        metadata().validate()
        minimumIntervals().forEach { it.validate() }
        name()
        netTerms()
        pendingSubscriptionChange()?.validate()
        plan()?.validate()
        priceIntervals().forEach { it.validate() }
        redeemedCoupon()?.validate()
        startDate()
        status().validate()
        trialInfo().validate()
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
            (if (activePlanPhaseOrder.asKnown() == null) 0 else 1) +
            (adjustmentIntervals.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (autoCollection.asKnown() == null) 0 else 1) +
            (billingCycleAnchorConfiguration.asKnown()?.validity() ?: 0) +
            (if (billingCycleDay.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (currentBillingPeriodEndDate.asKnown() == null) 0 else 1) +
            (if (currentBillingPeriodStartDate.asKnown() == null) 0 else 1) +
            (customer.asKnown()?.validity() ?: 0) +
            (if (defaultInvoiceMemo.asKnown() == null) 0 else 1) +
            (discountIntervals.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (endDate.asKnown() == null) 0 else 1) +
            (fixedFeeQuantitySchedule.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (invoicingThreshold.asKnown() == null) 0 else 1) +
            (maximumIntervals.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (metadata.asKnown()?.validity() ?: 0) +
            (minimumIntervals.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (netTerms.asKnown() == null) 0 else 1) +
            (pendingSubscriptionChange.asKnown()?.validity() ?: 0) +
            (plan.asKnown()?.validity() ?: 0) +
            (priceIntervals.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (redeemedCoupon.asKnown()?.validity() ?: 0) +
            (if (startDate.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (trialInfo.asKnown()?.validity() ?: 0)

    @JsonDeserialize(using = DiscountInterval.Deserializer::class)
    @JsonSerialize(using = DiscountInterval.Serializer::class)
    class DiscountInterval
    private constructor(
        private val amount: AmountDiscountInterval? = null,
        private val percentage: PercentageDiscountInterval? = null,
        private val usage: UsageDiscountInterval? = null,
        private val _json: JsonValue? = null,
    ) {

        fun amount(): AmountDiscountInterval? = amount

        fun percentage(): PercentageDiscountInterval? = percentage

        fun usage(): UsageDiscountInterval? = usage

        fun isAmount(): Boolean = amount != null

        fun isPercentage(): Boolean = percentage != null

        fun isUsage(): Boolean = usage != null

        fun asAmount(): AmountDiscountInterval = amount.getOrThrow("amount")

        fun asPercentage(): PercentageDiscountInterval = percentage.getOrThrow("percentage")

        fun asUsage(): UsageDiscountInterval = usage.getOrThrow("usage")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                amount != null -> visitor.visitAmount(amount)
                percentage != null -> visitor.visitPercentage(percentage)
                usage != null -> visitor.visitUsage(usage)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): DiscountInterval = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAmount(amount: AmountDiscountInterval) {
                        amount.validate()
                    }

                    override fun visitPercentage(percentage: PercentageDiscountInterval) {
                        percentage.validate()
                    }

                    override fun visitUsage(usage: UsageDiscountInterval) {
                        usage.validate()
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
                    override fun visitAmount(amount: AmountDiscountInterval) = amount.validity()

                    override fun visitPercentage(percentage: PercentageDiscountInterval) =
                        percentage.validity()

                    override fun visitUsage(usage: UsageDiscountInterval) = usage.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DiscountInterval && amount == other.amount && percentage == other.percentage && usage == other.usage /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(amount, percentage, usage) /* spotless:on */

        override fun toString(): String =
            when {
                amount != null -> "DiscountInterval{amount=$amount}"
                percentage != null -> "DiscountInterval{percentage=$percentage}"
                usage != null -> "DiscountInterval{usage=$usage}"
                _json != null -> "DiscountInterval{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid DiscountInterval")
            }

        companion object {

            fun ofAmount(amount: AmountDiscountInterval) = DiscountInterval(amount = amount)

            fun ofPercentage(percentage: PercentageDiscountInterval) =
                DiscountInterval(percentage = percentage)

            fun ofUsage(usage: UsageDiscountInterval) = DiscountInterval(usage = usage)
        }

        /**
         * An interface that defines how to map each variant of [DiscountInterval] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitAmount(amount: AmountDiscountInterval): T

            fun visitPercentage(percentage: PercentageDiscountInterval): T

            fun visitUsage(usage: UsageDiscountInterval): T

            /**
             * Maps an unknown variant of [DiscountInterval] to a value of type [T].
             *
             * An instance of [DiscountInterval] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown DiscountInterval: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<DiscountInterval>(DiscountInterval::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): DiscountInterval {
                val json = JsonValue.fromJsonNode(node)
                val discountType = json.asObject()?.get("discount_type")?.asString()

                when (discountType) {
                    "amount" -> {
                        return tryDeserialize(node, jacksonTypeRef<AmountDiscountInterval>())?.let {
                            DiscountInterval(amount = it, _json = json)
                        } ?: DiscountInterval(_json = json)
                    }
                    "percentage" -> {
                        return tryDeserialize(node, jacksonTypeRef<PercentageDiscountInterval>())
                            ?.let { DiscountInterval(percentage = it, _json = json) }
                            ?: DiscountInterval(_json = json)
                    }
                    "usage" -> {
                        return tryDeserialize(node, jacksonTypeRef<UsageDiscountInterval>())?.let {
                            DiscountInterval(usage = it, _json = json)
                        } ?: DiscountInterval(_json = json)
                    }
                }

                return DiscountInterval(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<DiscountInterval>(DiscountInterval::class) {

            override fun serialize(
                value: DiscountInterval,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.amount != null -> generator.writeObject(value.amount)
                    value.percentage != null -> generator.writeObject(value.percentage)
                    value.usage != null -> generator.writeObject(value.usage)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid DiscountInterval")
                }
            }
        }
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
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

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ACTIVE = of("active")

            val ENDED = of("ended")

            val UPCOMING = of("upcoming")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            ENDED,
            UPCOMING,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            ENDED,
            UPCOMING,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ACTIVE -> Value.ACTIVE
                ENDED -> Value.ENDED
                UPCOMING -> Value.UPCOMING
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
                ACTIVE -> Known.ACTIVE
                ENDED -> Known.ENDED
                UPCOMING -> Known.UPCOMING
                else -> throw OrbInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Subscription && id == other.id && activePlanPhaseOrder == other.activePlanPhaseOrder && adjustmentIntervals == other.adjustmentIntervals && autoCollection == other.autoCollection && billingCycleAnchorConfiguration == other.billingCycleAnchorConfiguration && billingCycleDay == other.billingCycleDay && createdAt == other.createdAt && currentBillingPeriodEndDate == other.currentBillingPeriodEndDate && currentBillingPeriodStartDate == other.currentBillingPeriodStartDate && customer == other.customer && defaultInvoiceMemo == other.defaultInvoiceMemo && discountIntervals == other.discountIntervals && endDate == other.endDate && fixedFeeQuantitySchedule == other.fixedFeeQuantitySchedule && invoicingThreshold == other.invoicingThreshold && maximumIntervals == other.maximumIntervals && metadata == other.metadata && minimumIntervals == other.minimumIntervals && name == other.name && netTerms == other.netTerms && pendingSubscriptionChange == other.pendingSubscriptionChange && plan == other.plan && priceIntervals == other.priceIntervals && redeemedCoupon == other.redeemedCoupon && startDate == other.startDate && status == other.status && trialInfo == other.trialInfo && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, activePlanPhaseOrder, adjustmentIntervals, autoCollection, billingCycleAnchorConfiguration, billingCycleDay, createdAt, currentBillingPeriodEndDate, currentBillingPeriodStartDate, customer, defaultInvoiceMemo, discountIntervals, endDate, fixedFeeQuantitySchedule, invoicingThreshold, maximumIntervals, metadata, minimumIntervals, name, netTerms, pendingSubscriptionChange, plan, priceIntervals, redeemedCoupon, startDate, status, trialInfo, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Subscription{id=$id, activePlanPhaseOrder=$activePlanPhaseOrder, adjustmentIntervals=$adjustmentIntervals, autoCollection=$autoCollection, billingCycleAnchorConfiguration=$billingCycleAnchorConfiguration, billingCycleDay=$billingCycleDay, createdAt=$createdAt, currentBillingPeriodEndDate=$currentBillingPeriodEndDate, currentBillingPeriodStartDate=$currentBillingPeriodStartDate, customer=$customer, defaultInvoiceMemo=$defaultInvoiceMemo, discountIntervals=$discountIntervals, endDate=$endDate, fixedFeeQuantitySchedule=$fixedFeeQuantitySchedule, invoicingThreshold=$invoicingThreshold, maximumIntervals=$maximumIntervals, metadata=$metadata, minimumIntervals=$minimumIntervals, name=$name, netTerms=$netTerms, pendingSubscriptionChange=$pendingSubscriptionChange, plan=$plan, priceIntervals=$priceIntervals, redeemedCoupon=$redeemedCoupon, startDate=$startDate, status=$status, trialInfo=$trialInfo, additionalProperties=$additionalProperties}"
}
