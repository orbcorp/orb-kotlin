// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UnitConfigModelTest {

    @Test
    fun createUnitConfigModel() {
        val unitConfigModel = UnitConfigModel.builder().unitAmount("unit_amount").build()
        assertThat(unitConfigModel).isNotNull
        assertThat(unitConfigModel.unitAmount()).isEqualTo("unit_amount")
    }
}
