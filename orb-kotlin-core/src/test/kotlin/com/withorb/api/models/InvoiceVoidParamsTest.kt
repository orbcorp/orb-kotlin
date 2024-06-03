// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceVoidParamsTest {

    @Test
    fun createInvoiceVoidParams() {
        InvoiceVoidParams.builder().invoiceId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = InvoiceVoidParams.builder().invoiceId("string").build()
        assertThat(params).isNotNull
        // path param "invoiceId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
