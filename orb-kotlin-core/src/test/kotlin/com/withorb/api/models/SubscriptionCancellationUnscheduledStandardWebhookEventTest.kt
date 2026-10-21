// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCancellationUnscheduledStandardWebhookEventTest {

    @Test
    fun create() {
        val subscriptionCancellationUnscheduledStandardWebhookEvent =
            SubscriptionCancellationUnscheduledStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionCancellationUnscheduledStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionCancellationUnscheduledStandardWebhookEvent.Properties.builder()
                        .originalCancellationDate("original_cancellation_date")
                        .build()
                )
                .subscription(
                    SubscriptionCancellationUnscheduledStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionCancellationUnscheduledStandardWebhookEvent.Subscription
                                .Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionCancellationUnscheduledStandardWebhookEvent.Subscription
                                .Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionCancellationUnscheduledStandardWebhookEvent.Subscription
                                .Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionCancellationUnscheduledStandardWebhookEvent.Type
                        .SUBSCRIPTION_CANCELLATION_UNSCHEDULED
                )
                .build()

        assertThat(subscriptionCancellationUnscheduledStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionCancellationUnscheduledStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionCancellationUnscheduledStandardWebhookEvent.payloadStyle())
            .isEqualTo(
                SubscriptionCancellationUnscheduledStandardWebhookEvent.PayloadStyle.EXPANDED
            )
        assertThat(subscriptionCancellationUnscheduledStandardWebhookEvent.properties())
            .isEqualTo(
                SubscriptionCancellationUnscheduledStandardWebhookEvent.Properties.builder()
                    .originalCancellationDate("original_cancellation_date")
                    .build()
            )
        assertThat(subscriptionCancellationUnscheduledStandardWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionCancellationUnscheduledStandardWebhookEvent.Subscription.builder()
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
                        SubscriptionCancellationUnscheduledStandardWebhookEvent.Subscription
                            .Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .plan(
                        SubscriptionCancellationUnscheduledStandardWebhookEvent.Subscription.Plan
                            .builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(
                        SubscriptionCancellationUnscheduledStandardWebhookEvent.Subscription.Status
                            .ACTIVE
                    )
                    .build()
            )
        assertThat(subscriptionCancellationUnscheduledStandardWebhookEvent.type())
            .isEqualTo(
                SubscriptionCancellationUnscheduledStandardWebhookEvent.Type
                    .SUBSCRIPTION_CANCELLATION_UNSCHEDULED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionCancellationUnscheduledStandardWebhookEvent =
            SubscriptionCancellationUnscheduledStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionCancellationUnscheduledStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionCancellationUnscheduledStandardWebhookEvent.Properties.builder()
                        .originalCancellationDate("original_cancellation_date")
                        .build()
                )
                .subscription(
                    SubscriptionCancellationUnscheduledStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionCancellationUnscheduledStandardWebhookEvent.Subscription
                                .Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionCancellationUnscheduledStandardWebhookEvent.Subscription
                                .Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionCancellationUnscheduledStandardWebhookEvent.Subscription
                                .Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionCancellationUnscheduledStandardWebhookEvent.Type
                        .SUBSCRIPTION_CANCELLATION_UNSCHEDULED
                )
                .build()

        val roundtrippedSubscriptionCancellationUnscheduledStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    subscriptionCancellationUnscheduledStandardWebhookEvent
                ),
                jacksonTypeRef<SubscriptionCancellationUnscheduledStandardWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionCancellationUnscheduledStandardWebhookEvent)
            .isEqualTo(subscriptionCancellationUnscheduledStandardWebhookEvent)
    }
}
