// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentMethodDeletedWebhookEventTest {

    @Test
    fun create() {
        val paymentMethodDeletedWebhookEvent =
            PaymentMethodDeletedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentMethod(
                    PaymentMethodDeletedWebhookEvent.PaymentMethod.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .default(true)
                        .externalPaymentMethodId("external_payment_method_id")
                        .paymentMethodType(
                            PaymentMethodDeletedWebhookEvent.PaymentMethod.PaymentMethodType.CARD
                        )
                        .providerType("provider_type")
                        .build()
                )
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(PaymentMethodDeletedWebhookEvent.Type.PAYMENT_METHOD_DELETED)
                .build()

        assertThat(paymentMethodDeletedWebhookEvent.id()).isEqualTo("id")
        assertThat(paymentMethodDeletedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentMethodDeletedWebhookEvent.paymentMethod())
            .isEqualTo(
                PaymentMethodDeletedWebhookEvent.PaymentMethod.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .default(true)
                    .externalPaymentMethodId("external_payment_method_id")
                    .paymentMethodType(
                        PaymentMethodDeletedWebhookEvent.PaymentMethod.PaymentMethodType.CARD
                    )
                    .providerType("provider_type")
                    .build()
            )
        assertThat(paymentMethodDeletedWebhookEvent._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(paymentMethodDeletedWebhookEvent.type())
            .isEqualTo(PaymentMethodDeletedWebhookEvent.Type.PAYMENT_METHOD_DELETED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentMethodDeletedWebhookEvent =
            PaymentMethodDeletedWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentMethod(
                    PaymentMethodDeletedWebhookEvent.PaymentMethod.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .default(true)
                        .externalPaymentMethodId("external_payment_method_id")
                        .paymentMethodType(
                            PaymentMethodDeletedWebhookEvent.PaymentMethod.PaymentMethodType.CARD
                        )
                        .providerType("provider_type")
                        .build()
                )
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(PaymentMethodDeletedWebhookEvent.Type.PAYMENT_METHOD_DELETED)
                .build()

        val roundtrippedPaymentMethodDeletedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentMethodDeletedWebhookEvent),
                jacksonTypeRef<PaymentMethodDeletedWebhookEvent>(),
            )

        assertThat(roundtrippedPaymentMethodDeletedWebhookEvent)
            .isEqualTo(paymentMethodDeletedWebhookEvent)
    }
}
