// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventBackfillFetchResponseTest {

    @Test
    fun create() {
        val eventBackfillFetchResponse =
            EventBackfillFetchResponse.builder()
                .id("id")
                .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .eventsIngested(0L)
                .replaceExistingEvents(true)
                .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(EventBackfillFetchResponse.Status.PENDING)
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                .build()

        assertThat(eventBackfillFetchResponse.id()).isEqualTo("id")
        assertThat(eventBackfillFetchResponse.closeTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillFetchResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillFetchResponse.customerId()).isEqualTo("customer_id")
        assertThat(eventBackfillFetchResponse.eventsIngested()).isEqualTo(0L)
        assertThat(eventBackfillFetchResponse.replaceExistingEvents()).isEqualTo(true)
        assertThat(eventBackfillFetchResponse.revertedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillFetchResponse.status())
            .isEqualTo(EventBackfillFetchResponse.Status.PENDING)
        assertThat(eventBackfillFetchResponse.timeframeEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillFetchResponse.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillFetchResponse.deprecationFilter())
            .isEqualTo("my_numeric_property > 100 AND my_other_property = 'bar'")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventBackfillFetchResponse =
            EventBackfillFetchResponse.builder()
                .id("id")
                .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .eventsIngested(0L)
                .replaceExistingEvents(true)
                .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(EventBackfillFetchResponse.Status.PENDING)
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                .build()

        val roundtrippedEventBackfillFetchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventBackfillFetchResponse),
                jacksonTypeRef<EventBackfillFetchResponse>(),
            )

        assertThat(roundtrippedEventBackfillFetchResponse).isEqualTo(eventBackfillFetchResponse)
    }
}
