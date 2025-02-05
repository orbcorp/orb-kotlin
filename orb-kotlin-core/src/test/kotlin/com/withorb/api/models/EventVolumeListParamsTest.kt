// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventVolumeListParamsTest {

    @Test
    fun create() {
        EventVolumeListParams.builder()
            .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .cursor("cursor")
            .limit(1L)
            .timeframeEnd(OffsetDateTime.parse("2024-10-11T06:00:00Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EventVolumeListParams.builder()
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cursor("cursor")
                .limit(1L)
                .timeframeEnd(OffsetDateTime.parse("2024-10-11T06:00:00Z"))
                .build()
        val expected = QueryParams.builder()
        expected.put("timeframe_start", "2019-12-27T18:11:19.117Z")
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        expected.put("timeframe_end", "2024-10-11T06:00:00Z")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            EventVolumeListParams.builder()
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = QueryParams.builder()
        expected.put("timeframe_start", "2019-12-27T18:11:19.117Z")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
