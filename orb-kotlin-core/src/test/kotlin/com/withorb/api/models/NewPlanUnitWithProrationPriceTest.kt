// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanUnitWithProrationPriceTest {

    @Test
    fun create() {
        val newPlanUnitWithProrationPrice =
            NewPlanUnitWithProrationPrice.builder()
                .cadence(NewPlanUnitWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
                .name("Annual fee")
                .unitWithProrationConfig(
                    NewPlanUnitWithProrationPrice.UnitWithProrationConfig.builder()
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
                    NewPlanUnitWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newPlanUnitWithProrationPrice.cadence())
            .isEqualTo(NewPlanUnitWithProrationPrice.Cadence.ANNUAL)
        assertThat(newPlanUnitWithProrationPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanUnitWithProrationPrice.modelType())
            .isEqualTo(NewPlanUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
        assertThat(newPlanUnitWithProrationPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanUnitWithProrationPrice.unitWithProrationConfig())
            .isEqualTo(
                NewPlanUnitWithProrationPrice.UnitWithProrationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanUnitWithProrationPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newPlanUnitWithProrationPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanUnitWithProrationPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanUnitWithProrationPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanUnitWithProrationPrice.conversionRateConfig())
            .isEqualTo(
                NewPlanUnitWithProrationPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newPlanUnitWithProrationPrice.currency()).isEqualTo("currency")
        assertThat(newPlanUnitWithProrationPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanUnitWithProrationPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newPlanUnitWithProrationPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanUnitWithProrationPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanUnitWithProrationPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanUnitWithProrationPrice.metadata())
            .isEqualTo(
                NewPlanUnitWithProrationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newPlanUnitWithProrationPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanUnitWithProrationPrice =
            NewPlanUnitWithProrationPrice.builder()
                .cadence(NewPlanUnitWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
                .name("Annual fee")
                .unitWithProrationConfig(
                    NewPlanUnitWithProrationPrice.UnitWithProrationConfig.builder()
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
                    NewPlanUnitWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewPlanUnitWithProrationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanUnitWithProrationPrice),
                jacksonTypeRef<NewPlanUnitWithProrationPrice>(),
            )

        assertThat(roundtrippedNewPlanUnitWithProrationPrice)
            .isEqualTo(newPlanUnitWithProrationPrice)
    }
}
