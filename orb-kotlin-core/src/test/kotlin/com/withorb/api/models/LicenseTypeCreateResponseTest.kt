// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseTypeCreateResponseTest {

    @Test
    fun create() {
        val licenseTypeCreateResponse =
            LicenseTypeCreateResponse.builder()
                .id("id")
                .groupingKey("grouping_key")
                .name("name")
                .build()

        assertThat(licenseTypeCreateResponse.id()).isEqualTo("id")
        assertThat(licenseTypeCreateResponse.groupingKey()).isEqualTo("grouping_key")
        assertThat(licenseTypeCreateResponse.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseTypeCreateResponse =
            LicenseTypeCreateResponse.builder()
                .id("id")
                .groupingKey("grouping_key")
                .name("name")
                .build()

        val roundtrippedLicenseTypeCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseTypeCreateResponse),
                jacksonTypeRef<LicenseTypeCreateResponse>(),
            )

        assertThat(roundtrippedLicenseTypeCreateResponse).isEqualTo(licenseTypeCreateResponse)
    }
}
