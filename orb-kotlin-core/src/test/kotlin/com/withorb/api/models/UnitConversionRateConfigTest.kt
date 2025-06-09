// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UnitConversionRateConfigTest {

    @Test
    fun create() {
        val unitConversionRateConfig =
            UnitConversionRateConfig.builder()
                .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                .unitConfig(ConversionRateUnitConfig.builder().unitAmount("unit_amount").build())
                .build()

        assertThat(unitConversionRateConfig.conversionRateType())
            .isEqualTo(UnitConversionRateConfig.ConversionRateType.UNIT)
        assertThat(unitConversionRateConfig.unitConfig())
            .isEqualTo(ConversionRateUnitConfig.builder().unitAmount("unit_amount").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val unitConversionRateConfig =
            UnitConversionRateConfig.builder()
                .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                .unitConfig(ConversionRateUnitConfig.builder().unitAmount("unit_amount").build())
                .build()

        val roundtrippedUnitConversionRateConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unitConversionRateConfig),
                jacksonTypeRef<UnitConversionRateConfig>(),
            )

        assertThat(roundtrippedUnitConversionRateConfig).isEqualTo(unitConversionRateConfig)
    }
}
