// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionPackagePriceTest {

    @Test
    fun create() {
        val newSubscriptionPackagePrice =
            NewSubscriptionPackagePrice.builder()
                .cadence(NewSubscriptionPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionPackagePrice.ModelType.PACKAGE)
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
                    NewSubscriptionPackagePrice.ConversionRateConfig.Unit.UnitConfig.builder()
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
                    NewSubscriptionPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionPackagePrice.cadence())
            .isEqualTo(NewSubscriptionPackagePrice.Cadence.ANNUAL)
        assertThat(newSubscriptionPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionPackagePrice.modelType())
            .isEqualTo(NewSubscriptionPackagePrice.ModelType.PACKAGE)
        assertThat(newSubscriptionPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionPackagePrice.packageConfig())
            .isEqualTo(
                PackageConfig.builder().packageAmount("package_amount").packageSize(0L).build()
            )
        assertThat(newSubscriptionPackagePrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newSubscriptionPackagePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionPackagePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionPackagePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionPackagePrice.conversionRateConfig())
            .isEqualTo(
                NewSubscriptionPackagePrice.ConversionRateConfig.ofUnit(
                    NewSubscriptionPackagePrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewSubscriptionPackagePrice.ConversionRateConfig.Unit.UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionPackagePrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionPackagePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionPackagePrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newSubscriptionPackagePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionPackagePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionPackagePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionPackagePrice.metadata())
            .isEqualTo(
                NewSubscriptionPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionPackagePrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionPackagePrice =
            NewSubscriptionPackagePrice.builder()
                .cadence(NewSubscriptionPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionPackagePrice.ModelType.PACKAGE)
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
                    NewSubscriptionPackagePrice.ConversionRateConfig.Unit.UnitConfig.builder()
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
                    NewSubscriptionPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionPackagePrice),
                jacksonTypeRef<NewSubscriptionPackagePrice>(),
            )

        assertThat(roundtrippedNewSubscriptionPackagePrice).isEqualTo(newSubscriptionPackagePrice)
    }
}
