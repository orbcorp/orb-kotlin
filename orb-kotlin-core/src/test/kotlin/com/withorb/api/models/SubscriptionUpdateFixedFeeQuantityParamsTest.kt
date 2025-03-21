// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUpdateFixedFeeQuantityParamsTest {

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
    fun pathParams() {
        val params =
            SubscriptionUpdateFixedFeeQuantityParams.builder()
                .subscriptionId("subscription_id")
                .priceId("price_id")
                .quantity(0.0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
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

        assertThat(body.priceId()).isEqualTo("price_id")
        assertThat(body.quantity()).isEqualTo(0.0)
    }
}
