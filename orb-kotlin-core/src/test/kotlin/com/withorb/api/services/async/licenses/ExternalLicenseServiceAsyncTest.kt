// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.licenses

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.LicenseExternalLicenseGetUsageParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalLicenseServiceAsyncTest {

    @Test
    suspend fun getUsage() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalLicenseServiceAsync = client.licenses().externalLicenses()

        val response =
            externalLicenseServiceAsync.getUsage(
                LicenseExternalLicenseGetUsageParams.builder()
                    .externalLicenseId("external_license_id")
                    .licenseTypeId("license_type_id")
                    .subscriptionId("subscription_id")
                    .cursor("cursor")
                    .endDate(LocalDate.parse("2019-12-27"))
                    .groupBy("group_by")
                    .limit(1L)
                    .startDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        response.validate()
    }
}
