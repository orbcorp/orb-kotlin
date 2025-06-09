// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingMatrixPriceTest {

    @Test
    fun create() {
        val newFloatingMatrixPrice =
            NewFloatingMatrixPrice.builder()
                .cadence(NewFloatingMatrixPrice.Cadence.ANNUAL)
                .currency("currency")
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
                .modelType(NewFloatingMatrixPrice.ModelType.MATRIX)
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
                    NewFloatingMatrixPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingMatrixPrice.cadence())
            .isEqualTo(NewFloatingMatrixPrice.Cadence.ANNUAL)
        assertThat(newFloatingMatrixPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingMatrixPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingMatrixPrice.matrixConfig())
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
        assertThat(newFloatingMatrixPrice.modelType())
            .isEqualTo(NewFloatingMatrixPrice.ModelType.MATRIX)
        assertThat(newFloatingMatrixPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingMatrixPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newFloatingMatrixPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingMatrixPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingMatrixPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingMatrixPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingMatrixPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newFloatingMatrixPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingMatrixPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingMatrixPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingMatrixPrice.metadata())
            .isEqualTo(
                NewFloatingMatrixPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingMatrixPrice =
            NewFloatingMatrixPrice.builder()
                .cadence(NewFloatingMatrixPrice.Cadence.ANNUAL)
                .currency("currency")
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
                .modelType(NewFloatingMatrixPrice.ModelType.MATRIX)
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
                    NewFloatingMatrixPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingMatrixPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingMatrixPrice),
                jacksonTypeRef<NewFloatingMatrixPrice>(),
            )

        assertThat(roundtrippedNewFloatingMatrixPrice).isEqualTo(newFloatingMatrixPrice)
    }
}
