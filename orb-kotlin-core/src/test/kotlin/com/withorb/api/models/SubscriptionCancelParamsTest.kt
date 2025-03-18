// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCancelParamsTest {

    @Test
    fun create() {
        SubscriptionCancelParams.builder()
            .subscriptionId("subscription_id")
            .cancelOption(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
            .allowInvoiceCreditOrVoid(true)
            .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionCancelParams.builder()
                .subscriptionId("subscription_id")
                .cancelOption(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionCancelParams.builder()
                .subscriptionId("subscription_id")
                .cancelOption(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
                .allowInvoiceCreditOrVoid(true)
                .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.cancelOption())
            .isEqualTo(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
        assertThat(body.allowInvoiceCreditOrVoid()).isEqualTo(true)
        assertThat(body.cancellationDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionCancelParams.builder()
                .subscriptionId("subscription_id")
                .cancelOption(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.cancelOption())
            .isEqualTo(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
    }
}
