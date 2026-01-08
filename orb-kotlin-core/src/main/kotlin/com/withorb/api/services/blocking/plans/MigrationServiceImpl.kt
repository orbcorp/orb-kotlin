// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.plans

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
import com.withorb.api.models.PlanMigrationCancelParams
import com.withorb.api.models.PlanMigrationCancelResponse
import com.withorb.api.models.PlanMigrationListPage
import com.withorb.api.models.PlanMigrationListPageResponse
import com.withorb.api.models.PlanMigrationListParams
import com.withorb.api.models.PlanMigrationRetrieveParams
import com.withorb.api.models.PlanMigrationRetrieveResponse

class MigrationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MigrationService {

    private val withRawResponse: MigrationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MigrationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MigrationService =
        MigrationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: PlanMigrationRetrieveParams,
        requestOptions: RequestOptions,
    ): PlanMigrationRetrieveResponse =
        // get /plans/{plan_id}/migrations/{migration_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: PlanMigrationListParams,
        requestOptions: RequestOptions,
    ): PlanMigrationListPage =
        // get /plans/{plan_id}/migrations
        withRawResponse().list(params, requestOptions).parse()

    override fun cancel(
        params: PlanMigrationCancelParams,
        requestOptions: RequestOptions,
    ): PlanMigrationCancelResponse =
        // post /plans/{plan_id}/migrations/{migration_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MigrationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MigrationService.WithRawResponse =
            MigrationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<PlanMigrationRetrieveResponse> =
            jsonHandler<PlanMigrationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
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

        private val listHandler: Handler<PlanMigrationListPageResponse> =
            jsonHandler<PlanMigrationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PlanMigrationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanMigrationListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("planId", params.planId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", params._pathParam(0), "migrations")
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
                        PlanMigrationListPage.builder()
                            .service(MigrationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelHandler: Handler<PlanMigrationCancelResponse> =
            jsonHandler<PlanMigrationCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
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
