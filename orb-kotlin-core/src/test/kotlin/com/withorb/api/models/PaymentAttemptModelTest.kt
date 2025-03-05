// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentAttemptModelTest {

    @Test
    fun createPaymentAttemptModel() {
        val paymentAttemptModel =
            PaymentAttemptModel.builder()
                .id("id")
                .amount("amount")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentProvider(PaymentAttemptModel.PaymentProvider.STRIPE)
                .paymentProviderId("payment_provider_id")
                .succeeded(true)
                .build()
        assertThat(paymentAttemptModel).isNotNull
        assertThat(paymentAttemptModel.id()).isEqualTo("id")
        assertThat(paymentAttemptModel.amount()).isEqualTo("amount")
        assertThat(paymentAttemptModel.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentAttemptModel.paymentProvider())
            .isEqualTo(PaymentAttemptModel.PaymentProvider.STRIPE)
        assertThat(paymentAttemptModel.paymentProviderId()).isEqualTo("payment_provider_id")
        assertThat(paymentAttemptModel.succeeded()).isEqualTo(true)
    }
}
