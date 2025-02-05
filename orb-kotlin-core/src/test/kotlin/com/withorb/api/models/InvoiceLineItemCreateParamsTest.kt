// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceLineItemCreateParamsTest {

    @Test
    fun create() {
        InvoiceLineItemCreateParams.builder()
            .amount("12.00")
            .endDate(LocalDate.parse("2023-09-22"))
            .invoiceId("4khy3nwzktxv7")
            .name("Item Name")
            .quantity(1.0)
            .startDate(LocalDate.parse("2023-09-22"))
            .build()
    }

    @Test
    fun body() {
        val params =
            InvoiceLineItemCreateParams.builder()
                .amount("12.00")
                .endDate(LocalDate.parse("2023-09-22"))
                .invoiceId("4khy3nwzktxv7")
                .name("Item Name")
                .quantity(1.0)
                .startDate(LocalDate.parse("2023-09-22"))
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo("12.00")
        assertThat(body.endDate()).isEqualTo(LocalDate.parse("2023-09-22"))
        assertThat(body.invoiceId()).isEqualTo("4khy3nwzktxv7")
        assertThat(body.name()).isEqualTo("Item Name")
        assertThat(body.quantity()).isEqualTo(1.0)
        assertThat(body.startDate()).isEqualTo(LocalDate.parse("2023-09-22"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvoiceLineItemCreateParams.builder()
                .amount("12.00")
                .endDate(LocalDate.parse("2023-09-22"))
                .invoiceId("4khy3nwzktxv7")
                .name("Item Name")
                .quantity(1.0)
                .startDate(LocalDate.parse("2023-09-22"))
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo("12.00")
        assertThat(body.endDate()).isEqualTo(LocalDate.parse("2023-09-22"))
        assertThat(body.invoiceId()).isEqualTo("4khy3nwzktxv7")
        assertThat(body.name()).isEqualTo("Item Name")
        assertThat(body.quantity()).isEqualTo(1.0)
        assertThat(body.startDate()).isEqualTo(LocalDate.parse("2023-09-22"))
    }
}
