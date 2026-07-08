// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

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
import com.withorb.api.models.LicenseTypeCreateParams
import com.withorb.api.models.LicenseTypeCreateResponse
import com.withorb.api.models.LicenseTypeListPageAsync
import com.withorb.api.models.LicenseTypeListPageResponse
import com.withorb.api.models.LicenseTypeListParams
import com.withorb.api.models.LicenseTypeRetrieveParams
import com.withorb.api.models.LicenseTypeRetrieveResponse

/**
 * The LicenseType resource represents a type of license that can be assigned to users. License
 * types are used during billing by grouping metrics on the configured grouping key.
 */
class LicenseTypeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LicenseTypeServiceAsync {

    private val withRawResponse: LicenseTypeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LicenseTypeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LicenseTypeServiceAsync =
        LicenseTypeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: LicenseTypeCreateParams,
        requestOptions: RequestOptions,
    ): LicenseTypeCreateResponse =
        // post /license_types
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: LicenseTypeRetrieveParams,
        requestOptions: RequestOptions,
    ): LicenseTypeRetrieveResponse =
        // get /license_types/{license_type_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: LicenseTypeListParams,
        requestOptions: RequestOptions,
    ): LicenseTypeListPageAsync =
        // get /license_types
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LicenseTypeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LicenseTypeServiceAsync.WithRawResponse =
            LicenseTypeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<LicenseTypeCreateResponse> =
            jsonHandler<LicenseTypeCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: LicenseTypeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseTypeCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("license_types")
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

        private val retrieveHandler: Handler<LicenseTypeRetrieveResponse> =
            jsonHandler<LicenseTypeRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: LicenseTypeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseTypeRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("licenseTypeId", params.licenseTypeId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("license_types", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<LicenseTypeListPageResponse> =
            jsonHandler<LicenseTypeListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: LicenseTypeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseTypeListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("license_types")
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
                        LicenseTypeListPageAsync.builder()
                            .service(LicenseTypeServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
