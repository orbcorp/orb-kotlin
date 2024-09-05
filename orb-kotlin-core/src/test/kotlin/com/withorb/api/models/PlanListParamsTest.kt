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
import com.withorb.api.models.PlanListParams

class PlanListParamsTest {

    @Test
    fun createPlanListParams() {
      PlanListParams.builder()
          .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .cursor("cursor")
          .limit(123L)
          .status(PlanListParams.Status.ACTIVE)
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = PlanListParams.builder()
          .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .cursor("cursor")
          .limit(123L)
          .status(PlanListParams.Status.ACTIVE)
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("created_at[gt]", listOf("2019-12-27T18:11:19.117Z"))
      expected.put("created_at[gte]", listOf("2019-12-27T18:11:19.117Z"))
      expected.put("created_at[lt]", listOf("2019-12-27T18:11:19.117Z"))
      expected.put("created_at[lte]", listOf("2019-12-27T18:11:19.117Z"))
      expected.put("cursor", listOf("cursor"))
      expected.put("limit", listOf("123"))
      expected.put("status", listOf(PlanListParams.Status.ACTIVE.toString()))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = PlanListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
