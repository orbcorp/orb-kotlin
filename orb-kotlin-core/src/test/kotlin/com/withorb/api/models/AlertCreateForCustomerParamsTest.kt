// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertCreateForCustomerParamsTest {

    @Test
    fun createAlertCreateForCustomerParams() {
        AlertCreateForCustomerParams.builder()
            .customerId("customer_id")
            .currency("currency")
            .type(AlertCreateForCustomerParams.Type.USAGE_EXCEEDED)
            .thresholds(listOf(AlertCreateForCustomerParams.Threshold.builder().value(0.0).build()))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AlertCreateForCustomerParams.builder()
                .customerId("customer_id")
                .currency("currency")
                .type(AlertCreateForCustomerParams.Type.USAGE_EXCEEDED)
                .thresholds(
                    listOf(AlertCreateForCustomerParams.Threshold.builder().value(0.0).build())
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.type()).isEqualTo(AlertCreateForCustomerParams.Type.USAGE_EXCEEDED)
        assertThat(body.thresholds())
            .isEqualTo(listOf(AlertCreateForCustomerParams.Threshold.builder().value(0.0).build()))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AlertCreateForCustomerParams.builder()
                .customerId("customer_id")
                .currency("currency")
                .type(AlertCreateForCustomerParams.Type.USAGE_EXCEEDED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.type()).isEqualTo(AlertCreateForCustomerParams.Type.USAGE_EXCEEDED)
    }

    @Test
    fun getPathParam() {
        val params =
            AlertCreateForCustomerParams.builder()
                .customerId("customer_id")
                .currency("currency")
                .type(AlertCreateForCustomerParams.Type.USAGE_EXCEEDED)
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
