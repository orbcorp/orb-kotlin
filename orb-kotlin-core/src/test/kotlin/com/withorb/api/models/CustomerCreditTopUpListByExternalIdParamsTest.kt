// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditTopUpListByExternalIdParamsTest {

    @Test
    fun createCustomerCreditTopUpListByExternalIdParams() {
        CustomerCreditTopUpListByExternalIdParams.builder()
            .externalCustomerId("external_customer_id")
            .cursor("cursor")
            .limit(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomerCreditTopUpListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .cursor("cursor")
                .limit(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("cursor"))
        expected.put("limit", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            CustomerCreditTopUpListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerCreditTopUpListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
