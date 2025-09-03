// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatrixWithAllocationConfigTest {

    @Test
    fun create() {
        val matrixWithAllocationConfig =
            MatrixWithAllocationConfig.builder()
                .allocation("allocation")
                .defaultUnitAmount("default_unit_amount")
                .addDimension("string")
                .addMatrixValue(
                    MatrixWithAllocationConfig.MatrixValue.builder()
                        .addDimensionValue("string")
                        .unitAmount("unit_amount")
                        .build()
                )
                .build()

        assertThat(matrixWithAllocationConfig.allocation()).isEqualTo("allocation")
        assertThat(matrixWithAllocationConfig.defaultUnitAmount()).isEqualTo("default_unit_amount")
        assertThat(matrixWithAllocationConfig.dimensions()).containsExactly("string")
        assertThat(matrixWithAllocationConfig.matrixValues())
            .containsExactly(
                MatrixWithAllocationConfig.MatrixValue.builder()
                    .addDimensionValue("string")
                    .unitAmount("unit_amount")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val matrixWithAllocationConfig =
            MatrixWithAllocationConfig.builder()
                .allocation("allocation")
                .defaultUnitAmount("default_unit_amount")
                .addDimension("string")
                .addMatrixValue(
                    MatrixWithAllocationConfig.MatrixValue.builder()
                        .addDimensionValue("string")
                        .unitAmount("unit_amount")
                        .build()
                )
                .build()

        val roundtrippedMatrixWithAllocationConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(matrixWithAllocationConfig),
                jacksonTypeRef<MatrixWithAllocationConfig>(),
            )

        assertThat(roundtrippedMatrixWithAllocationConfig).isEqualTo(matrixWithAllocationConfig)
    }
}
