// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingMaxGroupTieredPackagePriceTest {

    @Test
    fun create() {
        val newFloatingMaxGroupTieredPackagePrice =
            NewFloatingMaxGroupTieredPackagePrice.builder()
                .cadence(NewFloatingMaxGroupTieredPackagePrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .maxGroupTieredPackageConfig(
                    NewFloatingMaxGroupTieredPackagePrice.MaxGroupTieredPackageConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(NewFloatingMaxGroupTieredPackagePrice.ModelType.MAX_GROUP_TIERED_PACKAGE)
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
                    NewFloatingMaxGroupTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingMaxGroupTieredPackagePrice.cadence())
            .isEqualTo(NewFloatingMaxGroupTieredPackagePrice.Cadence.ANNUAL)
        assertThat(newFloatingMaxGroupTieredPackagePrice.currency()).isEqualTo("currency")
        assertThat(newFloatingMaxGroupTieredPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingMaxGroupTieredPackagePrice.maxGroupTieredPackageConfig())
            .isEqualTo(
                NewFloatingMaxGroupTieredPackagePrice.MaxGroupTieredPackageConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingMaxGroupTieredPackagePrice.modelType())
            .isEqualTo(NewFloatingMaxGroupTieredPackagePrice.ModelType.MAX_GROUP_TIERED_PACKAGE)
        assertThat(newFloatingMaxGroupTieredPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingMaxGroupTieredPackagePrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newFloatingMaxGroupTieredPackagePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingMaxGroupTieredPackagePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingMaxGroupTieredPackagePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingMaxGroupTieredPackagePrice.conversionRateConfig())
            .isEqualTo(
                NewFloatingMaxGroupTieredPackagePrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingMaxGroupTieredPackagePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingMaxGroupTieredPackagePrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newFloatingMaxGroupTieredPackagePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingMaxGroupTieredPackagePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingMaxGroupTieredPackagePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingMaxGroupTieredPackagePrice.metadata())
            .isEqualTo(
                NewFloatingMaxGroupTieredPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingMaxGroupTieredPackagePrice =
            NewFloatingMaxGroupTieredPackagePrice.builder()
                .cadence(NewFloatingMaxGroupTieredPackagePrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .maxGroupTieredPackageConfig(
                    NewFloatingMaxGroupTieredPackagePrice.MaxGroupTieredPackageConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(NewFloatingMaxGroupTieredPackagePrice.ModelType.MAX_GROUP_TIERED_PACKAGE)
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
                    NewFloatingMaxGroupTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingMaxGroupTieredPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingMaxGroupTieredPackagePrice),
                jacksonTypeRef<NewFloatingMaxGroupTieredPackagePrice>(),
            )

        assertThat(roundtrippedNewFloatingMaxGroupTieredPackagePrice)
            .isEqualTo(newFloatingMaxGroupTieredPackagePrice)
    }
}
