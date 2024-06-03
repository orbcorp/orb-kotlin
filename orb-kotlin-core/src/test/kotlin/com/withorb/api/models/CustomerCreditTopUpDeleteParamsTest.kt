// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditTopUpDeleteParamsTest {

    @Test
    fun createCustomerCreditTopUpDeleteParams() {
        CustomerCreditTopUpDeleteParams.builder().customerId("string").topUpId("string").build()
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerCreditTopUpDeleteParams.builder().customerId("string").topUpId("string").build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // path param "topUpId"
        assertThat(params.getPathParam(1)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
