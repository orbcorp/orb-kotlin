// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingBulkBpsPriceTest {

    @Test
    fun create() {
        val newFloatingBulkBpsPrice =
            NewFloatingBulkBpsPrice.builder()
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
                .cadence(NewFloatingBulkBpsPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingBulkBpsPrice.ModelType.BULK_BPS)
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
                    NewFloatingBulkBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingBulkBpsPrice.bulkBpsConfig())
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
        assertThat(newFloatingBulkBpsPrice.cadence())
            .isEqualTo(NewFloatingBulkBpsPrice.Cadence.ANNUAL)
        assertThat(newFloatingBulkBpsPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingBulkBpsPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingBulkBpsPrice.modelType())
            .isEqualTo(NewFloatingBulkBpsPrice.ModelType.BULK_BPS)
        assertThat(newFloatingBulkBpsPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingBulkBpsPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newFloatingBulkBpsPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newFloatingBulkBpsPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingBulkBpsPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newFloatingBulkBpsPrice.conversionRateConfig())
            .isEqualTo(
                NewFloatingBulkBpsPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingBulkBpsPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingBulkBpsPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newFloatingBulkBpsPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newFloatingBulkBpsPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newFloatingBulkBpsPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingBulkBpsPrice.metadata())
            .isEqualTo(
                NewFloatingBulkBpsPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingBulkBpsPrice =
            NewFloatingBulkBpsPrice.builder()
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
                .cadence(NewFloatingBulkBpsPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingBulkBpsPrice.ModelType.BULK_BPS)
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
                    NewFloatingBulkBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingBulkBpsPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingBulkBpsPrice),
                jacksonTypeRef<NewFloatingBulkBpsPrice>(),
            )

        assertThat(roundtrippedNewFloatingBulkBpsPrice).isEqualTo(newFloatingBulkBpsPrice)
    }
}
