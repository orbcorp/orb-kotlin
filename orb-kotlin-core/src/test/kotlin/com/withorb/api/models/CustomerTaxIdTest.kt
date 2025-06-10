// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerTaxIdTest {

    @Test
    fun create() {
        val customerTaxId =
            CustomerTaxId.builder()
                .country(CustomerTaxId.Country.AD)
                .type(CustomerTaxId.Type.AD_NRT)
                .value("value")
                .build()

        assertThat(customerTaxId.country()).isEqualTo(CustomerTaxId.Country.AD)
        assertThat(customerTaxId.type()).isEqualTo(CustomerTaxId.Type.AD_NRT)
        assertThat(customerTaxId.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerTaxId =
            CustomerTaxId.builder()
                .country(CustomerTaxId.Country.AD)
                .type(CustomerTaxId.Type.AD_NRT)
                .value("value")
                .build()

        val roundtrippedCustomerTaxId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerTaxId),
                jacksonTypeRef<CustomerTaxId>(),
            )

        assertThat(roundtrippedCustomerTaxId).isEqualTo(customerTaxId)
    }
}
