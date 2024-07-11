// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.*
import com.withorb.api.models.MetricListParams
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
        val metricCreateResponse =
            metricService.create(
                MetricCreateParams.builder()
                    .description("Sum of bytes downloaded in fast mode")
                    .itemId("item_id")
                    .name("Bytes downloaded")
                    .sql("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = \'fast\'")
                    .metadata(MetricCreateParams.Metadata.builder().build())
                    .build()
            )
        println(metricCreateResponse)
        metricCreateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val metricService = client.metrics()
        val billableMetrics = metricService.list(MetricListParams.builder().build())
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
        val metricFetchResponse =
            metricService.fetch(MetricFetchParams.builder().metricId("metric_id").build())
        println(metricFetchResponse)
        metricFetchResponse.validate()
    }
}
