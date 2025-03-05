// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerMinifiedModelTest {

    @Test
    fun createCustomerMinifiedModel() {
        val customerMinifiedModel =
            CustomerMinifiedModel.builder()
                .id("id")
                .externalCustomerId("external_customer_id")
                .build()
        assertThat(customerMinifiedModel).isNotNull
        assertThat(customerMinifiedModel.id()).isEqualTo("id")
        assertThat(customerMinifiedModel.externalCustomerId()).isEqualTo("external_customer_id")
    }
}
