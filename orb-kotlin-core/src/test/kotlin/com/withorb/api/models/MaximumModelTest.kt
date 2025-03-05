// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaximumModelTest {

    @Test
    fun createMaximumModel() {
        val maximumModel =
            MaximumModel.builder()
                .addAppliesToPriceId("string")
                .maximumAmount("maximum_amount")
                .build()
        assertThat(maximumModel).isNotNull
        assertThat(maximumModel.appliesToPriceIds()).containsExactly("string")
        assertThat(maximumModel.maximumAmount()).isEqualTo("maximum_amount")
    }
}
