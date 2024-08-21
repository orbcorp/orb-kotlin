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
import com.withorb.api.models.CouponListParams

class CouponListParamsTest {

    @Test
    fun createCouponListParams() {
      CouponListParams.builder()
          .cursor("cursor")
          .limit(123L)
          .redemptionCode("redemption_code")
          .showArchived(true)
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = CouponListParams.builder()
          .cursor("cursor")
          .limit(123L)
          .redemptionCode("redemption_code")
          .showArchived(true)
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("cursor", listOf("cursor"))
      expected.put("limit", listOf("123"))
      expected.put("redemption_code", listOf("redemption_code"))
      expected.put("show_archived", listOf("true"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = CouponListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
