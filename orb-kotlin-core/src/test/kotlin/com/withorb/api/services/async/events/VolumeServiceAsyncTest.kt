// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.events

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.EventVolumeListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VolumeServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val volumeServiceAsync = client.events().volume()

        val eventVolumes =
            volumeServiceAsync.list(
                EventVolumeListParams.builder()
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cursor("cursor")
                    .limit(1L)
                    .timeframeEnd(OffsetDateTime.parse("2024-10-11T06:00:00Z"))
                    .build()
            )

        eventVolumes.validate()
    }
}
