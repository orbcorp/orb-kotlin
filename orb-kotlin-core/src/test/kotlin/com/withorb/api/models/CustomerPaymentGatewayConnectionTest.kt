// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerPaymentGatewayConnectionTest {

    @Test
    fun create() {
        val customerPaymentGatewayConnection =
            CustomerPaymentGatewayConnection.builder()
                .billingEntityId("billing_entity_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalAccountId("external_account_id")
                .isDefault(true)
                .paymentGatewayConnectionId("payment_gateway_connection_id")
                .providerCustomerId("provider_customer_id")
                .providerType(CustomerPaymentGatewayConnection.ProviderType.STRIPE)
                .build()

        assertThat(customerPaymentGatewayConnection.billingEntityId())
            .isEqualTo("billing_entity_id")
        assertThat(customerPaymentGatewayConnection.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerPaymentGatewayConnection.externalAccountId())
            .isEqualTo("external_account_id")
        assertThat(customerPaymentGatewayConnection.isDefault()).isEqualTo(true)
        assertThat(customerPaymentGatewayConnection.paymentGatewayConnectionId())
            .isEqualTo("payment_gateway_connection_id")
        assertThat(customerPaymentGatewayConnection.providerCustomerId())
            .isEqualTo("provider_customer_id")
        assertThat(customerPaymentGatewayConnection.providerType())
            .isEqualTo(CustomerPaymentGatewayConnection.ProviderType.STRIPE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerPaymentGatewayConnection =
            CustomerPaymentGatewayConnection.builder()
                .billingEntityId("billing_entity_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalAccountId("external_account_id")
                .isDefault(true)
                .paymentGatewayConnectionId("payment_gateway_connection_id")
                .providerCustomerId("provider_customer_id")
                .providerType(CustomerPaymentGatewayConnection.ProviderType.STRIPE)
                .build()

        val roundtrippedCustomerPaymentGatewayConnection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerPaymentGatewayConnection),
                jacksonTypeRef<CustomerPaymentGatewayConnection>(),
            )

        assertThat(roundtrippedCustomerPaymentGatewayConnection)
            .isEqualTo(customerPaymentGatewayConnection)
    }
}
