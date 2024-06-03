// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionUnscheduleFixedFeeQuantityUpdatesParamsTest {

    @Test
    fun createSubscriptionUnscheduleFixedFeeQuantityUpdatesParams() {
        SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
            .subscriptionId("string")
            .priceId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
                .subscriptionId("string")
                .priceId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.priceId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
                .subscriptionId("string")
                .priceId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.priceId()).isEqualTo("string")
    }

    @Test
    fun getPathParam() {
        val params =
            SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
                .subscriptionId("string")
                .priceId("string")
                .build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
