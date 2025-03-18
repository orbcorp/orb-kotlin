// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerBalanceTransactionListParamsTest {

    @Test
    fun create() {
        CustomerBalanceTransactionListParams.builder()
            .customerId("customer_id")
            .cursor("cursor")
            .limit(1L)
            .operationTimeGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .operationTimeGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .operationTimeLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .operationTimeLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomerBalanceTransactionListParams.builder()
                .customerId("customer_id")
                .cursor("cursor")
                .limit(1L)
                .operationTimeGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .operationTimeGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .operationTimeLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .operationTimeLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("operation_time[gt]", "2019-12-27T18:11:19.117Z")
                    .put("operation_time[gte]", "2019-12-27T18:11:19.117Z")
                    .put("operation_time[lt]", "2019-12-27T18:11:19.117Z")
                    .put("operation_time[lte]", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CustomerBalanceTransactionListParams.builder().customerId("customer_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerBalanceTransactionListParams.builder().customerId("customer_id").build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
