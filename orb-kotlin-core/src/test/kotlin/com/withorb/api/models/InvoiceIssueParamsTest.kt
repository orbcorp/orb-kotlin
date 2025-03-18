// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceIssueParamsTest {

    @Test
    fun create() {
        InvoiceIssueParams.builder().invoiceId("invoice_id").synchronous(true).build()
    }

    @Test
    fun pathParams() {
        val params = InvoiceIssueParams.builder().invoiceId("invoice_id").build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = InvoiceIssueParams.builder().invoiceId("invoice_id").synchronous(true).build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.synchronous()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InvoiceIssueParams.builder().invoiceId("invoice_id").build()

        val body = params._body()

        assertNotNull(body)
    }
}
