// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionTriggerPhaseParamsTest {

    @Test
    fun create() {
      SubscriptionTriggerPhaseParams.builder()
          .subscriptionId("subscription_id")
          .allowInvoiceCreditOrVoid(true)
          .effectiveDate(LocalDate.parse("2019-12-27"))
          .build()
    }

    @Test
    fun body() {
      val params = SubscriptionTriggerPhaseParams.builder()
          .subscriptionId("subscription_id")
          .allowInvoiceCreditOrVoid(true)
          .effectiveDate(LocalDate.parse("2019-12-27"))
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.allowInvoiceCreditOrVoid()).isEqualTo(true)
      assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = SubscriptionTriggerPhaseParams.builder()
          .subscriptionId("subscription_id")
          .build()

      val body = params._body()

      assertNotNull(body)
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
