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
import com.withorb.api.models.SubscriptionUpdateParams
import com.withorb.api.models.SubscriptionUpdateParams.SubscriptionUpdateBody

class SubscriptionUpdateParamsTest {

    @Test
    fun createSubscriptionUpdateParams() {
      SubscriptionUpdateParams.builder()
          .subscriptionId("subscription_id")
          .autoCollection(true)
          .defaultInvoiceMemo("default_invoice_memo")
          .invoicingThreshold("10.00")
          .metadata(SubscriptionUpdateParams.Metadata.builder().build())
          .netTerms(123L)
          .build()
    }

    @Test
    fun getBody() {
      val params = SubscriptionUpdateParams.builder()
          .subscriptionId("subscription_id")
          .autoCollection(true)
          .defaultInvoiceMemo("default_invoice_memo")
          .invoicingThreshold("10.00")
          .metadata(SubscriptionUpdateParams.Metadata.builder().build())
          .netTerms(123L)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.autoCollection()).isEqualTo(true)
      assertThat(body.defaultInvoiceMemo()).isEqualTo("default_invoice_memo")
      assertThat(body.invoicingThreshold()).isEqualTo("10.00")
      assertThat(body.metadata()).isEqualTo(SubscriptionUpdateParams.Metadata.builder().build())
      assertThat(body.netTerms()).isEqualTo(123L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SubscriptionUpdateParams.builder()
          .subscriptionId("subscription_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = SubscriptionUpdateParams.builder()
          .subscriptionId("subscription_id")
          .build()
      assertThat(params).isNotNull
      // path param "subscriptionId"
      assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
