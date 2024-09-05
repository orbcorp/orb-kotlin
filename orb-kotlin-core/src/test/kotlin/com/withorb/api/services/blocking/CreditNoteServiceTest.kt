// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.withorb.api.TestServerExtension
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.services.blocking.CreditNoteService
import com.withorb.api.models.CreditNoteListPage
import com.withorb.api.models.CreditNoteListParams
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class CreditNoteServiceTest {

    @Test
    fun callList() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val creditNoteService = client.creditNotes()
      val creditNotes = creditNoteService.list(CreditNoteListParams.builder().build())
      println(creditNotes)
      creditNotes.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callFetch() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val creditNoteService = client.creditNotes()
      val creditNote = creditNoteService.fetch(CreditNoteFetchParams.builder()
          .creditNoteId("credit_note_id")
          .build())
      println(creditNote)
      creditNote.validate()
    }
}
