// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionTrialEndedStandardWebhookEventTest {

    @Test
    fun create() {
        val subscriptionTrialEndedStandardWebhookEvent =
            SubscriptionTrialEndedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(SubscriptionTrialEndedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(JsonValue.from(mapOf<String, Any>()))
                .subscription(
                    SubscriptionTrialEndedStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionTrialEndedStandardWebhookEvent.Subscription.Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionTrialEndedStandardWebhookEvent.Subscription.Plan.builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionTrialEndedStandardWebhookEvent.Subscription.Status.ACTIVE
                        )
                        .build()
                )
                .type(SubscriptionTrialEndedStandardWebhookEvent.Type.SUBSCRIPTION_TRIAL_ENDED)
                .build()

        assertThat(subscriptionTrialEndedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionTrialEndedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionTrialEndedStandardWebhookEvent.payloadStyle())
            .isEqualTo(SubscriptionTrialEndedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(subscriptionTrialEndedStandardWebhookEvent._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(subscriptionTrialEndedStandardWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionTrialEndedStandardWebhookEvent.Subscription.builder()
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
                        SubscriptionTrialEndedStandardWebhookEvent.Subscription.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .plan(
                        SubscriptionTrialEndedStandardWebhookEvent.Subscription.Plan.builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(SubscriptionTrialEndedStandardWebhookEvent.Subscription.Status.ACTIVE)
                    .build()
            )
        assertThat(subscriptionTrialEndedStandardWebhookEvent.type())
            .isEqualTo(SubscriptionTrialEndedStandardWebhookEvent.Type.SUBSCRIPTION_TRIAL_ENDED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionTrialEndedStandardWebhookEvent =
            SubscriptionTrialEndedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(SubscriptionTrialEndedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(JsonValue.from(mapOf<String, Any>()))
                .subscription(
                    SubscriptionTrialEndedStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionTrialEndedStandardWebhookEvent.Subscription.Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionTrialEndedStandardWebhookEvent.Subscription.Plan.builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionTrialEndedStandardWebhookEvent.Subscription.Status.ACTIVE
                        )
                        .build()
                )
                .type(SubscriptionTrialEndedStandardWebhookEvent.Type.SUBSCRIPTION_TRIAL_ENDED)
                .build()

        val roundtrippedSubscriptionTrialEndedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionTrialEndedStandardWebhookEvent),
                jacksonTypeRef<SubscriptionTrialEndedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionTrialEndedStandardWebhookEvent)
            .isEqualTo(subscriptionTrialEndedStandardWebhookEvent)
    }
}
