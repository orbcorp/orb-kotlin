// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentMethodCreatedWebhookEventTest {

    @Test
    fun create() {
        val paymentMethodCreatedWebhookEvent =
            PaymentMethodCreatedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentMethod(
                    PaymentMethodCreatedWebhookEvent.PaymentMethod.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .default(true)
                        .externalPaymentMethodId("external_payment_method_id")
                        .paymentMethodType(
                            PaymentMethodCreatedWebhookEvent.PaymentMethod.PaymentMethodType.CARD
                        )
                        .providerType("provider_type")
                        .build()
                )
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(PaymentMethodCreatedWebhookEvent.Type.PAYMENT_METHOD_CREATED)
                .build()

        assertThat(paymentMethodCreatedWebhookEvent.id()).isEqualTo("id")
        assertThat(paymentMethodCreatedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentMethodCreatedWebhookEvent.paymentMethod())
            .isEqualTo(
                PaymentMethodCreatedWebhookEvent.PaymentMethod.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .default(true)
                    .externalPaymentMethodId("external_payment_method_id")
                    .paymentMethodType(
                        PaymentMethodCreatedWebhookEvent.PaymentMethod.PaymentMethodType.CARD
                    )
                    .providerType("provider_type")
                    .build()
            )
        assertThat(paymentMethodCreatedWebhookEvent._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(paymentMethodCreatedWebhookEvent.type())
            .isEqualTo(PaymentMethodCreatedWebhookEvent.Type.PAYMENT_METHOD_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentMethodCreatedWebhookEvent =
            PaymentMethodCreatedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentMethod(
                    PaymentMethodCreatedWebhookEvent.PaymentMethod.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .default(true)
                        .externalPaymentMethodId("external_payment_method_id")
                        .paymentMethodType(
                            PaymentMethodCreatedWebhookEvent.PaymentMethod.PaymentMethodType.CARD
                        )
                        .providerType("provider_type")
                        .build()
                )
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(PaymentMethodCreatedWebhookEvent.Type.PAYMENT_METHOD_CREATED)
                .build()

        val roundtrippedPaymentMethodCreatedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentMethodCreatedWebhookEvent),
                jacksonTypeRef<PaymentMethodCreatedWebhookEvent>(),
            )

        assertThat(roundtrippedPaymentMethodCreatedWebhookEvent)
            .isEqualTo(paymentMethodCreatedWebhookEvent)
    }
}
