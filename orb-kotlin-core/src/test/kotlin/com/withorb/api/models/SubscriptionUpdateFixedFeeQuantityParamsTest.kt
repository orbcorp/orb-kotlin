// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionUpdateFixedFeeQuantityParamsTest {

    @Test
    fun create() {
        SubscriptionUpdateFixedFeeQuantityParams.builder()
            .subscriptionId("subscription_id")
            .priceId("price_id")
            .quantity(0.0)
            .allowInvoiceCreditOrVoid(true)
            .changeOption(SubscriptionUpdateFixedFeeQuantityParams.ChangeOption.IMMEDIATE)
            .effectiveDate(LocalDate.parse("2022-12-21"))
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionUpdateFixedFeeQuantityParams.builder()
                .subscriptionId("subscription_id")
                .priceId("price_id")
                .quantity(0.0)
                .allowInvoiceCreditOrVoid(true)
                .changeOption(SubscriptionUpdateFixedFeeQuantityParams.ChangeOption.IMMEDIATE)
                .effectiveDate(LocalDate.parse("2022-12-21"))
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.priceId()).isEqualTo("price_id")
        assertThat(body.quantity()).isEqualTo(0.0)
        assertThat(body.allowInvoiceCreditOrVoid()).isEqualTo(true)
        assertThat(body.changeOption())
            .isEqualTo(SubscriptionUpdateFixedFeeQuantityParams.ChangeOption.IMMEDIATE)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2022-12-21"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionUpdateFixedFeeQuantityParams.builder()
                .subscriptionId("subscription_id")
                .priceId("price_id")
                .quantity(0.0)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.priceId()).isEqualTo("price_id")
        assertThat(body.quantity()).isEqualTo(0.0)
    }

    @Test
    fun getPathParam() {
        val params =
            SubscriptionUpdateFixedFeeQuantityParams.builder()
                .subscriptionId("subscription_id")
                .priceId("price_id")
                .quantity(0.0)
                .build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
