// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

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
