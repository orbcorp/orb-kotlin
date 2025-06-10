// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceTinyTest {

    @Test
    fun create() {
        val invoiceTiny = InvoiceTiny.builder().id("gXcsPTVyC4YZa3Sc").build()

        assertThat(invoiceTiny.id()).isEqualTo("gXcsPTVyC4YZa3Sc")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceTiny = InvoiceTiny.builder().id("gXcsPTVyC4YZa3Sc").build()

        val roundtrippedInvoiceTiny =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceTiny),
                jacksonTypeRef<InvoiceTiny>(),
            )

        assertThat(roundtrippedInvoiceTiny).isEqualTo(invoiceTiny)
    }
}
