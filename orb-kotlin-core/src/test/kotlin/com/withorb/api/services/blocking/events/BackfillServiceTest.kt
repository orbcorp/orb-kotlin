// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.events

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.*
import com.withorb.api.models.EventBackfillListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BackfillServiceTest {

    @Test
    fun callCreate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillService = client.events().backfills()
        val eventBackfillCreateResponse =
            backfillService.create(
                EventBackfillCreateParams.builder()
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("string")
                    .externalCustomerId("string")
                    .replaceExistingEvents(true)
                    .build()
            )
        println(eventBackfillCreateResponse)
        eventBackfillCreateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillService = client.events().backfills()
        val backfills = backfillService.list(EventBackfillListParams.builder().build())
        println(backfills)
        backfills.data().forEach { it.validate() }
    }

    @Test
    fun callClose() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillService = client.events().backfills()
        val eventBackfillCloseResponse =
            backfillService.close(EventBackfillCloseParams.builder().backfillId("string").build())
        println(eventBackfillCloseResponse)
        eventBackfillCloseResponse.validate()
    }

    @Test
    fun callFetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillService = client.events().backfills()
        val eventBackfillFetchResponse =
            backfillService.fetch(EventBackfillFetchParams.builder().backfillId("string").build())
        println(eventBackfillFetchResponse)
        eventBackfillFetchResponse.validate()
    }

    @Test
    fun callRevert() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillService = client.events().backfills()
        val eventBackfillRevertResponse =
            backfillService.revert(EventBackfillRevertParams.builder().backfillId("string").build())
        println(eventBackfillRevertResponse)
        eventBackfillRevertResponse.validate()
    }
}
