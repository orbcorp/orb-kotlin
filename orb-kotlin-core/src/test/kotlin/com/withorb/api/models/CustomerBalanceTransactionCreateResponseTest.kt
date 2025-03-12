// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerBalanceTransactionCreateResponseTest {

    @Test
    fun createCustomerBalanceTransactionCreateResponse() {
      val customerBalanceTransactionCreateResponse = CustomerBalanceTransactionCreateResponse.builder()
          .id("cgZa3SXcsPTVyC4Y")
          .action(CustomerBalanceTransactionCreateResponse.Action.APPLIED_TO_INVOICE)
          .amount("11.00")
          .createdAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
          .creditNote(CustomerBalanceTransactionCreateResponse.CreditNote.builder()
              .id("id")
              .build())
          .description("An optional description")
          .endingBalance("22.00")
          .invoice(CustomerBalanceTransactionCreateResponse.Invoice.builder()
              .id("gXcsPTVyC4YZa3Sc")
              .build())
          .startingBalance("33.00")
          .type(CustomerBalanceTransactionCreateResponse.Type.INCREMENT)
          .build()
      assertThat(customerBalanceTransactionCreateResponse).isNotNull
      assertThat(customerBalanceTransactionCreateResponse.id()).isEqualTo("cgZa3SXcsPTVyC4Y")
      assertThat(customerBalanceTransactionCreateResponse.action()).isEqualTo(CustomerBalanceTransactionCreateResponse.Action.APPLIED_TO_INVOICE)
      assertThat(customerBalanceTransactionCreateResponse.amount()).isEqualTo("11.00")
      assertThat(customerBalanceTransactionCreateResponse.createdAt()).isEqualTo(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
      assertThat(customerBalanceTransactionCreateResponse.creditNote()).isEqualTo(CustomerBalanceTransactionCreateResponse.CreditNote.builder()
          .id("id")
          .build())
      assertThat(customerBalanceTransactionCreateResponse.description()).isEqualTo("An optional description")
      assertThat(customerBalanceTransactionCreateResponse.endingBalance()).isEqualTo("22.00")
      assertThat(customerBalanceTransactionCreateResponse.invoice()).isEqualTo(CustomerBalanceTransactionCreateResponse.Invoice.builder()
          .id("gXcsPTVyC4YZa3Sc")
          .build())
      assertThat(customerBalanceTransactionCreateResponse.startingBalance()).isEqualTo("33.00")
      assertThat(customerBalanceTransactionCreateResponse.type()).isEqualTo(CustomerBalanceTransactionCreateResponse.Type.INCREMENT)
    }
}
