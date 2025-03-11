// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PriceEvaluateResponseTest {

    @Test
    fun createPriceEvaluateResponse() {
      val priceEvaluateResponse = PriceEvaluateResponse.builder()
          .addData(EvaluatePriceGroup.builder()
              .amount("amount")
              .addGroupingValue("string")
              .quantity(0.0)
              .build())
          .build()
      assertThat(priceEvaluateResponse).isNotNull
      assertThat(priceEvaluateResponse.data()).containsExactly(EvaluatePriceGroup.builder()
          .amount("amount")
          .addGroupingValue("string")
          .quantity(0.0)
          .build())
    }
}
