// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertCreateForSubscriptionParamsTest {

    @Test
    fun createAlertCreateForSubscriptionParams() {
        AlertCreateForSubscriptionParams.builder()
            .subscriptionId("string")
            .thresholds(
                listOf(AlertCreateForSubscriptionParams.Threshold.builder().value(42.23).build())
            )
            .type("string")
            .metricId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AlertCreateForSubscriptionParams.builder()
                .subscriptionId("string")
                .thresholds(
                    listOf(
                        AlertCreateForSubscriptionParams.Threshold.builder().value(42.23).build()
                    )
                )
                .type("string")
                .metricId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.thresholds())
            .isEqualTo(
                listOf(AlertCreateForSubscriptionParams.Threshold.builder().value(42.23).build())
            )
        assertThat(body.type()).isEqualTo("string")
        assertThat(body.metricId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AlertCreateForSubscriptionParams.builder()
                .subscriptionId("string")
                .thresholds(
                    listOf(
                        AlertCreateForSubscriptionParams.Threshold.builder().value(42.23).build()
                    )
                )
                .type("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.thresholds())
            .isEqualTo(
                listOf(AlertCreateForSubscriptionParams.Threshold.builder().value(42.23).build())
            )
        assertThat(body.type()).isEqualTo("string")
    }

    @Test
    fun getPathParam() {
        val params =
            AlertCreateForSubscriptionParams.builder()
                .subscriptionId("string")
                .thresholds(
                    listOf(
                        AlertCreateForSubscriptionParams.Threshold.builder().value(42.23).build()
                    )
                )
                .type("string")
                .build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
