// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionUpdateTrialParamsTest {

    @Test
    fun createSubscriptionUpdateTrialParams() {
        SubscriptionUpdateTrialParams.builder()
            .subscriptionId("subscription_id")
            .trialEndDate(
                SubscriptionUpdateTrialParams.TrialEndDate.ofOffsetDateTime(
                    OffsetDateTime.parse("2017-07-21T17:32:28Z")
                )
            )
            .shift(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SubscriptionUpdateTrialParams.builder()
                .subscriptionId("subscription_id")
                .trialEndDate(
                    SubscriptionUpdateTrialParams.TrialEndDate.ofOffsetDateTime(
                        OffsetDateTime.parse("2017-07-21T17:32:28Z")
                    )
                )
                .shift(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.trialEndDate())
            .isEqualTo(
                SubscriptionUpdateTrialParams.TrialEndDate.ofOffsetDateTime(
                    OffsetDateTime.parse("2017-07-21T17:32:28Z")
                )
            )
        assertThat(body.shift()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SubscriptionUpdateTrialParams.builder()
                .subscriptionId("subscription_id")
                .trialEndDate(
                    SubscriptionUpdateTrialParams.TrialEndDate.ofOffsetDateTime(
                        OffsetDateTime.parse("2017-07-21T17:32:28Z")
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.trialEndDate())
            .isEqualTo(
                SubscriptionUpdateTrialParams.TrialEndDate.ofOffsetDateTime(
                    OffsetDateTime.parse("2017-07-21T17:32:28Z")
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            SubscriptionUpdateTrialParams.builder()
                .subscriptionId("subscription_id")
                .trialEndDate(
                    SubscriptionUpdateTrialParams.TrialEndDate.ofOffsetDateTime(
                        OffsetDateTime.parse("2017-07-21T17:32:28Z")
                    )
                )
                .build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
