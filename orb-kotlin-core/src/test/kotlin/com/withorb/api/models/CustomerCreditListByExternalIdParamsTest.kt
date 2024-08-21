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
import com.withorb.api.models.CustomerCreditListByExternalIdParams

class CustomerCreditListByExternalIdParamsTest {

    @Test
    fun createCustomerCreditListByExternalIdParams() {
      CustomerCreditListByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .currency("currency")
          .cursor("cursor")
          .includeAllBlocks(true)
          .limit(123L)
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = CustomerCreditListByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .currency("currency")
          .cursor("cursor")
          .includeAllBlocks(true)
          .limit(123L)
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("currency", listOf("currency"))
      expected.put("cursor", listOf("cursor"))
      expected.put("include_all_blocks", listOf("true"))
      expected.put("limit", listOf("123"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = CustomerCreditListByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
      val params = CustomerCreditListByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .build()
      assertThat(params).isNotNull
      // path param "externalCustomerId"
      assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
