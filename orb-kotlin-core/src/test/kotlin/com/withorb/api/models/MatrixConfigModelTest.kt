// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MatrixConfigModelTest {

    @Test
    fun createMatrixConfigModel() {
        val matrixConfigModel =
            MatrixConfigModel.builder()
                .defaultUnitAmount("default_unit_amount")
                .addDimension("string")
                .addMatrixValue(
                    MatrixValueModel.builder()
                        .addDimensionValue("string")
                        .unitAmount("unit_amount")
                        .build()
                )
                .build()
        assertThat(matrixConfigModel).isNotNull
        assertThat(matrixConfigModel.defaultUnitAmount()).isEqualTo("default_unit_amount")
        assertThat(matrixConfigModel.dimensions()).containsExactly("string")
        assertThat(matrixConfigModel.matrixValues())
            .containsExactly(
                MatrixValueModel.builder()
                    .addDimensionValue("string")
                    .unitAmount("unit_amount")
                    .build()
            )
    }
}
