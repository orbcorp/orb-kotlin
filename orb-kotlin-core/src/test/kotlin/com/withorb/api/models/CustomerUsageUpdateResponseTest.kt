// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerUsageUpdateResponseTest {

    @Test
    fun createCustomerUsageUpdateResponse() {
        val customerUsageUpdateResponse =
            CustomerUsageUpdateResponse.builder()
                .duplicate(listOf("string"))
                .ingested(listOf("string"))
                .build()
        assertThat(customerUsageUpdateResponse).isNotNull
        assertThat(customerUsageUpdateResponse.duplicate()).containsExactly("string")
        assertThat(customerUsageUpdateResponse.ingested()).containsExactly("string")
    }
}
