// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseDeactivateParamsTest {

    @Test
    fun create() {
        LicenseDeactivateParams.builder()
            .licenseId("license_id")
            .endDate(LocalDate.parse("2026-01-27"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = LicenseDeactivateParams.builder().licenseId("license_id").build()

        assertThat(params._pathParam(0)).isEqualTo("license_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LicenseDeactivateParams.builder()
                .licenseId("license_id")
                .endDate(LocalDate.parse("2026-01-27"))
                .build()

        val body = params._body()

        assertThat(body.endDate()).isEqualTo(LocalDate.parse("2026-01-27"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LicenseDeactivateParams.builder().licenseId("license_id").build()

        val body = params._body()
    }
}
