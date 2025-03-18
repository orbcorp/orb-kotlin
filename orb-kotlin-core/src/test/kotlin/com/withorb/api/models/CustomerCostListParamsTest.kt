// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCostListParamsTest {

    @Test
    fun create() {
        CustomerCostListParams.builder()
            .customerId("customer_id")
            .currency("currency")
            .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
            .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
            .viewMode(CustomerCostListParams.ViewMode.PERIODIC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomerCostListParams.builder()
                .customerId("customer_id")
                .currency("currency")
                .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                .viewMode(CustomerCostListParams.ViewMode.PERIODIC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("currency", "currency")
                    .put("timeframe_end", "2022-03-01T05:00:00Z")
                    .put("timeframe_start", "2022-02-01T05:00:00Z")
                    .put("view_mode", "periodic")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerCostListParams.builder().customerId("customer_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = CustomerCostListParams.builder().customerId("customer_id").build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
