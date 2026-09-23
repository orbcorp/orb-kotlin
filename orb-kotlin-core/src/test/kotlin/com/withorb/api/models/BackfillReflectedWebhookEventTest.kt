// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BackfillReflectedWebhookEventTest {

    @Test
    fun create() {
        val backfillReflectedWebhookEvent =
            BackfillReflectedWebhookEvent.builder()
                .id("id")
                .backfill(
                    BackfillReflectedWebhookEvent.Backfill.builder()
                        .id("id")
                        .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .eventsIngested(0L)
                        .replaceExistingEvents(true)
                        .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(BackfillReflectedWebhookEvent.Backfill.Status.PENDING)
                        .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deprecationFilter(
                            "my_numeric_property > 100 AND my_other_property = 'bar'"
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(BackfillReflectedWebhookEvent.Type.BACKFILL_REFLECTED)
                .build()

        assertThat(backfillReflectedWebhookEvent.id()).isEqualTo("id")
        assertThat(backfillReflectedWebhookEvent.backfill())
            .isEqualTo(
                BackfillReflectedWebhookEvent.Backfill.builder()
                    .id("id")
                    .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .eventsIngested(0L)
                    .replaceExistingEvents(true)
                    .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(BackfillReflectedWebhookEvent.Backfill.Status.PENDING)
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .build()
            )
        assertThat(backfillReflectedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(backfillReflectedWebhookEvent._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(backfillReflectedWebhookEvent.type())
            .isEqualTo(BackfillReflectedWebhookEvent.Type.BACKFILL_REFLECTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val backfillReflectedWebhookEvent =
            BackfillReflectedWebhookEvent.builder()
                .id("id")
                .backfill(
                    BackfillReflectedWebhookEvent.Backfill.builder()
                        .id("id")
                        .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .eventsIngested(0L)
                        .replaceExistingEvents(true)
                        .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(BackfillReflectedWebhookEvent.Backfill.Status.PENDING)
                        .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deprecationFilter(
                            "my_numeric_property > 100 AND my_other_property = 'bar'"
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(BackfillReflectedWebhookEvent.Type.BACKFILL_REFLECTED)
                .build()

        val roundtrippedBackfillReflectedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(backfillReflectedWebhookEvent),
                jacksonTypeRef<BackfillReflectedWebhookEvent>(),
            )

        assertThat(roundtrippedBackfillReflectedWebhookEvent)
            .isEqualTo(backfillReflectedWebhookEvent)
    }
}
