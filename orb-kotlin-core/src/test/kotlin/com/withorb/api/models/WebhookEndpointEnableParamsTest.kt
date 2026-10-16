// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookEndpointEnableParamsTest {

    @Test
    fun create() {
        WebhookEndpointEnableParams.builder().webhookEndpointId("webhook_endpoint_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            WebhookEndpointEnableParams.builder().webhookEndpointId("webhook_endpoint_id").build()

        assertThat(params._pathParam(0)).isEqualTo("webhook_endpoint_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
