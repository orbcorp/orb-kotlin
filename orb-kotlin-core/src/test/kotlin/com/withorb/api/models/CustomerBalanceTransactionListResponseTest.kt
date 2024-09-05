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
import com.withorb.api.models.CustomerBalanceTransactionListResponse

class CustomerBalanceTransactionListResponseTest {

    @Test
    fun createCustomerBalanceTransactionListResponse() {
      val customerBalanceTransactionListResponse = CustomerBalanceTransactionListResponse.builder()
          .id("cgZa3SXcsPTVyC4Y")
          .action(CustomerBalanceTransactionListResponse.Action.APPLIED_TO_INVOICE)
          .amount("11.00")
          .createdAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
          .creditNote(CustomerBalanceTransactionListResponse.CreditNote.builder()
              .id("id")
              .build())
          .description("An optional description")
          .endingBalance("22.00")
          .invoice(CustomerBalanceTransactionListResponse.Invoice.builder()
              .id("gXcsPTVyC4YZa3Sc")
              .build())
          .startingBalance("33.00")
          .type(CustomerBalanceTransactionListResponse.Type.INCREMENT)
          .build()
      assertThat(customerBalanceTransactionListResponse).isNotNull
      assertThat(customerBalanceTransactionListResponse.id()).isEqualTo("cgZa3SXcsPTVyC4Y")
      assertThat(customerBalanceTransactionListResponse.action()).isEqualTo(CustomerBalanceTransactionListResponse.Action.APPLIED_TO_INVOICE)
      assertThat(customerBalanceTransactionListResponse.amount()).isEqualTo("11.00")
      assertThat(customerBalanceTransactionListResponse.createdAt()).isEqualTo(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
      assertThat(customerBalanceTransactionListResponse.creditNote()).isEqualTo(CustomerBalanceTransactionListResponse.CreditNote.builder()
          .id("id")
          .build())
      assertThat(customerBalanceTransactionListResponse.description()).isEqualTo("An optional description")
      assertThat(customerBalanceTransactionListResponse.endingBalance()).isEqualTo("22.00")
      assertThat(customerBalanceTransactionListResponse.invoice()).isEqualTo(CustomerBalanceTransactionListResponse.Invoice.builder()
          .id("gXcsPTVyC4YZa3Sc")
          .build())
      assertThat(customerBalanceTransactionListResponse.startingBalance()).isEqualTo("33.00")
      assertThat(customerBalanceTransactionListResponse.type()).isEqualTo(CustomerBalanceTransactionListResponse.Type.INCREMENT)
    }
}
