// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BpsConfigModelTest {

    @Test
    fun createBpsConfigModel() {
        val bpsConfigModel =
            BpsConfigModel.builder().bps(0.0).perUnitMaximum("per_unit_maximum").build()
        assertThat(bpsConfigModel).isNotNull
        assertThat(bpsConfigModel.bps()).isEqualTo(0.0)
        assertThat(bpsConfigModel.perUnitMaximum()).isEqualTo("per_unit_maximum")
    }
}
