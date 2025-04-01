// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventDeprecateResponseTest {

    @Test
    fun create() {
        val eventDeprecateResponse =
            EventDeprecateResponse.builder().deprecated("deprecated").build()

        assertThat(eventDeprecateResponse.deprecated()).isEqualTo("deprecated")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventDeprecateResponse =
            EventDeprecateResponse.builder().deprecated("deprecated").build()

        val roundtrippedEventDeprecateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventDeprecateResponse),
                jacksonTypeRef<EventDeprecateResponse>(),
            )

        assertThat(roundtrippedEventDeprecateResponse).isEqualTo(eventDeprecateResponse)
    }
}
