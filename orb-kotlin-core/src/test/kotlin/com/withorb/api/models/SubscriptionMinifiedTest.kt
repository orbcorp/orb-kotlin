// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionMinifiedTest {

    @Test
    fun create() {
        val subscriptionMinified = SubscriptionMinified.builder().id("VDGsT23osdLb84KD").build()

        assertThat(subscriptionMinified.id()).isEqualTo("VDGsT23osdLb84KD")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionMinified = SubscriptionMinified.builder().id("VDGsT23osdLb84KD").build()

        val roundtrippedSubscriptionMinified =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionMinified),
                jacksonTypeRef<SubscriptionMinified>(),
            )

        assertThat(roundtrippedSubscriptionMinified).isEqualTo(subscriptionMinified)
    }
}
