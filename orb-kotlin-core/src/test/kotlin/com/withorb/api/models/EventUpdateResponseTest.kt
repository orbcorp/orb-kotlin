// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventUpdateResponseTest {

    @Test
    fun createEventUpdateResponse() {
        val eventUpdateResponse = EventUpdateResponse.builder().amended("string").build()
        assertThat(eventUpdateResponse).isNotNull
        assertThat(eventUpdateResponse.amended()).isEqualTo("string")
    }
}
