// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanMatrixWithAllocationPriceTest {

    @Test
    fun create() {
        val newPlanMatrixWithAllocationPrice =
            NewPlanMatrixWithAllocationPrice.builder()
                .cadence(NewPlanMatrixWithAllocationPrice.Cadence.ANNUAL)
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
                .modelType(NewPlanMatrixWithAllocationPrice.ModelType.MATRIX_WITH_ALLOCATION)
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
                    NewPlanMatrixWithAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanMatrixWithAllocationPrice.cadence())
            .isEqualTo(NewPlanMatrixWithAllocationPrice.Cadence.ANNUAL)
        assertThat(newPlanMatrixWithAllocationPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanMatrixWithAllocationPrice.matrixWithAllocationConfig())
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
        assertThat(newPlanMatrixWithAllocationPrice.modelType())
            .isEqualTo(NewPlanMatrixWithAllocationPrice.ModelType.MATRIX_WITH_ALLOCATION)
        assertThat(newPlanMatrixWithAllocationPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanMatrixWithAllocationPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newPlanMatrixWithAllocationPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanMatrixWithAllocationPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanMatrixWithAllocationPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanMatrixWithAllocationPrice.currency()).isEqualTo("currency")
        assertThat(newPlanMatrixWithAllocationPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanMatrixWithAllocationPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newPlanMatrixWithAllocationPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanMatrixWithAllocationPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanMatrixWithAllocationPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanMatrixWithAllocationPrice.metadata())
            .isEqualTo(
                NewPlanMatrixWithAllocationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanMatrixWithAllocationPrice =
            NewPlanMatrixWithAllocationPrice.builder()
                .cadence(NewPlanMatrixWithAllocationPrice.Cadence.ANNUAL)
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
                .modelType(NewPlanMatrixWithAllocationPrice.ModelType.MATRIX_WITH_ALLOCATION)
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
                    NewPlanMatrixWithAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanMatrixWithAllocationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanMatrixWithAllocationPrice),
                jacksonTypeRef<NewPlanMatrixWithAllocationPrice>(),
            )

        assertThat(roundtrippedNewPlanMatrixWithAllocationPrice)
            .isEqualTo(newPlanMatrixWithAllocationPrice)
    }
}
