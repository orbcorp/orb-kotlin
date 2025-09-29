// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.SubscriptionChangeApplyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionChangeServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionChangeServiceAsync = client.subscriptionChanges()

        val subscriptionChange = subscriptionChangeServiceAsync.retrieve("subscription_change_id")

        subscriptionChange.validate()
    }

    @Test
    suspend fun apply() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionChangeServiceAsync = client.subscriptionChanges()

        val response =
            subscriptionChangeServiceAsync.apply(
                SubscriptionChangeApplyParams.builder()
                    .subscriptionChangeId("subscription_change_id")
                    .description("description")
                    .markAsPaid(true)
                    .previouslyCollectedAmount("previously_collected_amount")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun cancel() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionChangeServiceAsync = client.subscriptionChanges()

        val response = subscriptionChangeServiceAsync.cancel("subscription_change_id")

        response.validate()
    }
}
