// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.*
import com.withorb.api.models.CreditNoteListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CreditNoteServiceTest {

    @Test
    fun callCreate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditNoteService = client.creditNotes()
        val creditNote =
            creditNoteService.create(
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
            )
        println(creditNote)
        creditNote.validate()
    }

    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditNoteService = client.creditNotes()
        val creditNotes = creditNoteService.list(CreditNoteListParams.builder().build())
        println(creditNotes)
        creditNotes.data().forEach { it.validate() }
    }

    @Test
    fun callFetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditNoteService = client.creditNotes()
        val creditNote =
            creditNoteService.fetch(
                CreditNoteFetchParams.builder().creditNoteId("credit_note_id").build()
            )
        println(creditNote)
        creditNote.validate()
    }
}
