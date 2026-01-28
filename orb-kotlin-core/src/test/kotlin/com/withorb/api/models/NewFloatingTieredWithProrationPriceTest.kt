// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingTieredWithProrationPriceTest {

    @Test
    fun create() {
        val newFloatingTieredWithProrationPrice =
            NewFloatingTieredWithProrationPrice.builder()
                .cadence(NewFloatingTieredWithProrationPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingTieredWithProrationPrice.ModelType.TIERED_WITH_PRORATION)
                .name("Annual fee")
                .tieredWithProrationConfig(
                    NewFloatingTieredWithProrationPrice.TieredWithProrationConfig.builder()
                        .addTier(
                            NewFloatingTieredWithProrationPrice.TieredWithProrationConfig.Tier
                                .builder()
                                .tierLowerBound("tier_lower_bound")
                                .unitAmount("unit_amount")
                                .build()
                        )
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
                    NewFloatingTieredWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingTieredWithProrationPrice.cadence())
            .isEqualTo(NewFloatingTieredWithProrationPrice.Cadence.ANNUAL)
        assertThat(newFloatingTieredWithProrationPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingTieredWithProrationPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingTieredWithProrationPrice.modelType())
            .isEqualTo(NewFloatingTieredWithProrationPrice.ModelType.TIERED_WITH_PRORATION)
        assertThat(newFloatingTieredWithProrationPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingTieredWithProrationPrice.tieredWithProrationConfig())
            .isEqualTo(
                NewFloatingTieredWithProrationPrice.TieredWithProrationConfig.builder()
                    .addTier(
                        NewFloatingTieredWithProrationPrice.TieredWithProrationConfig.Tier.builder()
                            .tierLowerBound("tier_lower_bound")
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .build()
            )
        assertThat(newFloatingTieredWithProrationPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newFloatingTieredWithProrationPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingTieredWithProrationPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredWithProrationPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingTieredWithProrationPrice.conversionRateConfig())
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
        assertThat(newFloatingTieredWithProrationPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingTieredWithProrationPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newFloatingTieredWithProrationPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingTieredWithProrationPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingTieredWithProrationPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredWithProrationPrice.metadata())
            .isEqualTo(
                NewFloatingTieredWithProrationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingTieredWithProrationPrice =
            NewFloatingTieredWithProrationPrice.builder()
                .cadence(NewFloatingTieredWithProrationPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingTieredWithProrationPrice.ModelType.TIERED_WITH_PRORATION)
                .name("Annual fee")
                .tieredWithProrationConfig(
                    NewFloatingTieredWithProrationPrice.TieredWithProrationConfig.builder()
                        .addTier(
                            NewFloatingTieredWithProrationPrice.TieredWithProrationConfig.Tier
                                .builder()
                                .tierLowerBound("tier_lower_bound")
                                .unitAmount("unit_amount")
                                .build()
                        )
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
                    NewFloatingTieredWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingTieredWithProrationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingTieredWithProrationPrice),
                jacksonTypeRef<NewFloatingTieredWithProrationPrice>(),
            )

        assertThat(roundtrippedNewFloatingTieredWithProrationPrice)
            .isEqualTo(newFloatingTieredWithProrationPrice)
    }
}
