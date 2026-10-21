// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionFixedFeeQuantityUpdatedStandardWebhookEventTest {

    @Test
    fun create() {
        val subscriptionFixedFeeQuantityUpdatedStandardWebhookEvent =
            SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Properties.builder()
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .newQuantity(0.0)
                        .oldQuantity(0.0)
                        .priceId("price_id")
                        .build()
                )
                .subscription(
                    SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Subscription
                                .Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Subscription
                                .Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Subscription
                                .Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Type
                        .SUBSCRIPTION_FIXED_FEE_QUANTITY_UPDATED
                )
                .build()

        assertThat(subscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.payloadStyle())
            .isEqualTo(
                SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.PayloadStyle.EXPANDED
            )
        assertThat(subscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.properties())
            .isEqualTo(
                SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Properties.builder()
                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .newQuantity(0.0)
                    .oldQuantity(0.0)
                    .priceId("price_id")
                    .build()
            )
        assertThat(subscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Subscription.builder()
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
                        SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Subscription
                            .Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .plan(
                        SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Subscription.Plan
                            .builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(
                        SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Subscription.Status
                            .ACTIVE
                    )
                    .build()
            )
        assertThat(subscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.type())
            .isEqualTo(
                SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Type
                    .SUBSCRIPTION_FIXED_FEE_QUANTITY_UPDATED
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionFixedFeeQuantityUpdatedStandardWebhookEvent =
            SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Properties.builder()
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .newQuantity(0.0)
                        .oldQuantity(0.0)
                        .priceId("price_id")
                        .build()
                )
                .subscription(
                    SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Subscription.builder()
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
                            SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Subscription
                                .Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .plan(
                            SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Subscription
                                .Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Subscription
                                .Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent.Type
                        .SUBSCRIPTION_FIXED_FEE_QUANTITY_UPDATED
                )
                .build()

        val roundtrippedSubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    subscriptionFixedFeeQuantityUpdatedStandardWebhookEvent
                ),
                jacksonTypeRef<SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent)
            .isEqualTo(subscriptionFixedFeeQuantityUpdatedStandardWebhookEvent)
    }
}
