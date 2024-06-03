// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventBackfillListResponseTest {

    @Test
    fun createEventBackfillListResponse() {
        val eventBackfillListResponse =
            EventBackfillListResponse.builder()
                .id("string")
                .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("string")
                .eventsIngested(123L)
                .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(EventBackfillListResponse.Status.PENDING)
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(eventBackfillListResponse).isNotNull
        assertThat(eventBackfillListResponse.id()).isEqualTo("string")
        assertThat(eventBackfillListResponse.closeTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillListResponse.customerId()).isEqualTo("string")
        assertThat(eventBackfillListResponse.eventsIngested()).isEqualTo(123L)
        assertThat(eventBackfillListResponse.revertedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillListResponse.status())
            .isEqualTo(EventBackfillListResponse.Status.PENDING)
        assertThat(eventBackfillListResponse.timeframeEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillListResponse.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
