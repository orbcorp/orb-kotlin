// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddressInputModelTest {

    @Test
    fun createAddressInputModel() {
        val addressInputModel =
            AddressInputModel.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .line2("line2")
                .postalCode("postal_code")
                .state("state")
                .build()
        assertThat(addressInputModel).isNotNull
        assertThat(addressInputModel.city()).isEqualTo("city")
        assertThat(addressInputModel.country()).isEqualTo("country")
        assertThat(addressInputModel.line1()).isEqualTo("line1")
        assertThat(addressInputModel.line2()).isEqualTo("line2")
        assertThat(addressInputModel.postalCode()).isEqualTo("postal_code")
        assertThat(addressInputModel.state()).isEqualTo("state")
    }
}
