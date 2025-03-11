// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditTopUpDeleteParamsTest {

    @Test
    fun create() {
      CustomerCreditTopUpDeleteParams.builder()
          .customerId("customer_id")
          .topUpId("top_up_id")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = CustomerCreditTopUpDeleteParams.builder()
          .customerId("customer_id")
          .topUpId("top_up_id")
          .build()
      assertThat(params).isNotNull
      // path param "customerId"
      assertThat(params.getPathParam(0)).isEqualTo("customer_id")
      // path param "topUpId"
      assertThat(params.getPathParam(1)).isEqualTo("top_up_id")
      // out-of-bound path param
      assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
