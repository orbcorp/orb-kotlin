// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.licenses

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.LicenseExternalLicenseGetUsageParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalLicenseServiceTest {

    @Test
    fun getUsage() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalLicenseService = client.licenses().externalLicenses()

        val response =
            externalLicenseService.getUsage(
                LicenseExternalLicenseGetUsageParams.builder()
                    .externalLicenseId("external_license_id")
                    .licenseTypeId("license_type_id")
                    .subscriptionId("subscription_id")
                    .cursor("cursor")
                    .endDate(LocalDate.parse("2019-12-27"))
                    .addGroupBy("string")
                    .limit(1L)
                    .startDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        response.validate()
    }
}
