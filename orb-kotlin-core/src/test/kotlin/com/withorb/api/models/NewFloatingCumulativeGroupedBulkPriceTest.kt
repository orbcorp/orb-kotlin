// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingCumulativeGroupedBulkPriceTest {

    @Test
    fun create() {
        val newFloatingCumulativeGroupedBulkPrice =
            NewFloatingCumulativeGroupedBulkPrice.builder()
                .cadence(NewFloatingCumulativeGroupedBulkPrice.Cadence.ANNUAL)
                .cumulativeGroupedBulkConfig(
                    NewFloatingCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig.builder()
                        .addDimensionValue(
                            NewFloatingCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig
                                .DimensionValue
                                .builder()
                                .groupingKey("x")
                                .tierLowerBound("tier_lower_bound")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .group("group")
                        .build()
                )
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingCumulativeGroupedBulkPrice.ModelType.CUMULATIVE_GROUPED_BULK)
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
                    NewFloatingCumulativeGroupedBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingCumulativeGroupedBulkPrice.cadence())
            .isEqualTo(NewFloatingCumulativeGroupedBulkPrice.Cadence.ANNUAL)
        assertThat(newFloatingCumulativeGroupedBulkPrice.cumulativeGroupedBulkConfig())
            .isEqualTo(
                NewFloatingCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig.builder()
                    .addDimensionValue(
                        NewFloatingCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig
                            .DimensionValue
                            .builder()
                            .groupingKey("x")
                            .tierLowerBound("tier_lower_bound")
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .group("group")
                    .build()
            )
        assertThat(newFloatingCumulativeGroupedBulkPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingCumulativeGroupedBulkPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingCumulativeGroupedBulkPrice.modelType())
            .isEqualTo(NewFloatingCumulativeGroupedBulkPrice.ModelType.CUMULATIVE_GROUPED_BULK)
        assertThat(newFloatingCumulativeGroupedBulkPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingCumulativeGroupedBulkPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newFloatingCumulativeGroupedBulkPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingCumulativeGroupedBulkPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingCumulativeGroupedBulkPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingCumulativeGroupedBulkPrice.conversionRateConfig())
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
        assertThat(newFloatingCumulativeGroupedBulkPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingCumulativeGroupedBulkPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newFloatingCumulativeGroupedBulkPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingCumulativeGroupedBulkPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingCumulativeGroupedBulkPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingCumulativeGroupedBulkPrice.metadata())
            .isEqualTo(
                NewFloatingCumulativeGroupedBulkPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingCumulativeGroupedBulkPrice =
            NewFloatingCumulativeGroupedBulkPrice.builder()
                .cadence(NewFloatingCumulativeGroupedBulkPrice.Cadence.ANNUAL)
                .cumulativeGroupedBulkConfig(
                    NewFloatingCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig.builder()
                        .addDimensionValue(
                            NewFloatingCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig
                                .DimensionValue
                                .builder()
                                .groupingKey("x")
                                .tierLowerBound("tier_lower_bound")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .group("group")
                        .build()
                )
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingCumulativeGroupedBulkPrice.ModelType.CUMULATIVE_GROUPED_BULK)
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
                    NewFloatingCumulativeGroupedBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingCumulativeGroupedBulkPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingCumulativeGroupedBulkPrice),
                jacksonTypeRef<NewFloatingCumulativeGroupedBulkPrice>(),
            )

        assertThat(roundtrippedNewFloatingCumulativeGroupedBulkPrice)
            .isEqualTo(newFloatingCumulativeGroupedBulkPrice)
    }
}
