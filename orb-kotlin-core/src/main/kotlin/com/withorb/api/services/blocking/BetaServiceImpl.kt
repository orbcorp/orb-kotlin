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
import com.withorb.api.models.BetaCreatePlanVersionParams
import com.withorb.api.models.BetaFetchPlanVersionParams
import com.withorb.api.models.BetaSetDefaultPlanVersionParams
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanVersion
import com.withorb.api.services.blocking.beta.ExternalPlanIdService
import com.withorb.api.services.blocking.beta.ExternalPlanIdServiceImpl

class BetaServiceImpl internal constructor(private val clientOptions: ClientOptions) : BetaService {

    private val withRawResponse: BetaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalPlanId: ExternalPlanIdService by lazy {
        ExternalPlanIdServiceImpl(clientOptions)
    }

    override fun withRawResponse(): BetaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BetaService =
        BetaServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun externalPlanId(): ExternalPlanIdService = externalPlanId

    override fun createPlanVersion(
        params: BetaCreatePlanVersionParams,
        requestOptions: RequestOptions,
    ): PlanVersion =
        // post /plans/{plan_id}/versions
        withRawResponse().createPlanVersion(params, requestOptions).parse()

    override fun fetchPlanVersion(
        params: BetaFetchPlanVersionParams,
        requestOptions: RequestOptions,
    ): PlanVersion =
        // get /plans/{plan_id}/versions/{version}
        withRawResponse().fetchPlanVersion(params, requestOptions).parse()

    override fun setDefaultPlanVersion(
        params: BetaSetDefaultPlanVersionParams,
        requestOptions: RequestOptions,
    ): Plan =
        // post /plans/{plan_id}/set_default_version
        withRawResponse().setDefaultPlanVersion(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BetaService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val externalPlanId: ExternalPlanIdService.WithRawResponse by lazy {
            ExternalPlanIdServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BetaService.WithRawResponse =
            BetaServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun externalPlanId(): ExternalPlanIdService.WithRawResponse = externalPlanId

        private val createPlanVersionHandler: Handler<PlanVersion> =
            jsonHandler<PlanVersion>(clientOptions.jsonMapper)

        override fun createPlanVersion(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun fetchPlanVersion(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun setDefaultPlanVersion(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
