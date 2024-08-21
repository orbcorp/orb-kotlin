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
import com.withorb.api.models.SubscriptionFetchCostsParams

class SubscriptionFetchCostsParamsTest {

    @Test
    fun createSubscriptionFetchCostsParams() {
      SubscriptionFetchCostsParams.builder()
          .subscriptionId("subscription_id")
          .currency("currency")
          .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
          .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
          .viewMode(SubscriptionFetchCostsParams.ViewMode.PERIODIC)
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = SubscriptionFetchCostsParams.builder()
          .subscriptionId("subscription_id")
          .currency("currency")
          .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
          .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
          .viewMode(SubscriptionFetchCostsParams.ViewMode.PERIODIC)
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("currency", listOf("currency"))
      expected.put("timeframe_end", listOf("2022-03-01T05:00:00Z"))
      expected.put("timeframe_start", listOf("2022-02-01T05:00:00Z"))
      expected.put("view_mode", listOf(SubscriptionFetchCostsParams.ViewMode.PERIODIC.toString()))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = SubscriptionFetchCostsParams.builder()
          .subscriptionId("subscription_id")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
      val params = SubscriptionFetchCostsParams.builder()
          .subscriptionId("subscription_id")
          .build()
      assertThat(params).isNotNull
      // path param "subscriptionId"
      assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
