// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.*
import com.withorb.api.models.CouponListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CouponServiceTest {

    @Test
    fun callCreate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponService = client.coupons()
        val coupon =
            couponService.create(
                CouponCreateParams.builder()
                    .discount(
                        CouponCreateParams.Discount.ofNewCouponPercentageDiscount(
                            CouponCreateParams.Discount.NewCouponPercentageDiscount.builder()
                                .discountType(
                                    CouponCreateParams.Discount.NewCouponPercentageDiscount
                                        .DiscountType
                                        .PERCENTAGE
                                )
                                .percentageDiscount(1.0)
                                .build()
                        )
                    )
                    .redemptionCode("HALFOFF")
                    .durationInMonths(120L)
                    .maxRedemptions(123L)
                    .build()
            )
        println(coupon)
        coupon.validate()
    }

    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponService = client.coupons()
        val coupons = couponService.list(CouponListParams.builder().build())
        println(coupons)
        coupons.data().forEach { it.validate() }
    }

    @Test
    fun callArchive() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponService = client.coupons()
        val coupon = couponService.archive(CouponArchiveParams.builder().couponId("string").build())
        println(coupon)
        coupon.validate()
    }

    @Test
    fun callFetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val couponService = client.coupons()
        val coupon = couponService.fetch(CouponFetchParams.builder().couponId("string").build())
        println(coupon)
        coupon.validate()
    }
}
