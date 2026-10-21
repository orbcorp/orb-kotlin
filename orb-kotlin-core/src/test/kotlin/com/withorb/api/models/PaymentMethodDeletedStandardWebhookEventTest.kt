// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentMethodDeletedStandardWebhookEventTest {

    @Test
    fun create() {
        val paymentMethodDeletedStandardWebhookEvent =
            PaymentMethodDeletedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(PaymentMethodDeletedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .paymentMethod(
                    PaymentMethodDeletedStandardWebhookEvent.PaymentMethod.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .default(true)
                        .externalPaymentMethodId("external_payment_method_id")
                        .paymentMethodType(
                            PaymentMethodDeletedStandardWebhookEvent.PaymentMethod.PaymentMethodType
                                .CARD
                        )
                        .providerType("provider_type")
                        .build()
                )
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(PaymentMethodDeletedStandardWebhookEvent.Type.PAYMENT_METHOD_DELETED)
                .build()

        assertThat(paymentMethodDeletedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(paymentMethodDeletedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentMethodDeletedStandardWebhookEvent.payloadStyle())
            .isEqualTo(PaymentMethodDeletedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(paymentMethodDeletedStandardWebhookEvent.paymentMethod())
            .isEqualTo(
                PaymentMethodDeletedStandardWebhookEvent.PaymentMethod.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .default(true)
                    .externalPaymentMethodId("external_payment_method_id")
                    .paymentMethodType(
                        PaymentMethodDeletedStandardWebhookEvent.PaymentMethod.PaymentMethodType
                            .CARD
                    )
                    .providerType("provider_type")
                    .build()
            )
        assertThat(paymentMethodDeletedStandardWebhookEvent._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(paymentMethodDeletedStandardWebhookEvent.type())
            .isEqualTo(PaymentMethodDeletedStandardWebhookEvent.Type.PAYMENT_METHOD_DELETED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentMethodDeletedStandardWebhookEvent =
            PaymentMethodDeletedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(PaymentMethodDeletedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .paymentMethod(
                    PaymentMethodDeletedStandardWebhookEvent.PaymentMethod.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .default(true)
                        .externalPaymentMethodId("external_payment_method_id")
                        .paymentMethodType(
                            PaymentMethodDeletedStandardWebhookEvent.PaymentMethod.PaymentMethodType
                                .CARD
                        )
                        .providerType("provider_type")
                        .build()
                )
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(PaymentMethodDeletedStandardWebhookEvent.Type.PAYMENT_METHOD_DELETED)
                .build()

        val roundtrippedPaymentMethodDeletedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentMethodDeletedStandardWebhookEvent),
                jacksonTypeRef<PaymentMethodDeletedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedPaymentMethodDeletedStandardWebhookEvent)
            .isEqualTo(paymentMethodDeletedStandardWebhookEvent)
    }
}
