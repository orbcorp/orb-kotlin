// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditListParamsTest {

    @Test
    fun create() {
        CustomerCreditListParams.builder()
            .customerId("customer_id")
            .currency("currency")
            .cursor("cursor")
            .includeAllBlocks(true)
            .limit(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomerCreditListParams.builder()
                .customerId("customer_id")
                .currency("currency")
                .cursor("cursor")
                .includeAllBlocks(true)
                .limit(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("currency", "currency")
                    .put("cursor", "cursor")
                    .put("include_all_blocks", "true")
                    .put("limit", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerCreditListParams.builder().customerId("customer_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = CustomerCreditListParams.builder().customerId("customer_id").build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
