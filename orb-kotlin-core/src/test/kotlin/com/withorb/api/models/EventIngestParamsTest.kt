// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventIngestParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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
        val expected = QueryParams.builder()
        expected.put("backfill_id", "backfill_id")
        expected.put("debug", "true")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            EventIngestParams.builder()
                .addEvent(
                    EventIngestParams.Event.builder()
                        .eventName("event_name")
                        .idempotencyKey("idempotency_key")
                        .properties(JsonValue.from(mapOf<String, Any>()))
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertNotNull(body)
        assertThat(body.events())
            .isEqualTo(
                listOf(
                    EventIngestParams.Event.builder()
                        .eventName("event_name")
                        .idempotencyKey("idempotency_key")
                        .properties(JsonValue.from(mapOf<String, Any>()))
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .customerId("customer_id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventIngestParams.builder()
                .addEvent(
                    EventIngestParams.Event.builder()
                        .eventName("event_name")
                        .idempotencyKey("idempotency_key")
                        .properties(JsonValue.from(mapOf<String, Any>()))
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.events())
            .isEqualTo(
                listOf(
                    EventIngestParams.Event.builder()
                        .eventName("event_name")
                        .idempotencyKey("idempotency_key")
                        .properties(JsonValue.from(mapOf<String, Any>()))
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .build()
                )
            )
    }
}
