// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionChangeMinifiedTest {

    @Test
    fun create() {
        val subscriptionChangeMinified = SubscriptionChangeMinified.builder().id("id").build()

        assertThat(subscriptionChangeMinified.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionChangeMinified = SubscriptionChangeMinified.builder().id("id").build()

        val roundtrippedSubscriptionChangeMinified =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionChangeMinified),
                jacksonTypeRef<SubscriptionChangeMinified>(),
            )

        assertThat(roundtrippedSubscriptionChangeMinified).isEqualTo(subscriptionChangeMinified)
    }
}
