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
import com.withorb.api.core.http.parseable
import com.withorb.api.core.json
import com.withorb.api.core.prepare
import com.withorb.api.errors.OrbError
import com.withorb.api.models.CreditNote
import com.withorb.api.models.CreditNoteCreateParams
import com.withorb.api.models.CreditNoteFetchParams
import com.withorb.api.models.CreditNoteListPage
import com.withorb.api.models.CreditNoteListParams

class CreditNoteServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditNoteService {

    private val withRawResponse: CreditNoteService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditNoteService.WithRawResponse = withRawResponse

    override fun create(
        params: CreditNoteCreateParams,
        requestOptions: RequestOptions,
    ): CreditNote =
        // post /credit_notes
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: CreditNoteListParams,
        requestOptions: RequestOptions,
    ): CreditNoteListPage =
        // get /credit_notes
        withRawResponse().list(params, requestOptions).parse()

    override fun fetch(params: CreditNoteFetchParams, requestOptions: RequestOptions): CreditNote =
        // get /credit_notes/{credit_note_id}
        withRawResponse().fetch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditNoteService.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CreditNote> =
            jsonHandler<CreditNote>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CreditNoteCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditNote> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("credit_notes")
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

        private val listHandler: Handler<CreditNoteListPage.Response> =
            jsonHandler<CreditNoteListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CreditNoteListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditNoteListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("credit_notes")
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
                    .let { CreditNoteListPage.of(CreditNoteServiceImpl(clientOptions), params, it) }
            }
        }

        private val fetchHandler: Handler<CreditNote> =
            jsonHandler<CreditNote>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetch(
            params: CreditNoteFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditNote> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("credit_notes", params.getPathParam(0))
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
