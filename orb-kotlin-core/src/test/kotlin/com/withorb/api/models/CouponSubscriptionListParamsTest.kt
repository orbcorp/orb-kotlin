// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CouponSubscriptionListParamsTest {

    @Test
    fun create() {
        CouponSubscriptionListParams.builder()
            .couponId("coupon_id")
            .cursor("cursor")
            .limit(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CouponSubscriptionListParams.builder()
                .couponId("coupon_id")
                .cursor("cursor")
                .limit(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CouponSubscriptionListParams.builder().couponId("coupon_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = CouponSubscriptionListParams.builder().couponId("coupon_id").build()
        assertThat(params).isNotNull
        // path param "couponId"
        assertThat(params.getPathParam(0)).isEqualTo("coupon_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
