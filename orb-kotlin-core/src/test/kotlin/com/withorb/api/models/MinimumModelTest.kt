// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MinimumModelTest {

    @Test
    fun createMinimumModel() {
        val minimumModel =
            MinimumModel.builder()
                .addAppliesToPriceId("string")
                .minimumAmount("minimum_amount")
                .build()
        assertThat(minimumModel).isNotNull
        assertThat(minimumModel.appliesToPriceIds()).containsExactly("string")
        assertThat(minimumModel.minimumAmount()).isEqualTo("minimum_amount")
    }
}
