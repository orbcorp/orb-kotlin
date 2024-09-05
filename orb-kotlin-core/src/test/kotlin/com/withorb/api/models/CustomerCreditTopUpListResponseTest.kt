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
import com.withorb.api.models.CustomerCreditTopUpListResponse

class CustomerCreditTopUpListResponseTest {

    @Test
    fun createCustomerCreditTopUpListResponse() {
      val customerCreditTopUpListResponse = CustomerCreditTopUpListResponse.builder()
          .id("id")
          .amount("amount")
          .currency("currency")
          .invoiceSettings(CustomerCreditTopUpListResponse.InvoiceSettings.builder()
              .autoCollection(true)
              .netTerms(123L)
              .memo("memo")
              .requireSuccessfulPayment(true)
              .build())
          .perUnitCostBasis("per_unit_cost_basis")
          .threshold("threshold")
          .expiresAfter(123L)
          .expiresAfterUnit(CustomerCreditTopUpListResponse.ExpiresAfterUnit.DAY)
          .build()
      assertThat(customerCreditTopUpListResponse).isNotNull
      assertThat(customerCreditTopUpListResponse.id()).isEqualTo("id")
      assertThat(customerCreditTopUpListResponse.amount()).isEqualTo("amount")
      assertThat(customerCreditTopUpListResponse.currency()).isEqualTo("currency")
      assertThat(customerCreditTopUpListResponse.invoiceSettings()).isEqualTo(CustomerCreditTopUpListResponse.InvoiceSettings.builder()
          .autoCollection(true)
          .netTerms(123L)
          .memo("memo")
          .requireSuccessfulPayment(true)
          .build())
      assertThat(customerCreditTopUpListResponse.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
      assertThat(customerCreditTopUpListResponse.threshold()).isEqualTo("threshold")
      assertThat(customerCreditTopUpListResponse.expiresAfter()).isEqualTo(123L)
      assertThat(customerCreditTopUpListResponse.expiresAfterUnit()).isEqualTo(CustomerCreditTopUpListResponse.ExpiresAfterUnit.DAY)
    }
}
