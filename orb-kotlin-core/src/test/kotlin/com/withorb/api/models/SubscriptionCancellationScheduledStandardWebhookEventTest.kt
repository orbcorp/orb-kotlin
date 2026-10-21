// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCancellationScheduledStandardWebhookEventTest {

    @Test
    fun create() {
        val subscriptionCancellationScheduledStandardWebhookEvent =
            SubscriptionCancellationScheduledStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionCancellationScheduledStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionCancellationScheduledStandardWebhookEvent.Properties.builder()
                        .cancellationDate("cancellation_date")
                        .build()
                )
                .subscription(
                    SubscriptionCancellationScheduledStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionCancellationScheduledStandardWebhookEvent.Subscription
                                .Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionCancellationScheduledStandardWebhookEvent.Subscription.Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionCancellationScheduledStandardWebhookEvent.Subscription
                                .Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionCancellationScheduledStandardWebhookEvent.Type
                        .SUBSCRIPTION_CANCELLATION_SCHEDULED
                )
                .build()

        assertThat(subscriptionCancellationScheduledStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionCancellationScheduledStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionCancellationScheduledStandardWebhookEvent.payloadStyle())
            .isEqualTo(SubscriptionCancellationScheduledStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(subscriptionCancellationScheduledStandardWebhookEvent.properties())
            .isEqualTo(
                SubscriptionCancellationScheduledStandardWebhookEvent.Properties.builder()
                    .cancellationDate("cancellation_date")
                    .build()
            )
        assertThat(subscriptionCancellationScheduledStandardWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionCancellationScheduledStandardWebhookEvent.Subscription.builder()
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
                        SubscriptionCancellationScheduledStandardWebhookEvent.Subscription.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .plan(
                        SubscriptionCancellationScheduledStandardWebhookEvent.Subscription.Plan
                            .builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(
                        SubscriptionCancellationScheduledStandardWebhookEvent.Subscription.Status
                            .ACTIVE
                    )
                    .build()
            )
        assertThat(subscriptionCancellationScheduledStandardWebhookEvent.type())
            .isEqualTo(
                SubscriptionCancellationScheduledStandardWebhookEvent.Type
                    .SUBSCRIPTION_CANCELLATION_SCHEDULED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionCancellationScheduledStandardWebhookEvent =
            SubscriptionCancellationScheduledStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionCancellationScheduledStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionCancellationScheduledStandardWebhookEvent.Properties.builder()
                        .cancellationDate("cancellation_date")
                        .build()
                )
                .subscription(
                    SubscriptionCancellationScheduledStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionCancellationScheduledStandardWebhookEvent.Subscription
                                .Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionCancellationScheduledStandardWebhookEvent.Subscription.Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionCancellationScheduledStandardWebhookEvent.Subscription
                                .Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionCancellationScheduledStandardWebhookEvent.Type
                        .SUBSCRIPTION_CANCELLATION_SCHEDULED
                )
                .build()

        val roundtrippedSubscriptionCancellationScheduledStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    subscriptionCancellationScheduledStandardWebhookEvent
                ),
                jacksonTypeRef<SubscriptionCancellationScheduledStandardWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionCancellationScheduledStandardWebhookEvent)
            .isEqualTo(subscriptionCancellationScheduledStandardWebhookEvent)
    }
}
