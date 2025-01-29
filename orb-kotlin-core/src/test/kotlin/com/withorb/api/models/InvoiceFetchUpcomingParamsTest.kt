// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceFetchUpcomingParamsTest {

    @Test
    fun createInvoiceFetchUpcomingParams() {
        InvoiceFetchUpcomingParams.builder().subscriptionId("subscription_id").build()
    }

    @Test
    fun queryParams() {
        val params = InvoiceFetchUpcomingParams.builder().subscriptionId("subscription_id").build()
        val expected = QueryParams.builder()
        expected.put("subscription_id", "subscription_id")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InvoiceFetchUpcomingParams.builder().subscriptionId("subscription_id").build()
        val expected = QueryParams.builder()
        expected.put("subscription_id", "subscription_id")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
