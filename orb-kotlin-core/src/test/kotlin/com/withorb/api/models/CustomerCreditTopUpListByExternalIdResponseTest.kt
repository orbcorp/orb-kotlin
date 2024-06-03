// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditTopUpListByExternalIdResponseTest {

    @Test
    fun createCustomerCreditTopUpListByExternalIdResponse() {
        val customerCreditTopUpListByExternalIdResponse =
            CustomerCreditTopUpListByExternalIdResponse.builder()
                .id("string")
                .amount("string")
                .currency("string")
                .invoiceSettings(
                    CustomerCreditTopUpListByExternalIdResponse.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(123L)
                        .memo("string")
                        .requireSuccessfulPayment(true)
                        .build()
                )
                .perUnitCostBasis("string")
                .threshold("string")
                .expiresAfter(123L)
                .expiresAfterUnit(CustomerCreditTopUpListByExternalIdResponse.ExpiresAfterUnit.DAY)
                .build()
        assertThat(customerCreditTopUpListByExternalIdResponse).isNotNull
        assertThat(customerCreditTopUpListByExternalIdResponse.id()).isEqualTo("string")
        assertThat(customerCreditTopUpListByExternalIdResponse.amount()).isEqualTo("string")
        assertThat(customerCreditTopUpListByExternalIdResponse.currency()).isEqualTo("string")
        assertThat(customerCreditTopUpListByExternalIdResponse.invoiceSettings())
            .isEqualTo(
                CustomerCreditTopUpListByExternalIdResponse.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(123L)
                    .memo("string")
                    .requireSuccessfulPayment(true)
                    .build()
            )
        assertThat(customerCreditTopUpListByExternalIdResponse.perUnitCostBasis())
            .isEqualTo("string")
        assertThat(customerCreditTopUpListByExternalIdResponse.threshold()).isEqualTo("string")
        assertThat(customerCreditTopUpListByExternalIdResponse.expiresAfter()).isEqualTo(123L)
        assertThat(customerCreditTopUpListByExternalIdResponse.expiresAfterUnit())
            .isEqualTo(CustomerCreditTopUpListByExternalIdResponse.ExpiresAfterUnit.DAY)
    }
}
