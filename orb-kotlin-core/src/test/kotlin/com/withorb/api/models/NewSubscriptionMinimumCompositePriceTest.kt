// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionMinimumCompositePriceTest {

    @Test
    fun create() {
        val newSubscriptionMinimumCompositePrice =
            NewSubscriptionMinimumCompositePrice.builder()
                .cadence(NewSubscriptionMinimumCompositePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .minimumCompositeConfig(
                    NewSubscriptionMinimumCompositePrice.MinimumCompositeConfig.builder()
                        .minimumAmount("minimum_amount")
                        .prorated(true)
                        .build()
                )
                .modelType(NewSubscriptionMinimumCompositePrice.ModelType.MINIMUM_COMPOSITE)
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
                    NewSubscriptionMinimumCompositePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionMinimumCompositePrice.cadence())
            .isEqualTo(NewSubscriptionMinimumCompositePrice.Cadence.ANNUAL)
        assertThat(newSubscriptionMinimumCompositePrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionMinimumCompositePrice.minimumCompositeConfig())
            .isEqualTo(
                NewSubscriptionMinimumCompositePrice.MinimumCompositeConfig.builder()
                    .minimumAmount("minimum_amount")
                    .prorated(true)
                    .build()
            )
        assertThat(newSubscriptionMinimumCompositePrice.modelType())
            .isEqualTo(NewSubscriptionMinimumCompositePrice.ModelType.MINIMUM_COMPOSITE)
        assertThat(newSubscriptionMinimumCompositePrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionMinimumCompositePrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newSubscriptionMinimumCompositePrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionMinimumCompositePrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionMinimumCompositePrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionMinimumCompositePrice.conversionRateConfig())
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
        assertThat(newSubscriptionMinimumCompositePrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionMinimumCompositePrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionMinimumCompositePrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newSubscriptionMinimumCompositePrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionMinimumCompositePrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionMinimumCompositePrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionMinimumCompositePrice.metadata())
            .isEqualTo(
                NewSubscriptionMinimumCompositePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionMinimumCompositePrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionMinimumCompositePrice =
            NewSubscriptionMinimumCompositePrice.builder()
                .cadence(NewSubscriptionMinimumCompositePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .minimumCompositeConfig(
                    NewSubscriptionMinimumCompositePrice.MinimumCompositeConfig.builder()
                        .minimumAmount("minimum_amount")
                        .prorated(true)
                        .build()
                )
                .modelType(NewSubscriptionMinimumCompositePrice.ModelType.MINIMUM_COMPOSITE)
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
                    NewSubscriptionMinimumCompositePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionMinimumCompositePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionMinimumCompositePrice),
                jacksonTypeRef<NewSubscriptionMinimumCompositePrice>(),
            )

        assertThat(roundtrippedNewSubscriptionMinimumCompositePrice)
            .isEqualTo(newSubscriptionMinimumCompositePrice)
    }
}
