// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

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
import com.withorb.api.models.BillableMetric
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricListPageAsync
import com.withorb.api.models.MetricListParams
import com.withorb.api.models.MetricUpdateParams
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

class MetricServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : MetricServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<BillableMetric> =
    jsonHandler<BillableMetric>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint is used to create a [metric](../guides/concepts##metric) using a
     * SQL string. See
     * [SQL support](../guides/extensibility/advanced-metrics#sql-support) for a
     * description of constructing SQL queries with examples.
     */
    override suspend fun create(params: MetricCreateParams, requestOptions: RequestOptions): BillableMetric {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("metrics")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .let { response -> 
          response.use {
              createHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val updateHandler: Handler<BillableMetric> =
    jsonHandler<BillableMetric>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint allows you to update the `metadata` property on a metric. If you
     * pass `null` for the metadata value, it will clear any existing metadata for that
     * invoice.
     */
    override suspend fun update(params: MetricUpdateParams, requestOptions: RequestOptions): BillableMetric {
      val request = HttpRequest.builder()
        .method(HttpMethod.PUT)
        .addPathSegments("metrics", params.getPathParam(0))
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

    private val listHandler: Handler<MetricListPageAsync.Response> =
    jsonHandler<MetricListPageAsync.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch [metric](../guides/concepts#metric) details given
     * a metric identifier. It returns information about the metrics including its
     * name, description, and item.
     */
    override suspend fun list(params: MetricListParams, requestOptions: RequestOptions): MetricListPageAsync {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("metrics")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .let { response -> 
          response.use {
              listHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
          .let {
              MetricListPageAsync.of(this, params, it)
          }
      }
    }

    private val fetchHandler: Handler<BillableMetric> =
    jsonHandler<BillableMetric>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint is used to list [metrics](../guides/concepts##metric). It returns
     * information about the metrics including its name, description, and item.
     */
    override suspend fun fetch(params: MetricFetchParams, requestOptions: RequestOptions): BillableMetric {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("metrics", params.getPathParam(0))
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
