// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.withorb.api.TestServerExtension
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.services.blocking.AlertService
import com.withorb.api.models.AlertListPage
import com.withorb.api.models.AlertListParams
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class AlertServiceTest {

    @Test
    fun callRetrieve() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertService = client.alerts()
      val alert = alertService.retrieve(AlertRetrieveParams.builder()
          .alertId("alert_id")
          .build())
      println(alert)
      alert.validate()
    }

    @Test
    fun callUpdate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertService = client.alerts()
      val alert = alertService.update(AlertUpdateParams.builder()
          .alertConfigurationId("alert_configuration_id")
          .thresholds(listOf(AlertUpdateParams.Threshold.builder()
              .value(42.23)
              .build()))
          .build())
      println(alert)
      alert.validate()
    }

    @Disabled("plan_version=0 breaks Prism")
    @Test
    fun callList() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertService = client.alerts()
      val alerts = alertService.list(AlertListParams.builder().build())
      println(alerts)
      alerts.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callCreateForCustomer() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertService = client.alerts()
      val alert = alertService.createForCustomer(AlertCreateForCustomerParams.builder()
          .customerId("customer_id")
          .currency("currency")
          .type(AlertCreateForCustomerParams.Type.USAGE_EXCEEDED)
          .thresholds(listOf(AlertCreateForCustomerParams.Threshold.builder()
              .value(42.23)
              .build()))
          .build())
      println(alert)
      alert.validate()
    }

    @Test
    fun callCreateForExternalCustomer() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertService = client.alerts()
      val alert = alertService.createForExternalCustomer(AlertCreateForExternalCustomerParams.builder()
          .externalCustomerId("external_customer_id")
          .currency("currency")
          .type(AlertCreateForExternalCustomerParams.Type.USAGE_EXCEEDED)
          .thresholds(listOf(AlertCreateForExternalCustomerParams.Threshold.builder()
              .value(42.23)
              .build()))
          .build())
      println(alert)
      alert.validate()
    }

    @Test
    fun callCreateForSubscription() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertService = client.alerts()
      val alert = alertService.createForSubscription(AlertCreateForSubscriptionParams.builder()
          .subscriptionId("subscription_id")
          .thresholds(listOf(AlertCreateForSubscriptionParams.Threshold.builder()
              .value(42.23)
              .build()))
          .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
          .metricId("metric_id")
          .build())
      println(alert)
      alert.validate()
    }

    @Test
    fun callDisable() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertService = client.alerts()
      val alert = alertService.disable(AlertDisableParams.builder()
          .alertConfigurationId("alert_configuration_id")
          .build())
      println(alert)
      alert.validate()
    }

    @Test
    fun callEnable() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val alertService = client.alerts()
      val alert = alertService.enable(AlertEnableParams.builder()
          .alertConfigurationId("alert_configuration_id")
          .build())
      println(alert)
      alert.validate()
    }
}
