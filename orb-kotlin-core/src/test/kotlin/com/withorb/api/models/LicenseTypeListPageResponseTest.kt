// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LicenseTypeListPageResponseTest {

    @Test
    fun create() {
        val licenseTypeListPageResponse =
            LicenseTypeListPageResponse.builder()
                .addData(
                    LicenseTypeListResponse.builder()
                        .id("id")
                        .groupingKey("grouping_key")
                        .name("name")
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        assertThat(licenseTypeListPageResponse.data())
            .containsExactly(
                LicenseTypeListResponse.builder()
                    .id("id")
                    .groupingKey("grouping_key")
                    .name("name")
                    .build()
            )
        assertThat(licenseTypeListPageResponse.paginationMetadata())
            .isEqualTo(PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val licenseTypeListPageResponse =
            LicenseTypeListPageResponse.builder()
                .addData(
                    LicenseTypeListResponse.builder()
                        .id("id")
                        .groupingKey("grouping_key")
                        .name("name")
                        .build()
                )
                .paginationMetadata(
                    PaginationMetadata.builder().hasMore(true).nextCursor("next_cursor").build()
                )
                .build()

        val roundtrippedLicenseTypeListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(licenseTypeListPageResponse),
                jacksonTypeRef<LicenseTypeListPageResponse>(),
            )

        assertThat(roundtrippedLicenseTypeListPageResponse).isEqualTo(licenseTypeListPageResponse)
    }
}
