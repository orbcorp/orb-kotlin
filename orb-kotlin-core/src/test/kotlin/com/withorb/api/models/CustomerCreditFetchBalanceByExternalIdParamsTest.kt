// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditFetchBalanceByExternalIdParamsTest {

    @Test
    fun create() {
        CustomerCreditFetchBalanceByExternalIdParams.builder()
            .externalCustomerId("external_customer_id")
            .currency("currency")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerCreditFetchBalanceByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CustomerCreditFetchBalanceByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .currency("currency")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("currency", "currency").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CustomerCreditFetchBalanceByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
