// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseRetrieveByExternalIdResponseTest {

    @Test
    fun create() {
        val licenseRetrieveByExternalIdResponse =
            LicenseRetrieveByExternalIdResponse.builder()
                .id("id")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(LicenseRetrieveByExternalIdResponse.Status.ACTIVE)
                .subscriptionId("subscription_id")
                .build()

        assertThat(licenseRetrieveByExternalIdResponse.id()).isEqualTo("id")
        assertThat(licenseRetrieveByExternalIdResponse.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(licenseRetrieveByExternalIdResponse.externalLicenseId())
            .isEqualTo("external_license_id")
        assertThat(licenseRetrieveByExternalIdResponse.licenseTypeId()).isEqualTo("license_type_id")
        assertThat(licenseRetrieveByExternalIdResponse.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(licenseRetrieveByExternalIdResponse.status())
            .isEqualTo(LicenseRetrieveByExternalIdResponse.Status.ACTIVE)
        assertThat(licenseRetrieveByExternalIdResponse.subscriptionId())
            .isEqualTo("subscription_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseRetrieveByExternalIdResponse =
            LicenseRetrieveByExternalIdResponse.builder()
                .id("id")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(LicenseRetrieveByExternalIdResponse.Status.ACTIVE)
                .subscriptionId("subscription_id")
                .build()

        val roundtrippedLicenseRetrieveByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseRetrieveByExternalIdResponse),
                jacksonTypeRef<LicenseRetrieveByExternalIdResponse>(),
            )

        assertThat(roundtrippedLicenseRetrieveByExternalIdResponse)
            .isEqualTo(licenseRetrieveByExternalIdResponse)
    }
}
