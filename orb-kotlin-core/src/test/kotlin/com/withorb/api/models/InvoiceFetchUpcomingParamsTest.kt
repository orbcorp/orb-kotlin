// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceFetchUpcomingParamsTest {

    @Test
    fun createInvoiceFetchUpcomingParams() {
        InvoiceFetchUpcomingParams.builder().subscriptionId("subscription_id").build()
    }

    @Test
    fun getQueryParams() {
        val params = InvoiceFetchUpcomingParams.builder().subscriptionId("subscription_id").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("subscription_id", listOf("subscription_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = InvoiceFetchUpcomingParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
