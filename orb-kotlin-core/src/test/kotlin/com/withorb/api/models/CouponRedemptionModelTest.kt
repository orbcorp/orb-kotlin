// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CouponRedemptionModelTest {

    @Test
    fun createCouponRedemptionModel() {
        val couponRedemptionModel =
            CouponRedemptionModel.builder()
                .couponId("coupon_id")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(couponRedemptionModel).isNotNull
        assertThat(couponRedemptionModel.couponId()).isEqualTo("coupon_id")
        assertThat(couponRedemptionModel.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(couponRedemptionModel.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
