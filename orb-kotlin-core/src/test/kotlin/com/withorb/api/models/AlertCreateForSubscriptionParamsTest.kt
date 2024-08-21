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
import com.withorb.api.models.AlertCreateForSubscriptionParams
import com.withorb.api.models.AlertCreateForSubscriptionParams.AlertCreateForSubscriptionBody

class AlertCreateForSubscriptionParamsTest {

    @Test
    fun createAlertCreateForSubscriptionParams() {
      AlertCreateForSubscriptionParams.builder()
          .subscriptionId("subscription_id")
          .thresholds(listOf(AlertCreateForSubscriptionParams.Threshold.builder()
              .value(42.23)
              .build()))
          .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
          .metricId("metric_id")
          .build()
    }

    @Test
    fun getBody() {
      val params = AlertCreateForSubscriptionParams.builder()
          .subscriptionId("subscription_id")
          .thresholds(listOf(AlertCreateForSubscriptionParams.Threshold.builder()
              .value(42.23)
              .build()))
          .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
          .metricId("metric_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.thresholds()).isEqualTo(listOf(AlertCreateForSubscriptionParams.Threshold.builder()
          .value(42.23)
          .build()))
      assertThat(body.type()).isEqualTo(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
      assertThat(body.metricId()).isEqualTo("metric_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = AlertCreateForSubscriptionParams.builder()
          .subscriptionId("subscription_id")
          .thresholds(listOf(AlertCreateForSubscriptionParams.Threshold.builder()
              .value(42.23)
              .build()))
          .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.thresholds()).isEqualTo(listOf(AlertCreateForSubscriptionParams.Threshold.builder()
          .value(42.23)
          .build()))
      assertThat(body.type()).isEqualTo(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
    }

    @Test
    fun getPathParam() {
      val params = AlertCreateForSubscriptionParams.builder()
          .subscriptionId("subscription_id")
          .thresholds(listOf(AlertCreateForSubscriptionParams.Threshold.builder()
              .value(42.23)
              .build()))
          .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
          .build()
      assertThat(params).isNotNull
      // path param "subscriptionId"
      assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
