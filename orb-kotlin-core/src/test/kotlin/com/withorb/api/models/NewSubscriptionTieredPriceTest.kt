// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionTieredPriceTest {

    @Test
    fun create() {
        val newSubscriptionTieredPrice =
            NewSubscriptionTieredPrice.builder()
                .cadence(NewSubscriptionTieredPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionTieredPrice.ModelType.TIERED)
                .name("Annual fee")
                .tieredConfig(
                    TieredConfig.builder()
                        .addTier(
                            Tier.builder()
                                .firstUnit(0.0)
                                .unitAmount("unit_amount")
                                .lastUnit(0.0)
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
                    NewSubscriptionTieredPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionTieredPrice.cadence())
            .isEqualTo(NewSubscriptionTieredPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionTieredPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionTieredPrice.modelType())
            .isEqualTo(NewSubscriptionTieredPrice.ModelType.TIERED)
        assertThat(newSubscriptionTieredPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionTieredPrice.tieredConfig())
            .isEqualTo(
                TieredConfig.builder()
                    .addTier(
                        Tier.builder()
                            .firstUnit(0.0)
                            .unitAmount("unit_amount")
                            .lastUnit(0.0)
                            .build()
                    )
                    .build()
            )
        assertThat(newSubscriptionTieredPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newSubscriptionTieredPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionTieredPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionTieredPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionTieredPrice.conversionRateConfig())
            .isEqualTo(
                NewSubscriptionTieredPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionTieredPrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionTieredPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionTieredPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newSubscriptionTieredPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionTieredPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionTieredPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionTieredPrice.metadata())
            .isEqualTo(
                NewSubscriptionTieredPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionTieredPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionTieredPrice =
            NewSubscriptionTieredPrice.builder()
                .cadence(NewSubscriptionTieredPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionTieredPrice.ModelType.TIERED)
                .name("Annual fee")
                .tieredConfig(
                    TieredConfig.builder()
                        .addTier(
                            Tier.builder()
                                .firstUnit(0.0)
                                .unitAmount("unit_amount")
                                .lastUnit(0.0)
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
                    NewSubscriptionTieredPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionTieredPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionTieredPrice),
                jacksonTypeRef<NewSubscriptionTieredPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionTieredPrice).isEqualTo(newSubscriptionTieredPrice)
    }
}
