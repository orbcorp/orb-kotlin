// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerHierarchyConfigModelTest {

    @Test
    fun createCustomerHierarchyConfigModel() {
        val customerHierarchyConfigModel =
            CustomerHierarchyConfigModel.builder()
                .addChildCustomerId("string")
                .parentCustomerId("parent_customer_id")
                .build()
        assertThat(customerHierarchyConfigModel).isNotNull
        assertThat(customerHierarchyConfigModel.childCustomerIds()).containsExactly("string")
        assertThat(customerHierarchyConfigModel.parentCustomerId()).isEqualTo("parent_customer_id")
    }
}
