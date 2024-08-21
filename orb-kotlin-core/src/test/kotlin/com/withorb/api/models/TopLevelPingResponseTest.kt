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
import com.withorb.api.models.TopLevelPingResponse

class TopLevelPingResponseTest {

    @Test
    fun createTopLevelPingResponse() {
      val topLevelPingResponse = TopLevelPingResponse.builder()
          .response("response")
          .build()
      assertThat(topLevelPingResponse).isNotNull
      assertThat(topLevelPingResponse.response()).isEqualTo("response")
    }
}
