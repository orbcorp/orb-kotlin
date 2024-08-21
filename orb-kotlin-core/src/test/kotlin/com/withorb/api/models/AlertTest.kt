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
import com.withorb.api.models.Alert

class AlertTest {

    @Test
    fun createAlert() {
      val alert = Alert.builder()
          .id("XuxCbt7x9L82yyeF")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .currency("currency")
          .customer(Alert.Customer.builder().build())
          .enabled(true)
          .metric(Alert.Metric.builder().build())
          .plan(Alert.Plan.builder().build())
          .subscription(Alert.Subscription.builder().build())
          .thresholds(listOf(Alert.Threshold.builder()
              .value(42.23)
              .build()))
          .type(Alert.Type.USAGE_EXCEEDED)
          .build()
      assertThat(alert).isNotNull
      assertThat(alert.id()).isEqualTo("XuxCbt7x9L82yyeF")
      assertThat(alert.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(alert.currency()).isEqualTo("currency")
      assertThat(alert.customer()).isEqualTo(Alert.Customer.builder().build())
      assertThat(alert.enabled()).isEqualTo(true)
      assertThat(alert.metric()).isEqualTo(Alert.Metric.builder().build())
      assertThat(alert.plan()).isEqualTo(Alert.Plan.builder().build())
      assertThat(alert.subscription()).isEqualTo(Alert.Subscription.builder().build())
      assertThat(alert.thresholds()).containsExactly(Alert.Threshold.builder()
          .value(42.23)
          .build())
      assertThat(alert.type()).isEqualTo(Alert.Type.USAGE_EXCEEDED)
    }
}
