// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditTopUpDeleteByExternalIdParamsTest {

    @Test
    fun create() {
        CustomerCreditTopUpDeleteByExternalIdParams.builder()
            .externalCustomerId("external_customer_id")
            .topUpId("top_up_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerCreditTopUpDeleteByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .topUpId("top_up_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_customer_id")
        assertThat(params._pathParam(1)).isEqualTo("top_up_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
