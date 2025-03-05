// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillableMetricTinyModelTest {

    @Test
    fun createBillableMetricTinyModel() {
        val billableMetricTinyModel = BillableMetricTinyModel.builder().id("id").build()
        assertThat(billableMetricTinyModel).isNotNull
        assertThat(billableMetricTinyModel.id()).isEqualTo("id")
    }
}
