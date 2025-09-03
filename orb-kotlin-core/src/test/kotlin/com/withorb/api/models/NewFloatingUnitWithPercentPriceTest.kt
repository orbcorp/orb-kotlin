// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingUnitWithPercentPriceTest {

    @Test
    fun create() {
        val newFloatingUnitWithPercentPrice =
            NewFloatingUnitWithPercentPrice.builder()
                .cadence(NewFloatingUnitWithPercentPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingUnitWithPercentPrice.ModelType.UNIT_WITH_PERCENT)
                .name("Annual fee")
                .unitWithPercentConfig(
                    NewFloatingUnitWithPercentPrice.UnitWithPercentConfig.builder()
                        .percent("percent")
                        .unitAmount("unit_amount")
                        .build()
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
                    NewFloatingUnitWithPercentPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingUnitWithPercentPrice.cadence())
            .isEqualTo(NewFloatingUnitWithPercentPrice.Cadence.ANNUAL)
        assertThat(newFloatingUnitWithPercentPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingUnitWithPercentPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingUnitWithPercentPrice.modelType())
            .isEqualTo(NewFloatingUnitWithPercentPrice.ModelType.UNIT_WITH_PERCENT)
        assertThat(newFloatingUnitWithPercentPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingUnitWithPercentPrice.unitWithPercentConfig())
            .isEqualTo(
                NewFloatingUnitWithPercentPrice.UnitWithPercentConfig.builder()
                    .percent("percent")
                    .unitAmount("unit_amount")
                    .build()
            )
        assertThat(newFloatingUnitWithPercentPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newFloatingUnitWithPercentPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingUnitWithPercentPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingUnitWithPercentPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingUnitWithPercentPrice.conversionRateConfig())
            .isEqualTo(
                ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingUnitWithPercentPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingUnitWithPercentPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newFloatingUnitWithPercentPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingUnitWithPercentPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingUnitWithPercentPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingUnitWithPercentPrice.metadata())
            .isEqualTo(
                NewFloatingUnitWithPercentPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingUnitWithPercentPrice =
            NewFloatingUnitWithPercentPrice.builder()
                .cadence(NewFloatingUnitWithPercentPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingUnitWithPercentPrice.ModelType.UNIT_WITH_PERCENT)
                .name("Annual fee")
                .unitWithPercentConfig(
                    NewFloatingUnitWithPercentPrice.UnitWithPercentConfig.builder()
                        .percent("percent")
                        .unitAmount("unit_amount")
                        .build()
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
                    NewFloatingUnitWithPercentPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingUnitWithPercentPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingUnitWithPercentPrice),
                jacksonTypeRef<NewFloatingUnitWithPercentPrice>(),
            )

        assertThat(roundtrippedNewFloatingUnitWithPercentPrice)
            .isEqualTo(newFloatingUnitWithPercentPrice)
    }
}
