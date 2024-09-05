// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.withorb.api.core.Enum
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanExternalPlanIdFetchParams
import com.withorb.api.models.PlanExternalPlanIdUpdateParams
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.errors.OrbError
import com.withorb.api.services.emptyHandler
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.multipartFormData
import com.withorb.api.services.stringHandler
import com.withorb.api.services.binaryHandler
import com.withorb.api.services.withErrorHandler

class ExternalPlanIdServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : ExternalPlanIdServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<Plan> =
    jsonHandler<Plan>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint can be used to update the `external_plan_id`, and `metadata` of an
     * existing plan.
     *
     * Other fields on a customer are currently immutable.
     */
    override suspend fun update(params: PlanExternalPlanIdUpdateParams, requestOptions: RequestOptions): Plan {
      val request = HttpRequest.builder()
        .method(HttpMethod.PUT)
        .addPathSegments("plans", "external_plan_id", params.getPathParam(0))
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .let { response -> 
          response.use {
              updateHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val fetchHandler: Handler<Plan> =
    jsonHandler<Plan>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch [plan](../guides/concepts##plan-and-price)
     * details given an external_plan_id identifier. It returns information about the
     * prices included in the plan and their configuration, as well as the product that
     * the plan is attached to.
     *
     * If multiple plans are found to contain the specified external_plan_id, the
     * active plans will take priority over archived ones, and among those, the
     * endpoint will return the most recently created plan.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models
     * is serialized differently in a given [Price](../guides/concepts#plan-and-price)
     * object. The `model_type` field determines the key for the configuration object
     * that is present. A detailed explanation of price types can be found in the
     * [Price schema](../guides/concepts#plan-and-price). "
     */
    override suspend fun fetch(params: PlanExternalPlanIdFetchParams, requestOptions: RequestOptions): Plan {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("plans", "external_plan_id", params.getPathParam(0))
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .let { response -> 
          response.use {
              fetchHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
