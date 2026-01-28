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
                NewFloatingUnitPrice.builder()
                    .cadence(NewFloatingUnitPrice.Cadence.ANNUAL)
                    .currency("currency")
                    .itemId("item_id")
                    .modelType(NewFloatingUnitPrice.ModelType.UNIT)
                    .name("Annual fee")
                    .unitConfig(
                        UnitConfig.builder().unitAmount("unit_amount").prorated(true).build()
                    )
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
                        NewFloatingUnitPrice.Metadata.builder()
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
                    NewFloatingUnitPrice.builder()
                        .cadence(NewFloatingUnitPrice.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .modelType(NewFloatingUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(
                            UnitConfig.builder().unitAmount("unit_amount").prorated(true).build()
                        )
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
                            NewFloatingUnitPrice.Metadata.builder()
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
                    NewFloatingUnitPrice.builder()
                        .cadence(NewFloatingUnitPrice.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .modelType(NewFloatingUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(
                            UnitConfig.builder().unitAmount("unit_amount").prorated(true).build()
                        )
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
                            NewFloatingUnitPrice.Metadata.builder()
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
                    NewFloatingUnitPrice.builder()
                        .cadence(NewFloatingUnitPrice.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .modelType(NewFloatingUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PriceCreateParams.Body.ofUnit(
                    NewFloatingUnitPrice.builder()
                        .cadence(NewFloatingUnitPrice.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .modelType(NewFloatingUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                        .build()
                )
            )
    }
}
