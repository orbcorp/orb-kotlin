// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditTopUpListByExternalIdParamsTest {

    @Test
    fun create() {
        CustomerCreditTopUpListByExternalIdParams.builder()
            .externalCustomerId("external_customer_id")
            .cursor("cursor")
            .limit(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomerCreditTopUpListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .cursor("cursor")
                .limit(1L)
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CustomerCreditTopUpListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
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
