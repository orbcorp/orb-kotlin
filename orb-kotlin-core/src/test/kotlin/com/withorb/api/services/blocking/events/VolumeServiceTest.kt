// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.events

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.EventVolumeListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VolumeServiceTest {

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val volumeService = client.events().volume()

        val eventVolumes =
            volumeService.list(
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
