// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricUpdateParamsTest {

    @Test
    fun create() {
        MetricUpdateParams.builder()
            .metricId("metric_id")
            .description("Sum of bytes downloaded in fast mode")
            .metadata(
                MetricUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("Bytes downloaded")
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
                .description("Sum of bytes downloaded in fast mode")
                .metadata(
                    MetricUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("Bytes downloaded")
                .build()

        val body = params._body()

        assertThat(body.description()).isEqualTo("Sum of bytes downloaded in fast mode")
        assertThat(body.metadata())
            .isEqualTo(
                MetricUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).isEqualTo("Bytes downloaded")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MetricUpdateParams.builder().metricId("metric_id").build()

        val body = params._body()
    }
}
