// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonValue
import com.withorb.api.models.EventDeprecateParams
import com.withorb.api.models.EventIngestParams
import com.withorb.api.models.EventSearchParams
import com.withorb.api.models.EventUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EventServiceTest {

    @Test
    fun update() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventService = client.events()

        val event =
            eventService.update(
                EventUpdateParams.builder()
                    .eventId("event_id")
                    .eventName("event_name")
                    .properties(JsonValue.from(mapOf<String, Any>()))
                    .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                    .customerId("customer_id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )

        event.validate()
    }

    @Test
    fun deprecate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventService = client.events()

        val response =
            eventService.deprecate(EventDeprecateParams.builder().eventId("event_id").build())

        response.validate()
    }

    @Test
    fun ingest() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventService = client.events()

        val response =
            eventService.ingest(
                EventIngestParams.builder()
                    .backfillId("backfill_id")
                    .debug(true)
                    .addEvent(
                        EventIngestParams.Event.builder()
                            .eventName("event_name")
                            .idempotencyKey("idempotency_key")
                            .properties(JsonValue.from(mapOf<String, Any>()))
                            .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                            .customerId("customer_id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun search() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventService = client.events()

        val response =
            eventService.search(
                EventSearchParams.builder()
                    .addEventId("string")
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        response.validate()
    }
}
