// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertCreateForSubscriptionParamsTest {

    @Test
    fun create() {
      AlertCreateForSubscriptionParams.builder()
          .subscriptionId("subscription_id")
          .addThreshold(AlertCreateForSubscriptionParams.Threshold.builder()
              .value(0.0)
              .build())
          .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
          .metricId("metric_id")
          .build()
    }

    @Test
    fun body() {
      val params = AlertCreateForSubscriptionParams.builder()
          .subscriptionId("subscription_id")
          .addThreshold(AlertCreateForSubscriptionParams.Threshold.builder()
              .value(0.0)
              .build())
          .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
          .metricId("metric_id")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.thresholds()).isEqualTo(listOf(AlertCreateForSubscriptionParams.Threshold.builder()
          .value(0.0)
          .build()))
      assertThat(body.type()).isEqualTo(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
      assertThat(body.metricId()).isEqualTo("metric_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = AlertCreateForSubscriptionParams.builder()
          .subscriptionId("subscription_id")
          .addThreshold(AlertCreateForSubscriptionParams.Threshold.builder()
              .value(0.0)
              .build())
          .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.thresholds()).isEqualTo(listOf(AlertCreateForSubscriptionParams.Threshold.builder()
          .value(0.0)
          .build()))
      assertThat(body.type()).isEqualTo(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
    }

    @Test
    fun getPathParam() {
      val params = AlertCreateForSubscriptionParams.builder()
          .subscriptionId("subscription_id")
          .addThreshold(AlertCreateForSubscriptionParams.Threshold.builder()
              .value(0.0)
              .build())
          .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
          .build()
      assertThat(params).isNotNull
      // path param "subscriptionId"
      assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
