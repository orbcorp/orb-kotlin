// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerPaymentGatewayConnectionUpdateParamsTest {

    @Test
    fun create() {
        CustomerPaymentGatewayConnectionUpdateParams.builder()
            .customerId("customer_id")
            .paymentGatewayConnectionId("payment_gateway_connection_id")
            .isDefault(CustomerPaymentGatewayConnectionUpdateParams.IsDefault.TRUE)
            .providerCustomerId("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerPaymentGatewayConnectionUpdateParams.builder()
                .customerId("customer_id")
                .paymentGatewayConnectionId("payment_gateway_connection_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        assertThat(params._pathParam(1)).isEqualTo("payment_gateway_connection_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomerPaymentGatewayConnectionUpdateParams.builder()
                .customerId("customer_id")
                .paymentGatewayConnectionId("payment_gateway_connection_id")
                .isDefault(CustomerPaymentGatewayConnectionUpdateParams.IsDefault.TRUE)
                .providerCustomerId("x")
                .build()

        val body = params._body()

        assertThat(body.isDefault())
            .isEqualTo(CustomerPaymentGatewayConnectionUpdateParams.IsDefault.TRUE)
        assertThat(body.providerCustomerId()).isEqualTo("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerPaymentGatewayConnectionUpdateParams.builder()
                .customerId("customer_id")
                .paymentGatewayConnectionId("payment_gateway_connection_id")
                .build()

        val body = params._body()
    }
}
