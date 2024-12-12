// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertDisableParamsTest {

    @Test
    fun createAlertDisableParams() {
        AlertDisableParams.builder()
            .alertConfigurationId("alert_configuration_id")
            .subscriptionId("subscription_id")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AlertDisableParams.builder()
                .alertConfigurationId("alert_configuration_id")
                .subscriptionId("subscription_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("subscription_id", "subscription_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            AlertDisableParams.builder().alertConfigurationId("alert_configuration_id").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            AlertDisableParams.builder().alertConfigurationId("alert_configuration_id").build()
        assertThat(params).isNotNull
        // path param "alertConfigurationId"
        assertThat(params.getPathParam(0)).isEqualTo("alert_configuration_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
