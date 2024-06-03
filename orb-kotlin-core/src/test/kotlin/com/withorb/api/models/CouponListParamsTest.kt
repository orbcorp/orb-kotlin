// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CouponListParamsTest {

    @Test
    fun createCouponListParams() {
        CouponListParams.builder()
            .cursor("string")
            .limit(123L)
            .redemptionCode("string")
            .showArchived(true)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CouponListParams.builder()
                .cursor("string")
                .limit(123L)
                .redemptionCode("string")
                .showArchived(true)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        expected.put("redemption_code", listOf("string"))
        expected.put("show_archived", listOf("true"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CouponListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
