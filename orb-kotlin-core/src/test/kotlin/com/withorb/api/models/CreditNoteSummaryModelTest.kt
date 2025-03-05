// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditNoteSummaryModelTest {

    @Test
    fun createCreditNoteSummaryModel() {
        val creditNoteSummaryModel =
            CreditNoteSummaryModel.builder()
                .id("id")
                .creditNoteNumber("credit_note_number")
                .memo("memo")
                .reason("reason")
                .total("total")
                .type("type")
                .voidedAt(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
                .build()
        assertThat(creditNoteSummaryModel).isNotNull
        assertThat(creditNoteSummaryModel.id()).isEqualTo("id")
        assertThat(creditNoteSummaryModel.creditNoteNumber()).isEqualTo("credit_note_number")
        assertThat(creditNoteSummaryModel.memo()).isEqualTo("memo")
        assertThat(creditNoteSummaryModel.reason()).isEqualTo("reason")
        assertThat(creditNoteSummaryModel.total()).isEqualTo("total")
        assertThat(creditNoteSummaryModel.type()).isEqualTo("type")
        assertThat(creditNoteSummaryModel.voidedAt())
            .isEqualTo(OffsetDateTime.parse("2022-05-01T07:01:31+00:00"))
    }
}
