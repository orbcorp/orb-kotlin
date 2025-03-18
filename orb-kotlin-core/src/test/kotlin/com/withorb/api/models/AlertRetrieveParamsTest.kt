// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertRetrieveParamsTest {

    @Test
    fun create() {
        AlertRetrieveParams.builder().alertId("alert_id").build()
    }

    @Test
    fun pathParams() {
        val params = AlertRetrieveParams.builder().alertId("alert_id").build()

        assertThat(params._pathParam(0)).isEqualTo("alert_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
