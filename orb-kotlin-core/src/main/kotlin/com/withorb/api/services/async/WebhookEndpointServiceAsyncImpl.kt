// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.emptyHandler
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
import com.withorb.api.models.WebhookEndpoint
import com.withorb.api.models.WebhookEndpointCreateParams
import com.withorb.api.models.WebhookEndpointDeleteParams
import com.withorb.api.models.WebhookEndpointDisableParams
import com.withorb.api.models.WebhookEndpointEnableParams
import com.withorb.api.models.WebhookEndpointListPageAsync
import com.withorb.api.models.WebhookEndpointListPageResponse
import com.withorb.api.models.WebhookEndpointListParams
import com.withorb.api.models.WebhookEndpointRetrieveParams
import com.withorb.api.models.WebhookEndpointUpdateParams
import com.withorb.api.models.WebhookEndpointWithSecret

/**
 * A webhook endpoint is an HTTPS URL that Orb sends
 * [webhook events](/integrations-and-exports/webhooks) to.
 */
class WebhookEndpointServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : WebhookEndpointServiceAsync {

    private val withRawResponse: WebhookEndpointServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookEndpointServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): WebhookEndpointServiceAsync =
        WebhookEndpointServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: WebhookEndpointCreateParams,
        requestOptions: RequestOptions,
    ): WebhookEndpointWithSecret =
        // post /webhook_endpoints
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: WebhookEndpointRetrieveParams,
        requestOptions: RequestOptions,
    ): WebhookEndpoint =
        // get /webhook_endpoints/{webhook_endpoint_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: WebhookEndpointUpdateParams,
        requestOptions: RequestOptions,
    ): WebhookEndpoint =
        // put /webhook_endpoints/{webhook_endpoint_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: WebhookEndpointListParams,
        requestOptions: RequestOptions,
    ): WebhookEndpointListPageAsync =
        // get /webhook_endpoints
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: WebhookEndpointDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete /webhook_endpoints/{webhook_endpoint_id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun disable(
        params: WebhookEndpointDisableParams,
        requestOptions: RequestOptions,
    ): WebhookEndpoint =
        // post /webhook_endpoints/{webhook_endpoint_id}/disable
        withRawResponse().disable(params, requestOptions).parse()

    override suspend fun enable(
        params: WebhookEndpointEnableParams,
        requestOptions: RequestOptions,
    ): WebhookEndpoint =
        // post /webhook_endpoints/{webhook_endpoint_id}/enable
        withRawResponse().enable(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookEndpointServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WebhookEndpointServiceAsync.WithRawResponse =
            WebhookEndpointServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<WebhookEndpointWithSecret> =
            jsonHandler<WebhookEndpointWithSecret>(clientOptions.jsonMapper)

        override suspend fun create(
            params: WebhookEndpointCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEndpointWithSecret> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_endpoints")
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

        private val retrieveHandler: Handler<WebhookEndpoint> =
            jsonHandler<WebhookEndpoint>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: WebhookEndpointRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEndpoint> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookEndpointId", params.webhookEndpointId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_endpoints", params._pathParam(0))
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

        private val updateHandler: Handler<WebhookEndpoint> =
            jsonHandler<WebhookEndpoint>(clientOptions.jsonMapper)

        override suspend fun update(
            params: WebhookEndpointUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEndpoint> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookEndpointId", params.webhookEndpointId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_endpoints", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<WebhookEndpointListPageResponse> =
            jsonHandler<WebhookEndpointListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: WebhookEndpointListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEndpointListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_endpoints")
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
                        WebhookEndpointListPageAsync.builder()
                            .service(WebhookEndpointServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override suspend fun delete(
            params: WebhookEndpointDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookEndpointId", params.webhookEndpointId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_endpoints", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val disableHandler: Handler<WebhookEndpoint> =
            jsonHandler<WebhookEndpoint>(clientOptions.jsonMapper)

        override suspend fun disable(
            params: WebhookEndpointDisableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEndpoint> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookEndpointId", params.webhookEndpointId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_endpoints", params._pathParam(0), "disable")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { disableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val enableHandler: Handler<WebhookEndpoint> =
            jsonHandler<WebhookEndpoint>(clientOptions.jsonMapper)

        override suspend fun enable(
            params: WebhookEndpointEnableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEndpoint> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookEndpointId", params.webhookEndpointId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_endpoints", params._pathParam(0), "enable")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { enableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
