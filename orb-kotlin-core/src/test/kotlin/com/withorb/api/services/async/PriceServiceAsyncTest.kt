// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.PriceCreateParams
import com.withorb.api.models.PriceEvaluateParams
import com.withorb.api.models.PriceFetchParams
import com.withorb.api.models.PriceListParams
import com.withorb.api.models.PriceUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PriceServiceAsyncTest {

    @Test
    suspend fun create() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val priceServiceAsync = client.prices()

      val price = priceServiceAsync.create(PriceCreateParams.builder()
          .body(PriceCreateParams.Body.NewFloatingUnitPrice.builder()
              .cadence(PriceCreateParams.Body.NewFloatingUnitPrice.Cadence.ANNUAL)
              .currency("currency")
              .itemId("item_id")
              .modelType(PriceCreateParams.Body.NewFloatingUnitPrice.ModelType.UNIT)
              .name("Annual fee")
              .unitConfig(PriceCreateParams.Body.NewFloatingUnitPrice.UnitConfig.builder()
                  .unitAmount("unit_amount")
                  .build())
              .billableMetricId("billable_metric_id")
              .billedInAdvance(true)
              .billingCycleConfiguration(PriceCreateParams.Body.NewFloatingUnitPrice.BillingCycleConfiguration.builder()
                  .duration(0L)
                  .durationUnit(PriceCreateParams.Body.NewFloatingUnitPrice.BillingCycleConfiguration.DurationUnit.DAY)
                  .build())
              .conversionRate(0.0)
              .externalPriceId("external_price_id")
              .fixedPriceQuantity(0.0)
              .invoiceGroupingKey("invoice_grouping_key")
              .invoicingCycleConfiguration(PriceCreateParams.Body.NewFloatingUnitPrice.InvoicingCycleConfiguration.builder()
                  .duration(0L)
                  .durationUnit(PriceCreateParams.Body.NewFloatingUnitPrice.InvoicingCycleConfiguration.DurationUnit.DAY)
                  .build())
              .metadata(PriceCreateParams.Body.NewFloatingUnitPrice.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .build())
          .build())

      price.validate()
    }

    @Test
    suspend fun update() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val priceServiceAsync = client.prices()

      val price = priceServiceAsync.update(PriceUpdateParams.builder()
          .priceId("price_id")
          .metadata(PriceUpdateParams.Metadata.builder()
              .putAdditionalProperty("foo", JsonValue.from("string"))
              .build())
          .build())

      price.validate()
    }

    @Test
    suspend fun list() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val priceServiceAsync = client.prices()

      val page = priceServiceAsync.list()

      page.response().validate()
    }

    @Test
    suspend fun evaluate() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val priceServiceAsync = client.prices()

      val response = priceServiceAsync.evaluate(PriceEvaluateParams.builder()
          .priceId("price_id")
          .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .customerId("customer_id")
          .externalCustomerId("external_customer_id")
          .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
          .addGroupingKey("case when my_event_type = 'foo' then true else false end")
          .build())

      response.validate()
    }

    @Test
    suspend fun fetch() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val priceServiceAsync = client.prices()

      val price = priceServiceAsync.fetch(PriceFetchParams.builder()
          .priceId("price_id")
          .build())

      price.validate()
    }
}
