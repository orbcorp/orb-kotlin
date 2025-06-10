// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanMatrixWithDisplayNamePriceTest {

    @Test
    fun create() {
        val newPlanMatrixWithDisplayNamePrice =
            NewPlanMatrixWithDisplayNamePrice.builder()
                .cadence(NewPlanMatrixWithDisplayNamePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .matrixWithDisplayNameConfig(
                    NewPlanMatrixWithDisplayNamePrice.MatrixWithDisplayNameConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(NewPlanMatrixWithDisplayNamePrice.ModelType.MATRIX_WITH_DISPLAY_NAME)
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
                    NewPlanMatrixWithDisplayNamePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanMatrixWithDisplayNamePrice.cadence())
            .isEqualTo(NewPlanMatrixWithDisplayNamePrice.Cadence.ANNUAL)
        assertThat(newPlanMatrixWithDisplayNamePrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanMatrixWithDisplayNamePrice.matrixWithDisplayNameConfig())
            .isEqualTo(
                NewPlanMatrixWithDisplayNamePrice.MatrixWithDisplayNameConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanMatrixWithDisplayNamePrice.modelType())
            .isEqualTo(NewPlanMatrixWithDisplayNamePrice.ModelType.MATRIX_WITH_DISPLAY_NAME)
        assertThat(newPlanMatrixWithDisplayNamePrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanMatrixWithDisplayNamePrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newPlanMatrixWithDisplayNamePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanMatrixWithDisplayNamePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanMatrixWithDisplayNamePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanMatrixWithDisplayNamePrice.conversionRateConfig())
            .isEqualTo(
                NewPlanMatrixWithDisplayNamePrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newPlanMatrixWithDisplayNamePrice.currency()).isEqualTo("currency")
        assertThat(newPlanMatrixWithDisplayNamePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanMatrixWithDisplayNamePrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newPlanMatrixWithDisplayNamePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanMatrixWithDisplayNamePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanMatrixWithDisplayNamePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanMatrixWithDisplayNamePrice.metadata())
            .isEqualTo(
                NewPlanMatrixWithDisplayNamePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanMatrixWithDisplayNamePrice =
            NewPlanMatrixWithDisplayNamePrice.builder()
                .cadence(NewPlanMatrixWithDisplayNamePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .matrixWithDisplayNameConfig(
                    NewPlanMatrixWithDisplayNamePrice.MatrixWithDisplayNameConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(NewPlanMatrixWithDisplayNamePrice.ModelType.MATRIX_WITH_DISPLAY_NAME)
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
                    NewPlanMatrixWithDisplayNamePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanMatrixWithDisplayNamePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanMatrixWithDisplayNamePrice),
                jacksonTypeRef<NewPlanMatrixWithDisplayNamePrice>(),
            )

        assertThat(roundtrippedNewPlanMatrixWithDisplayNamePrice)
            .isEqualTo(newPlanMatrixWithDisplayNamePrice)
    }
}
