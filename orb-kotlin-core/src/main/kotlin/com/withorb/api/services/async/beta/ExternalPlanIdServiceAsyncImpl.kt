// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.beta

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
import com.withorb.api.models.BetaExternalPlanIdCreatePlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdFetchPlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdSetDefaultPlanVersionParams
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanVersion

class ExternalPlanIdServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalPlanIdServiceAsync {

    private val withRawResponse: ExternalPlanIdServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalPlanIdServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): ExternalPlanIdServiceAsync =
        ExternalPlanIdServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun createPlanVersion(
        params: BetaExternalPlanIdCreatePlanVersionParams,
        requestOptions: RequestOptions,
    ): PlanVersion =
        // post /plans/external_plan_id/{external_plan_id}/versions
        withRawResponse().createPlanVersion(params, requestOptions).parse()

    override suspend fun fetchPlanVersion(
        params: BetaExternalPlanIdFetchPlanVersionParams,
        requestOptions: RequestOptions,
    ): PlanVersion =
        // get /plans/external_plan_id/{external_plan_id}/versions/{version}
        withRawResponse().fetchPlanVersion(params, requestOptions).parse()

    override suspend fun setDefaultPlanVersion(
        params: BetaExternalPlanIdSetDefaultPlanVersionParams,
        requestOptions: RequestOptions,
    ): Plan =
        // post /plans/external_plan_id/{external_plan_id}/set_default_version
        withRawResponse().setDefaultPlanVersion(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalPlanIdServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExternalPlanIdServiceAsync.WithRawResponse =
            ExternalPlanIdServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createPlanVersionHandler: Handler<PlanVersion> =
            jsonHandler<PlanVersion>(clientOptions.jsonMapper)

        override suspend fun createPlanVersion(
            params: BetaExternalPlanIdCreatePlanVersionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanVersion> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalPlanId", params.externalPlanId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", "external_plan_id", params._pathParam(0), "versions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
            jsonHandler<PlanVersion>(clientOptions.jsonMapper)

        override suspend fun fetchPlanVersion(
            params: BetaExternalPlanIdFetchPlanVersionParams,
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
                        "external_plan_id",
                        params._pathParam(0),
                        "versions",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
            jsonHandler<Plan>(clientOptions.jsonMapper)

        override suspend fun setDefaultPlanVersion(
            params: BetaExternalPlanIdSetDefaultPlanVersionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Plan> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalPlanId", params.externalPlanId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "plans",
                        "external_plan_id",
                        params._pathParam(0),
                        "set_default_version",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
