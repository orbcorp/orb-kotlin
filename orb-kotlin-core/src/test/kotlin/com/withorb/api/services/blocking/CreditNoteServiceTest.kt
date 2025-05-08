// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.CreditNoteCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditNoteServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditNoteService = client.creditNotes()

        val creditNote =
            creditNoteService.create(
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
            )

        creditNote.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditNoteService = client.creditNotes()

        val page = creditNoteService.list()

        page.response().validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditNoteService = client.creditNotes()

        val creditNote = creditNoteService.fetch("credit_note_id")

        creditNote.validate()
    }
}
