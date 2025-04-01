// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventUpdateResponseTest {

    @Test
    fun create() {
        val eventUpdateResponse = EventUpdateResponse.builder().amended("amended").build()

        assertThat(eventUpdateResponse.amended()).isEqualTo("amended")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventUpdateResponse = EventUpdateResponse.builder().amended("amended").build()

        val roundtrippedEventUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventUpdateResponse),
                jacksonTypeRef<EventUpdateResponse>(),
            )

        assertThat(roundtrippedEventUpdateResponse).isEqualTo(eventUpdateResponse)
    }
}
