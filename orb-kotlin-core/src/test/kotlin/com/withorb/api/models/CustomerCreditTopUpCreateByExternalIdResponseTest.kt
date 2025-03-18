// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditTopUpCreateByExternalIdResponseTest {

    @Test
    fun create() {
        val customerCreditTopUpCreateByExternalIdResponse =
            CustomerCreditTopUpCreateByExternalIdResponse.builder()
                .id("id")
                .amount("amount")
                .currency("currency")
                .invoiceSettings(
                    CustomerCreditTopUpCreateByExternalIdResponse.InvoiceSettings.builder()
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
                    CustomerCreditTopUpCreateByExternalIdResponse.ExpiresAfterUnit.DAY
                )
                .build()

        assertThat(customerCreditTopUpCreateByExternalIdResponse.id()).isEqualTo("id")
        assertThat(customerCreditTopUpCreateByExternalIdResponse.amount()).isEqualTo("amount")
        assertThat(customerCreditTopUpCreateByExternalIdResponse.currency()).isEqualTo("currency")
        assertThat(customerCreditTopUpCreateByExternalIdResponse.invoiceSettings())
            .isEqualTo(
                CustomerCreditTopUpCreateByExternalIdResponse.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(0L)
                    .memo("memo")
                    .requireSuccessfulPayment(true)
                    .build()
            )
        assertThat(customerCreditTopUpCreateByExternalIdResponse.perUnitCostBasis())
            .isEqualTo("per_unit_cost_basis")
        assertThat(customerCreditTopUpCreateByExternalIdResponse.threshold()).isEqualTo("threshold")
        assertThat(customerCreditTopUpCreateByExternalIdResponse.expiresAfter()).isEqualTo(0L)
        assertThat(customerCreditTopUpCreateByExternalIdResponse.expiresAfterUnit())
            .isEqualTo(CustomerCreditTopUpCreateByExternalIdResponse.ExpiresAfterUnit.DAY)
    }
}
