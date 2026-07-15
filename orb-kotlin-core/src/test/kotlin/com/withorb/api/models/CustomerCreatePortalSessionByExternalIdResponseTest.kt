// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreatePortalSessionByExternalIdResponseTest {

    @Test
    fun create() {
        val customerCreatePortalSessionByExternalIdResponse =
            CustomerCreatePortalSessionByExternalIdResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()

        assertThat(customerCreatePortalSessionByExternalIdResponse.id()).isEqualTo("id")
        assertThat(customerCreatePortalSessionByExternalIdResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreatePortalSessionByExternalIdResponse.customerId())
            .isEqualTo("customer_id")
        assertThat(customerCreatePortalSessionByExternalIdResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreatePortalSessionByExternalIdResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreatePortalSessionByExternalIdResponse =
            CustomerCreatePortalSessionByExternalIdResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()

        val roundtrippedCustomerCreatePortalSessionByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreatePortalSessionByExternalIdResponse),
                jacksonTypeRef<CustomerCreatePortalSessionByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreatePortalSessionByExternalIdResponse)
            .isEqualTo(customerCreatePortalSessionByExternalIdResponse)
    }
}
