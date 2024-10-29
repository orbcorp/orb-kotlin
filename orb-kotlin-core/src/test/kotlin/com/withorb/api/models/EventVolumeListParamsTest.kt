// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventVolumeListParamsTest {

    @Test
    fun createEventVolumeListParams() {
        EventVolumeListParams.builder()
            .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .cursor("cursor")
            .limit(123L)
            .timeframeEnd(OffsetDateTime.parse("2024-10-11T06:00:00Z"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EventVolumeListParams.builder()
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cursor("cursor")
                .limit(123L)
                .timeframeEnd(OffsetDateTime.parse("2024-10-11T06:00:00Z"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("timeframe_start", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("cursor", listOf("cursor"))
        expected.put("limit", listOf("123"))
        expected.put("timeframe_end", listOf("2024-10-11T06:00:00Z"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            EventVolumeListParams.builder()
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("timeframe_start", listOf("2019-12-27T18:11:19.117Z"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
