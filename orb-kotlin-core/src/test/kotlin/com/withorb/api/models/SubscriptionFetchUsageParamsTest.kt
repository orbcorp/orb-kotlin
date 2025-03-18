// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionFetchUsageParamsTest {

    @Test
    fun create() {
        SubscriptionFetchUsageParams.builder()
            .subscriptionId("subscription_id")
            .billableMetricId("billable_metric_id")
            .firstDimensionKey("first_dimension_key")
            .firstDimensionValue("first_dimension_value")
            .granularity(SubscriptionFetchUsageParams.Granularity.DAY)
            .groupBy("group_by")
            .secondDimensionKey("second_dimension_key")
            .secondDimensionValue("second_dimension_value")
            .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
            .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
            .viewMode(SubscriptionFetchUsageParams.ViewMode.PERIODIC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SubscriptionFetchUsageParams.builder()
                .subscriptionId("subscription_id")
                .billableMetricId("billable_metric_id")
                .firstDimensionKey("first_dimension_key")
                .firstDimensionValue("first_dimension_value")
                .granularity(SubscriptionFetchUsageParams.Granularity.DAY)
                .groupBy("group_by")
                .secondDimensionKey("second_dimension_key")
                .secondDimensionValue("second_dimension_value")
                .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                .viewMode(SubscriptionFetchUsageParams.ViewMode.PERIODIC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("billable_metric_id", "billable_metric_id")
                    .put("first_dimension_key", "first_dimension_key")
                    .put("first_dimension_value", "first_dimension_value")
                    .put("granularity", "day")
                    .put("group_by", "group_by")
                    .put("second_dimension_key", "second_dimension_key")
                    .put("second_dimension_value", "second_dimension_value")
                    .put("timeframe_end", "2022-03-01T05:00:00Z")
                    .put("timeframe_start", "2022-02-01T05:00:00Z")
                    .put("view_mode", "periodic")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SubscriptionFetchUsageParams.builder().subscriptionId("subscription_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
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
