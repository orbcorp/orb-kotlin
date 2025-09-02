// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionGroupedAllocationPriceTest {

    @Test
    fun create() {
        val newSubscriptionGroupedAllocationPrice =
            NewSubscriptionGroupedAllocationPrice.builder()
                .cadence(NewSubscriptionGroupedAllocationPrice.Cadence.ANNUAL)
                .groupedAllocationConfig(
                    NewSubscriptionGroupedAllocationPrice.GroupedAllocationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewSubscriptionGroupedAllocationPrice.ModelType.GROUPED_ALLOCATION)
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
                    NewSubscriptionGroupedAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionGroupedAllocationPrice.cadence())
            .isEqualTo(NewSubscriptionGroupedAllocationPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionGroupedAllocationPrice.groupedAllocationConfig())
            .isEqualTo(
                NewSubscriptionGroupedAllocationPrice.GroupedAllocationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionGroupedAllocationPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionGroupedAllocationPrice.modelType())
            .isEqualTo(NewSubscriptionGroupedAllocationPrice.ModelType.GROUPED_ALLOCATION)
        assertThat(newSubscriptionGroupedAllocationPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionGroupedAllocationPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newSubscriptionGroupedAllocationPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionGroupedAllocationPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionGroupedAllocationPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionGroupedAllocationPrice.conversionRateConfig())
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
        assertThat(newSubscriptionGroupedAllocationPrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionGroupedAllocationPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionGroupedAllocationPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newSubscriptionGroupedAllocationPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionGroupedAllocationPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionGroupedAllocationPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionGroupedAllocationPrice.metadata())
            .isEqualTo(
                NewSubscriptionGroupedAllocationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionGroupedAllocationPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionGroupedAllocationPrice =
            NewSubscriptionGroupedAllocationPrice.builder()
                .cadence(NewSubscriptionGroupedAllocationPrice.Cadence.ANNUAL)
                .groupedAllocationConfig(
                    NewSubscriptionGroupedAllocationPrice.GroupedAllocationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewSubscriptionGroupedAllocationPrice.ModelType.GROUPED_ALLOCATION)
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
                    NewSubscriptionGroupedAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionGroupedAllocationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionGroupedAllocationPrice),
                jacksonTypeRef<NewSubscriptionGroupedAllocationPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionGroupedAllocationPrice)
            .isEqualTo(newSubscriptionGroupedAllocationPrice)
    }
}
