// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerSyncPaymentMethodsFromGatewayParamsTest {

    @Test
    fun create() {
        CustomerSyncPaymentMethodsFromGatewayParams.builder()
            .externalCustomerId("external_customer_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerSyncPaymentMethodsFromGatewayParams.builder()
                .externalCustomerId("external_customer_id")
                .build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
