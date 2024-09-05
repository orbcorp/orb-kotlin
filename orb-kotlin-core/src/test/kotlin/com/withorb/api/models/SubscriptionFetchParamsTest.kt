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
import com.withorb.api.models.SubscriptionFetchParams

class SubscriptionFetchParamsTest {

    @Test
    fun createSubscriptionFetchParams() {
      SubscriptionFetchParams.builder()
          .subscriptionId("subscription_id")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = SubscriptionFetchParams.builder()
          .subscriptionId("subscription_id")
          .build()
      assertThat(params).isNotNull
      // path param "subscriptionId"
      assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
