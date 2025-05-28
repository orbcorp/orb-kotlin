// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PriceCreateParamsTest {

    @Test
    fun create() {
        PriceCreateParams.builder()
            .body(
                PriceCreateParams.Body.Unit.builder()
                    .cadence(PriceCreateParams.Body.Unit.Cadence.ANNUAL)
                    .currency("currency")
                    .itemId("item_id")
                    .name("Annual fee")
                    .unitConfig(
                        PriceCreateParams.Body.Unit.UnitConfig.builder()
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .billableMetricId("billable_metric_id")
                    .billedInAdvance(true)
                    .billingCycleConfiguration(
                        PriceCreateParams.Body.Unit.BillingCycleConfiguration.builder()
                            .duration(0L)
                            .durationUnit(
                                PriceCreateParams.Body.Unit.BillingCycleConfiguration.DurationUnit
                                    .DAY
                            )
                            .build()
                    )
                    .conversionRate(0.0)
                    .dimensionalPriceConfiguration(
                        PriceCreateParams.Body.Unit.DimensionalPriceConfiguration.builder()
                            .addDimensionValue("string")
                            .dimensionalPriceGroupId("dimensional_price_group_id")
                            .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                            .build()
                    )
                    .externalPriceId("external_price_id")
                    .fixedPriceQuantity(0.0)
                    .invoiceGroupingKey("x")
                    .invoicingCycleConfiguration(
                        PriceCreateParams.Body.Unit.InvoicingCycleConfiguration.builder()
                            .duration(0L)
                            .durationUnit(
                                PriceCreateParams.Body.Unit.InvoicingCycleConfiguration.DurationUnit
                                    .DAY
                            )
                            .build()
                    )
                    .metadata(
                        PriceCreateParams.Body.Unit.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PriceCreateParams.builder()
                .body(
                    PriceCreateParams.Body.Unit.builder()
                        .cadence(PriceCreateParams.Body.Unit.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .name("Annual fee")
                        .unitConfig(
                            PriceCreateParams.Body.Unit.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .billableMetricId("billable_metric_id")
                        .billedInAdvance(true)
                        .billingCycleConfiguration(
                            PriceCreateParams.Body.Unit.BillingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(
                                    PriceCreateParams.Body.Unit.BillingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .conversionRate(0.0)
                        .dimensionalPriceConfiguration(
                            PriceCreateParams.Body.Unit.DimensionalPriceConfiguration.builder()
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
                            PriceCreateParams.Body.Unit.InvoicingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(
                                    PriceCreateParams.Body.Unit.InvoicingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .metadata(
                            PriceCreateParams.Body.Unit.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PriceCreateParams.Body.ofUnit(
                    PriceCreateParams.Body.Unit.builder()
                        .cadence(PriceCreateParams.Body.Unit.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .name("Annual fee")
                        .unitConfig(
                            PriceCreateParams.Body.Unit.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .billableMetricId("billable_metric_id")
                        .billedInAdvance(true)
                        .billingCycleConfiguration(
                            PriceCreateParams.Body.Unit.BillingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(
                                    PriceCreateParams.Body.Unit.BillingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .conversionRate(0.0)
                        .dimensionalPriceConfiguration(
                            PriceCreateParams.Body.Unit.DimensionalPriceConfiguration.builder()
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
                            PriceCreateParams.Body.Unit.InvoicingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(
                                    PriceCreateParams.Body.Unit.InvoicingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .metadata(
                            PriceCreateParams.Body.Unit.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PriceCreateParams.builder()
                .body(
                    PriceCreateParams.Body.Unit.builder()
                        .cadence(PriceCreateParams.Body.Unit.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .name("Annual fee")
                        .unitConfig(
                            PriceCreateParams.Body.Unit.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PriceCreateParams.Body.ofUnit(
                    PriceCreateParams.Body.Unit.builder()
                        .cadence(PriceCreateParams.Body.Unit.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .name("Annual fee")
                        .unitConfig(
                            PriceCreateParams.Body.Unit.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
    }
}
