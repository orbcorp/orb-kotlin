// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerMinifiedTest {

    @Test
    fun create() {
        val customerMinified =
            CustomerMinified.builder().id("id").externalCustomerId("external_customer_id").build()

        assertThat(customerMinified.id()).isEqualTo("id")
        assertThat(customerMinified.externalCustomerId()).isEqualTo("external_customer_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerMinified =
            CustomerMinified.builder().id("id").externalCustomerId("external_customer_id").build()

        val roundtrippedCustomerMinified =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerMinified),
                jacksonTypeRef<CustomerMinified>(),
            )

        assertThat(roundtrippedCustomerMinified).isEqualTo(customerMinified)
    }
}
