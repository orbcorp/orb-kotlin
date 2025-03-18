// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertDisableParamsTest {

    @Test
    fun create() {
        AlertDisableParams.builder()
            .alertConfigurationId("alert_configuration_id")
            .subscriptionId("subscription_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AlertDisableParams.builder().alertConfigurationId("alert_configuration_id").build()

        assertThat(params._pathParam(0)).isEqualTo("alert_configuration_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AlertDisableParams.builder()
                .alertConfigurationId("alert_configuration_id")
                .subscriptionId("subscription_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("subscription_id", "subscription_id").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AlertDisableParams.builder().alertConfigurationId("alert_configuration_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
