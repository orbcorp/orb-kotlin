// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingTieredWithMinimumPriceTest {

    @Test
    fun create() {
        val newFloatingTieredWithMinimumPrice =
            NewFloatingTieredWithMinimumPrice.builder()
                .cadence(NewFloatingTieredWithMinimumPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
                .name("Annual fee")
                .tieredWithMinimumConfig(
                    NewFloatingTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
                        .addTier(
                            NewFloatingTieredWithMinimumPrice.TieredWithMinimumConfig.Tier.builder()
                                .minimumAmount("minimum_amount")
                                .tierLowerBound("tier_lower_bound")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .addTier(
                            NewFloatingTieredWithMinimumPrice.TieredWithMinimumConfig.Tier.builder()
                                .minimumAmount("minimum_amount")
                                .tierLowerBound("tier_lower_bound")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .hideZeroAmountTiers(true)
                        .prorate(true)
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
                    NewFloatingTieredWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingTieredWithMinimumPrice.cadence())
            .isEqualTo(NewFloatingTieredWithMinimumPrice.Cadence.ANNUAL)
        assertThat(newFloatingTieredWithMinimumPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingTieredWithMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingTieredWithMinimumPrice.modelType())
            .isEqualTo(NewFloatingTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
        assertThat(newFloatingTieredWithMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingTieredWithMinimumPrice.tieredWithMinimumConfig())
            .isEqualTo(
                NewFloatingTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
                    .addTier(
                        NewFloatingTieredWithMinimumPrice.TieredWithMinimumConfig.Tier.builder()
                            .minimumAmount("minimum_amount")
                            .tierLowerBound("tier_lower_bound")
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .addTier(
                        NewFloatingTieredWithMinimumPrice.TieredWithMinimumConfig.Tier.builder()
                            .minimumAmount("minimum_amount")
                            .tierLowerBound("tier_lower_bound")
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .hideZeroAmountTiers(true)
                    .prorate(true)
                    .build()
            )
        assertThat(newFloatingTieredWithMinimumPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newFloatingTieredWithMinimumPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingTieredWithMinimumPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredWithMinimumPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingTieredWithMinimumPrice.conversionRateConfig())
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
        assertThat(newFloatingTieredWithMinimumPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingTieredWithMinimumPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newFloatingTieredWithMinimumPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingTieredWithMinimumPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingTieredWithMinimumPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredWithMinimumPrice.metadata())
            .isEqualTo(
                NewFloatingTieredWithMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingTieredWithMinimumPrice =
            NewFloatingTieredWithMinimumPrice.builder()
                .cadence(NewFloatingTieredWithMinimumPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
                .name("Annual fee")
                .tieredWithMinimumConfig(
                    NewFloatingTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
                        .addTier(
                            NewFloatingTieredWithMinimumPrice.TieredWithMinimumConfig.Tier.builder()
                                .minimumAmount("minimum_amount")
                                .tierLowerBound("tier_lower_bound")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .addTier(
                            NewFloatingTieredWithMinimumPrice.TieredWithMinimumConfig.Tier.builder()
                                .minimumAmount("minimum_amount")
                                .tierLowerBound("tier_lower_bound")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .hideZeroAmountTiers(true)
                        .prorate(true)
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
                    NewFloatingTieredWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingTieredWithMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingTieredWithMinimumPrice),
                jacksonTypeRef<NewFloatingTieredWithMinimumPrice>(),
            )

        assertThat(roundtrippedNewFloatingTieredWithMinimumPrice)
            .isEqualTo(newFloatingTieredWithMinimumPrice)
    }
}
