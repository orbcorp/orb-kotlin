// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.beta

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.BetaExternalPlanIdCreatePlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdFetchPlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdSetDefaultPlanVersionParams
import com.withorb.api.models.ConversionRateUnitConfig
import com.withorb.api.models.CustomExpiration
import com.withorb.api.models.NewAllocationPrice
import com.withorb.api.models.NewBillingCycleConfiguration
import com.withorb.api.models.NewDimensionalPriceConfiguration
import com.withorb.api.models.NewPercentageDiscount
import com.withorb.api.models.NewPlanUnitPrice
import com.withorb.api.models.UnitConfig
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalPlanIdServiceAsyncTest {

    @Test
    suspend fun createPlanVersion() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPlanIdServiceAsync = client.beta().externalPlanId()

        val planVersion =
            externalPlanIdServiceAsync.createPlanVersion(
                BetaExternalPlanIdCreatePlanVersionParams.builder()
                    .externalPlanId("external_plan_id")
                    .version(0L)
                    .addAddAdjustment(
                        BetaExternalPlanIdCreatePlanVersionParams.AddAdjustment.builder()
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
                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.builder()
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
                                    .perUnitCostBasis("per_unit_cost_basis")
                                    .build()
                            )
                            .planPhaseOrder(0L)
                            .price(
                                NewPlanUnitPrice.builder()
                                    .cadence(NewPlanUnitPrice.Cadence.ANNUAL)
                                    .itemId("item_id")
                                    .modelType(NewPlanUnitPrice.ModelType.UNIT)
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .prorated(true)
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
                                            .addDimensionValue("string")
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
                        BetaExternalPlanIdCreatePlanVersionParams.RemoveAdjustment.builder()
                            .adjustmentId("adjustment_id")
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addRemovePrice(
                        BetaExternalPlanIdCreatePlanVersionParams.RemovePrice.builder()
                            .priceId("price_id")
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addReplaceAdjustment(
                        BetaExternalPlanIdCreatePlanVersionParams.ReplaceAdjustment.builder()
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
                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.builder()
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
                                    .perUnitCostBasis("per_unit_cost_basis")
                                    .build()
                            )
                            .planPhaseOrder(0L)
                            .price(
                                NewPlanUnitPrice.builder()
                                    .cadence(NewPlanUnitPrice.Cadence.ANNUAL)
                                    .itemId("item_id")
                                    .modelType(NewPlanUnitPrice.ModelType.UNIT)
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder()
                                            .unitAmount("unit_amount")
                                            .prorated(true)
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
                                            .addDimensionValue("string")
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
    suspend fun fetchPlanVersion() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPlanIdServiceAsync = client.beta().externalPlanId()

        val planVersion =
            externalPlanIdServiceAsync.fetchPlanVersion(
                BetaExternalPlanIdFetchPlanVersionParams.builder()
                    .externalPlanId("external_plan_id")
                    .version("version")
                    .build()
            )

        planVersion.validate()
    }

    @Test
    suspend fun setDefaultPlanVersion() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPlanIdServiceAsync = client.beta().externalPlanId()

        val plan =
            externalPlanIdServiceAsync.setDefaultPlanVersion(
                BetaExternalPlanIdSetDefaultPlanVersionParams.builder()
                    .externalPlanId("external_plan_id")
                    .version(0L)
                    .build()
            )

        plan.validate()
    }
}
