// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.withorb.api.core.ContentTypes
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.MultipartFormValue
import com.withorb.api.models.*
import com.withorb.api.models.EventBackfillCreateParams
import com.withorb.api.models.EventBackfillCreateParams.EventBackfillCreateBody

class EventBackfillCreateParamsTest {

    @Test
    fun createEventBackfillCreateParams() {
      EventBackfillCreateParams.builder()
          .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .customerId("customer_id")
          .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
          .externalCustomerId("external_customer_id")
          .replaceExistingEvents(true)
          .build()
    }

    @Test
    fun getBody() {
      val params = EventBackfillCreateParams.builder()
          .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .customerId("customer_id")
          .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
          .externalCustomerId("external_customer_id")
          .replaceExistingEvents(true)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(body.timeframeStart()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(body.closeTime()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(body.customerId()).isEqualTo("customer_id")
      assertThat(body.deprecationFilter()).isEqualTo("my_numeric_property > 100 AND my_other_property = 'bar'")
      assertThat(body.externalCustomerId()).isEqualTo("external_customer_id")
      assertThat(body.replaceExistingEvents()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = EventBackfillCreateParams.builder()
          .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(body.timeframeStart()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
