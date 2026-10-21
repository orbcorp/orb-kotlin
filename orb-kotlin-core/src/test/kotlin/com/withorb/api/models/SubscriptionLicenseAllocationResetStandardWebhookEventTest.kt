// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionLicenseAllocationResetStandardWebhookEventTest {

    @Test
    fun create() {
        val subscriptionLicenseAllocationResetStandardWebhookEvent =
            SubscriptionLicenseAllocationResetStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionLicenseAllocationResetStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionLicenseAllocationResetStandardWebhookEvent.Properties.builder()
                        .addResetAllocation(
                            SubscriptionLicenseAllocationResetStandardWebhookEvent.Properties
                                .ResetAllocation
                                .builder()
                                .allocationAmount("allocation_amount")
                                .licenseTypeId("license_type_id")
                                .pricingUnitId("pricing_unit_id")
                                .build()
                        )
                        .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .subscription(
                    SubscriptionLicenseAllocationResetStandardWebhookEvent.Subscription.builder()
                        .id("VDGsT23osdLb84KD")
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .plan(
                            SubscriptionLicenseAllocationResetStandardWebhookEvent.Subscription.Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionLicenseAllocationResetStandardWebhookEvent.Subscription
                                .Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionLicenseAllocationResetStandardWebhookEvent.Type
                        .SUBSCRIPTION_LICENSE_ALLOCATION_RESET
                )
                .build()

        assertThat(subscriptionLicenseAllocationResetStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionLicenseAllocationResetStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionLicenseAllocationResetStandardWebhookEvent.payloadStyle())
            .isEqualTo(SubscriptionLicenseAllocationResetStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(subscriptionLicenseAllocationResetStandardWebhookEvent.properties())
            .isEqualTo(
                SubscriptionLicenseAllocationResetStandardWebhookEvent.Properties.builder()
                    .addResetAllocation(
                        SubscriptionLicenseAllocationResetStandardWebhookEvent.Properties
                            .ResetAllocation
                            .builder()
                            .allocationAmount("allocation_amount")
                            .licenseTypeId("license_type_id")
                            .pricingUnitId("pricing_unit_id")
                            .build()
                    )
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(subscriptionLicenseAllocationResetStandardWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionLicenseAllocationResetStandardWebhookEvent.Subscription.builder()
                    .id("VDGsT23osdLb84KD")
                    .customer(
                        CustomerMinified.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .plan(
                        SubscriptionLicenseAllocationResetStandardWebhookEvent.Subscription.Plan
                            .builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(
                        SubscriptionLicenseAllocationResetStandardWebhookEvent.Subscription.Status
                            .ACTIVE
                    )
                    .build()
            )
        assertThat(subscriptionLicenseAllocationResetStandardWebhookEvent.type())
            .isEqualTo(
                SubscriptionLicenseAllocationResetStandardWebhookEvent.Type
                    .SUBSCRIPTION_LICENSE_ALLOCATION_RESET
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionLicenseAllocationResetStandardWebhookEvent =
            SubscriptionLicenseAllocationResetStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    SubscriptionLicenseAllocationResetStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    SubscriptionLicenseAllocationResetStandardWebhookEvent.Properties.builder()
                        .addResetAllocation(
                            SubscriptionLicenseAllocationResetStandardWebhookEvent.Properties
                                .ResetAllocation
                                .builder()
                                .allocationAmount("allocation_amount")
                                .licenseTypeId("license_type_id")
                                .pricingUnitId("pricing_unit_id")
                                .build()
                        )
                        .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .subscription(
                    SubscriptionLicenseAllocationResetStandardWebhookEvent.Subscription.builder()
                        .id("VDGsT23osdLb84KD")
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .plan(
                            SubscriptionLicenseAllocationResetStandardWebhookEvent.Subscription.Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionLicenseAllocationResetStandardWebhookEvent.Subscription
                                .Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionLicenseAllocationResetStandardWebhookEvent.Type
                        .SUBSCRIPTION_LICENSE_ALLOCATION_RESET
                )
                .build()

        val roundtrippedSubscriptionLicenseAllocationResetStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    subscriptionLicenseAllocationResetStandardWebhookEvent
                ),
                jacksonTypeRef<SubscriptionLicenseAllocationResetStandardWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionLicenseAllocationResetStandardWebhookEvent)
            .isEqualTo(subscriptionLicenseAllocationResetStandardWebhookEvent)
    }
}
