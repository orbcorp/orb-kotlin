// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanGroupedWithMeteredMinimumPriceTest {

    @Test
    fun create() {
        val newPlanGroupedWithMeteredMinimumPrice =
            NewPlanGroupedWithMeteredMinimumPrice.builder()
                .cadence(NewPlanGroupedWithMeteredMinimumPrice.Cadence.ANNUAL)
                .groupedWithMeteredMinimumConfig(
                    NewPlanGroupedWithMeteredMinimumPrice.GroupedWithMeteredMinimumConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewPlanGroupedWithMeteredMinimumPrice.ModelType.GROUPED_WITH_METERED_MINIMUM
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
                    NewPlanGroupedWithMeteredMinimumPrice.ConversionRateConfig.Unit.UnitConfig
                        .builder()
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
                    NewPlanGroupedWithMeteredMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanGroupedWithMeteredMinimumPrice.cadence())
            .isEqualTo(NewPlanGroupedWithMeteredMinimumPrice.Cadence.ANNUAL)
        assertThat(newPlanGroupedWithMeteredMinimumPrice.groupedWithMeteredMinimumConfig())
            .isEqualTo(
                NewPlanGroupedWithMeteredMinimumPrice.GroupedWithMeteredMinimumConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanGroupedWithMeteredMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanGroupedWithMeteredMinimumPrice.modelType())
            .isEqualTo(NewPlanGroupedWithMeteredMinimumPrice.ModelType.GROUPED_WITH_METERED_MINIMUM)
        assertThat(newPlanGroupedWithMeteredMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanGroupedWithMeteredMinimumPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newPlanGroupedWithMeteredMinimumPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanGroupedWithMeteredMinimumPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedWithMeteredMinimumPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanGroupedWithMeteredMinimumPrice.conversionRateConfig())
            .isEqualTo(
                NewPlanGroupedWithMeteredMinimumPrice.ConversionRateConfig.ofUnit(
                    NewPlanGroupedWithMeteredMinimumPrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewPlanGroupedWithMeteredMinimumPrice.ConversionRateConfig.Unit
                                .UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newPlanGroupedWithMeteredMinimumPrice.currency()).isEqualTo("currency")
        assertThat(newPlanGroupedWithMeteredMinimumPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanGroupedWithMeteredMinimumPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newPlanGroupedWithMeteredMinimumPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanGroupedWithMeteredMinimumPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanGroupedWithMeteredMinimumPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedWithMeteredMinimumPrice.metadata())
            .isEqualTo(
                NewPlanGroupedWithMeteredMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanGroupedWithMeteredMinimumPrice =
            NewPlanGroupedWithMeteredMinimumPrice.builder()
                .cadence(NewPlanGroupedWithMeteredMinimumPrice.Cadence.ANNUAL)
                .groupedWithMeteredMinimumConfig(
                    NewPlanGroupedWithMeteredMinimumPrice.GroupedWithMeteredMinimumConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewPlanGroupedWithMeteredMinimumPrice.ModelType.GROUPED_WITH_METERED_MINIMUM
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
                    NewPlanGroupedWithMeteredMinimumPrice.ConversionRateConfig.Unit.UnitConfig
                        .builder()
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
                    NewPlanGroupedWithMeteredMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanGroupedWithMeteredMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanGroupedWithMeteredMinimumPrice),
                jacksonTypeRef<NewPlanGroupedWithMeteredMinimumPrice>(),
            )

        assertThat(roundtrippedNewPlanGroupedWithMeteredMinimumPrice)
            .isEqualTo(newPlanGroupedWithMeteredMinimumPrice)
    }
}
