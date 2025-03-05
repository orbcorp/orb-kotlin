// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddressModelTest {

    @Test
    fun createAddressModel() {
        val addressModel =
            AddressModel.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .line2("line2")
                .postalCode("postal_code")
                .state("state")
                .build()
        assertThat(addressModel).isNotNull
        assertThat(addressModel.city()).isEqualTo("city")
        assertThat(addressModel.country()).isEqualTo("country")
        assertThat(addressModel.line1()).isEqualTo("line1")
        assertThat(addressModel.line2()).isEqualTo("line2")
        assertThat(addressModel.postalCode()).isEqualTo("postal_code")
        assertThat(addressModel.state()).isEqualTo("state")
    }
}
