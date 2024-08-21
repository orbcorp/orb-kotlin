// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceLineItemCreateParamsTest {

    @Test
    fun createInvoiceLineItemCreateParams() {
        InvoiceLineItemCreateParams.builder()
            .amount("12.00")
            .endDate(LocalDate.parse("2023-09-22"))
            .invoiceId("4khy3nwzktxv7")
            .name("Item Name")
            .quantity(42.23)
            .startDate(LocalDate.parse("2023-09-22"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InvoiceLineItemCreateParams.builder()
                .amount("12.00")
                .endDate(LocalDate.parse("2023-09-22"))
                .invoiceId("4khy3nwzktxv7")
                .name("Item Name")
                .quantity(42.23)
                .startDate(LocalDate.parse("2023-09-22"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo("12.00")
        assertThat(body.endDate()).isEqualTo(LocalDate.parse("2023-09-22"))
        assertThat(body.invoiceId()).isEqualTo("4khy3nwzktxv7")
        assertThat(body.name()).isEqualTo("Item Name")
        assertThat(body.quantity()).isEqualTo(42.23)
        assertThat(body.startDate()).isEqualTo(LocalDate.parse("2023-09-22"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InvoiceLineItemCreateParams.builder()
                .amount("12.00")
                .endDate(LocalDate.parse("2023-09-22"))
                .invoiceId("4khy3nwzktxv7")
                .name("Item Name")
                .quantity(42.23)
                .startDate(LocalDate.parse("2023-09-22"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo("12.00")
        assertThat(body.endDate()).isEqualTo(LocalDate.parse("2023-09-22"))
        assertThat(body.invoiceId()).isEqualTo("4khy3nwzktxv7")
        assertThat(body.name()).isEqualTo("Item Name")
        assertThat(body.quantity()).isEqualTo(42.23)
        assertThat(body.startDate()).isEqualTo(LocalDate.parse("2023-09-22"))
    }
}
