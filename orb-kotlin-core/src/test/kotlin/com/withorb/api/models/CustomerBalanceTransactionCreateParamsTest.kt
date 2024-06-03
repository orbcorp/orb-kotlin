// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerBalanceTransactionCreateParamsTest {

    @Test
    fun createCustomerBalanceTransactionCreateParams() {
        CustomerBalanceTransactionCreateParams.builder()
            .customerId("string")
            .amount("string")
            .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
            .description("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomerBalanceTransactionCreateParams.builder()
                .customerId("string")
                .amount("string")
                .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
                .description("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo("string")
        assertThat(body.type()).isEqualTo(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
        assertThat(body.description()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomerBalanceTransactionCreateParams.builder()
                .customerId("string")
                .amount("string")
                .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo("string")
        assertThat(body.type()).isEqualTo(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerBalanceTransactionCreateParams.builder()
                .customerId("string")
                .amount("string")
                .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
