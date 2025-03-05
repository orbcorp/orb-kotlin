// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AllocationModelTest {

    @Test
    fun createAllocationModel() {
        val allocationModel =
            AllocationModel.builder().allowsRollover(true).currency("currency").build()
        assertThat(allocationModel).isNotNull
        assertThat(allocationModel.allowsRollover()).isEqualTo(true)
        assertThat(allocationModel.currency()).isEqualTo("currency")
    }
}
