// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.PriceCreateParams
import com.withorb.api.models.PriceEvaluateMultipleParams
import com.withorb.api.models.PriceEvaluateParams
import com.withorb.api.models.PriceUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PriceServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceService = client.prices()

        val price =
            priceService.create(
                PriceCreateParams.builder()
                    .body(
                        PriceCreateParams.Body.Unit.builder()
                            .cadence(PriceCreateParams.Body.Unit.Cadence.ANNUAL)
                            .currency("currency")
                            .itemId("item_id")
                            .name("Annual fee")
                            .unitConfig(
                                PriceCreateParams.Body.Unit.UnitConfig.builder()
                                    .unitAmount("unit_amount")
                                    .build()
                            )
                            .billableMetricId("billable_metric_id")
                            .billedInAdvance(true)
                            .billingCycleConfiguration(
                                PriceCreateParams.Body.Unit.BillingCycleConfiguration.builder()
                                    .duration(0L)
                                    .durationUnit(
                                        PriceCreateParams.Body.Unit.BillingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .conversionRate(0.0)
                            .dimensionalPriceConfiguration(
                                PriceCreateParams.Body.Unit.DimensionalPriceConfiguration.builder()
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
                                PriceCreateParams.Body.Unit.InvoicingCycleConfiguration.builder()
                                    .duration(0L)
                                    .durationUnit(
                                        PriceCreateParams.Body.Unit.InvoicingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .metadata(
                                PriceCreateParams.Body.Unit.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        price.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceService = client.prices()

        val price =
            priceService.update(
                PriceUpdateParams.builder()
                    .priceId("price_id")
                    .metadata(
                        PriceUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        price.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceService = client.prices()

        val page = priceService.list()

        page.response().validate()
    }

    @Test
    fun evaluate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceService = client.prices()

        val response =
            priceService.evaluate(
                PriceEvaluateParams.builder()
                    .priceId("price_id")
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .externalCustomerId("external_customer_id")
                    .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .addGroupingKey("case when my_event_type = 'foo' then true else false end")
                    .build()
            )

        response.validate()
    }

    @Test
    fun evaluateMultiple() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceService = client.prices()

        val response =
            priceService.evaluateMultiple(
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
                            .addGroupingKey(
                                "case when my_event_type = 'foo' then true else false end"
                            )
                            .price(
                                PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit.builder()
                                    .cadence(
                                        PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                            .Cadence
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
                                                PriceEvaluateMultipleParams.PriceEvaluation.Price
                                                    .Unit
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
                                                PriceEvaluateMultipleParams.PriceEvaluation.Price
                                                    .Unit
                                                    .InvoicingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        PriceEvaluateMultipleParams.PriceEvaluation.Price.Unit
                                            .Metadata
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
            )

        response.validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceService = client.prices()

        val price = priceService.fetch("price_id")

        price.validate()
    }
}
