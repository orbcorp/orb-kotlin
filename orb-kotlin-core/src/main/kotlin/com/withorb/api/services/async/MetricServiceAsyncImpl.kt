// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

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
import com.withorb.api.models.BillableMetric
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricListPageAsync
import com.withorb.api.models.MetricListParams
import com.withorb.api.models.MetricUpdateParams

class MetricServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : MetricServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<BillableMetric> =
        jsonHandler<BillableMetric>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to create a [metric](/core-concepts###metric) using a SQL string. See
     * [SQL support](/extensibility/advanced-metrics#sql-support) for a description of constructing
     * SQL queries with examples.
     */
    override suspend fun create(
        params: MetricCreateParams,
        requestOptions: RequestOptions
    ): BillableMetric {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("metrics")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<BillableMetric> =
        jsonHandler<BillableMetric>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint allows you to update the `metadata` property on a metric. If you pass `null`
     * for the metadata value, it will clear any existing metadata for that invoice.
     */
    override suspend fun update(
        params: MetricUpdateParams,
        requestOptions: RequestOptions
    ): BillableMetric {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("metrics", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<MetricListPageAsync.Response> =
        jsonHandler<MetricListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch [metric](/core-concepts##metric) details given a metric
     * identifier. It returns information about the metrics including its name, description, and
     * item.
     */
    override suspend fun list(
        params: MetricListParams,
        requestOptions: RequestOptions
    ): MetricListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("metrics")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { MetricListPageAsync.of(this, params, it) }
    }

    private val fetchHandler: Handler<BillableMetric> =
        jsonHandler<BillableMetric>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to list [metrics](/core-concepts#metric). It returns information about
     * the metrics including its name, description, and item.
     */
    override suspend fun fetch(
        params: MetricFetchParams,
        requestOptions: RequestOptions
    ): BillableMetric {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("metrics", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { fetchHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
