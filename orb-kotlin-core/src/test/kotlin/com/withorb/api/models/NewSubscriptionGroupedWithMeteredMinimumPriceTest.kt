// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionGroupedWithMeteredMinimumPriceTest {

    @Test
    fun create() {
        val newSubscriptionGroupedWithMeteredMinimumPrice =
            NewSubscriptionGroupedWithMeteredMinimumPrice.builder()
                .cadence(NewSubscriptionGroupedWithMeteredMinimumPrice.Cadence.ANNUAL)
                .groupedWithMeteredMinimumConfig(
                    NewSubscriptionGroupedWithMeteredMinimumPrice.GroupedWithMeteredMinimumConfig
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewSubscriptionGroupedWithMeteredMinimumPrice.ModelType
                        .GROUPED_WITH_METERED_MINIMUM
                )
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
                    NewSubscriptionGroupedWithMeteredMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.cadence())
            .isEqualTo(NewSubscriptionGroupedWithMeteredMinimumPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.groupedWithMeteredMinimumConfig())
            .isEqualTo(
                NewSubscriptionGroupedWithMeteredMinimumPrice.GroupedWithMeteredMinimumConfig
                    .builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.modelType())
            .isEqualTo(
                NewSubscriptionGroupedWithMeteredMinimumPrice.ModelType.GROUPED_WITH_METERED_MINIMUM
            )
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.conversionRateConfig())
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
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.fixedPriceQuantity())
            .isEqualTo(0.0)
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.invoiceGroupingKey())
            .isEqualTo("x")
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.metadata())
            .isEqualTo(
                NewSubscriptionGroupedWithMeteredMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionGroupedWithMeteredMinimumPrice.referenceId())
            .isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionGroupedWithMeteredMinimumPrice =
            NewSubscriptionGroupedWithMeteredMinimumPrice.builder()
                .cadence(NewSubscriptionGroupedWithMeteredMinimumPrice.Cadence.ANNUAL)
                .groupedWithMeteredMinimumConfig(
                    NewSubscriptionGroupedWithMeteredMinimumPrice.GroupedWithMeteredMinimumConfig
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewSubscriptionGroupedWithMeteredMinimumPrice.ModelType
                        .GROUPED_WITH_METERED_MINIMUM
                )
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
                    NewSubscriptionGroupedWithMeteredMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionGroupedWithMeteredMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionGroupedWithMeteredMinimumPrice),
                jacksonTypeRef<NewSubscriptionGroupedWithMeteredMinimumPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionGroupedWithMeteredMinimumPrice)
            .isEqualTo(newSubscriptionGroupedWithMeteredMinimumPrice)
    }
}
