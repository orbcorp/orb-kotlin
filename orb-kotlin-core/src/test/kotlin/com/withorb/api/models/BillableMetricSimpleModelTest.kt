// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillableMetricSimpleModelTest {

    @Test
    fun createBillableMetricSimpleModel() {
        val billableMetricSimpleModel =
            BillableMetricSimpleModel.builder().id("id").name("name").build()
        assertThat(billableMetricSimpleModel).isNotNull
        assertThat(billableMetricSimpleModel.id()).isEqualTo("id")
        assertThat(billableMetricSimpleModel.name()).isEqualTo("name")
    }
}
