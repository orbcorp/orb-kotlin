// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceMarkPaidParamsTest {

    @Test
    fun create() {
        InvoiceMarkPaidParams.builder()
            .invoiceId("invoice_id")
            .paymentReceivedDate(LocalDate.parse("2023-09-22"))
            .externalId("external_payment_id_123")
            .notes("notes")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InvoiceMarkPaidParams.builder()
                .invoiceId("invoice_id")
                .paymentReceivedDate(LocalDate.parse("2023-09-22"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InvoiceMarkPaidParams.builder()
                .invoiceId("invoice_id")
                .paymentReceivedDate(LocalDate.parse("2023-09-22"))
                .externalId("external_payment_id_123")
                .notes("notes")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.paymentReceivedDate()).isEqualTo(LocalDate.parse("2023-09-22"))
        assertThat(body.externalId()).isEqualTo("external_payment_id_123")
        assertThat(body.notes()).isEqualTo("notes")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvoiceMarkPaidParams.builder()
                .invoiceId("invoice_id")
                .paymentReceivedDate(LocalDate.parse("2023-09-22"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.paymentReceivedDate()).isEqualTo(LocalDate.parse("2023-09-22"))
    }
}
