// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseRetrieveByExternalIdParamsTest {

    @Test
    fun create() {
        LicenseRetrieveByExternalIdParams.builder()
            .externalLicenseId("external_license_id")
            .licenseTypeId("license_type_id")
            .subscriptionId("subscription_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LicenseRetrieveByExternalIdParams.builder()
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .subscriptionId("subscription_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_license_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            LicenseRetrieveByExternalIdParams.builder()
                .externalLicenseId("external_license_id")
                .licenseTypeId("license_type_id")
                .subscriptionId("subscription_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("license_type_id", "license_type_id")
                    .put("subscription_id", "subscription_id")
                    .build()
            )
    }
}
