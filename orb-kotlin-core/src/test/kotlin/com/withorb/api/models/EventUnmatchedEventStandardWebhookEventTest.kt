// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventUnmatchedEventStandardWebhookEventTest {

    @Test
    fun create() {
        val eventUnmatchedEventStandardWebhookEvent =
            EventUnmatchedEventStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(EventUnmatchedEventStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    EventUnmatchedEventStandardWebhookEvent.Properties.builder()
                        .event(
                            EventUnmatchedEventStandardWebhookEvent.Properties.Event.builder()
                                .customerId("customer_id")
                                .eventName("event_name")
                                .externalCustomerId("external_customer_id")
                                .idempotencyKey("idempotency_key")
                                .properties(
                                    EventUnmatchedEventStandardWebhookEvent.Properties.Event
                                        .InnerProperties
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .type(EventUnmatchedEventStandardWebhookEvent.Type.EVENT_UNMATCHED_EVENT)
                .build()

        assertThat(eventUnmatchedEventStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(eventUnmatchedEventStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventUnmatchedEventStandardWebhookEvent.payloadStyle())
            .isEqualTo(EventUnmatchedEventStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(eventUnmatchedEventStandardWebhookEvent.properties())
            .isEqualTo(
                EventUnmatchedEventStandardWebhookEvent.Properties.builder()
                    .event(
                        EventUnmatchedEventStandardWebhookEvent.Properties.Event.builder()
                            .customerId("customer_id")
                            .eventName("event_name")
                            .externalCustomerId("external_customer_id")
                            .idempotencyKey("idempotency_key")
                            .properties(
                                EventUnmatchedEventStandardWebhookEvent.Properties.Event
                                    .InnerProperties
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(eventUnmatchedEventStandardWebhookEvent.type())
            .isEqualTo(EventUnmatchedEventStandardWebhookEvent.Type.EVENT_UNMATCHED_EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventUnmatchedEventStandardWebhookEvent =
            EventUnmatchedEventStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(EventUnmatchedEventStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(
                    EventUnmatchedEventStandardWebhookEvent.Properties.builder()
                        .event(
                            EventUnmatchedEventStandardWebhookEvent.Properties.Event.builder()
                                .customerId("customer_id")
                                .eventName("event_name")
                                .externalCustomerId("external_customer_id")
                                .idempotencyKey("idempotency_key")
                                .properties(
                                    EventUnmatchedEventStandardWebhookEvent.Properties.Event
                                        .InnerProperties
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .type(EventUnmatchedEventStandardWebhookEvent.Type.EVENT_UNMATCHED_EVENT)
                .build()

        val roundtrippedEventUnmatchedEventStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventUnmatchedEventStandardWebhookEvent),
                jacksonTypeRef<EventUnmatchedEventStandardWebhookEvent>(),
            )

        assertThat(roundtrippedEventUnmatchedEventStandardWebhookEvent)
            .isEqualTo(eventUnmatchedEventStandardWebhookEvent)
    }
}
