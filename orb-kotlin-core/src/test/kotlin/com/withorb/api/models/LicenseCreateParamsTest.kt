// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseCreateParamsTest {

    @Test
    fun create() {
        LicenseCreateParams.builder()
            .externalLicenseId("external_license_id")
            .licenseTypeId("license_type_id")
            .subscriptionId("subscription_id")
            .endDate(LocalDate.parse("2026-01-27"))
            .startDate(LocalDate.parse("2026-01-27"))
            .build()
    }

    @Test
    fun body() {
        val params =
            LicenseCreateParams.builder()
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .subscriptionId("subscription_id")
                .endDate(LocalDate.parse("2026-01-27"))
                .startDate(LocalDate.parse("2026-01-27"))
                .build()

        val body = params._body()

        assertThat(body.externalLicenseId()).isEqualTo("external_license_id")
        assertThat(body.licenseTypeId()).isEqualTo("license_type_id")
        assertThat(body.subscriptionId()).isEqualTo("subscription_id")
        assertThat(body.endDate()).isEqualTo(LocalDate.parse("2026-01-27"))
        assertThat(body.startDate()).isEqualTo(LocalDate.parse("2026-01-27"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LicenseCreateParams.builder()
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .subscriptionId("subscription_id")
                .build()

        val body = params._body()

        assertThat(body.externalLicenseId()).isEqualTo("external_license_id")
        assertThat(body.licenseTypeId()).isEqualTo("license_type_id")
        assertThat(body.subscriptionId()).isEqualTo("subscription_id")
    }
}
