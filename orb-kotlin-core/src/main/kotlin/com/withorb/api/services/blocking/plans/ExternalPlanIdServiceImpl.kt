// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.plans

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepare
import com.withorb.api.errors.OrbError
import com.withorb.api.models.PlanExternalPlanIdFetchParams
import com.withorb.api.models.PlanExternalPlanIdUpdateParams
import com.withorb.api.models.PlanModel

class ExternalPlanIdServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExternalPlanIdService {

    private val withRawResponse: ExternalPlanIdService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalPlanIdService.WithRawResponse = withRawResponse

    override fun update(
        params: PlanExternalPlanIdUpdateParams,
        requestOptions: RequestOptions,
    ): PlanModel =
        // put /plans/external_plan_id/{external_plan_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun fetch(
        params: PlanExternalPlanIdFetchParams,
        requestOptions: RequestOptions,
    ): PlanModel =
        // get /plans/external_plan_id/{external_plan_id}
        withRawResponse().fetch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalPlanIdService.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val updateHandler: Handler<PlanModel> =
            jsonHandler<PlanModel>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PlanExternalPlanIdUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanModel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("plans", "external_plan_id", params.getPathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val fetchHandler: Handler<PlanModel> =
            jsonHandler<PlanModel>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetch(
            params: PlanExternalPlanIdFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanModel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("plans", "external_plan_id", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
