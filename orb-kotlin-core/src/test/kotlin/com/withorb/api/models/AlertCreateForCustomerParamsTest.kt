// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertCreateForCustomerParamsTest {

    @Test
    fun createAlertCreateForCustomerParams() {
        AlertCreateForCustomerParams.builder()
            .customerId("string")
            .currency("string")
            .type("string")
            .thresholds(
                listOf(AlertCreateForCustomerParams.Threshold.builder().value(42.23).build())
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AlertCreateForCustomerParams.builder()
                .customerId("string")
                .currency("string")
                .type("string")
                .thresholds(
                    listOf(AlertCreateForCustomerParams.Threshold.builder().value(42.23).build())
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.type()).isEqualTo("string")
        assertThat(body.thresholds())
            .isEqualTo(
                listOf(AlertCreateForCustomerParams.Threshold.builder().value(42.23).build())
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AlertCreateForCustomerParams.builder()
                .customerId("string")
                .currency("string")
                .type("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.type()).isEqualTo("string")
    }

    @Test
    fun getPathParam() {
        val params =
            AlertCreateForCustomerParams.builder()
                .customerId("string")
                .currency("string")
                .type("string")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
