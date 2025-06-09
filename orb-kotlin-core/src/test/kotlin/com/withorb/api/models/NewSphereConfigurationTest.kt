// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSphereConfigurationTest {

    @Test
    fun create() {
        val newSphereConfiguration =
            NewSphereConfiguration.builder()
                .taxExempt(true)
                .taxProvider(NewSphereConfiguration.TaxProvider.SPHERE)
                .build()

        assertThat(newSphereConfiguration.taxExempt()).isEqualTo(true)
        assertThat(newSphereConfiguration.taxProvider())
            .isEqualTo(NewSphereConfiguration.TaxProvider.SPHERE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSphereConfiguration =
            NewSphereConfiguration.builder()
                .taxExempt(true)
                .taxProvider(NewSphereConfiguration.TaxProvider.SPHERE)
                .build()

        val roundtrippedNewSphereConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSphereConfiguration),
                jacksonTypeRef<NewSphereConfiguration>(),
            )

        assertThat(roundtrippedNewSphereConfiguration).isEqualTo(newSphereConfiguration)
    }
}
