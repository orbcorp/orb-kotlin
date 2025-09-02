// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingMatrixWithDisplayNamePriceTest {

    @Test
    fun create() {
        val newFloatingMatrixWithDisplayNamePrice =
            NewFloatingMatrixWithDisplayNamePrice.builder()
                .cadence(NewFloatingMatrixWithDisplayNamePrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .matrixWithDisplayNameConfig(
                    NewFloatingMatrixWithDisplayNamePrice.MatrixWithDisplayNameConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(NewFloatingMatrixWithDisplayNamePrice.ModelType.MATRIX_WITH_DISPLAY_NAME)
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
                    NewFloatingMatrixWithDisplayNamePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingMatrixWithDisplayNamePrice.cadence())
            .isEqualTo(NewFloatingMatrixWithDisplayNamePrice.Cadence.ANNUAL)
        assertThat(newFloatingMatrixWithDisplayNamePrice.currency()).isEqualTo("currency")
        assertThat(newFloatingMatrixWithDisplayNamePrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingMatrixWithDisplayNamePrice.matrixWithDisplayNameConfig())
            .isEqualTo(
                NewFloatingMatrixWithDisplayNamePrice.MatrixWithDisplayNameConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingMatrixWithDisplayNamePrice.modelType())
            .isEqualTo(NewFloatingMatrixWithDisplayNamePrice.ModelType.MATRIX_WITH_DISPLAY_NAME)
        assertThat(newFloatingMatrixWithDisplayNamePrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingMatrixWithDisplayNamePrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newFloatingMatrixWithDisplayNamePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingMatrixWithDisplayNamePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingMatrixWithDisplayNamePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingMatrixWithDisplayNamePrice.conversionRateConfig())
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
        assertThat(newFloatingMatrixWithDisplayNamePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingMatrixWithDisplayNamePrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newFloatingMatrixWithDisplayNamePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingMatrixWithDisplayNamePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingMatrixWithDisplayNamePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingMatrixWithDisplayNamePrice.metadata())
            .isEqualTo(
                NewFloatingMatrixWithDisplayNamePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingMatrixWithDisplayNamePrice =
            NewFloatingMatrixWithDisplayNamePrice.builder()
                .cadence(NewFloatingMatrixWithDisplayNamePrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .matrixWithDisplayNameConfig(
                    NewFloatingMatrixWithDisplayNamePrice.MatrixWithDisplayNameConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(NewFloatingMatrixWithDisplayNamePrice.ModelType.MATRIX_WITH_DISPLAY_NAME)
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
                    NewFloatingMatrixWithDisplayNamePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingMatrixWithDisplayNamePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingMatrixWithDisplayNamePrice),
                jacksonTypeRef<NewFloatingMatrixWithDisplayNamePrice>(),
            )

        assertThat(roundtrippedNewFloatingMatrixWithDisplayNamePrice)
            .isEqualTo(newFloatingMatrixWithDisplayNamePrice)
    }
}
