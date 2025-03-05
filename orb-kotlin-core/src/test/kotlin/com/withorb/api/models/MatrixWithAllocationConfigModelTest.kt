// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MatrixWithAllocationConfigModelTest {

    @Test
    fun createMatrixWithAllocationConfigModel() {
        val matrixWithAllocationConfigModel =
            MatrixWithAllocationConfigModel.builder()
                .allocation(0.0)
                .defaultUnitAmount("default_unit_amount")
                .addDimension("string")
                .addMatrixValue(
                    MatrixValueModel.builder()
                        .addDimensionValue("string")
                        .unitAmount("unit_amount")
                        .build()
                )
                .build()
        assertThat(matrixWithAllocationConfigModel).isNotNull
        assertThat(matrixWithAllocationConfigModel.allocation()).isEqualTo(0.0)
        assertThat(matrixWithAllocationConfigModel.defaultUnitAmount())
            .isEqualTo("default_unit_amount")
        assertThat(matrixWithAllocationConfigModel.dimensions()).containsExactly("string")
        assertThat(matrixWithAllocationConfigModel.matrixValues())
            .containsExactly(
                MatrixValueModel.builder()
                    .addDimensionValue("string")
                    .unitAmount("unit_amount")
                    .build()
            )
    }
}
