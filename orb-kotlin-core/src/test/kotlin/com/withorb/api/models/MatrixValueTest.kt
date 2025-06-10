// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatrixValueTest {

    @Test
    fun create() {
        val matrixValue =
            MatrixValue.builder().addDimensionValue("string").unitAmount("unit_amount").build()

        assertThat(matrixValue.dimensionValues()).containsExactly("string")
        assertThat(matrixValue.unitAmount()).isEqualTo("unit_amount")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val matrixValue =
            MatrixValue.builder().addDimensionValue("string").unitAmount("unit_amount").build()

        val roundtrippedMatrixValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(matrixValue),
                jacksonTypeRef<MatrixValue>(),
            )

        assertThat(roundtrippedMatrixValue).isEqualTo(matrixValue)
    }
}
