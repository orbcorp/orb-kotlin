// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingMatrixWithAllocationPriceTest {

    @Test
    fun create() {
        val newFloatingMatrixWithAllocationPrice =
            NewFloatingMatrixWithAllocationPrice.builder()
                .cadence(NewFloatingMatrixWithAllocationPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .matrixWithAllocationConfig(
                    MatrixWithAllocationConfig.builder()
                        .allocation(0.0)
                        .defaultUnitAmount("default_unit_amount")
                        .addDimension("string")
                        .addMatrixValue(
                            MatrixValue.builder()
                                .addDimensionValue("string")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
                .modelType(NewFloatingMatrixWithAllocationPrice.ModelType.MATRIX_WITH_ALLOCATION)
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
                    NewFloatingMatrixWithAllocationPrice.ConversionRateConfig.Unit.UnitConfig
                        .builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewFloatingMatrixWithAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingMatrixWithAllocationPrice.cadence())
            .isEqualTo(NewFloatingMatrixWithAllocationPrice.Cadence.ANNUAL)
        assertThat(newFloatingMatrixWithAllocationPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingMatrixWithAllocationPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingMatrixWithAllocationPrice.matrixWithAllocationConfig())
            .isEqualTo(
                MatrixWithAllocationConfig.builder()
                    .allocation(0.0)
                    .defaultUnitAmount("default_unit_amount")
                    .addDimension("string")
                    .addMatrixValue(
                        MatrixValue.builder()
                            .addDimensionValue("string")
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .build()
            )
        assertThat(newFloatingMatrixWithAllocationPrice.modelType())
            .isEqualTo(NewFloatingMatrixWithAllocationPrice.ModelType.MATRIX_WITH_ALLOCATION)
        assertThat(newFloatingMatrixWithAllocationPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingMatrixWithAllocationPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newFloatingMatrixWithAllocationPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingMatrixWithAllocationPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingMatrixWithAllocationPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingMatrixWithAllocationPrice.conversionRateConfig())
            .isEqualTo(
                NewFloatingMatrixWithAllocationPrice.ConversionRateConfig.ofUnit(
                    NewFloatingMatrixWithAllocationPrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewFloatingMatrixWithAllocationPrice.ConversionRateConfig.Unit
                                .UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingMatrixWithAllocationPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingMatrixWithAllocationPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newFloatingMatrixWithAllocationPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingMatrixWithAllocationPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingMatrixWithAllocationPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingMatrixWithAllocationPrice.metadata())
            .isEqualTo(
                NewFloatingMatrixWithAllocationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingMatrixWithAllocationPrice =
            NewFloatingMatrixWithAllocationPrice.builder()
                .cadence(NewFloatingMatrixWithAllocationPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .matrixWithAllocationConfig(
                    MatrixWithAllocationConfig.builder()
                        .allocation(0.0)
                        .defaultUnitAmount("default_unit_amount")
                        .addDimension("string")
                        .addMatrixValue(
                            MatrixValue.builder()
                                .addDimensionValue("string")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
                .modelType(NewFloatingMatrixWithAllocationPrice.ModelType.MATRIX_WITH_ALLOCATION)
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
                    NewFloatingMatrixWithAllocationPrice.ConversionRateConfig.Unit.UnitConfig
                        .builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewFloatingMatrixWithAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingMatrixWithAllocationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingMatrixWithAllocationPrice),
                jacksonTypeRef<NewFloatingMatrixWithAllocationPrice>(),
            )

        assertThat(roundtrippedNewFloatingMatrixWithAllocationPrice)
            .isEqualTo(newFloatingMatrixWithAllocationPrice)
    }
}
