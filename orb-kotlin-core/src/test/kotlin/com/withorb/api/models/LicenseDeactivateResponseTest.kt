// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseDeactivateResponseTest {

    @Test
    fun create() {
        val licenseDeactivateResponse =
            LicenseDeactivateResponse.builder()
                .id("id")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(LicenseDeactivateResponse.Status.ACTIVE)
                .subscriptionId("subscription_id")
                .build()

        assertThat(licenseDeactivateResponse.id()).isEqualTo("id")
        assertThat(licenseDeactivateResponse.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(licenseDeactivateResponse.externalLicenseId()).isEqualTo("external_license_id")
        assertThat(licenseDeactivateResponse.licenseTypeId()).isEqualTo("license_type_id")
        assertThat(licenseDeactivateResponse.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(licenseDeactivateResponse.status())
            .isEqualTo(LicenseDeactivateResponse.Status.ACTIVE)
        assertThat(licenseDeactivateResponse.subscriptionId()).isEqualTo("subscription_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseDeactivateResponse =
            LicenseDeactivateResponse.builder()
                .id("id")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(LicenseDeactivateResponse.Status.ACTIVE)
                .subscriptionId("subscription_id")
                .build()

        val roundtrippedLicenseDeactivateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseDeactivateResponse),
                jacksonTypeRef<LicenseDeactivateResponse>(),
            )

        assertThat(roundtrippedLicenseDeactivateResponse).isEqualTo(licenseDeactivateResponse)
    }
}
