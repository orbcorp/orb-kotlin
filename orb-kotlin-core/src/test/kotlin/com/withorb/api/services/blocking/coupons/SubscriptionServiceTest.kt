// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.coupons

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.*
import com.withorb.api.models.CouponSubscriptionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SubscriptionServiceTest {

    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.coupons().subscriptions()
        val subscriptions =
            subscriptionService.list(
                CouponSubscriptionListParams.builder().couponId("coupon_id").build()
            )
        println(subscriptions)
        subscriptions.data().forEach { it.validate() }
    }
}
