// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseListResponseTest {

    @Test
    fun create() {
        val licenseListResponse =
            LicenseListResponse.builder()
                .id("id")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(LicenseListResponse.Status.ACTIVE)
                .subscriptionId("subscription_id")
                .build()

        assertThat(licenseListResponse.id()).isEqualTo("id")
        assertThat(licenseListResponse.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(licenseListResponse.externalLicenseId()).isEqualTo("external_license_id")
        assertThat(licenseListResponse.licenseTypeId()).isEqualTo("license_type_id")
        assertThat(licenseListResponse.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(licenseListResponse.status()).isEqualTo(LicenseListResponse.Status.ACTIVE)
        assertThat(licenseListResponse.subscriptionId()).isEqualTo("subscription_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseListResponse =
            LicenseListResponse.builder()
                .id("id")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(LicenseListResponse.Status.ACTIVE)
                .subscriptionId("subscription_id")
                .build()

        val roundtrippedLicenseListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseListResponse),
                jacksonTypeRef<LicenseListResponse>(),
            )

        assertThat(roundtrippedLicenseListResponse).isEqualTo(licenseListResponse)
    }
}
