// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PriceExternalPriceIdFetchParamsTest {

    @Test
    fun create() {
      PriceExternalPriceIdFetchParams.builder()
          .externalPriceId("external_price_id")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = PriceExternalPriceIdFetchParams.builder()
          .externalPriceId("external_price_id")
          .build()
      assertThat(params).isNotNull
      // path param "externalPriceId"
      assertThat(params.getPathParam(0)).isEqualTo("external_price_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
