// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingTieredPackagePriceTest {

    @Test
    fun create() {
        val newFloatingTieredPackagePrice =
            NewFloatingTieredPackagePrice.builder()
                .cadence(NewFloatingTieredPackagePrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingTieredPackagePrice.ModelType.TIERED_PACKAGE)
                .name("Annual fee")
                .tieredPackageConfig(
                    NewFloatingTieredPackagePrice.TieredPackageConfig.builder()
                        .packageSize("package_size")
                        .addTier(
                            NewFloatingTieredPackagePrice.TieredPackageConfig.Tier.builder()
                                .perUnit("per_unit")
                                .tierLowerBound("tier_lower_bound")
                                .build()
                        )
                        .addTier(
                            NewFloatingTieredPackagePrice.TieredPackageConfig.Tier.builder()
                                .perUnit("per_unit")
                                .tierLowerBound("tier_lower_bound")
                                .build()
                        )
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
                    NewFloatingTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingTieredPackagePrice.cadence())
            .isEqualTo(NewFloatingTieredPackagePrice.Cadence.ANNUAL)
        assertThat(newFloatingTieredPackagePrice.currency()).isEqualTo("currency")
        assertThat(newFloatingTieredPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingTieredPackagePrice.modelType())
            .isEqualTo(NewFloatingTieredPackagePrice.ModelType.TIERED_PACKAGE)
        assertThat(newFloatingTieredPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingTieredPackagePrice.tieredPackageConfig())
            .isEqualTo(
                NewFloatingTieredPackagePrice.TieredPackageConfig.builder()
                    .packageSize("package_size")
                    .addTier(
                        NewFloatingTieredPackagePrice.TieredPackageConfig.Tier.builder()
                            .perUnit("per_unit")
                            .tierLowerBound("tier_lower_bound")
                            .build()
                    )
                    .addTier(
                        NewFloatingTieredPackagePrice.TieredPackageConfig.Tier.builder()
                            .perUnit("per_unit")
                            .tierLowerBound("tier_lower_bound")
                            .build()
                    )
                    .build()
            )
        assertThat(newFloatingTieredPackagePrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newFloatingTieredPackagePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingTieredPackagePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredPackagePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingTieredPackagePrice.conversionRateConfig())
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
        assertThat(newFloatingTieredPackagePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingTieredPackagePrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newFloatingTieredPackagePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingTieredPackagePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingTieredPackagePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredPackagePrice.metadata())
            .isEqualTo(
                NewFloatingTieredPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingTieredPackagePrice =
            NewFloatingTieredPackagePrice.builder()
                .cadence(NewFloatingTieredPackagePrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingTieredPackagePrice.ModelType.TIERED_PACKAGE)
                .name("Annual fee")
                .tieredPackageConfig(
                    NewFloatingTieredPackagePrice.TieredPackageConfig.builder()
                        .packageSize("package_size")
                        .addTier(
                            NewFloatingTieredPackagePrice.TieredPackageConfig.Tier.builder()
                                .perUnit("per_unit")
                                .tierLowerBound("tier_lower_bound")
                                .build()
                        )
                        .addTier(
                            NewFloatingTieredPackagePrice.TieredPackageConfig.Tier.builder()
                                .perUnit("per_unit")
                                .tierLowerBound("tier_lower_bound")
                                .build()
                        )
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
                    NewFloatingTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingTieredPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingTieredPackagePrice),
                jacksonTypeRef<NewFloatingTieredPackagePrice>(),
            )

        assertThat(roundtrippedNewFloatingTieredPackagePrice)
            .isEqualTo(newFloatingTieredPackagePrice)
    }
}
