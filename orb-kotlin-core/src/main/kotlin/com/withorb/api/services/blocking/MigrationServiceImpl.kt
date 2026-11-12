// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

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
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepare
import com.withorb.api.models.MigrationCancelParams
import com.withorb.api.models.MigrationCancelResponse
import com.withorb.api.models.MigrationCreateParams
import com.withorb.api.models.MigrationCreateResponse
import com.withorb.api.models.MigrationListPage
import com.withorb.api.models.MigrationListPageResponse
import com.withorb.api.models.MigrationListParams
import com.withorb.api.models.MigrationRetrieveParams
import com.withorb.api.models.MigrationRetrieveResponse
import com.withorb.api.services.blocking.migrations.SubscriptionService
import com.withorb.api.services.blocking.migrations.SubscriptionServiceImpl

/**
 * A migration moves a plan's subscriptions onto one of the plan's versions. Each subscription is
 * migrated asynchronously, either immediately or at a scheduled time, and the migration reports its
 * overall status as it progresses.
 */
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

    /**
     * A migration moves a plan's subscriptions onto one of the plan's versions. Each subscription
     * is migrated asynchronously, either immediately or at a scheduled time, and the migration
     * reports its overall status as it progresses.
     */
    override fun subscriptions(): SubscriptionService = subscriptions

    override fun create(
        params: MigrationCreateParams,
        requestOptions: RequestOptions,
    ): MigrationCreateResponse =
        // post /migrations
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: MigrationRetrieveParams,
        requestOptions: RequestOptions,
    ): MigrationRetrieveResponse =
        // get /migrations/{migration_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: MigrationListParams,
        requestOptions: RequestOptions,
    ): MigrationListPage =
        // get /migrations
        withRawResponse().list(params, requestOptions).parse()

    override fun cancel(
        params: MigrationCancelParams,
        requestOptions: RequestOptions,
    ): MigrationCancelResponse =
        // post /migrations/{migration_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MigrationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val subscriptions: SubscriptionService.WithRawResponse by lazy {
            SubscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MigrationService.WithRawResponse =
            MigrationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * A migration moves a plan's subscriptions onto one of the plan's versions. Each
         * subscription is migrated asynchronously, either immediately or at a scheduled time, and
         * the migration reports its overall status as it progresses.
         */
        override fun subscriptions(): SubscriptionService.WithRawResponse = subscriptions

        private val createHandler: Handler<MigrationCreateResponse> =
            jsonHandler<MigrationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MigrationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("migrations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<MigrationRetrieveResponse> =
            jsonHandler<MigrationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MigrationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("migrationId", params.migrationId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("migrations", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<MigrationListPageResponse> =
            jsonHandler<MigrationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MigrationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("migrations")
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
                        MigrationListPage.builder()
                            .service(MigrationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelHandler: Handler<MigrationCancelResponse> =
            jsonHandler<MigrationCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: MigrationCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationCancelResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("migrationId", params.migrationId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("migrations", params._pathParam(0), "cancel")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
