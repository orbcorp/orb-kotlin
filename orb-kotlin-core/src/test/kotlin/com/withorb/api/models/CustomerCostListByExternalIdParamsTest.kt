// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCostListByExternalIdParamsTest {

    @Test
    fun create() {
        CustomerCostListByExternalIdParams.builder()
            .externalCustomerId("external_customer_id")
            .currency("currency")
            .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
            .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
            .viewMode(CustomerCostListByExternalIdParams.ViewMode.PERIODIC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomerCostListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .currency("currency")
                .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                .viewMode(CustomerCostListByExternalIdParams.ViewMode.PERIODIC)
                .build()
        val expected = QueryParams.builder()
        expected.put("currency", "currency")
        expected.put("timeframe_end", "2022-03-01T05:00:00Z")
        expected.put("timeframe_start", "2022-02-01T05:00:00Z")
        expected.put("view_mode", CustomerCostListByExternalIdParams.ViewMode.PERIODIC.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CustomerCostListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerCostListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
