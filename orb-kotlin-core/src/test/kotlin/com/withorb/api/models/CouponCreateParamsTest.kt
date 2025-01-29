// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CouponCreateParamsTest {

    @Test
    fun createCouponCreateParams() {
        CouponCreateParams.builder()
            .discount(
                CouponCreateParams.Discount.ofNewCouponPercentage(
                    CouponCreateParams.Discount.NewCouponPercentageDiscount.builder()
                        .discountType(
                            CouponCreateParams.Discount.NewCouponPercentageDiscount.DiscountType
                                .PERCENTAGE
                        )
                        .percentageDiscount(0.0)
                        .build()
                )
            )
            .redemptionCode("HALFOFF")
            .durationInMonths(12L)
            .maxRedemptions(1L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CouponCreateParams.builder()
                .discount(
                    CouponCreateParams.Discount.ofNewCouponPercentage(
                        CouponCreateParams.Discount.NewCouponPercentageDiscount.builder()
                            .discountType(
                                CouponCreateParams.Discount.NewCouponPercentageDiscount.DiscountType
                                    .PERCENTAGE
                            )
                            .percentageDiscount(0.0)
                            .build()
                    )
                )
                .redemptionCode("HALFOFF")
                .durationInMonths(12L)
                .maxRedemptions(1L)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.discount())
            .isEqualTo(
                CouponCreateParams.Discount.ofNewCouponPercentage(
                    CouponCreateParams.Discount.NewCouponPercentageDiscount.builder()
                        .discountType(
                            CouponCreateParams.Discount.NewCouponPercentageDiscount.DiscountType
                                .PERCENTAGE
                        )
                        .percentageDiscount(0.0)
                        .build()
                )
            )
        assertThat(body.redemptionCode()).isEqualTo("HALFOFF")
        assertThat(body.durationInMonths()).isEqualTo(12L)
        assertThat(body.maxRedemptions()).isEqualTo(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CouponCreateParams.builder()
                .discount(
                    CouponCreateParams.Discount.ofNewCouponPercentage(
                        CouponCreateParams.Discount.NewCouponPercentageDiscount.builder()
                            .discountType(
                                CouponCreateParams.Discount.NewCouponPercentageDiscount.DiscountType
                                    .PERCENTAGE
                            )
                            .percentageDiscount(0.0)
                            .build()
                    )
                )
                .redemptionCode("HALFOFF")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.discount())
            .isEqualTo(
                CouponCreateParams.Discount.ofNewCouponPercentage(
                    CouponCreateParams.Discount.NewCouponPercentageDiscount.builder()
                        .discountType(
                            CouponCreateParams.Discount.NewCouponPercentageDiscount.DiscountType
                                .PERCENTAGE
                        )
                        .percentageDiscount(0.0)
                        .build()
                )
            )
        assertThat(body.redemptionCode()).isEqualTo("HALFOFF")
    }
}
