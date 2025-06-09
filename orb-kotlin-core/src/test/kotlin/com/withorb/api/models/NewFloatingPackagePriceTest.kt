// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingPackagePriceTest {

    @Test
    fun create() {
        val newFloatingPackagePrice =
            NewFloatingPackagePrice.builder()
                .cadence(NewFloatingPackagePrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingPackagePrice.ModelType.PACKAGE)
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
                    NewFloatingPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingPackagePrice.cadence())
            .isEqualTo(NewFloatingPackagePrice.Cadence.ANNUAL)
        assertThat(newFloatingPackagePrice.currency()).isEqualTo("currency")
        assertThat(newFloatingPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingPackagePrice.modelType())
            .isEqualTo(NewFloatingPackagePrice.ModelType.PACKAGE)
        assertThat(newFloatingPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingPackagePrice.packageConfig())
            .isEqualTo(
                PackageConfig.builder().packageAmount("package_amount").packageSize(0L).build()
            )
        assertThat(newFloatingPackagePrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newFloatingPackagePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingPackagePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingPackagePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingPackagePrice.conversionRateConfig())
            .isEqualTo(
                NewFloatingPackagePrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingPackagePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingPackagePrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newFloatingPackagePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingPackagePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingPackagePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingPackagePrice.metadata())
            .isEqualTo(
                NewFloatingPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingPackagePrice =
            NewFloatingPackagePrice.builder()
                .cadence(NewFloatingPackagePrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingPackagePrice.ModelType.PACKAGE)
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
                    NewFloatingPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingPackagePrice),
                jacksonTypeRef<NewFloatingPackagePrice>(),
            )

        assertThat(roundtrippedNewFloatingPackagePrice).isEqualTo(newFloatingPackagePrice)
    }
}
