// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PriceCreateParamsTest {

    @Test
    fun create() {
        PriceCreateParams.builder()
            .newFloatingPriceModel(
                NewFloatingPriceModel.NewFloatingUnitPrice.builder()
                    .cadence(NewFloatingPriceModel.NewFloatingUnitPrice.Cadence.ANNUAL)
                    .currency("currency")
                    .itemId("item_id")
                    .modelType(NewFloatingPriceModel.NewFloatingUnitPrice.ModelType.UNIT)
                    .name("Annual fee")
                    .unitConfig(UnitConfigModel.builder().unitAmount("unit_amount").build())
                    .billableMetricId("billable_metric_id")
                    .billedInAdvance(true)
                    .billingCycleConfiguration(
                        NewBillingCycleConfigurationModel.builder()
                            .duration(0L)
                            .durationUnit(NewBillingCycleConfigurationModel.DurationUnit.DAY)
                            .build()
                    )
                    .conversionRate(0.0)
                    .externalPriceId("external_price_id")
                    .fixedPriceQuantity(0.0)
                    .invoiceGroupingKey("invoice_grouping_key")
                    .invoicingCycleConfiguration(
                        NewBillingCycleConfigurationModel.builder()
                            .duration(0L)
                            .durationUnit(NewBillingCycleConfigurationModel.DurationUnit.DAY)
                            .build()
                    )
                    .metadata(
                        NewFloatingPriceModel.NewFloatingUnitPrice.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PriceCreateParams.builder()
                .newFloatingPriceModel(
                    NewFloatingPriceModel.NewFloatingUnitPrice.builder()
                        .cadence(NewFloatingPriceModel.NewFloatingUnitPrice.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .modelType(NewFloatingPriceModel.NewFloatingUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(UnitConfigModel.builder().unitAmount("unit_amount").build())
                        .billableMetricId("billable_metric_id")
                        .billedInAdvance(true)
                        .billingCycleConfiguration(
                            NewBillingCycleConfigurationModel.builder()
                                .duration(0L)
                                .durationUnit(NewBillingCycleConfigurationModel.DurationUnit.DAY)
                                .build()
                        )
                        .conversionRate(0.0)
                        .externalPriceId("external_price_id")
                        .fixedPriceQuantity(0.0)
                        .invoiceGroupingKey("invoice_grouping_key")
                        .invoicingCycleConfiguration(
                            NewBillingCycleConfigurationModel.builder()
                                .duration(0L)
                                .durationUnit(NewBillingCycleConfigurationModel.DurationUnit.DAY)
                                .build()
                        )
                        .metadata(
                            NewFloatingPriceModel.NewFloatingUnitPrice.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NewFloatingPriceModel.ofUnitPrice(
                    NewFloatingPriceModel.NewFloatingUnitPrice.builder()
                        .cadence(NewFloatingPriceModel.NewFloatingUnitPrice.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .modelType(NewFloatingPriceModel.NewFloatingUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(UnitConfigModel.builder().unitAmount("unit_amount").build())
                        .billableMetricId("billable_metric_id")
                        .billedInAdvance(true)
                        .billingCycleConfiguration(
                            NewBillingCycleConfigurationModel.builder()
                                .duration(0L)
                                .durationUnit(NewBillingCycleConfigurationModel.DurationUnit.DAY)
                                .build()
                        )
                        .conversionRate(0.0)
                        .externalPriceId("external_price_id")
                        .fixedPriceQuantity(0.0)
                        .invoiceGroupingKey("invoice_grouping_key")
                        .invoicingCycleConfiguration(
                            NewBillingCycleConfigurationModel.builder()
                                .duration(0L)
                                .durationUnit(NewBillingCycleConfigurationModel.DurationUnit.DAY)
                                .build()
                        )
                        .metadata(
                            NewFloatingPriceModel.NewFloatingUnitPrice.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PriceCreateParams.builder()
                .newFloatingPriceModel(
                    NewFloatingPriceModel.NewFloatingUnitPrice.builder()
                        .cadence(NewFloatingPriceModel.NewFloatingUnitPrice.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .modelType(NewFloatingPriceModel.NewFloatingUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(UnitConfigModel.builder().unitAmount("unit_amount").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NewFloatingPriceModel.ofUnitPrice(
                    NewFloatingPriceModel.NewFloatingUnitPrice.builder()
                        .cadence(NewFloatingPriceModel.NewFloatingUnitPrice.Cadence.ANNUAL)
                        .currency("currency")
                        .itemId("item_id")
                        .modelType(NewFloatingPriceModel.NewFloatingUnitPrice.ModelType.UNIT)
                        .name("Annual fee")
                        .unitConfig(UnitConfigModel.builder().unitAmount("unit_amount").build())
                        .build()
                )
            )
    }
}
