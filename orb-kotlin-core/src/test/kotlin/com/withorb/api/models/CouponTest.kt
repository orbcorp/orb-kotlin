// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CouponTest {

    @Test
    fun createCoupon() {
        val coupon =
            Coupon.builder()
                .id("7iz2yanVjQoBZhyH")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discount(
                    Coupon.Discount.ofPercentageDiscount(
                        Coupon.Discount.PercentageDiscount.builder()
                            .appliesToPriceIds(listOf("string"))
                            .discountType(
                                Coupon.Discount.PercentageDiscount.DiscountType.PERCENTAGE
                            )
                            .percentageDiscount(1.0)
                            .reason("reason")
                            .build()
                    )
                )
                .durationInMonths(123L)
                .maxRedemptions(123L)
                .redemptionCode("HALFOFF")
                .timesRedeemed(123L)
                .build()
        assertThat(coupon).isNotNull
        assertThat(coupon.id()).isEqualTo("7iz2yanVjQoBZhyH")
        assertThat(coupon.archivedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(coupon.discount())
            .isEqualTo(
                Coupon.Discount.ofPercentageDiscount(
                    Coupon.Discount.PercentageDiscount.builder()
                        .appliesToPriceIds(listOf("string"))
                        .discountType(Coupon.Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(1.0)
                        .reason("reason")
                        .build()
                )
            )
        assertThat(coupon.durationInMonths()).isEqualTo(123L)
        assertThat(coupon.maxRedemptions()).isEqualTo(123L)
        assertThat(coupon.redemptionCode()).isEqualTo("HALFOFF")
        assertThat(coupon.timesRedeemed()).isEqualTo(123L)
    }
}
