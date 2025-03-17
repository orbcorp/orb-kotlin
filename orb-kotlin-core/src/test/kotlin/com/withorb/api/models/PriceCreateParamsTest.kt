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
                PriceCreateParams.Body.NewFloatingUnitPrice.builder()
                    .cadence(PriceCreateParams.Body.NewFloatingUnitPrice.Cadence.ANNUAL)
                    .currency("currency")
                    .itemId("item_id")
                    .modelType(PriceCreateParams.Body.NewFloatingUnitPrice.ModelType.UNIT)
                    .name("Annual fee")
                    .unitConfig(
                        PriceCreateParams.Body.NewFloatingUnitPrice.UnitConfig.builder()
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .billableMetricId("billable_metric_id")
                    .billedInAdvance(true)
                    .billingCycleConfiguration(
                        PriceCreateParams.Body.NewFloatingUnitPrice.BillingCycleConfiguration
                            .builder()
                            .duration(0L)
                            .durationUnit(
                                PriceCreateParams.Body.NewFloatingUnitPrice
                                    .BillingCycleConfiguration
                                    .DurationUnit
                                    .DAY
                            )
                            .build()
                    )
                    .conversionRate(0.0)
                    .externalPriceId("external_price_id")
                    .fixedPriceQuantity(0.0)
                    .invoiceGroupingKey("invoice_grouping_key")
                    .invoicingCycleConfiguration(
                        PriceCreateParams.Body.NewFloatingUnitPrice.InvoicingCycleConfiguration
                            .builder()
                            .duration(0L)
                            .durationUnit(
                                PriceCreateParams.Body.NewFloatingUnitPrice
                                    .InvoicingCycleConfiguration
                                    .DurationUnit
                                    .DAY
                            )
                            .build()
                    )
                    .metadata(
                        PriceCreateParams.Body.NewFloatingUnitPrice.Metadata.builder()
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
                    PriceCreateParams.Body.NewFloatingUnitPrice.builder()
                        .cadence(PriceCreateParams.Body.NewFloatingUnitPrice.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .modelType(PriceCreateParams.Body.NewFloatingUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(
                            PriceCreateParams.Body.NewFloatingUnitPrice.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .billableMetricId("billable_metric_id")
                        .billedInAdvance(true)
                        .billingCycleConfiguration(
                            PriceCreateParams.Body.NewFloatingUnitPrice.BillingCycleConfiguration
                                .builder()
                                .duration(0L)
                                .durationUnit(
                                    PriceCreateParams.Body.NewFloatingUnitPrice
                                        .BillingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .conversionRate(0.0)
                        .externalPriceId("external_price_id")
                        .fixedPriceQuantity(0.0)
                        .invoiceGroupingKey("invoice_grouping_key")
                        .invoicingCycleConfiguration(
                            PriceCreateParams.Body.NewFloatingUnitPrice.InvoicingCycleConfiguration
                                .builder()
                                .duration(0L)
                                .durationUnit(
                                    PriceCreateParams.Body.NewFloatingUnitPrice
                                        .InvoicingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .metadata(
                            PriceCreateParams.Body.NewFloatingUnitPrice.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PriceCreateParams.Body.ofNewFloatingUnitPrice(
                    PriceCreateParams.Body.NewFloatingUnitPrice.builder()
                        .cadence(PriceCreateParams.Body.NewFloatingUnitPrice.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .modelType(PriceCreateParams.Body.NewFloatingUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(
                            PriceCreateParams.Body.NewFloatingUnitPrice.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .billableMetricId("billable_metric_id")
                        .billedInAdvance(true)
                        .billingCycleConfiguration(
                            PriceCreateParams.Body.NewFloatingUnitPrice.BillingCycleConfiguration
                                .builder()
                                .duration(0L)
                                .durationUnit(
                                    PriceCreateParams.Body.NewFloatingUnitPrice
                                        .BillingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .conversionRate(0.0)
                        .externalPriceId("external_price_id")
                        .fixedPriceQuantity(0.0)
                        .invoiceGroupingKey("invoice_grouping_key")
                        .invoicingCycleConfiguration(
                            PriceCreateParams.Body.NewFloatingUnitPrice.InvoicingCycleConfiguration
                                .builder()
                                .duration(0L)
                                .durationUnit(
                                    PriceCreateParams.Body.NewFloatingUnitPrice
                                        .InvoicingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .metadata(
                            PriceCreateParams.Body.NewFloatingUnitPrice.Metadata.builder()
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
                    PriceCreateParams.Body.NewFloatingUnitPrice.builder()
                        .cadence(PriceCreateParams.Body.NewFloatingUnitPrice.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .modelType(PriceCreateParams.Body.NewFloatingUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(
                            PriceCreateParams.Body.NewFloatingUnitPrice.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PriceCreateParams.Body.ofNewFloatingUnitPrice(
                    PriceCreateParams.Body.NewFloatingUnitPrice.builder()
                        .cadence(PriceCreateParams.Body.NewFloatingUnitPrice.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .modelType(PriceCreateParams.Body.NewFloatingUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(
                            PriceCreateParams.Body.NewFloatingUnitPrice.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
    }
}
