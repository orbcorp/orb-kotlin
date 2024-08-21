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
import com.withorb.api.services.blocking.customers.BalanceTransactionService
import com.withorb.api.models.CustomerBalanceTransactionListPage
import com.withorb.api.models.CustomerBalanceTransactionListParams
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class BalanceTransactionServiceTest {

    @Test
    fun callCreate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val balanceTransactionService = client.customers().balanceTransactions()
      val customerBalanceTransactionCreateResponse = balanceTransactionService.create(CustomerBalanceTransactionCreateParams.builder()
          .customerId("customer_id")
          .amount("amount")
          .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
          .description("description")
          .build())
      println(customerBalanceTransactionCreateResponse)
      customerBalanceTransactionCreateResponse.validate()
    }

    @Test
    fun callList() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val balanceTransactionService = client.customers().balanceTransactions()
      val customerBalanceTransactions = balanceTransactionService.list(CustomerBalanceTransactionListParams.builder()
          .customerId("customer_id")
          .build())
      println(customerBalanceTransactions)
      customerBalanceTransactions.data().forEach {
          it.validate()
      }
    }
}
