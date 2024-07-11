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
            .subscriptionId("subscription_id")
            .billableMetricId("billable_metric_id")
            .cursor("cursor")
            .firstDimensionKey("first_dimension_key")
            .firstDimensionValue("first_dimension_value")
            .granularity(SubscriptionFetchUsageParams.Granularity.DAY)
            .groupBy("group_by")
            .limit(123L)
            .secondDimensionKey("second_dimension_key")
            .secondDimensionValue("second_dimension_value")
            .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
            .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
            .viewMode(SubscriptionFetchUsageParams.ViewMode.PERIODIC)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            SubscriptionFetchUsageParams.builder()
                .subscriptionId("subscription_id")
                .billableMetricId("billable_metric_id")
                .cursor("cursor")
                .firstDimensionKey("first_dimension_key")
                .firstDimensionValue("first_dimension_value")
                .granularity(SubscriptionFetchUsageParams.Granularity.DAY)
                .groupBy("group_by")
                .limit(123L)
                .secondDimensionKey("second_dimension_key")
                .secondDimensionValue("second_dimension_value")
                .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                .viewMode(SubscriptionFetchUsageParams.ViewMode.PERIODIC)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("billable_metric_id", listOf("billable_metric_id"))
        expected.put("cursor", listOf("cursor"))
        expected.put("first_dimension_key", listOf("first_dimension_key"))
        expected.put("first_dimension_value", listOf("first_dimension_value"))
        expected.put("granularity", listOf(SubscriptionFetchUsageParams.Granularity.DAY.toString()))
        expected.put("group_by", listOf("group_by"))
        expected.put("limit", listOf("123"))
        expected.put("second_dimension_key", listOf("second_dimension_key"))
        expected.put("second_dimension_value", listOf("second_dimension_value"))
        expected.put("timeframe_end", listOf("2022-03-01T05:00:00Z"))
        expected.put("timeframe_start", listOf("2022-02-01T05:00:00Z"))
        expected.put("view_mode", listOf(SubscriptionFetchUsageParams.ViewMode.PERIODIC.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            SubscriptionFetchUsageParams.builder().subscriptionId("subscription_id").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            SubscriptionFetchUsageParams.builder().subscriptionId("subscription_id").build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
