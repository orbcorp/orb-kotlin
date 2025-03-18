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
    fun pathParams() {
        val params = CreditNoteFetchParams.builder().creditNoteId("credit_note_id").build()

        assertThat(params._pathParam(0)).isEqualTo("credit_note_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
