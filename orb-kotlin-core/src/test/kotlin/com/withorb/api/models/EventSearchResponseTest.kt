// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.models.EventSearchResponse

class EventSearchResponseTest {

    @Test
    fun createEventSearchResponse() {
      val eventSearchResponse = EventSearchResponse.builder()
          .data(listOf(EventSearchResponse.Data.builder()
              .id("id")
              .customerId("customer_id")
              .eventName("event_name")
              .externalCustomerId("external_customer_id")
              .properties(JsonValue.from(mapOf<String, Any>()))
              .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
              .build()))
          .build()
      assertThat(eventSearchResponse).isNotNull
      assertThat(eventSearchResponse.data()).containsExactly(EventSearchResponse.Data.builder()
          .id("id")
          .customerId("customer_id")
          .eventName("event_name")
          .externalCustomerId("external_customer_id")
          .properties(JsonValue.from(mapOf<String, Any>()))
          .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
          .build())
    }
}
