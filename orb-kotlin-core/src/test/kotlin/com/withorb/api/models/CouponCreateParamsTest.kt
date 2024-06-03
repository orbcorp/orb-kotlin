// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CouponCreateParamsTest {

    @Test
    fun createCouponCreateParams() {
        CouponCreateParams.builder()
            .discount(
                CouponCreateParams.Discount.ofNewCouponPercentageDiscount(
                    CouponCreateParams.Discount.NewCouponPercentageDiscount.builder()
                        .discountType(
                            CouponCreateParams.Discount.NewCouponPercentageDiscount.DiscountType
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
    }

    @Test
    fun getBody() {
        val params =
            CouponCreateParams.builder()
                .discount(
                    CouponCreateParams.Discount.ofNewCouponPercentageDiscount(
                        CouponCreateParams.Discount.NewCouponPercentageDiscount.builder()
                            .discountType(
                                CouponCreateParams.Discount.NewCouponPercentageDiscount.DiscountType
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.discount())
            .isEqualTo(
                CouponCreateParams.Discount.ofNewCouponPercentageDiscount(
                    CouponCreateParams.Discount.NewCouponPercentageDiscount.builder()
                        .discountType(
                            CouponCreateParams.Discount.NewCouponPercentageDiscount.DiscountType
                                .PERCENTAGE
                        )
                        .percentageDiscount(1.0)
                        .build()
                )
            )
        assertThat(body.redemptionCode()).isEqualTo("HALFOFF")
        assertThat(body.durationInMonths()).isEqualTo(120L)
        assertThat(body.maxRedemptions()).isEqualTo(123L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CouponCreateParams.builder()
                .discount(
                    CouponCreateParams.Discount.ofNewCouponPercentageDiscount(
                        CouponCreateParams.Discount.NewCouponPercentageDiscount.builder()
                            .discountType(
                                CouponCreateParams.Discount.NewCouponPercentageDiscount.DiscountType
                                    .PERCENTAGE
                            )
                            .percentageDiscount(1.0)
                            .build()
                    )
                )
                .redemptionCode("HALFOFF")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.discount())
            .isEqualTo(
                CouponCreateParams.Discount.ofNewCouponPercentageDiscount(
                    CouponCreateParams.Discount.NewCouponPercentageDiscount.builder()
                        .discountType(
                            CouponCreateParams.Discount.NewCouponPercentageDiscount.DiscountType
                                .PERCENTAGE
                        )
                        .percentageDiscount(1.0)
                        .build()
                )
            )
        assertThat(body.redemptionCode()).isEqualTo("HALFOFF")
    }
}
