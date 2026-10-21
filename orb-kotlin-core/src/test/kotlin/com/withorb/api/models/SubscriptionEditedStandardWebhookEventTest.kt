// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionEditedStandardWebhookEventTest {

    @Test
    fun create() {
        val subscriptionEditedStandardWebhookEvent =
            SubscriptionEditedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(SubscriptionEditedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    SubscriptionEditedStandardWebhookEvent.Properties.builder()
                        .previousAttributes(
                            SubscriptionEditedStandardWebhookEvent.Properties.PreviousAttributes
                                .builder()
                                .autoCollection(true)
                                .autoIssuance(true)
                                .defaultInvoiceMemo("default_invoice_memo")
                                .invoicingThreshold("invoicing_threshold")
                                .metadata(
                                    SubscriptionEditedStandardWebhookEvent.Properties
                                        .PreviousAttributes
                                        .Metadata
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .netTerms(0L)
                                .build()
                        )
                        .build()
                )
                .subscription(
                    SubscriptionEditedStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionEditedStandardWebhookEvent.Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionEditedStandardWebhookEvent.Subscription.Plan.builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(SubscriptionEditedStandardWebhookEvent.Subscription.Status.ACTIVE)
                        .build()
                )
                .type(SubscriptionEditedStandardWebhookEvent.Type.SUBSCRIPTION_EDITED)
                .build()

        assertThat(subscriptionEditedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionEditedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionEditedStandardWebhookEvent.payloadStyle())
            .isEqualTo(SubscriptionEditedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(subscriptionEditedStandardWebhookEvent.properties())
            .isEqualTo(
                SubscriptionEditedStandardWebhookEvent.Properties.builder()
                    .previousAttributes(
                        SubscriptionEditedStandardWebhookEvent.Properties.PreviousAttributes
                            .builder()
                            .autoCollection(true)
                            .autoIssuance(true)
                            .defaultInvoiceMemo("default_invoice_memo")
                            .invoicingThreshold("invoicing_threshold")
                            .metadata(
                                SubscriptionEditedStandardWebhookEvent.Properties.PreviousAttributes
                                    .Metadata
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .netTerms(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(subscriptionEditedStandardWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionEditedStandardWebhookEvent.Subscription.builder()
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
                        SubscriptionEditedStandardWebhookEvent.Subscription.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .plan(
                        SubscriptionEditedStandardWebhookEvent.Subscription.Plan.builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(SubscriptionEditedStandardWebhookEvent.Subscription.Status.ACTIVE)
                    .build()
            )
        assertThat(subscriptionEditedStandardWebhookEvent.type())
            .isEqualTo(SubscriptionEditedStandardWebhookEvent.Type.SUBSCRIPTION_EDITED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionEditedStandardWebhookEvent =
            SubscriptionEditedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(SubscriptionEditedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    SubscriptionEditedStandardWebhookEvent.Properties.builder()
                        .previousAttributes(
                            SubscriptionEditedStandardWebhookEvent.Properties.PreviousAttributes
                                .builder()
                                .autoCollection(true)
                                .autoIssuance(true)
                                .defaultInvoiceMemo("default_invoice_memo")
                                .invoicingThreshold("invoicing_threshold")
                                .metadata(
                                    SubscriptionEditedStandardWebhookEvent.Properties
                                        .PreviousAttributes
                                        .Metadata
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .netTerms(0L)
                                .build()
                        )
                        .build()
                )
                .subscription(
                    SubscriptionEditedStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionEditedStandardWebhookEvent.Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionEditedStandardWebhookEvent.Subscription.Plan.builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(SubscriptionEditedStandardWebhookEvent.Subscription.Status.ACTIVE)
                        .build()
                )
                .type(SubscriptionEditedStandardWebhookEvent.Type.SUBSCRIPTION_EDITED)
                .build()

        val roundtrippedSubscriptionEditedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionEditedStandardWebhookEvent),
                jacksonTypeRef<SubscriptionEditedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionEditedStandardWebhookEvent)
            .isEqualTo(subscriptionEditedStandardWebhookEvent)
    }
}
