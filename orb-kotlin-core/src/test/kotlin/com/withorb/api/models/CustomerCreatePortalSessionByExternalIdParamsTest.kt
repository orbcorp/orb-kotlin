// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreatePortalSessionByExternalIdParamsTest {

    @Test
    fun create() {
        CustomerCreatePortalSessionByExternalIdParams.builder()
            .externalCustomerId("external_customer_id")
            .expiresInMinutes(1L)
            .invalidateExisting(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerCreatePortalSessionByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomerCreatePortalSessionByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .expiresInMinutes(1L)
                .invalidateExisting(true)
                .build()

        val body = params._body()

        assertThat(body.expiresInMinutes()).isEqualTo(1L)
        assertThat(body.invalidateExisting()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerCreatePortalSessionByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()

        val body = params._body()
    }
}
