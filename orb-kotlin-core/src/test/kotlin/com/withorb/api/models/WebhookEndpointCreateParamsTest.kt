// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookEndpointCreateParamsTest {

    @Test
    fun create() {
        WebhookEndpointCreateParams.builder().url("url").addEnabledEventType("string").build()
    }

    @Test
    fun body() {
        val params =
            WebhookEndpointCreateParams.builder().url("url").addEnabledEventType("string").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("url")
        assertThat(body.enabledEventTypes()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WebhookEndpointCreateParams.builder().url("url").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("url")
    }
}
