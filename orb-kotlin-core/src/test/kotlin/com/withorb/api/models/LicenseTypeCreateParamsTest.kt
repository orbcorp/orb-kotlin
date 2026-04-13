// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseTypeCreateParamsTest {

    @Test
    fun create() {
        LicenseTypeCreateParams.builder().groupingKey("x").name("x").build()
    }

    @Test
    fun body() {
        val params = LicenseTypeCreateParams.builder().groupingKey("x").name("x").build()

        val body = params._body()

        assertThat(body.groupingKey()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
    }
}
