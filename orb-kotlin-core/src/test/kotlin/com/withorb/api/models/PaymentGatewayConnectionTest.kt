// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentGatewayConnectionTest {

    @Test
    fun create() {
        val paymentGatewayConnection =
            PaymentGatewayConnection.builder()
                .id("id")
                .billingEntityId("billing_entity_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalAccountId("external_account_id")
                .isDefault(true)
                .providerType(PaymentGatewayConnection.ProviderType.STRIPE)
                .build()

        assertThat(paymentGatewayConnection.id()).isEqualTo("id")
        assertThat(paymentGatewayConnection.billingEntityId()).isEqualTo("billing_entity_id")
        assertThat(paymentGatewayConnection.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentGatewayConnection.externalAccountId()).isEqualTo("external_account_id")
        assertThat(paymentGatewayConnection.isDefault()).isEqualTo(true)
        assertThat(paymentGatewayConnection.providerType())
            .isEqualTo(PaymentGatewayConnection.ProviderType.STRIPE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentGatewayConnection =
            PaymentGatewayConnection.builder()
                .id("id")
                .billingEntityId("billing_entity_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalAccountId("external_account_id")
                .isDefault(true)
                .providerType(PaymentGatewayConnection.ProviderType.STRIPE)
                .build()

        val roundtrippedPaymentGatewayConnection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentGatewayConnection),
                jacksonTypeRef<PaymentGatewayConnection>(),
            )

        assertThat(roundtrippedPaymentGatewayConnection).isEqualTo(paymentGatewayConnection)
    }
}
