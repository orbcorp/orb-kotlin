// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditNoteCreateParamsTest {

    @Test
    fun createCreditNoteCreateParams() {
        CreditNoteCreateParams.builder()
            .lineItems(
                listOf(
                    CreditNoteCreateParams.LineItem.builder()
                        .amount("amount")
                        .invoiceLineItemId("4khy3nwzktxv7")
                        .build()
                )
            )
            .memo("An optional memo for my credit note.")
            .reason(CreditNoteCreateParams.Reason.DUPLICATE)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CreditNoteCreateParams.builder()
                .lineItems(
                    listOf(
                        CreditNoteCreateParams.LineItem.builder()
                            .amount("amount")
                            .invoiceLineItemId("4khy3nwzktxv7")
                            .build()
                    )
                )
                .memo("An optional memo for my credit note.")
                .reason(CreditNoteCreateParams.Reason.DUPLICATE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.lineItems())
            .isEqualTo(
                listOf(
                    CreditNoteCreateParams.LineItem.builder()
                        .amount("amount")
                        .invoiceLineItemId("4khy3nwzktxv7")
                        .build()
                )
            )
        assertThat(body.memo()).isEqualTo("An optional memo for my credit note.")
        assertThat(body.reason()).isEqualTo(CreditNoteCreateParams.Reason.DUPLICATE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CreditNoteCreateParams.builder()
                .lineItems(
                    listOf(
                        CreditNoteCreateParams.LineItem.builder()
                            .amount("amount")
                            .invoiceLineItemId("4khy3nwzktxv7")
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.lineItems())
            .isEqualTo(
                listOf(
                    CreditNoteCreateParams.LineItem.builder()
                        .amount("amount")
                        .invoiceLineItemId("4khy3nwzktxv7")
                        .build()
                )
            )
    }
}
