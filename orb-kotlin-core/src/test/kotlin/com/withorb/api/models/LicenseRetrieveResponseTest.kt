// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseRetrieveResponseTest {

    @Test
    fun create() {
        val licenseRetrieveResponse =
            LicenseRetrieveResponse.builder()
                .id("id")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(LicenseRetrieveResponse.Status.ACTIVE)
                .subscriptionId("subscription_id")
                .build()

        assertThat(licenseRetrieveResponse.id()).isEqualTo("id")
        assertThat(licenseRetrieveResponse.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(licenseRetrieveResponse.externalLicenseId()).isEqualTo("external_license_id")
        assertThat(licenseRetrieveResponse.licenseTypeId()).isEqualTo("license_type_id")
        assertThat(licenseRetrieveResponse.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(licenseRetrieveResponse.status())
            .isEqualTo(LicenseRetrieveResponse.Status.ACTIVE)
        assertThat(licenseRetrieveResponse.subscriptionId()).isEqualTo("subscription_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseRetrieveResponse =
            LicenseRetrieveResponse.builder()
                .id("id")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(LicenseRetrieveResponse.Status.ACTIVE)
                .subscriptionId("subscription_id")
                .build()

        val roundtrippedLicenseRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseRetrieveResponse),
                jacksonTypeRef<LicenseRetrieveResponse>(),
            )

        assertThat(roundtrippedLicenseRetrieveResponse).isEqualTo(licenseRetrieveResponse)
    }
}
