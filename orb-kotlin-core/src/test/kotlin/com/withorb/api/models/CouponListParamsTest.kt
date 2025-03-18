// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CouponListParamsTest {

    @Test
    fun create() {
        CouponListParams.builder()
            .cursor("cursor")
            .limit(1L)
            .redemptionCode("redemption_code")
            .showArchived(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CouponListParams.builder()
                .cursor("cursor")
                .limit(1L)
                .redemptionCode("redemption_code")
                .showArchived(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("redemption_code", "redemption_code")
                    .put("show_archived", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CouponListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
