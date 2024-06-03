// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionUpdateParamsTest {

    @Test
    fun createSubscriptionUpdateParams() {
        SubscriptionUpdateParams.builder()
            .subscriptionId("string")
            .autoCollection(true)
            .defaultInvoiceMemo("string")
            .invoicingThreshold("10.00")
            .metadata(SubscriptionUpdateParams.Metadata.builder().build())
            .netTerms(123L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SubscriptionUpdateParams.builder()
                .subscriptionId("string")
                .autoCollection(true)
                .defaultInvoiceMemo("string")
                .invoicingThreshold("10.00")
                .metadata(SubscriptionUpdateParams.Metadata.builder().build())
                .netTerms(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.autoCollection()).isEqualTo(true)
        assertThat(body.defaultInvoiceMemo()).isEqualTo("string")
        assertThat(body.invoicingThreshold()).isEqualTo("10.00")
        assertThat(body.metadata()).isEqualTo(SubscriptionUpdateParams.Metadata.builder().build())
        assertThat(body.netTerms()).isEqualTo(123L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SubscriptionUpdateParams.builder().subscriptionId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = SubscriptionUpdateParams.builder().subscriptionId("string").build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
