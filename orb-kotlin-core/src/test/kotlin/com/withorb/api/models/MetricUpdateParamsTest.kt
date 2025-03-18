// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricUpdateParamsTest {

    @Test
    fun create() {
        MetricUpdateParams.builder()
            .metricId("metric_id")
            .metadata(
                MetricUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = MetricUpdateParams.builder().metricId("metric_id").build()

        assertThat(params._pathParam(0)).isEqualTo("metric_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MetricUpdateParams.builder()
                .metricId("metric_id")
                .metadata(
                    MetricUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.metadata())
            .isEqualTo(
                MetricUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MetricUpdateParams.builder().metricId("metric_id").build()

        val body = params._body()

        assertNotNull(body)
    }
}
