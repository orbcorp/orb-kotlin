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

/**
 * A [subscription](../guides/core-concepts.mdx#subscription) represents the purchase of a plan by a
 * customer.
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
@NoAutoDetect
class Subscription
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("active_plan_phase_order")
    @ExcludeMissing
    private val activePlanPhaseOrder: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("adjustment_intervals")
    @ExcludeMissing
    private val adjustmentIntervals: JsonField<List<AdjustmentInterval>> = JsonMissing.of(),
    @JsonProperty("auto_collection")
    @ExcludeMissing
    private val autoCollection: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("billing_cycle_anchor_configuration")
    @ExcludeMissing
    private val billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration> =
        JsonMissing.of(),
    @JsonProperty("billing_cycle_day")
    @ExcludeMissing
    private val billingCycleDay: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("current_billing_period_end_date")
    @ExcludeMissing
    private val currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("current_billing_period_start_date")
    @ExcludeMissing
    private val currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<Customer> = JsonMissing.of(),
    @JsonProperty("default_invoice_memo")
    @ExcludeMissing
    private val defaultInvoiceMemo: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discount_intervals")
    @ExcludeMissing
    private val discountIntervals: JsonField<List<DiscountInterval>> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("fixed_fee_quantity_schedule")
    @ExcludeMissing
    private val fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantitySchedule>> =
        JsonMissing.of(),
    @JsonProperty("invoicing_threshold")
    @ExcludeMissing
    private val invoicingThreshold: JsonField<String> = JsonMissing.of(),
    @JsonProperty("maximum_intervals")
    @ExcludeMissing
    private val maximumIntervals: JsonField<List<MaximumInterval>> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("minimum_intervals")
    @ExcludeMissing
    private val minimumIntervals: JsonField<List<MinimumInterval>> = JsonMissing.of(),
    @JsonProperty("net_terms")
    @ExcludeMissing
    private val netTerms: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("plan") @ExcludeMissing private val plan: JsonField<Plan> = JsonMissing.of(),
    @JsonProperty("price_intervals")
    @ExcludeMissing
    private val priceIntervals: JsonField<List<PriceInterval>> = JsonMissing.of(),
    @JsonProperty("redeemed_coupon")
    @ExcludeMissing
    private val redeemedCoupon: JsonField<RedeemedCoupon> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("trial_info")
    @ExcludeMissing
    private val trialInfo: JsonField<TrialInfo> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** The current plan phase that is active, only if the subscription's plan has phases. */
    fun activePlanPhaseOrder(): Long? = activePlanPhaseOrder.getNullable("active_plan_phase_order")

    /** The adjustment intervals for this subscription. */
    fun adjustmentIntervals(): List<AdjustmentInterval> =
        adjustmentIntervals.getRequired("adjustment_intervals")

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. This property defaults to the plan's behavior. If
     * null, defaults to the customer's setting.
     */
    fun autoCollection(): Boolean? = autoCollection.getNullable("auto_collection")

    fun billingCycleAnchorConfiguration(): BillingCycleAnchorConfiguration =
        billingCycleAnchorConfiguration.getRequired("billing_cycle_anchor_configuration")

    /**
     * The day of the month on which the billing cycle is anchored. If the maximum number of days in
     * a month is greater than this value, the last day of the month is the billing cycle day (e.g.
     * billing_cycle_day=31 for April means the billing period begins on the 30th.
     */
    fun billingCycleDay(): Long = billingCycleDay.getRequired("billing_cycle_day")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The end of the current billing period. This is an exclusive timestamp, such that the instant
     * returned is not part of the billing period. Set to null for subscriptions that are not
     * currently active.
     */
    fun currentBillingPeriodEndDate(): OffsetDateTime? =
        currentBillingPeriodEndDate.getNullable("current_billing_period_end_date")

    /**
     * The start date of the current billing period. This is an inclusive timestamp; the instant
     * returned is exactly the beginning of the billing period. Set to null if the subscription is
     * not currently active.
     */
    fun currentBillingPeriodStartDate(): OffsetDateTime? =
        currentBillingPeriodStartDate.getNullable("current_billing_period_start_date")

    /**
     * A customer is a buyer of your products, and the other party to the billing relationship.
     *
     * In Orb, customers are assigned system generated identifiers automatically, but it's often
     * desirable to have these match existing identifiers in your system. To avoid having to
     * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
     * identifier. See [Customer ID Aliases](../guides/events-and-metrics/customer-aliases) for
     * further information about how these aliases work in Orb.
     *
     * In addition to having an identifier in your system, a customer may exist in a payment
     * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider` enum
     * field to express this mapping.
     *
     * A customer also has a timezone (from the standard
     * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your account's
     * timezone. See [Timezone localization](../guides/product-catalog/timezones.md) for information
     * on what this timezone parameter influences within Orb.
     */
    fun customer(): Customer = customer.getRequired("customer")

    /**
     * Determines the default memo on this subscriptions' invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     */
    fun defaultInvoiceMemo(): String? = defaultInvoiceMemo.getNullable("default_invoice_memo")

    /** The discount intervals for this subscription. */
    fun discountIntervals(): List<DiscountInterval> =
        discountIntervals.getRequired("discount_intervals")

    /** The date Orb stops billing for this subscription. */
    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    fun fixedFeeQuantitySchedule(): List<FixedFeeQuantitySchedule> =
        fixedFeeQuantitySchedule.getRequired("fixed_fee_quantity_schedule")

    fun invoicingThreshold(): String? = invoicingThreshold.getNullable("invoicing_threshold")

    /** The maximum intervals for this subscription. */
    fun maximumIntervals(): List<MaximumInterval> =
        maximumIntervals.getRequired("maximum_intervals")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** The minimum intervals for this subscription. */
    fun minimumIntervals(): List<MinimumInterval> =
        minimumIntervals.getRequired("minimum_intervals")

    /**
     * Determines the difference between the invoice issue date for subscription invoices as the
     * date that they are due. A value of `0` here represents that the invoice is due on issue,
     * whereas a value of `30` represents that the customer has a month to pay the invoice.
     */
    fun netTerms(): Long = netTerms.getRequired("net_terms")

    /**
     * The [Plan](../guides/core-concepts.mdx#plan-and-price) resource represents a plan that can be
     * subscribed to by a customer. Plans define the billing behavior of the subscription. You can
     * see more about how to configure prices in the [Price resource](/reference/price).
     */
    fun plan(): Plan = plan.getRequired("plan")

    /** The price intervals for this subscription. */
    fun priceIntervals(): List<PriceInterval> = priceIntervals.getRequired("price_intervals")

    fun redeemedCoupon(): RedeemedCoupon? = redeemedCoupon.getNullable("redeemed_coupon")

    /** The date Orb starts billing for this subscription. */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    fun status(): Status = status.getRequired("status")

    fun trialInfo(): TrialInfo = trialInfo.getRequired("trial_info")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The current plan phase that is active, only if the subscription's plan has phases. */
    @JsonProperty("active_plan_phase_order")
    @ExcludeMissing
    fun _activePlanPhaseOrder(): JsonField<Long> = activePlanPhaseOrder

    /** The adjustment intervals for this subscription. */
    @JsonProperty("adjustment_intervals")
    @ExcludeMissing
    fun _adjustmentIntervals(): JsonField<List<AdjustmentInterval>> = adjustmentIntervals

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. This property defaults to the plan's behavior. If
     * null, defaults to the customer's setting.
     */
    @JsonProperty("auto_collection")
    @ExcludeMissing
    fun _autoCollection(): JsonField<Boolean> = autoCollection

    @JsonProperty("billing_cycle_anchor_configuration")
    @ExcludeMissing
    fun _billingCycleAnchorConfiguration(): JsonField<BillingCycleAnchorConfiguration> =
        billingCycleAnchorConfiguration

    /**
     * The day of the month on which the billing cycle is anchored. If the maximum number of days in
     * a month is greater than this value, the last day of the month is the billing cycle day (e.g.
     * billing_cycle_day=31 for April means the billing period begins on the 30th.
     */
    @JsonProperty("billing_cycle_day")
    @ExcludeMissing
    fun _billingCycleDay(): JsonField<Long> = billingCycleDay

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The end of the current billing period. This is an exclusive timestamp, such that the instant
     * returned is not part of the billing period. Set to null for subscriptions that are not
     * currently active.
     */
    @JsonProperty("current_billing_period_end_date")
    @ExcludeMissing
    fun _currentBillingPeriodEndDate(): JsonField<OffsetDateTime> = currentBillingPeriodEndDate

    /**
     * The start date of the current billing period. This is an inclusive timestamp; the instant
     * returned is exactly the beginning of the billing period. Set to null if the subscription is
     * not currently active.
     */
    @JsonProperty("current_billing_period_start_date")
    @ExcludeMissing
    fun _currentBillingPeriodStartDate(): JsonField<OffsetDateTime> = currentBillingPeriodStartDate

    /**
     * A customer is a buyer of your products, and the other party to the billing relationship.
     *
     * In Orb, customers are assigned system generated identifiers automatically, but it's often
     * desirable to have these match existing identifiers in your system. To avoid having to
     * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
     * identifier. See [Customer ID Aliases](../guides/events-and-metrics/customer-aliases) for
     * further information about how these aliases work in Orb.
     *
     * In addition to having an identifier in your system, a customer may exist in a payment
     * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider` enum
     * field to express this mapping.
     *
     * A customer also has a timezone (from the standard
     * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your account's
     * timezone. See [Timezone localization](../guides/product-catalog/timezones.md) for information
     * on what this timezone parameter influences within Orb.
     */
    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

    /**
     * Determines the default memo on this subscriptions' invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     */
    @JsonProperty("default_invoice_memo")
    @ExcludeMissing
    fun _defaultInvoiceMemo(): JsonField<String> = defaultInvoiceMemo

    /** The discount intervals for this subscription. */
    @JsonProperty("discount_intervals")
    @ExcludeMissing
    fun _discountIntervals(): JsonField<List<DiscountInterval>> = discountIntervals

    /** The date Orb stops billing for this subscription. */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    @JsonProperty("fixed_fee_quantity_schedule")
    @ExcludeMissing
    fun _fixedFeeQuantitySchedule(): JsonField<List<FixedFeeQuantitySchedule>> =
        fixedFeeQuantitySchedule

    @JsonProperty("invoicing_threshold")
    @ExcludeMissing
    fun _invoicingThreshold(): JsonField<String> = invoicingThreshold

    /** The maximum intervals for this subscription. */
    @JsonProperty("maximum_intervals")
    @ExcludeMissing
    fun _maximumIntervals(): JsonField<List<MaximumInterval>> = maximumIntervals

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** The minimum intervals for this subscription. */
    @JsonProperty("minimum_intervals")
    @ExcludeMissing
    fun _minimumIntervals(): JsonField<List<MinimumInterval>> = minimumIntervals

    /**
     * Determines the difference between the invoice issue date for subscription invoices as the
     * date that they are due. A value of `0` here represents that the invoice is due on issue,
     * whereas a value of `30` represents that the customer has a month to pay the invoice.
     */
    @JsonProperty("net_terms") @ExcludeMissing fun _netTerms(): JsonField<Long> = netTerms

    /**
     * The [Plan](../guides/core-concepts.mdx#plan-and-price) resource represents a plan that can be
     * subscribed to by a customer. Plans define the billing behavior of the subscription. You can
     * see more about how to configure prices in the [Price resource](/reference/price).
     */
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

    /** The price intervals for this subscription. */
    @JsonProperty("price_intervals")
    @ExcludeMissing
    fun _priceIntervals(): JsonField<List<PriceInterval>> = priceIntervals

    @JsonProperty("redeemed_coupon")
    @ExcludeMissing
    fun _redeemedCoupon(): JsonField<RedeemedCoupon> = redeemedCoupon

    /** The date Orb starts billing for this subscription. */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonProperty("trial_info") @ExcludeMissing fun _trialInfo(): JsonField<TrialInfo> = trialInfo

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Subscription = apply {
        if (!validated) {
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
            discountIntervals()
            endDate()
            fixedFeeQuantitySchedule().forEach { it.validate() }
            invoicingThreshold()
            maximumIntervals().forEach { it.validate() }
            metadata().validate()
            minimumIntervals().forEach { it.validate() }
            netTerms()
            plan().validate()
            priceIntervals().forEach { it.validate() }
            redeemedCoupon()?.validate()
            startDate()
            status()
            trialInfo().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

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
        private var fixedFeeQuantitySchedule: JsonField<MutableList<FixedFeeQuantitySchedule>>? =
            null
        private var invoicingThreshold: JsonField<String>? = null
        private var maximumIntervals: JsonField<MutableList<MaximumInterval>>? = null
        private var metadata: JsonField<Metadata>? = null
        private var minimumIntervals: JsonField<MutableList<MinimumInterval>>? = null
        private var netTerms: JsonField<Long>? = null
        private var plan: JsonField<Plan>? = null
        private var priceIntervals: JsonField<MutableList<PriceInterval>>? = null
        private var redeemedCoupon: JsonField<RedeemedCoupon>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var trialInfo: JsonField<TrialInfo>? = null
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
            netTerms = subscription.netTerms
            plan = subscription.plan
            priceIntervals = subscription.priceIntervals.map { it.toMutableList() }
            redeemedCoupon = subscription.redeemedCoupon
            startDate = subscription.startDate
            status = subscription.status
            trialInfo = subscription.trialInfo
            additionalProperties = subscription.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The current plan phase that is active, only if the subscription's plan has phases. */
        fun activePlanPhaseOrder(activePlanPhaseOrder: Long?) =
            activePlanPhaseOrder(JsonField.ofNullable(activePlanPhaseOrder))

        /** The current plan phase that is active, only if the subscription's plan has phases. */
        fun activePlanPhaseOrder(activePlanPhaseOrder: Long) =
            activePlanPhaseOrder(activePlanPhaseOrder as Long?)

        /** The current plan phase that is active, only if the subscription's plan has phases. */
        fun activePlanPhaseOrder(activePlanPhaseOrder: JsonField<Long>) = apply {
            this.activePlanPhaseOrder = activePlanPhaseOrder
        }

        /** The adjustment intervals for this subscription. */
        fun adjustmentIntervals(adjustmentIntervals: List<AdjustmentInterval>) =
            adjustmentIntervals(JsonField.of(adjustmentIntervals))

        /** The adjustment intervals for this subscription. */
        fun adjustmentIntervals(adjustmentIntervals: JsonField<List<AdjustmentInterval>>) = apply {
            this.adjustmentIntervals = adjustmentIntervals.map { it.toMutableList() }
        }

        /** The adjustment intervals for this subscription. */
        fun addAdjustmentInterval(adjustmentInterval: AdjustmentInterval) = apply {
            adjustmentIntervals =
                (adjustmentIntervals ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(adjustmentInterval)
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
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior. If null, defaults to the customer's setting.
         */
        fun autoCollection(autoCollection: Boolean) = autoCollection(autoCollection as Boolean?)

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior. If null, defaults to the customer's setting.
         */
        fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
            this.autoCollection = autoCollection
        }

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration
        ) = billingCycleAnchorConfiguration(JsonField.of(billingCycleAnchorConfiguration))

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
         * The day of the month on which the billing cycle is anchored. If the maximum number of
         * days in a month is greater than this value, the last day of the month is the billing
         * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
         * 30th.
         */
        fun billingCycleDay(billingCycleDay: JsonField<Long>) = apply {
            this.billingCycleDay = billingCycleDay
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is not part of the billing period. Set to null for subscriptions that
         * are not currently active.
         */
        fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: OffsetDateTime?) =
            currentBillingPeriodEndDate(JsonField.ofNullable(currentBillingPeriodEndDate))

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is not part of the billing period. Set to null for subscriptions that
         * are not currently active.
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
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if the subscription
         * is not currently active.
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
         * identifier. See [Customer ID Aliases](../guides/events-and-metrics/customer-aliases) for
         * further information about how these aliases work in Orb.
         *
         * In addition to having an identifier in your system, a customer may exist in a payment
         * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider`
         * enum field to express this mapping.
         *
         * A customer also has a timezone (from the standard
         * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your
         * account's timezone. See [Timezone localization](../guides/product-catalog/timezones.md)
         * for information on what this timezone parameter influences within Orb.
         */
        fun customer(customer: Customer) = customer(JsonField.of(customer))

        /**
         * A customer is a buyer of your products, and the other party to the billing relationship.
         *
         * In Orb, customers are assigned system generated identifiers automatically, but it's often
         * desirable to have these match existing identifiers in your system. To avoid having to
         * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
         * identifier. See [Customer ID Aliases](../guides/events-and-metrics/customer-aliases) for
         * further information about how these aliases work in Orb.
         *
         * In addition to having an identifier in your system, a customer may exist in a payment
         * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider`
         * enum field to express this mapping.
         *
         * A customer also has a timezone (from the standard
         * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your
         * account's timezone. See [Timezone localization](../guides/product-catalog/timezones.md)
         * for information on what this timezone parameter influences within Orb.
         */
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        /**
         * Determines the default memo on this subscriptions' invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: String?) =
            defaultInvoiceMemo(JsonField.ofNullable(defaultInvoiceMemo))

        /**
         * Determines the default memo on this subscriptions' invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: JsonField<String>) = apply {
            this.defaultInvoiceMemo = defaultInvoiceMemo
        }

        /** The discount intervals for this subscription. */
        fun discountIntervals(discountIntervals: List<DiscountInterval>) =
            discountIntervals(JsonField.of(discountIntervals))

        /** The discount intervals for this subscription. */
        fun discountIntervals(discountIntervals: JsonField<List<DiscountInterval>>) = apply {
            this.discountIntervals = discountIntervals.map { it.toMutableList() }
        }

        /** The discount intervals for this subscription. */
        fun addDiscountInterval(discountInterval: DiscountInterval) = apply {
            discountIntervals =
                (discountIntervals ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(discountInterval)
                }
        }

        /** The discount intervals for this subscription. */
        fun addDiscountInterval(amountDiscountInterval: DiscountInterval.AmountDiscountInterval) =
            addDiscountInterval(DiscountInterval.ofAmountDiscountInterval(amountDiscountInterval))

        /** The discount intervals for this subscription. */
        fun addDiscountInterval(
            percentageDiscountInterval: DiscountInterval.PercentageDiscountInterval
        ) =
            addDiscountInterval(
                DiscountInterval.ofPercentageDiscountInterval(percentageDiscountInterval)
            )

        /** The discount intervals for this subscription. */
        fun addDiscountInterval(usageDiscountInterval: DiscountInterval.UsageDiscountInterval) =
            addDiscountInterval(DiscountInterval.ofUsageDiscountInterval(usageDiscountInterval))

        /** The date Orb stops billing for this subscription. */
        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /** The date Orb stops billing for this subscription. */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        fun fixedFeeQuantitySchedule(fixedFeeQuantitySchedule: List<FixedFeeQuantitySchedule>) =
            fixedFeeQuantitySchedule(JsonField.of(fixedFeeQuantitySchedule))

        fun fixedFeeQuantitySchedule(
            fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantitySchedule>>
        ) = apply {
            this.fixedFeeQuantitySchedule = fixedFeeQuantitySchedule.map { it.toMutableList() }
        }

        fun addFixedFeeQuantitySchedule(fixedFeeQuantitySchedule: FixedFeeQuantitySchedule) =
            apply {
                this.fixedFeeQuantitySchedule =
                    (this.fixedFeeQuantitySchedule ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(fixedFeeQuantitySchedule)
                    }
            }

        fun invoicingThreshold(invoicingThreshold: String?) =
            invoicingThreshold(JsonField.ofNullable(invoicingThreshold))

        fun invoicingThreshold(invoicingThreshold: JsonField<String>) = apply {
            this.invoicingThreshold = invoicingThreshold
        }

        /** The maximum intervals for this subscription. */
        fun maximumIntervals(maximumIntervals: List<MaximumInterval>) =
            maximumIntervals(JsonField.of(maximumIntervals))

        /** The maximum intervals for this subscription. */
        fun maximumIntervals(maximumIntervals: JsonField<List<MaximumInterval>>) = apply {
            this.maximumIntervals = maximumIntervals.map { it.toMutableList() }
        }

        /** The maximum intervals for this subscription. */
        fun addMaximumInterval(maximumInterval: MaximumInterval) = apply {
            maximumIntervals =
                (maximumIntervals ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(maximumInterval)
                }
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The minimum intervals for this subscription. */
        fun minimumIntervals(minimumIntervals: List<MinimumInterval>) =
            minimumIntervals(JsonField.of(minimumIntervals))

        /** The minimum intervals for this subscription. */
        fun minimumIntervals(minimumIntervals: JsonField<List<MinimumInterval>>) = apply {
            this.minimumIntervals = minimumIntervals.map { it.toMutableList() }
        }

        /** The minimum intervals for this subscription. */
        fun addMinimumInterval(minimumInterval: MinimumInterval) = apply {
            minimumIntervals =
                (minimumIntervals ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(minimumInterval)
                }
        }

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of `0` here represents that the invoice is due on issue,
         * whereas a value of `30` represents that the customer has a month to pay the invoice.
         */
        fun netTerms(netTerms: Long) = netTerms(JsonField.of(netTerms))

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of `0` here represents that the invoice is due on issue,
         * whereas a value of `30` represents that the customer has a month to pay the invoice.
         */
        fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

        /**
         * The [Plan](../guides/core-concepts.mdx#plan-and-price) resource represents a plan that
         * can be subscribed to by a customer. Plans define the billing behavior of the
         * subscription. You can see more about how to configure prices in the
         * [Price resource](/reference/price).
         */
        fun plan(plan: Plan) = plan(JsonField.of(plan))

        /**
         * The [Plan](../guides/core-concepts.mdx#plan-and-price) resource represents a plan that
         * can be subscribed to by a customer. Plans define the billing behavior of the
         * subscription. You can see more about how to configure prices in the
         * [Price resource](/reference/price).
         */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** The price intervals for this subscription. */
        fun priceIntervals(priceIntervals: List<PriceInterval>) =
            priceIntervals(JsonField.of(priceIntervals))

        /** The price intervals for this subscription. */
        fun priceIntervals(priceIntervals: JsonField<List<PriceInterval>>) = apply {
            this.priceIntervals = priceIntervals.map { it.toMutableList() }
        }

        /** The price intervals for this subscription. */
        fun addPriceInterval(priceInterval: PriceInterval) = apply {
            priceIntervals =
                (priceIntervals ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(priceInterval)
                }
        }

        fun redeemedCoupon(redeemedCoupon: RedeemedCoupon?) =
            redeemedCoupon(JsonField.ofNullable(redeemedCoupon))

        fun redeemedCoupon(redeemedCoupon: JsonField<RedeemedCoupon>) = apply {
            this.redeemedCoupon = redeemedCoupon
        }

        /** The date Orb starts billing for this subscription. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /** The date Orb starts billing for this subscription. */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun trialInfo(trialInfo: TrialInfo) = trialInfo(JsonField.of(trialInfo))

        fun trialInfo(trialInfo: JsonField<TrialInfo>) = apply { this.trialInfo = trialInfo }

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

        fun build(): Subscription =
            Subscription(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(activePlanPhaseOrder) {
                    "`activePlanPhaseOrder` is required but was not set"
                },
                checkNotNull(adjustmentIntervals) {
                        "`adjustmentIntervals` is required but was not set"
                    }
                    .map { it.toImmutable() },
                checkNotNull(autoCollection) { "`autoCollection` is required but was not set" },
                checkNotNull(billingCycleAnchorConfiguration) {
                    "`billingCycleAnchorConfiguration` is required but was not set"
                },
                checkNotNull(billingCycleDay) { "`billingCycleDay` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(currentBillingPeriodEndDate) {
                    "`currentBillingPeriodEndDate` is required but was not set"
                },
                checkNotNull(currentBillingPeriodStartDate) {
                    "`currentBillingPeriodStartDate` is required but was not set"
                },
                checkNotNull(customer) { "`customer` is required but was not set" },
                checkNotNull(defaultInvoiceMemo) {
                    "`defaultInvoiceMemo` is required but was not set"
                },
                checkNotNull(discountIntervals) {
                        "`discountIntervals` is required but was not set"
                    }
                    .map { it.toImmutable() },
                checkNotNull(endDate) { "`endDate` is required but was not set" },
                checkNotNull(fixedFeeQuantitySchedule) {
                        "`fixedFeeQuantitySchedule` is required but was not set"
                    }
                    .map { it.toImmutable() },
                checkNotNull(invoicingThreshold) {
                    "`invoicingThreshold` is required but was not set"
                },
                checkNotNull(maximumIntervals) { "`maximumIntervals` is required but was not set" }
                    .map { it.toImmutable() },
                checkNotNull(metadata) { "`metadata` is required but was not set" },
                checkNotNull(minimumIntervals) { "`minimumIntervals` is required but was not set" }
                    .map { it.toImmutable() },
                checkNotNull(netTerms) { "`netTerms` is required but was not set" },
                checkNotNull(plan) { "`plan` is required but was not set" },
                checkNotNull(priceIntervals) { "`priceIntervals` is required but was not set" }
                    .map { it.toImmutable() },
                checkNotNull(redeemedCoupon) { "`redeemedCoupon` is required but was not set" },
                checkNotNull(startDate) { "`startDate` is required but was not set" },
                checkNotNull(status) { "`status` is required but was not set" },
                checkNotNull(trialInfo) { "`trialInfo` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class AdjustmentInterval
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjustment")
        @ExcludeMissing
        private val adjustment: JsonField<Adjustment> = JsonMissing.of(),
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun adjustment(): Adjustment = adjustment.getRequired("adjustment")

        /** The price interval IDs that this adjustment applies to. */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        /** The end date of the adjustment interval. */
        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        /** The start date of the adjustment interval. */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("adjustment")
        @ExcludeMissing
        fun _adjustment(): JsonField<Adjustment> = adjustment

        /** The price interval IDs that this adjustment applies to. */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

        /** The end date of the adjustment interval. */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /** The start date of the adjustment interval. */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AdjustmentInterval = apply {
            if (!validated) {
                id()
                adjustment()
                appliesToPriceIntervalIds()
                endDate()
                startDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var adjustment: JsonField<Adjustment>? = null
            private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(adjustmentInterval: AdjustmentInterval) = apply {
                id = adjustmentInterval.id
                adjustment = adjustmentInterval.adjustment
                appliesToPriceIntervalIds =
                    adjustmentInterval.appliesToPriceIntervalIds.map { it.toMutableList() }
                endDate = adjustmentInterval.endDate
                startDate = adjustmentInterval.startDate
                additionalProperties = adjustmentInterval.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun adjustment(adjustment: Adjustment) = adjustment(JsonField.of(adjustment))

            fun adjustment(adjustment: JsonField<Adjustment>) = apply {
                this.adjustment = adjustment
            }

            fun adjustment(amountDiscountAdjustment: Adjustment.AmountDiscountAdjustment) =
                adjustment(Adjustment.ofAmountDiscountAdjustment(amountDiscountAdjustment))

            fun adjustment(percentageDiscountAdjustment: Adjustment.PercentageDiscountAdjustment) =
                adjustment(Adjustment.ofPercentageDiscountAdjustment(percentageDiscountAdjustment))

            fun adjustment(usageDiscountAdjustment: Adjustment.UsageDiscountAdjustment) =
                adjustment(Adjustment.ofUsageDiscountAdjustment(usageDiscountAdjustment))

            fun adjustment(minimumAdjustment: Adjustment.MinimumAdjustment) =
                adjustment(Adjustment.ofMinimumAdjustment(minimumAdjustment))

            fun adjustment(maximumAdjustment: Adjustment.MaximumAdjustment) =
                adjustment(Adjustment.ofMaximumAdjustment(maximumAdjustment))

            /** The price interval IDs that this adjustment applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /** The price interval IDs that this adjustment applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds =
                        appliesToPriceIntervalIds.map { it.toMutableList() }
                }

            /** The price interval IDs that this adjustment applies to. */
            fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                appliesToPriceIntervalIds =
                    (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(appliesToPriceIntervalId)
                    }
            }

            /** The end date of the adjustment interval. */
            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /** The end date of the adjustment interval. */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** The start date of the adjustment interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The start date of the adjustment interval. */
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

            fun build(): AdjustmentInterval =
                AdjustmentInterval(
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(adjustment) { "`adjustment` is required but was not set" },
                    checkNotNull(appliesToPriceIntervalIds) {
                            "`appliesToPriceIntervalIds` is required but was not set"
                        }
                        .map { it.toImmutable() },
                    checkNotNull(endDate) { "`endDate` is required but was not set" },
                    checkNotNull(startDate) { "`startDate` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(using = Adjustment.Deserializer::class)
        @JsonSerialize(using = Adjustment.Serializer::class)
        class Adjustment
        private constructor(
            private val amountDiscountAdjustment: AmountDiscountAdjustment? = null,
            private val percentageDiscountAdjustment: PercentageDiscountAdjustment? = null,
            private val usageDiscountAdjustment: UsageDiscountAdjustment? = null,
            private val minimumAdjustment: MinimumAdjustment? = null,
            private val maximumAdjustment: MaximumAdjustment? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun amountDiscountAdjustment(): AmountDiscountAdjustment? = amountDiscountAdjustment

            fun percentageDiscountAdjustment(): PercentageDiscountAdjustment? =
                percentageDiscountAdjustment

            fun usageDiscountAdjustment(): UsageDiscountAdjustment? = usageDiscountAdjustment

            fun minimumAdjustment(): MinimumAdjustment? = minimumAdjustment

            fun maximumAdjustment(): MaximumAdjustment? = maximumAdjustment

            fun isAmountDiscountAdjustment(): Boolean = amountDiscountAdjustment != null

            fun isPercentageDiscountAdjustment(): Boolean = percentageDiscountAdjustment != null

            fun isUsageDiscountAdjustment(): Boolean = usageDiscountAdjustment != null

            fun isMinimumAdjustment(): Boolean = minimumAdjustment != null

            fun isMaximumAdjustment(): Boolean = maximumAdjustment != null

            fun asAmountDiscountAdjustment(): AmountDiscountAdjustment =
                amountDiscountAdjustment.getOrThrow("amountDiscountAdjustment")

            fun asPercentageDiscountAdjustment(): PercentageDiscountAdjustment =
                percentageDiscountAdjustment.getOrThrow("percentageDiscountAdjustment")

            fun asUsageDiscountAdjustment(): UsageDiscountAdjustment =
                usageDiscountAdjustment.getOrThrow("usageDiscountAdjustment")

            fun asMinimumAdjustment(): MinimumAdjustment =
                minimumAdjustment.getOrThrow("minimumAdjustment")

            fun asMaximumAdjustment(): MaximumAdjustment =
                maximumAdjustment.getOrThrow("maximumAdjustment")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    amountDiscountAdjustment != null ->
                        visitor.visitAmountDiscountAdjustment(amountDiscountAdjustment)
                    percentageDiscountAdjustment != null ->
                        visitor.visitPercentageDiscountAdjustment(percentageDiscountAdjustment)
                    usageDiscountAdjustment != null ->
                        visitor.visitUsageDiscountAdjustment(usageDiscountAdjustment)
                    minimumAdjustment != null -> visitor.visitMinimumAdjustment(minimumAdjustment)
                    maximumAdjustment != null -> visitor.visitMaximumAdjustment(maximumAdjustment)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): Adjustment = apply {
                if (!validated) {
                    if (
                        amountDiscountAdjustment == null &&
                            percentageDiscountAdjustment == null &&
                            usageDiscountAdjustment == null &&
                            minimumAdjustment == null &&
                            maximumAdjustment == null
                    ) {
                        throw OrbInvalidDataException("Unknown Adjustment: $_json")
                    }
                    amountDiscountAdjustment?.validate()
                    percentageDiscountAdjustment?.validate()
                    usageDiscountAdjustment?.validate()
                    minimumAdjustment?.validate()
                    maximumAdjustment?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Adjustment && amountDiscountAdjustment == other.amountDiscountAdjustment && percentageDiscountAdjustment == other.percentageDiscountAdjustment && usageDiscountAdjustment == other.usageDiscountAdjustment && minimumAdjustment == other.minimumAdjustment && maximumAdjustment == other.maximumAdjustment /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(amountDiscountAdjustment, percentageDiscountAdjustment, usageDiscountAdjustment, minimumAdjustment, maximumAdjustment) /* spotless:on */

            override fun toString(): String =
                when {
                    amountDiscountAdjustment != null ->
                        "Adjustment{amountDiscountAdjustment=$amountDiscountAdjustment}"
                    percentageDiscountAdjustment != null ->
                        "Adjustment{percentageDiscountAdjustment=$percentageDiscountAdjustment}"
                    usageDiscountAdjustment != null ->
                        "Adjustment{usageDiscountAdjustment=$usageDiscountAdjustment}"
                    minimumAdjustment != null -> "Adjustment{minimumAdjustment=$minimumAdjustment}"
                    maximumAdjustment != null -> "Adjustment{maximumAdjustment=$maximumAdjustment}"
                    _json != null -> "Adjustment{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Adjustment")
                }

            companion object {

                fun ofAmountDiscountAdjustment(amountDiscountAdjustment: AmountDiscountAdjustment) =
                    Adjustment(amountDiscountAdjustment = amountDiscountAdjustment)

                fun ofPercentageDiscountAdjustment(
                    percentageDiscountAdjustment: PercentageDiscountAdjustment
                ) = Adjustment(percentageDiscountAdjustment = percentageDiscountAdjustment)

                fun ofUsageDiscountAdjustment(usageDiscountAdjustment: UsageDiscountAdjustment) =
                    Adjustment(usageDiscountAdjustment = usageDiscountAdjustment)

                fun ofMinimumAdjustment(minimumAdjustment: MinimumAdjustment) =
                    Adjustment(minimumAdjustment = minimumAdjustment)

                fun ofMaximumAdjustment(maximumAdjustment: MaximumAdjustment) =
                    Adjustment(maximumAdjustment = maximumAdjustment)
            }

            interface Visitor<out T> {

                fun visitAmountDiscountAdjustment(
                    amountDiscountAdjustment: AmountDiscountAdjustment
                ): T

                fun visitPercentageDiscountAdjustment(
                    percentageDiscountAdjustment: PercentageDiscountAdjustment
                ): T

                fun visitUsageDiscountAdjustment(
                    usageDiscountAdjustment: UsageDiscountAdjustment
                ): T

                fun visitMinimumAdjustment(minimumAdjustment: MinimumAdjustment): T

                fun visitMaximumAdjustment(maximumAdjustment: MaximumAdjustment): T

                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Adjustment: $json")
                }
            }

            class Deserializer : BaseDeserializer<Adjustment>(Adjustment::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Adjustment {
                    val json = JsonValue.fromJsonNode(node)
                    val adjustmentType = json.asObject()?.get("adjustment_type")?.asString()

                    when (adjustmentType) {
                        "amount_discount" -> {
                            tryDeserialize(node, jacksonTypeRef<AmountDiscountAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(amountDiscountAdjustment = it, _json = json)
                                }
                        }
                        "percentage_discount" -> {
                            tryDeserialize(node, jacksonTypeRef<PercentageDiscountAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(
                                        percentageDiscountAdjustment = it,
                                        _json = json
                                    )
                                }
                        }
                        "usage_discount" -> {
                            tryDeserialize(node, jacksonTypeRef<UsageDiscountAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(usageDiscountAdjustment = it, _json = json)
                                }
                        }
                        "minimum" -> {
                            tryDeserialize(node, jacksonTypeRef<MinimumAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(minimumAdjustment = it, _json = json)
                                }
                        }
                        "maximum" -> {
                            tryDeserialize(node, jacksonTypeRef<MaximumAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(maximumAdjustment = it, _json = json)
                                }
                        }
                    }

                    return Adjustment(_json = json)
                }
            }

            class Serializer : BaseSerializer<Adjustment>(Adjustment::class) {

                override fun serialize(
                    value: Adjustment,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.amountDiscountAdjustment != null ->
                            generator.writeObject(value.amountDiscountAdjustment)
                        value.percentageDiscountAdjustment != null ->
                            generator.writeObject(value.percentageDiscountAdjustment)
                        value.usageDiscountAdjustment != null ->
                            generator.writeObject(value.usageDiscountAdjustment)
                        value.minimumAdjustment != null ->
                            generator.writeObject(value.minimumAdjustment)
                        value.maximumAdjustment != null ->
                            generator.writeObject(value.maximumAdjustment)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Adjustment")
                    }
                }
            }

            @NoAutoDetect
            class AmountDiscountAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("amount_discount")
                @ExcludeMissing
                private val amountDiscount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

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

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

                /** The reason for the adjustment. */
                fun reason(): String? = reason.getNullable("reason")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

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

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): AmountDiscountAdjustment = apply {
                    if (!validated) {
                        id()
                        adjustmentType()
                        amountDiscount()
                        appliesToPriceIds()
                        isInvoiceLevel()
                        planPhaseOrder()
                        reason()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var amountDiscount: JsonField<String>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(amountDiscountAdjustment: AmountDiscountAdjustment) = apply {
                        id = amountDiscountAdjustment.id
                        adjustmentType = amountDiscountAdjustment.adjustmentType
                        amountDiscount = amountDiscountAdjustment.amountDiscount
                        appliesToPriceIds =
                            amountDiscountAdjustment.appliesToPriceIds.map { it.toMutableList() }
                        isInvoiceLevel = amountDiscountAdjustment.isInvoiceLevel
                        planPhaseOrder = amountDiscountAdjustment.planPhaseOrder
                        reason = amountDiscountAdjustment.reason
                        additionalProperties =
                            amountDiscountAdjustment.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /**
                     * The amount by which to discount the prices this adjustment applies to in a
                     * given billing period.
                     */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /**
                     * The amount by which to discount the prices this adjustment applies to in a
                     * given billing period.
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
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                                (asKnown()
                                        ?: throw IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        ))
                                    .add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
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

                    fun build(): AmountDiscountAdjustment =
                        AmountDiscountAdjustment(
                            checkNotNull(id) { "`id` is required but was not set" },
                            checkNotNull(adjustmentType) {
                                "`adjustmentType` is required but was not set"
                            },
                            checkNotNull(amountDiscount) {
                                "`amountDiscount` is required but was not set"
                            },
                            checkNotNull(appliesToPriceIds) {
                                    "`appliesToPriceIds` is required but was not set"
                                }
                                .map { it.toImmutable() },
                            checkNotNull(isInvoiceLevel) {
                                "`isInvoiceLevel` is required but was not set"
                            },
                            checkNotNull(planPhaseOrder) {
                                "`planPhaseOrder` is required but was not set"
                            },
                            checkNotNull(reason) { "`reason` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val AMOUNT_DISCOUNT = of("amount_discount")

                        fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    enum class Known {
                        AMOUNT_DISCOUNT,
                    }

                    enum class Value {
                        AMOUNT_DISCOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            AMOUNT_DISCOUNT -> Value.AMOUNT_DISCOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            AMOUNT_DISCOUNT -> Known.AMOUNT_DISCOUNT
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is AmountDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amountDiscount, appliesToPriceIds, isInvoiceLevel, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AmountDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PercentageDiscountAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 */
                fun percentageDiscount(): Double =
                    percentageDiscount.getRequired("percentage_discount")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

                /** The reason for the adjustment. */
                fun reason(): String? = reason.getNullable("reason")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

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
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount(): JsonField<Double> = percentageDiscount

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PercentageDiscountAdjustment = apply {
                    if (!validated) {
                        id()
                        adjustmentType()
                        appliesToPriceIds()
                        isInvoiceLevel()
                        percentageDiscount()
                        planPhaseOrder()
                        reason()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var percentageDiscount: JsonField<Double>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(percentageDiscountAdjustment: PercentageDiscountAdjustment) =
                        apply {
                            id = percentageDiscountAdjustment.id
                            adjustmentType = percentageDiscountAdjustment.adjustmentType
                            appliesToPriceIds =
                                percentageDiscountAdjustment.appliesToPriceIds.map {
                                    it.toMutableList()
                                }
                            isInvoiceLevel = percentageDiscountAdjustment.isInvoiceLevel
                            percentageDiscount = percentageDiscountAdjustment.percentageDiscount
                            planPhaseOrder = percentageDiscountAdjustment.planPhaseOrder
                            reason = percentageDiscountAdjustment.reason
                            additionalProperties =
                                percentageDiscountAdjustment.additionalProperties.toMutableMap()
                        }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
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
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                                (asKnown()
                                        ?: throw IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        ))
                                    .add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
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

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
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

                    fun build(): PercentageDiscountAdjustment =
                        PercentageDiscountAdjustment(
                            checkNotNull(id) { "`id` is required but was not set" },
                            checkNotNull(adjustmentType) {
                                "`adjustmentType` is required but was not set"
                            },
                            checkNotNull(appliesToPriceIds) {
                                    "`appliesToPriceIds` is required but was not set"
                                }
                                .map { it.toImmutable() },
                            checkNotNull(isInvoiceLevel) {
                                "`isInvoiceLevel` is required but was not set"
                            },
                            checkNotNull(percentageDiscount) {
                                "`percentageDiscount` is required but was not set"
                            },
                            checkNotNull(planPhaseOrder) {
                                "`planPhaseOrder` is required but was not set"
                            },
                            checkNotNull(reason) { "`reason` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val PERCENTAGE_DISCOUNT = of("percentage_discount")

                        fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE_DISCOUNT,
                    }

                    enum class Value {
                        PERCENTAGE_DISCOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE_DISCOUNT -> Value.PERCENTAGE_DISCOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE_DISCOUNT -> Known.PERCENTAGE_DISCOUNT
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is PercentageDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && percentageDiscount == other.percentageDiscount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, percentageDiscount, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PercentageDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, percentageDiscount=$percentageDiscount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class UsageDiscountAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
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

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

                /** The reason for the adjustment. */
                fun reason(): String? = reason.getNullable("reason")

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 */
                fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

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

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 */
                @JsonProperty("usage_discount")
                @ExcludeMissing
                fun _usageDiscount(): JsonField<Double> = usageDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): UsageDiscountAdjustment = apply {
                    if (!validated) {
                        id()
                        adjustmentType()
                        appliesToPriceIds()
                        isInvoiceLevel()
                        planPhaseOrder()
                        reason()
                        usageDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var usageDiscount: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(usageDiscountAdjustment: UsageDiscountAdjustment) = apply {
                        id = usageDiscountAdjustment.id
                        adjustmentType = usageDiscountAdjustment.adjustmentType
                        appliesToPriceIds =
                            usageDiscountAdjustment.appliesToPriceIds.map { it.toMutableList() }
                        isInvoiceLevel = usageDiscountAdjustment.isInvoiceLevel
                        planPhaseOrder = usageDiscountAdjustment.planPhaseOrder
                        reason = usageDiscountAdjustment.reason
                        usageDiscount = usageDiscountAdjustment.usageDiscount
                        additionalProperties =
                            usageDiscountAdjustment.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
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
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                                (asKnown()
                                        ?: throw IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        ))
                                    .add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    /**
                     * The number of usage units by which to discount the price this adjustment
                     * applies to in a given billing period.
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * The number of usage units by which to discount the price this adjustment
                     * applies to in a given billing period.
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

                    fun build(): UsageDiscountAdjustment =
                        UsageDiscountAdjustment(
                            checkNotNull(id) { "`id` is required but was not set" },
                            checkNotNull(adjustmentType) {
                                "`adjustmentType` is required but was not set"
                            },
                            checkNotNull(appliesToPriceIds) {
                                    "`appliesToPriceIds` is required but was not set"
                                }
                                .map { it.toImmutable() },
                            checkNotNull(isInvoiceLevel) {
                                "`isInvoiceLevel` is required but was not set"
                            },
                            checkNotNull(planPhaseOrder) {
                                "`planPhaseOrder` is required but was not set"
                            },
                            checkNotNull(reason) { "`reason` is required but was not set" },
                            checkNotNull(usageDiscount) {
                                "`usageDiscount` is required but was not set"
                            },
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val USAGE_DISCOUNT = of("usage_discount")

                        fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    enum class Known {
                        USAGE_DISCOUNT,
                    }

                    enum class Value {
                        USAGE_DISCOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            USAGE_DISCOUNT -> Value.USAGE_DISCOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            USAGE_DISCOUNT -> Known.USAGE_DISCOUNT
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is UsageDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && reason == other.reason && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, planPhaseOrder, reason, usageDiscount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "UsageDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, reason=$reason, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class MinimumAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
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
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

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
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

                /** The reason for the adjustment. */
                fun reason(): String? = reason.getNullable("reason")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

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
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun _minimumAmount(): JsonField<String> = minimumAmount

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): MinimumAdjustment = apply {
                    if (!validated) {
                        id()
                        adjustmentType()
                        appliesToPriceIds()
                        isInvoiceLevel()
                        itemId()
                        minimumAmount()
                        planPhaseOrder()
                        reason()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var itemId: JsonField<String>? = null
                    private var minimumAmount: JsonField<String>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(minimumAdjustment: MinimumAdjustment) = apply {
                        id = minimumAdjustment.id
                        adjustmentType = minimumAdjustment.adjustmentType
                        appliesToPriceIds =
                            minimumAdjustment.appliesToPriceIds.map { it.toMutableList() }
                        isInvoiceLevel = minimumAdjustment.isInvoiceLevel
                        itemId = minimumAdjustment.itemId
                        minimumAmount = minimumAdjustment.minimumAmount
                        planPhaseOrder = minimumAdjustment.planPhaseOrder
                        reason = minimumAdjustment.reason
                        additionalProperties = minimumAdjustment.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
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
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                                (asKnown()
                                        ?: throw IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        ))
                                    .add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
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

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
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

                    fun build(): MinimumAdjustment =
                        MinimumAdjustment(
                            checkNotNull(id) { "`id` is required but was not set" },
                            checkNotNull(adjustmentType) {
                                "`adjustmentType` is required but was not set"
                            },
                            checkNotNull(appliesToPriceIds) {
                                    "`appliesToPriceIds` is required but was not set"
                                }
                                .map { it.toImmutable() },
                            checkNotNull(isInvoiceLevel) {
                                "`isInvoiceLevel` is required but was not set"
                            },
                            checkNotNull(itemId) { "`itemId` is required but was not set" },
                            checkNotNull(minimumAmount) {
                                "`minimumAmount` is required but was not set"
                            },
                            checkNotNull(planPhaseOrder) {
                                "`planPhaseOrder` is required but was not set"
                            },
                            checkNotNull(reason) { "`reason` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val MINIMUM = of("minimum")

                        fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    enum class Known {
                        MINIMUM,
                    }

                    enum class Value {
                        MINIMUM,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MINIMUM -> Value.MINIMUM
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MINIMUM -> Known.MINIMUM
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is MinimumAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && itemId == other.itemId && minimumAmount == other.minimumAmount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, itemId, minimumAmount, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MinimumAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, itemId=$itemId, minimumAmount=$minimumAmount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class MaximumAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                private val maximumAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Long? = planPhaseOrder.getNullable("plan_phase_order")

                /** The reason for the adjustment. */
                fun reason(): String? = reason.getNullable("reason")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

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
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun _maximumAmount(): JsonField<String> = maximumAmount

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): MaximumAdjustment = apply {
                    if (!validated) {
                        id()
                        adjustmentType()
                        appliesToPriceIds()
                        isInvoiceLevel()
                        maximumAmount()
                        planPhaseOrder()
                        reason()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var maximumAmount: JsonField<String>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(maximumAdjustment: MaximumAdjustment) = apply {
                        id = maximumAdjustment.id
                        adjustmentType = maximumAdjustment.adjustmentType
                        appliesToPriceIds =
                            maximumAdjustment.appliesToPriceIds.map { it.toMutableList() }
                        isInvoiceLevel = maximumAdjustment.isInvoiceLevel
                        maximumAmount = maximumAdjustment.maximumAmount
                        planPhaseOrder = maximumAdjustment.planPhaseOrder
                        reason = maximumAdjustment.reason
                        additionalProperties = maximumAdjustment.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
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
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                                (asKnown()
                                        ?: throw IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        ))
                                    .add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
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

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
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

                    fun build(): MaximumAdjustment =
                        MaximumAdjustment(
                            checkNotNull(id) { "`id` is required but was not set" },
                            checkNotNull(adjustmentType) {
                                "`adjustmentType` is required but was not set"
                            },
                            checkNotNull(appliesToPriceIds) {
                                    "`appliesToPriceIds` is required but was not set"
                                }
                                .map { it.toImmutable() },
                            checkNotNull(isInvoiceLevel) {
                                "`isInvoiceLevel` is required but was not set"
                            },
                            checkNotNull(maximumAmount) {
                                "`maximumAmount` is required but was not set"
                            },
                            checkNotNull(planPhaseOrder) {
                                "`planPhaseOrder` is required but was not set"
                            },
                            checkNotNull(reason) { "`reason` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val MAXIMUM = of("maximum")

                        fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    enum class Known {
                        MAXIMUM,
                    }

                    enum class Value {
                        MAXIMUM,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MAXIMUM -> Value.MAXIMUM
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MAXIMUM -> Known.MAXIMUM
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is MaximumAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && maximumAmount == other.maximumAmount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, maximumAmount, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MaximumAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, maximumAmount=$maximumAmount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AdjustmentInterval && id == other.id && adjustment == other.adjustment && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && endDate == other.endDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, adjustment, appliesToPriceIntervalIds, endDate, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AdjustmentInterval{id=$id, adjustment=$adjustment, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class BillingCycleAnchorConfiguration
    @JsonCreator
    private constructor(
        @JsonProperty("day") @ExcludeMissing private val day: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("month")
        @ExcludeMissing
        private val month: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("year") @ExcludeMissing private val year: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The day of the month on which the billing cycle is anchored. If the maximum number of
         * days in a month is greater than this value, the last day of the month is the billing
         * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
         * 30th.
         */
        fun day(): Long = day.getRequired("day")

        /**
         * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
         * February would have cycles starting February, May, August, and November).
         */
        fun month(): Long? = month.getNullable("month")

        /**
         * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on
         * 2021 would have cycles starting on 2021, 2023, 2025, etc.).
         */
        fun year(): Long? = year.getNullable("year")

        /**
         * The day of the month on which the billing cycle is anchored. If the maximum number of
         * days in a month is greater than this value, the last day of the month is the billing
         * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
         * 30th.
         */
        @JsonProperty("day") @ExcludeMissing fun _day(): JsonField<Long> = day

        /**
         * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
         * February would have cycles starting February, May, August, and November).
         */
        @JsonProperty("month") @ExcludeMissing fun _month(): JsonField<Long> = month

        /**
         * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on
         * 2021 would have cycles starting on 2021, 2023, 2025, etc.).
         */
        @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Long> = year

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BillingCycleAnchorConfiguration = apply {
            if (!validated) {
                day()
                month()
                year()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var day: JsonField<Long>? = null
            private var month: JsonField<Long> = JsonMissing.of()
            private var year: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration) =
                apply {
                    day = billingCycleAnchorConfiguration.day
                    month = billingCycleAnchorConfiguration.month
                    year = billingCycleAnchorConfiguration.year
                    additionalProperties =
                        billingCycleAnchorConfiguration.additionalProperties.toMutableMap()
                }

            /**
             * The day of the month on which the billing cycle is anchored. If the maximum number of
             * days in a month is greater than this value, the last day of the month is the billing
             * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
             * 30th.
             */
            fun day(day: Long) = day(JsonField.of(day))

            /**
             * The day of the month on which the billing cycle is anchored. If the maximum number of
             * days in a month is greater than this value, the last day of the month is the billing
             * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
             * 30th.
             */
            fun day(day: JsonField<Long>) = apply { this.day = day }

            /**
             * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
             * February would have cycles starting February, May, August, and November).
             */
            fun month(month: Long?) = month(JsonField.ofNullable(month))

            /**
             * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
             * February would have cycles starting February, May, August, and November).
             */
            fun month(month: Long) = month(month as Long?)

            /**
             * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
             * February would have cycles starting February, May, August, and November).
             */
            fun month(month: JsonField<Long>) = apply { this.month = month }

            /**
             * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored
             * on 2021 would have cycles starting on 2021, 2023, 2025, etc.).
             */
            fun year(year: Long?) = year(JsonField.ofNullable(year))

            /**
             * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored
             * on 2021 would have cycles starting on 2021, 2023, 2025, etc.).
             */
            fun year(year: Long) = year(year as Long?)

            /**
             * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored
             * on 2021 would have cycles starting on 2021, 2023, 2025, etc.).
             */
            fun year(year: JsonField<Long>) = apply { this.year = year }

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

            fun build(): BillingCycleAnchorConfiguration =
                BillingCycleAnchorConfiguration(
                    checkNotNull(day) { "`day` is required but was not set" },
                    month,
                    year,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingCycleAnchorConfiguration && day == other.day && month == other.month && year == other.year && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(day, month, year, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingCycleAnchorConfiguration{day=$day, month=$month, year=$year, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = DiscountInterval.Deserializer::class)
    @JsonSerialize(using = DiscountInterval.Serializer::class)
    class DiscountInterval
    private constructor(
        private val amountDiscountInterval: AmountDiscountInterval? = null,
        private val percentageDiscountInterval: PercentageDiscountInterval? = null,
        private val usageDiscountInterval: UsageDiscountInterval? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun amountDiscountInterval(): AmountDiscountInterval? = amountDiscountInterval

        fun percentageDiscountInterval(): PercentageDiscountInterval? = percentageDiscountInterval

        fun usageDiscountInterval(): UsageDiscountInterval? = usageDiscountInterval

        fun isAmountDiscountInterval(): Boolean = amountDiscountInterval != null

        fun isPercentageDiscountInterval(): Boolean = percentageDiscountInterval != null

        fun isUsageDiscountInterval(): Boolean = usageDiscountInterval != null

        fun asAmountDiscountInterval(): AmountDiscountInterval =
            amountDiscountInterval.getOrThrow("amountDiscountInterval")

        fun asPercentageDiscountInterval(): PercentageDiscountInterval =
            percentageDiscountInterval.getOrThrow("percentageDiscountInterval")

        fun asUsageDiscountInterval(): UsageDiscountInterval =
            usageDiscountInterval.getOrThrow("usageDiscountInterval")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                amountDiscountInterval != null ->
                    visitor.visitAmountDiscountInterval(amountDiscountInterval)
                percentageDiscountInterval != null ->
                    visitor.visitPercentageDiscountInterval(percentageDiscountInterval)
                usageDiscountInterval != null ->
                    visitor.visitUsageDiscountInterval(usageDiscountInterval)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): DiscountInterval = apply {
            if (!validated) {
                if (
                    amountDiscountInterval == null &&
                        percentageDiscountInterval == null &&
                        usageDiscountInterval == null
                ) {
                    throw OrbInvalidDataException("Unknown DiscountInterval: $_json")
                }
                amountDiscountInterval?.validate()
                percentageDiscountInterval?.validate()
                usageDiscountInterval?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DiscountInterval && amountDiscountInterval == other.amountDiscountInterval && percentageDiscountInterval == other.percentageDiscountInterval && usageDiscountInterval == other.usageDiscountInterval /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(amountDiscountInterval, percentageDiscountInterval, usageDiscountInterval) /* spotless:on */

        override fun toString(): String =
            when {
                amountDiscountInterval != null ->
                    "DiscountInterval{amountDiscountInterval=$amountDiscountInterval}"
                percentageDiscountInterval != null ->
                    "DiscountInterval{percentageDiscountInterval=$percentageDiscountInterval}"
                usageDiscountInterval != null ->
                    "DiscountInterval{usageDiscountInterval=$usageDiscountInterval}"
                _json != null -> "DiscountInterval{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid DiscountInterval")
            }

        companion object {

            fun ofAmountDiscountInterval(amountDiscountInterval: AmountDiscountInterval) =
                DiscountInterval(amountDiscountInterval = amountDiscountInterval)

            fun ofPercentageDiscountInterval(
                percentageDiscountInterval: PercentageDiscountInterval
            ) = DiscountInterval(percentageDiscountInterval = percentageDiscountInterval)

            fun ofUsageDiscountInterval(usageDiscountInterval: UsageDiscountInterval) =
                DiscountInterval(usageDiscountInterval = usageDiscountInterval)
        }

        interface Visitor<out T> {

            fun visitAmountDiscountInterval(amountDiscountInterval: AmountDiscountInterval): T

            fun visitPercentageDiscountInterval(
                percentageDiscountInterval: PercentageDiscountInterval
            ): T

            fun visitUsageDiscountInterval(usageDiscountInterval: UsageDiscountInterval): T

            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown DiscountInterval: $json")
            }
        }

        class Deserializer : BaseDeserializer<DiscountInterval>(DiscountInterval::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): DiscountInterval {
                val json = JsonValue.fromJsonNode(node)
                val discountType = json.asObject()?.get("discount_type")?.asString()

                when (discountType) {
                    "amount" -> {
                        tryDeserialize(node, jacksonTypeRef<AmountDiscountInterval>()) {
                                it.validate()
                            }
                            ?.let {
                                return DiscountInterval(amountDiscountInterval = it, _json = json)
                            }
                    }
                    "percentage" -> {
                        tryDeserialize(node, jacksonTypeRef<PercentageDiscountInterval>()) {
                                it.validate()
                            }
                            ?.let {
                                return DiscountInterval(
                                    percentageDiscountInterval = it,
                                    _json = json
                                )
                            }
                    }
                    "usage" -> {
                        tryDeserialize(node, jacksonTypeRef<UsageDiscountInterval>()) {
                                it.validate()
                            }
                            ?.let {
                                return DiscountInterval(usageDiscountInterval = it, _json = json)
                            }
                    }
                }

                return DiscountInterval(_json = json)
            }
        }

        class Serializer : BaseSerializer<DiscountInterval>(DiscountInterval::class) {

            override fun serialize(
                value: DiscountInterval,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.amountDiscountInterval != null ->
                        generator.writeObject(value.amountDiscountInterval)
                    value.percentageDiscountInterval != null ->
                        generator.writeObject(value.percentageDiscountInterval)
                    value.usageDiscountInterval != null ->
                        generator.writeObject(value.usageDiscountInterval)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid DiscountInterval")
                }
            }
        }

        @NoAutoDetect
        class AmountDiscountInterval
        @JsonCreator
        private constructor(
            @JsonProperty("amount_discount")
            @ExcludeMissing
            private val amountDiscount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("discount_type")
            @ExcludeMissing
            private val discountType: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Only available if discount_type is `amount`. */
            fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

            /** The price ids that this discount interval applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** The price interval ids that this discount interval applies to. */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /** The end date of the discount interval. */
            fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

            /** The start date of the discount interval. */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /** Only available if discount_type is `amount`. */
            @JsonProperty("amount_discount")
            @ExcludeMissing
            fun _amountDiscount(): JsonField<String> = amountDiscount

            /** The price ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /** The price interval ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType(): JsonField<DiscountType> = discountType

            /** The end date of the discount interval. */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /** The start date of the discount interval. */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AmountDiscountInterval = apply {
                if (!validated) {
                    amountDiscount()
                    appliesToPriceIds()
                    appliesToPriceIntervalIds()
                    discountType()
                    endDate()
                    startDate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amountDiscount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
                private var discountType: JsonField<DiscountType>? = null
                private var endDate: JsonField<OffsetDateTime>? = null
                private var startDate: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(amountDiscountInterval: AmountDiscountInterval) = apply {
                    amountDiscount = amountDiscountInterval.amountDiscount
                    appliesToPriceIds =
                        amountDiscountInterval.appliesToPriceIds.map { it.toMutableList() }
                    appliesToPriceIntervalIds =
                        amountDiscountInterval.appliesToPriceIntervalIds.map { it.toMutableList() }
                    discountType = amountDiscountInterval.discountType
                    endDate = amountDiscountInterval.endDate
                    startDate = amountDiscountInterval.startDate
                    additionalProperties =
                        amountDiscountInterval.additionalProperties.toMutableMap()
                }

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(amountDiscount: String) =
                    amountDiscount(JsonField.of(amountDiscount))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                    this.amountDiscount = amountDiscount
                }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The price ids that this discount interval applies to. */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(appliesToPriceId)
                        }
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds =
                            appliesToPriceIntervalIds.map { it.toMutableList() }
                    }

                /** The price interval ids that this discount interval applies to. */
                fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                    appliesToPriceIntervalIds =
                        (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(appliesToPriceIntervalId)
                        }
                }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

                /** The end date of the discount interval. */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /** The start date of the discount interval. */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /** The start date of the discount interval. */
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

                fun build(): AmountDiscountInterval =
                    AmountDiscountInterval(
                        checkNotNull(amountDiscount) {
                            "`amountDiscount` is required but was not set"
                        },
                        checkNotNull(appliesToPriceIds) {
                                "`appliesToPriceIds` is required but was not set"
                            }
                            .map { it.toImmutable() },
                        checkNotNull(appliesToPriceIntervalIds) {
                                "`appliesToPriceIntervalIds` is required but was not set"
                            }
                            .map { it.toImmutable() },
                        checkNotNull(discountType) { "`discountType` is required but was not set" },
                        checkNotNull(endDate) { "`endDate` is required but was not set" },
                        checkNotNull(startDate) { "`startDate` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AMOUNT = of("amount")

                    fun of(value: String) = DiscountType(JsonField.of(value))
                }

                enum class Known {
                    AMOUNT,
                }

                enum class Value {
                    AMOUNT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        AMOUNT -> Value.AMOUNT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        AMOUNT -> Known.AMOUNT
                        else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AmountDiscountInterval && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && discountType == other.discountType && endDate == other.endDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amountDiscount, appliesToPriceIds, appliesToPriceIntervalIds, discountType, endDate, startDate, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AmountDiscountInterval{amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, discountType=$discountType, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PercentageDiscountInterval
        @JsonCreator
        private constructor(
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("discount_type")
            @ExcludeMissing
            private val discountType: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The price ids that this discount interval applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** The price interval ids that this discount interval applies to. */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /** The end date of the discount interval. */
            fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

            /** Only available if discount_type is `percentage`.This is a number between 0 and 1. */
            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            /** The start date of the discount interval. */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /** The price ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /** The price interval ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType(): JsonField<DiscountType> = discountType

            /** The end date of the discount interval. */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /** Only available if discount_type is `percentage`.This is a number between 0 and 1. */
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount(): JsonField<Double> = percentageDiscount

            /** The start date of the discount interval. */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PercentageDiscountInterval = apply {
                if (!validated) {
                    appliesToPriceIds()
                    appliesToPriceIntervalIds()
                    discountType()
                    endDate()
                    percentageDiscount()
                    startDate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
                private var discountType: JsonField<DiscountType>? = null
                private var endDate: JsonField<OffsetDateTime>? = null
                private var percentageDiscount: JsonField<Double>? = null
                private var startDate: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(percentageDiscountInterval: PercentageDiscountInterval) = apply {
                    appliesToPriceIds =
                        percentageDiscountInterval.appliesToPriceIds.map { it.toMutableList() }
                    appliesToPriceIntervalIds =
                        percentageDiscountInterval.appliesToPriceIntervalIds.map {
                            it.toMutableList()
                        }
                    discountType = percentageDiscountInterval.discountType
                    endDate = percentageDiscountInterval.endDate
                    percentageDiscount = percentageDiscountInterval.percentageDiscount
                    startDate = percentageDiscountInterval.startDate
                    additionalProperties =
                        percentageDiscountInterval.additionalProperties.toMutableMap()
                }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The price ids that this discount interval applies to. */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(appliesToPriceId)
                        }
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds =
                            appliesToPriceIntervalIds.map { it.toMutableList() }
                    }

                /** The price interval ids that this discount interval applies to. */
                fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                    appliesToPriceIntervalIds =
                        (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(appliesToPriceIntervalId)
                        }
                }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

                /** The end date of the discount interval. */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /**
                 * Only available if discount_type is `percentage`.This is a number between 0 and 1.
                 */
                fun percentageDiscount(percentageDiscount: Double) =
                    percentageDiscount(JsonField.of(percentageDiscount))

                /**
                 * Only available if discount_type is `percentage`.This is a number between 0 and 1.
                 */
                fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                    this.percentageDiscount = percentageDiscount
                }

                /** The start date of the discount interval. */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /** The start date of the discount interval. */
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

                fun build(): PercentageDiscountInterval =
                    PercentageDiscountInterval(
                        checkNotNull(appliesToPriceIds) {
                                "`appliesToPriceIds` is required but was not set"
                            }
                            .map { it.toImmutable() },
                        checkNotNull(appliesToPriceIntervalIds) {
                                "`appliesToPriceIntervalIds` is required but was not set"
                            }
                            .map { it.toImmutable() },
                        checkNotNull(discountType) { "`discountType` is required but was not set" },
                        checkNotNull(endDate) { "`endDate` is required but was not set" },
                        checkNotNull(percentageDiscount) {
                            "`percentageDiscount` is required but was not set"
                        },
                        checkNotNull(startDate) { "`startDate` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PERCENTAGE = of("percentage")

                    fun of(value: String) = DiscountType(JsonField.of(value))
                }

                enum class Known {
                    PERCENTAGE,
                }

                enum class Value {
                    PERCENTAGE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PERCENTAGE -> Value.PERCENTAGE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PERCENTAGE -> Known.PERCENTAGE
                        else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PercentageDiscountInterval && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && discountType == other.discountType && endDate == other.endDate && percentageDiscount == other.percentageDiscount && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, appliesToPriceIntervalIds, discountType, endDate, percentageDiscount, startDate, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PercentageDiscountInterval{appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, discountType=$discountType, endDate=$endDate, percentageDiscount=$percentageDiscount, startDate=$startDate, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UsageDiscountInterval
        @JsonCreator
        private constructor(
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("discount_type")
            @ExcludeMissing
            private val discountType: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("usage_discount")
            @ExcludeMissing
            private val usageDiscount: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The price ids that this discount interval applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** The price interval ids that this discount interval applies to. */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /** The end date of the discount interval. */
            fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

            /** The start date of the discount interval. */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /**
             * Only available if discount_type is `usage`. Number of usage units that this discount
             * is for
             */
            fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

            /** The price ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /** The price interval ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType(): JsonField<DiscountType> = discountType

            /** The end date of the discount interval. */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /** The start date of the discount interval. */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

            /**
             * Only available if discount_type is `usage`. Number of usage units that this discount
             * is for
             */
            @JsonProperty("usage_discount")
            @ExcludeMissing
            fun _usageDiscount(): JsonField<Double> = usageDiscount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UsageDiscountInterval = apply {
                if (!validated) {
                    appliesToPriceIds()
                    appliesToPriceIntervalIds()
                    discountType()
                    endDate()
                    startDate()
                    usageDiscount()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
                private var discountType: JsonField<DiscountType>? = null
                private var endDate: JsonField<OffsetDateTime>? = null
                private var startDate: JsonField<OffsetDateTime>? = null
                private var usageDiscount: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(usageDiscountInterval: UsageDiscountInterval) = apply {
                    appliesToPriceIds =
                        usageDiscountInterval.appliesToPriceIds.map { it.toMutableList() }
                    appliesToPriceIntervalIds =
                        usageDiscountInterval.appliesToPriceIntervalIds.map { it.toMutableList() }
                    discountType = usageDiscountInterval.discountType
                    endDate = usageDiscountInterval.endDate
                    startDate = usageDiscountInterval.startDate
                    usageDiscount = usageDiscountInterval.usageDiscount
                    additionalProperties = usageDiscountInterval.additionalProperties.toMutableMap()
                }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The price ids that this discount interval applies to. */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(appliesToPriceId)
                        }
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds =
                            appliesToPriceIntervalIds.map { it.toMutableList() }
                    }

                /** The price interval ids that this discount interval applies to. */
                fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                    appliesToPriceIntervalIds =
                        (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(appliesToPriceIntervalId)
                        }
                }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

                /** The end date of the discount interval. */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /** The start date of the discount interval. */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /** The start date of the discount interval. */
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
                }

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(usageDiscount: Double) =
                    usageDiscount(JsonField.of(usageDiscount))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
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

                fun build(): UsageDiscountInterval =
                    UsageDiscountInterval(
                        checkNotNull(appliesToPriceIds) {
                                "`appliesToPriceIds` is required but was not set"
                            }
                            .map { it.toImmutable() },
                        checkNotNull(appliesToPriceIntervalIds) {
                                "`appliesToPriceIntervalIds` is required but was not set"
                            }
                            .map { it.toImmutable() },
                        checkNotNull(discountType) { "`discountType` is required but was not set" },
                        checkNotNull(endDate) { "`endDate` is required but was not set" },
                        checkNotNull(startDate) { "`startDate` is required but was not set" },
                        checkNotNull(usageDiscount) {
                            "`usageDiscount` is required but was not set"
                        },
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val USAGE = of("usage")

                    fun of(value: String) = DiscountType(JsonField.of(value))
                }

                enum class Known {
                    USAGE,
                }

                enum class Value {
                    USAGE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        USAGE -> Value.USAGE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        USAGE -> Known.USAGE
                        else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UsageDiscountInterval && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && discountType == other.discountType && endDate == other.endDate && startDate == other.startDate && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, appliesToPriceIntervalIds, discountType, endDate, startDate, usageDiscount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsageDiscountInterval{appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, discountType=$discountType, endDate=$endDate, startDate=$startDate, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
        }
    }

    @NoAutoDetect
    class FixedFeeQuantitySchedule
    @JsonCreator
    private constructor(
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("price_id")
        @ExcludeMissing
        private val priceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        fun priceId(): String = priceId.getRequired("price_id")

        fun quantity(): Double = quantity.getRequired("quantity")

        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): FixedFeeQuantitySchedule = apply {
            if (!validated) {
                endDate()
                priceId()
                quantity()
                startDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var endDate: JsonField<OffsetDateTime>? = null
            private var priceId: JsonField<String>? = null
            private var quantity: JsonField<Double>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(fixedFeeQuantitySchedule: FixedFeeQuantitySchedule) = apply {
                endDate = fixedFeeQuantitySchedule.endDate
                priceId = fixedFeeQuantitySchedule.priceId
                quantity = fixedFeeQuantitySchedule.quantity
                startDate = fixedFeeQuantitySchedule.startDate
                additionalProperties = fixedFeeQuantitySchedule.additionalProperties.toMutableMap()
            }

            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            fun priceId(priceId: String) = priceId(JsonField.of(priceId))

            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

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

            fun build(): FixedFeeQuantitySchedule =
                FixedFeeQuantitySchedule(
                    checkNotNull(endDate) { "`endDate` is required but was not set" },
                    checkNotNull(priceId) { "`priceId` is required but was not set" },
                    checkNotNull(quantity) { "`quantity` is required but was not set" },
                    checkNotNull(startDate) { "`startDate` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FixedFeeQuantitySchedule && endDate == other.endDate && priceId == other.priceId && quantity == other.quantity && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endDate, priceId, quantity, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FixedFeeQuantitySchedule{endDate=$endDate, priceId=$priceId, quantity=$quantity, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class MaximumInterval
    @JsonCreator
    private constructor(
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The price ids that this maximum interval applies to. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** The price interval ids that this maximum interval applies to. */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        /** The end date of the maximum interval. */
        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        /**
         * The maximum amount to charge in a given billing period for the price intervals this
         * transform applies to.
         */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /** The start date of the maximum interval. */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /** The price ids that this maximum interval applies to. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /** The price interval ids that this maximum interval applies to. */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

        /** The end date of the maximum interval. */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * The maximum amount to charge in a given billing period for the price intervals this
         * transform applies to.
         */
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        /** The start date of the maximum interval. */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): MaximumInterval = apply {
            if (!validated) {
                appliesToPriceIds()
                appliesToPriceIntervalIds()
                endDate()
                maximumAmount()
                startDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var maximumAmount: JsonField<String>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(maximumInterval: MaximumInterval) = apply {
                appliesToPriceIds = maximumInterval.appliesToPriceIds.map { it.toMutableList() }
                appliesToPriceIntervalIds =
                    maximumInterval.appliesToPriceIntervalIds.map { it.toMutableList() }
                endDate = maximumInterval.endDate
                maximumAmount = maximumInterval.maximumAmount
                startDate = maximumInterval.startDate
                additionalProperties = maximumInterval.additionalProperties.toMutableMap()
            }

            /** The price ids that this maximum interval applies to. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The price ids that this maximum interval applies to. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /** The price ids that this maximum interval applies to. */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(appliesToPriceId)
                    }
            }

            /** The price interval ids that this maximum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /** The price interval ids that this maximum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds =
                        appliesToPriceIntervalIds.map { it.toMutableList() }
                }

            /** The price interval ids that this maximum interval applies to. */
            fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                appliesToPriceIntervalIds =
                    (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(appliesToPriceIntervalId)
                    }
            }

            /** The end date of the maximum interval. */
            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /** The end date of the maximum interval. */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * The maximum amount to charge in a given billing period for the price intervals this
             * transform applies to.
             */
            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            /**
             * The maximum amount to charge in a given billing period for the price intervals this
             * transform applies to.
             */
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /** The start date of the maximum interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The start date of the maximum interval. */
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

            fun build(): MaximumInterval =
                MaximumInterval(
                    checkNotNull(appliesToPriceIds) {
                            "`appliesToPriceIds` is required but was not set"
                        }
                        .map { it.toImmutable() },
                    checkNotNull(appliesToPriceIntervalIds) {
                            "`appliesToPriceIntervalIds` is required but was not set"
                        }
                        .map { it.toImmutable() },
                    checkNotNull(endDate) { "`endDate` is required but was not set" },
                    checkNotNull(maximumAmount) { "`maximumAmount` is required but was not set" },
                    checkNotNull(startDate) { "`startDate` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MaximumInterval && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && endDate == other.endDate && maximumAmount == other.maximumAmount && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, appliesToPriceIntervalIds, endDate, maximumAmount, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MaximumInterval{appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, endDate=$endDate, maximumAmount=$maximumAmount, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

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

    @NoAutoDetect
    class MinimumInterval
    @JsonCreator
    private constructor(
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        private val minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The price ids that this minimum interval applies to. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** The price interval ids that this minimum interval applies to. */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        /** The end date of the minimum interval. */
        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        /**
         * The minimum amount to charge in a given billing period for the price intervals this
         * minimum applies to.
         */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /** The start date of the minimum interval. */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /** The price ids that this minimum interval applies to. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /** The price interval ids that this minimum interval applies to. */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

        /** The end date of the minimum interval. */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * The minimum amount to charge in a given billing period for the price intervals this
         * minimum applies to.
         */
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        /** The start date of the minimum interval. */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): MinimumInterval = apply {
            if (!validated) {
                appliesToPriceIds()
                appliesToPriceIntervalIds()
                endDate()
                minimumAmount()
                startDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var minimumAmount: JsonField<String>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(minimumInterval: MinimumInterval) = apply {
                appliesToPriceIds = minimumInterval.appliesToPriceIds.map { it.toMutableList() }
                appliesToPriceIntervalIds =
                    minimumInterval.appliesToPriceIntervalIds.map { it.toMutableList() }
                endDate = minimumInterval.endDate
                minimumAmount = minimumInterval.minimumAmount
                startDate = minimumInterval.startDate
                additionalProperties = minimumInterval.additionalProperties.toMutableMap()
            }

            /** The price ids that this minimum interval applies to. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The price ids that this minimum interval applies to. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /** The price ids that this minimum interval applies to. */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(appliesToPriceId)
                    }
            }

            /** The price interval ids that this minimum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /** The price interval ids that this minimum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds =
                        appliesToPriceIntervalIds.map { it.toMutableList() }
                }

            /** The price interval ids that this minimum interval applies to. */
            fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                appliesToPriceIntervalIds =
                    (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(appliesToPriceIntervalId)
                    }
            }

            /** The end date of the minimum interval. */
            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /** The end date of the minimum interval. */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * The minimum amount to charge in a given billing period for the price intervals this
             * minimum applies to.
             */
            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            /**
             * The minimum amount to charge in a given billing period for the price intervals this
             * minimum applies to.
             */
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            /** The start date of the minimum interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The start date of the minimum interval. */
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

            fun build(): MinimumInterval =
                MinimumInterval(
                    checkNotNull(appliesToPriceIds) {
                            "`appliesToPriceIds` is required but was not set"
                        }
                        .map { it.toImmutable() },
                    checkNotNull(appliesToPriceIntervalIds) {
                            "`appliesToPriceIntervalIds` is required but was not set"
                        }
                        .map { it.toImmutable() },
                    checkNotNull(endDate) { "`endDate` is required but was not set" },
                    checkNotNull(minimumAmount) { "`minimumAmount` is required but was not set" },
                    checkNotNull(startDate) { "`startDate` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MinimumInterval && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && endDate == other.endDate && minimumAmount == other.minimumAmount && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, appliesToPriceIntervalIds, endDate, minimumAmount, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MinimumInterval{appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, endDate=$endDate, minimumAmount=$minimumAmount, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    /**
     * The Price Interval resource represents a period of time for which a price will bill on a
     * subscription. A subscription’s price intervals define its billing behavior.
     */
    @NoAutoDetect
    class PriceInterval
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_cycle_day")
        @ExcludeMissing
        private val billingCycleDay: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("current_billing_period_end_date")
        @ExcludeMissing
        private val currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("current_billing_period_start_date")
        @ExcludeMissing
        private val currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        private val fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>> =
            JsonMissing.of(),
        @JsonProperty("price")
        @ExcludeMissing
        private val price: JsonField<Price> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        /** The day of the month that Orb bills for this price */
        fun billingCycleDay(): Long = billingCycleDay.getRequired("billing_cycle_day")

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is exactly the end of the billing period. Set to null if this price
         * interval is not currently active.
         */
        fun currentBillingPeriodEndDate(): OffsetDateTime? =
            currentBillingPeriodEndDate.getNullable("current_billing_period_end_date")

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if this price
         * interval is not currently active.
         */
        fun currentBillingPeriodStartDate(): OffsetDateTime? =
            currentBillingPeriodStartDate.getNullable("current_billing_period_start_date")

        /**
         * The end date of the price interval. This is the date that Orb stops billing for this
         * price.
         */
        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        /**
         * The fixed fee quantity transitions for this price interval. This is only relevant for
         * fixed fees.
         */
        fun fixedFeeQuantityTransitions(): List<FixedFeeQuantityTransition>? =
            fixedFeeQuantityTransitions.getNullable("fixed_fee_quantity_transitions")

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
        fun price(): Price = price.getRequired("price")

        /**
         * The start date of the price interval. This is the date that Orb starts billing for this
         * price.
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The day of the month that Orb bills for this price */
        @JsonProperty("billing_cycle_day")
        @ExcludeMissing
        fun _billingCycleDay(): JsonField<Long> = billingCycleDay

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is exactly the end of the billing period. Set to null if this price
         * interval is not currently active.
         */
        @JsonProperty("current_billing_period_end_date")
        @ExcludeMissing
        fun _currentBillingPeriodEndDate(): JsonField<OffsetDateTime> = currentBillingPeriodEndDate

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if this price
         * interval is not currently active.
         */
        @JsonProperty("current_billing_period_start_date")
        @ExcludeMissing
        fun _currentBillingPeriodStartDate(): JsonField<OffsetDateTime> =
            currentBillingPeriodStartDate

        /**
         * The end date of the price interval. This is the date that Orb stops billing for this
         * price.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * The fixed fee quantity transitions for this price interval. This is only relevant for
         * fixed fees.
         */
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        fun _fixedFeeQuantityTransitions(): JsonField<List<FixedFeeQuantityTransition>> =
            fixedFeeQuantityTransitions

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
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

        /**
         * The start date of the price interval. This is the date that Orb starts billing for this
         * price.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PriceInterval = apply {
            if (!validated) {
                id()
                billingCycleDay()
                currentBillingPeriodEndDate()
                currentBillingPeriodStartDate()
                endDate()
                fixedFeeQuantityTransitions()?.forEach { it.validate() }
                price()
                startDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var billingCycleDay: JsonField<Long>? = null
            private var currentBillingPeriodEndDate: JsonField<OffsetDateTime>? = null
            private var currentBillingPeriodStartDate: JsonField<OffsetDateTime>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var fixedFeeQuantityTransitions:
                JsonField<MutableList<FixedFeeQuantityTransition>>? =
                null
            private var price: JsonField<Price>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(priceInterval: PriceInterval) = apply {
                id = priceInterval.id
                billingCycleDay = priceInterval.billingCycleDay
                currentBillingPeriodEndDate = priceInterval.currentBillingPeriodEndDate
                currentBillingPeriodStartDate = priceInterval.currentBillingPeriodStartDate
                endDate = priceInterval.endDate
                fixedFeeQuantityTransitions =
                    priceInterval.fixedFeeQuantityTransitions.map { it.toMutableList() }
                price = priceInterval.price
                startDate = priceInterval.startDate
                additionalProperties = priceInterval.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The day of the month that Orb bills for this price */
            fun billingCycleDay(billingCycleDay: Long) =
                billingCycleDay(JsonField.of(billingCycleDay))

            /** The day of the month that Orb bills for this price */
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
             * The end of the current billing period. This is an exclusive timestamp, such that the
             * instant returned is exactly the end of the billing period. Set to null if this price
             * interval is not currently active.
             */
            fun currentBillingPeriodEndDate(
                currentBillingPeriodEndDate: JsonField<OffsetDateTime>
            ) = apply { this.currentBillingPeriodEndDate = currentBillingPeriodEndDate }

            /**
             * The start date of the current billing period. This is an inclusive timestamp; the
             * instant returned is exactly the beginning of the billing period. Set to null if this
             * price interval is not currently active.
             */
            fun currentBillingPeriodStartDate(currentBillingPeriodStartDate: OffsetDateTime?) =
                currentBillingPeriodStartDate(JsonField.ofNullable(currentBillingPeriodStartDate))

            /**
             * The start date of the current billing period. This is an inclusive timestamp; the
             * instant returned is exactly the beginning of the billing period. Set to null if this
             * price interval is not currently active.
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
             * The end date of the price interval. This is the date that Orb stops billing for this
             * price.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * The fixed fee quantity transitions for this price interval. This is only relevant for
             * fixed fees.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>?
            ) = fixedFeeQuantityTransitions(JsonField.ofNullable(fixedFeeQuantityTransitions))

            /**
             * The fixed fee quantity transitions for this price interval. This is only relevant for
             * fixed fees.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>>
            ) = apply {
                this.fixedFeeQuantityTransitions =
                    fixedFeeQuantityTransitions.map { it.toMutableList() }
            }

            /**
             * The fixed fee quantity transitions for this price interval. This is only relevant for
             * fixed fees.
             */
            fun addFixedFeeQuantityTransition(
                fixedFeeQuantityTransition: FixedFeeQuantityTransition
            ) = apply {
                fixedFeeQuantityTransitions =
                    (fixedFeeQuantityTransitions ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(fixedFeeQuantityTransition)
                    }
            }

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
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
             * In tiered pricing, the cost of a given unit depends on the tier range that it falls
             * into, where each tier range is defined by an upper and lower bound. For example, the
             * first ten units may cost $0.50 each and all units thereafter may cost $0.10 each.
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
             * $5.00. Once you've bought more than 10 units, all units may now be priced at $0.40
             * (i.e. 101 units total would be $40.40).
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
             * example, if the package size is set to 5, then 4 units will be billed as 5 and 6
             * units will be billed at 10.
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
             * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a
             * percent (the number of basis points to charge), as well as a cap per event to assess.
             * For example, this would allow you to assess a fee of 0.25% on every payment you
             * process, with a maximum charge of $25 per payment.
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
             * quantity across all events. Similar to bulk pricing, the BPS parameters of a given
             * event depends on the tier range that the billing period falls into. Each tier range
             * is defined by an upper bound. For example, after $1.5M of payment volume is reached,
             * each individual payment may have a lower cap or a smaller take-rate.
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
             * applicable parameter is a function of its marginal addition to the period total.
             * Similar to tiered pricing, the BPS parameters of a given event depends on the tier
             * range that it falls into, where each tier range is defined by an upper and lower
             * bound. For example, the first few payments may have a 0.8 BPS take-rate and all
             * payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
             * `dimensions` defines the two event property values evaluated in this pricing model.
             * In a one-dimensional matrix, the second value is `null`. Every configuration has a
             * list of `matrix_values` which give the unit prices for specified property values. In
             * a one-dimensional matrix, the matrix values will have `dimension_values` where the
             * second value of the pair is null. If an event does not match any of the dimension
             * values in the matrix, it will resort to the `default_unit_amount`.
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
             * Fixed fees are prices that are applied independent of usage quantities, and follow
             * unit pricing. They also have an additional parameter `fixed_price_quantity`. If the
             * Price represents a fixed cost, this represents the quantity of units applied.
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
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
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
             * In tiered pricing, the cost of a given unit depends on the tier range that it falls
             * into, where each tier range is defined by an upper and lower bound. For example, the
             * first ten units may cost $0.50 each and all units thereafter may cost $0.10 each.
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
             * $5.00. Once you've bought more than 10 units, all units may now be priced at $0.40
             * (i.e. 101 units total would be $40.40).
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
             * example, if the package size is set to 5, then 4 units will be billed as 5 and 6
             * units will be billed at 10.
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
             * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a
             * percent (the number of basis points to charge), as well as a cap per event to assess.
             * For example, this would allow you to assess a fee of 0.25% on every payment you
             * process, with a maximum charge of $25 per payment.
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
             * quantity across all events. Similar to bulk pricing, the BPS parameters of a given
             * event depends on the tier range that the billing period falls into. Each tier range
             * is defined by an upper bound. For example, after $1.5M of payment volume is reached,
             * each individual payment may have a lower cap or a smaller take-rate.
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
             * applicable parameter is a function of its marginal addition to the period total.
             * Similar to tiered pricing, the BPS parameters of a given event depends on the tier
             * range that it falls into, where each tier range is defined by an upper and lower
             * bound. For example, the first few payments may have a 0.8 BPS take-rate and all
             * payments after a specific volume may incur a take-rate of 0.5 BPS each.
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
             * `dimensions` defines the two event property values evaluated in this pricing model.
             * In a one-dimensional matrix, the second value is `null`. Every configuration has a
             * list of `matrix_values` which give the unit prices for specified property values. In
             * a one-dimensional matrix, the matrix values will have `dimension_values` where the
             * second value of the pair is null. If an event does not match any of the dimension
             * values in the matrix, it will resort to the `default_unit_amount`.
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
             * Fixed fees are prices that are applied independent of usage quantities, and follow
             * unit pricing. They also have an additional parameter `fixed_price_quantity`. If the
             * Price represents a fixed cost, this represents the quantity of units applied.
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

            fun price(unitPrice: Price.UnitPrice) = price(Price.ofUnitPrice(unitPrice))

            fun price(packagePrice: Price.PackagePrice) = price(Price.ofPackagePrice(packagePrice))

            fun price(matrixPrice: Price.MatrixPrice) = price(Price.ofMatrixPrice(matrixPrice))

            fun price(tieredPrice: Price.TieredPrice) = price(Price.ofTieredPrice(tieredPrice))

            fun price(tieredBpsPrice: Price.TieredBpsPrice) =
                price(Price.ofTieredBpsPrice(tieredBpsPrice))

            fun price(bpsPrice: Price.BpsPrice) = price(Price.ofBpsPrice(bpsPrice))

            fun price(bulkBpsPrice: Price.BulkBpsPrice) = price(Price.ofBulkBpsPrice(bulkBpsPrice))

            fun price(bulkPrice: Price.BulkPrice) = price(Price.ofBulkPrice(bulkPrice))

            fun price(thresholdTotalAmountPrice: Price.ThresholdTotalAmountPrice) =
                price(Price.ofThresholdTotalAmountPrice(thresholdTotalAmountPrice))

            fun price(tieredPackagePrice: Price.TieredPackagePrice) =
                price(Price.ofTieredPackagePrice(tieredPackagePrice))

            fun price(groupedTieredPrice: Price.GroupedTieredPrice) =
                price(Price.ofGroupedTieredPrice(groupedTieredPrice))

            fun price(tieredWithMinimumPrice: Price.TieredWithMinimumPrice) =
                price(Price.ofTieredWithMinimumPrice(tieredWithMinimumPrice))

            fun price(tieredPackageWithMinimumPrice: Price.TieredPackageWithMinimumPrice) =
                price(Price.ofTieredPackageWithMinimumPrice(tieredPackageWithMinimumPrice))

            fun price(packageWithAllocationPrice: Price.PackageWithAllocationPrice) =
                price(Price.ofPackageWithAllocationPrice(packageWithAllocationPrice))

            fun price(unitWithPercentPrice: Price.UnitWithPercentPrice) =
                price(Price.ofUnitWithPercentPrice(unitWithPercentPrice))

            fun price(matrixWithAllocationPrice: Price.MatrixWithAllocationPrice) =
                price(Price.ofMatrixWithAllocationPrice(matrixWithAllocationPrice))

            fun price(tieredWithProrationPrice: Price.TieredWithProrationPrice) =
                price(Price.ofTieredWithProrationPrice(tieredWithProrationPrice))

            fun price(unitWithProrationPrice: Price.UnitWithProrationPrice) =
                price(Price.ofUnitWithProrationPrice(unitWithProrationPrice))

            fun price(groupedAllocationPrice: Price.GroupedAllocationPrice) =
                price(Price.ofGroupedAllocationPrice(groupedAllocationPrice))

            fun price(groupedWithProratedMinimumPrice: Price.GroupedWithProratedMinimumPrice) =
                price(Price.ofGroupedWithProratedMinimumPrice(groupedWithProratedMinimumPrice))

            fun price(groupedWithMeteredMinimumPrice: Price.GroupedWithMeteredMinimumPrice) =
                price(Price.ofGroupedWithMeteredMinimumPrice(groupedWithMeteredMinimumPrice))

            fun price(matrixWithDisplayNamePrice: Price.MatrixWithDisplayNamePrice) =
                price(Price.ofMatrixWithDisplayNamePrice(matrixWithDisplayNamePrice))

            fun price(bulkWithProrationPrice: Price.BulkWithProrationPrice) =
                price(Price.ofBulkWithProrationPrice(bulkWithProrationPrice))

            fun price(groupedTieredPackagePrice: Price.GroupedTieredPackagePrice) =
                price(Price.ofGroupedTieredPackagePrice(groupedTieredPackagePrice))

            /**
             * The start date of the price interval. This is the date that Orb starts billing for
             * this price.
             */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * The start date of the price interval. This is the date that Orb starts billing for
             * this price.
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

            fun build(): PriceInterval =
                PriceInterval(
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(billingCycleDay) {
                        "`billingCycleDay` is required but was not set"
                    },
                    checkNotNull(currentBillingPeriodEndDate) {
                        "`currentBillingPeriodEndDate` is required but was not set"
                    },
                    checkNotNull(currentBillingPeriodStartDate) {
                        "`currentBillingPeriodStartDate` is required but was not set"
                    },
                    checkNotNull(endDate) { "`endDate` is required but was not set" },
                    checkNotNull(fixedFeeQuantityTransitions) {
                            "`fixedFeeQuantityTransitions` is required but was not set"
                        }
                        .map { it.toImmutable() },
                    checkNotNull(price) { "`price` is required but was not set" },
                    checkNotNull(startDate) { "`startDate` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class FixedFeeQuantityTransition
        @JsonCreator
        private constructor(
            @JsonProperty("effective_date")
            @ExcludeMissing
            private val effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("price_id")
            @ExcludeMissing
            private val priceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun effectiveDate(): OffsetDateTime = effectiveDate.getRequired("effective_date")

            fun priceId(): String = priceId.getRequired("price_id")

            fun quantity(): Long = quantity.getRequired("quantity")

            @JsonProperty("effective_date")
            @ExcludeMissing
            fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

            @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): FixedFeeQuantityTransition = apply {
                if (!validated) {
                    effectiveDate()
                    priceId()
                    quantity()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var effectiveDate: JsonField<OffsetDateTime>? = null
                private var priceId: JsonField<String>? = null
                private var quantity: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(fixedFeeQuantityTransition: FixedFeeQuantityTransition) = apply {
                    effectiveDate = fixedFeeQuantityTransition.effectiveDate
                    priceId = fixedFeeQuantityTransition.priceId
                    quantity = fixedFeeQuantityTransition.quantity
                    additionalProperties =
                        fixedFeeQuantityTransition.additionalProperties.toMutableMap()
                }

                fun effectiveDate(effectiveDate: OffsetDateTime) =
                    effectiveDate(JsonField.of(effectiveDate))

                fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
                    this.effectiveDate = effectiveDate
                }

                fun priceId(priceId: String) = priceId(JsonField.of(priceId))

                fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

                fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

                fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

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

                fun build(): FixedFeeQuantityTransition =
                    FixedFeeQuantityTransition(
                        checkNotNull(effectiveDate) {
                            "`effectiveDate` is required but was not set"
                        },
                        checkNotNull(priceId) { "`priceId` is required but was not set" },
                        checkNotNull(quantity) { "`quantity` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FixedFeeQuantityTransition && effectiveDate == other.effectiveDate && priceId == other.priceId && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(effectiveDate, priceId, quantity, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FixedFeeQuantityTransition{effectiveDate=$effectiveDate, priceId=$priceId, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PriceInterval && id == other.id && billingCycleDay == other.billingCycleDay && currentBillingPeriodEndDate == other.currentBillingPeriodEndDate && currentBillingPeriodStartDate == other.currentBillingPeriodStartDate && endDate == other.endDate && fixedFeeQuantityTransitions == other.fixedFeeQuantityTransitions && price == other.price && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, billingCycleDay, currentBillingPeriodEndDate, currentBillingPeriodStartDate, endDate, fixedFeeQuantityTransitions, price, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PriceInterval{id=$id, billingCycleDay=$billingCycleDay, currentBillingPeriodEndDate=$currentBillingPeriodEndDate, currentBillingPeriodStartDate=$currentBillingPeriodStartDate, endDate=$endDate, fixedFeeQuantityTransitions=$fixedFeeQuantityTransitions, price=$price, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class RedeemedCoupon
    @JsonCreator
    private constructor(
        @JsonProperty("coupon_id")
        @ExcludeMissing
        private val couponId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun couponId(): String = couponId.getRequired("coupon_id")

        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        @JsonProperty("coupon_id") @ExcludeMissing fun _couponId(): JsonField<String> = couponId

        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RedeemedCoupon = apply {
            if (!validated) {
                couponId()
                endDate()
                startDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var couponId: JsonField<String>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(redeemedCoupon: RedeemedCoupon) = apply {
                couponId = redeemedCoupon.couponId
                endDate = redeemedCoupon.endDate
                startDate = redeemedCoupon.startDate
                additionalProperties = redeemedCoupon.additionalProperties.toMutableMap()
            }

            fun couponId(couponId: String) = couponId(JsonField.of(couponId))

            fun couponId(couponId: JsonField<String>) = apply { this.couponId = couponId }

            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

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

            fun build(): RedeemedCoupon =
                RedeemedCoupon(
                    checkNotNull(couponId) { "`couponId` is required but was not set" },
                    checkNotNull(endDate) { "`endDate` is required but was not set" },
                    checkNotNull(startDate) { "`startDate` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RedeemedCoupon && couponId == other.couponId && endDate == other.endDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(couponId, endDate, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RedeemedCoupon{couponId=$couponId, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACTIVE = of("active")

            val ENDED = of("ended")

            val UPCOMING = of("upcoming")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            ENDED,
            UPCOMING,
        }

        enum class Value {
            ACTIVE,
            ENDED,
            UPCOMING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                ENDED -> Value.ENDED
                UPCOMING -> Value.UPCOMING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                ENDED -> Known.ENDED
                UPCOMING -> Known.UPCOMING
                else -> throw OrbInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class TrialInfo
    @JsonCreator
    private constructor(
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TrialInfo = apply {
            if (!validated) {
                endDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var endDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(trialInfo: TrialInfo) = apply {
                endDate = trialInfo.endDate
                additionalProperties = trialInfo.additionalProperties.toMutableMap()
            }

            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

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

            fun build(): TrialInfo =
                TrialInfo(
                    checkNotNull(endDate) { "`endDate` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrialInfo && endDate == other.endDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrialInfo{endDate=$endDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Subscription && id == other.id && activePlanPhaseOrder == other.activePlanPhaseOrder && adjustmentIntervals == other.adjustmentIntervals && autoCollection == other.autoCollection && billingCycleAnchorConfiguration == other.billingCycleAnchorConfiguration && billingCycleDay == other.billingCycleDay && createdAt == other.createdAt && currentBillingPeriodEndDate == other.currentBillingPeriodEndDate && currentBillingPeriodStartDate == other.currentBillingPeriodStartDate && customer == other.customer && defaultInvoiceMemo == other.defaultInvoiceMemo && discountIntervals == other.discountIntervals && endDate == other.endDate && fixedFeeQuantitySchedule == other.fixedFeeQuantitySchedule && invoicingThreshold == other.invoicingThreshold && maximumIntervals == other.maximumIntervals && metadata == other.metadata && minimumIntervals == other.minimumIntervals && netTerms == other.netTerms && plan == other.plan && priceIntervals == other.priceIntervals && redeemedCoupon == other.redeemedCoupon && startDate == other.startDate && status == other.status && trialInfo == other.trialInfo && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, activePlanPhaseOrder, adjustmentIntervals, autoCollection, billingCycleAnchorConfiguration, billingCycleDay, createdAt, currentBillingPeriodEndDate, currentBillingPeriodStartDate, customer, defaultInvoiceMemo, discountIntervals, endDate, fixedFeeQuantitySchedule, invoicingThreshold, maximumIntervals, metadata, minimumIntervals, netTerms, plan, priceIntervals, redeemedCoupon, startDate, status, trialInfo, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Subscription{id=$id, activePlanPhaseOrder=$activePlanPhaseOrder, adjustmentIntervals=$adjustmentIntervals, autoCollection=$autoCollection, billingCycleAnchorConfiguration=$billingCycleAnchorConfiguration, billingCycleDay=$billingCycleDay, createdAt=$createdAt, currentBillingPeriodEndDate=$currentBillingPeriodEndDate, currentBillingPeriodStartDate=$currentBillingPeriodStartDate, customer=$customer, defaultInvoiceMemo=$defaultInvoiceMemo, discountIntervals=$discountIntervals, endDate=$endDate, fixedFeeQuantitySchedule=$fixedFeeQuantitySchedule, invoicingThreshold=$invoicingThreshold, maximumIntervals=$maximumIntervals, metadata=$metadata, minimumIntervals=$minimumIntervals, netTerms=$netTerms, plan=$plan, priceIntervals=$priceIntervals, redeemedCoupon=$redeemedCoupon, startDate=$startDate, status=$status, trialInfo=$trialInfo, additionalProperties=$additionalProperties}"
}
