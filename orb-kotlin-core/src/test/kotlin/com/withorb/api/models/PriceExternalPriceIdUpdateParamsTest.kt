// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PriceExternalPriceIdUpdateParamsTest {

    @Test
    fun create() {
        PriceExternalPriceIdUpdateParams.builder()
            .externalPriceId("external_price_id")
            .updatePriceRequestParams(
                UpdatePriceRequestParams.builder()
                    .metadata(
                        UpdatePriceRequestParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PriceExternalPriceIdUpdateParams.builder()
                .externalPriceId("external_price_id")
                .updatePriceRequestParams(
                    UpdatePriceRequestParams.builder()
                        .metadata(
                            UpdatePriceRequestParams.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpdatePriceRequestParams.builder()
                    .metadata(
                        UpdatePriceRequestParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PriceExternalPriceIdUpdateParams.builder()
                .externalPriceId("external_price_id")
                .updatePriceRequestParams(UpdatePriceRequestParams.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(UpdatePriceRequestParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params =
            PriceExternalPriceIdUpdateParams.builder()
                .externalPriceId("external_price_id")
                .updatePriceRequestParams(UpdatePriceRequestParams.builder().build())
                .build()
        assertThat(params).isNotNull
        // path param "externalPriceId"
        assertThat(params.getPathParam(0)).isEqualTo("external_price_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
