// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditListByExternalIdParamsTest {

    @Test
    fun createCustomerCreditListByExternalIdParams() {
        CustomerCreditListByExternalIdParams.builder()
            .externalCustomerId("external_customer_id")
            .currency("currency")
            .cursor("cursor")
            .includeAllBlocks(true)
            .limit(1L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomerCreditListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .currency("currency")
                .cursor("cursor")
                .includeAllBlocks(true)
                .limit(1L)
                .build()
        val expected = QueryParams.builder()
        expected.put("currency", "currency")
        expected.put("cursor", "cursor")
        expected.put("include_all_blocks", "true")
        expected.put("limit", "1")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            CustomerCreditListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerCreditListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
