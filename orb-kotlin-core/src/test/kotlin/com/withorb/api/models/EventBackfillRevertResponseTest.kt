// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventBackfillRevertResponseTest {

    @Test
    fun createEventBackfillRevertResponse() {
        val eventBackfillRevertResponse =
            EventBackfillRevertResponse.builder()
                .id("id")
                .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .eventsIngested(0L)
                .replaceExistingEvents(true)
                .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(EventBackfillRevertResponse.Status.PENDING)
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                .build()
        assertThat(eventBackfillRevertResponse).isNotNull
        assertThat(eventBackfillRevertResponse.id()).isEqualTo("id")
        assertThat(eventBackfillRevertResponse.closeTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillRevertResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillRevertResponse.customerId()).isEqualTo("customer_id")
        assertThat(eventBackfillRevertResponse.eventsIngested()).isEqualTo(0L)
        assertThat(eventBackfillRevertResponse.replaceExistingEvents()).isEqualTo(true)
        assertThat(eventBackfillRevertResponse.revertedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillRevertResponse.status())
            .isEqualTo(EventBackfillRevertResponse.Status.PENDING)
        assertThat(eventBackfillRevertResponse.timeframeEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillRevertResponse.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillRevertResponse.deprecationFilter())
            .isEqualTo("my_numeric_property > 100 AND my_other_property = 'bar'")
    }
}
