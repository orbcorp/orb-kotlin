// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertRetrieveParamsTest {

    @Test
    fun create() {
        AlertRetrieveParams.builder().alertId("alert_id").build()
    }

    @Test
    fun getPathParam() {
        val params = AlertRetrieveParams.builder().alertId("alert_id").build()
        assertThat(params).isNotNull
        // path param "alertId"
        assertThat(params.getPathParam(0)).isEqualTo("alert_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
