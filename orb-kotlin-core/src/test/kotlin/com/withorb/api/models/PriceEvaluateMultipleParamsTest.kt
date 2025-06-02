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
            .addEvent(
                PriceEvaluateMultipleParams.Event.builder()
                    .eventName("event_name")
                    .properties(
                        PriceEvaluateMultipleParams.Event.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                    .customerId("customer_id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
            .externalCustomerId("external_customer_id")
            .addPriceEvaluation(
                PriceEvaluateMultipleParams.PriceEvaluation.builder()
                    .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .addGroupingKey("case when my_event_type = 'foo' then true else false end")
                    .price(
                        PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit.builder()
                            .cadence(
                                PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit.Cadence
                                    .ANNUAL
                            )
                            .currency("currency")
                            .itemId("item_id")
                            .name("Annual fee")
                            .unitConfig(
                                PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit.UnitConfig
                                    .builder()
                                    .unitAmount("unit_amount")
                                    .build()
                            )
                            .billableMetricId("billable_metric_id")
                            .billedInAdvance(true)
                            .billingCycleConfiguration(
                                PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                    .BillingCycleConfiguration
                                    .builder()
                                    .duration(0L)
                                    .durationUnit(
                                        PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                            .BillingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .conversionRate(0.0)
                            .dimensionalPriceConfiguration(
                                PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                    .DimensionalPriceConfiguration
                                    .builder()
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
                                PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                    .InvoicingCycleConfiguration
                                    .builder()
                                    .duration(0L)
                                    .durationUnit(
                                        PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                            .InvoicingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .metadata(
                                PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit.Metadata
                                    .builder()
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
                .addEvent(
                    PriceEvaluateMultipleParams.Event.builder()
                        .eventName("event_name")
                        .properties(
                            PriceEvaluateMultipleParams.Event.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .customerId("customer_id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .externalCustomerId("external_customer_id")
                .addPriceEvaluation(
                    PriceEvaluateMultipleParams.PriceEvaluation.builder()
                        .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
                        .addGroupingKey("case when my_event_type = 'foo' then true else false end")
                        .price(
                            PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit.builder()
                                .cadence(
                                    PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit.Cadence
                                        .ANNUAL
                                )
                                .currency("currency")
                                .itemId("item_id")
                                .name("Annual fee")
                                .unitConfig(
                                    PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                        .UnitConfig
                                        .builder()
                                        .unitAmount("unit_amount")
                                        .build()
                                )
                                .billableMetricId("billable_metric_id")
                                .billedInAdvance(true)
                                .billingCycleConfiguration(
                                    PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                        .BillingCycleConfiguration
                                        .builder()
                                        .duration(0L)
                                        .durationUnit(
                                            PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                                .BillingCycleConfiguration
                                                .DurationUnit
                                                .DAY
                                        )
                                        .build()
                                )
                                .conversionRate(0.0)
                                .dimensionalPriceConfiguration(
                                    PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                        .DimensionalPriceConfiguration
                                        .builder()
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
                                    PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                        .InvoicingCycleConfiguration
                                        .builder()
                                        .duration(0L)
                                        .durationUnit(
                                            PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                                .InvoicingCycleConfiguration
                                                .DurationUnit
                                                .DAY
                                        )
                                        .build()
                                )
                                .metadata(
                                    PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit.Metadata
                                        .builder()
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
        assertThat(body.events())
            .containsExactly(
                PriceEvaluateMultipleParams.Event.builder()
                    .eventName("event_name")
                    .properties(
                        PriceEvaluateMultipleParams.Event.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                    .customerId("customer_id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
        assertThat(body.externalCustomerId()).isEqualTo("external_customer_id")
        assertThat(body.priceEvaluations())
            .containsExactly(
                PriceEvaluateMultipleParams.PriceEvaluation.builder()
                    .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .addGroupingKey("case when my_event_type = 'foo' then true else false end")
                    .price(
                        PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit.builder()
                            .cadence(
                                PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit.Cadence
                                    .ANNUAL
                            )
                            .currency("currency")
                            .itemId("item_id")
                            .name("Annual fee")
                            .unitConfig(
                                PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit.UnitConfig
                                    .builder()
                                    .unitAmount("unit_amount")
                                    .build()
                            )
                            .billableMetricId("billable_metric_id")
                            .billedInAdvance(true)
                            .billingCycleConfiguration(
                                PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                    .BillingCycleConfiguration
                                    .builder()
                                    .duration(0L)
                                    .durationUnit(
                                        PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                            .BillingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .conversionRate(0.0)
                            .dimensionalPriceConfiguration(
                                PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                    .DimensionalPriceConfiguration
                                    .builder()
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
                                PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                    .InvoicingCycleConfiguration
                                    .builder()
                                    .duration(0L)
                                    .durationUnit(
                                        PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                            .InvoicingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .metadata(
                                PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit.Metadata
                                    .builder()
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
