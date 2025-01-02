// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DimensionalPriceGroupListParamsTest {

    @Test
    fun createDimensionalPriceGroupListParams() {
        DimensionalPriceGroupListParams.builder().cursor("cursor").limit(1L).build()
    }

    @Test
    fun getQueryParams() {
        val params = DimensionalPriceGroupListParams.builder().cursor("cursor").limit(1L).build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = DimensionalPriceGroupListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
