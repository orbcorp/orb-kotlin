// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
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
                        .properties(
                            EventSearchResponse.Data.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
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
                    .properties(
                        EventSearchResponse.Data.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventSearchResponse =
            EventSearchResponse.builder()
                .addData(
                    EventSearchResponse.Data.builder()
                        .id("id")
                        .customerId("customer_id")
                        .deprecated(true)
                        .eventName("event_name")
                        .externalCustomerId("external_customer_id")
                        .properties(
                            EventSearchResponse.Data.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .build()
                )
                .build()

        val roundtrippedEventSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventSearchResponse),
                jacksonTypeRef<EventSearchResponse>(),
            )

        assertThat(roundtrippedEventSearchResponse).isEqualTo(eventSearchResponse)
    }
}
