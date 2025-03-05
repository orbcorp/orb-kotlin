// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

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
                    CustomerMinifiedModel.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .enabled(true)
                .metric(Alert.Metric.builder().id("id").build())
                .plan(
                    Alert.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .planVersion("plan_version")
                        .build()
                )
                .subscription(SubscriptionMinifiedModel.builder().id("VDGsT23osdLb84KD").build())
                .addThreshold(ThresholdModel.builder().value(0.0).build())
                .type(Alert.Type.USAGE_EXCEEDED)
                .build()
        assertThat(alert).isNotNull
        assertThat(alert.id()).isEqualTo("XuxCbt7x9L82yyeF")
        assertThat(alert.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(alert.currency()).isEqualTo("currency")
        assertThat(alert.customer())
            .isEqualTo(
                CustomerMinifiedModel.builder()
                    .id("id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
        assertThat(alert.enabled()).isEqualTo(true)
        assertThat(alert.metric()).isEqualTo(Alert.Metric.builder().id("id").build())
        assertThat(alert.plan())
            .isEqualTo(
                Alert.Plan.builder()
                    .id("m2t5akQeh2obwxeU")
                    .externalPlanId("m2t5akQeh2obwxeU")
                    .name("Example plan")
                    .planVersion("plan_version")
                    .build()
            )
        assertThat(alert.subscription())
            .isEqualTo(SubscriptionMinifiedModel.builder().id("VDGsT23osdLb84KD").build())
        assertThat(alert.thresholds()).containsExactly(ThresholdModel.builder().value(0.0).build())
        assertThat(alert.type()).isEqualTo(Alert.Type.USAGE_EXCEEDED)
    }
}
