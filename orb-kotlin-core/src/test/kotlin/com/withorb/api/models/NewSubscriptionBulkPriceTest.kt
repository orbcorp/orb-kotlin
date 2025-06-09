// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionBulkPriceTest {

    @Test
    fun create() {
        val newSubscriptionBulkPrice =
            NewSubscriptionBulkPrice.builder()
                .bulkConfig(
                    BulkConfig.builder()
                        .addTier(
                            BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build()
                        )
                        .build()
                )
                .cadence(NewSubscriptionBulkPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionBulkPrice.ModelType.BULK)
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
                    NewSubscriptionBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionBulkPrice.bulkConfig())
            .isEqualTo(
                BulkConfig.builder()
                    .addTier(BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build())
                    .build()
            )
        assertThat(newSubscriptionBulkPrice.cadence())
            .isEqualTo(NewSubscriptionBulkPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionBulkPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionBulkPrice.modelType())
            .isEqualTo(NewSubscriptionBulkPrice.ModelType.BULK)
        assertThat(newSubscriptionBulkPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionBulkPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newSubscriptionBulkPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionBulkPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionBulkPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionBulkPrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionBulkPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionBulkPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newSubscriptionBulkPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionBulkPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionBulkPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionBulkPrice.metadata())
            .isEqualTo(
                NewSubscriptionBulkPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionBulkPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionBulkPrice =
            NewSubscriptionBulkPrice.builder()
                .bulkConfig(
                    BulkConfig.builder()
                        .addTier(
                            BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build()
                        )
                        .build()
                )
                .cadence(NewSubscriptionBulkPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionBulkPrice.ModelType.BULK)
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
                    NewSubscriptionBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionBulkPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionBulkPrice),
                jacksonTypeRef<NewSubscriptionBulkPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionBulkPrice).isEqualTo(newSubscriptionBulkPrice)
    }
}
