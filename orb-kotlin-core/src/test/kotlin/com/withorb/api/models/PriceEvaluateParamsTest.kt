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
import com.withorb.api.models.PriceEvaluateParams
import com.withorb.api.models.PriceEvaluateParams.PriceEvaluateBody

class PriceEvaluateParamsTest {

    @Test
    fun createPriceEvaluateParams() {
      PriceEvaluateParams.builder()
          .priceId("price_id")
          .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .customerId("customer_id")
          .externalCustomerId("external_customer_id")
          .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
          .groupingKeys(listOf("string"))
          .build()
    }

    @Test
    fun getBody() {
      val params = PriceEvaluateParams.builder()
          .priceId("price_id")
          .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .customerId("customer_id")
          .externalCustomerId("external_customer_id")
          .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
          .groupingKeys(listOf("string"))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(body.timeframeStart()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(body.customerId()).isEqualTo("customer_id")
      assertThat(body.externalCustomerId()).isEqualTo("external_customer_id")
      assertThat(body.filter()).isEqualTo("my_numeric_property > 100 AND my_other_property = 'bar'")
      assertThat(body.groupingKeys()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = PriceEvaluateParams.builder()
          .priceId("price_id")
          .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(body.timeframeStart()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getPathParam() {
      val params = PriceEvaluateParams.builder()
          .priceId("price_id")
          .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
      assertThat(params).isNotNull
      // path param "priceId"
      assertThat(params.getPathParam(0)).isEqualTo("price_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
