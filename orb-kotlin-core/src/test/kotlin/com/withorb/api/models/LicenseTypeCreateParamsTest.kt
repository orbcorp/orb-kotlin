// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseTypeCreateParamsTest {

    @Test
    fun create() {
        LicenseTypeCreateParams.builder().groupingKey("grouping_key").name("name").build()
    }

    @Test
    fun body() {
        val params =
            LicenseTypeCreateParams.builder().groupingKey("grouping_key").name("name").build()

        val body = params._body()

        assertThat(body.groupingKey()).isEqualTo("grouping_key")
        assertThat(body.name()).isEqualTo("name")
    }
}
