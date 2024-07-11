// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertCreateForSubscriptionParamsTest {

    @Test
    fun createAlertCreateForSubscriptionParams() {
        AlertCreateForSubscriptionParams.builder()
            .subscriptionId("subscription_id")
            .thresholds(
                listOf(AlertCreateForSubscriptionParams.Threshold.builder().value(42.23).build())
            )
            .type("type")
            .metricId("metric_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AlertCreateForSubscriptionParams.builder()
                .subscriptionId("subscription_id")
                .thresholds(
                    listOf(
                        AlertCreateForSubscriptionParams.Threshold.builder().value(42.23).build()
                    )
                )
                .type("type")
                .metricId("metric_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.thresholds())
            .isEqualTo(
                listOf(AlertCreateForSubscriptionParams.Threshold.builder().value(42.23).build())
            )
        assertThat(body.type()).isEqualTo("type")
        assertThat(body.metricId()).isEqualTo("metric_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AlertCreateForSubscriptionParams.builder()
                .subscriptionId("subscription_id")
                .thresholds(
                    listOf(
                        AlertCreateForSubscriptionParams.Threshold.builder().value(42.23).build()
                    )
                )
                .type("type")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.thresholds())
            .isEqualTo(
                listOf(AlertCreateForSubscriptionParams.Threshold.builder().value(42.23).build())
            )
        assertThat(body.type()).isEqualTo("type")
    }

    @Test
    fun getPathParam() {
        val params =
            AlertCreateForSubscriptionParams.builder()
                .subscriptionId("subscription_id")
                .thresholds(
                    listOf(
                        AlertCreateForSubscriptionParams.Threshold.builder().value(42.23).build()
                    )
                )
                .type("type")
                .build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
