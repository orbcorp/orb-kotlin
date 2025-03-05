// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RemoveSubscriptionAdjustmentParamsTest {

    @Test
    fun createRemoveSubscriptionAdjustmentParams() {
        val removeSubscriptionAdjustmentParams =
            RemoveSubscriptionAdjustmentParams.builder().adjustmentId("h74gfhdjvn7ujokd").build()
        assertThat(removeSubscriptionAdjustmentParams).isNotNull
        assertThat(removeSubscriptionAdjustmentParams.adjustmentId()).isEqualTo("h74gfhdjvn7ujokd")
    }
}
