// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanTierWithProrationPriceTest {

    @Test
    fun create() {
        val newPlanTierWithProrationPrice =
            NewPlanTierWithProrationPrice.builder()
                .cadence(NewPlanTierWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanTierWithProrationPrice.ModelType.TIERED_WITH_PRORATION)
                .name("Annual fee")
                .tieredWithProrationConfig(
                    NewPlanTierWithProrationPrice.TieredWithProrationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
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
                    NewPlanTierWithProrationPrice.ConversionRateConfig.Unit.UnitConfig.builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewPlanTierWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanTierWithProrationPrice.cadence())
            .isEqualTo(NewPlanTierWithProrationPrice.Cadence.ANNUAL)
        assertThat(newPlanTierWithProrationPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanTierWithProrationPrice.modelType())
            .isEqualTo(NewPlanTierWithProrationPrice.ModelType.TIERED_WITH_PRORATION)
        assertThat(newPlanTierWithProrationPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanTierWithProrationPrice.tieredWithProrationConfig())
            .isEqualTo(
                NewPlanTierWithProrationPrice.TieredWithProrationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanTierWithProrationPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newPlanTierWithProrationPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanTierWithProrationPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTierWithProrationPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanTierWithProrationPrice.conversionRateConfig())
            .isEqualTo(
                NewPlanTierWithProrationPrice.ConversionRateConfig.ofUnit(
                    NewPlanTierWithProrationPrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewPlanTierWithProrationPrice.ConversionRateConfig.Unit.UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newPlanTierWithProrationPrice.currency()).isEqualTo("currency")
        assertThat(newPlanTierWithProrationPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanTierWithProrationPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newPlanTierWithProrationPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanTierWithProrationPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanTierWithProrationPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTierWithProrationPrice.metadata())
            .isEqualTo(
                NewPlanTierWithProrationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanTierWithProrationPrice =
            NewPlanTierWithProrationPrice.builder()
                .cadence(NewPlanTierWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanTierWithProrationPrice.ModelType.TIERED_WITH_PRORATION)
                .name("Annual fee")
                .tieredWithProrationConfig(
                    NewPlanTierWithProrationPrice.TieredWithProrationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
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
                    NewPlanTierWithProrationPrice.ConversionRateConfig.Unit.UnitConfig.builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewPlanTierWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanTierWithProrationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanTierWithProrationPrice),
                jacksonTypeRef<NewPlanTierWithProrationPrice>(),
            )

        assertThat(roundtrippedNewPlanTierWithProrationPrice)
            .isEqualTo(newPlanTierWithProrationPrice)
    }
}
