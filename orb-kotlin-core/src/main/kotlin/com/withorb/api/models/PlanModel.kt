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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
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
class PlanModel
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("adjustments")
    @ExcludeMissing
    private val adjustments: JsonField<List<AdjustmentModel>> = JsonMissing.of(),
    @JsonProperty("base_plan")
    @ExcludeMissing
    private val basePlan: JsonField<PlanMinifiedModel> = JsonMissing.of(),
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
    private val maximum: JsonField<MaximumModel> = JsonMissing.of(),
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    private val maximumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("minimum")
    @ExcludeMissing
    private val minimum: JsonField<MinimumModel> = JsonMissing.of(),
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
    private val prices: JsonField<List<PriceModel>> = JsonMissing.of(),
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
    fun adjustments(): List<AdjustmentModel> = adjustments.getRequired("adjustments")

    fun basePlan(): PlanMinifiedModel? = basePlan.getNullable("base_plan")

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

    fun maximum(): MaximumModel? = maximum.getNullable("maximum")

    fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun minimum(): MinimumModel? = minimum.getNullable("minimum")

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
    fun prices(): List<PriceModel> = prices.getRequired("prices")

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
    fun _adjustments(): JsonField<List<AdjustmentModel>> = adjustments

    @JsonProperty("base_plan")
    @ExcludeMissing
    fun _basePlan(): JsonField<PlanMinifiedModel> = basePlan

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

    @JsonProperty("maximum") @ExcludeMissing fun _maximum(): JsonField<MaximumModel> = maximum

    @JsonProperty("maximum_amount")
    @ExcludeMissing
    fun _maximumAmount(): JsonField<String> = maximumAmount

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("minimum") @ExcludeMissing fun _minimum(): JsonField<MinimumModel> = minimum

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
    @JsonProperty("prices") @ExcludeMissing fun _prices(): JsonField<List<PriceModel>> = prices

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

    fun validate(): PlanModel = apply {
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

        /**
         * Returns a mutable builder for constructing an instance of [PlanModel].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .adjustments()
         * .basePlan()
         * .basePlanId()
         * .createdAt()
         * .currency()
         * .defaultInvoiceMemo()
         * .description()
         * .discount()
         * .externalPlanId()
         * .invoicingCurrency()
         * .maximum()
         * .maximumAmount()
         * .metadata()
         * .minimum()
         * .minimumAmount()
         * .name()
         * .netTerms()
         * .planPhases()
         * .prices()
         * .product()
         * .status()
         * .trialConfig()
         * .version()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlanModel]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var adjustments: JsonField<MutableList<AdjustmentModel>>? = null
        private var basePlan: JsonField<PlanMinifiedModel>? = null
        private var basePlanId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var defaultInvoiceMemo: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var discount: JsonField<Discount>? = null
        private var externalPlanId: JsonField<String>? = null
        private var invoicingCurrency: JsonField<String>? = null
        private var maximum: JsonField<MaximumModel>? = null
        private var maximumAmount: JsonField<String>? = null
        private var metadata: JsonField<Metadata>? = null
        private var minimum: JsonField<MinimumModel>? = null
        private var minimumAmount: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var netTerms: JsonField<Long>? = null
        private var planPhases: JsonField<MutableList<PlanPhase>>? = null
        private var prices: JsonField<MutableList<PriceModel>>? = null
        private var product: JsonField<Product>? = null
        private var status: JsonField<Status>? = null
        private var trialConfig: JsonField<TrialConfig>? = null
        private var version: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(planModel: PlanModel) = apply {
            id = planModel.id
            adjustments = planModel.adjustments.map { it.toMutableList() }
            basePlan = planModel.basePlan
            basePlanId = planModel.basePlanId
            createdAt = planModel.createdAt
            currency = planModel.currency
            defaultInvoiceMemo = planModel.defaultInvoiceMemo
            description = planModel.description
            discount = planModel.discount
            externalPlanId = planModel.externalPlanId
            invoicingCurrency = planModel.invoicingCurrency
            maximum = planModel.maximum
            maximumAmount = planModel.maximumAmount
            metadata = planModel.metadata
            minimum = planModel.minimum
            minimumAmount = planModel.minimumAmount
            name = planModel.name
            netTerms = planModel.netTerms
            planPhases = planModel.planPhases.map { it.toMutableList() }
            prices = planModel.prices.map { it.toMutableList() }
            product = planModel.product
            status = planModel.status
            trialConfig = planModel.trialConfig
            version = planModel.version
            additionalProperties = planModel.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun adjustments(adjustments: List<AdjustmentModel>) = adjustments(JsonField.of(adjustments))

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun adjustments(adjustments: JsonField<List<AdjustmentModel>>) = apply {
            this.adjustments = adjustments.map { it.toMutableList() }
        }

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun addAdjustment(adjustment: AdjustmentModel) = apply {
            adjustments =
                (adjustments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("adjustments", it).add(adjustment)
                }
        }

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun addAdjustment(
            planPhaseUsageDiscountAdjustment: AdjustmentModel.PlanPhaseUsageDiscountAdjustment
        ) =
            addAdjustment(
                AdjustmentModel.ofPlanPhaseUsageDiscountAdjustment(planPhaseUsageDiscountAdjustment)
            )

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun addAdjustment(
            planPhaseAmountDiscountAdjustment: AdjustmentModel.PlanPhaseAmountDiscountAdjustment
        ) =
            addAdjustment(
                AdjustmentModel.ofPlanPhaseAmountDiscountAdjustment(
                    planPhaseAmountDiscountAdjustment
                )
            )

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun addAdjustment(
            planPhasePercentageDiscountAdjustment:
                AdjustmentModel.PlanPhasePercentageDiscountAdjustment
        ) =
            addAdjustment(
                AdjustmentModel.ofPlanPhasePercentageDiscountAdjustment(
                    planPhasePercentageDiscountAdjustment
                )
            )

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun addAdjustment(planPhaseMinimumAdjustment: AdjustmentModel.PlanPhaseMinimumAdjustment) =
            addAdjustment(AdjustmentModel.ofPlanPhaseMinimumAdjustment(planPhaseMinimumAdjustment))

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun addAdjustment(planPhaseMaximumAdjustment: AdjustmentModel.PlanPhaseMaximumAdjustment) =
            addAdjustment(AdjustmentModel.ofPlanPhaseMaximumAdjustment(planPhaseMaximumAdjustment))

        fun basePlan(basePlan: PlanMinifiedModel?) = basePlan(JsonField.ofNullable(basePlan))

        fun basePlan(basePlan: JsonField<PlanMinifiedModel>) = apply { this.basePlan = basePlan }

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

        fun maximum(maximum: MaximumModel?) = maximum(JsonField.ofNullable(maximum))

        fun maximum(maximum: JsonField<MaximumModel>) = apply { this.maximum = maximum }

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

        fun minimum(minimum: MinimumModel?) = minimum(JsonField.ofNullable(minimum))

        fun minimum(minimum: JsonField<MinimumModel>) = apply { this.minimum = minimum }

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
                (planPhases ?: JsonField.of(mutableListOf())).also {
                    checkKnown("planPhases", it).add(planPhase)
                }
        }

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun prices(prices: List<PriceModel>) = prices(JsonField.of(prices))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun prices(prices: JsonField<List<PriceModel>>) = apply {
            this.prices = prices.map { it.toMutableList() }
        }

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(price: PriceModel) = apply {
            prices =
                (prices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("prices", it).add(price)
                }
        }

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(unitPrice: PriceModel.UnitPrice) = addPrice(PriceModel.ofUnitPrice(unitPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(packagePrice: PriceModel.PackagePrice) =
            addPrice(PriceModel.ofPackagePrice(packagePrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(matrixPrice: PriceModel.MatrixPrice) =
            addPrice(PriceModel.ofMatrixPrice(matrixPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(tieredPrice: PriceModel.TieredPrice) =
            addPrice(PriceModel.ofTieredPrice(tieredPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(tieredBpsPrice: PriceModel.TieredBpsPrice) =
            addPrice(PriceModel.ofTieredBpsPrice(tieredBpsPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(bpsPrice: PriceModel.BpsPrice) = addPrice(PriceModel.ofBpsPrice(bpsPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(bulkBpsPrice: PriceModel.BulkBpsPrice) =
            addPrice(PriceModel.ofBulkBpsPrice(bulkBpsPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(bulkPrice: PriceModel.BulkPrice) = addPrice(PriceModel.ofBulkPrice(bulkPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(thresholdTotalAmountPrice: PriceModel.ThresholdTotalAmountPrice) =
            addPrice(PriceModel.ofThresholdTotalAmountPrice(thresholdTotalAmountPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(tieredPackagePrice: PriceModel.TieredPackagePrice) =
            addPrice(PriceModel.ofTieredPackagePrice(tieredPackagePrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(groupedTieredPrice: PriceModel.GroupedTieredPrice) =
            addPrice(PriceModel.ofGroupedTieredPrice(groupedTieredPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(tieredWithMinimumPrice: PriceModel.TieredWithMinimumPrice) =
            addPrice(PriceModel.ofTieredWithMinimumPrice(tieredWithMinimumPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(tieredPackageWithMinimumPrice: PriceModel.TieredPackageWithMinimumPrice) =
            addPrice(PriceModel.ofTieredPackageWithMinimumPrice(tieredPackageWithMinimumPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(packageWithAllocationPrice: PriceModel.PackageWithAllocationPrice) =
            addPrice(PriceModel.ofPackageWithAllocationPrice(packageWithAllocationPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(unitWithPercentPrice: PriceModel.UnitWithPercentPrice) =
            addPrice(PriceModel.ofUnitWithPercentPrice(unitWithPercentPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(matrixWithAllocationPrice: PriceModel.MatrixWithAllocationPrice) =
            addPrice(PriceModel.ofMatrixWithAllocationPrice(matrixWithAllocationPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(tieredWithProrationPrice: PriceModel.TieredWithProrationPrice) =
            addPrice(PriceModel.ofTieredWithProrationPrice(tieredWithProrationPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(unitWithProrationPrice: PriceModel.UnitWithProrationPrice) =
            addPrice(PriceModel.ofUnitWithProrationPrice(unitWithProrationPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(groupedAllocationPrice: PriceModel.GroupedAllocationPrice) =
            addPrice(PriceModel.ofGroupedAllocationPrice(groupedAllocationPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(groupedWithProratedMinimumPrice: PriceModel.GroupedWithProratedMinimumPrice) =
            addPrice(PriceModel.ofGroupedWithProratedMinimumPrice(groupedWithProratedMinimumPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(groupedWithMeteredMinimumPrice: PriceModel.GroupedWithMeteredMinimumPrice) =
            addPrice(PriceModel.ofGroupedWithMeteredMinimumPrice(groupedWithMeteredMinimumPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(matrixWithDisplayNamePrice: PriceModel.MatrixWithDisplayNamePrice) =
            addPrice(PriceModel.ofMatrixWithDisplayNamePrice(matrixWithDisplayNamePrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(bulkWithProrationPrice: PriceModel.BulkWithProrationPrice) =
            addPrice(PriceModel.ofBulkWithProrationPrice(bulkWithProrationPrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(groupedTieredPackagePrice: PriceModel.GroupedTieredPackagePrice) =
            addPrice(PriceModel.ofGroupedTieredPackagePrice(groupedTieredPackagePrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(maxGroupTieredPackagePrice: PriceModel.MaxGroupTieredPackagePrice) =
            addPrice(PriceModel.ofMaxGroupTieredPackagePrice(maxGroupTieredPackagePrice))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(
            scalableMatrixWithUnitPricingPrice: PriceModel.ScalableMatrixWithUnitPricingPrice
        ) =
            addPrice(
                PriceModel.ofScalableMatrixWithUnitPricingPrice(scalableMatrixWithUnitPricingPrice)
            )

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(
            scalableMatrixWithTieredPricingPrice: PriceModel.ScalableMatrixWithTieredPricingPrice
        ) =
            addPrice(
                PriceModel.ofScalableMatrixWithTieredPricingPrice(
                    scalableMatrixWithTieredPricingPrice
                )
            )

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun addPrice(cumulativeGroupedBulkPrice: PriceModel.CumulativeGroupedBulkPrice) =
            addPrice(PriceModel.ofCumulativeGroupedBulkPrice(cumulativeGroupedBulkPrice))

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

        fun build(): PlanModel =
            PlanModel(
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
        private val maximum: JsonField<MaximumModel> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minimum")
        @ExcludeMissing
        private val minimum: JsonField<MinimumModel> = JsonMissing.of(),
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

        fun maximum(): MaximumModel? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        fun minimum(): MinimumModel? = minimum.getNullable("minimum")

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

        @JsonProperty("maximum") @ExcludeMissing fun _maximum(): JsonField<MaximumModel> = maximum

        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        @JsonProperty("minimum") @ExcludeMissing fun _minimum(): JsonField<MinimumModel> = minimum

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

            /**
             * Returns a mutable builder for constructing an instance of [PlanPhase].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .description()
             * .discount()
             * .duration()
             * .durationUnit()
             * .maximum()
             * .maximumAmount()
             * .minimum()
             * .minimumAmount()
             * .name()
             * .order()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PlanPhase]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var discount: JsonField<Discount>? = null
            private var duration: JsonField<Long>? = null
            private var durationUnit: JsonField<DurationUnit>? = null
            private var maximum: JsonField<MaximumModel>? = null
            private var maximumAmount: JsonField<String>? = null
            private var minimum: JsonField<MinimumModel>? = null
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

            fun maximum(maximum: MaximumModel?) = maximum(JsonField.ofNullable(maximum))

            fun maximum(maximum: JsonField<MaximumModel>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String?) =
                maximumAmount(JsonField.ofNullable(maximumAmount))

            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun minimum(minimum: MinimumModel?) = minimum(JsonField.ofNullable(minimum))

            fun minimum(minimum: JsonField<MinimumModel>) = apply { this.minimum = minimum }

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

        class DurationUnit @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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

            /**
             * Returns a mutable builder for constructing an instance of [Product].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .createdAt()
             * .name()
             * ```
             */
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

            /**
             * Returns a mutable builder for constructing an instance of [TrialConfig].
             *
             * The following fields are required:
             * ```kotlin
             * .trialPeriod()
             * .trialPeriodUnit()
             * ```
             */
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
        private constructor(private val value: JsonField<String>) : Enum {

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
                DAYS
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

        return /* spotless:off */ other is PlanModel && id == other.id && adjustments == other.adjustments && basePlan == other.basePlan && basePlanId == other.basePlanId && createdAt == other.createdAt && currency == other.currency && defaultInvoiceMemo == other.defaultInvoiceMemo && description == other.description && discount == other.discount && externalPlanId == other.externalPlanId && invoicingCurrency == other.invoicingCurrency && maximum == other.maximum && maximumAmount == other.maximumAmount && metadata == other.metadata && minimum == other.minimum && minimumAmount == other.minimumAmount && name == other.name && netTerms == other.netTerms && planPhases == other.planPhases && prices == other.prices && product == other.product && status == other.status && trialConfig == other.trialConfig && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, adjustments, basePlan, basePlanId, createdAt, currency, defaultInvoiceMemo, description, discount, externalPlanId, invoicingCurrency, maximum, maximumAmount, metadata, minimum, minimumAmount, name, netTerms, planPhases, prices, product, status, trialConfig, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanModel{id=$id, adjustments=$adjustments, basePlan=$basePlan, basePlanId=$basePlanId, createdAt=$createdAt, currency=$currency, defaultInvoiceMemo=$defaultInvoiceMemo, description=$description, discount=$discount, externalPlanId=$externalPlanId, invoicingCurrency=$invoicingCurrency, maximum=$maximum, maximumAmount=$maximumAmount, metadata=$metadata, minimum=$minimum, minimumAmount=$minimumAmount, name=$name, netTerms=$netTerms, planPhases=$planPhases, prices=$prices, product=$product, status=$status, trialConfig=$trialConfig, version=$version, additionalProperties=$additionalProperties}"
}
