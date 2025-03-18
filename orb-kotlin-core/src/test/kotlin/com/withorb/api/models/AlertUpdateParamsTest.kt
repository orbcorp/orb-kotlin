// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertUpdateParamsTest {

    @Test
    fun create() {
        AlertUpdateParams.builder()
            .alertConfigurationId("alert_configuration_id")
            .addThreshold(AlertUpdateParams.Threshold.builder().value(0.0).build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AlertUpdateParams.builder()
                .alertConfigurationId("alert_configuration_id")
                .addThreshold(AlertUpdateParams.Threshold.builder().value(0.0).build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("alert_configuration_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AlertUpdateParams.builder()
                .alertConfigurationId("alert_configuration_id")
                .addThreshold(AlertUpdateParams.Threshold.builder().value(0.0).build())
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.thresholds())
            .containsExactly(AlertUpdateParams.Threshold.builder().value(0.0).build())
    }
}
