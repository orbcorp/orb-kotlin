// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerTaxIdModelTest {

    @Test
    fun createCustomerTaxIdModel() {
        val customerTaxIdModel =
            CustomerTaxIdModel.builder()
                .country(CustomerTaxIdModel.Country.AD)
                .type(CustomerTaxIdModel.Type.AD_NRT)
                .value("value")
                .build()
        assertThat(customerTaxIdModel).isNotNull
        assertThat(customerTaxIdModel.country()).isEqualTo(CustomerTaxIdModel.Country.AD)
        assertThat(customerTaxIdModel.type()).isEqualTo(CustomerTaxIdModel.Type.AD_NRT)
        assertThat(customerTaxIdModel.value()).isEqualTo("value")
    }
}
