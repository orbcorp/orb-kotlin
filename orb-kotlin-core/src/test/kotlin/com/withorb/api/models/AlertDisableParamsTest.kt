// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertDisableParamsTest {

    @Test
    fun createAlertDisableParams() {
        AlertDisableParams.builder().alertConfigurationId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = AlertDisableParams.builder().alertConfigurationId("string").build()
        assertThat(params).isNotNull
        // path param "alertConfigurationId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
