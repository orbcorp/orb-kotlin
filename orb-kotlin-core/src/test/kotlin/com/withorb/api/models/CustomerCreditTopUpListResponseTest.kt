// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditTopUpListResponseTest {

    @Test
    fun createCustomerCreditTopUpListResponse() {
        val customerCreditTopUpListResponse =
            CustomerCreditTopUpListResponse.builder()
                .id("string")
                .amount("string")
                .currency("string")
                .invoiceSettings(
                    CustomerCreditTopUpListResponse.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(123L)
                        .memo("string")
                        .requireSuccessfulPayment(true)
                        .build()
                )
                .perUnitCostBasis("string")
                .threshold("string")
                .expiresAfter(123L)
                .expiresAfterUnit(CustomerCreditTopUpListResponse.ExpiresAfterUnit.DAY)
                .build()
        assertThat(customerCreditTopUpListResponse).isNotNull
        assertThat(customerCreditTopUpListResponse.id()).isEqualTo("string")
        assertThat(customerCreditTopUpListResponse.amount()).isEqualTo("string")
        assertThat(customerCreditTopUpListResponse.currency()).isEqualTo("string")
        assertThat(customerCreditTopUpListResponse.invoiceSettings())
            .isEqualTo(
                CustomerCreditTopUpListResponse.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(123L)
                    .memo("string")
                    .requireSuccessfulPayment(true)
                    .build()
            )
        assertThat(customerCreditTopUpListResponse.perUnitCostBasis()).isEqualTo("string")
        assertThat(customerCreditTopUpListResponse.threshold()).isEqualTo("string")
        assertThat(customerCreditTopUpListResponse.expiresAfter()).isEqualTo(123L)
        assertThat(customerCreditTopUpListResponse.expiresAfterUnit())
            .isEqualTo(CustomerCreditTopUpListResponse.ExpiresAfterUnit.DAY)
    }
}
