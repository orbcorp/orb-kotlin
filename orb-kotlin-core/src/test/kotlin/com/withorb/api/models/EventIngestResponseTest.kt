// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventIngestResponseTest {

    @Test
    fun createEventIngestResponse() {
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
        assertThat(eventIngestResponse).isNotNull
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
}
