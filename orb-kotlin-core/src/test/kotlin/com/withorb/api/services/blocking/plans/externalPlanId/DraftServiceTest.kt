// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.plans.externalPlanId

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
import com.withorb.api.models.PlanExternalPlanIdDraftPublishParams
import com.withorb.api.models.PlanExternalPlanIdDraftSaveParams
import com.withorb.api.models.UnitConfig
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DraftServiceTest {

    @Test
    fun discard() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val draftService = client.plans().externalPlanId().draft()

        draftService.discard("external_plan_id")
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val draftService = client.plans().externalPlanId().draft()

        val planVersionDraft = draftService.fetch("external_plan_id")

        planVersionDraft.validate()
    }

    @Test
    fun publish() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val draftService = client.plans().externalPlanId().draft()

        val planVersion =
            draftService.publish(
                PlanExternalPlanIdDraftPublishParams.builder()
                    .externalPlanId("external_plan_id")
                    .setAsDefault(true)
                    .build()
            )

        planVersion.validate()
    }

    @Test
    fun save() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val draftService = client.plans().externalPlanId().draft()

        val planVersionDraft =
            draftService.save(
                PlanExternalPlanIdDraftSaveParams.builder()
                    .externalPlanId("external_plan_id")
                    .addAddAdjustment(
                        PlanExternalPlanIdDraftSaveParams.AddAdjustment.builder()
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
                        PlanExternalPlanIdDraftSaveParams.AddPrice.builder()
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
                                PlanExternalPlanIdDraftSaveParams.AddPrice.LicenseAllocationPrice
                                    .builder()
                                    .cadence(
                                        PlanExternalPlanIdDraftSaveParams.AddPrice
                                            .LicenseAllocationPrice
                                            .Cadence
                                            .ONE_TIME
                                    )
                                    .itemId("item_id")
                                    .addLicenseAllocation(
                                        PlanExternalPlanIdDraftSaveParams.AddPrice
                                            .LicenseAllocationPrice
                                            .LicenseAllocation
                                            .builder()
                                            .amount("amount")
                                            .currency("currency")
                                            .writeOffOverage(true)
                                            .build()
                                    )
                                    .modelType(
                                        PlanExternalPlanIdDraftSaveParams.AddPrice
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
                                        PlanExternalPlanIdDraftSaveParams.AddPrice
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
                    .description("description")
                    .addRemoveAdjustment(
                        PlanExternalPlanIdDraftSaveParams.RemoveAdjustment.builder()
                            .adjustmentId("adjustment_id")
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addRemovePrice(
                        PlanExternalPlanIdDraftSaveParams.RemovePrice.builder()
                            .priceId("price_id")
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addReplaceAdjustment(
                        PlanExternalPlanIdDraftSaveParams.ReplaceAdjustment.builder()
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
                        PlanExternalPlanIdDraftSaveParams.ReplacePrice.builder()
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
                                PlanExternalPlanIdDraftSaveParams.ReplacePrice
                                    .LicenseAllocationPrice
                                    .builder()
                                    .cadence(
                                        PlanExternalPlanIdDraftSaveParams.ReplacePrice
                                            .LicenseAllocationPrice
                                            .Cadence
                                            .ONE_TIME
                                    )
                                    .itemId("item_id")
                                    .addLicenseAllocation(
                                        PlanExternalPlanIdDraftSaveParams.ReplacePrice
                                            .LicenseAllocationPrice
                                            .LicenseAllocation
                                            .builder()
                                            .amount("amount")
                                            .currency("currency")
                                            .writeOffOverage(true)
                                            .build()
                                    )
                                    .modelType(
                                        PlanExternalPlanIdDraftSaveParams.ReplacePrice
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
                                        PlanExternalPlanIdDraftSaveParams.ReplacePrice
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
                    .build()
            )

        planVersionDraft.validate()
    }
}
