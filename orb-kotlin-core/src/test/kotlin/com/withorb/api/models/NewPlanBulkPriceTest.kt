// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanBulkPriceTest {

    @Test
    fun create() {
        val newPlanBulkPrice =
            NewPlanBulkPrice.builder()
                .bulkConfig(
                    BulkConfig.builder()
                        .addTier(
                            BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build()
                        )
                        .build()
                )
                .cadence(NewPlanBulkPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanBulkPrice.ModelType.BULK)
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
                    NewPlanBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanBulkPrice.bulkConfig())
            .isEqualTo(
                BulkConfig.builder()
                    .addTier(BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build())
                    .build()
            )
        assertThat(newPlanBulkPrice.cadence()).isEqualTo(NewPlanBulkPrice.Cadence.ANNUAL)
        assertThat(newPlanBulkPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanBulkPrice.modelType()).isEqualTo(NewPlanBulkPrice.ModelType.BULK)
        assertThat(newPlanBulkPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanBulkPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newPlanBulkPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanBulkPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanBulkPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanBulkPrice.conversionRateConfig())
            .isEqualTo(
                NewPlanBulkPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newPlanBulkPrice.currency()).isEqualTo("currency")
        assertThat(newPlanBulkPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanBulkPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newPlanBulkPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanBulkPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanBulkPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanBulkPrice.metadata())
            .isEqualTo(
                NewPlanBulkPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanBulkPrice =
            NewPlanBulkPrice.builder()
                .bulkConfig(
                    BulkConfig.builder()
                        .addTier(
                            BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build()
                        )
                        .build()
                )
                .cadence(NewPlanBulkPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanBulkPrice.ModelType.BULK)
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
                    NewPlanBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanBulkPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanBulkPrice),
                jacksonTypeRef<NewPlanBulkPrice>(),
            )

        assertThat(roundtrippedNewPlanBulkPrice).isEqualTo(newPlanBulkPrice)
    }
}
