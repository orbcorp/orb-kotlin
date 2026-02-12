// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseListParamsTest {

    @Test
    fun create() {
        LicenseListParams.builder()
            .subscriptionId("subscription_id")
            .cursor("cursor")
            .externalLicenseId("external_license_id")
            .licenseTypeId("license_type_id")
            .limit(1L)
            .status(LicenseListParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LicenseListParams.builder()
                .subscriptionId("subscription_id")
                .cursor("cursor")
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .limit(1L)
                .status(LicenseListParams.Status.ACTIVE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("subscription_id", "subscription_id")
                    .put("cursor", "cursor")
                    .put("external_license_id", "external_license_id")
                    .put("license_type_id", "license_type_id")
                    .put("limit", "1")
                    .put("status", "active")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LicenseListParams.builder().subscriptionId("subscription_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("subscription_id", "subscription_id").build())
    }
}
