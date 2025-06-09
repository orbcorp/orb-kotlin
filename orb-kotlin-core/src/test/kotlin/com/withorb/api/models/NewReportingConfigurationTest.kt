// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewReportingConfigurationTest {

    @Test
    fun create() {
        val newReportingConfiguration = NewReportingConfiguration.builder().exempt(true).build()

        assertThat(newReportingConfiguration.exempt()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newReportingConfiguration = NewReportingConfiguration.builder().exempt(true).build()

        val roundtrippedNewReportingConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newReportingConfiguration),
                jacksonTypeRef<NewReportingConfiguration>(),
            )

        assertThat(roundtrippedNewReportingConfiguration).isEqualTo(newReportingConfiguration)
    }
}
