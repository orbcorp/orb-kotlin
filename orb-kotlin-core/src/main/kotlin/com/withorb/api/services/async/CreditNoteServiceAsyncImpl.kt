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
import com.withorb.api.models.CreditNote
import com.withorb.api.models.CreditNoteCreateParams
import com.withorb.api.models.CreditNoteFetchParams
import com.withorb.api.models.CreditNoteListPageAsync
import com.withorb.api.models.CreditNoteListPageResponse
import com.withorb.api.models.CreditNoteListParams

class CreditNoteServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditNoteServiceAsync {

    private val withRawResponse: CreditNoteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditNoteServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: CreditNoteCreateParams,
        requestOptions: RequestOptions,
    ): CreditNote =
        // post /credit_notes
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun list(
        params: CreditNoteListParams,
        requestOptions: RequestOptions,
    ): CreditNoteListPageAsync =
        // get /credit_notes
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun fetch(
        params: CreditNoteFetchParams,
        requestOptions: RequestOptions,
    ): CreditNote =
        // get /credit_notes/{credit_note_id}
        withRawResponse().fetch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditNoteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CreditNote> =
            jsonHandler<CreditNote>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: CreditNoteCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditNote> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("credit_notes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val listHandler: Handler<CreditNoteListPageResponse> =
            jsonHandler<CreditNoteListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: CreditNoteListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditNoteListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("credit_notes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CreditNoteListPageAsync.builder()
                            .service(CreditNoteServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val fetchHandler: Handler<CreditNote> =
            jsonHandler<CreditNote>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun fetch(
            params: CreditNoteFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditNote> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("creditNoteId", params.creditNoteId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("credit_notes", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
