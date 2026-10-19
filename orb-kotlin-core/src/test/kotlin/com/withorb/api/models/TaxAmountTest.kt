// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaxAmountTest {

    @Test
    fun create() {
        val taxAmount =
            TaxAmount.builder()
                .amount("amount")
                .taxRateDescription("tax_rate_description")
                .taxRatePercentage("tax_rate_percentage")
                .taxReason(TaxAmount.TaxReason.TAXED)
                .build()

        assertThat(taxAmount.amount()).isEqualTo("amount")
        assertThat(taxAmount.taxRateDescription()).isEqualTo("tax_rate_description")
        assertThat(taxAmount.taxRatePercentage()).isEqualTo("tax_rate_percentage")
        assertThat(taxAmount.taxReason()).isEqualTo(TaxAmount.TaxReason.TAXED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val taxAmount =
            TaxAmount.builder()
                .amount("amount")
                .taxRateDescription("tax_rate_description")
                .taxRatePercentage("tax_rate_percentage")
                .taxReason(TaxAmount.TaxReason.TAXED)
                .build()

        val roundtrippedTaxAmount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(taxAmount),
                jacksonTypeRef<TaxAmount>(),
            )

        assertThat(roundtrippedTaxAmount).isEqualTo(taxAmount)
    }
}
