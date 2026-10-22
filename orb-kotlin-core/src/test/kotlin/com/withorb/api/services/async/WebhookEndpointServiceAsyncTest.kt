// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.WebhookEndpointCreateParams
import com.withorb.api.models.WebhookEndpointUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookEndpointServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointServiceAsync = client.webhookEndpoints()

        val webhookEndpointWithSecret =
            webhookEndpointServiceAsync.create(
                WebhookEndpointCreateParams.builder()
                    .url("url")
                    .addEnabledEventType("string")
                    .payloadStyle(WebhookEndpointCreateParams.PayloadStyle.EXPANDED)
                    .build()
            )

        webhookEndpointWithSecret.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointServiceAsync = client.webhookEndpoints()

        val webhookEndpoint = webhookEndpointServiceAsync.retrieve("webhook_endpoint_id")

        webhookEndpoint.validate()
    }

    @Test
    suspend fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointServiceAsync = client.webhookEndpoints()

        val webhookEndpoint =
            webhookEndpointServiceAsync.update(
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
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointServiceAsync = client.webhookEndpoints()

        val page = webhookEndpointServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointServiceAsync = client.webhookEndpoints()

        webhookEndpointServiceAsync.delete("webhook_endpoint_id")
    }

    @Test
    suspend fun disable() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointServiceAsync = client.webhookEndpoints()

        val webhookEndpoint = webhookEndpointServiceAsync.disable("webhook_endpoint_id")

        webhookEndpoint.validate()
    }

    @Test
    suspend fun enable() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointServiceAsync = client.webhookEndpoints()

        val webhookEndpoint = webhookEndpointServiceAsync.enable("webhook_endpoint_id")

        webhookEndpoint.validate()
    }
}
