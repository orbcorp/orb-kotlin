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
import com.withorb.api.models.SubscriptionUnscheduleFixedFeeQuantityUpdatesParams
import com.withorb.api.models.SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.SubscriptionUnscheduleFixedFeeQuantityUpdatesBody

class SubscriptionUnscheduleFixedFeeQuantityUpdatesParamsTest {

    @Test
    fun createSubscriptionUnscheduleFixedFeeQuantityUpdatesParams() {
      SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
          .subscriptionId("subscription_id")
          .priceId("price_id")
          .build()
    }

    @Test
    fun getBody() {
      val params = SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
          .subscriptionId("subscription_id")
          .priceId("price_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.priceId()).isEqualTo("price_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
          .subscriptionId("subscription_id")
          .priceId("price_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.priceId()).isEqualTo("price_id")
    }

    @Test
    fun getPathParam() {
      val params = SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
          .subscriptionId("subscription_id")
          .priceId("price_id")
          .build()
      assertThat(params).isNotNull
      // path param "subscriptionId"
      assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
