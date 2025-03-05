// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NewReportingConfigurationModelTest {

    @Test
    fun createNewReportingConfigurationModel() {
        val newReportingConfigurationModel =
            NewReportingConfigurationModel.builder().exempt(true).build()
        assertThat(newReportingConfigurationModel).isNotNull
        assertThat(newReportingConfigurationModel.exempt()).isEqualTo(true)
    }
}
