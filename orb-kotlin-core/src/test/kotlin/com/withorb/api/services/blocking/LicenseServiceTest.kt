// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.LicenseCreateParams
import com.withorb.api.models.LicenseDeactivateParams
import com.withorb.api.models.LicenseListParams
import com.withorb.api.models.LicenseRetrieveByExternalIdParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LicenseServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseService = client.licenses()

        val license =
            licenseService.create(
                LicenseCreateParams.builder()
                    .externalLicenseId("external_license_id")
                    .licenseTypeId("license_type_id")
                    .subscriptionId("subscription_id")
                    .endDate(LocalDate.parse("2026-01-27"))
                    .startDate(LocalDate.parse("2026-01-27"))
                    .build()
            )

        license.validate()
    }

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseService = client.licenses()

        val license = licenseService.retrieve("license_id")

        license.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseService = client.licenses()

        val page =
            licenseService.list(
                LicenseListParams.builder().subscriptionId("subscription_id").build()
            )

        page.response().validate()
    }

    @Test
    fun deactivate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseService = client.licenses()

        val response =
            licenseService.deactivate(
                LicenseDeactivateParams.builder()
                    .licenseId("license_id")
                    .endDate(LocalDate.parse("2026-01-27"))
                    .build()
            )

        response.validate()
    }

    @Test
    fun retrieveByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseService = client.licenses()

        val response =
            licenseService.retrieveByExternalId(
                LicenseRetrieveByExternalIdParams.builder()
                    .externalLicenseId("external_license_id")
                    .licenseTypeId("license_type_id")
                    .subscriptionId("subscription_id")
                    .build()
            )

        response.validate()
    }
}
