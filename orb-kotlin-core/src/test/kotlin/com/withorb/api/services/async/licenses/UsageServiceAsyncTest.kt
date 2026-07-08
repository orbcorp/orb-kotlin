// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.licenses

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.LicenseUsageGetAllUsageParams
import com.withorb.api.models.LicenseUsageGetUsageParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageServiceAsyncTest {

    @Test
    suspend fun getAllUsage() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageServiceAsync = client.licenses().usage()

        val response =
            usageServiceAsync.getAllUsage(
                LicenseUsageGetAllUsageParams.builder()
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

    @Test
    suspend fun getUsage() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val usageServiceAsync = client.licenses().usage()

        val response =
            usageServiceAsync.getUsage(
                LicenseUsageGetUsageParams.builder()
                    .licenseId("license_id")
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
