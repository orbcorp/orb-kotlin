// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionAccountingSyncFailedStandardWebhookEventTest {

    @Test
    fun create() {
        val subscriptionAccountingSyncFailedStandardWebhookEvent =
            SubscriptionAccountingSyncFailedStandardWebhookEvent.builder()
                .id("id")
                .accountingSyncRecord(
                    SubscriptionAccountingSyncFailedStandardWebhookEvent.AccountingSyncRecord
                        .builder()
                        .id("id")
                        .customerId("customer_id")
                        .recordType(
                            SubscriptionAccountingSyncFailedStandardWebhookEvent
                                .AccountingSyncRecord
                                .RecordType
                                .CUSTOMER
                        )
                        .errorDetails(
                            SubscriptionAccountingSyncFailedStandardWebhookEvent
                                .AccountingSyncRecord
                                .ErrorDetails
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .providerCustomerId("provider_customer_id")
                        .status("status")
                        .subscriptionId("subscription_id")
                        .syncAction("sync_action")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionAccountingSyncFailedStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionAccountingSyncFailedStandardWebhookEvent.Properties.builder()
                        .connectionType("connection_type")
                        .failureReason("failure_reason")
                        .build()
                )
                .subscription(
                    SubscriptionAccountingSyncFailedStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionAccountingSyncFailedStandardWebhookEvent.Subscription
                                .Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionAccountingSyncFailedStandardWebhookEvent.Subscription.Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionAccountingSyncFailedStandardWebhookEvent.Subscription.Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionAccountingSyncFailedStandardWebhookEvent.Type
                        .SUBSCRIPTION_ACCOUNTING_SYNC_FAILED
                )
                .build()

        assertThat(subscriptionAccountingSyncFailedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionAccountingSyncFailedStandardWebhookEvent.accountingSyncRecord())
            .isEqualTo(
                SubscriptionAccountingSyncFailedStandardWebhookEvent.AccountingSyncRecord.builder()
                    .id("id")
                    .customerId("customer_id")
                    .recordType(
                        SubscriptionAccountingSyncFailedStandardWebhookEvent.AccountingSyncRecord
                            .RecordType
                            .CUSTOMER
                    )
                    .errorDetails(
                        SubscriptionAccountingSyncFailedStandardWebhookEvent.AccountingSyncRecord
                            .ErrorDetails
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .providerCustomerId("provider_customer_id")
                    .status("status")
                    .subscriptionId("subscription_id")
                    .syncAction("sync_action")
                    .build()
            )
        assertThat(subscriptionAccountingSyncFailedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionAccountingSyncFailedStandardWebhookEvent.payloadStyle())
            .isEqualTo(SubscriptionAccountingSyncFailedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(subscriptionAccountingSyncFailedStandardWebhookEvent.properties())
            .isEqualTo(
                SubscriptionAccountingSyncFailedStandardWebhookEvent.Properties.builder()
                    .connectionType("connection_type")
                    .failureReason("failure_reason")
                    .build()
            )
        assertThat(subscriptionAccountingSyncFailedStandardWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionAccountingSyncFailedStandardWebhookEvent.Subscription.builder()
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
                        SubscriptionAccountingSyncFailedStandardWebhookEvent.Subscription.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .plan(
                        SubscriptionAccountingSyncFailedStandardWebhookEvent.Subscription.Plan
                            .builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(
                        SubscriptionAccountingSyncFailedStandardWebhookEvent.Subscription.Status
                            .ACTIVE
                    )
                    .build()
            )
        assertThat(subscriptionAccountingSyncFailedStandardWebhookEvent.type())
            .isEqualTo(
                SubscriptionAccountingSyncFailedStandardWebhookEvent.Type
                    .SUBSCRIPTION_ACCOUNTING_SYNC_FAILED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionAccountingSyncFailedStandardWebhookEvent =
            SubscriptionAccountingSyncFailedStandardWebhookEvent.builder()
                .id("id")
                .accountingSyncRecord(
                    SubscriptionAccountingSyncFailedStandardWebhookEvent.AccountingSyncRecord
                        .builder()
                        .id("id")
                        .customerId("customer_id")
                        .recordType(
                            SubscriptionAccountingSyncFailedStandardWebhookEvent
                                .AccountingSyncRecord
                                .RecordType
                                .CUSTOMER
                        )
                        .errorDetails(
                            SubscriptionAccountingSyncFailedStandardWebhookEvent
                                .AccountingSyncRecord
                                .ErrorDetails
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .providerCustomerId("provider_customer_id")
                        .status("status")
                        .subscriptionId("subscription_id")
                        .syncAction("sync_action")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionAccountingSyncFailedStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionAccountingSyncFailedStandardWebhookEvent.Properties.builder()
                        .connectionType("connection_type")
                        .failureReason("failure_reason")
                        .build()
                )
                .subscription(
                    SubscriptionAccountingSyncFailedStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionAccountingSyncFailedStandardWebhookEvent.Subscription
                                .Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionAccountingSyncFailedStandardWebhookEvent.Subscription.Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionAccountingSyncFailedStandardWebhookEvent.Subscription.Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionAccountingSyncFailedStandardWebhookEvent.Type
                        .SUBSCRIPTION_ACCOUNTING_SYNC_FAILED
                )
                .build()

        val roundtrippedSubscriptionAccountingSyncFailedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionAccountingSyncFailedStandardWebhookEvent),
                jacksonTypeRef<SubscriptionAccountingSyncFailedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionAccountingSyncFailedStandardWebhookEvent)
            .isEqualTo(subscriptionAccountingSyncFailedStandardWebhookEvent)
    }
}
