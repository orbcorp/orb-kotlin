// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PriceEvaluateMultipleParamsTest {

    @Test
    fun create() {
        PriceEvaluateMultipleParams.builder()
            .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .customerId("customer_id")
            .externalCustomerId("external_customer_id")
            .addPriceEvaluation(
                PriceEvaluateMultipleParams.PriceEvaluation.builder()
                    .externalPriceId("external_price_id")
                    .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .addGroupingKey("case when my_event_type = 'foo' then true else false end")
                    .price(
                        NewFloatingUnitPrice.builder()
                            .cadence(NewFloatingUnitPrice.Cadence.ANNUAL)
                            .currency("currency")
                            .itemId("item_id")
                            .modelType(NewFloatingUnitPrice.ModelType.UNIT)
                            .name("Annual fee")
                            .unitConfig(
                                UnitConfig.builder()
                                    .unitAmount("unit_amount")
                                    .scalingFactor(0.0)
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
                            .dimensionalPriceConfiguration(
                                NewDimensionalPriceConfiguration.builder()
                                    .addDimensionValue("string")
                                    .dimensionalPriceGroupId("dimensional_price_group_id")
                                    .externalDimensionalPriceGroupId(
                                        "external_dimensional_price_group_id"
                                    )
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
                                NewFloatingUnitPrice.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .priceId("price_id")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PriceEvaluateMultipleParams.builder()
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .externalCustomerId("external_customer_id")
                .addPriceEvaluation(
                    PriceEvaluateMultipleParams.PriceEvaluation.builder()
                        .externalPriceId("external_price_id")
                        .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
                        .addGroupingKey("case when my_event_type = 'foo' then true else false end")
                        .price(
                            NewFloatingUnitPrice.builder()
                                .cadence(NewFloatingUnitPrice.Cadence.ANNUAL)
                                .currency("currency")
                                .itemId("item_id")
                                .modelType(NewFloatingUnitPrice.ModelType.UNIT)
                                .name("Annual fee")
                                .unitConfig(
                                    UnitConfig.builder()
                                        .unitAmount("unit_amount")
                                        .scalingFactor(0.0)
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
                                    ConversionRateUnitConfig.builder()
                                        .unitAmount("unit_amount")
                                        .build()
                                )
                                .dimensionalPriceConfiguration(
                                    NewDimensionalPriceConfiguration.builder()
                                        .addDimensionValue("string")
                                        .dimensionalPriceGroupId("dimensional_price_group_id")
                                        .externalDimensionalPriceGroupId(
                                            "external_dimensional_price_group_id"
                                        )
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
                                    NewFloatingUnitPrice.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .priceId("price_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.customerId()).isEqualTo("customer_id")
        assertThat(body.externalCustomerId()).isEqualTo("external_customer_id")
        assertThat(body.priceEvaluations())
            .containsExactly(
                PriceEvaluateMultipleParams.PriceEvaluation.builder()
                    .externalPriceId("external_price_id")
                    .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .addGroupingKey("case when my_event_type = 'foo' then true else false end")
                    .price(
                        NewFloatingUnitPrice.builder()
                            .cadence(NewFloatingUnitPrice.Cadence.ANNUAL)
                            .currency("currency")
                            .itemId("item_id")
                            .modelType(NewFloatingUnitPrice.ModelType.UNIT)
                            .name("Annual fee")
                            .unitConfig(
                                UnitConfig.builder()
                                    .unitAmount("unit_amount")
                                    .scalingFactor(0.0)
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
                            .dimensionalPriceConfiguration(
                                NewDimensionalPriceConfiguration.builder()
                                    .addDimensionValue("string")
                                    .dimensionalPriceGroupId("dimensional_price_group_id")
                                    .externalDimensionalPriceGroupId(
                                        "external_dimensional_price_group_id"
                                    )
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
                                NewFloatingUnitPrice.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .priceId("price_id")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PriceEvaluateMultipleParams.builder()
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
