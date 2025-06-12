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
import com.withorb.api.models.Alert
import com.withorb.api.models.AlertCreateForCustomerParams
import com.withorb.api.models.AlertCreateForExternalCustomerParams
import com.withorb.api.models.AlertCreateForSubscriptionParams
import com.withorb.api.models.AlertDisableParams
import com.withorb.api.models.AlertEnableParams
import com.withorb.api.models.AlertListPageAsync
import com.withorb.api.models.AlertListPageResponse
import com.withorb.api.models.AlertListParams
import com.withorb.api.models.AlertRetrieveParams
import com.withorb.api.models.AlertUpdateParams

class AlertServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AlertServiceAsync {

    private val withRawResponse: AlertServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AlertServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AlertServiceAsync =
        AlertServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: AlertRetrieveParams,
        requestOptions: RequestOptions,
    ): Alert =
        // get /alerts/{alert_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(params: AlertUpdateParams, requestOptions: RequestOptions): Alert =
        // put /alerts/{alert_configuration_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: AlertListParams,
        requestOptions: RequestOptions,
    ): AlertListPageAsync =
        // get /alerts
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun createForCustomer(
        params: AlertCreateForCustomerParams,
        requestOptions: RequestOptions,
    ): Alert =
        // post /alerts/customer_id/{customer_id}
        withRawResponse().createForCustomer(params, requestOptions).parse()

    override suspend fun createForExternalCustomer(
        params: AlertCreateForExternalCustomerParams,
        requestOptions: RequestOptions,
    ): Alert =
        // post /alerts/external_customer_id/{external_customer_id}
        withRawResponse().createForExternalCustomer(params, requestOptions).parse()

    override suspend fun createForSubscription(
        params: AlertCreateForSubscriptionParams,
        requestOptions: RequestOptions,
    ): Alert =
        // post /alerts/subscription_id/{subscription_id}
        withRawResponse().createForSubscription(params, requestOptions).parse()

    override suspend fun disable(
        params: AlertDisableParams,
        requestOptions: RequestOptions,
    ): Alert =
        // post /alerts/{alert_configuration_id}/disable
        withRawResponse().disable(params, requestOptions).parse()

    override suspend fun enable(params: AlertEnableParams, requestOptions: RequestOptions): Alert =
        // post /alerts/{alert_configuration_id}/enable
        withRawResponse().enable(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlertServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AlertServiceAsync.WithRawResponse =
            AlertServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: AlertRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("alertId", params.alertId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts", params._pathParam(0))
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

        private val updateHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: AlertUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("alertConfigurationId", params.alertConfigurationId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AlertListPageResponse> =
            jsonHandler<AlertListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: AlertListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlertListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AlertListPageAsync.builder()
                            .service(AlertServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val createForCustomerHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun createForCustomer(
            params: AlertCreateForCustomerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts", "customer_id", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createForCustomerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createForExternalCustomerHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun createForExternalCustomer(
            params: AlertCreateForExternalCustomerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalCustomerId", params.externalCustomerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts", "external_customer_id", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createForExternalCustomerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createForSubscriptionHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun createForSubscription(
            params: AlertCreateForSubscriptionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts", "subscription_id", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createForSubscriptionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val disableHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun disable(
            params: AlertDisableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("alertConfigurationId", params.alertConfigurationId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts", params._pathParam(0), "disable")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { disableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val enableHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun enable(
            params: AlertEnableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Alert> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("alertConfigurationId", params.alertConfigurationId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts", params._pathParam(0), "enable")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
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
