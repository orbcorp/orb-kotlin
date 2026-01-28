// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingMinimumCompositePriceTest {

    @Test
    fun create() {
        val newFloatingMinimumCompositePrice =
            NewFloatingMinimumCompositePrice.builder()
                .cadence(NewFloatingMinimumCompositePrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .minimumCompositeConfig(
                    NewFloatingMinimumCompositePrice.MinimumCompositeConfig.builder()
                        .minimumAmount("minimum_amount")
                        .prorated(true)
                        .build()
                )
                .modelType(NewFloatingMinimumCompositePrice.ModelType.MINIMUM_COMPOSITE)
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
                    NewFloatingMinimumCompositePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingMinimumCompositePrice.cadence())
            .isEqualTo(NewFloatingMinimumCompositePrice.Cadence.ANNUAL)
        assertThat(newFloatingMinimumCompositePrice.currency()).isEqualTo("currency")
        assertThat(newFloatingMinimumCompositePrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingMinimumCompositePrice.minimumCompositeConfig())
            .isEqualTo(
                NewFloatingMinimumCompositePrice.MinimumCompositeConfig.builder()
                    .minimumAmount("minimum_amount")
                    .prorated(true)
                    .build()
            )
        assertThat(newFloatingMinimumCompositePrice.modelType())
            .isEqualTo(NewFloatingMinimumCompositePrice.ModelType.MINIMUM_COMPOSITE)
        assertThat(newFloatingMinimumCompositePrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingMinimumCompositePrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newFloatingMinimumCompositePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingMinimumCompositePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingMinimumCompositePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingMinimumCompositePrice.conversionRateConfig())
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
        assertThat(newFloatingMinimumCompositePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingMinimumCompositePrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newFloatingMinimumCompositePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingMinimumCompositePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingMinimumCompositePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingMinimumCompositePrice.metadata())
            .isEqualTo(
                NewFloatingMinimumCompositePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingMinimumCompositePrice =
            NewFloatingMinimumCompositePrice.builder()
                .cadence(NewFloatingMinimumCompositePrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .minimumCompositeConfig(
                    NewFloatingMinimumCompositePrice.MinimumCompositeConfig.builder()
                        .minimumAmount("minimum_amount")
                        .prorated(true)
                        .build()
                )
                .modelType(NewFloatingMinimumCompositePrice.ModelType.MINIMUM_COMPOSITE)
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
                    NewFloatingMinimumCompositePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingMinimumCompositePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingMinimumCompositePrice),
                jacksonTypeRef<NewFloatingMinimumCompositePrice>(),
            )

        assertThat(roundtrippedNewFloatingMinimumCompositePrice)
            .isEqualTo(newFloatingMinimumCompositePrice)
    }
}
