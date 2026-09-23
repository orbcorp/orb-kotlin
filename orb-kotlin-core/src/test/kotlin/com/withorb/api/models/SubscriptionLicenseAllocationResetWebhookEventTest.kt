// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionLicenseAllocationResetWebhookEventTest {

    @Test
    fun create() {
        val subscriptionLicenseAllocationResetWebhookEvent =
            SubscriptionLicenseAllocationResetWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    SubscriptionLicenseAllocationResetWebhookEvent.Properties.builder()
                        .addResetAllocation(
                            SubscriptionLicenseAllocationResetWebhookEvent.Properties
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
                    SubscriptionLicenseAllocationResetWebhookEvent.Subscription.builder()
                        .id("VDGsT23osdLb84KD")
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .plan(
                            SubscriptionLicenseAllocationResetWebhookEvent.Subscription.Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionLicenseAllocationResetWebhookEvent.Subscription.Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionLicenseAllocationResetWebhookEvent.Type
                        .SUBSCRIPTION_LICENSE_ALLOCATION_RESET
                )
                .build()

        assertThat(subscriptionLicenseAllocationResetWebhookEvent.id()).isEqualTo("id")
        assertThat(subscriptionLicenseAllocationResetWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionLicenseAllocationResetWebhookEvent.properties())
            .isEqualTo(
                SubscriptionLicenseAllocationResetWebhookEvent.Properties.builder()
                    .addResetAllocation(
                        SubscriptionLicenseAllocationResetWebhookEvent.Properties.ResetAllocation
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
        assertThat(subscriptionLicenseAllocationResetWebhookEvent.subscription())
            .isEqualTo(
                SubscriptionLicenseAllocationResetWebhookEvent.Subscription.builder()
                    .id("VDGsT23osdLb84KD")
                    .customer(
                        CustomerMinified.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .plan(
                        SubscriptionLicenseAllocationResetWebhookEvent.Subscription.Plan.builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(
                        SubscriptionLicenseAllocationResetWebhookEvent.Subscription.Status.ACTIVE
                    )
                    .build()
            )
        assertThat(subscriptionLicenseAllocationResetWebhookEvent.type())
            .isEqualTo(
                SubscriptionLicenseAllocationResetWebhookEvent.Type
                    .SUBSCRIPTION_LICENSE_ALLOCATION_RESET
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionLicenseAllocationResetWebhookEvent =
            SubscriptionLicenseAllocationResetWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    SubscriptionLicenseAllocationResetWebhookEvent.Properties.builder()
                        .addResetAllocation(
                            SubscriptionLicenseAllocationResetWebhookEvent.Properties
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
                    SubscriptionLicenseAllocationResetWebhookEvent.Subscription.builder()
                        .id("VDGsT23osdLb84KD")
                        .customer(
                            CustomerMinified.builder()
                                .id("id")
                                .externalCustomerId("external_customer_id")
                                .build()
                        )
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .plan(
                            SubscriptionLicenseAllocationResetWebhookEvent.Subscription.Plan
                                .builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(
                            SubscriptionLicenseAllocationResetWebhookEvent.Subscription.Status
                                .ACTIVE
                        )
                        .build()
                )
                .type(
                    SubscriptionLicenseAllocationResetWebhookEvent.Type
                        .SUBSCRIPTION_LICENSE_ALLOCATION_RESET
                )
                .build()

        val roundtrippedSubscriptionLicenseAllocationResetWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionLicenseAllocationResetWebhookEvent),
                jacksonTypeRef<SubscriptionLicenseAllocationResetWebhookEvent>(),
            )

        assertThat(roundtrippedSubscriptionLicenseAllocationResetWebhookEvent)
            .isEqualTo(subscriptionLicenseAllocationResetWebhookEvent)
    }
}
