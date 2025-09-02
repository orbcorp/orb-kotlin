// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionBpsPriceTest {

    @Test
    fun create() {
        val newSubscriptionBpsPrice =
            NewSubscriptionBpsPrice.builder()
                .bpsConfig(BpsConfig.builder().bps(0.0).perUnitMaximum("per_unit_maximum").build())
                .cadence(NewSubscriptionBpsPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionBpsPrice.ModelType.BPS)
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
                    NewSubscriptionBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionBpsPrice.bpsConfig())
            .isEqualTo(BpsConfig.builder().bps(0.0).perUnitMaximum("per_unit_maximum").build())
        assertThat(newSubscriptionBpsPrice.cadence())
            .isEqualTo(NewSubscriptionBpsPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionBpsPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionBpsPrice.modelType())
            .isEqualTo(NewSubscriptionBpsPrice.ModelType.BPS)
        assertThat(newSubscriptionBpsPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionBpsPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newSubscriptionBpsPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionBpsPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionBpsPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionBpsPrice.conversionRateConfig())
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
        assertThat(newSubscriptionBpsPrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionBpsPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionBpsPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newSubscriptionBpsPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionBpsPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionBpsPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionBpsPrice.metadata())
            .isEqualTo(
                NewSubscriptionBpsPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionBpsPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionBpsPrice =
            NewSubscriptionBpsPrice.builder()
                .bpsConfig(BpsConfig.builder().bps(0.0).perUnitMaximum("per_unit_maximum").build())
                .cadence(NewSubscriptionBpsPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionBpsPrice.ModelType.BPS)
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
                    NewSubscriptionBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionBpsPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionBpsPrice),
                jacksonTypeRef<NewSubscriptionBpsPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionBpsPrice).isEqualTo(newSubscriptionBpsPrice)
    }
}
