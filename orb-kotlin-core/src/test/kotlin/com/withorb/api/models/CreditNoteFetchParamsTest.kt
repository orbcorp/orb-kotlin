// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditNoteFetchParamsTest {

    @Test
    fun create() {
        CreditNoteFetchParams.builder().creditNoteId("credit_note_id").build()
    }

    @Test
    fun getPathParam() {
        val params = CreditNoteFetchParams.builder().creditNoteId("credit_note_id").build()
        assertThat(params).isNotNull
        // path param "creditNoteId"
        assertThat(params.getPathParam(0)).isEqualTo("credit_note_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
