// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopUpInvoiceSettingsTest {

    @Test
    fun create() {
        val topUpInvoiceSettings =
            TopUpInvoiceSettings.builder()
                .autoCollection(true)
                .netTerms(0L)
                .memo("memo")
                .requireSuccessfulPayment(true)
                .build()

        assertThat(topUpInvoiceSettings.autoCollection()).isEqualTo(true)
        assertThat(topUpInvoiceSettings.netTerms()).isEqualTo(0L)
        assertThat(topUpInvoiceSettings.memo()).isEqualTo("memo")
        assertThat(topUpInvoiceSettings.requireSuccessfulPayment()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val topUpInvoiceSettings =
            TopUpInvoiceSettings.builder()
                .autoCollection(true)
                .netTerms(0L)
                .memo("memo")
                .requireSuccessfulPayment(true)
                .build()

        val roundtrippedTopUpInvoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(topUpInvoiceSettings),
                jacksonTypeRef<TopUpInvoiceSettings>(),
            )

        assertThat(roundtrippedTopUpInvoiceSettings).isEqualTo(topUpInvoiceSettings)
    }
}
