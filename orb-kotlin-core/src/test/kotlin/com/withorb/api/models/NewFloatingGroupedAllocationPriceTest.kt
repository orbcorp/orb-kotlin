// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingGroupedAllocationPriceTest {

    @Test
    fun create() {
        val newFloatingGroupedAllocationPrice =
            NewFloatingGroupedAllocationPrice.builder()
                .cadence(NewFloatingGroupedAllocationPrice.Cadence.ANNUAL)
                .currency("currency")
                .groupedAllocationConfig(
                    NewFloatingGroupedAllocationPrice.GroupedAllocationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewFloatingGroupedAllocationPrice.ModelType.GROUPED_ALLOCATION)
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
                    NewFloatingGroupedAllocationPrice.ConversionRateConfig.Unit.UnitConfig.builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewFloatingGroupedAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingGroupedAllocationPrice.cadence())
            .isEqualTo(NewFloatingGroupedAllocationPrice.Cadence.ANNUAL)
        assertThat(newFloatingGroupedAllocationPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingGroupedAllocationPrice.groupedAllocationConfig())
            .isEqualTo(
                NewFloatingGroupedAllocationPrice.GroupedAllocationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingGroupedAllocationPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingGroupedAllocationPrice.modelType())
            .isEqualTo(NewFloatingGroupedAllocationPrice.ModelType.GROUPED_ALLOCATION)
        assertThat(newFloatingGroupedAllocationPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingGroupedAllocationPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newFloatingGroupedAllocationPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingGroupedAllocationPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingGroupedAllocationPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingGroupedAllocationPrice.conversionRateConfig())
            .isEqualTo(
                NewFloatingGroupedAllocationPrice.ConversionRateConfig.ofUnit(
                    NewFloatingGroupedAllocationPrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewFloatingGroupedAllocationPrice.ConversionRateConfig.Unit.UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingGroupedAllocationPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingGroupedAllocationPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newFloatingGroupedAllocationPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingGroupedAllocationPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingGroupedAllocationPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingGroupedAllocationPrice.metadata())
            .isEqualTo(
                NewFloatingGroupedAllocationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingGroupedAllocationPrice =
            NewFloatingGroupedAllocationPrice.builder()
                .cadence(NewFloatingGroupedAllocationPrice.Cadence.ANNUAL)
                .currency("currency")
                .groupedAllocationConfig(
                    NewFloatingGroupedAllocationPrice.GroupedAllocationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewFloatingGroupedAllocationPrice.ModelType.GROUPED_ALLOCATION)
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
                    NewFloatingGroupedAllocationPrice.ConversionRateConfig.Unit.UnitConfig.builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewFloatingGroupedAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingGroupedAllocationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingGroupedAllocationPrice),
                jacksonTypeRef<NewFloatingGroupedAllocationPrice>(),
            )

        assertThat(roundtrippedNewFloatingGroupedAllocationPrice)
            .isEqualTo(newFloatingGroupedAllocationPrice)
    }
}
