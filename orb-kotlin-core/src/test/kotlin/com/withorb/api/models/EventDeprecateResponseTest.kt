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
import com.withorb.api.models.EventDeprecateResponse

class EventDeprecateResponseTest {

    @Test
    fun createEventDeprecateResponse() {
      val eventDeprecateResponse = EventDeprecateResponse.builder()
          .deprecated("deprecated")
          .build()
      assertThat(eventDeprecateResponse).isNotNull
      assertThat(eventDeprecateResponse.deprecated()).isEqualTo("deprecated")
    }
}
