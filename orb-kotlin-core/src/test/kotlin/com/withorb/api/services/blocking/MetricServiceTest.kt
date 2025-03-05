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
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val metricService = client.metrics()

        val billableMetricModel =
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

        billableMetricModel.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val metricService = client.metrics()

        val billableMetricModel =
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

        billableMetricModel.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val metricService = client.metrics()

        val page = metricService.list()

        page.response().validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val metricService = client.metrics()

        val billableMetricModel =
            metricService.fetch(MetricFetchParams.builder().metricId("metric_id").build())

        billableMetricModel.validate()
    }
}
