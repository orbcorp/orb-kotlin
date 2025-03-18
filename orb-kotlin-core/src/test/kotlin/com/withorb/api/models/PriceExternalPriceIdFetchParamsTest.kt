// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PriceExternalPriceIdFetchParamsTest {

    @Test
    fun create() {
        PriceExternalPriceIdFetchParams.builder().externalPriceId("external_price_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            PriceExternalPriceIdFetchParams.builder().externalPriceId("external_price_id").build()

        assertThat(params._pathParam(0)).isEqualTo("external_price_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
