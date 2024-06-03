// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricCreateResponse
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricFetchResponse
import com.withorb.api.models.MetricListPage
import com.withorb.api.models.MetricListParams
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.withErrorHandler

class MetricServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : MetricService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<MetricCreateResponse> =
        jsonHandler<MetricCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to create a [metric](../guides/concepts##metric) using a SQL string.
     * See [SQL support](../guides/extensibility/advanced-metrics#sql-support) for a description of
     * constructing SQL queries with examples.
     */
    override fun create(
        params: MetricCreateParams,
        requestOptions: RequestOptions
    ): MetricCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("metrics")
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

    private val listHandler: Handler<MetricListPage.Response> =
        jsonHandler<MetricListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch [metric](../guides/concepts#metric) details given a metric
     * identifier. It returns information about the metrics including its name, description, and
     * item.
     */
    override fun list(params: MetricListParams, requestOptions: RequestOptions): MetricListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("metrics")
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
                .let { MetricListPage.of(this, params, it) }
        }
    }

    private val fetchHandler: Handler<MetricFetchResponse> =
        jsonHandler<MetricFetchResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to list [metrics](../guides/concepts##metric). It returns information
     * about the metrics including its name, description, and item.
     */
    override fun fetch(
        params: MetricFetchParams,
        requestOptions: RequestOptions
    ): MetricFetchResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("metrics", params.getPathParam(0))
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
