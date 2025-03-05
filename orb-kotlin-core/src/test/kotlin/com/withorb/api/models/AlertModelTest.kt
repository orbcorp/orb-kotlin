// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertModelTest {

    @Test
    fun createAlertModel() {
        val alertModel =
            AlertModel.builder()
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
                .metric(AlertModel.Metric.builder().id("id").build())
                .plan(
                    AlertModel.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .planVersion("plan_version")
                        .build()
                )
                .subscription(SubscriptionMinifiedModel.builder().id("VDGsT23osdLb84KD").build())
                .addThreshold(ThresholdModel.builder().value(0.0).build())
                .type(AlertModel.Type.USAGE_EXCEEDED)
                .build()
        assertThat(alertModel).isNotNull
        assertThat(alertModel.id()).isEqualTo("XuxCbt7x9L82yyeF")
        assertThat(alertModel.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(alertModel.currency()).isEqualTo("currency")
        assertThat(alertModel.customer())
            .isEqualTo(
                CustomerMinifiedModel.builder()
                    .id("id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
        assertThat(alertModel.enabled()).isEqualTo(true)
        assertThat(alertModel.metric()).isEqualTo(AlertModel.Metric.builder().id("id").build())
        assertThat(alertModel.plan())
            .isEqualTo(
                AlertModel.Plan.builder()
                    .id("m2t5akQeh2obwxeU")
                    .externalPlanId("m2t5akQeh2obwxeU")
                    .name("Example plan")
                    .planVersion("plan_version")
                    .build()
            )
        assertThat(alertModel.subscription())
            .isEqualTo(SubscriptionMinifiedModel.builder().id("VDGsT23osdLb84KD").build())
        assertThat(alertModel.thresholds())
            .containsExactly(ThresholdModel.builder().value(0.0).build())
        assertThat(alertModel.type()).isEqualTo(AlertModel.Type.USAGE_EXCEEDED)
    }
}
