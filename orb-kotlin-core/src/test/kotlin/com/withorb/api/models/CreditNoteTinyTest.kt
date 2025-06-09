// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditNoteTinyTest {

    @Test
    fun create() {
        val creditNoteTiny = CreditNoteTiny.builder().id("id").build()

        assertThat(creditNoteTiny.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val creditNoteTiny = CreditNoteTiny.builder().id("id").build()

        val roundtrippedCreditNoteTiny =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(creditNoteTiny),
                jacksonTypeRef<CreditNoteTiny>(),
            )

        assertThat(roundtrippedCreditNoteTiny).isEqualTo(creditNoteTiny)
    }
}
