// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.licenses

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.LicenseUsageGetAllUsageParams
import com.withorb.api.models.LicenseUsageGetUsageParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageServiceTest {

    @Test
    fun getAllUsage() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageService = client.licenses().usage()

        val response =
            usageService.getAllUsage(
                LicenseUsageGetAllUsageParams.builder()
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

    @Test
    fun getUsage() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageService = client.licenses().usage()

        val response =
            usageService.getUsage(
                LicenseUsageGetUsageParams.builder()
                    .licenseId("license_id")
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
