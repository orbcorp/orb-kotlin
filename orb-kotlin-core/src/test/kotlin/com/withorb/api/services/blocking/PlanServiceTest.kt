// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.ConversionRateUnitConfig
import com.withorb.api.models.CustomExpiration
import com.withorb.api.models.NewAllocationPrice
import com.withorb.api.models.NewBillingCycleConfiguration
import com.withorb.api.models.NewDimensionalPriceConfiguration
import com.withorb.api.models.NewPercentageDiscount
import com.withorb.api.models.NewPlanUnitPrice
import com.withorb.api.models.PlanCreateParams
import com.withorb.api.models.PlanCreatePlanVersionParams
import com.withorb.api.models.PlanFetchPlanVersionParams
import com.withorb.api.models.PlanSetDefaultPlanVersionParams
import com.withorb.api.models.PlanUpdateParams
import com.withorb.api.models.UnitConfig
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlanServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()

        val plan =
            planService.create(
                PlanCreateParams.builder()
                    .currency("currency")
                    .name("name")
                    .addPrice(
                        PlanCreateParams.Price.builder()
                            .allocationPrice(
                                NewAllocationPrice.builder()
                                    .amount("10.00")
                                    .cadence(NewAllocationPrice.Cadence.MONTHLY)
                                    .currency("USD")
                                    .customExpiration(
                                        CustomExpiration.builder()
                                            .duration(0L)
                                            .durationUnit(CustomExpiration.DurationUnit.DAY)
                                            .build()
                                    )
                                    .expiresAtEndOfCadence(true)
                                    .addFilter(
                                        NewAllocationPrice.Filter.builder()
                                            .field(NewAllocationPrice.Filter.Field.ITEM_ID)
                                            .operator(NewAllocationPrice.Filter.Operator.INCLUDES)
                                            .addValue("string")
                                            .build()
                                    )
                                    .itemId("item_id")
                                    .licenseTypeId("license_type_id")
                                    .metadata(
                                        NewAllocationPrice.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .perUnitCostBasis("per_unit_cost_basis")
                                    .build()
                            )
                            .licenseAllocationPrice(
                                PlanCreateParams.Price.LicenseAllocationPrice.builder()
                                    .cadence(
                                        PlanCreateParams.Price.LicenseAllocationPrice.Cadence
                                            .ONE_TIME
                                    )
                                    .itemId("item_id")
                                    .addLicenseAllocation(
                                        PlanCreateParams.Price.LicenseAllocationPrice
                                            .LicenseAllocation
                                            .builder()
                                            .amount("amount")
                                            .currency("currency")
                                            .writeOffOverage(true)
                                            .build()
                                    )
                                    .modelType(
                                        PlanCreateParams.Price.LicenseAllocationPrice.ModelType.UNIT
                                    )
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .prorated(true)
                                            .scalingFactor(0.0)
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .unitConversionRateConfig(
                                        ConversionRateUnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        NewDimensionalPriceConfiguration.builder()
                                            .addDimensionValue("x")
                                            .dimensionalPriceGroupId("dimensional_price_group_id")
                                            .externalDimensionalPriceGroupId(
                                                "external_dimensional_price_group_id"
                                            )
                                            .build()
                                    )
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("x")
                                    .invoicingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .licenseTypeId("license_type_id")
                                    .metadata(
                                        PlanCreateParams.Price.LicenseAllocationPrice.Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .referenceId("reference_id")
                                    .build()
                            )
                            .planPhaseOrder(0L)
                            .price(
                                NewPlanUnitPrice.builder()
                                    .cadence(NewPlanUnitPrice.Cadence.ONE_TIME)
                                    .itemId("item_id")
                                    .modelType(NewPlanUnitPrice.ModelType.UNIT)
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .prorated(true)
                                            .scalingFactor(0.0)
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .unitConversionRateConfig(
                                        ConversionRateUnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        NewDimensionalPriceConfiguration.builder()
                                            .addDimensionValue("x")
                                            .dimensionalPriceGroupId("dimensional_price_group_id")
                                            .externalDimensionalPriceGroupId(
                                                "external_dimensional_price_group_id"
                                            )
                                            .build()
                                    )
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("x")
                                    .invoicingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .licenseTypeId("license_type_id")
                                    .metadata(
                                        NewPlanUnitPrice.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .referenceId("reference_id")
                                    .build()
                            )
                            .build()
                    )
                    .addAdjustment(
                        PlanCreateParams.Adjustment.builder()
                            .adjustment(
                                NewPercentageDiscount.builder()
                                    .adjustmentType(
                                        NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT
                                    )
                                    .percentageDiscount(0.0)
                                    .appliesToAll(NewPercentageDiscount.AppliesToAll.TRUE)
                                    .addAppliesToItemId("item_1")
                                    .addAppliesToItemId("item_2")
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .currency("currency")
                                    .addFilter(
                                        NewPercentageDiscount.Filter.builder()
                                            .field(NewPercentageDiscount.Filter.Field.PRICE_ID)
                                            .operator(
                                                NewPercentageDiscount.Filter.Operator.INCLUDES
                                            )
                                            .addValue("string")
                                            .build()
                                    )
                                    .isInvoiceLevel(true)
                                    .priceType(NewPercentageDiscount.PriceType.USAGE)
                                    .build()
                            )
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .defaultInvoiceMemo("default_invoice_memo")
                    .description("description")
                    .externalPlanId("external_plan_id")
                    .metadata(
                        PlanCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .netTerms(0L)
                    .addPlanPhase(
                        PlanCreateParams.PlanPhase.builder()
                            .order(0L)
                            .alignBillingWithPhaseStartDate(true)
                            .duration(1L)
                            .durationUnit(PlanCreateParams.PlanPhase.DurationUnit.DAILY)
                            .build()
                    )
                    .status(PlanCreateParams.Status.ACTIVE)
                    .build()
            )

        plan.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()

        val plan =
            planService.update(
                PlanUpdateParams.builder()
                    .planId("plan_id")
                    .description("description")
                    .externalPlanId("external_plan_id")
                    .metadata(
                        PlanUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        plan.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()

        val page = planService.list()

        page.response().validate()
    }

    @Test
    fun createPlanVersion() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()

        val planVersion =
            planService.createPlanVersion(
                PlanCreatePlanVersionParams.builder()
                    .planId("plan_id")
                    .version(0L)
                    .addAddAdjustment(
                        PlanCreatePlanVersionParams.AddAdjustment.builder()
                            .adjustment(
                                NewPercentageDiscount.builder()
                                    .adjustmentType(
                                        NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT
                                    )
                                    .percentageDiscount(0.0)
                                    .appliesToAll(NewPercentageDiscount.AppliesToAll.TRUE)
                                    .addAppliesToItemId("item_1")
                                    .addAppliesToItemId("item_2")
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .currency("currency")
                                    .addFilter(
                                        NewPercentageDiscount.Filter.builder()
                                            .field(NewPercentageDiscount.Filter.Field.PRICE_ID)
                                            .operator(
                                                NewPercentageDiscount.Filter.Operator.INCLUDES
                                            )
                                            .addValue("string")
                                            .build()
                                    )
                                    .isInvoiceLevel(true)
                                    .priceType(NewPercentageDiscount.PriceType.USAGE)
                                    .build()
                            )
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addAddPrice(
                        PlanCreatePlanVersionParams.AddPrice.builder()
                            .allocationPrice(
                                NewAllocationPrice.builder()
                                    .amount("10.00")
                                    .cadence(NewAllocationPrice.Cadence.MONTHLY)
                                    .currency("USD")
                                    .customExpiration(
                                        CustomExpiration.builder()
                                            .duration(0L)
                                            .durationUnit(CustomExpiration.DurationUnit.DAY)
                                            .build()
                                    )
                                    .expiresAtEndOfCadence(true)
                                    .addFilter(
                                        NewAllocationPrice.Filter.builder()
                                            .field(NewAllocationPrice.Filter.Field.ITEM_ID)
                                            .operator(NewAllocationPrice.Filter.Operator.INCLUDES)
                                            .addValue("string")
                                            .build()
                                    )
                                    .itemId("item_id")
                                    .licenseTypeId("license_type_id")
                                    .metadata(
                                        NewAllocationPrice.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .perUnitCostBasis("per_unit_cost_basis")
                                    .build()
                            )
                            .licenseAllocationPrice(
                                PlanCreatePlanVersionParams.AddPrice.LicenseAllocationPrice
                                    .builder()
                                    .cadence(
                                        PlanCreatePlanVersionParams.AddPrice.LicenseAllocationPrice
                                            .Cadence
                                            .ONE_TIME
                                    )
                                    .itemId("item_id")
                                    .addLicenseAllocation(
                                        PlanCreatePlanVersionParams.AddPrice.LicenseAllocationPrice
                                            .LicenseAllocation
                                            .builder()
                                            .amount("amount")
                                            .currency("currency")
                                            .writeOffOverage(true)
                                            .build()
                                    )
                                    .modelType(
                                        PlanCreatePlanVersionParams.AddPrice.LicenseAllocationPrice
                                            .ModelType
                                            .UNIT
                                    )
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .prorated(true)
                                            .scalingFactor(0.0)
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .unitConversionRateConfig(
                                        ConversionRateUnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        NewDimensionalPriceConfiguration.builder()
                                            .addDimensionValue("x")
                                            .dimensionalPriceGroupId("dimensional_price_group_id")
                                            .externalDimensionalPriceGroupId(
                                                "external_dimensional_price_group_id"
                                            )
                                            .build()
                                    )
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("x")
                                    .invoicingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .licenseTypeId("license_type_id")
                                    .metadata(
                                        PlanCreatePlanVersionParams.AddPrice.LicenseAllocationPrice
                                            .Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .referenceId("reference_id")
                                    .build()
                            )
                            .planPhaseOrder(0L)
                            .price(
                                NewPlanUnitPrice.builder()
                                    .cadence(NewPlanUnitPrice.Cadence.ONE_TIME)
                                    .itemId("item_id")
                                    .modelType(NewPlanUnitPrice.ModelType.UNIT)
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .prorated(true)
                                            .scalingFactor(0.0)
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .unitConversionRateConfig(
                                        ConversionRateUnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        NewDimensionalPriceConfiguration.builder()
                                            .addDimensionValue("x")
                                            .dimensionalPriceGroupId("dimensional_price_group_id")
                                            .externalDimensionalPriceGroupId(
                                                "external_dimensional_price_group_id"
                                            )
                                            .build()
                                    )
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("x")
                                    .invoicingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .licenseTypeId("license_type_id")
                                    .metadata(
                                        NewPlanUnitPrice.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .referenceId("reference_id")
                                    .build()
                            )
                            .build()
                    )
                    .addRemoveAdjustment(
                        PlanCreatePlanVersionParams.RemoveAdjustment.builder()
                            .adjustmentId("adjustment_id")
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addRemovePrice(
                        PlanCreatePlanVersionParams.RemovePrice.builder()
                            .priceId("price_id")
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addReplaceAdjustment(
                        PlanCreatePlanVersionParams.ReplaceAdjustment.builder()
                            .adjustment(
                                NewPercentageDiscount.builder()
                                    .adjustmentType(
                                        NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT
                                    )
                                    .percentageDiscount(0.0)
                                    .appliesToAll(NewPercentageDiscount.AppliesToAll.TRUE)
                                    .addAppliesToItemId("item_1")
                                    .addAppliesToItemId("item_2")
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .currency("currency")
                                    .addFilter(
                                        NewPercentageDiscount.Filter.builder()
                                            .field(NewPercentageDiscount.Filter.Field.PRICE_ID)
                                            .operator(
                                                NewPercentageDiscount.Filter.Operator.INCLUDES
                                            )
                                            .addValue("string")
                                            .build()
                                    )
                                    .isInvoiceLevel(true)
                                    .priceType(NewPercentageDiscount.PriceType.USAGE)
                                    .build()
                            )
                            .replacesAdjustmentId("replaces_adjustment_id")
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addReplacePrice(
                        PlanCreatePlanVersionParams.ReplacePrice.builder()
                            .replacesPriceId("replaces_price_id")
                            .allocationPrice(
                                NewAllocationPrice.builder()
                                    .amount("10.00")
                                    .cadence(NewAllocationPrice.Cadence.MONTHLY)
                                    .currency("USD")
                                    .customExpiration(
                                        CustomExpiration.builder()
                                            .duration(0L)
                                            .durationUnit(CustomExpiration.DurationUnit.DAY)
                                            .build()
                                    )
                                    .expiresAtEndOfCadence(true)
                                    .addFilter(
                                        NewAllocationPrice.Filter.builder()
                                            .field(NewAllocationPrice.Filter.Field.ITEM_ID)
                                            .operator(NewAllocationPrice.Filter.Operator.INCLUDES)
                                            .addValue("string")
                                            .build()
                                    )
                                    .itemId("item_id")
                                    .licenseTypeId("license_type_id")
                                    .metadata(
                                        NewAllocationPrice.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .perUnitCostBasis("per_unit_cost_basis")
                                    .build()
                            )
                            .licenseAllocationPrice(
                                PlanCreatePlanVersionParams.ReplacePrice.LicenseAllocationPrice
                                    .builder()
                                    .cadence(
                                        PlanCreatePlanVersionParams.ReplacePrice
                                            .LicenseAllocationPrice
                                            .Cadence
                                            .ONE_TIME
                                    )
                                    .itemId("item_id")
                                    .addLicenseAllocation(
                                        PlanCreatePlanVersionParams.ReplacePrice
                                            .LicenseAllocationPrice
                                            .LicenseAllocation
                                            .builder()
                                            .amount("amount")
                                            .currency("currency")
                                            .writeOffOverage(true)
                                            .build()
                                    )
                                    .modelType(
                                        PlanCreatePlanVersionParams.ReplacePrice
                                            .LicenseAllocationPrice
                                            .ModelType
                                            .UNIT
                                    )
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .prorated(true)
                                            .scalingFactor(0.0)
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .unitConversionRateConfig(
                                        ConversionRateUnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        NewDimensionalPriceConfiguration.builder()
                                            .addDimensionValue("x")
                                            .dimensionalPriceGroupId("dimensional_price_group_id")
                                            .externalDimensionalPriceGroupId(
                                                "external_dimensional_price_group_id"
                                            )
                                            .build()
                                    )
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("x")
                                    .invoicingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .licenseTypeId("license_type_id")
                                    .metadata(
                                        PlanCreatePlanVersionParams.ReplacePrice
                                            .LicenseAllocationPrice
                                            .Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .referenceId("reference_id")
                                    .build()
                            )
                            .planPhaseOrder(0L)
                            .price(
                                NewPlanUnitPrice.builder()
                                    .cadence(NewPlanUnitPrice.Cadence.ONE_TIME)
                                    .itemId("item_id")
                                    .modelType(NewPlanUnitPrice.ModelType.UNIT)
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .prorated(true)
                                            .scalingFactor(0.0)
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .unitConversionRateConfig(
                                        ConversionRateUnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        NewDimensionalPriceConfiguration.builder()
                                            .addDimensionValue("x")
                                            .dimensionalPriceGroupId("dimensional_price_group_id")
                                            .externalDimensionalPriceGroupId(
                                                "external_dimensional_price_group_id"
                                            )
                                            .build()
                                    )
                                    .externalPriceId("external_price_id")
                                    .fixedPriceQuantity(0.0)
                                    .invoiceGroupingKey("x")
                                    .invoicingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .licenseTypeId("license_type_id")
                                    .metadata(
                                        NewPlanUnitPrice.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .referenceId("reference_id")
                                    .build()
                            )
                            .build()
                    )
                    .setAsDefault(true)
                    .build()
            )

        planVersion.validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()

        val plan = planService.fetch("plan_id")

        plan.validate()
    }

    @Test
    fun fetchPlanVersion() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()

        val planVersion =
            planService.fetchPlanVersion(
                PlanFetchPlanVersionParams.builder().planId("plan_id").version("version").build()
            )

        planVersion.validate()
    }

    @Test
    fun setDefaultPlanVersion() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planService = client.plans()

        val plan =
            planService.setDefaultPlanVersion(
                PlanSetDefaultPlanVersionParams.builder().planId("plan_id").version(0L).build()
            )

        plan.validate()
    }
}
