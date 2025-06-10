// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanCreateParamsTest {

    @Test
    fun create() {
        PlanCreateParams.builder()
            .currency("currency")
            .name("name")
            .addPrice(
                NewPlanUnitPrice.builder()
                    .cadence(NewPlanUnitPrice.Cadence.ANNUAL)
                    .itemId("item_id")
                    .modelType(NewPlanUnitPrice.ModelType.UNIT)
                    .name("Annual fee")
                    .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                    .billableMetricId("billable_metric_id")
                    .billedInAdvance(true)
                    .billingCycleConfiguration(
                        NewBillingCycleConfiguration.builder()
                            .duration(0L)
                            .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                            .build()
                    )
                    .conversionRate(0.0)
                    .unitConversionRateConfig(
                        ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                    )
                    .currency("currency")
                    .dimensionalPriceConfiguration(
                        NewDimensionalPriceConfiguration.builder()
                            .addDimensionValue("string")
                            .dimensionalPriceGroupId("dimensional_price_group_id")
                            .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                            .build()
                    )
                    .externalPriceId("external_price_id")
                    .fixedPriceQuantity(0.0)
                    .invoiceGroupingKey("x")
                    .invoicingCycleConfiguration(
                        NewBillingCycleConfiguration.builder()
                            .duration(0L)
                            .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                            .build()
                    )
                    .metadata(
                        NewPlanUnitPrice.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .defaultInvoiceMemo("default_invoice_memo")
            .externalPlanId("external_plan_id")
            .metadata(
                PlanCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .netTerms(0L)
            .status(PlanCreateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun body() {
        val params =
            PlanCreateParams.builder()
                .currency("currency")
                .name("name")
                .addPrice(
                    NewPlanUnitPrice.builder()
                        .cadence(NewPlanUnitPrice.Cadence.ANNUAL)
                        .itemId("item_id")
                        .modelType(NewPlanUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                        .billableMetricId("billable_metric_id")
                        .billedInAdvance(true)
                        .billingCycleConfiguration(
                            NewBillingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                                .build()
                        )
                        .conversionRate(0.0)
                        .unitConversionRateConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
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
                                .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                                .build()
                        )
                        .metadata(
                            NewPlanUnitPrice.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .defaultInvoiceMemo("default_invoice_memo")
                .externalPlanId("external_plan_id")
                .metadata(
                    PlanCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .netTerms(0L)
                .status(PlanCreateParams.Status.ACTIVE)
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.prices())
            .containsExactly(
                PlanCreateParams.Price.ofUnit(
                    NewPlanUnitPrice.builder()
                        .cadence(NewPlanUnitPrice.Cadence.ANNUAL)
                        .itemId("item_id")
                        .modelType(NewPlanUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                        .billableMetricId("billable_metric_id")
                        .billedInAdvance(true)
                        .billingCycleConfiguration(
                            NewBillingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                                .build()
                        )
                        .conversionRate(0.0)
                        .unitConversionRateConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
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
                                .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                                .build()
                        )
                        .metadata(
                            NewPlanUnitPrice.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.defaultInvoiceMemo()).isEqualTo("default_invoice_memo")
        assertThat(body.externalPlanId()).isEqualTo("external_plan_id")
        assertThat(body.metadata())
            .isEqualTo(
                PlanCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.netTerms()).isEqualTo(0L)
        assertThat(body.status()).isEqualTo(PlanCreateParams.Status.ACTIVE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanCreateParams.builder()
                .currency("currency")
                .name("name")
                .addPrice(
                    NewPlanUnitPrice.builder()
                        .cadence(NewPlanUnitPrice.Cadence.ANNUAL)
                        .itemId("item_id")
                        .modelType(NewPlanUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.prices())
            .containsExactly(
                PlanCreateParams.Price.ofUnit(
                    NewPlanUnitPrice.builder()
                        .cadence(NewPlanUnitPrice.Cadence.ANNUAL)
                        .itemId("item_id")
                        .modelType(NewPlanUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                        .build()
                )
            )
    }
}
