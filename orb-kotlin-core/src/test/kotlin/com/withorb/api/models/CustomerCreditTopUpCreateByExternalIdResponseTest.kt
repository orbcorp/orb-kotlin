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
import com.withorb.api.models.CustomerCreditTopUpCreateByExternalIdResponse

class CustomerCreditTopUpCreateByExternalIdResponseTest {

    @Test
    fun createCustomerCreditTopUpCreateByExternalIdResponse() {
      val customerCreditTopUpCreateByExternalIdResponse = CustomerCreditTopUpCreateByExternalIdResponse.builder()
          .id("id")
          .amount("amount")
          .currency("currency")
          .invoiceSettings(CustomerCreditTopUpCreateByExternalIdResponse.InvoiceSettings.builder()
              .autoCollection(true)
              .netTerms(123L)
              .memo("memo")
              .requireSuccessfulPayment(true)
              .build())
          .perUnitCostBasis("per_unit_cost_basis")
          .threshold("threshold")
          .expiresAfter(123L)
          .expiresAfterUnit(CustomerCreditTopUpCreateByExternalIdResponse.ExpiresAfterUnit.DAY)
          .build()
      assertThat(customerCreditTopUpCreateByExternalIdResponse).isNotNull
      assertThat(customerCreditTopUpCreateByExternalIdResponse.id()).isEqualTo("id")
      assertThat(customerCreditTopUpCreateByExternalIdResponse.amount()).isEqualTo("amount")
      assertThat(customerCreditTopUpCreateByExternalIdResponse.currency()).isEqualTo("currency")
      assertThat(customerCreditTopUpCreateByExternalIdResponse.invoiceSettings()).isEqualTo(CustomerCreditTopUpCreateByExternalIdResponse.InvoiceSettings.builder()
          .autoCollection(true)
          .netTerms(123L)
          .memo("memo")
          .requireSuccessfulPayment(true)
          .build())
      assertThat(customerCreditTopUpCreateByExternalIdResponse.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
      assertThat(customerCreditTopUpCreateByExternalIdResponse.threshold()).isEqualTo("threshold")
      assertThat(customerCreditTopUpCreateByExternalIdResponse.expiresAfter()).isEqualTo(123L)
      assertThat(customerCreditTopUpCreateByExternalIdResponse.expiresAfterUnit()).isEqualTo(CustomerCreditTopUpCreateByExternalIdResponse.ExpiresAfterUnit.DAY)
    }
}
