// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanGroupedTieredPackagePriceTest {

    @Test
    fun create() {
        val newPlanGroupedTieredPackagePrice =
            NewPlanGroupedTieredPackagePrice.builder()
                .cadence(NewPlanGroupedTieredPackagePrice.Cadence.ANNUAL)
                .groupedTieredPackageConfig(
                    NewPlanGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                        .groupingKey("x")
                        .packageSize("package_size")
                        .addTier(
                            NewPlanGroupedTieredPackagePrice.GroupedTieredPackageConfig.Tier
                                .builder()
                                .perUnit("per_unit")
                                .tierLowerBound("tier_lower_bound")
                                .build()
                        )
                        .addTier(
                            NewPlanGroupedTieredPackagePrice.GroupedTieredPackageConfig.Tier
                                .builder()
                                .perUnit("per_unit")
                                .tierLowerBound("tier_lower_bound")
                                .build()
                        )
                        .build()
                )
                .itemId("item_id")
                .modelType(NewPlanGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE)
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
                    NewPlanGroupedTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newPlanGroupedTieredPackagePrice.cadence())
            .isEqualTo(NewPlanGroupedTieredPackagePrice.Cadence.ANNUAL)
        assertThat(newPlanGroupedTieredPackagePrice.groupedTieredPackageConfig())
            .isEqualTo(
                NewPlanGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                    .groupingKey("x")
                    .packageSize("package_size")
                    .addTier(
                        NewPlanGroupedTieredPackagePrice.GroupedTieredPackageConfig.Tier.builder()
                            .perUnit("per_unit")
                            .tierLowerBound("tier_lower_bound")
                            .build()
                    )
                    .addTier(
                        NewPlanGroupedTieredPackagePrice.GroupedTieredPackageConfig.Tier.builder()
                            .perUnit("per_unit")
                            .tierLowerBound("tier_lower_bound")
                            .build()
                    )
                    .build()
            )
        assertThat(newPlanGroupedTieredPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanGroupedTieredPackagePrice.modelType())
            .isEqualTo(NewPlanGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE)
        assertThat(newPlanGroupedTieredPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanGroupedTieredPackagePrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newPlanGroupedTieredPackagePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanGroupedTieredPackagePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedTieredPackagePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanGroupedTieredPackagePrice.conversionRateConfig())
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
        assertThat(newPlanGroupedTieredPackagePrice.currency()).isEqualTo("currency")
        assertThat(newPlanGroupedTieredPackagePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanGroupedTieredPackagePrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newPlanGroupedTieredPackagePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanGroupedTieredPackagePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanGroupedTieredPackagePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedTieredPackagePrice.metadata())
            .isEqualTo(
                NewPlanGroupedTieredPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newPlanGroupedTieredPackagePrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanGroupedTieredPackagePrice =
            NewPlanGroupedTieredPackagePrice.builder()
                .cadence(NewPlanGroupedTieredPackagePrice.Cadence.ANNUAL)
                .groupedTieredPackageConfig(
                    NewPlanGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                        .groupingKey("x")
                        .packageSize("package_size")
                        .addTier(
                            NewPlanGroupedTieredPackagePrice.GroupedTieredPackageConfig.Tier
                                .builder()
                                .perUnit("per_unit")
                                .tierLowerBound("tier_lower_bound")
                                .build()
                        )
                        .addTier(
                            NewPlanGroupedTieredPackagePrice.GroupedTieredPackageConfig.Tier
                                .builder()
                                .perUnit("per_unit")
                                .tierLowerBound("tier_lower_bound")
                                .build()
                        )
                        .build()
                )
                .itemId("item_id")
                .modelType(NewPlanGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE)
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
                    NewPlanGroupedTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewPlanGroupedTieredPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanGroupedTieredPackagePrice),
                jacksonTypeRef<NewPlanGroupedTieredPackagePrice>(),
            )

        assertThat(roundtrippedNewPlanGroupedTieredPackagePrice)
            .isEqualTo(newPlanGroupedTieredPackagePrice)
    }
}
