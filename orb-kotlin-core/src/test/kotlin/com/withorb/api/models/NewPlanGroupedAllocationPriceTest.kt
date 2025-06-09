// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanGroupedAllocationPriceTest {

    @Test
    fun create() {
        val newPlanGroupedAllocationPrice =
            NewPlanGroupedAllocationPrice.builder()
                .cadence(NewPlanGroupedAllocationPrice.Cadence.ANNUAL)
                .groupedAllocationConfig(
                    NewPlanGroupedAllocationPrice.GroupedAllocationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewPlanGroupedAllocationPrice.ModelType.GROUPED_ALLOCATION)
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
                    NewPlanGroupedAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanGroupedAllocationPrice.cadence())
            .isEqualTo(NewPlanGroupedAllocationPrice.Cadence.ANNUAL)
        assertThat(newPlanGroupedAllocationPrice.groupedAllocationConfig())
            .isEqualTo(
                NewPlanGroupedAllocationPrice.GroupedAllocationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanGroupedAllocationPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanGroupedAllocationPrice.modelType())
            .isEqualTo(NewPlanGroupedAllocationPrice.ModelType.GROUPED_ALLOCATION)
        assertThat(newPlanGroupedAllocationPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanGroupedAllocationPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newPlanGroupedAllocationPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanGroupedAllocationPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedAllocationPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanGroupedAllocationPrice.conversionRateConfig())
            .isEqualTo(
                NewPlanGroupedAllocationPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newPlanGroupedAllocationPrice.currency()).isEqualTo("currency")
        assertThat(newPlanGroupedAllocationPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanGroupedAllocationPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newPlanGroupedAllocationPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanGroupedAllocationPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanGroupedAllocationPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedAllocationPrice.metadata())
            .isEqualTo(
                NewPlanGroupedAllocationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanGroupedAllocationPrice =
            NewPlanGroupedAllocationPrice.builder()
                .cadence(NewPlanGroupedAllocationPrice.Cadence.ANNUAL)
                .groupedAllocationConfig(
                    NewPlanGroupedAllocationPrice.GroupedAllocationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewPlanGroupedAllocationPrice.ModelType.GROUPED_ALLOCATION)
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
                    NewPlanGroupedAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanGroupedAllocationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanGroupedAllocationPrice),
                jacksonTypeRef<NewPlanGroupedAllocationPrice>(),
            )

        assertThat(roundtrippedNewPlanGroupedAllocationPrice)
            .isEqualTo(newPlanGroupedAllocationPrice)
    }
}
