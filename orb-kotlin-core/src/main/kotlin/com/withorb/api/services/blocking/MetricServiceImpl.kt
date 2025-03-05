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
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepare
import com.withorb.api.errors.OrbError
import com.withorb.api.models.BillableMetricModel
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricListPage
import com.withorb.api.models.MetricListParams
import com.withorb.api.models.MetricUpdateParams

class MetricServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MetricService {

    private val withRawResponse: MetricService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MetricService.WithRawResponse = withRawResponse

    override fun create(
        params: MetricCreateParams,
        requestOptions: RequestOptions,
    ): BillableMetricModel =
        // post /metrics
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: MetricUpdateParams,
        requestOptions: RequestOptions,
    ): BillableMetricModel =
        // put /metrics/{metric_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: MetricListParams, requestOptions: RequestOptions): MetricListPage =
        // get /metrics
        withRawResponse().list(params, requestOptions).parse()

    override fun fetch(
        params: MetricFetchParams,
        requestOptions: RequestOptions,
    ): BillableMetricModel =
        // get /metrics/{metric_id}
        withRawResponse().fetch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MetricService.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BillableMetricModel> =
            jsonHandler<BillableMetricModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: MetricCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillableMetricModel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("metrics")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<BillableMetricModel> =
            jsonHandler<BillableMetricModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: MetricUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillableMetricModel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("metrics", params.getPathParam(0))
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

        private val listHandler: Handler<MetricListPage.Response> =
            jsonHandler<MetricListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: MetricListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MetricListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("metrics")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { MetricListPage.of(MetricServiceImpl(clientOptions), params, it) }
            }
        }

        private val fetchHandler: Handler<BillableMetricModel> =
            jsonHandler<BillableMetricModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetch(
            params: MetricFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillableMetricModel> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("metrics", params.getPathParam(0))
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
