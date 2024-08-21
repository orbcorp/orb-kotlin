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
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdResponse

class CustomerCreditTopUpListByExternalIdResponseTest {

    @Test
    fun createCustomerCreditTopUpListByExternalIdResponse() {
      val customerCreditTopUpListByExternalIdResponse = CustomerCreditTopUpListByExternalIdResponse.builder()
          .id("id")
          .amount("amount")
          .currency("currency")
          .invoiceSettings(CustomerCreditTopUpListByExternalIdResponse.InvoiceSettings.builder()
              .autoCollection(true)
              .netTerms(123L)
              .memo("memo")
              .requireSuccessfulPayment(true)
              .build())
          .perUnitCostBasis("per_unit_cost_basis")
          .threshold("threshold")
          .expiresAfter(123L)
          .expiresAfterUnit(CustomerCreditTopUpListByExternalIdResponse.ExpiresAfterUnit.DAY)
          .build()
      assertThat(customerCreditTopUpListByExternalIdResponse).isNotNull
      assertThat(customerCreditTopUpListByExternalIdResponse.id()).isEqualTo("id")
      assertThat(customerCreditTopUpListByExternalIdResponse.amount()).isEqualTo("amount")
      assertThat(customerCreditTopUpListByExternalIdResponse.currency()).isEqualTo("currency")
      assertThat(customerCreditTopUpListByExternalIdResponse.invoiceSettings()).isEqualTo(CustomerCreditTopUpListByExternalIdResponse.InvoiceSettings.builder()
          .autoCollection(true)
          .netTerms(123L)
          .memo("memo")
          .requireSuccessfulPayment(true)
          .build())
      assertThat(customerCreditTopUpListByExternalIdResponse.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
      assertThat(customerCreditTopUpListByExternalIdResponse.threshold()).isEqualTo("threshold")
      assertThat(customerCreditTopUpListByExternalIdResponse.expiresAfter()).isEqualTo(123L)
      assertThat(customerCreditTopUpListByExternalIdResponse.expiresAfterUnit()).isEqualTo(CustomerCreditTopUpListByExternalIdResponse.ExpiresAfterUnit.DAY)
    }
}
