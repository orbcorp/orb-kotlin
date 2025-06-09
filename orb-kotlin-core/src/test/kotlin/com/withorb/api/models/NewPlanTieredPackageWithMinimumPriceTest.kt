// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanTieredPackageWithMinimumPriceTest {

    @Test
    fun create() {
        val newPlanTieredPackageWithMinimumPrice =
            NewPlanTieredPackageWithMinimumPrice.builder()
                .cadence(NewPlanTieredPackageWithMinimumPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewPlanTieredPackageWithMinimumPrice.ModelType.TIERED_PACKAGE_WITH_MINIMUM
                )
                .name("Annual fee")
                .tieredPackageWithMinimumConfig(
                    NewPlanTieredPackageWithMinimumPrice.TieredPackageWithMinimumConfig.builder()
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
                .unitConversionRateConfig(
                    NewPlanTieredPackageWithMinimumPrice.ConversionRateConfig.Unit.UnitConfig
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
                    NewPlanTieredPackageWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanTieredPackageWithMinimumPrice.cadence())
            .isEqualTo(NewPlanTieredPackageWithMinimumPrice.Cadence.ANNUAL)
        assertThat(newPlanTieredPackageWithMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanTieredPackageWithMinimumPrice.modelType())
            .isEqualTo(NewPlanTieredPackageWithMinimumPrice.ModelType.TIERED_PACKAGE_WITH_MINIMUM)
        assertThat(newPlanTieredPackageWithMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanTieredPackageWithMinimumPrice.tieredPackageWithMinimumConfig())
            .isEqualTo(
                NewPlanTieredPackageWithMinimumPrice.TieredPackageWithMinimumConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanTieredPackageWithMinimumPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newPlanTieredPackageWithMinimumPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanTieredPackageWithMinimumPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTieredPackageWithMinimumPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanTieredPackageWithMinimumPrice.conversionRateConfig())
            .isEqualTo(
                NewPlanTieredPackageWithMinimumPrice.ConversionRateConfig.ofUnit(
                    NewPlanTieredPackageWithMinimumPrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewPlanTieredPackageWithMinimumPrice.ConversionRateConfig.Unit
                                .UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newPlanTieredPackageWithMinimumPrice.currency()).isEqualTo("currency")
        assertThat(newPlanTieredPackageWithMinimumPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanTieredPackageWithMinimumPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newPlanTieredPackageWithMinimumPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanTieredPackageWithMinimumPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanTieredPackageWithMinimumPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTieredPackageWithMinimumPrice.metadata())
            .isEqualTo(
                NewPlanTieredPackageWithMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanTieredPackageWithMinimumPrice =
            NewPlanTieredPackageWithMinimumPrice.builder()
                .cadence(NewPlanTieredPackageWithMinimumPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewPlanTieredPackageWithMinimumPrice.ModelType.TIERED_PACKAGE_WITH_MINIMUM
                )
                .name("Annual fee")
                .tieredPackageWithMinimumConfig(
                    NewPlanTieredPackageWithMinimumPrice.TieredPackageWithMinimumConfig.builder()
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
                .unitConversionRateConfig(
                    NewPlanTieredPackageWithMinimumPrice.ConversionRateConfig.Unit.UnitConfig
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
                    NewPlanTieredPackageWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanTieredPackageWithMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanTieredPackageWithMinimumPrice),
                jacksonTypeRef<NewPlanTieredPackageWithMinimumPrice>(),
            )

        assertThat(roundtrippedNewPlanTieredPackageWithMinimumPrice)
            .isEqualTo(newPlanTieredPackageWithMinimumPrice)
    }
}
