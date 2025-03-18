// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParamsTest {

    @Test
    fun create() {
        DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.builder()
            .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.builder()
                .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_dimensional_price_group_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
