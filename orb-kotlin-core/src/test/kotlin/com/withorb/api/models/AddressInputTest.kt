// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressInputTest {

    @Test
    fun create() {
        val addressInput =
            AddressInput.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .line2("line2")
                .postalCode("postal_code")
                .state("state")
                .build()

        assertThat(addressInput.city()).isEqualTo("city")
        assertThat(addressInput.country()).isEqualTo("country")
        assertThat(addressInput.line1()).isEqualTo("line1")
        assertThat(addressInput.line2()).isEqualTo("line2")
        assertThat(addressInput.postalCode()).isEqualTo("postal_code")
        assertThat(addressInput.state()).isEqualTo("state")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addressInput =
            AddressInput.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .line2("line2")
                .postalCode("postal_code")
                .state("state")
                .build()

        val roundtrippedAddressInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addressInput),
                jacksonTypeRef<AddressInput>(),
            )

        assertThat(roundtrippedAddressInput).isEqualTo(addressInput)
    }
}
