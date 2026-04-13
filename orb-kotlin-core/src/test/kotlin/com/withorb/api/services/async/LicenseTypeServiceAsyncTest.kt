// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.LicenseTypeCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LicenseTypeServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseTypeServiceAsync = client.licenseTypes()

        val licenseType =
            licenseTypeServiceAsync.create(
                LicenseTypeCreateParams.builder().groupingKey("x").name("x").build()
            )

        licenseType.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseTypeServiceAsync = client.licenseTypes()

        val licenseType = licenseTypeServiceAsync.retrieve("license_type_id")

        licenseType.validate()
    }

    @Test
    suspend fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseTypeServiceAsync = client.licenseTypes()

        val page = licenseTypeServiceAsync.list()

        page.response().validate()
    }
}
