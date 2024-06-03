// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditTopUpListByExternalIdParamsTest {

    @Test
    fun createCustomerCreditTopUpListByExternalIdParams() {
        CustomerCreditTopUpListByExternalIdParams.builder()
            .externalCustomerId("string")
            .cursor("string")
            .limit(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomerCreditTopUpListByExternalIdParams.builder()
                .externalCustomerId("string")
                .cursor("string")
                .limit(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            CustomerCreditTopUpListByExternalIdParams.builder().externalCustomerId("string").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerCreditTopUpListByExternalIdParams.builder().externalCustomerId("string").build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
