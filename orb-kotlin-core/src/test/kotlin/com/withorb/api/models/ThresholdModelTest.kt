// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ThresholdModelTest {

    @Test
    fun createThresholdModel() {
        val thresholdModel = ThresholdModel.builder().value(0.0).build()
        assertThat(thresholdModel).isNotNull
        assertThat(thresholdModel.value()).isEqualTo(0.0)
    }
}
