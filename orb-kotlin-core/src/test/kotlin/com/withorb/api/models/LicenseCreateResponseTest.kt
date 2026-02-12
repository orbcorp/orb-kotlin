// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseCreateResponseTest {

    @Test
    fun create() {
        val licenseCreateResponse =
            LicenseCreateResponse.builder()
                .id("id")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(LicenseCreateResponse.Status.ACTIVE)
                .subscriptionId("subscription_id")
                .build()

        assertThat(licenseCreateResponse.id()).isEqualTo("id")
        assertThat(licenseCreateResponse.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(licenseCreateResponse.externalLicenseId()).isEqualTo("external_license_id")
        assertThat(licenseCreateResponse.licenseTypeId()).isEqualTo("license_type_id")
        assertThat(licenseCreateResponse.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(licenseCreateResponse.status()).isEqualTo(LicenseCreateResponse.Status.ACTIVE)
        assertThat(licenseCreateResponse.subscriptionId()).isEqualTo("subscription_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseCreateResponse =
            LicenseCreateResponse.builder()
                .id("id")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(LicenseCreateResponse.Status.ACTIVE)
                .subscriptionId("subscription_id")
                .build()

        val roundtrippedLicenseCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseCreateResponse),
                jacksonTypeRef<LicenseCreateResponse>(),
            )

        assertThat(roundtrippedLicenseCreateResponse).isEqualTo(licenseCreateResponse)
    }
}
