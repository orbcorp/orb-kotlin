// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.test.assertNotNull
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
            .memo("An optional memo for my credit note.")
            .reason(CreditNoteCreateParams.Reason.DUPLICATE)
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
                .memo("An optional memo for my credit note.")
                .reason(CreditNoteCreateParams.Reason.DUPLICATE)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.lineItems())
            .containsExactly(
                CreditNoteCreateParams.LineItem.builder()
                    .amount("amount")
                    .invoiceLineItemId("4khy3nwzktxv7")
                    .build()
            )
        assertThat(body.memo()).isEqualTo("An optional memo for my credit note.")
        assertThat(body.reason()).isEqualTo(CreditNoteCreateParams.Reason.DUPLICATE)
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
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.lineItems())
            .containsExactly(
                CreditNoteCreateParams.LineItem.builder()
                    .amount("amount")
                    .invoiceLineItemId("4khy3nwzktxv7")
                    .build()
            )
    }
}
