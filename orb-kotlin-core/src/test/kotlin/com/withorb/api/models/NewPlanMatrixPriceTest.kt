// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanMatrixPriceTest {

    @Test
    fun create() {
        val newPlanMatrixPrice =
            NewPlanMatrixPrice.builder()
                .cadence(NewPlanMatrixPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .matrixConfig(
                    MatrixConfig.builder()
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
                .modelType(NewPlanMatrixPrice.ModelType.MATRIX)
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
                    NewPlanMatrixPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanMatrixPrice.cadence()).isEqualTo(NewPlanMatrixPrice.Cadence.ANNUAL)
        assertThat(newPlanMatrixPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanMatrixPrice.matrixConfig())
            .isEqualTo(
                MatrixConfig.builder()
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
        assertThat(newPlanMatrixPrice.modelType()).isEqualTo(NewPlanMatrixPrice.ModelType.MATRIX)
        assertThat(newPlanMatrixPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanMatrixPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newPlanMatrixPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanMatrixPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanMatrixPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanMatrixPrice.currency()).isEqualTo("currency")
        assertThat(newPlanMatrixPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanMatrixPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newPlanMatrixPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanMatrixPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanMatrixPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanMatrixPrice.metadata())
            .isEqualTo(
                NewPlanMatrixPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanMatrixPrice =
            NewPlanMatrixPrice.builder()
                .cadence(NewPlanMatrixPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .matrixConfig(
                    MatrixConfig.builder()
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
                .modelType(NewPlanMatrixPrice.ModelType.MATRIX)
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
                    NewPlanMatrixPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanMatrixPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanMatrixPrice),
                jacksonTypeRef<NewPlanMatrixPrice>(),
            )

        assertThat(roundtrippedNewPlanMatrixPrice).isEqualTo(newPlanMatrixPrice)
    }
}
