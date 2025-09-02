// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanPackagePriceTest {

    @Test
    fun create() {
        val newPlanPackagePrice =
            NewPlanPackagePrice.builder()
                .cadence(NewPlanPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanPackagePrice.ModelType.PACKAGE)
                .name("Annual fee")
                .packageConfig(
                    PackageConfig.builder().packageAmount("package_amount").packageSize(0L).build()
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
                    NewPlanPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newPlanPackagePrice.cadence()).isEqualTo(NewPlanPackagePrice.Cadence.ANNUAL)
        assertThat(newPlanPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanPackagePrice.modelType()).isEqualTo(NewPlanPackagePrice.ModelType.PACKAGE)
        assertThat(newPlanPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanPackagePrice.packageConfig())
            .isEqualTo(
                PackageConfig.builder().packageAmount("package_amount").packageSize(0L).build()
            )
        assertThat(newPlanPackagePrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newPlanPackagePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanPackagePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanPackagePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanPackagePrice.conversionRateConfig())
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
        assertThat(newPlanPackagePrice.currency()).isEqualTo("currency")
        assertThat(newPlanPackagePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanPackagePrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newPlanPackagePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanPackagePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanPackagePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanPackagePrice.metadata())
            .isEqualTo(
                NewPlanPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newPlanPackagePrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanPackagePrice =
            NewPlanPackagePrice.builder()
                .cadence(NewPlanPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanPackagePrice.ModelType.PACKAGE)
                .name("Annual fee")
                .packageConfig(
                    PackageConfig.builder().packageAmount("package_amount").packageSize(0L).build()
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
                    NewPlanPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewPlanPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanPackagePrice),
                jacksonTypeRef<NewPlanPackagePrice>(),
            )

        assertThat(roundtrippedNewPlanPackagePrice).isEqualTo(newPlanPackagePrice)
    }
}
