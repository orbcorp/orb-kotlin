// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditTopUpListPageResponseTest {

    @Test
    fun create() {
        val customerCreditTopUpListPageResponse =
            CustomerCreditTopUpListPageResponse.builder()
                .addData(
                    CustomerCreditTopUpListResponse.builder()
                        .id("id")
                        .amount("amount")
                        .currency("currency")
                        .invoiceSettings(
                            TopUpInvoiceSettings.builder()
                                .autoCollection(true)
                                .netTerms(0L)
                                .memo("memo")
                                .requireSuccessfulPayment(true)
                                .build()
                        )
                        .perUnitCostBasis("per_unit_cost_basis")
                        .threshold("threshold")
                        .expiresAfter(0L)
                        .expiresAfterUnit(CustomerCreditTopUpListResponse.ExpiresAfterUnit.DAY)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(customerCreditTopUpListPageResponse.data())
            .containsExactly(
                CustomerCreditTopUpListResponse.builder()
                    .id("id")
                    .amount("amount")
                    .currency("currency")
                    .invoiceSettings(
                        TopUpInvoiceSettings.builder()
                            .autoCollection(true)
                            .netTerms(0L)
                            .memo("memo")
                            .requireSuccessfulPayment(true)
                            .build()
                    )
                    .perUnitCostBasis("per_unit_cost_basis")
                    .threshold("threshold")
                    .expiresAfter(0L)
                    .expiresAfterUnit(CustomerCreditTopUpListResponse.ExpiresAfterUnit.DAY)
                    .build()
            )
        assertThat(customerCreditTopUpListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditTopUpListPageResponse =
            CustomerCreditTopUpListPageResponse.builder()
                .addData(
                    CustomerCreditTopUpListResponse.builder()
                        .id("id")
                        .amount("amount")
                        .currency("currency")
                        .invoiceSettings(
                            TopUpInvoiceSettings.builder()
                                .autoCollection(true)
                                .netTerms(0L)
                                .memo("memo")
                                .requireSuccessfulPayment(true)
                                .build()
                        )
                        .perUnitCostBasis("per_unit_cost_basis")
                        .threshold("threshold")
                        .expiresAfter(0L)
                        .expiresAfterUnit(CustomerCreditTopUpListResponse.ExpiresAfterUnit.DAY)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedCustomerCreditTopUpListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditTopUpListPageResponse),
                jacksonTypeRef<CustomerCreditTopUpListPageResponse>(),
            )

        assertThat(roundtrippedCustomerCreditTopUpListPageResponse)
            .isEqualTo(customerCreditTopUpListPageResponse)
    }
}
