// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanCreateParamsTest {

    @Test
    fun createPlanCreateParams() {
        PlanCreateParams.builder()
            .currency("string")
            .name("string")
            .prices(
                listOf(
                    PlanCreateParams.Price.ofNewPlanUnitPrice(
                        PlanCreateParams.Price.NewPlanUnitPrice.builder()
                            .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                            .itemId("string")
                            .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
                            .name("Annual fee")
                            .unitConfig(
                                PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                                    .unitAmount("string")
                                    .build()
                            )
                            .billableMetricId("string")
                            .billedInAdvance(true)
                            .conversionRate(42.23)
                            .currency("string")
                            .externalPriceId("string")
                            .fixedPriceQuantity(42.23)
                            .invoiceGroupingKey("string")
                            .build()
                    )
                )
            )
            .defaultInvoiceMemo("string")
            .externalPlanId("string")
            .metadata(PlanCreateParams.Metadata.builder().build())
            .netTerms(123L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PlanCreateParams.builder()
                .currency("string")
                .name("string")
                .prices(
                    listOf(
                        PlanCreateParams.Price.ofNewPlanUnitPrice(
                            PlanCreateParams.Price.NewPlanUnitPrice.builder()
                                .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                                .itemId("string")
                                .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
                                .name("Annual fee")
                                .unitConfig(
                                    PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                                        .unitAmount("string")
                                        .build()
                                )
                                .billableMetricId("string")
                                .billedInAdvance(true)
                                .conversionRate(42.23)
                                .currency("string")
                                .externalPriceId("string")
                                .fixedPriceQuantity(42.23)
                                .invoiceGroupingKey("string")
                                .build()
                        )
                    )
                )
                .defaultInvoiceMemo("string")
                .externalPlanId("string")
                .metadata(PlanCreateParams.Metadata.builder().build())
                .netTerms(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.prices())
            .isEqualTo(
                listOf(
                    PlanCreateParams.Price.ofNewPlanUnitPrice(
                        PlanCreateParams.Price.NewPlanUnitPrice.builder()
                            .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                            .itemId("string")
                            .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
                            .name("Annual fee")
                            .unitConfig(
                                PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                                    .unitAmount("string")
                                    .build()
                            )
                            .billableMetricId("string")
                            .billedInAdvance(true)
                            .conversionRate(42.23)
                            .currency("string")
                            .externalPriceId("string")
                            .fixedPriceQuantity(42.23)
                            .invoiceGroupingKey("string")
                            .build()
                    )
                )
            )
        assertThat(body.defaultInvoiceMemo()).isEqualTo("string")
        assertThat(body.externalPlanId()).isEqualTo("string")
        assertThat(body.metadata()).isEqualTo(PlanCreateParams.Metadata.builder().build())
        assertThat(body.netTerms()).isEqualTo(123L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PlanCreateParams.builder()
                .currency("string")
                .name("string")
                .prices(
                    listOf(
                        PlanCreateParams.Price.ofNewPlanUnitPrice(
                            PlanCreateParams.Price.NewPlanUnitPrice.builder()
                                .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                                .itemId("string")
                                .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
                                .name("Annual fee")
                                .unitConfig(
                                    PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                                        .unitAmount("string")
                                        .build()
                                )
                                .build()
                        )
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.prices())
            .isEqualTo(
                listOf(
                    PlanCreateParams.Price.ofNewPlanUnitPrice(
                        PlanCreateParams.Price.NewPlanUnitPrice.builder()
                            .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
                            .itemId("string")
                            .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
                            .name("Annual fee")
                            .unitConfig(
                                PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                                    .unitAmount("string")
                                    .build()
                            )
                            .build()
                    )
                )
            )
    }
}
