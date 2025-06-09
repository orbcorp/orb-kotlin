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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class NewFloatingTieredPrice
private constructor(
    private val cadence: JsonField<Cadence>,
    private val currency: JsonField<String>,
    private val itemId: JsonField<String>,
    private val modelType: JsonField<ModelType>,
    private val name: JsonField<String>,
    private val tieredConfig: JsonField<TieredConfig>,
    private val billableMetricId: JsonField<String>,
    private val billedInAdvance: JsonField<Boolean>,
    private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
    private val conversionRate: JsonField<Double>,
    private val conversionRateConfig: JsonField<ConversionRateConfig>,
    private val dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>,
    private val externalPriceId: JsonField<String>,
    private val fixedPriceQuantity: JsonField<Double>,
    private val invoiceGroupingKey: JsonField<String>,
    private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
    private val metadata: JsonField<Metadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cadence") @ExcludeMissing cadence: JsonField<Cadence> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model_type")
        @ExcludeMissing
        modelType: JsonField<ModelType> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tiered_config")
        @ExcludeMissing
        tieredConfig: JsonField<TieredConfig> = JsonMissing.of(),
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
    ) : this(
        cadence,
        currency,
        itemId,
        modelType,
        name,
        tieredConfig,
        billableMetricId,
        billedInAdvance,
        billingCycleConfiguration,
        conversionRate,
        conversionRateConfig,
        dimensionalPriceConfiguration,
        externalPriceId,
        fixedPriceQuantity,
        invoiceGroupingKey,
        invoicingCycleConfiguration,
        metadata,
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
     * An ISO 4217 currency string for which this price is billed in.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The id of the item the price will be associated with.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun itemId(): String = itemId.getRequired("item_id")

    /**
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
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tieredConfig(): TieredConfig = tieredConfig.getRequired("tiered_config")

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
     * Returns the raw JSON value of [cadence].
     *
     * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cadence") @ExcludeMissing fun _cadence(): JsonField<Cadence> = cadence

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
     * Returns the raw JSON value of [tieredConfig].
     *
     * Unlike [tieredConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tiered_config")
    @ExcludeMissing
    fun _tieredConfig(): JsonField<TieredConfig> = tieredConfig

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
         * Returns a mutable builder for constructing an instance of [NewFloatingTieredPrice].
         *
         * The following fields are required:
         * ```kotlin
         * .cadence()
         * .currency()
         * .itemId()
         * .modelType()
         * .name()
         * .tieredConfig()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [NewFloatingTieredPrice]. */
    class Builder internal constructor() {

        private var cadence: JsonField<Cadence>? = null
        private var currency: JsonField<String>? = null
        private var itemId: JsonField<String>? = null
        private var modelType: JsonField<ModelType>? = null
        private var name: JsonField<String>? = null
        private var tieredConfig: JsonField<TieredConfig>? = null
        private var billableMetricId: JsonField<String> = JsonMissing.of()
        private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
        private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
            JsonMissing.of()
        private var conversionRate: JsonField<Double> = JsonMissing.of()
        private var conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of()
        private var dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
            JsonMissing.of()
        private var externalPriceId: JsonField<String> = JsonMissing.of()
        private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
        private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
        private var invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
            JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(newFloatingTieredPrice: NewFloatingTieredPrice) = apply {
            cadence = newFloatingTieredPrice.cadence
            currency = newFloatingTieredPrice.currency
            itemId = newFloatingTieredPrice.itemId
            modelType = newFloatingTieredPrice.modelType
            name = newFloatingTieredPrice.name
            tieredConfig = newFloatingTieredPrice.tieredConfig
            billableMetricId = newFloatingTieredPrice.billableMetricId
            billedInAdvance = newFloatingTieredPrice.billedInAdvance
            billingCycleConfiguration = newFloatingTieredPrice.billingCycleConfiguration
            conversionRate = newFloatingTieredPrice.conversionRate
            conversionRateConfig = newFloatingTieredPrice.conversionRateConfig
            dimensionalPriceConfiguration = newFloatingTieredPrice.dimensionalPriceConfiguration
            externalPriceId = newFloatingTieredPrice.externalPriceId
            fixedPriceQuantity = newFloatingTieredPrice.fixedPriceQuantity
            invoiceGroupingKey = newFloatingTieredPrice.invoiceGroupingKey
            invoicingCycleConfiguration = newFloatingTieredPrice.invoicingCycleConfiguration
            metadata = newFloatingTieredPrice.metadata
            additionalProperties = newFloatingTieredPrice.additionalProperties.toMutableMap()
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

        /** An ISO 4217 currency string for which this price is billed in. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The id of the item the price will be associated with. */
        fun itemId(itemId: String) = itemId(JsonField.of(itemId))

        /**
         * Sets [Builder.itemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.itemId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

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

        fun tieredConfig(tieredConfig: TieredConfig) = tieredConfig(JsonField.of(tieredConfig))

        /**
         * Sets [Builder.tieredConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tieredConfig] with a well-typed [TieredConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tieredConfig(tieredConfig: JsonField<TieredConfig>) = apply {
            this.tieredConfig = tieredConfig
        }

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
         * Returns an immutable instance of [NewFloatingTieredPrice].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .cadence()
         * .currency()
         * .itemId()
         * .modelType()
         * .name()
         * .tieredConfig()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NewFloatingTieredPrice =
            NewFloatingTieredPrice(
                checkRequired("cadence", cadence),
                checkRequired("currency", currency),
                checkRequired("itemId", itemId),
                checkRequired("modelType", modelType),
                checkRequired("name", name),
                checkRequired("tieredConfig", tieredConfig),
                billableMetricId,
                billedInAdvance,
                billingCycleConfiguration,
                conversionRate,
                conversionRateConfig,
                dimensionalPriceConfiguration,
                externalPriceId,
                fixedPriceQuantity,
                invoiceGroupingKey,
                invoicingCycleConfiguration,
                metadata,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NewFloatingTieredPrice = apply {
        if (validated) {
            return@apply
        }

        cadence().validate()
        currency()
        itemId()
        modelType().validate()
        name()
        tieredConfig().validate()
        billableMetricId()
        billedInAdvance()
        billingCycleConfiguration()?.validate()
        conversionRate()
        conversionRateConfig()?.validate()
        dimensionalPriceConfiguration()?.validate()
        externalPriceId()
        fixedPriceQuantity()
        invoiceGroupingKey()
        invoicingCycleConfiguration()?.validate()
        metadata()?.validate()
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
            (if (currency.asKnown() == null) 0 else 1) +
            (if (itemId.asKnown() == null) 0 else 1) +
            (modelType.asKnown()?.validity() ?: 0) +
            (if (name.asKnown() == null) 0 else 1) +
            (tieredConfig.asKnown()?.validity() ?: 0) +
            (if (billableMetricId.asKnown() == null) 0 else 1) +
            (if (billedInAdvance.asKnown() == null) 0 else 1) +
            (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
            (if (conversionRate.asKnown() == null) 0 else 1) +
            (conversionRateConfig.asKnown()?.validity() ?: 0) +
            (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
            (if (externalPriceId.asKnown() == null) 0 else 1) +
            (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
            (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
            (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
            (metadata.asKnown()?.validity() ?: 0)

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

            return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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

            val TIERED = of("tiered")

            fun of(value: String) = ModelType(JsonField.of(value))
        }

        /** An enum containing [ModelType]'s known values. */
        enum class Known {
            TIERED
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
            TIERED,
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
                TIERED -> Value.TIERED
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
                TIERED -> Known.TIERED
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

            return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The configuration for the rate of the price currency to the invoicing currency. */
    @JsonDeserialize(using = ConversionRateConfig.Deserializer::class)
    @JsonSerialize(using = ConversionRateConfig.Serializer::class)
    class ConversionRateConfig
    private constructor(
        private val unit: UnitConversionRateConfig? = null,
        private val tiered: TieredConversionRateConfig? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unit(): UnitConversionRateConfig? = unit

        fun tiered(): TieredConversionRateConfig? = tiered

        fun isUnit(): Boolean = unit != null

        fun isTiered(): Boolean = tiered != null

        fun asUnit(): UnitConversionRateConfig = unit.getOrThrow("unit")

        fun asTiered(): TieredConversionRateConfig = tiered.getOrThrow("tiered")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unit != null -> visitor.visitUnit(unit)
                tiered != null -> visitor.visitTiered(tiered)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): ConversionRateConfig = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnit(unit: UnitConversionRateConfig) {
                        unit.validate()
                    }

                    override fun visitTiered(tiered: TieredConversionRateConfig) {
                        tiered.validate()
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
                    override fun visitUnit(unit: UnitConversionRateConfig) = unit.validity()

                    override fun visitTiered(tiered: TieredConversionRateConfig) = tiered.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConversionRateConfig && unit == other.unit && tiered == other.tiered /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(unit, tiered) /* spotless:on */

        override fun toString(): String =
            when {
                unit != null -> "ConversionRateConfig{unit=$unit}"
                tiered != null -> "ConversionRateConfig{tiered=$tiered}"
                _json != null -> "ConversionRateConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ConversionRateConfig")
            }

        companion object {

            fun ofUnit(unit: UnitConversionRateConfig) = ConversionRateConfig(unit = unit)

            fun ofTiered(tiered: TieredConversionRateConfig) = ConversionRateConfig(tiered = tiered)
        }

        /**
         * An interface that defines how to map each variant of [ConversionRateConfig] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitUnit(unit: UnitConversionRateConfig): T

            fun visitTiered(tiered: TieredConversionRateConfig): T

            /**
             * Maps an unknown variant of [ConversionRateConfig] to a value of type [T].
             *
             * An instance of [ConversionRateConfig] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown ConversionRateConfig: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<ConversionRateConfig>(ConversionRateConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ConversionRateConfig {
                val json = JsonValue.fromJsonNode(node)
                val conversionRateType = json.asObject()?.get("conversion_rate_type")?.asString()

                when (conversionRateType) {
                    "unit" -> {
                        return tryDeserialize(node, jacksonTypeRef<UnitConversionRateConfig>())
                            ?.let { ConversionRateConfig(unit = it, _json = json) }
                            ?: ConversionRateConfig(_json = json)
                    }
                    "tiered" -> {
                        return tryDeserialize(node, jacksonTypeRef<TieredConversionRateConfig>())
                            ?.let { ConversionRateConfig(tiered = it, _json = json) }
                            ?: ConversionRateConfig(_json = json)
                    }
                }

                return ConversionRateConfig(_json = json)
            }
        }

        internal class Serializer :
            BaseSerializer<ConversionRateConfig>(ConversionRateConfig::class) {

            override fun serialize(
                value: ConversionRateConfig,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unit != null -> generator.writeObject(value.unit)
                    value.tiered != null -> generator.writeObject(value.tiered)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ConversionRateConfig")
                }
            }
        }
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

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NewFloatingTieredPrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && tieredConfig == other.tieredConfig && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && conversionRateConfig == other.conversionRateConfig && dimensionalPriceConfiguration == other.dimensionalPriceConfiguration && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, modelType, name, tieredConfig, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, conversionRateConfig, dimensionalPriceConfiguration, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NewFloatingTieredPrice{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, tieredConfig=$tieredConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
}
