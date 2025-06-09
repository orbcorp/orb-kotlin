// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversionRateTierTest {

    @Test
    fun create() {
        val conversionRateTier =
            ConversionRateTier.builder()
                .firstUnit(0.0)
                .unitAmount("unit_amount")
                .lastUnit(0.0)
                .build()

        assertThat(conversionRateTier.firstUnit()).isEqualTo(0.0)
        assertThat(conversionRateTier.unitAmount()).isEqualTo("unit_amount")
        assertThat(conversionRateTier.lastUnit()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversionRateTier =
            ConversionRateTier.builder()
                .firstUnit(0.0)
                .unitAmount("unit_amount")
                .lastUnit(0.0)
                .build()

        val roundtrippedConversionRateTier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversionRateTier),
                jacksonTypeRef<ConversionRateTier>(),
            )

        assertThat(roundtrippedConversionRateTier).isEqualTo(conversionRateTier)
    }
}
