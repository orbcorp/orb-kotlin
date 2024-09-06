// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.*
import com.withorb.api.models.PriceListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PriceServiceTest {

    @Test
    fun callCreate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceService = client.prices()
        val price =
            priceService.create(
                PriceCreateParams.builder()
                    .forNewFloatingUnitPrice(
                        PriceCreateParams.NewFloatingUnitPrice.builder()
                            .cadence(PriceCreateParams.NewFloatingUnitPrice.Cadence.ANNUAL)
                            .currency("currency")
                            .itemId("item_id")
                            .modelType(PriceCreateParams.NewFloatingUnitPrice.ModelType.UNIT)
                            .name("Annual fee")
                            .unitConfig(
                                PriceCreateParams.NewFloatingUnitPrice.UnitConfig.builder()
                                    .unitAmount("unit_amount")
                                    .build()
                            )
                            .billableMetricId("billable_metric_id")
                            .billedInAdvance(true)
                            .billingCycleConfiguration(
                                PriceCreateParams.NewFloatingUnitPrice.BillingCycleConfiguration
                                    .builder()
                                    .duration(123L)
                                    .durationUnit(
                                        PriceCreateParams.NewFloatingUnitPrice
                                            .BillingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .conversionRate(42.23)
                            .externalPriceId("external_price_id")
                            .fixedPriceQuantity(42.23)
                            .invoiceGroupingKey("invoice_grouping_key")
                            .invoicingCycleConfiguration(
                                PriceCreateParams.NewFloatingUnitPrice.InvoicingCycleConfiguration
                                    .builder()
                                    .duration(123L)
                                    .durationUnit(
                                        PriceCreateParams.NewFloatingUnitPrice
                                            .InvoicingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .metadata(
                                PriceCreateParams.NewFloatingUnitPrice.Metadata.builder().build()
                            )
                            .build()
                    )
                    .build()
            )
        println(price)
    }

    @Test
    fun callUpdate() {
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
                    .metadata(PriceUpdateParams.Metadata.builder().build())
                    .build()
            )
        println(price)
    }

    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceService = client.prices()
        val prices = priceService.list(PriceListParams.builder().build())
        println(prices)
        prices.data().forEach { it.validate() }
    }

    @Test
    fun callEvaluate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceService = client.prices()
        val priceEvaluateResponse =
            priceService.evaluate(
                PriceEvaluateParams.builder()
                    .priceId("price_id")
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .externalCustomerId("external_customer_id")
                    .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .groupingKeys(listOf("string"))
                    .build()
            )
        println(priceEvaluateResponse)
        priceEvaluateResponse.validate()
    }

    @Test
    fun callFetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceService = client.prices()
        val price = priceService.fetch(PriceFetchParams.builder().priceId("price_id").build())
        println(price)
    }
}
