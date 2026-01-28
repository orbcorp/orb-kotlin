// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingGroupedWithMeteredMinimumPriceTest {

    @Test
    fun create() {
        val newFloatingGroupedWithMeteredMinimumPrice =
            NewFloatingGroupedWithMeteredMinimumPrice.builder()
                .cadence(NewFloatingGroupedWithMeteredMinimumPrice.Cadence.ANNUAL)
                .currency("currency")
                .groupedWithMeteredMinimumConfig(
                    NewFloatingGroupedWithMeteredMinimumPrice.GroupedWithMeteredMinimumConfig
                        .builder()
                        .groupingKey("x")
                        .minimumUnitAmount("minimum_unit_amount")
                        .pricingKey("pricing_key")
                        .addScalingFactor(
                            NewFloatingGroupedWithMeteredMinimumPrice
                                .GroupedWithMeteredMinimumConfig
                                .ScalingFactor
                                .builder()
                                .scalingFactor("scaling_factor")
                                .scalingValue("scaling_value")
                                .build()
                        )
                        .scalingKey("scaling_key")
                        .addUnitAmount(
                            NewFloatingGroupedWithMeteredMinimumPrice
                                .GroupedWithMeteredMinimumConfig
                                .UnitAmount
                                .builder()
                                .pricingValue("pricing_value")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewFloatingGroupedWithMeteredMinimumPrice.ModelType.GROUPED_WITH_METERED_MINIMUM
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
                    NewFloatingGroupedWithMeteredMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingGroupedWithMeteredMinimumPrice.cadence())
            .isEqualTo(NewFloatingGroupedWithMeteredMinimumPrice.Cadence.ANNUAL)
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.groupedWithMeteredMinimumConfig())
            .isEqualTo(
                NewFloatingGroupedWithMeteredMinimumPrice.GroupedWithMeteredMinimumConfig.builder()
                    .groupingKey("x")
                    .minimumUnitAmount("minimum_unit_amount")
                    .pricingKey("pricing_key")
                    .addScalingFactor(
                        NewFloatingGroupedWithMeteredMinimumPrice.GroupedWithMeteredMinimumConfig
                            .ScalingFactor
                            .builder()
                            .scalingFactor("scaling_factor")
                            .scalingValue("scaling_value")
                            .build()
                    )
                    .scalingKey("scaling_key")
                    .addUnitAmount(
                        NewFloatingGroupedWithMeteredMinimumPrice.GroupedWithMeteredMinimumConfig
                            .UnitAmount
                            .builder()
                            .pricingValue("pricing_value")
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .build()
            )
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.modelType())
            .isEqualTo(
                NewFloatingGroupedWithMeteredMinimumPrice.ModelType.GROUPED_WITH_METERED_MINIMUM
            )
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.conversionRateConfig())
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
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingGroupedWithMeteredMinimumPrice.metadata())
            .isEqualTo(
                NewFloatingGroupedWithMeteredMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingGroupedWithMeteredMinimumPrice =
            NewFloatingGroupedWithMeteredMinimumPrice.builder()
                .cadence(NewFloatingGroupedWithMeteredMinimumPrice.Cadence.ANNUAL)
                .currency("currency")
                .groupedWithMeteredMinimumConfig(
                    NewFloatingGroupedWithMeteredMinimumPrice.GroupedWithMeteredMinimumConfig
                        .builder()
                        .groupingKey("x")
                        .minimumUnitAmount("minimum_unit_amount")
                        .pricingKey("pricing_key")
                        .addScalingFactor(
                            NewFloatingGroupedWithMeteredMinimumPrice
                                .GroupedWithMeteredMinimumConfig
                                .ScalingFactor
                                .builder()
                                .scalingFactor("scaling_factor")
                                .scalingValue("scaling_value")
                                .build()
                        )
                        .scalingKey("scaling_key")
                        .addUnitAmount(
                            NewFloatingGroupedWithMeteredMinimumPrice
                                .GroupedWithMeteredMinimumConfig
                                .UnitAmount
                                .builder()
                                .pricingValue("pricing_value")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewFloatingGroupedWithMeteredMinimumPrice.ModelType.GROUPED_WITH_METERED_MINIMUM
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
                    NewFloatingGroupedWithMeteredMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingGroupedWithMeteredMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingGroupedWithMeteredMinimumPrice),
                jacksonTypeRef<NewFloatingGroupedWithMeteredMinimumPrice>(),
            )

        assertThat(roundtrippedNewFloatingGroupedWithMeteredMinimumPrice)
            .isEqualTo(newFloatingGroupedWithMeteredMinimumPrice)
    }
}
