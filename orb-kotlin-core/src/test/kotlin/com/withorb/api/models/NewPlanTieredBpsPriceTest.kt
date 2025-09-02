// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanTieredBpsPriceTest {

    @Test
    fun create() {
        val newPlanTieredBpsPrice =
            NewPlanTieredBpsPrice.builder()
                .cadence(NewPlanTieredBpsPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanTieredBpsPrice.ModelType.TIERED_BPS)
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
                    NewPlanTieredBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newPlanTieredBpsPrice.cadence()).isEqualTo(NewPlanTieredBpsPrice.Cadence.ANNUAL)
        assertThat(newPlanTieredBpsPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanTieredBpsPrice.modelType())
            .isEqualTo(NewPlanTieredBpsPrice.ModelType.TIERED_BPS)
        assertThat(newPlanTieredBpsPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanTieredBpsPrice.tieredBpsConfig())
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
        assertThat(newPlanTieredBpsPrice.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(newPlanTieredBpsPrice.billedInAdvance()).isEqualTo(true)
        assertThat(newPlanTieredBpsPrice.billingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTieredBpsPrice.conversionRate()).isEqualTo(0.0)
        assertThat(newPlanTieredBpsPrice.conversionRateConfig())
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
        assertThat(newPlanTieredBpsPrice.currency()).isEqualTo("currency")
        assertThat(newPlanTieredBpsPrice.dimensionalPriceConfiguration())
            .isEqualTo(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanTieredBpsPrice.externalPriceId()).isEqualTo("external_price_id")
        assertThat(newPlanTieredBpsPrice.fixedPriceQuantity()).isEqualTo(0.0)
        assertThat(newPlanTieredBpsPrice.invoiceGroupingKey()).isEqualTo("x")
        assertThat(newPlanTieredBpsPrice.invoicingCycleConfiguration())
            .isEqualTo(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTieredBpsPrice.metadata())
            .isEqualTo(
                NewPlanTieredBpsPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newPlanTieredBpsPrice.referenceId()).isEqualTo("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanTieredBpsPrice =
            NewPlanTieredBpsPrice.builder()
                .cadence(NewPlanTieredBpsPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanTieredBpsPrice.ModelType.TIERED_BPS)
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
                    NewPlanTieredBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewPlanTieredBpsPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanTieredBpsPrice),
                jacksonTypeRef<NewPlanTieredBpsPrice>(),
            )

        assertThat(roundtrippedNewPlanTieredBpsPrice).isEqualTo(newPlanTieredBpsPrice)
    }
}
