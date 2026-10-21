// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionPlanVersionChangeScheduledStandardWebhookEventTest {

    @Test
    fun create() {
        val subscriptionPlanVersionChangeScheduledStandardWebhookEvent =
            SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Properties.builder()
                        .effectiveDate("effective_date")
                        .newPlanVersionNumber(0L)
                        .previousPlanVersionNumber(0L)
                        .build()
                )
                .subscription(
                    SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Subscription
                        .builder()
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
                            SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Subscription
                                .Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Subscription
                                .Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Subscription
                                .Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Type
                        .SUBSCRIPTION_PLAN_VERSION_CHANGE_SCHEDULED
                )
                .build()

        assertThat(subscriptionPlanVersionChangeScheduledStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionPlanVersionChangeScheduledStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionPlanVersionChangeScheduledStandardWebhookEvent.payloadStyle())
            .isEqualTo(
                SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.PayloadStyle.EXPANDED
            )
        assertThat(subscriptionPlanVersionChangeScheduledStandardWebhookEvent.properties())
            .isEqualTo(
                SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Properties.builder()
                    .effectiveDate("effective_date")
                    .newPlanVersionNumber(0L)
                    .previousPlanVersionNumber(0L)
                    .build()
            )
        assertThat(subscriptionPlanVersionChangeScheduledStandardWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Subscription.builder()
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
                        SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Subscription
                            .Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .plan(
                        SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Subscription.Plan
                            .builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(
                        SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Subscription
                            .Status
                            .ACTIVE
                    )
                    .build()
            )
        assertThat(subscriptionPlanVersionChangeScheduledStandardWebhookEvent.type())
            .isEqualTo(
                SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Type
                    .SUBSCRIPTION_PLAN_VERSION_CHANGE_SCHEDULED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionPlanVersionChangeScheduledStandardWebhookEvent =
            SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Properties.builder()
                        .effectiveDate("effective_date")
                        .newPlanVersionNumber(0L)
                        .previousPlanVersionNumber(0L)
                        .build()
                )
                .subscription(
                    SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Subscription
                        .builder()
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
                            SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Subscription
                                .Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Subscription
                                .Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Subscription
                                .Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionPlanVersionChangeScheduledStandardWebhookEvent.Type
                        .SUBSCRIPTION_PLAN_VERSION_CHANGE_SCHEDULED
                )
                .build()

        val roundtrippedSubscriptionPlanVersionChangeScheduledStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    subscriptionPlanVersionChangeScheduledStandardWebhookEvent
                ),
                jacksonTypeRef<SubscriptionPlanVersionChangeScheduledStandardWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionPlanVersionChangeScheduledStandardWebhookEvent)
            .isEqualTo(subscriptionPlanVersionChangeScheduledStandardWebhookEvent)
    }
}
