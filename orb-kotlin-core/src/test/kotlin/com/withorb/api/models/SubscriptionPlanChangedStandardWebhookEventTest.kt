// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionPlanChangedStandardWebhookEventTest {

    @Test
    fun create() {
        val subscriptionPlanChangedStandardWebhookEvent =
            SubscriptionPlanChangedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(SubscriptionPlanChangedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    SubscriptionPlanChangedStandardWebhookEvent.Properties.builder()
                        .previousPlanId("previous_plan_id")
                        .build()
                )
                .subscription(
                    SubscriptionPlanChangedStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionPlanChangedStandardWebhookEvent.Subscription.Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionPlanChangedStandardWebhookEvent.Subscription.Plan.builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionPlanChangedStandardWebhookEvent.Subscription.Status.ACTIVE
                        )
                        .build()
                )
                .type(SubscriptionPlanChangedStandardWebhookEvent.Type.SUBSCRIPTION_PLAN_CHANGED)
                .build()

        assertThat(subscriptionPlanChangedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionPlanChangedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionPlanChangedStandardWebhookEvent.payloadStyle())
            .isEqualTo(SubscriptionPlanChangedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(subscriptionPlanChangedStandardWebhookEvent.properties())
            .isEqualTo(
                SubscriptionPlanChangedStandardWebhookEvent.Properties.builder()
                    .previousPlanId("previous_plan_id")
                    .build()
            )
        assertThat(subscriptionPlanChangedStandardWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionPlanChangedStandardWebhookEvent.Subscription.builder()
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
                        SubscriptionPlanChangedStandardWebhookEvent.Subscription.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .plan(
                        SubscriptionPlanChangedStandardWebhookEvent.Subscription.Plan.builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(SubscriptionPlanChangedStandardWebhookEvent.Subscription.Status.ACTIVE)
                    .build()
            )
        assertThat(subscriptionPlanChangedStandardWebhookEvent.type())
            .isEqualTo(SubscriptionPlanChangedStandardWebhookEvent.Type.SUBSCRIPTION_PLAN_CHANGED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionPlanChangedStandardWebhookEvent =
            SubscriptionPlanChangedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(SubscriptionPlanChangedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    SubscriptionPlanChangedStandardWebhookEvent.Properties.builder()
                        .previousPlanId("previous_plan_id")
                        .build()
                )
                .subscription(
                    SubscriptionPlanChangedStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionPlanChangedStandardWebhookEvent.Subscription.Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionPlanChangedStandardWebhookEvent.Subscription.Plan.builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionPlanChangedStandardWebhookEvent.Subscription.Status.ACTIVE
                        )
                        .build()
                )
                .type(SubscriptionPlanChangedStandardWebhookEvent.Type.SUBSCRIPTION_PLAN_CHANGED)
                .build()

        val roundtrippedSubscriptionPlanChangedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionPlanChangedStandardWebhookEvent),
                jacksonTypeRef<SubscriptionPlanChangedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionPlanChangedStandardWebhookEvent)
            .isEqualTo(subscriptionPlanChangedStandardWebhookEvent)
    }
}
