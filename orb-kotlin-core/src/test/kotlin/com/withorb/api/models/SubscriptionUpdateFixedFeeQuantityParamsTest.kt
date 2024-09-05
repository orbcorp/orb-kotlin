// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionUpdateFixedFeeQuantityParamsTest {

    @Test
    fun createSubscriptionUpdateFixedFeeQuantityParams() {
        SubscriptionUpdateFixedFeeQuantityParams.builder()
            .subscriptionId("subscription_id")
            .priceId("price_id")
            .quantity(42.23)
            .changeOption(SubscriptionUpdateFixedFeeQuantityParams.ChangeOption.IMMEDIATE)
            .effectiveDate(LocalDate.parse("2022-12-21"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SubscriptionUpdateFixedFeeQuantityParams.builder()
                .subscriptionId("subscription_id")
                .priceId("price_id")
                .quantity(42.23)
                .changeOption(SubscriptionUpdateFixedFeeQuantityParams.ChangeOption.IMMEDIATE)
                .effectiveDate(LocalDate.parse("2022-12-21"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.priceId()).isEqualTo("price_id")
        assertThat(body.quantity()).isEqualTo(42.23)
        assertThat(body.changeOption())
            .isEqualTo(SubscriptionUpdateFixedFeeQuantityParams.ChangeOption.IMMEDIATE)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2022-12-21"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SubscriptionUpdateFixedFeeQuantityParams.builder()
                .subscriptionId("subscription_id")
                .priceId("price_id")
                .quantity(42.23)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.priceId()).isEqualTo("price_id")
        assertThat(body.quantity()).isEqualTo(42.23)
    }

    @Test
    fun getPathParam() {
        val params =
            SubscriptionUpdateFixedFeeQuantityParams.builder()
                .subscriptionId("subscription_id")
                .priceId("price_id")
                .quantity(42.23)
                .build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
