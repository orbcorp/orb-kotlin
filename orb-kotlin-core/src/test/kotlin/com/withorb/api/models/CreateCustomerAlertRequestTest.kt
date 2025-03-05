// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateCustomerAlertRequestTest {

    @Test
    fun createCreateCustomerAlertRequest() {
        val createCustomerAlertRequest =
            CreateCustomerAlertRequest.builder()
                .currency("currency")
                .type(CreateCustomerAlertRequest.Type.USAGE_EXCEEDED)
                .addThreshold(ThresholdModel.builder().value(0.0).build())
                .build()
        assertThat(createCustomerAlertRequest).isNotNull
        assertThat(createCustomerAlertRequest.currency()).isEqualTo("currency")
        assertThat(createCustomerAlertRequest.type())
            .isEqualTo(CreateCustomerAlertRequest.Type.USAGE_EXCEEDED)
        assertThat(createCustomerAlertRequest.thresholds())
            .containsExactly(ThresholdModel.builder().value(0.0).build())
    }
}
