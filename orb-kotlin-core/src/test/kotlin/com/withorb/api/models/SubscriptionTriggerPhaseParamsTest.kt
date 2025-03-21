// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionTriggerPhaseParamsTest {

    @Test
    fun create() {
        SubscriptionTriggerPhaseParams.builder()
            .subscriptionId("subscription_id")
            .allowInvoiceCreditOrVoid(true)
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionTriggerPhaseParams.builder().subscriptionId("subscription_id").build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionTriggerPhaseParams.builder()
                .subscriptionId("subscription_id")
                .allowInvoiceCreditOrVoid(true)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .build()

        val body = params._body()

        assertThat(body.allowInvoiceCreditOrVoid()).isEqualTo(true)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionTriggerPhaseParams.builder().subscriptionId("subscription_id").build()

        val body = params._body()
    }
}
