// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionGroupedTieredPriceTest {

    @Test
    fun create() {
        val newSubscriptionGroupedTieredPrice =
            NewSubscriptionGroupedTieredPrice.builder()
                .cadence(NewSubscriptionGroupedTieredPrice.Cadence.ANNUAL)
                .groupedTieredConfig(
                    NewSubscriptionGroupedTieredPrice.GroupedTieredConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewSubscriptionGroupedTieredPrice.ModelType.GROUPED_TIERED)
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
                    NewSubscriptionGroupedTieredPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionGroupedTieredPrice.cadence())
            .isEqualTo(NewSubscriptionGroupedTieredPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionGroupedTieredPrice.groupedTieredConfig())
            .isEqualTo(
                NewSubscriptionGroupedTieredPrice.GroupedTieredConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionGroupedTieredPrice.modelType())
            .isEqualTo(NewSubscriptionGroupedTieredPrice.ModelType.GROUPED_TIERED)
        assertThat(newSubscriptionGroupedTieredPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionGroupedTieredPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newSubscriptionGroupedTieredPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionGroupedTieredPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionGroupedTieredPrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionGroupedTieredPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newSubscriptionGroupedTieredPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionGroupedTieredPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionGroupedTieredPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPrice.metadata())
            .isEqualTo(
                NewSubscriptionGroupedTieredPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionGroupedTieredPrice =
            NewSubscriptionGroupedTieredPrice.builder()
                .cadence(NewSubscriptionGroupedTieredPrice.Cadence.ANNUAL)
                .groupedTieredConfig(
                    NewSubscriptionGroupedTieredPrice.GroupedTieredConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewSubscriptionGroupedTieredPrice.ModelType.GROUPED_TIERED)
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
                    NewSubscriptionGroupedTieredPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionGroupedTieredPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionGroupedTieredPrice),
                jacksonTypeRef<NewSubscriptionGroupedTieredPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionGroupedTieredPrice)
            .isEqualTo(newSubscriptionGroupedTieredPrice)
    }
}
