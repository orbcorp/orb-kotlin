// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.parseable
import com.withorb.api.core.json
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanCreateParams
import com.withorb.api.models.PlanFetchParams
import com.withorb.api.models.PlanListPageAsync
import com.withorb.api.models.PlanListParams
import com.withorb.api.models.PlanUpdateParams
import com.withorb.api.services.async.plans.ExternalPlanIdServiceAsync
import com.withorb.api.services.async.plans.ExternalPlanIdServiceAsyncImpl

class PlanServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlanServiceAsync {

    private val withRawResponse: PlanServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalPlanId: ExternalPlanIdServiceAsync by lazy {
        ExternalPlanIdServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): PlanServiceAsync.WithRawResponse = withRawResponse

    override fun externalPlanId(): ExternalPlanIdServiceAsync = externalPlanId

    override suspend fun create(params: PlanCreateParams, requestOptions: RequestOptions): Plan =
        // post /plans
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun update(params: PlanUpdateParams, requestOptions: RequestOptions): Plan =
        // put /plans/{plan_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: PlanListParams,
        requestOptions: RequestOptions,
    ): PlanListPageAsync =
        // get /plans
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun fetch(params: PlanFetchParams, requestOptions: RequestOptions): Plan =
        // get /plans/{plan_id}
        withRawResponse().fetch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlanServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val externalPlanId: ExternalPlanIdServiceAsync.WithRawResponse by lazy {
            ExternalPlanIdServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun externalPlanId(): ExternalPlanIdServiceAsync.WithRawResponse = externalPlanId

        private val createHandler: Handler<Plan> =
            jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Plan> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("plans")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Plan> =
            jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: PlanUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Plan> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("plans", params.getPathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PlanListPageAsync.Response> =
            jsonHandler<PlanListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: PlanListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("plans")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { PlanListPageAsync.of(PlanServiceAsyncImpl(clientOptions), params, it) }
            }
        }

        private val fetchHandler: Handler<Plan> =
            jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun fetch(
            params: PlanFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Plan> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("plans", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { fetchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
