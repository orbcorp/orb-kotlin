// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.CouponArchiveParams
import com.withorb.api.models.CouponCreateParams
import com.withorb.api.models.CouponFetchParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CouponServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponServiceAsync = client.coupons()

        val couponModel =
            couponServiceAsync.create(
                CouponCreateParams.builder()
                    .newCouponPercentageDiscount(0.0)
                    .redemptionCode("HALFOFF")
                    .durationInMonths(12L)
                    .maxRedemptions(1L)
                    .build()
            )

        couponModel.validate()
    }

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponServiceAsync = client.coupons()

        val page = couponServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun archive() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponServiceAsync = client.coupons()

        val couponModel =
            couponServiceAsync.archive(CouponArchiveParams.builder().couponId("coupon_id").build())

        couponModel.validate()
    }

    @Test
    suspend fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponServiceAsync = client.coupons()

        val couponModel =
            couponServiceAsync.fetch(CouponFetchParams.builder().couponId("coupon_id").build())

        couponModel.validate()
    }
}
