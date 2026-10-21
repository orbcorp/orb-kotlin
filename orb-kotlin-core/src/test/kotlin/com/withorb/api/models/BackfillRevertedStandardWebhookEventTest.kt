// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BackfillRevertedStandardWebhookEventTest {

    @Test
    fun create() {
        val backfillRevertedStandardWebhookEvent =
            BackfillRevertedStandardWebhookEvent.builder()
                .id("id")
                .backfill(
                    BackfillRevertedStandardWebhookEvent.Backfill.builder()
                        .id("id")
                        .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .eventsIngested(0L)
                        .replaceExistingEvents(true)
                        .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(BackfillRevertedStandardWebhookEvent.Backfill.Status.PENDING)
                        .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deprecationFilter(
                            "my_numeric_property > 100 AND my_other_property = 'bar'"
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(BackfillRevertedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(BackfillRevertedStandardWebhookEvent.Type.BACKFILL_REVERTED)
                .build()

        assertThat(backfillRevertedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(backfillRevertedStandardWebhookEvent.backfill())
            .isEqualTo(
                BackfillRevertedStandardWebhookEvent.Backfill.builder()
                    .id("id")
                    .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .eventsIngested(0L)
                    .replaceExistingEvents(true)
                    .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(BackfillRevertedStandardWebhookEvent.Backfill.Status.PENDING)
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .build()
            )
        assertThat(backfillRevertedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(backfillRevertedStandardWebhookEvent.payloadStyle())
            .isEqualTo(BackfillRevertedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(backfillRevertedStandardWebhookEvent._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(backfillRevertedStandardWebhookEvent.type())
            .isEqualTo(BackfillRevertedStandardWebhookEvent.Type.BACKFILL_REVERTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val backfillRevertedStandardWebhookEvent =
            BackfillRevertedStandardWebhookEvent.builder()
                .id("id")
                .backfill(
                    BackfillRevertedStandardWebhookEvent.Backfill.builder()
                        .id("id")
                        .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .eventsIngested(0L)
                        .replaceExistingEvents(true)
                        .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(BackfillRevertedStandardWebhookEvent.Backfill.Status.PENDING)
                        .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deprecationFilter(
                            "my_numeric_property > 100 AND my_other_property = 'bar'"
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(BackfillRevertedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(BackfillRevertedStandardWebhookEvent.Type.BACKFILL_REVERTED)
                .build()

        val roundtrippedBackfillRevertedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(backfillRevertedStandardWebhookEvent),
                jacksonTypeRef<BackfillRevertedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedBackfillRevertedStandardWebhookEvent)
            .isEqualTo(backfillRevertedStandardWebhookEvent)
    }
}
