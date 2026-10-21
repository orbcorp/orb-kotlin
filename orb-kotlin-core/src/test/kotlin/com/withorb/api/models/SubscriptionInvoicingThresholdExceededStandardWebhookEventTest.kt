// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionInvoicingThresholdExceededStandardWebhookEventTest {

    @Test
    fun create() {
        val subscriptionInvoicingThresholdExceededStandardWebhookEvent =
            SubscriptionInvoicingThresholdExceededStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionInvoicingThresholdExceededStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Properties.builder()
                        .evaluatedAmount("evaluated_amount")
                        .invoiceId("invoice_id")
                        .invoicingThreshold("invoicing_threshold")
                        .thresholdInvoiceCreated(true)
                        .build()
                )
                .subscription(
                    SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Subscription
                        .builder()
                        .id("VDGsT23osdLb84KD")
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .plan(
                            SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Subscription
                                .Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Subscription
                                .Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Type
                        .SUBSCRIPTION_INVOICING_THRESHOLD_EXCEEDED
                )
                .build()

        assertThat(subscriptionInvoicingThresholdExceededStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionInvoicingThresholdExceededStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionInvoicingThresholdExceededStandardWebhookEvent.payloadStyle())
            .isEqualTo(
                SubscriptionInvoicingThresholdExceededStandardWebhookEvent.PayloadStyle.EXPANDED
            )
        assertThat(subscriptionInvoicingThresholdExceededStandardWebhookEvent.properties())
            .isEqualTo(
                SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Properties.builder()
                    .evaluatedAmount("evaluated_amount")
                    .invoiceId("invoice_id")
                    .invoicingThreshold("invoicing_threshold")
                    .thresholdInvoiceCreated(true)
                    .build()
            )
        assertThat(subscriptionInvoicingThresholdExceededStandardWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Subscription.builder()
                    .id("VDGsT23osdLb84KD")
                    .customer(
                        CustomerMinified.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .plan(
                        SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Subscription.Plan
                            .builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(
                        SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Subscription
                            .Status
                            .ACTIVE
                    )
                    .build()
            )
        assertThat(subscriptionInvoicingThresholdExceededStandardWebhookEvent.type())
            .isEqualTo(
                SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Type
                    .SUBSCRIPTION_INVOICING_THRESHOLD_EXCEEDED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionInvoicingThresholdExceededStandardWebhookEvent =
            SubscriptionInvoicingThresholdExceededStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionInvoicingThresholdExceededStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Properties.builder()
                        .evaluatedAmount("evaluated_amount")
                        .invoiceId("invoice_id")
                        .invoicingThreshold("invoicing_threshold")
                        .thresholdInvoiceCreated(true)
                        .build()
                )
                .subscription(
                    SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Subscription
                        .builder()
                        .id("VDGsT23osdLb84KD")
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .plan(
                            SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Subscription
                                .Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Subscription
                                .Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionInvoicingThresholdExceededStandardWebhookEvent.Type
                        .SUBSCRIPTION_INVOICING_THRESHOLD_EXCEEDED
                )
                .build()

        val roundtrippedSubscriptionInvoicingThresholdExceededStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    subscriptionInvoicingThresholdExceededStandardWebhookEvent
                ),
                jacksonTypeRef<SubscriptionInvoicingThresholdExceededStandardWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionInvoicingThresholdExceededStandardWebhookEvent)
            .isEqualTo(subscriptionInvoicingThresholdExceededStandardWebhookEvent)
    }
}
