// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.errorBodyHandler
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepare
import com.withorb.api.models.BillableMetric
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricListPage
import com.withorb.api.models.MetricListPageResponse
import com.withorb.api.models.MetricListParams
import com.withorb.api.models.MetricUpdateParams

class MetricServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MetricService {

    private val withRawResponse: MetricService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MetricService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MetricService =
        MetricServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: MetricCreateParams,
        requestOptions: RequestOptions,
    ): BillableMetric =
        // post /metrics
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: MetricUpdateParams,
        requestOptions: RequestOptions,
    ): BillableMetric =
        // put /metrics/{metric_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: MetricListParams, requestOptions: RequestOptions): MetricListPage =
        // get /metrics
        withRawResponse().list(params, requestOptions).parse()

    override fun fetch(params: MetricFetchParams, requestOptions: RequestOptions): BillableMetric =
        // get /metrics/{metric_id}
        withRawResponse().fetch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MetricService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): MetricService.WithRawResponse =
            MetricServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createHandler: Handler<BillableMetric> =
            jsonHandler<BillableMetric>(clientOptions.jsonMapper)

        override fun create(
            params: MetricCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillableMetric> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("metrics")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<BillableMetric> =
            jsonHandler<BillableMetric>(clientOptions.jsonMapper)

        override fun update(
            params: MetricUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillableMetric> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("metricId", params.metricId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("metrics", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<MetricListPageResponse> =
            jsonHandler<MetricListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MetricListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MetricListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("metrics")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        MetricListPage.builder()
                            .service(MetricServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val fetchHandler: Handler<BillableMetric> =
            jsonHandler<BillableMetric>(clientOptions.jsonMapper)

        override fun fetch(
            params: MetricFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillableMetric> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("metricId", params.metricId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("metrics", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
