// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventBackfillCloseResponseTest {

    @Test
    fun createEventBackfillCloseResponse() {
        val eventBackfillCloseResponse =
            EventBackfillCloseResponse.builder()
                .id("string")
                .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("string")
                .eventsIngested(123L)
                .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(EventBackfillCloseResponse.Status.PENDING)
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(eventBackfillCloseResponse).isNotNull
        assertThat(eventBackfillCloseResponse.id()).isEqualTo("string")
        assertThat(eventBackfillCloseResponse.closeTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCloseResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCloseResponse.customerId()).isEqualTo("string")
        assertThat(eventBackfillCloseResponse.eventsIngested()).isEqualTo(123L)
        assertThat(eventBackfillCloseResponse.revertedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCloseResponse.status())
            .isEqualTo(EventBackfillCloseResponse.Status.PENDING)
        assertThat(eventBackfillCloseResponse.timeframeEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCloseResponse.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
