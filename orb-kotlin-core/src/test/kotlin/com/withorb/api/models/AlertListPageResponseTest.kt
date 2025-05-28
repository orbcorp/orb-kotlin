// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertListPageResponseTest {

    @Test
    fun create() {
        val alertListPageResponse =
            AlertListPageResponse.builder()
                .addData(
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
                            Alert.BalanceAlertStatus.builder()
                                .inAlert(true)
                                .thresholdValue(0.0)
                                .build()
                        )
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(alertListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(alertListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val alertListPageResponse =
            AlertListPageResponse.builder()
                .addData(
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
                            Alert.BalanceAlertStatus.builder()
                                .inAlert(true)
                                .thresholdValue(0.0)
                                .build()
                        )
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedAlertListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(alertListPageResponse),
                jacksonTypeRef<AlertListPageResponse>(),
            )

        assertThat(roundtrippedAlertListPageResponse).isEqualTo(alertListPageResponse)
    }
}
