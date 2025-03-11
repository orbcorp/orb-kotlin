// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCostListParamsTest {

    @Test
    fun create() {
      CustomerCostListParams.builder()
          .customerId("customer_id")
          .currency("currency")
          .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
          .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
          .viewMode(CustomerCostListParams.ViewMode.PERIODIC)
          .build()
    }

    @Test
    fun queryParams() {
      val params = CustomerCostListParams.builder()
          .customerId("customer_id")
          .currency("currency")
          .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
          .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
          .viewMode(CustomerCostListParams.ViewMode.PERIODIC)
          .build()
      val expected = QueryParams.builder()
      expected.put("currency", "currency")
      expected.put("timeframe_end", "2022-03-01T05:00:00Z")
      expected.put("timeframe_start", "2022-02-01T05:00:00Z")
      expected.put("view_mode", CustomerCostListParams.ViewMode.PERIODIC.toString())
      assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = CustomerCostListParams.builder()
          .customerId("customer_id")
          .build()
      val expected = QueryParams.builder()
      assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
      val params = CustomerCostListParams.builder()
          .customerId("customer_id")
          .build()
      assertThat(params).isNotNull
      // path param "customerId"
      assertThat(params.getPathParam(0)).isEqualTo("customer_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
