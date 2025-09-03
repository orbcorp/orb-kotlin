// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanPackageWithAllocationPriceTest {

    @Test
    fun create() {
        val newPlanPackageWithAllocationPrice =
            NewPlanPackageWithAllocationPrice.builder()
                .cadence(NewPlanPackageWithAllocationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanPackageWithAllocationPrice.ModelType.PACKAGE_WITH_ALLOCATION)
                .name("Annual fee")
                .packageWithAllocationConfig(
                    NewPlanPackageWithAllocationPrice.PackageWithAllocationConfig.builder()
                        .allocation("allocation")
                        .packageAmount("package_amount")
                        .packageSize("package_size")
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
                    NewPlanPackageWithAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newPlanPackageWithAllocationPrice.cadence())
            .isEqualTo(NewPlanPackageWithAllocationPrice.Cadence.ANNUAL)
        assertThat(newPlanPackageWithAllocationPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanPackageWithAllocationPrice.modelType())
            .isEqualTo(NewPlanPackageWithAllocationPrice.ModelType.PACKAGE_WITH_ALLOCATION)
        assertThat(newPlanPackageWithAllocationPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanPackageWithAllocationPrice.packageWithAllocationConfig())
            .isEqualTo(
                NewPlanPackageWithAllocationPrice.PackageWithAllocationConfig.builder()
                    .allocation("allocation")
                    .packageAmount("package_amount")
                    .packageSize("package_size")
                    .build()
            )
        assertThat(newPlanPackageWithAllocationPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newPlanPackageWithAllocationPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanPackageWithAllocationPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanPackageWithAllocationPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanPackageWithAllocationPrice.conversionRateConfig())
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
        assertThat(newPlanPackageWithAllocationPrice.currency()).isEqualTo("currency")
        assertThat(newPlanPackageWithAllocationPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanPackageWithAllocationPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newPlanPackageWithAllocationPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanPackageWithAllocationPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanPackageWithAllocationPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanPackageWithAllocationPrice.metadata())
            .isEqualTo(
                NewPlanPackageWithAllocationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newPlanPackageWithAllocationPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanPackageWithAllocationPrice =
            NewPlanPackageWithAllocationPrice.builder()
                .cadence(NewPlanPackageWithAllocationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanPackageWithAllocationPrice.ModelType.PACKAGE_WITH_ALLOCATION)
                .name("Annual fee")
                .packageWithAllocationConfig(
                    NewPlanPackageWithAllocationPrice.PackageWithAllocationConfig.builder()
                        .allocation("allocation")
                        .packageAmount("package_amount")
                        .packageSize("package_size")
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
                    NewPlanPackageWithAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewPlanPackageWithAllocationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanPackageWithAllocationPrice),
                jacksonTypeRef<NewPlanPackageWithAllocationPrice>(),
            )

        assertThat(roundtrippedNewPlanPackageWithAllocationPrice)
            .isEqualTo(newPlanPackageWithAllocationPrice)
    }
}
