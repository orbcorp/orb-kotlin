// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventUpdateResponseTest {

    @Test
    fun create() {
        val eventUpdateResponse = EventUpdateResponse.builder().amended("amended").build()

        assertThat(eventUpdateResponse.amended()).isEqualTo("amended")
    }
}
