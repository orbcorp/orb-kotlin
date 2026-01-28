// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionChangeListParamsTest {

    @Test
    fun create() {
        SubscriptionChangeListParams.builder()
            .cursor("cursor")
            .customerId("customer_id")
            .externalCustomerId("external_customer_id")
            .limit(1L)
            .status(SubscriptionChangeListParams.Status.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SubscriptionChangeListParams.builder()
                .cursor("cursor")
                .customerId("customer_id")
                .externalCustomerId("external_customer_id")
                .limit(1L)
                .status(SubscriptionChangeListParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("customer_id", "customer_id")
                    .put("external_customer_id", "external_customer_id")
                    .put("limit", "1")
                    .put("status", "pending")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SubscriptionChangeListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
