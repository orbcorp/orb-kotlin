// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.withorb.api.TestServerExtension
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.services.blocking.CouponService
import com.withorb.api.models.CouponListPage
import com.withorb.api.models.CouponListParams
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class CouponServiceTest {

    @Test
    fun callCreate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val couponService = client.coupons()
      val coupon = couponService.create(CouponCreateParams.builder()
          .discount(CouponCreateParams.Discount.ofNewCouponPercentageDiscount(CouponCreateParams.Discount.NewCouponPercentageDiscount.builder()
              .discountType(CouponCreateParams.Discount.NewCouponPercentageDiscount.DiscountType.PERCENTAGE)
              .percentageDiscount(42.23)
              .build()))
          .redemptionCode("HALFOFF")
          .durationInMonths(120L)
          .maxRedemptions(123L)
          .build())
      println(coupon)
      coupon.validate()
    }

    @Test
    fun callList() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val couponService = client.coupons()
      val coupons = couponService.list(CouponListParams.builder().build())
      println(coupons)
      coupons.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callArchive() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val couponService = client.coupons()
      val coupon = couponService.archive(CouponArchiveParams.builder()
          .couponId("coupon_id")
          .build())
      println(coupon)
      coupon.validate()
    }

    @Test
    fun callFetch() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val couponService = client.coupons()
      val coupon = couponService.fetch(CouponFetchParams.builder()
          .couponId("coupon_id")
          .build())
      println(coupon)
      coupon.validate()
    }
}
