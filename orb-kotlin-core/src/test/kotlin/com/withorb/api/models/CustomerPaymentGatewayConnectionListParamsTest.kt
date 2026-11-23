// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerPaymentGatewayConnectionListParamsTest {

    @Test
    fun create() {
        CustomerPaymentGatewayConnectionListParams.builder()
            .customerId("customer_id")
            .billingEntityId("billing_entity_id")
            .paymentGatewayConnectionId("payment_gateway_connection_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerPaymentGatewayConnectionListParams.builder().customerId("customer_id").build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CustomerPaymentGatewayConnectionListParams.builder()
                .customerId("customer_id")
                .billingEntityId("billing_entity_id")
                .paymentGatewayConnectionId("payment_gateway_connection_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("billing_entity_id", "billing_entity_id")
                    .put("payment_gateway_connection_id", "payment_gateway_connection_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CustomerPaymentGatewayConnectionListParams.builder().customerId("customer_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
