// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionUnscheduleCancellationParamsTest {

    @Test
    fun create() {
        SubscriptionUnscheduleCancellationParams.builder().subscriptionId("subscription_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            SubscriptionUnscheduleCancellationParams.builder()
                .subscriptionId("subscription_id")
                .build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
