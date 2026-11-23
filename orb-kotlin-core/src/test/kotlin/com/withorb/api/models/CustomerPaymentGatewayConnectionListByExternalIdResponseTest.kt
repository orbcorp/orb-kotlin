// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerPaymentGatewayConnectionListByExternalIdResponseTest {

    @Test
    fun create() {
        val customerPaymentGatewayConnectionListByExternalIdResponse =
            CustomerPaymentGatewayConnectionListByExternalIdResponse.builder()
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

        assertThat(customerPaymentGatewayConnectionListByExternalIdResponse.customerId())
            .isEqualTo("customer_id")
        assertThat(
                customerPaymentGatewayConnectionListByExternalIdResponse.paymentGatewayConnections()
            )
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
        val customerPaymentGatewayConnectionListByExternalIdResponse =
            CustomerPaymentGatewayConnectionListByExternalIdResponse.builder()
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

        val roundtrippedCustomerPaymentGatewayConnectionListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    customerPaymentGatewayConnectionListByExternalIdResponse
                ),
                jacksonTypeRef<CustomerPaymentGatewayConnectionListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerPaymentGatewayConnectionListByExternalIdResponse)
            .isEqualTo(customerPaymentGatewayConnectionListByExternalIdResponse)
    }
}
