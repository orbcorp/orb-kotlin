// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionStartedStandardWebhookEventTest {

    @Test
    fun create() {
        val subscriptionStartedStandardWebhookEvent =
            SubscriptionStartedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(SubscriptionStartedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(JsonValue.from(mapOf<String, Any>()))
                .subscription(
                    SubscriptionStartedStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionStartedStandardWebhookEvent.Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionStartedStandardWebhookEvent.Subscription.Plan.builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(SubscriptionStartedStandardWebhookEvent.Subscription.Status.ACTIVE)
                        .build()
                )
                .type(SubscriptionStartedStandardWebhookEvent.Type.SUBSCRIPTION_STARTED)
                .build()

        assertThat(subscriptionStartedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionStartedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionStartedStandardWebhookEvent.payloadStyle())
            .isEqualTo(SubscriptionStartedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(subscriptionStartedStandardWebhookEvent._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(subscriptionStartedStandardWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionStartedStandardWebhookEvent.Subscription.builder()
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
                        SubscriptionStartedStandardWebhookEvent.Subscription.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .plan(
                        SubscriptionStartedStandardWebhookEvent.Subscription.Plan.builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(SubscriptionStartedStandardWebhookEvent.Subscription.Status.ACTIVE)
                    .build()
            )
        assertThat(subscriptionStartedStandardWebhookEvent.type())
            .isEqualTo(SubscriptionStartedStandardWebhookEvent.Type.SUBSCRIPTION_STARTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionStartedStandardWebhookEvent =
            SubscriptionStartedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(SubscriptionStartedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(JsonValue.from(mapOf<String, Any>()))
                .subscription(
                    SubscriptionStartedStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionStartedStandardWebhookEvent.Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionStartedStandardWebhookEvent.Subscription.Plan.builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(SubscriptionStartedStandardWebhookEvent.Subscription.Status.ACTIVE)
                        .build()
                )
                .type(SubscriptionStartedStandardWebhookEvent.Type.SUBSCRIPTION_STARTED)
                .build()

        val roundtrippedSubscriptionStartedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionStartedStandardWebhookEvent),
                jacksonTypeRef<SubscriptionStartedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionStartedStandardWebhookEvent)
            .isEqualTo(subscriptionStartedStandardWebhookEvent)
    }
}
