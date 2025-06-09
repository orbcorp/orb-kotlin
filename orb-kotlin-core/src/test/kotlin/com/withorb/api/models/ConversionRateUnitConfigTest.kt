// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversionRateUnitConfigTest {

    @Test
    fun create() {
        val conversionRateUnitConfig =
            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()

        assertThat(conversionRateUnitConfig.unitAmount()).isEqualTo("unit_amount")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversionRateUnitConfig =
            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()

        val roundtrippedConversionRateUnitConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversionRateUnitConfig),
                jacksonTypeRef<ConversionRateUnitConfig>(),
            )

        assertThat(roundtrippedConversionRateUnitConfig).isEqualTo(conversionRateUnitConfig)
    }
}
