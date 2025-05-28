// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CouponListPageResponseTest {

    @Test
    fun create() {
        val couponListPageResponse =
            CouponListPageResponse.builder()
                .addData(
                    Coupon.builder()
                        .id("7iz2yanVjQoBZhyH")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discount(
                            PercentageDiscount.builder()
                                .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                                .percentageDiscount(0.15)
                                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                                .reason("reason")
                                .build()
                        )
                        .durationInMonths(12L)
                        .maxRedemptions(0L)
                        .redemptionCode("HALFOFF")
                        .timesRedeemed(0L)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(couponListPageResponse.data())
            .containsExactly(
                Coupon.builder()
                    .id("7iz2yanVjQoBZhyH")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discount(
                        PercentageDiscount.builder()
                            .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                            .percentageDiscount(0.15)
                            .addAppliesToPriceId("h74gfhdjvn7ujokd")
                            .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                            .reason("reason")
                            .build()
                    )
                    .durationInMonths(12L)
                    .maxRedemptions(0L)
                    .redemptionCode("HALFOFF")
                    .timesRedeemed(0L)
                    .build()
            )
        assertThat(couponListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val couponListPageResponse =
            CouponListPageResponse.builder()
                .addData(
                    Coupon.builder()
                        .id("7iz2yanVjQoBZhyH")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discount(
                            PercentageDiscount.builder()
                                .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                                .percentageDiscount(0.15)
                                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                                .reason("reason")
                                .build()
                        )
                        .durationInMonths(12L)
                        .maxRedemptions(0L)
                        .redemptionCode("HALFOFF")
                        .timesRedeemed(0L)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedCouponListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(couponListPageResponse),
                jacksonTypeRef<CouponListPageResponse>(),
            )

        assertThat(roundtrippedCouponListPageResponse).isEqualTo(couponListPageResponse)
    }
}
