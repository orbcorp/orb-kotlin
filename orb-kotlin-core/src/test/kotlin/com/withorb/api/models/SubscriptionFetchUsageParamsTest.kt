// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.withorb.api.core.ContentTypes
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.MultipartFormValue
import com.withorb.api.models.*
import com.withorb.api.models.SubscriptionFetchUsageParams

class SubscriptionFetchUsageParamsTest {

    @Test
    fun createSubscriptionFetchUsageParams() {
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
    fun getQueryParams() {
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
      val expected = mutableMapOf<String, List<String>>()
      expected.put("billable_metric_id", listOf("billable_metric_id"))
      expected.put("first_dimension_key", listOf("first_dimension_key"))
      expected.put("first_dimension_value", listOf("first_dimension_value"))
      expected.put("granularity", listOf(SubscriptionFetchUsageParams.Granularity.DAY.toString()))
      expected.put("group_by", listOf("group_by"))
      expected.put("second_dimension_key", listOf("second_dimension_key"))
      expected.put("second_dimension_value", listOf("second_dimension_value"))
      expected.put("timeframe_end", listOf("2022-03-01T05:00:00Z"))
      expected.put("timeframe_start", listOf("2022-02-01T05:00:00Z"))
      expected.put("view_mode", listOf(SubscriptionFetchUsageParams.ViewMode.PERIODIC.toString()))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = SubscriptionFetchUsageParams.builder()
          .subscriptionId("subscription_id")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
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
