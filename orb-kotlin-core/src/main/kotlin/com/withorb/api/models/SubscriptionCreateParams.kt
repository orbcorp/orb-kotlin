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
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.util.Objects

class SubscriptionCreateParams
constructor(
    private val alignBillingWithSubscriptionStartDate: Boolean?,
    private val autoCollection: Boolean?,
    private val awsRegion: String?,
    private val billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration?,
    private val couponRedemptionCode: String?,
    private val creditsOverageRate: Double?,
    private val customerId: String?,
    private val defaultInvoiceMemo: String?,
    private val endDate: OffsetDateTime?,
    private val externalCustomerId: String?,
    private val externalMarketplace: ExternalMarketplace?,
    private val externalMarketplaceReportingId: String?,
    private val externalPlanId: String?,
    private val initialPhaseOrder: Long?,
    private val invoicingThreshold: String?,
    private val metadata: Metadata?,
    private val netTerms: Long?,
    private val perCreditOverageAmount: Double?,
    private val planId: String?,
    private val priceOverrides: List<PriceOverride>?,
    private val startDate: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun alignBillingWithSubscriptionStartDate(): Boolean? = alignBillingWithSubscriptionStartDate

    fun autoCollection(): Boolean? = autoCollection

    fun awsRegion(): String? = awsRegion

    fun billingCycleAnchorConfiguration(): BillingCycleAnchorConfiguration? =
        billingCycleAnchorConfiguration

    fun couponRedemptionCode(): String? = couponRedemptionCode

    fun creditsOverageRate(): Double? = creditsOverageRate

    fun customerId(): String? = customerId

    fun defaultInvoiceMemo(): String? = defaultInvoiceMemo

    fun endDate(): OffsetDateTime? = endDate

    fun externalCustomerId(): String? = externalCustomerId

    fun externalMarketplace(): ExternalMarketplace? = externalMarketplace

    fun externalMarketplaceReportingId(): String? = externalMarketplaceReportingId

    fun externalPlanId(): String? = externalPlanId

    fun initialPhaseOrder(): Long? = initialPhaseOrder

    fun invoicingThreshold(): String? = invoicingThreshold

    fun metadata(): Metadata? = metadata

    fun netTerms(): Long? = netTerms

    fun perCreditOverageAmount(): Double? = perCreditOverageAmount

    fun planId(): String? = planId

    fun priceOverrides(): List<PriceOverride>? = priceOverrides

    fun startDate(): OffsetDateTime? = startDate

    internal fun getBody(): SubscriptionCreateBody {
        return SubscriptionCreateBody(
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
            initialPhaseOrder,
            invoicingThreshold,
            metadata,
            netTerms,
            perCreditOverageAmount,
            planId,
            priceOverrides,
            startDate,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SubscriptionCreateBody.Builder::class)
    @NoAutoDetect
    class SubscriptionCreateBody
    internal constructor(
        private val alignBillingWithSubscriptionStartDate: Boolean?,
        private val autoCollection: Boolean?,
        private val awsRegion: String?,
        private val billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration?,
        private val couponRedemptionCode: String?,
        private val creditsOverageRate: Double?,
        private val customerId: String?,
        private val defaultInvoiceMemo: String?,
        private val endDate: OffsetDateTime?,
        private val externalCustomerId: String?,
        private val externalMarketplace: ExternalMarketplace?,
        private val externalMarketplaceReportingId: String?,
        private val externalPlanId: String?,
        private val initialPhaseOrder: Long?,
        private val invoicingThreshold: String?,
        private val metadata: Metadata?,
        private val netTerms: Long?,
        private val perCreditOverageAmount: Double?,
        private val planId: String?,
        private val priceOverrides: List<PriceOverride>?,
        private val startDate: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("align_billing_with_subscription_start_date")
        fun alignBillingWithSubscriptionStartDate(): Boolean? =
            alignBillingWithSubscriptionStartDate

        @JsonProperty("auto_collection") fun autoCollection(): Boolean? = autoCollection

        @JsonProperty("aws_region") fun awsRegion(): String? = awsRegion

        @JsonProperty("billing_cycle_anchor_configuration")
        fun billingCycleAnchorConfiguration(): BillingCycleAnchorConfiguration? =
            billingCycleAnchorConfiguration

        @JsonProperty("coupon_redemption_code")
        fun couponRedemptionCode(): String? = couponRedemptionCode

        @JsonProperty("credits_overage_rate") fun creditsOverageRate(): Double? = creditsOverageRate

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        @JsonProperty("default_invoice_memo") fun defaultInvoiceMemo(): String? = defaultInvoiceMemo

        @JsonProperty("end_date") fun endDate(): OffsetDateTime? = endDate

        @JsonProperty("external_customer_id") fun externalCustomerId(): String? = externalCustomerId

        @JsonProperty("external_marketplace")
        fun externalMarketplace(): ExternalMarketplace? = externalMarketplace

        @JsonProperty("external_marketplace_reporting_id")
        fun externalMarketplaceReportingId(): String? = externalMarketplaceReportingId

        /**
         * The external_plan_id of the plan that the given subscription should be switched to. Note
         * that either this property or `plan_id` must be specified.
         */
        @JsonProperty("external_plan_id") fun externalPlanId(): String? = externalPlanId

        @JsonProperty("initial_phase_order") fun initialPhaseOrder(): Long? = initialPhaseOrder

        @JsonProperty("invoicing_threshold") fun invoicingThreshold(): String? = invoicingThreshold

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonProperty("net_terms") fun netTerms(): Long? = netTerms

        @JsonProperty("per_credit_overage_amount")
        fun perCreditOverageAmount(): Double? = perCreditOverageAmount

        /**
         * The plan that the given subscription should be switched to. Note that either this
         * property or `external_plan_id` must be specified.
         */
        @JsonProperty("plan_id") fun planId(): String? = planId

        /** Optionally provide a list of overrides for prices on the plan */
        @JsonProperty("price_overrides") fun priceOverrides(): List<PriceOverride>? = priceOverrides

        @JsonProperty("start_date") fun startDate(): OffsetDateTime? = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SubscriptionCreateBody &&
                this.alignBillingWithSubscriptionStartDate ==
                    other.alignBillingWithSubscriptionStartDate &&
                this.autoCollection == other.autoCollection &&
                this.awsRegion == other.awsRegion &&
                this.billingCycleAnchorConfiguration == other.billingCycleAnchorConfiguration &&
                this.couponRedemptionCode == other.couponRedemptionCode &&
                this.creditsOverageRate == other.creditsOverageRate &&
                this.customerId == other.customerId &&
                this.defaultInvoiceMemo == other.defaultInvoiceMemo &&
                this.endDate == other.endDate &&
                this.externalCustomerId == other.externalCustomerId &&
                this.externalMarketplace == other.externalMarketplace &&
                this.externalMarketplaceReportingId == other.externalMarketplaceReportingId &&
                this.externalPlanId == other.externalPlanId &&
                this.initialPhaseOrder == other.initialPhaseOrder &&
                this.invoicingThreshold == other.invoicingThreshold &&
                this.metadata == other.metadata &&
                this.netTerms == other.netTerms &&
                this.perCreditOverageAmount == other.perCreditOverageAmount &&
                this.planId == other.planId &&
                this.priceOverrides == other.priceOverrides &&
                this.startDate == other.startDate &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
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
                        initialPhaseOrder,
                        invoicingThreshold,
                        metadata,
                        netTerms,
                        perCreditOverageAmount,
                        planId,
                        priceOverrides,
                        startDate,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SubscriptionCreateBody{alignBillingWithSubscriptionStartDate=$alignBillingWithSubscriptionStartDate, autoCollection=$autoCollection, awsRegion=$awsRegion, billingCycleAnchorConfiguration=$billingCycleAnchorConfiguration, couponRedemptionCode=$couponRedemptionCode, creditsOverageRate=$creditsOverageRate, customerId=$customerId, defaultInvoiceMemo=$defaultInvoiceMemo, endDate=$endDate, externalCustomerId=$externalCustomerId, externalMarketplace=$externalMarketplace, externalMarketplaceReportingId=$externalMarketplaceReportingId, externalPlanId=$externalPlanId, initialPhaseOrder=$initialPhaseOrder, invoicingThreshold=$invoicingThreshold, metadata=$metadata, netTerms=$netTerms, perCreditOverageAmount=$perCreditOverageAmount, planId=$planId, priceOverrides=$priceOverrides, startDate=$startDate, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var alignBillingWithSubscriptionStartDate: Boolean? = null
            private var autoCollection: Boolean? = null
            private var awsRegion: String? = null
            private var billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration? = null
            private var couponRedemptionCode: String? = null
            private var creditsOverageRate: Double? = null
            private var customerId: String? = null
            private var defaultInvoiceMemo: String? = null
            private var endDate: OffsetDateTime? = null
            private var externalCustomerId: String? = null
            private var externalMarketplace: ExternalMarketplace? = null
            private var externalMarketplaceReportingId: String? = null
            private var externalPlanId: String? = null
            private var initialPhaseOrder: Long? = null
            private var invoicingThreshold: String? = null
            private var metadata: Metadata? = null
            private var netTerms: Long? = null
            private var perCreditOverageAmount: Double? = null
            private var planId: String? = null
            private var priceOverrides: List<PriceOverride>? = null
            private var startDate: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(subscriptionCreateBody: SubscriptionCreateBody) = apply {
                this.alignBillingWithSubscriptionStartDate =
                    subscriptionCreateBody.alignBillingWithSubscriptionStartDate
                this.autoCollection = subscriptionCreateBody.autoCollection
                this.awsRegion = subscriptionCreateBody.awsRegion
                this.billingCycleAnchorConfiguration =
                    subscriptionCreateBody.billingCycleAnchorConfiguration
                this.couponRedemptionCode = subscriptionCreateBody.couponRedemptionCode
                this.creditsOverageRate = subscriptionCreateBody.creditsOverageRate
                this.customerId = subscriptionCreateBody.customerId
                this.defaultInvoiceMemo = subscriptionCreateBody.defaultInvoiceMemo
                this.endDate = subscriptionCreateBody.endDate
                this.externalCustomerId = subscriptionCreateBody.externalCustomerId
                this.externalMarketplace = subscriptionCreateBody.externalMarketplace
                this.externalMarketplaceReportingId =
                    subscriptionCreateBody.externalMarketplaceReportingId
                this.externalPlanId = subscriptionCreateBody.externalPlanId
                this.initialPhaseOrder = subscriptionCreateBody.initialPhaseOrder
                this.invoicingThreshold = subscriptionCreateBody.invoicingThreshold
                this.metadata = subscriptionCreateBody.metadata
                this.netTerms = subscriptionCreateBody.netTerms
                this.perCreditOverageAmount = subscriptionCreateBody.perCreditOverageAmount
                this.planId = subscriptionCreateBody.planId
                this.priceOverrides = subscriptionCreateBody.priceOverrides
                this.startDate = subscriptionCreateBody.startDate
                additionalProperties(subscriptionCreateBody.additionalProperties)
            }

            @JsonProperty("align_billing_with_subscription_start_date")
            fun alignBillingWithSubscriptionStartDate(
                alignBillingWithSubscriptionStartDate: Boolean
            ) = apply {
                this.alignBillingWithSubscriptionStartDate = alignBillingWithSubscriptionStartDate
            }

            @JsonProperty("auto_collection")
            fun autoCollection(autoCollection: Boolean) = apply {
                this.autoCollection = autoCollection
            }

            @JsonProperty("aws_region")
            fun awsRegion(awsRegion: String) = apply { this.awsRegion = awsRegion }

            @JsonProperty("billing_cycle_anchor_configuration")
            fun billingCycleAnchorConfiguration(
                billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration
            ) = apply { this.billingCycleAnchorConfiguration = billingCycleAnchorConfiguration }

            @JsonProperty("coupon_redemption_code")
            fun couponRedemptionCode(couponRedemptionCode: String) = apply {
                this.couponRedemptionCode = couponRedemptionCode
            }

            @JsonProperty("credits_overage_rate")
            fun creditsOverageRate(creditsOverageRate: Double) = apply {
                this.creditsOverageRate = creditsOverageRate
            }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            @JsonProperty("default_invoice_memo")
            fun defaultInvoiceMemo(defaultInvoiceMemo: String) = apply {
                this.defaultInvoiceMemo = defaultInvoiceMemo
            }

            @JsonProperty("end_date")
            fun endDate(endDate: OffsetDateTime) = apply { this.endDate = endDate }

            @JsonProperty("external_customer_id")
            fun externalCustomerId(externalCustomerId: String) = apply {
                this.externalCustomerId = externalCustomerId
            }

            @JsonProperty("external_marketplace")
            fun externalMarketplace(externalMarketplace: ExternalMarketplace) = apply {
                this.externalMarketplace = externalMarketplace
            }

            @JsonProperty("external_marketplace_reporting_id")
            fun externalMarketplaceReportingId(externalMarketplaceReportingId: String) = apply {
                this.externalMarketplaceReportingId = externalMarketplaceReportingId
            }

            /**
             * The external_plan_id of the plan that the given subscription should be switched to.
             * Note that either this property or `plan_id` must be specified.
             */
            @JsonProperty("external_plan_id")
            fun externalPlanId(externalPlanId: String) = apply {
                this.externalPlanId = externalPlanId
            }

            @JsonProperty("initial_phase_order")
            fun initialPhaseOrder(initialPhaseOrder: Long) = apply {
                this.initialPhaseOrder = initialPhaseOrder
            }

            @JsonProperty("invoicing_threshold")
            fun invoicingThreshold(invoicingThreshold: String) = apply {
                this.invoicingThreshold = invoicingThreshold
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            @JsonProperty("net_terms")
            fun netTerms(netTerms: Long) = apply { this.netTerms = netTerms }

            @JsonProperty("per_credit_overage_amount")
            fun perCreditOverageAmount(perCreditOverageAmount: Double) = apply {
                this.perCreditOverageAmount = perCreditOverageAmount
            }

            /**
             * The plan that the given subscription should be switched to. Note that either this
             * property or `external_plan_id` must be specified.
             */
            @JsonProperty("plan_id") fun planId(planId: String) = apply { this.planId = planId }

            /** Optionally provide a list of overrides for prices on the plan */
            @JsonProperty("price_overrides")
            fun priceOverrides(priceOverrides: List<PriceOverride>) = apply {
                this.priceOverrides = priceOverrides
            }

            @JsonProperty("start_date")
            fun startDate(startDate: OffsetDateTime) = apply { this.startDate = startDate }

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

            fun build(): SubscriptionCreateBody =
                SubscriptionCreateBody(
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
                    initialPhaseOrder,
                    invoicingThreshold,
                    metadata,
                    netTerms,
                    perCreditOverageAmount,
                    planId,
                    priceOverrides?.toUnmodifiable(),
                    startDate,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionCreateParams &&
            this.alignBillingWithSubscriptionStartDate ==
                other.alignBillingWithSubscriptionStartDate &&
            this.autoCollection == other.autoCollection &&
            this.awsRegion == other.awsRegion &&
            this.billingCycleAnchorConfiguration == other.billingCycleAnchorConfiguration &&
            this.couponRedemptionCode == other.couponRedemptionCode &&
            this.creditsOverageRate == other.creditsOverageRate &&
            this.customerId == other.customerId &&
            this.defaultInvoiceMemo == other.defaultInvoiceMemo &&
            this.endDate == other.endDate &&
            this.externalCustomerId == other.externalCustomerId &&
            this.externalMarketplace == other.externalMarketplace &&
            this.externalMarketplaceReportingId == other.externalMarketplaceReportingId &&
            this.externalPlanId == other.externalPlanId &&
            this.initialPhaseOrder == other.initialPhaseOrder &&
            this.invoicingThreshold == other.invoicingThreshold &&
            this.metadata == other.metadata &&
            this.netTerms == other.netTerms &&
            this.perCreditOverageAmount == other.perCreditOverageAmount &&
            this.planId == other.planId &&
            this.priceOverrides == other.priceOverrides &&
            this.startDate == other.startDate &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
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
            initialPhaseOrder,
            invoicingThreshold,
            metadata,
            netTerms,
            perCreditOverageAmount,
            planId,
            priceOverrides,
            startDate,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SubscriptionCreateParams{alignBillingWithSubscriptionStartDate=$alignBillingWithSubscriptionStartDate, autoCollection=$autoCollection, awsRegion=$awsRegion, billingCycleAnchorConfiguration=$billingCycleAnchorConfiguration, couponRedemptionCode=$couponRedemptionCode, creditsOverageRate=$creditsOverageRate, customerId=$customerId, defaultInvoiceMemo=$defaultInvoiceMemo, endDate=$endDate, externalCustomerId=$externalCustomerId, externalMarketplace=$externalMarketplace, externalMarketplaceReportingId=$externalMarketplaceReportingId, externalPlanId=$externalPlanId, initialPhaseOrder=$initialPhaseOrder, invoicingThreshold=$invoicingThreshold, metadata=$metadata, netTerms=$netTerms, perCreditOverageAmount=$perCreditOverageAmount, planId=$planId, priceOverrides=$priceOverrides, startDate=$startDate, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var alignBillingWithSubscriptionStartDate: Boolean? = null
        private var autoCollection: Boolean? = null
        private var awsRegion: String? = null
        private var billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration? = null
        private var couponRedemptionCode: String? = null
        private var creditsOverageRate: Double? = null
        private var customerId: String? = null
        private var defaultInvoiceMemo: String? = null
        private var endDate: OffsetDateTime? = null
        private var externalCustomerId: String? = null
        private var externalMarketplace: ExternalMarketplace? = null
        private var externalMarketplaceReportingId: String? = null
        private var externalPlanId: String? = null
        private var initialPhaseOrder: Long? = null
        private var invoicingThreshold: String? = null
        private var metadata: Metadata? = null
        private var netTerms: Long? = null
        private var perCreditOverageAmount: Double? = null
        private var planId: String? = null
        private var priceOverrides: MutableList<PriceOverride> = mutableListOf()
        private var startDate: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionCreateParams: SubscriptionCreateParams) = apply {
            this.alignBillingWithSubscriptionStartDate =
                subscriptionCreateParams.alignBillingWithSubscriptionStartDate
            this.autoCollection = subscriptionCreateParams.autoCollection
            this.awsRegion = subscriptionCreateParams.awsRegion
            this.billingCycleAnchorConfiguration =
                subscriptionCreateParams.billingCycleAnchorConfiguration
            this.couponRedemptionCode = subscriptionCreateParams.couponRedemptionCode
            this.creditsOverageRate = subscriptionCreateParams.creditsOverageRate
            this.customerId = subscriptionCreateParams.customerId
            this.defaultInvoiceMemo = subscriptionCreateParams.defaultInvoiceMemo
            this.endDate = subscriptionCreateParams.endDate
            this.externalCustomerId = subscriptionCreateParams.externalCustomerId
            this.externalMarketplace = subscriptionCreateParams.externalMarketplace
            this.externalMarketplaceReportingId =
                subscriptionCreateParams.externalMarketplaceReportingId
            this.externalPlanId = subscriptionCreateParams.externalPlanId
            this.initialPhaseOrder = subscriptionCreateParams.initialPhaseOrder
            this.invoicingThreshold = subscriptionCreateParams.invoicingThreshold
            this.metadata = subscriptionCreateParams.metadata
            this.netTerms = subscriptionCreateParams.netTerms
            this.perCreditOverageAmount = subscriptionCreateParams.perCreditOverageAmount
            this.planId = subscriptionCreateParams.planId
            this.priceOverrides(subscriptionCreateParams.priceOverrides ?: listOf())
            this.startDate = subscriptionCreateParams.startDate
            additionalQueryParams(subscriptionCreateParams.additionalQueryParams)
            additionalHeaders(subscriptionCreateParams.additionalHeaders)
            additionalBodyProperties(subscriptionCreateParams.additionalBodyProperties)
        }

        fun alignBillingWithSubscriptionStartDate(alignBillingWithSubscriptionStartDate: Boolean) =
            apply {
                this.alignBillingWithSubscriptionStartDate = alignBillingWithSubscriptionStartDate
            }

        fun autoCollection(autoCollection: Boolean) = apply { this.autoCollection = autoCollection }

        fun awsRegion(awsRegion: String) = apply { this.awsRegion = awsRegion }

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration
        ) = apply { this.billingCycleAnchorConfiguration = billingCycleAnchorConfiguration }

        fun couponRedemptionCode(couponRedemptionCode: String) = apply {
            this.couponRedemptionCode = couponRedemptionCode
        }

        fun creditsOverageRate(creditsOverageRate: Double) = apply {
            this.creditsOverageRate = creditsOverageRate
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun defaultInvoiceMemo(defaultInvoiceMemo: String) = apply {
            this.defaultInvoiceMemo = defaultInvoiceMemo
        }

        fun endDate(endDate: OffsetDateTime) = apply { this.endDate = endDate }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        fun externalMarketplace(externalMarketplace: ExternalMarketplace) = apply {
            this.externalMarketplace = externalMarketplace
        }

        fun externalMarketplaceReportingId(externalMarketplaceReportingId: String) = apply {
            this.externalMarketplaceReportingId = externalMarketplaceReportingId
        }

        /**
         * The external_plan_id of the plan that the given subscription should be switched to. Note
         * that either this property or `plan_id` must be specified.
         */
        fun externalPlanId(externalPlanId: String) = apply { this.externalPlanId = externalPlanId }

        fun initialPhaseOrder(initialPhaseOrder: Long) = apply {
            this.initialPhaseOrder = initialPhaseOrder
        }

        fun invoicingThreshold(invoicingThreshold: String) = apply {
            this.invoicingThreshold = invoicingThreshold
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun netTerms(netTerms: Long) = apply { this.netTerms = netTerms }

        fun perCreditOverageAmount(perCreditOverageAmount: Double) = apply {
            this.perCreditOverageAmount = perCreditOverageAmount
        }

        /**
         * The plan that the given subscription should be switched to. Note that either this
         * property or `external_plan_id` must be specified.
         */
        fun planId(planId: String) = apply { this.planId = planId }

        /** Optionally provide a list of overrides for prices on the plan */
        fun priceOverrides(priceOverrides: List<PriceOverride>) = apply {
            this.priceOverrides.clear()
            this.priceOverrides.addAll(priceOverrides)
        }

        /** Optionally provide a list of overrides for prices on the plan */
        fun addPriceOverride(priceOverride: PriceOverride) = apply {
            this.priceOverrides.add(priceOverride)
        }

        fun startDate(startDate: OffsetDateTime) = apply { this.startDate = startDate }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): SubscriptionCreateParams =
            SubscriptionCreateParams(
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
                initialPhaseOrder,
                invoicingThreshold,
                metadata,
                netTerms,
                perCreditOverageAmount,
                planId,
                if (priceOverrides.size == 0) null else priceOverrides.toUnmodifiable(),
                startDate,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = BillingCycleAnchorConfiguration.Builder::class)
    @NoAutoDetect
    class BillingCycleAnchorConfiguration
    private constructor(
        private val day: Long?,
        private val month: Long?,
        private val year: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * The day of the month on which the billing cycle is anchored. If the maximum number of
         * days in a month is greater than this value, the last day of the month is the billing
         * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
         * 30th.
         */
        @JsonProperty("day") fun day(): Long? = day

        /**
         * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
         * February would have cycles starting February, May, August, and November).
         */
        @JsonProperty("month") fun month(): Long? = month

        /**
         * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on
         * 2021 would have cycles starting on 2021, 2023, 2025, etc.).
         */
        @JsonProperty("year") fun year(): Long? = year

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillingCycleAnchorConfiguration &&
                this.day == other.day &&
                this.month == other.month &&
                this.year == other.year &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        day,
                        month,
                        year,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BillingCycleAnchorConfiguration{day=$day, month=$month, year=$year, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var day: Long? = null
            private var month: Long? = null
            private var year: Long? = null
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
            @JsonProperty("day") fun day(day: Long) = apply { this.day = day }

            /**
             * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
             * February would have cycles starting February, May, August, and November).
             */
            @JsonProperty("month") fun month(month: Long) = apply { this.month = month }

            /**
             * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored
             * on 2021 would have cycles starting on 2021, 2023, 2025, etc.).
             */
            @JsonProperty("year") fun year(year: Long) = apply { this.year = year }

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
                    checkNotNull(day) { "`day` is required but was not set" },
                    month,
                    year,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class ExternalMarketplace
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExternalMarketplace && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val GOOGLE = ExternalMarketplace(JsonField.of("google"))

            val AWS = ExternalMarketplace(JsonField.of("aws"))

            val AZURE = ExternalMarketplace(JsonField.of("azure"))

            fun of(value: String) = ExternalMarketplace(JsonField.of(value))
        }

        enum class Known {
            GOOGLE,
            AWS,
            AZURE,
        }

        enum class Value {
            GOOGLE,
            AWS,
            AZURE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                GOOGLE -> Value.GOOGLE
                AWS -> Value.AWS
                AZURE -> Value.AZURE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                GOOGLE -> Known.GOOGLE
                AWS -> Known.AWS
                AZURE -> Known.AZURE
                else -> throw OrbInvalidDataException("Unknown ExternalMarketplace: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }

    @JsonDeserialize(using = PriceOverride.Deserializer::class)
    @JsonSerialize(using = PriceOverride.Serializer::class)
    class PriceOverride
    private constructor(
        private val overrideUnitPrice: OverrideUnitPrice? = null,
        private val overridePackagePrice: OverridePackagePrice? = null,
        private val overrideMatrixPrice: OverrideMatrixPrice? = null,
        private val overrideTieredPrice: OverrideTieredPrice? = null,
        private val overrideTieredBpsPrice: OverrideTieredBpsPrice? = null,
        private val overrideBpsPrice: OverrideBpsPrice? = null,
        private val overrideBulkBpsPrice: OverrideBulkBpsPrice? = null,
        private val overrideBulkPrice: OverrideBulkPrice? = null,
        private val overrideThresholdTotalAmountPrice: OverrideThresholdTotalAmountPrice? = null,
        private val overrideTieredPackagePrice: OverrideTieredPackagePrice? = null,
        private val overrideTieredWithMinimumPrice: OverrideTieredWithMinimumPrice? = null,
        private val overridePackageWithAllocationPrice: OverridePackageWithAllocationPrice? = null,
        private val overrideUnitWithPercentPrice: OverrideUnitWithPercentPrice? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun overrideUnitPrice(): OverrideUnitPrice? = overrideUnitPrice

        fun overridePackagePrice(): OverridePackagePrice? = overridePackagePrice

        fun overrideMatrixPrice(): OverrideMatrixPrice? = overrideMatrixPrice

        fun overrideTieredPrice(): OverrideTieredPrice? = overrideTieredPrice

        fun overrideTieredBpsPrice(): OverrideTieredBpsPrice? = overrideTieredBpsPrice

        fun overrideBpsPrice(): OverrideBpsPrice? = overrideBpsPrice

        fun overrideBulkBpsPrice(): OverrideBulkBpsPrice? = overrideBulkBpsPrice

        fun overrideBulkPrice(): OverrideBulkPrice? = overrideBulkPrice

        fun overrideThresholdTotalAmountPrice(): OverrideThresholdTotalAmountPrice? =
            overrideThresholdTotalAmountPrice

        fun overrideTieredPackagePrice(): OverrideTieredPackagePrice? = overrideTieredPackagePrice

        fun overrideTieredWithMinimumPrice(): OverrideTieredWithMinimumPrice? =
            overrideTieredWithMinimumPrice

        fun overridePackageWithAllocationPrice(): OverridePackageWithAllocationPrice? =
            overridePackageWithAllocationPrice

        fun overrideUnitWithPercentPrice(): OverrideUnitWithPercentPrice? =
            overrideUnitWithPercentPrice

        fun isOverrideUnitPrice(): Boolean = overrideUnitPrice != null

        fun isOverridePackagePrice(): Boolean = overridePackagePrice != null

        fun isOverrideMatrixPrice(): Boolean = overrideMatrixPrice != null

        fun isOverrideTieredPrice(): Boolean = overrideTieredPrice != null

        fun isOverrideTieredBpsPrice(): Boolean = overrideTieredBpsPrice != null

        fun isOverrideBpsPrice(): Boolean = overrideBpsPrice != null

        fun isOverrideBulkBpsPrice(): Boolean = overrideBulkBpsPrice != null

        fun isOverrideBulkPrice(): Boolean = overrideBulkPrice != null

        fun isOverrideThresholdTotalAmountPrice(): Boolean =
            overrideThresholdTotalAmountPrice != null

        fun isOverrideTieredPackagePrice(): Boolean = overrideTieredPackagePrice != null

        fun isOverrideTieredWithMinimumPrice(): Boolean = overrideTieredWithMinimumPrice != null

        fun isOverridePackageWithAllocationPrice(): Boolean =
            overridePackageWithAllocationPrice != null

        fun isOverrideUnitWithPercentPrice(): Boolean = overrideUnitWithPercentPrice != null

        fun asOverrideUnitPrice(): OverrideUnitPrice =
            overrideUnitPrice.getOrThrow("overrideUnitPrice")

        fun asOverridePackagePrice(): OverridePackagePrice =
            overridePackagePrice.getOrThrow("overridePackagePrice")

        fun asOverrideMatrixPrice(): OverrideMatrixPrice =
            overrideMatrixPrice.getOrThrow("overrideMatrixPrice")

        fun asOverrideTieredPrice(): OverrideTieredPrice =
            overrideTieredPrice.getOrThrow("overrideTieredPrice")

        fun asOverrideTieredBpsPrice(): OverrideTieredBpsPrice =
            overrideTieredBpsPrice.getOrThrow("overrideTieredBpsPrice")

        fun asOverrideBpsPrice(): OverrideBpsPrice = overrideBpsPrice.getOrThrow("overrideBpsPrice")

        fun asOverrideBulkBpsPrice(): OverrideBulkBpsPrice =
            overrideBulkBpsPrice.getOrThrow("overrideBulkBpsPrice")

        fun asOverrideBulkPrice(): OverrideBulkPrice =
            overrideBulkPrice.getOrThrow("overrideBulkPrice")

        fun asOverrideThresholdTotalAmountPrice(): OverrideThresholdTotalAmountPrice =
            overrideThresholdTotalAmountPrice.getOrThrow("overrideThresholdTotalAmountPrice")

        fun asOverrideTieredPackagePrice(): OverrideTieredPackagePrice =
            overrideTieredPackagePrice.getOrThrow("overrideTieredPackagePrice")

        fun asOverrideTieredWithMinimumPrice(): OverrideTieredWithMinimumPrice =
            overrideTieredWithMinimumPrice.getOrThrow("overrideTieredWithMinimumPrice")

        fun asOverridePackageWithAllocationPrice(): OverridePackageWithAllocationPrice =
            overridePackageWithAllocationPrice.getOrThrow("overridePackageWithAllocationPrice")

        fun asOverrideUnitWithPercentPrice(): OverrideUnitWithPercentPrice =
            overrideUnitWithPercentPrice.getOrThrow("overrideUnitWithPercentPrice")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                overrideUnitPrice != null -> visitor.visitOverrideUnitPrice(overrideUnitPrice)
                overridePackagePrice != null ->
                    visitor.visitOverridePackagePrice(overridePackagePrice)
                overrideMatrixPrice != null -> visitor.visitOverrideMatrixPrice(overrideMatrixPrice)
                overrideTieredPrice != null -> visitor.visitOverrideTieredPrice(overrideTieredPrice)
                overrideTieredBpsPrice != null ->
                    visitor.visitOverrideTieredBpsPrice(overrideTieredBpsPrice)
                overrideBpsPrice != null -> visitor.visitOverrideBpsPrice(overrideBpsPrice)
                overrideBulkBpsPrice != null ->
                    visitor.visitOverrideBulkBpsPrice(overrideBulkBpsPrice)
                overrideBulkPrice != null -> visitor.visitOverrideBulkPrice(overrideBulkPrice)
                overrideThresholdTotalAmountPrice != null ->
                    visitor.visitOverrideThresholdTotalAmountPrice(
                        overrideThresholdTotalAmountPrice
                    )
                overrideTieredPackagePrice != null ->
                    visitor.visitOverrideTieredPackagePrice(overrideTieredPackagePrice)
                overrideTieredWithMinimumPrice != null ->
                    visitor.visitOverrideTieredWithMinimumPrice(overrideTieredWithMinimumPrice)
                overridePackageWithAllocationPrice != null ->
                    visitor.visitOverridePackageWithAllocationPrice(
                        overridePackageWithAllocationPrice
                    )
                overrideUnitWithPercentPrice != null ->
                    visitor.visitOverrideUnitWithPercentPrice(overrideUnitWithPercentPrice)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): PriceOverride = apply {
            if (!validated) {
                if (
                    overrideUnitPrice == null &&
                        overridePackagePrice == null &&
                        overrideMatrixPrice == null &&
                        overrideTieredPrice == null &&
                        overrideTieredBpsPrice == null &&
                        overrideBpsPrice == null &&
                        overrideBulkBpsPrice == null &&
                        overrideBulkPrice == null &&
                        overrideThresholdTotalAmountPrice == null &&
                        overrideTieredPackagePrice == null &&
                        overrideTieredWithMinimumPrice == null &&
                        overridePackageWithAllocationPrice == null &&
                        overrideUnitWithPercentPrice == null
                ) {
                    throw OrbInvalidDataException("Unknown PriceOverride: $_json")
                }
                overrideUnitPrice?.validate()
                overridePackagePrice?.validate()
                overrideMatrixPrice?.validate()
                overrideTieredPrice?.validate()
                overrideTieredBpsPrice?.validate()
                overrideBpsPrice?.validate()
                overrideBulkBpsPrice?.validate()
                overrideBulkPrice?.validate()
                overrideThresholdTotalAmountPrice?.validate()
                overrideTieredPackagePrice?.validate()
                overrideTieredWithMinimumPrice?.validate()
                overridePackageWithAllocationPrice?.validate()
                overrideUnitWithPercentPrice?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PriceOverride &&
                this.overrideUnitPrice == other.overrideUnitPrice &&
                this.overridePackagePrice == other.overridePackagePrice &&
                this.overrideMatrixPrice == other.overrideMatrixPrice &&
                this.overrideTieredPrice == other.overrideTieredPrice &&
                this.overrideTieredBpsPrice == other.overrideTieredBpsPrice &&
                this.overrideBpsPrice == other.overrideBpsPrice &&
                this.overrideBulkBpsPrice == other.overrideBulkBpsPrice &&
                this.overrideBulkPrice == other.overrideBulkPrice &&
                this.overrideThresholdTotalAmountPrice == other.overrideThresholdTotalAmountPrice &&
                this.overrideTieredPackagePrice == other.overrideTieredPackagePrice &&
                this.overrideTieredWithMinimumPrice == other.overrideTieredWithMinimumPrice &&
                this.overridePackageWithAllocationPrice ==
                    other.overridePackageWithAllocationPrice &&
                this.overrideUnitWithPercentPrice == other.overrideUnitWithPercentPrice
        }

        override fun hashCode(): Int {
            return Objects.hash(
                overrideUnitPrice,
                overridePackagePrice,
                overrideMatrixPrice,
                overrideTieredPrice,
                overrideTieredBpsPrice,
                overrideBpsPrice,
                overrideBulkBpsPrice,
                overrideBulkPrice,
                overrideThresholdTotalAmountPrice,
                overrideTieredPackagePrice,
                overrideTieredWithMinimumPrice,
                overridePackageWithAllocationPrice,
                overrideUnitWithPercentPrice,
            )
        }

        override fun toString(): String {
            return when {
                overrideUnitPrice != null -> "PriceOverride{overrideUnitPrice=$overrideUnitPrice}"
                overridePackagePrice != null ->
                    "PriceOverride{overridePackagePrice=$overridePackagePrice}"
                overrideMatrixPrice != null ->
                    "PriceOverride{overrideMatrixPrice=$overrideMatrixPrice}"
                overrideTieredPrice != null ->
                    "PriceOverride{overrideTieredPrice=$overrideTieredPrice}"
                overrideTieredBpsPrice != null ->
                    "PriceOverride{overrideTieredBpsPrice=$overrideTieredBpsPrice}"
                overrideBpsPrice != null -> "PriceOverride{overrideBpsPrice=$overrideBpsPrice}"
                overrideBulkBpsPrice != null ->
                    "PriceOverride{overrideBulkBpsPrice=$overrideBulkBpsPrice}"
                overrideBulkPrice != null -> "PriceOverride{overrideBulkPrice=$overrideBulkPrice}"
                overrideThresholdTotalAmountPrice != null ->
                    "PriceOverride{overrideThresholdTotalAmountPrice=$overrideThresholdTotalAmountPrice}"
                overrideTieredPackagePrice != null ->
                    "PriceOverride{overrideTieredPackagePrice=$overrideTieredPackagePrice}"
                overrideTieredWithMinimumPrice != null ->
                    "PriceOverride{overrideTieredWithMinimumPrice=$overrideTieredWithMinimumPrice}"
                overridePackageWithAllocationPrice != null ->
                    "PriceOverride{overridePackageWithAllocationPrice=$overridePackageWithAllocationPrice}"
                overrideUnitWithPercentPrice != null ->
                    "PriceOverride{overrideUnitWithPercentPrice=$overrideUnitWithPercentPrice}"
                _json != null -> "PriceOverride{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid PriceOverride")
            }
        }

        companion object {

            fun ofOverrideUnitPrice(overrideUnitPrice: OverrideUnitPrice) =
                PriceOverride(overrideUnitPrice = overrideUnitPrice)

            fun ofOverridePackagePrice(overridePackagePrice: OverridePackagePrice) =
                PriceOverride(overridePackagePrice = overridePackagePrice)

            fun ofOverrideMatrixPrice(overrideMatrixPrice: OverrideMatrixPrice) =
                PriceOverride(overrideMatrixPrice = overrideMatrixPrice)

            fun ofOverrideTieredPrice(overrideTieredPrice: OverrideTieredPrice) =
                PriceOverride(overrideTieredPrice = overrideTieredPrice)

            fun ofOverrideTieredBpsPrice(overrideTieredBpsPrice: OverrideTieredBpsPrice) =
                PriceOverride(overrideTieredBpsPrice = overrideTieredBpsPrice)

            fun ofOverrideBpsPrice(overrideBpsPrice: OverrideBpsPrice) =
                PriceOverride(overrideBpsPrice = overrideBpsPrice)

            fun ofOverrideBulkBpsPrice(overrideBulkBpsPrice: OverrideBulkBpsPrice) =
                PriceOverride(overrideBulkBpsPrice = overrideBulkBpsPrice)

            fun ofOverrideBulkPrice(overrideBulkPrice: OverrideBulkPrice) =
                PriceOverride(overrideBulkPrice = overrideBulkPrice)

            fun ofOverrideThresholdTotalAmountPrice(
                overrideThresholdTotalAmountPrice: OverrideThresholdTotalAmountPrice
            ) = PriceOverride(overrideThresholdTotalAmountPrice = overrideThresholdTotalAmountPrice)

            fun ofOverrideTieredPackagePrice(
                overrideTieredPackagePrice: OverrideTieredPackagePrice
            ) = PriceOverride(overrideTieredPackagePrice = overrideTieredPackagePrice)

            fun ofOverrideTieredWithMinimumPrice(
                overrideTieredWithMinimumPrice: OverrideTieredWithMinimumPrice
            ) = PriceOverride(overrideTieredWithMinimumPrice = overrideTieredWithMinimumPrice)

            fun ofOverridePackageWithAllocationPrice(
                overridePackageWithAllocationPrice: OverridePackageWithAllocationPrice
            ) =
                PriceOverride(
                    overridePackageWithAllocationPrice = overridePackageWithAllocationPrice
                )

            fun ofOverrideUnitWithPercentPrice(
                overrideUnitWithPercentPrice: OverrideUnitWithPercentPrice
            ) = PriceOverride(overrideUnitWithPercentPrice = overrideUnitWithPercentPrice)
        }

        interface Visitor<out T> {

            fun visitOverrideUnitPrice(overrideUnitPrice: OverrideUnitPrice): T

            fun visitOverridePackagePrice(overridePackagePrice: OverridePackagePrice): T

            fun visitOverrideMatrixPrice(overrideMatrixPrice: OverrideMatrixPrice): T

            fun visitOverrideTieredPrice(overrideTieredPrice: OverrideTieredPrice): T

            fun visitOverrideTieredBpsPrice(overrideTieredBpsPrice: OverrideTieredBpsPrice): T

            fun visitOverrideBpsPrice(overrideBpsPrice: OverrideBpsPrice): T

            fun visitOverrideBulkBpsPrice(overrideBulkBpsPrice: OverrideBulkBpsPrice): T

            fun visitOverrideBulkPrice(overrideBulkPrice: OverrideBulkPrice): T

            fun visitOverrideThresholdTotalAmountPrice(
                overrideThresholdTotalAmountPrice: OverrideThresholdTotalAmountPrice
            ): T

            fun visitOverrideTieredPackagePrice(
                overrideTieredPackagePrice: OverrideTieredPackagePrice
            ): T

            fun visitOverrideTieredWithMinimumPrice(
                overrideTieredWithMinimumPrice: OverrideTieredWithMinimumPrice
            ): T

            fun visitOverridePackageWithAllocationPrice(
                overridePackageWithAllocationPrice: OverridePackageWithAllocationPrice
            ): T

            fun visitOverrideUnitWithPercentPrice(
                overrideUnitWithPercentPrice: OverrideUnitWithPercentPrice
            ): T

            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown PriceOverride: $json")
            }
        }

        class Deserializer : BaseDeserializer<PriceOverride>(PriceOverride::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): PriceOverride {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<OverrideUnitPrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideUnitPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverridePackagePrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overridePackagePrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideMatrixPrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideMatrixPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideTieredPrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideTieredPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideTieredBpsPrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideTieredBpsPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideBpsPrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideBpsPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideBulkBpsPrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideBulkBpsPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideBulkPrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideBulkPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideThresholdTotalAmountPrice>()) {
                        it.validate()
                    }
                    ?.let {
                        return PriceOverride(overrideThresholdTotalAmountPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideTieredPackagePrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideTieredPackagePrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideTieredWithMinimumPrice>()) {
                        it.validate()
                    }
                    ?.let {
                        return PriceOverride(overrideTieredWithMinimumPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverridePackageWithAllocationPrice>()) {
                        it.validate()
                    }
                    ?.let {
                        return PriceOverride(overridePackageWithAllocationPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideUnitWithPercentPrice>()) {
                        it.validate()
                    }
                    ?.let {
                        return PriceOverride(overrideUnitWithPercentPrice = it, _json = json)
                    }

                return PriceOverride(_json = json)
            }
        }

        class Serializer : BaseSerializer<PriceOverride>(PriceOverride::class) {

            override fun serialize(
                value: PriceOverride,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.overrideUnitPrice != null ->
                        generator.writeObject(value.overrideUnitPrice)
                    value.overridePackagePrice != null ->
                        generator.writeObject(value.overridePackagePrice)
                    value.overrideMatrixPrice != null ->
                        generator.writeObject(value.overrideMatrixPrice)
                    value.overrideTieredPrice != null ->
                        generator.writeObject(value.overrideTieredPrice)
                    value.overrideTieredBpsPrice != null ->
                        generator.writeObject(value.overrideTieredBpsPrice)
                    value.overrideBpsPrice != null -> generator.writeObject(value.overrideBpsPrice)
                    value.overrideBulkBpsPrice != null ->
                        generator.writeObject(value.overrideBulkBpsPrice)
                    value.overrideBulkPrice != null ->
                        generator.writeObject(value.overrideBulkPrice)
                    value.overrideThresholdTotalAmountPrice != null ->
                        generator.writeObject(value.overrideThresholdTotalAmountPrice)
                    value.overrideTieredPackagePrice != null ->
                        generator.writeObject(value.overrideTieredPackagePrice)
                    value.overrideTieredWithMinimumPrice != null ->
                        generator.writeObject(value.overrideTieredWithMinimumPrice)
                    value.overridePackageWithAllocationPrice != null ->
                        generator.writeObject(value.overridePackageWithAllocationPrice)
                    value.overrideUnitWithPercentPrice != null ->
                        generator.writeObject(value.overrideUnitWithPercentPrice)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid PriceOverride")
                }
            }
        }

        @JsonDeserialize(builder = OverrideUnitPrice.Builder::class)
        @NoAutoDetect
        class OverrideUnitPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val unitConfig: JsonField<UnitConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): String? = currency.getNullable("currency")

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /** The subscription's override discount for the plan. */
            fun discount(): Discount? = discount.getNullable("discount")

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            fun unitConfig(): UnitConfig = unitConfig.getRequired("unit_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("unit_config") @ExcludeMissing fun _unitConfig() = unitConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideUnitPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount()?.validate()
                    fixedPriceQuantity()
                    unitConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverrideUnitPrice &&
                    this.id == other.id &&
                    this.modelType == other.modelType &&
                    this.minimumAmount == other.minimumAmount &&
                    this.maximumAmount == other.maximumAmount &&
                    this.currency == other.currency &&
                    this.conversionRate == other.conversionRate &&
                    this.discount == other.discount &&
                    this.fixedPriceQuantity == other.fixedPriceQuantity &&
                    this.unitConfig == other.unitConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            modelType,
                            minimumAmount,
                            maximumAmount,
                            currency,
                            conversionRate,
                            discount,
                            fixedPriceQuantity,
                            unitConfig,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "OverrideUnitPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, unitConfig=$unitConfig, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var unitConfig: JsonField<UnitConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(overrideUnitPrice: OverrideUnitPrice) = apply {
                    this.id = overrideUnitPrice.id
                    this.modelType = overrideUnitPrice.modelType
                    this.minimumAmount = overrideUnitPrice.minimumAmount
                    this.maximumAmount = overrideUnitPrice.maximumAmount
                    this.currency = overrideUnitPrice.currency
                    this.conversionRate = overrideUnitPrice.conversionRate
                    this.discount = overrideUnitPrice.discount
                    this.fixedPriceQuantity = overrideUnitPrice.fixedPriceQuantity
                    this.unitConfig = overrideUnitPrice.unitConfig
                    additionalProperties(overrideUnitPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun unitConfig(unitConfig: UnitConfig) = unitConfig(JsonField.of(unitConfig))

                @JsonProperty("unit_config")
                @ExcludeMissing
                fun unitConfig(unitConfig: JsonField<UnitConfig>) = apply {
                    this.unitConfig = unitConfig
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

                fun build(): OverrideUnitPrice =
                    OverrideUnitPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        unitConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class ModelType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val UNIT = ModelType(JsonField.of("unit"))

                    fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    UNIT,
                }

                enum class Value {
                    UNIT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        UNIT -> Value.UNIT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        UNIT -> Known.UNIT
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = UnitConfig.Builder::class)
            @NoAutoDetect
            class UnitConfig
            private constructor(
                private val unitAmount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Rate per unit of usage */
                fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                /** Rate per unit of usage */
                @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): UnitConfig = apply {
                    if (!validated) {
                        unitAmount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UnitConfig &&
                        this.unitAmount == other.unitAmount &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(unitAmount, additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "UnitConfig{unitAmount=$unitAmount, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var unitAmount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(unitConfig: UnitConfig) = apply {
                        this.unitAmount = unitConfig.unitAmount
                        additionalProperties(unitConfig.additionalProperties)
                    }

                    /** Rate per unit of usage */
                    fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                    /** Rate per unit of usage */
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    fun unitAmount(unitAmount: JsonField<String>) = apply {
                        this.unitAmount = unitAmount
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

                    fun build(): UnitConfig =
                        UnitConfig(unitAmount, additionalProperties.toUnmodifiable())
                }
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val trialAmountDiscount: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double? =
                    percentageDiscount.getNullable("percentage_discount")

                /** Only available if discount_type is `trial` */
                fun trialAmountDiscount(): String? =
                    trialAmountDiscount.getNullable("trial_amount_discount")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(): List<String>? =
                    appliesToPriceIds.getNullable("applies_to_price_ids")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /** Only available if discount_type is `trial` */
                @JsonProperty("trial_amount_discount")
                @ExcludeMissing
                fun _trialAmountDiscount() = trialAmountDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        trialAmountDiscount()
                        usageDiscount()
                        amountDiscount()
                        appliesToPriceIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        this.discountType == other.discountType &&
                        this.percentageDiscount == other.percentageDiscount &&
                        this.trialAmountDiscount == other.trialAmountDiscount &&
                        this.usageDiscount == other.usageDiscount &&
                        this.amountDiscount == other.amountDiscount &&
                        this.appliesToPriceIds == other.appliesToPriceIds &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                percentageDiscount,
                                trialAmountDiscount,
                                usageDiscount,
                                amountDiscount,
                                appliesToPriceIds,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, trialAmountDiscount=$trialAmountDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.trialAmountDiscount = discount.trialAmountDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        this.appliesToPriceIds = discount.appliesToPriceIds
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** Only available if discount_type is `trial` */
                    fun trialAmountDiscount(trialAmountDiscount: String) =
                        trialAmountDiscount(JsonField.of(trialAmountDiscount))

                    /** Only available if discount_type is `trial` */
                    @JsonProperty("trial_amount_discount")
                    @ExcludeMissing
                    fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
                        this.trialAmountDiscount = trialAmountDiscount
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

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            trialAmountDiscount,
                            usageDiscount,
                            amountDiscount,
                            appliesToPriceIds.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
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

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        val TRIAL = DiscountType(JsonField.of("trial"))

                        val USAGE = DiscountType(JsonField.of("usage"))

                        val AMOUNT = DiscountType(JsonField.of("amount"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(builder = OverridePackagePrice.Builder::class)
        @NoAutoDetect
        class OverridePackagePrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val packageConfig: JsonField<PackageConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): String? = currency.getNullable("currency")

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /** The subscription's override discount for the plan. */
            fun discount(): Discount? = discount.getNullable("discount")

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            fun packageConfig(): PackageConfig = packageConfig.getRequired("package_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("package_config") @ExcludeMissing fun _packageConfig() = packageConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverridePackagePrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount()?.validate()
                    fixedPriceQuantity()
                    packageConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverridePackagePrice &&
                    this.id == other.id &&
                    this.modelType == other.modelType &&
                    this.minimumAmount == other.minimumAmount &&
                    this.maximumAmount == other.maximumAmount &&
                    this.currency == other.currency &&
                    this.conversionRate == other.conversionRate &&
                    this.discount == other.discount &&
                    this.fixedPriceQuantity == other.fixedPriceQuantity &&
                    this.packageConfig == other.packageConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            modelType,
                            minimumAmount,
                            maximumAmount,
                            currency,
                            conversionRate,
                            discount,
                            fixedPriceQuantity,
                            packageConfig,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "OverridePackagePrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, packageConfig=$packageConfig, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var packageConfig: JsonField<PackageConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(overridePackagePrice: OverridePackagePrice) = apply {
                    this.id = overridePackagePrice.id
                    this.modelType = overridePackagePrice.modelType
                    this.minimumAmount = overridePackagePrice.minimumAmount
                    this.maximumAmount = overridePackagePrice.maximumAmount
                    this.currency = overridePackagePrice.currency
                    this.conversionRate = overridePackagePrice.conversionRate
                    this.discount = overridePackagePrice.discount
                    this.fixedPriceQuantity = overridePackagePrice.fixedPriceQuantity
                    this.packageConfig = overridePackagePrice.packageConfig
                    additionalProperties(overridePackagePrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun packageConfig(packageConfig: PackageConfig) =
                    packageConfig(JsonField.of(packageConfig))

                @JsonProperty("package_config")
                @ExcludeMissing
                fun packageConfig(packageConfig: JsonField<PackageConfig>) = apply {
                    this.packageConfig = packageConfig
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

                fun build(): OverridePackagePrice =
                    OverridePackagePrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        packageConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class ModelType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val PACKAGE = ModelType(JsonField.of("package"))

                    fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    PACKAGE,
                }

                enum class Value {
                    PACKAGE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PACKAGE -> Value.PACKAGE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PACKAGE -> Known.PACKAGE
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = PackageConfig.Builder::class)
            @NoAutoDetect
            class PackageConfig
            private constructor(
                private val packageAmount: JsonField<String>,
                private val packageSize: JsonField<Long>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** A currency amount to rate usage by */
                fun packageAmount(): String = packageAmount.getRequired("package_amount")

                /**
                 * An integer amount to represent package size. For example, 1000 here would divide
                 * usage by 1000 before multiplying by package_amount in rating
                 */
                fun packageSize(): Long = packageSize.getRequired("package_size")

                /** A currency amount to rate usage by */
                @JsonProperty("package_amount") @ExcludeMissing fun _packageAmount() = packageAmount

                /**
                 * An integer amount to represent package size. For example, 1000 here would divide
                 * usage by 1000 before multiplying by package_amount in rating
                 */
                @JsonProperty("package_size") @ExcludeMissing fun _packageSize() = packageSize

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PackageConfig = apply {
                    if (!validated) {
                        packageAmount()
                        packageSize()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PackageConfig &&
                        this.packageAmount == other.packageAmount &&
                        this.packageSize == other.packageSize &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                packageAmount,
                                packageSize,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "PackageConfig{packageAmount=$packageAmount, packageSize=$packageSize, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var packageAmount: JsonField<String> = JsonMissing.of()
                    private var packageSize: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(packageConfig: PackageConfig) = apply {
                        this.packageAmount = packageConfig.packageAmount
                        this.packageSize = packageConfig.packageSize
                        additionalProperties(packageConfig.additionalProperties)
                    }

                    /** A currency amount to rate usage by */
                    fun packageAmount(packageAmount: String) =
                        packageAmount(JsonField.of(packageAmount))

                    /** A currency amount to rate usage by */
                    @JsonProperty("package_amount")
                    @ExcludeMissing
                    fun packageAmount(packageAmount: JsonField<String>) = apply {
                        this.packageAmount = packageAmount
                    }

                    /**
                     * An integer amount to represent package size. For example, 1000 here would
                     * divide usage by 1000 before multiplying by package_amount in rating
                     */
                    fun packageSize(packageSize: Long) = packageSize(JsonField.of(packageSize))

                    /**
                     * An integer amount to represent package size. For example, 1000 here would
                     * divide usage by 1000 before multiplying by package_amount in rating
                     */
                    @JsonProperty("package_size")
                    @ExcludeMissing
                    fun packageSize(packageSize: JsonField<Long>) = apply {
                        this.packageSize = packageSize
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

                    fun build(): PackageConfig =
                        PackageConfig(
                            packageAmount,
                            packageSize,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val trialAmountDiscount: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double? =
                    percentageDiscount.getNullable("percentage_discount")

                /** Only available if discount_type is `trial` */
                fun trialAmountDiscount(): String? =
                    trialAmountDiscount.getNullable("trial_amount_discount")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(): List<String>? =
                    appliesToPriceIds.getNullable("applies_to_price_ids")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /** Only available if discount_type is `trial` */
                @JsonProperty("trial_amount_discount")
                @ExcludeMissing
                fun _trialAmountDiscount() = trialAmountDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        trialAmountDiscount()
                        usageDiscount()
                        amountDiscount()
                        appliesToPriceIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        this.discountType == other.discountType &&
                        this.percentageDiscount == other.percentageDiscount &&
                        this.trialAmountDiscount == other.trialAmountDiscount &&
                        this.usageDiscount == other.usageDiscount &&
                        this.amountDiscount == other.amountDiscount &&
                        this.appliesToPriceIds == other.appliesToPriceIds &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                percentageDiscount,
                                trialAmountDiscount,
                                usageDiscount,
                                amountDiscount,
                                appliesToPriceIds,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, trialAmountDiscount=$trialAmountDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.trialAmountDiscount = discount.trialAmountDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        this.appliesToPriceIds = discount.appliesToPriceIds
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** Only available if discount_type is `trial` */
                    fun trialAmountDiscount(trialAmountDiscount: String) =
                        trialAmountDiscount(JsonField.of(trialAmountDiscount))

                    /** Only available if discount_type is `trial` */
                    @JsonProperty("trial_amount_discount")
                    @ExcludeMissing
                    fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
                        this.trialAmountDiscount = trialAmountDiscount
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

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            trialAmountDiscount,
                            usageDiscount,
                            amountDiscount,
                            appliesToPriceIds.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
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

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        val TRIAL = DiscountType(JsonField.of("trial"))

                        val USAGE = DiscountType(JsonField.of("usage"))

                        val AMOUNT = DiscountType(JsonField.of("amount"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(builder = OverrideMatrixPrice.Builder::class)
        @NoAutoDetect
        class OverrideMatrixPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val matrixConfig: JsonField<MatrixConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): String? = currency.getNullable("currency")

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /** The subscription's override discount for the plan. */
            fun discount(): Discount? = discount.getNullable("discount")

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            fun matrixConfig(): MatrixConfig = matrixConfig.getRequired("matrix_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("matrix_config") @ExcludeMissing fun _matrixConfig() = matrixConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideMatrixPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount()?.validate()
                    fixedPriceQuantity()
                    matrixConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverrideMatrixPrice &&
                    this.id == other.id &&
                    this.modelType == other.modelType &&
                    this.minimumAmount == other.minimumAmount &&
                    this.maximumAmount == other.maximumAmount &&
                    this.currency == other.currency &&
                    this.conversionRate == other.conversionRate &&
                    this.discount == other.discount &&
                    this.fixedPriceQuantity == other.fixedPriceQuantity &&
                    this.matrixConfig == other.matrixConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            modelType,
                            minimumAmount,
                            maximumAmount,
                            currency,
                            conversionRate,
                            discount,
                            fixedPriceQuantity,
                            matrixConfig,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "OverrideMatrixPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, matrixConfig=$matrixConfig, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var matrixConfig: JsonField<MatrixConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(overrideMatrixPrice: OverrideMatrixPrice) = apply {
                    this.id = overrideMatrixPrice.id
                    this.modelType = overrideMatrixPrice.modelType
                    this.minimumAmount = overrideMatrixPrice.minimumAmount
                    this.maximumAmount = overrideMatrixPrice.maximumAmount
                    this.currency = overrideMatrixPrice.currency
                    this.conversionRate = overrideMatrixPrice.conversionRate
                    this.discount = overrideMatrixPrice.discount
                    this.fixedPriceQuantity = overrideMatrixPrice.fixedPriceQuantity
                    this.matrixConfig = overrideMatrixPrice.matrixConfig
                    additionalProperties(overrideMatrixPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun matrixConfig(matrixConfig: MatrixConfig) =
                    matrixConfig(JsonField.of(matrixConfig))

                @JsonProperty("matrix_config")
                @ExcludeMissing
                fun matrixConfig(matrixConfig: JsonField<MatrixConfig>) = apply {
                    this.matrixConfig = matrixConfig
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

                fun build(): OverrideMatrixPrice =
                    OverrideMatrixPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        matrixConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = MatrixConfig.Builder::class)
            @NoAutoDetect
            class MatrixConfig
            private constructor(
                private val dimensions: JsonField<List<String?>>,
                private val defaultUnitAmount: JsonField<String>,
                private val matrixValues: JsonField<List<MatrixValue>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** One or two event property values to evaluate matrix groups by */
                fun dimensions(): List<String?> = dimensions.getRequired("dimensions")

                /**
                 * Default per unit rate for any usage not bucketed into a specified matrix_value
                 */
                fun defaultUnitAmount(): String =
                    defaultUnitAmount.getRequired("default_unit_amount")

                /** Matrix values for specified matrix grouping keys */
                fun matrixValues(): List<MatrixValue> = matrixValues.getRequired("matrix_values")

                /** One or two event property values to evaluate matrix groups by */
                @JsonProperty("dimensions") @ExcludeMissing fun _dimensions() = dimensions

                /**
                 * Default per unit rate for any usage not bucketed into a specified matrix_value
                 */
                @JsonProperty("default_unit_amount")
                @ExcludeMissing
                fun _defaultUnitAmount() = defaultUnitAmount

                /** Matrix values for specified matrix grouping keys */
                @JsonProperty("matrix_values") @ExcludeMissing fun _matrixValues() = matrixValues

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): MatrixConfig = apply {
                    if (!validated) {
                        dimensions()
                        defaultUnitAmount()
                        matrixValues().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MatrixConfig &&
                        this.dimensions == other.dimensions &&
                        this.defaultUnitAmount == other.defaultUnitAmount &&
                        this.matrixValues == other.matrixValues &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                dimensions,
                                defaultUnitAmount,
                                matrixValues,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "MatrixConfig{dimensions=$dimensions, defaultUnitAmount=$defaultUnitAmount, matrixValues=$matrixValues, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var dimensions: JsonField<List<String?>> = JsonMissing.of()
                    private var defaultUnitAmount: JsonField<String> = JsonMissing.of()
                    private var matrixValues: JsonField<List<MatrixValue>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(matrixConfig: MatrixConfig) = apply {
                        this.dimensions = matrixConfig.dimensions
                        this.defaultUnitAmount = matrixConfig.defaultUnitAmount
                        this.matrixValues = matrixConfig.matrixValues
                        additionalProperties(matrixConfig.additionalProperties)
                    }

                    /** One or two event property values to evaluate matrix groups by */
                    fun dimensions(dimensions: List<String?>) = dimensions(JsonField.of(dimensions))

                    /** One or two event property values to evaluate matrix groups by */
                    @JsonProperty("dimensions")
                    @ExcludeMissing
                    fun dimensions(dimensions: JsonField<List<String?>>) = apply {
                        this.dimensions = dimensions
                    }

                    /**
                     * Default per unit rate for any usage not bucketed into a specified
                     * matrix_value
                     */
                    fun defaultUnitAmount(defaultUnitAmount: String) =
                        defaultUnitAmount(JsonField.of(defaultUnitAmount))

                    /**
                     * Default per unit rate for any usage not bucketed into a specified
                     * matrix_value
                     */
                    @JsonProperty("default_unit_amount")
                    @ExcludeMissing
                    fun defaultUnitAmount(defaultUnitAmount: JsonField<String>) = apply {
                        this.defaultUnitAmount = defaultUnitAmount
                    }

                    /** Matrix values for specified matrix grouping keys */
                    fun matrixValues(matrixValues: List<MatrixValue>) =
                        matrixValues(JsonField.of(matrixValues))

                    /** Matrix values for specified matrix grouping keys */
                    @JsonProperty("matrix_values")
                    @ExcludeMissing
                    fun matrixValues(matrixValues: JsonField<List<MatrixValue>>) = apply {
                        this.matrixValues = matrixValues
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

                    fun build(): MatrixConfig =
                        MatrixConfig(
                            dimensions.map { it.toUnmodifiable() },
                            defaultUnitAmount,
                            matrixValues.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = MatrixValue.Builder::class)
                @NoAutoDetect
                class MatrixValue
                private constructor(
                    private val unitAmount: JsonField<String>,
                    private val dimensionValues: JsonField<List<String?>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Unit price for the specified dimension_values */
                    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                    /**
                     * One or two matrix keys to filter usage to this Matrix value by. For example,
                     * ["region", "tier"] could be used to filter cloud usage by a cloud region and
                     * an instance tier.
                     */
                    fun dimensionValues(): List<String?> =
                        dimensionValues.getRequired("dimension_values")

                    /** Unit price for the specified dimension_values */
                    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                    /**
                     * One or two matrix keys to filter usage to this Matrix value by. For example,
                     * ["region", "tier"] could be used to filter cloud usage by a cloud region and
                     * an instance tier.
                     */
                    @JsonProperty("dimension_values")
                    @ExcludeMissing
                    fun _dimensionValues() = dimensionValues

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): MatrixValue = apply {
                        if (!validated) {
                            unitAmount()
                            dimensionValues()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is MatrixValue &&
                            this.unitAmount == other.unitAmount &&
                            this.dimensionValues == other.dimensionValues &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    unitAmount,
                                    dimensionValues,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "MatrixValue{unitAmount=$unitAmount, dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var unitAmount: JsonField<String> = JsonMissing.of()
                        private var dimensionValues: JsonField<List<String?>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(matrixValue: MatrixValue) = apply {
                            this.unitAmount = matrixValue.unitAmount
                            this.dimensionValues = matrixValue.dimensionValues
                            additionalProperties(matrixValue.additionalProperties)
                        }

                        /** Unit price for the specified dimension_values */
                        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                        /** Unit price for the specified dimension_values */
                        @JsonProperty("unit_amount")
                        @ExcludeMissing
                        fun unitAmount(unitAmount: JsonField<String>) = apply {
                            this.unitAmount = unitAmount
                        }

                        /**
                         * One or two matrix keys to filter usage to this Matrix value by. For
                         * example, ["region", "tier"] could be used to filter cloud usage by a
                         * cloud region and an instance tier.
                         */
                        fun dimensionValues(dimensionValues: List<String?>) =
                            dimensionValues(JsonField.of(dimensionValues))

                        /**
                         * One or two matrix keys to filter usage to this Matrix value by. For
                         * example, ["region", "tier"] could be used to filter cloud usage by a
                         * cloud region and an instance tier.
                         */
                        @JsonProperty("dimension_values")
                        @ExcludeMissing
                        fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
                            this.dimensionValues = dimensionValues
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): MatrixValue =
                            MatrixValue(
                                unitAmount,
                                dimensionValues.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }
            }

            class ModelType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val MATRIX = ModelType(JsonField.of("matrix"))

                    fun of(value: String) = ModelType(JsonField.of(value))
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
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val trialAmountDiscount: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double? =
                    percentageDiscount.getNullable("percentage_discount")

                /** Only available if discount_type is `trial` */
                fun trialAmountDiscount(): String? =
                    trialAmountDiscount.getNullable("trial_amount_discount")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(): List<String>? =
                    appliesToPriceIds.getNullable("applies_to_price_ids")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /** Only available if discount_type is `trial` */
                @JsonProperty("trial_amount_discount")
                @ExcludeMissing
                fun _trialAmountDiscount() = trialAmountDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        trialAmountDiscount()
                        usageDiscount()
                        amountDiscount()
                        appliesToPriceIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        this.discountType == other.discountType &&
                        this.percentageDiscount == other.percentageDiscount &&
                        this.trialAmountDiscount == other.trialAmountDiscount &&
                        this.usageDiscount == other.usageDiscount &&
                        this.amountDiscount == other.amountDiscount &&
                        this.appliesToPriceIds == other.appliesToPriceIds &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                percentageDiscount,
                                trialAmountDiscount,
                                usageDiscount,
                                amountDiscount,
                                appliesToPriceIds,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, trialAmountDiscount=$trialAmountDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.trialAmountDiscount = discount.trialAmountDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        this.appliesToPriceIds = discount.appliesToPriceIds
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** Only available if discount_type is `trial` */
                    fun trialAmountDiscount(trialAmountDiscount: String) =
                        trialAmountDiscount(JsonField.of(trialAmountDiscount))

                    /** Only available if discount_type is `trial` */
                    @JsonProperty("trial_amount_discount")
                    @ExcludeMissing
                    fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
                        this.trialAmountDiscount = trialAmountDiscount
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

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            trialAmountDiscount,
                            usageDiscount,
                            amountDiscount,
                            appliesToPriceIds.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
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

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        val TRIAL = DiscountType(JsonField.of("trial"))

                        val USAGE = DiscountType(JsonField.of("usage"))

                        val AMOUNT = DiscountType(JsonField.of("amount"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(builder = OverrideTieredPrice.Builder::class)
        @NoAutoDetect
        class OverrideTieredPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val tieredConfig: JsonField<TieredConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): String? = currency.getNullable("currency")

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /** The subscription's override discount for the plan. */
            fun discount(): Discount? = discount.getNullable("discount")

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            fun tieredConfig(): TieredConfig = tieredConfig.getRequired("tiered_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("tiered_config") @ExcludeMissing fun _tieredConfig() = tieredConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideTieredPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount()?.validate()
                    fixedPriceQuantity()
                    tieredConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverrideTieredPrice &&
                    this.id == other.id &&
                    this.modelType == other.modelType &&
                    this.minimumAmount == other.minimumAmount &&
                    this.maximumAmount == other.maximumAmount &&
                    this.currency == other.currency &&
                    this.conversionRate == other.conversionRate &&
                    this.discount == other.discount &&
                    this.fixedPriceQuantity == other.fixedPriceQuantity &&
                    this.tieredConfig == other.tieredConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            modelType,
                            minimumAmount,
                            maximumAmount,
                            currency,
                            conversionRate,
                            discount,
                            fixedPriceQuantity,
                            tieredConfig,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "OverrideTieredPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, tieredConfig=$tieredConfig, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var tieredConfig: JsonField<TieredConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(overrideTieredPrice: OverrideTieredPrice) = apply {
                    this.id = overrideTieredPrice.id
                    this.modelType = overrideTieredPrice.modelType
                    this.minimumAmount = overrideTieredPrice.minimumAmount
                    this.maximumAmount = overrideTieredPrice.maximumAmount
                    this.currency = overrideTieredPrice.currency
                    this.conversionRate = overrideTieredPrice.conversionRate
                    this.discount = overrideTieredPrice.discount
                    this.fixedPriceQuantity = overrideTieredPrice.fixedPriceQuantity
                    this.tieredConfig = overrideTieredPrice.tieredConfig
                    additionalProperties(overrideTieredPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun tieredConfig(tieredConfig: TieredConfig) =
                    tieredConfig(JsonField.of(tieredConfig))

                @JsonProperty("tiered_config")
                @ExcludeMissing
                fun tieredConfig(tieredConfig: JsonField<TieredConfig>) = apply {
                    this.tieredConfig = tieredConfig
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

                fun build(): OverrideTieredPrice =
                    OverrideTieredPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        tieredConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class ModelType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val TIERED = ModelType(JsonField.of("tiered"))

                    fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    TIERED,
                }

                enum class Value {
                    TIERED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TIERED -> Value.TIERED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TIERED -> Known.TIERED
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = TieredConfig.Builder::class)
            @NoAutoDetect
            class TieredConfig
            private constructor(
                private val tiers: JsonField<List<Tier>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Tiers for rating based on total usage quantities into the specified tier */
                fun tiers(): List<Tier> = tiers.getRequired("tiers")

                /** Tiers for rating based on total usage quantities into the specified tier */
                @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): TieredConfig = apply {
                    if (!validated) {
                        tiers().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TieredConfig &&
                        this.tiers == other.tiers &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(tiers, additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "TieredConfig{tiers=$tiers, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tieredConfig: TieredConfig) = apply {
                        this.tiers = tieredConfig.tiers
                        additionalProperties(tieredConfig.additionalProperties)
                    }

                    /** Tiers for rating based on total usage quantities into the specified tier */
                    fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                    /** Tiers for rating based on total usage quantities into the specified tier */
                    @JsonProperty("tiers")
                    @ExcludeMissing
                    fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

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

                    fun build(): TieredConfig =
                        TieredConfig(
                            tiers.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable()
                        )
                }

                @JsonDeserialize(builder = Tier.Builder::class)
                @NoAutoDetect
                class Tier
                private constructor(
                    private val firstUnit: JsonField<Double>,
                    private val lastUnit: JsonField<Double>,
                    private val unitAmount: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Inclusive tier starting value */
                    fun firstUnit(): Double = firstUnit.getRequired("first_unit")

                    /** Exclusive tier ending value. If null, this is treated as the last tier */
                    fun lastUnit(): Double? = lastUnit.getNullable("last_unit")

                    /** Amount per unit */
                    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                    /** Inclusive tier starting value */
                    @JsonProperty("first_unit") @ExcludeMissing fun _firstUnit() = firstUnit

                    /** Exclusive tier ending value. If null, this is treated as the last tier */
                    @JsonProperty("last_unit") @ExcludeMissing fun _lastUnit() = lastUnit

                    /** Amount per unit */
                    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Tier = apply {
                        if (!validated) {
                            firstUnit()
                            lastUnit()
                            unitAmount()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Tier &&
                            this.firstUnit == other.firstUnit &&
                            this.lastUnit == other.lastUnit &&
                            this.unitAmount == other.unitAmount &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    firstUnit,
                                    lastUnit,
                                    unitAmount,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Tier{firstUnit=$firstUnit, lastUnit=$lastUnit, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var firstUnit: JsonField<Double> = JsonMissing.of()
                        private var lastUnit: JsonField<Double> = JsonMissing.of()
                        private var unitAmount: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(tier: Tier) = apply {
                            this.firstUnit = tier.firstUnit
                            this.lastUnit = tier.lastUnit
                            this.unitAmount = tier.unitAmount
                            additionalProperties(tier.additionalProperties)
                        }

                        /** Inclusive tier starting value */
                        fun firstUnit(firstUnit: Double) = firstUnit(JsonField.of(firstUnit))

                        /** Inclusive tier starting value */
                        @JsonProperty("first_unit")
                        @ExcludeMissing
                        fun firstUnit(firstUnit: JsonField<Double>) = apply {
                            this.firstUnit = firstUnit
                        }

                        /**
                         * Exclusive tier ending value. If null, this is treated as the last tier
                         */
                        fun lastUnit(lastUnit: Double) = lastUnit(JsonField.of(lastUnit))

                        /**
                         * Exclusive tier ending value. If null, this is treated as the last tier
                         */
                        @JsonProperty("last_unit")
                        @ExcludeMissing
                        fun lastUnit(lastUnit: JsonField<Double>) = apply {
                            this.lastUnit = lastUnit
                        }

                        /** Amount per unit */
                        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                        /** Amount per unit */
                        @JsonProperty("unit_amount")
                        @ExcludeMissing
                        fun unitAmount(unitAmount: JsonField<String>) = apply {
                            this.unitAmount = unitAmount
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Tier =
                            Tier(
                                firstUnit,
                                lastUnit,
                                unitAmount,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val trialAmountDiscount: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double? =
                    percentageDiscount.getNullable("percentage_discount")

                /** Only available if discount_type is `trial` */
                fun trialAmountDiscount(): String? =
                    trialAmountDiscount.getNullable("trial_amount_discount")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(): List<String>? =
                    appliesToPriceIds.getNullable("applies_to_price_ids")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /** Only available if discount_type is `trial` */
                @JsonProperty("trial_amount_discount")
                @ExcludeMissing
                fun _trialAmountDiscount() = trialAmountDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        trialAmountDiscount()
                        usageDiscount()
                        amountDiscount()
                        appliesToPriceIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        this.discountType == other.discountType &&
                        this.percentageDiscount == other.percentageDiscount &&
                        this.trialAmountDiscount == other.trialAmountDiscount &&
                        this.usageDiscount == other.usageDiscount &&
                        this.amountDiscount == other.amountDiscount &&
                        this.appliesToPriceIds == other.appliesToPriceIds &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                percentageDiscount,
                                trialAmountDiscount,
                                usageDiscount,
                                amountDiscount,
                                appliesToPriceIds,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, trialAmountDiscount=$trialAmountDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.trialAmountDiscount = discount.trialAmountDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        this.appliesToPriceIds = discount.appliesToPriceIds
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** Only available if discount_type is `trial` */
                    fun trialAmountDiscount(trialAmountDiscount: String) =
                        trialAmountDiscount(JsonField.of(trialAmountDiscount))

                    /** Only available if discount_type is `trial` */
                    @JsonProperty("trial_amount_discount")
                    @ExcludeMissing
                    fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
                        this.trialAmountDiscount = trialAmountDiscount
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

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            trialAmountDiscount,
                            usageDiscount,
                            amountDiscount,
                            appliesToPriceIds.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
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

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        val TRIAL = DiscountType(JsonField.of("trial"))

                        val USAGE = DiscountType(JsonField.of("usage"))

                        val AMOUNT = DiscountType(JsonField.of("amount"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(builder = OverrideTieredBpsPrice.Builder::class)
        @NoAutoDetect
        class OverrideTieredBpsPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val tieredBpsConfig: JsonField<TieredBpsConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): String? = currency.getNullable("currency")

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /** The subscription's override discount for the plan. */
            fun discount(): Discount? = discount.getNullable("discount")

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            fun tieredBpsConfig(): TieredBpsConfig =
                tieredBpsConfig.getRequired("tiered_bps_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("tiered_bps_config")
            @ExcludeMissing
            fun _tieredBpsConfig() = tieredBpsConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideTieredBpsPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount()?.validate()
                    fixedPriceQuantity()
                    tieredBpsConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverrideTieredBpsPrice &&
                    this.id == other.id &&
                    this.modelType == other.modelType &&
                    this.minimumAmount == other.minimumAmount &&
                    this.maximumAmount == other.maximumAmount &&
                    this.currency == other.currency &&
                    this.conversionRate == other.conversionRate &&
                    this.discount == other.discount &&
                    this.fixedPriceQuantity == other.fixedPriceQuantity &&
                    this.tieredBpsConfig == other.tieredBpsConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            modelType,
                            minimumAmount,
                            maximumAmount,
                            currency,
                            conversionRate,
                            discount,
                            fixedPriceQuantity,
                            tieredBpsConfig,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "OverrideTieredBpsPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, tieredBpsConfig=$tieredBpsConfig, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var tieredBpsConfig: JsonField<TieredBpsConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(overrideTieredBpsPrice: OverrideTieredBpsPrice) = apply {
                    this.id = overrideTieredBpsPrice.id
                    this.modelType = overrideTieredBpsPrice.modelType
                    this.minimumAmount = overrideTieredBpsPrice.minimumAmount
                    this.maximumAmount = overrideTieredBpsPrice.maximumAmount
                    this.currency = overrideTieredBpsPrice.currency
                    this.conversionRate = overrideTieredBpsPrice.conversionRate
                    this.discount = overrideTieredBpsPrice.discount
                    this.fixedPriceQuantity = overrideTieredBpsPrice.fixedPriceQuantity
                    this.tieredBpsConfig = overrideTieredBpsPrice.tieredBpsConfig
                    additionalProperties(overrideTieredBpsPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun tieredBpsConfig(tieredBpsConfig: TieredBpsConfig) =
                    tieredBpsConfig(JsonField.of(tieredBpsConfig))

                @JsonProperty("tiered_bps_config")
                @ExcludeMissing
                fun tieredBpsConfig(tieredBpsConfig: JsonField<TieredBpsConfig>) = apply {
                    this.tieredBpsConfig = tieredBpsConfig
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

                fun build(): OverrideTieredBpsPrice =
                    OverrideTieredBpsPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        tieredBpsConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class ModelType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val TIERED_BPS = ModelType(JsonField.of("tiered_bps"))

                    fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    TIERED_BPS,
                }

                enum class Value {
                    TIERED_BPS,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TIERED_BPS -> Value.TIERED_BPS
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TIERED_BPS -> Known.TIERED_BPS
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = TieredBpsConfig.Builder::class)
            @NoAutoDetect
            class TieredBpsConfig
            private constructor(
                private val tiers: JsonField<List<Tier>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * Tiers for a Graduated BPS pricing model, where usage is bucketed into specified
                 * tiers
                 */
                fun tiers(): List<Tier> = tiers.getRequired("tiers")

                /**
                 * Tiers for a Graduated BPS pricing model, where usage is bucketed into specified
                 * tiers
                 */
                @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): TieredBpsConfig = apply {
                    if (!validated) {
                        tiers().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TieredBpsConfig &&
                        this.tiers == other.tiers &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(tiers, additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "TieredBpsConfig{tiers=$tiers, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tieredBpsConfig: TieredBpsConfig) = apply {
                        this.tiers = tieredBpsConfig.tiers
                        additionalProperties(tieredBpsConfig.additionalProperties)
                    }

                    /**
                     * Tiers for a Graduated BPS pricing model, where usage is bucketed into
                     * specified tiers
                     */
                    fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                    /**
                     * Tiers for a Graduated BPS pricing model, where usage is bucketed into
                     * specified tiers
                     */
                    @JsonProperty("tiers")
                    @ExcludeMissing
                    fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

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

                    fun build(): TieredBpsConfig =
                        TieredBpsConfig(
                            tiers.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable()
                        )
                }

                @JsonDeserialize(builder = Tier.Builder::class)
                @NoAutoDetect
                class Tier
                private constructor(
                    private val minimumAmount: JsonField<String>,
                    private val maximumAmount: JsonField<String>,
                    private val bps: JsonField<Double>,
                    private val perUnitMaximum: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Inclusive tier starting value */
                    fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

                    /** Exclusive tier ending value */
                    fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

                    /** Per-event basis point rate */
                    fun bps(): Double = bps.getRequired("bps")

                    /** Per unit maximum to charge */
                    fun perUnitMaximum(): String? = perUnitMaximum.getNullable("per_unit_maximum")

                    /** Inclusive tier starting value */
                    @JsonProperty("minimum_amount")
                    @ExcludeMissing
                    fun _minimumAmount() = minimumAmount

                    /** Exclusive tier ending value */
                    @JsonProperty("maximum_amount")
                    @ExcludeMissing
                    fun _maximumAmount() = maximumAmount

                    /** Per-event basis point rate */
                    @JsonProperty("bps") @ExcludeMissing fun _bps() = bps

                    /** Per unit maximum to charge */
                    @JsonProperty("per_unit_maximum")
                    @ExcludeMissing
                    fun _perUnitMaximum() = perUnitMaximum

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Tier = apply {
                        if (!validated) {
                            minimumAmount()
                            maximumAmount()
                            bps()
                            perUnitMaximum()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Tier &&
                            this.minimumAmount == other.minimumAmount &&
                            this.maximumAmount == other.maximumAmount &&
                            this.bps == other.bps &&
                            this.perUnitMaximum == other.perUnitMaximum &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    minimumAmount,
                                    maximumAmount,
                                    bps,
                                    perUnitMaximum,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Tier{minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var minimumAmount: JsonField<String> = JsonMissing.of()
                        private var maximumAmount: JsonField<String> = JsonMissing.of()
                        private var bps: JsonField<Double> = JsonMissing.of()
                        private var perUnitMaximum: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(tier: Tier) = apply {
                            this.minimumAmount = tier.minimumAmount
                            this.maximumAmount = tier.maximumAmount
                            this.bps = tier.bps
                            this.perUnitMaximum = tier.perUnitMaximum
                            additionalProperties(tier.additionalProperties)
                        }

                        /** Inclusive tier starting value */
                        fun minimumAmount(minimumAmount: String) =
                            minimumAmount(JsonField.of(minimumAmount))

                        /** Inclusive tier starting value */
                        @JsonProperty("minimum_amount")
                        @ExcludeMissing
                        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                            this.minimumAmount = minimumAmount
                        }

                        /** Exclusive tier ending value */
                        fun maximumAmount(maximumAmount: String) =
                            maximumAmount(JsonField.of(maximumAmount))

                        /** Exclusive tier ending value */
                        @JsonProperty("maximum_amount")
                        @ExcludeMissing
                        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                            this.maximumAmount = maximumAmount
                        }

                        /** Per-event basis point rate */
                        fun bps(bps: Double) = bps(JsonField.of(bps))

                        /** Per-event basis point rate */
                        @JsonProperty("bps")
                        @ExcludeMissing
                        fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

                        /** Per unit maximum to charge */
                        fun perUnitMaximum(perUnitMaximum: String) =
                            perUnitMaximum(JsonField.of(perUnitMaximum))

                        /** Per unit maximum to charge */
                        @JsonProperty("per_unit_maximum")
                        @ExcludeMissing
                        fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
                            this.perUnitMaximum = perUnitMaximum
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Tier =
                            Tier(
                                minimumAmount,
                                maximumAmount,
                                bps,
                                perUnitMaximum,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val trialAmountDiscount: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double? =
                    percentageDiscount.getNullable("percentage_discount")

                /** Only available if discount_type is `trial` */
                fun trialAmountDiscount(): String? =
                    trialAmountDiscount.getNullable("trial_amount_discount")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(): List<String>? =
                    appliesToPriceIds.getNullable("applies_to_price_ids")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /** Only available if discount_type is `trial` */
                @JsonProperty("trial_amount_discount")
                @ExcludeMissing
                fun _trialAmountDiscount() = trialAmountDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        trialAmountDiscount()
                        usageDiscount()
                        amountDiscount()
                        appliesToPriceIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        this.discountType == other.discountType &&
                        this.percentageDiscount == other.percentageDiscount &&
                        this.trialAmountDiscount == other.trialAmountDiscount &&
                        this.usageDiscount == other.usageDiscount &&
                        this.amountDiscount == other.amountDiscount &&
                        this.appliesToPriceIds == other.appliesToPriceIds &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                percentageDiscount,
                                trialAmountDiscount,
                                usageDiscount,
                                amountDiscount,
                                appliesToPriceIds,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, trialAmountDiscount=$trialAmountDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.trialAmountDiscount = discount.trialAmountDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        this.appliesToPriceIds = discount.appliesToPriceIds
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** Only available if discount_type is `trial` */
                    fun trialAmountDiscount(trialAmountDiscount: String) =
                        trialAmountDiscount(JsonField.of(trialAmountDiscount))

                    /** Only available if discount_type is `trial` */
                    @JsonProperty("trial_amount_discount")
                    @ExcludeMissing
                    fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
                        this.trialAmountDiscount = trialAmountDiscount
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

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            trialAmountDiscount,
                            usageDiscount,
                            amountDiscount,
                            appliesToPriceIds.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
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

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        val TRIAL = DiscountType(JsonField.of("trial"))

                        val USAGE = DiscountType(JsonField.of("usage"))

                        val AMOUNT = DiscountType(JsonField.of("amount"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(builder = OverrideBpsPrice.Builder::class)
        @NoAutoDetect
        class OverrideBpsPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val bpsConfig: JsonField<BpsConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): String? = currency.getNullable("currency")

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /** The subscription's override discount for the plan. */
            fun discount(): Discount? = discount.getNullable("discount")

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            fun bpsConfig(): BpsConfig = bpsConfig.getRequired("bps_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("bps_config") @ExcludeMissing fun _bpsConfig() = bpsConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideBpsPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount()?.validate()
                    fixedPriceQuantity()
                    bpsConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverrideBpsPrice &&
                    this.id == other.id &&
                    this.modelType == other.modelType &&
                    this.minimumAmount == other.minimumAmount &&
                    this.maximumAmount == other.maximumAmount &&
                    this.currency == other.currency &&
                    this.conversionRate == other.conversionRate &&
                    this.discount == other.discount &&
                    this.fixedPriceQuantity == other.fixedPriceQuantity &&
                    this.bpsConfig == other.bpsConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            modelType,
                            minimumAmount,
                            maximumAmount,
                            currency,
                            conversionRate,
                            discount,
                            fixedPriceQuantity,
                            bpsConfig,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "OverrideBpsPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, bpsConfig=$bpsConfig, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var bpsConfig: JsonField<BpsConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(overrideBpsPrice: OverrideBpsPrice) = apply {
                    this.id = overrideBpsPrice.id
                    this.modelType = overrideBpsPrice.modelType
                    this.minimumAmount = overrideBpsPrice.minimumAmount
                    this.maximumAmount = overrideBpsPrice.maximumAmount
                    this.currency = overrideBpsPrice.currency
                    this.conversionRate = overrideBpsPrice.conversionRate
                    this.discount = overrideBpsPrice.discount
                    this.fixedPriceQuantity = overrideBpsPrice.fixedPriceQuantity
                    this.bpsConfig = overrideBpsPrice.bpsConfig
                    additionalProperties(overrideBpsPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun bpsConfig(bpsConfig: BpsConfig) = bpsConfig(JsonField.of(bpsConfig))

                @JsonProperty("bps_config")
                @ExcludeMissing
                fun bpsConfig(bpsConfig: JsonField<BpsConfig>) = apply {
                    this.bpsConfig = bpsConfig
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

                fun build(): OverrideBpsPrice =
                    OverrideBpsPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        bpsConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = BpsConfig.Builder::class)
            @NoAutoDetect
            class BpsConfig
            private constructor(
                private val bps: JsonField<Double>,
                private val perUnitMaximum: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Basis point take rate per event */
                fun bps(): Double = bps.getRequired("bps")

                /** Optional currency amount maximum to cap spend per event */
                fun perUnitMaximum(): String? = perUnitMaximum.getNullable("per_unit_maximum")

                /** Basis point take rate per event */
                @JsonProperty("bps") @ExcludeMissing fun _bps() = bps

                /** Optional currency amount maximum to cap spend per event */
                @JsonProperty("per_unit_maximum")
                @ExcludeMissing
                fun _perUnitMaximum() = perUnitMaximum

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): BpsConfig = apply {
                    if (!validated) {
                        bps()
                        perUnitMaximum()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BpsConfig &&
                        this.bps == other.bps &&
                        this.perUnitMaximum == other.perUnitMaximum &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                bps,
                                perUnitMaximum,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "BpsConfig{bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var bps: JsonField<Double> = JsonMissing.of()
                    private var perUnitMaximum: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(bpsConfig: BpsConfig) = apply {
                        this.bps = bpsConfig.bps
                        this.perUnitMaximum = bpsConfig.perUnitMaximum
                        additionalProperties(bpsConfig.additionalProperties)
                    }

                    /** Basis point take rate per event */
                    fun bps(bps: Double) = bps(JsonField.of(bps))

                    /** Basis point take rate per event */
                    @JsonProperty("bps")
                    @ExcludeMissing
                    fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

                    /** Optional currency amount maximum to cap spend per event */
                    fun perUnitMaximum(perUnitMaximum: String) =
                        perUnitMaximum(JsonField.of(perUnitMaximum))

                    /** Optional currency amount maximum to cap spend per event */
                    @JsonProperty("per_unit_maximum")
                    @ExcludeMissing
                    fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
                        this.perUnitMaximum = perUnitMaximum
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

                    fun build(): BpsConfig =
                        BpsConfig(
                            bps,
                            perUnitMaximum,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            class ModelType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val BPS = ModelType(JsonField.of("bps"))

                    fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    BPS,
                }

                enum class Value {
                    BPS,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BPS -> Value.BPS
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BPS -> Known.BPS
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val trialAmountDiscount: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double? =
                    percentageDiscount.getNullable("percentage_discount")

                /** Only available if discount_type is `trial` */
                fun trialAmountDiscount(): String? =
                    trialAmountDiscount.getNullable("trial_amount_discount")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(): List<String>? =
                    appliesToPriceIds.getNullable("applies_to_price_ids")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /** Only available if discount_type is `trial` */
                @JsonProperty("trial_amount_discount")
                @ExcludeMissing
                fun _trialAmountDiscount() = trialAmountDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        trialAmountDiscount()
                        usageDiscount()
                        amountDiscount()
                        appliesToPriceIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        this.discountType == other.discountType &&
                        this.percentageDiscount == other.percentageDiscount &&
                        this.trialAmountDiscount == other.trialAmountDiscount &&
                        this.usageDiscount == other.usageDiscount &&
                        this.amountDiscount == other.amountDiscount &&
                        this.appliesToPriceIds == other.appliesToPriceIds &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                percentageDiscount,
                                trialAmountDiscount,
                                usageDiscount,
                                amountDiscount,
                                appliesToPriceIds,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, trialAmountDiscount=$trialAmountDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.trialAmountDiscount = discount.trialAmountDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        this.appliesToPriceIds = discount.appliesToPriceIds
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** Only available if discount_type is `trial` */
                    fun trialAmountDiscount(trialAmountDiscount: String) =
                        trialAmountDiscount(JsonField.of(trialAmountDiscount))

                    /** Only available if discount_type is `trial` */
                    @JsonProperty("trial_amount_discount")
                    @ExcludeMissing
                    fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
                        this.trialAmountDiscount = trialAmountDiscount
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

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            trialAmountDiscount,
                            usageDiscount,
                            amountDiscount,
                            appliesToPriceIds.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
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

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        val TRIAL = DiscountType(JsonField.of("trial"))

                        val USAGE = DiscountType(JsonField.of("usage"))

                        val AMOUNT = DiscountType(JsonField.of("amount"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(builder = OverrideBulkBpsPrice.Builder::class)
        @NoAutoDetect
        class OverrideBulkBpsPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val bulkBpsConfig: JsonField<BulkBpsConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): String? = currency.getNullable("currency")

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /** The subscription's override discount for the plan. */
            fun discount(): Discount? = discount.getNullable("discount")

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            fun bulkBpsConfig(): BulkBpsConfig = bulkBpsConfig.getRequired("bulk_bps_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("bulk_bps_config") @ExcludeMissing fun _bulkBpsConfig() = bulkBpsConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideBulkBpsPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount()?.validate()
                    fixedPriceQuantity()
                    bulkBpsConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverrideBulkBpsPrice &&
                    this.id == other.id &&
                    this.modelType == other.modelType &&
                    this.minimumAmount == other.minimumAmount &&
                    this.maximumAmount == other.maximumAmount &&
                    this.currency == other.currency &&
                    this.conversionRate == other.conversionRate &&
                    this.discount == other.discount &&
                    this.fixedPriceQuantity == other.fixedPriceQuantity &&
                    this.bulkBpsConfig == other.bulkBpsConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            modelType,
                            minimumAmount,
                            maximumAmount,
                            currency,
                            conversionRate,
                            discount,
                            fixedPriceQuantity,
                            bulkBpsConfig,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "OverrideBulkBpsPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, bulkBpsConfig=$bulkBpsConfig, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var bulkBpsConfig: JsonField<BulkBpsConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(overrideBulkBpsPrice: OverrideBulkBpsPrice) = apply {
                    this.id = overrideBulkBpsPrice.id
                    this.modelType = overrideBulkBpsPrice.modelType
                    this.minimumAmount = overrideBulkBpsPrice.minimumAmount
                    this.maximumAmount = overrideBulkBpsPrice.maximumAmount
                    this.currency = overrideBulkBpsPrice.currency
                    this.conversionRate = overrideBulkBpsPrice.conversionRate
                    this.discount = overrideBulkBpsPrice.discount
                    this.fixedPriceQuantity = overrideBulkBpsPrice.fixedPriceQuantity
                    this.bulkBpsConfig = overrideBulkBpsPrice.bulkBpsConfig
                    additionalProperties(overrideBulkBpsPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun bulkBpsConfig(bulkBpsConfig: BulkBpsConfig) =
                    bulkBpsConfig(JsonField.of(bulkBpsConfig))

                @JsonProperty("bulk_bps_config")
                @ExcludeMissing
                fun bulkBpsConfig(bulkBpsConfig: JsonField<BulkBpsConfig>) = apply {
                    this.bulkBpsConfig = bulkBpsConfig
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

                fun build(): OverrideBulkBpsPrice =
                    OverrideBulkBpsPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        bulkBpsConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = BulkBpsConfig.Builder::class)
            @NoAutoDetect
            class BulkBpsConfig
            private constructor(
                private val tiers: JsonField<List<Tier>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier
                 * based on total volume
                 */
                fun tiers(): List<Tier> = tiers.getRequired("tiers")

                /**
                 * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier
                 * based on total volume
                 */
                @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): BulkBpsConfig = apply {
                    if (!validated) {
                        tiers().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BulkBpsConfig &&
                        this.tiers == other.tiers &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(tiers, additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "BulkBpsConfig{tiers=$tiers, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(bulkBpsConfig: BulkBpsConfig) = apply {
                        this.tiers = bulkBpsConfig.tiers
                        additionalProperties(bulkBpsConfig.additionalProperties)
                    }

                    /**
                     * Tiers for a bulk BPS pricing model where all usage is aggregated to a single
                     * tier based on total volume
                     */
                    fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                    /**
                     * Tiers for a bulk BPS pricing model where all usage is aggregated to a single
                     * tier based on total volume
                     */
                    @JsonProperty("tiers")
                    @ExcludeMissing
                    fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

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

                    fun build(): BulkBpsConfig =
                        BulkBpsConfig(
                            tiers.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable()
                        )
                }

                @JsonDeserialize(builder = Tier.Builder::class)
                @NoAutoDetect
                class Tier
                private constructor(
                    private val maximumAmount: JsonField<String>,
                    private val bps: JsonField<Double>,
                    private val perUnitMaximum: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Upper bound for tier */
                    fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

                    /** Basis points to rate on */
                    fun bps(): Double = bps.getRequired("bps")

                    /** The maximum amount to charge for any one event */
                    fun perUnitMaximum(): String? = perUnitMaximum.getNullable("per_unit_maximum")

                    /** Upper bound for tier */
                    @JsonProperty("maximum_amount")
                    @ExcludeMissing
                    fun _maximumAmount() = maximumAmount

                    /** Basis points to rate on */
                    @JsonProperty("bps") @ExcludeMissing fun _bps() = bps

                    /** The maximum amount to charge for any one event */
                    @JsonProperty("per_unit_maximum")
                    @ExcludeMissing
                    fun _perUnitMaximum() = perUnitMaximum

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Tier = apply {
                        if (!validated) {
                            maximumAmount()
                            bps()
                            perUnitMaximum()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Tier &&
                            this.maximumAmount == other.maximumAmount &&
                            this.bps == other.bps &&
                            this.perUnitMaximum == other.perUnitMaximum &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    maximumAmount,
                                    bps,
                                    perUnitMaximum,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Tier{maximumAmount=$maximumAmount, bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var maximumAmount: JsonField<String> = JsonMissing.of()
                        private var bps: JsonField<Double> = JsonMissing.of()
                        private var perUnitMaximum: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(tier: Tier) = apply {
                            this.maximumAmount = tier.maximumAmount
                            this.bps = tier.bps
                            this.perUnitMaximum = tier.perUnitMaximum
                            additionalProperties(tier.additionalProperties)
                        }

                        /** Upper bound for tier */
                        fun maximumAmount(maximumAmount: String) =
                            maximumAmount(JsonField.of(maximumAmount))

                        /** Upper bound for tier */
                        @JsonProperty("maximum_amount")
                        @ExcludeMissing
                        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                            this.maximumAmount = maximumAmount
                        }

                        /** Basis points to rate on */
                        fun bps(bps: Double) = bps(JsonField.of(bps))

                        /** Basis points to rate on */
                        @JsonProperty("bps")
                        @ExcludeMissing
                        fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

                        /** The maximum amount to charge for any one event */
                        fun perUnitMaximum(perUnitMaximum: String) =
                            perUnitMaximum(JsonField.of(perUnitMaximum))

                        /** The maximum amount to charge for any one event */
                        @JsonProperty("per_unit_maximum")
                        @ExcludeMissing
                        fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
                            this.perUnitMaximum = perUnitMaximum
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Tier =
                            Tier(
                                maximumAmount,
                                bps,
                                perUnitMaximum,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }
            }

            class ModelType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val BULK_BPS = ModelType(JsonField.of("bulk_bps"))

                    fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    BULK_BPS,
                }

                enum class Value {
                    BULK_BPS,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BULK_BPS -> Value.BULK_BPS
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BULK_BPS -> Known.BULK_BPS
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val trialAmountDiscount: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double? =
                    percentageDiscount.getNullable("percentage_discount")

                /** Only available if discount_type is `trial` */
                fun trialAmountDiscount(): String? =
                    trialAmountDiscount.getNullable("trial_amount_discount")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(): List<String>? =
                    appliesToPriceIds.getNullable("applies_to_price_ids")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /** Only available if discount_type is `trial` */
                @JsonProperty("trial_amount_discount")
                @ExcludeMissing
                fun _trialAmountDiscount() = trialAmountDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        trialAmountDiscount()
                        usageDiscount()
                        amountDiscount()
                        appliesToPriceIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        this.discountType == other.discountType &&
                        this.percentageDiscount == other.percentageDiscount &&
                        this.trialAmountDiscount == other.trialAmountDiscount &&
                        this.usageDiscount == other.usageDiscount &&
                        this.amountDiscount == other.amountDiscount &&
                        this.appliesToPriceIds == other.appliesToPriceIds &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                percentageDiscount,
                                trialAmountDiscount,
                                usageDiscount,
                                amountDiscount,
                                appliesToPriceIds,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, trialAmountDiscount=$trialAmountDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.trialAmountDiscount = discount.trialAmountDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        this.appliesToPriceIds = discount.appliesToPriceIds
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** Only available if discount_type is `trial` */
                    fun trialAmountDiscount(trialAmountDiscount: String) =
                        trialAmountDiscount(JsonField.of(trialAmountDiscount))

                    /** Only available if discount_type is `trial` */
                    @JsonProperty("trial_amount_discount")
                    @ExcludeMissing
                    fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
                        this.trialAmountDiscount = trialAmountDiscount
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

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            trialAmountDiscount,
                            usageDiscount,
                            amountDiscount,
                            appliesToPriceIds.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
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

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        val TRIAL = DiscountType(JsonField.of("trial"))

                        val USAGE = DiscountType(JsonField.of("usage"))

                        val AMOUNT = DiscountType(JsonField.of("amount"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(builder = OverrideBulkPrice.Builder::class)
        @NoAutoDetect
        class OverrideBulkPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val bulkConfig: JsonField<BulkConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): String? = currency.getNullable("currency")

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /** The subscription's override discount for the plan. */
            fun discount(): Discount? = discount.getNullable("discount")

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            fun bulkConfig(): BulkConfig = bulkConfig.getRequired("bulk_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("bulk_config") @ExcludeMissing fun _bulkConfig() = bulkConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideBulkPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount()?.validate()
                    fixedPriceQuantity()
                    bulkConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverrideBulkPrice &&
                    this.id == other.id &&
                    this.modelType == other.modelType &&
                    this.minimumAmount == other.minimumAmount &&
                    this.maximumAmount == other.maximumAmount &&
                    this.currency == other.currency &&
                    this.conversionRate == other.conversionRate &&
                    this.discount == other.discount &&
                    this.fixedPriceQuantity == other.fixedPriceQuantity &&
                    this.bulkConfig == other.bulkConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            modelType,
                            minimumAmount,
                            maximumAmount,
                            currency,
                            conversionRate,
                            discount,
                            fixedPriceQuantity,
                            bulkConfig,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "OverrideBulkPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, bulkConfig=$bulkConfig, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var bulkConfig: JsonField<BulkConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(overrideBulkPrice: OverrideBulkPrice) = apply {
                    this.id = overrideBulkPrice.id
                    this.modelType = overrideBulkPrice.modelType
                    this.minimumAmount = overrideBulkPrice.minimumAmount
                    this.maximumAmount = overrideBulkPrice.maximumAmount
                    this.currency = overrideBulkPrice.currency
                    this.conversionRate = overrideBulkPrice.conversionRate
                    this.discount = overrideBulkPrice.discount
                    this.fixedPriceQuantity = overrideBulkPrice.fixedPriceQuantity
                    this.bulkConfig = overrideBulkPrice.bulkConfig
                    additionalProperties(overrideBulkPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun bulkConfig(bulkConfig: BulkConfig) = bulkConfig(JsonField.of(bulkConfig))

                @JsonProperty("bulk_config")
                @ExcludeMissing
                fun bulkConfig(bulkConfig: JsonField<BulkConfig>) = apply {
                    this.bulkConfig = bulkConfig
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

                fun build(): OverrideBulkPrice =
                    OverrideBulkPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        bulkConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = BulkConfig.Builder::class)
            @NoAutoDetect
            class BulkConfig
            private constructor(
                private val tiers: JsonField<List<Tier>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Bulk tiers for rating based on total usage volume */
                fun tiers(): List<Tier> = tiers.getRequired("tiers")

                /** Bulk tiers for rating based on total usage volume */
                @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): BulkConfig = apply {
                    if (!validated) {
                        tiers().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BulkConfig &&
                        this.tiers == other.tiers &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(tiers, additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "BulkConfig{tiers=$tiers, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(bulkConfig: BulkConfig) = apply {
                        this.tiers = bulkConfig.tiers
                        additionalProperties(bulkConfig.additionalProperties)
                    }

                    /** Bulk tiers for rating based on total usage volume */
                    fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                    /** Bulk tiers for rating based on total usage volume */
                    @JsonProperty("tiers")
                    @ExcludeMissing
                    fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

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

                    fun build(): BulkConfig =
                        BulkConfig(
                            tiers.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable()
                        )
                }

                @JsonDeserialize(builder = Tier.Builder::class)
                @NoAutoDetect
                class Tier
                private constructor(
                    private val maximumUnits: JsonField<Double>,
                    private val unitAmount: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Upper bound for this tier */
                    fun maximumUnits(): Double? = maximumUnits.getNullable("maximum_units")

                    /** Amount per unit */
                    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                    /** Upper bound for this tier */
                    @JsonProperty("maximum_units")
                    @ExcludeMissing
                    fun _maximumUnits() = maximumUnits

                    /** Amount per unit */
                    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Tier = apply {
                        if (!validated) {
                            maximumUnits()
                            unitAmount()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Tier &&
                            this.maximumUnits == other.maximumUnits &&
                            this.unitAmount == other.unitAmount &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    maximumUnits,
                                    unitAmount,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Tier{maximumUnits=$maximumUnits, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var maximumUnits: JsonField<Double> = JsonMissing.of()
                        private var unitAmount: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(tier: Tier) = apply {
                            this.maximumUnits = tier.maximumUnits
                            this.unitAmount = tier.unitAmount
                            additionalProperties(tier.additionalProperties)
                        }

                        /** Upper bound for this tier */
                        fun maximumUnits(maximumUnits: Double) =
                            maximumUnits(JsonField.of(maximumUnits))

                        /** Upper bound for this tier */
                        @JsonProperty("maximum_units")
                        @ExcludeMissing
                        fun maximumUnits(maximumUnits: JsonField<Double>) = apply {
                            this.maximumUnits = maximumUnits
                        }

                        /** Amount per unit */
                        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                        /** Amount per unit */
                        @JsonProperty("unit_amount")
                        @ExcludeMissing
                        fun unitAmount(unitAmount: JsonField<String>) = apply {
                            this.unitAmount = unitAmount
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Tier =
                            Tier(
                                maximumUnits,
                                unitAmount,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }
            }

            class ModelType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val BULK = ModelType(JsonField.of("bulk"))

                    fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    BULK,
                }

                enum class Value {
                    BULK,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BULK -> Value.BULK
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BULK -> Known.BULK
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val trialAmountDiscount: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double? =
                    percentageDiscount.getNullable("percentage_discount")

                /** Only available if discount_type is `trial` */
                fun trialAmountDiscount(): String? =
                    trialAmountDiscount.getNullable("trial_amount_discount")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(): List<String>? =
                    appliesToPriceIds.getNullable("applies_to_price_ids")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /** Only available if discount_type is `trial` */
                @JsonProperty("trial_amount_discount")
                @ExcludeMissing
                fun _trialAmountDiscount() = trialAmountDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        trialAmountDiscount()
                        usageDiscount()
                        amountDiscount()
                        appliesToPriceIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        this.discountType == other.discountType &&
                        this.percentageDiscount == other.percentageDiscount &&
                        this.trialAmountDiscount == other.trialAmountDiscount &&
                        this.usageDiscount == other.usageDiscount &&
                        this.amountDiscount == other.amountDiscount &&
                        this.appliesToPriceIds == other.appliesToPriceIds &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                percentageDiscount,
                                trialAmountDiscount,
                                usageDiscount,
                                amountDiscount,
                                appliesToPriceIds,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, trialAmountDiscount=$trialAmountDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.trialAmountDiscount = discount.trialAmountDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        this.appliesToPriceIds = discount.appliesToPriceIds
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** Only available if discount_type is `trial` */
                    fun trialAmountDiscount(trialAmountDiscount: String) =
                        trialAmountDiscount(JsonField.of(trialAmountDiscount))

                    /** Only available if discount_type is `trial` */
                    @JsonProperty("trial_amount_discount")
                    @ExcludeMissing
                    fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
                        this.trialAmountDiscount = trialAmountDiscount
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

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            trialAmountDiscount,
                            usageDiscount,
                            amountDiscount,
                            appliesToPriceIds.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
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

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        val TRIAL = DiscountType(JsonField.of("trial"))

                        val USAGE = DiscountType(JsonField.of("usage"))

                        val AMOUNT = DiscountType(JsonField.of("amount"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(builder = OverrideThresholdTotalAmountPrice.Builder::class)
        @NoAutoDetect
        class OverrideThresholdTotalAmountPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val thresholdTotalAmountConfig: JsonField<ThresholdTotalAmountConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): String? = currency.getNullable("currency")

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /** The subscription's override discount for the plan. */
            fun discount(): Discount? = discount.getNullable("discount")

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            fun thresholdTotalAmountConfig(): ThresholdTotalAmountConfig =
                thresholdTotalAmountConfig.getRequired("threshold_total_amount_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("threshold_total_amount_config")
            @ExcludeMissing
            fun _thresholdTotalAmountConfig() = thresholdTotalAmountConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideThresholdTotalAmountPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount()?.validate()
                    fixedPriceQuantity()
                    thresholdTotalAmountConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverrideThresholdTotalAmountPrice &&
                    this.id == other.id &&
                    this.modelType == other.modelType &&
                    this.minimumAmount == other.minimumAmount &&
                    this.maximumAmount == other.maximumAmount &&
                    this.currency == other.currency &&
                    this.conversionRate == other.conversionRate &&
                    this.discount == other.discount &&
                    this.fixedPriceQuantity == other.fixedPriceQuantity &&
                    this.thresholdTotalAmountConfig == other.thresholdTotalAmountConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            modelType,
                            minimumAmount,
                            maximumAmount,
                            currency,
                            conversionRate,
                            discount,
                            fixedPriceQuantity,
                            thresholdTotalAmountConfig,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "OverrideThresholdTotalAmountPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, thresholdTotalAmountConfig=$thresholdTotalAmountConfig, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var thresholdTotalAmountConfig: JsonField<ThresholdTotalAmountConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    overrideThresholdTotalAmountPrice: OverrideThresholdTotalAmountPrice
                ) = apply {
                    this.id = overrideThresholdTotalAmountPrice.id
                    this.modelType = overrideThresholdTotalAmountPrice.modelType
                    this.minimumAmount = overrideThresholdTotalAmountPrice.minimumAmount
                    this.maximumAmount = overrideThresholdTotalAmountPrice.maximumAmount
                    this.currency = overrideThresholdTotalAmountPrice.currency
                    this.conversionRate = overrideThresholdTotalAmountPrice.conversionRate
                    this.discount = overrideThresholdTotalAmountPrice.discount
                    this.fixedPriceQuantity = overrideThresholdTotalAmountPrice.fixedPriceQuantity
                    this.thresholdTotalAmountConfig =
                        overrideThresholdTotalAmountPrice.thresholdTotalAmountConfig
                    additionalProperties(overrideThresholdTotalAmountPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun thresholdTotalAmountConfig(
                    thresholdTotalAmountConfig: ThresholdTotalAmountConfig
                ) = thresholdTotalAmountConfig(JsonField.of(thresholdTotalAmountConfig))

                @JsonProperty("threshold_total_amount_config")
                @ExcludeMissing
                fun thresholdTotalAmountConfig(
                    thresholdTotalAmountConfig: JsonField<ThresholdTotalAmountConfig>
                ) = apply { this.thresholdTotalAmountConfig = thresholdTotalAmountConfig }

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

                fun build(): OverrideThresholdTotalAmountPrice =
                    OverrideThresholdTotalAmountPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        thresholdTotalAmountConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class ModelType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val THRESHOLD_TOTAL_AMOUNT = ModelType(JsonField.of("threshold_total_amount"))

                    fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    THRESHOLD_TOTAL_AMOUNT,
                }

                enum class Value {
                    THRESHOLD_TOTAL_AMOUNT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        THRESHOLD_TOTAL_AMOUNT -> Value.THRESHOLD_TOTAL_AMOUNT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        THRESHOLD_TOTAL_AMOUNT -> Known.THRESHOLD_TOTAL_AMOUNT
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = ThresholdTotalAmountConfig.Builder::class)
            @NoAutoDetect
            class ThresholdTotalAmountConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ThresholdTotalAmountConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ThresholdTotalAmountConfig &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "ThresholdTotalAmountConfig{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(thresholdTotalAmountConfig: ThresholdTotalAmountConfig) =
                        apply {
                            additionalProperties(thresholdTotalAmountConfig.additionalProperties)
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

                    fun build(): ThresholdTotalAmountConfig =
                        ThresholdTotalAmountConfig(additionalProperties.toUnmodifiable())
                }
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val trialAmountDiscount: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double? =
                    percentageDiscount.getNullable("percentage_discount")

                /** Only available if discount_type is `trial` */
                fun trialAmountDiscount(): String? =
                    trialAmountDiscount.getNullable("trial_amount_discount")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(): List<String>? =
                    appliesToPriceIds.getNullable("applies_to_price_ids")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /** Only available if discount_type is `trial` */
                @JsonProperty("trial_amount_discount")
                @ExcludeMissing
                fun _trialAmountDiscount() = trialAmountDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        trialAmountDiscount()
                        usageDiscount()
                        amountDiscount()
                        appliesToPriceIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        this.discountType == other.discountType &&
                        this.percentageDiscount == other.percentageDiscount &&
                        this.trialAmountDiscount == other.trialAmountDiscount &&
                        this.usageDiscount == other.usageDiscount &&
                        this.amountDiscount == other.amountDiscount &&
                        this.appliesToPriceIds == other.appliesToPriceIds &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                percentageDiscount,
                                trialAmountDiscount,
                                usageDiscount,
                                amountDiscount,
                                appliesToPriceIds,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, trialAmountDiscount=$trialAmountDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.trialAmountDiscount = discount.trialAmountDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        this.appliesToPriceIds = discount.appliesToPriceIds
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** Only available if discount_type is `trial` */
                    fun trialAmountDiscount(trialAmountDiscount: String) =
                        trialAmountDiscount(JsonField.of(trialAmountDiscount))

                    /** Only available if discount_type is `trial` */
                    @JsonProperty("trial_amount_discount")
                    @ExcludeMissing
                    fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
                        this.trialAmountDiscount = trialAmountDiscount
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

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            trialAmountDiscount,
                            usageDiscount,
                            amountDiscount,
                            appliesToPriceIds.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
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

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        val TRIAL = DiscountType(JsonField.of("trial"))

                        val USAGE = DiscountType(JsonField.of("usage"))

                        val AMOUNT = DiscountType(JsonField.of("amount"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(builder = OverrideTieredPackagePrice.Builder::class)
        @NoAutoDetect
        class OverrideTieredPackagePrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val tieredPackageConfig: JsonField<TieredPackageConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): String? = currency.getNullable("currency")

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /** The subscription's override discount for the plan. */
            fun discount(): Discount? = discount.getNullable("discount")

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            fun tieredPackageConfig(): TieredPackageConfig =
                tieredPackageConfig.getRequired("tiered_package_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("tiered_package_config")
            @ExcludeMissing
            fun _tieredPackageConfig() = tieredPackageConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideTieredPackagePrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount()?.validate()
                    fixedPriceQuantity()
                    tieredPackageConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverrideTieredPackagePrice &&
                    this.id == other.id &&
                    this.modelType == other.modelType &&
                    this.minimumAmount == other.minimumAmount &&
                    this.maximumAmount == other.maximumAmount &&
                    this.currency == other.currency &&
                    this.conversionRate == other.conversionRate &&
                    this.discount == other.discount &&
                    this.fixedPriceQuantity == other.fixedPriceQuantity &&
                    this.tieredPackageConfig == other.tieredPackageConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            modelType,
                            minimumAmount,
                            maximumAmount,
                            currency,
                            conversionRate,
                            discount,
                            fixedPriceQuantity,
                            tieredPackageConfig,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "OverrideTieredPackagePrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, tieredPackageConfig=$tieredPackageConfig, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var tieredPackageConfig: JsonField<TieredPackageConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(overrideTieredPackagePrice: OverrideTieredPackagePrice) = apply {
                    this.id = overrideTieredPackagePrice.id
                    this.modelType = overrideTieredPackagePrice.modelType
                    this.minimumAmount = overrideTieredPackagePrice.minimumAmount
                    this.maximumAmount = overrideTieredPackagePrice.maximumAmount
                    this.currency = overrideTieredPackagePrice.currency
                    this.conversionRate = overrideTieredPackagePrice.conversionRate
                    this.discount = overrideTieredPackagePrice.discount
                    this.fixedPriceQuantity = overrideTieredPackagePrice.fixedPriceQuantity
                    this.tieredPackageConfig = overrideTieredPackagePrice.tieredPackageConfig
                    additionalProperties(overrideTieredPackagePrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun tieredPackageConfig(tieredPackageConfig: TieredPackageConfig) =
                    tieredPackageConfig(JsonField.of(tieredPackageConfig))

                @JsonProperty("tiered_package_config")
                @ExcludeMissing
                fun tieredPackageConfig(tieredPackageConfig: JsonField<TieredPackageConfig>) =
                    apply {
                        this.tieredPackageConfig = tieredPackageConfig
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

                fun build(): OverrideTieredPackagePrice =
                    OverrideTieredPackagePrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        tieredPackageConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class ModelType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val TIERED_PACKAGE = ModelType(JsonField.of("tiered_package"))

                    fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    TIERED_PACKAGE,
                }

                enum class Value {
                    TIERED_PACKAGE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TIERED_PACKAGE -> Value.TIERED_PACKAGE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TIERED_PACKAGE -> Known.TIERED_PACKAGE
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = TieredPackageConfig.Builder::class)
            @NoAutoDetect
            class TieredPackageConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): TieredPackageConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TieredPackageConfig &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "TieredPackageConfig{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tieredPackageConfig: TieredPackageConfig) = apply {
                        additionalProperties(tieredPackageConfig.additionalProperties)
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

                    fun build(): TieredPackageConfig =
                        TieredPackageConfig(additionalProperties.toUnmodifiable())
                }
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val trialAmountDiscount: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double? =
                    percentageDiscount.getNullable("percentage_discount")

                /** Only available if discount_type is `trial` */
                fun trialAmountDiscount(): String? =
                    trialAmountDiscount.getNullable("trial_amount_discount")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(): List<String>? =
                    appliesToPriceIds.getNullable("applies_to_price_ids")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /** Only available if discount_type is `trial` */
                @JsonProperty("trial_amount_discount")
                @ExcludeMissing
                fun _trialAmountDiscount() = trialAmountDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        trialAmountDiscount()
                        usageDiscount()
                        amountDiscount()
                        appliesToPriceIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        this.discountType == other.discountType &&
                        this.percentageDiscount == other.percentageDiscount &&
                        this.trialAmountDiscount == other.trialAmountDiscount &&
                        this.usageDiscount == other.usageDiscount &&
                        this.amountDiscount == other.amountDiscount &&
                        this.appliesToPriceIds == other.appliesToPriceIds &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                percentageDiscount,
                                trialAmountDiscount,
                                usageDiscount,
                                amountDiscount,
                                appliesToPriceIds,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, trialAmountDiscount=$trialAmountDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.trialAmountDiscount = discount.trialAmountDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        this.appliesToPriceIds = discount.appliesToPriceIds
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** Only available if discount_type is `trial` */
                    fun trialAmountDiscount(trialAmountDiscount: String) =
                        trialAmountDiscount(JsonField.of(trialAmountDiscount))

                    /** Only available if discount_type is `trial` */
                    @JsonProperty("trial_amount_discount")
                    @ExcludeMissing
                    fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
                        this.trialAmountDiscount = trialAmountDiscount
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

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            trialAmountDiscount,
                            usageDiscount,
                            amountDiscount,
                            appliesToPriceIds.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
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

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        val TRIAL = DiscountType(JsonField.of("trial"))

                        val USAGE = DiscountType(JsonField.of("usage"))

                        val AMOUNT = DiscountType(JsonField.of("amount"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(builder = OverrideTieredWithMinimumPrice.Builder::class)
        @NoAutoDetect
        class OverrideTieredWithMinimumPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val tieredWithMinimumConfig: JsonField<TieredWithMinimumConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): String? = currency.getNullable("currency")

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /** The subscription's override discount for the plan. */
            fun discount(): Discount? = discount.getNullable("discount")

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            fun tieredWithMinimumConfig(): TieredWithMinimumConfig =
                tieredWithMinimumConfig.getRequired("tiered_with_minimum_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("tiered_with_minimum_config")
            @ExcludeMissing
            fun _tieredWithMinimumConfig() = tieredWithMinimumConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideTieredWithMinimumPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount()?.validate()
                    fixedPriceQuantity()
                    tieredWithMinimumConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverrideTieredWithMinimumPrice &&
                    this.id == other.id &&
                    this.modelType == other.modelType &&
                    this.minimumAmount == other.minimumAmount &&
                    this.maximumAmount == other.maximumAmount &&
                    this.currency == other.currency &&
                    this.conversionRate == other.conversionRate &&
                    this.discount == other.discount &&
                    this.fixedPriceQuantity == other.fixedPriceQuantity &&
                    this.tieredWithMinimumConfig == other.tieredWithMinimumConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            modelType,
                            minimumAmount,
                            maximumAmount,
                            currency,
                            conversionRate,
                            discount,
                            fixedPriceQuantity,
                            tieredWithMinimumConfig,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "OverrideTieredWithMinimumPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, tieredWithMinimumConfig=$tieredWithMinimumConfig, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var tieredWithMinimumConfig: JsonField<TieredWithMinimumConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(overrideTieredWithMinimumPrice: OverrideTieredWithMinimumPrice) =
                    apply {
                        this.id = overrideTieredWithMinimumPrice.id
                        this.modelType = overrideTieredWithMinimumPrice.modelType
                        this.minimumAmount = overrideTieredWithMinimumPrice.minimumAmount
                        this.maximumAmount = overrideTieredWithMinimumPrice.maximumAmount
                        this.currency = overrideTieredWithMinimumPrice.currency
                        this.conversionRate = overrideTieredWithMinimumPrice.conversionRate
                        this.discount = overrideTieredWithMinimumPrice.discount
                        this.fixedPriceQuantity = overrideTieredWithMinimumPrice.fixedPriceQuantity
                        this.tieredWithMinimumConfig =
                            overrideTieredWithMinimumPrice.tieredWithMinimumConfig
                        additionalProperties(overrideTieredWithMinimumPrice.additionalProperties)
                    }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun tieredWithMinimumConfig(tieredWithMinimumConfig: TieredWithMinimumConfig) =
                    tieredWithMinimumConfig(JsonField.of(tieredWithMinimumConfig))

                @JsonProperty("tiered_with_minimum_config")
                @ExcludeMissing
                fun tieredWithMinimumConfig(
                    tieredWithMinimumConfig: JsonField<TieredWithMinimumConfig>
                ) = apply { this.tieredWithMinimumConfig = tieredWithMinimumConfig }

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

                fun build(): OverrideTieredWithMinimumPrice =
                    OverrideTieredWithMinimumPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        tieredWithMinimumConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class ModelType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val TIERED_WITH_MINIMUM = ModelType(JsonField.of("tiered_with_minimum"))

                    fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    TIERED_WITH_MINIMUM,
                }

                enum class Value {
                    TIERED_WITH_MINIMUM,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TIERED_WITH_MINIMUM -> Value.TIERED_WITH_MINIMUM
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TIERED_WITH_MINIMUM -> Known.TIERED_WITH_MINIMUM
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = TieredWithMinimumConfig.Builder::class)
            @NoAutoDetect
            class TieredWithMinimumConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): TieredWithMinimumConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TieredWithMinimumConfig &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "TieredWithMinimumConfig{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tieredWithMinimumConfig: TieredWithMinimumConfig) = apply {
                        additionalProperties(tieredWithMinimumConfig.additionalProperties)
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

                    fun build(): TieredWithMinimumConfig =
                        TieredWithMinimumConfig(additionalProperties.toUnmodifiable())
                }
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val trialAmountDiscount: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double? =
                    percentageDiscount.getNullable("percentage_discount")

                /** Only available if discount_type is `trial` */
                fun trialAmountDiscount(): String? =
                    trialAmountDiscount.getNullable("trial_amount_discount")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(): List<String>? =
                    appliesToPriceIds.getNullable("applies_to_price_ids")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /** Only available if discount_type is `trial` */
                @JsonProperty("trial_amount_discount")
                @ExcludeMissing
                fun _trialAmountDiscount() = trialAmountDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        trialAmountDiscount()
                        usageDiscount()
                        amountDiscount()
                        appliesToPriceIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        this.discountType == other.discountType &&
                        this.percentageDiscount == other.percentageDiscount &&
                        this.trialAmountDiscount == other.trialAmountDiscount &&
                        this.usageDiscount == other.usageDiscount &&
                        this.amountDiscount == other.amountDiscount &&
                        this.appliesToPriceIds == other.appliesToPriceIds &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                percentageDiscount,
                                trialAmountDiscount,
                                usageDiscount,
                                amountDiscount,
                                appliesToPriceIds,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, trialAmountDiscount=$trialAmountDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.trialAmountDiscount = discount.trialAmountDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        this.appliesToPriceIds = discount.appliesToPriceIds
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** Only available if discount_type is `trial` */
                    fun trialAmountDiscount(trialAmountDiscount: String) =
                        trialAmountDiscount(JsonField.of(trialAmountDiscount))

                    /** Only available if discount_type is `trial` */
                    @JsonProperty("trial_amount_discount")
                    @ExcludeMissing
                    fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
                        this.trialAmountDiscount = trialAmountDiscount
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

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            trialAmountDiscount,
                            usageDiscount,
                            amountDiscount,
                            appliesToPriceIds.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
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

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        val TRIAL = DiscountType(JsonField.of("trial"))

                        val USAGE = DiscountType(JsonField.of("usage"))

                        val AMOUNT = DiscountType(JsonField.of("amount"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(builder = OverridePackageWithAllocationPrice.Builder::class)
        @NoAutoDetect
        class OverridePackageWithAllocationPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val packageWithAllocationConfig: JsonField<PackageWithAllocationConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): String? = currency.getNullable("currency")

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /** The subscription's override discount for the plan. */
            fun discount(): Discount? = discount.getNullable("discount")

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            fun packageWithAllocationConfig(): PackageWithAllocationConfig =
                packageWithAllocationConfig.getRequired("package_with_allocation_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("package_with_allocation_config")
            @ExcludeMissing
            fun _packageWithAllocationConfig() = packageWithAllocationConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverridePackageWithAllocationPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount()?.validate()
                    fixedPriceQuantity()
                    packageWithAllocationConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverridePackageWithAllocationPrice &&
                    this.id == other.id &&
                    this.modelType == other.modelType &&
                    this.minimumAmount == other.minimumAmount &&
                    this.maximumAmount == other.maximumAmount &&
                    this.currency == other.currency &&
                    this.conversionRate == other.conversionRate &&
                    this.discount == other.discount &&
                    this.fixedPriceQuantity == other.fixedPriceQuantity &&
                    this.packageWithAllocationConfig == other.packageWithAllocationConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            modelType,
                            minimumAmount,
                            maximumAmount,
                            currency,
                            conversionRate,
                            discount,
                            fixedPriceQuantity,
                            packageWithAllocationConfig,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "OverridePackageWithAllocationPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, packageWithAllocationConfig=$packageWithAllocationConfig, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var packageWithAllocationConfig: JsonField<PackageWithAllocationConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    overridePackageWithAllocationPrice: OverridePackageWithAllocationPrice
                ) = apply {
                    this.id = overridePackageWithAllocationPrice.id
                    this.modelType = overridePackageWithAllocationPrice.modelType
                    this.minimumAmount = overridePackageWithAllocationPrice.minimumAmount
                    this.maximumAmount = overridePackageWithAllocationPrice.maximumAmount
                    this.currency = overridePackageWithAllocationPrice.currency
                    this.conversionRate = overridePackageWithAllocationPrice.conversionRate
                    this.discount = overridePackageWithAllocationPrice.discount
                    this.fixedPriceQuantity = overridePackageWithAllocationPrice.fixedPriceQuantity
                    this.packageWithAllocationConfig =
                        overridePackageWithAllocationPrice.packageWithAllocationConfig
                    additionalProperties(overridePackageWithAllocationPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun packageWithAllocationConfig(
                    packageWithAllocationConfig: PackageWithAllocationConfig
                ) = packageWithAllocationConfig(JsonField.of(packageWithAllocationConfig))

                @JsonProperty("package_with_allocation_config")
                @ExcludeMissing
                fun packageWithAllocationConfig(
                    packageWithAllocationConfig: JsonField<PackageWithAllocationConfig>
                ) = apply { this.packageWithAllocationConfig = packageWithAllocationConfig }

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

                fun build(): OverridePackageWithAllocationPrice =
                    OverridePackageWithAllocationPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        packageWithAllocationConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class ModelType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val PACKAGE_WITH_ALLOCATION = ModelType(JsonField.of("package_with_allocation"))

                    fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    PACKAGE_WITH_ALLOCATION,
                }

                enum class Value {
                    PACKAGE_WITH_ALLOCATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PACKAGE_WITH_ALLOCATION -> Value.PACKAGE_WITH_ALLOCATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PACKAGE_WITH_ALLOCATION -> Known.PACKAGE_WITH_ALLOCATION
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = PackageWithAllocationConfig.Builder::class)
            @NoAutoDetect
            class PackageWithAllocationConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PackageWithAllocationConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PackageWithAllocationConfig &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "PackageWithAllocationConfig{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(packageWithAllocationConfig: PackageWithAllocationConfig) =
                        apply {
                            additionalProperties(packageWithAllocationConfig.additionalProperties)
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

                    fun build(): PackageWithAllocationConfig =
                        PackageWithAllocationConfig(additionalProperties.toUnmodifiable())
                }
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val trialAmountDiscount: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double? =
                    percentageDiscount.getNullable("percentage_discount")

                /** Only available if discount_type is `trial` */
                fun trialAmountDiscount(): String? =
                    trialAmountDiscount.getNullable("trial_amount_discount")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(): List<String>? =
                    appliesToPriceIds.getNullable("applies_to_price_ids")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /** Only available if discount_type is `trial` */
                @JsonProperty("trial_amount_discount")
                @ExcludeMissing
                fun _trialAmountDiscount() = trialAmountDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        trialAmountDiscount()
                        usageDiscount()
                        amountDiscount()
                        appliesToPriceIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        this.discountType == other.discountType &&
                        this.percentageDiscount == other.percentageDiscount &&
                        this.trialAmountDiscount == other.trialAmountDiscount &&
                        this.usageDiscount == other.usageDiscount &&
                        this.amountDiscount == other.amountDiscount &&
                        this.appliesToPriceIds == other.appliesToPriceIds &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                percentageDiscount,
                                trialAmountDiscount,
                                usageDiscount,
                                amountDiscount,
                                appliesToPriceIds,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, trialAmountDiscount=$trialAmountDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.trialAmountDiscount = discount.trialAmountDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        this.appliesToPriceIds = discount.appliesToPriceIds
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** Only available if discount_type is `trial` */
                    fun trialAmountDiscount(trialAmountDiscount: String) =
                        trialAmountDiscount(JsonField.of(trialAmountDiscount))

                    /** Only available if discount_type is `trial` */
                    @JsonProperty("trial_amount_discount")
                    @ExcludeMissing
                    fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
                        this.trialAmountDiscount = trialAmountDiscount
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

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            trialAmountDiscount,
                            usageDiscount,
                            amountDiscount,
                            appliesToPriceIds.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
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

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        val TRIAL = DiscountType(JsonField.of("trial"))

                        val USAGE = DiscountType(JsonField.of("usage"))

                        val AMOUNT = DiscountType(JsonField.of("amount"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }

        @JsonDeserialize(builder = OverrideUnitWithPercentPrice.Builder::class)
        @NoAutoDetect
        class OverrideUnitWithPercentPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val unitWithPercentConfig: JsonField<UnitWithPercentConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): String? = currency.getNullable("currency")

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

            /** The subscription's override discount for the plan. */
            fun discount(): Discount? = discount.getNullable("discount")

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Double? =
                fixedPriceQuantity.getNullable("fixed_price_quantity")

            fun unitWithPercentConfig(): UnitWithPercentConfig =
                unitWithPercentConfig.getRequired("unit_with_percent_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("unit_with_percent_config")
            @ExcludeMissing
            fun _unitWithPercentConfig() = unitWithPercentConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideUnitWithPercentPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount()?.validate()
                    fixedPriceQuantity()
                    unitWithPercentConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverrideUnitWithPercentPrice &&
                    this.id == other.id &&
                    this.modelType == other.modelType &&
                    this.minimumAmount == other.minimumAmount &&
                    this.maximumAmount == other.maximumAmount &&
                    this.currency == other.currency &&
                    this.conversionRate == other.conversionRate &&
                    this.discount == other.discount &&
                    this.fixedPriceQuantity == other.fixedPriceQuantity &&
                    this.unitWithPercentConfig == other.unitWithPercentConfig &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            modelType,
                            minimumAmount,
                            maximumAmount,
                            currency,
                            conversionRate,
                            discount,
                            fixedPriceQuantity,
                            unitWithPercentConfig,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "OverrideUnitWithPercentPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, unitWithPercentConfig=$unitWithPercentConfig, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var unitWithPercentConfig: JsonField<UnitWithPercentConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(overrideUnitWithPercentPrice: OverrideUnitWithPercentPrice) =
                    apply {
                        this.id = overrideUnitWithPercentPrice.id
                        this.modelType = overrideUnitWithPercentPrice.modelType
                        this.minimumAmount = overrideUnitWithPercentPrice.minimumAmount
                        this.maximumAmount = overrideUnitWithPercentPrice.maximumAmount
                        this.currency = overrideUnitWithPercentPrice.currency
                        this.conversionRate = overrideUnitWithPercentPrice.conversionRate
                        this.discount = overrideUnitWithPercentPrice.discount
                        this.fixedPriceQuantity = overrideUnitWithPercentPrice.fixedPriceQuantity
                        this.unitWithPercentConfig =
                            overrideUnitWithPercentPrice.unitWithPercentConfig
                        additionalProperties(overrideUnitWithPercentPrice.additionalProperties)
                    }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun unitWithPercentConfig(unitWithPercentConfig: UnitWithPercentConfig) =
                    unitWithPercentConfig(JsonField.of(unitWithPercentConfig))

                @JsonProperty("unit_with_percent_config")
                @ExcludeMissing
                fun unitWithPercentConfig(unitWithPercentConfig: JsonField<UnitWithPercentConfig>) =
                    apply {
                        this.unitWithPercentConfig = unitWithPercentConfig
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

                fun build(): OverrideUnitWithPercentPrice =
                    OverrideUnitWithPercentPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        unitWithPercentConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class ModelType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val UNIT_WITH_PERCENT = ModelType(JsonField.of("unit_with_percent"))

                    fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    UNIT_WITH_PERCENT,
                }

                enum class Value {
                    UNIT_WITH_PERCENT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        UNIT_WITH_PERCENT -> Value.UNIT_WITH_PERCENT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        UNIT_WITH_PERCENT -> Known.UNIT_WITH_PERCENT
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = UnitWithPercentConfig.Builder::class)
            @NoAutoDetect
            class UnitWithPercentConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): UnitWithPercentConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UnitWithPercentConfig &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "UnitWithPercentConfig{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(unitWithPercentConfig: UnitWithPercentConfig) = apply {
                        additionalProperties(unitWithPercentConfig.additionalProperties)
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

                    fun build(): UnitWithPercentConfig =
                        UnitWithPercentConfig(additionalProperties.toUnmodifiable())
                }
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val trialAmountDiscount: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double? =
                    percentageDiscount.getNullable("percentage_discount")

                /** Only available if discount_type is `trial` */
                fun trialAmountDiscount(): String? =
                    trialAmountDiscount.getNullable("trial_amount_discount")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Double? = usageDiscount.getNullable("usage_discount")

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): String? = amountDiscount.getNullable("amount_discount")

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                fun appliesToPriceIds(): List<String>? =
                    appliesToPriceIds.getNullable("applies_to_price_ids")

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /** Only available if discount_type is `trial` */
                @JsonProperty("trial_amount_discount")
                @ExcludeMissing
                fun _trialAmountDiscount() = trialAmountDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                /**
                 * List of price_ids that this discount applies to. For plan/plan phase discounts,
                 * this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        trialAmountDiscount()
                        usageDiscount()
                        amountDiscount()
                        appliesToPriceIds()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Discount &&
                        this.discountType == other.discountType &&
                        this.percentageDiscount == other.percentageDiscount &&
                        this.trialAmountDiscount == other.trialAmountDiscount &&
                        this.usageDiscount == other.usageDiscount &&
                        this.amountDiscount == other.amountDiscount &&
                        this.appliesToPriceIds == other.appliesToPriceIds &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                discountType,
                                percentageDiscount,
                                trialAmountDiscount,
                                usageDiscount,
                                amountDiscount,
                                appliesToPriceIds,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, trialAmountDiscount=$trialAmountDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.trialAmountDiscount = discount.trialAmountDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        this.appliesToPriceIds = discount.appliesToPriceIds
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** Only available if discount_type is `trial` */
                    fun trialAmountDiscount(trialAmountDiscount: String) =
                        trialAmountDiscount(JsonField.of(trialAmountDiscount))

                    /** Only available if discount_type is `trial` */
                    @JsonProperty("trial_amount_discount")
                    @ExcludeMissing
                    fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
                        this.trialAmountDiscount = trialAmountDiscount
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

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * List of price_ids that this discount applies to. For plan/plan phase
                     * discounts, this can be a subset of prices.
                     */
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            trialAmountDiscount,
                            usageDiscount,
                            amountDiscount,
                            appliesToPriceIds.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
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

                        return other is DiscountType && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        val TRIAL = DiscountType(JsonField.of("trial"))

                        val USAGE = DiscountType(JsonField.of("usage"))

                        val AMOUNT = DiscountType(JsonField.of("amount"))

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }
    }
}
