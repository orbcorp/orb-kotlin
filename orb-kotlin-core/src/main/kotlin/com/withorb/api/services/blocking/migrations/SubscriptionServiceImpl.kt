// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.migrations

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.errorBodyHandler
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepare
import com.withorb.api.models.MigrationSubscriptionListPage
import com.withorb.api.models.MigrationSubscriptionListPageResponse
import com.withorb.api.models.MigrationSubscriptionListParams

/**
 * A migration moves a plan's subscriptions onto one of the plan's versions. Each subscription is
 * migrated asynchronously, either immediately or at a scheduled time, and the migration reports its
 * overall status as it progresses.
 */
class SubscriptionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionService {

    private val withRawResponse: SubscriptionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriptionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SubscriptionService =
        SubscriptionServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(
        params: MigrationSubscriptionListParams,
        requestOptions: RequestOptions,
    ): MigrationSubscriptionListPage =
        // get /migrations/{migration_id}/subscriptions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SubscriptionService.WithRawResponse =
            SubscriptionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<MigrationSubscriptionListPageResponse> =
            jsonHandler<MigrationSubscriptionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MigrationSubscriptionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationSubscriptionListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("migrationId", params.migrationId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("migrations", params._pathParam(0), "subscriptions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        MigrationSubscriptionListPage.builder()
                            .service(SubscriptionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
