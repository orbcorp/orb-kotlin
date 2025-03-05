// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertCreateForExternalCustomerParamsTest {

    @Test
    fun create() {
        AlertCreateForExternalCustomerParams.builder()
            .externalCustomerId("external_customer_id")
            .createCustomerAlertRequest(
                CreateCustomerAlertRequest.builder()
                    .currency("currency")
                    .type(CreateCustomerAlertRequest.Type.USAGE_EXCEEDED)
                    .addThreshold(CreateCustomerAlertRequest.Threshold.builder().value(0.0).build())
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AlertCreateForExternalCustomerParams.builder()
                .externalCustomerId("external_customer_id")
                .createCustomerAlertRequest(
                    CreateCustomerAlertRequest.builder()
                        .currency("currency")
                        .type(CreateCustomerAlertRequest.Type.USAGE_EXCEEDED)
                        .addThreshold(
                            CreateCustomerAlertRequest.Threshold.builder().value(0.0).build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateCustomerAlertRequest.builder()
                    .currency("currency")
                    .type(CreateCustomerAlertRequest.Type.USAGE_EXCEEDED)
                    .addThreshold(CreateCustomerAlertRequest.Threshold.builder().value(0.0).build())
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AlertCreateForExternalCustomerParams.builder()
                .externalCustomerId("external_customer_id")
                .createCustomerAlertRequest(
                    CreateCustomerAlertRequest.builder()
                        .currency("currency")
                        .type(CreateCustomerAlertRequest.Type.USAGE_EXCEEDED)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateCustomerAlertRequest.builder()
                    .currency("currency")
                    .type(CreateCustomerAlertRequest.Type.USAGE_EXCEEDED)
                    .build()
            )
    }

    @Test
    fun getPathParam() {
        val params =
            AlertCreateForExternalCustomerParams.builder()
                .externalCustomerId("external_customer_id")
                .createCustomerAlertRequest(
                    CreateCustomerAlertRequest.builder()
                        .currency("currency")
                        .type(CreateCustomerAlertRequest.Type.USAGE_EXCEEDED)
                        .build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
