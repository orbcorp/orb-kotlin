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

class NewSubscriptionMatrixWithDisplayNamePrice
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cadence: JsonField<Cadence>,
    private val itemId: JsonField<String>,
    private val matrixWithDisplayNameConfig: JsonField<MatrixWithDisplayNameConfig>,
    private val modelType: JsonField<ModelType>,
    private val name: JsonField<String>,
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
        @JsonProperty("matrix_with_display_name_config")
        @ExcludeMissing
        matrixWithDisplayNameConfig: JsonField<MatrixWithDisplayNameConfig> = JsonMissing.of(),
        @JsonProperty("model_type")
        @ExcludeMissing
        modelType: JsonField<ModelType> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
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
        matrixWithDisplayNameConfig,
        modelType,
        name,
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
     * Configuration for matrix_with_display_name pricing
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun matrixWithDisplayNameConfig(): MatrixWithDisplayNameConfig =
        matrixWithDisplayNameConfig.getRequired("matrix_with_display_name_config")

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
     * Returns the raw JSON value of [matrixWithDisplayNameConfig].
     *
     * Unlike [matrixWithDisplayNameConfig], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("matrix_with_display_name_config")
    @ExcludeMissing
    fun _matrixWithDisplayNameConfig(): JsonField<MatrixWithDisplayNameConfig> =
        matrixWithDisplayNameConfig

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
         * [NewSubscriptionMatrixWithDisplayNamePrice].
         *
         * The following fields are required:
         * ```kotlin
         * .cadence()
         * .itemId()
         * .matrixWithDisplayNameConfig()
         * .modelType()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [NewSubscriptionMatrixWithDisplayNamePrice]. */
    class Builder internal constructor() {

        private var cadence: JsonField<Cadence>? = null
        private var itemId: JsonField<String>? = null
        private var matrixWithDisplayNameConfig: JsonField<MatrixWithDisplayNameConfig>? = null
        private var modelType: JsonField<ModelType>? = null
        private var name: JsonField<String>? = null
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
            newSubscriptionMatrixWithDisplayNamePrice: NewSubscriptionMatrixWithDisplayNamePrice
        ) = apply {
            cadence = newSubscriptionMatrixWithDisplayNamePrice.cadence
            itemId = newSubscriptionMatrixWithDisplayNamePrice.itemId
            matrixWithDisplayNameConfig =
                newSubscriptionMatrixWithDisplayNamePrice.matrixWithDisplayNameConfig
            modelType = newSubscriptionMatrixWithDisplayNamePrice.modelType
            name = newSubscriptionMatrixWithDisplayNamePrice.name
            billableMetricId = newSubscriptionMatrixWithDisplayNamePrice.billableMetricId
            billedInAdvance = newSubscriptionMatrixWithDisplayNamePrice.billedInAdvance
            billingCycleConfiguration =
                newSubscriptionMatrixWithDisplayNamePrice.billingCycleConfiguration
            conversionRate = newSubscriptionMatrixWithDisplayNamePrice.conversionRate
            conversionRateConfig = newSubscriptionMatrixWithDisplayNamePrice.conversionRateConfig
            currency = newSubscriptionMatrixWithDisplayNamePrice.currency
            dimensionalPriceConfiguration =
                newSubscriptionMatrixWithDisplayNamePrice.dimensionalPriceConfiguration
            externalPriceId = newSubscriptionMatrixWithDisplayNamePrice.externalPriceId
            fixedPriceQuantity = newSubscriptionMatrixWithDisplayNamePrice.fixedPriceQuantity
            invoiceGroupingKey = newSubscriptionMatrixWithDisplayNamePrice.invoiceGroupingKey
            invoicingCycleConfiguration =
                newSubscriptionMatrixWithDisplayNamePrice.invoicingCycleConfiguration
            metadata = newSubscriptionMatrixWithDisplayNamePrice.metadata
            referenceId = newSubscriptionMatrixWithDisplayNamePrice.referenceId
            additionalProperties =
                newSubscriptionMatrixWithDisplayNamePrice.additionalProperties.toMutableMap()
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

        /** Configuration for matrix_with_display_name pricing */
        fun matrixWithDisplayNameConfig(matrixWithDisplayNameConfig: MatrixWithDisplayNameConfig) =
            matrixWithDisplayNameConfig(JsonField.of(matrixWithDisplayNameConfig))

        /**
         * Sets [Builder.matrixWithDisplayNameConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matrixWithDisplayNameConfig] with a well-typed
         * [MatrixWithDisplayNameConfig] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun matrixWithDisplayNameConfig(
            matrixWithDisplayNameConfig: JsonField<MatrixWithDisplayNameConfig>
        ) = apply { this.matrixWithDisplayNameConfig = matrixWithDisplayNameConfig }

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
         * Returns an immutable instance of [NewSubscriptionMatrixWithDisplayNamePrice].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .cadence()
         * .itemId()
         * .matrixWithDisplayNameConfig()
         * .modelType()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NewSubscriptionMatrixWithDisplayNamePrice =
            NewSubscriptionMatrixWithDisplayNamePrice(
                checkRequired("cadence", cadence),
                checkRequired("itemId", itemId),
                checkRequired("matrixWithDisplayNameConfig", matrixWithDisplayNameConfig),
                checkRequired("modelType", modelType),
                checkRequired("name", name),
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

    fun validate(): NewSubscriptionMatrixWithDisplayNamePrice = apply {
        if (validated) {
            return@apply
        }

        cadence().validate()
        itemId()
        matrixWithDisplayNameConfig().validate()
        modelType().validate()
        name()
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
            (matrixWithDisplayNameConfig.asKnown()?.validity() ?: 0) +
            (modelType.asKnown()?.validity() ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
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

    /** Configuration for matrix_with_display_name pricing */
    class MatrixWithDisplayNameConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dimension: JsonField<String>,
        private val unitAmounts: JsonField<List<UnitAmount>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dimension")
            @ExcludeMissing
            dimension: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unit_amounts")
            @ExcludeMissing
            unitAmounts: JsonField<List<UnitAmount>> = JsonMissing.of(),
        ) : this(dimension, unitAmounts, mutableMapOf())

        /**
         * Used to determine the unit rate
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dimension(): String = dimension.getRequired("dimension")

        /**
         * Apply per unit pricing to each dimension value
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unitAmounts(): List<UnitAmount> = unitAmounts.getRequired("unit_amounts")

        /**
         * Returns the raw JSON value of [dimension].
         *
         * Unlike [dimension], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimension") @ExcludeMissing fun _dimension(): JsonField<String> = dimension

        /**
         * Returns the raw JSON value of [unitAmounts].
         *
         * Unlike [unitAmounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit_amounts")
        @ExcludeMissing
        fun _unitAmounts(): JsonField<List<UnitAmount>> = unitAmounts

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
             * [MatrixWithDisplayNameConfig].
             *
             * The following fields are required:
             * ```kotlin
             * .dimension()
             * .unitAmounts()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [MatrixWithDisplayNameConfig]. */
        class Builder internal constructor() {

            private var dimension: JsonField<String>? = null
            private var unitAmounts: JsonField<MutableList<UnitAmount>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(matrixWithDisplayNameConfig: MatrixWithDisplayNameConfig) = apply {
                dimension = matrixWithDisplayNameConfig.dimension
                unitAmounts = matrixWithDisplayNameConfig.unitAmounts.map { it.toMutableList() }
                additionalProperties =
                    matrixWithDisplayNameConfig.additionalProperties.toMutableMap()
            }

            /** Used to determine the unit rate */
            fun dimension(dimension: String) = dimension(JsonField.of(dimension))

            /**
             * Sets [Builder.dimension] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimension] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimension(dimension: JsonField<String>) = apply { this.dimension = dimension }

            /** Apply per unit pricing to each dimension value */
            fun unitAmounts(unitAmounts: List<UnitAmount>) = unitAmounts(JsonField.of(unitAmounts))

            /**
             * Sets [Builder.unitAmounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitAmounts] with a well-typed `List<UnitAmount>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun unitAmounts(unitAmounts: JsonField<List<UnitAmount>>) = apply {
                this.unitAmounts = unitAmounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [UnitAmount] to [unitAmounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUnitAmount(unitAmount: UnitAmount) = apply {
                unitAmounts =
                    (unitAmounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("unitAmounts", it).add(unitAmount)
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
             * Returns an immutable instance of [MatrixWithDisplayNameConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .dimension()
             * .unitAmounts()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): MatrixWithDisplayNameConfig =
                MatrixWithDisplayNameConfig(
                    checkRequired("dimension", dimension),
                    checkRequired("unitAmounts", unitAmounts).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): MatrixWithDisplayNameConfig = apply {
            if (validated) {
                return@apply
            }

            dimension()
            unitAmounts().forEach { it.validate() }
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
            (if (dimension.asKnown() == null) 0 else 1) +
                (unitAmounts.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        /** Configuration for a unit amount item */
        class UnitAmount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val dimensionValue: JsonField<String>,
            private val displayName: JsonField<String>,
            private val unitAmount: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("dimension_value")
                @ExcludeMissing
                dimensionValue: JsonField<String> = JsonMissing.of(),
                @JsonProperty("display_name")
                @ExcludeMissing
                displayName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("unit_amount")
                @ExcludeMissing
                unitAmount: JsonField<String> = JsonMissing.of(),
            ) : this(dimensionValue, displayName, unitAmount, mutableMapOf())

            /**
             * The dimension value
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun dimensionValue(): String = dimensionValue.getRequired("dimension_value")

            /**
             * Display name for this dimension value
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun displayName(): String = displayName.getRequired("display_name")

            /**
             * Per unit amount
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun unitAmount(): String = unitAmount.getRequired("unit_amount")

            /**
             * Returns the raw JSON value of [dimensionValue].
             *
             * Unlike [dimensionValue], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("dimension_value")
            @ExcludeMissing
            fun _dimensionValue(): JsonField<String> = dimensionValue

            /**
             * Returns the raw JSON value of [displayName].
             *
             * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("display_name")
            @ExcludeMissing
            fun _displayName(): JsonField<String> = displayName

            /**
             * Returns the raw JSON value of [unitAmount].
             *
             * Unlike [unitAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unit_amount")
            @ExcludeMissing
            fun _unitAmount(): JsonField<String> = unitAmount

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
                 * Returns a mutable builder for constructing an instance of [UnitAmount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .dimensionValue()
                 * .displayName()
                 * .unitAmount()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UnitAmount]. */
            class Builder internal constructor() {

                private var dimensionValue: JsonField<String>? = null
                private var displayName: JsonField<String>? = null
                private var unitAmount: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unitAmount: UnitAmount) = apply {
                    dimensionValue = unitAmount.dimensionValue
                    displayName = unitAmount.displayName
                    this.unitAmount = unitAmount.unitAmount
                    additionalProperties = unitAmount.additionalProperties.toMutableMap()
                }

                /** The dimension value */
                fun dimensionValue(dimensionValue: String) =
                    dimensionValue(JsonField.of(dimensionValue))

                /**
                 * Sets [Builder.dimensionValue] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dimensionValue] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dimensionValue(dimensionValue: JsonField<String>) = apply {
                    this.dimensionValue = dimensionValue
                }

                /** Display name for this dimension value */
                fun displayName(displayName: String) = displayName(JsonField.of(displayName))

                /**
                 * Sets [Builder.displayName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.displayName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun displayName(displayName: JsonField<String>) = apply {
                    this.displayName = displayName
                }

                /** Per unit amount */
                fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                /**
                 * Sets [Builder.unitAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unitAmount(unitAmount: JsonField<String>) = apply {
                    this.unitAmount = unitAmount
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
                 * Returns an immutable instance of [UnitAmount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .dimensionValue()
                 * .displayName()
                 * .unitAmount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnitAmount =
                    UnitAmount(
                        checkRequired("dimensionValue", dimensionValue),
                        checkRequired("displayName", displayName),
                        checkRequired("unitAmount", unitAmount),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UnitAmount = apply {
                if (validated) {
                    return@apply
                }

                dimensionValue()
                displayName()
                unitAmount()
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
                (if (dimensionValue.asKnown() == null) 0 else 1) +
                    (if (displayName.asKnown() == null) 0 else 1) +
                    (if (unitAmount.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnitAmount &&
                    dimensionValue == other.dimensionValue &&
                    displayName == other.displayName &&
                    unitAmount == other.unitAmount &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(dimensionValue, displayName, unitAmount, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnitAmount{dimensionValue=$dimensionValue, displayName=$displayName, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MatrixWithDisplayNameConfig &&
                dimension == other.dimension &&
                unitAmounts == other.unitAmounts &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(dimension, unitAmounts, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MatrixWithDisplayNameConfig{dimension=$dimension, unitAmounts=$unitAmounts, additionalProperties=$additionalProperties}"
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

            val MATRIX_WITH_DISPLAY_NAME = of("matrix_with_display_name")

            fun of(value: String) = ModelType(JsonField.of(value))
        }

        /** An enum containing [ModelType]'s known values. */
        enum class Known {
            MATRIX_WITH_DISPLAY_NAME
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
            MATRIX_WITH_DISPLAY_NAME,
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
                MATRIX_WITH_DISPLAY_NAME -> Value.MATRIX_WITH_DISPLAY_NAME
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
                MATRIX_WITH_DISPLAY_NAME -> Known.MATRIX_WITH_DISPLAY_NAME
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

        return other is NewSubscriptionMatrixWithDisplayNamePrice &&
            cadence == other.cadence &&
            itemId == other.itemId &&
            matrixWithDisplayNameConfig == other.matrixWithDisplayNameConfig &&
            modelType == other.modelType &&
            name == other.name &&
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
            matrixWithDisplayNameConfig,
            modelType,
            name,
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
        "NewSubscriptionMatrixWithDisplayNamePrice{cadence=$cadence, itemId=$itemId, matrixWithDisplayNameConfig=$matrixWithDisplayNameConfig, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, currency=$currency, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, referenceId=$referenceId, additionalProperties=$additionalProperties}"
}
