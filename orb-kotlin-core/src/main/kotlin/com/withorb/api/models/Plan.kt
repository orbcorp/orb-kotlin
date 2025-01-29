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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed to by
 * a customer. Plans define the billing behavior of the subscription. You can see more about how to
 * configure prices in the [Price resource](/reference/price).
 */
@NoAutoDetect
class Plan
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("adjustments")
    @ExcludeMissing
    private val adjustments: JsonField<List<Adjustment>> = JsonMissing.of(),
    @JsonProperty("base_plan")
    @ExcludeMissing
    private val basePlan: JsonField<BasePlan> = JsonMissing.of(),
    @JsonProperty("base_plan_id")
    @ExcludeMissing
    private val basePlanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("default_invoice_memo")
    @ExcludeMissing
    private val defaultInvoiceMemo: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discount")
    @ExcludeMissing
    private val discount: JsonField<Discount> = JsonMissing.of(),
    @JsonProperty("external_plan_id")
    @ExcludeMissing
    private val externalPlanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoicing_currency")
    @ExcludeMissing
    private val invoicingCurrency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("maximum")
    @ExcludeMissing
    private val maximum: JsonField<Maximum> = JsonMissing.of(),
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    private val maximumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("minimum")
    @ExcludeMissing
    private val minimum: JsonField<Minimum> = JsonMissing.of(),
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    private val minimumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("net_terms")
    @ExcludeMissing
    private val netTerms: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("plan_phases")
    @ExcludeMissing
    private val planPhases: JsonField<List<PlanPhase>> = JsonMissing.of(),
    @JsonProperty("prices")
    @ExcludeMissing
    private val prices: JsonField<List<Price>> = JsonMissing.of(),
    @JsonProperty("product")
    @ExcludeMissing
    private val product: JsonField<Product> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("trial_config")
    @ExcludeMissing
    private val trialConfig: JsonField<TrialConfig> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /**
     * Adjustments for this plan. If the plan has phases, this includes adjustments across all
     * phases of the plan.
     */
    fun adjustments(): List<Adjustment> = adjustments.getRequired("adjustments")

    fun basePlan(): BasePlan? = basePlan.getNullable("base_plan")

    /**
     * The parent plan id if the given plan was created by overriding one or more of the parent's
     * prices
     */
    fun basePlanId(): String? = basePlanId.getNullable("base_plan_id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** An ISO 4217 currency string or custom pricing unit (`credits`) for this plan's prices. */
    @Deprecated("deprecated") fun currency(): String = currency.getRequired("currency")

    /**
     * The default memo text on the invoices corresponding to subscriptions on this plan. Note that
     * each subscription may configure its own memo.
     */
    fun defaultInvoiceMemo(): String? = defaultInvoiceMemo.getNullable("default_invoice_memo")

    fun description(): String = description.getRequired("description")

    fun discount(): Discount? = discount.getNullable("discount")

    /**
     * An optional user-defined ID for this plan resource, used throughout the system as an alias
     * for this Plan. Use this field to identify a plan by an existing identifier in your system.
     */
    fun externalPlanId(): String? = externalPlanId.getNullable("external_plan_id")

    /**
     * An ISO 4217 currency string for which this plan is billed in. Matches `currency` unless
     * `currency` is a custom pricing unit.
     */
    fun invoicingCurrency(): String = invoicingCurrency.getRequired("invoicing_currency")

    fun maximum(): Maximum? = maximum.getNullable("maximum")

    fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun minimum(): Minimum? = minimum.getNullable("minimum")

    fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

    fun name(): String = name.getRequired("name")

    /**
     * Determines the difference between the invoice issue date and the due date. A value of "0"
     * here signifies that invoices are due on issue, whereas a value of "30" means that the
     * customer has a month to pay the invoice before its overdue. Note that individual
     * subscriptions or invoices may set a different net terms configuration.
     */
    fun netTerms(): Long? = netTerms.getNullable("net_terms")

    fun planPhases(): List<PlanPhase>? = planPhases.getNullable("plan_phases")

    /**
     * Prices for this plan. If the plan has phases, this includes prices across all phases of the
     * plan.
     */
    fun prices(): List<Price> = prices.getRequired("prices")

    fun product(): Product = product.getRequired("product")

    fun status(): Status = status.getRequired("status")

    fun trialConfig(): TrialConfig = trialConfig.getRequired("trial_config")

    fun version(): Long = version.getRequired("version")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Adjustments for this plan. If the plan has phases, this includes adjustments across all
     * phases of the plan.
     */
    @JsonProperty("adjustments")
    @ExcludeMissing
    fun _adjustments(): JsonField<List<Adjustment>> = adjustments

    @JsonProperty("base_plan") @ExcludeMissing fun _basePlan(): JsonField<BasePlan> = basePlan

    /**
     * The parent plan id if the given plan was created by overriding one or more of the parent's
     * prices
     */
    @JsonProperty("base_plan_id") @ExcludeMissing fun _basePlanId(): JsonField<String> = basePlanId

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** An ISO 4217 currency string or custom pricing unit (`credits`) for this plan's prices. */
    @Deprecated("deprecated")
    @JsonProperty("currency")
    @ExcludeMissing
    fun _currency(): JsonField<String> = currency

    /**
     * The default memo text on the invoices corresponding to subscriptions on this plan. Note that
     * each subscription may configure its own memo.
     */
    @JsonProperty("default_invoice_memo")
    @ExcludeMissing
    fun _defaultInvoiceMemo(): JsonField<String> = defaultInvoiceMemo

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Discount> = discount

    /**
     * An optional user-defined ID for this plan resource, used throughout the system as an alias
     * for this Plan. Use this field to identify a plan by an existing identifier in your system.
     */
    @JsonProperty("external_plan_id")
    @ExcludeMissing
    fun _externalPlanId(): JsonField<String> = externalPlanId

    /**
     * An ISO 4217 currency string for which this plan is billed in. Matches `currency` unless
     * `currency` is a custom pricing unit.
     */
    @JsonProperty("invoicing_currency")
    @ExcludeMissing
    fun _invoicingCurrency(): JsonField<String> = invoicingCurrency

    @JsonProperty("maximum") @ExcludeMissing fun _maximum(): JsonField<Maximum> = maximum

    @JsonProperty("maximum_amount")
    @ExcludeMissing
    fun _maximumAmount(): JsonField<String> = maximumAmount

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("minimum") @ExcludeMissing fun _minimum(): JsonField<Minimum> = minimum

    @JsonProperty("minimum_amount")
    @ExcludeMissing
    fun _minimumAmount(): JsonField<String> = minimumAmount

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Determines the difference between the invoice issue date and the due date. A value of "0"
     * here signifies that invoices are due on issue, whereas a value of "30" means that the
     * customer has a month to pay the invoice before its overdue. Note that individual
     * subscriptions or invoices may set a different net terms configuration.
     */
    @JsonProperty("net_terms") @ExcludeMissing fun _netTerms(): JsonField<Long> = netTerms

    @JsonProperty("plan_phases")
    @ExcludeMissing
    fun _planPhases(): JsonField<List<PlanPhase>> = planPhases

    /**
     * Prices for this plan. If the plan has phases, this includes prices across all phases of the
     * plan.
     */
    @JsonProperty("prices") @ExcludeMissing fun _prices(): JsonField<List<Price>> = prices

    @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonProperty("trial_config")
    @ExcludeMissing
    fun _trialConfig(): JsonField<TrialConfig> = trialConfig

    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Plan = apply {
        if (validated) {
            return@apply
        }

        id()
        adjustments().forEach { it.validate() }
        basePlan()?.validate()
        basePlanId()
        createdAt()
        currency()
        defaultInvoiceMemo()
        description()
        discount()?.validate()
        externalPlanId()
        invoicingCurrency()
        maximum()?.validate()
        maximumAmount()
        metadata().validate()
        minimum()?.validate()
        minimumAmount()
        name()
        netTerms()
        planPhases()?.forEach { it.validate() }
        prices().forEach { it.validate() }
        product().validate()
        status()
        trialConfig().validate()
        version()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [Plan]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var adjustments: JsonField<MutableList<Adjustment>>? = null
        private var basePlan: JsonField<BasePlan>? = null
        private var basePlanId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var defaultInvoiceMemo: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var discount: JsonField<Discount>? = null
        private var externalPlanId: JsonField<String>? = null
        private var invoicingCurrency: JsonField<String>? = null
        private var maximum: JsonField<Maximum>? = null
        private var maximumAmount: JsonField<String>? = null
        private var metadata: JsonField<Metadata>? = null
        private var minimum: JsonField<Minimum>? = null
        private var minimumAmount: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var netTerms: JsonField<Long>? = null
        private var planPhases: JsonField<MutableList<PlanPhase>>? = null
        private var prices: JsonField<MutableList<Price>>? = null
        private var product: JsonField<Product>? = null
        private var status: JsonField<Status>? = null
        private var trialConfig: JsonField<TrialConfig>? = null
        private var version: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(plan: Plan) = apply {
            id = plan.id
            adjustments = plan.adjustments.map { it.toMutableList() }
            basePlan = plan.basePlan
            basePlanId = plan.basePlanId
            createdAt = plan.createdAt
            currency = plan.currency
            defaultInvoiceMemo = plan.defaultInvoiceMemo
            description = plan.description
            discount = plan.discount
            externalPlanId = plan.externalPlanId
            invoicingCurrency = plan.invoicingCurrency
            maximum = plan.maximum
            maximumAmount = plan.maximumAmount
            metadata = plan.metadata
            minimum = plan.minimum
            minimumAmount = plan.minimumAmount
            name = plan.name
            netTerms = plan.netTerms
            planPhases = plan.planPhases.map { it.toMutableList() }
            prices = plan.prices.map { it.toMutableList() }
            product = plan.product
            status = plan.status
            trialConfig = plan.trialConfig
            version = plan.version
            additionalProperties = plan.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun adjustments(adjustments: List<Adjustment>) = adjustments(JsonField.of(adjustments))

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun adjustments(adjustments: JsonField<List<Adjustment>>) = apply {
            this.adjustments = adjustments.map { it.toMutableList() }
        }

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun addAdjustment(adjustment: Adjustment) = apply {
            adjustments =
                (adjustments ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(adjustment)
                }
        }

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun addAdjustment(amountDiscount: Adjustment.AmountDiscountAdjustment) =
            addAdjustment(Adjustment.ofAmountDiscount(amountDiscount))

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun addAdjustment(percentageDiscount: Adjustment.PercentageDiscountAdjustment) =
            addAdjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun addAdjustment(usageDiscount: Adjustment.UsageDiscountAdjustment) =
            addAdjustment(Adjustment.ofUsageDiscount(usageDiscount))

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun addAdjustment(minimum: Adjustment.MinimumAdjustment) =
            addAdjustment(Adjustment.ofMinimum(minimum))

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun addAdjustment(maximum: Adjustment.MaximumAdjustment) =
            addAdjustment(Adjustment.ofMaximum(maximum))

        fun basePlan(basePlan: BasePlan?) = basePlan(JsonField.ofNullable(basePlan))

        fun basePlan(basePlan: JsonField<BasePlan>) = apply { this.basePlan = basePlan }

        /**
         * The parent plan id if the given plan was created by overriding one or more of the
         * parent's prices
         */
        fun basePlanId(basePlanId: String?) = basePlanId(JsonField.ofNullable(basePlanId))

        /**
         * The parent plan id if the given plan was created by overriding one or more of the
         * parent's prices
         */
        fun basePlanId(basePlanId: JsonField<String>) = apply { this.basePlanId = basePlanId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * An ISO 4217 currency string or custom pricing unit (`credits`) for this plan's prices.
         */
        @Deprecated("deprecated") fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * An ISO 4217 currency string or custom pricing unit (`credits`) for this plan's prices.
         */
        @Deprecated("deprecated")
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * The default memo text on the invoices corresponding to subscriptions on this plan. Note
         * that each subscription may configure its own memo.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: String?) =
            defaultInvoiceMemo(JsonField.ofNullable(defaultInvoiceMemo))

        /**
         * The default memo text on the invoices corresponding to subscriptions on this plan. Note
         * that each subscription may configure its own memo.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: JsonField<String>) = apply {
            this.defaultInvoiceMemo = defaultInvoiceMemo
        }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

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

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         */
        fun externalPlanId(externalPlanId: String?) =
            externalPlanId(JsonField.ofNullable(externalPlanId))

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         */
        fun externalPlanId(externalPlanId: JsonField<String>) = apply {
            this.externalPlanId = externalPlanId
        }

        /**
         * An ISO 4217 currency string for which this plan is billed in. Matches `currency` unless
         * `currency` is a custom pricing unit.
         */
        fun invoicingCurrency(invoicingCurrency: String) =
            invoicingCurrency(JsonField.of(invoicingCurrency))

        /**
         * An ISO 4217 currency string for which this plan is billed in. Matches `currency` unless
         * `currency` is a custom pricing unit.
         */
        fun invoicingCurrency(invoicingCurrency: JsonField<String>) = apply {
            this.invoicingCurrency = invoicingCurrency
        }

        fun maximum(maximum: Maximum?) = maximum(JsonField.ofNullable(maximum))

        fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

        fun maximumAmount(maximumAmount: String?) =
            maximumAmount(JsonField.ofNullable(maximumAmount))

        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
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

        fun minimum(minimum: Minimum?) = minimum(JsonField.ofNullable(minimum))

        fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

        fun minimumAmount(minimumAmount: String?) =
            minimumAmount(JsonField.ofNullable(minimumAmount))

        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Determines the difference between the invoice issue date and the due date. A value of "0"
         * here signifies that invoices are due on issue, whereas a value of "30" means that the
         * customer has a month to pay the invoice before its overdue. Note that individual
         * subscriptions or invoices may set a different net terms configuration.
         */
        fun netTerms(netTerms: Long?) = netTerms(JsonField.ofNullable(netTerms))

        /**
         * Determines the difference between the invoice issue date and the due date. A value of "0"
         * here signifies that invoices are due on issue, whereas a value of "30" means that the
         * customer has a month to pay the invoice before its overdue. Note that individual
         * subscriptions or invoices may set a different net terms configuration.
         */
        fun netTerms(netTerms: Long) = netTerms(netTerms as Long?)

        /**
         * Determines the difference between the invoice issue date and the due date. A value of "0"
         * here signifies that invoices are due on issue, whereas a value of "30" means that the
         * customer has a month to pay the invoice before its overdue. Note that individual
         * subscriptions or invoices may set a different net terms configuration.
         */
        fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

        fun planPhases(planPhases: List<PlanPhase>?) = planPhases(JsonField.ofNullable(planPhases))

        fun planPhases(planPhases: JsonField<List<PlanPhase>>) = apply {
            this.planPhases = planPhases.map { it.toMutableList() }
        }

        fun addPlanPhase(planPhase: PlanPhase) = apply {
            planPhases =
                (planPhases ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(planPhase)
                }
        }

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun prices(prices: List<Price>) = prices(JsonField.of(prices))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun prices(prices: JsonField<List<Price>>) = apply {
            this.prices = prices.map { it.toMutableList() }
        }

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(price: Price) = apply {
            prices =
                (prices ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(price)
                }
        }

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(unit: Price.UnitPrice) = addPrice(Price.ofUnit(unit))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(packagePrice: Price.PackagePrice) =
            addPrice(Price.ofPackagePrice(packagePrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(matrix: Price.MatrixPrice) = addPrice(Price.ofMatrix(matrix))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(tiered: Price.TieredPrice) = addPrice(Price.ofTiered(tiered))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(tieredBps: Price.TieredBpsPrice) = addPrice(Price.ofTieredBps(tieredBps))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(bps: Price.BpsPrice) = addPrice(Price.ofBps(bps))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(bulkBps: Price.BulkBpsPrice) = addPrice(Price.ofBulkBps(bulkBps))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(bulk: Price.BulkPrice) = addPrice(Price.ofBulk(bulk))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(thresholdTotalAmount: Price.ThresholdTotalAmountPrice) =
            addPrice(Price.ofThresholdTotalAmount(thresholdTotalAmount))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(tieredPackage: Price.TieredPackagePrice) =
            addPrice(Price.ofTieredPackage(tieredPackage))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(groupedTiered: Price.GroupedTieredPrice) =
            addPrice(Price.ofGroupedTiered(groupedTiered))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(tieredWithMinimum: Price.TieredWithMinimumPrice) =
            addPrice(Price.ofTieredWithMinimum(tieredWithMinimum))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(tieredPackageWithMinimum: Price.TieredPackageWithMinimumPrice) =
            addPrice(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(packageWithAllocation: Price.PackageWithAllocationPrice) =
            addPrice(Price.ofPackageWithAllocation(packageWithAllocation))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(unitWithPercent: Price.UnitWithPercentPrice) =
            addPrice(Price.ofUnitWithPercent(unitWithPercent))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(matrixWithAllocation: Price.MatrixWithAllocationPrice) =
            addPrice(Price.ofMatrixWithAllocation(matrixWithAllocation))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(tieredWithProration: Price.TieredWithProrationPrice) =
            addPrice(Price.ofTieredWithProration(tieredWithProration))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(unitWithProration: Price.UnitWithProrationPrice) =
            addPrice(Price.ofUnitWithProration(unitWithProration))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(groupedAllocation: Price.GroupedAllocationPrice) =
            addPrice(Price.ofGroupedAllocation(groupedAllocation))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(groupedWithProratedMinimum: Price.GroupedWithProratedMinimumPrice) =
            addPrice(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(groupedWithMeteredMinimum: Price.GroupedWithMeteredMinimumPrice) =
            addPrice(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(matrixWithDisplayName: Price.MatrixWithDisplayNamePrice) =
            addPrice(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(bulkWithProration: Price.BulkWithProrationPrice) =
            addPrice(Price.ofBulkWithProration(bulkWithProration))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(groupedTieredPackage: Price.GroupedTieredPackagePrice) =
            addPrice(Price.ofGroupedTieredPackage(groupedTieredPackage))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(maxGroupTiered: Price.MaxGroupTieredPrice) =
            addPrice(Price.ofMaxGroupTiered(maxGroupTiered))

        fun product(product: Product) = product(JsonField.of(product))

        fun product(product: JsonField<Product>) = apply { this.product = product }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun trialConfig(trialConfig: TrialConfig) = trialConfig(JsonField.of(trialConfig))

        fun trialConfig(trialConfig: JsonField<TrialConfig>) = apply {
            this.trialConfig = trialConfig
        }

        fun version(version: Long) = version(JsonField.of(version))

        fun version(version: JsonField<Long>) = apply { this.version = version }

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

        fun build(): Plan =
            Plan(
                checkRequired("id", id),
                checkRequired("adjustments", adjustments).map { it.toImmutable() },
                checkRequired("basePlan", basePlan),
                checkRequired("basePlanId", basePlanId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("defaultInvoiceMemo", defaultInvoiceMemo),
                checkRequired("description", description),
                checkRequired("discount", discount),
                checkRequired("externalPlanId", externalPlanId),
                checkRequired("invoicingCurrency", invoicingCurrency),
                checkRequired("maximum", maximum),
                checkRequired("maximumAmount", maximumAmount),
                checkRequired("metadata", metadata),
                checkRequired("minimum", minimum),
                checkRequired("minimumAmount", minimumAmount),
                checkRequired("name", name),
                checkRequired("netTerms", netTerms),
                checkRequired("planPhases", planPhases).map { it.toImmutable() },
                checkRequired("prices", prices).map { it.toImmutable() },
                checkRequired("product", product),
                checkRequired("status", status),
                checkRequired("trialConfig", trialConfig),
                checkRequired("version", version),
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = Adjustment.Deserializer::class)
    @JsonSerialize(using = Adjustment.Serializer::class)
    class Adjustment
    private constructor(
        private val amountDiscount: AmountDiscountAdjustment? = null,
        private val percentageDiscount: PercentageDiscountAdjustment? = null,
        private val usageDiscount: UsageDiscountAdjustment? = null,
        private val minimum: MinimumAdjustment? = null,
        private val maximum: MaximumAdjustment? = null,
        private val _json: JsonValue? = null,
    ) {

        fun amountDiscount(): AmountDiscountAdjustment? = amountDiscount

        fun percentageDiscount(): PercentageDiscountAdjustment? = percentageDiscount

        fun usageDiscount(): UsageDiscountAdjustment? = usageDiscount

        fun minimum(): MinimumAdjustment? = minimum

        fun maximum(): MaximumAdjustment? = maximum

        fun isAmountDiscount(): Boolean = amountDiscount != null

        fun isPercentageDiscount(): Boolean = percentageDiscount != null

        fun isUsageDiscount(): Boolean = usageDiscount != null

        fun isMinimum(): Boolean = minimum != null

        fun isMaximum(): Boolean = maximum != null

        fun asAmountDiscount(): AmountDiscountAdjustment =
            amountDiscount.getOrThrow("amountDiscount")

        fun asPercentageDiscount(): PercentageDiscountAdjustment =
            percentageDiscount.getOrThrow("percentageDiscount")

        fun asUsageDiscount(): UsageDiscountAdjustment = usageDiscount.getOrThrow("usageDiscount")

        fun asMinimum(): MinimumAdjustment = minimum.getOrThrow("minimum")

        fun asMaximum(): MaximumAdjustment = maximum.getOrThrow("maximum")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
                percentageDiscount != null -> visitor.visitPercentageDiscount(percentageDiscount)
                usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                minimum != null -> visitor.visitMinimum(minimum)
                maximum != null -> visitor.visitMaximum(maximum)
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
                    override fun visitAmountDiscount(amountDiscount: AmountDiscountAdjustment) {
                        amountDiscount.validate()
                    }

                    override fun visitPercentageDiscount(
                        percentageDiscount: PercentageDiscountAdjustment
                    ) {
                        percentageDiscount.validate()
                    }

                    override fun visitUsageDiscount(usageDiscount: UsageDiscountAdjustment) {
                        usageDiscount.validate()
                    }

                    override fun visitMinimum(minimum: MinimumAdjustment) {
                        minimum.validate()
                    }

                    override fun visitMaximum(maximum: MaximumAdjustment) {
                        maximum.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Adjustment && amountDiscount == other.amountDiscount && percentageDiscount == other.percentageDiscount && usageDiscount == other.usageDiscount && minimum == other.minimum && maximum == other.maximum /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(amountDiscount, percentageDiscount, usageDiscount, minimum, maximum) /* spotless:on */

        override fun toString(): String =
            when {
                amountDiscount != null -> "Adjustment{amountDiscount=$amountDiscount}"
                percentageDiscount != null -> "Adjustment{percentageDiscount=$percentageDiscount}"
                usageDiscount != null -> "Adjustment{usageDiscount=$usageDiscount}"
                minimum != null -> "Adjustment{minimum=$minimum}"
                maximum != null -> "Adjustment{maximum=$maximum}"
                _json != null -> "Adjustment{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Adjustment")
            }

        companion object {

            fun ofAmountDiscount(amountDiscount: AmountDiscountAdjustment) =
                Adjustment(amountDiscount = amountDiscount)

            fun ofPercentageDiscount(percentageDiscount: PercentageDiscountAdjustment) =
                Adjustment(percentageDiscount = percentageDiscount)

            fun ofUsageDiscount(usageDiscount: UsageDiscountAdjustment) =
                Adjustment(usageDiscount = usageDiscount)

            fun ofMinimum(minimum: MinimumAdjustment) = Adjustment(minimum = minimum)

            fun ofMaximum(maximum: MaximumAdjustment) = Adjustment(maximum = maximum)
        }

        /**
         * An interface that defines how to map each variant of [Adjustment] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitAmountDiscount(amountDiscount: AmountDiscountAdjustment): T

            fun visitPercentageDiscount(percentageDiscount: PercentageDiscountAdjustment): T

            fun visitUsageDiscount(usageDiscount: UsageDiscountAdjustment): T

            fun visitMinimum(minimum: MinimumAdjustment): T

            fun visitMaximum(maximum: MaximumAdjustment): T

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
                    "amount_discount" -> {
                        tryDeserialize(node, jacksonTypeRef<AmountDiscountAdjustment>()) {
                                it.validate()
                            }
                            ?.let {
                                return Adjustment(amountDiscount = it, _json = json)
                            }
                    }
                    "percentage_discount" -> {
                        tryDeserialize(node, jacksonTypeRef<PercentageDiscountAdjustment>()) {
                                it.validate()
                            }
                            ?.let {
                                return Adjustment(percentageDiscount = it, _json = json)
                            }
                    }
                    "usage_discount" -> {
                        tryDeserialize(node, jacksonTypeRef<UsageDiscountAdjustment>()) {
                                it.validate()
                            }
                            ?.let {
                                return Adjustment(usageDiscount = it, _json = json)
                            }
                    }
                    "minimum" -> {
                        tryDeserialize(node, jacksonTypeRef<MinimumAdjustment>()) { it.validate() }
                            ?.let {
                                return Adjustment(minimum = it, _json = json)
                            }
                    }
                    "maximum" -> {
                        tryDeserialize(node, jacksonTypeRef<MaximumAdjustment>()) { it.validate() }
                            ?.let {
                                return Adjustment(maximum = it, _json = json)
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
                provider: SerializerProvider
            ) {
                when {
                    value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                    value.percentageDiscount != null ->
                        generator.writeObject(value.percentageDiscount)
                    value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                    value.minimum != null -> generator.writeObject(value.minimum)
                    value.maximum != null -> generator.writeObject(value.maximum)
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
                if (validated) {
                    return@apply
                }

                id()
                adjustmentType()
                amountDiscount()
                appliesToPriceIds()
                isInvoiceLevel()
                planPhaseOrder()
                reason()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [AmountDiscountAdjustment]. */
            class Builder internal constructor() {

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
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(appliesToPriceId)
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

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long?) =
                    planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

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
                        checkRequired("id", id),
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("amountDiscount", amountDiscount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("planPhaseOrder", planPhaseOrder),
                        checkRequired("reason", reason),
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                    AMOUNT_DISCOUNT,
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
             * The percentage (as a value between 0 and 1) by which to discount the price intervals
             * this adjustment applies to in a given billing period.
             */
            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

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
             * The percentage (as a value between 0 and 1) by which to discount the price intervals
             * this adjustment applies to in a given billing period.
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
                if (validated) {
                    return@apply
                }

                id()
                adjustmentType()
                appliesToPriceIds()
                isInvoiceLevel()
                percentageDiscount()
                planPhaseOrder()
                reason()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [PercentageDiscountAdjustment]. */
            class Builder internal constructor() {

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

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long?) =
                    planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

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
                        checkRequired("id", id),
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("percentageDiscount", percentageDiscount),
                        checkRequired("planPhaseOrder", planPhaseOrder),
                        checkRequired("reason", reason),
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                    PERCENTAGE_DISCOUNT,
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
             * The number of usage units by which to discount the price this adjustment applies to
             * in a given billing period.
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

            fun validate(): UsageDiscountAdjustment = apply {
                if (validated) {
                    return@apply
                }

                id()
                adjustmentType()
                appliesToPriceIds()
                isInvoiceLevel()
                planPhaseOrder()
                reason()
                usageDiscount()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [UsageDiscountAdjustment]. */
            class Builder internal constructor() {

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

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long?) =
                    planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                    this.planPhaseOrder = planPhaseOrder
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

                fun build(): UsageDiscountAdjustment =
                    UsageDiscountAdjustment(
                        checkRequired("id", id),
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("planPhaseOrder", planPhaseOrder),
                        checkRequired("reason", reason),
                        checkRequired("usageDiscount", usageDiscount),
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                    USAGE_DISCOUNT,
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
             * The minimum amount to charge in a given billing period for the prices this adjustment
             * applies to.
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
             * The minimum amount to charge in a given billing period for the prices this adjustment
             * applies to.
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
                if (validated) {
                    return@apply
                }

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

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [MinimumAdjustment]. */
            class Builder internal constructor() {

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

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long?) =
                    planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

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
                        checkRequired("id", id),
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("itemId", itemId),
                        checkRequired("minimumAmount", minimumAmount),
                        checkRequired("planPhaseOrder", planPhaseOrder),
                        checkRequired("reason", reason),
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                    MINIMUM,
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
             * The maximum amount to charge in a given billing period for the prices this adjustment
             * applies to.
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
             * The maximum amount to charge in a given billing period for the prices this adjustment
             * applies to.
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
                if (validated) {
                    return@apply
                }

                id()
                adjustmentType()
                appliesToPriceIds()
                isInvoiceLevel()
                maximumAmount()
                planPhaseOrder()
                reason()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [MaximumAdjustment]. */
            class Builder internal constructor() {

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

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long?) =
                    planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

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
                        checkRequired("id", id),
                        checkRequired("adjustmentType", adjustmentType),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("isInvoiceLevel", isInvoiceLevel),
                        checkRequired("maximumAmount", maximumAmount),
                        checkRequired("planPhaseOrder", planPhaseOrder),
                        checkRequired("reason", reason),
                        additionalProperties.toImmutable(),
                    )
            }

            class AdjustmentType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                    MAXIMUM,
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

    @NoAutoDetect
    class BasePlan
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_plan_id")
        @ExcludeMissing
        private val externalPlanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String? = id.getNullable("id")

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         */
        fun externalPlanId(): String? = externalPlanId.getNullable("external_plan_id")

        fun name(): String? = name.getNullable("name")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         */
        @JsonProperty("external_plan_id")
        @ExcludeMissing
        fun _externalPlanId(): JsonField<String> = externalPlanId

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BasePlan = apply {
            if (validated) {
                return@apply
            }

            id()
            externalPlanId()
            name()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [BasePlan]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var externalPlanId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(basePlan: BasePlan) = apply {
                id = basePlan.id
                externalPlanId = basePlan.externalPlanId
                name = basePlan.name
                additionalProperties = basePlan.additionalProperties.toMutableMap()
            }

            fun id(id: String?) = id(JsonField.ofNullable(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * An optional user-defined ID for this plan resource, used throughout the system as an
             * alias for this Plan. Use this field to identify a plan by an existing identifier in
             * your system.
             */
            fun externalPlanId(externalPlanId: String?) =
                externalPlanId(JsonField.ofNullable(externalPlanId))

            /**
             * An optional user-defined ID for this plan resource, used throughout the system as an
             * alias for this Plan. Use this field to identify a plan by an existing identifier in
             * your system.
             */
            fun externalPlanId(externalPlanId: JsonField<String>) = apply {
                this.externalPlanId = externalPlanId
            }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): BasePlan =
                BasePlan(
                    checkRequired("id", id),
                    checkRequired("externalPlanId", externalPlanId),
                    checkRequired("name", name),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BasePlan && id == other.id && externalPlanId == other.externalPlanId && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, externalPlanId, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BasePlan{id=$id, externalPlanId=$externalPlanId, name=$name, additionalProperties=$additionalProperties}"
    }

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
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(appliesToPriceId)
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
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(appliesToPriceId)
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

    @NoAutoDetect
    class PlanPhase
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount")
        @ExcludeMissing
        private val discount: JsonField<Discount> = JsonMissing.of(),
        @JsonProperty("duration")
        @ExcludeMissing
        private val duration: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("duration_unit")
        @ExcludeMissing
        private val durationUnit: JsonField<DurationUnit> = JsonMissing.of(),
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
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("order")
        @ExcludeMissing
        private val order: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun description(): String? = description.getNullable("description")

        fun discount(): Discount? = discount.getNullable("discount")

        /**
         * How many terms of length `duration_unit` this phase is active for. If null, this phase is
         * evergreen and active indefinitely
         */
        fun duration(): Long? = duration.getNullable("duration")

        fun durationUnit(): DurationUnit? = durationUnit.getNullable("duration_unit")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun name(): String = name.getRequired("name")

        /** Determines the ordering of the phase in a plan's lifecycle. 1 = first phase. */
        fun order(): Long = order.getRequired("order")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Discount> = discount

        /**
         * How many terms of length `duration_unit` this phase is active for. If null, this phase is
         * evergreen and active indefinitely
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

        @JsonProperty("duration_unit")
        @ExcludeMissing
        fun _durationUnit(): JsonField<DurationUnit> = durationUnit

        @JsonProperty("maximum") @ExcludeMissing fun _maximum(): JsonField<Maximum> = maximum

        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum(): JsonField<Minimum> = minimum

        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Determines the ordering of the phase in a plan's lifecycle. 1 = first phase. */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Long> = order

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PlanPhase = apply {
            if (validated) {
                return@apply
            }

            id()
            description()
            discount()?.validate()
            duration()
            durationUnit()
            maximum()?.validate()
            maximumAmount()
            minimum()?.validate()
            minimumAmount()
            name()
            order()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [PlanPhase]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var discount: JsonField<Discount>? = null
            private var duration: JsonField<Long>? = null
            private var durationUnit: JsonField<DurationUnit>? = null
            private var maximum: JsonField<Maximum>? = null
            private var maximumAmount: JsonField<String>? = null
            private var minimum: JsonField<Minimum>? = null
            private var minimumAmount: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var order: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(planPhase: PlanPhase) = apply {
                id = planPhase.id
                description = planPhase.description
                discount = planPhase.discount
                duration = planPhase.duration
                durationUnit = planPhase.durationUnit
                maximum = planPhase.maximum
                maximumAmount = planPhase.maximumAmount
                minimum = planPhase.minimum
                minimumAmount = planPhase.minimumAmount
                name = planPhase.name
                order = planPhase.order
                additionalProperties = planPhase.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun discount(discount: Discount?) = discount(JsonField.ofNullable(discount))

            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun discount(percentage: PercentageDiscount) =
                discount(Discount.ofPercentage(percentage))

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

            /**
             * How many terms of length `duration_unit` this phase is active for. If null, this
             * phase is evergreen and active indefinitely
             */
            fun duration(duration: Long?) = duration(JsonField.ofNullable(duration))

            /**
             * How many terms of length `duration_unit` this phase is active for. If null, this
             * phase is evergreen and active indefinitely
             */
            fun duration(duration: Long) = duration(duration as Long?)

            /**
             * How many terms of length `duration_unit` this phase is active for. If null, this
             * phase is evergreen and active indefinitely
             */
            fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

            fun durationUnit(durationUnit: DurationUnit?) =
                durationUnit(JsonField.ofNullable(durationUnit))

            fun durationUnit(durationUnit: JsonField<DurationUnit>) = apply {
                this.durationUnit = durationUnit
            }

            fun maximum(maximum: Maximum?) = maximum(JsonField.ofNullable(maximum))

            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String?) =
                maximumAmount(JsonField.ofNullable(maximumAmount))

            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun minimum(minimum: Minimum?) = minimum(JsonField.ofNullable(minimum))

            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String?) =
                minimumAmount(JsonField.ofNullable(minimumAmount))

            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Determines the ordering of the phase in a plan's lifecycle. 1 = first phase. */
            fun order(order: Long) = order(JsonField.of(order))

            /** Determines the ordering of the phase in a plan's lifecycle. 1 = first phase. */
            fun order(order: JsonField<Long>) = apply { this.order = order }

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

            fun build(): PlanPhase =
                PlanPhase(
                    checkRequired("id", id),
                    checkRequired("description", description),
                    checkRequired("discount", discount),
                    checkRequired("duration", duration),
                    checkRequired("durationUnit", durationUnit),
                    checkRequired("maximum", maximum),
                    checkRequired("maximumAmount", maximumAmount),
                    checkRequired("minimum", minimum),
                    checkRequired("minimumAmount", minimumAmount),
                    checkRequired("name", name),
                    checkRequired("order", order),
                    additionalProperties.toImmutable(),
                )
        }

        class DurationUnit
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val DAILY = of("daily")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val SEMI_ANNUAL = of("semi_annual")

                val ANNUAL = of("annual")

                fun of(value: String) = DurationUnit(JsonField.of(value))
            }

            /** An enum containing [DurationUnit]'s known values. */
            enum class Known {
                DAILY,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            /**
             * An enum containing [DurationUnit]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DurationUnit] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DAILY,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                /**
                 * An enum member indicating that [DurationUnit] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DAILY -> Value.DAILY
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
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
                    DAILY -> Known.DAILY
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
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
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
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

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

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

                fun build(): Maximum =
                    Maximum(
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
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
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
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
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
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

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

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

                fun build(): Minimum =
                    Minimum(
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PlanPhase && id == other.id && description == other.description && discount == other.discount && duration == other.duration && durationUnit == other.durationUnit && maximum == other.maximum && maximumAmount == other.maximumAmount && minimum == other.minimum && minimumAmount == other.minimumAmount && name == other.name && order == other.order && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, description, discount, duration, durationUnit, maximum, maximumAmount, minimum, minimumAmount, name, order, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlanPhase{id=$id, description=$description, discount=$discount, duration=$duration, durationUnit=$durationUnit, maximum=$maximum, maximumAmount=$maximumAmount, minimum=$minimum, minimumAmount=$minimumAmount, name=$name, order=$order, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Product
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun name(): String = name.getRequired("name")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Product = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            name()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Product]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(product: Product) = apply {
                id = product.id
                createdAt = product.createdAt
                name = product.name
                additionalProperties = product.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): Product =
                Product(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("name", name),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Product && id == other.id && createdAt == other.createdAt && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdAt, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Product{id=$id, createdAt=$createdAt, name=$name, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            val ARCHIVED = of("archived")

            val DRAFT = of("draft")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            ARCHIVED,
            DRAFT,
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
            ARCHIVED,
            DRAFT,
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
                ARCHIVED -> Value.ARCHIVED
                DRAFT -> Value.DRAFT
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
                ARCHIVED -> Known.ARCHIVED
                DRAFT -> Known.DRAFT
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
    class TrialConfig
    @JsonCreator
    private constructor(
        @JsonProperty("trial_period")
        @ExcludeMissing
        private val trialPeriod: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("trial_period_unit")
        @ExcludeMissing
        private val trialPeriodUnit: JsonField<TrialPeriodUnit> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun trialPeriod(): Long? = trialPeriod.getNullable("trial_period")

        fun trialPeriodUnit(): TrialPeriodUnit = trialPeriodUnit.getRequired("trial_period_unit")

        @JsonProperty("trial_period")
        @ExcludeMissing
        fun _trialPeriod(): JsonField<Long> = trialPeriod

        @JsonProperty("trial_period_unit")
        @ExcludeMissing
        fun _trialPeriodUnit(): JsonField<TrialPeriodUnit> = trialPeriodUnit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TrialConfig = apply {
            if (validated) {
                return@apply
            }

            trialPeriod()
            trialPeriodUnit()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [TrialConfig]. */
        class Builder internal constructor() {

            private var trialPeriod: JsonField<Long>? = null
            private var trialPeriodUnit: JsonField<TrialPeriodUnit>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(trialConfig: TrialConfig) = apply {
                trialPeriod = trialConfig.trialPeriod
                trialPeriodUnit = trialConfig.trialPeriodUnit
                additionalProperties = trialConfig.additionalProperties.toMutableMap()
            }

            fun trialPeriod(trialPeriod: Long?) = trialPeriod(JsonField.ofNullable(trialPeriod))

            fun trialPeriod(trialPeriod: Long) = trialPeriod(trialPeriod as Long?)

            fun trialPeriod(trialPeriod: JsonField<Long>) = apply { this.trialPeriod = trialPeriod }

            fun trialPeriodUnit(trialPeriodUnit: TrialPeriodUnit) =
                trialPeriodUnit(JsonField.of(trialPeriodUnit))

            fun trialPeriodUnit(trialPeriodUnit: JsonField<TrialPeriodUnit>) = apply {
                this.trialPeriodUnit = trialPeriodUnit
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

            fun build(): TrialConfig =
                TrialConfig(
                    checkRequired("trialPeriod", trialPeriod),
                    checkRequired("trialPeriodUnit", trialPeriodUnit),
                    additionalProperties.toImmutable(),
                )
        }

        class TrialPeriodUnit
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val DAYS = of("days")

                fun of(value: String) = TrialPeriodUnit(JsonField.of(value))
            }

            /** An enum containing [TrialPeriodUnit]'s known values. */
            enum class Known {
                DAYS,
            }

            /**
             * An enum containing [TrialPeriodUnit]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [TrialPeriodUnit] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DAYS,
                /**
                 * An enum member indicating that [TrialPeriodUnit] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DAYS -> Value.DAYS
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
                    DAYS -> Known.DAYS
                    else -> throw OrbInvalidDataException("Unknown TrialPeriodUnit: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TrialPeriodUnit && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrialConfig && trialPeriod == other.trialPeriod && trialPeriodUnit == other.trialPeriodUnit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(trialPeriod, trialPeriodUnit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrialConfig{trialPeriod=$trialPeriod, trialPeriodUnit=$trialPeriodUnit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Plan && id == other.id && adjustments == other.adjustments && basePlan == other.basePlan && basePlanId == other.basePlanId && createdAt == other.createdAt && currency == other.currency && defaultInvoiceMemo == other.defaultInvoiceMemo && description == other.description && discount == other.discount && externalPlanId == other.externalPlanId && invoicingCurrency == other.invoicingCurrency && maximum == other.maximum && maximumAmount == other.maximumAmount && metadata == other.metadata && minimum == other.minimum && minimumAmount == other.minimumAmount && name == other.name && netTerms == other.netTerms && planPhases == other.planPhases && prices == other.prices && product == other.product && status == other.status && trialConfig == other.trialConfig && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, adjustments, basePlan, basePlanId, createdAt, currency, defaultInvoiceMemo, description, discount, externalPlanId, invoicingCurrency, maximum, maximumAmount, metadata, minimum, minimumAmount, name, netTerms, planPhases, prices, product, status, trialConfig, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Plan{id=$id, adjustments=$adjustments, basePlan=$basePlan, basePlanId=$basePlanId, createdAt=$createdAt, currency=$currency, defaultInvoiceMemo=$defaultInvoiceMemo, description=$description, discount=$discount, externalPlanId=$externalPlanId, invoicingCurrency=$invoicingCurrency, maximum=$maximum, maximumAmount=$maximumAmount, metadata=$metadata, minimum=$minimum, minimumAmount=$minimumAmount, name=$name, netTerms=$netTerms, planPhases=$planPhases, prices=$prices, product=$product, status=$status, trialConfig=$trialConfig, version=$version, additionalProperties=$additionalProperties}"
}
