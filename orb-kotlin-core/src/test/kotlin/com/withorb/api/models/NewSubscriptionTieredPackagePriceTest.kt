// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionTieredPackagePriceTest {

    @Test
    fun create() {
        val newSubscriptionTieredPackagePrice =
            NewSubscriptionTieredPackagePrice.builder()
                .cadence(NewSubscriptionTieredPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionTieredPackagePrice.ModelType.TIERED_PACKAGE)
                .name("Annual fee")
                .tieredPackageConfig(
                    NewSubscriptionTieredPackagePrice.TieredPackageConfig.builder()
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
                    NewSubscriptionTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionTieredPackagePrice.cadence())
            .isEqualTo(NewSubscriptionTieredPackagePrice.Cadence.ANNUAL)
        assertThat(newSubscriptionTieredPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionTieredPackagePrice.modelType())
            .isEqualTo(NewSubscriptionTieredPackagePrice.ModelType.TIERED_PACKAGE)
        assertThat(newSubscriptionTieredPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionTieredPackagePrice.tieredPackageConfig())
            .isEqualTo(
                NewSubscriptionTieredPackagePrice.TieredPackageConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionTieredPackagePrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newSubscriptionTieredPackagePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionTieredPackagePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionTieredPackagePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionTieredPackagePrice.conversionRateConfig())
            .isEqualTo(
                NewSubscriptionTieredPackagePrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionTieredPackagePrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionTieredPackagePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionTieredPackagePrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newSubscriptionTieredPackagePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionTieredPackagePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionTieredPackagePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionTieredPackagePrice.metadata())
            .isEqualTo(
                NewSubscriptionTieredPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionTieredPackagePrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionTieredPackagePrice =
            NewSubscriptionTieredPackagePrice.builder()
                .cadence(NewSubscriptionTieredPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionTieredPackagePrice.ModelType.TIERED_PACKAGE)
                .name("Annual fee")
                .tieredPackageConfig(
                    NewSubscriptionTieredPackagePrice.TieredPackageConfig.builder()
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
                    NewSubscriptionTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionTieredPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionTieredPackagePrice),
                jacksonTypeRef<NewSubscriptionTieredPackagePrice>(),
            )

        assertThat(roundtrippedNewSubscriptionTieredPackagePrice)
            .isEqualTo(newSubscriptionTieredPackagePrice)
    }
}
