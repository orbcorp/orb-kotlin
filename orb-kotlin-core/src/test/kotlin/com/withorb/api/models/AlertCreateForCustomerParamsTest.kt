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
            .type("type")
            .thresholds(
                listOf(AlertCreateForCustomerParams.Threshold.builder().value(42.23).build())
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AlertCreateForCustomerParams.builder()
                .customerId("customer_id")
                .currency("currency")
                .type("type")
                .thresholds(
                    listOf(AlertCreateForCustomerParams.Threshold.builder().value(42.23).build())
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.type()).isEqualTo("type")
        assertThat(body.thresholds())
            .isEqualTo(
                listOf(AlertCreateForCustomerParams.Threshold.builder().value(42.23).build())
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AlertCreateForCustomerParams.builder()
                .customerId("customer_id")
                .currency("currency")
                .type("type")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.type()).isEqualTo("type")
    }

    @Test
    fun getPathParam() {
        val params =
            AlertCreateForCustomerParams.builder()
                .customerId("customer_id")
                .currency("currency")
                .type("type")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
