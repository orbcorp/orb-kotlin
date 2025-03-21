// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUpdateParamsTest {

    @Test
    fun create() {
        SubscriptionUpdateParams.builder()
            .subscriptionId("subscription_id")
            .autoCollection(true)
            .defaultInvoiceMemo("default_invoice_memo")
            .invoicingThreshold("10.00")
            .metadata(
                SubscriptionUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .netTerms(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = SubscriptionUpdateParams.builder().subscriptionId("subscription_id").build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionUpdateParams.builder()
                .subscriptionId("subscription_id")
                .autoCollection(true)
                .defaultInvoiceMemo("default_invoice_memo")
                .invoicingThreshold("10.00")
                .metadata(
                    SubscriptionUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .netTerms(0L)
                .build()

        val body = params._body()

        assertThat(body.autoCollection()).isEqualTo(true)
        assertThat(body.defaultInvoiceMemo()).isEqualTo("default_invoice_memo")
        assertThat(body.invoicingThreshold()).isEqualTo("10.00")
        assertThat(body.metadata())
            .isEqualTo(
                SubscriptionUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.netTerms()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SubscriptionUpdateParams.builder().subscriptionId("subscription_id").build()

        val body = params._body()
    }
}
