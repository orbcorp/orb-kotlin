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
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricCreateParams.MetricCreateBody

class MetricCreateParamsTest {

    @Test
    fun createMetricCreateParams() {
      MetricCreateParams.builder()
          .description("Sum of bytes downloaded in fast mode")
          .itemId("item_id")
          .name("Bytes downloaded")
          .sql("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
          .metadata(MetricCreateParams.Metadata.builder().build())
          .build()
    }

    @Test
    fun getBody() {
      val params = MetricCreateParams.builder()
          .description("Sum of bytes downloaded in fast mode")
          .itemId("item_id")
          .name("Bytes downloaded")
          .sql("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
          .metadata(MetricCreateParams.Metadata.builder().build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.description()).isEqualTo("Sum of bytes downloaded in fast mode")
      assertThat(body.itemId()).isEqualTo("item_id")
      assertThat(body.name()).isEqualTo("Bytes downloaded")
      assertThat(body.sql()).isEqualTo("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
      assertThat(body.metadata()).isEqualTo(MetricCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = MetricCreateParams.builder()
          .itemId("item_id")
          .name("Bytes downloaded")
          .sql("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.itemId()).isEqualTo("item_id")
      assertThat(body.name()).isEqualTo("Bytes downloaded")
      assertThat(body.sql()).isEqualTo("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
    }
}
