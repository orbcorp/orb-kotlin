// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventVolumeListParamsTest {

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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("timeframe_start", "2019-12-27T18:11:19.117Z")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("timeframe_end", "2024-10-11T06:00:00Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            EventVolumeListParams.builder()
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("timeframe_start", "2019-12-27T18:11:19.117Z").build()
            )
    }
}
