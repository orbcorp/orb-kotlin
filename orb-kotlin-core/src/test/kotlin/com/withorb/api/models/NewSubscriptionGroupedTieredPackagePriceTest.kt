// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionGroupedTieredPackagePriceTest {

    @Test
    fun create() {
        val newSubscriptionGroupedTieredPackagePrice =
            NewSubscriptionGroupedTieredPackagePrice.builder()
                .cadence(NewSubscriptionGroupedTieredPackagePrice.Cadence.ANNUAL)
                .groupedTieredPackageConfig(
                    NewSubscriptionGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                        .groupingKey("x")
                        .packageSize("package_size")
                        .addTier(
                            NewSubscriptionGroupedTieredPackagePrice.GroupedTieredPackageConfig.Tier
                                .builder()
                                .perUnit("per_unit")
                                .tierLowerBound("tier_lower_bound")
                                .build()
                        )
                        .addTier(
                            NewSubscriptionGroupedTieredPackagePrice.GroupedTieredPackageConfig.Tier
                                .builder()
                                .perUnit("per_unit")
                                .tierLowerBound("tier_lower_bound")
                                .build()
                        )
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewSubscriptionGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE
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
                    NewSubscriptionGroupedTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionGroupedTieredPackagePrice.cadence())
            .isEqualTo(NewSubscriptionGroupedTieredPackagePrice.Cadence.ANNUAL)
        assertThat(newSubscriptionGroupedTieredPackagePrice.groupedTieredPackageConfig())
            .isEqualTo(
                NewSubscriptionGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                    .groupingKey("x")
                    .packageSize("package_size")
                    .addTier(
                        NewSubscriptionGroupedTieredPackagePrice.GroupedTieredPackageConfig.Tier
                            .builder()
                            .perUnit("per_unit")
                            .tierLowerBound("tier_lower_bound")
                            .build()
                    )
                    .addTier(
                        NewSubscriptionGroupedTieredPackagePrice.GroupedTieredPackageConfig.Tier
                            .builder()
                            .perUnit("per_unit")
                            .tierLowerBound("tier_lower_bound")
                            .build()
                    )
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionGroupedTieredPackagePrice.modelType())
            .isEqualTo(NewSubscriptionGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE)
        assertThat(newSubscriptionGroupedTieredPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionGroupedTieredPackagePrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newSubscriptionGroupedTieredPackagePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionGroupedTieredPackagePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPackagePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionGroupedTieredPackagePrice.conversionRateConfig())
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
        assertThat(newSubscriptionGroupedTieredPackagePrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionGroupedTieredPackagePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPackagePrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newSubscriptionGroupedTieredPackagePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionGroupedTieredPackagePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionGroupedTieredPackagePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPackagePrice.metadata())
            .isEqualTo(
                NewSubscriptionGroupedTieredPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPackagePrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionGroupedTieredPackagePrice =
            NewSubscriptionGroupedTieredPackagePrice.builder()
                .cadence(NewSubscriptionGroupedTieredPackagePrice.Cadence.ANNUAL)
                .groupedTieredPackageConfig(
                    NewSubscriptionGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                        .groupingKey("x")
                        .packageSize("package_size")
                        .addTier(
                            NewSubscriptionGroupedTieredPackagePrice.GroupedTieredPackageConfig.Tier
                                .builder()
                                .perUnit("per_unit")
                                .tierLowerBound("tier_lower_bound")
                                .build()
                        )
                        .addTier(
                            NewSubscriptionGroupedTieredPackagePrice.GroupedTieredPackageConfig.Tier
                                .builder()
                                .perUnit("per_unit")
                                .tierLowerBound("tier_lower_bound")
                                .build()
                        )
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewSubscriptionGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE
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
                    NewSubscriptionGroupedTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionGroupedTieredPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionGroupedTieredPackagePrice),
                jacksonTypeRef<NewSubscriptionGroupedTieredPackagePrice>(),
            )

        assertThat(roundtrippedNewSubscriptionGroupedTieredPackagePrice)
            .isEqualTo(newSubscriptionGroupedTieredPackagePrice)
    }
}
