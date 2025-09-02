// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingScalableMatrixWithTieredPricingPriceTest {

    @Test
    fun create() {
        val newFloatingScalableMatrixWithTieredPricingPrice =
            NewFloatingScalableMatrixWithTieredPricingPrice.builder()
                .cadence(NewFloatingScalableMatrixWithTieredPricingPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(
                    NewFloatingScalableMatrixWithTieredPricingPrice.ModelType
                        .SCALABLE_MATRIX_WITH_TIERED_PRICING
                )
                .name("Annual fee")
                .scalableMatrixWithTieredPricingConfig(
                    NewFloatingScalableMatrixWithTieredPricingPrice
                        .ScalableMatrixWithTieredPricingConfig
                        .builder()
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
                    NewFloatingScalableMatrixWithTieredPricingPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.cadence())
            .isEqualTo(NewFloatingScalableMatrixWithTieredPricingPrice.Cadence.ANNUAL)
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.modelType())
            .isEqualTo(
                NewFloatingScalableMatrixWithTieredPricingPrice.ModelType
                    .SCALABLE_MATRIX_WITH_TIERED_PRICING
            )
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.name()).isEqualTo("Annual fee")
        assertThat(
                newFloatingScalableMatrixWithTieredPricingPrice
                    .scalableMatrixWithTieredPricingConfig()
            )
            .isEqualTo(
                NewFloatingScalableMatrixWithTieredPricingPrice
                    .ScalableMatrixWithTieredPricingConfig
                    .builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.billedInAdvance())
            .isEqualTo(true)
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.conversionRateConfig())
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
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.fixedPriceQuantity())
            .isEqualTo(0.0)
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.invoiceGroupingKey())
            .isEqualTo("x")
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.metadata())
            .isEqualTo(
                NewFloatingScalableMatrixWithTieredPricingPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingScalableMatrixWithTieredPricingPrice =
            NewFloatingScalableMatrixWithTieredPricingPrice.builder()
                .cadence(NewFloatingScalableMatrixWithTieredPricingPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(
                    NewFloatingScalableMatrixWithTieredPricingPrice.ModelType
                        .SCALABLE_MATRIX_WITH_TIERED_PRICING
                )
                .name("Annual fee")
                .scalableMatrixWithTieredPricingConfig(
                    NewFloatingScalableMatrixWithTieredPricingPrice
                        .ScalableMatrixWithTieredPricingConfig
                        .builder()
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
                    NewFloatingScalableMatrixWithTieredPricingPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingScalableMatrixWithTieredPricingPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingScalableMatrixWithTieredPricingPrice),
                jacksonTypeRef<NewFloatingScalableMatrixWithTieredPricingPrice>(),
            )

        assertThat(roundtrippedNewFloatingScalableMatrixWithTieredPricingPrice)
            .isEqualTo(newFloatingScalableMatrixWithTieredPricingPrice)
    }
}
