// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionInvoicingThresholdExceededWebhookEventTest {

    @Test
    fun create() {
        val subscriptionInvoicingThresholdExceededWebhookEvent =
            SubscriptionInvoicingThresholdExceededWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    SubscriptionInvoicingThresholdExceededWebhookEvent.Properties.builder()
                        .evaluatedAmount("evaluated_amount")
                        .invoiceId("invoice_id")
                        .invoicingThreshold("invoicing_threshold")
                        .thresholdInvoiceCreated(true)
                        .build()
                )
                .subscription(
                    SubscriptionInvoicingThresholdExceededWebhookEvent.Subscription.builder()
                        .id("VDGsT23osdLb84KD")
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .plan(
                            SubscriptionInvoicingThresholdExceededWebhookEvent.Subscription.Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionInvoicingThresholdExceededWebhookEvent.Subscription.Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionInvoicingThresholdExceededWebhookEvent.Type
                        .SUBSCRIPTION_INVOICING_THRESHOLD_EXCEEDED
                )
                .build()

        assertThat(subscriptionInvoicingThresholdExceededWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionInvoicingThresholdExceededWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionInvoicingThresholdExceededWebhookEvent.properties())
            .isEqualTo(
                SubscriptionInvoicingThresholdExceededWebhookEvent.Properties.builder()
                    .evaluatedAmount("evaluated_amount")
                    .invoiceId("invoice_id")
                    .invoicingThreshold("invoicing_threshold")
                    .thresholdInvoiceCreated(true)
                    .build()
            )
        assertThat(subscriptionInvoicingThresholdExceededWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionInvoicingThresholdExceededWebhookEvent.Subscription.builder()
                    .id("VDGsT23osdLb84KD")
                    .customer(
                        CustomerMinified.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .plan(
                        SubscriptionInvoicingThresholdExceededWebhookEvent.Subscription.Plan
                            .builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(
                        SubscriptionInvoicingThresholdExceededWebhookEvent.Subscription.Status
                            .ACTIVE
                    )
                    .build()
            )
        assertThat(subscriptionInvoicingThresholdExceededWebhookEvent.type())
            .isEqualTo(
                SubscriptionInvoicingThresholdExceededWebhookEvent.Type
                    .SUBSCRIPTION_INVOICING_THRESHOLD_EXCEEDED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionInvoicingThresholdExceededWebhookEvent =
            SubscriptionInvoicingThresholdExceededWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    SubscriptionInvoicingThresholdExceededWebhookEvent.Properties.builder()
                        .evaluatedAmount("evaluated_amount")
                        .invoiceId("invoice_id")
                        .invoicingThreshold("invoicing_threshold")
                        .thresholdInvoiceCreated(true)
                        .build()
                )
                .subscription(
                    SubscriptionInvoicingThresholdExceededWebhookEvent.Subscription.builder()
                        .id("VDGsT23osdLb84KD")
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .plan(
                            SubscriptionInvoicingThresholdExceededWebhookEvent.Subscription.Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionInvoicingThresholdExceededWebhookEvent.Subscription.Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionInvoicingThresholdExceededWebhookEvent.Type
                        .SUBSCRIPTION_INVOICING_THRESHOLD_EXCEEDED
                )
                .build()

        val roundtrippedSubscriptionInvoicingThresholdExceededWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionInvoicingThresholdExceededWebhookEvent),
                jacksonTypeRef<SubscriptionInvoicingThresholdExceededWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionInvoicingThresholdExceededWebhookEvent)
            .isEqualTo(subscriptionInvoicingThresholdExceededWebhookEvent)
    }
}
