// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionMatrixPriceTest {

    @Test
    fun create() {
        val newSubscriptionMatrixPrice =
            NewSubscriptionMatrixPrice.builder()
                .cadence(NewSubscriptionMatrixPrice.Cadence.ANNUAL)
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
                .modelType(NewSubscriptionMatrixPrice.ModelType.MATRIX)
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
                    NewSubscriptionMatrixPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionMatrixPrice.cadence())
            .isEqualTo(NewSubscriptionMatrixPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionMatrixPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionMatrixPrice.matrixConfig())
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
        assertThat(newSubscriptionMatrixPrice.modelType())
            .isEqualTo(NewSubscriptionMatrixPrice.ModelType.MATRIX)
        assertThat(newSubscriptionMatrixPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionMatrixPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newSubscriptionMatrixPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionMatrixPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionMatrixPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionMatrixPrice.conversionRateConfig())
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
        assertThat(newSubscriptionMatrixPrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionMatrixPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionMatrixPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newSubscriptionMatrixPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionMatrixPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionMatrixPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionMatrixPrice.metadata())
            .isEqualTo(
                NewSubscriptionMatrixPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionMatrixPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionMatrixPrice =
            NewSubscriptionMatrixPrice.builder()
                .cadence(NewSubscriptionMatrixPrice.Cadence.ANNUAL)
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
                .modelType(NewSubscriptionMatrixPrice.ModelType.MATRIX)
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
                    NewSubscriptionMatrixPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionMatrixPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionMatrixPrice),
                jacksonTypeRef<NewSubscriptionMatrixPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionMatrixPrice).isEqualTo(newSubscriptionMatrixPrice)
    }
}
