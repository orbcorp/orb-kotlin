// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.json
import com.withorb.api.core.prepare
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanCreateParams
import com.withorb.api.models.PlanFetchParams
import com.withorb.api.models.PlanListPage
import com.withorb.api.models.PlanListParams
import com.withorb.api.models.PlanUpdateParams
import com.withorb.api.services.blocking.plans.ExternalPlanIdService
import com.withorb.api.services.blocking.plans.ExternalPlanIdServiceImpl

class PlanServiceImpl internal constructor(private val clientOptions: ClientOptions) : PlanService {

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
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
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
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<PlanListPage.Response> =
        jsonHandler<PlanListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint returns a list of all [plans](/core-concepts#plan-and-price) for an account in
     * a list format. The list of plans is ordered starting from the most recently created plan. The
     * response also includes [`pagination_metadata`](/api-reference/pagination), which lets the
     * caller retrieve the next page of results if they exist.
     */
    override fun list(params: PlanListParams, requestOptions: RequestOptions): PlanListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("plans")
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { PlanListPage.of(this, params, it) }
    }

    private val fetchHandler: Handler<Plan> =
        jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch [plan](/core-concepts#plan-and-price) details given a plan
     * identifier. It returns information about the prices included in the plan and their
     * configuration, as well as the product that the plan is attached to.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given [Price](/core-concepts#plan-and-price) object. The
     * `model_type` field determines the key for the configuration object that is present. A
     * detailed explanation of price types can be found in the
     * [Price schema](/core-concepts#plan-and-price).
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
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { fetchHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
