// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionMinifiedModelTest {

    @Test
    fun createSubscriptionMinifiedModel() {
        val subscriptionMinifiedModel =
            SubscriptionMinifiedModel.builder().id("VDGsT23osdLb84KD").build()
        assertThat(subscriptionMinifiedModel).isNotNull
        assertThat(subscriptionMinifiedModel.id()).isEqualTo("VDGsT23osdLb84KD")
    }
}
