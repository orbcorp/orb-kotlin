// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversionRateTieredConfigTest {

    @Test
    fun create() {
        val conversionRateTieredConfig =
            ConversionRateTieredConfig.builder()
                .addTier(
                    ConversionRateTier.builder()
                        .firstUnit(0.0)
                        .unitAmount("unit_amount")
                        .lastUnit(0.0)
                        .build()
                )
                .build()

        assertThat(conversionRateTieredConfig.tiers())
            .containsExactly(
                ConversionRateTier.builder()
                    .firstUnit(0.0)
                    .unitAmount("unit_amount")
                    .lastUnit(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversionRateTieredConfig =
            ConversionRateTieredConfig.builder()
                .addTier(
                    ConversionRateTier.builder()
                        .firstUnit(0.0)
                        .unitAmount("unit_amount")
                        .lastUnit(0.0)
                        .build()
                )
                .build()

        val roundtrippedConversionRateTieredConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversionRateTieredConfig),
                jacksonTypeRef<ConversionRateTieredConfig>(),
            )

        assertThat(roundtrippedConversionRateTieredConfig).isEqualTo(conversionRateTieredConfig)
    }
}
