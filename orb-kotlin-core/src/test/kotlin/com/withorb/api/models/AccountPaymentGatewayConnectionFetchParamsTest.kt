// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountPaymentGatewayConnectionFetchParamsTest {

    @Test
    fun create() {
        AccountPaymentGatewayConnectionFetchParams.builder()
            .paymentGatewayConnectionId("payment_gateway_connection_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountPaymentGatewayConnectionFetchParams.builder()
                .paymentGatewayConnectionId("payment_gateway_connection_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("payment_gateway_connection_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
