// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

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
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.MigrationCancelParams
import com.withorb.api.models.MigrationCancelResponse
import com.withorb.api.models.MigrationCreateParams
import com.withorb.api.models.MigrationCreateResponse
import com.withorb.api.models.MigrationListPageAsync
import com.withorb.api.models.MigrationListPageResponse
import com.withorb.api.models.MigrationListParams
import com.withorb.api.models.MigrationRetrieveParams
import com.withorb.api.models.MigrationRetrieveResponse
import com.withorb.api.services.async.migrations.SubscriptionServiceAsync
import com.withorb.api.services.async.migrations.SubscriptionServiceAsyncImpl

/**
 * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed to by
 * a customer. Plans define the billing behavior of the subscription. You can see more about how to
 * configure prices in the [Price resource](/reference/price).
 */
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

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     */
    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    override suspend fun create(
        params: MigrationCreateParams,
        requestOptions: RequestOptions,
    ): MigrationCreateResponse =
        // post /migrations
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: MigrationRetrieveParams,
        requestOptions: RequestOptions,
    ): MigrationRetrieveResponse =
        // get /migrations/{migration_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: MigrationListParams,
        requestOptions: RequestOptions,
    ): MigrationListPageAsync =
        // get /migrations
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun cancel(
        params: MigrationCancelParams,
        requestOptions: RequestOptions,
    ): MigrationCancelResponse =
        // post /migrations/{migration_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MigrationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MigrationServiceAsync.WithRawResponse =
            MigrationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions

        private val createHandler: Handler<MigrationCreateResponse> =
            jsonHandler<MigrationCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun retrieve(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun list(
            params: MigrationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("migrations")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        MigrationListPageAsync.builder()
                            .service(MigrationServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelHandler: Handler<MigrationCancelResponse> =
            jsonHandler<MigrationCancelResponse>(clientOptions.jsonMapper)

        override suspend fun cancel(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
