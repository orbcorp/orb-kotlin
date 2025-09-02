// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionUnitWithPercentPriceTest {

    @Test
    fun create() {
        val newSubscriptionUnitWithPercentPrice =
            NewSubscriptionUnitWithPercentPrice.builder()
                .cadence(NewSubscriptionUnitWithPercentPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionUnitWithPercentPrice.ModelType.UNIT_WITH_PERCENT)
                .name("Annual fee")
                .unitWithPercentConfig(
                    NewSubscriptionUnitWithPercentPrice.UnitWithPercentConfig.builder()
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
                    NewSubscriptionUnitWithPercentPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionUnitWithPercentPrice.cadence())
            .isEqualTo(NewSubscriptionUnitWithPercentPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionUnitWithPercentPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionUnitWithPercentPrice.modelType())
            .isEqualTo(NewSubscriptionUnitWithPercentPrice.ModelType.UNIT_WITH_PERCENT)
        assertThat(newSubscriptionUnitWithPercentPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionUnitWithPercentPrice.unitWithPercentConfig())
            .isEqualTo(
                NewSubscriptionUnitWithPercentPrice.UnitWithPercentConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionUnitWithPercentPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newSubscriptionUnitWithPercentPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionUnitWithPercentPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionUnitWithPercentPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionUnitWithPercentPrice.conversionRateConfig())
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
        assertThat(newSubscriptionUnitWithPercentPrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionUnitWithPercentPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionUnitWithPercentPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newSubscriptionUnitWithPercentPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionUnitWithPercentPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionUnitWithPercentPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionUnitWithPercentPrice.metadata())
            .isEqualTo(
                NewSubscriptionUnitWithPercentPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionUnitWithPercentPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionUnitWithPercentPrice =
            NewSubscriptionUnitWithPercentPrice.builder()
                .cadence(NewSubscriptionUnitWithPercentPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionUnitWithPercentPrice.ModelType.UNIT_WITH_PERCENT)
                .name("Annual fee")
                .unitWithPercentConfig(
                    NewSubscriptionUnitWithPercentPrice.UnitWithPercentConfig.builder()
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
                    NewSubscriptionUnitWithPercentPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionUnitWithPercentPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionUnitWithPercentPrice),
                jacksonTypeRef<NewSubscriptionUnitWithPercentPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionUnitWithPercentPrice)
            .isEqualTo(newSubscriptionUnitWithPercentPrice)
    }
}
