// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionChangeApplyParamsTest {

    @Test
    fun create() {
        SubscriptionChangeApplyParams.builder()
            .subscriptionChangeId("subscription_change_id")
            .description("description")
            .markAsPaid(true)
            .paymentExternalId("payment_external_id")
            .paymentNotes("payment_notes")
            .paymentReceivedDate(LocalDate.parse("2019-12-27"))
            .previouslyCollectedAmount("previously_collected_amount")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionChangeApplyParams.builder()
                .subscriptionChangeId("subscription_change_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_change_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionChangeApplyParams.builder()
                .subscriptionChangeId("subscription_change_id")
                .description("description")
                .markAsPaid(true)
                .paymentExternalId("payment_external_id")
                .paymentNotes("payment_notes")
                .paymentReceivedDate(LocalDate.parse("2019-12-27"))
                .previouslyCollectedAmount("previously_collected_amount")
                .build()

        val body = params._body()

        assertThat(body.description()).isEqualTo("description")
        assertThat(body.markAsPaid()).isEqualTo(true)
        assertThat(body.paymentExternalId()).isEqualTo("payment_external_id")
        assertThat(body.paymentNotes()).isEqualTo("payment_notes")
        assertThat(body.paymentReceivedDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.previouslyCollectedAmount()).isEqualTo("previously_collected_amount")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionChangeApplyParams.builder()
                .subscriptionChangeId("subscription_change_id")
                .build()

        val body = params._body()
    }
}
