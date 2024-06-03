// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionFetchUsageParamsTest {

    @Test
    fun createSubscriptionFetchUsageParams() {
        SubscriptionFetchUsageParams.builder()
            .subscriptionId("string")
            .billableMetricId("string")
            .cursor("string")
            .firstDimensionKey("string")
            .firstDimensionValue("string")
            .granularity(SubscriptionFetchUsageParams.Granularity.DAY)
            .groupBy("string")
            .limit(123L)
            .secondDimensionKey("string")
            .secondDimensionValue("string")
            .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
            .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
            .viewMode(SubscriptionFetchUsageParams.ViewMode.PERIODIC)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            SubscriptionFetchUsageParams.builder()
                .subscriptionId("string")
                .billableMetricId("string")
                .cursor("string")
                .firstDimensionKey("string")
                .firstDimensionValue("string")
                .granularity(SubscriptionFetchUsageParams.Granularity.DAY)
                .groupBy("string")
                .limit(123L)
                .secondDimensionKey("string")
                .secondDimensionValue("string")
                .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                .viewMode(SubscriptionFetchUsageParams.ViewMode.PERIODIC)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("billable_metric_id", listOf("string"))
        expected.put("cursor", listOf("string"))
        expected.put("first_dimension_key", listOf("string"))
        expected.put("first_dimension_value", listOf("string"))
        expected.put("granularity", listOf(SubscriptionFetchUsageParams.Granularity.DAY.toString()))
        expected.put("group_by", listOf("string"))
        expected.put("limit", listOf("123"))
        expected.put("second_dimension_key", listOf("string"))
        expected.put("second_dimension_value", listOf("string"))
        expected.put("timeframe_end", listOf("2022-03-01T05:00:00Z"))
        expected.put("timeframe_start", listOf("2022-02-01T05:00:00Z"))
        expected.put("view_mode", listOf(SubscriptionFetchUsageParams.ViewMode.PERIODIC.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = SubscriptionFetchUsageParams.builder().subscriptionId("string").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = SubscriptionFetchUsageParams.builder().subscriptionId("string").build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
