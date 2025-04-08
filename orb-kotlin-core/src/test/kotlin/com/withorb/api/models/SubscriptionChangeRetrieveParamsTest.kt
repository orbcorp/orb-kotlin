// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionChangeRetrieveParamsTest {

    @Test
    fun create() {
        SubscriptionChangeRetrieveParams.builder()
            .subscriptionChangeId("subscription_change_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionChangeRetrieveParams.builder()
                .subscriptionChangeId("subscription_change_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_change_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
