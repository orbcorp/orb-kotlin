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
import com.withorb.api.models.LicenseCreateParams
import com.withorb.api.models.LicenseCreateResponse
import com.withorb.api.models.LicenseDeactivateParams
import com.withorb.api.models.LicenseDeactivateResponse
import com.withorb.api.models.LicenseListPageAsync
import com.withorb.api.models.LicenseListPageResponse
import com.withorb.api.models.LicenseListParams
import com.withorb.api.models.LicenseRetrieveByExternalIdParams
import com.withorb.api.models.LicenseRetrieveByExternalIdResponse
import com.withorb.api.models.LicenseRetrieveParams
import com.withorb.api.models.LicenseRetrieveResponse
import com.withorb.api.services.async.licenses.ExternalLicenseServiceAsync
import com.withorb.api.services.async.licenses.ExternalLicenseServiceAsyncImpl
import com.withorb.api.services.async.licenses.UsageServiceAsync
import com.withorb.api.services.async.licenses.UsageServiceAsyncImpl

class LicenseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LicenseServiceAsync {

    private val withRawResponse: LicenseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalLicenses: ExternalLicenseServiceAsync by lazy {
        ExternalLicenseServiceAsyncImpl(clientOptions)
    }

    private val usage: UsageServiceAsync by lazy { UsageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): LicenseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LicenseServiceAsync =
        LicenseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun externalLicenses(): ExternalLicenseServiceAsync = externalLicenses

    override fun usage(): UsageServiceAsync = usage

    override suspend fun create(
        params: LicenseCreateParams,
        requestOptions: RequestOptions,
    ): LicenseCreateResponse =
        // post /licenses
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: LicenseRetrieveParams,
        requestOptions: RequestOptions,
    ): LicenseRetrieveResponse =
        // get /licenses/{license_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: LicenseListParams,
        requestOptions: RequestOptions,
    ): LicenseListPageAsync =
        // get /licenses
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun deactivate(
        params: LicenseDeactivateParams,
        requestOptions: RequestOptions,
    ): LicenseDeactivateResponse =
        // post /licenses/{license_id}/deactivate
        withRawResponse().deactivate(params, requestOptions).parse()

    override suspend fun retrieveByExternalId(
        params: LicenseRetrieveByExternalIdParams,
        requestOptions: RequestOptions,
    ): LicenseRetrieveByExternalIdResponse =
        // get /licenses/external_license_id/{external_license_id}
        withRawResponse().retrieveByExternalId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LicenseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val externalLicenses: ExternalLicenseServiceAsync.WithRawResponse by lazy {
            ExternalLicenseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageServiceAsync.WithRawResponse by lazy {
            UsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LicenseServiceAsync.WithRawResponse =
            LicenseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun externalLicenses(): ExternalLicenseServiceAsync.WithRawResponse =
            externalLicenses

        override fun usage(): UsageServiceAsync.WithRawResponse = usage

        private val createHandler: Handler<LicenseCreateResponse> =
            jsonHandler<LicenseCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: LicenseCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses")
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

        private val retrieveHandler: Handler<LicenseRetrieveResponse> =
            jsonHandler<LicenseRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: LicenseRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("licenseId", params.licenseId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses", params._pathParam(0))
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

        private val listHandler: Handler<LicenseListPageResponse> =
            jsonHandler<LicenseListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: LicenseListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses")
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
                        LicenseListPageAsync.builder()
                            .service(LicenseServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deactivateHandler: Handler<LicenseDeactivateResponse> =
            jsonHandler<LicenseDeactivateResponse>(clientOptions.jsonMapper)

        override suspend fun deactivate(
            params: LicenseDeactivateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseDeactivateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("licenseId", params.licenseId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses", params._pathParam(0), "deactivate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deactivateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveByExternalIdHandler: Handler<LicenseRetrieveByExternalIdResponse> =
            jsonHandler<LicenseRetrieveByExternalIdResponse>(clientOptions.jsonMapper)

        override suspend fun retrieveByExternalId(
            params: LicenseRetrieveByExternalIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseRetrieveByExternalIdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalLicenseId", params.externalLicenseId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses", "external_license_id", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveByExternalIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
