// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventVolumesTest {

    @Test
    fun createEventVolumes() {
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
        assertThat(eventVolumes).isNotNull
        assertThat(eventVolumes.data())
            .containsExactly(
                EventVolumes.Data.builder()
                    .count(0L)
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }
}
