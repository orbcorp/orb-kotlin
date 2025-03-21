// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PriceUpdateParamsTest {

    @Test
    fun create() {
        PriceUpdateParams.builder()
            .priceId("price_id")
            .metadata(
                PriceUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = PriceUpdateParams.builder().priceId("price_id").build()

        assertThat(params._pathParam(0)).isEqualTo("price_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PriceUpdateParams.builder()
                .priceId("price_id")
                .metadata(
                    PriceUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.metadata())
            .isEqualTo(
                PriceUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PriceUpdateParams.builder().priceId("price_id").build()

        val body = params._body()
    }
}
