// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParamsTest {

    @Test
    fun create() {
        DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.builder()
            .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.builder()
                .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                .build()
        assertThat(params).isNotNull
        // path param "externalDimensionalPriceGroupId"
        assertThat(params.getPathParam(0)).isEqualTo("external_dimensional_price_group_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
