// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerFetchParamsTest {

    @Test
    fun createCustomerFetchParams() {
        CustomerFetchParams.builder().customerId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = CustomerFetchParams.builder().customerId("string").build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
