// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MetricFetchParamsTest {

    @Test
    fun createMetricFetchParams() {
        MetricFetchParams.builder().metricId("metric_id").build()
    }

    @Test
    fun getPathParam() {
        val params = MetricFetchParams.builder().metricId("metric_id").build()
        assertThat(params).isNotNull
        // path param "metricId"
        assertThat(params.getPathParam(0)).isEqualTo("metric_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
