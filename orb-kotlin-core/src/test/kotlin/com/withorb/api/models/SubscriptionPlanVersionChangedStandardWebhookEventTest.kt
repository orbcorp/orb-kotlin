// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionPlanVersionChangedStandardWebhookEventTest {

    @Test
    fun create() {
        val subscriptionPlanVersionChangedStandardWebhookEvent =
            SubscriptionPlanVersionChangedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionPlanVersionChangedStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionPlanVersionChangedStandardWebhookEvent.Properties.builder()
                        .effectiveDate("effective_date")
                        .newPlanVersionNumber(0L)
                        .previousPlanVersionNumber(0L)
                        .build()
                )
                .subscription(
                    SubscriptionPlanVersionChangedStandardWebhookEvent.Subscription.builder()
                        .id("VDGsT23osdLb84KD")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            SubscriptionPlanVersionChangedStandardWebhookEvent.Subscription.Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionPlanVersionChangedStandardWebhookEvent.Subscription.Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionPlanVersionChangedStandardWebhookEvent.Subscription.Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionPlanVersionChangedStandardWebhookEvent.Type
                        .SUBSCRIPTION_PLAN_VERSION_CHANGED
                )
                .build()

        assertThat(subscriptionPlanVersionChangedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionPlanVersionChangedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionPlanVersionChangedStandardWebhookEvent.payloadStyle())
            .isEqualTo(SubscriptionPlanVersionChangedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(subscriptionPlanVersionChangedStandardWebhookEvent.properties())
            .isEqualTo(
                SubscriptionPlanVersionChangedStandardWebhookEvent.Properties.builder()
                    .effectiveDate("effective_date")
                    .newPlanVersionNumber(0L)
                    .previousPlanVersionNumber(0L)
                    .build()
            )
        assertThat(subscriptionPlanVersionChangedStandardWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionPlanVersionChangedStandardWebhookEvent.Subscription.builder()
                    .id("VDGsT23osdLb84KD")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customer(
                        CustomerMinified.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        SubscriptionPlanVersionChangedStandardWebhookEvent.Subscription.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .plan(
                        SubscriptionPlanVersionChangedStandardWebhookEvent.Subscription.Plan
                            .builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(
                        SubscriptionPlanVersionChangedStandardWebhookEvent.Subscription.Status
                            .ACTIVE
                    )
                    .build()
            )
        assertThat(subscriptionPlanVersionChangedStandardWebhookEvent.type())
            .isEqualTo(
                SubscriptionPlanVersionChangedStandardWebhookEvent.Type
                    .SUBSCRIPTION_PLAN_VERSION_CHANGED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionPlanVersionChangedStandardWebhookEvent =
            SubscriptionPlanVersionChangedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionPlanVersionChangedStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionPlanVersionChangedStandardWebhookEvent.Properties.builder()
                        .effectiveDate("effective_date")
                        .newPlanVersionNumber(0L)
                        .previousPlanVersionNumber(0L)
                        .build()
                )
                .subscription(
                    SubscriptionPlanVersionChangedStandardWebhookEvent.Subscription.builder()
                        .id("VDGsT23osdLb84KD")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            SubscriptionPlanVersionChangedStandardWebhookEvent.Subscription.Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionPlanVersionChangedStandardWebhookEvent.Subscription.Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionPlanVersionChangedStandardWebhookEvent.Subscription.Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionPlanVersionChangedStandardWebhookEvent.Type
                        .SUBSCRIPTION_PLAN_VERSION_CHANGED
                )
                .build()

        val roundtrippedSubscriptionPlanVersionChangedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionPlanVersionChangedStandardWebhookEvent),
                jacksonTypeRef<SubscriptionPlanVersionChangedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionPlanVersionChangedStandardWebhookEvent)
            .isEqualTo(subscriptionPlanVersionChangedStandardWebhookEvent)
    }
}
