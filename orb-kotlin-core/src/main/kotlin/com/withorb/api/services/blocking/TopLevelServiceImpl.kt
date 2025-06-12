// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepare
import com.withorb.api.models.TopLevelPingParams
import com.withorb.api.models.TopLevelPingResponse

class TopLevelServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TopLevelService {

    private val withRawResponse: TopLevelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TopLevelService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TopLevelService =
        TopLevelServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun ping(
        params: TopLevelPingParams,
        requestOptions: RequestOptions,
    ): TopLevelPingResponse =
        // get /ping
        withRawResponse().ping(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TopLevelService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TopLevelService.WithRawResponse =
            TopLevelServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val pingHandler: Handler<TopLevelPingResponse> =
            jsonHandler<TopLevelPingResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun ping(
            params: TopLevelPingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TopLevelPingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ping")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { pingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
