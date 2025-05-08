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
import com.withorb.api.models.SubscriptionChangeApplyParams
import com.withorb.api.models.SubscriptionChangeApplyResponse
import com.withorb.api.models.SubscriptionChangeCancelParams
import com.withorb.api.models.SubscriptionChangeCancelResponse
import com.withorb.api.models.SubscriptionChangeRetrieveParams
import com.withorb.api.models.SubscriptionChangeRetrieveResponse

class SubscriptionChangeServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SubscriptionChangeServiceAsync {

    private val withRawResponse: SubscriptionChangeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriptionChangeServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: SubscriptionChangeRetrieveParams,
        requestOptions: RequestOptions,
    ): SubscriptionChangeRetrieveResponse =
        // get /subscription_changes/{subscription_change_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun apply(
        params: SubscriptionChangeApplyParams,
        requestOptions: RequestOptions,
    ): SubscriptionChangeApplyResponse =
        // post /subscription_changes/{subscription_change_id}/apply
        withRawResponse().apply(params, requestOptions).parse()

    override suspend fun cancel(
        params: SubscriptionChangeCancelParams,
        requestOptions: RequestOptions,
    ): SubscriptionChangeCancelResponse =
        // post /subscription_changes/{subscription_change_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionChangeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<SubscriptionChangeRetrieveResponse> =
            jsonHandler<SubscriptionChangeRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: SubscriptionChangeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionChangeRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionChangeId", params.subscriptionChangeId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("subscription_changes", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val applyHandler: Handler<SubscriptionChangeApplyResponse> =
            jsonHandler<SubscriptionChangeApplyResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun apply(
            params: SubscriptionChangeApplyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionChangeApplyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionChangeId", params.subscriptionChangeId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("subscription_changes", params._pathParam(0), "apply")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { applyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cancelHandler: Handler<SubscriptionChangeCancelResponse> =
            jsonHandler<SubscriptionChangeCancelResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun cancel(
            params: SubscriptionChangeCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionChangeCancelResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionChangeId", params.subscriptionChangeId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("subscription_changes", params._pathParam(0), "cancel")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
