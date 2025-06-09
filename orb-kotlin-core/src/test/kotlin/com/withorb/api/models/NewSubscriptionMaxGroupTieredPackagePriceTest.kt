// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionMaxGroupTieredPackagePriceTest {

    @Test
    fun create() {
        val newSubscriptionMaxGroupTieredPackagePrice =
            NewSubscriptionMaxGroupTieredPackagePrice.builder()
                .cadence(NewSubscriptionMaxGroupTieredPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .maxGroupTieredPackageConfig(
                    NewSubscriptionMaxGroupTieredPackagePrice.MaxGroupTieredPackageConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(
                    NewSubscriptionMaxGroupTieredPackagePrice.ModelType.MAX_GROUP_TIERED_PACKAGE
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
                    NewSubscriptionMaxGroupTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionMaxGroupTieredPackagePrice.cadence())
            .isEqualTo(NewSubscriptionMaxGroupTieredPackagePrice.Cadence.ANNUAL)
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.maxGroupTieredPackageConfig())
            .isEqualTo(
                NewSubscriptionMaxGroupTieredPackagePrice.MaxGroupTieredPackageConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.modelType())
            .isEqualTo(NewSubscriptionMaxGroupTieredPackagePrice.ModelType.MAX_GROUP_TIERED_PACKAGE)
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.metadata())
            .isEqualTo(
                NewSubscriptionMaxGroupTieredPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.referenceId())
            .isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionMaxGroupTieredPackagePrice =
            NewSubscriptionMaxGroupTieredPackagePrice.builder()
                .cadence(NewSubscriptionMaxGroupTieredPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .maxGroupTieredPackageConfig(
                    NewSubscriptionMaxGroupTieredPackagePrice.MaxGroupTieredPackageConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(
                    NewSubscriptionMaxGroupTieredPackagePrice.ModelType.MAX_GROUP_TIERED_PACKAGE
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
                    NewSubscriptionMaxGroupTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionMaxGroupTieredPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionMaxGroupTieredPackagePrice),
                jacksonTypeRef<NewSubscriptionMaxGroupTieredPackagePrice>(),
            )

        assertThat(roundtrippedNewSubscriptionMaxGroupTieredPackagePrice)
            .isEqualTo(newSubscriptionMaxGroupTieredPackagePrice)
    }
}
