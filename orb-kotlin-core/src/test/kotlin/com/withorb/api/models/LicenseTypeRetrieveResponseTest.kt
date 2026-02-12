// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseTypeRetrieveResponseTest {

    @Test
    fun create() {
        val licenseTypeRetrieveResponse =
            LicenseTypeRetrieveResponse.builder()
                .id("id")
                .groupingKey("grouping_key")
                .name("name")
                .build()

        assertThat(licenseTypeRetrieveResponse.id()).isEqualTo("id")
        assertThat(licenseTypeRetrieveResponse.groupingKey()).isEqualTo("grouping_key")
        assertThat(licenseTypeRetrieveResponse.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseTypeRetrieveResponse =
            LicenseTypeRetrieveResponse.builder()
                .id("id")
                .groupingKey("grouping_key")
                .name("name")
                .build()

        val roundtrippedLicenseTypeRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseTypeRetrieveResponse),
                jacksonTypeRef<LicenseTypeRetrieveResponse>(),
            )

        assertThat(roundtrippedLicenseTypeRetrieveResponse).isEqualTo(licenseTypeRetrieveResponse)
    }
}
