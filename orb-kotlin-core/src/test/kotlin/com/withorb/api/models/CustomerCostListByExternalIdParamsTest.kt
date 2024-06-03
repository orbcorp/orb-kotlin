// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCostListByExternalIdParamsTest {

    @Test
    fun createCustomerCostListByExternalIdParams() {
        CustomerCostListByExternalIdParams.builder()
            .externalCustomerId("string")
            .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
            .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
            .viewMode(CustomerCostListByExternalIdParams.ViewMode.PERIODIC)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomerCostListByExternalIdParams.builder()
                .externalCustomerId("string")
                .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                .viewMode(CustomerCostListByExternalIdParams.ViewMode.PERIODIC)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("timeframe_end", listOf("2022-03-01T05:00:00Z"))
        expected.put("timeframe_start", listOf("2022-02-01T05:00:00Z"))
        expected.put(
            "view_mode",
            listOf(CustomerCostListByExternalIdParams.ViewMode.PERIODIC.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            CustomerCostListByExternalIdParams.builder().externalCustomerId("string").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerCostListByExternalIdParams.builder().externalCustomerId("string").build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
