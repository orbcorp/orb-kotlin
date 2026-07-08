// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseListPageResponseTest {

    @Test
    fun create() {
        val licenseListPageResponse =
            LicenseListPageResponse.builder()
                .addData(
                    LicenseListResponse.builder()
                        .id("id")
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .externalLicenseId("external_license_id")
                        .licenseTypeId("license_type_id")
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(LicenseListResponse.Status.ACTIVE)
                        .subscriptionId("subscription_id")
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(licenseListPageResponse.data())
            .containsExactly(
                LicenseListResponse.builder()
                    .id("id")
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalLicenseId("external_license_id")
                    .licenseTypeId("license_type_id")
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(LicenseListResponse.Status.ACTIVE)
                    .subscriptionId("subscription_id")
                    .build()
            )
        assertThat(licenseListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseListPageResponse =
            LicenseListPageResponse.builder()
                .addData(
                    LicenseListResponse.builder()
                        .id("id")
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .externalLicenseId("external_license_id")
                        .licenseTypeId("license_type_id")
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(LicenseListResponse.Status.ACTIVE)
                        .subscriptionId("subscription_id")
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedLicenseListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseListPageResponse),
                jacksonTypeRef<LicenseListPageResponse>(),
            )

        assertThat(roundtrippedLicenseListPageResponse).isEqualTo(licenseListPageResponse)
    }
}
