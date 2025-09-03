// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingGroupedTieredPriceTest {

    @Test
    fun create() {
        val newFloatingGroupedTieredPrice =
            NewFloatingGroupedTieredPrice.builder()
                .cadence(NewFloatingGroupedTieredPrice.Cadence.ANNUAL)
                .currency("currency")
                .groupedTieredConfig(
                    NewFloatingGroupedTieredPrice.GroupedTieredConfig.builder()
                        .groupingKey("x")
                        .addTier(
                            NewFloatingGroupedTieredPrice.GroupedTieredConfig.Tier.builder()
                                .tierLowerBound("tier_lower_bound")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .addTier(
                            NewFloatingGroupedTieredPrice.GroupedTieredConfig.Tier.builder()
                                .tierLowerBound("tier_lower_bound")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
                .itemId("item_id")
                .modelType(NewFloatingGroupedTieredPrice.ModelType.GROUPED_TIERED)
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
                    NewFloatingGroupedTieredPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingGroupedTieredPrice.cadence())
            .isEqualTo(NewFloatingGroupedTieredPrice.Cadence.ANNUAL)
        assertThat(newFloatingGroupedTieredPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingGroupedTieredPrice.groupedTieredConfig())
            .isEqualTo(
                NewFloatingGroupedTieredPrice.GroupedTieredConfig.builder()
                    .groupingKey("x")
                    .addTier(
                        NewFloatingGroupedTieredPrice.GroupedTieredConfig.Tier.builder()
                            .tierLowerBound("tier_lower_bound")
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .addTier(
                        NewFloatingGroupedTieredPrice.GroupedTieredConfig.Tier.builder()
                            .tierLowerBound("tier_lower_bound")
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .build()
            )
        assertThat(newFloatingGroupedTieredPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingGroupedTieredPrice.modelType())
            .isEqualTo(NewFloatingGroupedTieredPrice.ModelType.GROUPED_TIERED)
        assertThat(newFloatingGroupedTieredPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingGroupedTieredPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newFloatingGroupedTieredPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingGroupedTieredPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingGroupedTieredPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingGroupedTieredPrice.conversionRateConfig())
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
        assertThat(newFloatingGroupedTieredPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingGroupedTieredPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newFloatingGroupedTieredPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingGroupedTieredPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingGroupedTieredPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingGroupedTieredPrice.metadata())
            .isEqualTo(
                NewFloatingGroupedTieredPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingGroupedTieredPrice =
            NewFloatingGroupedTieredPrice.builder()
                .cadence(NewFloatingGroupedTieredPrice.Cadence.ANNUAL)
                .currency("currency")
                .groupedTieredConfig(
                    NewFloatingGroupedTieredPrice.GroupedTieredConfig.builder()
                        .groupingKey("x")
                        .addTier(
                            NewFloatingGroupedTieredPrice.GroupedTieredConfig.Tier.builder()
                                .tierLowerBound("tier_lower_bound")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .addTier(
                            NewFloatingGroupedTieredPrice.GroupedTieredConfig.Tier.builder()
                                .tierLowerBound("tier_lower_bound")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
                .itemId("item_id")
                .modelType(NewFloatingGroupedTieredPrice.ModelType.GROUPED_TIERED)
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
                    NewFloatingGroupedTieredPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingGroupedTieredPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingGroupedTieredPrice),
                jacksonTypeRef<NewFloatingGroupedTieredPrice>(),
            )

        assertThat(roundtrippedNewFloatingGroupedTieredPrice)
            .isEqualTo(newFloatingGroupedTieredPrice)
    }
}
