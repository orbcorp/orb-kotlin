// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceDeleteLineItemParamsTest {

    @Test
    fun create() {
        InvoiceDeleteLineItemParams.builder()
            .invoiceId("invoice_id")
            .lineItemId("line_item_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InvoiceDeleteLineItemParams.builder()
                .invoiceId("invoice_id")
                .lineItemId("line_item_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        assertThat(params._pathParam(1)).isEqualTo("line_item_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
