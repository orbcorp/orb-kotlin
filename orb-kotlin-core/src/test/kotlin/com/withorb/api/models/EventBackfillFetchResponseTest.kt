// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventBackfillFetchResponseTest {

    @Test
    fun createEventBackfillFetchResponse() {
        val eventBackfillFetchResponse =
            EventBackfillFetchResponse.builder()
                .id("string")
                .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("string")
                .eventsIngested(123L)
                .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(EventBackfillFetchResponse.Status.PENDING)
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(eventBackfillFetchResponse).isNotNull
        assertThat(eventBackfillFetchResponse.id()).isEqualTo("string")
        assertThat(eventBackfillFetchResponse.closeTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillFetchResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillFetchResponse.customerId()).isEqualTo("string")
        assertThat(eventBackfillFetchResponse.eventsIngested()).isEqualTo(123L)
        assertThat(eventBackfillFetchResponse.revertedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillFetchResponse.status())
            .isEqualTo(EventBackfillFetchResponse.Status.PENDING)
        assertThat(eventBackfillFetchResponse.timeframeEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillFetchResponse.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
