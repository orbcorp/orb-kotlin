// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionFetchUsageParamsTest {

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
      val params = SubscriptionFetchUsageParams.builder()
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
      val expected = QueryParams.builder()
      expected.put("billable_metric_id", "billable_metric_id")
      expected.put("first_dimension_key", "first_dimension_key")
      expected.put("first_dimension_value", "first_dimension_value")
      expected.put("granularity", SubscriptionFetchUsageParams.Granularity.DAY.toString())
      expected.put("group_by", "group_by")
      expected.put("second_dimension_key", "second_dimension_key")
      expected.put("second_dimension_value", "second_dimension_value")
      expected.put("timeframe_end", "2022-03-01T05:00:00Z")
      expected.put("timeframe_start", "2022-02-01T05:00:00Z")
      expected.put("view_mode", SubscriptionFetchUsageParams.ViewMode.PERIODIC.toString())
      assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = SubscriptionFetchUsageParams.builder()
          .subscriptionId("subscription_id")
          .build()
      val expected = QueryParams.builder()
      assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
      val params = SubscriptionFetchUsageParams.builder()
          .subscriptionId("subscription_id")
          .build()
      assertThat(params).isNotNull
      // path param "subscriptionId"
      assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
