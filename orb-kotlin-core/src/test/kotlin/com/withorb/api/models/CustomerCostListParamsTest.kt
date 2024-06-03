// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCostListParamsTest {

    @Test
    fun createCustomerCostListParams() {
        CustomerCostListParams.builder()
            .customerId("string")
            .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
            .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
            .viewMode(CustomerCostListParams.ViewMode.PERIODIC)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomerCostListParams.builder()
                .customerId("string")
                .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                .viewMode(CustomerCostListParams.ViewMode.PERIODIC)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("timeframe_end", listOf("2022-03-01T05:00:00Z"))
        expected.put("timeframe_start", listOf("2022-02-01T05:00:00Z"))
        expected.put("view_mode", listOf(CustomerCostListParams.ViewMode.PERIODIC.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CustomerCostListParams.builder().customerId("string").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = CustomerCostListParams.builder().customerId("string").build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
