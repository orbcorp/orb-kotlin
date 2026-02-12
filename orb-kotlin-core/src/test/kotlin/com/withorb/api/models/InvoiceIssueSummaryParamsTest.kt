// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceIssueSummaryParamsTest {

    @Test
    fun create() {
        InvoiceIssueSummaryParams.builder().invoiceId("invoice_id").synchronous(true).build()
    }

    @Test
    fun pathParams() {
        val params = InvoiceIssueSummaryParams.builder().invoiceId("invoice_id").build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InvoiceIssueSummaryParams.builder().invoiceId("invoice_id").synchronous(true).build()

        val body = params._body()

        assertThat(body.synchronous()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InvoiceIssueSummaryParams.builder().invoiceId("invoice_id").build()

        val body = params._body()
    }
}
