// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditNoteCreateParamsTest {

    @Test
    fun create() {
        CreditNoteCreateParams.builder()
            .addLineItem(
                CreditNoteCreateParams.LineItem.builder()
                    .amount("amount")
                    .invoiceLineItemId("4khy3nwzktxv7")
                    .build()
            )
            .reason(CreditNoteCreateParams.Reason.DUPLICATE)
            .memo("An optional memo for my credit note.")
            .build()
    }

    @Test
    fun body() {
        val params =
            CreditNoteCreateParams.builder()
                .addLineItem(
                    CreditNoteCreateParams.LineItem.builder()
                        .amount("amount")
                        .invoiceLineItemId("4khy3nwzktxv7")
                        .build()
                )
                .reason(CreditNoteCreateParams.Reason.DUPLICATE)
                .memo("An optional memo for my credit note.")
                .build()

        val body = params._body()

        assertThat(body.lineItems())
            .containsExactly(
                CreditNoteCreateParams.LineItem.builder()
                    .amount("amount")
                    .invoiceLineItemId("4khy3nwzktxv7")
                    .build()
            )
        assertThat(body.reason()).isEqualTo(CreditNoteCreateParams.Reason.DUPLICATE)
        assertThat(body.memo()).isEqualTo("An optional memo for my credit note.")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CreditNoteCreateParams.builder()
                .addLineItem(
                    CreditNoteCreateParams.LineItem.builder()
                        .amount("amount")
                        .invoiceLineItemId("4khy3nwzktxv7")
                        .build()
                )
                .reason(CreditNoteCreateParams.Reason.DUPLICATE)
                .build()

        val body = params._body()

        assertThat(body.lineItems())
            .containsExactly(
                CreditNoteCreateParams.LineItem.builder()
                    .amount("amount")
                    .invoiceLineItemId("4khy3nwzktxv7")
                    .build()
            )
        assertThat(body.reason()).isEqualTo(CreditNoteCreateParams.Reason.DUPLICATE)
    }
}
