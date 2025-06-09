// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CouponRedemptionTest {

    @Test
    fun create() {
        val couponRedemption =
            CouponRedemption.builder()
                .couponId("coupon_id")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(couponRedemption.couponId()).isEqualTo("coupon_id")
        assertThat(couponRedemption.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(couponRedemption.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val couponRedemption =
            CouponRedemption.builder()
                .couponId("coupon_id")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCouponRedemption =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(couponRedemption),
                jacksonTypeRef<CouponRedemption>(),
            )

        assertThat(roundtrippedCouponRedemption).isEqualTo(couponRedemption)
    }
}
