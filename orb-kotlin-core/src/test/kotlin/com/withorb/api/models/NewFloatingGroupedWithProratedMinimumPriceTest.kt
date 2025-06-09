// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingGroupedWithProratedMinimumPriceTest {

    @Test
    fun create() {
        val newFloatingGroupedWithProratedMinimumPrice =
            NewFloatingGroupedWithProratedMinimumPrice.builder()
                .cadence(NewFloatingGroupedWithProratedMinimumPrice.Cadence.ANNUAL)
                .currency("currency")
                .groupedWithProratedMinimumConfig(
                    NewFloatingGroupedWithProratedMinimumPrice.GroupedWithProratedMinimumConfig
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewFloatingGroupedWithProratedMinimumPrice.ModelType
                        .GROUPED_WITH_PRORATED_MINIMUM
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
                    NewFloatingGroupedWithProratedMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingGroupedWithProratedMinimumPrice.cadence())
            .isEqualTo(NewFloatingGroupedWithProratedMinimumPrice.Cadence.ANNUAL)
        assertThat(newFloatingGroupedWithProratedMinimumPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingGroupedWithProratedMinimumPrice.groupedWithProratedMinimumConfig())
            .isEqualTo(
                NewFloatingGroupedWithProratedMinimumPrice.GroupedWithProratedMinimumConfig
                    .builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingGroupedWithProratedMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingGroupedWithProratedMinimumPrice.modelType())
            .isEqualTo(
                NewFloatingGroupedWithProratedMinimumPrice.ModelType.GROUPED_WITH_PRORATED_MINIMUM
            )
        assertThat(newFloatingGroupedWithProratedMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingGroupedWithProratedMinimumPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newFloatingGroupedWithProratedMinimumPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingGroupedWithProratedMinimumPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingGroupedWithProratedMinimumPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingGroupedWithProratedMinimumPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingGroupedWithProratedMinimumPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newFloatingGroupedWithProratedMinimumPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingGroupedWithProratedMinimumPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingGroupedWithProratedMinimumPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingGroupedWithProratedMinimumPrice.metadata())
            .isEqualTo(
                NewFloatingGroupedWithProratedMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingGroupedWithProratedMinimumPrice =
            NewFloatingGroupedWithProratedMinimumPrice.builder()
                .cadence(NewFloatingGroupedWithProratedMinimumPrice.Cadence.ANNUAL)
                .currency("currency")
                .groupedWithProratedMinimumConfig(
                    NewFloatingGroupedWithProratedMinimumPrice.GroupedWithProratedMinimumConfig
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewFloatingGroupedWithProratedMinimumPrice.ModelType
                        .GROUPED_WITH_PRORATED_MINIMUM
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
                    NewFloatingGroupedWithProratedMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingGroupedWithProratedMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingGroupedWithProratedMinimumPrice),
                jacksonTypeRef<NewFloatingGroupedWithProratedMinimumPrice>(),
            )

        assertThat(roundtrippedNewFloatingGroupedWithProratedMinimumPrice)
            .isEqualTo(newFloatingGroupedWithProratedMinimumPrice)
    }
}
