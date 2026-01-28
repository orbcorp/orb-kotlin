// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionChangeListPageResponseTest {

    @Test
    fun create() {
        val subscriptionChangeListPageResponse =
            SubscriptionChangeListPageResponse.builder()
                .addData(
                    SubscriptionChangeListResponse.builder()
                        .id("id")
                        .expirationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(SubscriptionChangeListResponse.Status.PENDING)
                        .subscriptionId("subscription_id")
                        .appliedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(subscriptionChangeListPageResponse.data())
            .containsExactly(
                SubscriptionChangeListResponse.builder()
                    .id("id")
                    .expirationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(SubscriptionChangeListResponse.Status.PENDING)
                    .subscriptionId("subscription_id")
                    .appliedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(subscriptionChangeListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionChangeListPageResponse =
            SubscriptionChangeListPageResponse.builder()
                .addData(
                    SubscriptionChangeListResponse.builder()
                        .id("id")
                        .expirationTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(SubscriptionChangeListResponse.Status.PENDING)
                        .subscriptionId("subscription_id")
                        .appliedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedSubscriptionChangeListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionChangeListPageResponse),
                jacksonTypeRef<SubscriptionChangeListPageResponse>(),
            )

        assertThat(roundtrippedSubscriptionChangeListPageResponse)
            .isEqualTo(subscriptionChangeListPageResponse)
    }
}
