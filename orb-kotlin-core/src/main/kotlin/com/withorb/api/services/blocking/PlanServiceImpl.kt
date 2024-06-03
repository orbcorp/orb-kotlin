// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanCreateParams
import com.withorb.api.models.PlanFetchParams
import com.withorb.api.models.PlanListPage
import com.withorb.api.models.PlanListParams
import com.withorb.api.models.PlanUpdateParams
import com.withorb.api.services.blocking.plans.ExternalPlanIdService
import com.withorb.api.services.blocking.plans.ExternalPlanIdServiceImpl
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.withErrorHandler

class PlanServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : PlanService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val externalPlanId: ExternalPlanIdService by lazy {
        ExternalPlanIdServiceImpl(clientOptions)
    }

    override fun externalPlanId(): ExternalPlanIdService = externalPlanId

    private val createHandler: Handler<Plan> =
        jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint allows creation of plans including their prices. */
    override fun create(params: PlanCreateParams, requestOptions: RequestOptions): Plan {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("plans")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<Plan> =
        jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint can be used to update the `external_plan_id`, and `metadata` of an existing
     * plan.
     *
     * Other fields on a customer are currently immutable.
     */
    override fun update(params: PlanUpdateParams, requestOptions: RequestOptions): Plan {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("plans", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<PlanListPage.Response> =
        jsonHandler<PlanListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint returns a list of all [plans](../guides/concepts##plan-and-price) for an
     * account in a list format. The list of plans is ordered starting from the most recently
     * created plan. The response also includes [`pagination_metadata`](../reference/pagination),
     * which lets the caller retrieve the next page of results if they exist.
     */
    override fun list(params: PlanListParams, requestOptions: RequestOptions): PlanListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("plans")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { PlanListPage.of(this, params, it) }
        }
    }

    private val fetchHandler: Handler<Plan> =
        jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch [plan](../guides/concepts##plan-and-price) details given a
     * plan identifier. It returns information about the prices included in the plan and their
     * configuration, as well as the product that the plan is attached to.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given [Price](../guides/concepts#plan-and-price) object. The
     * `model_type` field determines the key for the configuration object that is present. A
     * detailed explanation of price types can be found in the
     * [Price schema](../guides/concepts#plan-and-price).
     *
     * ## Phases
     *
     * Orb supports plan phases, also known as contract ramps. For plans with phases, the serialized
     * prices refer to all prices across all phases.
     */
    override fun fetch(params: PlanFetchParams, requestOptions: RequestOptions): Plan {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("plans", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { fetchHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
