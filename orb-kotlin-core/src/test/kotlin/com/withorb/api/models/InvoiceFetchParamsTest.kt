// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceFetchParamsTest {

    @Test
    fun create() {
        InvoiceFetchParams.builder()
            .invoiceId("invoice_id")
            .includeZeroQuantityLineItems(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = InvoiceFetchParams.builder().invoiceId("invoice_id").build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InvoiceFetchParams.builder()
                .invoiceId("invoice_id")
                .includeZeroQuantityLineItems(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("include_zero_quantity_line_items", "true").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InvoiceFetchParams.builder().invoiceId("invoice_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
