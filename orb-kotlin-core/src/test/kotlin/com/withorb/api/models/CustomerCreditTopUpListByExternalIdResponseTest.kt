// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditTopUpListByExternalIdResponseTest {

    @Test
    fun create() {
        val customerCreditTopUpListByExternalIdResponse =
            CustomerCreditTopUpListByExternalIdResponse.builder()
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
                .expiresAfterUnit(CustomerCreditTopUpListByExternalIdResponse.ExpiresAfterUnit.DAY)
                .build()

        assertThat(customerCreditTopUpListByExternalIdResponse.id()).isEqualTo("id")
        assertThat(customerCreditTopUpListByExternalIdResponse.amount()).isEqualTo("amount")
        assertThat(customerCreditTopUpListByExternalIdResponse.currency()).isEqualTo("currency")
        assertThat(customerCreditTopUpListByExternalIdResponse.invoiceSettings())
            .isEqualTo(
                TopUpInvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(0L)
                    .memo("memo")
                    .requireSuccessfulPayment(true)
                    .build()
            )
        assertThat(customerCreditTopUpListByExternalIdResponse.perUnitCostBasis())
            .isEqualTo("per_unit_cost_basis")
        assertThat(customerCreditTopUpListByExternalIdResponse.threshold()).isEqualTo("threshold")
        assertThat(customerCreditTopUpListByExternalIdResponse.expiresAfter()).isEqualTo(0L)
        assertThat(customerCreditTopUpListByExternalIdResponse.expiresAfterUnit())
            .isEqualTo(CustomerCreditTopUpListByExternalIdResponse.ExpiresAfterUnit.DAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditTopUpListByExternalIdResponse =
            CustomerCreditTopUpListByExternalIdResponse.builder()
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
                .expiresAfterUnit(CustomerCreditTopUpListByExternalIdResponse.ExpiresAfterUnit.DAY)
                .build()

        val roundtrippedCustomerCreditTopUpListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditTopUpListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditTopUpListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditTopUpListByExternalIdResponse)
            .isEqualTo(customerCreditTopUpListByExternalIdResponse)
    }
}
