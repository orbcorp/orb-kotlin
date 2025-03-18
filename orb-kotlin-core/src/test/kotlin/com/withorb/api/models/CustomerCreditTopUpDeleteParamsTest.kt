// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditTopUpDeleteParamsTest {

    @Test
    fun create() {
        CustomerCreditTopUpDeleteParams.builder()
            .customerId("customer_id")
            .topUpId("top_up_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerCreditTopUpDeleteParams.builder()
                .customerId("customer_id")
                .topUpId("top_up_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        assertThat(params._pathParam(1)).isEqualTo("top_up_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
