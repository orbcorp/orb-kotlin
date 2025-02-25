// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class MetricServiceTest {

    @Test
    fun callCreate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val metricService = client.metrics()
        val billableMetric =
            metricService.create(
                MetricCreateParams.builder()
                    .description("Sum of bytes downloaded in fast mode")
                    .itemId("item_id")
                    .name("Bytes downloaded")
                    .sql("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
                    .metadata(
                        MetricCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        println(billableMetric)
        billableMetric.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val metricService = client.metrics()
        val billableMetric =
            metricService.update(
                MetricUpdateParams.builder()
                    .metricId("metric_id")
                    .metadata(
                        MetricUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        println(billableMetric)
        billableMetric.validate()
    }

    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val metricService = client.metrics()
        val billableMetrics = metricService.list()
        println(billableMetrics)
        billableMetrics.data().forEach { it.validate() }
    }

    @Test
    fun callFetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val metricService = client.metrics()
        val billableMetric =
            metricService.fetch(MetricFetchParams.builder().metricId("metric_id").build())
        println(billableMetric)
        billableMetric.validate()
    }
}
