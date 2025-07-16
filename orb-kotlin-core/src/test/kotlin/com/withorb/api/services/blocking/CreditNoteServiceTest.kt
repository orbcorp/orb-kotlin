// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.CreditNoteCreateParams
import java.time.LocalDate
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
                            .endDate(LocalDate.parse("2023-09-22"))
                            .startDate(LocalDate.parse("2023-09-22"))
                            .build()
                    )
                    .reason(CreditNoteCreateParams.Reason.DUPLICATE)
                    .endDate(LocalDate.parse("2023-09-22"))
                    .memo("An optional memo for my credit note.")
                    .startDate(LocalDate.parse("2023-09-22"))
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
