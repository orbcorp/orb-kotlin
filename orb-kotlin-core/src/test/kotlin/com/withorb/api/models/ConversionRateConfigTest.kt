// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import com.withorb.api.errors.OrbInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ConversionRateConfigTest {

    @Test
    fun ofUnit() {
        val unit =
            UnitConversionRateConfig.builder()
                .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                .unitConfig(ConversionRateUnitConfig.builder().unitAmount("unit_amount").build())
                .build()

        val conversionRateConfig = ConversionRateConfig.ofUnit(unit)

        assertThat(conversionRateConfig.unit()).isEqualTo(unit)
        assertThat(conversionRateConfig.tiered()).isNull()
    }

    @Test
    fun ofUnitRoundtrip() {
        val jsonMapper = jsonMapper()
        val conversionRateConfig =
            ConversionRateConfig.ofUnit(
                UnitConversionRateConfig.builder()
                    .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                    .unitConfig(
                        ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                    )
                    .build()
            )

        val roundtrippedConversionRateConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversionRateConfig),
                jacksonTypeRef<ConversionRateConfig>(),
            )

        assertThat(roundtrippedConversionRateConfig).isEqualTo(conversionRateConfig)
    }

    @Test
    fun ofTiered() {
        val tiered =
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

        val conversionRateConfig = ConversionRateConfig.ofTiered(tiered)

        assertThat(conversionRateConfig.unit()).isNull()
        assertThat(conversionRateConfig.tiered()).isEqualTo(tiered)
    }

    @Test
    fun ofTieredRoundtrip() {
        val jsonMapper = jsonMapper()
        val conversionRateConfig =
            ConversionRateConfig.ofTiered(
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
            )

        val roundtrippedConversionRateConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversionRateConfig),
                jacksonTypeRef<ConversionRateConfig>(),
            )

        assertThat(roundtrippedConversionRateConfig).isEqualTo(conversionRateConfig)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val conversionRateConfig =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ConversionRateConfig>())

        val e = assertThrows<OrbInvalidDataException> { conversionRateConfig.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
