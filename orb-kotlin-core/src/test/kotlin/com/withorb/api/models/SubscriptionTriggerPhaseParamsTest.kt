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
import com.withorb.api.models.SubscriptionTriggerPhaseParams
import com.withorb.api.models.SubscriptionTriggerPhaseParams.SubscriptionTriggerPhaseBody

class SubscriptionTriggerPhaseParamsTest {

    @Test
    fun createSubscriptionTriggerPhaseParams() {
      SubscriptionTriggerPhaseParams.builder()
          .subscriptionId("subscription_id")
          .effectiveDate(LocalDate.parse("2019-12-27"))
          .build()
    }

    @Test
    fun getBody() {
      val params = SubscriptionTriggerPhaseParams.builder()
          .subscriptionId("subscription_id")
          .effectiveDate(LocalDate.parse("2019-12-27"))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SubscriptionTriggerPhaseParams.builder()
          .subscriptionId("subscription_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = SubscriptionTriggerPhaseParams.builder()
          .subscriptionId("subscription_id")
          .build()
      assertThat(params).isNotNull
      // path param "subscriptionId"
      assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
