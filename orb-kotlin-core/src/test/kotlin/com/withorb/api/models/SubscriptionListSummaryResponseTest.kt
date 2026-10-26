// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionListSummaryResponseTest {

    @Test
    fun create() {
        val subscriptionListSummaryResponse =
            SubscriptionListSummaryResponse.builder()
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
                    SubscriptionListSummaryResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .plan(
                    SubscriptionListSummaryResponse.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(SubscriptionListSummaryResponse.Status.ACTIVE)
                .build()

        assertThat(subscriptionListSummaryResponse.id()).isEqualTo("VDGsT23osdLb84KD")
        assertThat(subscriptionListSummaryResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListSummaryResponse.customer())
            .isEqualTo(
                CustomerMinified.builder()
                    .id("id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
        assertThat(subscriptionListSummaryResponse.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListSummaryResponse.metadata())
            .isEqualTo(
                SubscriptionListSummaryResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(subscriptionListSummaryResponse.name()).isEqualTo("name")
        assertThat(subscriptionListSummaryResponse.plan())
            .isEqualTo(
                SubscriptionListSummaryResponse.Plan.builder()
                    .id("m2t5akQeh2obwxeU")
                    .externalPlanId("m2t5akQeh2obwxeU")
                    .name("Example plan")
                    .build()
            )
        assertThat(subscriptionListSummaryResponse.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionListSummaryResponse.status())
            .isEqualTo(SubscriptionListSummaryResponse.Status.ACTIVE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionListSummaryResponse =
            SubscriptionListSummaryResponse.builder()
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
                    SubscriptionListSummaryResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .plan(
                    SubscriptionListSummaryResponse.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(SubscriptionListSummaryResponse.Status.ACTIVE)
                .build()

        val roundtrippedSubscriptionListSummaryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionListSummaryResponse),
                jacksonTypeRef<SubscriptionListSummaryResponse>(),
            )

        assertThat(roundtrippedSubscriptionListSummaryResponse)
            .isEqualTo(subscriptionListSummaryResponse)
    }
}
