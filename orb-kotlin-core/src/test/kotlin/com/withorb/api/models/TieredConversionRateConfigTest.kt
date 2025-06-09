// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TieredConversionRateConfigTest {

    @Test
    fun create() {
        val tieredConversionRateConfig =
            TieredConversionRateConfig.builder()
                .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                .tieredConfig(
                    ConversionRateTieredConfig.builder()
                        .addTier(
                            ConversionRateTier.builder()
                                .firstUnit(0.0)
                                .unitAmount("unit_amount")
                                .lastUnit(0.0)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(tieredConversionRateConfig.conversionRateType())
            .isEqualTo(TieredConversionRateConfig.ConversionRateType.TIERED)
        assertThat(tieredConversionRateConfig.tieredConfig())
            .isEqualTo(
                ConversionRateTieredConfig.builder()
                    .addTier(
                        ConversionRateTier.builder()
                            .firstUnit(0.0)
                            .unitAmount("unit_amount")
                            .lastUnit(0.0)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tieredConversionRateConfig =
            TieredConversionRateConfig.builder()
                .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                .tieredConfig(
                    ConversionRateTieredConfig.builder()
                        .addTier(
                            ConversionRateTier.builder()
                                .firstUnit(0.0)
                                .unitAmount("unit_amount")
                                .lastUnit(0.0)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedTieredConversionRateConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tieredConversionRateConfig),
                jacksonTypeRef<TieredConversionRateConfig>(),
            )

        assertThat(roundtrippedTieredConversionRateConfig).isEqualTo(tieredConversionRateConfig)
    }
}
