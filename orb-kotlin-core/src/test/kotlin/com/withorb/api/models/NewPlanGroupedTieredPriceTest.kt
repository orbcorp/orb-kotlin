// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanGroupedTieredPriceTest {

    @Test
    fun create() {
        val newPlanGroupedTieredPrice =
            NewPlanGroupedTieredPrice.builder()
                .cadence(NewPlanGroupedTieredPrice.Cadence.ANNUAL)
                .groupedTieredConfig(
                    NewPlanGroupedTieredPrice.GroupedTieredConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewPlanGroupedTieredPrice.ModelType.GROUPED_TIERED)
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
                    NewPlanGroupedTieredPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newPlanGroupedTieredPrice.cadence())
            .isEqualTo(NewPlanGroupedTieredPrice.Cadence.ANNUAL)
        assertThat(newPlanGroupedTieredPrice.groupedTieredConfig())
            .isEqualTo(
                NewPlanGroupedTieredPrice.GroupedTieredConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanGroupedTieredPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanGroupedTieredPrice.modelType())
            .isEqualTo(NewPlanGroupedTieredPrice.ModelType.GROUPED_TIERED)
        assertThat(newPlanGroupedTieredPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanGroupedTieredPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newPlanGroupedTieredPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanGroupedTieredPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedTieredPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanGroupedTieredPrice.conversionRateConfig())
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
        assertThat(newPlanGroupedTieredPrice.currency()).isEqualTo("currency")
        assertThat(newPlanGroupedTieredPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanGroupedTieredPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newPlanGroupedTieredPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanGroupedTieredPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanGroupedTieredPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedTieredPrice.metadata())
            .isEqualTo(
                NewPlanGroupedTieredPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newPlanGroupedTieredPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanGroupedTieredPrice =
            NewPlanGroupedTieredPrice.builder()
                .cadence(NewPlanGroupedTieredPrice.Cadence.ANNUAL)
                .groupedTieredConfig(
                    NewPlanGroupedTieredPrice.GroupedTieredConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewPlanGroupedTieredPrice.ModelType.GROUPED_TIERED)
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
                    NewPlanGroupedTieredPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewPlanGroupedTieredPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanGroupedTieredPrice),
                jacksonTypeRef<NewPlanGroupedTieredPrice>(),
            )

        assertThat(roundtrippedNewPlanGroupedTieredPrice).isEqualTo(newPlanGroupedTieredPrice)
    }
}
