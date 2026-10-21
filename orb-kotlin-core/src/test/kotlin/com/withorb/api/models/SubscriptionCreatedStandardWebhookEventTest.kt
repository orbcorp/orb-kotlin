// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreatedStandardWebhookEventTest {

    @Test
    fun create() {
        val subscriptionCreatedStandardWebhookEvent =
            SubscriptionCreatedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(SubscriptionCreatedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(JsonValue.from(mapOf<String, Any>()))
                .subscription(
                    SubscriptionCreatedStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionCreatedStandardWebhookEvent.Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionCreatedStandardWebhookEvent.Subscription.Plan.builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(SubscriptionCreatedStandardWebhookEvent.Subscription.Status.ACTIVE)
                        .build()
                )
                .type(SubscriptionCreatedStandardWebhookEvent.Type.SUBSCRIPTION_CREATED)
                .build()

        assertThat(subscriptionCreatedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionCreatedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionCreatedStandardWebhookEvent.payloadStyle())
            .isEqualTo(SubscriptionCreatedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(subscriptionCreatedStandardWebhookEvent._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(subscriptionCreatedStandardWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionCreatedStandardWebhookEvent.Subscription.builder()
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
                        SubscriptionCreatedStandardWebhookEvent.Subscription.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .plan(
                        SubscriptionCreatedStandardWebhookEvent.Subscription.Plan.builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(SubscriptionCreatedStandardWebhookEvent.Subscription.Status.ACTIVE)
                    .build()
            )
        assertThat(subscriptionCreatedStandardWebhookEvent.type())
            .isEqualTo(SubscriptionCreatedStandardWebhookEvent.Type.SUBSCRIPTION_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionCreatedStandardWebhookEvent =
            SubscriptionCreatedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(SubscriptionCreatedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(JsonValue.from(mapOf<String, Any>()))
                .subscription(
                    SubscriptionCreatedStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionCreatedStandardWebhookEvent.Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionCreatedStandardWebhookEvent.Subscription.Plan.builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(SubscriptionCreatedStandardWebhookEvent.Subscription.Status.ACTIVE)
                        .build()
                )
                .type(SubscriptionCreatedStandardWebhookEvent.Type.SUBSCRIPTION_CREATED)
                .build()

        val roundtrippedSubscriptionCreatedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionCreatedStandardWebhookEvent),
                jacksonTypeRef<SubscriptionCreatedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionCreatedStandardWebhookEvent)
            .isEqualTo(subscriptionCreatedStandardWebhookEvent)
    }
}
