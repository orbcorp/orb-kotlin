// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.WebhookEndpointCreateParams
import com.withorb.api.models.WebhookEndpointUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookEndpointServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointService = client.webhookEndpoints()

        val webhookEndpointWithSecret =
            webhookEndpointService.create(
                WebhookEndpointCreateParams.builder()
                    .url("url")
                    .addEnabledEventType("string")
                    .payloadStyle(WebhookEndpointCreateParams.PayloadStyle.EXPANDED)
                    .build()
            )

        webhookEndpointWithSecret.validate()
    }

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointService = client.webhookEndpoints()

        val webhookEndpoint = webhookEndpointService.retrieve("webhook_endpoint_id")

        webhookEndpoint.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointService = client.webhookEndpoints()

        val webhookEndpoint =
            webhookEndpointService.update(
                WebhookEndpointUpdateParams.builder()
                    .webhookEndpointId("webhook_endpoint_id")
                    .addEnabledEventType("string")
                    .payloadStyle(WebhookEndpointUpdateParams.PayloadStyle.EXPANDED)
                    .url("url")
                    .build()
            )

        webhookEndpoint.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointService = client.webhookEndpoints()

        val page = webhookEndpointService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointService = client.webhookEndpoints()

        webhookEndpointService.delete("webhook_endpoint_id")
    }

    @Test
    fun disable() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointService = client.webhookEndpoints()

        val webhookEndpoint = webhookEndpointService.disable("webhook_endpoint_id")

        webhookEndpoint.validate()
    }

    @Test
    fun enable() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointService = client.webhookEndpoints()

        val webhookEndpoint = webhookEndpointService.enable("webhook_endpoint_id")

        webhookEndpoint.validate()
    }
}
