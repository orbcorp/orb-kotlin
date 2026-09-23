// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricEventsDroppedByWatermarkWebhookEventTest {

    @Test
    fun create() {
        val metricEventsDroppedByWatermarkWebhookEvent =
            MetricEventsDroppedByWatermarkWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    MetricEventsDroppedByWatermarkWebhookEvent.Properties.builder()
                        .dropped(0L)
                        .eventName("event_name")
                        .total(0L)
                        .windowEnd("window_end")
                        .windowStart("window_start")
                        .build()
                )
                .type(
                    MetricEventsDroppedByWatermarkWebhookEvent.Type
                        .METRIC_EVENTS_DROPPED_BY_WATERMARK
                )
                .build()

        assertThat(metricEventsDroppedByWatermarkWebhookEvent.id()).isEqualTo("id")
        assertThat(metricEventsDroppedByWatermarkWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(metricEventsDroppedByWatermarkWebhookEvent.properties())
            .isEqualTo(
                MetricEventsDroppedByWatermarkWebhookEvent.Properties.builder()
                    .dropped(0L)
                    .eventName("event_name")
                    .total(0L)
                    .windowEnd("window_end")
                    .windowStart("window_start")
                    .build()
            )
        assertThat(metricEventsDroppedByWatermarkWebhookEvent.type())
            .isEqualTo(
                MetricEventsDroppedByWatermarkWebhookEvent.Type.METRIC_EVENTS_DROPPED_BY_WATERMARK
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metricEventsDroppedByWatermarkWebhookEvent =
            MetricEventsDroppedByWatermarkWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    MetricEventsDroppedByWatermarkWebhookEvent.Properties.builder()
                        .dropped(0L)
                        .eventName("event_name")
                        .total(0L)
                        .windowEnd("window_end")
                        .windowStart("window_start")
                        .build()
                )
                .type(
                    MetricEventsDroppedByWatermarkWebhookEvent.Type
                        .METRIC_EVENTS_DROPPED_BY_WATERMARK
                )
                .build()

        val roundtrippedMetricEventsDroppedByWatermarkWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metricEventsDroppedByWatermarkWebhookEvent),
                jacksonTypeRef<MetricEventsDroppedByWatermarkWebhookEvent>(),
            )

        assertThat(roundtrippedMetricEventsDroppedByWatermarkWebhookEvent)
            .isEqualTo(metricEventsDroppedByWatermarkWebhookEvent)
    }
}
