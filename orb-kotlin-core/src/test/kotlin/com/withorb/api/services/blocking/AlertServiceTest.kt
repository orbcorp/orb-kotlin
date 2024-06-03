// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.*
import com.withorb.api.models.AlertListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AlertServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alert = alertService.retrieve(AlertRetrieveParams.builder().alertId("string").build())
        println(alert)
        alert.validate()
    }

    @Disabled("plan_version=0 breaks Prism")
    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alerts = alertService.list(AlertListParams.builder().build())
        println(alerts)
        alerts.data().forEach { it.validate() }
    }

    @Test
    fun callCreateForCustomer() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alert =
            alertService.createForCustomer(
                AlertCreateForCustomerParams.builder()
                    .customerId("string")
                    .currency("string")
                    .type("string")
                    .thresholds(
                        listOf(
                            AlertCreateForCustomerParams.Threshold.builder().value(42.23).build()
                        )
                    )
                    .build()
            )
        println(alert)
        alert.validate()
    }

    @Test
    fun callCreateForExternalCustomer() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alert =
            alertService.createForExternalCustomer(
                AlertCreateForExternalCustomerParams.builder()
                    .externalCustomerId("string")
                    .currency("string")
                    .type("string")
                    .thresholds(
                        listOf(
                            AlertCreateForExternalCustomerParams.Threshold.builder()
                                .value(42.23)
                                .build()
                        )
                    )
                    .build()
            )
        println(alert)
        alert.validate()
    }

    @Test
    fun callCreateForSubscription() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alert =
            alertService.createForSubscription(
                AlertCreateForSubscriptionParams.builder()
                    .subscriptionId("string")
                    .thresholds(
                        listOf(
                            AlertCreateForSubscriptionParams.Threshold.builder()
                                .value(42.23)
                                .build()
                        )
                    )
                    .type("string")
                    .metricId("string")
                    .build()
            )
        println(alert)
        alert.validate()
    }

    @Test
    fun callDisable() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alert =
            alertService.disable(
                AlertDisableParams.builder().alertConfigurationId("string").build()
            )
        println(alert)
        alert.validate()
    }

    @Test
    fun callEnable() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alert =
            alertService.enable(AlertEnableParams.builder().alertConfigurationId("string").build())
        println(alert)
        alert.validate()
    }
}
