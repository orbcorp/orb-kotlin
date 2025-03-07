// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertCreateForExternalCustomerParamsTest {

    @Test
    fun create() {
        AlertCreateForExternalCustomerParams.builder()
            .externalCustomerId("external_customer_id")
            .currency("currency")
            .type(AlertCreateForExternalCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
            .addThreshold(
                AlertCreateForExternalCustomerParams.Threshold.builder().value(0.0).build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AlertCreateForExternalCustomerParams.builder()
                .externalCustomerId("external_customer_id")
                .currency("currency")
                .type(AlertCreateForExternalCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
                .addThreshold(
                    AlertCreateForExternalCustomerParams.Threshold.builder().value(0.0).build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.type())
            .isEqualTo(AlertCreateForExternalCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
        assertThat(body.thresholds())
            .isEqualTo(
                listOf(AlertCreateForExternalCustomerParams.Threshold.builder().value(0.0).build())
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AlertCreateForExternalCustomerParams.builder()
                .externalCustomerId("external_customer_id")
                .currency("currency")
                .type(AlertCreateForExternalCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.type())
            .isEqualTo(AlertCreateForExternalCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
    }

    @Test
    fun getPathParam() {
        val params =
            AlertCreateForExternalCustomerParams.builder()
                .externalCustomerId("external_customer_id")
                .currency("currency")
                .type(AlertCreateForExternalCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
                .build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
