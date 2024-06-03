// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerUsageUpdateByExternalIdResponseTest {

    @Test
    fun createCustomerUsageUpdateByExternalIdResponse() {
        val customerUsageUpdateByExternalIdResponse =
            CustomerUsageUpdateByExternalIdResponse.builder()
                .duplicate(listOf("string"))
                .ingested(listOf("string"))
                .build()
        assertThat(customerUsageUpdateByExternalIdResponse).isNotNull
        assertThat(customerUsageUpdateByExternalIdResponse.duplicate()).containsExactly("string")
        assertThat(customerUsageUpdateByExternalIdResponse.ingested()).containsExactly("string")
    }
}
