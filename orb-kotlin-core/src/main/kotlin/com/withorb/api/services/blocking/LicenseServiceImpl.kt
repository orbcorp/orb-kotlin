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
import com.withorb.api.models.LicenseCreateParams
import com.withorb.api.models.LicenseCreateResponse
import com.withorb.api.models.LicenseDeactivateParams
import com.withorb.api.models.LicenseDeactivateResponse
import com.withorb.api.models.LicenseListPage
import com.withorb.api.models.LicenseListPageResponse
import com.withorb.api.models.LicenseListParams
import com.withorb.api.models.LicenseRetrieveByExternalIdParams
import com.withorb.api.models.LicenseRetrieveByExternalIdResponse
import com.withorb.api.models.LicenseRetrieveParams
import com.withorb.api.models.LicenseRetrieveResponse
import com.withorb.api.services.blocking.licenses.ExternalLicenseService
import com.withorb.api.services.blocking.licenses.ExternalLicenseServiceImpl
import com.withorb.api.services.blocking.licenses.UsageService
import com.withorb.api.services.blocking.licenses.UsageServiceImpl

class LicenseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LicenseService {

    private val withRawResponse: LicenseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalLicenses: ExternalLicenseService by lazy {
        ExternalLicenseServiceImpl(clientOptions)
    }

    private val usage: UsageService by lazy { UsageServiceImpl(clientOptions) }

    override fun withRawResponse(): LicenseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LicenseService =
        LicenseServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun externalLicenses(): ExternalLicenseService = externalLicenses

    override fun usage(): UsageService = usage

    override fun create(
        params: LicenseCreateParams,
        requestOptions: RequestOptions,
    ): LicenseCreateResponse =
        // post /licenses
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LicenseRetrieveParams,
        requestOptions: RequestOptions,
    ): LicenseRetrieveResponse =
        // get /licenses/{license_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: LicenseListParams, requestOptions: RequestOptions): LicenseListPage =
        // get /licenses
        withRawResponse().list(params, requestOptions).parse()

    override fun deactivate(
        params: LicenseDeactivateParams,
        requestOptions: RequestOptions,
    ): LicenseDeactivateResponse =
        // post /licenses/{license_id}/deactivate
        withRawResponse().deactivate(params, requestOptions).parse()

    override fun retrieveByExternalId(
        params: LicenseRetrieveByExternalIdParams,
        requestOptions: RequestOptions,
    ): LicenseRetrieveByExternalIdResponse =
        // get /licenses/external_license_id/{external_license_id}
        withRawResponse().retrieveByExternalId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LicenseService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val externalLicenses: ExternalLicenseService.WithRawResponse by lazy {
            ExternalLicenseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageService.WithRawResponse by lazy {
            UsageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LicenseService.WithRawResponse =
            LicenseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun externalLicenses(): ExternalLicenseService.WithRawResponse = externalLicenses

        override fun usage(): UsageService.WithRawResponse = usage

        private val createHandler: Handler<LicenseCreateResponse> =
            jsonHandler<LicenseCreateResponse>(clientOptions.jsonMapper)

        override fun create(
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

        private val retrieveHandler: Handler<LicenseRetrieveResponse> =
            jsonHandler<LicenseRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun list(
            params: LicenseListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses")
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
                        LicenseListPage.builder()
                            .service(LicenseServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deactivateHandler: Handler<LicenseDeactivateResponse> =
            jsonHandler<LicenseDeactivateResponse>(clientOptions.jsonMapper)

        override fun deactivate(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun retrieveByExternalId(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
