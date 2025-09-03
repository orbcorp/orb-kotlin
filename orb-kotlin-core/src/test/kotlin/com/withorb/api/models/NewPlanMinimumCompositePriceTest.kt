// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanMinimumCompositePriceTest {

    @Test
    fun create() {
        val newPlanMinimumCompositePrice =
            NewPlanMinimumCompositePrice.builder()
                .cadence(NewPlanMinimumCompositePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .minimumConfig(
                    NewPlanMinimumCompositePrice.MinimumConfig.builder()
                        .minimumAmount("minimum_amount")
                        .prorated(true)
                        .build()
                )
                .modelType(NewPlanMinimumCompositePrice.ModelType.MINIMUM)
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
                    NewPlanMinimumCompositePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newPlanMinimumCompositePrice.cadence())
            .isEqualTo(NewPlanMinimumCompositePrice.Cadence.ANNUAL)
        assertThat(newPlanMinimumCompositePrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanMinimumCompositePrice.minimumConfig())
            .isEqualTo(
                NewPlanMinimumCompositePrice.MinimumConfig.builder()
                    .minimumAmount("minimum_amount")
                    .prorated(true)
                    .build()
            )
        assertThat(newPlanMinimumCompositePrice.modelType())
            .isEqualTo(NewPlanMinimumCompositePrice.ModelType.MINIMUM)
        assertThat(newPlanMinimumCompositePrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanMinimumCompositePrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newPlanMinimumCompositePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanMinimumCompositePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanMinimumCompositePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanMinimumCompositePrice.conversionRateConfig())
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
        assertThat(newPlanMinimumCompositePrice.currency()).isEqualTo("currency")
        assertThat(newPlanMinimumCompositePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanMinimumCompositePrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newPlanMinimumCompositePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanMinimumCompositePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanMinimumCompositePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanMinimumCompositePrice.metadata())
            .isEqualTo(
                NewPlanMinimumCompositePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newPlanMinimumCompositePrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanMinimumCompositePrice =
            NewPlanMinimumCompositePrice.builder()
                .cadence(NewPlanMinimumCompositePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .minimumConfig(
                    NewPlanMinimumCompositePrice.MinimumConfig.builder()
                        .minimumAmount("minimum_amount")
                        .prorated(true)
                        .build()
                )
                .modelType(NewPlanMinimumCompositePrice.ModelType.MINIMUM)
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
                    NewPlanMinimumCompositePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewPlanMinimumCompositePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanMinimumCompositePrice),
                jacksonTypeRef<NewPlanMinimumCompositePrice>(),
            )

        assertThat(roundtrippedNewPlanMinimumCompositePrice).isEqualTo(newPlanMinimumCompositePrice)
    }
}
