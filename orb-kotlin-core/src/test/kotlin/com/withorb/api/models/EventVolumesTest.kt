// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventVolumesTest {

    @Test
    fun create() {
        val eventVolumes =
            EventVolumes.builder()
                .addData(
                    EventVolumes.Data.builder()
                        .count(0L)
                        .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(eventVolumes.data())
            .containsExactly(
                EventVolumes.Data.builder()
                    .count(0L)
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventVolumes =
            EventVolumes.builder()
                .addData(
                    EventVolumes.Data.builder()
                        .count(0L)
                        .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedEventVolumes =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventVolumes),
                jacksonTypeRef<EventVolumes>(),
            )

        assertThat(roundtrippedEventVolumes).isEqualTo(eventVolumes)
    }
}
