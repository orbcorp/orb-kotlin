// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.EventDeprecateParams
import com.withorb.api.models.EventDeprecateResponse
import com.withorb.api.models.EventIngestParams
import com.withorb.api.models.EventIngestResponse
import com.withorb.api.models.EventSearchParams
import com.withorb.api.models.EventSearchResponse
import com.withorb.api.models.EventUpdateParams
import com.withorb.api.models.EventUpdateResponse
import com.withorb.api.services.async.events.BackfillServiceAsync
import com.withorb.api.services.async.events.BackfillServiceAsyncImpl
import com.withorb.api.services.async.events.VolumeServiceAsync
import com.withorb.api.services.async.events.VolumeServiceAsyncImpl

class EventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EventServiceAsync {

    private val withRawResponse: EventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val backfills: BackfillServiceAsync by lazy { BackfillServiceAsyncImpl(clientOptions) }

    private val volume: VolumeServiceAsync by lazy { VolumeServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EventServiceAsync.WithRawResponse = withRawResponse

    override fun backfills(): BackfillServiceAsync = backfills

    override fun volume(): VolumeServiceAsync = volume

    override suspend fun update(
        params: EventUpdateParams,
        requestOptions: RequestOptions,
    ): EventUpdateResponse =
        // put /events/{event_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun deprecate(
        params: EventDeprecateParams,
        requestOptions: RequestOptions,
    ): EventDeprecateResponse =
        // put /events/{event_id}/deprecate
        withRawResponse().deprecate(params, requestOptions).parse()

    override suspend fun ingest(
        params: EventIngestParams,
        requestOptions: RequestOptions,
    ): EventIngestResponse =
        // post /ingest
        withRawResponse().ingest(params, requestOptions).parse()

    override suspend fun search(
        params: EventSearchParams,
        requestOptions: RequestOptions,
    ): EventSearchResponse =
        // post /events/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val backfills: BackfillServiceAsync.WithRawResponse by lazy {
            BackfillServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val volume: VolumeServiceAsync.WithRawResponse by lazy {
            VolumeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun backfills(): BackfillServiceAsync.WithRawResponse = backfills

        override fun volume(): VolumeServiceAsync.WithRawResponse = volume

        private val updateHandler: Handler<EventUpdateResponse> =
            jsonHandler<EventUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun update(
            params: EventUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventId", params.eventId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val deprecateHandler: Handler<EventDeprecateResponse> =
            jsonHandler<EventDeprecateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun deprecate(
            params: EventDeprecateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventDeprecateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventId", params.eventId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", params._pathParam(0), "deprecate")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { deprecateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val ingestHandler: Handler<EventIngestResponse> =
            jsonHandler<EventIngestResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun ingest(
            params: EventIngestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventIngestResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ingest")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { ingestHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<EventSearchResponse> =
            jsonHandler<EventSearchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun search(
            params: EventSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
