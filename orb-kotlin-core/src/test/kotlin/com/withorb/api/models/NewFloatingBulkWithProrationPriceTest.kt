// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingBulkWithProrationPriceTest {

    @Test
    fun create() {
        val newFloatingBulkWithProrationPrice =
            NewFloatingBulkWithProrationPrice.builder()
                .bulkWithProrationConfig(
                    NewFloatingBulkWithProrationPrice.BulkWithProrationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .cadence(NewFloatingBulkWithProrationPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingBulkWithProrationPrice.ModelType.BULK_WITH_PRORATION)
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
                    NewFloatingBulkWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingBulkWithProrationPrice.bulkWithProrationConfig())
            .isEqualTo(
                NewFloatingBulkWithProrationPrice.BulkWithProrationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingBulkWithProrationPrice.cadence())
            .isEqualTo(NewFloatingBulkWithProrationPrice.Cadence.ANNUAL)
        assertThat(newFloatingBulkWithProrationPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingBulkWithProrationPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingBulkWithProrationPrice.modelType())
            .isEqualTo(NewFloatingBulkWithProrationPrice.ModelType.BULK_WITH_PRORATION)
        assertThat(newFloatingBulkWithProrationPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingBulkWithProrationPrice.billableMetricId())
            .isEqualTo("billable_metric_id")
        assertThat(newFloatingBulkWithProrationPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingBulkWithProrationPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingBulkWithProrationPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingBulkWithProrationPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingBulkWithProrationPrice.externalPriceId())
            .isEqualTo("external_price_id")
        assertThat(newFloatingBulkWithProrationPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingBulkWithProrationPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingBulkWithProrationPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingBulkWithProrationPrice.metadata())
            .isEqualTo(
                NewFloatingBulkWithProrationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingBulkWithProrationPrice =
            NewFloatingBulkWithProrationPrice.builder()
                .bulkWithProrationConfig(
                    NewFloatingBulkWithProrationPrice.BulkWithProrationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .cadence(NewFloatingBulkWithProrationPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingBulkWithProrationPrice.ModelType.BULK_WITH_PRORATION)
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
                    NewFloatingBulkWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingBulkWithProrationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingBulkWithProrationPrice),
                jacksonTypeRef<NewFloatingBulkWithProrationPrice>(),
            )

        assertThat(roundtrippedNewFloatingBulkWithProrationPrice)
            .isEqualTo(newFloatingBulkWithProrationPrice)
    }
}
