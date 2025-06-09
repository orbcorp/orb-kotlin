// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingBulkPriceTest {

    @Test
    fun create() {
        val newFloatingBulkPrice =
            NewFloatingBulkPrice.builder()
                .bulkConfig(
                    BulkConfig.builder()
                        .addTier(
                            BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build()
                        )
                        .build()
                )
                .cadence(NewFloatingBulkPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingBulkPrice.ModelType.BULK)
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
                    NewFloatingBulkPrice.ConversionRateConfig.Unit.UnitConfig.builder()
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
                    NewFloatingBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingBulkPrice.bulkConfig())
            .isEqualTo(
                BulkConfig.builder()
                    .addTier(BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build())
                    .build()
            )
        assertThat(newFloatingBulkPrice.cadence()).isEqualTo(NewFloatingBulkPrice.Cadence.ANNUAL)
        assertThat(newFloatingBulkPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingBulkPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingBulkPrice.modelType()).isEqualTo(NewFloatingBulkPrice.ModelType.BULK)
        assertThat(newFloatingBulkPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingBulkPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newFloatingBulkPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingBulkPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingBulkPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingBulkPrice.conversionRateConfig())
            .isEqualTo(
                NewFloatingBulkPrice.ConversionRateConfig.ofUnit(
                    NewFloatingBulkPrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewFloatingBulkPrice.ConversionRateConfig.Unit.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingBulkPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingBulkPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newFloatingBulkPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingBulkPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingBulkPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingBulkPrice.metadata())
            .isEqualTo(
                NewFloatingBulkPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingBulkPrice =
            NewFloatingBulkPrice.builder()
                .bulkConfig(
                    BulkConfig.builder()
                        .addTier(
                            BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build()
                        )
                        .build()
                )
                .cadence(NewFloatingBulkPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingBulkPrice.ModelType.BULK)
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
                    NewFloatingBulkPrice.ConversionRateConfig.Unit.UnitConfig.builder()
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
                    NewFloatingBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingBulkPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingBulkPrice),
                jacksonTypeRef<NewFloatingBulkPrice>(),
            )

        assertThat(roundtrippedNewFloatingBulkPrice).isEqualTo(newFloatingBulkPrice)
    }
}
