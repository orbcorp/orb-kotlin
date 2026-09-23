// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BackfillRevertedWebhookEventTest {

    @Test
    fun create() {
        val backfillRevertedWebhookEvent =
            BackfillRevertedWebhookEvent.builder()
                .id("id")
                .backfill(
                    BackfillRevertedWebhookEvent.Backfill.builder()
                        .id("id")
                        .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .eventsIngested(0L)
                        .replaceExistingEvents(true)
                        .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(BackfillRevertedWebhookEvent.Backfill.Status.PENDING)
                        .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deprecationFilter(
                            "my_numeric_property > 100 AND my_other_property = 'bar'"
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(BackfillRevertedWebhookEvent.Type.BACKFILL_REVERTED)
                .build()

        assertThat(backfillRevertedWebhookEvent.id()).isEqualTo("id")
        assertThat(backfillRevertedWebhookEvent.backfill())
            .isEqualTo(
                BackfillRevertedWebhookEvent.Backfill.builder()
                    .id("id")
                    .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .eventsIngested(0L)
                    .replaceExistingEvents(true)
                    .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(BackfillRevertedWebhookEvent.Backfill.Status.PENDING)
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .build()
            )
        assertThat(backfillRevertedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(backfillRevertedWebhookEvent._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(backfillRevertedWebhookEvent.type())
            .isEqualTo(BackfillRevertedWebhookEvent.Type.BACKFILL_REVERTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val backfillRevertedWebhookEvent =
            BackfillRevertedWebhookEvent.builder()
                .id("id")
                .backfill(
                    BackfillRevertedWebhookEvent.Backfill.builder()
                        .id("id")
                        .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .eventsIngested(0L)
                        .replaceExistingEvents(true)
                        .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(BackfillRevertedWebhookEvent.Backfill.Status.PENDING)
                        .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deprecationFilter(
                            "my_numeric_property > 100 AND my_other_property = 'bar'"
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(BackfillRevertedWebhookEvent.Type.BACKFILL_REVERTED)
                .build()

        val roundtrippedBackfillRevertedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(backfillRevertedWebhookEvent),
                jacksonTypeRef<BackfillRevertedWebhookEvent>(),
            )

        assertThat(roundtrippedBackfillRevertedWebhookEvent).isEqualTo(backfillRevertedWebhookEvent)
    }
}
