// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.events

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
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.EventBackfillCloseParams
import com.withorb.api.models.EventBackfillCloseResponse
import com.withorb.api.models.EventBackfillCreateParams
import com.withorb.api.models.EventBackfillCreateResponse
import com.withorb.api.models.EventBackfillFetchParams
import com.withorb.api.models.EventBackfillFetchResponse
import com.withorb.api.models.EventBackfillListPageAsync
import com.withorb.api.models.EventBackfillListPageResponse
import com.withorb.api.models.EventBackfillListParams
import com.withorb.api.models.EventBackfillRevertParams
import com.withorb.api.models.EventBackfillRevertResponse

class BackfillServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BackfillServiceAsync {

    private val withRawResponse: BackfillServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BackfillServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BackfillServiceAsync =
        BackfillServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: EventBackfillCreateParams,
        requestOptions: RequestOptions,
    ): EventBackfillCreateResponse =
        // post /events/backfills
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun list(
        params: EventBackfillListParams,
        requestOptions: RequestOptions,
    ): EventBackfillListPageAsync =
        // get /events/backfills
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun close(
        params: EventBackfillCloseParams,
        requestOptions: RequestOptions,
    ): EventBackfillCloseResponse =
        // post /events/backfills/{backfill_id}/close
        withRawResponse().close(params, requestOptions).parse()

    override suspend fun fetch(
        params: EventBackfillFetchParams,
        requestOptions: RequestOptions,
    ): EventBackfillFetchResponse =
        // get /events/backfills/{backfill_id}
        withRawResponse().fetch(params, requestOptions).parse()

    override suspend fun revert(
        params: EventBackfillRevertParams,
        requestOptions: RequestOptions,
    ): EventBackfillRevertResponse =
        // post /events/backfills/{backfill_id}/revert
        withRawResponse().revert(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BackfillServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BackfillServiceAsync.WithRawResponse =
            BackfillServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<EventBackfillCreateResponse> =
            jsonHandler<EventBackfillCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: EventBackfillCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventBackfillCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "backfills")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val listHandler: Handler<EventBackfillListPageResponse> =
            jsonHandler<EventBackfillListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: EventBackfillListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventBackfillListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "backfills")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        EventBackfillListPageAsync.builder()
                            .service(BackfillServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val closeHandler: Handler<EventBackfillCloseResponse> =
            jsonHandler<EventBackfillCloseResponse>(clientOptions.jsonMapper)

        override suspend fun close(
            params: EventBackfillCloseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventBackfillCloseResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("backfillId", params.backfillId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "backfills", params._pathParam(0), "close")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { closeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fetchHandler: Handler<EventBackfillFetchResponse> =
            jsonHandler<EventBackfillFetchResponse>(clientOptions.jsonMapper)

        override suspend fun fetch(
            params: EventBackfillFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventBackfillFetchResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("backfillId", params.backfillId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "backfills", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val revertHandler: Handler<EventBackfillRevertResponse> =
            jsonHandler<EventBackfillRevertResponse>(clientOptions.jsonMapper)

        override suspend fun revert(
            params: EventBackfillRevertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventBackfillRevertResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("backfillId", params.backfillId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "backfills", params._pathParam(0), "revert")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { revertHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
