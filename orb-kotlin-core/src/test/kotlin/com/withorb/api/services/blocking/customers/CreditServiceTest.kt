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
import com.withorb.api.services.blocking.customers.CreditService
import com.withorb.api.models.CustomerCreditListPage
import com.withorb.api.models.CustomerCreditListParams
import com.withorb.api.models.CustomerCreditListByExternalIdPage
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class CreditServiceTest {

    @Test
    fun callList() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val creditService = client.customers().credits()
      val customerCreditBalances = creditService.list(CustomerCreditListParams.builder()
          .customerId("customer_id")
          .build())
      println(customerCreditBalances)
      customerCreditBalances.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callListByExternalId() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val creditService = client.customers().credits()
      val customerCreditBalances = creditService.listByExternalId(CustomerCreditListByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .build())
      println(customerCreditBalances)
      customerCreditBalances.data().forEach {
          it.validate()
      }
    }
}
