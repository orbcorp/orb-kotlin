// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.BetaCreatePlanVersionParams
import com.withorb.api.models.BetaFetchPlanVersionParams
import com.withorb.api.models.BetaSetDefaultPlanVersionParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BetaServiceAsyncTest {

    @Test
    suspend fun createPlanVersion() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val betaServiceAsync = client.beta()

        val planVersion =
            betaServiceAsync.createPlanVersion(
                BetaCreatePlanVersionParams.builder()
                    .planId("plan_id")
                    .version(0L)
                    .addAddAdjustment(
                        BetaCreatePlanVersionParams.AddAdjustment.builder()
                            .adjustment(
                                BetaCreatePlanVersionParams.AddAdjustment.Adjustment
                                    .PercentageDiscount
                                    .builder()
                                    .percentageDiscount(0.0)
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .isInvoiceLevel(true)
                                    .build()
                            )
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addAddPrice(
                        BetaCreatePlanVersionParams.AddPrice.builder()
                            .allocationPrice(
                                BetaCreatePlanVersionParams.AddPrice.AllocationPrice.builder()
                                    .amount("10.00")
                                    .cadence(
                                        BetaCreatePlanVersionParams.AddPrice.AllocationPrice.Cadence
                                            .MONTHLY
                                    )
                                    .currency("USD")
                                    .customExpiration(
                                        BetaCreatePlanVersionParams.AddPrice.AllocationPrice
                                            .CustomExpiration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaCreatePlanVersionParams.AddPrice.AllocationPrice
                                                    .CustomExpiration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .planPhaseOrder(0L)
                            .price(
                                BetaCreatePlanVersionParams.AddPrice.Price.Unit.builder()
                                    .cadence(
                                        BetaCreatePlanVersionParams.AddPrice.Price.Unit.Cadence
                                            .ANNUAL
                                    )
                                    .itemId("item_id")
                                    .name("Annual fee")
                                    .unitConfig(
                                        BetaCreatePlanVersionParams.AddPrice.Price.Unit.UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        BetaCreatePlanVersionParams.AddPrice.Price.Unit
                                            .BillingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaCreatePlanVersionParams.AddPrice.Price.Unit
                                                    .BillingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        BetaCreatePlanVersionParams.AddPrice.Price.Unit
                                            .DimensionalPriceConfiguration
                                            .builder()
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
                                        BetaCreatePlanVersionParams.AddPrice.Price.Unit
                                            .InvoicingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaCreatePlanVersionParams.AddPrice.Price.Unit
                                                    .InvoicingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        BetaCreatePlanVersionParams.AddPrice.Price.Unit.Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .addRemoveAdjustment(
                        BetaCreatePlanVersionParams.RemoveAdjustment.builder()
                            .adjustmentId("adjustment_id")
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addRemovePrice(
                        BetaCreatePlanVersionParams.RemovePrice.builder()
                            .priceId("price_id")
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addReplaceAdjustment(
                        BetaCreatePlanVersionParams.ReplaceAdjustment.builder()
                            .adjustment(
                                BetaCreatePlanVersionParams.ReplaceAdjustment.Adjustment
                                    .PercentageDiscount
                                    .builder()
                                    .percentageDiscount(0.0)
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .isInvoiceLevel(true)
                                    .build()
                            )
                            .replacesAdjustmentId("replaces_adjustment_id")
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addReplacePrice(
                        BetaCreatePlanVersionParams.ReplacePrice.builder()
                            .replacesPriceId("replaces_price_id")
                            .allocationPrice(
                                BetaCreatePlanVersionParams.ReplacePrice.AllocationPrice.builder()
                                    .amount("10.00")
                                    .cadence(
                                        BetaCreatePlanVersionParams.ReplacePrice.AllocationPrice
                                            .Cadence
                                            .MONTHLY
                                    )
                                    .currency("USD")
                                    .customExpiration(
                                        BetaCreatePlanVersionParams.ReplacePrice.AllocationPrice
                                            .CustomExpiration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaCreatePlanVersionParams.ReplacePrice
                                                    .AllocationPrice
                                                    .CustomExpiration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .planPhaseOrder(0L)
                            .price(
                                BetaCreatePlanVersionParams.ReplacePrice.Price.Unit.builder()
                                    .cadence(
                                        BetaCreatePlanVersionParams.ReplacePrice.Price.Unit.Cadence
                                            .ANNUAL
                                    )
                                    .itemId("item_id")
                                    .name("Annual fee")
                                    .unitConfig(
                                        BetaCreatePlanVersionParams.ReplacePrice.Price.Unit
                                            .UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        BetaCreatePlanVersionParams.ReplacePrice.Price.Unit
                                            .BillingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaCreatePlanVersionParams.ReplacePrice.Price.Unit
                                                    .BillingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        BetaCreatePlanVersionParams.ReplacePrice.Price.Unit
                                            .DimensionalPriceConfiguration
                                            .builder()
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
                                        BetaCreatePlanVersionParams.ReplacePrice.Price.Unit
                                            .InvoicingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaCreatePlanVersionParams.ReplacePrice.Price.Unit
                                                    .InvoicingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        BetaCreatePlanVersionParams.ReplacePrice.Price.Unit.Metadata
                                            .builder()
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
    suspend fun fetchPlanVersion() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val betaServiceAsync = client.beta()

        val planVersion =
            betaServiceAsync.fetchPlanVersion(
                BetaFetchPlanVersionParams.builder().planId("plan_id").version("version").build()
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
        val betaServiceAsync = client.beta()

        val plan =
            betaServiceAsync.setDefaultPlanVersion(
                BetaSetDefaultPlanVersionParams.builder().planId("plan_id").version(0L).build()
            )

        plan.validate()
    }
}
