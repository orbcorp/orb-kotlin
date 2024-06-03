// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.plans

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanExternalPlanIdFetchParams
import com.withorb.api.models.PlanExternalPlanIdUpdateParams
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.withErrorHandler

class ExternalPlanIdServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ExternalPlanIdService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<Plan> =
        jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch [plan](../guides/concepts##plan-and-price) details given an
     * external_plan_id identifier. It returns information about the prices included in the plan and
     * their configuration, as well as the product that the plan is attached to.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given [Price](../guides/concepts#plan-and-price) object. The
     * `model_type` field determines the key for the configuration object that is present. A
     * detailed explanation of price types can be found in the
     * [Price schema](../guides/concepts#plan-and-price).
     */
    override fun update(
        params: PlanExternalPlanIdUpdateParams,
        requestOptions: RequestOptions
    ): Plan {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("plans", "external_plan_id", params.getPathParam(0))
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

    private val fetchHandler: Handler<Plan> =
        jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch [plan](../guides/concepts##plan-and-price) details given an
     * external_plan_id identifier. It returns information about the prices included in the plan and
     * their configuration, as well as the product that the plan is attached to.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given [Price](../guides/concepts#plan-and-price) object. The
     * `model_type` field determines the key for the configuration object that is present. A
     * detailed explanation of price types can be found in the
     * [Price schema](../guides/concepts#plan-and-price). "
     */
    override fun fetch(
        params: PlanExternalPlanIdFetchParams,
        requestOptions: RequestOptions
    ): Plan {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("plans", "external_plan_id", params.getPathParam(0))
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
