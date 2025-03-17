// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUnscheduleFixedFeeQuantityUpdatesParamsTest {

    @Test
    fun create() {
        SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
            .subscriptionId("subscription_id")
            .priceId("price_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
                .subscriptionId("subscription_id")
                .priceId("price_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.priceId()).isEqualTo("price_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
                .subscriptionId("subscription_id")
                .priceId("price_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.priceId()).isEqualTo("price_id")
    }

    @Test
    fun getPathParam() {
        val params =
            SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
                .subscriptionId("subscription_id")
                .priceId("price_id")
                .build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
