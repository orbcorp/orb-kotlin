// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopLevelPingResponseTest {

    @Test
    fun create() {
        val topLevelPingResponse = TopLevelPingResponse.builder().response("response").build()

        assertThat(topLevelPingResponse.response()).isEqualTo("response")
    }
}
