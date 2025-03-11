// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricListParams
import com.withorb.api.models.MetricUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class MetricServiceAsyncTest {

    @Test
    suspend fun create() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val metricServiceAsync = client.metrics()

      val billableMetric = metricServiceAsync.create(MetricCreateParams.builder()
          .description("Sum of bytes downloaded in fast mode")
          .itemId("item_id")
          .name("Bytes downloaded")
          .sql("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
          .metadata(MetricCreateParams.Metadata.builder()
              .putAdditionalProperty("foo", JsonValue.from("string"))
              .build())
          .build())

      billableMetric.validate()
    }

    @Test
    suspend fun update() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val metricServiceAsync = client.metrics()

      val billableMetric = metricServiceAsync.update(MetricUpdateParams.builder()
          .metricId("metric_id")
          .metadata(MetricUpdateParams.Metadata.builder()
              .putAdditionalProperty("foo", JsonValue.from("string"))
              .build())
          .build())

      billableMetric.validate()
    }

    @Test
    suspend fun list() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val metricServiceAsync = client.metrics()

      val page = metricServiceAsync.list()

      page.response().validate()
    }

    @Test
    suspend fun fetch() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val metricServiceAsync = client.metrics()

      val billableMetric = metricServiceAsync.fetch(MetricFetchParams.builder()
          .metricId("metric_id")
          .build())

      billableMetric.validate()
    }
}
