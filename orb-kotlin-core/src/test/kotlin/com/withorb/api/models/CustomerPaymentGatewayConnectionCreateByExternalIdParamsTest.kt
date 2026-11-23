// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerPaymentGatewayConnectionCreateByExternalIdParamsTest {

    @Test
    fun create() {
        CustomerPaymentGatewayConnectionCreateByExternalIdParams.builder()
            .externalCustomerId("external_customer_id")
            .paymentGatewayConnectionId("payment_gateway_connection_id")
            .isDefault(true)
            .providerCustomerId("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerPaymentGatewayConnectionCreateByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .paymentGatewayConnectionId("payment_gateway_connection_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomerPaymentGatewayConnectionCreateByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .paymentGatewayConnectionId("payment_gateway_connection_id")
                .isDefault(true)
                .providerCustomerId("x")
                .build()

        val body = params._body()

        assertThat(body.paymentGatewayConnectionId()).isEqualTo("payment_gateway_connection_id")
        assertThat(body.isDefault()).isEqualTo(true)
        assertThat(body.providerCustomerId()).isEqualTo("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerPaymentGatewayConnectionCreateByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .paymentGatewayConnectionId("payment_gateway_connection_id")
                .build()

        val body = params._body()

        assertThat(body.paymentGatewayConnectionId()).isEqualTo("payment_gateway_connection_id")
    }
}
