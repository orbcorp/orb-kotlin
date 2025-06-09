// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerBalanceTransactionListResponseTest {

    @Test
    fun create() {
        val customerBalanceTransactionListResponse =
            CustomerBalanceTransactionListResponse.builder()
                .id("cgZa3SXcsPTVyC4Y")
                .action(CustomerBalanceTransactionListResponse.Action.APPLIED_TO_INVOICE)
                .amount("11.00")
                .createdAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                .creditNote(CreditNoteTiny.builder().id("id").build())
                .description("An optional description")
                .endingBalance("22.00")
                .invoice(InvoiceTiny.builder().id("gXcsPTVyC4YZa3Sc").build())
                .startingBalance("33.00")
                .type(CustomerBalanceTransactionListResponse.Type.INCREMENT)
                .build()

        assertThat(customerBalanceTransactionListResponse.id()).isEqualTo("cgZa3SXcsPTVyC4Y")
        assertThat(customerBalanceTransactionListResponse.action())
            .isEqualTo(CustomerBalanceTransactionListResponse.Action.APPLIED_TO_INVOICE)
        assertThat(customerBalanceTransactionListResponse.amount()).isEqualTo("11.00")
        assertThat(customerBalanceTransactionListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
        assertThat(customerBalanceTransactionListResponse.creditNote())
            .isEqualTo(CreditNoteTiny.builder().id("id").build())
        assertThat(customerBalanceTransactionListResponse.description())
            .isEqualTo("An optional description")
        assertThat(customerBalanceTransactionListResponse.endingBalance()).isEqualTo("22.00")
        assertThat(customerBalanceTransactionListResponse.invoice())
            .isEqualTo(InvoiceTiny.builder().id("gXcsPTVyC4YZa3Sc").build())
        assertThat(customerBalanceTransactionListResponse.startingBalance()).isEqualTo("33.00")
        assertThat(customerBalanceTransactionListResponse.type())
            .isEqualTo(CustomerBalanceTransactionListResponse.Type.INCREMENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerBalanceTransactionListResponse =
            CustomerBalanceTransactionListResponse.builder()
                .id("cgZa3SXcsPTVyC4Y")
                .action(CustomerBalanceTransactionListResponse.Action.APPLIED_TO_INVOICE)
                .amount("11.00")
                .createdAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                .creditNote(CreditNoteTiny.builder().id("id").build())
                .description("An optional description")
                .endingBalance("22.00")
                .invoice(InvoiceTiny.builder().id("gXcsPTVyC4YZa3Sc").build())
                .startingBalance("33.00")
                .type(CustomerBalanceTransactionListResponse.Type.INCREMENT)
                .build()

        val roundtrippedCustomerBalanceTransactionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerBalanceTransactionListResponse),
                jacksonTypeRef<CustomerBalanceTransactionListResponse>(),
            )

        assertThat(roundtrippedCustomerBalanceTransactionListResponse)
            .isEqualTo(customerBalanceTransactionListResponse)
    }
}
