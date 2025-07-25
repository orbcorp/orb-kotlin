// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.events

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
import com.withorb.api.models.EventBackfillCloseParams
import com.withorb.api.models.EventBackfillCloseResponse
import com.withorb.api.models.EventBackfillCreateParams
import com.withorb.api.models.EventBackfillCreateResponse
import com.withorb.api.models.EventBackfillFetchParams
import com.withorb.api.models.EventBackfillFetchResponse
import com.withorb.api.models.EventBackfillListPage
import com.withorb.api.models.EventBackfillListPageResponse
import com.withorb.api.models.EventBackfillListParams
import com.withorb.api.models.EventBackfillRevertParams
import com.withorb.api.models.EventBackfillRevertResponse

class BackfillServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BackfillService {

    private val withRawResponse: BackfillService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BackfillService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BackfillService =
        BackfillServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: EventBackfillCreateParams,
        requestOptions: RequestOptions,
    ): EventBackfillCreateResponse =
        // post /events/backfills
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: EventBackfillListParams,
        requestOptions: RequestOptions,
    ): EventBackfillListPage =
        // get /events/backfills
        withRawResponse().list(params, requestOptions).parse()

    override fun close(
        params: EventBackfillCloseParams,
        requestOptions: RequestOptions,
    ): EventBackfillCloseResponse =
        // post /events/backfills/{backfill_id}/close
        withRawResponse().close(params, requestOptions).parse()

    override fun fetch(
        params: EventBackfillFetchParams,
        requestOptions: RequestOptions,
    ): EventBackfillFetchResponse =
        // get /events/backfills/{backfill_id}
        withRawResponse().fetch(params, requestOptions).parse()

    override fun revert(
        params: EventBackfillRevertParams,
        requestOptions: RequestOptions,
    ): EventBackfillRevertResponse =
        // post /events/backfills/{backfill_id}/revert
        withRawResponse().revert(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BackfillService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BackfillService.WithRawResponse =
            BackfillServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<EventBackfillCreateResponse> =
            jsonHandler<EventBackfillCreateResponse>(clientOptions.jsonMapper)

        override fun create(
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

        private val listHandler: Handler<EventBackfillListPageResponse> =
            jsonHandler<EventBackfillListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EventBackfillListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventBackfillListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "backfills")
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
                        EventBackfillListPage.builder()
                            .service(BackfillServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val closeHandler: Handler<EventBackfillCloseResponse> =
            jsonHandler<EventBackfillCloseResponse>(clientOptions.jsonMapper)

        override fun close(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun fetch(
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

        private val revertHandler: Handler<EventBackfillRevertResponse> =
            jsonHandler<EventBackfillRevertResponse>(clientOptions.jsonMapper)

        override fun revert(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
