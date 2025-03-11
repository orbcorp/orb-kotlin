// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.AlertCreateForCustomerParams
import com.withorb.api.models.AlertCreateForExternalCustomerParams
import com.withorb.api.models.AlertCreateForSubscriptionParams
import com.withorb.api.models.AlertDisableParams
import com.withorb.api.models.AlertEnableParams
import com.withorb.api.models.AlertListParams
import com.withorb.api.models.AlertRetrieveParams
import com.withorb.api.models.AlertUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AlertServiceAsyncTest {

    @Test
    suspend fun retrieve() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertServiceAsync = client.alerts()

      val alert = alertServiceAsync.retrieve(AlertRetrieveParams.builder()
          .alertId("alert_id")
          .build())

      alert.validate()
    }

    @Test
    suspend fun update() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertServiceAsync = client.alerts()

      val alert = alertServiceAsync.update(AlertUpdateParams.builder()
          .alertConfigurationId("alert_configuration_id")
          .addThreshold(AlertUpdateParams.Threshold.builder()
              .value(0.0)
              .build())
          .build())

      alert.validate()
    }

    @Disabled("plan_version=0 breaks Prism")
    @Test
    suspend fun list() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertServiceAsync = client.alerts()

      val page = alertServiceAsync.list()

      page.response().validate()
    }

    @Test
    suspend fun createForCustomer() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertServiceAsync = client.alerts()

      val alert = alertServiceAsync.createForCustomer(AlertCreateForCustomerParams.builder()
          .customerId("customer_id")
          .currency("currency")
          .type(AlertCreateForCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
          .addThreshold(AlertCreateForCustomerParams.Threshold.builder()
              .value(0.0)
              .build())
          .build())

      alert.validate()
    }

    @Test
    suspend fun createForExternalCustomer() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertServiceAsync = client.alerts()

      val alert = alertServiceAsync.createForExternalCustomer(AlertCreateForExternalCustomerParams.builder()
          .externalCustomerId("external_customer_id")
          .currency("currency")
          .type(AlertCreateForExternalCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
          .addThreshold(AlertCreateForExternalCustomerParams.Threshold.builder()
              .value(0.0)
              .build())
          .build())

      alert.validate()
    }

    @Test
    suspend fun createForSubscription() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertServiceAsync = client.alerts()

      val alert = alertServiceAsync.createForSubscription(AlertCreateForSubscriptionParams.builder()
          .subscriptionId("subscription_id")
          .addThreshold(AlertCreateForSubscriptionParams.Threshold.builder()
              .value(0.0)
              .build())
          .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
          .metricId("metric_id")
          .build())

      alert.validate()
    }

    @Test
    suspend fun disable() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertServiceAsync = client.alerts()

      val alert = alertServiceAsync.disable(AlertDisableParams.builder()
          .alertConfigurationId("alert_configuration_id")
          .subscriptionId("subscription_id")
          .build())

      alert.validate()
    }

    @Test
    suspend fun enable() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertServiceAsync = client.alerts()

      val alert = alertServiceAsync.enable(AlertEnableParams.builder()
          .alertConfigurationId("alert_configuration_id")
          .subscriptionId("subscription_id")
          .build())

      alert.validate()
    }
}
