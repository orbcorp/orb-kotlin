// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreatePortalSessionResponseTest {

    @Test
    fun create() {
        val customerCreatePortalSessionResponse =
            CustomerCreatePortalSessionResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()

        assertThat(customerCreatePortalSessionResponse.id()).isEqualTo("id")
        assertThat(customerCreatePortalSessionResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreatePortalSessionResponse.customerId()).isEqualTo("customer_id")
        assertThat(customerCreatePortalSessionResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerCreatePortalSessionResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreatePortalSessionResponse =
            CustomerCreatePortalSessionResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()

        val roundtrippedCustomerCreatePortalSessionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreatePortalSessionResponse),
                jacksonTypeRef<CustomerCreatePortalSessionResponse>(),
            )

        assertThat(roundtrippedCustomerCreatePortalSessionResponse)
            .isEqualTo(customerCreatePortalSessionResponse)
    }
}
