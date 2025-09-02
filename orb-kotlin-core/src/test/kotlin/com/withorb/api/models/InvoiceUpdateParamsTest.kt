// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceUpdateParamsTest {

    @Test
    fun create() {
        InvoiceUpdateParams.builder()
            .invoiceId("invoice_id")
            .dueDate(LocalDate.parse("2023-09-22"))
            .metadata(
                InvoiceUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .netTerms(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = InvoiceUpdateParams.builder().invoiceId("invoice_id").build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InvoiceUpdateParams.builder()
                .invoiceId("invoice_id")
                .dueDate(LocalDate.parse("2023-09-22"))
                .metadata(
                    InvoiceUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .netTerms(0L)
                .build()

        val body = params._body()

        assertThat(body.dueDate())
            .isEqualTo(InvoiceUpdateParams.DueDate.ofDate(LocalDate.parse("2023-09-22")))
        assertThat(body.metadata())
            .isEqualTo(
                InvoiceUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.netTerms()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InvoiceUpdateParams.builder().invoiceId("invoice_id").build()

        val body = params._body()
    }
}
