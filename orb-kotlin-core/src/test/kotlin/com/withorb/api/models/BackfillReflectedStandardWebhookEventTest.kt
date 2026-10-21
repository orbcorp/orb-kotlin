// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BackfillReflectedStandardWebhookEventTest {

    @Test
    fun create() {
        val backfillReflectedStandardWebhookEvent =
            BackfillReflectedStandardWebhookEvent.builder()
                .id("id")
                .backfill(
                    BackfillReflectedStandardWebhookEvent.Backfill.builder()
                        .id("id")
                        .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .eventsIngested(0L)
                        .replaceExistingEvents(true)
                        .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(BackfillReflectedStandardWebhookEvent.Backfill.Status.PENDING)
                        .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deprecationFilter(
                            "my_numeric_property > 100 AND my_other_property = 'bar'"
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(BackfillReflectedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(BackfillReflectedStandardWebhookEvent.Type.BACKFILL_REFLECTED)
                .build()

        assertThat(backfillReflectedStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(backfillReflectedStandardWebhookEvent.backfill())
            .isEqualTo(
                BackfillReflectedStandardWebhookEvent.Backfill.builder()
                    .id("id")
                    .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .eventsIngested(0L)
                    .replaceExistingEvents(true)
                    .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(BackfillReflectedStandardWebhookEvent.Backfill.Status.PENDING)
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .build()
            )
        assertThat(backfillReflectedStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(backfillReflectedStandardWebhookEvent.payloadStyle())
            .isEqualTo(BackfillReflectedStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(backfillReflectedStandardWebhookEvent._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(backfillReflectedStandardWebhookEvent.type())
            .isEqualTo(BackfillReflectedStandardWebhookEvent.Type.BACKFILL_REFLECTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val backfillReflectedStandardWebhookEvent =
            BackfillReflectedStandardWebhookEvent.builder()
                .id("id")
                .backfill(
                    BackfillReflectedStandardWebhookEvent.Backfill.builder()
                        .id("id")
                        .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .eventsIngested(0L)
                        .replaceExistingEvents(true)
                        .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(BackfillReflectedStandardWebhookEvent.Backfill.Status.PENDING)
                        .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deprecationFilter(
                            "my_numeric_property > 100 AND my_other_property = 'bar'"
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(BackfillReflectedStandardWebhookEvent.PayloadStyle.EXPANDED)
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(BackfillReflectedStandardWebhookEvent.Type.BACKFILL_REFLECTED)
                .build()

        val roundtrippedBackfillReflectedStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(backfillReflectedStandardWebhookEvent),
                jacksonTypeRef<BackfillReflectedStandardWebhookEvent>(),
            )

        assertThat(roundtrippedBackfillReflectedStandardWebhookEvent)
            .isEqualTo(backfillReflectedStandardWebhookEvent)
    }
}
