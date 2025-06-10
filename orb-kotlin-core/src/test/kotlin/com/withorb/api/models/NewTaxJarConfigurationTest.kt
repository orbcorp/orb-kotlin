// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewTaxJarConfigurationTest {

    @Test
    fun create() {
        val newTaxJarConfiguration =
            NewTaxJarConfiguration.builder()
                .taxExempt(true)
                .taxProvider(NewTaxJarConfiguration.TaxProvider.TAXJAR)
                .build()

        assertThat(newTaxJarConfiguration.taxExempt()).isEqualTo(true)
        assertThat(newTaxJarConfiguration.taxProvider())
            .isEqualTo(NewTaxJarConfiguration.TaxProvider.TAXJAR)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newTaxJarConfiguration =
            NewTaxJarConfiguration.builder()
                .taxExempt(true)
                .taxProvider(NewTaxJarConfiguration.TaxProvider.TAXJAR)
                .build()

        val roundtrippedNewTaxJarConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newTaxJarConfiguration),
                jacksonTypeRef<NewTaxJarConfiguration>(),
            )

        assertThat(roundtrippedNewTaxJarConfiguration).isEqualTo(newTaxJarConfiguration)
    }
}
