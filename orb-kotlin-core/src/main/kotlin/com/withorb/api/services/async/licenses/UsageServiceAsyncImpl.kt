// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.licenses

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
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.LicenseUsageGetAllUsageParams
import com.withorb.api.models.LicenseUsageGetAllUsageResponse
import com.withorb.api.models.LicenseUsageGetUsageParams
import com.withorb.api.models.LicenseUsageGetUsageResponse

class UsageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageServiceAsync {

    private val withRawResponse: UsageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UsageServiceAsync =
        UsageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun getAllUsage(
        params: LicenseUsageGetAllUsageParams,
        requestOptions: RequestOptions,
    ): LicenseUsageGetAllUsageResponse =
        // get /licenses/usage
        withRawResponse().getAllUsage(params, requestOptions).parse()

    override suspend fun getUsage(
        params: LicenseUsageGetUsageParams,
        requestOptions: RequestOptions,
    ): LicenseUsageGetUsageResponse =
        // get /licenses/{license_id}/usage
        withRawResponse().getUsage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UsageServiceAsync.WithRawResponse =
            UsageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val getAllUsageHandler: Handler<LicenseUsageGetAllUsageResponse> =
            jsonHandler<LicenseUsageGetAllUsageResponse>(clientOptions.jsonMapper)

        override suspend fun getAllUsage(
            params: LicenseUsageGetAllUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseUsageGetAllUsageResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses", "usage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAllUsageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getUsageHandler: Handler<LicenseUsageGetUsageResponse> =
            jsonHandler<LicenseUsageGetUsageResponse>(clientOptions.jsonMapper)

        override suspend fun getUsage(
            params: LicenseUsageGetUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseUsageGetUsageResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("licenseId", params.licenseId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses", params._pathParam(0), "usage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getUsageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
