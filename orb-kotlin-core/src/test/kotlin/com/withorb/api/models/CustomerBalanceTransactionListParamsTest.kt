// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerBalanceTransactionListParamsTest {

    @Test
    fun createCustomerBalanceTransactionListParams() {
        CustomerBalanceTransactionListParams.builder()
            .customerId("string")
            .cursor("string")
            .limit(123L)
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
                .customerId("string")
                .cursor("string")
                .limit(123L)
                .operationTimeGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .operationTimeGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .operationTimeLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .operationTimeLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        expected.put("operation_time[gt]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("operation_time[gte]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("operation_time[lt]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("operation_time[lte]", listOf("2019-12-27T18:11:19.117Z"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CustomerBalanceTransactionListParams.builder().customerId("string").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = CustomerBalanceTransactionListParams.builder().customerId("string").build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
