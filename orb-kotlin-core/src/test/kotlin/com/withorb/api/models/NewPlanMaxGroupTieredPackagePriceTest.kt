// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanMaxGroupTieredPackagePriceTest {

    @Test
    fun create() {
        val newPlanMaxGroupTieredPackagePrice =
            NewPlanMaxGroupTieredPackagePrice.builder()
                .cadence(NewPlanMaxGroupTieredPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .maxGroupTieredPackageConfig(
                    NewPlanMaxGroupTieredPackagePrice.MaxGroupTieredPackageConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(NewPlanMaxGroupTieredPackagePrice.ModelType.MAX_GROUP_TIERED_PACKAGE)
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
                    NewPlanMaxGroupTieredPackagePrice.ConversionRateConfig.Unit.UnitConfig.builder()
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
                    NewPlanMaxGroupTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanMaxGroupTieredPackagePrice.cadence())
            .isEqualTo(NewPlanMaxGroupTieredPackagePrice.Cadence.ANNUAL)
        assertThat(newPlanMaxGroupTieredPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanMaxGroupTieredPackagePrice.maxGroupTieredPackageConfig())
            .isEqualTo(
                NewPlanMaxGroupTieredPackagePrice.MaxGroupTieredPackageConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanMaxGroupTieredPackagePrice.modelType())
            .isEqualTo(NewPlanMaxGroupTieredPackagePrice.ModelType.MAX_GROUP_TIERED_PACKAGE)
        assertThat(newPlanMaxGroupTieredPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanMaxGroupTieredPackagePrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newPlanMaxGroupTieredPackagePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanMaxGroupTieredPackagePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanMaxGroupTieredPackagePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanMaxGroupTieredPackagePrice.conversionRateConfig())
            .isEqualTo(
                NewPlanMaxGroupTieredPackagePrice.ConversionRateConfig.ofUnit(
                    NewPlanMaxGroupTieredPackagePrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewPlanMaxGroupTieredPackagePrice.ConversionRateConfig.Unit.UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newPlanMaxGroupTieredPackagePrice.currency()).isEqualTo("currency")
        assertThat(newPlanMaxGroupTieredPackagePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanMaxGroupTieredPackagePrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newPlanMaxGroupTieredPackagePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanMaxGroupTieredPackagePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanMaxGroupTieredPackagePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanMaxGroupTieredPackagePrice.metadata())
            .isEqualTo(
                NewPlanMaxGroupTieredPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanMaxGroupTieredPackagePrice =
            NewPlanMaxGroupTieredPackagePrice.builder()
                .cadence(NewPlanMaxGroupTieredPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .maxGroupTieredPackageConfig(
                    NewPlanMaxGroupTieredPackagePrice.MaxGroupTieredPackageConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(NewPlanMaxGroupTieredPackagePrice.ModelType.MAX_GROUP_TIERED_PACKAGE)
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
                    NewPlanMaxGroupTieredPackagePrice.ConversionRateConfig.Unit.UnitConfig.builder()
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
                    NewPlanMaxGroupTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanMaxGroupTieredPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanMaxGroupTieredPackagePrice),
                jacksonTypeRef<NewPlanMaxGroupTieredPackagePrice>(),
            )

        assertThat(roundtrippedNewPlanMaxGroupTieredPackagePrice)
            .isEqualTo(newPlanMaxGroupTieredPackagePrice)
    }
}
