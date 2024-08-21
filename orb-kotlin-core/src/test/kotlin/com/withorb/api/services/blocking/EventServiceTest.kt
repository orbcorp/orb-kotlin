// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.withorb.api.TestServerExtension
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.services.blocking.EventService
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class EventServiceTest {

    @Test
    fun callUpdate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val eventService = client.events()
      val eventUpdateResponse = eventService.update(EventUpdateParams.builder()
          .eventId("event_id")
          .eventName("event_name")
          .properties(JsonValue.from(mapOf<String, Any>()))
          .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
          .customerId("customer_id")
          .externalCustomerId("external_customer_id")
          .build())
      println(eventUpdateResponse)
      eventUpdateResponse.validate()
    }

    @Test
    fun callDeprecate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val eventService = client.events()
      val eventDeprecateResponse = eventService.deprecate(EventDeprecateParams.builder()
          .eventId("event_id")
          .build())
      println(eventDeprecateResponse)
      eventDeprecateResponse.validate()
    }

    @Test
    fun callIngest() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val eventService = client.events()
      val eventIngestResponse = eventService.ingest(EventIngestParams.builder()
          .events(listOf(EventIngestParams.Event.builder()
              .eventName("event_name")
              .idempotencyKey("idempotency_key")
              .properties(JsonValue.from(mapOf<String, Any>()))
              .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
              .customerId("customer_id")
              .externalCustomerId("external_customer_id")
              .build()))
          .backfillId("backfill_id")
          .debug(true)
          .build())
      println(eventIngestResponse)
      eventIngestResponse.validate()
    }

    @Test
    fun callSearch() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val eventService = client.events()
      val eventSearchResponse = eventService.search(EventSearchParams.builder()
          .eventIds(listOf("string"))
          .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())
      println(eventSearchResponse)
      eventSearchResponse.validate()
    }
}
