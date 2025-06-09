// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewAvalaraTaxConfigurationTest {

    @Test
    fun create() {
        val newAvalaraTaxConfiguration =
            NewAvalaraTaxConfiguration.builder()
                .taxExempt(true)
                .taxProvider(NewAvalaraTaxConfiguration.TaxProvider.AVALARA)
                .taxExemptionCode("tax_exemption_code")
                .build()

        assertThat(newAvalaraTaxConfiguration.taxExempt()).isEqualTo(true)
        assertThat(newAvalaraTaxConfiguration.taxProvider())
            .isEqualTo(NewAvalaraTaxConfiguration.TaxProvider.AVALARA)
        assertThat(newAvalaraTaxConfiguration.taxExemptionCode()).isEqualTo("tax_exemption_code")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newAvalaraTaxConfiguration =
            NewAvalaraTaxConfiguration.builder()
                .taxExempt(true)
                .taxProvider(NewAvalaraTaxConfiguration.TaxProvider.AVALARA)
                .taxExemptionCode("tax_exemption_code")
                .build()

        val roundtrippedNewAvalaraTaxConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newAvalaraTaxConfiguration),
                jacksonTypeRef<NewAvalaraTaxConfiguration>(),
            )

        assertThat(roundtrippedNewAvalaraTaxConfiguration).isEqualTo(newAvalaraTaxConfiguration)
    }
}
