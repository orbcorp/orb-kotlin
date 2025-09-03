// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanGroupedWithProratedMinimumPriceTest {

    @Test
    fun create() {
        val newPlanGroupedWithProratedMinimumPrice =
            NewPlanGroupedWithProratedMinimumPrice.builder()
                .cadence(NewPlanGroupedWithProratedMinimumPrice.Cadence.ANNUAL)
                .groupedWithProratedMinimumConfig(
                    NewPlanGroupedWithProratedMinimumPrice.GroupedWithProratedMinimumConfig
                        .builder()
                        .groupingKey("x")
                        .minimum("minimum")
                        .unitRate("unit_rate")
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewPlanGroupedWithProratedMinimumPrice.ModelType.GROUPED_WITH_PRORATED_MINIMUM
                )
                .name("Annual fee")
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
                    NewPlanGroupedWithProratedMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newPlanGroupedWithProratedMinimumPrice.cadence())
            .isEqualTo(NewPlanGroupedWithProratedMinimumPrice.Cadence.ANNUAL)
        assertThat(newPlanGroupedWithProratedMinimumPrice.groupedWithProratedMinimumConfig())
            .isEqualTo(
                NewPlanGroupedWithProratedMinimumPrice.GroupedWithProratedMinimumConfig.builder()
                    .groupingKey("x")
                    .minimum("minimum")
                    .unitRate("unit_rate")
                    .build()
            )
        assertThat(newPlanGroupedWithProratedMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanGroupedWithProratedMinimumPrice.modelType())
            .isEqualTo(
                NewPlanGroupedWithProratedMinimumPrice.ModelType.GROUPED_WITH_PRORATED_MINIMUM
            )
        assertThat(newPlanGroupedWithProratedMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanGroupedWithProratedMinimumPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newPlanGroupedWithProratedMinimumPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanGroupedWithProratedMinimumPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedWithProratedMinimumPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanGroupedWithProratedMinimumPrice.conversionRateConfig())
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
        assertThat(newPlanGroupedWithProratedMinimumPrice.currency()).isEqualTo("currency")
        assertThat(newPlanGroupedWithProratedMinimumPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanGroupedWithProratedMinimumPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newPlanGroupedWithProratedMinimumPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanGroupedWithProratedMinimumPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanGroupedWithProratedMinimumPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedWithProratedMinimumPrice.metadata())
            .isEqualTo(
                NewPlanGroupedWithProratedMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newPlanGroupedWithProratedMinimumPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanGroupedWithProratedMinimumPrice =
            NewPlanGroupedWithProratedMinimumPrice.builder()
                .cadence(NewPlanGroupedWithProratedMinimumPrice.Cadence.ANNUAL)
                .groupedWithProratedMinimumConfig(
                    NewPlanGroupedWithProratedMinimumPrice.GroupedWithProratedMinimumConfig
                        .builder()
                        .groupingKey("x")
                        .minimum("minimum")
                        .unitRate("unit_rate")
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewPlanGroupedWithProratedMinimumPrice.ModelType.GROUPED_WITH_PRORATED_MINIMUM
                )
                .name("Annual fee")
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
                    NewPlanGroupedWithProratedMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewPlanGroupedWithProratedMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanGroupedWithProratedMinimumPrice),
                jacksonTypeRef<NewPlanGroupedWithProratedMinimumPrice>(),
            )

        assertThat(roundtrippedNewPlanGroupedWithProratedMinimumPrice)
            .isEqualTo(newPlanGroupedWithProratedMinimumPrice)
    }
}
