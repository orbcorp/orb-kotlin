// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.LicenseCreateParams
import com.withorb.api.models.LicenseDeactivateParams
import com.withorb.api.models.LicenseListParams
import com.withorb.api.models.LicenseRetrieveByExternalIdParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LicenseServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseServiceAsync = client.licenses()

        val license =
            licenseServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseServiceAsync = client.licenses()

        val license = licenseServiceAsync.retrieve("license_id")

        license.validate()
    }

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseServiceAsync = client.licenses()

        val page =
            licenseServiceAsync.list(
                LicenseListParams.builder().subscriptionId("subscription_id").build()
            )

        page.response().validate()
    }

    @Test
    suspend fun deactivate() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseServiceAsync = client.licenses()

        val response =
            licenseServiceAsync.deactivate(
                LicenseDeactivateParams.builder()
                    .licenseId("license_id")
                    .endDate(LocalDate.parse("2026-01-27"))
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun retrieveByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseServiceAsync = client.licenses()

        val response =
            licenseServiceAsync.retrieveByExternalId(
                LicenseRetrieveByExternalIdParams.builder()
                    .externalLicenseId("external_license_id")
                    .licenseTypeId("license_type_id")
                    .subscriptionId("subscription_id")
                    .build()
            )

        response.validate()
    }
}
