// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerBalanceTransactionListParamsTest {

    @Test
    fun createCustomerBalanceTransactionListParams() {
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
    fun getQueryParams() {
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
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        expected.put("operation_time[gt]", "2019-12-27T18:11:19.117Z")
        expected.put("operation_time[gte]", "2019-12-27T18:11:19.117Z")
        expected.put("operation_time[lt]", "2019-12-27T18:11:19.117Z")
        expected.put("operation_time[lte]", "2019-12-27T18:11:19.117Z")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            CustomerBalanceTransactionListParams.builder().customerId("customer_id").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
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
