// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceUpdateParamsTest {

    @Test
    fun createInvoiceUpdateParams() {
        InvoiceUpdateParams.builder()
            .invoiceId("invoice_id")
            .metadata(
                InvoiceUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InvoiceUpdateParams.builder()
                .invoiceId("invoice_id")
                .metadata(
                    InvoiceUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.metadata())
            .isEqualTo(
                InvoiceUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = InvoiceUpdateParams.builder().invoiceId("invoice_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = InvoiceUpdateParams.builder().invoiceId("invoice_id").build()
        assertThat(params).isNotNull
        // path param "invoiceId"
        assertThat(params.getPathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
