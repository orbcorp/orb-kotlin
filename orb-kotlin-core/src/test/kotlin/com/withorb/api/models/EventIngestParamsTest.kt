// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventIngestParamsTest {

    @Test
    fun createEventIngestParams() {
        EventIngestParams.builder()
            .events(
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
            .backfillId("backfill_id")
            .debug(true)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EventIngestParams.builder()
                .events(
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
                .backfillId("backfill_id")
                .debug(true)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("backfill_id", listOf("backfill_id"))
        expected.put("debug", listOf("true"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            EventIngestParams.builder()
                .events(
                    listOf(
                        EventIngestParams.Event.builder()
                            .eventName("event_name")
                            .idempotencyKey("idempotency_key")
                            .properties(JsonValue.from(mapOf<String, Any>()))
                            .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                            .build()
                    )
                )
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getBody() {
        val params =
            EventIngestParams.builder()
                .events(
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
                .backfillId("backfill_id")
                .debug(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
    fun getBodyWithoutOptionalFields() {
        val params =
            EventIngestParams.builder()
                .events(
                    listOf(
                        EventIngestParams.Event.builder()
                            .eventName("event_name")
                            .idempotencyKey("idempotency_key")
                            .properties(JsonValue.from(mapOf<String, Any>()))
                            .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
