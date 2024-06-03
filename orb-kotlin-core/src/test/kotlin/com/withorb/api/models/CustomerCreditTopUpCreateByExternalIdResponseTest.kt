// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditTopUpCreateByExternalIdResponseTest {

    @Test
    fun createCustomerCreditTopUpCreateByExternalIdResponse() {
        val customerCreditTopUpCreateByExternalIdResponse =
            CustomerCreditTopUpCreateByExternalIdResponse.builder()
                .id("string")
                .amount("string")
                .currency("string")
                .invoiceSettings(
                    CustomerCreditTopUpCreateByExternalIdResponse.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(123L)
                        .memo("string")
                        .requireSuccessfulPayment(true)
                        .build()
                )
                .perUnitCostBasis("string")
                .threshold("string")
                .expiresAfter(123L)
                .expiresAfterUnit(
                    CustomerCreditTopUpCreateByExternalIdResponse.ExpiresAfterUnit.DAY
                )
                .build()
        assertThat(customerCreditTopUpCreateByExternalIdResponse).isNotNull
        assertThat(customerCreditTopUpCreateByExternalIdResponse.id()).isEqualTo("string")
        assertThat(customerCreditTopUpCreateByExternalIdResponse.amount()).isEqualTo("string")
        assertThat(customerCreditTopUpCreateByExternalIdResponse.currency()).isEqualTo("string")
        assertThat(customerCreditTopUpCreateByExternalIdResponse.invoiceSettings())
            .isEqualTo(
                CustomerCreditTopUpCreateByExternalIdResponse.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(123L)
                    .memo("string")
                    .requireSuccessfulPayment(true)
                    .build()
            )
        assertThat(customerCreditTopUpCreateByExternalIdResponse.perUnitCostBasis())
            .isEqualTo("string")
        assertThat(customerCreditTopUpCreateByExternalIdResponse.threshold()).isEqualTo("string")
        assertThat(customerCreditTopUpCreateByExternalIdResponse.expiresAfter()).isEqualTo(123L)
        assertThat(customerCreditTopUpCreateByExternalIdResponse.expiresAfterUnit())
            .isEqualTo(CustomerCreditTopUpCreateByExternalIdResponse.ExpiresAfterUnit.DAY)
    }
}
