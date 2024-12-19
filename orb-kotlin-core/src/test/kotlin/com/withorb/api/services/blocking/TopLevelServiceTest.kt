// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.TopLevelPingParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TopLevelServiceTest {

    @Test
    fun callPing() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topLevelService = client.topLevel()
        val topLevelPingResponse = topLevelService.ping(TopLevelPingParams.builder().build())
        println(topLevelPingResponse)
        topLevelPingResponse.validate()
    }
}
