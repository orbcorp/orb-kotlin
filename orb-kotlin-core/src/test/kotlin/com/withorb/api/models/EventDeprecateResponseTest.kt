// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventDeprecateResponseTest {

    @Test
    fun createEventDeprecateResponse() {
        val eventDeprecateResponse =
            EventDeprecateResponse.builder().deprecated("deprecated").build()
        assertThat(eventDeprecateResponse).isNotNull
        assertThat(eventDeprecateResponse.deprecated()).isEqualTo("deprecated")
    }
}
