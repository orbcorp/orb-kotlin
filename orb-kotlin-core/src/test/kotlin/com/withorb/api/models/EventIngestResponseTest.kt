// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventIngestResponseTest {

    @Test
    fun create() {
        val eventIngestResponse =
            EventIngestResponse.builder()
                .addValidationFailed(
                    EventIngestResponse.ValidationFailed.builder()
                        .idempotencyKey("idempotency_key")
                        .addValidationError("string")
                        .build()
                )
                .debug(
                    EventIngestResponse.Debug.builder()
                        .addDuplicate("string")
                        .addIngested("string")
                        .build()
                )
                .build()

        assertThat(eventIngestResponse.validationFailed())
            .containsExactly(
                EventIngestResponse.ValidationFailed.builder()
                    .idempotencyKey("idempotency_key")
                    .addValidationError("string")
                    .build()
            )
        assertThat(eventIngestResponse.debug())
            .isEqualTo(
                EventIngestResponse.Debug.builder()
                    .addDuplicate("string")
                    .addIngested("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventIngestResponse =
            EventIngestResponse.builder()
                .addValidationFailed(
                    EventIngestResponse.ValidationFailed.builder()
                        .idempotencyKey("idempotency_key")
                        .addValidationError("string")
                        .build()
                )
                .debug(
                    EventIngestResponse.Debug.builder()
                        .addDuplicate("string")
                        .addIngested("string")
                        .build()
                )
                .build()

        val roundtrippedEventIngestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventIngestResponse),
                jacksonTypeRef<EventIngestResponse>(),
            )

        assertThat(roundtrippedEventIngestResponse).isEqualTo(eventIngestResponse)
    }
}
