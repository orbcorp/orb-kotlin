// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.services.async.migrations.SubscriptionServiceAsync
import com.withorb.api.services.async.migrations.SubscriptionServiceAsyncImpl

class MigrationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MigrationServiceAsync {

    private val withRawResponse: MigrationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): MigrationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MigrationServiceAsync =
        MigrationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MigrationServiceAsync.WithRawResponse {

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MigrationServiceAsync.WithRawResponse =
            MigrationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions
    }
}
