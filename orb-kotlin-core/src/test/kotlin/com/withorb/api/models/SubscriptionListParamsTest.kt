// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionListParamsTest {

    @Test
    fun create() {
      SubscriptionListParams.builder()
          .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .cursor("cursor")
          .addCustomerId("string")
          .externalCustomerId("external_customer_id")
          .limit(1L)
          .status(SubscriptionListParams.Status.ACTIVE)
          .build()
    }

    @Test
    fun queryParams() {
      val params = SubscriptionListParams.builder()
          .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .cursor("cursor")
          .addCustomerId("string")
          .externalCustomerId("external_customer_id")
          .limit(1L)
          .status(SubscriptionListParams.Status.ACTIVE)
          .build()
      val expected = QueryParams.builder()
      expected.put("created_at[gt]", "2019-12-27T18:11:19.117Z")
      expected.put("created_at[gte]", "2019-12-27T18:11:19.117Z")
      expected.put("created_at[lt]", "2019-12-27T18:11:19.117Z")
      expected.put("created_at[lte]", "2019-12-27T18:11:19.117Z")
      expected.put("cursor", "cursor")
      expected.put("customer_id[]", "string")
      expected.put("external_customer_id", "external_customer_id")
      expected.put("limit", "1")
      expected.put("status", SubscriptionListParams.Status.ACTIVE.toString())
      assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = SubscriptionListParams.builder().build()
      val expected = QueryParams.builder()
      assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
