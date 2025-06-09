// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressTest {

    @Test
    fun create() {
        val address =
            Address.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .line2("line2")
                .postalCode("postal_code")
                .state("state")
                .build()

        assertThat(address.city()).isEqualTo("city")
        assertThat(address.country()).isEqualTo("country")
        assertThat(address.line1()).isEqualTo("line1")
        assertThat(address.line2()).isEqualTo("line2")
        assertThat(address.postalCode()).isEqualTo("postal_code")
        assertThat(address.state()).isEqualTo("state")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val address =
            Address.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .line2("line2")
                .postalCode("postal_code")
                .state("state")
                .build()

        val roundtrippedAddress =
            jsonMapper.readValue(jsonMapper.writeValueAsString(address), jacksonTypeRef<Address>())

        assertThat(roundtrippedAddress).isEqualTo(address)
    }
}
