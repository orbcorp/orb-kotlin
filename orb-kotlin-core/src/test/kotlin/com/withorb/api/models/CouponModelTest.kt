// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CouponModelTest {

    @Test
    fun createCouponModel() {
        val couponModel =
            CouponModel.builder()
                .id("7iz2yanVjQoBZhyH")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discount(
                    PercentageDiscount.builder()
                        .addAppliesToPriceId("h74gfhdjvn7ujokd")
                        .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                        .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(0.15)
                        .reason("reason")
                        .build()
                )
                .durationInMonths(12L)
                .maxRedemptions(0L)
                .redemptionCode("HALFOFF")
                .timesRedeemed(0L)
                .build()
        assertThat(couponModel).isNotNull
        assertThat(couponModel.id()).isEqualTo("7iz2yanVjQoBZhyH")
        assertThat(couponModel.archivedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(couponModel.discount())
            .isEqualTo(
                CouponModel.Discount.ofPercentage(
                    PercentageDiscount.builder()
                        .addAppliesToPriceId("h74gfhdjvn7ujokd")
                        .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                        .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(0.15)
                        .reason("reason")
                        .build()
                )
            )
        assertThat(couponModel.durationInMonths()).isEqualTo(12L)
        assertThat(couponModel.maxRedemptions()).isEqualTo(0L)
        assertThat(couponModel.redemptionCode()).isEqualTo("HALFOFF")
        assertThat(couponModel.timesRedeemed()).isEqualTo(0L)
    }
}
