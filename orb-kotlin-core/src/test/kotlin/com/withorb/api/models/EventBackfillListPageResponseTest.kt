// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventBackfillListPageResponseTest {

    @Test
    fun create() {
        val eventBackfillListPageResponse =
            EventBackfillListPageResponse.builder()
                .addData(
                    EventBackfillListResponse.builder()
                        .id("id")
                        .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .eventsIngested(0L)
                        .replaceExistingEvents(true)
                        .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(EventBackfillListResponse.Status.PENDING)
                        .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deprecationFilter(
                            "my_numeric_property > 100 AND my_other_property = 'bar'"
                        )
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(eventBackfillListPageResponse.data())
            .containsExactly(
                EventBackfillListResponse.builder()
                    .id("id")
                    .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .eventsIngested(0L)
                    .replaceExistingEvents(true)
                    .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(EventBackfillListResponse.Status.PENDING)
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .build()
            )
        assertThat(eventBackfillListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventBackfillListPageResponse =
            EventBackfillListPageResponse.builder()
                .addData(
                    EventBackfillListResponse.builder()
                        .id("id")
                        .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .eventsIngested(0L)
                        .replaceExistingEvents(true)
                        .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(EventBackfillListResponse.Status.PENDING)
                        .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deprecationFilter(
                            "my_numeric_property > 100 AND my_other_property = 'bar'"
                        )
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedEventBackfillListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventBackfillListPageResponse),
                jacksonTypeRef<EventBackfillListPageResponse>(),
            )

        assertThat(roundtrippedEventBackfillListPageResponse)
            .isEqualTo(eventBackfillListPageResponse)
    }
}
