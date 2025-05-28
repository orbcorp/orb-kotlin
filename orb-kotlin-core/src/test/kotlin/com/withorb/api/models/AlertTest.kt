// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertTest {

    @Test
    fun create() {
        val alert =
            Alert.builder()
                .id("XuxCbt7x9L82yyeF")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .customer(
                    Alert.Customer.builder()
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
                .subscription(Alert.Subscription.builder().id("VDGsT23osdLb84KD").build())
                .addThreshold(Alert.Threshold.builder().value(0.0).build())
                .type(Alert.Type.CREDIT_BALANCE_DEPLETED)
                .addBalanceAlertStatus(
                    Alert.BalanceAlertStatus.builder().inAlert(true).thresholdValue(0.0).build()
                )
                .build()

        assertThat(alert.id()).isEqualTo("XuxCbt7x9L82yyeF")
        assertThat(alert.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(alert.currency()).isEqualTo("currency")
        assertThat(alert.customer())
            .isEqualTo(
                Alert.Customer.builder().id("id").externalCustomerId("external_customer_id").build()
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
            .isEqualTo(Alert.Subscription.builder().id("VDGsT23osdLb84KD").build())
        assertThat(alert.thresholds()).containsExactly(Alert.Threshold.builder().value(0.0).build())
        assertThat(alert.type()).isEqualTo(Alert.Type.CREDIT_BALANCE_DEPLETED)
        assertThat(alert.balanceAlertStatus())
            .containsExactly(
                Alert.BalanceAlertStatus.builder().inAlert(true).thresholdValue(0.0).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val alert =
            Alert.builder()
                .id("XuxCbt7x9L82yyeF")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .customer(
                    Alert.Customer.builder()
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
                .subscription(Alert.Subscription.builder().id("VDGsT23osdLb84KD").build())
                .addThreshold(Alert.Threshold.builder().value(0.0).build())
                .type(Alert.Type.CREDIT_BALANCE_DEPLETED)
                .addBalanceAlertStatus(
                    Alert.BalanceAlertStatus.builder().inAlert(true).thresholdValue(0.0).build()
                )
                .build()

        val roundtrippedAlert =
            jsonMapper.readValue(jsonMapper.writeValueAsString(alert), jacksonTypeRef<Alert>())

        assertThat(roundtrippedAlert).isEqualTo(alert)
    }
}
