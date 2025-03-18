// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSearchResponseTest {

    @Test
    fun create() {
        val eventSearchResponse =
            EventSearchResponse.builder()
                .addData(
                    EventSearchResponse.Data.builder()
                        .id("id")
                        .customerId("customer_id")
                        .deprecated(true)
                        .eventName("event_name")
                        .externalCustomerId("external_customer_id")
                        .properties(JsonValue.from(mapOf<String, Any>()))
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .build()
                )
                .build()

        assertThat(eventSearchResponse.data())
            .containsExactly(
                EventSearchResponse.Data.builder()
                    .id("id")
                    .customerId("customer_id")
                    .deprecated(true)
                    .eventName("event_name")
                    .externalCustomerId("external_customer_id")
                    .properties(JsonValue.from(mapOf<String, Any>()))
                    .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                    .build()
            )
    }
}
