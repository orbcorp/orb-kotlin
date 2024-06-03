// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditTopUpCreateResponseTest {

    @Test
    fun createCustomerCreditTopUpCreateResponse() {
        val customerCreditTopUpCreateResponse =
            CustomerCreditTopUpCreateResponse.builder()
                .id("string")
                .amount("string")
                .currency("string")
                .invoiceSettings(
                    CustomerCreditTopUpCreateResponse.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(123L)
                        .memo("string")
                        .requireSuccessfulPayment(true)
                        .build()
                )
                .perUnitCostBasis("string")
                .threshold("string")
                .expiresAfter(123L)
                .expiresAfterUnit(CustomerCreditTopUpCreateResponse.ExpiresAfterUnit.DAY)
                .build()
        assertThat(customerCreditTopUpCreateResponse).isNotNull
        assertThat(customerCreditTopUpCreateResponse.id()).isEqualTo("string")
        assertThat(customerCreditTopUpCreateResponse.amount()).isEqualTo("string")
        assertThat(customerCreditTopUpCreateResponse.currency()).isEqualTo("string")
        assertThat(customerCreditTopUpCreateResponse.invoiceSettings())
            .isEqualTo(
                CustomerCreditTopUpCreateResponse.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(123L)
                    .memo("string")
                    .requireSuccessfulPayment(true)
                    .build()
            )
        assertThat(customerCreditTopUpCreateResponse.perUnitCostBasis()).isEqualTo("string")
        assertThat(customerCreditTopUpCreateResponse.threshold()).isEqualTo("string")
        assertThat(customerCreditTopUpCreateResponse.expiresAfter()).isEqualTo(123L)
        assertThat(customerCreditTopUpCreateResponse.expiresAfterUnit())
            .isEqualTo(CustomerCreditTopUpCreateResponse.ExpiresAfterUnit.DAY)
    }
}
