// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerBalanceTransactionModelTest {

    @Test
    fun createCustomerBalanceTransactionModel() {
        val customerBalanceTransactionModel =
            CustomerBalanceTransactionModel.builder()
                .id("cgZa3SXcsPTVyC4Y")
                .action(CustomerBalanceTransactionModel.Action.APPLIED_TO_INVOICE)
                .amount("11.00")
                .createdAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                .creditNote(CustomerBalanceTransactionModel.CreditNote.builder().id("id").build())
                .description("An optional description")
                .endingBalance("22.00")
                .invoice(
                    CustomerBalanceTransactionModel.Invoice.builder().id("gXcsPTVyC4YZa3Sc").build()
                )
                .startingBalance("33.00")
                .type(CustomerBalanceTransactionModel.Type.INCREMENT)
                .build()
        assertThat(customerBalanceTransactionModel).isNotNull
        assertThat(customerBalanceTransactionModel.id()).isEqualTo("cgZa3SXcsPTVyC4Y")
        assertThat(customerBalanceTransactionModel.action())
            .isEqualTo(CustomerBalanceTransactionModel.Action.APPLIED_TO_INVOICE)
        assertThat(customerBalanceTransactionModel.amount()).isEqualTo("11.00")
        assertThat(customerBalanceTransactionModel.createdAt())
            .isEqualTo(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
        assertThat(customerBalanceTransactionModel.creditNote())
            .isEqualTo(CustomerBalanceTransactionModel.CreditNote.builder().id("id").build())
        assertThat(customerBalanceTransactionModel.description())
            .isEqualTo("An optional description")
        assertThat(customerBalanceTransactionModel.endingBalance()).isEqualTo("22.00")
        assertThat(customerBalanceTransactionModel.invoice())
            .isEqualTo(
                CustomerBalanceTransactionModel.Invoice.builder().id("gXcsPTVyC4YZa3Sc").build()
            )
        assertThat(customerBalanceTransactionModel.startingBalance()).isEqualTo("33.00")
        assertThat(customerBalanceTransactionModel.type())
            .isEqualTo(CustomerBalanceTransactionModel.Type.INCREMENT)
    }
}
