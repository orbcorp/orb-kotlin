// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerPaymentGatewayConnectionListResponseTest {

    @Test
    fun create() {
        val customerPaymentGatewayConnectionListResponse =
            CustomerPaymentGatewayConnectionListResponse.builder()
                .customerId("customer_id")
                .addPaymentGatewayConnection(
                    CustomerPaymentGatewayConnection.builder()
                        .billingEntityId("billing_entity_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .externalAccountId("external_account_id")
                        .isDefault(true)
                        .paymentGatewayConnectionId("payment_gateway_connection_id")
                        .providerCustomerId("provider_customer_id")
                        .providerType(CustomerPaymentGatewayConnection.ProviderType.STRIPE)
                        .build()
                )
                .build()

        assertThat(customerPaymentGatewayConnectionListResponse.customerId())
            .isEqualTo("customer_id")
        assertThat(customerPaymentGatewayConnectionListResponse.paymentGatewayConnections())
            .containsExactly(
                CustomerPaymentGatewayConnection.builder()
                    .billingEntityId("billing_entity_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalAccountId("external_account_id")
                    .isDefault(true)
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .providerCustomerId("provider_customer_id")
                    .providerType(CustomerPaymentGatewayConnection.ProviderType.STRIPE)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerPaymentGatewayConnectionListResponse =
            CustomerPaymentGatewayConnectionListResponse.builder()
                .customerId("customer_id")
                .addPaymentGatewayConnection(
                    CustomerPaymentGatewayConnection.builder()
                        .billingEntityId("billing_entity_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .externalAccountId("external_account_id")
                        .isDefault(true)
                        .paymentGatewayConnectionId("payment_gateway_connection_id")
                        .providerCustomerId("provider_customer_id")
                        .providerType(CustomerPaymentGatewayConnection.ProviderType.STRIPE)
                        .build()
                )
                .build()

        val roundtrippedCustomerPaymentGatewayConnectionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerPaymentGatewayConnectionListResponse),
                jacksonTypeRef<CustomerPaymentGatewayConnectionListResponse>(),
            )

        assertThat(roundtrippedCustomerPaymentGatewayConnectionListResponse)
            .isEqualTo(customerPaymentGatewayConnectionListResponse)
    }
}
