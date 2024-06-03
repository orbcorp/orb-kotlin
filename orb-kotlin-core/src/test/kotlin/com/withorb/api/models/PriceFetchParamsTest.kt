// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PriceFetchParamsTest {

    @Test
    fun createPriceFetchParams() {
        PriceFetchParams.builder().priceId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = PriceFetchParams.builder().priceId("string").build()
        assertThat(params).isNotNull
        // path param "priceId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
