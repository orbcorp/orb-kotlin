// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanCreateParamsTest {

    @Test
    fun createPlanCreateParams() {
        PlanCreateParams.builder()
            .currency("currency")
            .name("name")
            .prices(
                listOf(
                    PlanCreateParams.Price.ofNewPlanUnitPrice(
                        PlanCreateParams.Price.NewPlanUnitPrice.builder()
                            .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                            .itemId("item_id")
                            .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
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
    fun getBody() {
        val params =
            PlanCreateParams.builder()
                .currency("currency")
                .name("name")
                .prices(
                    listOf(
                        PlanCreateParams.Price.ofNewPlanUnitPrice(
                            PlanCreateParams.Price.NewPlanUnitPrice.builder()
                                .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                                .itemId("item_id")
                                .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
                                .name("Annual fee")
                                .unitConfig(
                                    PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                                        .unitAmount("unit_amount")
                                        .build()
                                )
                                .billableMetricId("billable_metric_id")
                                .billedInAdvance(true)
                                .billingCycleConfiguration(
                                    PlanCreateParams.Price.NewPlanUnitPrice
                                        .BillingCycleConfiguration
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
                                    PlanCreateParams.Price.NewPlanUnitPrice
                                        .InvoicingCycleConfiguration
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.prices())
            .isEqualTo(
                listOf(
                    PlanCreateParams.Price.ofNewPlanUnitPrice(
                        PlanCreateParams.Price.NewPlanUnitPrice.builder()
                            .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                            .itemId("item_id")
                            .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
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
    fun getBodyWithoutOptionalFields() {
        val params =
            PlanCreateParams.builder()
                .currency("currency")
                .name("name")
                .prices(
                    listOf(
                        PlanCreateParams.Price.ofNewPlanUnitPrice(
                            PlanCreateParams.Price.NewPlanUnitPrice.builder()
                                .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                                .itemId("item_id")
                                .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
                                .name("Annual fee")
                                .unitConfig(
                                    PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                                        .unitAmount("unit_amount")
                                        .build()
                                )
                                .build()
                        )
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.prices())
            .isEqualTo(
                listOf(
                    PlanCreateParams.Price.ofNewPlanUnitPrice(
                        PlanCreateParams.Price.NewPlanUnitPrice.builder()
                            .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                            .itemId("item_id")
                            .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
                            .name("Annual fee")
                            .unitConfig(
                                PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                                    .unitAmount("unit_amount")
                                    .build()
                            )
                            .build()
                    )
                )
            )
    }
}
