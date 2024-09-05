// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers.credits

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
import com.withorb.api.services.blocking.customers.credits.TopUpService
import com.withorb.api.models.CustomerCreditTopUpListPage
import com.withorb.api.models.CustomerCreditTopUpListParams
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdPage
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdParams
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class TopUpServiceTest {

    @Test
    fun callCreate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val topUpService = client.customers().credits().topUps()
      val customerCreditTopUpCreateResponse = topUpService.create(CustomerCreditTopUpCreateParams.builder()
          .customerId("customer_id")
          .amount("amount")
          .currency("currency")
          .invoiceSettings(CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
              .autoCollection(true)
              .netTerms(123L)
              .memo("memo")
              .requireSuccessfulPayment(true)
              .build())
          .perUnitCostBasis("per_unit_cost_basis")
          .threshold("threshold")
          .expiresAfter(123L)
          .expiresAfterUnit(CustomerCreditTopUpCreateParams.ExpiresAfterUnit.DAY)
          .build())
      println(customerCreditTopUpCreateResponse)
      customerCreditTopUpCreateResponse.validate()
    }

    @Test
    fun callList() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val topUpService = client.customers().credits().topUps()
      val topUps = topUpService.list(CustomerCreditTopUpListParams.builder()
          .customerId("customer_id")
          .build())
      println(topUps)
      topUps.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callDelete() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val topUpService = client.customers().credits().topUps()
      topUpService.delete(CustomerCreditTopUpDeleteParams.builder()
          .customerId("customer_id")
          .topUpId("top_up_id")
          .build())
    }

    @Test
    fun callCreateByExternalId() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val topUpService = client.customers().credits().topUps()
      val customerCreditTopUpCreateByExternalIdResponse = topUpService.createByExternalId(CustomerCreditTopUpCreateByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .amount("amount")
          .currency("currency")
          .invoiceSettings(CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
              .autoCollection(true)
              .netTerms(123L)
              .memo("memo")
              .requireSuccessfulPayment(true)
              .build())
          .perUnitCostBasis("per_unit_cost_basis")
          .threshold("threshold")
          .expiresAfter(123L)
          .expiresAfterUnit(CustomerCreditTopUpCreateByExternalIdParams.ExpiresAfterUnit.DAY)
          .build())
      println(customerCreditTopUpCreateByExternalIdResponse)
      customerCreditTopUpCreateByExternalIdResponse.validate()
    }

    @Test
    fun callDeleteByExternalId() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val topUpService = client.customers().credits().topUps()
      topUpService.deleteByExternalId(CustomerCreditTopUpDeleteByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .topUpId("top_up_id")
          .build())
    }

    @Test
    fun callListByExternalId() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val topUpService = client.customers().credits().topUps()
      val topUps = topUpService.listByExternalId(CustomerCreditTopUpListByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .build())
      println(topUps)
      topUps.data().forEach {
          it.validate()
      }
    }
}
