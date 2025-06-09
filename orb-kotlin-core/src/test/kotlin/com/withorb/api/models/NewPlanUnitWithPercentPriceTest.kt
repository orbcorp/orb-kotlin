// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanUnitWithPercentPriceTest {

    @Test
    fun create() {
        val newPlanUnitWithPercentPrice =
            NewPlanUnitWithPercentPrice.builder()
                .cadence(NewPlanUnitWithPercentPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanUnitWithPercentPrice.ModelType.UNIT_WITH_PERCENT)
                .name("Annual fee")
                .unitWithPercentConfig(
                    NewPlanUnitWithPercentPrice.UnitWithPercentConfig.builder()
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
                    NewPlanUnitWithPercentPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanUnitWithPercentPrice.cadence())
            .isEqualTo(NewPlanUnitWithPercentPrice.Cadence.ANNUAL)
        assertThat(newPlanUnitWithPercentPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanUnitWithPercentPrice.modelType())
            .isEqualTo(NewPlanUnitWithPercentPrice.ModelType.UNIT_WITH_PERCENT)
        assertThat(newPlanUnitWithPercentPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanUnitWithPercentPrice.unitWithPercentConfig())
            .isEqualTo(
                NewPlanUnitWithPercentPrice.UnitWithPercentConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanUnitWithPercentPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newPlanUnitWithPercentPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanUnitWithPercentPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanUnitWithPercentPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanUnitWithPercentPrice.conversionRateConfig())
            .isEqualTo(
                NewPlanUnitWithPercentPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newPlanUnitWithPercentPrice.currency()).isEqualTo("currency")
        assertThat(newPlanUnitWithPercentPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanUnitWithPercentPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newPlanUnitWithPercentPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanUnitWithPercentPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanUnitWithPercentPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanUnitWithPercentPrice.metadata())
            .isEqualTo(
                NewPlanUnitWithPercentPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanUnitWithPercentPrice =
            NewPlanUnitWithPercentPrice.builder()
                .cadence(NewPlanUnitWithPercentPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanUnitWithPercentPrice.ModelType.UNIT_WITH_PERCENT)
                .name("Annual fee")
                .unitWithPercentConfig(
                    NewPlanUnitWithPercentPrice.UnitWithPercentConfig.builder()
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
                    NewPlanUnitWithPercentPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanUnitWithPercentPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanUnitWithPercentPrice),
                jacksonTypeRef<NewPlanUnitWithPercentPrice>(),
            )

        assertThat(roundtrippedNewPlanUnitWithPercentPrice).isEqualTo(newPlanUnitWithPercentPrice)
    }
}
