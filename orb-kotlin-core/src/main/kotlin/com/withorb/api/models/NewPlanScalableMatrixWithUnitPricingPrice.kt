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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class NewPlanScalableMatrixWithUnitPricingPrice
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cadence: JsonField<Cadence>,
    private val itemId: JsonField<String>,
    private val modelType: JsonField<ModelType>,
    private val name: JsonField<String>,
    private val scalableMatrixWithUnitPricingConfig: JsonField<ScalableMatrixWithUnitPricingConfig>,
    private val billableMetricId: JsonField<String>,
    private val billedInAdvance: JsonField<Boolean>,
    private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
    private val conversionRate: JsonField<Double>,
    private val conversionRateConfig: JsonField<ConversionRateConfig>,
    private val currency: JsonField<String>,
    private val dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>,
    private val externalPriceId: JsonField<String>,
    private val fixedPriceQuantity: JsonField<Double>,
    private val invoiceGroupingKey: JsonField<String>,
    private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
    private val metadata: JsonField<Metadata>,
    private val referenceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cadence") @ExcludeMissing cadence: JsonField<Cadence> = JsonMissing.of(),
        @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model_type")
        @ExcludeMissing
        modelType: JsonField<ModelType> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scalable_matrix_with_unit_pricing_config")
        @ExcludeMissing
        scalableMatrixWithUnitPricingConfig: JsonField<ScalableMatrixWithUnitPricingConfig> =
            JsonMissing.of(),
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        billableMetricId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billed_in_advance")
        @ExcludeMissing
        billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("billing_cycle_configuration")
        @ExcludeMissing
        billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> = JsonMissing.of(),
        @JsonProperty("conversion_rate")
        @ExcludeMissing
        conversionRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("conversion_rate_config")
        @ExcludeMissing
        conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dimensional_price_configuration")
        @ExcludeMissing
        dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
            JsonMissing.of(),
        @JsonProperty("external_price_id")
        @ExcludeMissing
        externalPriceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("invoice_grouping_key")
        @ExcludeMissing
        invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoicing_cycle_configuration")
        @ExcludeMissing
        invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("reference_id")
        @ExcludeMissing
        referenceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        cadence,
        itemId,
        modelType,
        name,
        scalableMatrixWithUnitPricingConfig,
        billableMetricId,
        billedInAdvance,
        billingCycleConfiguration,
        conversionRate,
        conversionRateConfig,
        currency,
        dimensionalPriceConfiguration,
        externalPriceId,
        fixedPriceQuantity,
        invoiceGroupingKey,
        invoicingCycleConfiguration,
        metadata,
        referenceId,
        mutableMapOf(),
    )

    /**
     * The cadence to bill for this price on.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cadence(): Cadence = cadence.getRequired("cadence")

    /**
     * The id of the item the price will be associated with.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun itemId(): String = itemId.getRequired("item_id")

    /**
     * The pricing model type
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modelType(): ModelType = modelType.getRequired("model_type")

    /**
     * The name of the price.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Configuration for scalable_matrix_with_unit_pricing pricing
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scalableMatrixWithUnitPricingConfig(): ScalableMatrixWithUnitPricingConfig =
        scalableMatrixWithUnitPricingConfig.getRequired("scalable_matrix_with_unit_pricing_config")

    /**
     * The id of the billable metric for the price. Only needed if the price is usage-based.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

    /**
     * If the Price represents a fixed cost, the price will be billed in-advance if this is true,
     * and in-arrears if this is false.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

    /**
     * For custom cadence: specifies the duration of the billing period in days or months.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
        billingCycleConfiguration.getNullable("billing_cycle_configuration")

    /**
     * The per unit conversion rate of the price currency to the invoicing currency.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

    /**
     * The configuration for the rate of the price currency to the invoicing currency.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun conversionRateConfig(): ConversionRateConfig? =
        conversionRateConfig.getNullable("conversion_rate_config")

    /**
     * An ISO 4217 currency string, or custom pricing unit identifier, in which this price is
     * billed.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currency(): String? = currency.getNullable("currency")

    /**
     * For dimensional price: specifies a price group and dimension values
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
        dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

    /**
     * An alias for the price.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

    /**
     * If the Price represents a fixed cost, this represents the quantity of units applied.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun fixedPriceQuantity(): Double? = fixedPriceQuantity.getNullable("fixed_price_quantity")

    /**
     * The property used to group this price on an invoice
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun invoiceGroupingKey(): String? = invoiceGroupingKey.getNullable("invoice_grouping_key")

    /**
     * Within each billing cycle, specifies the cadence at which invoices are produced. If
     * unspecified, a single invoice is produced per billing cycle.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
        invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /**
     * A transient ID that can be used to reference this price when adding adjustments in the same
     * API call.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun referenceId(): String? = referenceId.getNullable("reference_id")

    /**
     * Returns the raw JSON value of [cadence].
     *
     * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

    /**
     * Returns the raw JSON value of [itemId].
     *
     * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

    /**
     * Returns the raw JSON value of [modelType].
     *
     * Unlike [modelType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonField<ModelType> = modelType

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [scalableMatrixWithUnitPricingConfig].
     *
     * Unlike [scalableMatrixWithUnitPricingConfig], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("scalable_matrix_with_unit_pricing_config")
    @ExcludeMissing
    fun _scalableMatrixWithUnitPricingConfig(): JsonField<ScalableMatrixWithUnitPricingConfig> =
        scalableMatrixWithUnitPricingConfig

    /**
     * Returns the raw JSON value of [billableMetricId].
     *
     * Unlike [billableMetricId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("billable_metric_id")
    @ExcludeMissing
    fun _billableMetricId(): JsonField<String> = billableMetricId

    /**
     * Returns the raw JSON value of [billedInAdvance].
     *
     * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billed_in_advance")
    @ExcludeMissing
    fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

    /**
     * Returns the raw JSON value of [billingCycleConfiguration].
     *
     * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("billing_cycle_configuration")
    @ExcludeMissing
    fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
        billingCycleConfiguration

    /**
     * Returns the raw JSON value of [conversionRate].
     *
     * Unlike [conversionRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conversion_rate")
    @ExcludeMissing
    fun _conversionRate(): JsonField<Double> = conversionRate

    /**
     * Returns the raw JSON value of [conversionRateConfig].
     *
     * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("conversion_rate_config")
    @ExcludeMissing
    fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [dimensionalPriceConfiguration].
     *
     * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("dimensional_price_configuration")
    @ExcludeMissing
    fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
        dimensionalPriceConfiguration

    /**
     * Returns the raw JSON value of [externalPriceId].
     *
     * Unlike [externalPriceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_price_id")
    @ExcludeMissing
    fun _externalPriceId(): JsonField<String> = externalPriceId

    /**
     * Returns the raw JSON value of [fixedPriceQuantity].
     *
     * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fixed_price_quantity")
    @ExcludeMissing
    fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

    /**
     * Returns the raw JSON value of [invoiceGroupingKey].
     *
     * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("invoice_grouping_key")
    @ExcludeMissing
    fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

    /**
     * Returns the raw JSON value of [invoicingCycleConfiguration].
     *
     * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("invoicing_cycle_configuration")
    @ExcludeMissing
    fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
        invoicingCycleConfiguration

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [referenceId].
     *
     * Unlike [referenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reference_id")
    @ExcludeMissing
    fun _referenceId(): JsonField<String> = referenceId

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
         * Returns a mutable builder for constructing an instance of
         * [NewPlanScalableMatrixWithUnitPricingPrice].
         *
         * The following fields are required:
         * ```kotlin
         * .cadence()
         * .itemId()
         * .modelType()
         * .name()
         * .scalableMatrixWithUnitPricingConfig()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [NewPlanScalableMatrixWithUnitPricingPrice]. */
    class Builder internal constructor() {

        private var cadence: JsonField<Cadence>? = null
        private var itemId: JsonField<String>? = null
        private var modelType: JsonField<ModelType>? = null
        private var name: JsonField<String>? = null
        private var scalableMatrixWithUnitPricingConfig:
            JsonField<ScalableMatrixWithUnitPricingConfig>? =
            null
        private var billableMetricId: JsonField<String> = JsonMissing.of()
        private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
            JsonMissing.of()
        private var conversionRate: JsonField<Double> = JsonMissing.of()
        private var conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
            JsonMissing.of()
        private var externalPriceId: JsonField<String> = JsonMissing.of()
        private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
        private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
        private var invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
            JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var referenceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            newPlanScalableMatrixWithUnitPricingPrice: NewPlanScalableMatrixWithUnitPricingPrice
        ) = apply {
            cadence = newPlanScalableMatrixWithUnitPricingPrice.cadence
            itemId = newPlanScalableMatrixWithUnitPricingPrice.itemId
            modelType = newPlanScalableMatrixWithUnitPricingPrice.modelType
            name = newPlanScalableMatrixWithUnitPricingPrice.name
            scalableMatrixWithUnitPricingConfig =
                newPlanScalableMatrixWithUnitPricingPrice.scalableMatrixWithUnitPricingConfig
            billableMetricId = newPlanScalableMatrixWithUnitPricingPrice.billableMetricId
            billedInAdvance = newPlanScalableMatrixWithUnitPricingPrice.billedInAdvance
            billingCycleConfiguration =
                newPlanScalableMatrixWithUnitPricingPrice.billingCycleConfiguration
            conversionRate = newPlanScalableMatrixWithUnitPricingPrice.conversionRate
            conversionRateConfig = newPlanScalableMatrixWithUnitPricingPrice.conversionRateConfig
            currency = newPlanScalableMatrixWithUnitPricingPrice.currency
            dimensionalPriceConfiguration =
                newPlanScalableMatrixWithUnitPricingPrice.dimensionalPriceConfiguration
            externalPriceId = newPlanScalableMatrixWithUnitPricingPrice.externalPriceId
            fixedPriceQuantity = newPlanScalableMatrixWithUnitPricingPrice.fixedPriceQuantity
            invoiceGroupingKey = newPlanScalableMatrixWithUnitPricingPrice.invoiceGroupingKey
            invoicingCycleConfiguration =
                newPlanScalableMatrixWithUnitPricingPrice.invoicingCycleConfiguration
            metadata = newPlanScalableMatrixWithUnitPricingPrice.metadata
            referenceId = newPlanScalableMatrixWithUnitPricingPrice.referenceId
            additionalProperties =
                newPlanScalableMatrixWithUnitPricingPrice.additionalProperties.toMutableMap()
        }

        /** The cadence to bill for this price on. */
        fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

        /**
         * Sets [Builder.cadence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cadence] with a well-typed [Cadence] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

        /** The id of the item the price will be associated with. */
        fun itemId(itemId: String) = itemId(JsonField.of(itemId))

        /**
         * Sets [Builder.itemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.itemId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

        /** The pricing model type */
        fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

        /**
         * Sets [Builder.modelType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelType] with a well-typed [ModelType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

        /** The name of the price. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Configuration for scalable_matrix_with_unit_pricing pricing */
        fun scalableMatrixWithUnitPricingConfig(
            scalableMatrixWithUnitPricingConfig: ScalableMatrixWithUnitPricingConfig
        ) = scalableMatrixWithUnitPricingConfig(JsonField.of(scalableMatrixWithUnitPricingConfig))

        /**
         * Sets [Builder.scalableMatrixWithUnitPricingConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scalableMatrixWithUnitPricingConfig] with a well-typed
         * [ScalableMatrixWithUnitPricingConfig] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun scalableMatrixWithUnitPricingConfig(
            scalableMatrixWithUnitPricingConfig: JsonField<ScalableMatrixWithUnitPricingConfig>
        ) = apply { this.scalableMatrixWithUnitPricingConfig = scalableMatrixWithUnitPricingConfig }

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        fun billableMetricId(billableMetricId: String?) =
            billableMetricId(JsonField.ofNullable(billableMetricId))

        /**
         * Sets [Builder.billableMetricId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billableMetricId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            this.billableMetricId = billableMetricId
        }

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        fun billedInAdvance(billedInAdvance: Boolean?) =
            billedInAdvance(JsonField.ofNullable(billedInAdvance))

        /**
         * Alias for [Builder.billedInAdvance].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun billedInAdvance(billedInAdvance: Boolean) = billedInAdvance(billedInAdvance as Boolean?)

        /**
         * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
            this.billedInAdvance = billedInAdvance
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        fun billingCycleConfiguration(billingCycleConfiguration: NewBillingCycleConfiguration?) =
            billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

        /**
         * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCycleConfiguration] with a well-typed
         * [NewBillingCycleConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun billingCycleConfiguration(
            billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
        ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        fun conversionRate(conversionRate: Double?) =
            conversionRate(JsonField.ofNullable(conversionRate))

        /**
         * Alias for [Builder.conversionRate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

        /**
         * Sets [Builder.conversionRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversionRate] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conversionRate(conversionRate: JsonField<Double>) = apply {
            this.conversionRate = conversionRate
        }

        /** The configuration for the rate of the price currency to the invoicing currency. */
        fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
            conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

        /**
         * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversionRateConfig] with a well-typed
         * [ConversionRateConfig] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun conversionRateConfig(conversionRateConfig: JsonField<ConversionRateConfig>) = apply {
            this.conversionRateConfig = conversionRateConfig
        }

        /** Alias for calling [conversionRateConfig] with `ConversionRateConfig.ofUnit(unit)`. */
        fun conversionRateConfig(unit: UnitConversionRateConfig) =
            conversionRateConfig(ConversionRateConfig.ofUnit(unit))

        /**
         * Alias for calling [conversionRateConfig] with the following:
         * ```kotlin
         * UnitConversionRateConfig.builder()
         *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
         *     .unitConfig(unitConfig)
         *     .build()
         * ```
         */
        fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
            conversionRateConfig(
                UnitConversionRateConfig.builder()
                    .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                    .unitConfig(unitConfig)
                    .build()
            )

        /**
         * Alias for calling [conversionRateConfig] with `ConversionRateConfig.ofTiered(tiered)`.
         */
        fun conversionRateConfig(tiered: TieredConversionRateConfig) =
            conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

        /**
         * Alias for calling [conversionRateConfig] with the following:
         * ```kotlin
         * TieredConversionRateConfig.builder()
         *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
         *     .tieredConfig(tieredConfig)
         *     .build()
         * ```
         */
        fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
            conversionRateConfig(
                TieredConversionRateConfig.builder()
                    .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                    .tieredConfig(tieredConfig)
                    .build()
            )

        /**
         * An ISO 4217 currency string, or custom pricing unit identifier, in which this price is
         * billed.
         */
        fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** For dimensional price: specifies a price group and dimension values */
        fun dimensionalPriceConfiguration(
            dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
        ) = dimensionalPriceConfiguration(JsonField.ofNullable(dimensionalPriceConfiguration))

        /**
         * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dimensionalPriceConfiguration] with a well-typed
         * [NewDimensionalPriceConfiguration] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun dimensionalPriceConfiguration(
            dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
        ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

        /** An alias for the price. */
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

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
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

        /** The property used to group this price on an invoice */
        fun invoiceGroupingKey(invoiceGroupingKey: String?) =
            invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

        /**
         * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceGroupingKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
            this.invoiceGroupingKey = invoiceGroupingKey
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        fun invoicingCycleConfiguration(
            invoicingCycleConfiguration: NewBillingCycleConfiguration?
        ) = invoicingCycleConfiguration(JsonField.ofNullable(invoicingCycleConfiguration))

        /**
         * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoicingCycleConfiguration] with a well-typed
         * [NewBillingCycleConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun invoicingCycleConfiguration(
            invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
        ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * A transient ID that can be used to reference this price when adding adjustments in the
         * same API call.
         */
        fun referenceId(referenceId: String?) = referenceId(JsonField.ofNullable(referenceId))

        /**
         * Sets [Builder.referenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referenceId(referenceId: JsonField<String>) = apply { this.referenceId = referenceId }

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
         * Returns an immutable instance of [NewPlanScalableMatrixWithUnitPricingPrice].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .cadence()
         * .itemId()
         * .modelType()
         * .name()
         * .scalableMatrixWithUnitPricingConfig()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NewPlanScalableMatrixWithUnitPricingPrice =
            NewPlanScalableMatrixWithUnitPricingPrice(
                checkRequired("cadence", cadence),
                checkRequired("itemId", itemId),
                checkRequired("modelType", modelType),
                checkRequired("name", name),
                checkRequired(
                    "scalableMatrixWithUnitPricingConfig",
                    scalableMatrixWithUnitPricingConfig,
                ),
                billableMetricId,
                billedInAdvance,
                billingCycleConfiguration,
                conversionRate,
                conversionRateConfig,
                currency,
                dimensionalPriceConfiguration,
                externalPriceId,
                fixedPriceQuantity,
                invoiceGroupingKey,
                invoicingCycleConfiguration,
                metadata,
                referenceId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NewPlanScalableMatrixWithUnitPricingPrice = apply {
        if (validated) {
            return@apply
        }

        cadence().validate()
        itemId()
        modelType().validate()
        name()
        scalableMatrixWithUnitPricingConfig().validate()
        billableMetricId()
        billedInAdvance()
        billingCycleConfiguration()?.validate()
        conversionRate()
        conversionRateConfig()?.validate()
        currency()
        dimensionalPriceConfiguration()?.validate()
        externalPriceId()
        fixedPriceQuantity()
        invoiceGroupingKey()
        invoicingCycleConfiguration()?.validate()
        metadata()?.validate()
        referenceId()
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
        (cadence.asKnown()?.validity() ?: 0) +
            (if (itemId.asKnown() == null) 0 else 1) +
            (modelType.asKnown()?.validity() ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (scalableMatrixWithUnitPricingConfig.asKnown()?.validity() ?: 0) +
            (if (billableMetricId.asKnown() == null) 0 else 1) +
            (if (billedInAdvance.asKnown() == null) 0 else 1) +
            (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
            (if (conversionRate.asKnown() == null) 0 else 1) +
            (conversionRateConfig.asKnown()?.validity() ?: 0) +
            (if (currency.asKnown() == null) 0 else 1) +
            (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
            (if (externalPriceId.asKnown() == null) 0 else 1) +
            (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
            (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
            (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (referenceId.asKnown() == null) 0 else 1)

    /** The cadence to bill for this price on. */
    class Cadence @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ANNUAL = of("annual")

            val SEMI_ANNUAL = of("semi_annual")

            val MONTHLY = of("monthly")

            val QUARTERLY = of("quarterly")

            val ONE_TIME = of("one_time")

            val CUSTOM = of("custom")

            fun of(value: String) = Cadence(JsonField.of(value))
        }

        /** An enum containing [Cadence]'s known values. */
        enum class Known {
            ANNUAL,
            SEMI_ANNUAL,
            MONTHLY,
            QUARTERLY,
            ONE_TIME,
            CUSTOM,
        }

        /**
         * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Cadence] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ANNUAL,
            SEMI_ANNUAL,
            MONTHLY,
            QUARTERLY,
            ONE_TIME,
            CUSTOM,
            /** An enum member indicating that [Cadence] was instantiated with an unknown value. */
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
                ANNUAL -> Value.ANNUAL
                SEMI_ANNUAL -> Value.SEMI_ANNUAL
                MONTHLY -> Value.MONTHLY
                QUARTERLY -> Value.QUARTERLY
                ONE_TIME -> Value.ONE_TIME
                CUSTOM -> Value.CUSTOM
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
                ANNUAL -> Known.ANNUAL
                SEMI_ANNUAL -> Known.SEMI_ANNUAL
                MONTHLY -> Known.MONTHLY
                QUARTERLY -> Known.QUARTERLY
                ONE_TIME -> Known.ONE_TIME
                CUSTOM -> Known.CUSTOM
                else -> throw OrbInvalidDataException("Unknown Cadence: $value")
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

        fun validate(): Cadence = apply {
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

            return other is Cadence && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The pricing model type */
    class ModelType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val SCALABLE_MATRIX_WITH_UNIT_PRICING = of("scalable_matrix_with_unit_pricing")

            fun of(value: String) = ModelType(JsonField.of(value))
        }

        /** An enum containing [ModelType]'s known values. */
        enum class Known {
            SCALABLE_MATRIX_WITH_UNIT_PRICING
        }

        /**
         * An enum containing [ModelType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ModelType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SCALABLE_MATRIX_WITH_UNIT_PRICING,
            /**
             * An enum member indicating that [ModelType] was instantiated with an unknown value.
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
                SCALABLE_MATRIX_WITH_UNIT_PRICING -> Value.SCALABLE_MATRIX_WITH_UNIT_PRICING
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
                SCALABLE_MATRIX_WITH_UNIT_PRICING -> Known.SCALABLE_MATRIX_WITH_UNIT_PRICING
                else -> throw OrbInvalidDataException("Unknown ModelType: $value")
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

        fun validate(): ModelType = apply {
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

            return other is ModelType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Configuration for scalable_matrix_with_unit_pricing pricing */
    class ScalableMatrixWithUnitPricingConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val firstDimension: JsonField<String>,
        private val matrixScalingFactors: JsonField<List<MatrixScalingFactor>>,
        private val unitPrice: JsonField<String>,
        private val prorate: JsonField<Boolean>,
        private val secondDimension: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("first_dimension")
            @ExcludeMissing
            firstDimension: JsonField<String> = JsonMissing.of(),
            @JsonProperty("matrix_scaling_factors")
            @ExcludeMissing
            matrixScalingFactors: JsonField<List<MatrixScalingFactor>> = JsonMissing.of(),
            @JsonProperty("unit_price")
            @ExcludeMissing
            unitPrice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prorate") @ExcludeMissing prorate: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("second_dimension")
            @ExcludeMissing
            secondDimension: JsonField<String> = JsonMissing.of(),
        ) : this(
            firstDimension,
            matrixScalingFactors,
            unitPrice,
            prorate,
            secondDimension,
            mutableMapOf(),
        )

        /**
         * Used to determine the unit rate
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstDimension(): String = firstDimension.getRequired("first_dimension")

        /**
         * Apply a scaling factor to each dimension
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun matrixScalingFactors(): List<MatrixScalingFactor> =
            matrixScalingFactors.getRequired("matrix_scaling_factors")

        /**
         * The final unit price to rate against the output of the matrix
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unitPrice(): String = unitPrice.getRequired("unit_price")

        /**
         * If true, the unit price will be prorated to the billing period
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prorate(): Boolean? = prorate.getNullable("prorate")

        /**
         * Used to determine the unit rate (optional)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secondDimension(): String? = secondDimension.getNullable("second_dimension")

        /**
         * Returns the raw JSON value of [firstDimension].
         *
         * Unlike [firstDimension], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("first_dimension")
        @ExcludeMissing
        fun _firstDimension(): JsonField<String> = firstDimension

        /**
         * Returns the raw JSON value of [matrixScalingFactors].
         *
         * Unlike [matrixScalingFactors], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("matrix_scaling_factors")
        @ExcludeMissing
        fun _matrixScalingFactors(): JsonField<List<MatrixScalingFactor>> = matrixScalingFactors

        /**
         * Returns the raw JSON value of [unitPrice].
         *
         * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice(): JsonField<String> = unitPrice

        /**
         * Returns the raw JSON value of [prorate].
         *
         * Unlike [prorate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prorate") @ExcludeMissing fun _prorate(): JsonField<Boolean> = prorate

        /**
         * Returns the raw JSON value of [secondDimension].
         *
         * Unlike [secondDimension], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("second_dimension")
        @ExcludeMissing
        fun _secondDimension(): JsonField<String> = secondDimension

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
             * Returns a mutable builder for constructing an instance of
             * [ScalableMatrixWithUnitPricingConfig].
             *
             * The following fields are required:
             * ```kotlin
             * .firstDimension()
             * .matrixScalingFactors()
             * .unitPrice()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ScalableMatrixWithUnitPricingConfig]. */
        class Builder internal constructor() {

            private var firstDimension: JsonField<String>? = null
            private var matrixScalingFactors: JsonField<MutableList<MatrixScalingFactor>>? = null
            private var unitPrice: JsonField<String>? = null
            private var prorate: JsonField<Boolean> = JsonMissing.of()
            private var secondDimension: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                scalableMatrixWithUnitPricingConfig: ScalableMatrixWithUnitPricingConfig
            ) = apply {
                firstDimension = scalableMatrixWithUnitPricingConfig.firstDimension
                matrixScalingFactors =
                    scalableMatrixWithUnitPricingConfig.matrixScalingFactors.map {
                        it.toMutableList()
                    }
                unitPrice = scalableMatrixWithUnitPricingConfig.unitPrice
                prorate = scalableMatrixWithUnitPricingConfig.prorate
                secondDimension = scalableMatrixWithUnitPricingConfig.secondDimension
                additionalProperties =
                    scalableMatrixWithUnitPricingConfig.additionalProperties.toMutableMap()
            }

            /** Used to determine the unit rate */
            fun firstDimension(firstDimension: String) =
                firstDimension(JsonField.of(firstDimension))

            /**
             * Sets [Builder.firstDimension] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstDimension] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstDimension(firstDimension: JsonField<String>) = apply {
                this.firstDimension = firstDimension
            }

            /** Apply a scaling factor to each dimension */
            fun matrixScalingFactors(matrixScalingFactors: List<MatrixScalingFactor>) =
                matrixScalingFactors(JsonField.of(matrixScalingFactors))

            /**
             * Sets [Builder.matrixScalingFactors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matrixScalingFactors] with a well-typed
             * `List<MatrixScalingFactor>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun matrixScalingFactors(matrixScalingFactors: JsonField<List<MatrixScalingFactor>>) =
                apply {
                    this.matrixScalingFactors = matrixScalingFactors.map { it.toMutableList() }
                }

            /**
             * Adds a single [MatrixScalingFactor] to [matrixScalingFactors].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMatrixScalingFactor(matrixScalingFactor: MatrixScalingFactor) = apply {
                matrixScalingFactors =
                    (matrixScalingFactors ?: JsonField.of(mutableListOf())).also {
                        checkKnown("matrixScalingFactors", it).add(matrixScalingFactor)
                    }
            }

            /** The final unit price to rate against the output of the matrix */
            fun unitPrice(unitPrice: String) = unitPrice(JsonField.of(unitPrice))

            /**
             * Sets [Builder.unitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitPrice] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitPrice(unitPrice: JsonField<String>) = apply { this.unitPrice = unitPrice }

            /** If true, the unit price will be prorated to the billing period */
            fun prorate(prorate: Boolean?) = prorate(JsonField.ofNullable(prorate))

            /**
             * Alias for [Builder.prorate].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun prorate(prorate: Boolean) = prorate(prorate as Boolean?)

            /**
             * Sets [Builder.prorate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prorate] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prorate(prorate: JsonField<Boolean>) = apply { this.prorate = prorate }

            /** Used to determine the unit rate (optional) */
            fun secondDimension(secondDimension: String?) =
                secondDimension(JsonField.ofNullable(secondDimension))

            /**
             * Sets [Builder.secondDimension] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondDimension] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secondDimension(secondDimension: JsonField<String>) = apply {
                this.secondDimension = secondDimension
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
             * Returns an immutable instance of [ScalableMatrixWithUnitPricingConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .firstDimension()
             * .matrixScalingFactors()
             * .unitPrice()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ScalableMatrixWithUnitPricingConfig =
                ScalableMatrixWithUnitPricingConfig(
                    checkRequired("firstDimension", firstDimension),
                    checkRequired("matrixScalingFactors", matrixScalingFactors).map {
                        it.toImmutable()
                    },
                    checkRequired("unitPrice", unitPrice),
                    prorate,
                    secondDimension,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ScalableMatrixWithUnitPricingConfig = apply {
            if (validated) {
                return@apply
            }

            firstDimension()
            matrixScalingFactors().forEach { it.validate() }
            unitPrice()
            prorate()
            secondDimension()
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
            (if (firstDimension.asKnown() == null) 0 else 1) +
                (matrixScalingFactors.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (unitPrice.asKnown() == null) 0 else 1) +
                (if (prorate.asKnown() == null) 0 else 1) +
                (if (secondDimension.asKnown() == null) 0 else 1)

        /** Configuration for a single matrix scaling factor */
        class MatrixScalingFactor
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val firstDimensionValue: JsonField<String>,
            private val scalingFactor: JsonField<String>,
            private val secondDimensionValue: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("first_dimension_value")
                @ExcludeMissing
                firstDimensionValue: JsonField<String> = JsonMissing.of(),
                @JsonProperty("scaling_factor")
                @ExcludeMissing
                scalingFactor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("second_dimension_value")
                @ExcludeMissing
                secondDimensionValue: JsonField<String> = JsonMissing.of(),
            ) : this(firstDimensionValue, scalingFactor, secondDimensionValue, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun firstDimensionValue(): String =
                firstDimensionValue.getRequired("first_dimension_value")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun scalingFactor(): String = scalingFactor.getRequired("scaling_factor")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun secondDimensionValue(): String? =
                secondDimensionValue.getNullable("second_dimension_value")

            /**
             * Returns the raw JSON value of [firstDimensionValue].
             *
             * Unlike [firstDimensionValue], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("first_dimension_value")
            @ExcludeMissing
            fun _firstDimensionValue(): JsonField<String> = firstDimensionValue

            /**
             * Returns the raw JSON value of [scalingFactor].
             *
             * Unlike [scalingFactor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("scaling_factor")
            @ExcludeMissing
            fun _scalingFactor(): JsonField<String> = scalingFactor

            /**
             * Returns the raw JSON value of [secondDimensionValue].
             *
             * Unlike [secondDimensionValue], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("second_dimension_value")
            @ExcludeMissing
            fun _secondDimensionValue(): JsonField<String> = secondDimensionValue

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
                 * Returns a mutable builder for constructing an instance of [MatrixScalingFactor].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .firstDimensionValue()
                 * .scalingFactor()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MatrixScalingFactor]. */
            class Builder internal constructor() {

                private var firstDimensionValue: JsonField<String>? = null
                private var scalingFactor: JsonField<String>? = null
                private var secondDimensionValue: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(matrixScalingFactor: MatrixScalingFactor) = apply {
                    firstDimensionValue = matrixScalingFactor.firstDimensionValue
                    scalingFactor = matrixScalingFactor.scalingFactor
                    secondDimensionValue = matrixScalingFactor.secondDimensionValue
                    additionalProperties = matrixScalingFactor.additionalProperties.toMutableMap()
                }

                fun firstDimensionValue(firstDimensionValue: String) =
                    firstDimensionValue(JsonField.of(firstDimensionValue))

                /**
                 * Sets [Builder.firstDimensionValue] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.firstDimensionValue] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun firstDimensionValue(firstDimensionValue: JsonField<String>) = apply {
                    this.firstDimensionValue = firstDimensionValue
                }

                fun scalingFactor(scalingFactor: String) =
                    scalingFactor(JsonField.of(scalingFactor))

                /**
                 * Sets [Builder.scalingFactor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scalingFactor] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun scalingFactor(scalingFactor: JsonField<String>) = apply {
                    this.scalingFactor = scalingFactor
                }

                fun secondDimensionValue(secondDimensionValue: String?) =
                    secondDimensionValue(JsonField.ofNullable(secondDimensionValue))

                /**
                 * Sets [Builder.secondDimensionValue] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.secondDimensionValue] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun secondDimensionValue(secondDimensionValue: JsonField<String>) = apply {
                    this.secondDimensionValue = secondDimensionValue
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

                /**
                 * Returns an immutable instance of [MatrixScalingFactor].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .firstDimensionValue()
                 * .scalingFactor()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MatrixScalingFactor =
                    MatrixScalingFactor(
                        checkRequired("firstDimensionValue", firstDimensionValue),
                        checkRequired("scalingFactor", scalingFactor),
                        secondDimensionValue,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MatrixScalingFactor = apply {
                if (validated) {
                    return@apply
                }

                firstDimensionValue()
                scalingFactor()
                secondDimensionValue()
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
                (if (firstDimensionValue.asKnown() == null) 0 else 1) +
                    (if (scalingFactor.asKnown() == null) 0 else 1) +
                    (if (secondDimensionValue.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MatrixScalingFactor &&
                    firstDimensionValue == other.firstDimensionValue &&
                    scalingFactor == other.scalingFactor &&
                    secondDimensionValue == other.secondDimensionValue &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    firstDimensionValue,
                    scalingFactor,
                    secondDimensionValue,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MatrixScalingFactor{firstDimensionValue=$firstDimensionValue, scalingFactor=$scalingFactor, secondDimensionValue=$secondDimensionValue, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ScalableMatrixWithUnitPricingConfig &&
                firstDimension == other.firstDimension &&
                matrixScalingFactors == other.matrixScalingFactors &&
                unitPrice == other.unitPrice &&
                prorate == other.prorate &&
                secondDimension == other.secondDimension &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                firstDimension,
                matrixScalingFactors,
                unitPrice,
                prorate,
                secondDimension,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScalableMatrixWithUnitPricingConfig{firstDimension=$firstDimension, matrixScalingFactors=$matrixScalingFactors, unitPrice=$unitPrice, prorate=$prorate, secondDimension=$secondDimension, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NewPlanScalableMatrixWithUnitPricingPrice &&
            cadence == other.cadence &&
            itemId == other.itemId &&
            modelType == other.modelType &&
            name == other.name &&
            scalableMatrixWithUnitPricingConfig == other.scalableMatrixWithUnitPricingConfig &&
            billableMetricId == other.billableMetricId &&
            billedInAdvance == other.billedInAdvance &&
            billingCycleConfiguration == other.billingCycleConfiguration &&
            conversionRate == other.conversionRate &&
            conversionRateConfig == other.conversionRateConfig &&
            currency == other.currency &&
            dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
            externalPriceId == other.externalPriceId &&
            fixedPriceQuantity == other.fixedPriceQuantity &&
            invoiceGroupingKey == other.invoiceGroupingKey &&
            invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
            metadata == other.metadata &&
            referenceId == other.referenceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            cadence,
            itemId,
            modelType,
            name,
            scalableMatrixWithUnitPricingConfig,
            billableMetricId,
            billedInAdvance,
            billingCycleConfiguration,
            conversionRate,
            conversionRateConfig,
            currency,
            dimensionalPriceConfiguration,
            externalPriceId,
            fixedPriceQuantity,
            invoiceGroupingKey,
            invoicingCycleConfiguration,
            metadata,
            referenceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NewPlanScalableMatrixWithUnitPricingPrice{cadence=$cadence, itemId=$itemId, modelType=$modelType, name=$name, scalableMatrixWithUnitPricingConfig=$scalableMatrixWithUnitPricingConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, currency=$currency, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, referenceId=$referenceId, additionalProperties=$additionalProperties}"
}
