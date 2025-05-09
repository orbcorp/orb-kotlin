// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.CouponCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CouponServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponService = client.coupons()

        val coupon =
            couponService.create(
                CouponCreateParams.builder()
                    .percentageDiscount(0.0)
                    .redemptionCode("HALFOFF")
                    .durationInMonths(12L)
                    .maxRedemptions(1L)
                    .build()
            )

        coupon.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponService = client.coupons()

        val page = couponService.list()

        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponService = client.coupons()

        val coupon = couponService.archive("coupon_id")

        coupon.validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponService = client.coupons()

        val coupon = couponService.fetch("coupon_id")

        coupon.validate()
    }
}
