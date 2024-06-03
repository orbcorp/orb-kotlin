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
    }

    @Test
    fun getQueryParams() {
        val params =
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
        val expected = mutableMapOf<String, List<String>>()
        expected.put("backfill_id", listOf("string"))
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
                            .eventName("string")
                            .idempotencyKey("string")
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.events())
            .isEqualTo(
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EventIngestParams.builder()
                .events(
                    listOf(
                        EventIngestParams.Event.builder()
                            .eventName("string")
                            .idempotencyKey("string")
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
                        .eventName("string")
                        .idempotencyKey("string")
                        .properties(JsonValue.from(mapOf<String, Any>()))
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .build()
                )
            )
    }
}
