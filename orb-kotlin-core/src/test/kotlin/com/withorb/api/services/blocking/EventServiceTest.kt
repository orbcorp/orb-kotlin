// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EventServiceTest {

    @Test
    fun callUpdate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventService = client.events()
        val eventUpdateResponse =
            eventService.update(
                EventUpdateParams.builder()
                    .eventId("string")
                    .eventName("string")
                    .properties(JsonValue.from(mapOf<String, Any>()))
                    .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                    .customerId("string")
                    .externalCustomerId("string")
                    .build()
            )
        println(eventUpdateResponse)
        eventUpdateResponse.validate()
    }

    @Test
    fun callDeprecate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventService = client.events()
        val eventDeprecateResponse =
            eventService.deprecate(EventDeprecateParams.builder().eventId("string").build())
        println(eventDeprecateResponse)
        eventDeprecateResponse.validate()
    }

    @Test
    fun callIngest() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventService = client.events()
        val eventIngestResponse =
            eventService.ingest(
                EventIngestParams.builder()
                    .events(
                        listOf(
                            EventIngestParams.Event.builder()
                                .eventName("string")
                                .idempotencyKey("string")
                                .properties(JsonValue.from(mapOf<String, Any>()))
                                .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                                .customerId("string")
                                .externalCustomerId("string")
                                .build()
                        )
                    )
                    .backfillId("string")
                    .debug(true)
                    .build()
            )
        println(eventIngestResponse)
        eventIngestResponse.validate()
    }

    @Test
    fun callSearch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventService = client.events()
        val eventSearchResponse =
            eventService.search(
                EventSearchParams.builder()
                    .eventIds(listOf("string"))
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(eventSearchResponse)
        eventSearchResponse.validate()
    }
}
