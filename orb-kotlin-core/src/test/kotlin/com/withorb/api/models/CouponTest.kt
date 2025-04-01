// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CouponTest {

    @Test
    fun create() {
        val coupon =
            Coupon.builder()
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

        assertThat(coupon.id()).isEqualTo("7iz2yanVjQoBZhyH")
        assertThat(coupon.archivedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(coupon.discount())
            .isEqualTo(
                Coupon.Discount.ofPercentage(
                    PercentageDiscount.builder()
                        .addAppliesToPriceId("h74gfhdjvn7ujokd")
                        .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                        .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(0.15)
                        .reason("reason")
                        .build()
                )
            )
        assertThat(coupon.durationInMonths()).isEqualTo(12L)
        assertThat(coupon.maxRedemptions()).isEqualTo(0L)
        assertThat(coupon.redemptionCode()).isEqualTo("HALFOFF")
        assertThat(coupon.timesRedeemed()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val coupon =
            Coupon.builder()
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

        val roundtrippedCoupon =
            jsonMapper.readValue(jsonMapper.writeValueAsString(coupon), jacksonTypeRef<Coupon>())

        assertThat(roundtrippedCoupon).isEqualTo(coupon)
    }
}
