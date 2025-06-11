// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.BetaCreatePlanVersionParams
import com.withorb.api.models.BetaFetchPlanVersionParams
import com.withorb.api.models.BetaSetDefaultPlanVersionParams
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanVersion
import com.withorb.api.services.async.beta.ExternalPlanIdServiceAsync
import com.withorb.api.services.async.beta.ExternalPlanIdServiceAsyncImpl

class BetaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BetaServiceAsync {

    private val withRawResponse: BetaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalPlanId: ExternalPlanIdServiceAsync by lazy {
        ExternalPlanIdServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): BetaServiceAsync.WithRawResponse = withRawResponse

    override fun externalPlanId(): ExternalPlanIdServiceAsync = externalPlanId

    override suspend fun createPlanVersion(
        params: BetaCreatePlanVersionParams,
        requestOptions: RequestOptions,
    ): PlanVersion =
        // post /plans/{plan_id}/versions
        withRawResponse().createPlanVersion(params, requestOptions).parse()

    override suspend fun fetchPlanVersion(
        params: BetaFetchPlanVersionParams,
        requestOptions: RequestOptions,
    ): PlanVersion =
        // get /plans/{plan_id}/versions/{version}
        withRawResponse().fetchPlanVersion(params, requestOptions).parse()

    override suspend fun setDefaultPlanVersion(
        params: BetaSetDefaultPlanVersionParams,
        requestOptions: RequestOptions,
    ): Plan =
        // post /plans/{plan_id}/set_default_version
        withRawResponse().setDefaultPlanVersion(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BetaServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val externalPlanId: ExternalPlanIdServiceAsync.WithRawResponse by lazy {
            ExternalPlanIdServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun externalPlanId(): ExternalPlanIdServiceAsync.WithRawResponse = externalPlanId

        private val createPlanVersionHandler: Handler<PlanVersion> =
            jsonHandler<PlanVersion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun createPlanVersion(
            params: BetaCreatePlanVersionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanVersion> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("planId", params.planId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", params._pathParam(0), "versions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createPlanVersionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fetchPlanVersionHandler: Handler<PlanVersion> =
            jsonHandler<PlanVersion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun fetchPlanVersion(
            params: BetaFetchPlanVersionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanVersion> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("version", params.version())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "plans",
                        params._pathParam(0),
                        "versions",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { fetchPlanVersionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setDefaultPlanVersionHandler: Handler<Plan> =
            jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun setDefaultPlanVersion(
            params: BetaSetDefaultPlanVersionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Plan> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("planId", params.planId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", params._pathParam(0), "set_default_version")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { setDefaultPlanVersionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
