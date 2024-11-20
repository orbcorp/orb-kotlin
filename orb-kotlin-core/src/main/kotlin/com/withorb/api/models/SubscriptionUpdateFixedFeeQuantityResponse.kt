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
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = SubscriptionUpdateFixedFeeQuantityResponse.Builder::class)
@NoAutoDetect
class SubscriptionUpdateFixedFeeQuantityResponse
private constructor(
    private val metadata: JsonField<Metadata>,
    private val id: JsonField<String>,
    private val customer: JsonField<Customer>,
    private val plan: JsonField<Plan>,
    private val startDate: JsonField<OffsetDateTime>,
    private val endDate: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currentBillingPeriodStartDate: JsonField<OffsetDateTime>,
    private val currentBillingPeriodEndDate: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val trialInfo: JsonField<TrialInfo>,
    private val activePlanPhaseOrder: JsonField<Long>,
    private val fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantitySchedule>>,
    private val defaultInvoiceMemo: JsonField<String>,
    private val autoCollection: JsonField<Boolean>,
    private val netTerms: JsonField<Long>,
    private val redeemedCoupon: JsonField<RedeemedCoupon>,
    private val billingCycleDay: JsonField<Long>,
    private val billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>,
    private val invoicingThreshold: JsonField<String>,
    private val priceIntervals: JsonField<List<PriceInterval>>,
    private val adjustmentIntervals: JsonField<List<AdjustmentInterval>>,
    private val discountIntervals: JsonField<List<DiscountInterval>>,
    private val minimumIntervals: JsonField<List<MinimumInterval>>,
    private val maximumIntervals: JsonField<List<MaximumInterval>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun id(): String = id.getRequired("id")

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
     * The [Plan](../guides/core-concepts.mdx#plan-and-price) resource represents a plan that can be
     * subscribed to by a customer. Plans define the billing behavior of the subscription. You can
     * see more about how to configure prices in the [Price resource](/reference/price).
     */
    fun plan(): Plan = plan.getRequired("plan")

    /** The date Orb starts billing for this subscription. */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /** The date Orb stops billing for this subscription. */
    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The start date of the current billing period. This is an inclusive timestamp; the instant
     * returned is exactly the beginning of the billing period. Set to null if the subscription is
     * not currently active.
     */
    fun currentBillingPeriodStartDate(): OffsetDateTime? =
        currentBillingPeriodStartDate.getNullable("current_billing_period_start_date")

    /**
     * The end of the current billing period. This is an exclusive timestamp, such that the instant
     * returned is not part of the billing period. Set to null for subscriptions that are not
     * currently active.
     */
    fun currentBillingPeriodEndDate(): OffsetDateTime? =
        currentBillingPeriodEndDate.getNullable("current_billing_period_end_date")

    fun status(): Status = status.getRequired("status")

    fun trialInfo(): TrialInfo = trialInfo.getRequired("trial_info")

    /** The current plan phase that is active, only if the subscription's plan has phases. */
    fun activePlanPhaseOrder(): Long? = activePlanPhaseOrder.getNullable("active_plan_phase_order")

    fun fixedFeeQuantitySchedule(): List<FixedFeeQuantitySchedule> =
        fixedFeeQuantitySchedule.getRequired("fixed_fee_quantity_schedule")

    /**
     * Determines the default memo on this subscriptions' invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     */
    fun defaultInvoiceMemo(): String? = defaultInvoiceMemo.getNullable("default_invoice_memo")

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. This property defaults to the plan's behavior. If
     * null, defaults to the customer's setting.
     */
    fun autoCollection(): Boolean? = autoCollection.getNullable("auto_collection")

    /**
     * Determines the difference between the invoice issue date for subscription invoices as the
     * date that they are due. A value of `0` here represents that the invoice is due on issue,
     * whereas a value of `30` represents that the customer has a month to pay the invoice.
     */
    fun netTerms(): Long = netTerms.getRequired("net_terms")

    fun redeemedCoupon(): RedeemedCoupon? = redeemedCoupon.getNullable("redeemed_coupon")

    /**
     * The day of the month on which the billing cycle is anchored. If the maximum number of days in
     * a month is greater than this value, the last day of the month is the billing cycle day (e.g.
     * billing_cycle_day=31 for April means the billing period begins on the 30th.
     */
    fun billingCycleDay(): Long = billingCycleDay.getRequired("billing_cycle_day")

    fun billingCycleAnchorConfiguration(): BillingCycleAnchorConfiguration =
        billingCycleAnchorConfiguration.getRequired("billing_cycle_anchor_configuration")

    fun invoicingThreshold(): String? = invoicingThreshold.getNullable("invoicing_threshold")

    /** The price intervals for this subscription. */
    fun priceIntervals(): List<PriceInterval> = priceIntervals.getRequired("price_intervals")

    /** The adjustment intervals for this subscription. */
    fun adjustmentIntervals(): List<AdjustmentInterval> =
        adjustmentIntervals.getRequired("adjustment_intervals")

    /** The discount intervals for this subscription. */
    fun discountIntervals(): List<DiscountInterval> =
        discountIntervals.getRequired("discount_intervals")

    /** The minimum intervals for this subscription. */
    fun minimumIntervals(): List<MinimumInterval> =
        minimumIntervals.getRequired("minimum_intervals")

    /** The maximum intervals for this subscription. */
    fun maximumIntervals(): List<MaximumInterval> =
        maximumIntervals.getRequired("maximum_intervals")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("id") @ExcludeMissing fun _id() = id

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
    @JsonProperty("customer") @ExcludeMissing fun _customer() = customer

    /**
     * The [Plan](../guides/core-concepts.mdx#plan-and-price) resource represents a plan that can be
     * subscribed to by a customer. Plans define the billing behavior of the subscription. You can
     * see more about how to configure prices in the [Price resource](/reference/price).
     */
    @JsonProperty("plan") @ExcludeMissing fun _plan() = plan

    /** The date Orb starts billing for this subscription. */
    @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

    /** The date Orb stops billing for this subscription. */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * The start date of the current billing period. This is an inclusive timestamp; the instant
     * returned is exactly the beginning of the billing period. Set to null if the subscription is
     * not currently active.
     */
    @JsonProperty("current_billing_period_start_date")
    @ExcludeMissing
    fun _currentBillingPeriodStartDate() = currentBillingPeriodStartDate

    /**
     * The end of the current billing period. This is an exclusive timestamp, such that the instant
     * returned is not part of the billing period. Set to null for subscriptions that are not
     * currently active.
     */
    @JsonProperty("current_billing_period_end_date")
    @ExcludeMissing
    fun _currentBillingPeriodEndDate() = currentBillingPeriodEndDate

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("trial_info") @ExcludeMissing fun _trialInfo() = trialInfo

    /** The current plan phase that is active, only if the subscription's plan has phases. */
    @JsonProperty("active_plan_phase_order")
    @ExcludeMissing
    fun _activePlanPhaseOrder() = activePlanPhaseOrder

    @JsonProperty("fixed_fee_quantity_schedule")
    @ExcludeMissing
    fun _fixedFeeQuantitySchedule() = fixedFeeQuantitySchedule

    /**
     * Determines the default memo on this subscriptions' invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     */
    @JsonProperty("default_invoice_memo")
    @ExcludeMissing
    fun _defaultInvoiceMemo() = defaultInvoiceMemo

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. This property defaults to the plan's behavior. If
     * null, defaults to the customer's setting.
     */
    @JsonProperty("auto_collection") @ExcludeMissing fun _autoCollection() = autoCollection

    /**
     * Determines the difference between the invoice issue date for subscription invoices as the
     * date that they are due. A value of `0` here represents that the invoice is due on issue,
     * whereas a value of `30` represents that the customer has a month to pay the invoice.
     */
    @JsonProperty("net_terms") @ExcludeMissing fun _netTerms() = netTerms

    @JsonProperty("redeemed_coupon") @ExcludeMissing fun _redeemedCoupon() = redeemedCoupon

    /**
     * The day of the month on which the billing cycle is anchored. If the maximum number of days in
     * a month is greater than this value, the last day of the month is the billing cycle day (e.g.
     * billing_cycle_day=31 for April means the billing period begins on the 30th.
     */
    @JsonProperty("billing_cycle_day") @ExcludeMissing fun _billingCycleDay() = billingCycleDay

    @JsonProperty("billing_cycle_anchor_configuration")
    @ExcludeMissing
    fun _billingCycleAnchorConfiguration() = billingCycleAnchorConfiguration

    @JsonProperty("invoicing_threshold")
    @ExcludeMissing
    fun _invoicingThreshold() = invoicingThreshold

    /** The price intervals for this subscription. */
    @JsonProperty("price_intervals") @ExcludeMissing fun _priceIntervals() = priceIntervals

    /** The adjustment intervals for this subscription. */
    @JsonProperty("adjustment_intervals")
    @ExcludeMissing
    fun _adjustmentIntervals() = adjustmentIntervals

    /** The discount intervals for this subscription. */
    @JsonProperty("discount_intervals") @ExcludeMissing fun _discountIntervals() = discountIntervals

    /** The minimum intervals for this subscription. */
    @JsonProperty("minimum_intervals") @ExcludeMissing fun _minimumIntervals() = minimumIntervals

    /** The maximum intervals for this subscription. */
    @JsonProperty("maximum_intervals") @ExcludeMissing fun _maximumIntervals() = maximumIntervals

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SubscriptionUpdateFixedFeeQuantityResponse = apply {
        if (!validated) {
            metadata().validate()
            id()
            customer().validate()
            plan().validate()
            startDate()
            endDate()
            createdAt()
            currentBillingPeriodStartDate()
            currentBillingPeriodEndDate()
            status()
            trialInfo().validate()
            activePlanPhaseOrder()
            fixedFeeQuantitySchedule().forEach { it.validate() }
            defaultInvoiceMemo()
            autoCollection()
            netTerms()
            redeemedCoupon()?.validate()
            billingCycleDay()
            billingCycleAnchorConfiguration().validate()
            invoicingThreshold()
            priceIntervals().forEach { it.validate() }
            adjustmentIntervals().forEach { it.validate() }
            discountIntervals()
            minimumIntervals().forEach { it.validate() }
            maximumIntervals().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var customer: JsonField<Customer> = JsonMissing.of()
        private var plan: JsonField<Plan> = JsonMissing.of()
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var trialInfo: JsonField<TrialInfo> = JsonMissing.of()
        private var activePlanPhaseOrder: JsonField<Long> = JsonMissing.of()
        private var fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantitySchedule>> =
            JsonMissing.of()
        private var defaultInvoiceMemo: JsonField<String> = JsonMissing.of()
        private var autoCollection: JsonField<Boolean> = JsonMissing.of()
        private var netTerms: JsonField<Long> = JsonMissing.of()
        private var redeemedCoupon: JsonField<RedeemedCoupon> = JsonMissing.of()
        private var billingCycleDay: JsonField<Long> = JsonMissing.of()
        private var billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration> =
            JsonMissing.of()
        private var invoicingThreshold: JsonField<String> = JsonMissing.of()
        private var priceIntervals: JsonField<List<PriceInterval>> = JsonMissing.of()
        private var adjustmentIntervals: JsonField<List<AdjustmentInterval>> = JsonMissing.of()
        private var discountIntervals: JsonField<List<DiscountInterval>> = JsonMissing.of()
        private var minimumIntervals: JsonField<List<MinimumInterval>> = JsonMissing.of()
        private var maximumIntervals: JsonField<List<MaximumInterval>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            subscriptionUpdateFixedFeeQuantityResponse: SubscriptionUpdateFixedFeeQuantityResponse
        ) = apply {
            this.metadata = subscriptionUpdateFixedFeeQuantityResponse.metadata
            this.id = subscriptionUpdateFixedFeeQuantityResponse.id
            this.customer = subscriptionUpdateFixedFeeQuantityResponse.customer
            this.plan = subscriptionUpdateFixedFeeQuantityResponse.plan
            this.startDate = subscriptionUpdateFixedFeeQuantityResponse.startDate
            this.endDate = subscriptionUpdateFixedFeeQuantityResponse.endDate
            this.createdAt = subscriptionUpdateFixedFeeQuantityResponse.createdAt
            this.currentBillingPeriodStartDate =
                subscriptionUpdateFixedFeeQuantityResponse.currentBillingPeriodStartDate
            this.currentBillingPeriodEndDate =
                subscriptionUpdateFixedFeeQuantityResponse.currentBillingPeriodEndDate
            this.status = subscriptionUpdateFixedFeeQuantityResponse.status
            this.trialInfo = subscriptionUpdateFixedFeeQuantityResponse.trialInfo
            this.activePlanPhaseOrder =
                subscriptionUpdateFixedFeeQuantityResponse.activePlanPhaseOrder
            this.fixedFeeQuantitySchedule =
                subscriptionUpdateFixedFeeQuantityResponse.fixedFeeQuantitySchedule
            this.defaultInvoiceMemo = subscriptionUpdateFixedFeeQuantityResponse.defaultInvoiceMemo
            this.autoCollection = subscriptionUpdateFixedFeeQuantityResponse.autoCollection
            this.netTerms = subscriptionUpdateFixedFeeQuantityResponse.netTerms
            this.redeemedCoupon = subscriptionUpdateFixedFeeQuantityResponse.redeemedCoupon
            this.billingCycleDay = subscriptionUpdateFixedFeeQuantityResponse.billingCycleDay
            this.billingCycleAnchorConfiguration =
                subscriptionUpdateFixedFeeQuantityResponse.billingCycleAnchorConfiguration
            this.invoicingThreshold = subscriptionUpdateFixedFeeQuantityResponse.invoicingThreshold
            this.priceIntervals = subscriptionUpdateFixedFeeQuantityResponse.priceIntervals
            this.adjustmentIntervals =
                subscriptionUpdateFixedFeeQuantityResponse.adjustmentIntervals
            this.discountIntervals = subscriptionUpdateFixedFeeQuantityResponse.discountIntervals
            this.minimumIntervals = subscriptionUpdateFixedFeeQuantityResponse.minimumIntervals
            this.maximumIntervals = subscriptionUpdateFixedFeeQuantityResponse.maximumIntervals
            additionalProperties(subscriptionUpdateFixedFeeQuantityResponse.additionalProperties)
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
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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
        @JsonProperty("customer")
        @ExcludeMissing
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

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
        @JsonProperty("plan")
        @ExcludeMissing
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** The date Orb starts billing for this subscription. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /** The date Orb starts billing for this subscription. */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        /** The date Orb stops billing for this subscription. */
        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /** The date Orb stops billing for this subscription. */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if the subscription
         * is not currently active.
         */
        fun currentBillingPeriodStartDate(currentBillingPeriodStartDate: OffsetDateTime) =
            currentBillingPeriodStartDate(JsonField.of(currentBillingPeriodStartDate))

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if the subscription
         * is not currently active.
         */
        @JsonProperty("current_billing_period_start_date")
        @ExcludeMissing
        fun currentBillingPeriodStartDate(
            currentBillingPeriodStartDate: JsonField<OffsetDateTime>
        ) = apply { this.currentBillingPeriodStartDate = currentBillingPeriodStartDate }

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is not part of the billing period. Set to null for subscriptions that
         * are not currently active.
         */
        fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: OffsetDateTime) =
            currentBillingPeriodEndDate(JsonField.of(currentBillingPeriodEndDate))

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is not part of the billing period. Set to null for subscriptions that
         * are not currently active.
         */
        @JsonProperty("current_billing_period_end_date")
        @ExcludeMissing
        fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: JsonField<OffsetDateTime>) =
            apply {
                this.currentBillingPeriodEndDate = currentBillingPeriodEndDate
            }

        fun status(status: Status) = status(JsonField.of(status))

        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun trialInfo(trialInfo: TrialInfo) = trialInfo(JsonField.of(trialInfo))

        @JsonProperty("trial_info")
        @ExcludeMissing
        fun trialInfo(trialInfo: JsonField<TrialInfo>) = apply { this.trialInfo = trialInfo }

        /** The current plan phase that is active, only if the subscription's plan has phases. */
        fun activePlanPhaseOrder(activePlanPhaseOrder: Long) =
            activePlanPhaseOrder(JsonField.of(activePlanPhaseOrder))

        /** The current plan phase that is active, only if the subscription's plan has phases. */
        @JsonProperty("active_plan_phase_order")
        @ExcludeMissing
        fun activePlanPhaseOrder(activePlanPhaseOrder: JsonField<Long>) = apply {
            this.activePlanPhaseOrder = activePlanPhaseOrder
        }

        fun fixedFeeQuantitySchedule(fixedFeeQuantitySchedule: List<FixedFeeQuantitySchedule>) =
            fixedFeeQuantitySchedule(JsonField.of(fixedFeeQuantitySchedule))

        @JsonProperty("fixed_fee_quantity_schedule")
        @ExcludeMissing
        fun fixedFeeQuantitySchedule(
            fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantitySchedule>>
        ) = apply { this.fixedFeeQuantitySchedule = fixedFeeQuantitySchedule }

        /**
         * Determines the default memo on this subscriptions' invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: String) =
            defaultInvoiceMemo(JsonField.of(defaultInvoiceMemo))

        /**
         * Determines the default memo on this subscriptions' invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        @JsonProperty("default_invoice_memo")
        @ExcludeMissing
        fun defaultInvoiceMemo(defaultInvoiceMemo: JsonField<String>) = apply {
            this.defaultInvoiceMemo = defaultInvoiceMemo
        }

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior. If null, defaults to the customer's setting.
         */
        fun autoCollection(autoCollection: Boolean) = autoCollection(JsonField.of(autoCollection))

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior. If null, defaults to the customer's setting.
         */
        @JsonProperty("auto_collection")
        @ExcludeMissing
        fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
            this.autoCollection = autoCollection
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
        @JsonProperty("net_terms")
        @ExcludeMissing
        fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

        fun redeemedCoupon(redeemedCoupon: RedeemedCoupon) =
            redeemedCoupon(JsonField.of(redeemedCoupon))

        @JsonProperty("redeemed_coupon")
        @ExcludeMissing
        fun redeemedCoupon(redeemedCoupon: JsonField<RedeemedCoupon>) = apply {
            this.redeemedCoupon = redeemedCoupon
        }

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
        @JsonProperty("billing_cycle_day")
        @ExcludeMissing
        fun billingCycleDay(billingCycleDay: JsonField<Long>) = apply {
            this.billingCycleDay = billingCycleDay
        }

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration
        ) = billingCycleAnchorConfiguration(JsonField.of(billingCycleAnchorConfiguration))

        @JsonProperty("billing_cycle_anchor_configuration")
        @ExcludeMissing
        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>
        ) = apply { this.billingCycleAnchorConfiguration = billingCycleAnchorConfiguration }

        fun invoicingThreshold(invoicingThreshold: String) =
            invoicingThreshold(JsonField.of(invoicingThreshold))

        @JsonProperty("invoicing_threshold")
        @ExcludeMissing
        fun invoicingThreshold(invoicingThreshold: JsonField<String>) = apply {
            this.invoicingThreshold = invoicingThreshold
        }

        /** The price intervals for this subscription. */
        fun priceIntervals(priceIntervals: List<PriceInterval>) =
            priceIntervals(JsonField.of(priceIntervals))

        /** The price intervals for this subscription. */
        @JsonProperty("price_intervals")
        @ExcludeMissing
        fun priceIntervals(priceIntervals: JsonField<List<PriceInterval>>) = apply {
            this.priceIntervals = priceIntervals
        }

        /** The adjustment intervals for this subscription. */
        fun adjustmentIntervals(adjustmentIntervals: List<AdjustmentInterval>) =
            adjustmentIntervals(JsonField.of(adjustmentIntervals))

        /** The adjustment intervals for this subscription. */
        @JsonProperty("adjustment_intervals")
        @ExcludeMissing
        fun adjustmentIntervals(adjustmentIntervals: JsonField<List<AdjustmentInterval>>) = apply {
            this.adjustmentIntervals = adjustmentIntervals
        }

        /** The discount intervals for this subscription. */
        fun discountIntervals(discountIntervals: List<DiscountInterval>) =
            discountIntervals(JsonField.of(discountIntervals))

        /** The discount intervals for this subscription. */
        @JsonProperty("discount_intervals")
        @ExcludeMissing
        fun discountIntervals(discountIntervals: JsonField<List<DiscountInterval>>) = apply {
            this.discountIntervals = discountIntervals
        }

        /** The minimum intervals for this subscription. */
        fun minimumIntervals(minimumIntervals: List<MinimumInterval>) =
            minimumIntervals(JsonField.of(minimumIntervals))

        /** The minimum intervals for this subscription. */
        @JsonProperty("minimum_intervals")
        @ExcludeMissing
        fun minimumIntervals(minimumIntervals: JsonField<List<MinimumInterval>>) = apply {
            this.minimumIntervals = minimumIntervals
        }

        /** The maximum intervals for this subscription. */
        fun maximumIntervals(maximumIntervals: List<MaximumInterval>) =
            maximumIntervals(JsonField.of(maximumIntervals))

        /** The maximum intervals for this subscription. */
        @JsonProperty("maximum_intervals")
        @ExcludeMissing
        fun maximumIntervals(maximumIntervals: JsonField<List<MaximumInterval>>) = apply {
            this.maximumIntervals = maximumIntervals
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): SubscriptionUpdateFixedFeeQuantityResponse =
            SubscriptionUpdateFixedFeeQuantityResponse(
                metadata,
                id,
                customer,
                plan,
                startDate,
                endDate,
                createdAt,
                currentBillingPeriodStartDate,
                currentBillingPeriodEndDate,
                status,
                trialInfo,
                activePlanPhaseOrder,
                fixedFeeQuantitySchedule.map { it.toImmutable() },
                defaultInvoiceMemo,
                autoCollection,
                netTerms,
                redeemedCoupon,
                billingCycleDay,
                billingCycleAnchorConfiguration,
                invoicingThreshold,
                priceIntervals.map { it.toImmutable() },
                adjustmentIntervals.map { it.toImmutable() },
                discountIntervals.map { it.toImmutable() },
                minimumIntervals.map { it.toImmutable() },
                maximumIntervals.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = AdjustmentInterval.Builder::class)
    @NoAutoDetect
    class AdjustmentInterval
    private constructor(
        private val id: JsonField<String>,
        private val adjustment: JsonField<Adjustment>,
        private val startDate: JsonField<OffsetDateTime>,
        private val endDate: JsonField<OffsetDateTime>,
        private val appliesToPriceIntervalIds: JsonField<List<String>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun id(): String = id.getRequired("id")

        fun adjustment(): Adjustment = adjustment.getRequired("adjustment")

        /** The start date of the adjustment interval. */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /** The end date of the adjustment interval. */
        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        /** The price interval IDs that this adjustment applies to. */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("adjustment") @ExcludeMissing fun _adjustment() = adjustment

        /** The start date of the adjustment interval. */
        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        /** The end date of the adjustment interval. */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        /** The price interval IDs that this adjustment applies to. */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds() = appliesToPriceIntervalIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AdjustmentInterval = apply {
            if (!validated) {
                id()
                adjustment()
                startDate()
                endDate()
                appliesToPriceIntervalIds()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var adjustment: JsonField<Adjustment> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(adjustmentInterval: AdjustmentInterval) = apply {
                this.id = adjustmentInterval.id
                this.adjustment = adjustmentInterval.adjustment
                this.startDate = adjustmentInterval.startDate
                this.endDate = adjustmentInterval.endDate
                this.appliesToPriceIntervalIds = adjustmentInterval.appliesToPriceIntervalIds
                additionalProperties(adjustmentInterval.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun adjustment(adjustment: Adjustment) = adjustment(JsonField.of(adjustment))

            @JsonProperty("adjustment")
            @ExcludeMissing
            fun adjustment(adjustment: JsonField<Adjustment>) = apply {
                this.adjustment = adjustment
            }

            /** The start date of the adjustment interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The start date of the adjustment interval. */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** The end date of the adjustment interval. */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /** The end date of the adjustment interval. */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** The price interval IDs that this adjustment applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /** The price interval IDs that this adjustment applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds = appliesToPriceIntervalIds
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): AdjustmentInterval =
                AdjustmentInterval(
                    id,
                    adjustment,
                    startDate,
                    endDate,
                    appliesToPriceIntervalIds.map { it.toImmutable() },
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

                return /* spotless:off */ other is Adjustment && this.amountDiscountAdjustment == other.amountDiscountAdjustment && this.percentageDiscountAdjustment == other.percentageDiscountAdjustment && this.usageDiscountAdjustment == other.usageDiscountAdjustment && this.minimumAdjustment == other.minimumAdjustment && this.maximumAdjustment == other.maximumAdjustment /* spotless:on */
            }

            override fun hashCode(): Int {
                return /* spotless:off */ Objects.hash(amountDiscountAdjustment, percentageDiscountAdjustment, usageDiscountAdjustment, minimumAdjustment, maximumAdjustment) /* spotless:on */
            }

            override fun toString(): String {
                return when {
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

            @JsonDeserialize(builder = AmountDiscountAdjustment.Builder::class)
            @NoAutoDetect
            class AmountDiscountAdjustment
            private constructor(
                private val appliesToPriceIds: JsonField<List<String>>,
                private val reason: JsonField<String>,
                private val adjustmentType: JsonField<AdjustmentType>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /** The reason for the adjustment. */
                fun reason(): String? = reason.getNullable("reason")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 */
                fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType() = adjustmentType

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): AmountDiscountAdjustment = apply {
                    if (!validated) {
                        appliesToPriceIds()
                        reason()
                        adjustmentType()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var reason: JsonField<String> = JsonMissing.of()
                    private var adjustmentType: JsonField<AdjustmentType> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(amountDiscountAdjustment: AmountDiscountAdjustment) = apply {
                        this.appliesToPriceIds = amountDiscountAdjustment.appliesToPriceIds
                        this.reason = amountDiscountAdjustment.reason
                        this.adjustmentType = amountDiscountAdjustment.adjustmentType
                        this.amountDiscount = amountDiscountAdjustment.amountDiscount
                        additionalProperties(amountDiscountAdjustment.additionalProperties)
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String) = reason(JsonField.of(reason))

                    /** The reason for the adjustment. */
                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
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
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): AmountDiscountAdjustment =
                        AmountDiscountAdjustment(
                            appliesToPriceIds.map { it.toImmutable() },
                            reason,
                            adjustmentType,
                            amountDiscount,
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val AMOUNT_DISCOUNT = AdjustmentType(JsonField.of("amount_discount"))

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
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AmountDiscountAdjustment && this.appliesToPriceIds == other.appliesToPriceIds && this.reason == other.reason && this.adjustmentType == other.adjustmentType && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(appliesToPriceIds, reason, adjustmentType, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "AmountDiscountAdjustment{appliesToPriceIds=$appliesToPriceIds, reason=$reason, adjustmentType=$adjustmentType, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = PercentageDiscountAdjustment.Builder::class)
            @NoAutoDetect
            class PercentageDiscountAdjustment
            private constructor(
                private val appliesToPriceIds: JsonField<List<String>>,
                private val reason: JsonField<String>,
                private val adjustmentType: JsonField<AdjustmentType>,
                private val percentageDiscount: JsonField<Double>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /** The reason for the adjustment. */
                fun reason(): String? = reason.getNullable("reason")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /**
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 */
                fun percentageDiscount(): Double =
                    percentageDiscount.getRequired("percentage_discount")

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType() = adjustmentType

                /**
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PercentageDiscountAdjustment = apply {
                    if (!validated) {
                        appliesToPriceIds()
                        reason()
                        adjustmentType()
                        percentageDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var reason: JsonField<String> = JsonMissing.of()
                    private var adjustmentType: JsonField<AdjustmentType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(percentageDiscountAdjustment: PercentageDiscountAdjustment) =
                        apply {
                            this.appliesToPriceIds = percentageDiscountAdjustment.appliesToPriceIds
                            this.reason = percentageDiscountAdjustment.reason
                            this.adjustmentType = percentageDiscountAdjustment.adjustmentType
                            this.percentageDiscount =
                                percentageDiscountAdjustment.percentageDiscount
                            additionalProperties(percentageDiscountAdjustment.additionalProperties)
                        }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String) = reason(JsonField.of(reason))

                    /** The reason for the adjustment. */
                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
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
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): PercentageDiscountAdjustment =
                        PercentageDiscountAdjustment(
                            appliesToPriceIds.map { it.toImmutable() },
                            reason,
                            adjustmentType,
                            percentageDiscount,
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE_DISCOUNT =
                            AdjustmentType(JsonField.of("percentage_discount"))

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
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PercentageDiscountAdjustment && this.appliesToPriceIds == other.appliesToPriceIds && this.reason == other.reason && this.adjustmentType == other.adjustmentType && this.percentageDiscount == other.percentageDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(appliesToPriceIds, reason, adjustmentType, percentageDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "PercentageDiscountAdjustment{appliesToPriceIds=$appliesToPriceIds, reason=$reason, adjustmentType=$adjustmentType, percentageDiscount=$percentageDiscount, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = UsageDiscountAdjustment.Builder::class)
            @NoAutoDetect
            class UsageDiscountAdjustment
            private constructor(
                private val appliesToPriceIds: JsonField<List<String>>,
                private val reason: JsonField<String>,
                private val adjustmentType: JsonField<AdjustmentType>,
                private val usageDiscount: JsonField<Double>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /** The reason for the adjustment. */
                fun reason(): String? = reason.getNullable("reason")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 */
                fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType() = adjustmentType

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): UsageDiscountAdjustment = apply {
                    if (!validated) {
                        appliesToPriceIds()
                        reason()
                        adjustmentType()
                        usageDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var reason: JsonField<String> = JsonMissing.of()
                    private var adjustmentType: JsonField<AdjustmentType> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(usageDiscountAdjustment: UsageDiscountAdjustment) = apply {
                        this.appliesToPriceIds = usageDiscountAdjustment.appliesToPriceIds
                        this.reason = usageDiscountAdjustment.reason
                        this.adjustmentType = usageDiscountAdjustment.adjustmentType
                        this.usageDiscount = usageDiscountAdjustment.usageDiscount
                        additionalProperties(usageDiscountAdjustment.additionalProperties)
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String) = reason(JsonField.of(reason))

                    /** The reason for the adjustment. */
                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

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
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): UsageDiscountAdjustment =
                        UsageDiscountAdjustment(
                            appliesToPriceIds.map { it.toImmutable() },
                            reason,
                            adjustmentType,
                            usageDiscount,
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val USAGE_DISCOUNT = AdjustmentType(JsonField.of("usage_discount"))

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
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is UsageDiscountAdjustment && this.appliesToPriceIds == other.appliesToPriceIds && this.reason == other.reason && this.adjustmentType == other.adjustmentType && this.usageDiscount == other.usageDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(appliesToPriceIds, reason, adjustmentType, usageDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "UsageDiscountAdjustment{appliesToPriceIds=$appliesToPriceIds, reason=$reason, adjustmentType=$adjustmentType, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = MinimumAdjustment.Builder::class)
            @NoAutoDetect
            class MinimumAdjustment
            private constructor(
                private val appliesToPriceIds: JsonField<List<String>>,
                private val reason: JsonField<String>,
                private val adjustmentType: JsonField<AdjustmentType>,
                private val minimumAmount: JsonField<String>,
                private val itemId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /** The reason for the adjustment. */
                fun reason(): String? = reason.getNullable("reason")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /**
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

                /** The item ID that revenue from this minimum will be attributed to. */
                fun itemId(): String = itemId.getRequired("item_id")

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType() = adjustmentType

                /**
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

                /** The item ID that revenue from this minimum will be attributed to. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): MinimumAdjustment = apply {
                    if (!validated) {
                        appliesToPriceIds()
                        reason()
                        adjustmentType()
                        minimumAmount()
                        itemId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var reason: JsonField<String> = JsonMissing.of()
                    private var adjustmentType: JsonField<AdjustmentType> = JsonMissing.of()
                    private var minimumAmount: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(minimumAdjustment: MinimumAdjustment) = apply {
                        this.appliesToPriceIds = minimumAdjustment.appliesToPriceIds
                        this.reason = minimumAdjustment.reason
                        this.adjustmentType = minimumAdjustment.adjustmentType
                        this.minimumAmount = minimumAdjustment.minimumAmount
                        this.itemId = minimumAdjustment.itemId
                        additionalProperties(minimumAdjustment.additionalProperties)
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String) = reason(JsonField.of(reason))

                    /** The reason for the adjustment. */
                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

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
                    @JsonProperty("minimum_amount")
                    @ExcludeMissing
                    fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                        this.minimumAmount = minimumAmount
                    }

                    /** The item ID that revenue from this minimum will be attributed to. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The item ID that revenue from this minimum will be attributed to. */
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): MinimumAdjustment =
                        MinimumAdjustment(
                            appliesToPriceIds.map { it.toImmutable() },
                            reason,
                            adjustmentType,
                            minimumAmount,
                            itemId,
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val MINIMUM = AdjustmentType(JsonField.of("minimum"))

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
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MinimumAdjustment && this.appliesToPriceIds == other.appliesToPriceIds && this.reason == other.reason && this.adjustmentType == other.adjustmentType && this.minimumAmount == other.minimumAmount && this.itemId == other.itemId && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(appliesToPriceIds, reason, adjustmentType, minimumAmount, itemId, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "MinimumAdjustment{appliesToPriceIds=$appliesToPriceIds, reason=$reason, adjustmentType=$adjustmentType, minimumAmount=$minimumAmount, itemId=$itemId, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = MaximumAdjustment.Builder::class)
            @NoAutoDetect
            class MaximumAdjustment
            private constructor(
                private val appliesToPriceIds: JsonField<List<String>>,
                private val reason: JsonField<String>,
                private val adjustmentType: JsonField<AdjustmentType>,
                private val maximumAmount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /** The reason for the adjustment. */
                fun reason(): String? = reason.getNullable("reason")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /**
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType() = adjustmentType

                /**
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): MaximumAdjustment = apply {
                    if (!validated) {
                        appliesToPriceIds()
                        reason()
                        adjustmentType()
                        maximumAmount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var reason: JsonField<String> = JsonMissing.of()
                    private var adjustmentType: JsonField<AdjustmentType> = JsonMissing.of()
                    private var maximumAmount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(maximumAdjustment: MaximumAdjustment) = apply {
                        this.appliesToPriceIds = maximumAdjustment.appliesToPriceIds
                        this.reason = maximumAdjustment.reason
                        this.adjustmentType = maximumAdjustment.adjustmentType
                        this.maximumAmount = maximumAdjustment.maximumAmount
                        additionalProperties(maximumAdjustment.additionalProperties)
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String) = reason(JsonField.of(reason))

                    /** The reason for the adjustment. */
                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
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
                    @JsonProperty("maximum_amount")
                    @ExcludeMissing
                    fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                        this.maximumAmount = maximumAmount
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): MaximumAdjustment =
                        MaximumAdjustment(
                            appliesToPriceIds.map { it.toImmutable() },
                            reason,
                            adjustmentType,
                            maximumAmount,
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val MAXIMUM = AdjustmentType(JsonField.of("maximum"))

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
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MaximumAdjustment && this.appliesToPriceIds == other.appliesToPriceIds && this.reason == other.reason && this.adjustmentType == other.adjustmentType && this.maximumAmount == other.maximumAmount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(appliesToPriceIds, reason, adjustmentType, maximumAmount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "MaximumAdjustment{appliesToPriceIds=$appliesToPriceIds, reason=$reason, adjustmentType=$adjustmentType, maximumAmount=$maximumAmount, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AdjustmentInterval && this.id == other.id && this.adjustment == other.adjustment && this.startDate == other.startDate && this.endDate == other.endDate && this.appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(id, adjustment, startDate, endDate, appliesToPriceIntervalIds, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AdjustmentInterval{id=$id, adjustment=$adjustment, startDate=$startDate, endDate=$endDate, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = BillingCycleAnchorConfiguration.Builder::class)
    @NoAutoDetect
    class BillingCycleAnchorConfiguration
    private constructor(
        private val day: JsonField<Long>,
        private val month: JsonField<Long>,
        private val year: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
        @JsonProperty("day") @ExcludeMissing fun _day() = day

        /**
         * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
         * February would have cycles starting February, May, August, and November).
         */
        @JsonProperty("month") @ExcludeMissing fun _month() = month

        /**
         * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on
         * 2021 would have cycles starting on 2021, 2023, 2025, etc.).
         */
        @JsonProperty("year") @ExcludeMissing fun _year() = year

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            private var day: JsonField<Long> = JsonMissing.of()
            private var month: JsonField<Long> = JsonMissing.of()
            private var year: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration) =
                apply {
                    this.day = billingCycleAnchorConfiguration.day
                    this.month = billingCycleAnchorConfiguration.month
                    this.year = billingCycleAnchorConfiguration.year
                    additionalProperties(billingCycleAnchorConfiguration.additionalProperties)
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
            @JsonProperty("day")
            @ExcludeMissing
            fun day(day: JsonField<Long>) = apply { this.day = day }

            /**
             * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
             * February would have cycles starting February, May, August, and November).
             */
            fun month(month: Long) = month(JsonField.of(month))

            /**
             * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
             * February would have cycles starting February, May, August, and November).
             */
            @JsonProperty("month")
            @ExcludeMissing
            fun month(month: JsonField<Long>) = apply { this.month = month }

            /**
             * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored
             * on 2021 would have cycles starting on 2021, 2023, 2025, etc.).
             */
            fun year(year: Long) = year(JsonField.of(year))

            /**
             * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored
             * on 2021 would have cycles starting on 2021, 2023, 2025, etc.).
             */
            @JsonProperty("year")
            @ExcludeMissing
            fun year(year: JsonField<Long>) = apply { this.year = year }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): BillingCycleAnchorConfiguration =
                BillingCycleAnchorConfiguration(
                    day,
                    month,
                    year,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingCycleAnchorConfiguration && this.day == other.day && this.month == other.month && this.year == other.year && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(day, month, year, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

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

            return /* spotless:off */ other is DiscountInterval && this.amountDiscountInterval == other.amountDiscountInterval && this.percentageDiscountInterval == other.percentageDiscountInterval && this.usageDiscountInterval == other.usageDiscountInterval /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(amountDiscountInterval, percentageDiscountInterval, usageDiscountInterval) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                amountDiscountInterval != null ->
                    "DiscountInterval{amountDiscountInterval=$amountDiscountInterval}"
                percentageDiscountInterval != null ->
                    "DiscountInterval{percentageDiscountInterval=$percentageDiscountInterval}"
                usageDiscountInterval != null ->
                    "DiscountInterval{usageDiscountInterval=$usageDiscountInterval}"
                _json != null -> "DiscountInterval{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid DiscountInterval")
            }
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

        @JsonDeserialize(builder = AmountDiscountInterval.Builder::class)
        @NoAutoDetect
        class AmountDiscountInterval
        private constructor(
            private val discountType: JsonField<DiscountType>,
            private val amountDiscount: JsonField<String>,
            private val startDate: JsonField<OffsetDateTime>,
            private val endDate: JsonField<OffsetDateTime>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val appliesToPriceIntervalIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /** Only available if discount_type is `amount`. */
            fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

            /** The start date of the discount interval. */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /** The end date of the discount interval. */
            fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

            /** The price ids that this discount interval applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** The price interval ids that this discount interval applies to. */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

            /** Only available if discount_type is `amount`. */
            @JsonProperty("amount_discount") @ExcludeMissing fun _amountDiscount() = amountDiscount

            /** The start date of the discount interval. */
            @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

            /** The end date of the discount interval. */
            @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

            /** The price ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            /** The price interval ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds() = appliesToPriceIntervalIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AmountDiscountInterval = apply {
                if (!validated) {
                    discountType()
                    amountDiscount()
                    startDate()
                    endDate()
                    appliesToPriceIds()
                    appliesToPriceIntervalIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var discountType: JsonField<DiscountType> = JsonMissing.of()
                private var amountDiscount: JsonField<String> = JsonMissing.of()
                private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(amountDiscountInterval: AmountDiscountInterval) = apply {
                    this.discountType = amountDiscountInterval.discountType
                    this.amountDiscount = amountDiscountInterval.amountDiscount
                    this.startDate = amountDiscountInterval.startDate
                    this.endDate = amountDiscountInterval.endDate
                    this.appliesToPriceIds = amountDiscountInterval.appliesToPriceIds
                    this.appliesToPriceIntervalIds =
                        amountDiscountInterval.appliesToPriceIntervalIds
                    additionalProperties(amountDiscountInterval.additionalProperties)
                }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                @JsonProperty("discount_type")
                @ExcludeMissing
                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(amountDiscount: String) =
                    amountDiscount(JsonField.of(amountDiscount))

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                    this.amountDiscount = amountDiscount
                }

                /** The start date of the discount interval. */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /** The start date of the discount interval. */
                @JsonProperty("start_date")
                @ExcludeMissing
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
                }

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

                /** The end date of the discount interval. */
                @JsonProperty("end_date")
                @ExcludeMissing
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price ids that this discount interval applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /** The price interval ids that this discount interval applies to. */
                @JsonProperty("applies_to_price_interval_ids")
                @ExcludeMissing
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds = appliesToPriceIntervalIds
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AmountDiscountInterval =
                    AmountDiscountInterval(
                        discountType,
                        amountDiscount,
                        startDate,
                        endDate,
                        appliesToPriceIds.map { it.toImmutable() },
                        appliesToPriceIntervalIds.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val AMOUNT = DiscountType(JsonField.of("amount"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AmountDiscountInterval && this.discountType == other.discountType && this.amountDiscount == other.amountDiscount && this.startDate == other.startDate && this.endDate == other.endDate && this.appliesToPriceIds == other.appliesToPriceIds && this.appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(discountType, amountDiscount, startDate, endDate, appliesToPriceIds, appliesToPriceIntervalIds, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "AmountDiscountInterval{discountType=$discountType, amountDiscount=$amountDiscount, startDate=$startDate, endDate=$endDate, appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = PercentageDiscountInterval.Builder::class)
        @NoAutoDetect
        class PercentageDiscountInterval
        private constructor(
            private val discountType: JsonField<DiscountType>,
            private val percentageDiscount: JsonField<Double>,
            private val startDate: JsonField<OffsetDateTime>,
            private val endDate: JsonField<OffsetDateTime>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val appliesToPriceIntervalIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /** Only available if discount_type is `percentage`.This is a number between 0 and 1. */
            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            /** The start date of the discount interval. */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /** The end date of the discount interval. */
            fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

            /** The price ids that this discount interval applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** The price interval ids that this discount interval applies to. */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

            /** Only available if discount_type is `percentage`.This is a number between 0 and 1. */
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount() = percentageDiscount

            /** The start date of the discount interval. */
            @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

            /** The end date of the discount interval. */
            @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

            /** The price ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            /** The price interval ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds() = appliesToPriceIntervalIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PercentageDiscountInterval = apply {
                if (!validated) {
                    discountType()
                    percentageDiscount()
                    startDate()
                    endDate()
                    appliesToPriceIds()
                    appliesToPriceIntervalIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var discountType: JsonField<DiscountType> = JsonMissing.of()
                private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(percentageDiscountInterval: PercentageDiscountInterval) = apply {
                    this.discountType = percentageDiscountInterval.discountType
                    this.percentageDiscount = percentageDiscountInterval.percentageDiscount
                    this.startDate = percentageDiscountInterval.startDate
                    this.endDate = percentageDiscountInterval.endDate
                    this.appliesToPriceIds = percentageDiscountInterval.appliesToPriceIds
                    this.appliesToPriceIntervalIds =
                        percentageDiscountInterval.appliesToPriceIntervalIds
                    additionalProperties(percentageDiscountInterval.additionalProperties)
                }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                @JsonProperty("discount_type")
                @ExcludeMissing
                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                /**
                 * Only available if discount_type is `percentage`.This is a number between 0 and 1.
                 */
                fun percentageDiscount(percentageDiscount: Double) =
                    percentageDiscount(JsonField.of(percentageDiscount))

                /**
                 * Only available if discount_type is `percentage`.This is a number between 0 and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                    this.percentageDiscount = percentageDiscount
                }

                /** The start date of the discount interval. */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /** The start date of the discount interval. */
                @JsonProperty("start_date")
                @ExcludeMissing
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
                }

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

                /** The end date of the discount interval. */
                @JsonProperty("end_date")
                @ExcludeMissing
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price ids that this discount interval applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /** The price interval ids that this discount interval applies to. */
                @JsonProperty("applies_to_price_interval_ids")
                @ExcludeMissing
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds = appliesToPriceIntervalIds
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PercentageDiscountInterval =
                    PercentageDiscountInterval(
                        discountType,
                        percentageDiscount,
                        startDate,
                        endDate,
                        appliesToPriceIds.map { it.toImmutable() },
                        appliesToPriceIntervalIds.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val PERCENTAGE = DiscountType(JsonField.of("percentage"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PercentageDiscountInterval && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.startDate == other.startDate && this.endDate == other.endDate && this.appliesToPriceIds == other.appliesToPriceIds && this.appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, startDate, endDate, appliesToPriceIds, appliesToPriceIntervalIds, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "PercentageDiscountInterval{discountType=$discountType, percentageDiscount=$percentageDiscount, startDate=$startDate, endDate=$endDate, appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = UsageDiscountInterval.Builder::class)
        @NoAutoDetect
        class UsageDiscountInterval
        private constructor(
            private val discountType: JsonField<DiscountType>,
            private val usageDiscount: JsonField<Double>,
            private val startDate: JsonField<OffsetDateTime>,
            private val endDate: JsonField<OffsetDateTime>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val appliesToPriceIntervalIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /**
             * Only available if discount_type is `usage`. Number of usage units that this discount
             * is for
             */
            fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

            /** The start date of the discount interval. */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /** The end date of the discount interval. */
            fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

            /** The price ids that this discount interval applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** The price interval ids that this discount interval applies to. */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

            /**
             * Only available if discount_type is `usage`. Number of usage units that this discount
             * is for
             */
            @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

            /** The start date of the discount interval. */
            @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

            /** The end date of the discount interval. */
            @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

            /** The price ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            /** The price interval ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds() = appliesToPriceIntervalIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): UsageDiscountInterval = apply {
                if (!validated) {
                    discountType()
                    usageDiscount()
                    startDate()
                    endDate()
                    appliesToPriceIds()
                    appliesToPriceIntervalIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var discountType: JsonField<DiscountType> = JsonMissing.of()
                private var usageDiscount: JsonField<Double> = JsonMissing.of()
                private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(usageDiscountInterval: UsageDiscountInterval) = apply {
                    this.discountType = usageDiscountInterval.discountType
                    this.usageDiscount = usageDiscountInterval.usageDiscount
                    this.startDate = usageDiscountInterval.startDate
                    this.endDate = usageDiscountInterval.endDate
                    this.appliesToPriceIds = usageDiscountInterval.appliesToPriceIds
                    this.appliesToPriceIntervalIds = usageDiscountInterval.appliesToPriceIntervalIds
                    additionalProperties(usageDiscountInterval.additionalProperties)
                }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                @JsonProperty("discount_type")
                @ExcludeMissing
                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
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
                @JsonProperty("usage_discount")
                @ExcludeMissing
                fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                    this.usageDiscount = usageDiscount
                }

                /** The start date of the discount interval. */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /** The start date of the discount interval. */
                @JsonProperty("start_date")
                @ExcludeMissing
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
                }

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

                /** The end date of the discount interval. */
                @JsonProperty("end_date")
                @ExcludeMissing
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price ids that this discount interval applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /** The price interval ids that this discount interval applies to. */
                @JsonProperty("applies_to_price_interval_ids")
                @ExcludeMissing
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds = appliesToPriceIntervalIds
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): UsageDiscountInterval =
                    UsageDiscountInterval(
                        discountType,
                        usageDiscount,
                        startDate,
                        endDate,
                        appliesToPriceIds.map { it.toImmutable() },
                        appliesToPriceIntervalIds.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val USAGE = DiscountType(JsonField.of("usage"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UsageDiscountInterval && this.discountType == other.discountType && this.usageDiscount == other.usageDiscount && this.startDate == other.startDate && this.endDate == other.endDate && this.appliesToPriceIds == other.appliesToPriceIds && this.appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(discountType, usageDiscount, startDate, endDate, appliesToPriceIds, appliesToPriceIntervalIds, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "UsageDiscountInterval{discountType=$discountType, usageDiscount=$usageDiscount, startDate=$startDate, endDate=$endDate, appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, additionalProperties=$additionalProperties}"
        }
    }

    @JsonDeserialize(builder = FixedFeeQuantitySchedule.Builder::class)
    @NoAutoDetect
    class FixedFeeQuantitySchedule
    private constructor(
        private val priceId: JsonField<String>,
        private val startDate: JsonField<OffsetDateTime>,
        private val endDate: JsonField<OffsetDateTime>,
        private val quantity: JsonField<Double>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun priceId(): String = priceId.getRequired("price_id")

        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        fun quantity(): Double = quantity.getRequired("quantity")

        @JsonProperty("price_id") @ExcludeMissing fun _priceId() = priceId

        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): FixedFeeQuantitySchedule = apply {
            if (!validated) {
                priceId()
                startDate()
                endDate()
                quantity()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var priceId: JsonField<String> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(fixedFeeQuantitySchedule: FixedFeeQuantitySchedule) = apply {
                this.priceId = fixedFeeQuantitySchedule.priceId
                this.startDate = fixedFeeQuantitySchedule.startDate
                this.endDate = fixedFeeQuantitySchedule.endDate
                this.quantity = fixedFeeQuantitySchedule.quantity
                additionalProperties(fixedFeeQuantitySchedule.additionalProperties)
            }

            fun priceId(priceId: String) = priceId(JsonField.of(priceId))

            @JsonProperty("price_id")
            @ExcludeMissing
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            @JsonProperty("start_date")
            @ExcludeMissing
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            @JsonProperty("end_date")
            @ExcludeMissing
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            @JsonProperty("quantity")
            @ExcludeMissing
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): FixedFeeQuantitySchedule =
                FixedFeeQuantitySchedule(
                    priceId,
                    startDate,
                    endDate,
                    quantity,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FixedFeeQuantitySchedule && this.priceId == other.priceId && this.startDate == other.startDate && this.endDate == other.endDate && this.quantity == other.quantity && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(priceId, startDate, endDate, quantity, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "FixedFeeQuantitySchedule{priceId=$priceId, startDate=$startDate, endDate=$endDate, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = MaximumInterval.Builder::class)
    @NoAutoDetect
    class MaximumInterval
    private constructor(
        private val startDate: JsonField<OffsetDateTime>,
        private val endDate: JsonField<OffsetDateTime>,
        private val appliesToPriceIds: JsonField<List<String>>,
        private val appliesToPriceIntervalIds: JsonField<List<String>>,
        private val maximumAmount: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The start date of the maximum interval. */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /** The end date of the maximum interval. */
        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        /** The price ids that this maximum interval applies to. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** The price interval ids that this maximum interval applies to. */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        /**
         * The maximum amount to charge in a given billing period for the price intervals this
         * transform applies to.
         */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /** The start date of the maximum interval. */
        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        /** The end date of the maximum interval. */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        /** The price ids that this maximum interval applies to. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds() = appliesToPriceIds

        /** The price interval ids that this maximum interval applies to. */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds() = appliesToPriceIntervalIds

        /**
         * The maximum amount to charge in a given billing period for the price intervals this
         * transform applies to.
         */
        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): MaximumInterval = apply {
            if (!validated) {
                startDate()
                endDate()
                appliesToPriceIds()
                appliesToPriceIntervalIds()
                maximumAmount()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
            private var appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(maximumInterval: MaximumInterval) = apply {
                this.startDate = maximumInterval.startDate
                this.endDate = maximumInterval.endDate
                this.appliesToPriceIds = maximumInterval.appliesToPriceIds
                this.appliesToPriceIntervalIds = maximumInterval.appliesToPriceIntervalIds
                this.maximumAmount = maximumInterval.maximumAmount
                additionalProperties(maximumInterval.additionalProperties)
            }

            /** The start date of the maximum interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The start date of the maximum interval. */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** The end date of the maximum interval. */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /** The end date of the maximum interval. */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** The price ids that this maximum interval applies to. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The price ids that this maximum interval applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds
            }

            /** The price interval ids that this maximum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /** The price interval ids that this maximum interval applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds = appliesToPriceIntervalIds
                }

            /**
             * The maximum amount to charge in a given billing period for the price intervals this
             * transform applies to.
             */
            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            /**
             * The maximum amount to charge in a given billing period for the price intervals this
             * transform applies to.
             */
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): MaximumInterval =
                MaximumInterval(
                    startDate,
                    endDate,
                    appliesToPriceIds.map { it.toImmutable() },
                    appliesToPriceIntervalIds.map { it.toImmutable() },
                    maximumAmount,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MaximumInterval && this.startDate == other.startDate && this.endDate == other.endDate && this.appliesToPriceIds == other.appliesToPriceIds && this.appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && this.maximumAmount == other.maximumAmount && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(startDate, endDate, appliesToPriceIds, appliesToPriceIntervalIds, maximumAmount, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "MaximumInterval{startDate=$startDate, endDate=$endDate, appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, maximumAmount=$maximumAmount, additionalProperties=$additionalProperties}"
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = MinimumInterval.Builder::class)
    @NoAutoDetect
    class MinimumInterval
    private constructor(
        private val startDate: JsonField<OffsetDateTime>,
        private val endDate: JsonField<OffsetDateTime>,
        private val appliesToPriceIds: JsonField<List<String>>,
        private val appliesToPriceIntervalIds: JsonField<List<String>>,
        private val minimumAmount: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The start date of the minimum interval. */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /** The end date of the minimum interval. */
        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        /** The price ids that this minimum interval applies to. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** The price interval ids that this minimum interval applies to. */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        /**
         * The minimum amount to charge in a given billing period for the price intervals this
         * minimum applies to.
         */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /** The start date of the minimum interval. */
        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        /** The end date of the minimum interval. */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        /** The price ids that this minimum interval applies to. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds() = appliesToPriceIds

        /** The price interval ids that this minimum interval applies to. */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds() = appliesToPriceIntervalIds

        /**
         * The minimum amount to charge in a given billing period for the price intervals this
         * minimum applies to.
         */
        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): MinimumInterval = apply {
            if (!validated) {
                startDate()
                endDate()
                appliesToPriceIds()
                appliesToPriceIntervalIds()
                minimumAmount()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
            private var appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(minimumInterval: MinimumInterval) = apply {
                this.startDate = minimumInterval.startDate
                this.endDate = minimumInterval.endDate
                this.appliesToPriceIds = minimumInterval.appliesToPriceIds
                this.appliesToPriceIntervalIds = minimumInterval.appliesToPriceIntervalIds
                this.minimumAmount = minimumInterval.minimumAmount
                additionalProperties(minimumInterval.additionalProperties)
            }

            /** The start date of the minimum interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The start date of the minimum interval. */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** The end date of the minimum interval. */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /** The end date of the minimum interval. */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** The price ids that this minimum interval applies to. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The price ids that this minimum interval applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds
            }

            /** The price interval ids that this minimum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /** The price interval ids that this minimum interval applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds = appliesToPriceIntervalIds
                }

            /**
             * The minimum amount to charge in a given billing period for the price intervals this
             * minimum applies to.
             */
            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            /**
             * The minimum amount to charge in a given billing period for the price intervals this
             * minimum applies to.
             */
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): MinimumInterval =
                MinimumInterval(
                    startDate,
                    endDate,
                    appliesToPriceIds.map { it.toImmutable() },
                    appliesToPriceIntervalIds.map { it.toImmutable() },
                    minimumAmount,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MinimumInterval && this.startDate == other.startDate && this.endDate == other.endDate && this.appliesToPriceIds == other.appliesToPriceIds && this.appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && this.minimumAmount == other.minimumAmount && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(startDate, endDate, appliesToPriceIds, appliesToPriceIntervalIds, minimumAmount, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "MinimumInterval{startDate=$startDate, endDate=$endDate, appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, minimumAmount=$minimumAmount, additionalProperties=$additionalProperties}"
    }

    /**
     * The Price Interval resource represents a period of time for which a price will bill on a
     * subscription. A subscription’s price intervals define its billing behavior.
     */
    @JsonDeserialize(builder = PriceInterval.Builder::class)
    @NoAutoDetect
    class PriceInterval
    private constructor(
        private val id: JsonField<String>,
        private val startDate: JsonField<OffsetDateTime>,
        private val endDate: JsonField<OffsetDateTime>,
        private val price: JsonField<Price>,
        private val billingCycleDay: JsonField<Long>,
        private val fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>>,
        private val currentBillingPeriodStartDate: JsonField<OffsetDateTime>,
        private val currentBillingPeriodEndDate: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun id(): String = id.getRequired("id")

        /**
         * The start date of the price interval. This is the date that Orb starts billing for this
         * price.
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /**
         * The end date of the price interval. This is the date that Orb stops billing for this
         * price.
         */
        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

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

        /** The day of the month that Orb bills for this price */
        fun billingCycleDay(): Long = billingCycleDay.getRequired("billing_cycle_day")

        /**
         * The fixed fee quantity transitions for this price interval. This is only relevant for
         * fixed fees.
         */
        fun fixedFeeQuantityTransitions(): List<FixedFeeQuantityTransition>? =
            fixedFeeQuantityTransitions.getNullable("fixed_fee_quantity_transitions")

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if this price
         * interval is not currently active.
         */
        fun currentBillingPeriodStartDate(): OffsetDateTime? =
            currentBillingPeriodStartDate.getNullable("current_billing_period_start_date")

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is exactly the end of the billing period. Set to null if this price
         * interval is not currently active.
         */
        fun currentBillingPeriodEndDate(): OffsetDateTime? =
            currentBillingPeriodEndDate.getNullable("current_billing_period_end_date")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /**
         * The start date of the price interval. This is the date that Orb starts billing for this
         * price.
         */
        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        /**
         * The end date of the price interval. This is the date that Orb stops billing for this
         * price.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

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
        @JsonProperty("price") @ExcludeMissing fun _price() = price

        /** The day of the month that Orb bills for this price */
        @JsonProperty("billing_cycle_day") @ExcludeMissing fun _billingCycleDay() = billingCycleDay

        /**
         * The fixed fee quantity transitions for this price interval. This is only relevant for
         * fixed fees.
         */
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        fun _fixedFeeQuantityTransitions() = fixedFeeQuantityTransitions

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if this price
         * interval is not currently active.
         */
        @JsonProperty("current_billing_period_start_date")
        @ExcludeMissing
        fun _currentBillingPeriodStartDate() = currentBillingPeriodStartDate

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is exactly the end of the billing period. Set to null if this price
         * interval is not currently active.
         */
        @JsonProperty("current_billing_period_end_date")
        @ExcludeMissing
        fun _currentBillingPeriodEndDate() = currentBillingPeriodEndDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PriceInterval = apply {
            if (!validated) {
                id()
                startDate()
                endDate()
                price()
                billingCycleDay()
                fixedFeeQuantityTransitions()?.forEach { it.validate() }
                currentBillingPeriodStartDate()
                currentBillingPeriodEndDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var price: JsonField<Price> = JsonMissing.of()
            private var billingCycleDay: JsonField<Long> = JsonMissing.of()
            private var fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>> =
                JsonMissing.of()
            private var currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(priceInterval: PriceInterval) = apply {
                this.id = priceInterval.id
                this.startDate = priceInterval.startDate
                this.endDate = priceInterval.endDate
                this.price = priceInterval.price
                this.billingCycleDay = priceInterval.billingCycleDay
                this.fixedFeeQuantityTransitions = priceInterval.fixedFeeQuantityTransitions
                this.currentBillingPeriodStartDate = priceInterval.currentBillingPeriodStartDate
                this.currentBillingPeriodEndDate = priceInterval.currentBillingPeriodEndDate
                additionalProperties(priceInterval.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The start date of the price interval. This is the date that Orb starts billing for
             * this price.
             */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * The start date of the price interval. This is the date that Orb starts billing for
             * this price.
             */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /**
             * The end date of the price interval. This is the date that Orb stops billing for this
             * price.
             */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /**
             * The end date of the price interval. This is the date that Orb stops billing for this
             * price.
             */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

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
            @JsonProperty("price")
            @ExcludeMissing
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /** The day of the month that Orb bills for this price */
            fun billingCycleDay(billingCycleDay: Long) =
                billingCycleDay(JsonField.of(billingCycleDay))

            /** The day of the month that Orb bills for this price */
            @JsonProperty("billing_cycle_day")
            @ExcludeMissing
            fun billingCycleDay(billingCycleDay: JsonField<Long>) = apply {
                this.billingCycleDay = billingCycleDay
            }

            /**
             * The fixed fee quantity transitions for this price interval. This is only relevant for
             * fixed fees.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>
            ) = fixedFeeQuantityTransitions(JsonField.of(fixedFeeQuantityTransitions))

            /**
             * The fixed fee quantity transitions for this price interval. This is only relevant for
             * fixed fees.
             */
            @JsonProperty("fixed_fee_quantity_transitions")
            @ExcludeMissing
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>>
            ) = apply { this.fixedFeeQuantityTransitions = fixedFeeQuantityTransitions }

            /**
             * The start date of the current billing period. This is an inclusive timestamp; the
             * instant returned is exactly the beginning of the billing period. Set to null if this
             * price interval is not currently active.
             */
            fun currentBillingPeriodStartDate(currentBillingPeriodStartDate: OffsetDateTime) =
                currentBillingPeriodStartDate(JsonField.of(currentBillingPeriodStartDate))

            /**
             * The start date of the current billing period. This is an inclusive timestamp; the
             * instant returned is exactly the beginning of the billing period. Set to null if this
             * price interval is not currently active.
             */
            @JsonProperty("current_billing_period_start_date")
            @ExcludeMissing
            fun currentBillingPeriodStartDate(
                currentBillingPeriodStartDate: JsonField<OffsetDateTime>
            ) = apply { this.currentBillingPeriodStartDate = currentBillingPeriodStartDate }

            /**
             * The end of the current billing period. This is an exclusive timestamp, such that the
             * instant returned is exactly the end of the billing period. Set to null if this price
             * interval is not currently active.
             */
            fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: OffsetDateTime) =
                currentBillingPeriodEndDate(JsonField.of(currentBillingPeriodEndDate))

            /**
             * The end of the current billing period. This is an exclusive timestamp, such that the
             * instant returned is exactly the end of the billing period. Set to null if this price
             * interval is not currently active.
             */
            @JsonProperty("current_billing_period_end_date")
            @ExcludeMissing
            fun currentBillingPeriodEndDate(
                currentBillingPeriodEndDate: JsonField<OffsetDateTime>
            ) = apply { this.currentBillingPeriodEndDate = currentBillingPeriodEndDate }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): PriceInterval =
                PriceInterval(
                    id,
                    startDate,
                    endDate,
                    price,
                    billingCycleDay,
                    fixedFeeQuantityTransitions.map { it.toImmutable() },
                    currentBillingPeriodStartDate,
                    currentBillingPeriodEndDate,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = FixedFeeQuantityTransition.Builder::class)
        @NoAutoDetect
        class FixedFeeQuantityTransition
        private constructor(
            private val priceId: JsonField<String>,
            private val effectiveDate: JsonField<OffsetDateTime>,
            private val quantity: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun priceId(): String = priceId.getRequired("price_id")

            fun effectiveDate(): OffsetDateTime = effectiveDate.getRequired("effective_date")

            fun quantity(): Long = quantity.getRequired("quantity")

            @JsonProperty("price_id") @ExcludeMissing fun _priceId() = priceId

            @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

            @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): FixedFeeQuantityTransition = apply {
                if (!validated) {
                    priceId()
                    effectiveDate()
                    quantity()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var priceId: JsonField<String> = JsonMissing.of()
                private var effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var quantity: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(fixedFeeQuantityTransition: FixedFeeQuantityTransition) = apply {
                    this.priceId = fixedFeeQuantityTransition.priceId
                    this.effectiveDate = fixedFeeQuantityTransition.effectiveDate
                    this.quantity = fixedFeeQuantityTransition.quantity
                    additionalProperties(fixedFeeQuantityTransition.additionalProperties)
                }

                fun priceId(priceId: String) = priceId(JsonField.of(priceId))

                @JsonProperty("price_id")
                @ExcludeMissing
                fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

                fun effectiveDate(effectiveDate: OffsetDateTime) =
                    effectiveDate(JsonField.of(effectiveDate))

                @JsonProperty("effective_date")
                @ExcludeMissing
                fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
                    this.effectiveDate = effectiveDate
                }

                fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

                @JsonProperty("quantity")
                @ExcludeMissing
                fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): FixedFeeQuantityTransition =
                    FixedFeeQuantityTransition(
                        priceId,
                        effectiveDate,
                        quantity,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FixedFeeQuantityTransition && this.priceId == other.priceId && this.effectiveDate == other.effectiveDate && this.quantity == other.quantity && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(priceId, effectiveDate, quantity, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "FixedFeeQuantityTransition{priceId=$priceId, effectiveDate=$effectiveDate, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PriceInterval && this.id == other.id && this.startDate == other.startDate && this.endDate == other.endDate && this.price == other.price && this.billingCycleDay == other.billingCycleDay && this.fixedFeeQuantityTransitions == other.fixedFeeQuantityTransitions && this.currentBillingPeriodStartDate == other.currentBillingPeriodStartDate && this.currentBillingPeriodEndDate == other.currentBillingPeriodEndDate && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(id, startDate, endDate, price, billingCycleDay, fixedFeeQuantityTransitions, currentBillingPeriodStartDate, currentBillingPeriodEndDate, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PriceInterval{id=$id, startDate=$startDate, endDate=$endDate, price=$price, billingCycleDay=$billingCycleDay, fixedFeeQuantityTransitions=$fixedFeeQuantityTransitions, currentBillingPeriodStartDate=$currentBillingPeriodStartDate, currentBillingPeriodEndDate=$currentBillingPeriodEndDate, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = RedeemedCoupon.Builder::class)
    @NoAutoDetect
    class RedeemedCoupon
    private constructor(
        private val couponId: JsonField<String>,
        private val startDate: JsonField<OffsetDateTime>,
        private val endDate: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun couponId(): String = couponId.getRequired("coupon_id")

        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        @JsonProperty("coupon_id") @ExcludeMissing fun _couponId() = couponId

        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): RedeemedCoupon = apply {
            if (!validated) {
                couponId()
                startDate()
                endDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var couponId: JsonField<String> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(redeemedCoupon: RedeemedCoupon) = apply {
                this.couponId = redeemedCoupon.couponId
                this.startDate = redeemedCoupon.startDate
                this.endDate = redeemedCoupon.endDate
                additionalProperties(redeemedCoupon.additionalProperties)
            }

            fun couponId(couponId: String) = couponId(JsonField.of(couponId))

            @JsonProperty("coupon_id")
            @ExcludeMissing
            fun couponId(couponId: JsonField<String>) = apply { this.couponId = couponId }

            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            @JsonProperty("start_date")
            @ExcludeMissing
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            @JsonProperty("end_date")
            @ExcludeMissing
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): RedeemedCoupon =
                RedeemedCoupon(
                    couponId,
                    startDate,
                    endDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RedeemedCoupon && this.couponId == other.couponId && this.startDate == other.startDate && this.endDate == other.endDate && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(couponId, startDate, endDate, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "RedeemedCoupon{couponId=$couponId, startDate=$startDate, endDate=$endDate, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACTIVE = Status(JsonField.of("active"))

            val ENDED = Status(JsonField.of("ended"))

            val UPCOMING = Status(JsonField.of("upcoming"))

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
    }

    @JsonDeserialize(builder = TrialInfo.Builder::class)
    @NoAutoDetect
    class TrialInfo
    private constructor(
        private val endDate: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(trialInfo: TrialInfo) = apply {
                this.endDate = trialInfo.endDate
                additionalProperties(trialInfo.additionalProperties)
            }

            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            @JsonProperty("end_date")
            @ExcludeMissing
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): TrialInfo = TrialInfo(endDate, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrialInfo && this.endDate == other.endDate && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(endDate, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "TrialInfo{endDate=$endDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionUpdateFixedFeeQuantityResponse && this.metadata == other.metadata && this.id == other.id && this.customer == other.customer && this.plan == other.plan && this.startDate == other.startDate && this.endDate == other.endDate && this.createdAt == other.createdAt && this.currentBillingPeriodStartDate == other.currentBillingPeriodStartDate && this.currentBillingPeriodEndDate == other.currentBillingPeriodEndDate && this.status == other.status && this.trialInfo == other.trialInfo && this.activePlanPhaseOrder == other.activePlanPhaseOrder && this.fixedFeeQuantitySchedule == other.fixedFeeQuantitySchedule && this.defaultInvoiceMemo == other.defaultInvoiceMemo && this.autoCollection == other.autoCollection && this.netTerms == other.netTerms && this.redeemedCoupon == other.redeemedCoupon && this.billingCycleDay == other.billingCycleDay && this.billingCycleAnchorConfiguration == other.billingCycleAnchorConfiguration && this.invoicingThreshold == other.invoicingThreshold && this.priceIntervals == other.priceIntervals && this.adjustmentIntervals == other.adjustmentIntervals && this.discountIntervals == other.discountIntervals && this.minimumIntervals == other.minimumIntervals && this.maximumIntervals == other.maximumIntervals && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(metadata, id, customer, plan, startDate, endDate, createdAt, currentBillingPeriodStartDate, currentBillingPeriodEndDate, status, trialInfo, activePlanPhaseOrder, fixedFeeQuantitySchedule, defaultInvoiceMemo, autoCollection, netTerms, redeemedCoupon, billingCycleDay, billingCycleAnchorConfiguration, invoicingThreshold, priceIntervals, adjustmentIntervals, discountIntervals, minimumIntervals, maximumIntervals, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "SubscriptionUpdateFixedFeeQuantityResponse{metadata=$metadata, id=$id, customer=$customer, plan=$plan, startDate=$startDate, endDate=$endDate, createdAt=$createdAt, currentBillingPeriodStartDate=$currentBillingPeriodStartDate, currentBillingPeriodEndDate=$currentBillingPeriodEndDate, status=$status, trialInfo=$trialInfo, activePlanPhaseOrder=$activePlanPhaseOrder, fixedFeeQuantitySchedule=$fixedFeeQuantitySchedule, defaultInvoiceMemo=$defaultInvoiceMemo, autoCollection=$autoCollection, netTerms=$netTerms, redeemedCoupon=$redeemedCoupon, billingCycleDay=$billingCycleDay, billingCycleAnchorConfiguration=$billingCycleAnchorConfiguration, invoicingThreshold=$invoicingThreshold, priceIntervals=$priceIntervals, adjustmentIntervals=$adjustmentIntervals, discountIntervals=$discountIntervals, minimumIntervals=$minimumIntervals, maximumIntervals=$maximumIntervals, additionalProperties=$additionalProperties}"
}
