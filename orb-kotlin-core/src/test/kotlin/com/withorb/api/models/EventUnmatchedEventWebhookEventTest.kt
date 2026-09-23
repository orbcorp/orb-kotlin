// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventUnmatchedEventWebhookEventTest {

    @Test
    fun create() {
        val eventUnmatchedEventWebhookEvent =
            EventUnmatchedEventWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    EventUnmatchedEventWebhookEvent.Properties.builder()
                        .event(
                            EventUnmatchedEventWebhookEvent.Properties.Event.builder()
                                .customerId("customer_id")
                                .eventName("event_name")
                                .externalCustomerId("external_customer_id")
                                .idempotencyKey("idempotency_key")
                                .properties(
                                    EventUnmatchedEventWebhookEvent.Properties.Event.InnerProperties
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .type(EventUnmatchedEventWebhookEvent.Type.EVENT_UNMATCHED_EVENT)
                .build()

        assertThat(eventUnmatchedEventWebhookEvent.id()).isEqualTo("id")
        assertThat(eventUnmatchedEventWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventUnmatchedEventWebhookEvent.properties())
            .isEqualTo(
                EventUnmatchedEventWebhookEvent.Properties.builder()
                    .event(
                        EventUnmatchedEventWebhookEvent.Properties.Event.builder()
                            .customerId("customer_id")
                            .eventName("event_name")
                            .externalCustomerId("external_customer_id")
                            .idempotencyKey("idempotency_key")
                            .properties(
                                EventUnmatchedEventWebhookEvent.Properties.Event.InnerProperties
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(eventUnmatchedEventWebhookEvent.type())
            .isEqualTo(EventUnmatchedEventWebhookEvent.Type.EVENT_UNMATCHED_EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventUnmatchedEventWebhookEvent =
            EventUnmatchedEventWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    EventUnmatchedEventWebhookEvent.Properties.builder()
                        .event(
                            EventUnmatchedEventWebhookEvent.Properties.Event.builder()
                                .customerId("customer_id")
                                .eventName("event_name")
                                .externalCustomerId("external_customer_id")
                                .idempotencyKey("idempotency_key")
                                .properties(
                                    EventUnmatchedEventWebhookEvent.Properties.Event.InnerProperties
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .type(EventUnmatchedEventWebhookEvent.Type.EVENT_UNMATCHED_EVENT)
                .build()

        val roundtrippedEventUnmatchedEventWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventUnmatchedEventWebhookEvent),
                jacksonTypeRef<EventUnmatchedEventWebhookEvent>(),
            )

        assertThat(roundtrippedEventUnmatchedEventWebhookEvent)
            .isEqualTo(eventUnmatchedEventWebhookEvent)
    }
}
