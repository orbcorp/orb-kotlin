// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemCreateParamsTest {

    @Test
    fun create() {
        ItemCreateParams.builder().name("API requests").build()
    }

    @Test
    fun body() {
        val params = ItemCreateParams.builder().name("API requests").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("API requests")
    }
}
