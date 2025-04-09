// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerBalanceTransactionListPageResponseTest {

    @Test
    fun create() {
        val customerBalanceTransactionListPageResponse =
            CustomerBalanceTransactionListPageResponse.builder()
                .addData(
                    CustomerBalanceTransactionListResponse.builder()
                        .id("cgZa3SXcsPTVyC4Y")
                        .action(CustomerBalanceTransactionListResponse.Action.APPLIED_TO_INVOICE)
                        .amount("11.00")
                        .createdAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                        .creditNote(
                            CustomerBalanceTransactionListResponse.CreditNote.builder()
                                .id("id")
                                .build()
                        )
                        .description("An optional description")
                        .endingBalance("22.00")
                        .invoice(
                            CustomerBalanceTransactionListResponse.Invoice.builder()
                                .id("gXcsPTVyC4YZa3Sc")
                                .build()
                        )
                        .startingBalance("33.00")
                        .type(CustomerBalanceTransactionListResponse.Type.INCREMENT)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(customerBalanceTransactionListPageResponse.data())
            .containsExactly(
                CustomerBalanceTransactionListResponse.builder()
                    .id("cgZa3SXcsPTVyC4Y")
                    .action(CustomerBalanceTransactionListResponse.Action.APPLIED_TO_INVOICE)
                    .amount("11.00")
                    .createdAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                    .creditNote(
                        CustomerBalanceTransactionListResponse.CreditNote.builder().id("id").build()
                    )
                    .description("An optional description")
                    .endingBalance("22.00")
                    .invoice(
                        CustomerBalanceTransactionListResponse.Invoice.builder()
                            .id("gXcsPTVyC4YZa3Sc")
                            .build()
                    )
                    .startingBalance("33.00")
                    .type(CustomerBalanceTransactionListResponse.Type.INCREMENT)
                    .build()
            )
        assertThat(customerBalanceTransactionListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerBalanceTransactionListPageResponse =
            CustomerBalanceTransactionListPageResponse.builder()
                .addData(
                    CustomerBalanceTransactionListResponse.builder()
                        .id("cgZa3SXcsPTVyC4Y")
                        .action(CustomerBalanceTransactionListResponse.Action.APPLIED_TO_INVOICE)
                        .amount("11.00")
                        .createdAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                        .creditNote(
                            CustomerBalanceTransactionListResponse.CreditNote.builder()
                                .id("id")
                                .build()
                        )
                        .description("An optional description")
                        .endingBalance("22.00")
                        .invoice(
                            CustomerBalanceTransactionListResponse.Invoice.builder()
                                .id("gXcsPTVyC4YZa3Sc")
                                .build()
                        )
                        .startingBalance("33.00")
                        .type(CustomerBalanceTransactionListResponse.Type.INCREMENT)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedCustomerBalanceTransactionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerBalanceTransactionListPageResponse),
                jacksonTypeRef<CustomerBalanceTransactionListPageResponse>(),
            )

        assertThat(roundtrippedCustomerBalanceTransactionListPageResponse)
            .isEqualTo(customerBalanceTransactionListPageResponse)
    }
}
