// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricEventsDroppedByWatermarkStandardWebhookEventTest {

    @Test
    fun create() {
        val metricEventsDroppedByWatermarkStandardWebhookEvent =
            MetricEventsDroppedByWatermarkStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    MetricEventsDroppedByWatermarkStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    MetricEventsDroppedByWatermarkStandardWebhookEvent.Properties.builder()
                        .dropped(0L)
                        .eventName("event_name")
                        .total(0L)
                        .windowEnd("window_end")
                        .windowStart("window_start")
                        .build()
                )
                .type(
                    MetricEventsDroppedByWatermarkStandardWebhookEvent.Type
                        .METRIC_EVENTS_DROPPED_BY_WATERMARK
                )
                .build()

        assertThat(metricEventsDroppedByWatermarkStandardWebhookEvent.id()).isEqualTo("id")
        assertThat(metricEventsDroppedByWatermarkStandardWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(metricEventsDroppedByWatermarkStandardWebhookEvent.payloadStyle())
            .isEqualTo(MetricEventsDroppedByWatermarkStandardWebhookEvent.PayloadStyle.EXPANDED)
        assertThat(metricEventsDroppedByWatermarkStandardWebhookEvent.properties())
            .isEqualTo(
                MetricEventsDroppedByWatermarkStandardWebhookEvent.Properties.builder()
                    .dropped(0L)
                    .eventName("event_name")
                    .total(0L)
                    .windowEnd("window_end")
                    .windowStart("window_start")
                    .build()
            )
        assertThat(metricEventsDroppedByWatermarkStandardWebhookEvent.type())
            .isEqualTo(
                MetricEventsDroppedByWatermarkStandardWebhookEvent.Type
                    .METRIC_EVENTS_DROPPED_BY_WATERMARK
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metricEventsDroppedByWatermarkStandardWebhookEvent =
            MetricEventsDroppedByWatermarkStandardWebhookEvent.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .payloadStyle(
                    MetricEventsDroppedByWatermarkStandardWebhookEvent.PayloadStyle.EXPANDED
                )
                .properties(
                    MetricEventsDroppedByWatermarkStandardWebhookEvent.Properties.builder()
                        .dropped(0L)
                        .eventName("event_name")
                        .total(0L)
                        .windowEnd("window_end")
                        .windowStart("window_start")
                        .build()
                )
                .type(
                    MetricEventsDroppedByWatermarkStandardWebhookEvent.Type
                        .METRIC_EVENTS_DROPPED_BY_WATERMARK
                )
                .build()

        val roundtrippedMetricEventsDroppedByWatermarkStandardWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metricEventsDroppedByWatermarkStandardWebhookEvent),
                jacksonTypeRef<MetricEventsDroppedByWatermarkStandardWebhookEvent>(),
            )

        assertThat(roundtrippedMetricEventsDroppedByWatermarkStandardWebhookEvent)
            .isEqualTo(metricEventsDroppedByWatermarkStandardWebhookEvent)
    }
}
