// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CouponArchiveParamsTest {

    @Test
    fun create() {
        CouponArchiveParams.builder().couponId("coupon_id").build()
    }

    @Test
    fun pathParams() {
        val params = CouponArchiveParams.builder().couponId("coupon_id").build()

        assertThat(params._pathParam(0)).isEqualTo("coupon_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
