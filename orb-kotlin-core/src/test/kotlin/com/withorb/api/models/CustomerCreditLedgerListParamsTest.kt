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
import com.withorb.api.models.CustomerCreditLedgerListParams

class CustomerCreditLedgerListParamsTest {

    @Test
    fun createCustomerCreditLedgerListParams() {
      CustomerCreditLedgerListParams.builder()
          .customerId("customer_id")
          .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .currency("currency")
          .cursor("cursor")
          .entryStatus(CustomerCreditLedgerListParams.EntryStatus.COMMITTED)
          .entryType(CustomerCreditLedgerListParams.EntryType.INCREMENT)
          .limit(123L)
          .minimumAmount("minimum_amount")
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = CustomerCreditLedgerListParams.builder()
          .customerId("customer_id")
          .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .currency("currency")
          .cursor("cursor")
          .entryStatus(CustomerCreditLedgerListParams.EntryStatus.COMMITTED)
          .entryType(CustomerCreditLedgerListParams.EntryType.INCREMENT)
          .limit(123L)
          .minimumAmount("minimum_amount")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("created_at[gt]", listOf("2019-12-27T18:11:19.117Z"))
      expected.put("created_at[gte]", listOf("2019-12-27T18:11:19.117Z"))
      expected.put("created_at[lt]", listOf("2019-12-27T18:11:19.117Z"))
      expected.put("created_at[lte]", listOf("2019-12-27T18:11:19.117Z"))
      expected.put("currency", listOf("currency"))
      expected.put("cursor", listOf("cursor"))
      expected.put("entry_status", listOf(CustomerCreditLedgerListParams.EntryStatus.COMMITTED.toString()))
      expected.put("entry_type", listOf(CustomerCreditLedgerListParams.EntryType.INCREMENT.toString()))
      expected.put("limit", listOf("123"))
      expected.put("minimum_amount", listOf("minimum_amount"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = CustomerCreditLedgerListParams.builder()
          .customerId("customer_id")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
      val params = CustomerCreditLedgerListParams.builder()
          .customerId("customer_id")
          .build()
      assertThat(params).isNotNull
      // path param "customerId"
      assertThat(params.getPathParam(0)).isEqualTo("customer_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
