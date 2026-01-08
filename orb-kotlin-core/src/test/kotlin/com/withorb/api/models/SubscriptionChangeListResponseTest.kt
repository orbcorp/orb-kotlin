// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionChangeListResponseTest {

    @Test
    fun create() {
        val subscriptionChangeListResponse =
            SubscriptionChangeListResponse.builder()
                .id("id")
                .expirationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(SubscriptionChangeListResponse.Status.PENDING)
                .subscriptionId("subscription_id")
                .appliedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(subscriptionChangeListResponse.id()).isEqualTo("id")
        assertThat(subscriptionChangeListResponse.expirationTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionChangeListResponse.status())
            .isEqualTo(SubscriptionChangeListResponse.Status.PENDING)
        assertThat(subscriptionChangeListResponse.subscriptionId()).isEqualTo("subscription_id")
        assertThat(subscriptionChangeListResponse.appliedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionChangeListResponse.cancelledAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionChangeListResponse =
            SubscriptionChangeListResponse.builder()
                .id("id")
                .expirationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(SubscriptionChangeListResponse.Status.PENDING)
                .subscriptionId("subscription_id")
                .appliedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedSubscriptionChangeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionChangeListResponse),
                jacksonTypeRef<SubscriptionChangeListResponse>(),
            )

        assertThat(roundtrippedSubscriptionChangeListResponse)
            .isEqualTo(subscriptionChangeListResponse)
    }
}
