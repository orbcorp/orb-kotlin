// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.services.blocking.migrations.SubscriptionService
import com.withorb.api.services.blocking.migrations.SubscriptionServiceImpl

class MigrationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MigrationService {

    private val withRawResponse: MigrationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val subscriptions: SubscriptionService by lazy {
        SubscriptionServiceImpl(clientOptions)
    }

    override fun withRawResponse(): MigrationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MigrationService =
        MigrationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun subscriptions(): SubscriptionService = subscriptions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MigrationService.WithRawResponse {

        private val subscriptions: SubscriptionService.WithRawResponse by lazy {
            SubscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MigrationService.WithRawResponse =
            MigrationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun subscriptions(): SubscriptionService.WithRawResponse = subscriptions
    }
}
