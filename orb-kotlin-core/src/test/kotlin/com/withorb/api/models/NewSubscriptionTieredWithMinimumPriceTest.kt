// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionTieredWithMinimumPriceTest {

    @Test
    fun create() {
        val newSubscriptionTieredWithMinimumPrice =
            NewSubscriptionTieredWithMinimumPrice.builder()
                .cadence(NewSubscriptionTieredWithMinimumPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
                .name("Annual fee")
                .tieredWithMinimumConfig(
                    NewSubscriptionTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
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
                    NewSubscriptionTieredWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionTieredWithMinimumPrice.cadence())
            .isEqualTo(NewSubscriptionTieredWithMinimumPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionTieredWithMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionTieredWithMinimumPrice.modelType())
            .isEqualTo(NewSubscriptionTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
        assertThat(newSubscriptionTieredWithMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionTieredWithMinimumPrice.tieredWithMinimumConfig())
            .isEqualTo(
                NewSubscriptionTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionTieredWithMinimumPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newSubscriptionTieredWithMinimumPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionTieredWithMinimumPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionTieredWithMinimumPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionTieredWithMinimumPrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionTieredWithMinimumPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionTieredWithMinimumPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newSubscriptionTieredWithMinimumPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionTieredWithMinimumPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionTieredWithMinimumPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionTieredWithMinimumPrice.metadata())
            .isEqualTo(
                NewSubscriptionTieredWithMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionTieredWithMinimumPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionTieredWithMinimumPrice =
            NewSubscriptionTieredWithMinimumPrice.builder()
                .cadence(NewSubscriptionTieredWithMinimumPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
                .name("Annual fee")
                .tieredWithMinimumConfig(
                    NewSubscriptionTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
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
                    NewSubscriptionTieredWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionTieredWithMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionTieredWithMinimumPrice),
                jacksonTypeRef<NewSubscriptionTieredWithMinimumPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionTieredWithMinimumPrice)
            .isEqualTo(newSubscriptionTieredWithMinimumPrice)
    }
}
