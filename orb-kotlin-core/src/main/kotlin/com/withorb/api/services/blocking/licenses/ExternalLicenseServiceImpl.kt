// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.licenses

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
import com.withorb.api.core.prepare
import com.withorb.api.models.LicenseExternalLicenseGetUsageParams
import com.withorb.api.models.LicenseExternalLicenseGetUsageResponse

class ExternalLicenseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExternalLicenseService {

    private val withRawResponse: ExternalLicenseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalLicenseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExternalLicenseService =
        ExternalLicenseServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun getUsage(
        params: LicenseExternalLicenseGetUsageParams,
        requestOptions: RequestOptions,
    ): LicenseExternalLicenseGetUsageResponse =
        // get /licenses/external_licenses/{external_license_id}/usage
        withRawResponse().getUsage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalLicenseService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExternalLicenseService.WithRawResponse =
            ExternalLicenseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val getUsageHandler: Handler<LicenseExternalLicenseGetUsageResponse> =
            jsonHandler<LicenseExternalLicenseGetUsageResponse>(clientOptions.jsonMapper)

        override fun getUsage(
            params: LicenseExternalLicenseGetUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LicenseExternalLicenseGetUsageResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalLicenseId", params.externalLicenseId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses", "external_licenses", params._pathParam(0), "usage")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
