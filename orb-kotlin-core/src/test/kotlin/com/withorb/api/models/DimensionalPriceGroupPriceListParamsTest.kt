// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DimensionalPriceGroupPriceListParamsTest {

    @Test
    fun create() {
        DimensionalPriceGroupPriceListParams.builder()
            .dimensionalPriceGroupId("dimensional_price_group_id")
            .cursor("cursor")
            .limit(1L)
            .status(DimensionalPriceGroupPriceListParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DimensionalPriceGroupPriceListParams.builder()
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("dimensional_price_group_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DimensionalPriceGroupPriceListParams.builder()
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .cursor("cursor")
                .limit(1L)
                .status(DimensionalPriceGroupPriceListParams.Status.ACTIVE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("status", "active")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            DimensionalPriceGroupPriceListParams.builder()
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
