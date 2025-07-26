// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DimensionalPriceGroupUpdateParamsTest {

    @Test
    fun create() {
        DimensionalPriceGroupUpdateParams.builder()
            .dimensionalPriceGroupId("dimensional_price_group_id")
            .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
            .metadata(
                DimensionalPriceGroupUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DimensionalPriceGroupUpdateParams.builder()
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("dimensional_price_group_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DimensionalPriceGroupUpdateParams.builder()
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                .metadata(
                    DimensionalPriceGroupUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.externalDimensionalPriceGroupId())
            .isEqualTo("external_dimensional_price_group_id")
        assertThat(body.metadata())
            .isEqualTo(
                DimensionalPriceGroupUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DimensionalPriceGroupUpdateParams.builder()
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .build()

        val body = params._body()
    }
}
