// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.beta

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.BetaExternalPlanIdCreatePlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdFetchPlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdSetDefaultPlanVersionParams
import com.withorb.api.models.CustomExpiration
import com.withorb.api.models.NewAllocationPrice
import com.withorb.api.models.NewBillingCycleConfiguration
import com.withorb.api.models.NewDimensionalPriceConfiguration
import com.withorb.api.models.NewPercentageDiscount
import com.withorb.api.models.NewPlanUnitPrice
import com.withorb.api.models.TransformPriceFilter
import com.withorb.api.models.UnitConfig
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalPlanIdServiceTest {

    @Test
    fun createPlanVersion() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPlanIdService = client.beta().externalPlanId()

        val planVersion =
            externalPlanIdService.createPlanVersion(
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
                                        TransformPriceFilter.builder()
                                            .field(TransformPriceFilter.Field.PRICE_ID)
                                            .operator(TransformPriceFilter.Operator.INCLUDES)
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
                                        UnitConfig.builder().unitAmount("unit_amount").build()
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
                                        TransformPriceFilter.builder()
                                            .field(TransformPriceFilter.Field.PRICE_ID)
                                            .operator(TransformPriceFilter.Operator.INCLUDES)
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
                                        UnitConfig.builder().unitAmount("unit_amount").build()
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
    fun fetchPlanVersion() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPlanIdService = client.beta().externalPlanId()

        val planVersion =
            externalPlanIdService.fetchPlanVersion(
                BetaExternalPlanIdFetchPlanVersionParams.builder()
                    .externalPlanId("external_plan_id")
                    .version("version")
                    .build()
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
        val externalPlanIdService = client.beta().externalPlanId()

        val plan =
            externalPlanIdService.setDefaultPlanVersion(
                BetaExternalPlanIdSetDefaultPlanVersionParams.builder()
                    .externalPlanId("external_plan_id")
                    .version(0L)
                    .build()
            )

        plan.validate()
    }
}
