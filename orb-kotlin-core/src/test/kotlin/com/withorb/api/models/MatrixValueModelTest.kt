// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MatrixValueModelTest {

    @Test
    fun createMatrixValueModel() {
        val matrixValueModel =
            MatrixValueModel.builder().addDimensionValue("string").unitAmount("unit_amount").build()
        assertThat(matrixValueModel).isNotNull
        assertThat(matrixValueModel.dimensionValues()).containsExactly("string")
        assertThat(matrixValueModel.unitAmount()).isEqualTo("unit_amount")
    }
}
