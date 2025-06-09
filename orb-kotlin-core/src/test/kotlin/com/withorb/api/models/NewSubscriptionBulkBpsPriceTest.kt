// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionBulkBpsPriceTest {

    @Test
    fun create() {
        val newSubscriptionBulkBpsPrice =
            NewSubscriptionBulkBpsPrice.builder()
                .bulkBpsConfig(
                    BulkBpsConfig.builder()
                        .addTier(
                            BulkBpsTier.builder()
                                .bps(0.0)
                                .maximumAmount("maximum_amount")
                                .perUnitMaximum("per_unit_maximum")
                                .build()
                        )
                        .build()
                )
                .cadence(NewSubscriptionBulkBpsPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionBulkBpsPrice.ModelType.BULK_BPS)
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
                    NewSubscriptionBulkBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionBulkBpsPrice.bulkBpsConfig())
            .isEqualTo(
                BulkBpsConfig.builder()
                    .addTier(
                        BulkBpsTier.builder()
                            .bps(0.0)
                            .maximumAmount("maximum_amount")
                            .perUnitMaximum("per_unit_maximum")
                            .build()
                    )
                    .build()
            )
        assertThat(newSubscriptionBulkBpsPrice.cadence())
            .isEqualTo(NewSubscriptionBulkBpsPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionBulkBpsPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionBulkBpsPrice.modelType())
            .isEqualTo(NewSubscriptionBulkBpsPrice.ModelType.BULK_BPS)
        assertThat(newSubscriptionBulkBpsPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionBulkBpsPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newSubscriptionBulkBpsPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newSubscriptionBulkBpsPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionBulkBpsPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newSubscriptionBulkBpsPrice.currency()).isEqualTo("currency")
        assertThat(newSubscriptionBulkBpsPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionBulkBpsPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newSubscriptionBulkBpsPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newSubscriptionBulkBpsPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newSubscriptionBulkBpsPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionBulkBpsPrice.metadata())
            .isEqualTo(
                NewSubscriptionBulkBpsPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionBulkBpsPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionBulkBpsPrice =
            NewSubscriptionBulkBpsPrice.builder()
                .bulkBpsConfig(
                    BulkBpsConfig.builder()
                        .addTier(
                            BulkBpsTier.builder()
                                .bps(0.0)
                                .maximumAmount("maximum_amount")
                                .perUnitMaximum("per_unit_maximum")
                                .build()
                        )
                        .build()
                )
                .cadence(NewSubscriptionBulkBpsPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionBulkBpsPrice.ModelType.BULK_BPS)
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
                    NewSubscriptionBulkBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionBulkBpsPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionBulkBpsPrice),
                jacksonTypeRef<NewSubscriptionBulkBpsPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionBulkBpsPrice).isEqualTo(newSubscriptionBulkBpsPrice)
    }
}
