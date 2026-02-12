// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseTypeListResponseTest {

    @Test
    fun create() {
        val licenseTypeListResponse =
            LicenseTypeListResponse.builder()
                .id("id")
                .groupingKey("grouping_key")
                .name("name")
                .build()

        assertThat(licenseTypeListResponse.id()).isEqualTo("id")
        assertThat(licenseTypeListResponse.groupingKey()).isEqualTo("grouping_key")
        assertThat(licenseTypeListResponse.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseTypeListResponse =
            LicenseTypeListResponse.builder()
                .id("id")
                .groupingKey("grouping_key")
                .name("name")
                .build()

        val roundtrippedLicenseTypeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseTypeListResponse),
                jacksonTypeRef<LicenseTypeListResponse>(),
            )

        assertThat(roundtrippedLicenseTypeListResponse).isEqualTo(licenseTypeListResponse)
    }
}
