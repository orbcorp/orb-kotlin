// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanUnitPriceTest {

    @Test
    fun create() {
        val newPlanUnitPrice =
            NewPlanUnitPrice.builder()
                .cadence(NewPlanUnitPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanUnitPrice.ModelType.UNIT)
                .name("Annual fee")
                .unitConfig(
                    UnitConfig.builder().unitAmount("unit_amount").scalingFactor(0.0).build()
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
                    NewPlanUnitPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newPlanUnitPrice.cadence()).isEqualTo(NewPlanUnitPrice.Cadence.ANNUAL)
        assertThat(newPlanUnitPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanUnitPrice.modelType()).isEqualTo(NewPlanUnitPrice.ModelType.UNIT)
        assertThat(newPlanUnitPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanUnitPrice.unitConfig())
            .isEqualTo(UnitConfig.builder().unitAmount("unit_amount").scalingFactor(0.0).build())
        assertThat(newPlanUnitPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newPlanUnitPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanUnitPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanUnitPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanUnitPrice.conversionRateConfig())
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
        assertThat(newPlanUnitPrice.currency()).isEqualTo("currency")
        assertThat(newPlanUnitPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanUnitPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newPlanUnitPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanUnitPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanUnitPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanUnitPrice.metadata())
            .isEqualTo(
                NewPlanUnitPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newPlanUnitPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanUnitPrice =
            NewPlanUnitPrice.builder()
                .cadence(NewPlanUnitPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanUnitPrice.ModelType.UNIT)
                .name("Annual fee")
                .unitConfig(
                    UnitConfig.builder().unitAmount("unit_amount").scalingFactor(0.0).build()
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
                    NewPlanUnitPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewPlanUnitPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanUnitPrice),
                jacksonTypeRef<NewPlanUnitPrice>(),
            )

        assertThat(roundtrippedNewPlanUnitPrice).isEqualTo(newPlanUnitPrice)
    }
}
