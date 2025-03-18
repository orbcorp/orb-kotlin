// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceFetchUpcomingParamsTest {

    @Test
    fun create() {
        InvoiceFetchUpcomingParams.builder().subscriptionId("subscription_id").build()
    }

    @Test
    fun queryParams() {
        val params = InvoiceFetchUpcomingParams.builder().subscriptionId("subscription_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("subscription_id", "subscription_id").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InvoiceFetchUpcomingParams.builder().subscriptionId("subscription_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("subscription_id", "subscription_id").build())
    }
}
