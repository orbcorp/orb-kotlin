// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingUnitPriceTest {

    @Test
    fun create() {
        val newFloatingUnitPrice =
            NewFloatingUnitPrice.builder()
                .cadence(NewFloatingUnitPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingUnitPrice.ModelType.UNIT)
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
                    NewFloatingUnitPrice.ConversionRateConfig.Unit.UnitConfig.builder()
                        .unitAmount("unit_amount")
                        .build()
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

        assertThat(newFloatingUnitPrice.cadence()).isEqualTo(NewFloatingUnitPrice.Cadence.ANNUAL)
        assertThat(newFloatingUnitPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingUnitPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingUnitPrice.modelType()).isEqualTo(NewFloatingUnitPrice.ModelType.UNIT)
        assertThat(newFloatingUnitPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingUnitPrice.unitConfig())
            .isEqualTo(UnitConfig.builder().unitAmount("unit_amount").build())
        assertThat(newFloatingUnitPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newFloatingUnitPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingUnitPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingUnitPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingUnitPrice.conversionRateConfig())
            .isEqualTo(
                NewFloatingUnitPrice.ConversionRateConfig.ofUnit(
                    NewFloatingUnitPrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewFloatingUnitPrice.ConversionRateConfig.Unit.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingUnitPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingUnitPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newFloatingUnitPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingUnitPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingUnitPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingUnitPrice.metadata())
            .isEqualTo(
                NewFloatingUnitPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingUnitPrice =
            NewFloatingUnitPrice.builder()
                .cadence(NewFloatingUnitPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingUnitPrice.ModelType.UNIT)
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
                    NewFloatingUnitPrice.ConversionRateConfig.Unit.UnitConfig.builder()
                        .unitAmount("unit_amount")
                        .build()
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

        val roundtrippedNewFloatingUnitPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingUnitPrice),
                jacksonTypeRef<NewFloatingUnitPrice>(),
            )

        assertThat(roundtrippedNewFloatingUnitPrice).isEqualTo(newFloatingUnitPrice)
    }
}
