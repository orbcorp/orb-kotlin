// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MetricUpdateParamsTest {

    @Test
    fun createMetricUpdateParams() {
        MetricUpdateParams.builder()
            .metricId("metric_id")
            .metadata(MetricUpdateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            MetricUpdateParams.builder()
                .metricId("metric_id")
                .metadata(MetricUpdateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.metadata()).isEqualTo(MetricUpdateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = MetricUpdateParams.builder().metricId("metric_id").build()
        val body = params.getBody()
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
