// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanTieredWithMinimumPriceTest {

    @Test
    fun create() {
        val newPlanTieredWithMinimumPrice =
            NewPlanTieredWithMinimumPrice.builder()
                .cadence(NewPlanTieredWithMinimumPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
                .name("Annual fee")
                .tieredWithMinimumConfig(
                    NewPlanTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
                        .addTier(
                            NewPlanTieredWithMinimumPrice.TieredWithMinimumConfig.Tier.builder()
                                .minimumAmount("minimum_amount")
                                .tierLowerBound("tier_lower_bound")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .addTier(
                            NewPlanTieredWithMinimumPrice.TieredWithMinimumConfig.Tier.builder()
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
                    NewPlanTieredWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newPlanTieredWithMinimumPrice.cadence())
            .isEqualTo(NewPlanTieredWithMinimumPrice.Cadence.ANNUAL)
        assertThat(newPlanTieredWithMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanTieredWithMinimumPrice.modelType())
            .isEqualTo(NewPlanTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
        assertThat(newPlanTieredWithMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanTieredWithMinimumPrice.tieredWithMinimumConfig())
            .isEqualTo(
                NewPlanTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
                    .addTier(
                        NewPlanTieredWithMinimumPrice.TieredWithMinimumConfig.Tier.builder()
                            .minimumAmount("minimum_amount")
                            .tierLowerBound("tier_lower_bound")
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .addTier(
                        NewPlanTieredWithMinimumPrice.TieredWithMinimumConfig.Tier.builder()
                            .minimumAmount("minimum_amount")
                            .tierLowerBound("tier_lower_bound")
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .hideZeroAmountTiers(true)
                    .prorate(true)
                    .build()
            )
        assertThat(newPlanTieredWithMinimumPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newPlanTieredWithMinimumPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanTieredWithMinimumPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTieredWithMinimumPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanTieredWithMinimumPrice.conversionRateConfig())
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
        assertThat(newPlanTieredWithMinimumPrice.currency()).isEqualTo("currency")
        assertThat(newPlanTieredWithMinimumPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanTieredWithMinimumPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newPlanTieredWithMinimumPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanTieredWithMinimumPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanTieredWithMinimumPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTieredWithMinimumPrice.metadata())
            .isEqualTo(
                NewPlanTieredWithMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newPlanTieredWithMinimumPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanTieredWithMinimumPrice =
            NewPlanTieredWithMinimumPrice.builder()
                .cadence(NewPlanTieredWithMinimumPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
                .name("Annual fee")
                .tieredWithMinimumConfig(
                    NewPlanTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
                        .addTier(
                            NewPlanTieredWithMinimumPrice.TieredWithMinimumConfig.Tier.builder()
                                .minimumAmount("minimum_amount")
                                .tierLowerBound("tier_lower_bound")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .addTier(
                            NewPlanTieredWithMinimumPrice.TieredWithMinimumConfig.Tier.builder()
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
                    NewPlanTieredWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewPlanTieredWithMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanTieredWithMinimumPrice),
                jacksonTypeRef<NewPlanTieredWithMinimumPrice>(),
            )

        assertThat(roundtrippedNewPlanTieredWithMinimumPrice)
            .isEqualTo(newPlanTieredWithMinimumPrice)
    }
}
