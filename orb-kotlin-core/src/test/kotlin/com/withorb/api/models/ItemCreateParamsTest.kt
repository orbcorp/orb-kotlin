// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ItemCreateParamsTest {

    @Test
    fun createItemCreateParams() {
        ItemCreateParams.builder().name("API requests").build()
    }

    @Test
    fun getBody() {
        val params = ItemCreateParams.builder().name("API requests").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("API requests")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ItemCreateParams.builder().name("API requests").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("API requests")
    }
}
