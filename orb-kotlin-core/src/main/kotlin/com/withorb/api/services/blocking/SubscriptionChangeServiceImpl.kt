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
import com.withorb.api.models.SubscriptionChangeApplyParams
import com.withorb.api.models.SubscriptionChangeApplyResponse
import com.withorb.api.models.SubscriptionChangeCancelParams
import com.withorb.api.models.SubscriptionChangeCancelResponse
import com.withorb.api.models.SubscriptionChangeListPage
import com.withorb.api.models.SubscriptionChangeListPageResponse
import com.withorb.api.models.SubscriptionChangeListParams
import com.withorb.api.models.SubscriptionChangeRetrieveParams
import com.withorb.api.models.SubscriptionChangeRetrieveResponse

class SubscriptionChangeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionChangeService {

    private val withRawResponse: SubscriptionChangeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriptionChangeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SubscriptionChangeService =
        SubscriptionChangeServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: SubscriptionChangeRetrieveParams,
        requestOptions: RequestOptions,
    ): SubscriptionChangeRetrieveResponse =
        // get /subscription_changes/{subscription_change_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: SubscriptionChangeListParams,
        requestOptions: RequestOptions,
    ): SubscriptionChangeListPage =
        // get /subscription_changes
        withRawResponse().list(params, requestOptions).parse()

    override fun apply(
        params: SubscriptionChangeApplyParams,
        requestOptions: RequestOptions,
    ): SubscriptionChangeApplyResponse =
        // post /subscription_changes/{subscription_change_id}/apply
        withRawResponse().apply(params, requestOptions).parse()

    override fun cancel(
        params: SubscriptionChangeCancelParams,
        requestOptions: RequestOptions,
    ): SubscriptionChangeCancelResponse =
        // post /subscription_changes/{subscription_change_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionChangeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SubscriptionChangeService.WithRawResponse =
            SubscriptionChangeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<SubscriptionChangeRetrieveResponse> =
            jsonHandler<SubscriptionChangeRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SubscriptionChangeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionChangeRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionChangeId", params.subscriptionChangeId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscription_changes", params._pathParam(0))
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

        private val listHandler: Handler<SubscriptionChangeListPageResponse> =
            jsonHandler<SubscriptionChangeListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SubscriptionChangeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionChangeListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscription_changes")
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
                        SubscriptionChangeListPage.builder()
                            .service(SubscriptionChangeServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val applyHandler: Handler<SubscriptionChangeApplyResponse> =
            jsonHandler<SubscriptionChangeApplyResponse>(clientOptions.jsonMapper)

        override fun apply(
            params: SubscriptionChangeApplyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionChangeApplyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionChangeId", params.subscriptionChangeId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscription_changes", params._pathParam(0), "apply")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override fun cancel(
            params: SubscriptionChangeCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionChangeCancelResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionChangeId", params.subscriptionChangeId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscription_changes", params._pathParam(0), "cancel")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
