// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans

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
import com.withorb.api.models.PlanMigrationCancelParams
import com.withorb.api.models.PlanMigrationCancelResponse
import com.withorb.api.models.PlanMigrationListPageAsync
import com.withorb.api.models.PlanMigrationListPageResponse
import com.withorb.api.models.PlanMigrationListParams
import com.withorb.api.models.PlanMigrationRetrieveParams
import com.withorb.api.models.PlanMigrationRetrieveResponse

class MigrationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MigrationServiceAsync {

    private val withRawResponse: MigrationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MigrationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MigrationServiceAsync =
        MigrationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: PlanMigrationRetrieveParams,
        requestOptions: RequestOptions,
    ): PlanMigrationRetrieveResponse =
        // get /plans/{plan_id}/migrations/{migration_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: PlanMigrationListParams,
        requestOptions: RequestOptions,
    ): PlanMigrationListPageAsync =
        // get /plans/{plan_id}/migrations
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun cancel(
        params: PlanMigrationCancelParams,
        requestOptions: RequestOptions,
    ): PlanMigrationCancelResponse =
        // post /plans/{plan_id}/migrations/{migration_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MigrationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MigrationServiceAsync.WithRawResponse =
            MigrationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<PlanMigrationRetrieveResponse> =
            jsonHandler<PlanMigrationRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: PlanMigrationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanMigrationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("migrationId", params.migrationId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "plans",
                        params._pathParam(0),
                        "migrations",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<PlanMigrationListPageResponse> =
            jsonHandler<PlanMigrationListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: PlanMigrationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanMigrationListPageAsync> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("planId", params.planId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", params._pathParam(0), "migrations")
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
                        PlanMigrationListPageAsync.builder()
                            .service(MigrationServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelHandler: Handler<PlanMigrationCancelResponse> =
            jsonHandler<PlanMigrationCancelResponse>(clientOptions.jsonMapper)

        override suspend fun cancel(
            params: PlanMigrationCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanMigrationCancelResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("migrationId", params.migrationId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "plans",
                        params._pathParam(0),
                        "migrations",
                        params._pathParam(1),
                        "cancel",
                    )
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
