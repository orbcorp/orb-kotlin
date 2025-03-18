// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerBalanceTransactionCreateParamsTest {

    @Test
    fun create() {
        CustomerBalanceTransactionCreateParams.builder()
            .customerId("customer_id")
            .amount("amount")
            .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
            .description("description")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerBalanceTransactionCreateParams.builder()
                .customerId("customer_id")
                .amount("amount")
                .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomerBalanceTransactionCreateParams.builder()
                .customerId("customer_id")
                .amount("amount")
                .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
                .description("description")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo("amount")
        assertThat(body.type()).isEqualTo(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
        assertThat(body.description()).isEqualTo("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerBalanceTransactionCreateParams.builder()
                .customerId("customer_id")
                .amount("amount")
                .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo("amount")
        assertThat(body.type()).isEqualTo(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
    }
}
