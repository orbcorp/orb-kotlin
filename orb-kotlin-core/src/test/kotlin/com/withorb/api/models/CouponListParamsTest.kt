// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CouponListParamsTest {

    @Test
    fun createCouponListParams() {
        CouponListParams.builder()
            .cursor("cursor")
            .limit(1L)
            .redemptionCode("redemption_code")
            .showArchived(true)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CouponListParams.builder()
                .cursor("cursor")
                .limit(1L)
                .redemptionCode("redemption_code")
                .showArchived(true)
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        expected.put("redemption_code", "redemption_code")
        expected.put("show_archived", "true")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CouponListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
