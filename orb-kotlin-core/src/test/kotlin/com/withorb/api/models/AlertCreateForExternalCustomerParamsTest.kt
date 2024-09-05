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
import com.withorb.api.models.AlertCreateForExternalCustomerParams
import com.withorb.api.models.AlertCreateForExternalCustomerParams.AlertCreateForExternalCustomerBody

class AlertCreateForExternalCustomerParamsTest {

    @Test
    fun createAlertCreateForExternalCustomerParams() {
      AlertCreateForExternalCustomerParams.builder()
          .externalCustomerId("external_customer_id")
          .currency("currency")
          .type(AlertCreateForExternalCustomerParams.Type.USAGE_EXCEEDED)
          .thresholds(listOf(AlertCreateForExternalCustomerParams.Threshold.builder()
              .value(42.23)
              .build()))
          .build()
    }

    @Test
    fun getBody() {
      val params = AlertCreateForExternalCustomerParams.builder()
          .externalCustomerId("external_customer_id")
          .currency("currency")
          .type(AlertCreateForExternalCustomerParams.Type.USAGE_EXCEEDED)
          .thresholds(listOf(AlertCreateForExternalCustomerParams.Threshold.builder()
              .value(42.23)
              .build()))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.currency()).isEqualTo("currency")
      assertThat(body.type()).isEqualTo(AlertCreateForExternalCustomerParams.Type.USAGE_EXCEEDED)
      assertThat(body.thresholds()).isEqualTo(listOf(AlertCreateForExternalCustomerParams.Threshold.builder()
          .value(42.23)
          .build()))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = AlertCreateForExternalCustomerParams.builder()
          .externalCustomerId("external_customer_id")
          .currency("currency")
          .type(AlertCreateForExternalCustomerParams.Type.USAGE_EXCEEDED)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.currency()).isEqualTo("currency")
      assertThat(body.type()).isEqualTo(AlertCreateForExternalCustomerParams.Type.USAGE_EXCEEDED)
    }

    @Test
    fun getPathParam() {
      val params = AlertCreateForExternalCustomerParams.builder()
          .externalCustomerId("external_customer_id")
          .currency("currency")
          .type(AlertCreateForExternalCustomerParams.Type.USAGE_EXCEEDED)
          .build()
      assertThat(params).isNotNull
      // path param "externalCustomerId"
      assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
