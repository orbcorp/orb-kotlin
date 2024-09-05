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
import com.withorb.api.models.SubscriptionCancelParams
import com.withorb.api.models.SubscriptionCancelParams.SubscriptionCancelBody

class SubscriptionCancelParamsTest {

    @Test
    fun createSubscriptionCancelParams() {
      SubscriptionCancelParams.builder()
          .subscriptionId("subscription_id")
          .cancelOption(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
          .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
    }

    @Test
    fun getBody() {
      val params = SubscriptionCancelParams.builder()
          .subscriptionId("subscription_id")
          .cancelOption(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
          .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.cancelOption()).isEqualTo(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
      assertThat(body.cancellationDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SubscriptionCancelParams.builder()
          .subscriptionId("subscription_id")
          .cancelOption(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.cancelOption()).isEqualTo(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
    }

    @Test
    fun getPathParam() {
      val params = SubscriptionCancelParams.builder()
          .subscriptionId("subscription_id")
          .cancelOption(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
          .build()
      assertThat(params).isNotNull
      // path param "subscriptionId"
      assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
