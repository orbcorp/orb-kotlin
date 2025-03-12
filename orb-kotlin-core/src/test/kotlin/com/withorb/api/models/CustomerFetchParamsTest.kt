// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerFetchParamsTest {

    @Test
    fun create() {
      CustomerFetchParams.builder()
          .customerId("customer_id")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = CustomerFetchParams.builder()
          .customerId("customer_id")
          .build()
      assertThat(params).isNotNull
      // path param "customerId"
      assertThat(params.getPathParam(0)).isEqualTo("customer_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
