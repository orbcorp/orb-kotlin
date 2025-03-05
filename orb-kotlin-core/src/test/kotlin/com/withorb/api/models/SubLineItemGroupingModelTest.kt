// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubLineItemGroupingModelTest {

    @Test
    fun createSubLineItemGroupingModel() {
        val subLineItemGroupingModel =
            SubLineItemGroupingModel.builder().key("region").value("west").build()
        assertThat(subLineItemGroupingModel).isNotNull
        assertThat(subLineItemGroupingModel.key()).isEqualTo("region")
        assertThat(subLineItemGroupingModel.value()).isEqualTo("west")
    }
}
