// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditTopUpListByExternalIdPageResponseTest {

    @Test
    fun create() {
        val customerCreditTopUpListByExternalIdPageResponse =
            CustomerCreditTopUpListByExternalIdPageResponse.builder()
                .addData(
                    CustomerCreditTopUpListByExternalIdResponse.builder()
                        .id("id")
                        .amount("amount")
                        .currency("currency")
                        .invoiceSettings(
                            CustomerCreditTopUpListByExternalIdResponse.InvoiceSettings.builder()
                                .autoCollection(true)
                                .netTerms(0L)
                                .memo("memo")
                                .requireSuccessfulPayment(true)
                                .build()
                        )
                        .perUnitCostBasis("per_unit_cost_basis")
                        .threshold("threshold")
                        .expiresAfter(0L)
                        .expiresAfterUnit(
                            CustomerCreditTopUpListByExternalIdResponse.ExpiresAfterUnit.DAY
                        )
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(customerCreditTopUpListByExternalIdPageResponse.data())
            .containsExactly(
                CustomerCreditTopUpListByExternalIdResponse.builder()
                    .id("id")
                    .amount("amount")
                    .currency("currency")
                    .invoiceSettings(
                        CustomerCreditTopUpListByExternalIdResponse.InvoiceSettings.builder()
                            .autoCollection(true)
                            .netTerms(0L)
                            .memo("memo")
                            .requireSuccessfulPayment(true)
                            .build()
                    )
                    .perUnitCostBasis("per_unit_cost_basis")
                    .threshold("threshold")
                    .expiresAfter(0L)
                    .expiresAfterUnit(
                        CustomerCreditTopUpListByExternalIdResponse.ExpiresAfterUnit.DAY
                    )
                    .build()
            )
        assertThat(customerCreditTopUpListByExternalIdPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditTopUpListByExternalIdPageResponse =
            CustomerCreditTopUpListByExternalIdPageResponse.builder()
                .addData(
                    CustomerCreditTopUpListByExternalIdResponse.builder()
                        .id("id")
                        .amount("amount")
                        .currency("currency")
                        .invoiceSettings(
                            CustomerCreditTopUpListByExternalIdResponse.InvoiceSettings.builder()
                                .autoCollection(true)
                                .netTerms(0L)
                                .memo("memo")
                                .requireSuccessfulPayment(true)
                                .build()
                        )
                        .perUnitCostBasis("per_unit_cost_basis")
                        .threshold("threshold")
                        .expiresAfter(0L)
                        .expiresAfterUnit(
                            CustomerCreditTopUpListByExternalIdResponse.ExpiresAfterUnit.DAY
                        )
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedCustomerCreditTopUpListByExternalIdPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditTopUpListByExternalIdPageResponse),
                jacksonTypeRef<CustomerCreditTopUpListByExternalIdPageResponse>(),
            )

        assertThat(roundtrippedCustomerCreditTopUpListByExternalIdPageResponse)
            .isEqualTo(customerCreditTopUpListByExternalIdPageResponse)
    }
}
