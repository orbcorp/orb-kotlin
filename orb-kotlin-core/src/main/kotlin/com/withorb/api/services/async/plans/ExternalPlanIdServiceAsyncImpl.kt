// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.json
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanExternalPlanIdFetchParams
import com.withorb.api.models.PlanExternalPlanIdUpdateParams

class ExternalPlanIdServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalPlanIdServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<Plan> =
        jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint can be used to update the `external_plan_id`, and `metadata` of an existing
     * plan.
     *
     * Other fields on a customer are currently immutable.
     */
    override suspend fun update(
        params: PlanExternalPlanIdUpdateParams,
        requestOptions: RequestOptions,
    ): Plan {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("plans", "external_plan_id", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val fetchHandler: Handler<Plan> =
        jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch [plan](/core-concepts##plan-and-price) details given an
     * external_plan_id identifier. It returns information about the prices included in the plan and
     * their configuration, as well as the product that the plan is attached to.
     *
     * If multiple plans are found to contain the specified external_plan_id, the active plans will
     * take priority over archived ones, and among those, the endpoint will return the most recently
     * created plan.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given [Price](/core-concepts#plan-and-price) object. The
     * `model_type` field determines the key for the configuration object that is present. A
     * detailed explanation of price types can be found in the
     * [Price schema](/core-concepts#plan-and-price). "
     */
    override suspend fun fetch(
        params: PlanExternalPlanIdFetchParams,
        requestOptions: RequestOptions,
    ): Plan {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("plans", "external_plan_id", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { fetchHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
