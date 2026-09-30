// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventBackfillListParamsTest {

    @Test
    fun create() {
        EventBackfillListParams.builder()
            .cursor("cursor")
            .customerId("customer_id")
            .limit(1L)
            .status(EventBackfillListParams.Status.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EventBackfillListParams.builder()
                .cursor("cursor")
                .customerId("customer_id")
                .limit(1L)
                .status(EventBackfillListParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("customer_id", "customer_id")
                    .put("limit", "1")
                    .put("status", "pending")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EventBackfillListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
