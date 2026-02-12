// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseUsageGetUsageResponseTest {

    @Test
    fun create() {
        val licenseUsageGetUsageResponse =
            LicenseUsageGetUsageResponse.builder()
                .addData(
                    LicenseUsageGetUsageResponse.Data.builder()
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

        assertThat(licenseUsageGetUsageResponse.data())
            .containsExactly(
                LicenseUsageGetUsageResponse.Data.builder()
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
        assertThat(licenseUsageGetUsageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseUsageGetUsageResponse =
            LicenseUsageGetUsageResponse.builder()
                .addData(
                    LicenseUsageGetUsageResponse.Data.builder()
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

        val roundtrippedLicenseUsageGetUsageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseUsageGetUsageResponse),
                jacksonTypeRef<LicenseUsageGetUsageResponse>(),
            )

        assertThat(roundtrippedLicenseUsageGetUsageResponse).isEqualTo(licenseUsageGetUsageResponse)
    }
}
