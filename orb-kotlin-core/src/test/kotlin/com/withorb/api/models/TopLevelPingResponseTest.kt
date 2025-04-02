// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopLevelPingResponseTest {

    @Test
    fun create() {
        val topLevelPingResponse = TopLevelPingResponse.builder().response("response").build()

        assertThat(topLevelPingResponse.response()).isEqualTo("response")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val topLevelPingResponse = TopLevelPingResponse.builder().response("response").build()

        val roundtrippedTopLevelPingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(topLevelPingResponse),
                jacksonTypeRef<TopLevelPingResponse>(),
            )

        assertThat(roundtrippedTopLevelPingResponse).isEqualTo(topLevelPingResponse)
    }
}
