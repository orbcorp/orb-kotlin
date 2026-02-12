// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseUsageGetAllUsageResponseTest {

    @Test
    fun create() {
        val licenseUsageGetAllUsageResponse =
            LicenseUsageGetAllUsageResponse.builder()
                .addData(
                    LicenseUsageGetAllUsageResponse.Data.builder()
                        .allocatedCredits(0.0)
                        .consumedCredits(0.0)
                        .endDate(LocalDate.parse("2019-12-27"))
                        .licenseTypeId("license_type_id")
                        .pricingUnit("pricing_unit")
                        .remainingCredits(0.0)
                        .startDate(LocalDate.parse("2019-12-27"))
                        .subscriptionId("subscription_id")
                        .allocationEligibleCredits(0.0)
                        .externalLicenseId("external_license_id")
                        .licenseId("license_id")
                        .sharedPoolCredits(0.0)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(licenseUsageGetAllUsageResponse.data())
            .containsExactly(
                LicenseUsageGetAllUsageResponse.Data.builder()
                    .allocatedCredits(0.0)
                    .consumedCredits(0.0)
                    .endDate(LocalDate.parse("2019-12-27"))
                    .licenseTypeId("license_type_id")
                    .pricingUnit("pricing_unit")
                    .remainingCredits(0.0)
                    .startDate(LocalDate.parse("2019-12-27"))
                    .subscriptionId("subscription_id")
                    .allocationEligibleCredits(0.0)
                    .externalLicenseId("external_license_id")
                    .licenseId("license_id")
                    .sharedPoolCredits(0.0)
                    .build()
            )
        assertThat(licenseUsageGetAllUsageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseUsageGetAllUsageResponse =
            LicenseUsageGetAllUsageResponse.builder()
                .addData(
                    LicenseUsageGetAllUsageResponse.Data.builder()
                        .allocatedCredits(0.0)
                        .consumedCredits(0.0)
                        .endDate(LocalDate.parse("2019-12-27"))
                        .licenseTypeId("license_type_id")
                        .pricingUnit("pricing_unit")
                        .remainingCredits(0.0)
                        .startDate(LocalDate.parse("2019-12-27"))
                        .subscriptionId("subscription_id")
                        .allocationEligibleCredits(0.0)
                        .externalLicenseId("external_license_id")
                        .licenseId("license_id")
                        .sharedPoolCredits(0.0)
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedLicenseUsageGetAllUsageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseUsageGetAllUsageResponse),
                jacksonTypeRef<LicenseUsageGetAllUsageResponse>(),
            )

        assertThat(roundtrippedLicenseUsageGetAllUsageResponse)
            .isEqualTo(licenseUsageGetAllUsageResponse)
    }
}
