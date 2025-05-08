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
                PlanCreateParams.Price.NewPlanUnitPrice.builder()
                    .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                    .itemId("item_id")
                    .name("Annual fee")
                    .unitConfig(
                        PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .billableMetricId("billable_metric_id")
                    .billedInAdvance(true)
                    .billingCycleConfiguration(
                        PlanCreateParams.Price.NewPlanUnitPrice.BillingCycleConfiguration.builder()
                            .duration(0L)
                            .durationUnit(
                                PlanCreateParams.Price.NewPlanUnitPrice.BillingCycleConfiguration
                                    .DurationUnit
                                    .DAY
                            )
                            .build()
                    )
                    .conversionRate(0.0)
                    .currency("currency")
                    .externalPriceId("external_price_id")
                    .fixedPriceQuantity(0.0)
                    .invoiceGroupingKey("invoice_grouping_key")
                    .invoicingCycleConfiguration(
                        PlanCreateParams.Price.NewPlanUnitPrice.InvoicingCycleConfiguration
                            .builder()
                            .duration(0L)
                            .durationUnit(
                                PlanCreateParams.Price.NewPlanUnitPrice.InvoicingCycleConfiguration
                                    .DurationUnit
                                    .DAY
                            )
                            .build()
                    )
                    .metadata(
                        PlanCreateParams.Price.NewPlanUnitPrice.Metadata.builder()
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
                    PlanCreateParams.Price.NewPlanUnitPrice.builder()
                        .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                        .itemId("item_id")
                        .name("Annual fee")
                        .unitConfig(
                            PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .billableMetricId("billable_metric_id")
                        .billedInAdvance(true)
                        .billingCycleConfiguration(
                            PlanCreateParams.Price.NewPlanUnitPrice.BillingCycleConfiguration
                                .builder()
                                .duration(0L)
                                .durationUnit(
                                    PlanCreateParams.Price.NewPlanUnitPrice
                                        .BillingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .conversionRate(0.0)
                        .currency("currency")
                        .externalPriceId("external_price_id")
                        .fixedPriceQuantity(0.0)
                        .invoiceGroupingKey("invoice_grouping_key")
                        .invoicingCycleConfiguration(
                            PlanCreateParams.Price.NewPlanUnitPrice.InvoicingCycleConfiguration
                                .builder()
                                .duration(0L)
                                .durationUnit(
                                    PlanCreateParams.Price.NewPlanUnitPrice
                                        .InvoicingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .metadata(
                            PlanCreateParams.Price.NewPlanUnitPrice.Metadata.builder()
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
                PlanCreateParams.Price.ofNewPlanUnit(
                    PlanCreateParams.Price.NewPlanUnitPrice.builder()
                        .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                        .itemId("item_id")
                        .name("Annual fee")
                        .unitConfig(
                            PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .billableMetricId("billable_metric_id")
                        .billedInAdvance(true)
                        .billingCycleConfiguration(
                            PlanCreateParams.Price.NewPlanUnitPrice.BillingCycleConfiguration
                                .builder()
                                .duration(0L)
                                .durationUnit(
                                    PlanCreateParams.Price.NewPlanUnitPrice
                                        .BillingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .conversionRate(0.0)
                        .currency("currency")
                        .externalPriceId("external_price_id")
                        .fixedPriceQuantity(0.0)
                        .invoiceGroupingKey("invoice_grouping_key")
                        .invoicingCycleConfiguration(
                            PlanCreateParams.Price.NewPlanUnitPrice.InvoicingCycleConfiguration
                                .builder()
                                .duration(0L)
                                .durationUnit(
                                    PlanCreateParams.Price.NewPlanUnitPrice
                                        .InvoicingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .metadata(
                            PlanCreateParams.Price.NewPlanUnitPrice.Metadata.builder()
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
                    PlanCreateParams.Price.NewPlanUnitPrice.builder()
                        .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                        .itemId("item_id")
                        .name("Annual fee")
                        .unitConfig(
                            PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.prices())
            .containsExactly(
                PlanCreateParams.Price.ofNewPlanUnit(
                    PlanCreateParams.Price.NewPlanUnitPrice.builder()
                        .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                        .itemId("item_id")
                        .name("Annual fee")
                        .unitConfig(
                            PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
    }
}
