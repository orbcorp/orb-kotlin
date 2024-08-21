// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.withorb.api.TestServerExtension
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.services.blocking.customers.CostService
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class CostServiceTest {

    @Test
    fun callList() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val costService = client.customers().costs()
      val customerCostListResponse = costService.list(CustomerCostListParams.builder()
          .customerId("customer_id")
          .currency("currency")
          .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
          .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
          .viewMode(CustomerCostListParams.ViewMode.PERIODIC)
          .build())
      println(customerCostListResponse)
      customerCostListResponse.validate()
    }

    @Test
    fun callListByExternalId() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val costService = client.customers().costs()
      val customerCostListByExternalIdResponse = costService.listByExternalId(CustomerCostListByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .currency("currency")
          .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
          .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
          .viewMode(CustomerCostListByExternalIdParams.ViewMode.PERIODIC)
          .build())
      println(customerCostListByExternalIdResponse)
      customerCostListByExternalIdResponse.validate()
    }
}
