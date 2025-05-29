// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.beta

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.BetaExternalPlanIdCreatePlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdFetchPlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdSetDefaultPlanVersionParams
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
                                BetaExternalPlanIdCreatePlanVersionParams.AddAdjustment.Adjustment
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
                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.builder()
                            .allocationPrice(
                                BetaExternalPlanIdCreatePlanVersionParams.AddPrice.AllocationPrice
                                    .builder()
                                    .amount("10.00")
                                    .cadence(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice
                                            .AllocationPrice
                                            .Cadence
                                            .MONTHLY
                                    )
                                    .currency("USD")
                                    .customExpiration(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice
                                            .AllocationPrice
                                            .CustomExpiration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaExternalPlanIdCreatePlanVersionParams.AddPrice
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
                                BetaExternalPlanIdCreatePlanVersionParams.AddPrice.Price.Unit
                                    .builder()
                                    .cadence(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.Price
                                            .Unit
                                            .Cadence
                                            .ANNUAL
                                    )
                                    .itemId("item_id")
                                    .name("Annual fee")
                                    .unitConfig(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.Price
                                            .Unit
                                            .UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.Price
                                            .Unit
                                            .BillingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaExternalPlanIdCreatePlanVersionParams.AddPrice
                                                    .Price
                                                    .Unit
                                                    .BillingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.Price
                                            .Unit
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
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.Price
                                            .Unit
                                            .InvoicingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaExternalPlanIdCreatePlanVersionParams.AddPrice
                                                    .Price
                                                    .Unit
                                                    .InvoicingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.Price
                                            .Unit
                                            .Metadata
                                            .builder()
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
                                BetaExternalPlanIdCreatePlanVersionParams.ReplaceAdjustment
                                    .Adjustment
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
                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.builder()
                            .replacesPriceId("replaces_price_id")
                            .allocationPrice(
                                BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice
                                    .AllocationPrice
                                    .builder()
                                    .amount("10.00")
                                    .cadence(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice
                                            .AllocationPrice
                                            .Cadence
                                            .MONTHLY
                                    )
                                    .currency("USD")
                                    .customExpiration(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice
                                            .AllocationPrice
                                            .CustomExpiration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaExternalPlanIdCreatePlanVersionParams
                                                    .ReplacePrice
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
                                BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.Price.Unit
                                    .builder()
                                    .cadence(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.Price
                                            .Unit
                                            .Cadence
                                            .ANNUAL
                                    )
                                    .itemId("item_id")
                                    .name("Annual fee")
                                    .unitConfig(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.Price
                                            .Unit
                                            .UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.Price
                                            .Unit
                                            .BillingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaExternalPlanIdCreatePlanVersionParams
                                                    .ReplacePrice
                                                    .Price
                                                    .Unit
                                                    .BillingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.Price
                                            .Unit
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
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.Price
                                            .Unit
                                            .InvoicingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaExternalPlanIdCreatePlanVersionParams
                                                    .ReplacePrice
                                                    .Price
                                                    .Unit
                                                    .InvoicingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.Price
                                            .Unit
                                            .Metadata
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
