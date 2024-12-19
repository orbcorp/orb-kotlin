// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceMarkPaidParamsTest {

    @Test
    fun createInvoiceMarkPaidParams() {
        InvoiceMarkPaidParams.builder()
            .invoiceId("invoice_id")
            .paymentReceivedDate(LocalDate.parse("2023-09-22"))
            .externalId("external_payment_id_123")
            .notes("notes")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InvoiceMarkPaidParams.builder()
                .invoiceId("invoice_id")
                .paymentReceivedDate(LocalDate.parse("2023-09-22"))
                .externalId("external_payment_id_123")
                .notes("notes")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.paymentReceivedDate()).isEqualTo(LocalDate.parse("2023-09-22"))
        assertThat(body.externalId()).isEqualTo("external_payment_id_123")
        assertThat(body.notes()).isEqualTo("notes")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InvoiceMarkPaidParams.builder()
                .invoiceId("invoice_id")
                .paymentReceivedDate(LocalDate.parse("2023-09-22"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.paymentReceivedDate()).isEqualTo(LocalDate.parse("2023-09-22"))
    }

    @Test
    fun getPathParam() {
        val params =
            InvoiceMarkPaidParams.builder()
                .invoiceId("invoice_id")
                .paymentReceivedDate(LocalDate.parse("2023-09-22"))
                .build()
        assertThat(params).isNotNull
        // path param "invoiceId"
        assertThat(params.getPathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
