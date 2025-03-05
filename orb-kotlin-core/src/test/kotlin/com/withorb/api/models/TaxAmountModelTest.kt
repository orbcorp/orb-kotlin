// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TaxAmountModelTest {

    @Test
    fun createTaxAmountModel() {
        val taxAmountModel =
            TaxAmountModel.builder()
                .amount("amount")
                .taxRateDescription("tax_rate_description")
                .taxRatePercentage("tax_rate_percentage")
                .build()
        assertThat(taxAmountModel).isNotNull
        assertThat(taxAmountModel.amount()).isEqualTo("amount")
        assertThat(taxAmountModel.taxRateDescription()).isEqualTo("tax_rate_description")
        assertThat(taxAmountModel.taxRatePercentage()).isEqualTo("tax_rate_percentage")
    }
}
