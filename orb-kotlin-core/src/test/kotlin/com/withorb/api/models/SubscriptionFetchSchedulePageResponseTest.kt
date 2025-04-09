// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionFetchSchedulePageResponseTest {

    @Test
    fun create() {
        val subscriptionFetchSchedulePageResponse =
            SubscriptionFetchSchedulePageResponse.builder()
                .addData(
                    SubscriptionFetchScheduleResponse.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .plan(
                            SubscriptionFetchScheduleResponse.Plan.builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(subscriptionFetchSchedulePageResponse.data())
            .containsExactly(
                SubscriptionFetchScheduleResponse.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .plan(
                        SubscriptionFetchScheduleResponse.Plan.builder()
                            .id("m2t5akQeh2obwxeU")
                            .externalPlanId("m2t5akQeh2obwxeU")
                            .name("Example plan")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(subscriptionFetchSchedulePageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionFetchSchedulePageResponse =
            SubscriptionFetchSchedulePageResponse.builder()
                .addData(
                    SubscriptionFetchScheduleResponse.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .plan(
                            SubscriptionFetchScheduleResponse.Plan.builder()
                                .id("m2t5akQeh2obwxeU")
                                .externalPlanId("m2t5akQeh2obwxeU")
                                .name("Example plan")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedSubscriptionFetchSchedulePageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionFetchSchedulePageResponse),
                jacksonTypeRef<SubscriptionFetchSchedulePageResponse>(),
            )

        assertThat(roundtrippedSubscriptionFetchSchedulePageResponse)
            .isEqualTo(subscriptionFetchSchedulePageResponse)
    }
}
