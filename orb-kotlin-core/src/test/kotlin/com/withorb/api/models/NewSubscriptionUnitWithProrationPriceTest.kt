// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionUnitWithProrationPriceTest {

    @Test
    fun create() {
        val newSubscriptionUnitWithProrationPrice =
            NewSubscriptionUnitWithProrationPrice.builder()
                .cadence(NewSubscriptionUnitWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
                .name("Annual fee")
                .unitWithProrationConfig(
                    NewSubscriptionUnitWithProrationPrice.UnitWithProrationConfig.builder()
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
                    NewSubscriptionUnitWithProrationPrice.ConversionRateConfig.Unit.UnitConfig
                        .builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewSubscriptionUnitWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionUnitWithProrationPrice.cadence())
            .isEqualTo(NewSubscriptionUnitWithProrationPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionUnitWithProrationPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionUnitWithProrationPrice.modelType())
            .isEqualTo(NewSubscriptionUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
        assertThat(newSubscriptionUnitWithProrationPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionUnitWithProrationPrice.unitWithProrationConfig())
            .isEqualTo(
                NewSubscriptionUnitWithProrationPrice.UnitWithProrationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionUnitWithProrationPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newSubscriptionUnitWithProrationPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionUnitWithProrationPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionUnitWithProrationPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionUnitWithProrationPrice.conversionRateConfig())
            .isEqualTo(
                NewSubscriptionUnitWithProrationPrice.ConversionRateConfig.ofUnit(
                    NewSubscriptionUnitWithProrationPrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewSubscriptionUnitWithProrationPrice.ConversionRateConfig.Unit
                                .UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionUnitWithProrationPrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionUnitWithProrationPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionUnitWithProrationPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newSubscriptionUnitWithProrationPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionUnitWithProrationPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionUnitWithProrationPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionUnitWithProrationPrice.metadata())
            .isEqualTo(
                NewSubscriptionUnitWithProrationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionUnitWithProrationPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionUnitWithProrationPrice =
            NewSubscriptionUnitWithProrationPrice.builder()
                .cadence(NewSubscriptionUnitWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
                .name("Annual fee")
                .unitWithProrationConfig(
                    NewSubscriptionUnitWithProrationPrice.UnitWithProrationConfig.builder()
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
                    NewSubscriptionUnitWithProrationPrice.ConversionRateConfig.Unit.UnitConfig
                        .builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewSubscriptionUnitWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionUnitWithProrationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionUnitWithProrationPrice),
                jacksonTypeRef<NewSubscriptionUnitWithProrationPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionUnitWithProrationPrice)
            .isEqualTo(newSubscriptionUnitWithProrationPrice)
    }
}
