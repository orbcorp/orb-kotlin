// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSearchParamsTest {

    @Test
    fun createEventSearchParams() {
        EventSearchParams.builder()
            .addEventId("string")
            .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EventSearchParams.builder()
                .addEventId("string")
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.eventIds()).isEqualTo(listOf("string"))
        assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = EventSearchParams.builder().addEventId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.eventIds()).isEqualTo(listOf("string"))
    }
}
