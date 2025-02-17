// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MetricUpdateParamsTest {

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

        assertThat(body).isNotNull
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

        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = MetricUpdateParams.builder().metricId("metric_id").build()
        assertThat(params).isNotNull
        // path param "metricId"
        assertThat(params.getPathParam(0)).isEqualTo("metric_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
