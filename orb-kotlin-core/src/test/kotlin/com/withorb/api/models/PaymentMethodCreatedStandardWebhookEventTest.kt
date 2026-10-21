// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentMethodCreatedStandardWebhookEventTest {

    @Test
    fun create() {
        val paymentMethodCreatedStandardWebhookEvent =
            PaymentMethodCreatedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(PaymentMethodCreatedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .paymentMethod(
                    PaymentMethodCreatedStandardWebhookEvent.PaymentMethod.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .default(true)
                        .externalPaymentMethodId("external_payment_method_id")
                        .paymentMethodType(
                            PaymentMethodCreatedStandardWebhookEvent.PaymentMethod.PaymentMethodType
                                .CARD
                        )
                        .providerType("provider_type")
                        .build()
                )
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(PaymentMethodCreatedStandardWebhookEvent.Type.PAYMENT_METHOD_CREATED)
                .build()

        assertThat(paymentMethodCreatedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(paymentMethodCreatedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentMethodCreatedStandardWebhookEvent.payloadStyle())
            .isEqualTo(PaymentMethodCreatedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(paymentMethodCreatedStandardWebhookEvent.paymentMethod())
            .isEqualTo(
                PaymentMethodCreatedStandardWebhookEvent.PaymentMethod.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .default(true)
                    .externalPaymentMethodId("external_payment_method_id")
                    .paymentMethodType(
                        PaymentMethodCreatedStandardWebhookEvent.PaymentMethod.PaymentMethodType
                            .CARD
                    )
                    .providerType("provider_type")
                    .build()
            )
        assertThat(paymentMethodCreatedStandardWebhookEvent._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(paymentMethodCreatedStandardWebhookEvent.type())
            .isEqualTo(PaymentMethodCreatedStandardWebhookEvent.Type.PAYMENT_METHOD_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentMethodCreatedStandardWebhookEvent =
            PaymentMethodCreatedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(PaymentMethodCreatedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .paymentMethod(
                    PaymentMethodCreatedStandardWebhookEvent.PaymentMethod.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .default(true)
                        .externalPaymentMethodId("external_payment_method_id")
                        .paymentMethodType(
                            PaymentMethodCreatedStandardWebhookEvent.PaymentMethod.PaymentMethodType
                                .CARD
                        )
                        .providerType("provider_type")
                        .build()
                )
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(PaymentMethodCreatedStandardWebhookEvent.Type.PAYMENT_METHOD_CREATED)
                .build()

        val roundtrippedPaymentMethodCreatedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentMethodCreatedStandardWebhookEvent),
                jacksonTypeRef<PaymentMethodCreatedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedPaymentMethodCreatedStandardWebhookEvent)
            .isEqualTo(paymentMethodCreatedStandardWebhookEvent)
    }
}
