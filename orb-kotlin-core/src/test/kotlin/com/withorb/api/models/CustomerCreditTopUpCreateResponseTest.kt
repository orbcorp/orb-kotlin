// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditTopUpCreateResponseTest {

    @Test
    fun createCustomerCreditTopUpCreateResponse() {
      val customerCreditTopUpCreateResponse = CustomerCreditTopUpCreateResponse.builder()
          .id("id")
          .amount("amount")
          .currency("currency")
          .invoiceSettings(CustomerCreditTopUpCreateResponse.InvoiceSettings.builder()
              .autoCollection(true)
              .netTerms(0L)
              .memo("memo")
              .requireSuccessfulPayment(true)
              .build())
          .perUnitCostBasis("per_unit_cost_basis")
          .threshold("threshold")
          .expiresAfter(0L)
          .expiresAfterUnit(CustomerCreditTopUpCreateResponse.ExpiresAfterUnit.DAY)
          .build()
      assertThat(customerCreditTopUpCreateResponse).isNotNull
      assertThat(customerCreditTopUpCreateResponse.id()).isEqualTo("id")
      assertThat(customerCreditTopUpCreateResponse.amount()).isEqualTo("amount")
      assertThat(customerCreditTopUpCreateResponse.currency()).isEqualTo("currency")
      assertThat(customerCreditTopUpCreateResponse.invoiceSettings()).isEqualTo(CustomerCreditTopUpCreateResponse.InvoiceSettings.builder()
          .autoCollection(true)
          .netTerms(0L)
          .memo("memo")
          .requireSuccessfulPayment(true)
          .build())
      assertThat(customerCreditTopUpCreateResponse.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
      assertThat(customerCreditTopUpCreateResponse.threshold()).isEqualTo("threshold")
      assertThat(customerCreditTopUpCreateResponse.expiresAfter()).isEqualTo(0L)
      assertThat(customerCreditTopUpCreateResponse.expiresAfterUnit()).isEqualTo(CustomerCreditTopUpCreateResponse.ExpiresAfterUnit.DAY)
    }
}
