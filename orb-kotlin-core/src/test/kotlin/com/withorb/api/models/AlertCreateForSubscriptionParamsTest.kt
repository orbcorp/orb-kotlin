// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertCreateForSubscriptionParamsTest {

    @Test
    fun create() {
        AlertCreateForSubscriptionParams.builder()
            .subscriptionId("subscription_id")
            .addThreshold(AlertCreateForSubscriptionParams.Threshold.builder().value(0.0).build())
            .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
            .metricId("metric_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AlertCreateForSubscriptionParams.builder()
                .subscriptionId("subscription_id")
                .addThreshold(
                    AlertCreateForSubscriptionParams.Threshold.builder().value(0.0).build()
                )
                .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AlertCreateForSubscriptionParams.builder()
                .subscriptionId("subscription_id")
                .addThreshold(
                    AlertCreateForSubscriptionParams.Threshold.builder().value(0.0).build()
                )
                .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
                .metricId("metric_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.thresholds())
            .containsExactly(
                AlertCreateForSubscriptionParams.Threshold.builder().value(0.0).build()
            )
        assertThat(body.type()).isEqualTo(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
        assertThat(body.metricId()).isEqualTo("metric_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AlertCreateForSubscriptionParams.builder()
                .subscriptionId("subscription_id")
                .addThreshold(
                    AlertCreateForSubscriptionParams.Threshold.builder().value(0.0).build()
                )
                .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.thresholds())
            .containsExactly(
                AlertCreateForSubscriptionParams.Threshold.builder().value(0.0).build()
            )
        assertThat(body.type()).isEqualTo(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
    }
}
