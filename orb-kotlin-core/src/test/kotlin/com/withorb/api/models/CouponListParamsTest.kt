// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CouponListParamsTest {

    @Test
    fun create() {
        CouponListParams.builder()
            .cursor("cursor")
            .limit(1L)
            .redemptionCode("redemption_code")
            .showArchived(true)
            .build()
    }

    @Test
    fun queryParams() {
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
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CouponListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
