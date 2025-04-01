// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventBackfillListResponseTest {

    @Test
    fun create() {
        val eventBackfillListResponse =
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

        assertThat(eventBackfillListResponse.id()).isEqualTo("id")
        assertThat(eventBackfillListResponse.closeTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillListResponse.customerId()).isEqualTo("customer_id")
        assertThat(eventBackfillListResponse.eventsIngested()).isEqualTo(0L)
        assertThat(eventBackfillListResponse.replaceExistingEvents()).isEqualTo(true)
        assertThat(eventBackfillListResponse.revertedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillListResponse.status())
            .isEqualTo(EventBackfillListResponse.Status.PENDING)
        assertThat(eventBackfillListResponse.timeframeEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillListResponse.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillListResponse.deprecationFilter())
            .isEqualTo("my_numeric_property > 100 AND my_other_property = 'bar'")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventBackfillListResponse =
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

        val roundtrippedEventBackfillListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventBackfillListResponse),
                jacksonTypeRef<EventBackfillListResponse>(),
            )

        assertThat(roundtrippedEventBackfillListResponse).isEqualTo(eventBackfillListResponse)
    }
}
