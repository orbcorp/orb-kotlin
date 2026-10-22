// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookEndpointUpdateParamsTest {

    @Test
    fun create() {
        WebhookEndpointUpdateParams.builder()
            .webhookEndpointId("webhook_endpoint_id")
            .addEnabledEventType("string")
            .payloadStyle(WebhookEndpointUpdateParams.PayloadStyle.EXPANDED)
            .url("url")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WebhookEndpointUpdateParams.builder().webhookEndpointId("webhook_endpoint_id").build()

        assertThat(params._pathParam(0)).isEqualTo("webhook_endpoint_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WebhookEndpointUpdateParams.builder()
                .webhookEndpointId("webhook_endpoint_id")
                .addEnabledEventType("string")
                .payloadStyle(WebhookEndpointUpdateParams.PayloadStyle.EXPANDED)
                .url("url")
                .build()

        val body = params._body()

        assertThat(body.enabledEventTypes()).containsExactly("string")
        assertThat(body.payloadStyle()).isEqualTo(WebhookEndpointUpdateParams.PayloadStyle.EXPANDED)
        assertThat(body.url()).isEqualTo("url")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WebhookEndpointUpdateParams.builder().webhookEndpointId("webhook_endpoint_id").build()

        val body = params._body()
    }
}
