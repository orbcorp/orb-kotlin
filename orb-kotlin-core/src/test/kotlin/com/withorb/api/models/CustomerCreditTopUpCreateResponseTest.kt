// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.models.CustomerCreditTopUpCreateResponse

class CustomerCreditTopUpCreateResponseTest {

    @Test
    fun createCustomerCreditTopUpCreateResponse() {
      val customerCreditTopUpCreateResponse = CustomerCreditTopUpCreateResponse.builder()
          .id("id")
          .amount("amount")
          .currency("currency")
          .invoiceSettings(CustomerCreditTopUpCreateResponse.InvoiceSettings.builder()
              .autoCollection(true)
              .netTerms(123L)
              .memo("memo")
              .requireSuccessfulPayment(true)
              .build())
          .perUnitCostBasis("per_unit_cost_basis")
          .threshold("threshold")
          .expiresAfter(123L)
          .expiresAfterUnit(CustomerCreditTopUpCreateResponse.ExpiresAfterUnit.DAY)
          .build()
      assertThat(customerCreditTopUpCreateResponse).isNotNull
      assertThat(customerCreditTopUpCreateResponse.id()).isEqualTo("id")
      assertThat(customerCreditTopUpCreateResponse.amount()).isEqualTo("amount")
      assertThat(customerCreditTopUpCreateResponse.currency()).isEqualTo("currency")
      assertThat(customerCreditTopUpCreateResponse.invoiceSettings()).isEqualTo(CustomerCreditTopUpCreateResponse.InvoiceSettings.builder()
          .autoCollection(true)
          .netTerms(123L)
          .memo("memo")
          .requireSuccessfulPayment(true)
          .build())
      assertThat(customerCreditTopUpCreateResponse.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
      assertThat(customerCreditTopUpCreateResponse.threshold()).isEqualTo("threshold")
      assertThat(customerCreditTopUpCreateResponse.expiresAfter()).isEqualTo(123L)
      assertThat(customerCreditTopUpCreateResponse.expiresAfterUnit()).isEqualTo(CustomerCreditTopUpCreateResponse.ExpiresAfterUnit.DAY)
    }
}
