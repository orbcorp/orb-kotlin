// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
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
                    .endDate(LocalDate.parse("2023-09-22"))
                    .startDate(LocalDate.parse("2023-09-22"))
                    .build()
            )
            .reason(CreditNoteCreateParams.Reason.DUPLICATE)
            .endDate(LocalDate.parse("2023-09-22"))
            .memo("An optional memo for my credit note.")
            .startDate(LocalDate.parse("2023-09-22"))
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
                        .endDate(LocalDate.parse("2023-09-22"))
                        .startDate(LocalDate.parse("2023-09-22"))
                        .build()
                )
                .reason(CreditNoteCreateParams.Reason.DUPLICATE)
                .endDate(LocalDate.parse("2023-09-22"))
                .memo("An optional memo for my credit note.")
                .startDate(LocalDate.parse("2023-09-22"))
                .build()

        val body = params._body()

        assertThat(body.lineItems())
            .containsExactly(
                CreditNoteCreateParams.LineItem.builder()
                    .amount("amount")
                    .invoiceLineItemId("4khy3nwzktxv7")
                    .endDate(LocalDate.parse("2023-09-22"))
                    .startDate(LocalDate.parse("2023-09-22"))
                    .build()
            )
        assertThat(body.reason()).isEqualTo(CreditNoteCreateParams.Reason.DUPLICATE)
        assertThat(body.endDate()).isEqualTo(LocalDate.parse("2023-09-22"))
        assertThat(body.memo()).isEqualTo("An optional memo for my credit note.")
        assertThat(body.startDate()).isEqualTo(LocalDate.parse("2023-09-22"))
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
