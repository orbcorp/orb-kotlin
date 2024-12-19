// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertTest {

    @Test
    fun createAlert() {
        val alert =
            Alert.builder()
                .id("XuxCbt7x9L82yyeF")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .customer(
                    Alert.Customer.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .enabled(true)
                .metric(
                    Alert.Metric.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .plan(
                    Alert.Plan.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .subscription(
                    Alert.Subscription.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .thresholds(listOf(Alert.Threshold.builder().value(0.0).build()))
                .type(Alert.Type.USAGE_EXCEEDED)
                .build()
        assertThat(alert).isNotNull
        assertThat(alert.id()).isEqualTo("XuxCbt7x9L82yyeF")
        assertThat(alert.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(alert.currency()).isEqualTo("currency")
        assertThat(alert.customer())
            .isEqualTo(
                Alert.Customer.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(alert.enabled()).isEqualTo(true)
        assertThat(alert.metric())
            .isEqualTo(
                Alert.Metric.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(alert.plan())
            .isEqualTo(
                Alert.Plan.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(alert.subscription())
            .isEqualTo(
                Alert.Subscription.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(alert.thresholds()).containsExactly(Alert.Threshold.builder().value(0.0).build())
        assertThat(alert.type()).isEqualTo(Alert.Type.USAGE_EXCEEDED)
    }
}
