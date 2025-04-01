// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditTopUpListResponseTest {

    @Test
    fun create() {
        val customerCreditTopUpListResponse =
            CustomerCreditTopUpListResponse.builder()
                .id("id")
                .amount("amount")
                .currency("currency")
                .invoiceSettings(
                    CustomerCreditTopUpListResponse.InvoiceSettings.builder()
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

        assertThat(customerCreditTopUpListResponse.id()).isEqualTo("id")
        assertThat(customerCreditTopUpListResponse.amount()).isEqualTo("amount")
        assertThat(customerCreditTopUpListResponse.currency()).isEqualTo("currency")
        assertThat(customerCreditTopUpListResponse.invoiceSettings())
            .isEqualTo(
                CustomerCreditTopUpListResponse.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(0L)
                    .memo("memo")
                    .requireSuccessfulPayment(true)
                    .build()
            )
        assertThat(customerCreditTopUpListResponse.perUnitCostBasis())
            .isEqualTo("per_unit_cost_basis")
        assertThat(customerCreditTopUpListResponse.threshold()).isEqualTo("threshold")
        assertThat(customerCreditTopUpListResponse.expiresAfter()).isEqualTo(0L)
        assertThat(customerCreditTopUpListResponse.expiresAfterUnit())
            .isEqualTo(CustomerCreditTopUpListResponse.ExpiresAfterUnit.DAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditTopUpListResponse =
            CustomerCreditTopUpListResponse.builder()
                .id("id")
                .amount("amount")
                .currency("currency")
                .invoiceSettings(
                    CustomerCreditTopUpListResponse.InvoiceSettings.builder()
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

        val roundtrippedCustomerCreditTopUpListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditTopUpListResponse),
                jacksonTypeRef<CustomerCreditTopUpListResponse>(),
            )

        assertThat(roundtrippedCustomerCreditTopUpListResponse)
            .isEqualTo(customerCreditTopUpListResponse)
    }
}
