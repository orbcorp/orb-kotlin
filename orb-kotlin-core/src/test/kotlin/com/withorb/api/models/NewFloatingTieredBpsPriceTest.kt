// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingTieredBpsPriceTest {

    @Test
    fun create() {
        val newFloatingTieredBpsPrice =
            NewFloatingTieredBpsPrice.builder()
                .cadence(NewFloatingTieredBpsPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingTieredBpsPrice.ModelType.TIERED_BPS)
                .name("Annual fee")
                .tieredBpsConfig(
                    TieredBpsConfig.builder()
                        .addTier(
                            BpsTier.builder()
                                .bps(0.0)
                                .minimumAmount("minimum_amount")
                                .maximumAmount("maximum_amount")
                                .perUnitMaximum("per_unit_maximum")
                                .build()
                        )
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
                    NewFloatingTieredBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingTieredBpsPrice.cadence())
            .isEqualTo(NewFloatingTieredBpsPrice.Cadence.ANNUAL)
        assertThat(newFloatingTieredBpsPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingTieredBpsPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingTieredBpsPrice.modelType())
            .isEqualTo(NewFloatingTieredBpsPrice.ModelType.TIERED_BPS)
        assertThat(newFloatingTieredBpsPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingTieredBpsPrice.tieredBpsConfig())
            .isEqualTo(
                TieredBpsConfig.builder()
                    .addTier(
                        BpsTier.builder()
                            .bps(0.0)
                            .minimumAmount("minimum_amount")
                            .maximumAmount("maximum_amount")
                            .perUnitMaximum("per_unit_maximum")
                            .build()
                    )
                    .build()
            )
        assertThat(newFloatingTieredBpsPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newFloatingTieredBpsPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingTieredBpsPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredBpsPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingTieredBpsPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingTieredBpsPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newFloatingTieredBpsPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingTieredBpsPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingTieredBpsPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredBpsPrice.metadata())
            .isEqualTo(
                NewFloatingTieredBpsPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingTieredBpsPrice =
            NewFloatingTieredBpsPrice.builder()
                .cadence(NewFloatingTieredBpsPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingTieredBpsPrice.ModelType.TIERED_BPS)
                .name("Annual fee")
                .tieredBpsConfig(
                    TieredBpsConfig.builder()
                        .addTier(
                            BpsTier.builder()
                                .bps(0.0)
                                .minimumAmount("minimum_amount")
                                .maximumAmount("maximum_amount")
                                .perUnitMaximum("per_unit_maximum")
                                .build()
                        )
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
                    NewFloatingTieredBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingTieredBpsPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingTieredBpsPrice),
                jacksonTypeRef<NewFloatingTieredBpsPrice>(),
            )

        assertThat(roundtrippedNewFloatingTieredBpsPrice).isEqualTo(newFloatingTieredBpsPrice)
    }
}
