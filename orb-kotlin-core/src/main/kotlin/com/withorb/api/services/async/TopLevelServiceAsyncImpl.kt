// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.TopLevelPingParams
import com.withorb.api.models.TopLevelPingResponse

class TopLevelServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TopLevelServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val pingHandler: Handler<TopLevelPingResponse> =
        jsonHandler<TopLevelPingResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint allows you to test your connection to the Orb API and check the validity of
     * your API key, passed in the Authorization header. This is particularly useful for checking
     * that your environment is set up properly, and is a great choice for connectors and
     * integrations.
     *
     * This API does not have any side-effects or return any Orb resources.
     */
    override suspend fun ping(
        params: TopLevelPingParams,
        requestOptions: RequestOptions,
    ): TopLevelPingResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ping")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { pingHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
