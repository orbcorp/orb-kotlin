// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventIngestResponseTest {

    @Test
    fun createEventIngestResponse() {
        val eventIngestResponse =
            EventIngestResponse.builder()
                .validationFailed(
                    listOf(
                        EventIngestResponse.ValidationFailed.builder()
                            .idempotencyKey("idempotency_key")
                            .validationErrors(listOf("string"))
                            .build()
                    )
                )
                .debug(
                    EventIngestResponse.Debug.builder()
                        .duplicate(listOf("string"))
                        .ingested(listOf("string"))
                        .build()
                )
                .build()
        assertThat(eventIngestResponse).isNotNull
        assertThat(eventIngestResponse.validationFailed())
            .containsExactly(
                EventIngestResponse.ValidationFailed.builder()
                    .idempotencyKey("idempotency_key")
                    .validationErrors(listOf("string"))
                    .build()
            )
        assertThat(eventIngestResponse.debug())
            .isEqualTo(
                EventIngestResponse.Debug.builder()
                    .duplicate(listOf("string"))
                    .ingested(listOf("string"))
                    .build()
            )
    }
}
