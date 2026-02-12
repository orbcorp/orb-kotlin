// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.LicenseTypeCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LicenseTypeServiceTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseTypeService = client.licenseTypes()

        val licenseType =
            licenseTypeService.create(
                LicenseTypeCreateParams.builder().groupingKey("grouping_key").name("name").build()
            )

        licenseType.validate()
    }

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseTypeService = client.licenseTypes()

        val licenseType = licenseTypeService.retrieve("license_type_id")

        licenseType.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseTypeService = client.licenseTypes()

        val page = licenseTypeService.list()

        page.response().validate()
    }
}
