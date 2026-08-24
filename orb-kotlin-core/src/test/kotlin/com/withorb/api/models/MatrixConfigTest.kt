// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatrixConfigTest {

    @Test
    fun create() {
        val matrixConfig =
            MatrixConfig.builder()
                .defaultUnitAmount("default_unit_amount")
                .addDimension("string")
                .addMatrixValue(
                    MatrixValue.builder()
                        .addDimensionValue("string")
                        .unitAmount("unit_amount")
                        .scalingFactor(0.0)
                        .build()
                )
                .scalingFactor(0.0)
                .build()

        assertThat(matrixConfig.defaultUnitAmount()).isEqualTo("default_unit_amount")
        assertThat(matrixConfig.dimensions()).containsExactly("string")
        assertThat(matrixConfig.matrixValues())
            .containsExactly(
                MatrixValue.builder()
                    .addDimensionValue("string")
                    .unitAmount("unit_amount")
                    .scalingFactor(0.0)
                    .build()
            )
        assertThat(matrixConfig.scalingFactor()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val matrixConfig =
            MatrixConfig.builder()
                .defaultUnitAmount("default_unit_amount")
                .addDimension("string")
                .addMatrixValue(
                    MatrixValue.builder()
                        .addDimensionValue("string")
                        .unitAmount("unit_amount")
                        .scalingFactor(0.0)
                        .build()
                )
                .scalingFactor(0.0)
                .build()

        val roundtrippedMatrixConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(matrixConfig),
                jacksonTypeRef<MatrixConfig>(),
            )

        assertThat(roundtrippedMatrixConfig).isEqualTo(matrixConfig)
    }
}
