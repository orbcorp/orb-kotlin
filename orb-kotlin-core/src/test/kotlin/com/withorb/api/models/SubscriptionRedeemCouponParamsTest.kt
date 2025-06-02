// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionRedeemCouponParamsTest {

    @Test
    fun create() {
        SubscriptionRedeemCouponParams.builder()
            .subscriptionId("subscription_id")
            .changeOption(SubscriptionRedeemCouponParams.ChangeOption.REQUESTED_DATE)
            .couponId("coupon_id")
            .allowInvoiceCreditOrVoid(true)
            .changeDate(OffsetDateTime.parse("2017-07-21T17:32:28Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionRedeemCouponParams.builder()
                .subscriptionId("subscription_id")
                .changeOption(SubscriptionRedeemCouponParams.ChangeOption.REQUESTED_DATE)
                .couponId("coupon_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionRedeemCouponParams.builder()
                .subscriptionId("subscription_id")
                .changeOption(SubscriptionRedeemCouponParams.ChangeOption.REQUESTED_DATE)
                .couponId("coupon_id")
                .allowInvoiceCreditOrVoid(true)
                .changeDate(OffsetDateTime.parse("2017-07-21T17:32:28Z"))
                .build()

        val body = params._body()

        assertThat(body.changeOption())
            .isEqualTo(SubscriptionRedeemCouponParams.ChangeOption.REQUESTED_DATE)
        assertThat(body.couponId()).isEqualTo("coupon_id")
        assertThat(body.allowInvoiceCreditOrVoid()).isEqualTo(true)
        assertThat(body.changeDate()).isEqualTo(OffsetDateTime.parse("2017-07-21T17:32:28Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionRedeemCouponParams.builder()
                .subscriptionId("subscription_id")
                .changeOption(SubscriptionRedeemCouponParams.ChangeOption.REQUESTED_DATE)
                .couponId("coupon_id")
                .build()

        val body = params._body()

        assertThat(body.changeOption())
            .isEqualTo(SubscriptionRedeemCouponParams.ChangeOption.REQUESTED_DATE)
        assertThat(body.couponId()).isEqualTo("coupon_id")
    }
}
